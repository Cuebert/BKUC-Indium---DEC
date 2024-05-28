.class public final Ly3/f7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static j:Ly3/z7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly3/z7<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ly3/e7;

.field private final d:Lg6/n;

.field private final e:Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg4/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg4/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/String;

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ly3/y4;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ly3/y4;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg6/n;Ly3/e7;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    .line 1
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ly3/f7;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ly3/f7;->i:Ljava/util/Map;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ly3/f7;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lg6/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly3/f7;->b:Ljava/lang/String;

    iput-object p2, p0, Ly3/f7;->d:Lg6/n;

    iput-object p3, p0, Ly3/f7;->c:Ly3/e7;

    iput-object p4, p0, Ly3/f7;->g:Ljava/lang/String;

    .line 5
    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object p1

    new-instance p3, Ly3/d7;

    invoke-direct {p3, p4}, Ly3/d7;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, p3}, Lg6/g;->b(Ljava/util/concurrent/Callable;)Lg4/l;

    move-result-object p1

    iput-object p1, p0, Ly3/f7;->e:Lg4/l;

    .line 7
    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Ly3/c7;

    invoke-direct {p3, p2}, Ly3/c7;-><init>(Lg6/n;)V

    invoke-virtual {p1, p3}, Lg6/g;->b(Ljava/util/concurrent/Callable;)Lg4/l;

    move-result-object p1

    iput-object p1, p0, Ly3/f7;->f:Lg4/l;

    return-void
.end method

.method private static declared-synchronized c()Ly3/z7;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly3/z7<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Ly3/f7;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly3/f7;->j:Ly3/z7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    .line 1
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/os/c;->a(Landroid/content/res/Configuration;)Landroidx/core/os/f;

    move-result-object v1

    new-instance v2, Ly3/w7;

    .line 2
    invoke-direct {v2}, Ly3/w7;-><init>()V

    const/4 v3, 0x0

    .line 3
    :goto_0
    invoke-virtual {v1}, Landroidx/core/os/f;->d()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 4
    invoke-virtual {v1, v3}, Landroidx/core/os/f;->c(I)Ljava/util/Locale;

    move-result-object v4

    .line 5
    invoke-static {v4}, Lg6/c;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ly3/w7;->c(Ljava/lang/Object;)Ly3/w7;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v2}, Ly3/w7;->d()Ly3/z7;

    move-result-object v1

    sput-object v1, Ly3/f7;->j:Ly3/z7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final synthetic a(Ly3/g7;Ly3/y4;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Ly3/g7;->d(Ly3/y4;)Ly3/g7;

    .line 2
    invoke-virtual {p1}, Ly3/g7;->a()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ly3/n6;

    invoke-direct {v0}, Ly3/n6;-><init>()V

    iget-object v1, p0, Ly3/f7;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Ly3/n6;->b(Ljava/lang/String;)Ly3/n6;

    iget-object v1, p0, Ly3/f7;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Ly3/n6;->c(Ljava/lang/String;)Ly3/n6;

    .line 5
    invoke-static {}, Ly3/f7;->c()Ly3/z7;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly3/n6;->h(Ly3/z7;)Ly3/n6;

    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly3/n6;->g(Ljava/lang/Boolean;)Ly3/n6;

    .line 7
    invoke-virtual {v0, p2}, Ly3/n6;->k(Ljava/lang/String;)Ly3/n6;

    .line 8
    invoke-virtual {v0, p3}, Ly3/n6;->j(Ljava/lang/String;)Ly3/n6;

    iget-object p2, p0, Ly3/f7;->f:Lg4/l;

    .line 9
    invoke-virtual {p2}, Lg4/l;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Ly3/f7;->f:Lg4/l;

    .line 10
    invoke-virtual {p2}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    .line 11
    :cond_0
    iget-object p2, p0, Ly3/f7;->d:Lg6/n;

    .line 12
    invoke-virtual {p2}, Lg6/n;->a()Ljava/lang/String;

    move-result-object p2

    .line 13
    :goto_0
    invoke-virtual {v0, p2}, Ly3/n6;->i(Ljava/lang/String;)Ly3/n6;

    const/16 p2, 0xa

    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ly3/n6;->d(Ljava/lang/Integer;)Ly3/n6;

    .line 15
    invoke-virtual {p1, v0}, Ly3/g7;->e(Ly3/n6;)Ly3/g7;

    iget-object p2, p0, Ly3/f7;->c:Ly3/e7;

    .line 16
    invoke-interface {p2, p1}, Ly3/e7;->a(Ly3/g7;)V

    return-void
.end method

.method public final b(Ly3/q7;Ly3/y4;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Ly3/f7;->h:Ljava/util/Map;

    .line 2
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v2, p0, Ly3/f7;->h:Ljava/util/Map;

    .line 4
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v2, v0, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1e

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    return-void

    .line 5
    :cond_1
    :goto_0
    iget-object v2, p0, Ly3/f7;->h:Ljava/util/Map;

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, Ly3/q7;->a:I

    iget v1, p1, Ly3/q7;->b:I

    iget v2, p1, Ly3/q7;->c:I

    iget v3, p1, Ly3/q7;->d:I

    iget v4, p1, Ly3/q7;->e:I

    iget-wide v5, p1, Ly3/q7;->f:J

    iget p1, p1, Ly3/q7;->g:I

    new-instance v7, Ly3/r4;

    invoke-direct {v7}, Ly3/r4;-><init>()V

    const/4 v8, -0x1

    if-eq v0, v8, :cond_6

    const/16 v8, 0x23

    if-eq v0, v8, :cond_5

    const v8, 0x32315659

    if-eq v0, v8, :cond_4

    const/16 v8, 0x10

    if-eq v0, v8, :cond_3

    const/16 v8, 0x11

    if-eq v0, v8, :cond_2

    .line 7
    sget-object v0, Ly3/m4;->o:Ly3/m4;

    goto :goto_1

    .line 8
    :cond_2
    sget-object v0, Ly3/m4;->q:Ly3/m4;

    goto :goto_1

    .line 9
    :cond_3
    sget-object v0, Ly3/m4;->p:Ly3/m4;

    goto :goto_1

    .line 10
    :cond_4
    sget-object v0, Ly3/m4;->r:Ly3/m4;

    goto :goto_1

    .line 11
    :cond_5
    sget-object v0, Ly3/m4;->s:Ly3/m4;

    goto :goto_1

    .line 12
    :cond_6
    sget-object v0, Ly3/m4;->u:Ly3/m4;

    .line 13
    :goto_1
    invoke-virtual {v7, v0}, Ly3/r4;->d(Ly3/m4;)Ly3/r4;

    const/4 v0, 0x1

    if-eq v1, v0, :cond_a

    const/4 v0, 0x2

    if-eq v1, v0, :cond_9

    const/4 v0, 0x3

    if-eq v1, v0, :cond_8

    const/4 v0, 0x4

    if-eq v1, v0, :cond_7

    .line 14
    sget-object v0, Ly3/s4;->t:Ly3/s4;

    goto :goto_2

    .line 15
    :cond_7
    sget-object v0, Ly3/s4;->s:Ly3/s4;

    goto :goto_2

    .line 16
    :cond_8
    sget-object v0, Ly3/s4;->r:Ly3/s4;

    goto :goto_2

    .line 17
    :cond_9
    sget-object v0, Ly3/s4;->q:Ly3/s4;

    goto :goto_2

    .line 18
    :cond_a
    sget-object v0, Ly3/s4;->p:Ly3/s4;

    .line 19
    :goto_2
    invoke-virtual {v7, v0}, Ly3/r4;->f(Ly3/s4;)Ly3/r4;

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ly3/r4;->c(Ljava/lang/Integer;)Ly3/r4;

    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ly3/r4;->e(Ljava/lang/Integer;)Ly3/r4;

    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ly3/r4;->g(Ljava/lang/Integer;)Ly3/r4;

    .line 23
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Ly3/r4;->b(Ljava/lang/Long;)Ly3/r4;

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, Ly3/r4;->h(Ljava/lang/Integer;)Ly3/r4;

    invoke-virtual {v7}, Ly3/r4;->j()Ly3/t4;

    move-result-object p1

    new-instance v0, Ly3/a5;

    invoke-direct {v0}, Ly3/a5;-><init>()V

    .line 25
    invoke-virtual {v0, p1}, Ly3/a5;->d(Ly3/t4;)Ly3/a5;

    .line 26
    invoke-static {v0}, Ly3/g7;->c(Ly3/a5;)Ly3/g7;

    move-result-object v3

    iget-object p1, p0, Ly3/f7;->e:Lg4/l;

    .line 27
    invoke-virtual {p1}, Lg4/l;->o()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Ly3/f7;->e:Lg4/l;

    .line 28
    invoke-virtual {p1}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_3

    .line 29
    :cond_b
    invoke-static {}, Lz2/g;->a()Lz2/g;

    move-result-object p1

    iget-object v0, p0, Ly3/f7;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lz2/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_3
    move-object v5, p1

    .line 30
    invoke-static {}, Lg6/g;->d()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, Ly3/b7;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Ly3/b7;-><init>(Ly3/f7;Ly3/g7;Ly3/y4;Ljava/lang/String;[B)V

    .line 31
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
