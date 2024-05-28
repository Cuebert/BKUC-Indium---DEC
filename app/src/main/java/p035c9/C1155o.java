package p035c9;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import p091gc.C3348t;
import p193ob.AbstractC4183j0;

/* renamed from: c9.o */
/* loaded from: classes.dex */
public class C1155o {
    /* renamed from: a */
    public static String m6742a(C3348t<AbstractC4183j0> c3348t) {
        String m17462T;
        try {
            if (c3348t.m14731a() != null) {
                m17462T = c3348t.m14731a().m17462T();
            } else {
                if (c3348t.m14733d() == null) {
                    return BuildConfig.FLAVOR;
                }
                m17462T = c3348t.m14733d().m17462T();
            }
            return m17462T;
        } catch (IOException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
