.class Landroidx/camera/camera2/internal/u2;
.super Landroidx/camera/camera2/internal/p2;
.source "SourceFile"


# instance fields
.field private final o:Ljava/lang/Object;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field

.field q:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Lu/h;

.field private final s:Lu/u;

.field private final t:Lu/g;


# direct methods
.method constructor <init>(Lw/y1;Lw/y1;Landroidx/camera/camera2/internal/t1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4, p5, p6}, Landroidx/camera/camera2/internal/p2;-><init>(Landroidx/camera/camera2/internal/t1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    .line 2
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Landroidx/camera/camera2/internal/u2;->o:Ljava/lang/Object;

    .line 3
    new-instance p3, Lu/h;

    invoke-direct {p3, p1, p2}, Lu/h;-><init>(Lw/y1;Lw/y1;)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/u2;->r:Lu/h;

    .line 4
    new-instance p3, Lu/u;

    invoke-direct {p3, p1}, Lu/u;-><init>(Lw/y1;)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/u2;->s:Lu/u;

    .line 5
    new-instance p1, Lu/g;

    invoke-direct {p1, p2}, Lu/g;-><init>(Lw/y1;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/u2;->t:Lu/g;

    return-void
.end method

.method public static synthetic J(Landroidx/camera/camera2/internal/u2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u2;->O()V

    return-void
.end method

.method public static synthetic K(Landroidx/camera/camera2/internal/u2;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/u2;->Q(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Landroidx/camera/camera2/internal/u2;Landroidx/camera/camera2/internal/j2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/u2;->P(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public static synthetic M(Landroidx/camera/camera2/internal/u2;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u2;->R(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p0

    return p0
.end method

.method private synthetic O()V
    .locals 1

    const-string v0, "Session call super.close()"

    .line 1
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u2;->N(Ljava/lang/String;)V

    .line 2
    invoke-super {p0}, Landroidx/camera/camera2/internal/p2;->close()V

    return-void
.end method

.method private synthetic P(Landroidx/camera/camera2/internal/j2;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/camera/camera2/internal/p2;->r(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method private synthetic Q(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/p2;->l(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic R(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroidx/camera/camera2/internal/p2;->m(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method


# virtual methods
.method N(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SyncCaptureSessionImpl"

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 3

    const-string v0, "Session call close()"

    .line 1
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u2;->N(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->s:Lu/u;

    invoke-virtual {v0}, Lu/u;->f()V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->s:Lu/u;

    invoke-virtual {v0}, Lu/u;->c()Lcom/google/common/util/concurrent/m;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/q2;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/q2;-><init>(Landroidx/camera/camera2/internal/u2;)V

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 5
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public f(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;J)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/camera/camera2/internal/u2;->p:Ljava/util/List;

    .line 3
    invoke-super {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/p2;->f(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h()Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->s:Lu/u;

    invoke-virtual {v0}, Lu/u;->c()Lcom/google/common/util/concurrent/m;

    move-result-object v0

    return-object v0
.end method

.method public l(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ls/g;",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/u2;->s:Lu/u;

    iget-object v2, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    .line 3
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/t1;->e()Ljava/util/List;

    move-result-object v5

    new-instance v6, Landroidx/camera/camera2/internal/s2;

    invoke-direct {v6, p0}, Landroidx/camera/camera2/internal/s2;-><init>(Landroidx/camera/camera2/internal/u2;)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 4
    invoke-virtual/range {v1 .. v6}, Lu/u;->g(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;Ljava/util/List;Lu/u$b;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/u2;->q:Lcom/google/common/util/concurrent/m;

    .line 5
    invoke-static {p1}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public m(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->s:Lu/u;

    new-instance v1, Landroidx/camera/camera2/internal/t2;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/t2;-><init>(Landroidx/camera/camera2/internal/u2;)V

    invoke-virtual {v0, p1, p2, v1}, Lu/u;->h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Lu/u$c;)I

    move-result p1

    return p1
.end method

.method public p(Landroidx/camera/camera2/internal/j2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/u2;->r:Lu/h;

    iget-object v2, p0, Landroidx/camera/camera2/internal/u2;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, Lu/h;->a(Ljava/util/List;)V

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "onClosed()"

    .line 4
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u2;->N(Ljava/lang/String;)V

    .line 5
    invoke-super {p0, p1}, Landroidx/camera/camera2/internal/p2;->p(Landroidx/camera/camera2/internal/j2;)V

    return-void

    :catchall_0
    move-exception p1

    .line 6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public r(Landroidx/camera/camera2/internal/j2;)V
    .locals 4

    const-string v0, "Session onConfigured()"

    .line 1
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u2;->N(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->t:Lu/g;

    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    .line 3
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/t1;->f()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    .line 4
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/t1;->d()Ljava/util/List;

    move-result-object v2

    new-instance v3, Landroidx/camera/camera2/internal/r2;

    invoke-direct {v3, p0}, Landroidx/camera/camera2/internal/r2;-><init>(Landroidx/camera/camera2/internal/u2;)V

    .line 5
    invoke-virtual {v0, p1, v1, v2, v3}, Lu/g;->c(Landroidx/camera/camera2/internal/j2;Ljava/util/List;Ljava/util/List;Lu/g$a;)V

    return-void
.end method

.method public stop()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u2;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->C()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/u2;->r:Lu/h;

    iget-object v2, p0, Landroidx/camera/camera2/internal/u2;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, Lu/h;->a(Ljava/util/List;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/u2;->q:Lcom/google/common/util/concurrent/m;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    .line 5
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 6
    :cond_1
    :goto_0
    invoke-super {p0}, Landroidx/camera/camera2/internal/p2;->stop()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
