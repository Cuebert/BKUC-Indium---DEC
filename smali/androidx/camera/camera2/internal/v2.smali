.class final Landroidx/camera/camera2/internal/v2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/v2$b;,
        Landroidx/camera/camera2/internal/v2$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/v2$b;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/v2$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/v2;->a:Landroidx/camera/camera2/internal/v2$b;

    return-void
.end method


# virtual methods
.method a(ILjava/util/List;Landroidx/camera/camera2/internal/j2$a;)Ls/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ls/b;",
            ">;",
            "Landroidx/camera/camera2/internal/j2$a;",
            ")",
            "Ls/g;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/v2;->a:Landroidx/camera/camera2/internal/v2$b;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/v2$b;->d(ILjava/util/List;Landroidx/camera/camera2/internal/j2$a;)Ls/g;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/v2;->a:Landroidx/camera/camera2/internal/v2$b;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/v2$b;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method c(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ls/g;",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/v2;->a:Landroidx/camera/camera2/internal/v2$b;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/v2$b;->l(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method d(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;J)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/v2;->a:Landroidx/camera/camera2/internal/v2$b;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/v2$b;->f(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method e()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/v2;->a:Landroidx/camera/camera2/internal/v2$b;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/v2$b;->stop()Z

    move-result v0

    return v0
.end method
