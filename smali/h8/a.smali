.class public abstract Lh8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/i;
.implements Lj8/e$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lj8/m;",
        ">",
        "Ljava/lang/Object;",
        "Lh8/i<",
        "TT;>;",
        "Lj8/e$a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected a:Lj8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj8/e<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lj8/e;

    invoke-direct {v0}, Lj8/e;-><init>()V

    iput-object v0, p0, Lh8/a;->a:Lj8/e;

    .line 3
    invoke-virtual {v0, p0}, Lj8/e;->r(Lj8/e$a;)V

    return-void
.end method

.method private h(Landroid/content/Context;Lj8/m;)Landroid/app/PendingIntent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/content/Intent;

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lh8/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    const-class v2, Lcom/roblox/client/startup/ActivitySplash;

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 3
    sget-object v2, Lw8/o;->x:Lw8/o;

    const-string v3, "STARTED_FOR_INTENT_KEY"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0, p2}, Lh8/a;->s(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;

    move-result-object v0

    .line 5
    invoke-interface {p2}, Lj8/m;->b()Ljava/lang/String;

    move-result-object p2

    const-string v2, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "EXTRA_INTENT_ACTION_TYPE_CODE"

    .line 6
    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0}, Lh8/a;->p()Ljava/lang/String;

    move-result-object p2

    const-string v1, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0}, Lh8/a;->n()I

    move-result p2

    const/high16 v1, 0x12000000

    invoke-static {p1, p2, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0, p2}, Lj8/e;->p(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {p2}, Ljava/util/Vector;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p0}, Lh8/a;->n()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh8/a;->f(Landroid/content/Context;I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 4
    invoke-virtual {p0, p1, p2}, Lh8/a;->e(Landroid/content/Context;Z)V

    :goto_0
    return-void
.end method

.method public c(Landroid/content/Context;Lj8/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0, p2}, Lj8/e;->o(Lj8/m;)V

    .line 2
    invoke-virtual {p0}, Lh8/a;->r()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh8/a;->e(Landroid/content/Context;Z)V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    return-void
.end method

.method public d(Landroid/content/Context;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0, p2, p3}, Lj8/e;->q(J)V

    .line 2
    iget-object p2, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {p2}, Ljava/util/Vector;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p0}, Lh8/a;->n()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh8/a;->f(Landroid/content/Context;I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 4
    invoke-virtual {p0, p1, p2}, Lh8/a;->e(Landroid/content/Context;Z)V

    :goto_0
    return-void
.end method

.method protected e(Landroid/content/Context;Z)V
    .locals 8

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lh8/a$a;

    invoke-virtual {p0}, Lh8/a;->q()J

    move-result-wide v4

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v1 .. v7}, Lh8/a$a;-><init>(Lh8/a;Landroid/content/Context;JLandroid/content/Context;Z)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    :goto_0
    return-void
.end method

.method protected f(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "notification"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_0
    return-void
.end method

.method protected g(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Landroidx/core/app/k$e;
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/app/k$e;

    const-string v1, "channel_general"

    invoke-direct {v0, p1, v1}, Landroidx/core/app/k$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lh8/a;->h(Landroid/content/Context;Lj8/m;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->m(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 4
    invoke-virtual {p0}, Lh8/a;->l()Lj8/m;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lh8/a;->i(Landroid/content/Context;Lj8/m;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->q(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 6
    sget v1, Lcom/roblox/client/x;->v:I

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->z(I)Landroidx/core/app/k$e;

    .line 7
    invoke-virtual {p0, p1}, Lh8/a;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->g(Z)Landroidx/core/app/k$e;

    .line 9
    invoke-virtual {p0, p1}, Lh8/a;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->o(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 10
    iget-object v1, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->w(I)Landroidx/core/app/k$e;

    .line 11
    invoke-virtual {v0, p3}, Landroidx/core/app/k$e;->t(Landroid/graphics/Bitmap;)Landroidx/core/app/k$e;

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    .line 12
    invoke-static {p2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroidx/core/app/k$e;->A(Landroid/net/Uri;)Landroidx/core/app/k$e;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 13
    invoke-virtual {v0, p2}, Landroidx/core/app/k$e;->A(Landroid/net/Uri;)Landroidx/core/app/k$e;

    .line 14
    :goto_0
    new-instance p2, Landroidx/core/app/k$c;

    invoke-direct {p2}, Landroidx/core/app/k$c;-><init>()V

    invoke-virtual {p0, p1}, Lh8/a;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/app/k$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroidx/core/app/k$e;->B(Landroidx/core/app/k$g;)Landroidx/core/app/k$e;

    return-object v0
.end method

.method protected i(Landroid/content/Context;Lj8/m;)Landroid/app/PendingIntent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/content/Intent;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lh8/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lh8/a;->k()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0, p2}, Lh8/a;->t(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lh8/a;->p()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "EXTRA_INTENT_ACTION_TYPE_CODE"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 6
    invoke-interface {p2}, Lj8/m;->b()Ljava/lang/String;

    move-result-object p2

    const-string v1, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0}, Lh8/a;->n()I

    move-result p2

    const/high16 v1, 0x12000000

    invoke-static {p1, p2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method protected abstract j(I)Ljava/lang/String;
.end method

.method protected abstract k()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method protected l()Lj8/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/m;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract m(Landroid/content/Context;)Ljava/lang/String;
.end method

.method protected abstract n()I
.end method

.method protected o(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget v0, Lcom/roblox/client/c0;->g3:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected abstract p()Ljava/lang/String;
.end method

.method protected abstract q()J
.end method

.method public r()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v2, 0x2

    if-gt v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method protected abstract s(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "TT;)",
            "Landroid/content/Intent;"
        }
    .end annotation
.end method

.method protected abstract t(Landroid/content/Intent;Lj8/m;)Landroid/content/Intent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "TT;)",
            "Landroid/content/Intent;"
        }
    .end annotation
.end method

.method protected u(Landroid/content/Context;Landroidx/core/app/k$e;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p2

    const-string v0, "notification"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 3
    invoke-virtual {p0}, Lh8/a;->n()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method
