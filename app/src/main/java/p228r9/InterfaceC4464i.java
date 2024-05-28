package p228r9;

import p091gc.InterfaceC3330b;
import p119ic.InterfaceC3557a;
import p119ic.InterfaceC3562f;
import p119ic.InterfaceC3571o;
import p119ic.InterfaceC3576t;
import p193ob.AbstractC4183j0;
import p252t9.C4741a;
import p252t9.C4742b;
import p252t9.C4743c;

/* renamed from: r9.i */
/* loaded from: classes.dex */
public interface InterfaceC4464i {
    @InterfaceC3571o("/v2/push-notifications/deregister-current-device")
    /* renamed from: a */
    InterfaceC3330b<AbstractC4183j0> m18293a();

    @InterfaceC3562f("/v2/push-notifications/metadata")
    /* renamed from: b */
    InterfaceC3330b<AbstractC4183j0> m18294b(@InterfaceC3576t("platformType") String str, @InterfaceC3576t("notificationToken") String str2, @InterfaceC3576t("notificationId") String str3);

    @InterfaceC3571o("/v2/push-notifications/mark-as-read")
    /* renamed from: c */
    InterfaceC3330b<AbstractC4183j0> m18295c(@InterfaceC3557a C4741a c4741a);

    @InterfaceC3571o("/v2/push-notifications/register-android-amazon")
    /* renamed from: d */
    InterfaceC3330b<AbstractC4183j0> m18296d(@InterfaceC3557a C4743c c4743c);

    @InterfaceC3571o("/v2/stream-notifications/clear-unread")
    /* renamed from: e */
    InterfaceC3330b<AbstractC4183j0> m18297e();

    @InterfaceC3571o("/v2/push-notifications/mark-category-as-read")
    /* renamed from: f */
    InterfaceC3330b<AbstractC4183j0> m18298f(@InterfaceC3557a C4742b c4742b);

    @InterfaceC3571o("/v2/push-notifications/register-android-native")
    /* renamed from: g */
    InterfaceC3330b<AbstractC4183j0> m18299g(@InterfaceC3557a C4743c c4743c);
}
