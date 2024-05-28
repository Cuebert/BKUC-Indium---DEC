package p313y7;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0844k;
import com.roblox.client.C2745b0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2817d1;
import com.roblox.client.C2822f0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2887r;
import com.roblox.client.C2905t;
import com.roblox.client.C2909v;
import com.roblox.client.C2911w;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import com.roblox.client.NotificationStreamActivity;
import com.roblox.engine.jni.NativeGLInterface;
import p023b9.C1079c;
import p033c7.C1134c;
import p179n9.C4083g;
import p204p9.C4278a;
import p239s7.C4534e;
import p314y8.C5913g;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5909c;

/* renamed from: y7.d */
/* loaded from: classes.dex */
public class C5902d {

    /* renamed from: a */
    private final String f21743a;

    /* renamed from: b */
    private ActivityC0803d f21744b;

    /* renamed from: c */
    private InterfaceC5909c f21745c;

    /* renamed from: d */
    private int f21746d;

    /* renamed from: e */
    private int f21747e;

    /* renamed from: f */
    private MenuItem f21748f;

    /* renamed from: g */
    private TextView f21749g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y7.d$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5902d.this.m21003e();
        }
    }

    /* renamed from: y7.d$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21751a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f21751a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21751a[EnumC5912f.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5902d(Fragment fragment) {
        this(fragment, new C5913g());
    }

    /* renamed from: a */
    private int m20996a() {
        if (b.f21751a[this.f21745c.mo21034c().ordinal()] != 1) {
            return this.f21747e;
        }
        return -1;
    }

    /* renamed from: b */
    private int m20997b() {
        if (b.f21751a[this.f21745c.mo21034c().ordinal()] != 1) {
            return C2913x.f11733F;
        }
        return C2913x.f11734G;
    }

    /* renamed from: c */
    private int m20998c() {
        if (b.f21751a[this.f21745c.mo21034c().ordinal()] != 1) {
            return C2913x.f11745R;
        }
        return C2913x.f11746S;
    }

    /* renamed from: g */
    private void m20999g(int i10) {
        this.f21746d = i10;
        m21000h((TextView) this.f21748f.getActionView().findViewById(C2915y.f11796F0), this.f21746d);
    }

    /* renamed from: h */
    private void m21000h(TextView textView, int i10) {
        if (i10 > 0) {
            textView.setVisibility(0);
            if (i10 > 99) {
                textView.setText(textView.getContext().getString(C2748c0.f10674j3));
                return;
            } else {
                textView.setText(C4534e.m18582a(i10));
                return;
            }
        }
        textView.setVisibility(8);
    }

    /* renamed from: i */
    private void m21001i(InterfaceC0844k interfaceC0844k) {
        Point m12469h = C2817d1.m12469h(this.f21744b);
        int dimensionPixelSize = this.f21744b.getResources().getDimensionPixelSize(C2911w.f11724d);
        int dimensionPixelSize2 = this.f21744b.getResources().getDimensionPixelSize(C2911w.f11723c);
        int m12464c = (int) C2817d1.m12464c(this.f21744b, 80);
        int m12464c2 = (int) C2817d1.m12464c(this.f21744b, 420);
        int i10 = ((m12469h.y - dimensionPixelSize2) - dimensionPixelSize) - m12464c;
        int m12464c3 = (int) C2817d1.m12464c(this.f21744b, 15);
        C2887r c2887r = new C2887r();
        c2887r.m4606m2(2, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("dialogWidth", m12464c2);
        bundle.putInt("dialogHeight", i10);
        bundle.putInt("dialogGravity", 53);
        bundle.putInt("dialogOffsetY", dimensionPixelSize);
        bundle.putInt("dialogOffsetX", m12464c3);
        bundle.putString("DEFAULT_URL", C2877p0.m12959y0());
        c2887r.m4282H1(bundle);
        if (interfaceC0844k != null) {
            c2887r.mo583f().mo4889a(interfaceC0844k);
        }
        c2887r.mo4608o2(this.f21744b.m4617y0(), "NOTIFICATION_STREAM_TAG");
    }

    /* renamed from: d */
    public MenuItem m21002d(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C2745b0.f10474a, menu);
        MenuItem findItem = menu.findItem(C2915y.f11846b);
        this.f21748f = findItem;
        View actionView = findItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(C2915y.f11793E0);
        TextView textView = (TextView) actionView.findViewById(C2915y.f11796F0);
        this.f21749g = textView;
        m21000h(textView, this.f21746d);
        imageView.setOnClickListener(new a());
        imageView.setImageResource(m20998c());
        this.f21749g.setBackgroundResource(m20997b());
        this.f21749g.setTextColor(m20996a());
        return this.f21748f;
    }

    /* renamed from: e */
    public void m21003e() {
        m21004f(null);
    }

    /* renamed from: f */
    public void m21004f(InterfaceC0844k interfaceC0844k) {
        if (this.f21744b == null) {
            return;
        }
        int m6384e = C1079c.m6380c().m6384e();
        if (!C1134c.m6537a().mo6550F0()) {
            C2822f0.m12491m(m6384e);
        }
        C1079c.m6380c().m6396q(0);
        this.f21746d = 0;
        TextView textView = this.f21749g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C4083g.m16979d().mo16970c().m18297e().mo14636W(new C4278a());
        if (C2877p0.m12933l0()) {
            Intent intent = new Intent(this.f21744b, (Class<?>) NotificationStreamActivity.class);
            if (interfaceC0844k != null) {
                intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", true);
            }
            this.f21744b.startActivityForResult(intent, 20110);
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.f21744b.overridePendingTransition(0, 0);
                return;
            } else {
                this.f21744b.overridePendingTransition(C2905t.f11658b, R.anim.fade_out);
                return;
            }
        }
        m21001i(interfaceC0844k);
    }

    /* renamed from: j */
    public void m21005j() {
        Fragment m4498j0 = this.f21744b.m4617y0().m4498j0("NOTIFICATION_STREAM_TAG");
        if (m4498j0 != null && m4498j0.m4370r0()) {
            C1079c.m6380c().m6396q(0);
        }
        m20999g(C1079c.m6380c().m6384e());
    }

    public C5902d(Fragment fragment, InterfaceC5909c interfaceC5909c) {
        this.f21743a = "NOTIFICATION_STREAM_TAG";
        this.f21746d = -1;
        ActivityC0803d m4363p = fragment.m4363p();
        this.f21744b = m4363p;
        this.f21745c = interfaceC5909c;
        Resources resources = m4363p.getResources();
        this.f21747e = resources != null ? resources.getColor(C2909v.f11709r) : -12303292;
    }
}
