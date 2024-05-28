.class final Landroidx/camera/camera2/internal/y2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/camera/camera2/internal/t;

.field private final b:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Z

.field private final d:Ljava/util/concurrent/Executor;

.field private e:Z

.field f:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field g:Z


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/t;Lr/z;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/y2;->a:Landroidx/camera/camera2/internal/t;

    .line 3
    iput-object p3, p0, Landroidx/camera/camera2/internal/y2;->d:Ljava/util/concurrent/Executor;

    .line 4
    invoke-static {p2}, Lu/f;->c(Lr/z;)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/camera/camera2/internal/y2;->c:Z

    .line 5
    new-instance p2, Landroidx/lifecycle/r;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/y2;->b:Landroidx/lifecycle/r;

    .line 6
    new-instance p2, Landroidx/camera/camera2/internal/x2;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/x2;-><init>(Landroidx/camera/camera2/internal/y2;)V

    .line 7
    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/t;->s(Landroidx/camera/camera2/internal/t$c;)V

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/y2;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/y2;->d(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private synthetic d(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    .line 3
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/y2;->g:Z

    if-ne p1, v0, :cond_1

    .line 6
    iget-object p1, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 7
    iput-object v0, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    :cond_1
    return v1
.end method

.method private f(Landroidx/lifecycle/r;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/r<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroidx/lifecycle/r;->o(Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/lifecycle/r;->m(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method b(Landroidx/concurrent/futures/c$a;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/y2;->c:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    .line 3
    :cond_1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/y2;->e:Z

    if-nez v0, :cond_3

    .line 4
    iget-object p2, p0, Landroidx/camera/camera2/internal/y2;->b:Landroidx/lifecycle/r;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Landroidx/camera/camera2/internal/y2;->f(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    .line 5
    new-instance p2, Landroidx/camera/core/m;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_2
    return-void

    .line 6
    :cond_3
    iput-boolean p2, p0, Landroidx/camera/camera2/internal/y2;->g:Z

    .line 7
    iget-object v0, p0, Landroidx/camera/camera2/internal/y2;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0, p2}, Landroidx/camera/camera2/internal/t;->v(Z)V

    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/y2;->b:Landroidx/lifecycle/r;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, v0, p2}, Landroidx/camera/camera2/internal/y2;->f(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    .line 9
    iget-object p2, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    if-eqz p2, :cond_4

    .line 10
    new-instance v0, Landroidx/camera/core/m;

    const-string v1, "There is a new enableTorch being set"

    invoke-direct {v0, v1}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 11
    :cond_4
    iput-object p1, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    return-void
.end method

.method c()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/y2;->b:Landroidx/lifecycle/r;

    return-object v0
.end method

.method e(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/y2;->e:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/y2;->e:Z

    if-nez p1, :cond_2

    .line 3
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/y2;->g:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/y2;->g:Z

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/y2;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/t;->v(Z)V

    .line 6
    iget-object v0, p0, Landroidx/camera/camera2/internal/y2;->b:Landroidx/lifecycle/r;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/y2;->f(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    .line 7
    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_2

    .line 8
    new-instance v0, Landroidx/camera/core/m;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/camera/camera2/internal/y2;->f:Landroidx/concurrent/futures/c$a;

    :cond_2
    return-void
.end method
