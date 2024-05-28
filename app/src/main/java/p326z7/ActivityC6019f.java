package p326z7;

import android.os.Bundle;
import com.roblox.client.AbstractActivityC2837i0;
import p035c9.C1151k;

/* renamed from: z7.f */
/* loaded from: classes.dex */
public class ActivityC6019f extends AbstractActivityC2837i0 {

    /* renamed from: S */
    private final String f22097S = "RobloxMVPActivity";

    /* renamed from: T */
    protected InterfaceC6018e f22098T;

    /* renamed from: A1 */
    private void m21334A1(EnumC6017d enumC6017d) {
        InterfaceC6018e interfaceC6018e = this.f22098T;
        if (interfaceC6018e != null) {
            interfaceC6018e.m21333a(enumC6017d);
        } else {
            C1151k.m6716j("RobloxMVPActivity", "Lifecycle listener is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21334A1(EnumC6017d.ON_CREATE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m21334A1(EnumC6017d.ON_DESTROY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPause() {
        super.onPause();
        m21334A1(EnumC6017d.ON_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onResume() {
        super.onResume();
        m21334A1(EnumC6017d.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        m21334A1(EnumC6017d.ON_START);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        super.onStop();
        m21334A1(EnumC6017d.ON_STOP);
    }
}
