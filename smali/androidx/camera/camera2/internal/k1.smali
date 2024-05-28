.class final Landroidx/camera/camera2/internal/k1;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# instance fields
.field private final a:Lw/h;


# direct methods
.method constructor <init>(Lw/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    const-string v0, "cameraCaptureCallback is null"

    .line 2
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Landroidx/camera/camera2/internal/k1;->a:Lw/h;

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    .line 2
    invoke-virtual {p2}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    instance-of p2, p1, Lw/j2;

    const-string v0, "The tagBundle object from the CaptureResult is not a TagBundle object."

    invoke-static {p2, v0}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 4
    check-cast p1, Lw/j2;

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lw/j2;->a()Lw/j2;

    move-result-object p1

    .line 6
    :goto_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/k1;->a:Lw/h;

    new-instance v0, Landroidx/camera/camera2/internal/e;

    invoke-direct {v0, p1, p3}, Landroidx/camera/camera2/internal/e;-><init>(Lw/j2;Landroid/hardware/camera2/CaptureResult;)V

    invoke-virtual {p2, v0}, Lw/h;->b(Lw/q;)V

    return-void
.end method

.method public onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    .line 2
    new-instance p1, Lw/j;

    sget-object p2, Lw/j$a;->n:Lw/j$a;

    invoke-direct {p1, p2}, Lw/j;-><init>(Lw/j$a;)V

    .line 3
    iget-object p2, p0, Landroidx/camera/camera2/internal/k1;->a:Lw/h;

    invoke-virtual {p2, p1}, Lw/h;->c(Lw/j;)V

    return-void
.end method
