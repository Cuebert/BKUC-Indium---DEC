package p210q3;

import com.google.android.gms.common.Feature;

/* renamed from: q3.c */
/* loaded from: classes.dex */
public final class C4304c {

    /* renamed from: a */
    public static final Feature f17531a;

    /* renamed from: b */
    public static final Feature f17532b;

    /* renamed from: c */
    public static final Feature f17533c;

    /* renamed from: d */
    public static final Feature f17534d;

    /* renamed from: e */
    public static final Feature[] f17535e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f17531a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        f17532b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f17533c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f17534d = feature4;
        f17535e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
