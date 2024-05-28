package com.roblox.client.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.C2909v;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import p314y8.C5911e;
import p314y8.C5913g;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5909c;

/* loaded from: classes.dex */
public class RobloxToolbar extends Toolbar implements C5911e.b {

    /* renamed from: n */
    private TextView f10939n;

    /* renamed from: o */
    private TextView f10940o;

    /* renamed from: p */
    private Integer f10941p;

    /* renamed from: q */
    private Integer f10942q;

    /* renamed from: r */
    private InterfaceC2794e f10943r;

    /* renamed from: s */
    private InterfaceC2797h f10944s;

    /* renamed from: t */
    private C2798i f10945t;

    /* renamed from: u */
    private C2796g f10946u;

    /* renamed from: v */
    private EnumC5912f f10947v;

    /* renamed from: w */
    private InterfaceC5909c f10948w;

    /* renamed from: com.roblox.client.components.RobloxToolbar$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2790a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10949a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f10949a = iArr;
            try {
                iArr[EnumC5912f.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10949a[EnumC5912f.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$b */
    /* loaded from: classes.dex */
    public static class C2791b implements InterfaceC2794e {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2794e
        /* renamed from: a */
        public int mo12398a(EnumC5912f enumC5912f) {
            int i10 = C2790a.f10949a[enumC5912f.ordinal()];
            if (i10 == 1) {
                return C2913x.f11737J;
            }
            if (i10 != 2) {
                return C2913x.f11736I;
            }
            return C2913x.f11738K;
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$c */
    /* loaded from: classes.dex */
    public static class C2792c implements InterfaceC2794e {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2794e
        /* renamed from: a */
        public int mo12398a(EnumC5912f enumC5912f) {
            int i10 = C2790a.f10949a[enumC5912f.ordinal()];
            if (i10 == 1) {
                return C2913x.f11740M;
            }
            if (i10 != 2) {
                return C2913x.f11739L;
            }
            return C2913x.f11741N;
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$d */
    /* loaded from: classes.dex */
    public static class C2793d implements InterfaceC2797h {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2797h
        /* renamed from: a */
        public int mo12399a(EnumC5912f enumC5912f) {
            if (C2790a.f10949a[enumC5912f.ordinal()] != 1) {
                return C2909v.f11714w;
            }
            return C2909v.f11707p;
        }

        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2797h
        /* renamed from: b */
        public int mo12400b(EnumC5912f enumC5912f) {
            if (C2790a.f10949a[enumC5912f.ordinal()] != 1) {
                return C2909v.f11714w;
            }
            return C2909v.f11714w;
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2794e {
        /* renamed from: a */
        int mo12398a(EnumC5912f enumC5912f);
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$f */
    /* loaded from: classes.dex */
    public static class C2795f implements InterfaceC2797h {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2797h
        /* renamed from: a */
        public int mo12399a(EnumC5912f enumC5912f) {
            if (C2790a.f10949a[enumC5912f.ordinal()] != 1) {
                return C2909v.f11713v;
            }
            return C2909v.f11706o;
        }

        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2797h
        /* renamed from: b */
        public int mo12400b(EnumC5912f enumC5912f) {
            if (C2790a.f10949a[enumC5912f.ordinal()] != 1) {
                return C2909v.f11706o;
            }
            return C2909v.f11713v;
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$g */
    /* loaded from: classes.dex */
    public static class C2796g {
        /* renamed from: a */
        public String m12401a(EnumC5912f enumC5912f) {
            int i10 = C2790a.f10949a[enumC5912f.ordinal()];
            return (i10 == 1 || i10 == 2) ? "GothamSSm-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$h */
    /* loaded from: classes.dex */
    public interface InterfaceC2797h {
        /* renamed from: a */
        int mo12399a(EnumC5912f enumC5912f);

        /* renamed from: b */
        int mo12400b(EnumC5912f enumC5912f);
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$i */
    /* loaded from: classes.dex */
    public static class C2798i {
        /* renamed from: a */
        public String m12402a(EnumC5912f enumC5912f) {
            int i10 = C2790a.f10949a[enumC5912f.ordinal()];
            return (i10 == 1 || i10 == 2) ? "GothamSSm-Medium.otf" : "SourceSansPro-Semibold.ttf";
        }
    }

    /* renamed from: com.roblox.client.components.RobloxToolbar$j */
    /* loaded from: classes.dex */
    public static class C2799j implements InterfaceC2797h {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2797h
        /* renamed from: a */
        public int mo12399a(EnumC5912f enumC5912f) {
            int i10 = C2790a.f10949a[enumC5912f.ordinal()];
            if (i10 == 1) {
                return C2909v.f11707p;
            }
            if (i10 != 2) {
                return C2909v.f11693b;
            }
            return C2909v.f11714w;
        }

        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC2797h
        /* renamed from: b */
        public int mo12400b(EnumC5912f enumC5912f) {
            if (C2790a.f10949a[enumC5912f.ordinal()] != 2) {
                return C2909v.f11716y;
            }
            return C2909v.f11707p;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10941p = null;
        this.f10942q = null;
        this.f10948w = new C5913g();
        this.f10943r = new C2791b();
        this.f10944s = new C2799j();
        this.f10945t = new C2798i();
        this.f10946u = new C2796g();
    }

    /* renamed from: a */
    private int m12393a(EnumC5912f enumC5912f) {
        if (enumC5912f == null) {
            enumC5912f = this.f10948w.mo21034c();
        }
        return this.f10943r.mo12398a(enumC5912f);
    }

    /* renamed from: b */
    private void m12394b() {
        if (this.f10940o == null) {
            TextView textView = (TextView) findViewById(C2915y.f11911w1);
            this.f10940o = textView;
            textView.setVisibility(0);
            Integer num = this.f10942q;
            if (num != null) {
                this.f10940o.setTextColor(num.intValue());
            }
            m12396d(this.f10940o, getSubTitleFont());
        }
    }

    /* renamed from: c */
    private void m12395c() {
        if (this.f10939n == null) {
            TextView textView = (TextView) findViewById(C2915y.f11914x1);
            this.f10939n = textView;
            textView.setVisibility(0);
            Integer num = this.f10941p;
            if (num != null) {
                this.f10939n.setTextColor(num.intValue());
            }
            m12396d(this.f10939n, getTitleFont());
        }
    }

    /* renamed from: d */
    private void m12396d(TextView textView, String str) {
        if (textView == null || C2808i.m12431f(textView, str)) {
            return;
        }
        C2808i.m12429d(textView, getContext(), str);
    }

    /* renamed from: e */
    private void m12397e(boolean z10) {
        if (z10) {
            setNavigationIcon(m12393a(this.f10947v));
        } else {
            setNavigationIcon((Drawable) null);
        }
    }

    private String getSubTitleFont() {
        return this.f10946u.m12401a(this.f10948w.mo21034c());
    }

    private String getTitleFont() {
        return this.f10945t.m12402a(this.f10948w.mo21034c());
    }

    @Override // p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        if (enumC5912f == this.f10947v) {
            return;
        }
        this.f10947v = enumC5912f;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        m12396d(this.f10939n, getTitleFont());
        m12396d(this.f10940o, getSubTitleFont());
        m12397e(getNavigationIcon() != null);
    }

    public int getBackgroundColor() {
        return getResources().getColor(this.f10944s.mo12399a(this.f10948w.mo21034c()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f10944s.mo12400b(this.f10948w.mo21034c()));
    }

    public void setIconDelegate(InterfaceC2794e interfaceC2794e) {
        this.f10943r = interfaceC2794e;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        m12397e(onClickListener != null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        m12394b();
        this.f10940o.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i10) {
        this.f10942q = Integer.valueOf(i10);
        TextView textView = this.f10940o;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setThemeChooser(InterfaceC5909c interfaceC5909c) {
        this.f10948w = interfaceC5909c;
    }

    public void setThemeColorDelegate(InterfaceC2797h interfaceC2797h) {
        this.f10944s = interfaceC2797h;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        m12395c();
        this.f10939n.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i10) {
        this.f10941p = Integer.valueOf(i10);
        TextView textView = this.f10939n;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        m12395c();
        this.f10939n.setText(charSequence);
    }
}
