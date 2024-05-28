.class public final Lw/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/s1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/n1$a;,
        Lw/n1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lw/s1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Lw/n1$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lw/s1$a<",
            "-TT;>;",
            "Lw/n1$a<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/r;

    invoke-direct {v0}, Landroidx/lifecycle/r;-><init>()V

    iput-object v0, p0, Lw/n1;->a:Landroidx/lifecycle/r;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw/n1;->b:Ljava/util/Map;

    return-void
.end method

.method public static synthetic c(Lw/n1;Lw/n1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lw/n1;->f(Lw/n1$a;)V

    return-void
.end method

.method public static synthetic d(Lw/n1;Lw/n1$a;Lw/n1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw/n1;->e(Lw/n1$a;Lw/n1$a;)V

    return-void
.end method

.method private synthetic e(Lw/n1$a;Lw/n1$a;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lw/n1;->a:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData;->n(Landroidx/lifecycle/s;)V

    .line 2
    :cond_0
    iget-object p1, p0, Lw/n1;->a:Landroidx/lifecycle/r;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->j(Landroidx/lifecycle/s;)V

    return-void
.end method

.method private synthetic f(Lw/n1$a;)V
    .locals 1

    iget-object v0, p0, Lw/n1;->a:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData;->n(Landroidx/lifecycle/s;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Lw/s1$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lw/s1$a<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lw/n1;->b:Ljava/util/Map;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lw/n1;->b:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/n1$a;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lw/n1$a;->c()V

    .line 4
    :cond_0
    new-instance v2, Lw/n1$a;

    invoke-direct {v2, p1, p2}, Lw/n1$a;-><init>(Ljava/util/concurrent/Executor;Lw/s1$a;)V

    .line 5
    iget-object p1, p0, Lw/n1;->b:Ljava/util/Map;

    invoke-interface {p1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance p2, Lw/l1;

    invoke-direct {p2, p0, v1, v2}, Lw/l1;-><init>(Lw/n1;Lw/n1$a;Lw/n1$a;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lw/s1$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/s1$a<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lw/n1;->b:Ljava/util/Map;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lw/n1;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/n1$a;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lw/n1$a;->c()V

    .line 4
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Lw/k1;

    invoke-direct {v2, p0, p1}, Lw/k1;-><init>(Lw/n1;Lw/n1$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lw/n1;->a:Landroidx/lifecycle/r;

    invoke-static {p1}, Lw/n1$b;->b(Ljava/lang/Object;)Lw/n1$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->m(Ljava/lang/Object;)V

    return-void
.end method
