.class public Lh8/k;
.super Lh8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh8/a<",
        "Lj8/f;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh8/a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj8/f;

    check-cast p2, Lj8/f;

    invoke-virtual {p0, p1, p2}, Lh8/k;->v(Lj8/f;Lj8/f;)Z

    move-result p1

    return p1
.end method

.method protected j(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "private_message_received"

    return-object p1

    :cond_0
    const-string p1, "private_message_received_cleared"

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

    const-class v0, Lcom/roblox/client/pushnotification/notificationreceivers/PrivateMessageReceivedNotificationReceiver;

    return-object v0
.end method

.method protected m(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

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

    sget v0, Lcom/roblox/client/c0;->W3:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object v2

    check-cast v2, Lj8/f;

    invoke-virtual {v2}, Lj8/f;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->V3:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method protected p()Ljava/lang/String;
    .locals 1

    const-string v0, "PrivateMessageReceived"

    return-object v0
.end method

.method public q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/f;

    .line 2
    invoke-virtual {v0}, Lj8/f;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method protected bridge synthetic s(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lj8/f;

    invoke-virtual {p0, p1, p2}, Lh8/k;->w(Landroid/content/Intent;Lj8/f;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic t(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lj8/f;

    invoke-virtual {p0, p1, p2}, Lh8/k;->x(Landroid/content/Intent;Lj8/f;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public v(Lj8/f;Lj8/f;)Z
    .locals 3

    invoke-virtual {p1}, Lj8/f;->h()J

    move-result-wide v0

    invoke-virtual {p2}, Lj8/f;->h()J

    move-result-wide p1

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected w(Landroid/content/Intent;Lj8/f;)Landroid/content/Intent;
    .locals 4

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const-string v1, "EXTRA_STACKED_NOTIFICATION"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const-string p2, "EXTRA_CATEGORY"

    const-string v0, "PrivateMessageReceived"

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lj8/f;->h()J

    move-result-wide v2

    const-string p2, "EXTRA_CONVERSATION_ID"

    invoke-virtual {p1, p2, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_0
    return-object p1
.end method

.method protected x(Landroid/content/Intent;Lj8/f;)Landroid/content/Intent;
    .locals 0

    return-object p1
.end method
