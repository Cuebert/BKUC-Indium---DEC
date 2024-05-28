package p049d9;

import android.content.Context;
import android.view.View;
import p035c9.C1148h;

/* renamed from: d9.c */
/* loaded from: classes.dex */
public class C3026c extends AbstractC3024a {
    public C3026c(Context context, String str, String str2, int i10, int i11) {
        super(str, context, str2, i10, i11);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Context context = this.f12883o;
        if (context != null) {
            C1148h.m6702b(context);
        }
    }
}
