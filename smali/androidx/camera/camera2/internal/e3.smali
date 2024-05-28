.class final Landroidx/camera/camera2/internal/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/b3;


# instance fields
.field final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Landroidx/camera/core/l1;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Z

.field private e:Z

.field f:Landroidx/camera/core/l2;

.field private g:Lw/r0;

.field h:Landroid/media/ImageWriter;


# direct methods
.method constructor <init>(Lr/z;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/e3;->a:Ljava/util/Queue;

    .line 3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/e3;->b:Ljava/util/Queue;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->c:Z

    .line 5
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->d:Z

    .line 6
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->e:Z

    const/4 v0, 0x7

    .line 7
    invoke-static {p1, v0}, Landroidx/camera/camera2/internal/g3;->a(Lr/z;I)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->d:Z

    const/4 v0, 0x4

    .line 8
    invoke-static {p1, v0}, Landroidx/camera/camera2/internal/g3;->a(Lr/z;I)Z

    move-result p1

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/e3;->e:Z

    return-void
.end method

.method public static synthetic e(Landroidx/camera/camera2/internal/e3;Lw/h1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/e3;->g(Lw/h1;)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->a:Ljava/util/Queue;

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/l1;

    .line 4
    invoke-interface {v1}, Landroidx/camera/core/l1;->close()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->b:Ljava/util/Queue;

    .line 6
    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 7
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->g:Lw/r0;

    if-eqz v0, :cond_2

    .line 8
    iget-object v1, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    if-eqz v1, :cond_1

    .line 9
    invoke-virtual {v0}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v2

    .line 10
    new-instance v3, Landroidx/camera/camera2/internal/c3;

    invoke-direct {v3, v1}, Landroidx/camera/camera2/internal/c3;-><init>(Landroidx/camera/core/l2;)V

    .line 11
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    .line 12
    invoke-interface {v2, v3, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 13
    :cond_1
    invoke-virtual {v0}, Lw/r0;->c()V

    .line 14
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->h:Landroid/media/ImageWriter;

    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {v0}, Landroid/media/ImageWriter;->close()V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Landroidx/camera/camera2/internal/e3;->h:Landroid/media/ImageWriter;

    :cond_3
    return-void
.end method

.method private synthetic g(Lw/h1;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lw/h1;->c()Landroidx/camera/core/l1;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;Lw/c2$b;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->c:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->d:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->e:Z

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/e3;->f()V

    .line 4
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/e3;->d:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x23

    goto :goto_0

    :cond_2
    const/16 v0, 0x22

    .line 5
    :goto_0
    new-instance v1, Landroidx/camera/core/l2;

    .line 6
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    .line 7
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v3, 0x2

    .line 8
    invoke-static {v2, p1, v0, v3}, Landroidx/camera/core/n1;->a(IIII)Lw/h1;

    move-result-object p1

    invoke-direct {v1, p1}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    iput-object v1, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 9
    new-instance p1, Landroidx/camera/camera2/internal/d3;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/d3;-><init>(Landroidx/camera/camera2/internal/e3;)V

    .line 10
    invoke-static {}, Lx/a;->c()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 11
    invoke-virtual {v1, p1, v2}, Landroidx/camera/core/l2;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    .line 12
    new-instance p1, Lw/i1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 13
    invoke-virtual {v1}, Landroidx/camera/core/l2;->a()Landroid/view/Surface;

    move-result-object v1

    new-instance v2, Landroid/util/Size;

    iget-object v3, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 14
    invoke-virtual {v3}, Landroidx/camera/core/l2;->g()I

    move-result v3

    iget-object v4, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 15
    invoke-virtual {v4}, Landroidx/camera/core/l2;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    invoke-direct {p1, v1, v2, v0}, Lw/i1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/e3;->g:Lw/r0;

    .line 16
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 17
    invoke-virtual {p1}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 18
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/camera/camera2/internal/c3;

    invoke-direct {v1, v0}, Landroidx/camera/camera2/internal/c3;-><init>(Landroidx/camera/core/l2;)V

    .line 19
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    .line 20
    invoke-interface {p1, v1, v0}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 21
    iget-object p1, p0, Landroidx/camera/camera2/internal/e3;->g:Lw/r0;

    invoke-virtual {p2, p1}, Lw/c2$b;->k(Lw/r0;)V

    .line 22
    new-instance p1, Landroidx/camera/camera2/internal/e3$a;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/e3$a;-><init>(Landroidx/camera/camera2/internal/e3;)V

    invoke-virtual {p2, p1}, Lw/c2$b;->d(Lw/h;)V

    .line 23
    new-instance p1, Landroidx/camera/camera2/internal/e3$b;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/e3$b;-><init>(Landroidx/camera/camera2/internal/e3;)V

    invoke-virtual {p2, p1}, Lw/c2$b;->j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    .line 24
    new-instance p1, Landroid/hardware/camera2/params/InputConfiguration;

    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 25
    invoke-virtual {v0}, Landroidx/camera/core/l2;->g()I

    move-result v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 26
    invoke-virtual {v1}, Landroidx/camera/core/l2;->getHeight()I

    move-result v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/e3;->f:Landroidx/camera/core/l2;

    .line 27
    invoke-virtual {v2}, Landroidx/camera/core/l2;->d()I

    move-result v2

    invoke-direct {p1, v0, v1, v2}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 28
    invoke-virtual {p2, p1}, Lw/c2$b;->r(Landroid/hardware/camera2/params/InputConfiguration;)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/e3;->c:Z

    return-void
.end method

.method public c(Landroidx/camera/core/l1;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroidx/camera/core/l1;->J()Landroid/media/Image;

    move-result-object p1

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->h:Landroid/media/ImageWriter;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 3
    invoke-static {v0, p1}, La0/a;->e(Landroid/media/ImageWriter;Landroid/media/Image;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()Landroidx/camera/core/l1;
    .locals 1

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/l1;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
