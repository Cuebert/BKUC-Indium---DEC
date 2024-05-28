package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0690v;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.internal.C2485h;
import com.google.android.material.internal.C2487j;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3524f;
import p111i4.C3527i;
import p111i4.C3528j;
import p111i4.C3529k;
import p111i4.C3530l;
import p272v4.C4981c;
import p272v4.C4982d;
import p310y4.C5888g;

/* loaded from: classes.dex */
public class BadgeDrawable extends Drawable implements C2485h.b {

    /* renamed from: D */
    private static final int f8960D = C3529k.f14701k;

    /* renamed from: E */
    private static final int f8961E = C3520b.f14516b;

    /* renamed from: A */
    private float f8962A;

    /* renamed from: B */
    private WeakReference<View> f8963B;

    /* renamed from: C */
    private WeakReference<FrameLayout> f8964C;

    /* renamed from: n */
    private final WeakReference<Context> f8965n;

    /* renamed from: o */
    private final C5888g f8966o;

    /* renamed from: p */
    private final C2485h f8967p;

    /* renamed from: q */
    private final Rect f8968q;

    /* renamed from: r */
    private final float f8969r;

    /* renamed from: s */
    private final float f8970s;

    /* renamed from: t */
    private final float f8971t;

    /* renamed from: u */
    private final SavedState f8972u;

    /* renamed from: v */
    private float f8973v;

    /* renamed from: w */
    private float f8974w;

    /* renamed from: x */
    private int f8975x;

    /* renamed from: y */
    private float f8976y;

    /* renamed from: z */
    private float f8977z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    /* loaded from: classes.dex */
    public class RunnableC2395a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f8992n;

        /* renamed from: o */
        final /* synthetic */ FrameLayout f8993o;

        RunnableC2395a(View view, FrameLayout frameLayout) {
            this.f8992n = view;
            this.f8993o = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.m10542y(this.f8992n, this.f8993o);
        }
    }

    private BadgeDrawable(Context context) {
        this.f8965n = new WeakReference<>(context);
        C2487j.m11369c(context);
        Resources resources = context.getResources();
        this.f8968q = new Rect();
        this.f8966o = new C5888g();
        this.f8969r = resources.getDimensionPixelSize(C3522d.f14549C);
        this.f8971t = resources.getDimensionPixelSize(C3522d.f14548B);
        this.f8970s = resources.getDimensionPixelSize(C3522d.f14551E);
        C2485h c2485h = new C2485h(this);
        this.f8967p = c2485h;
        c2485h.m11361e().setTextAlign(Paint.Align.CENTER);
        this.f8972u = new SavedState(context);
        m10525u(C3529k.f14693c);
    }

    /* renamed from: A */
    private void m10516A() {
        this.f8975x = ((int) Math.pow(10.0d, m10532i() - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m10517b(Context context, Rect rect, View view) {
        int i10 = this.f8972u.f8990y + this.f8972u.f8978A;
        int i11 = this.f8972u.f8987v;
        if (i11 != 8388691 && i11 != 8388693) {
            this.f8974w = rect.top + i10;
        } else {
            this.f8974w = rect.bottom - i10;
        }
        if (m10533j() <= 9) {
            float f10 = !m10534k() ? this.f8969r : this.f8970s;
            this.f8976y = f10;
            this.f8962A = f10;
            this.f8977z = f10;
        } else {
            float f11 = this.f8970s;
            this.f8976y = f11;
            this.f8962A = f11;
            this.f8977z = (this.f8967p.m11362f(m10521f()) / 2.0f) + this.f8971t;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m10534k() ? C3522d.f14550D : C3522d.f14547A);
        int i12 = this.f8972u.f8989x + this.f8972u.f8991z;
        int i13 = this.f8972u.f8987v;
        if (i13 != 8388659 && i13 != 8388691) {
            this.f8973v = C0690v.m3791E(view) == 0 ? ((rect.right + this.f8977z) - dimensionPixelSize) - i12 : (rect.left - this.f8977z) + dimensionPixelSize + i12;
        } else {
            this.f8973v = C0690v.m3791E(view) == 0 ? (rect.left - this.f8977z) + dimensionPixelSize + i12 : ((rect.right + this.f8977z) - dimensionPixelSize) - i12;
        }
    }

    /* renamed from: c */
    public static BadgeDrawable m10518c(Context context) {
        return m10519d(context, null, f8961E, f8960D);
    }

    /* renamed from: d */
    private static BadgeDrawable m10519d(Context context, AttributeSet attributeSet, int i10, int i11) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m10522l(context, attributeSet, i10, i11);
        return badgeDrawable;
    }

    /* renamed from: e */
    private void m10520e(Canvas canvas) {
        Rect rect = new Rect();
        String m10521f = m10521f();
        this.f8967p.m11361e().getTextBounds(m10521f, 0, m10521f.length(), rect);
        canvas.drawText(m10521f, this.f8973v, this.f8974w + (rect.height() / 2), this.f8967p.m11361e());
    }

    /* renamed from: f */
    private String m10521f() {
        if (m10533j() <= this.f8975x) {
            return NumberFormat.getInstance().format(m10533j());
        }
        Context context = this.f8965n.get();
        return context == null ? BuildConfig.FLAVOR : context.getString(C3528j.f14682l, Integer.valueOf(this.f8975x), "+");
    }

    /* renamed from: l */
    private void m10522l(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray m11374h = C2487j.m11374h(context, attributeSet, C3530l.f15065u, i10, i11, new int[0]);
        m10539r(m11374h.getInt(C3530l.f15105z, 4));
        int i12 = C3530l.f14714A;
        if (m11374h.hasValue(i12)) {
            m10540s(m11374h.getInt(i12, 0));
        }
        m10535n(m10523m(context, m11374h, C3530l.f15073v));
        int i13 = C3530l.f15089x;
        if (m11374h.hasValue(i13)) {
            m10537p(m10523m(context, m11374h, i13));
        }
        m10536o(m11374h.getInt(C3530l.f15081w, 8388661));
        m10538q(m11374h.getDimensionPixelOffset(C3530l.f15097y, 0));
        m10541v(m11374h.getDimensionPixelOffset(C3530l.f14722B, 0));
        m11374h.recycle();
    }

    /* renamed from: m */
    private static int m10523m(Context context, TypedArray typedArray, int i10) {
        return C4981c.m19404a(context, typedArray, i10).getDefaultColor();
    }

    /* renamed from: t */
    private void m10524t(C4982d c4982d) {
        Context context;
        if (this.f8967p.m11360d() == c4982d || (context = this.f8965n.get()) == null) {
            return;
        }
        this.f8967p.m11364h(c4982d, context);
        m10528z();
    }

    /* renamed from: u */
    private void m10525u(int i10) {
        Context context = this.f8965n.get();
        if (context == null) {
            return;
        }
        m10524t(new C4982d(context, i10));
    }

    /* renamed from: w */
    private void m10526w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C3524f.f14642t) {
            WeakReference<FrameLayout> weakReference = this.f8964C;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m10527x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C3524f.f14642t);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f8964C = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC2395a(view, frameLayout));
            }
        }
    }

    /* renamed from: x */
    private static void m10527x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: z */
    private void m10528z() {
        Context context = this.f8965n.get();
        WeakReference<View> weakReference = this.f8963B;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f8968q);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f8964C;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || C2396a.f8995a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        m10517b(context, rect2, view);
        C2396a.m10567d(this.f8968q, this.f8973v, this.f8974w, this.f8977z, this.f8962A);
        this.f8966o.m20832U(this.f8976y);
        if (rect.equals(this.f8968q)) {
            return;
        }
        this.f8966o.setBounds(this.f8968q);
    }

    @Override // com.google.android.material.internal.C2485h.b
    /* renamed from: a */
    public void mo10529a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f8966o.draw(canvas);
        if (m10534k()) {
            m10520e(canvas);
        }
    }

    /* renamed from: g */
    public CharSequence m10530g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (m10534k()) {
            if (this.f8972u.f8985t <= 0 || (context = this.f8965n.get()) == null) {
                return null;
            }
            if (m10533j() <= this.f8975x) {
                return context.getResources().getQuantityString(this.f8972u.f8985t, m10533j(), Integer.valueOf(m10533j()));
            }
            return context.getString(this.f8972u.f8986u, Integer.valueOf(this.f8975x));
        }
        return this.f8972u.f8984s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8972u.f8981p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8968q.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8968q.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public FrameLayout m10531h() {
        WeakReference<FrameLayout> weakReference = this.f8964C;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public int m10532i() {
        return this.f8972u.f8983r;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int m10533j() {
        if (m10534k()) {
            return this.f8972u.f8982q;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean m10534k() {
        return this.f8972u.f8982q != -1;
    }

    /* renamed from: n */
    public void m10535n(int i10) {
        this.f8972u.f8979n = i10;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        if (this.f8966o.m20850x() != valueOf) {
            this.f8966o.m20835X(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void m10536o(int i10) {
        if (this.f8972u.f8987v != i10) {
            this.f8972u.f8987v = i10;
            WeakReference<View> weakReference = this.f8963B;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f8963B.get();
            WeakReference<FrameLayout> weakReference2 = this.f8964C;
            m10542y(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C2485h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public void m10537p(int i10) {
        this.f8972u.f8980o = i10;
        if (this.f8967p.m11361e().getColor() != i10) {
            this.f8967p.m11361e().setColor(i10);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void m10538q(int i10) {
        this.f8972u.f8989x = i10;
        m10528z();
    }

    /* renamed from: r */
    public void m10539r(int i10) {
        if (this.f8972u.f8983r != i10) {
            this.f8972u.f8983r = i10;
            m10516A();
            this.f8967p.m11365i(true);
            m10528z();
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public void m10540s(int i10) {
        int max = Math.max(0, i10);
        if (this.f8972u.f8982q != max) {
            this.f8972u.f8982q = max;
            this.f8967p.m11365i(true);
            m10528z();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f8972u.f8981p = i10;
        this.f8967p.m11361e().setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: v */
    public void m10541v(int i10) {
        this.f8972u.f8990y = i10;
        m10528z();
    }

    /* renamed from: y */
    public void m10542y(View view, FrameLayout frameLayout) {
        this.f8963B = new WeakReference<>(view);
        boolean z10 = C2396a.f8995a;
        if (z10 && frameLayout == null) {
            m10526w(view);
        } else {
            this.f8964C = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            m10527x(view);
        }
        m10528z();
        invalidateSelf();
    }

    /* loaded from: classes.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2394a();

        /* renamed from: A */
        private int f8978A;

        /* renamed from: n */
        private int f8979n;

        /* renamed from: o */
        private int f8980o;

        /* renamed from: p */
        private int f8981p;

        /* renamed from: q */
        private int f8982q;

        /* renamed from: r */
        private int f8983r;

        /* renamed from: s */
        private CharSequence f8984s;

        /* renamed from: t */
        private int f8985t;

        /* renamed from: u */
        private int f8986u;

        /* renamed from: v */
        private int f8987v;

        /* renamed from: w */
        private boolean f8988w;

        /* renamed from: x */
        private int f8989x;

        /* renamed from: y */
        private int f8990y;

        /* renamed from: z */
        private int f8991z;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        /* loaded from: classes.dex */
        static class C2394a implements Parcelable.Creator<SavedState> {
            C2394a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Context context) {
            this.f8981p = 255;
            this.f8982q = -1;
            this.f8980o = new C4982d(context, C3529k.f14693c).f19055a.getDefaultColor();
            this.f8984s = context.getString(C3528j.f14679i);
            this.f8985t = C3527i.f14670a;
            this.f8986u = C3528j.f14681k;
            this.f8988w = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8979n);
            parcel.writeInt(this.f8980o);
            parcel.writeInt(this.f8981p);
            parcel.writeInt(this.f8982q);
            parcel.writeInt(this.f8983r);
            parcel.writeString(this.f8984s.toString());
            parcel.writeInt(this.f8985t);
            parcel.writeInt(this.f8987v);
            parcel.writeInt(this.f8989x);
            parcel.writeInt(this.f8990y);
            parcel.writeInt(this.f8991z);
            parcel.writeInt(this.f8978A);
            parcel.writeInt(this.f8988w ? 1 : 0);
        }

        protected SavedState(Parcel parcel) {
            this.f8981p = 255;
            this.f8982q = -1;
            this.f8979n = parcel.readInt();
            this.f8980o = parcel.readInt();
            this.f8981p = parcel.readInt();
            this.f8982q = parcel.readInt();
            this.f8983r = parcel.readInt();
            this.f8984s = parcel.readString();
            this.f8985t = parcel.readInt();
            this.f8987v = parcel.readInt();
            this.f8989x = parcel.readInt();
            this.f8990y = parcel.readInt();
            this.f8991z = parcel.readInt();
            this.f8978A = parcel.readInt();
            this.f8988w = parcel.readInt() != 0;
        }
    }
}
