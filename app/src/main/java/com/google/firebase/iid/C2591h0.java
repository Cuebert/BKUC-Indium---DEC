package com.google.firebase.iid;

import p321z2.C5980h;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.h0 */
/* loaded from: classes.dex */
public final class C2591h0 {

    /* renamed from: a */
    private final String f10194a;

    /* renamed from: b */
    private final long f10195b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2591h0(String str, long j10) {
        this.f10194a = (String) C5984j.m21286j(str);
        this.f10195b = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m11967b() {
        return this.f10194a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2591h0)) {
            return false;
        }
        C2591h0 c2591h0 = (C2591h0) obj;
        return this.f10195b == c2591h0.f10195b && this.f10194a.equals(c2591h0.f10194a);
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f10194a, Long.valueOf(this.f10195b));
    }
}
