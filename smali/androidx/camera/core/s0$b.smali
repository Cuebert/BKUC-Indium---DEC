.class Landroidx/camera/core/s0$b;
.super Landroidx/camera/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final p:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/camera/core/s0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/core/l1;Landroidx/camera/core/s0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/i0;-><init>(Landroidx/camera/core/l1;)V

    .line 2
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/core/s0$b;->p:Ljava/lang/ref/WeakReference;

    .line 3
    new-instance p1, Landroidx/camera/core/t0;

    invoke-direct {p1, p0}, Landroidx/camera/core/t0;-><init>(Landroidx/camera/core/s0$b;)V

    invoke-virtual {p0, p1}, Landroidx/camera/core/i0;->b(Landroidx/camera/core/i0$a;)V

    return-void
.end method

.method public static synthetic e(Landroidx/camera/core/s0$b;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/s0$b;->z(Landroidx/camera/core/l1;)V

    return-void
.end method

.method public static synthetic i(Landroidx/camera/core/s0;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/s0$b;->l(Landroidx/camera/core/s0;)V

    return-void
.end method

.method private static synthetic l(Landroidx/camera/core/s0;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/s0;->A()V

    return-void
.end method

.method private synthetic z(Landroidx/camera/core/l1;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/camera/core/s0$b;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/s0;

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p1, Landroidx/camera/core/s0;->u:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/core/u0;

    invoke-direct {v1, p1}, Landroidx/camera/core/u0;-><init>(Landroidx/camera/core/s0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
