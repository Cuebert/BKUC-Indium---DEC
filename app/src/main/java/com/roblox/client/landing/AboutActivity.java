package com.roblox.client.landing;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2738a0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2842l;
import com.roblox.client.C2877p0;
import com.roblox.client.C2905t;
import com.roblox.client.C2915y;
import com.roblox.client.landing.AboutActivity;
import p035c9.C1151k;
import p049d9.C3025b;

/* loaded from: classes.dex */
public class AboutActivity extends AbstractActivityC2837i0 {

    /* renamed from: com.roblox.client.landing.AboutActivity$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC2844a implements View.OnClickListener {
        ViewOnClickListenerC2844a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2822f0.m12481c("about", "close");
            AboutActivity.this.finish();
            AboutActivity.this.overridePendingTransition(C2905t.f11659c, C2905t.f11657a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.landing.AboutActivity$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2845b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11323a;

        static {
            int[] iArr = new int[C2842l.b.values().length];
            f11323a = iArr;
            try {
                iArr[C2842l.b.ARM32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11323a[C2842l.b.ARM64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ boolean m12691B1(View view) {
        C2842l.b m12685i = C2842l.m12682g().m12685i();
        String name = m12685i.name();
        int i10 = C2845b.f11323a[m12685i.ordinal()];
        if (i10 == 1) {
            name = "32-bit";
        } else if (i10 == 2) {
            name = "64-bit";
        }
        Toast.makeText(this, name + " -- Ver:1600", 0).show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1151k.m6712f("FragmentAbout", "onCreate()");
        setContentView(C2738a0.f10422m);
        View findViewById = findViewById(C2915y.f11918z);
        TextView textView = (TextView) findViewById(C2915y.f11783B);
        TextView textView2 = (TextView) findViewById(C2915y.f11786C);
        TextView textView3 = (TextView) findViewById(C2915y.f11780A);
        findViewById.setOnClickListener(new ViewOnClickListenerC2844a());
        C3025b.m13492b(this, textView);
        textView2.setText(C2877p0.m12903Z0());
        textView3.setText(C2877p0.m12926i());
        textView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: r7.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m12691B1;
                m12691B1 = AboutActivity.this.m12691B1(view);
                return m12691B1;
            }
        });
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        C2822f0.m12498t("about");
    }
}
