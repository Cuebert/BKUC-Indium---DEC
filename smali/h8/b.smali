.class public Lh8/b;
.super Lh8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh8/a<",
        "Lj8/b;",
        ">;"
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String; = "key_reply_message"


# instance fields
.field private b:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh8/a;-><init>()V

    .line 2
    iput-wide p1, p0, Lh8/b;->b:J

    return-void
.end method

.method private A(Lj8/b;Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "chat_message_replied"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p1}, Lj8/b;->f()J

    move-result-wide v1

    const-string v3, "EXTRA_CONVERSATION_ID"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 5
    invoke-virtual {p1}, Lj8/b;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_CATEGORY"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p1}, Lj8/b;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_CONVERSATION_TITLE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p1}, Lj8/b;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-virtual {p1}, Lj8/b;->j()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_MESSAGE_ID"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-virtual {p1}, Lj8/b;->f()J

    move-result-wide v1

    long-to-int p1, v1

    const/high16 v1, 0x12000000

    invoke-static {p2, p1, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private F(Landroid/content/Context;Landroidx/core/app/k$e;Ljava/lang/String;Z)Landroidx/core/app/k$e;
    .locals 4

    .line 1
    sget v0, Lcom/roblox/client/c0;->S3:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz p4, :cond_0

    .line 2
    sget p4, Lcom/roblox/client/c0;->R3:I

    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p3, v0, v3

    invoke-static {p4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3
    :cond_0
    invoke-virtual {p2, v0}, Landroidx/core/app/k$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    const/4 p3, 0x0

    .line 4
    invoke-virtual {p2, p3}, Landroidx/core/app/k$e;->t(Landroid/graphics/Bitmap;)Landroidx/core/app/k$e;

    .line 5
    sget p3, Lcom/roblox/client/c0;->Q3:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/app/k$e;->o(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 6
    new-instance p1, Landroidx/core/app/k$c;

    invoke-direct {p1}, Landroidx/core/app/k$c;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/core/app/k$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Landroidx/core/app/k$e;->B(Landroidx/core/app/k$g;)Landroidx/core/app/k$e;

    return-object p2
.end method

.method private v(Landroid/content/Context;Landroidx/core/app/k$e;)Landroidx/core/app/k$e;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    sget v0, Lcom/roblox/client/c0;->P3:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/core/app/p$d;

    sget-object v2, Lh8/b;->c:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroidx/core/app/p$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroidx/core/app/p$d;->b(Ljava/lang/CharSequence;)Landroidx/core/app/p$d;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/app/p$d;->a()Landroidx/core/app/p;

    move-result-object v1

    .line 4
    new-instance v2, Landroidx/core/app/k$a$a;

    sget v3, Lcom/roblox/client/x;->b:I

    .line 5
    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object v4

    check-cast v4, Lj8/b;

    invoke-direct {p0, v4, p1}, Lh8/b;->A(Lj8/b;Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-direct {v2, v3, v0, p1}, Landroidx/core/app/k$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 6
    invoke-virtual {v2, v1}, Landroidx/core/app/k$a$a;->a(Landroidx/core/app/p;)Landroidx/core/app/k$a$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/core/app/k$a$a;->d(Z)Landroidx/core/app/k$a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/k$a$a;->b()Landroidx/core/app/k$a;

    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Landroidx/core/app/k$e;->b(Landroidx/core/app/k$a;)Landroidx/core/app/k$e;

    :cond_0
    return-object p2
.end method

.method private w(Lj8/b;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lj8/b;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OneToOneConversation"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lj8/b;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj8/b;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lj8/b;->i()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private x(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj8/b;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x0

    if-lez p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_2

    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8/b;

    .line 4
    instance-of v3, v2, Lj8/a;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    .line 5
    invoke-direct {p0, v2}, Lh8/b;->w(Lj8/b;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 6
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v2}, Lh8/b;->w(Lj8/b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private y()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object v0

    check-cast v0, Lj8/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v0}, Lh8/b;->w(Lj8/b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static z(Landroid/content/Intent;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/core/app/p;->j(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    sget-object v0, Lh8/b;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public B(Lj8/b;Lj8/b;)Z
    .locals 0

    invoke-virtual {p1}, Lj8/b;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lj8/b;->j()Ljava/lang/String;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected C(Landroid/content/Intent;Lj8/b;)Landroid/content/Intent;
    .locals 3

    .line 1
    iget-wide v0, p0, Lh8/b;->b:J

    const-string v2, "EXTRA_CONVERSATION_ID"

    invoke-virtual {p1, v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 2
    invoke-virtual {p2}, Lj8/b;->e()Ljava/lang/String;

    move-result-object p2

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method protected D(Landroid/content/Intent;Lj8/b;)Landroid/content/Intent;
    .locals 3

    .line 1
    iget-wide v0, p0, Lh8/b;->b:J

    const-string v2, "EXTRA_CONVERSATION_ID"

    invoke-virtual {p1, v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 2
    invoke-virtual {p2}, Lj8/b;->e()Ljava/lang/String;

    move-result-object p2

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method public E(Landroid/content/Context;Lj8/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    const-string v1, "FAILURE_NOTIFICATION_ID"

    invoke-virtual {v0, v1}, Lj8/e;->p(Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lh8/a;->c(Landroid/content/Context;Lj8/m;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj8/b;

    check-cast p2, Lj8/b;

    invoke-virtual {p0, p1, p2}, Lh8/b;->B(Lj8/b;Lj8/b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic c(Landroid/content/Context;Lj8/m;)V
    .locals 0

    check-cast p2, Lj8/b;

    invoke-virtual {p0, p1, p2}, Lh8/b;->E(Landroid/content/Context;Lj8/b;)V

    return-void
.end method

.method protected g(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Landroidx/core/app/k$e;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lh8/a;->g(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Landroidx/core/app/k$e;

    move-result-object p2

    .line 2
    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object p3

    check-cast p3, Lj8/b;

    .line 3
    instance-of v0, p3, Lj8/a;

    if-eqz v0, :cond_0

    .line 4
    move-object v0, p3

    check-cast v0, Lj8/a;

    invoke-virtual {v0}, Lj8/a;->o()Z

    move-result v0

    .line 5
    invoke-virtual {p3}, Lj8/b;->g()Ljava/lang/String;

    move-result-object p3

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Lh8/b;->F(Landroid/content/Context;Landroidx/core/app/k$e;Ljava/lang/String;Z)Landroidx/core/app/k$e;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_0
    invoke-direct {p0}, Lh8/b;->y()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/core/app/k$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 8
    invoke-direct {p0, p1, p2}, Lh8/b;->v(Landroid/content/Context;Landroidx/core/app/k$e;)Landroidx/core/app/k$e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected j(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "chat_message_received"

    return-object p1

    :cond_0
    const-string p1, "chat_message_cleared"

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

    const-class v0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;

    return-object v0
.end method

.method protected m(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Lh8/a;->a:Lj8/e;

    invoke-direct {p0, p1}, Lh8/b;->x(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n()I
    .locals 2

    iget-wide v0, p0, Lh8/b;->b:J

    long-to-int v1, v0

    return v1
.end method

.method protected o(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object p1

    check-cast p1, Lj8/b;

    invoke-virtual {p1}, Lj8/b;->g()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected p()Ljava/lang/String;
    .locals 1

    const-string v0, "ChatNewMessage"

    return-object v0
.end method

.method public q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/b;

    .line 2
    invoke-virtual {v0}, Lj8/b;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method protected bridge synthetic s(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lj8/b;

    invoke-virtual {p0, p1, p2}, Lh8/b;->C(Landroid/content/Intent;Lj8/b;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic t(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lj8/b;

    invoke-virtual {p0, p1, p2}, Lh8/b;->D(Landroid/content/Intent;Lj8/b;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
