package com.google.firebase.installations;

import p098h5.C3404h;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: classes.dex */
public class C2615c extends C3404h {

    /* renamed from: n */
    private final a f10264n;

    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C2615c(a aVar) {
        this.f10264n = aVar;
    }

    public C2615c(String str, a aVar) {
        super(str);
        this.f10264n = aVar;
    }
}
