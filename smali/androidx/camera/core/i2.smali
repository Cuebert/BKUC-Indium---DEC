.class final Landroidx/camera/core/i2;
.super Lw/r0;
.source "SourceFile"


# instance fields
.field final m:Ljava/lang/Object;

.field private final n:Lw/h1$a;

.field o:Z

.field private final p:Landroid/util/Size;

.field final q:Landroidx/camera/core/t1;

.field final r:Landroid/view/Surface;

.field private final s:Landroid/os/Handler;

.field final t:Lw/m0;

.field final u:Lw/l0;

.field private final v:Lw/h;

.field private final w:Lw/r0;

.field private x:Ljava/lang/String;


# direct methods
.method constructor <init>(IIILandroid/os/Handler;Lw/m0;Lw/l0;Lw/r0;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/Size;

    invoke-direct {v0, p1, p2}, Landroid/util/Size;-><init>(II)V

    invoke-direct {p0, v0, p3}, Lw/r0;-><init>(Landroid/util/Size;I)V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/i2;->m:Ljava/lang/Object;

    .line 3
    new-instance v0, Landroidx/camera/core/h2;

    invoke-direct {v0, p0}, Landroidx/camera/core/h2;-><init>(Landroidx/camera/core/i2;)V

    iput-object v0, p0, Landroidx/camera/core/i2;->n:Lw/h1$a;

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/camera/core/i2;->o:Z

    .line 5
    new-instance v1, Landroid/util/Size;

    invoke-direct {v1, p1, p2}, Landroid/util/Size;-><init>(II)V

    iput-object v1, p0, Landroidx/camera/core/i2;->p:Landroid/util/Size;

    if-eqz p4, :cond_0

    .line 6
    iput-object p4, p0, Landroidx/camera/core/i2;->s:Landroid/os/Handler;

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    if-eqz p4, :cond_1

    .line 8
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Landroidx/camera/core/i2;->s:Landroid/os/Handler;

    .line 9
    :goto_0
    iget-object p4, p0, Landroidx/camera/core/i2;->s:Landroid/os/Handler;

    invoke-static {p4}, Lx/a;->e(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p4

    .line 10
    new-instance v2, Landroidx/camera/core/t1;

    const/4 v3, 0x2

    invoke-direct {v2, p1, p2, p3, v3}, Landroidx/camera/core/t1;-><init>(IIII)V

    iput-object v2, p0, Landroidx/camera/core/i2;->q:Landroidx/camera/core/t1;

    .line 11
    invoke-virtual {v2, v0, p4}, Landroidx/camera/core/t1;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    .line 12
    invoke-virtual {v2}, Landroidx/camera/core/t1;->a()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/i2;->r:Landroid/view/Surface;

    .line 13
    invoke-virtual {v2}, Landroidx/camera/core/t1;->o()Lw/h;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/i2;->v:Lw/h;

    .line 14
    iput-object p6, p0, Landroidx/camera/core/i2;->u:Lw/l0;

    .line 15
    invoke-interface {p6, v1}, Lw/l0;->b(Landroid/util/Size;)V

    .line 16
    iput-object p5, p0, Landroidx/camera/core/i2;->t:Lw/m0;

    .line 17
    iput-object p7, p0, Landroidx/camera/core/i2;->w:Lw/r0;

    .line 18
    iput-object p8, p0, Landroidx/camera/core/i2;->x:Ljava/lang/String;

    .line 19
    invoke-virtual {p7}, Lw/r0;->h()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    new-instance p2, Landroidx/camera/core/i2$a;

    invoke-direct {p2, p0}, Landroidx/camera/core/i2$a;-><init>(Landroidx/camera/core/i2;)V

    .line 20
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    .line 21
    invoke-static {p1, p2, p3}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 22
    invoke-virtual {p0}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    new-instance p2, Landroidx/camera/core/g2;

    invoke-direct {p2, p0}, Landroidx/camera/core/g2;-><init>(Landroidx/camera/core/i2;)V

    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    .line 23
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic p(Landroidx/camera/core/i2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/i2;->u()V

    return-void
.end method

.method public static synthetic q(Landroidx/camera/core/i2;Lw/h1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/i2;->t(Lw/h1;)V

    return-void
.end method

.method private synthetic t(Lw/h1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/i2;->m:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/camera/core/i2;->s(Lw/h1;)V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private u()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/i2;->m:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/i2;->o:Z

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/i2;->q:Landroidx/camera/core/t1;

    invoke-virtual {v1}, Landroidx/camera/core/t1;->close()V

    .line 5
    iget-object v1, p0, Landroidx/camera/core/i2;->r:Landroid/view/Surface;

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 6
    iget-object v1, p0, Landroidx/camera/core/i2;->w:Lw/r0;

    invoke-virtual {v1}, Lw/r0;->c()V

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Landroidx/camera/core/i2;->o:Z

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public n()Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/i2;->m:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/i2;->r:Landroid/view/Surface;

    invoke-static {v1}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method r()Lw/h;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/i2;->m:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/i2;->o:Z

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/camera/core/i2;->v:Lw/h;

    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "ProcessingSurface already released!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method s(Lw/h1;)V
    .locals 4

    const-string v0, "ProcessingSurfaceTextur"

    .line 1
    iget-boolean v1, p0, Landroidx/camera/core/i2;->o:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-interface {p1}, Lw/h1;->i()Landroidx/camera/core/l1;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to acquire next image."

    .line 3
    invoke-static {v0, v2, p1}, Landroidx/camera/core/q1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-nez v1, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-interface {v1}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object p1

    if-nez p1, :cond_2

    .line 5
    invoke-interface {v1}, Landroidx/camera/core/l1;->close()V

    return-void

    .line 6
    :cond_2
    invoke-interface {p1}, Landroidx/camera/core/i1;->a()Lw/j2;

    move-result-object p1

    iget-object v2, p0, Landroidx/camera/core/i2;->x:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lw/j2;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_3

    .line 7
    invoke-interface {v1}, Landroidx/camera/core/l1;->close()V

    return-void

    .line 8
    :cond_3
    iget-object v2, p0, Landroidx/camera/core/i2;->t:Lw/m0;

    invoke-interface {v2}, Lw/m0;->b()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v2, v3, :cond_4

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ImageProxyBundle does not contain this id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-interface {v1}, Landroidx/camera/core/l1;->close()V

    goto :goto_1

    .line 11
    :cond_4
    new-instance p1, Lw/f2;

    iget-object v0, p0, Landroidx/camera/core/i2;->x:Ljava/lang/String;

    invoke-direct {p1, v1, v0}, Lw/f2;-><init>(Landroidx/camera/core/l1;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Landroidx/camera/core/i2;->u:Lw/l0;

    invoke-interface {v0, p1}, Lw/l0;->a(Lw/g1;)V

    .line 13
    invoke-virtual {p1}, Lw/f2;->c()V

    :goto_1
    return-void
.end method
