package p076f9;

import android.graphics.Point;
import android.view.MotionEvent;

/* renamed from: f9.c */
/* loaded from: classes.dex */
public class C3209c {

    /* renamed from: h */
    private a f13496h;

    /* renamed from: a */
    private Point f13489a = new Point();

    /* renamed from: b */
    private Point f13490b = new Point();

    /* renamed from: c */
    private Point f13491c = new Point();

    /* renamed from: f */
    private float f13494f = 0.0f;

    /* renamed from: g */
    private int f13495g = -1;

    /* renamed from: d */
    private int f13492d = -1;

    /* renamed from: e */
    private int f13493e = -1;

    /* renamed from: f9.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo14220a(C3209c c3209c);
    }

    public C3209c(a aVar) {
        this.f13496h = aVar;
    }

    /* renamed from: a */
    private void m14240a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 - f12);
        int i11 = (int) (f11 - f13);
        Point point = this.f13491c;
        Point point2 = this.f13490b;
        int i12 = point2.x;
        Point point3 = this.f13489a;
        point.x = i12 - point3.x;
        point.y = point2.y - point3.y;
        double atan2 = Math.atan2((i10 * r3) - (i11 * r4), (r4 * i10) + (r3 * i11));
        Point point4 = this.f13490b;
        point4.x = (int) f10;
        point4.y = (int) f11;
        Point point5 = this.f13489a;
        point5.x = (int) f12;
        point5.y = (int) f13;
        this.f13494f -= (float) atan2;
    }

    /* renamed from: b */
    public float m14241b() {
        return this.f13494f;
    }

    /* renamed from: c */
    public Point m14242c() {
        if (this.f13492d != -1) {
            return this.f13489a;
        }
        return new Point();
    }

    /* renamed from: d */
    public Point m14243d() {
        if (this.f13493e != -1) {
            return this.f13490b;
        }
        return new Point();
    }

    /* renamed from: e */
    public int m14244e() {
        return this.f13495g;
    }

    /* renamed from: f */
    public boolean m14245f(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        float f13;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f13495g = 2;
                if (this.f13492d != -1 && this.f13493e != -1) {
                    this.f13496h.mo14220a(this);
                }
                this.f13494f = 0.0f;
                this.f13492d = -1;
            } else if (actionMasked == 2) {
                int i10 = this.f13492d;
                if (i10 != -1 && this.f13493e != -1) {
                    this.f13495g = 1;
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f13493e);
                    if (findPointerIndex == -1 || findPointerIndex >= motionEvent.getPointerCount()) {
                        f10 = -1.0f;
                        f11 = -1.0f;
                    } else {
                        f10 = motionEvent.getX(motionEvent.findPointerIndex(this.f13492d));
                        f11 = motionEvent.getY(motionEvent.findPointerIndex(this.f13492d));
                    }
                    if (findPointerIndex2 == -1 || findPointerIndex2 >= motionEvent.getPointerCount()) {
                        f12 = -1.0f;
                        f13 = -1.0f;
                    } else {
                        f13 = motionEvent.getX(motionEvent.findPointerIndex(this.f13493e));
                        f12 = motionEvent.getY(motionEvent.findPointerIndex(this.f13493e));
                    }
                    if (f13 != -1.0f && f12 != -1.0f && f10 != -1.0f && f11 != -1.0f) {
                        m14240a(f13, f12, f10, f11);
                    }
                    a aVar = this.f13496h;
                    if (aVar != null) {
                        aVar.mo14220a(this);
                    }
                }
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f13495g = 2;
                    if (this.f13492d != -1 && this.f13493e != -1) {
                        this.f13496h.mo14220a(this);
                    }
                    this.f13494f = 0.0f;
                    this.f13493e = -1;
                }
            } else if (this.f13493e == -1) {
                this.f13493e = motionEvent.getPointerId(motionEvent.getActionIndex());
                int findPointerIndex3 = motionEvent.findPointerIndex(this.f13492d);
                int findPointerIndex4 = motionEvent.findPointerIndex(this.f13493e);
                if (findPointerIndex3 != -1 && findPointerIndex3 < motionEvent.getPointerCount()) {
                    this.f13489a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13492d));
                    this.f13489a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13492d));
                }
                if (findPointerIndex4 != -1 && findPointerIndex4 < motionEvent.getPointerCount()) {
                    this.f13490b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f13493e));
                    this.f13490b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13493e));
                }
                Point point = this.f13491c;
                Point point2 = this.f13490b;
                int i11 = point2.x;
                Point point3 = this.f13489a;
                point.x = i11 - point3.x;
                point.y = point2.y - point3.y;
                if (this.f13492d != -1) {
                    this.f13496h.mo14220a(this);
                }
            }
        } else if (this.f13492d == -1) {
            this.f13492d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f13493e = -1;
            this.f13495g = 0;
            this.f13494f = 0.0f;
        }
        return true;
    }
}
