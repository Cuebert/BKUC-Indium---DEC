.class interface abstract Landroidx/camera/camera2/internal/v2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "b"
.end annotation


# virtual methods
.method public abstract c()Ljava/util/concurrent/Executor;
.end method

.method public abstract d(ILjava/util/List;Landroidx/camera/camera2/internal/j2$a;)Ls/g;
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
.end method

.method public abstract f(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;
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
.end method

.method public abstract l(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
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
.end method

.method public abstract stop()Z
.end method
