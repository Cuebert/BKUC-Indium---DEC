package p076f9;

import android.graphics.Point;
import android.view.MotionEvent;

/* renamed from: f9.d */
/* loaded from: classes.dex */
public class C3210d {

    /* renamed from: i */
    private a f13505i;

    /* renamed from: a */
    private Point f13497a = new Point();

    /* renamed from: b */
    private Point f13498b = new Point();

    /* renamed from: c */
    private Point f13499c = new Point();

    /* renamed from: d */
    private Point f13500d = new Point();

    /* renamed from: g */
    private int f13503g = -1;

    /* renamed from: h */
    private float f13504h = 1.0f;

    /* renamed from: e */
    private int f13501e = -1;

    /* renamed from: f */
    private int f13502f = -1;

    /* renamed from: f9.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo14221b(C3210d c3210d);
    }

    public C3210d(a aVar) {
        this.f13505i = aVar;
    }

    /* renamed from: f */
    private void m14246f() {
        int i10 = this.f13498b.x;
        Point point = this.f13497a;
        double sqrt = Math.sqrt(Math.pow(i10 - point.x, 2.0d) + Math.pow(r0.y - point.y, 2.0d));
        int i11 = this.f13500d.x;
        Point point2 = this.f13499c;
        double sqrt2 = Math.sqrt(Math.pow(i11 - point2.x, 2.0d) + Math.pow(r2.y - point2.y, 2.0d));
        if (sqrt != 0.0d) {
            this.f13504h = (float) (sqrt2 / sqrt);
        } else {
            this.f13504h = 1.0f;
        }
    }

    /* renamed from: a */
    public Point m14247a() {
        if (this.f13501e != -1) {
            return this.f13499c;
        }
        return new Point();
    }

    /* renamed from: b */
    public Point m14248b() {
        if (this.f13502f != -1) {
            return this.f13500d;
        }
        return new Point();
    }

    /* renamed from: c */
    public float m14249c() {
        return this.f13504h;
    }

    /* renamed from: d */
    public int m14250d() {
        return this.f13503g;
    }

    /* renamed from: e */
    public boolean m14251e(MotionEvent motionEvent) {
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f13503g = 2;
                    if (this.f13501e != -1 && this.f13502f != -1) {
                        this.f13505i.mo14221b(this);
                    }
                    this.f13504h = 1.0f;
                    this.f13501e = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f13501e;
                    if (i10 != -1 && this.f13502f != -1) {
                        this.f13503g = 1;
                        this.f13499c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(i10));
                        this.f13499c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13501e));
                        this.f13500d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13502f));
                        this.f13500d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13502f));
                        m14246f();
                        a aVar = this.f13505i;
                        if (aVar != null) {
                            aVar.mo14221b(this);
                        }
                    }
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        this.f13503g = 2;
                        if (this.f13501e != -1 && this.f13502f != -1) {
                            this.f13505i.mo14221b(this);
                        }
                        this.f13504h = 1.0f;
                        this.f13502f = -1;
                    }
                } else if (this.f13502f == -1) {
                    this.f13502f = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f13497a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13501e));
                    this.f13497a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13501e));
                    this.f13498b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13502f));
                    this.f13498b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13502f));
                    this.f13499c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13501e));
                    this.f13499c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13501e));
                    this.f13500d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13502f));
                    this.f13500d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13502f));
                    this.f13503g = 0;
                    if (this.f13501e != -1) {
                        this.f13505i.mo14221b(this);
                    }
                }
            } else if (this.f13501e == -1) {
                this.f13501e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f13502f = -1;
                this.f13503g = 0;
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }
}
