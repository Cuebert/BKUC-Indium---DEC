package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.j1 */
/* loaded from: classes.dex */
public class C1964j1 extends IOException {

    /* renamed from: n */
    private InterfaceC1944g2 f7682n;

    public C1964j1(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f7682n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1957i1 m9400a() {
        return new C1957i1("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1964j1 m9401b() {
        return new C1964j1("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1964j1 m9402c() {
        return new C1964j1("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C1964j1 m9403d() {
        return new C1964j1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1964j1 m9404e() {
        return new C1964j1("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C1964j1 m9405g() {
        return new C1964j1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final C1964j1 m9406f(InterfaceC1944g2 interfaceC1944g2) {
        this.f7682n = interfaceC1944g2;
        return this;
    }

    public C1964j1(String str) {
        super(str);
        this.f7682n = null;
    }
}
