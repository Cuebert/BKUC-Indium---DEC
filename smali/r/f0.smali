.class Lr/f0;
.super Lr/i0;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr/i0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-void
.end method

.method static g(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/f0;
    .locals 2

    new-instance v0, Lr/f0;

    new-instance v1, Lr/i0$a;

    invoke-direct {v1, p1}, Lr/i0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, Lr/f0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Ls/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lr/i0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, p1}, Lr/i0;->c(Landroid/hardware/camera2/CameraDevice;Ls/g;)V

    .line 2
    new-instance v0, Lr/g$c;

    .line 3
    invoke-virtual {p1}, Ls/g;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1}, Ls/g;->e()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lr/g$c;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    .line 4
    invoke-virtual {p1}, Ls/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lr/i0;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lr/i0;->b:Ljava/lang/Object;

    check-cast v2, Lr/i0$a;

    .line 6
    invoke-static {v2}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/i0$a;

    iget-object v2, v2, Lr/i0$a;->a:Landroid/os/Handler;

    .line 7
    invoke-virtual {p1}, Ls/g;->b()Ls/a;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 8
    :try_start_0
    invoke-virtual {v3}, Ls/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/InputConfiguration;

    .line 9
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v3, p0, Lr/i0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v3, p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createReprocessableCaptureSession(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Ls/g;->d()I

    move-result p1

    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    .line 12
    iget-object p1, p0, Lr/i0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object p1, p0, Lr/i0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p0, p1, v1, v0, v2}, Lr/i0;->e(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lr/f;->e(Landroid/hardware/camera2/CameraAccessException;)Lr/f;

    move-result-object p1

    throw p1
.end method
