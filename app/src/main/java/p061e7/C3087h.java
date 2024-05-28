package p061e7;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0803d;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2909v;
import com.roblox.client.C2915y;
import com.roblox.client.C2918z0;
import com.roblox.client.components.RobloxToolbar;
import p023b9.C1079c;
import p062e8.AbstractC3097h;
import p062e8.C3098i;
import p100h7.C3415h;
import p300x7.C5565g;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5910d;

/* renamed from: e7.h */
/* loaded from: classes.dex */
public class C3087h extends C2918z0 {

    /* renamed from: K0 */
    private boolean f12960K0 = false;

    /* renamed from: L0 */
    private boolean f12961L0 = false;

    /* renamed from: M0 */
    private TextView f12962M0;

    /* renamed from: N0 */
    private FrameLayout f12963N0;

    /* renamed from: O0 */
    private ImageView f12964O0;

    /* renamed from: P0 */
    private InterfaceC5910d f12965P0;

    /* renamed from: Q0 */
    private InterfaceC5910d f12966Q0;

    /* renamed from: R0 */
    private InterfaceC5910d f12967R0;

    /* renamed from: S0 */
    private RobloxToolbar.C2792c f12968S0;

    /* renamed from: e7.h$a */
    /* loaded from: classes.dex */
    class a implements C5565g.d {
        a() {
        }

        @Override // p300x7.C5565g.d
        /* renamed from: a */
        public void mo13586a(boolean z10, int i10) {
            C3087h.this.m13594M2();
        }
    }

    /* renamed from: e7.h$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12970a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f12970a = iArr;
            try {
                iArr[EnumC5912f.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12970a[EnumC5912f.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: e7.h$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC5910d {

        /* renamed from: a */
        private final int f12971a;

        public c(Context context) {
            this.f12971a = context.getResources().getColor(C2909v.f11711t);
        }

        @Override // p314y8.InterfaceC5910d
        /* renamed from: a */
        public int mo12228a(EnumC5912f enumC5912f) {
            if (b.f12970a[enumC5912f.ordinal()] != 1) {
                return this.f12971a;
            }
            return -1;
        }
    }

    /* renamed from: e7.h$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC5910d {

        /* renamed from: a */
        private final int f12972a;

        /* renamed from: b */
        private final int f12973b;

        public d(Context context) {
            this.f12972a = context.getResources().getColor(C2909v.f11710s);
            this.f12973b = context.getResources().getColor(C2909v.f11708q);
        }

        @Override // p314y8.InterfaceC5910d
        /* renamed from: a */
        public int mo12228a(EnumC5912f enumC5912f) {
            if (b.f12970a[enumC5912f.ordinal()] != 1) {
                return this.f12972a;
            }
            return this.f12973b;
        }
    }

    /* renamed from: e7.h$e */
    /* loaded from: classes.dex */
    public static class e implements InterfaceC5910d {

        /* renamed from: a */
        private final int f12974a;

        /* renamed from: b */
        private final int f12975b;

        public e(Context context) {
            this.f12974a = context.getResources().getColor(C2909v.f11712u);
            this.f12975b = context.getResources().getColor(C2909v.f11705n);
        }

        @Override // p314y8.InterfaceC5910d
        /* renamed from: a */
        public int mo12228a(EnumC5912f enumC5912f) {
            if (b.f12970a[enumC5912f.ordinal()] != 1) {
                return this.f12974a;
            }
            return this.f12975b;
        }
    }

    /* renamed from: I2 */
    private void m13589I2() {
        m4363p().m4617y0().m4476W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void m13590J2(ActivityC0803d activityC0803d) {
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
            return;
        }
        if (this.f12961L0) {
            m13589I2();
        } else {
            m13594M2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void m13591K2(View view) {
        m13589I2();
    }

    /* renamed from: L2 */
    private void m13592L2(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C2738a0.f10409M, this.f11945x0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(C2915y.f11885o);
        this.f12964O0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: e7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3087h.this.m13591K2(view);
            }
        });
        this.f12962M0 = (TextView) frameLayout.findViewById(C2915y.f11900t);
        this.f12963N0 = (FrameLayout) frameLayout.findViewById(C2915y.f11903u);
    }

    /* renamed from: N2 */
    private void m13593N2(EnumC5912f enumC5912f) {
        int mo12228a;
        FrameLayout frameLayout = this.f12963N0;
        if (this.f12961L0) {
            mo12228a = this.f12966Q0.mo12228a(enumC5912f);
        } else {
            mo12228a = this.f12965P0.mo12228a(enumC5912f);
        }
        frameLayout.setBackgroundColor(mo12228a);
        this.f12962M0.setTextColor(this.f12967R0.mo12228a(enumC5912f));
        this.f12964O0.setImageResource(this.f12968S0.mo12398a(enumC5912f));
    }

    @Override // com.roblox.client.C2918z0, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo264D0 = super.mo264D0(layoutInflater, viewGroup, bundle);
        this.f12965P0 = new e(m4384w());
        this.f12966Q0 = new d(m4384w());
        this.f12967R0 = new c(m4384w());
        this.f12968S0 = new RobloxToolbar.C2792c();
        m13592L2(layoutInflater);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            if (m4378u.getBoolean("showRobux", false)) {
                this.f12960K0 = true;
                m13594M2();
                C5565g.m20445e().m20462n(new a(), new C3415h());
            } else if (m4378u.getBoolean("showPremium", false)) {
                this.f12961L0 = true;
                this.f12962M0.setText(C2748c0.f10554N2);
            }
        }
        m13593N2(C1079c.m6380c().m6386g());
        return mo264D0;
    }

    @Override // com.roblox.client.C2918z0, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        if (!C5565g.m20445e().m20457f() && (this.f12961L0 || this.f12960K0)) {
            C2822f0.m12481c(mo13248p2(), "close");
        }
        super.mo4280G0();
    }

    /* renamed from: M2 */
    public void m13594M2() {
        if (this.f12960K0 && m4342g0()) {
            this.f12962M0.setText(m4330Z(C2748c0.f10687l4, C3098i.m13621a(C1079c.m6380c().m6385f())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.C2918z0
    /* renamed from: k2 */
    public void mo13245k2(AbstractC3097h abstractC3097h) {
        super.mo13245k2(abstractC3097h);
        final ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: e7.g
                @Override // java.lang.Runnable
                public final void run() {
                    C3087h.this.m13590J2(m4363p);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.C2918z0
    /* renamed from: p2 */
    public String mo13248p2() {
        return this.f12961L0 ? "buildersClub" : this.f12960K0 ? "robux" : super.mo13248p2();
    }
}
