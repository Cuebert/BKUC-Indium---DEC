.class public Lh8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/m$b;
    }
.end annotation


# static fields
.field private static c:Lh8/m;


# instance fields
.field private a:Landroid/os/Bundle;

.field private b:Lh8/m$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lh8/m$a;

    invoke-direct {v0, p0}, Lh8/m$a;-><init>(Lh8/m;)V

    iput-object v0, p0, Lh8/m;->b:Lh8/m$b;

    return-void
.end method

.method static synthetic a(Lh8/m;Landroid/content/Context;)Lh8/n;
    .locals 0

    invoke-direct {p0, p1}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lh8/m;
    .locals 2

    .line 1
    sget-object v0, Lh8/m;->c:Lh8/m;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lh8/m;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lh8/m;->c:Lh8/m;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lh8/m;

    invoke-direct {v1}, Lh8/m;-><init>()V

    sput-object v1, Lh8/m;->c:Lh8/m;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lh8/m;->c:Lh8/m;

    return-object v0
.end method

.method private d(Ljava/lang/String;Landroid/content/Context;Lh8/r;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    .line 1
    invoke-virtual {p3, p2, p4}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :cond_1
    :goto_0
    return-object v0
.end method

.method private h(Landroid/content/Context;)Lh8/n;
    .locals 1

    invoke-static {}, Lh8/o;->a()Lh8/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/o;->b(Landroid/content/Context;)Lh8/n;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()Landroid/os/Bundle;
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/m;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lh8/m;->a:Landroid/os/Bundle;

    :cond_0
    return-object v0
.end method

.method public e(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lh8/n;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Landroid/content/Context;)Lj8/k;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lh8/n;->a()Lj8/k;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    sget-object p1, Lj8/k;->n:Lj8/k;

    return-object p1
.end method

.method g(Landroid/content/Context;Ljava/lang/String;Lh8/r;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0, p2, p1, p3, p4}, Lh8/m;->d(Ljava/lang/String;Landroid/content/Context;Lh8/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lh8/m;->s(Landroid/content/Context;Ljava/lang/String;Lh8/r;Ljava/lang/String;)V

    return-object v0
.end method

.method public i(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lh8/n;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public j(Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v4, Lh8/r;

    invoke-direct {v4}, Lh8/r;-><init>()V

    .line 2
    invoke-static {p1}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/n;->a()Z

    move-result v2

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidNotifState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "AndroidNotifStatePrefKey"

    .line 4
    invoke-virtual {v4, p1, v0}, Lh8/r;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v4, p1, v0}, Lh8/r;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eq v2, v3, :cond_1

    .line 6
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Different value. Reporting new state: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {v4, p1, v0, v2}, Lh8/r;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    const-string v0, "osSettings"

    .line 8
    invoke-static {v0, v2}, Lcom/roblox/client/f0;->n(Ljava/lang/String;Z)V

    .line 9
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->w0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    new-instance v3, Li8/a;

    invoke-direct {v3}, Li8/a;-><init>()V

    .line 11
    iget-object v5, p0, Lh8/m;->b:Lh8/m$b;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lh8/m;->p(Landroid/content/Context;ZLi8/a;Lh8/r;Lh8/m$b;)V

    :cond_1
    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lh8/m;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(Lj8/l;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lj8/l;->a()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj8/l;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lj8/l;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Lh8/r;

    invoke-direct {v0}, Lh8/r;-><init>()V

    .line 4
    invoke-virtual {p1}, Lj8/l;->a()Landroid/content/Context;

    move-result-object v2

    .line 5
    invoke-direct {p0, v2}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    invoke-interface {v1}, Lh8/n;->c()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lj8/l;->b()Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {p1}, Lj8/l;->c()Z

    move-result v5

    .line 9
    invoke-virtual {p0, v2, v3, v0, v1}, Lh8/m;->g(Landroid/content/Context;Ljava/lang/String;Lh8/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    new-instance v6, Li8/a;

    invoke-direct {v6}, Li8/a;-><init>()V

    iget-object v7, p0, Lh8/m;->b:Lh8/m$b;

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lh8/m;->q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLi8/a;Lh8/m$b;)V

    :cond_0
    return-void
.end method

.method public m(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh8/m;->n(Landroid/content/Context;Z)V

    return-void
.end method

.method public n(Landroid/content/Context;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lh8/m;->o(Landroid/content/Context;ZLh8/n;)V

    :cond_0
    return-void
.end method

.method o(Landroid/content/Context;ZLh8/n;)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Lh8/n;->d(Landroid/content/Context;Z)V

    :cond_0
    return-void
.end method

.method public p(Landroid/content/Context;ZLi8/a;Lh8/r;Lh8/m$b;)V
    .locals 8

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p3}, Li8/a;->a()V

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lh8/m;->h(Landroid/content/Context;)Lh8/n;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_2

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p0, p1, p2}, Lh8/m;->n(Landroid/content/Context;Z)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-interface {p2}, Lh8/n;->c()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0, p1, p4, p2}, Lh8/m;->d(Ljava/lang/String;Landroid/content/Context;Lh8/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_3

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v6, p3

    move-object v7, p5

    .line 7
    invoke-virtual/range {v1 .. v7}, Lh8/m;->q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLi8/a;Lh8/m$b;)V

    :cond_3
    :goto_0
    return-void
.end method

.method q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLi8/a;Lh8/m$b;)V
    .locals 6

    if-eqz p5, :cond_0

    if-eqz p2, :cond_0

    if-eqz p6, :cond_0

    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Li8/a;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLh8/m$b;)V

    :cond_0
    return-void
.end method

.method public r(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lh8/m;->a:Landroid/os/Bundle;

    return-void
.end method

.method s(Landroid/content/Context;Ljava/lang/String;Lh8/r;Ljava/lang/String;)V
    .locals 2

    if-eqz p4, :cond_0

    if-eqz p3, :cond_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p3, p1, p4, p2}, Lh8/r;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
