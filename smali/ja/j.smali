.class public Lja/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja/j$a;,
        Lja/j$b;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String; = "j"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lja/j$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lja/j;->l(Lja/j$b;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lja/j$b;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lja/j;->i(Lja/j$b;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic c(Lja/j$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lja/j;->j(Lja/j$b;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Landroidx/activity/result/b;Lja/j$b;Landroid/app/PendingIntent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lja/j;->k(Landroidx/activity/result/b;Lja/j$b;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public static f()Lja/j;
    .locals 1

    invoke-static {}, Lja/j$a;->a()Lja/j;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic i(Lja/j$b;Ljava/lang/Void;)V
    .locals 0

    invoke-interface {p0}, Lja/j$b;->onSuccess()V

    return-void
.end method

.method private static synthetic j(Lja/j$b;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    sget-object v0, Lja/j;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SignInClient not available: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_not_available"

    .line 2
    invoke-interface {p0, p1}, Lja/j$b;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic k(Landroidx/activity/result/b;Lja/j$b;Landroid/app/PendingIntent;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p2

    .line 2
    new-instance v0, Landroidx/activity/result/IntentSenderRequest$b;

    invoke-direct {v0, p2}, Landroidx/activity/result/IntentSenderRequest$b;-><init>(Landroid/content/IntentSender;)V

    invoke-virtual {v0}, Landroidx/activity/result/IntentSenderRequest$b;->a()Landroidx/activity/result/IntentSenderRequest;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/activity/result/b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 3
    sget-object p2, Lja/j;->a:Ljava/lang/String;

    const-string v0, "Error occurred in launching Activity result"

    invoke-static {p2, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p0, "google_auth_api_error"

    .line 4
    invoke-interface {p1, p0}, Lja/j$b;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private static synthetic l(Lja/j$b;Ljava/lang/Exception;)V
    .locals 1

    const-string p1, "Failure occurred"

    const-string v0, "Failure getting phone number"

    .line 1
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_error"

    .line 2
    invoke-interface {p0, p1}, Lja/j$b;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lq2/b;->c(Landroid/content/Context;)Lq2/c;

    move-result-object p1

    .line 2
    invoke-interface {p1, p2}, Lq2/c;->i(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    sget-object p2, Lja/j;->a:Ljava/lang/String;

    const-string v0, "Phone Number Hint failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    return-object p1
.end method

.method public g(Landroid/content/Context;Lja/j$b;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/a;->o()Lcom/google/android/gms/common/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0, p1, v0, p2}, Lja/j;->h(Landroid/content/Context;Lcom/google/android/gms/common/a;Lja/j$b;)V

    return-void
.end method

.method h(Landroid/content/Context;Lcom/google/android/gms/common/a;Lja/j$b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lja/j;->a:Ljava/lang/String;

    const-string p2, "Telephony is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "telephony_not_available"

    .line 3
    invoke-interface {p3, p1}, Lja/j$b;->a(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/a;->g(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object p1, Lja/j;->a:Ljava/lang/String;

    const-string p2, "GooglePlayServices is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_play_services_not_available"

    .line 6
    invoke-interface {p3, p1}, Lja/j$b;->a(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lq2/b;->c(Landroid/content/Context;)Lq2/c;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Lx2/g;

    .line 8
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/common/a;->l(Lx2/g;[Lx2/g;)Lg4/l;

    move-result-object p1

    new-instance p2, Lja/i;

    invoke-direct {p2, p3}, Lja/i;-><init>(Lja/j$b;)V

    .line 9
    invoke-virtual {p1, p2}, Lg4/l;->f(Lg4/h;)Lg4/l;

    move-result-object p1

    new-instance p2, Lja/g;

    invoke-direct {p2, p3}, Lja/g;-><init>(Lja/j$b;)V

    .line 10
    invoke-virtual {p1, p2}, Lg4/l;->d(Lg4/g;)Lg4/l;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    sget-object p2, Lja/j;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error checking api availability: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_error"

    .line 12
    invoke-interface {p3, p1}, Lja/j$b;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public m(Landroid/content/Context;Landroidx/activity/result/b;Lja/j$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/activity/result/b<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;",
            "Lja/j$b;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lja/j;->a:Ljava/lang/String;

    const-string v1, "Requesting phone number hint"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;->x()Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest$a;->a()Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lq2/b;->c(Landroid/content/Context;)Lq2/c;

    move-result-object p1

    .line 4
    invoke-interface {p1, v0}, Lq2/c;->b(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)Lg4/l;

    move-result-object p1

    new-instance v0, Lja/h;

    invoke-direct {v0, p2, p3}, Lja/h;-><init>(Landroidx/activity/result/b;Lja/j$b;)V

    .line 5
    invoke-virtual {p1, v0}, Lg4/l;->f(Lg4/h;)Lg4/l;

    move-result-object p1

    new-instance p2, Lja/f;

    invoke-direct {p2, p3}, Lja/f;-><init>(Lja/j$b;)V

    .line 6
    invoke-virtual {p1, p2}, Lg4/l;->d(Lg4/g;)Lg4/l;

    return-void
.end method
