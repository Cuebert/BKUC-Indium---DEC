.class Lk8/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lba/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk8/d;->g(Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Landroid/content/Context;

.field final synthetic p:Landroid/app/Notification;

.field final synthetic q:Z

.field final synthetic r:Ll8/c;

.field final synthetic s:Lk8/d;


# direct methods
.method constructor <init>(Lk8/d;Ljava/lang/String;Landroid/content/Context;Landroid/app/Notification;ZLl8/c;)V
    .locals 0

    iput-object p1, p0, Lk8/d$c;->s:Lk8/d;

    iput-object p2, p0, Lk8/d$c;->n:Ljava/lang/String;

    iput-object p3, p0, Lk8/d$c;->o:Landroid/content/Context;

    iput-object p4, p0, Lk8/d$c;->p:Landroid/app/Notification;

    iput-boolean p5, p0, Lk8/d$c;->q:Z

    iput-object p6, p0, Lk8/d$c;->r:Ll8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public K(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/d$c;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lba/g;->x(Lba/g$a;)V

    :cond_0
    return-void
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/d$c;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lba/g;->x(Lba/g$a;)V

    :cond_0
    return-void
.end method

.method public g0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk8/d$c;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    const-string v0, "Miss"

    .line 2
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "missed"

    goto :goto_0

    :cond_0
    const-string v0, "Suppress"

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lk8/d$c;->q:Z

    if-nez p2, :cond_1

    const-string p1, "voice not enabled"

    .line 4
    :cond_1
    :goto_0
    iget-object p2, p0, Lk8/d$c;->r:Ll8/c;

    invoke-interface {p2}, Ll8/c;->w()Ljava/util/Map;

    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll8/c;

    if-eqz p1, :cond_2

    .line 6
    iget-object p2, p0, Lk8/d$c;->s:Lk8/d;

    iget-object v0, p0, Lk8/d$c;->o:Landroid/content/Context;

    invoke-static {p2, v0, p1}, Lk8/d;->c(Lk8/d;Landroid/content/Context;Ll8/c;)Landroidx/core/app/k$e;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p2

    .line 7
    iget-object v0, p0, Lk8/d$c;->o:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v0

    .line 8
    invoke-interface {p1}, Ll8/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll8/c;->i()I

    move-result p1

    invoke-virtual {v0, v1, p1, p2}, Landroidx/core/app/n;->e(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 9
    :cond_2
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lba/g;->x(Lba/g$a;)V

    :cond_3
    return-void
.end method

.method public p(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/d$c;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p0, Lk8/d$c;->o:Landroid/content/Context;

    iget-object p2, p0, Lk8/d$c;->n:Ljava/lang/String;

    iget-object v0, p0, Lk8/d$c;->p:Landroid/app/Notification;

    invoke-static {p1, p2, v0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->d(Landroid/content/Context;Ljava/lang/String;Landroid/app/Notification;)Landroid/content/Intent;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lk8/d$c;->o:Landroid/content/Context;

    invoke-static {p2, p1}, Landroidx/core/content/a;->k(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
