.class Landroidx/camera/camera2/internal/e3$a;
.super Lw/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/e3;->a(Landroid/util/Size;Lw/c2$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/e3;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/e3;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/e3$a;->a:Landroidx/camera/camera2/internal/e3;

    invoke-direct {p0}, Lw/h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw/q;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lw/h;->b(Lw/q;)V

    .line 2
    invoke-interface {p1}, Lw/q;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    instance-of v0, p1, Landroid/hardware/camera2/TotalCaptureResult;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3$a;->a:Landroidx/camera/camera2/internal/e3;

    iget-object v0, v0, Landroidx/camera/camera2/internal/e3;->b:Ljava/util/Queue;

    check-cast p1, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
