package p323z4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p111i4.C3520b;
import p120j.C3585d;

/* renamed from: z4.a */
/* loaded from: classes.dex */
public class C6011a {

    /* renamed from: a */
    private static final int[] f22077a = {R.attr.theme, C3520b.f14513F};

    /* renamed from: b */
    private static final int[] f22078b = {C3520b.f14535u};

    /* renamed from: a */
    private static int m21322a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f22077a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m21323b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f22078b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m21324c(Context context, AttributeSet attributeSet, int i10, int i11) {
        int m21323b = m21323b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof C3585d) && ((C3585d) context).m15382c() == m21323b;
        if (m21323b == 0 || z10) {
            return context;
        }
        C3585d c3585d = new C3585d(context, m21323b);
        int m21322a = m21322a(context, attributeSet);
        if (m21322a != 0) {
            c3585d.getTheme().applyStyle(m21322a, true);
        }
        return c3585d;
    }
}
