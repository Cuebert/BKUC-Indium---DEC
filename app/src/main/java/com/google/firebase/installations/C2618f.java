package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p285w5.AbstractC5461d;
import p311y5.C5897b;
import p311y5.InterfaceC5896a;

/* renamed from: com.google.firebase.installations.f */
/* loaded from: classes.dex */
public final class C2618f {

    /* renamed from: b */
    public static final long f10270b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f10271c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C2618f f10272d;

    /* renamed from: a */
    private final InterfaceC5896a f10273a;

    private C2618f(InterfaceC5896a interfaceC5896a) {
        this.f10273a = interfaceC5896a;
    }

    /* renamed from: c */
    public static C2618f m12029c() {
        return m12030d(C5897b.m20983b());
    }

    /* renamed from: d */
    public static C2618f m12030d(InterfaceC5896a interfaceC5896a) {
        if (f10272d == null) {
            f10272d = new C2618f(interfaceC5896a);
        }
        return f10272d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m12031g(String str) {
        return f10271c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m12032h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m12033a() {
        return this.f10273a.mo20982a();
    }

    /* renamed from: b */
    public long m12034b() {
        return TimeUnit.MILLISECONDS.toSeconds(m12033a());
    }

    /* renamed from: e */
    public long m12035e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m12036f(AbstractC5461d abstractC5461d) {
        return TextUtils.isEmpty(abstractC5461d.mo20049b()) || abstractC5461d.mo20055h() + abstractC5461d.mo20050c() < m12034b() + f10270b;
    }
}
