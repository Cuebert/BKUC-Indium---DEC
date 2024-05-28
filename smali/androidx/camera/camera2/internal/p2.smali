.class Landroidx/camera/camera2/internal/p2;
.super Landroidx/camera/camera2/internal/j2$a;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/j2;
.implements Landroidx/camera/camera2/internal/v2$b;


# instance fields
.field final a:Ljava/lang/Object;

.field final b:Landroidx/camera/camera2/internal/t1;

.field final c:Landroid/os/Handler;

.field final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field f:Landroidx/camera/camera2/internal/j2$a;

.field g:Lr/g;

.field h:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field i:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:Z

.field private n:Z


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/t1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j2$a;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/camera2/internal/p2;->k:Ljava/util/List;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/p2;->l:Z

    .line 5
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/p2;->m:Z

    .line 6
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/p2;->n:Z

    .line 7
    iput-object p1, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    .line 8
    iput-object p4, p0, Landroidx/camera/camera2/internal/p2;->c:Landroid/os/Handler;

    .line 9
    iput-object p2, p0, Landroidx/camera/camera2/internal/p2;->d:Ljava/util/concurrent/Executor;

    .line 10
    iput-object p3, p0, Landroidx/camera/camera2/internal/p2;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method private synthetic D()V
    .locals 0

    invoke-virtual {p0, p0}, Landroidx/camera/camera2/internal/p2;->t(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method private synthetic E(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v0, p0}, Landroidx/camera/camera2/internal/t1;->h(Landroidx/camera/camera2/internal/j2;)V

    .line 2
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/p2;->t(Landroidx/camera/camera2/internal/j2;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->p(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method private synthetic F(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->t(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method private synthetic G(Ljava/util/List;Lr/a0;Ls/g;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/p2;->B(Ljava/util/List;)V

    .line 3
    iget-object p1, p0, Landroidx/camera/camera2/internal/p2;->i:Landroidx/concurrent/futures/c$a;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v1, "The openCaptureSessionCompleter can only set once!"

    invoke-static {p1, v1}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 4
    iput-object p4, p0, Landroidx/camera/camera2/internal/p2;->i:Landroidx/concurrent/futures/c$a;

    .line 5
    invoke-virtual {p2, p3}, Lr/a0;->a(Ls/g;)V

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "openCaptureSession[session="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic H(Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] getSurface...done"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SyncCaptureSessionBase"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {p2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    .line 4
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/r0;

    .line 5
    new-instance p2, Lw/r0$a;

    const-string v0, "Surface closed"

    invoke-direct {p2, v0, p1}, Lw/r0$a;-><init>(Ljava/lang/String;Lw/r0;)V

    invoke-static {p2}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to open capture session without surfaces"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 8
    :cond_1
    invoke-static {p2}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic v(Landroidx/camera/camera2/internal/p2;Landroidx/camera/camera2/internal/j2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/p2;->F(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public static synthetic w(Landroidx/camera/camera2/internal/p2;Ljava/util/List;Lr/a0;Ls/g;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/p2;->G(Ljava/util/List;Lr/a0;Ls/g;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Landroidx/camera/camera2/internal/p2;Landroidx/camera/camera2/internal/j2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/p2;->E(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public static synthetic y(Landroidx/camera/camera2/internal/p2;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/p2;->H(Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Landroidx/camera/camera2/internal/p2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/p2;->D()V

    return-void
.end method


# virtual methods
.method A(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->c:Landroid/os/Handler;

    invoke-static {p1, v0}, Lr/g;->d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)Lr/g;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    :cond_0
    return-void
.end method

.method B(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lw/r0$a;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->I()V

    .line 3
    invoke-static {p1}, Lw/w0;->f(Ljava/util/List;)V

    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/p2;->k:Ljava/util/List;

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method C()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method I()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->k:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v1}, Lw/w0;->e(Ljava/util/List;)V

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Landroidx/camera/camera2/internal/p2;->k:Ljava/util/List;

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a()Landroidx/camera/camera2/internal/j2$a;
    .locals 0

    return-object p0
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->I()V

    return-void
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v0, p0}, Landroidx/camera/camera2/internal/t1;->i(Landroidx/camera/camera2/internal/j2;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-virtual {v0}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/l2;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/l2;-><init>(Landroidx/camera/camera2/internal/p2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(ILjava/util/List;Landroidx/camera/camera2/internal/j2$a;)Ls/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ls/b;",
            ">;",
            "Landroidx/camera/camera2/internal/j2$a;",
            ")",
            "Ls/g;"
        }
    .end annotation

    .line 1
    iput-object p3, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    .line 2
    new-instance p3, Ls/g;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/p2$b;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/p2$b;-><init>(Landroidx/camera/camera2/internal/p2;)V

    invoke-direct {p3, p1, p2, v0, v1}, Ls/g;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-object p3
.end method

.method public e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-virtual {v0}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    return-void
.end method

.method public f(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;
    .locals 7
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
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/p2;->m:Z

    if-eqz v1, :cond_0

    .line 3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Opener is disabled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object v5

    iget-object v6, p0, Landroidx/camera/camera2/internal/p2;->e:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, p1

    move-wide v3, p2

    .line 5
    invoke-static/range {v1 .. v6}, Lw/w0;->k(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/m;

    move-result-object p2

    .line 6
    invoke-static {p2}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object p2

    new-instance p3, Landroidx/camera/camera2/internal/o2;

    invoke-direct {p3, p0, p1}, Landroidx/camera/camera2/internal/o2;-><init>(Landroidx/camera/camera2/internal/p2;Ljava/util/List;)V

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 8
    invoke-virtual {p2, p3, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/p2;->j:Lcom/google/common/util/concurrent/m;

    .line 9
    invoke-static {p1}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Lr/g;->a(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
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

    const/4 v0, 0x0

    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    return-object v0
.end method

.method public i()Lr/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    return-object v0
.end method

.method public j()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-virtual {v0}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V

    return-void
.end method

.method public k()Landroid/hardware/camera2/CameraDevice;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-virtual {v0}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    return-object v0
.end method

.method public l(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 2
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
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/p2;->m:Z

    if-eqz v1, :cond_0

    .line 3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Opener is disabled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v1, p0}, Landroidx/camera/camera2/internal/t1;->l(Landroidx/camera/camera2/internal/j2;)V

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->c:Landroid/os/Handler;

    .line 6
    invoke-static {p1, v1}, Lr/a0;->b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/a0;

    move-result-object p1

    .line 7
    new-instance v1, Landroidx/camera/camera2/internal/k2;

    invoke-direct {v1, p0, p3, p1, p2}, Landroidx/camera/camera2/internal/k2;-><init>(Landroidx/camera/camera2/internal/p2;Ljava/util/List;Lr/a0;Ls/g;)V

    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    .line 8
    new-instance p2, Landroidx/camera/camera2/internal/p2$a;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/p2$a;-><init>(Landroidx/camera/camera2/internal/p2;)V

    .line 9
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    .line 10
    invoke-static {p1, p2, p3}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 11
    iget-object p1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    invoke-static {p1}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 12
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

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->g:Lr/g;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Lr/g;->b(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public n(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->n(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public o(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->o(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public p(Landroidx/camera/camera2/internal/j2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/p2;->l:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Landroidx/camera/camera2/internal/p2;->l:Z

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    const-string v2, "Need to call openCaptureSession before using this API."

    invoke-static {v1, v2}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->b()V

    if-eqz v1, :cond_1

    .line 8
    new-instance v0, Landroidx/camera/camera2/internal/n2;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/n2;-><init>(Landroidx/camera/camera2/internal/p2;Landroidx/camera/camera2/internal/j2;)V

    .line 9
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 10
    invoke-interface {v1, v0, p1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public q(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->b()V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v0, p0}, Landroidx/camera/camera2/internal/t1;->j(Landroidx/camera/camera2/internal/j2;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->q(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public r(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v0, p0}, Landroidx/camera/camera2/internal/t1;->k(Landroidx/camera/camera2/internal/j2;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->r(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public s(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j2$a;->s(Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method

.method public stop()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    :try_start_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    iget-boolean v3, p0, Landroidx/camera/camera2/internal/p2;->m:Z

    if-nez v3, :cond_1

    .line 3
    iget-object v3, p0, Landroidx/camera/camera2/internal/p2;->j:Lcom/google/common/util/concurrent/m;

    if-eqz v3, :cond_0

    move-object v1, v3

    .line 4
    :cond_0
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/p2;->m:Z

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/p2;->C()Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_3

    .line 6
    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    return v3

    :catchall_0
    move-exception v3

    .line 7
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    if-eqz v1, :cond_4

    .line 8
    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 9
    :cond_4
    throw v2
.end method

.method t(Landroidx/camera/camera2/internal/j2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/p2;->n:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Landroidx/camera/camera2/internal/p2;->n:Z

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    const-string v2, "Need to call openCaptureSession before using this API."

    invoke-static {v1, v2}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->h:Lcom/google/common/util/concurrent/m;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 7
    new-instance v0, Landroidx/camera/camera2/internal/m2;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/m2;-><init>(Landroidx/camera/camera2/internal/p2;Landroidx/camera/camera2/internal/j2;)V

    .line 8
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 9
    invoke-interface {v1, v0, p1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public u(Landroidx/camera/camera2/internal/j2;Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->f:Landroidx/camera/camera2/internal/j2$a;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/camera2/internal/j2$a;->u(Landroidx/camera/camera2/internal/j2;Landroid/view/Surface;)V

    return-void
.end method
