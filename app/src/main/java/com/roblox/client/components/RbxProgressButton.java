package com.roblox.client.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2819e0;
import com.roblox.client.C2909v;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;

/* loaded from: classes.dex */
public class RbxProgressButton extends RelativeLayout {

    /* renamed from: A */
    private final int f10904A;

    /* renamed from: B */
    private final int f10905B;

    /* renamed from: C */
    private final int f10906C;

    /* renamed from: D */
    C2809j f10907D;

    /* renamed from: n */
    private RbxButton f10908n;

    /* renamed from: o */
    private TextView f10909o;

    /* renamed from: p */
    private ProgressBar f10910p;

    /* renamed from: q */
    private LinearLayout f10911q;

    /* renamed from: r */
    private InterfaceC2804e f10912r;

    /* renamed from: s */
    private EnumC2788i f10913s;

    /* renamed from: t */
    private EnumC2789j f10914t;

    /* renamed from: u */
    private String f10915u;

    /* renamed from: v */
    private String f10916v;

    /* renamed from: w */
    private String f10917w;

    /* renamed from: x */
    private final int f10918x;

    /* renamed from: y */
    private final int f10919y;

    /* renamed from: z */
    private final int f10920z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$a */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2780a implements Animation.AnimationListener {
        AnimationAnimationListenerC2780a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxProgressButton.this.f10913s = EnumC2788i.BUTTON;
            RbxProgressButton.this.m12388w();
            RbxProgressButton.this.m12386u();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$b */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2781b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AlphaAnimation f10922a;

        AnimationAnimationListenerC2781b(AlphaAnimation alphaAnimation) {
            this.f10922a = alphaAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxProgressButton.this.f10911q.setVisibility(4);
            RbxProgressButton.this.f10908n.setVisibility(0);
            RbxProgressButton.this.f10908n.startAnimation(this.f10922a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$c */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2782c implements Animation.AnimationListener {
        AnimationAnimationListenerC2782c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxProgressButton.this.f10913s = EnumC2788i.PROGRESS;
            RbxProgressButton.this.m12386u();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$d */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2783d implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AlphaAnimation f10925a;

        AnimationAnimationListenerC2783d(AlphaAnimation alphaAnimation) {
            this.f10925a = alphaAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxProgressButton.this.f10908n.setVisibility(4);
            RbxProgressButton.this.f10911q.setVisibility(0);
            RbxProgressButton.this.f10911q.startAnimation(this.f10925a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$e */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2784e implements Animation.AnimationListener {
        AnimationAnimationListenerC2784e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxProgressButton.this.f10913s = EnumC2788i.PROGRESS;
            RbxProgressButton.this.m12386u();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$f */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2785f implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AlphaAnimation f10928a;

        AnimationAnimationListenerC2785f(AlphaAnimation alphaAnimation) {
            this.f10928a = alphaAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RbxProgressButton.this.f10909o.setText(RbxProgressButton.this.f10915u != null ? RbxProgressButton.this.f10915u : RbxProgressButton.this.f10917w);
            RbxProgressButton.this.f10915u = null;
            RbxProgressButton.this.f10909o.startAnimation(this.f10928a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$g */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2786g implements View.OnClickListener {
        ViewOnClickListenerC2786g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RbxProgressButton.this.f10913s != EnumC2788i.BUTTON || RbxProgressButton.this.f10912r == null) {
                return;
            }
            RbxProgressButton.this.f10912r.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxProgressButton$h */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2787h {

        /* renamed from: a */
        static final /* synthetic */ int[] f10931a;

        static {
            int[] iArr = new int[EnumC2789j.values().length];
            f10931a = iArr;
            try {
                iArr[EnumC2789j.SHOW_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10931a[EnumC2789j.SHOW_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.roblox.client.components.RbxProgressButton$i */
    /* loaded from: classes.dex */
    public enum EnumC2788i {
        BUTTON,
        ANIMATING,
        PROGRESS
    }

    /* renamed from: com.roblox.client.components.RbxProgressButton$j */
    /* loaded from: classes.dex */
    public enum EnumC2789j {
        SHOW_BUTTON,
        SHOW_PROGRESS
    }

    public RbxProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10908n = null;
        this.f10909o = null;
        this.f10910p = null;
        this.f10911q = null;
        this.f10912r = null;
        this.f10913s = EnumC2788i.BUTTON;
        this.f10914t = null;
        this.f10915u = null;
        this.f10916v = null;
        this.f10917w = null;
        this.f10918x = 150;
        this.f10919y = 200;
        this.f10920z = 25;
        this.f10904A = 16711680;
        this.f10905B = 25;
        this.f10906C = 16711680;
        this.f10907D = null;
        m12385t(attributeSet);
    }

    /* renamed from: l */
    private void m12377l() {
        EnumC2788i enumC2788i = this.f10913s;
        if (enumC2788i == EnumC2788i.PROGRESS) {
            this.f10913s = EnumC2788i.ANIMATING;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new AnimationAnimationListenerC2780a());
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(150L);
            this.f10911q.startAnimation(alphaAnimation2);
            alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC2781b(alphaAnimation));
            return;
        }
        if (enumC2788i == EnumC2788i.ANIMATING) {
            m12387v(EnumC2789j.SHOW_BUTTON);
        }
    }

    /* renamed from: m */
    private void m12378m(int i10) {
        this.f10908n.setText(i10);
        m12377l();
    }

    /* renamed from: n */
    private void m12379n(String str) {
        this.f10908n.setText(str);
        m12377l();
    }

    /* renamed from: o */
    private void m12380o(int i10) {
        if (this.f10913s == EnumC2788i.PROGRESS) {
            this.f10915u = getResources().getString(i10);
        } else {
            this.f10909o.setText(i10);
        }
        if (this.f10915u == null) {
            this.f10915u = getResources().getString(C2748c0.f10668i3);
        }
        m12384s();
    }

    /* renamed from: p */
    private void m12381p(String str) {
        if (this.f10913s == EnumC2788i.PROGRESS) {
            this.f10915u = str;
        } else {
            this.f10909o.setText(str);
        }
        m12384s();
    }

    /* renamed from: q */
    private void m12382q() {
        this.f10908n.setText(this.f10916v);
        m12377l();
    }

    /* renamed from: r */
    private void m12383r() {
        if (this.f10913s == EnumC2788i.PROGRESS) {
            this.f10915u = this.f10917w;
        } else {
            this.f10909o.setText(this.f10917w);
        }
        m12384s();
    }

    /* renamed from: s */
    private void m12384s() {
        TextView textView;
        String str;
        EnumC2788i enumC2788i = this.f10913s;
        if (enumC2788i == EnumC2788i.BUTTON) {
            this.f10913s = EnumC2788i.ANIMATING;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new AnimationAnimationListenerC2782c());
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(150L);
            this.f10908n.startAnimation(alphaAnimation2);
            alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC2783d(alphaAnimation));
            return;
        }
        if (enumC2788i == EnumC2788i.PROGRESS) {
            this.f10913s = EnumC2788i.ANIMATING;
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation3.setDuration(200L);
            alphaAnimation3.setAnimationListener(new AnimationAnimationListenerC2784e());
            AlphaAnimation alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation4.setDuration(150L);
            this.f10909o.startAnimation(alphaAnimation4);
            alphaAnimation4.setAnimationListener(new AnimationAnimationListenerC2785f(alphaAnimation3));
            return;
        }
        if (enumC2788i != EnumC2788i.ANIMATING || (textView = this.f10909o) == null || (str = this.f10915u) == null || str.equals(textView)) {
            return;
        }
        m12387v(EnumC2789j.SHOW_PROGRESS);
    }

    /* renamed from: t */
    private void m12385t(AttributeSet attributeSet) {
        RelativeLayout.inflate(getContext(), C2738a0.f10403G, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2819e0.f11144m1);
        this.f10916v = obtainStyledAttributes.getString(C2819e0.f11156q1);
        String string = obtainStyledAttributes.getString(C2819e0.f11159r1);
        this.f10917w = string;
        if (this.f10916v == null) {
            this.f10916v = BuildConfig.FLAVOR;
        }
        if (string == null) {
            this.f10917w = getContext().getString(C2748c0.f10662h3);
        }
        this.f10908n = (RbxButton) findViewById(C2915y.f11854d1);
        this.f10909o = (TextView) findViewById(C2915y.f11851c1);
        this.f10910p = (ProgressBar) findViewById(C2915y.f11845a1);
        this.f10911q = (LinearLayout) findViewById(C2915y.f11848b1);
        this.f10908n.setText(this.f10916v);
        this.f10909o.setText(this.f10917w);
        C2808i.m12428c(this.f10909o, getContext(), attributeSet);
        this.f10909o.setTextSize(0, obtainStyledAttributes.getDimension(C2819e0.f11165t1, 25.0f));
        this.f10909o.setTextColor(obtainStyledAttributes.getColor(C2819e0.f11162s1, 16711680));
        C2808i.m12428c(this.f10908n, getContext(), attributeSet);
        this.f10908n.setTextSize(0, obtainStyledAttributes.getDimension(C2819e0.f11153p1, 25.0f));
        this.f10908n.setTextColor(obtainStyledAttributes.getColor(C2819e0.f11150o1, 16711680));
        this.f10908n.setContentDescription(getContentDescription());
        this.f10911q.setVisibility(4);
        C2809j c2809j = new C2809j(this, attributeSet);
        this.f10907D = c2809j;
        c2809j.m12447m(obtainStyledAttributes.getColor(C2819e0.f11168u1, getResources().getColor(C2909v.f11696e)));
        RbxButton rbxButton = this.f10908n;
        int i10 = C2819e0.f11147n1;
        int i11 = C2913x.f11730C;
        rbxButton.setBackgroundResource(obtainStyledAttributes.getResourceId(i10, i11));
        setBackgroundResource(obtainStyledAttributes.getResourceId(i10, i11));
        m12388w();
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m12386u() {
        EnumC2789j enumC2789j = this.f10914t;
        if (enumC2789j != null) {
            int i10 = C2787h.f10931a[enumC2789j.ordinal()];
            if (i10 == 1) {
                m12377l();
            } else if (i10 == 2) {
                m12384s();
            }
            this.f10914t = null;
        }
    }

    /* renamed from: v */
    private void m12387v(EnumC2789j enumC2789j) {
        this.f10914t = enumC2789j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m12388w() {
        this.f10908n.setOnClickListener(new ViewOnClickListenerC2786g());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f10907D.m12445i(canvas);
    }

    public EnumC2788i getCurrentState() {
        return this.f10913s;
    }

    public InterfaceC2804e getOnRbxClickedListener() {
        return this.f10912r;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10907D.m12446l(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f10908n.setEnabled(z10);
    }

    public void setOnRbxClickedListener(InterfaceC2804e interfaceC2804e) {
        this.f10912r = interfaceC2804e;
    }

    public void setText(String str) {
        this.f10908n.setText(str);
    }

    /* renamed from: x */
    public void m12389x(EnumC2789j enumC2789j) {
        int i10 = C2787h.f10931a[enumC2789j.ordinal()];
        if (i10 == 1) {
            m12382q();
        } else {
            if (i10 != 2) {
                return;
            }
            m12383r();
        }
    }

    /* renamed from: y */
    public void m12390y(EnumC2789j enumC2789j, int i10) {
        int i11 = C2787h.f10931a[enumC2789j.ordinal()];
        if (i11 == 1) {
            m12378m(i10);
        } else {
            if (i11 != 2) {
                return;
            }
            m12380o(i10);
        }
    }

    /* renamed from: z */
    public void m12391z(EnumC2789j enumC2789j, String str) {
        int i10 = C2787h.f10931a[enumC2789j.ordinal()];
        if (i10 == 1) {
            m12379n(str);
        } else {
            if (i10 != 2) {
                return;
            }
            m12381p(str);
        }
    }
}
