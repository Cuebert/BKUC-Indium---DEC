.class final Lcom/android/billingclient/api/z;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private final a:Ln1/j;

.field private final b:Ln1/z;

.field private final c:Ln1/c;

.field private final d:Lcom/android/billingclient/api/n;

.field private e:Z

.field final synthetic f:Lcom/android/billingclient/api/a0;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/a0;Ln1/j;Ln1/c;Lcom/android/billingclient/api/n;Ln1/n0;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/android/billingclient/api/z;->f:Lcom/android/billingclient/api/a0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    iput-object p4, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    iput-object p3, p0, Lcom/android/billingclient/api/z;->c:Ln1/c;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/android/billingclient/api/z;->b:Ln1/z;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/a0;Ln1/z;Lcom/android/billingclient/api/n;Ln1/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/z;->f:Lcom/android/billingclient/api/a0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    iput-object p1, p0, Lcom/android/billingclient/api/z;->c:Ln1/c;

    iput-object p1, p0, Lcom/android/billingclient/api/z;->b:Ln1/z;

    iput-object p3, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    return-void
.end method

.method static bridge synthetic a(Lcom/android/billingclient/api/z;)Ln1/z;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/z;->b:Ln1/z;

    const/4 p0, 0x0

    return-object p0
.end method

.method static bridge synthetic b(Lcom/android/billingclient/api/z;)Ln1/j;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    return-object p0
.end method

.method private final d(Landroid/os/Bundle;Lcom/android/billingclient/api/f;I)V
    .locals 2

    const-string v0, "FAILURE_LOGGING_PAYLOAD"

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    iget-object p2, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p0;->a()Lcom/google/android/gms/internal/play_billing/p0;

    move-result-object p3

    .line 4
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/d4;->z([BLcom/google/android/gms/internal/play_billing/p0;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object p1

    .line 5
    invoke-interface {p2, p1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "BillingBroadcastManager"

    const-string p2, "Failed parsing Api failure."

    .line 6
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    const/16 v0, 0x17

    .line 8
    invoke-static {v0, p3, p2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object p2

    .line 9
    invoke-interface {p1, p2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnprotectedReceiver"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/z;->e:Z

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/z;->f:Lcom/android/billingclient/api/a0;

    invoke-static {v0}, Lcom/android/billingclient/api/a0;->a(Lcom/android/billingclient/api/a0;)Lcom/android/billingclient/api/z;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v0, p2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/z;->f:Lcom/android/billingclient/api/a0;

    invoke-static {v0}, Lcom/android/billingclient/api/a0;->a(Lcom/android/billingclient/api/a0;)Lcom/android/billingclient/api/z;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_0
    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/android/billingclient/api/z;->e:Z

    :cond_1
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "BillingBroadcastManager"

    if-nez p1, :cond_1

    const-string p1, "Bundle is null."

    .line 2
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    const/16 p2, 0xb

    .line 3
    sget-object v1, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 4
    invoke-static {p2, v0, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object p2

    .line 5
    invoke-interface {p1, p2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 6
    invoke-interface {p1, v1, p2}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/play_billing/b0;->d(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object v2

    .line 8
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v3, "INTENT_SOURCE"

    .line 9
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "LAUNCH_BILLING_FLOW"

    const/4 v5, 0x2

    if-eq v3, v4, :cond_3

    if-eqz v3, :cond_2

    .line 10
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x1

    :cond_3
    :goto_0
    const-string v3, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 11
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 12
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/b0;->g(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v2}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    if-nez v0, :cond_4

    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    .line 13
    invoke-static {v5}, Ln1/u;->b(I)Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->a(Lcom/google/android/gms/internal/play_billing/h4;)V

    goto :goto_1

    .line 14
    :cond_4
    invoke-direct {p0, p1, v2, v5}, Lcom/android/billingclient/api/z;->d(Landroid/os/Bundle;Lcom/android/billingclient/api/f;I)V

    .line 15
    :goto_1
    iget-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    .line 16
    invoke-interface {p1, v2, p2}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_5
    const-string v3, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 17
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {v2}, Lcom/android/billingclient/api/f;->b()I

    move-result p2

    if-eqz p2, :cond_6

    .line 18
    invoke-direct {p0, p1, v2, v5}, Lcom/android/billingclient/api/z;->d(Landroid/os/Bundle;Lcom/android/billingclient/api/f;I)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p2

    .line 20
    invoke-interface {p1, v2, p2}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_6
    iget-object p2, p0, Lcom/android/billingclient/api/z;->c:Ln1/c;

    if-nez p2, :cond_7

    const-string p1, "AlternativeBillingListener is null."

    .line 21
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    const/16 p2, 0xf

    .line 22
    sget-object v0, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 23
    invoke-static {p2, v5, v0}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object p2

    .line 24
    invoke-interface {p1, p2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    .line 25
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p2

    .line 26
    invoke-interface {p1, v0, p2}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_7
    const-string p2, "ALTERNATIVE_BILLING_USER_CHOICE_DATA"

    .line 27
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, "Couldn\'t find alternative billing user choice data in bundle."

    .line 28
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    const/16 p2, 0x10

    .line 29
    sget-object v0, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 30
    invoke-static {p2, v5, v0}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object p2

    .line 31
    invoke-interface {p1, p2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p2

    .line 33
    invoke-interface {p1, v0, p2}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_8
    :try_start_0
    new-instance p2, Lcom/android/billingclient/api/b;

    .line 34
    invoke-direct {p2, p1}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    .line 35
    invoke-static {v5}, Ln1/u;->b(I)Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->a(Lcom/google/android/gms/internal/play_billing/h4;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->c:Ln1/c;

    .line 36
    invoke-interface {p1, p2}, Ln1/c;->a(Lcom/android/billingclient/api/b;)V

    return-void

    :catch_0
    new-array p2, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const-string p1, "Error when parsing invalid alternative choice data: [%s]"

    .line 37
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/n;

    const/16 p2, 0x11

    .line 39
    sget-object v0, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 40
    invoke-static {p2, v5, v0}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object p2

    .line 41
    invoke-interface {p1, p2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    iget-object p1, p0, Lcom/android/billingclient/api/z;->a:Ln1/j;

    .line 42
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p2

    .line 43
    invoke-interface {p1, v0, p2}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :cond_9
    return-void
.end method
