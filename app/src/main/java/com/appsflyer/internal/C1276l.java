package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.l */
/* loaded from: classes.dex */
public final class C1276l {
    private final boolean AFInAppEventParameterName;
    public final long valueOf;
    public final String values;

    /* renamed from: com.appsflyer.internal.l$a */
    /* loaded from: classes.dex */
    public interface a {
        void AFInAppEventType(String str, String str2, String str3);

        void values(String str);
    }

    C1276l() {
    }

    public C1276l(String str, long j10, boolean z10) {
        this.values = str;
        this.valueOf = j10;
        this.AFInAppEventParameterName = z10;
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }
}
