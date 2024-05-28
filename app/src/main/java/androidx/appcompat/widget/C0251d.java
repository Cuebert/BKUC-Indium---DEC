package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.widget.C0701c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0251d {

    /* renamed from: a */
    private final CompoundButton f1119a;

    /* renamed from: b */
    private ColorStateList f1120b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1121c = null;

    /* renamed from: d */
    private boolean f1122d = false;

    /* renamed from: e */
    private boolean f1123e = false;

    /* renamed from: f */
    private boolean f1124f;

    public C0251d(CompoundButton compoundButton) {
        this.f1119a = compoundButton;
    }

    /* renamed from: a */
    void m1185a() {
        Drawable m4125a = C0701c.m4125a(this.f1119a);
        if (m4125a != null) {
            if (this.f1122d || this.f1123e) {
                Drawable mutate = C0609a.m3263r(m4125a).mutate();
                if (this.f1122d) {
                    C0609a.m3260o(mutate, this.f1120b);
                }
                if (this.f1123e) {
                    C0609a.m3261p(mutate, this.f1121c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1119a.getDrawableState());
                }
                this.f1119a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m1186b(int i10) {
        return i10;
    }

    /* renamed from: c */
    public ColorStateList m1187c() {
        return this.f1120b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m1188d() {
        return this.f1121c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1189e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1119a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p039d.C2957j.f12432T0
            r8 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1119a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0690v.m3849o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p039d.C2957j.f12442V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.getResourceId(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1119a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p066f.C3121a.m13770d(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 != 0) goto L58
            int r10 = p039d.C2957j.f12437U0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.getResourceId(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1119a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p066f.C3121a.m13770d(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p039d.C2957j.f12447W0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1119a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.getColorStateList(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C0701c.m4127c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p039d.C2957j.f12452X0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1119a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.getInt(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C0701c.m4128d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.recycle()
            return
        L84:
            r10 = move-exception
            r0.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0251d.m1189e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void m1190f() {
        if (this.f1124f) {
            this.f1124f = false;
        } else {
            this.f1124f = true;
            m1185a();
        }
    }

    /* renamed from: g */
    public void m1191g(ColorStateList colorStateList) {
        this.f1120b = colorStateList;
        this.f1122d = true;
        m1185a();
    }

    /* renamed from: h */
    public void m1192h(PorterDuff.Mode mode) {
        this.f1121c = mode;
        this.f1123e = true;
        m1185a();
    }
}
