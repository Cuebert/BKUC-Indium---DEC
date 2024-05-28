package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import p308y2.C5602b;
import p308y2.C5628r;
import p321z2.C5980h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.p */
/* loaded from: classes.dex */
public final class C1368p {

    /* renamed from: a */
    private final C5602b<?> f6230a;

    /* renamed from: b */
    private final Feature f6231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1368p(C5602b c5602b, Feature feature, C5628r c5628r) {
        this.f6230a = c5602b;
        this.f6231b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1368p)) {
            C1368p c1368p = (C1368p) obj;
            if (C5980h.m21269b(this.f6230a, c1368p.f6230a) && C5980h.m21269b(this.f6231b, c1368p.f6231b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f6230a, this.f6231b);
    }

    public final String toString() {
        return C5980h.m21271d(this).m21272a("key", this.f6230a).m21272a("feature", this.f6231b).toString();
    }
}
