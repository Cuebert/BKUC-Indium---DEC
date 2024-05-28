package p321z2;

import android.app.Activity;
import android.content.Intent;

/* renamed from: z2.u */
/* loaded from: classes.dex */
public final class C6004u extends AbstractDialogInterfaceOnClickListenerC6006w {

    /* renamed from: n */
    final /* synthetic */ Intent f22070n;

    /* renamed from: o */
    final /* synthetic */ Activity f22071o;

    /* renamed from: p */
    final /* synthetic */ int f22072p;

    public C6004u(Intent intent, Activity activity, int i10) {
        this.f22070n = intent;
        this.f22071o = activity;
        this.f22072p = i10;
    }

    @Override // p321z2.AbstractDialogInterfaceOnClickListenerC6006w
    /* renamed from: a */
    public final void mo21316a() {
        Intent intent = this.f22070n;
        if (intent != null) {
            this.f22071o.startActivityForResult(intent, this.f22072p);
        }
    }
}
