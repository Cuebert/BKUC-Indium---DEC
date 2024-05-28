.class public final Lw3/pa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static j:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lw3/oa;

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
            "Lw3/d8;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lw3/d8;",
            "Lw3/e1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg6/n;Lw3/oa;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    .line 1
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw3/pa;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw3/pa;->i:Ljava/util/Map;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lw3/pa;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lg6/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw3/pa;->b:Ljava/lang/String;

    iput-object p2, p0, Lw3/pa;->d:Lg6/n;

    iput-object p3, p0, Lw3/pa;->c:Lw3/oa;

    iput-object p4, p0, Lw3/pa;->g:Ljava/lang/String;

    .line 5
    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object p1

    new-instance p3, Lw3/ma;

    invoke-direct {p3, p4}, Lw3/ma;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, p3}, Lg6/g;->b(Ljava/util/concurrent/Callable;)Lg4/l;

    move-result-object p1

    iput-object p1, p0, Lw3/pa;->e:Lg4/l;

    .line 7
    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lw3/la;

    invoke-direct {p3, p2}, Lw3/la;-><init>(Lg6/n;)V

    invoke-virtual {p1, p3}, Lg6/g;->b(Ljava/util/concurrent/Callable;)Lg4/l;

    move-result-object p1

    iput-object p1, p0, Lw3/pa;->f:Lg4/l;

    return-void
.end method

.method static a(Ljava/util/List;D)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;D)J"
        }
    .end annotation

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p1, v0

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    mul-double p1, p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x0

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private static declared-synchronized g()Lw3/c1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Lw3/pa;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw3/pa;->j:Lw3/c1;
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

    new-instance v2, Lw3/y0;

    .line 2
    invoke-direct {v2}, Lw3/y0;-><init>()V

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

    invoke-virtual {v2, v4}, Lw3/y0;->e(Ljava/lang/Object;)Lw3/y0;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v2}, Lw3/y0;->g()Lw3/c1;

    move-result-object v1

    sput-object v1, Lw3/pa;->j:Lw3/c1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final h()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lw3/pa;->e:Lg4/l;

    .line 1
    invoke-virtual {v0}, Lg4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw3/pa;->e:Lg4/l;

    .line 2
    invoke-virtual {v0}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lz2/g;->a()Lz2/g;

    move-result-object v0

    iget-object v1, p0, Lw3/pa;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lz2/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final i(Lw3/d8;JJ)Z
    .locals 2

    iget-object p4, p0, Lw3/pa;->h:Ljava/util/Map;

    .line 1
    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    const/4 p5, 0x1

    if-nez p4, :cond_0

    return p5

    :cond_0
    iget-object p4, p0, Lw3/pa;->h:Ljava/util/Map;

    .line 2
    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr p2, v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    cmp-long p1, p2, v0

    if-lez p1, :cond_1

    return p5

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final b(Lw3/na;Lw3/d8;)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const-wide/16 v4, 0x1e

    move-object v0, p0

    move-object v1, p2

    move-wide v2, v6

    .line 2
    invoke-direct/range {v0 .. v5}, Lw3/pa;->i(Lw3/d8;JJ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw3/pa;->h:Ljava/util/Map;

    .line 3
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-interface {p1}, Lw3/na;->zza()Lw3/sa;

    move-result-object p1

    .line 5
    invoke-direct {p0}, Lw3/pa;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lw3/pa;->e(Lw3/sa;Lw3/d8;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic c(Lw3/sa;Lw3/d8;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Lw3/sa;->f(Lw3/d8;)Lw3/sa;

    .line 2
    invoke-virtual {p1}, Lw3/sa;->b()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lw3/w9;

    invoke-direct {v0}, Lw3/w9;-><init>()V

    iget-object v1, p0, Lw3/pa;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Lw3/w9;->b(Ljava/lang/String;)Lw3/w9;

    iget-object v1, p0, Lw3/pa;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Lw3/w9;->c(Ljava/lang/String;)Lw3/w9;

    .line 5
    invoke-static {}, Lw3/pa;->g()Lw3/c1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw3/w9;->h(Lw3/c1;)Lw3/w9;

    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lw3/w9;->g(Ljava/lang/Boolean;)Lw3/w9;

    .line 7
    invoke-virtual {v0, p2}, Lw3/w9;->k(Ljava/lang/String;)Lw3/w9;

    .line 8
    invoke-virtual {v0, p3}, Lw3/w9;->j(Ljava/lang/String;)Lw3/w9;

    iget-object p2, p0, Lw3/pa;->f:Lg4/l;

    .line 9
    invoke-virtual {p2}, Lg4/l;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lw3/pa;->f:Lg4/l;

    .line 10
    invoke-virtual {p2}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    .line 11
    :cond_0
    iget-object p2, p0, Lw3/pa;->d:Lg6/n;

    .line 12
    invoke-virtual {p2}, Lg6/n;->a()Ljava/lang/String;

    move-result-object p2

    .line 13
    :goto_0
    invoke-virtual {v0, p2}, Lw3/w9;->i(Ljava/lang/String;)Lw3/w9;

    const/16 p2, 0xa

    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lw3/w9;->d(Ljava/lang/Integer;)Lw3/w9;

    .line 15
    invoke-virtual {p1, v0}, Lw3/sa;->g(Lw3/w9;)Lw3/sa;

    iget-object p2, p0, Lw3/pa;->c:Lw3/oa;

    .line 16
    invoke-interface {p2, p1}, Lw3/oa;->a(Lw3/sa;)V

    return-void
.end method

.method public final d(Lw3/sa;Lw3/d8;)V
    .locals 1

    invoke-direct {p0}, Lw3/pa;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lw3/pa;->e(Lw3/sa;Lw3/d8;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Lw3/sa;Lw3/d8;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {}, Lg6/g;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v7, Lw3/ka;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lw3/ka;-><init>(Lw3/pa;Lw3/sa;Lw3/d8;Ljava/lang/String;[B)V

    .line 2
    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;JLw3/d8;Lj6/e;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;J",
            "Lw3/d8;",
            "Lj6/e;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lw3/pa;->i:Ljava/util/Map;

    .line 1
    invoke-interface {v0, p4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw3/pa;->i:Ljava/util/Map;

    .line 2
    invoke-static {}, Lw3/h0;->r()Lw3/h0;

    move-result-object v1

    invoke-interface {v0, p4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lw3/pa;->i:Ljava/util/Map;

    .line 3
    invoke-interface {v0, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/e1;

    .line 4
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lw3/l1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v5, 0x1e

    move-object v1, p0

    move-object v2, p4

    move-wide v3, p1

    .line 6
    invoke-direct/range {v1 .. v6}, Lw3/pa;->i(Lw3/d8;JJ)Z

    move-result p3

    if-nez p3, :cond_1

    return-void

    :cond_1
    iget-object p3, p0, Lw3/pa;->h:Ljava/util/Map;

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-interface {v0}, Lw3/l1;->j()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 9
    invoke-interface {v0, p2}, Lw3/e1;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 10
    invoke-static {p3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance v1, Lw3/l7;

    invoke-direct {v1}, Lw3/l7;-><init>()V

    .line 11
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v3, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v3, v5

    goto :goto_1

    .line 12
    :cond_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v5, v2

    div-long/2addr v3, v5

    .line 13
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw3/l7;->a(Ljava/lang/Long;)Lw3/l7;

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 14
    invoke-static {p3, v2, v3}, Lw3/pa;->a(Ljava/util/List;D)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw3/l7;->c(Ljava/lang/Long;)Lw3/l7;

    const-wide v2, 0x4052c00000000000L    # 75.0

    .line 15
    invoke-static {p3, v2, v3}, Lw3/pa;->a(Ljava/util/List;D)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw3/l7;->f(Ljava/lang/Long;)Lw3/l7;

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    .line 16
    invoke-static {p3, v2, v3}, Lw3/pa;->a(Ljava/util/List;D)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw3/l7;->d(Ljava/lang/Long;)Lw3/l7;

    const-wide/high16 v2, 0x4039000000000000L    # 25.0

    .line 17
    invoke-static {p3, v2, v3}, Lw3/pa;->a(Ljava/util/List;D)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw3/l7;->b(Ljava/lang/Long;)Lw3/l7;

    const-wide/16 v2, 0x0

    .line 18
    invoke-static {p3, v2, v3}, Lw3/pa;->a(Ljava/util/List;D)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v1, p3}, Lw3/l7;->e(Ljava/lang/Long;)Lw3/l7;

    invoke-virtual {v1}, Lw3/l7;->g()Lw3/m7;

    move-result-object p3

    .line 19
    invoke-interface {v0, p2}, Lw3/e1;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p5, Lj6/e;->a:Lj6/g;

    check-cast p2, Lw3/q2;

    invoke-virtual {v2, p2, v1, p3}, Lj6/g;->k(Lw3/q2;ILw3/m7;)Lw3/sa;

    move-result-object p2

    .line 20
    invoke-direct {p0}, Lw3/pa;->h()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p4, p3}, Lw3/pa;->e(Lw3/sa;Lw3/d8;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lw3/pa;->i:Ljava/util/Map;

    .line 21
    invoke-interface {p1, p4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
