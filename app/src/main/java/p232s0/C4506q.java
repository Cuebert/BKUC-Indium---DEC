package p232s0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import ua.C4903u;

/* renamed from: s0.q */
/* loaded from: classes.dex */
public final class C4506q {

    /* renamed from: a */
    public static final a f18236a = new a(null);

    /* renamed from: s0.q$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        private final List<String> m18500a(Context context) {
            List<String> m19147j;
            String string;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
            ArrayList arrayList = new ArrayList();
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                C3844i.m16252e(serviceInfoArr, "packageInfo.services");
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    Bundle bundle = serviceInfo.metaData;
                    if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                        arrayList.add(string);
                    }
                }
            }
            m19147j = C4903u.m19147j(arrayList);
            return m19147j;
        }

        /* renamed from: c */
        private final InterfaceC4505p m18501c(List<String> list, Context context) {
            Iterator<String> it = list.iterator();
            InterfaceC4505p interfaceC4505p = null;
            while (it.hasNext()) {
                try {
                    Object newInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                    C3844i.m16251d(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                    InterfaceC4505p interfaceC4505p2 = (InterfaceC4505p) newInstance;
                    if (!interfaceC4505p2.isAvailableOnDevice()) {
                        continue;
                    } else {
                        if (interfaceC4505p != null) {
                            Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                            return null;
                        }
                        interfaceC4505p = interfaceC4505p2;
                    }
                } catch (Throwable unused) {
                }
            }
            return interfaceC4505p;
        }

        /* renamed from: d */
        private final InterfaceC4505p m18502d(Context context) {
            List<String> m18500a = m18500a(context);
            if (m18500a.isEmpty()) {
                return null;
            }
            return m18501c(m18500a, context);
        }

        /* renamed from: b */
        public final InterfaceC4505p m18503b(Context context) {
            C3844i.m16253f(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                return new C4507r(context);
            }
            if (i10 <= 33) {
                return m18502d(context);
            }
            return null;
        }
    }
}
