package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0596h;
import androidx.core.view.C0690v;
import androidx.core.widget.InterfaceC0700b;
import java.lang.ref.WeakReference;
import p039d.C2957j;
import p219r0.C4415a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0258k {

    /* renamed from: a */
    private final TextView f1139a;

    /* renamed from: b */
    private TintInfo f1140b;

    /* renamed from: c */
    private TintInfo f1141c;

    /* renamed from: d */
    private TintInfo f1142d;

    /* renamed from: e */
    private TintInfo f1143e;

    /* renamed from: f */
    private TintInfo f1144f;

    /* renamed from: g */
    private TintInfo f1145g;

    /* renamed from: h */
    private TintInfo f1146h;

    /* renamed from: i */
    private final C0259l f1147i;

    /* renamed from: j */
    private int f1148j = 0;

    /* renamed from: k */
    private int f1149k = -1;

    /* renamed from: l */
    private Typeface f1150l;

    /* renamed from: m */
    private boolean f1151m;

    /* renamed from: androidx.appcompat.widget.k$a */
    /* loaded from: classes.dex */
    public class a extends C0596h.e {

        /* renamed from: a */
        final /* synthetic */ int f1152a;

        /* renamed from: b */
        final /* synthetic */ int f1153b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1154c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1152a = i10;
            this.f1153b = i11;
            this.f1154c = weakReference;
        }

        @Override // androidx.core.content.res.C0596h.e
        /* renamed from: h */
        public void m3145f(int i10) {
        }

        @Override // androidx.core.content.res.C0596h.e
        /* renamed from: i */
        public void m3146g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1152a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1153b & 2) != 0);
            }
            C0258k.this.m1233n(this.f1154c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.k$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ TextView f1156n;

        /* renamed from: o */
        final /* synthetic */ Typeface f1157o;

        /* renamed from: p */
        final /* synthetic */ int f1158p;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1156n = textView;
            this.f1157o = typeface;
            this.f1158p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1156n.setTypeface(this.f1157o, this.f1158p);
        }
    }

    public C0258k(TextView textView) {
        this.f1139a = textView;
        this.f1147i = new C0259l(textView);
    }

    /* renamed from: B */
    private void m1215B(int i10, float f10) {
        this.f1147i.m1273v(i10, f10);
    }

    /* renamed from: C */
    private void m1216C(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.f1148j = tintTypedArray.getInt(C2957j.f12481c3, this.f1148j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = tintTypedArray.getInt(C2957j.f12506h3, -1);
            this.f1149k = i11;
            if (i11 != -1) {
                this.f1148j = (this.f1148j & 2) | 0;
            }
        }
        int i12 = C2957j.f12501g3;
        if (!tintTypedArray.hasValue(i12) && !tintTypedArray.hasValue(C2957j.f12511i3)) {
            int i13 = C2957j.f12476b3;
            if (tintTypedArray.hasValue(i13)) {
                this.f1151m = false;
                int i14 = tintTypedArray.getInt(i13, 1);
                if (i14 == 1) {
                    this.f1150l = Typeface.SANS_SERIF;
                    return;
                } else if (i14 == 2) {
                    this.f1150l = Typeface.SERIF;
                    return;
                } else {
                    if (i14 != 3) {
                        return;
                    }
                    this.f1150l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1150l = null;
        int i15 = C2957j.f12511i3;
        if (tintTypedArray.hasValue(i15)) {
            i12 = i15;
        }
        int i16 = this.f1149k;
        int i17 = this.f1148j;
        if (!context.isRestricted()) {
            try {
                Typeface font = tintTypedArray.getFont(i12, this.f1148j, new a(i16, i17, new WeakReference(this.f1139a)));
                if (font != null) {
                    if (i10 >= 28 && this.f1149k != -1) {
                        this.f1150l = Typeface.create(Typeface.create(font, 0), this.f1149k, (this.f1148j & 2) != 0);
                    } else {
                        this.f1150l = font;
                    }
                }
                this.f1151m = this.f1150l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1150l != null || (string = tintTypedArray.getString(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f1149k != -1) {
            this.f1150l = Typeface.create(Typeface.create(string, 0), this.f1149k, (this.f1148j & 2) != 0);
        } else {
            this.f1150l = Typeface.create(string, this.f1148j);
        }
    }

    /* renamed from: a */
    private void m1217a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.f1139a.getDrawableState());
    }

    /* renamed from: d */
    private static TintInfo m1218d(Context context, AppCompatDrawableManager appCompatDrawableManager, int i10) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i10);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    /* renamed from: y */
    private void m1219y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1139a.getCompoundDrawablesRelative();
            TextView textView = this.f1139a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1139a.getCompoundDrawablesRelative();
        if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
            Drawable[] compoundDrawables = this.f1139a.getCompoundDrawables();
            TextView textView2 = this.f1139a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        TextView textView3 = this.f1139a;
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        Drawable drawable8 = compoundDrawablesRelative2[2];
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
    }

    /* renamed from: z */
    private void m1220z() {
        TintInfo tintInfo = this.f1146h;
        this.f1140b = tintInfo;
        this.f1141c = tintInfo;
        this.f1142d = tintInfo;
        this.f1143e = tintInfo;
        this.f1144f = tintInfo;
        this.f1145g = tintInfo;
    }

    /* renamed from: A */
    public void m1221A(int i10, float f10) {
        if (InterfaceC0700b.f3720a || m1231l()) {
            return;
        }
        m1215B(i10, f10);
    }

    /* renamed from: b */
    public void m1222b() {
        if (this.f1140b != null || this.f1141c != null || this.f1142d != null || this.f1143e != null) {
            Drawable[] compoundDrawables = this.f1139a.getCompoundDrawables();
            m1217a(compoundDrawables[0], this.f1140b);
            m1217a(compoundDrawables[1], this.f1141c);
            m1217a(compoundDrawables[2], this.f1142d);
            m1217a(compoundDrawables[3], this.f1143e);
        }
        if (this.f1144f == null && this.f1145g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1139a.getCompoundDrawablesRelative();
        m1217a(compoundDrawablesRelative[0], this.f1144f);
        m1217a(compoundDrawablesRelative[2], this.f1145g);
    }

    /* renamed from: c */
    public void m1223c() {
        this.f1147i.m1260a();
    }

    /* renamed from: e */
    public int m1224e() {
        return this.f1147i.m1262h();
    }

    /* renamed from: f */
    public int m1225f() {
        return this.f1147i.m1263i();
    }

    /* renamed from: g */
    public int m1226g() {
        return this.f1147i.m1264j();
    }

    /* renamed from: h */
    public int[] m1227h() {
        return this.f1147i.m1265k();
    }

    /* renamed from: i */
    public int m1228i() {
        return this.f1147i.m1266l();
    }

    /* renamed from: j */
    public ColorStateList m1229j() {
        TintInfo tintInfo = this.f1146h;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m1230k() {
        TintInfo tintInfo = this.f1146h;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m1231l() {
        return this.f1147i.m1268p();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1232m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0258k.m1232m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m1233n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1151m) {
            this.f1150l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C0690v.m3813T(textView)) {
                    textView.post(new b(textView, typeface, this.f1148j));
                } else {
                    textView.setTypeface(typeface, this.f1148j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m1234o(boolean z10, int i10, int i11, int i12, int i13) {
        if (InterfaceC0700b.f3720a) {
            return;
        }
        m1223c();
    }

    /* renamed from: p */
    public void m1235p() {
        m1222b();
    }

    /* renamed from: q */
    public void m1236q(Context context, int i10) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i10, C2957j.f12464Z2);
        int i11 = C2957j.f12521k3;
        if (obtainStyledAttributes.hasValue(i11)) {
            m1238s(obtainStyledAttributes.getBoolean(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = C2957j.f12486d3;
            if (obtainStyledAttributes.hasValue(i13) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i13)) != null) {
                this.f1139a.setTextColor(colorStateList3);
            }
            int i14 = C2957j.f12496f3;
            if (obtainStyledAttributes.hasValue(i14) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i14)) != null) {
                this.f1139a.setLinkTextColor(colorStateList2);
            }
            int i15 = C2957j.f12491e3;
            if (obtainStyledAttributes.hasValue(i15) && (colorStateList = obtainStyledAttributes.getColorStateList(i15)) != null) {
                this.f1139a.setHintTextColor(colorStateList);
            }
        }
        int i16 = C2957j.f12470a3;
        if (obtainStyledAttributes.hasValue(i16) && obtainStyledAttributes.getDimensionPixelSize(i16, -1) == 0) {
            this.f1139a.setTextSize(0, 0.0f);
        }
        m1216C(context, obtainStyledAttributes);
        if (i12 >= 26) {
            int i17 = C2957j.f12516j3;
            if (obtainStyledAttributes.hasValue(i17) && (string = obtainStyledAttributes.getString(i17)) != null) {
                this.f1139a.setFontVariationSettings(string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f1150l;
        if (typeface != null) {
            this.f1139a.setTypeface(typeface, this.f1148j);
        }
    }

    /* renamed from: r */
    public void m1237r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C4415a.m18198f(editorInfo, textView.getText());
    }

    /* renamed from: s */
    public void m1238s(boolean z10) {
        this.f1139a.setAllCaps(z10);
    }

    /* renamed from: t */
    public void m1239t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f1147i.m1270r(i10, i11, i12, i13);
    }

    /* renamed from: u */
    public void m1240u(int[] iArr, int i10) throws IllegalArgumentException {
        this.f1147i.m1271s(iArr, i10);
    }

    /* renamed from: v */
    public void m1241v(int i10) {
        this.f1147i.m1272t(i10);
    }

    /* renamed from: w */
    public void m1242w(ColorStateList colorStateList) {
        if (this.f1146h == null) {
            this.f1146h = new TintInfo();
        }
        TintInfo tintInfo = this.f1146h;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        m1220z();
    }

    /* renamed from: x */
    public void m1243x(PorterDuff.Mode mode) {
        if (this.f1146h == null) {
            this.f1146h = new TintInfo();
        }
        TintInfo tintInfo = this.f1146h;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        m1220z();
    }
}
