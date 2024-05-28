package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: classes.dex */
public final class C0658a extends ClickableSpan {

    /* renamed from: n */
    private final int f3506n;

    /* renamed from: o */
    private final C0660c f3507o;

    /* renamed from: p */
    private final int f3508p;

    public C0658a(int i10, C0660c c0660c, int i11) {
        this.f3506n = i10;
        this.f3507o = c0660c;
        this.f3508p = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3506n);
        this.f3507o.m3523O(this.f3508p, bundle);
    }
}
