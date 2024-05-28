package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.customview.view.AbsSavedState;
import p039d.C2948a;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: q */
    private static final int[] f9536q = {R.attr.state_checked};

    /* renamed from: n */
    private boolean f9537n;

    /* renamed from: o */
    private boolean f9538o;

    /* renamed from: p */
    private boolean f9539p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2475a();

        /* renamed from: n */
        boolean f9540n;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        /* loaded from: classes.dex */
        static class C2475a implements Parcelable.ClassLoaderCreator<SavedState> {
            C2475a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m11271a(Parcel parcel) {
            this.f9540n = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9540n ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m11271a(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C2476a extends C0656a {
        C2476a() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: f */
        public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3483f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            c0660c.m3530X(CheckableImageButton.this.m11270a());
            c0660c.m3531Y(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12135D);
    }

    /* renamed from: a */
    public boolean m11270a() {
        return this.f9538o;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9537n;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f9537n) {
            int[] iArr = f9536q;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f9540n);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9540n = this.f9537n;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f9538o != z10) {
            this.f9538o = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f9538o || this.f9537n == z10) {
            return;
        }
        this.f9537n = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f9539p = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f9539p) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9537n);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9538o = true;
        this.f9539p = true;
        C0690v.m3853q0(this, new C2476a());
    }
}
