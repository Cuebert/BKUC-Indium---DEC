package p061e7;

import android.content.Context;
import android.content.DialogInterface;
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
import com.roblox.client.C2906t0;
import com.roblox.client.C2909v;
import com.roblox.client.C2915y;
import com.roblox.client.components.RobloxToolbar;
import p023b9.C1079c;
import p062e8.AbstractC3097h;
import p062e8.C3098i;
import p100h7.C3415h;
import p300x7.C5565g;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5910d;

/* renamed from: e7.e */
/* loaded from: classes.dex */
public class C3084e extends C2906t0 {

    /* renamed from: k1 */
    private boolean f12941k1 = false;

    /* renamed from: l1 */
    private boolean f12942l1 = false;

    /* renamed from: m1 */
    private TextView f12943m1;

    /* renamed from: n1 */
    private FrameLayout f12944n1;

    /* renamed from: o1 */
    private ImageView f12945o1;

    /* renamed from: p1 */
    private InterfaceC5910d f12946p1;

    /* renamed from: q1 */
    private InterfaceC5910d f12947q1;

    /* renamed from: r1 */
    private InterfaceC5910d f12948r1;

    /* renamed from: s1 */
    private RobloxToolbar.C2792c f12949s1;

    /* renamed from: e7.e$a */
    /* loaded from: classes.dex */
    class a implements C5565g.d {
        a() {
        }

        @Override // p300x7.C5565g.d
        /* renamed from: a */
        public void mo13586a(boolean z10, int i10) {
            C3084e.this.m13585o3();
        }
    }

    /* renamed from: e7.e$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12951a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f12951a = iArr;
            try {
                iArr[EnumC5912f.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12951a[EnumC5912f.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: e7.e$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC5910d {

        /* renamed from: a */
        private final int f12952a;

        public c(Context context) {
            this.f12952a = context.getResources().getColor(C2909v.f11711t);
        }

        @Override // p314y8.InterfaceC5910d
        /* renamed from: a */
        public int mo12228a(EnumC5912f enumC5912f) {
            if (b.f12951a[enumC5912f.ordinal()] != 1) {
                return this.f12952a;
            }
            return -1;
        }
    }

    /* renamed from: e7.e$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC5910d {

        /* renamed from: a */
        private final int f12953a;

        /* renamed from: b */
        private final int f12954b;

        public d(Context context) {
            this.f12953a = context.getResources().getColor(C2909v.f11710s);
            this.f12954b = context.getResources().getColor(C2909v.f11708q);
        }

        @Override // p314y8.InterfaceC5910d
        /* renamed from: a */
        public int mo12228a(EnumC5912f enumC5912f) {
            if (b.f12951a[enumC5912f.ordinal()] != 1) {
                return this.f12953a;
            }
            return this.f12954b;
        }
    }

    /* renamed from: e7.e$e */
    /* loaded from: classes.dex */
    public static class e implements InterfaceC5910d {

        /* renamed from: a */
        private final int f12955a;

        /* renamed from: b */
        private final int f12956b;

        public e(Context context) {
            this.f12955a = context.getResources().getColor(C2909v.f11712u);
            this.f12956b = context.getResources().getColor(C2909v.f11705n);
        }

        @Override // p314y8.InterfaceC5910d
        /* renamed from: a */
        public int mo12228a(EnumC5912f enumC5912f) {
            if (b.f12951a[enumC5912f.ordinal()] != 1) {
                return this.f12955a;
            }
            return this.f12956b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m13581l3(ActivityC0803d activityC0803d) {
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
            return;
        }
        if (this.f12942l1) {
            m4596a2();
        } else {
            m13585o3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m13582m3(View view) {
        m4596a2();
    }

    /* renamed from: n3 */
    private void m13583n3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C2738a0.f10409M, this.f11669Z0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(C2915y.f11885o);
        this.f12945o1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: e7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3084e.this.m13582m3(view);
            }
        });
        this.f12943m1 = (TextView) frameLayout.findViewById(C2915y.f11900t);
        this.f12944n1 = (FrameLayout) frameLayout.findViewById(C2915y.f11903u);
    }

    /* renamed from: p3 */
    private void m13584p3(EnumC5912f enumC5912f) {
        int mo12228a;
        FrameLayout frameLayout = this.f12944n1;
        if (this.f12942l1) {
            mo12228a = this.f12947q1.mo12228a(enumC5912f);
        } else {
            mo12228a = this.f12946p1.mo12228a(enumC5912f);
        }
        frameLayout.setBackgroundColor(mo12228a);
        this.f12943m1.setTextColor(this.f12948r1.mo12228a(enumC5912f));
        this.f12945o1.setImageResource(this.f12949s1.mo12398a(enumC5912f));
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo264D0 = super.mo264D0(layoutInflater, viewGroup, bundle);
        this.f12946p1 = new e(m4384w());
        this.f12947q1 = new d(m4384w());
        this.f12948r1 = new c(m4384w());
        this.f12949s1 = new RobloxToolbar.C2792c();
        m13583n3(layoutInflater);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            if (m4378u.getBoolean("showRobux", false)) {
                this.f12941k1 = true;
                m13585o3();
                C5565g.m20445e().m20462n(new a(), new C3415h());
            } else if (m4378u.getBoolean("showPremium", false)) {
                this.f12942l1 = true;
                this.f12943m1.setText(C2748c0.f10554N2);
            }
        }
        m13584p3(C1079c.m6380c().m6386g());
        return mo264D0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.C2906t0
    /* renamed from: L2 */
    public void mo13197L2(AbstractC3097h abstractC3097h) {
        super.mo13197L2(abstractC3097h);
        final ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: e7.d
                @Override // java.lang.Runnable
                public final void run() {
                    C3084e.this.m13581l3(m4363p);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.C2906t0
    /* renamed from: O2 */
    public String mo13199O2() {
        return this.f12942l1 ? "buildersClub" : this.f12941k1 ? "robux" : super.mo13199O2();
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        super.mo12200U(enumC5912f);
        m13584p3(enumC5912f);
    }

    /* renamed from: o3 */
    public void m13585o3() {
        if (this.f12941k1 && m4342g0()) {
            this.f12943m1.setText(m4330Z(C2748c0.f10687l4, C3098i.m13621a(C1079c.m6380c().m6385f())));
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (C5565g.m20445e().m20457f()) {
            return;
        }
        if (this.f12942l1 || this.f12941k1) {
            C2822f0.m12481c(mo13199O2(), "close");
        }
    }
}
