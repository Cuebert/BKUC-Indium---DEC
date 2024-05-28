package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p039d.C2957j;
import p120j.AbstractC3583b;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0151a {

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m684a(boolean z10);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m685a();

        /* renamed from: b */
        public abstract View m686b();

        /* renamed from: c */
        public abstract Drawable m687c();

        /* renamed from: d */
        public abstract CharSequence m688d();

        /* renamed from: e */
        public abstract void m689e();
    }

    /* renamed from: a */
    public boolean m669a() {
        return false;
    }

    /* renamed from: b */
    public abstract boolean mo670b();

    /* renamed from: c */
    public abstract void mo671c(boolean z10);

    /* renamed from: d */
    public abstract int mo672d();

    /* renamed from: e */
    public abstract Context mo673e();

    /* renamed from: f */
    public boolean m674f() {
        return false;
    }

    /* renamed from: g */
    public abstract void mo675g(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m676h() {
    }

    /* renamed from: i */
    public abstract boolean mo677i(int i10, KeyEvent keyEvent);

    /* renamed from: j */
    public boolean m678j(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: k */
    public boolean m679k() {
        return false;
    }

    /* renamed from: l */
    public abstract void mo680l(boolean z10);

    /* renamed from: m */
    public abstract void mo681m(boolean z10);

    /* renamed from: n */
    public abstract void mo682n(CharSequence charSequence);

    /* renamed from: o */
    public abstract AbstractC3583b mo683o(AbstractC3583b.a aVar);

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2957j.f12562t);
            this.gravity = obtainStyledAttributes.getInt(C2957j.f12567u, 0);
            obtainStyledAttributes.recycle();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.gravity = 8388627;
        }

        public a(int i10, int i11, int i12) {
            super(i10, i11);
            this.gravity = i12;
        }

        public a(int i10) {
            this(-2, -1, i10);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.gravity = 0;
            this.gravity = aVar.gravity;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
