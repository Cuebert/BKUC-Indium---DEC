package com.roblox.client.components;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0587a;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2909v;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import p250t7.C4736a;

/* loaded from: classes.dex */
public class RbxGenderPicker extends LinearLayout {

    /* renamed from: n */
    private RbxButton f10880n;

    /* renamed from: o */
    private RbxButton f10881o;

    /* renamed from: p */
    private ImageView f10882p;

    /* renamed from: q */
    private ImageView f10883q;

    /* renamed from: r */
    private LinearLayout f10884r;

    /* renamed from: s */
    private TextView f10885s;

    /* renamed from: t */
    private TextView f10886t;

    /* renamed from: u */
    private RbxTextView f10887u;

    /* renamed from: v */
    private int f10888v;

    /* renamed from: w */
    private int f10889w;

    /* renamed from: x */
    private int f10890x;

    /* renamed from: y */
    private InterfaceC2779e f10891y;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2774a();

        /* renamed from: n */
        int f10892n;

        /* renamed from: com.roblox.client.components.RbxGenderPicker$SavedState$a */
        /* loaded from: classes.dex */
        class C2774a implements Parcelable.Creator<SavedState> {
            C2774a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, ViewOnClickListenerC2775a viewOnClickListenerC2775a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10892n);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f10892n = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxGenderPicker$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2775a implements View.OnClickListener {
        ViewOnClickListenerC2775a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RbxGenderPicker.this.m12356o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxGenderPicker$b */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2776b implements View.OnClickListener {
        ViewOnClickListenerC2776b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RbxGenderPicker.this.f10888v != 1) {
                RbxGenderPicker.this.f10882p.setImageResource(C2913x.f11768q);
                RbxGenderPicker.this.f10883q.setImageResource(C2913x.f11765n);
                RbxGenderPicker.this.f10888v = 1;
                RbxGenderPicker.this.f10885s.setTextColor(RbxGenderPicker.this.f10890x);
                RbxGenderPicker.this.f10886t.setTextColor(RbxGenderPicker.this.f10889w);
                RbxGenderPicker.this.m12359q();
            } else {
                RbxGenderPicker.this.m12356o();
            }
            if (RbxGenderPicker.this.f10891y != null) {
                RbxGenderPicker.this.f10891y.mo12363a(RbxGenderPicker.this.f10880n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxGenderPicker$c */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2777c implements View.OnClickListener {
        ViewOnClickListenerC2777c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RbxGenderPicker.this.f10888v != 2) {
                RbxGenderPicker.this.f10882p.setImageResource(C2913x.f11767p);
                RbxGenderPicker.this.f10883q.setImageResource(C2913x.f11766o);
                RbxGenderPicker.this.f10888v = 2;
                RbxGenderPicker.this.f10885s.setTextColor(RbxGenderPicker.this.f10889w);
                RbxGenderPicker.this.f10886t.setTextColor(RbxGenderPicker.this.f10890x);
                RbxGenderPicker.this.m12359q();
            } else {
                RbxGenderPicker.this.m12356o();
            }
            if (RbxGenderPicker.this.f10891y != null) {
                RbxGenderPicker.this.f10891y.mo12363a(RbxGenderPicker.this.f10881o);
            }
        }
    }

    /* renamed from: com.roblox.client.components.RbxGenderPicker$d */
    /* loaded from: classes.dex */
    class ViewOnTouchListenerC2778d implements View.OnTouchListener {
        ViewOnTouchListenerC2778d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.roblox.client.components.RbxGenderPicker$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2779e {
        /* renamed from: a */
        void mo12363a(RbxButton rbxButton);
    }

    public RbxGenderPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10880n = null;
        this.f10881o = null;
        this.f10882p = null;
        this.f10883q = null;
        this.f10884r = null;
        this.f10888v = 0;
        m12355m(context, attributeSet);
    }

    /* renamed from: m */
    private void m12355m(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(C2738a0.f10407K, (ViewGroup) getRootView());
        this.f10885s = (TextView) findViewById(C2915y.f11840Y0);
        this.f10886t = (TextView) findViewById(C2915y.f11834V0);
        this.f10889w = C0587a.m3029c(context, C2909v.f11696e);
        this.f10890x = C0587a.m3029c(context, C2909v.f11692a);
        C2808i.m12428c(this.f10885s, context, attributeSet);
        C2808i.m12428c(this.f10886t, context, attributeSet);
        this.f10880n = (RbxButton) findViewById(C2915y.f11836W0);
        this.f10881o = (RbxButton) findViewById(C2915y.f11830T0);
        this.f10882p = (ImageView) findViewById(C2915y.f11838X0);
        this.f10883q = (ImageView) findViewById(C2915y.f11832U0);
        this.f10884r = (LinearLayout) findViewById(C2915y.f11842Z0);
        this.f10887u = (RbxTextView) findViewById(C2915y.f11828S0);
        this.f10881o.setContentDescription(C4736a.m18881c(context, C2748c0.f10719r0, new Object[0]));
        this.f10880n.setContentDescription(C4736a.m18881c(context, C2748c0.f10725s0, new Object[0]));
        this.f10886t.setText(C4736a.m18881c(context, C2748c0.f10708p1, new Object[0]));
        this.f10887u.setText(C4736a.m18881c(context, C2748c0.f10714q1, new Object[0]));
        this.f10885s.setText(C4736a.m18881c(context, C2748c0.f10720r1, new Object[0]));
        setOnClickListener(new ViewOnClickListenerC2775a());
        this.f10880n.setOnClickListener(new ViewOnClickListenerC2776b());
        this.f10881o.setOnClickListener(new ViewOnClickListenerC2777c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m12356o() {
        this.f10888v = 0;
        this.f10883q.setImageResource(C2913x.f11765n);
        this.f10882p.setImageResource(C2913x.f11767p);
        this.f10884r.setBackgroundResource(C2913x.f11777z);
        this.f10885s.setTextColor(this.f10889w);
        this.f10886t.setTextColor(this.f10889w);
    }

    public InterfaceC2779e getOnGenderButtonPressedListener() {
        return this.f10891y;
    }

    public int getValue() {
        return this.f10888v;
    }

    /* renamed from: n */
    public void m12357n() {
        startAnimation(C2807h.m12423b(this));
        ViewOnTouchListenerC2778d viewOnTouchListenerC2778d = new ViewOnTouchListenerC2778d();
        this.f10881o.setOnTouchListener(viewOnTouchListenerC2778d);
        this.f10880n.setOnTouchListener(viewOnTouchListenerC2778d);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValue(savedState.f10892n);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10892n = this.f10888v;
        return savedState;
    }

    /* renamed from: p */
    public void m12358p() {
        this.f10884r.setBackgroundResource(C2913x.f11728A);
        if (this.f10887u.getVisibility() != 0) {
            C2807h.m12422a(this.f10887u, 0, 0.0f, 1.0f, 200L);
        }
    }

    /* renamed from: q */
    public void m12359q() {
        this.f10884r.setBackgroundResource(C2913x.f11729B);
        this.f10887u.setVisibility(4);
    }

    /* renamed from: r */
    public void m12360r() {
        startAnimation(C2807h.m12425d(this));
        this.f10881o.setOnTouchListener(null);
        this.f10880n.setOnTouchListener(null);
    }

    public void setOnGenderButtonPressedListener(InterfaceC2779e interfaceC2779e) {
        this.f10891y = interfaceC2779e;
    }

    public void setValue(int i10) {
        if (i10 == 1) {
            this.f10880n.callOnClick();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f10881o.callOnClick();
        }
    }
}
