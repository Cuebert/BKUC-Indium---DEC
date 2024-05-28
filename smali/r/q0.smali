.class Lr/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/m0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/q0$a;
    }
.end annotation


# instance fields
.field final a:Landroid/hardware/camera2/CameraManager;

.field final b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "camera"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    iput-object p1, p0, Lr/q0;->a:Landroid/hardware/camera2/CameraManager;

    .line 3
    iput-object p2, p0, Lr/q0;->b:Ljava/lang/Object;

    return-void
.end method

.method static f(Landroid/content/Context;Landroid/os/Handler;)Lr/q0;
    .locals 2

    new-instance v0, Lr/q0;

    new-instance v1, Lr/q0$a;

    invoke-direct {v1, p1}, Lr/q0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, Lr/q0;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 3

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 1
    iget-object v1, p0, Lr/q0;->b:Ljava/lang/Object;

    check-cast v1, Lr/q0$a;

    if-eqz p2, :cond_1

    .line 2
    iget-object v2, v1, Lr/q0$a;->a:Ljava/util/Map;

    monitor-enter v2

    .line 3
    :try_start_0
    iget-object v0, v1, Lr/q0$a;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/m0$a;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lr/m0$a;

    invoke-direct {v0, p1, p2}, Lr/m0$a;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 5
    iget-object p1, v1, Lr/q0$a;->a:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 7
    :cond_1
    :goto_0
    iget-object p1, p0, Lr/q0;->a:Landroid/hardware/camera2/CameraManager;

    iget-object p2, v1, Lr/q0$a;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0, p2}, Landroid/hardware/camera2/CameraManager;->registerAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;Landroid/os/Handler;)V

    return-void

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "executor was null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lr/q0;->b:Ljava/lang/Object;

    check-cast v0, Lr/q0$a;

    .line 2
    iget-object v1, v0, Lr/q0$a;->a:Ljava/util/Map;

    monitor-enter v1

    .line 3
    :try_start_0
    iget-object v0, v0, Lr/q0$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/m0$a;

    .line 4
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lr/m0$a;->g()V

    .line 6
    :cond_1
    iget-object v0, p0, Lr/q0;->a:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method

.method public c(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lr/q0;->a:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p1
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2
    invoke-static {p1}, Lr/f;->e(Landroid/hardware/camera2/CameraAccessException;)Lr/f;

    move-result-object p1

    throw p1
.end method

.method public d(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p3}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v0, Lr/a0$b;

    invoke-direct {v0, p2, p3}, Lr/a0$b;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    .line 4
    iget-object p2, p0, Lr/q0;->b:Ljava/lang/Object;

    check-cast p2, Lr/q0$a;

    .line 5
    :try_start_0
    iget-object p3, p0, Lr/q0;->a:Landroid/hardware/camera2/CameraManager;

    iget-object p2, p2, Lr/q0$a;->b:Landroid/os/Handler;

    invoke-virtual {p3, p1, v0, p2}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 6
    invoke-static {p1}, Lr/f;->e(Landroid/hardware/camera2/CameraAccessException;)Lr/f;

    move-result-object p1

    throw p1
.end method

.method public e()[Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lr/q0;->a:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lr/f;->e(Landroid/hardware/camera2/CameraAccessException;)Lr/f;

    move-result-object v0

    throw v0
.end method
