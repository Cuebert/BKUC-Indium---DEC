package gb;

import kotlin.jvm.internal.C3840e;

/* renamed from: gb.c */
/* loaded from: classes.dex */
public final class C3325c extends C3323a {

    /* renamed from: r */
    public static final a f13833r = new a(null);

    /* renamed from: s */
    private static final C3325c f13834s = new C3325c(1, 0);

    /* renamed from: gb.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    public C3325c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // gb.C3323a
    public boolean equals(Object obj) {
        if (obj instanceof C3325c) {
            if (!isEmpty() || !((C3325c) obj).isEmpty()) {
                C3325c c3325c = (C3325c) obj;
                if (m14610c() != c3325c.m14610c() || m14611e() != c3325c.m14611e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // gb.C3323a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m14610c() * 31) + m14611e();
    }

    @Override // gb.C3323a
    public boolean isEmpty() {
        return m14610c() > m14611e();
    }

    /* renamed from: l */
    public boolean m14616l(int i10) {
        return m14610c() <= i10 && i10 <= m14611e();
    }

    @Override // gb.C3323a
    public String toString() {
        return m14610c() + ".." + m14611e();
    }
}
