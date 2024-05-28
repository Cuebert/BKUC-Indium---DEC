package p295x2;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.api.Status;

/* renamed from: x2.b */
/* loaded from: classes.dex */
public class C5507b extends Exception {

    /* renamed from: n */
    @Deprecated
    protected final Status f20538n;

    public C5507b(Status status) {
        super(status.m7415y() + ": " + (status.m7416z() != null ? status.m7416z() : BuildConfig.FLAVOR));
        this.f20538n = status;
    }

    /* renamed from: a */
    public Status m20259a() {
        return this.f20538n;
    }

    /* renamed from: b */
    public int m20260b() {
        return this.f20538n.m7415y();
    }
}
