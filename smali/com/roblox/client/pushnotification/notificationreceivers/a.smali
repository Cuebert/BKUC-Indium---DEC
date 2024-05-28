.class public abstract Lcom/roblox/client/pushnotification/notificationreceivers/a;
.super Lcom/roblox/client/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/l0;-><init>()V

    return-void
.end method

.method protected static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lh7/o;

    invoke-direct {v0}, Lh7/o;-><init>()V

    invoke-virtual {v0, p0, p1}, Lh7/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method protected static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lh7/n;

    invoke-direct {v0}, Lh7/n;-><init>()V

    invoke-virtual {v0, p0, p1, p2}, Lh7/n;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static j(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 4

    const-string v0, "EXTRA_STACKED_NOTIFICATION"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "rbx.push"

    const-string v2, "EXTRA_NOTIFICATION_ID"

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "marking single notification as read with id: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->h(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "marking stacked notifications as read with last id: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "EXTRA_NOTIFICATION_TYPE"

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "EXTRA_CATEGORY"

    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 8
    invoke-static {p1, v0, p0}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "notification"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 2
    invoke-virtual {p1, p2}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/p;->d(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    invoke-interface {p1}, Lh8/i;->clear()V

    return-void
.end method

.method protected c(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method protected d(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 11

    move-object v0, p3

    .line 1
    new-instance v1, Lh8/r;

    invoke-direct {v1}, Lh8/r;-><init>()V

    const-string v2, "GcmPlatform"

    move-object v3, p2

    invoke-virtual {v1, p2, v2}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "EXTRA_NOTIFICATION_ID"

    .line 2
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-virtual {p0, p3}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v10

    move-object v3, p1

    move-object/from16 v5, p7

    move-object v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    .line 3
    invoke-static/range {v3 .. v10}, Lcom/roblox/client/f0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method protected e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V
    .locals 9

    .line 1
    new-instance v0, Lh8/r;

    invoke-direct {v0}, Lh8/r;-><init>()V

    const-string v1, "GcmPlatform"

    invoke-virtual {v0, p2, v1}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "EXTRA_NOTIFICATION_ID"

    .line 2
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Lc9/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, p3}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v8

    move-object v2, p1

    move-object v4, p5

    move v7, p4

    .line 3
    invoke-static/range {v2 .. v8}, Lcom/roblox/client/f0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method protected f(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_VERSION"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string p1, "0"

    :cond_1
    return-object p1
.end method

.method protected g(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->f()Z

    move-result v0

    const-string v1, "rbx.push"

    if-eqz v0, :cond_0

    const-string v0, "loadTheApp: ...(logged in) launch Main."

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/n;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 4
    invoke-virtual {p0, p1, v0, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->n(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    const/high16 v0, 0x10000000

    .line 5
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    const-string v0, "loadTheApp: ...(not logged in) launch Splash."

    .line 6
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    sget-object v0, Lw8/o;->x:Lw8/o;

    invoke-static {p1, v0}, Lcom/roblox/client/startup/ActivitySplash;->C1(Landroid/content/Context;Lw8/o;)Landroid/content/Intent;

    move-result-object v0

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->n(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    const v0, 0x10008000

    .line 9
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 10
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh8/m;->r(Landroid/os/Bundle;)V

    .line 12
    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected k(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->b(Ljava/lang/String;)V

    const-string p1, "EXTRA_NOTIFICATION_ID"

    .line 2
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    invoke-static {p2}, Lc9/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "actionTaken"

    const/4 v6, 0x1

    const-string v7, "FriendRequestReceived"

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->d(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method protected l(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notification of type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " clicked"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->g(Landroid/content/Context;Landroid/content/Intent;)V

    .line 4
    invoke-virtual {p0, v6}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->b(Ljava/lang/String;)V

    .line 5
    invoke-static {p2, p1}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->j(Landroid/content/Intent;Landroid/content/Context;)V

    const-string v2, "clicked"

    const/4 v5, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    .line 6
    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    return-void
.end method

.method protected m(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cleared notifications of type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0, v6}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->b(Ljava/lang/String;)V

    const-string v2, "dismissed"

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    .line 4
    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    return-void
.end method

.method protected abstract n(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
.end method

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->m(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->l(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method
