package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0549d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0690v;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p111i4.C3524f;
import p111i4.C3526h;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: K */
    private final Chip f10021K;

    /* renamed from: L */
    private final Chip f10022L;

    /* renamed from: M */
    private final ClockHandView f10023M;

    /* renamed from: N */
    private final ClockFaceView f10024N;

    /* renamed from: O */
    private final MaterialButtonToggleGroup f10025O;

    /* renamed from: P */
    private final View.OnClickListener f10026P;

    /* renamed from: Q */
    private InterfaceC2541f f10027Q;

    /* renamed from: R */
    private InterfaceC2542g f10028R;

    /* renamed from: S */
    private InterfaceC2540e f10029S;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC2536a implements View.OnClickListener {
        ViewOnClickListenerC2536a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f10028R != null) {
                TimePickerView.this.f10028R.m11743a(((Integer) view.getTag(C3524f.f14613G)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes.dex */
    class C2537b implements MaterialButtonToggleGroup.InterfaceC2428e {
        C2537b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC2428e
        /* renamed from: a */
        public void mo10763a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11 = i10 == C3524f.f14631i ? 1 : 0;
            if (TimePickerView.this.f10027Q == null || !z10) {
                return;
            }
            TimePickerView.this.f10027Q.m11742a(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes.dex */
    public class C2538c extends GestureDetector.SimpleOnGestureListener {
        C2538c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f10029S != null) {
                TimePickerView.this.f10029S.m11741a();
            }
            return onDoubleTap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2539d implements View.OnTouchListener {

        /* renamed from: n */
        final /* synthetic */ GestureDetector f10033n;

        ViewOnTouchListenerC2539d(GestureDetector gestureDetector) {
            this.f10033n = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f10033n.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes.dex */
    interface InterfaceC2540e {
        /* renamed from: a */
        void m11741a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes.dex */
    interface InterfaceC2541f {
        /* renamed from: a */
        void m11742a(int i10);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: classes.dex */
    interface InterfaceC2542g {
        /* renamed from: a */
        void m11743a(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: x */
    private void m11738x() {
        Chip chip = this.f10021K;
        int i10 = C3524f.f14613G;
        chip.setTag(i10, 12);
        this.f10022L.setTag(i10, 10);
        this.f10021K.setOnClickListener(this.f10026P);
        this.f10022L.setOnClickListener(this.f10026P);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: y */
    private void m11739y() {
        ViewOnTouchListenerC2539d viewOnTouchListenerC2539d = new ViewOnTouchListenerC2539d(new GestureDetector(getContext(), new C2538c()));
        this.f10021K.setOnTouchListener(viewOnTouchListenerC2539d);
        this.f10022L.setOnTouchListener(viewOnTouchListenerC2539d);
    }

    /* renamed from: z */
    private void m11740z() {
        if (this.f10025O.getVisibility() == 0) {
            C0549d c0549d = new C0549d();
            c0549d.m2585g(this);
            c0549d.m2583e(C3524f.f14628f, C0690v.m3791E(this) == 0 ? 2 : 1);
            c0549d.m2581c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11740z();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            m11740z();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10026P = new ViewOnClickListenerC2536a();
        LayoutInflater.from(context).inflate(C3526h.f14661k, this);
        this.f10024N = (ClockFaceView) findViewById(C3524f.f14629g);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C3524f.f14632j);
        this.f10025O = materialButtonToggleGroup;
        materialButtonToggleGroup.m10752g(new C2537b());
        this.f10021K = (Chip) findViewById(C3524f.f14635m);
        this.f10022L = (Chip) findViewById(C3524f.f14633k);
        this.f10023M = (ClockHandView) findViewById(C3524f.f14630h);
        m11739y();
        m11738x();
    }
}
