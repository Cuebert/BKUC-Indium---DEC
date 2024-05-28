package p295x2;

import com.google.android.gms.common.Feature;

/* renamed from: x2.o */
/* loaded from: classes.dex */
public final class C5520o extends UnsupportedOperationException {

    /* renamed from: n */
    private final Feature f20557n;

    public C5520o(Feature feature) {
        this.f20557n = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f20557n));
    }
}
