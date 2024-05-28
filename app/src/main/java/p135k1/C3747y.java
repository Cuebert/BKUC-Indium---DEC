package p135k1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0690v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k1.y */
/* loaded from: classes.dex */
public class C3747y {

    /* renamed from: a */
    private static final C3724e0 f15728a;

    /* renamed from: b */
    static final Property<View, Float> f15729b;

    /* renamed from: c */
    static final Property<View, Rect> f15730c;

    /* renamed from: k1.y$a */
    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C3747y.m15943c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C3747y.m15947g(view, f10.floatValue());
        }
    }

    /* renamed from: k1.y$b */
    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C0690v.m3864w(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C0690v.m3865w0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f15728a = new C3722d0();
        } else if (i10 >= 23) {
            f15728a = new C3720c0();
        } else if (i10 >= 22) {
            f15728a = new C3718b0();
        } else {
            f15728a = new C3716a0();
        }
        f15729b = new a(Float.class, "translationAlpha");
        f15730c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15941a(View view) {
        f15728a.mo15848a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC3746x m15942b(View view) {
        return new C3745w(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m15943c(View view) {
        return f15728a.mo15843c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC3730h0 m15944d(View view) {
        return new C3728g0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m15945e(View view) {
        f15728a.mo15849d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m15946f(View view, int i10, int i11, int i12, int i13) {
        f15728a.mo15812e(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m15947g(View view, float f10) {
        f15728a.mo15844f(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m15948h(View view, int i10) {
        f15728a.mo15838g(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m15949i(View view, Matrix matrix) {
        f15728a.mo15809h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m15950j(View view, Matrix matrix) {
        f15728a.mo15810i(view, matrix);
    }
}
