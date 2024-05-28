package p080g;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p080g.C3218b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: g.d */
/* loaded from: classes.dex */
class C3220d extends C3218b {

    /* renamed from: A */
    private boolean f13593A;

    /* renamed from: z */
    private a f13594z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g.d$a */
    /* loaded from: classes.dex */
    public static class a extends C3218b.d {

        /* renamed from: J */
        int[][] f13595J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, C3220d c3220d, Resources resources) {
            super(aVar, c3220d, resources);
            if (aVar != null) {
                this.f13595J = aVar.f13595J;
            } else {
                this.f13595J = new int[m14362f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m14383A(int[] iArr) {
            int[][] iArr2 = this.f13595J;
            int m14364h = m14364h();
            for (int i10 = 0; i10 < m14364h; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3220d(this, null);
        }

        @Override // p080g.C3218b.d
        /* renamed from: o */
        public void mo14371o(int i10, int i11) {
            super.mo14371o(i10, i11);
            int[][] iArr = new int[i11];
            System.arraycopy(this.f13595J, 0, iArr, 0, i10);
            this.f13595J = iArr;
        }

        @Override // p080g.C3218b.d
        /* renamed from: r */
        void mo14339r() {
            int[][] iArr = this.f13595J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f13595J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f13595J = iArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m14384z(int[] iArr, Drawable drawable) {
            int m14358a = m14358a(drawable);
            this.f13595J[m14358a] = iArr;
            return m14358a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C3220d(this, resources);
        }
    }

    C3220d(a aVar, Resources resources) {
        mo14325h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p080g.C3218b
    /* renamed from: h */
    public void mo14325h(C3218b.d dVar) {
        super.mo14325h(dVar);
        if (dVar instanceof a) {
            this.f13594z = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p080g.C3218b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo14324b() {
        return new a(this.f13594z, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m14382k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13593A && super.mutate() == this) {
            this.f13594z.mo14339r();
            this.f13593A = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m14383A = this.f13594z.m14383A(iArr);
        if (m14383A < 0) {
            m14383A = this.f13594z.m14383A(StateSet.WILD_CARD);
        }
        return m14349g(m14383A) || onStateChange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3220d(a aVar) {
        if (aVar != null) {
            mo14325h(aVar);
        }
    }
}
