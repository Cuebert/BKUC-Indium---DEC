package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p018b4.C1002p;
import p070f3.C3128b;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
/* loaded from: classes.dex */
public final class C2573b {

    /* renamed from: a */
    private static final Set<String> f10139a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    private static final List<String> f10140b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final List<String> f10141c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    private static final List<String> f10142d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    private static final List<String> f10143e = Arrays.asList((String[]) C3128b.m13777a(C1002p.f5189a, C1002p.f5190b));

    /* renamed from: f */
    private static final List<String> f10144f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static void m11874a(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: b */
    public static boolean m11875b(String str, String str2, Bundle bundle) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m11877d(str) || bundle == null) {
            return false;
        }
        Iterator<String> it = f10142d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("fdl")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (c10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (c10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    /* renamed from: c */
    public static boolean m11876c(String str, Bundle bundle) {
        if (f10140b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = f10142d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m11877d(String str) {
        return !f10141c.contains(str);
    }

    /* renamed from: e */
    public static boolean m11878e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f10143e.contains(str2)) {
            return false;
        }
        Iterator<String> it = f10144f.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }
}
