package p230rb;

import java.io.IOException;
import p205pb.C4286e;

/* renamed from: rb.i */
/* loaded from: classes.dex */
public final class C4478i extends RuntimeException {

    /* renamed from: n */
    private IOException f18138n;

    /* renamed from: o */
    private IOException f18139o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4478i(IOException iOException) {
        super(iOException);
        this.f18138n = iOException;
        this.f18139o = iOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m18399a(IOException iOException) {
        C4286e.m17738b(this.f18138n, iOException);
        this.f18139o = iOException;
    }

    /* renamed from: b */
    public IOException m18400b() {
        return this.f18138n;
    }

    /* renamed from: c */
    public IOException m18401c() {
        return this.f18139o;
    }
}
