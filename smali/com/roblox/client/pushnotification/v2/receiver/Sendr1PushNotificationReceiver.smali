.class public Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;
.super Lcom/roblox/client/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/l0;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->n(Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->g(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->d(Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method private d(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->h(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-direct {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->i(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {v0, v1, p1, p2}, Lcom/roblox/client/f0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 9

    .line 1
    new-instance v0, Lh8/r;

    invoke-direct {v0}, Lh8/r;-><init>()V

    const-string v1, "GcmPlatform"

    .line 2
    invoke-virtual {v0, p2, v1}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-direct {p0, p3}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->h(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-direct {p0, p3}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-static {p2}, Lc9/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-direct {p0, p3}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->i(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v8

    move-object v2, p1

    move v7, p4

    .line 7
    invoke-static/range {v2 .. v8}, Lcom/roblox/client/f0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method private f(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private g(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private h(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private i(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private j(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->f()Z

    move-result v0

    const-string v1, "rbx.push"

    if-eqz v0, :cond_1

    const-string v0, "loadTheApp: (v2) ...(logged in) launch Main."

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance v1, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;-><init>(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    .line 5
    sget p1, Lcom/roblox/client/i0;->R:I

    if-nez p1, :cond_0

    const/16 p1, 0x3e8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    int-to-long p1, p1

    .line 6
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_1
    const-string v0, "loadTheApp: (v2) ...(not logged in) launch Splash."

    .line 7
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    sget-object v0, Lw8/o;->x:Lw8/o;

    invoke-static {p1, v0}, Lcom/roblox/client/startup/ActivitySplash;->C1(Landroid/content/Context;Lw8/o;)Landroid/content/Intent;

    move-result-object v0

    .line 9
    invoke-direct {p0, v0, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->n(Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 11
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v2

    invoke-virtual {v2, v1}, Lh8/m;->r(Landroid/os/Bundle;)V

    :cond_2
    const v1, 0x10008000

    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    invoke-direct {p0, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->g(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 15
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object p1

    invoke-virtual {p1, v1}, Lla/c;->e(Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->d(Landroid/content/Intent;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private k(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method private l(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->j(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0, p2, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->k(Landroid/content/Intent;Landroid/content/Context;)V

    const-string v0, "clicked"

    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, p1, p2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method

.method private m(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cleared notifications of type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->h(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "dismissed"

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method

.method private n(Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    .line 2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Lcom/roblox/client/l0;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    sget-object v1, Lx7/b$d;->o:Lx7/b$d;

    invoke-virtual {v0, p1, v1}, Lx7/b;->k(Landroid/content/Context;Lx7/b$d;)V

    .line 3
    invoke-static {p1}, Lw8/d;->l(Landroid/content/Context;)V

    .line 4
    invoke-static {p1}, Lh7/b;->e(Landroid/content/Context;)V

    if-eqz p2, :cond_1

    const-string v0, "EXTRA_INTENT_ACTION_TYPE_CODE"

    const/4 v1, -0x1

    .line 5
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->m(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->l(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method
