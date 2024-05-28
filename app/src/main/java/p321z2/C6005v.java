package p321z2;

import android.content.Intent;
import p308y2.InterfaceC5612g;

/* renamed from: z2.v */
/* loaded from: classes.dex */
public final class C6005v extends AbstractDialogInterfaceOnClickListenerC6006w {

    /* renamed from: n */
    final /* synthetic */ Intent f22073n;

    /* renamed from: o */
    final /* synthetic */ InterfaceC5612g f22074o;

    public C6005v(Intent intent, InterfaceC5612g interfaceC5612g, int i10) {
        this.f22073n = intent;
        this.f22074o = interfaceC5612g;
    }

    @Override // p321z2.AbstractDialogInterfaceOnClickListenerC6006w
    /* renamed from: a */
    public final void mo21316a() {
        Intent intent = this.f22073n;
        if (intent != null) {
            this.f22074o.startActivityForResult(intent, 2);
        }
    }
}
