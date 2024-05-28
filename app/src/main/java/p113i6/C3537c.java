package p113i6;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;
import p321z2.C5980h;

/* renamed from: i6.c */
/* loaded from: classes.dex */
public class C3537c {

    /* renamed from: a */
    private final int f15119a;

    /* renamed from: b */
    private final Executor f15120b;

    /* renamed from: i6.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f15121a = 0;

        /* renamed from: b */
        private Executor f15122b;

        /* renamed from: a */
        public C3537c m15339a() {
            return new C3537c(this.f15121a, this.f15122b, null);
        }

        /* renamed from: b */
        public a m15340b(int i10, @RecentlyNonNull int... iArr) {
            this.f15121a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f15121a = i11 | this.f15121a;
                }
            }
            return this;
        }
    }

    /* synthetic */ C3537c(int i10, Executor executor, C3539e c3539e) {
        this.f15119a = i10;
        this.f15120b = executor;
    }

    /* renamed from: a */
    public final int m15337a() {
        return this.f15119a;
    }

    @RecentlyNullable
    /* renamed from: b */
    public final Executor m15338b() {
        return this.f15120b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3537c)) {
            return false;
        }
        C3537c c3537c = (C3537c) obj;
        return this.f15119a == c3537c.f15119a && C5980h.m21269b(this.f15120b, c3537c.f15120b);
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(this.f15119a), this.f15120b);
    }
}
