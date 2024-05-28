package p295x2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p295x2.InterfaceC5518m;

/* renamed from: x2.r */
/* loaded from: classes.dex */
final class C5523r<R extends InterfaceC5518m> extends BasePendingResult<R> {

    /* renamed from: q */
    private final R f20558q;

    public C5523r(AbstractC5511f abstractC5511f, R r10) {
        super(abstractC5511f);
        this.f20558q = r10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final R mo7423d(Status status) {
        return this.f20558q;
    }
}
