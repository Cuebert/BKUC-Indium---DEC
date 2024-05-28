package p198p3;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p308y2.C5625o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p3.y */
/* loaded from: classes.dex */
public final class BinderC4266y extends AbstractBinderC4230e {

    /* renamed from: c */
    final /* synthetic */ C3265m f17450c;

    public BinderC4266y(C4267z c4267z, C3265m c3265m) {
        this.f17450c = c3265m;
    }

    @Override // p198p3.InterfaceC4232f
    /* renamed from: h */
    public final void mo17662h(Status status, PendingIntent pendingIntent) {
        C5625o.m20649b(status, pendingIntent, this.f17450c);
    }
}
