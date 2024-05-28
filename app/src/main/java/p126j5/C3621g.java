package p126j5;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p248t5.InterfaceC4733b;

/* renamed from: j5.g */
/* loaded from: classes.dex */
public final class C3621g<T> {

    /* renamed from: a */
    private final T f15275a;

    /* renamed from: b */
    private final c<T> f15276b;

    /* renamed from: j5.g$b */
    /* loaded from: classes.dex */
    private static class b implements c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f15277a;

        /* renamed from: b */
        private Bundle m15492b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f15277a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f15277a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p126j5.C3621g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> mo15493a(Context context) {
            Bundle m15492b = m15492b(context);
            if (m15492b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m15492b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m15492b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f15277a = cls;
        }
    }

    /* renamed from: j5.g$c */
    /* loaded from: classes.dex */
    interface c<T> {
        /* renamed from: a */
        List<String> mo15493a(T t10);
    }

    C3621g(T t10, c<T> cVar) {
        this.f15275a = t10;
        this.f15276b = cVar;
    }

    /* renamed from: c */
    public static C3621g<Context> m15488c(Context context, Class<? extends Service> cls) {
        return new C3621g<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static InterfaceC3623i m15489d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC3623i.class.isAssignableFrom(cls)) {
                return (InterfaceC3623i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C3636v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new C3636v(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new C3636v(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new C3636v(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new C3636v(String.format("Could not instantiate %s", str), e13);
        }
    }

    /* renamed from: b */
    public List<InterfaceC4733b<InterfaceC3623i>> m15491b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f15276b.mo15493a(this.f15275a)) {
            arrayList.add(new InterfaceC4733b() { // from class: j5.f
                @Override // p248t5.InterfaceC4733b
                public final Object get() {
                    InterfaceC3623i m15489d;
                    m15489d = C3621g.m15489d(str);
                    return m15489d;
                }
            });
        }
        return arrayList;
    }
}
