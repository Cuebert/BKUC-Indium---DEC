package p320z1;

import java.util.List;
import p320z1.C5956g;

/* renamed from: z1.m */
/* loaded from: classes.dex */
public abstract class AbstractC5962m {

    /* renamed from: z1.m$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC5962m mo21208a();

        /* renamed from: b */
        public abstract a mo21209b(AbstractC5960k abstractC5960k);

        /* renamed from: c */
        public abstract a mo21210c(List<AbstractC5961l> list);

        /* renamed from: d */
        abstract a mo21211d(Integer num);

        /* renamed from: e */
        abstract a mo21212e(String str);

        /* renamed from: f */
        public abstract a mo21213f(EnumC5965p enumC5965p);

        /* renamed from: g */
        public abstract a mo21214g(long j10);

        /* renamed from: h */
        public abstract a mo21215h(long j10);

        /* renamed from: i */
        public a m21229i(int i10) {
            return mo21211d(Integer.valueOf(i10));
        }

        /* renamed from: j */
        public a m21230j(String str) {
            return mo21212e(str);
        }
    }

    /* renamed from: a */
    public static a m21228a() {
        return new C5956g.b();
    }

    /* renamed from: b */
    public abstract AbstractC5960k mo21201b();

    /* renamed from: c */
    public abstract List<AbstractC5961l> mo21202c();

    /* renamed from: d */
    public abstract Integer mo21203d();

    /* renamed from: e */
    public abstract String mo21204e();

    /* renamed from: f */
    public abstract EnumC5965p mo21205f();

    /* renamed from: g */
    public abstract long mo21206g();

    /* renamed from: h */
    public abstract long mo21207h();
}
