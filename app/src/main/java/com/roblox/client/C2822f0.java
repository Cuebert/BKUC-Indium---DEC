package com.roblox.client;

import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeReportingInterface;
import java.util.ArrayList;
import java.util.List;
import p033c7.C1134c;
import p035c9.C1151k;
import p176n6.C4069c;

/* renamed from: com.roblox.client.f0 */
/* loaded from: classes.dex */
public class C2822f0 {

    /* renamed from: a */
    private static String f11186a;

    /* renamed from: a */
    private static List<NameValuePair> m12479a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("notificationType", str));
        arrayList.add(new NameValuePair("notificationId", str2));
        arrayList.add(new NameValuePair("version", str3));
        return arrayList;
    }

    /* renamed from: b */
    public static void m12480b(String str) {
        C4069c.m16904s().m16907c(str);
    }

    /* renamed from: c */
    public static void m12481c(String str, String str2) {
        C4069c.m16904s().m16908d(str, str2);
    }

    /* renamed from: d */
    public static void m12482d(String str, String str2, String str3) {
        C4069c.m16904s().m16909e(str, str2, str3);
    }

    /* renamed from: e */
    public static void m12483e(String str, String str2, String str3) {
        C4069c.m16904s().m16910f(str, str2, str3);
    }

    /* renamed from: f */
    public static void m12484f(String str, String str2, int i10, int i11) {
        C4069c.m16904s().m16911g(str, str2, i10, i11);
    }

    /* renamed from: g */
    public static void m12485g(String str, String str2) {
        m12486h(str, str2, null);
    }

    /* renamed from: h */
    public static void m12486h(String str, String str2, List<NameValuePair> list) {
        C4069c.m16904s().m16912h(str, str2, list);
    }

    /* renamed from: i */
    public static void m12487i(String str, String str2, String str3) {
        C4069c.m16904s().m16913i(str, str2, str3);
    }

    /* renamed from: j */
    public static void m12488j(String str, String str2, String str3, boolean z10) {
        C4069c.m16904s().m16915k(str, str2, z10, str3);
    }

    /* renamed from: k */
    public static void m12489k(String str, String str2, boolean z10) {
        C4069c.m16904s().m16914j(str, str2, z10);
    }

    /* renamed from: l */
    public static void m12490l(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("type", str2));
        m12486h(str, "logout", arrayList);
    }

    /* renamed from: m */
    public static void m12491m(int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("property", String.valueOf(i10)));
        m12486h("nsOpenContent", "touch", arrayList);
    }

    /* renamed from: n */
    public static void m12492n(String str, boolean z10) {
        C4069c.m16904s().m16916l(str, z10);
    }

    /* renamed from: o */
    public static void m12493o(String str, String str2, String str3, String str4) {
        List<NameValuePair> m12479a = m12479a(str, str2, str3);
        m12479a.add(new NameValuePair("url", str4));
        m12486h("pushNotificationAction", "deepLink", m12479a);
        m12503y();
    }

    /* renamed from: p */
    public static void m12494p(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        List<NameValuePair> m12479a = m12479a(str3, str4, str7);
        m12479a.add(new NameValuePair("actionTaken", str5));
        m12479a.add(new NameValuePair("clientState", str6));
        m12479a.add(new NameValuePair("openedClient", z10 ? "true" : "false"));
        m12479a.add(new NameValuePair("platformType", str2));
        if (C1134c.m6537a().mo6610g0()) {
            NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, m12479a);
        } else {
            m12486h("pushNotificationInteracted", str, m12479a);
            m12503y();
        }
    }

    /* renamed from: q */
    public static void m12495q(String str, String str2, String str3, String str4, String str5, boolean z10, String str6) {
        m12494p(str, str2, str3, str4, null, str5, z10, str6);
    }

    /* renamed from: r */
    public static void m12496r(String str, String str2, String str3) {
        m12497s(str, str2, null, null, str3, "0", new ArrayList());
    }

    /* renamed from: s */
    public static void m12497s(String str, String str2, String str3, String str4, String str5, String str6, List<NameValuePair> list) {
        List<NameValuePair> m12479a = m12479a(str3, str4, str6);
        m12479a.add(new NameValuePair("clientState", str5));
        m12479a.add(new NameValuePair("platformType", str2));
        m12479a.addAll(list);
        m12486h("pushNotificationReceived", str, m12479a);
        m12503y();
    }

    /* renamed from: t */
    public static void m12498t(String str) {
        String str2;
        if (str == null || str.equalsIgnoreCase("splash") || (str2 = f11186a) == null || !str2.equalsIgnoreCase(str)) {
            C1151k.m6707a("rbx.eventstream", "fireScreenLoaded() " + str);
            f11186a = str;
            C4069c.m16904s().m16917m(str);
        }
    }

    /* renamed from: u */
    public static void m12499u(String str, String str2) {
        C4069c.m16904s().m16918n(str, str2);
        m12503y();
    }

    /* renamed from: v */
    public static void m12500v(String str, String str2) {
        C4069c.m16904s().m16919o(str, str2);
        m12503y();
    }

    /* renamed from: w */
    public static void m12501w(String str) {
        C4069c.m16904s().m16920p(str);
    }

    /* renamed from: x */
    public static void m12502x() {
        C4069c.m16904s().m16921q();
    }

    /* renamed from: y */
    public static void m12503y() {
        C4069c.m16904s().m16923u();
    }
}
