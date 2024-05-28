.class final Lg4/n0;
.super Lg4/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lg4/l<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lg4/j0;

.field private c:Z

.field private volatile d:Z

.field private e:Ljava/lang/Object;

.field private f:Ljava/lang/Exception;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lg4/l;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    new-instance v0, Lg4/j0;

    invoke-direct {v0}, Lg4/j0;-><init>()V

    iput-object v0, p0, Lg4/n0;->b:Lg4/j0;

    return-void
.end method

.method private final w()V
    .locals 2

    iget-boolean v0, p0, Lg4/n0;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lz2/j;->n(ZLjava/lang/Object;)V

    return-void
.end method

.method private final x()V
    .locals 2

    iget-boolean v0, p0, Lg4/n0;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final y()V
    .locals 1

    iget-boolean v0, p0, Lg4/n0;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lg4/d;->a(Lg4/l;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method private final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg4/n0;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 2
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lg4/n0;->b:Lg4/j0;

    .line 3
    invoke-virtual {v0, p0}, Lg4/j0;->b(Lg4/l;)V

    return-void

    :catchall_0
    move-exception v1

    .line 4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Lg4/e;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/e;",
            ")",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v1, Lg4/z;

    invoke-direct {v1, p1, p2}, Lg4/z;-><init>(Ljava/util/concurrent/Executor;Lg4/e;)V

    invoke-virtual {v0, v1}, Lg4/j0;->a(Lg4/i0;)V

    .line 2
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object p0
.end method

.method public final b(Lg4/f;)Lg4/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg4/f<",
            "TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lg4/n;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v2, Lg4/b0;

    invoke-direct {v2, v0, p1}, Lg4/b0;-><init>(Ljava/util/concurrent/Executor;Lg4/f;)V

    .line 2
    invoke-virtual {v1, v2}, Lg4/j0;->a(Lg4/i0;)V

    .line 3
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;Lg4/f;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/f<",
            "TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v1, Lg4/b0;

    invoke-direct {v1, p1, p2}, Lg4/b0;-><init>(Ljava/util/concurrent/Executor;Lg4/f;)V

    invoke-virtual {v0, v1}, Lg4/j0;->a(Lg4/i0;)V

    .line 2
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object p0
.end method

.method public final d(Lg4/g;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg4/g;",
            ")",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lg4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lg4/n0;->e(Ljava/util/concurrent/Executor;Lg4/g;)Lg4/l;

    return-object p0
.end method

.method public final e(Ljava/util/concurrent/Executor;Lg4/g;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/g;",
            ")",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v1, Lg4/d0;

    invoke-direct {v1, p1, p2}, Lg4/d0;-><init>(Ljava/util/concurrent/Executor;Lg4/g;)V

    invoke-virtual {v0, v1}, Lg4/j0;->a(Lg4/i0;)V

    .line 2
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object p0
.end method

.method public final f(Lg4/h;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg4/h<",
            "-TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lg4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lg4/n0;->g(Ljava/util/concurrent/Executor;Lg4/h;)Lg4/l;

    return-object p0
.end method

.method public final g(Ljava/util/concurrent/Executor;Lg4/h;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/h<",
            "-TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v1, Lg4/f0;

    invoke-direct {v1, p1, p2}, Lg4/f0;-><init>(Ljava/util/concurrent/Executor;Lg4/h;)V

    invoke-virtual {v0, v1}, Lg4/j0;->a(Lg4/i0;)V

    .line 2
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object p0
.end method

.method public final h(Ljava/util/concurrent/Executor;Lg4/c;)Lg4/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/c<",
            "TTResult;TTContinuationResult;>;)",
            "Lg4/l<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    iget-object v1, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v2, Lg4/v;

    invoke-direct {v2, p1, p2, v0}, Lg4/v;-><init>(Ljava/util/concurrent/Executor;Lg4/c;Lg4/n0;)V

    .line 2
    invoke-virtual {v1, v2}, Lg4/j0;->a(Lg4/i0;)V

    .line 3
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object v0
.end method

.method public final i(Ljava/util/concurrent/Executor;Lg4/c;)Lg4/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/c<",
            "TTResult;",
            "Lg4/l<",
            "TTContinuationResult;>;>;)",
            "Lg4/l<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    iget-object v1, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v2, Lg4/x;

    invoke-direct {v2, p1, p2, v0}, Lg4/x;-><init>(Ljava/util/concurrent/Executor;Lg4/c;Lg4/n0;)V

    .line 2
    invoke-virtual {v1, v2}, Lg4/j0;->a(Lg4/i0;)V

    .line 3
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object v0
.end method

.method public final j()Ljava/lang/Exception;
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lg4/n0;->w()V

    .line 2
    invoke-direct {p0}, Lg4/n0;->x()V

    iget-object v1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lg4/n0;->e:Ljava/lang/Object;

    .line 4
    monitor-exit v0

    return-object v1

    .line 5
    :cond_0
    new-instance v2, Lg4/j;

    .line 6
    invoke-direct {v2, v1}, Lg4/j;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;)TTResult;^TX;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lg4/n0;->w()V

    .line 2
    invoke-direct {p0}, Lg4/n0;->x()V

    iget-object v1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    iget-object p1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lg4/n0;->e:Ljava/lang/Object;

    .line 6
    monitor-exit v0

    return-object p1

    .line 7
    :cond_0
    new-instance v1, Lg4/j;

    .line 8
    invoke-direct {v1, p1}, Lg4/j;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 9
    :cond_1
    iget-object v1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lg4/n0;->d:Z

    return v0
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg4/n0;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final o()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg4/n0;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lg4/n0;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final p(Lg4/k;)Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lg4/k<",
            "TTResult;TTContinuationResult;>;)",
            "Lg4/l<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lg4/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lg4/n0;

    .line 2
    invoke-direct {v1}, Lg4/n0;-><init>()V

    iget-object v2, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v3, Lg4/h0;

    invoke-direct {v3, v0, p1, v1}, Lg4/h0;-><init>(Ljava/util/concurrent/Executor;Lg4/k;Lg4/n0;)V

    .line 3
    invoke-virtual {v2, v3}, Lg4/j0;->a(Lg4/i0;)V

    .line 4
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object v1
.end method

.method public final q(Ljava/util/concurrent/Executor;Lg4/k;)Lg4/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lg4/k<",
            "TTResult;TTContinuationResult;>;)",
            "Lg4/l<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    iget-object v1, p0, Lg4/n0;->b:Lg4/j0;

    new-instance v2, Lg4/h0;

    invoke-direct {v2, p1, p2, v0}, Lg4/h0;-><init>(Ljava/util/concurrent/Executor;Lg4/k;Lg4/n0;)V

    .line 2
    invoke-virtual {v1, v2}, Lg4/j0;->a(Lg4/i0;)V

    .line 3
    invoke-direct {p0}, Lg4/n0;->z()V

    return-object v0
.end method

.method public final r(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    .line 1
    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lg4/n0;->y()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg4/n0;->c:Z

    iput-object p1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg4/n0;->b:Lg4/j0;

    .line 4
    invoke-virtual {p1, p0}, Lg4/j0;->b(Lg4/l;)V

    return-void

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final s(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lg4/n0;->y()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg4/n0;->c:Z

    iput-object p1, p0, Lg4/n0;->e:Ljava/lang/Object;

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg4/n0;->b:Lg4/j0;

    .line 3
    invoke-virtual {p1, p0}, Lg4/j0;->b(Lg4/l;)V

    return-void

    :catchall_0
    move-exception p1

    .line 4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg4/n0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lg4/n0;->c:Z

    iput-boolean v1, p0, Lg4/n0;->d:Z

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lg4/n0;->b:Lg4/j0;

    .line 3
    invoke-virtual {v0, p0}, Lg4/j0;->b(Lg4/l;)V

    return v1

    :catchall_0
    move-exception v1

    .line 4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final u(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    .line 1
    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg4/n0;->c:Z

    if-eqz v1, :cond_0

    .line 2
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lg4/n0;->c:Z

    iput-object p1, p0, Lg4/n0;->f:Ljava/lang/Exception;

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg4/n0;->b:Lg4/j0;

    .line 4
    invoke-virtual {p1, p0}, Lg4/j0;->b(Lg4/l;)V

    return v1

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg4/n0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lg4/n0;->c:Z

    iput-object p1, p0, Lg4/n0;->e:Ljava/lang/Object;

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg4/n0;->b:Lg4/j0;

    .line 3
    invoke-virtual {p1, p0}, Lg4/j0;->b(Lg4/l;)V

    return v1

    :catchall_0
    move-exception p1

    .line 4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
