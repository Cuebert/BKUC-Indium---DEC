package p231s;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C4482b {

    /* renamed from: a */
    private final a f18169a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Surface mo18437a();

        /* renamed from: b */
        String mo18438b();

        /* renamed from: c */
        Object mo18439c();

        /* renamed from: d */
        void mo18440d(String str);
    }

    public C4482b(Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f18169a = new C4485e(surface);
            return;
        }
        if (i10 >= 26) {
            this.f18169a = new C4484d(surface);
        } else if (i10 >= 24) {
            this.f18169a = new C4483c(surface);
        } else {
            this.f18169a = new C4486f(surface);
        }
    }

    /* renamed from: e */
    public static C4482b m18432e(Object obj) {
        a m18441e;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            m18441e = C4485e.m18443g((OutputConfiguration) obj);
        } else if (i10 >= 26) {
            m18441e = C4484d.m18442f((OutputConfiguration) obj);
        } else {
            m18441e = i10 >= 24 ? C4483c.m18441e((OutputConfiguration) obj) : null;
        }
        if (m18441e == null) {
            return null;
        }
        return new C4482b(m18441e);
    }

    /* renamed from: a */
    public String m18433a() {
        return this.f18169a.mo18438b();
    }

    /* renamed from: b */
    public Surface m18434b() {
        return this.f18169a.mo18437a();
    }

    /* renamed from: c */
    public void m18435c(String str) {
        this.f18169a.mo18440d(str);
    }

    /* renamed from: d */
    public Object m18436d() {
        return this.f18169a.mo18439c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4482b) {
            return this.f18169a.equals(((C4482b) obj).f18169a);
        }
        return false;
    }

    public int hashCode() {
        return this.f18169a.hashCode();
    }

    private C4482b(a aVar) {
        this.f18169a = aVar;
    }
}
