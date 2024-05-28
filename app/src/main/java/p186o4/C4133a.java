package p186o4;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0601a;
import p272v4.C4980b;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public class C4133a {
    /* renamed from: a */
    public static int m17128a(Context context, int i10, int i11) {
        TypedValue m19400a = C4980b.m19400a(context, i10);
        return m19400a != null ? m19400a.data : i11;
    }

    /* renamed from: b */
    public static int m17129b(Context context, int i10, String str) {
        return C4980b.m19402c(context, i10, str);
    }

    /* renamed from: c */
    public static int m17130c(View view, int i10) {
        return C4980b.m19403d(view, i10);
    }

    /* renamed from: d */
    public static int m17131d(View view, int i10, int i11) {
        return m17128a(view.getContext(), i10, i11);
    }

    /* renamed from: e */
    public static int m17132e(int i10, int i11) {
        return C0601a.m3177c(i11, i10);
    }

    /* renamed from: f */
    public static int m17133f(int i10, int i11, float f10) {
        return m17132e(i10, C0601a.m3180f(i11, Math.round(Color.alpha(i11) * f10)));
    }

    /* renamed from: g */
    public static int m17134g(View view, int i10, int i11, float f10) {
        return m17133f(m17130c(view, i10), m17130c(view, i11), f10);
    }
}
