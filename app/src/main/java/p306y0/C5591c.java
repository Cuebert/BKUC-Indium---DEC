package p306y0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C0690v;
import java.util.Arrays;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public class C5591c {

    /* renamed from: w */
    private static final Interpolator f20740w = new a();

    /* renamed from: a */
    private int f20741a;

    /* renamed from: b */
    private int f20742b;

    /* renamed from: d */
    private float[] f20744d;

    /* renamed from: e */
    private float[] f20745e;

    /* renamed from: f */
    private float[] f20746f;

    /* renamed from: g */
    private float[] f20747g;

    /* renamed from: h */
    private int[] f20748h;

    /* renamed from: i */
    private int[] f20749i;

    /* renamed from: j */
    private int[] f20750j;

    /* renamed from: k */
    private int f20751k;

    /* renamed from: l */
    private VelocityTracker f20752l;

    /* renamed from: m */
    private float f20753m;

    /* renamed from: n */
    private float f20754n;

    /* renamed from: o */
    private int f20755o;

    /* renamed from: p */
    private int f20756p;

    /* renamed from: q */
    private OverScroller f20757q;

    /* renamed from: r */
    private final c f20758r;

    /* renamed from: s */
    private View f20759s;

    /* renamed from: t */
    private boolean f20760t;

    /* renamed from: u */
    private final ViewGroup f20761u;

    /* renamed from: c */
    private int f20743c = -1;

    /* renamed from: v */
    private final Runnable f20762v = new b();

    /* renamed from: y0.c$a */
    /* loaded from: classes.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: y0.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5591c.this.m20595E(0);
        }
    }

    /* renamed from: y0.c$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo10583a(View view, int i10, int i11);

        /* renamed from: b */
        public abstract int mo10584b(View view, int i10, int i11);

        /* renamed from: c */
        public int m20609c(int i10) {
            return i10;
        }

        /* renamed from: d */
        public int mo10585d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo10711e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void m20610f(int i10, int i11) {
        }

        /* renamed from: g */
        public boolean m20611g(int i10) {
            return false;
        }

        /* renamed from: h */
        public void m20612h(int i10, int i11) {
        }

        /* renamed from: i */
        public void mo10586i(View view, int i10) {
        }

        /* renamed from: j */
        public abstract void mo10587j(int i10);

        /* renamed from: k */
        public abstract void mo10588k(View view, int i10, int i11, int i12, int i13);

        /* renamed from: l */
        public abstract void mo10589l(View view, float f10, float f11);

        /* renamed from: m */
        public abstract boolean mo10590m(View view, int i10);
    }

    private C5591c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar != null) {
            this.f20761u = viewGroup;
            this.f20758r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f20755o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f20742b = viewConfiguration.getScaledTouchSlop();
            this.f20753m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f20754n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f20757q = new OverScroller(context, f20740w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: A */
    private void m20574A() {
        this.f20752l.computeCurrentVelocity(1000, this.f20753m);
        m20588n(m20580e(this.f20752l.getXVelocity(this.f20743c), this.f20754n, this.f20753m), m20580e(this.f20752l.getYVelocity(this.f20743c), this.f20754n, this.f20753m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [y0.c$c] */
    /* renamed from: B */
    private void m20575B(float f10, float f11, int i10) {
        boolean m20578c = m20578c(f10, f11, i10, 1);
        boolean z10 = m20578c;
        if (m20578c(f11, f10, i10, 4)) {
            z10 = (m20578c ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (m20578c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (m20578c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f20749i;
            iArr[i10] = iArr[i10] | r02;
            this.f20758r.m20610f(r02, i10);
        }
    }

    /* renamed from: C */
    private void m20576C(float f10, float f11, int i10) {
        m20591q(i10);
        float[] fArr = this.f20744d;
        this.f20746f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f20745e;
        this.f20747g[i10] = f11;
        fArr2[i10] = f11;
        this.f20748h[i10] = m20593t((int) f10, (int) f11);
        this.f20751k |= 1 << i10;
    }

    /* renamed from: D */
    private void m20577D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m20594x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f20746f[pointerId] = x10;
                this.f20747g[pointerId] = y10;
            }
        }
    }

    /* renamed from: c */
    private boolean m20578c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f20748h[i10] & i11) != i11 || (this.f20756p & i11) == 0 || (this.f20750j[i10] & i11) == i11 || (this.f20749i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f20742b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f20758r.m20611g(i11)) {
            return (this.f20749i[i10] & i11) == 0 && abs > ((float) this.f20742b);
        }
        int[] iArr = this.f20750j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    /* renamed from: d */
    private boolean m20579d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f20758r.mo10585d(view) > 0;
        boolean z11 = this.f20758r.mo10711e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f20742b) : z11 && Math.abs(f11) > ((float) this.f20742b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f20742b;
        return f12 > ((float) (i10 * i10));
    }

    /* renamed from: e */
    private float m20580e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    /* renamed from: f */
    private int m20581f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    /* renamed from: g */
    private void m20582g() {
        float[] fArr = this.f20744d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f20745e, 0.0f);
        Arrays.fill(this.f20746f, 0.0f);
        Arrays.fill(this.f20747g, 0.0f);
        Arrays.fill(this.f20748h, 0);
        Arrays.fill(this.f20749i, 0);
        Arrays.fill(this.f20750j, 0);
        this.f20751k = 0;
    }

    /* renamed from: h */
    private void m20583h(int i10) {
        if (this.f20744d == null || !m20606w(i10)) {
            return;
        }
        this.f20744d[i10] = 0.0f;
        this.f20745e[i10] = 0.0f;
        this.f20746f[i10] = 0.0f;
        this.f20747g[i10] = 0.0f;
        this.f20748h[i10] = 0;
        this.f20749i[i10] = 0;
        this.f20750j[i10] = 0;
        this.f20751k = (~(1 << i10)) & this.f20751k;
    }

    /* renamed from: i */
    private int m20584i(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f20761u.getWidth();
        float f10 = width / 2;
        float m20589o = f10 + (m20589o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m20589o / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: j */
    private int m20585j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int m20581f = m20581f(i12, (int) this.f20754n, (int) this.f20753m);
        int m20581f2 = m20581f(i13, (int) this.f20754n, (int) this.f20753m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(m20581f);
        int abs4 = Math.abs(m20581f2);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (m20581f != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (m20581f2 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((m20584i(i10, m20581f, this.f20758r.mo10585d(view)) * f14) + (m20584i(i11, m20581f2, this.f20758r.mo10711e(view)) * (f12 / f13)));
    }

    /* renamed from: l */
    public static C5591c m20586l(ViewGroup viewGroup, float f10, c cVar) {
        C5591c m20587m = m20587m(viewGroup, cVar);
        m20587m.f20742b = (int) (m20587m.f20742b * (1.0f / f10));
        return m20587m;
    }

    /* renamed from: m */
    public static C5591c m20587m(ViewGroup viewGroup, c cVar) {
        return new C5591c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: n */
    private void m20588n(float f10, float f11) {
        this.f20760t = true;
        this.f20758r.mo10589l(this.f20759s, f10, f11);
        this.f20760t = false;
        if (this.f20741a == 1) {
            m20595E(0);
        }
    }

    /* renamed from: o */
    private float m20589o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    /* renamed from: p */
    private void m20590p(int i10, int i11, int i12, int i13) {
        int left = this.f20759s.getLeft();
        int top = this.f20759s.getTop();
        if (i12 != 0) {
            i10 = this.f20758r.mo10583a(this.f20759s, i10, i12);
            C0690v.m3821a0(this.f20759s, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f20758r.mo10584b(this.f20759s, i11, i13);
            C0690v.m3823b0(this.f20759s, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f20758r.mo10588k(this.f20759s, i14, i15, i14 - left, i15 - top);
    }

    /* renamed from: q */
    private void m20591q(int i10) {
        float[] fArr = this.f20744d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f20745e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f20746f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f20747g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f20748h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f20749i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f20750j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f20744d = fArr2;
            this.f20745e = fArr3;
            this.f20746f = fArr4;
            this.f20747g = fArr5;
            this.f20748h = iArr;
            this.f20749i = iArr2;
            this.f20750j = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m20592s(int i10, int i11, int i12, int i13) {
        int left = this.f20759s.getLeft();
        int top = this.f20759s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f20757q.abortAnimation();
            m20595E(0);
            return false;
        }
        this.f20757q.startScroll(left, top, i14, i15, m20585j(this.f20759s, i14, i15, i12, i13));
        m20595E(2);
        return true;
    }

    /* renamed from: t */
    private int m20593t(int i10, int i11) {
        int i12 = i10 < this.f20761u.getLeft() + this.f20755o ? 1 : 0;
        if (i11 < this.f20761u.getTop() + this.f20755o) {
            i12 |= 4;
        }
        if (i10 > this.f20761u.getRight() - this.f20755o) {
            i12 |= 2;
        }
        return i11 > this.f20761u.getBottom() - this.f20755o ? i12 | 8 : i12;
    }

    /* renamed from: x */
    private boolean m20594x(int i10) {
        if (m20606w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: E */
    void m20595E(int i10) {
        this.f20761u.removeCallbacks(this.f20762v);
        if (this.f20741a != i10) {
            this.f20741a = i10;
            this.f20758r.mo10587j(i10);
            if (this.f20741a == 0) {
                this.f20759s = null;
            }
        }
    }

    /* renamed from: F */
    public boolean m20596F(int i10, int i11) {
        if (this.f20760t) {
            return m20592s(i10, i11, (int) this.f20752l.getXVelocity(this.f20743c), (int) this.f20752l.getYVelocity(this.f20743c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m20597G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p306y0.C5591c.m20597G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean m20598H(View view, int i10, int i11) {
        this.f20759s = view;
        this.f20743c = -1;
        boolean m20592s = m20592s(i10, i11, 0, 0);
        if (!m20592s && this.f20741a == 0 && this.f20759s != null) {
            this.f20759s = null;
        }
        return m20592s;
    }

    /* renamed from: I */
    boolean m20599I(View view, int i10) {
        if (view == this.f20759s && this.f20743c == i10) {
            return true;
        }
        if (view == null || !this.f20758r.mo10590m(view, i10)) {
            return false;
        }
        this.f20743c = i10;
        m20601b(view, i10);
        return true;
    }

    /* renamed from: a */
    public void m20600a() {
        this.f20743c = -1;
        m20582g();
        VelocityTracker velocityTracker = this.f20752l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20752l = null;
        }
    }

    /* renamed from: b */
    public void m20601b(View view, int i10) {
        if (view.getParent() == this.f20761u) {
            this.f20759s = view;
            this.f20743c = i10;
            this.f20758r.mo10586i(view, i10);
            m20595E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f20761u + ")");
    }

    /* renamed from: k */
    public boolean m20602k(boolean z10) {
        if (this.f20741a == 2) {
            boolean computeScrollOffset = this.f20757q.computeScrollOffset();
            int currX = this.f20757q.getCurrX();
            int currY = this.f20757q.getCurrY();
            int left = currX - this.f20759s.getLeft();
            int top = currY - this.f20759s.getTop();
            if (left != 0) {
                C0690v.m3821a0(this.f20759s, left);
            }
            if (top != 0) {
                C0690v.m3823b0(this.f20759s, top);
            }
            if (left != 0 || top != 0) {
                this.f20758r.mo10588k(this.f20759s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f20757q.getFinalX() && currY == this.f20757q.getFinalY()) {
                this.f20757q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f20761u.post(this.f20762v);
                } else {
                    m20595E(0);
                }
            }
        }
        return this.f20741a == 2;
    }

    /* renamed from: r */
    public View m20603r(int i10, int i11) {
        for (int childCount = this.f20761u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f20761u.getChildAt(this.f20758r.m20609c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int m20604u() {
        return this.f20742b;
    }

    /* renamed from: v */
    public boolean m20605v(int i10, int i11) {
        return m20607y(this.f20759s, i10, i11);
    }

    /* renamed from: w */
    public boolean m20606w(int i10) {
        return ((1 << i10) & this.f20751k) != 0;
    }

    /* renamed from: y */
    public boolean m20607y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    /* renamed from: z */
    public void m20608z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m20600a();
        }
        if (this.f20752l == null) {
            this.f20752l = VelocityTracker.obtain();
        }
        this.f20752l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m20603r = m20603r((int) x10, (int) y10);
            m20576C(x10, y10, pointerId);
            m20599I(m20603r, pointerId);
            int i12 = this.f20748h[pointerId];
            int i13 = this.f20756p;
            if ((i12 & i13) != 0) {
                this.f20758r.m20612h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f20741a == 1) {
                m20574A();
            }
            m20600a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f20741a == 1) {
                if (m20594x(this.f20743c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f20743c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f20746f;
                    int i14 = this.f20743c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f20747g[i14]);
                    m20590p(this.f20759s.getLeft() + i15, this.f20759s.getTop() + i16, i15, i16);
                    m20577D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (m20594x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f20744d[pointerId2];
                    float f11 = y12 - this.f20745e[pointerId2];
                    m20575B(f10, f11, pointerId2);
                    if (this.f20741a != 1) {
                        View m20603r2 = m20603r((int) x12, (int) y12);
                        if (m20579d(m20603r2, f10, f11) && m20599I(m20603r2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            m20577D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f20741a == 1) {
                m20588n(0.0f, 0.0f);
            }
            m20600a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            m20576C(x13, y13, pointerId3);
            if (this.f20741a == 0) {
                m20599I(m20603r((int) x13, (int) y13), pointerId3);
                int i17 = this.f20748h[pointerId3];
                int i18 = this.f20756p;
                if ((i17 & i18) != 0) {
                    this.f20758r.m20612h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
            if (m20605v((int) x13, (int) y13)) {
                m20599I(this.f20759s, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f20741a == 1 && pointerId4 == this.f20743c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f20743c) {
                    View m20603r3 = m20603r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f20759s;
                    if (m20603r3 == view && m20599I(view, pointerId5)) {
                        i10 = this.f20743c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                m20574A();
            }
        }
        m20583h(pointerId4);
    }
}
