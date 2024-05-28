.class public Lu/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/u$b;,
        Lu/u$c;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/Object;

.field private final c:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field d:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private final f:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;


# direct methods
.method public constructor <init>(Lw/y1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu/u;->b:Ljava/lang/Object;

    .line 3
    new-instance v0, Lu/u$a;

    invoke-direct {v0, p0}, Lu/u$a;-><init>(Lu/u;)V

    iput-object v0, p0, Lu/u;->f:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 4
    const-class v0, Lt/i;

    invoke-virtual {p1, v0}, Lw/y1;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, Lu/u;->a:Z

    .line 5
    invoke-virtual {p0}, Lu/u;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Lu/s;

    invoke-direct {p1, p0}, Lu/s;-><init>(Lu/u;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Lu/u;->c:Lcom/google/common/util/concurrent/m;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 7
    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Lu/u;->c:Lcom/google/common/util/concurrent/m;

    :goto_0
    return-void
.end method

.method public static synthetic a(Lu/u;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lu/u;->d(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lu/u$b;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu/u;->e(Lu/u$b;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lu/u;->d:Landroidx/concurrent/futures/c$a;

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "WaitForRepeatingRequestStart["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic e(Lu/u$b;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-interface {p0, p1, p2, p3}, Lu/u$b;->a(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu/u;->c:Lcom/google/common/util/concurrent/m;

    invoke-static {v0}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu/u;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lu/u;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lu/u;->e:Z

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lu/u;->c:Lcom/google/common/util/concurrent/m;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 4
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

.method public g(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;Ljava/util/List;Lu/u$b;)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ls/g;",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/j2;",
            ">;",
            "Lu/u$b;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2;

    .line 3
    invoke-interface {v1}, Landroidx/camera/camera2/internal/j2;->h()Lcom/google/common/util/concurrent/m;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {v0}, Ly/f;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/m;

    move-result-object p4

    invoke-static {p4}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object p4

    new-instance v0, Lu/t;

    invoke-direct {v0, p5, p1, p2, p3}, Lu/t;-><init>(Lu/u$b;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)V

    .line 5
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 6
    invoke-virtual {p4, v0, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Lu/u$c;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lu/u;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lu/u;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    const/4 v2, 0x0

    .line 3
    iget-object v3, p0, Lu/u;->f:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v1}, Landroidx/camera/camera2/internal/k0;->b([Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    .line 4
    iput-boolean v2, p0, Lu/u;->e:Z

    .line 5
    :cond_0
    invoke-interface {p3, p1, p2}, Lu/u$c;->a(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lu/u;->a:Z

    return v0
.end method
