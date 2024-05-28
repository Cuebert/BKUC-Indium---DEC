.class public Lh8/f;
.super Lh8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh8/a<",
        "Lj8/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh8/a;-><init>()V

    return-void
.end method

.method private v(Landroid/content/Context;Landroidx/core/app/k$e;Lj8/d;)Landroidx/core/app/k$e;
    .locals 3

    .line 1
    sget v0, Lcom/roblox/client/x;->a:I

    sget v1, Lcom/roblox/client/c0;->N3:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "friend_request_received_accepted"

    invoke-direct {p0, p3, p1, v2}, Lh8/f;->y(Lj8/d;Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {p2, v0, v1, v2}, Landroidx/core/app/k$e;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 2
    sget v0, Lcom/roblox/client/x;->r:I

    sget v1, Lcom/roblox/client/c0;->O3:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "friend_request_received_ignored"

    invoke-direct {p0, p3, p1, v2}, Lh8/f;->y(Lj8/d;Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Landroidx/core/app/k$e;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    return-object p2
.end method

.method private w(Lj8/d;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lj8/d;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private y(Lj8/d;Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {v0, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p1}, Lj8/d;->e()J

    move-result-wide v1

    const-string p3, "EXTRA_NOTIFICATION_USER_ID"

    invoke-virtual {v0, p3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 4
    invoke-virtual {p1}, Lj8/d;->b()Ljava/lang/String;

    move-result-object p1

    const-string p3, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {v0, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x0

    const/high16 p3, 0x12000000

    .line 5
    invoke-static {p2, p1, v0, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected A(Landroid/content/Intent;Lj8/d;)Landroid/content/Intent;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj8/d;

    check-cast p2, Lj8/d;

    invoke-virtual {p0, p1, p2}, Lh8/f;->x(Lj8/d;Lj8/d;)Z

    move-result p1

    return p1
.end method

.method protected j(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "friend_request_received"

    return-object p1

    :cond_0
    const-string p1, "friend_request_received_cleared"

    return-object p1
.end method

.method protected k()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-class v0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    return-object v0
.end method

.method protected m(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->c4:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v3, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8/d;

    invoke-direct {p0, v2}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->b4:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj8/d;

    invoke-direct {p0, v4}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    iget-object v1, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v1, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj8/d;

    invoke-direct {p0, v1}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v4, 0x3

    if-ne v0, v4, :cond_2

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->Z3:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj8/d;

    invoke-direct {p0, v4}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    iget-object v1, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v1, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj8/d;

    invoke-direct {p0, v1}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-le v0, v4, :cond_3

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->U3:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj8/d;

    invoke-direct {p0, v4}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    iget-object v1, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v1, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj8/d;

    invoke-direct {p0, v1}, Lh8/f;->w(Lj8/d;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected p()Ljava/lang/String;
    .locals 1

    const-string v0, "FriendRequestReceived"

    return-object v0
.end method

.method protected q()J
    .locals 2

    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/d;

    invoke-virtual {v0}, Lj8/d;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method protected bridge synthetic s(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lj8/d;

    invoke-virtual {p0, p1, p2}, Lh8/f;->z(Landroid/content/Intent;Lj8/d;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic t(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lj8/d;

    invoke-virtual {p0, p1, p2}, Lh8/f;->A(Landroid/content/Intent;Lj8/d;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method protected u(Landroid/content/Context;Landroidx/core/app/k$e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/d;

    invoke-direct {p0, p1, p2, v0}, Lh8/f;->v(Landroid/content/Context;Landroidx/core/app/k$e;Lj8/d;)Landroidx/core/app/k$e;

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p2

    const-string v0, "notification"

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 6
    invoke-virtual {p1, v2, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_1
    return-void
.end method

.method public x(Lj8/d;Lj8/d;)Z
    .locals 3

    invoke-virtual {p1}, Lj8/d;->e()J

    move-result-wide v0

    invoke-virtual {p2}, Lj8/d;->e()J

    move-result-wide p1

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected z(Landroid/content/Intent;Lj8/d;)Landroid/content/Intent;
    .locals 4

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const-string v1, "EXTRA_STACKED_NOTIFICATION"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const-string p2, "EXTRA_CATEGORY"

    const-string v0, "FriendRequestReceived"

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lj8/d;->e()J

    move-result-wide v2

    const-string p2, "EXTRA_NOTIFICATION_USER_ID"

    invoke-virtual {p1, p2, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_0
    return-object p1
.end method
