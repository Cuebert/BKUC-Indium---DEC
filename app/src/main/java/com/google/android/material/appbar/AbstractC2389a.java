package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0690v;
import p207q0.C4291a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
public abstract class AbstractC2389a<V extends View> extends C2391c<V> {

    /* renamed from: d */
    private Runnable f8935d;

    /* renamed from: e */
    OverScroller f8936e;

    /* renamed from: f */
    private boolean f8937f;

    /* renamed from: g */
    private int f8938g;

    /* renamed from: h */
    private int f8939h;

    /* renamed from: i */
    private int f8940i;

    /* renamed from: j */
    private VelocityTracker f8941j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        private final CoordinatorLayout f8942n;

        /* renamed from: o */
        private final V f8943o;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f8942n = coordinatorLayout;
            this.f8943o = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f8943o == null || (overScroller = AbstractC2389a.this.f8936e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                AbstractC2389a abstractC2389a = AbstractC2389a.this;
                abstractC2389a.m10502P(this.f8942n, this.f8943o, abstractC2389a.f8936e.getCurrY());
                C0690v.m3837i0(this.f8943o, this);
                return;
            }
            AbstractC2389a.this.mo10463N(this.f8942n, this.f8943o);
        }
    }

    public AbstractC2389a() {
        this.f8938g = -1;
        this.f8940i = -1;
    }

    /* renamed from: I */
    private void m10499I() {
        if (this.f8941j == null) {
            this.f8941j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2661D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f8938g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f8939h = r12
            goto L4c
        L2d:
            int r0 = r11.f8938g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f8939h
            int r7 = r1 - r0
            r11.f8939h = r0
            int r8 = r11.mo10460K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m10501O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f8941j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f8941j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f8941j
            int r4 = r11.f8938g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo10461L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m10500J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f8937f = r3
            r11.f8938g = r1
            android.view.VelocityTracker r13 = r11.f8941j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f8941j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f8941j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f8937f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC2389a.mo2661D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    boolean mo10459H(V v10) {
        return false;
    }

    /* renamed from: J */
    final boolean m10500J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f8935d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f8935d = null;
        }
        if (this.f8936e == null) {
            this.f8936e = new OverScroller(v10.getContext());
        }
        this.f8936e.fling(0, mo10481E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f8936e.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, v10);
            this.f8935d = aVar;
            C0690v.m3837i0(v10, aVar);
            return true;
        }
        mo10463N(coordinatorLayout, v10);
        return false;
    }

    /* renamed from: K */
    int mo10460K(V v10) {
        return -v10.getHeight();
    }

    /* renamed from: L */
    int mo10461L(V v10) {
        return v10.getHeight();
    }

    /* renamed from: M */
    int mo10462M() {
        return mo10481E();
    }

    /* renamed from: N */
    void mo10463N(CoordinatorLayout coordinatorLayout, V v10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m10501O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return mo10464Q(coordinatorLayout, v10, mo10462M() - i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m10502P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return mo10464Q(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Q */
    int mo10464Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int m17788b;
        int mo10481E = mo10481E();
        if (i11 == 0 || mo10481E < i11 || mo10481E > i12 || mo10481E == (m17788b = C4291a.m17788b(i10, i11, i12))) {
            return 0;
        }
        mo10482G(m17788b);
        return mo10481E - m17788b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: k */
    public boolean mo2672k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f8940i < 0) {
            this.f8940i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f8937f) {
            int i10 = this.f8938g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f8939h) > this.f8940i) {
                this.f8939h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f8938g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = mo10459H(v10) && coordinatorLayout.m2654v(v10, x10, y11);
            this.f8937f = z10;
            if (z10) {
                this.f8939h = y11;
                this.f8938g = motionEvent.getPointerId(0);
                m10499I();
                OverScroller overScroller = this.f8936e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f8936e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f8941j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC2389a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8938g = -1;
        this.f8940i = -1;
    }
}
