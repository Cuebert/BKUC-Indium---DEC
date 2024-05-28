package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0051i;
import p024bc.InterfaceC1107j;
import p314y8.C5913g;
import p314y8.EnumC5912f;

/* loaded from: classes.dex */
public class NotificationStreamActivity extends RobloxWebActivity {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.NotificationStreamActivity$a */
    /* loaded from: classes.dex */
    public class MenuItemOnMenuItemClickListenerC2731a implements MenuItem.OnMenuItemClickListener {
        MenuItemOnMenuItemClickListenerC2731a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            NotificationStreamActivity.this.m12199E1("SETTINGS_TAG", C2877p0.m12892U());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.NotificationStreamActivity$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2732b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10377a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f10377a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10377a[EnumC5912f.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10377a[EnumC5912f.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: F1 */
    private void m12198F1(Menu menu, MenuInflater menuInflater) {
        int i10;
        menuInflater.inflate(C2745b0.f10477d, menu);
        MenuItem findItem = menu.findItem(C2915y.f11855e);
        int i11 = C2732b.f10377a[new C5913g().mo21034c().ordinal()];
        if (i11 == 1) {
            i10 = C2913x.f11744Q;
        } else if (i11 != 2) {
            i10 = C2913x.f11743P;
        } else {
            i10 = C2913x.f11742O;
        }
        findItem.setIcon(i10);
        findItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC2731a());
    }

    /* renamed from: E1 */
    public void m12199E1(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.AbstractActivityC2837i0, p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        Menu menu = this.f10391U.getMenu();
        menu.clear();
        m12198F1(menu, getMenuInflater());
        super.mo12200U(enumC5912f);
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("URL_EXTRA", C2877p0.m12959y0());
            intent.putExtra("TITLE_EXTRA", getString(C2748c0.f10594V2));
        }
        super.onCreate(bundle);
        m12198F1(this.f10391U.getMenu(), getMenuInflater());
    }

    @Override // com.roblox.client.RobloxWebActivity
    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C0051i c0051i) {
        m12199E1(c0051i.f201a, c0051i.f202b);
    }
}
