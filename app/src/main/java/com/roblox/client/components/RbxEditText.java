package com.roblox.client.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0587a;
import androidx.core.widget.C0707i;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2738a0;
import com.roblox.client.C2817d1;
import com.roblox.client.C2819e0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2909v;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import p035c9.C1147g;
import p035c9.C1152l;

/* loaded from: classes.dex */
public class RbxEditText extends LinearLayout {

    /* renamed from: A */
    private int f10847A;

    /* renamed from: B */
    private float f10848B;

    /* renamed from: C */
    private boolean f10849C;

    /* renamed from: D */
    boolean f10850D;

    /* renamed from: E */
    private float f10851E;

    /* renamed from: F */
    private final InterfaceC2772i f10852F;

    /* renamed from: n */
    protected EditText f10853n;

    /* renamed from: o */
    protected LinearLayout f10854o;

    /* renamed from: p */
    protected LinearLayout f10855p;

    /* renamed from: q */
    protected boolean f10856q;

    /* renamed from: r */
    protected ViewOnTouchListenerC2773j f10857r;

    /* renamed from: s */
    private TextView f10858s;

    /* renamed from: t */
    private AttributeSet f10859t;

    /* renamed from: u */
    private String f10860u;

    /* renamed from: v */
    private String f10861v;

    /* renamed from: w */
    private String f10862w;

    /* renamed from: x */
    private InterfaceC2806g f10863x;

    /* renamed from: y */
    private InterfaceC2803d f10864y;

    /* renamed from: z */
    private View.OnClickListener f10865z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxEditText$a */
    /* loaded from: classes.dex */
    public class ViewOnFocusChangeListenerC2764a implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC2764a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (RbxEditText.this.f10863x != null) {
                RbxEditText.this.f10863x.mo12421a(view, z10);
            }
            int length = RbxEditText.this.f10853n.getText().length();
            RbxEditText rbxEditText = RbxEditText.this;
            if (!rbxEditText.f10856q || length <= 0) {
                return;
            }
            if (z10) {
                rbxEditText.m12336t();
            } else {
                rbxEditText.m12333o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxEditText$b */
    /* loaded from: classes.dex */
    public class C2765b implements InterfaceC2803d {
        C2765b() {
        }

        @Override // com.roblox.client.components.InterfaceC2803d
        /* renamed from: a */
        public void mo12340a() {
            RbxEditText.this.f10853n.setText(BuildConfig.FLAVOR);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxEditText$c */
    /* loaded from: classes.dex */
    public class C2766c implements TextWatcher {
        C2766c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() == 0 && i12 > 0 && RbxEditText.this.f10853n.hasFocus()) {
                RbxEditText.this.m12336t();
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() == 0) {
                RbxEditText.this.m12333o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxEditText$d */
    /* loaded from: classes.dex */
    public class C2767d implements TextWatcher {
        C2767d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 0 && RbxEditText.this.f10849C) {
                RbxEditText rbxEditText = RbxEditText.this;
                rbxEditText.f10853n.setTextSize(rbxEditText.f10848B);
                RbxEditText.this.f10850D = true;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() <= 0 || !RbxEditText.this.f10849C) {
                return;
            }
            RbxEditText rbxEditText = RbxEditText.this;
            if (rbxEditText.f10850D) {
                rbxEditText.f10850D = false;
                rbxEditText.f10853n.setTextSize(rbxEditText.m12310C(rbxEditText.getContext()));
            }
        }
    }

    /* renamed from: com.roblox.client.components.RbxEditText$e */
    /* loaded from: classes.dex */
    class AnimationAnimationListenerC2768e implements Animation.AnimationListener {
        AnimationAnimationListenerC2768e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxEditText.this.f10858s.setVisibility(4);
            RbxEditText.this.m12324s();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxEditText$f */
    /* loaded from: classes.dex */
    public class RunnableC2769f implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f10871n;

        RunnableC2769f(String str) {
            this.f10871n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = RbxEditText.this.getContext();
            float m12310C = RbxEditText.this.m12310C(context);
            RbxEditText.this.f10853n.setTextSize(m12310C);
            if (new Paint(RbxEditText.this.f10853n.getPaint()).measureText(this.f10871n) >= RbxEditText.this.f10853n.getWidth()) {
                RbxEditText rbxEditText = RbxEditText.this;
                m12310C = C2817d1.m12475n(context, rbxEditText.m12331k(this.f10871n, r2, (rbxEditText.f10853n.getWidth() - RbxEditText.this.f10853n.getPaddingLeft()) - RbxEditText.this.f10853n.getPaddingRight()));
                RbxEditText.this.f10853n.setTextSize(m12310C);
                RbxEditText.this.f10849C = true;
            }
            RbxEditText.this.f10848B = m12310C;
        }
    }

    /* renamed from: com.roblox.client.components.RbxEditText$g */
    /* loaded from: classes.dex */
    class ViewOnTouchListenerC2770g implements View.OnTouchListener {
        ViewOnTouchListenerC2770g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.roblox.client.components.RbxEditText$h */
    /* loaded from: classes.dex */
    class C2771h implements InterfaceC2772i {
        C2771h() {
        }

        @Override // com.roblox.client.components.RbxEditText.InterfaceC2772i
        /* renamed from: a */
        public void mo12341a() {
            if (RbxEditText.this.f10864y != null) {
                RbxEditText.this.f10864y.mo12340a();
            }
            if (RbxEditText.this.f10865z != null) {
                RbxEditText.this.f10865z.onClick(RbxEditText.this.f10853n);
            }
        }
    }

    /* renamed from: com.roblox.client.components.RbxEditText$i */
    /* loaded from: classes.dex */
    public interface InterfaceC2772i {
        /* renamed from: a */
        void mo12341a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.roblox.client.components.RbxEditText$j */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2773j implements View.OnTouchListener {

        /* renamed from: n */
        private final InterfaceC2772i f10875n;

        /* renamed from: o */
        private InterfaceC2772i[] f10876o;

        /* renamed from: p */
        private View.OnTouchListener f10877p;

        /* renamed from: com.roblox.client.components.RbxEditText$j$a */
        /* loaded from: classes.dex */
        class a implements InterfaceC2772i {
            a() {
            }

            @Override // com.roblox.client.components.RbxEditText.InterfaceC2772i
            /* renamed from: a */
            public void mo12341a() {
            }
        }

        public ViewOnTouchListenerC2773j(View.OnTouchListener onTouchListener, InterfaceC2772i interfaceC2772i, InterfaceC2772i interfaceC2772i2, InterfaceC2772i interfaceC2772i3, InterfaceC2772i interfaceC2772i4) {
            a aVar = new a();
            this.f10875n = aVar;
            this.f10877p = onTouchListener;
            InterfaceC2772i[] interfaceC2772iArr = new InterfaceC2772i[4];
            this.f10876o = interfaceC2772iArr;
            interfaceC2772iArr[0] = interfaceC2772i == null ? aVar : interfaceC2772i;
            interfaceC2772iArr[1] = interfaceC2772i2 == null ? aVar : interfaceC2772i2;
            interfaceC2772iArr[2] = interfaceC2772i3 == null ? aVar : interfaceC2772i3;
            interfaceC2772iArr[3] = interfaceC2772i4 == null ? aVar : interfaceC2772i4;
        }

        /* renamed from: a */
        public void m12342a(View.OnTouchListener onTouchListener) {
            this.f10877p = onTouchListener;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!TextView.class.isAssignableFrom(view.getClass())) {
                return false;
            }
            TextView textView = (TextView) view;
            if (motionEvent.getAction() == 1) {
                if (textView.getCompoundDrawables()[0] != null && motionEvent.getRawX() >= textView.getLeft() + r2.getBounds().width()) {
                    this.f10876o[0].mo12341a();
                }
                if (textView.getCompoundDrawables()[1] != null && motionEvent.getRawX() >= textView.getTop() + r2.getBounds().height()) {
                    this.f10876o[1].mo12341a();
                }
                if (textView.getCompoundDrawables()[2] != null && motionEvent.getRawX() >= textView.getRight() - r2.getBounds().width()) {
                    this.f10876o[2].mo12341a();
                }
                if (textView.getCompoundDrawables()[3] != null && motionEvent.getRawX() >= textView.getBottom() - r2.getBounds().height()) {
                    this.f10876o[3].mo12341a();
                }
                view.performClick();
                View.OnTouchListener onTouchListener = this.f10877p;
                if (onTouchListener != null) {
                    onTouchListener.onTouch(view, motionEvent);
                }
            }
            return false;
        }
    }

    public RbxEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10853n = null;
        this.f10856q = false;
        this.f10858s = null;
        this.f10859t = null;
        this.f10860u = null;
        this.f10861v = null;
        this.f10862w = null;
        this.f10863x = null;
        this.f10864y = null;
        this.f10847A = 0;
        this.f10850D = true;
        this.f10851E = 22.0f;
        this.f10852F = new C2771h();
        this.f10859t = attributeSet;
        m12323p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public int m12310C(Context context) {
        return C1147g.m6700a(context) < 360 ? 18 : 22;
    }

    /* renamed from: l */
    private void m12321l(int i10, float f10, float f11) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f11);
        alphaAnimation.setDuration(200L);
        this.f10858s.setAnimation(alphaAnimation);
        this.f10858s.setVisibility(i10);
    }

    /* renamed from: m */
    private void m12322m() {
        m12321l(0, 0.0f, 1.0f);
    }

    /* renamed from: p */
    private void m12323p() {
        LinearLayout.inflate(getContext(), C2738a0.f10404H, this);
        this.f10854o = (LinearLayout) findViewById(C2915y.f11822P0);
        this.f10855p = (LinearLayout) findViewById(C2915y.f11826R0);
        this.f10853n = (EditText) findViewById(C2915y.f11824Q0);
        this.f10858s = (TextView) findViewById(C2915y.f11820O0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.f10859t, C2819e0.f11108d1);
        this.f10862w = obtainStyledAttributes.getString(C2819e0.f11116f1);
        this.f10860u = obtainStyledAttributes.getString(C2819e0.f11112e1);
        this.f10861v = obtainStyledAttributes.getString(C2819e0.f11128i1);
        this.f10856q = false;
        String string = obtainStyledAttributes.getString(C2819e0.f11124h1);
        if (string != null) {
            setTextBoxInput(string);
        }
        String string2 = obtainStyledAttributes.getString(C2819e0.f11120g1);
        C2808i.m12428c(this.f10858s, getContext(), this.f10859t);
        C2808i.m12428c(this.f10853n, getContext(), this.f10859t);
        this.f10853n.setHint(this.f10862w);
        this.f10853n.setHintTextColor(getResources().getColor(C2909v.f11695d));
        this.f10853n.setContentDescription(getContentDescription());
        if (string2 != null) {
            this.f10858s.setText(string2);
        } else {
            this.f10858s.setText(this.f10862w);
        }
        this.f10858s.setVisibility(4);
        this.f10858s.setTextColor(getResources().getColor(C2909v.f11694c));
        this.f10853n.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2764a());
        if (this.f10856q) {
            this.f10864y = new C2765b();
            this.f10853n.addTextChangedListener(new C2766c());
        }
        this.f10848B = this.f10853n.getTextSize();
        this.f10853n.addTextChangedListener(new C2767d());
        ViewOnTouchListenerC2773j viewOnTouchListenerC2773j = new ViewOnTouchListenerC2773j(null, null, null, this.f10852F, null);
        this.f10857r = viewOnTouchListenerC2773j;
        this.f10853n.setOnTouchListener(viewOnTouchListenerC2773j);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m12324s() {
        this.f10853n.setBackgroundResource(C2913x.f11774w);
        if (C2877p0.f11446q == 120) {
            this.f10853n.setTextSize(this.f10851E);
        }
    }

    /* renamed from: u */
    private void m12325u() {
        if (this.f10858s.getText().length() != 0) {
            this.f10858s.setTextColor(getResources().getColor(C2909v.f11700i));
            if (this.f10858s.getVisibility() != 0) {
                m12322m();
            }
            C0707i.m4169h(this.f10858s, 11, 100, 1, 2);
            if (C2877p0.f11446q == 120) {
                this.f10853n.setTextSize(15.0f);
            }
        }
        this.f10853n.setBackgroundResource(C2913x.f11775x);
    }

    /* renamed from: x */
    private void m12326x() {
        if (this.f10858s.getText().length() != 0) {
            this.f10858s.setTextColor(getResources().getColor(C2909v.f11694c));
            if (this.f10858s.getVisibility() != 0) {
                m12322m();
            }
            if (C2877p0.f11446q == 120) {
                this.f10853n.setTextSize(15.0f);
            }
        }
        m12324s();
    }

    /* renamed from: z */
    private void m12327z() {
        if (this.f10858s.getText().length() != 0) {
            this.f10851E = this.f10853n.getTextSize();
            this.f10858s.setTextColor(getResources().getColor(C2909v.f11697f));
            if (this.f10858s.getVisibility() != 0) {
                m12322m();
            }
            if (C2877p0.f11446q == 120) {
                this.f10853n.setTextSize(15.0f);
            }
        } else {
            this.f10858s.setVisibility(4);
        }
        if (C1152l.m6736g() && getId() == C2915y.f11841Z) {
            this.f10853n.setBackgroundResource(C2913x.f11774w);
        } else {
            this.f10853n.setBackgroundResource(C2913x.f11776y);
        }
    }

    /* renamed from: A */
    public void m12328A(int i10) {
        mo12329B(getResources().getString(i10));
    }

    /* renamed from: B */
    public void mo12329B(String str) {
        if (str != null) {
            if (str.equals(this.f10858s.getText())) {
                return;
            } else {
                this.f10858s.setText(str);
            }
        } else {
            this.f10858s.setText(this.f10861v);
        }
        m12327z();
    }

    /* renamed from: D */
    public void m12330D() {
        startAnimation(C2807h.m12425d(this));
        this.f10853n.setOnTouchListener(this.f10857r);
        setEnabled(true);
    }

    public LinearLayout getBottomContainer() {
        return this.f10854o;
    }

    public TextView getBottomLabel() {
        return this.f10858s;
    }

    public InterfaceC2806g getRbxFocusChangedListener() {
        return this.f10863x;
    }

    public String getText() {
        return this.f10853n.getText().toString();
    }

    public EditText getTextBox() {
        return this.f10853n;
    }

    public LinearLayout getTopContainer() {
        return this.f10855p;
    }

    /* renamed from: k */
    int m12331k(String str, Paint paint, float f10) {
        float f11 = 100.0f;
        float f12 = 12.0f;
        while (f11 - f12 > 0.5f) {
            float f13 = (f11 + f12) / 2.0f;
            paint.setTextSize(f13);
            if (paint.measureText(str) >= f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        return (int) f12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public Drawable m12332n(Context context, int i10) {
        if (i10 == 0) {
            return null;
        }
        return C0587a.m3031e(context, i10);
    }

    /* renamed from: o */
    protected void m12333o() {
        this.f10853n.setOnTouchListener(null);
        setRightIcon(0);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            this.f10853n.requestFocus();
        }
    }

    /* renamed from: q */
    public void m12334q() {
        startAnimation(C2807h.m12423b(this));
        this.f10853n.setOnTouchListener(new ViewOnTouchListenerC2770g());
        setEnabled(false);
    }

    /* renamed from: r */
    public void m12335r() {
        if (this.f10858s.getVisibility() != 0) {
            m12324s();
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC2768e());
        this.f10858s.startAnimation(alphaAnimation);
    }

    public void setHintText(int i10) {
        setHintText(getResources().getString(i10));
    }

    public void setLongHintText(int i10) {
        this.f10858s.setText(i10);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10857r.m12342a(onTouchListener);
    }

    public void setRbxFocusChangedListener(InterfaceC2806g interfaceC2806g) {
        this.f10863x = interfaceC2806g;
    }

    public void setRightDrawableClickListener(View.OnClickListener onClickListener) {
        this.f10865z = onClickListener;
    }

    protected void setRightIcon(int i10) {
        if (this.f10847A == i10) {
            return;
        }
        this.f10847A = i10;
        this.f10853n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, m12332n(getContext(), i10), (Drawable) null);
    }

    protected void setTextBoxInput(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    c10 = 0;
                    break;
                }
                break;
            case 116076:
                if (str.equals("uri")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    c10 = 2;
                    break;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    c10 = 3;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 4;
                    break;
                }
                break;
            case 223353409:
                if (str.equals("textNoSuggestions")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f10853n.setInputType(2);
                return;
            case 1:
                this.f10853n.setInputType(17);
                return;
            case 2:
                this.f10853n.setInputType(20);
                return;
            case 3:
                this.f10853n.setInputType(33);
                return;
            case 4:
                this.f10853n.setInputType(3);
                return;
            case 5:
                this.f10853n.setInputType(524289);
                return;
            case 6:
                this.f10853n.setInputType(129);
                return;
            default:
                return;
        }
    }

    public void setTextBoxText(String str) {
        this.f10853n.setText(str);
    }

    /* renamed from: t */
    protected void m12336t() {
        this.f10853n.setOnTouchListener(this.f10857r);
        setRightIcon(C2913x.f11755d);
    }

    /* renamed from: v */
    public void m12337v(int i10) {
        mo12338w(getResources().getString(i10));
    }

    /* renamed from: w */
    public void mo12338w(String str) {
        if (str != null) {
            this.f10858s.setText(str);
        } else {
            this.f10858s.setText(this.f10860u);
        }
        m12325u();
    }

    /* renamed from: y */
    public void m12339y(String str) {
        if (str != null) {
            this.f10858s.setText(str);
        } else {
            this.f10858s.setText(this.f10860u);
        }
        m12326x();
    }

    public void setHintText(String str) {
        this.f10853n.post(new RunnableC2769f(str));
        this.f10853n.setHint(str);
    }

    public void setLongHintText(String str) {
        this.f10858s.setText(str);
    }
}
