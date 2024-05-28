package p024bc;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: bc.l */
/* loaded from: classes.dex */
public class C1109l {

    /* renamed from: a */
    final Method f5419a;

    /* renamed from: b */
    final ThreadMode f5420b;

    /* renamed from: c */
    final Class<?> f5421c;

    /* renamed from: d */
    final int f5422d;

    /* renamed from: e */
    final boolean f5423e;

    /* renamed from: f */
    String f5424f;

    public C1109l(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f5419a = method;
        this.f5420b = threadMode;
        this.f5421c = cls;
        this.f5422d = i10;
        this.f5423e = z10;
    }

    /* renamed from: a */
    private synchronized void m6480a() {
        if (this.f5424f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f5419a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f5419a.getName());
            sb2.append('(');
            sb2.append(this.f5421c.getName());
            this.f5424f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1109l)) {
            return false;
        }
        m6480a();
        C1109l c1109l = (C1109l) obj;
        c1109l.m6480a();
        return this.f5424f.equals(c1109l.f5424f);
    }

    public int hashCode() {
        return this.f5419a.hashCode();
    }
}
