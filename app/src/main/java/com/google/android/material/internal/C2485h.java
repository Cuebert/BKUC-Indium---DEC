package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p272v4.AbstractC4984f;
import p272v4.C4982d;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes.dex */
public class C2485h {

    /* renamed from: c */
    private float f9656c;

    /* renamed from: f */
    private C4982d f9659f;

    /* renamed from: a */
    private final TextPaint f9654a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC4984f f9655b = new a();

    /* renamed from: d */
    private boolean f9657d = true;

    /* renamed from: e */
    private WeakReference<b> f9658e = new WeakReference<>(null);

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes.dex */
    class a extends AbstractC4984f {
        a() {
        }

        @Override // p272v4.AbstractC4984f
        /* renamed from: a */
        public void mo10834a(int i10) {
            C2485h.this.f9657d = true;
            b bVar = (b) C2485h.this.f9658e.get();
            if (bVar != null) {
                bVar.mo10529a();
            }
        }

        @Override // p272v4.AbstractC4984f
        /* renamed from: b */
        public void mo10835b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            C2485h.this.f9657d = true;
            b bVar = (b) C2485h.this.f9658e.get();
            if (bVar != null) {
                bVar.mo10529a();
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo10529a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C2485h(b bVar) {
        m11363g(bVar);
    }

    /* renamed from: c */
    private float m11359c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f9654a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C4982d m11360d() {
        return this.f9659f;
    }

    /* renamed from: e */
    public TextPaint m11361e() {
        return this.f9654a;
    }

    /* renamed from: f */
    public float m11362f(String str) {
        if (!this.f9657d) {
            return this.f9656c;
        }
        float m11359c = m11359c(str);
        this.f9656c = m11359c;
        this.f9657d = false;
        return m11359c;
    }

    /* renamed from: g */
    public void m11363g(b bVar) {
        this.f9658e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void m11364h(C4982d c4982d, Context context) {
        if (this.f9659f != c4982d) {
            this.f9659f = c4982d;
            if (c4982d != null) {
                c4982d.m19422k(context, this.f9654a, this.f9655b);
                b bVar = this.f9658e.get();
                if (bVar != null) {
                    this.f9654a.drawableState = bVar.getState();
                }
                c4982d.m19421j(context, this.f9654a, this.f9655b);
                this.f9657d = true;
            }
            b bVar2 = this.f9658e.get();
            if (bVar2 != null) {
                bVar2.mo10529a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m11365i(boolean z10) {
        this.f9657d = z10;
    }

    /* renamed from: j */
    public void m11366j(Context context) {
        this.f9659f.m19421j(context, this.f9654a, this.f9655b);
    }
}
