.class Lu/u$a;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu/u;


# direct methods
.method constructor <init>(Lu/u;)V
    .locals 0

    iput-object p1, p0, Lu/u$a;->a:Lu/u;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureSequenceAborted(Landroid/hardware/camera2/CameraCaptureSession;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lu/u$a;->a:Lu/u;

    iget-object p1, p1, Lu/u;->d:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/concurrent/futures/c$a;->d()Z

    .line 3
    iget-object p1, p0, Lu/u$a;->a:Lu/u;

    const/4 p2, 0x0

    iput-object p2, p1, Lu/u;->d:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method public onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lu/u$a;->a:Lu/u;

    iget-object p1, p1, Lu/u;->d:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Lu/u$a;->a:Lu/u;

    iput-object p2, p1, Lu/u;->d:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method
