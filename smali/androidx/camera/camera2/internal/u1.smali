.class final Landroidx/camera/camera2/internal/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/z2$b;


# instance fields
.field private final a:Lr/z;

.field private b:Landroid/graphics/Rect;

.field private c:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lr/z;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->b:Landroid/graphics/Rect;

    .line 3
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->d:Landroid/graphics/Rect;

    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/u1;->a:Lr/z;

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u1;->c:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    .line 4
    :goto_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/u1;->d:Landroid/graphics/Rect;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1, p1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Landroidx/camera/camera2/internal/u1;->c:Landroidx/concurrent/futures/c$a;

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 7
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->c:Landroidx/concurrent/futures/c$a;

    .line 8
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->d:Landroid/graphics/Rect;

    :cond_1
    return-void
.end method

.method public b()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u1;->a:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u1;->d()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u1;->d()F

    move-result v0

    return v0

    .line 4
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public c(Lq/a$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/u1;->b:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_0
    return-void
.end method

.method public d()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public e()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->d:Landroid/graphics/Rect;

    .line 2
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->b:Landroid/graphics/Rect;

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/u1;->c:Landroidx/concurrent/futures/c$a;

    if-eqz v1, :cond_0

    .line 4
    new-instance v2, Landroidx/camera/core/m;

    const-string v3, "Camera is not active."

    invoke-direct {v2, v3}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, v2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 6
    iput-object v0, p0, Landroidx/camera/camera2/internal/u1;->c:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method
