package p184o2;

import android.os.Bundle;
import p295x2.C5506a;
import p321z2.C5980h;

/* renamed from: o2.c */
/* loaded from: classes.dex */
public final class C4124c implements C5506a.d {

    /* renamed from: o */
    public static final C4124c f16836o = new C4124c(new Bundle(), null);

    /* renamed from: n */
    private final Bundle f16837n;

    /* synthetic */ C4124c(Bundle bundle, C4128g c4128g) {
        this.f16837n = bundle;
    }

    /* renamed from: a */
    public final Bundle m17127a() {
        return new Bundle(this.f16837n);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4124c) {
            return C5980h.m21268a(this.f16837n, ((C4124c) obj).f16837n);
        }
        return false;
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f16837n);
    }
}
