package p125j4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: j4.i */
/* loaded from: classes.dex */
public class C3608i {

    /* renamed from: a */
    private long f15238a;

    /* renamed from: b */
    private long f15239b;

    /* renamed from: c */
    private TimeInterpolator f15240c;

    /* renamed from: d */
    private int f15241d;

    /* renamed from: e */
    private int f15242e;

    public C3608i(long j10, long j11) {
        this.f15240c = null;
        this.f15241d = 0;
        this.f15242e = 1;
        this.f15238a = j10;
        this.f15239b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C3608i m15438b(ValueAnimator valueAnimator) {
        C3608i c3608i = new C3608i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m15439f(valueAnimator));
        c3608i.f15241d = valueAnimator.getRepeatCount();
        c3608i.f15242e = valueAnimator.getRepeatMode();
        return c3608i;
    }

    /* renamed from: f */
    private static TimeInterpolator m15439f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C3600a.f15225c;
            }
            return interpolator instanceof DecelerateInterpolator ? C3600a.f15226d : interpolator;
        }
        return C3600a.f15224b;
    }

    /* renamed from: a */
    public void m15440a(Animator animator) {
        animator.setStartDelay(m15441c());
        animator.setDuration(m15442d());
        animator.setInterpolator(m15443e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m15444g());
            valueAnimator.setRepeatMode(m15445h());
        }
    }

    /* renamed from: c */
    public long m15441c() {
        return this.f15238a;
    }

    /* renamed from: d */
    public long m15442d() {
        return this.f15239b;
    }

    /* renamed from: e */
    public TimeInterpolator m15443e() {
        TimeInterpolator timeInterpolator = this.f15240c;
        return timeInterpolator != null ? timeInterpolator : C3600a.f15224b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3608i)) {
            return false;
        }
        C3608i c3608i = (C3608i) obj;
        if (m15441c() == c3608i.m15441c() && m15442d() == c3608i.m15442d() && m15444g() == c3608i.m15444g() && m15445h() == c3608i.m15445h()) {
            return m15443e().getClass().equals(c3608i.m15443e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int m15444g() {
        return this.f15241d;
    }

    /* renamed from: h */
    public int m15445h() {
        return this.f15242e;
    }

    public int hashCode() {
        return (((((((((int) (m15441c() ^ (m15441c() >>> 32))) * 31) + ((int) (m15442d() ^ (m15442d() >>> 32)))) * 31) + m15443e().getClass().hashCode()) * 31) + m15444g()) * 31) + m15445h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m15441c() + " duration: " + m15442d() + " interpolator: " + m15443e().getClass() + " repeatCount: " + m15444g() + " repeatMode: " + m15445h() + "}\n";
    }

    public C3608i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f15241d = 0;
        this.f15242e = 1;
        this.f15238a = j10;
        this.f15239b = j11;
        this.f15240c = timeInterpolator;
    }
}
