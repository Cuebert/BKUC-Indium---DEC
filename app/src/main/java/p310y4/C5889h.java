package p310y4;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2489l;

/* renamed from: y4.h */
/* loaded from: classes.dex */
public class C5889h {
    /* renamed from: a */
    public static C5885d m20856a(int i10) {
        if (i10 == 0) {
            return new C5891j();
        }
        if (i10 != 1) {
            return m20857b();
        }
        return new C5886e();
    }

    /* renamed from: b */
    public static C5885d m20857b() {
        return new C5891j();
    }

    /* renamed from: c */
    public static C5887f m20858c() {
        return new C5887f();
    }

    /* renamed from: d */
    public static void m20859d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C5888g) {
            ((C5888g) background).m20834W(f10);
        }
    }

    /* renamed from: e */
    public static void m20860e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C5888g) {
            m20861f(view, (C5888g) background);
        }
    }

    /* renamed from: f */
    public static void m20861f(View view, C5888g c5888g) {
        if (c5888g.m20829O()) {
            c5888g.m20838a0(C2489l.m11381c(view));
        }
    }
}
