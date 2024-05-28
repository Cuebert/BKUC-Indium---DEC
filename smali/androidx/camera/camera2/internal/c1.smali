.class final Landroidx/camera/camera2/internal/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/c2$d;


# static fields
.field static final a:Landroidx/camera/camera2/internal/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/c1;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/c1;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/c1;->a:Landroidx/camera/camera2/internal/c1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lw/o2;Lw/c2$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;",
            "Lw/c2$b;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-interface {p1, v0}, Lw/o2;->w(Lw/c2;)Lw/c2;

    move-result-object v1

    .line 2
    invoke-static {}, Lw/u1;->I()Lw/u1;

    move-result-object v2

    .line 3
    invoke-static {}, Lw/c2;->a()Lw/c2;

    move-result-object v3

    invoke-virtual {v3}, Lw/c2;->k()I

    move-result v3

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lw/c2;->k()I

    move-result v3

    .line 5
    invoke-virtual {v1}, Lw/c2;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Lw/c2$b;->a(Ljava/util/Collection;)V

    .line 6
    invoke-virtual {v1}, Lw/c2;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Lw/c2$b;->c(Ljava/util/List;)V

    .line 7
    invoke-virtual {v1}, Lw/c2;->f()Ljava/util/List;

    move-result-object v2

    .line 8
    invoke-virtual {p2, v2}, Lw/c2$b;->b(Ljava/util/Collection;)V

    .line 9
    invoke-virtual {v1}, Lw/c2;->d()Lw/o0;

    move-result-object v2

    .line 10
    :cond_0
    invoke-virtual {p2, v2}, Lw/c2$b;->q(Lw/o0;)V

    .line 11
    new-instance v1, Lq/a;

    invoke-direct {v1, p1}, Lq/a;-><init>(Lw/o0;)V

    .line 12
    invoke-virtual {v1, v3}, Lq/a;->L(I)I

    move-result p1

    invoke-virtual {p2, p1}, Lw/c2$b;->s(I)V

    .line 13
    invoke-static {}, Landroidx/camera/camera2/internal/g1;->b()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Lq/a;->M(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object p1

    .line 15
    invoke-virtual {p2, p1}, Lw/c2$b;->e(Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    .line 16
    invoke-static {}, Landroidx/camera/camera2/internal/f1;->b()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Lq/a;->P(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p1

    .line 18
    invoke-virtual {p2, p1}, Lw/c2$b;->j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    .line 19
    invoke-static {}, Landroidx/camera/camera2/internal/k0;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    .line 20
    invoke-virtual {v1, p1}, Lq/a;->O(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    .line 21
    invoke-static {p1}, Landroidx/camera/camera2/internal/l1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/internal/l1;

    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Lw/c2$b;->d(Lw/h;)V

    .line 23
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object p1

    .line 24
    sget-object v2, Lq/a;->E:Lw/o0$a;

    .line 25
    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lq/a;->I(Lq/c;)Lq/c;

    move-result-object v3

    .line 26
    invoke-virtual {p1, v2, v3}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 27
    sget-object v2, Lq/a;->G:Lw/o0$a;

    .line 28
    invoke-virtual {v1, v0}, Lq/a;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-virtual {p1, v2, v0}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 30
    invoke-virtual {p2, p1}, Lw/c2$b;->g(Lw/o0;)V

    .line 31
    invoke-virtual {v1}, Lq/a;->J()Lv/j;

    move-result-object p1

    invoke-virtual {p2, p1}, Lw/c2$b;->g(Lw/o0;)V

    return-void
.end method
