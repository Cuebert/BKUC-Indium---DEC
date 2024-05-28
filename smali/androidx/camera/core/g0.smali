.class Landroidx/camera/core/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/l0;


# instance fields
.field private final a:Lw/l0;

.field private final b:Lw/l0;

.field private final c:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Ljava/util/concurrent/Executor;

.field private final e:I

.field private f:Lw/h1;

.field private g:Landroidx/camera/core/i1;

.field private final h:Ljava/lang/Object;

.field private i:Z

.field private j:Z

.field k:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lw/l0;ILw/l0;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/camera/core/g0;->f:Lw/h1;

    .line 3
    iput-object v0, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/core/g0;->i:Z

    .line 6
    iput-boolean v0, p0, Landroidx/camera/core/g0;->j:Z

    .line 7
    iput-object p1, p0, Landroidx/camera/core/g0;->a:Lw/l0;

    .line 8
    iput-object p3, p0, Landroidx/camera/core/g0;->b:Lw/l0;

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {p1}, Lw/l0;->d()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-interface {p3}, Lw/l0;->d()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-static {v0}, Ly/f;->c(Ljava/util/Collection;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/g0;->c:Lcom/google/common/util/concurrent/m;

    .line 13
    iput-object p4, p0, Landroidx/camera/core/g0;->d:Ljava/util/concurrent/Executor;

    .line 14
    iput p2, p0, Landroidx/camera/core/g0;->e:I

    return-void
.end method

.method public static synthetic e(Landroidx/camera/core/g0;Lw/h1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/g0;->o(Lw/h1;)V

    return-void
.end method

.method public static synthetic f(Landroidx/camera/core/g0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/g0;->m(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/camera/core/g0;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/g0;->n(Landroidx/camera/core/l1;)V

    return-void
.end method

.method public static synthetic h(Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/g0;->k(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic i(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/g0;->l(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private j()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g0;->i:Z

    .line 3
    iget-boolean v2, p0, Landroidx/camera/core/g0;->j:Z

    .line 4
    iget-object v3, p0, Landroidx/camera/core/g0;->k:Landroidx/concurrent/futures/c$a;

    if-eqz v1, :cond_0

    if-nez v2, :cond_0

    .line 5
    iget-object v4, p0, Landroidx/camera/core/g0;->f:Lw/h1;

    invoke-interface {v4}, Lw/h1;->close()V

    .line 6
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    if-nez v2, :cond_1

    if-eqz v3, :cond_1

    .line 7
    iget-object v0, p0, Landroidx/camera/core/g0;->c:Lcom/google/common/util/concurrent/m;

    new-instance v1, Landroidx/camera/core/d0;

    invoke-direct {v1, v3}, Landroidx/camera/core/d0;-><init>(Landroidx/concurrent/futures/c$a;)V

    .line 8
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 9
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private static synthetic k(Landroidx/concurrent/futures/c$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic l(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private synthetic m(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/g0;->k:Landroidx/concurrent/futures/c$a;

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "CaptureProcessorPipeline-close"

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private synthetic n(Landroidx/camera/core/l1;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/g0;->p(Landroidx/camera/core/l1;)V

    return-void
.end method

.method private synthetic o(Lw/h1;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lw/h1;->i()Landroidx/camera/core/l1;

    move-result-object p1

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/g0;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/core/c0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/core/c0;-><init>(Landroidx/camera/core/g0;Landroidx/camera/core/l1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "CaptureProcessorPipeline"

    const-string v1, "The executor for post-processing might have been shutting down or terminated!"

    .line 3
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lw/g1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g0;->i:Z

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Landroidx/camera/core/g0;->j:Z

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-interface {p1}, Lw/g1;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Lw/g1;->a(I)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    invoke-static {v1}, Landroidx/core/util/h;->a(Z)V

    .line 9
    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/l1;

    .line 10
    invoke-interface {v0}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 12
    iget-object v0, p0, Landroidx/camera/core/g0;->a:Lw/l0;

    invoke-interface {v0, p1}, Lw/l0;->a(Lw/g1;)V

    return-void

    .line 13
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not successfully extract ImageProxy from the ImageProxyBundle."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 14
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public b(Landroid/util/Size;)V
    .locals 5

    .line 1
    new-instance v0, Landroidx/camera/core/d;

    .line 2
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v2

    iget v3, p0, Landroidx/camera/core/g0;->e:I

    const/16 v4, 0x23

    invoke-static {v1, v2, v4, v3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/d;-><init>(Landroid/media/ImageReader;)V

    iput-object v0, p0, Landroidx/camera/core/g0;->f:Lw/h1;

    .line 3
    iget-object v1, p0, Landroidx/camera/core/g0;->a:Lw/l0;

    invoke-interface {v0}, Lw/h1;->a()Landroid/view/Surface;

    move-result-object v0

    invoke-interface {v1, v0, v4}, Lw/l0;->c(Landroid/view/Surface;I)V

    .line 4
    iget-object v0, p0, Landroidx/camera/core/g0;->a:Lw/l0;

    invoke-interface {v0, p1}, Lw/l0;->b(Landroid/util/Size;)V

    .line 5
    iget-object v0, p0, Landroidx/camera/core/g0;->b:Lw/l0;

    invoke-interface {v0, p1}, Lw/l0;->b(Landroid/util/Size;)V

    .line 6
    iget-object p1, p0, Landroidx/camera/core/g0;->f:Lw/h1;

    new-instance v0, Landroidx/camera/core/f0;

    invoke-direct {v0, p0}, Landroidx/camera/core/f0;-><init>(Landroidx/camera/core/g0;)V

    .line 7
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 8
    invoke-interface {p1, v0, v1}, Lw/h1;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public c(Landroid/view/Surface;I)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/g0;->b:Lw/l0;

    invoke-interface {v0, p1, p2}, Lw/l0;->c(Landroid/view/Surface;I)V

    return-void
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g0;->i:Z

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Landroidx/camera/core/g0;->i:Z

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Landroidx/camera/core/g0;->a:Lw/l0;

    invoke-interface {v0}, Lw/l0;->close()V

    .line 7
    iget-object v0, p0, Landroidx/camera/core/g0;->b:Lw/l0;

    invoke-interface {v0}, Lw/l0;->close()V

    .line 8
    invoke-direct {p0}, Landroidx/camera/core/g0;->j()V

    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public d()Lcom/google/common/util/concurrent/m;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g0;->i:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/camera/core/g0;->j:Z

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/camera/core/g0;->c:Lcom/google/common/util/concurrent/m;

    sget-object v2, Landroidx/camera/core/e0;->a:Landroidx/camera/core/e0;

    .line 4
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    .line 5
    invoke-static {v1, v2, v3}, Ly/f;->o(Lcom/google/common/util/concurrent/m;Ln/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/g0;->l:Lcom/google/common/util/concurrent/m;

    if-nez v1, :cond_1

    .line 7
    new-instance v1, Landroidx/camera/core/b0;

    invoke-direct {v1, p0}, Landroidx/camera/core/b0;-><init>(Landroidx/camera/core/g0;)V

    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/g0;->l:Lcom/google/common/util/concurrent/m;

    .line 8
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/g0;->l:Lcom/google/common/util/concurrent/m;

    invoke-static {v1}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    .line 9
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method p(Landroidx/camera/core/l1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g0;->i:Z

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    .line 4
    new-instance v0, Landroid/util/Size;

    invoke-interface {p1}, Landroidx/camera/core/l1;->g()I

    move-result v1

    invoke-interface {p1}, Landroidx/camera/core/l1;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 5
    iget-object v1, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;

    invoke-static {v1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;

    invoke-interface {v1}, Landroidx/camera/core/i1;->a()Lw/j2;

    move-result-object v1

    invoke-virtual {v1}, Lw/j2;->d()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    iget-object v2, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;

    invoke-interface {v2}, Landroidx/camera/core/i1;->a()Lw/j2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lw/j2;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 8
    new-instance v3, Landroidx/camera/core/m2;

    iget-object v4, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;

    invoke-direct {v3, p1, v0, v4}, Landroidx/camera/core/m2;-><init>(Landroidx/camera/core/l1;Landroid/util/Size;Landroidx/camera/core/i1;)V

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/camera/core/g0;->g:Landroidx/camera/core/i1;

    .line 10
    new-instance p1, Landroidx/camera/core/n2;

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0, v1}, Landroidx/camera/core/n2;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1, v3}, Landroidx/camera/core/n2;->c(Landroidx/camera/core/l1;)V

    .line 13
    :try_start_1
    iget-object v0, p0, Landroidx/camera/core/g0;->b:Lw/l0;

    invoke-interface {v0, p1}, Lw/l0;->a(Lw/g1;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "CaptureProcessorPipeline"

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Post processing image failed! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/camera/core/g0;->h:Ljava/lang/Object;

    monitor-enter p1

    const/4 v0, 0x0

    .line 16
    :try_start_2
    iput-boolean v0, p0, Landroidx/camera/core/g0;->j:Z

    .line 17
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    invoke-direct {p0}, Landroidx/camera/core/g0;->j()V

    return-void

    :catchall_0
    move-exception v0

    .line 19
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    .line 20
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method
