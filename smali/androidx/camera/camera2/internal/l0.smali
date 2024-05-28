.class Landroidx/camera/camera2/internal/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k0$b;


# static fields
.field static final a:Landroidx/camera/camera2/internal/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/l0;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/l0;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/l0;->a:Landroidx/camera/camera2/internal/l0;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lw/o2;Lw/k0$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;",
            "Lw/k0$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-interface {p1, v0}, Lw/o2;->i(Lw/k0;)Lw/k0;

    move-result-object v0

    .line 2
    invoke-static {}, Lw/u1;->I()Lw/u1;

    move-result-object v1

    .line 3
    invoke-static {}, Lw/k0;->a()Lw/k0;

    move-result-object v2

    invoke-virtual {v2}, Lw/k0;->g()I

    move-result v2

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lw/k0;->g()I

    move-result v2

    .line 5
    invoke-virtual {v0}, Lw/k0;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v1}, Lw/k0$a;->a(Ljava/util/Collection;)V

    .line 6
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object v1

    .line 7
    :cond_0
    invoke-virtual {p2, v1}, Lw/k0$a;->o(Lw/o0;)V

    .line 8
    new-instance v0, Lq/a;

    invoke-direct {v0, p1}, Lq/a;-><init>(Lw/o0;)V

    .line 9
    invoke-virtual {v0, v2}, Lq/a;->L(I)I

    move-result p1

    invoke-virtual {p2, p1}, Lw/k0$a;->p(I)V

    .line 10
    invoke-static {}, Landroidx/camera/camera2/internal/k0;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Lq/a;->O(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    .line 12
    invoke-static {p1}, Landroidx/camera/camera2/internal/l1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/internal/l1;

    move-result-object p1

    .line 13
    invoke-virtual {p2, p1}, Lw/k0$a;->c(Lw/h;)V

    .line 14
    invoke-virtual {v0}, Lq/a;->J()Lv/j;

    move-result-object p1

    invoke-virtual {p2, p1}, Lw/k0$a;->e(Lw/o0;)V

    return-void
.end method
