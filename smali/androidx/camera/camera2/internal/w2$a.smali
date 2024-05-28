.class Landroidx/camera/camera2/internal/w2$a;
.super Landroidx/camera/camera2/internal/j2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/w2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;


# direct methods
.method constructor <init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j2$a;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-void
.end method

.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {p1}, Landroidx/camera/camera2/internal/f1;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/w2$a;-><init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-void
.end method


# virtual methods
.method public n(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public o(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-static {v0, p1}, Lr/d;->b(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public p(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public q(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public r(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public s(Landroidx/camera/camera2/internal/j2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method t(Landroidx/camera/camera2/internal/j2;)V
    .locals 0

    return-void
.end method

.method public u(Landroidx/camera/camera2/internal/j2;Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->i()Lr/g;

    move-result-object p1

    invoke-virtual {p1}, Lr/g;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    .line 3
    invoke-static {v0, p1, p2}, Lr/b;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
