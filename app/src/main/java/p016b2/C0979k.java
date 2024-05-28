package p016b2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b2.k */
/* loaded from: classes.dex */
class C0979k implements InterfaceC0973e {

    /* renamed from: a */
    private final a f5161a;

    /* renamed from: b */
    private final C0977i f5162b;

    /* renamed from: c */
    private final Map<String, InterfaceC0981m> f5163c;

    /* renamed from: b2.k$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Context f5164a;

        /* renamed from: b */
        private Map<String, String> f5165b = null;

        a(Context context) {
            this.f5164a = context;
        }

        /* renamed from: a */
        private Map<String, String> m6168a(Context context) {
            Bundle m6170d = m6170d(context);
            if (m6170d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m6170d.keySet()) {
                Object obj = m6170d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m6169c() {
            if (this.f5165b == null) {
                this.f5165b = m6168a(this.f5164a);
            }
            return this.f5165b;
        }

        /* renamed from: d */
        private static Bundle m6170d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC0972d m6171b(String str) {
            String str2 = m6169c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC0972d) Class.forName(str2).asSubclass(InterfaceC0972d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0979k(Context context, C0977i c0977i) {
        this(new a(context), c0977i);
    }

    @Override // p016b2.InterfaceC0973e
    /* renamed from: a */
    public synchronized InterfaceC0981m mo6157a(String str) {
        if (this.f5163c.containsKey(str)) {
            return this.f5163c.get(str);
        }
        InterfaceC0972d m6171b = this.f5161a.m6171b(str);
        if (m6171b == null) {
            return null;
        }
        InterfaceC0981m create = m6171b.create(this.f5162b.m6164a(str));
        this.f5163c.put(str, create);
        return create;
    }

    C0979k(a aVar, C0977i c0977i) {
        this.f5163c = new HashMap();
        this.f5161a = aVar;
        this.f5162b = c0977i;
    }
}
