package p279w;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.a */
/* loaded from: classes.dex */
public final class C5004a extends AbstractC5033h0 {

    /* renamed from: a */
    private final Executor f19104a;

    /* renamed from: b */
    private final Handler f19105b;

    public C5004a(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f19104a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f19105b = handler;
    }

    @Override // p279w.AbstractC5033h0
    /* renamed from: b */
    public Executor mo19461b() {
        return this.f19104a;
    }

    @Override // p279w.AbstractC5033h0
    /* renamed from: c */
    public Handler mo19462c() {
        return this.f19105b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5033h0)) {
            return false;
        }
        AbstractC5033h0 abstractC5033h0 = (AbstractC5033h0) obj;
        return this.f19104a.equals(abstractC5033h0.mo19461b()) && this.f19105b.equals(abstractC5033h0.mo19462c());
    }

    public int hashCode() {
        return ((this.f19104a.hashCode() ^ 1000003) * 1000003) ^ this.f19105b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f19104a + ", schedulerHandler=" + this.f19105b + "}";
    }
}
