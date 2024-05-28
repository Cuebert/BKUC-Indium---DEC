package p074f7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0852s;
import androidx.lifecycle.LiveData;
import p035c9.C1151k;
import p076f9.C3211e;
import pa.C4281a;

/* renamed from: f7.i0 */
/* loaded from: classes.dex */
public class C3178i0 {

    /* renamed from: a */
    private final C3211e f13245a = new C3211e();

    /* renamed from: b */
    private final Context f13246b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f7.i0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0852s<Rect> {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1522a(Rect rect) {
            C1151k.m6707a("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            if (rect == null) {
                C4281a.m17722b().m17723a(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                Rect m13909e = C3178i0.this.m13909e(new RectF(rect), C3178i0.this.m13907c());
                C4281a.m17722b().m17723a(m13909e.left, m13909e.top, m13909e.right, m13909e.bottom);
            }
        }
    }

    public C3178i0(Context context) {
        this.f13246b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public float m13907c() {
        return this.f13245a.m14259b(this.f13246b);
    }

    /* renamed from: d */
    private int m13908d(float f10, float f11) {
        return (int) ((f10 / f11) + 0.5d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public Rect m13909e(RectF rectF, float f10) {
        return new Rect(m13908d(rectF.left, f10), m13908d(rectF.top, f10), m13908d(rectF.right, f10), m13908d(rectF.bottom, f10));
    }

    /* renamed from: f */
    public void m13910f(InterfaceC0845l interfaceC0845l, LiveData<Rect> liveData) {
        liveData.m4861i(interfaceC0845l, new a());
    }
}
