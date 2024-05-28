package p198p3;

import com.google.android.gms.common.Feature;

/* renamed from: p3.b0 */
/* loaded from: classes.dex */
public final class C4225b0 {

    /* renamed from: a */
    public static final Feature f17413a;

    /* renamed from: b */
    public static final Feature f17414b;

    /* renamed from: c */
    public static final Feature f17415c;

    /* renamed from: d */
    public static final Feature f17416d;

    /* renamed from: e */
    public static final Feature f17417e;

    /* renamed from: f */
    public static final Feature f17418f;

    /* renamed from: g */
    public static final Feature f17419g;

    /* renamed from: h */
    public static final Feature f17420h;

    /* renamed from: i */
    public static final Feature[] f17421i;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 8L);
        f17413a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        f17414b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        f17415c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        f17416d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        f17417e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        f17418f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        f17419g = feature7;
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        f17420h = feature8;
        f17421i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
