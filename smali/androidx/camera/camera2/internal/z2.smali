.class final Landroidx/camera/camera2/internal/z2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/z2$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/t;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/camera/camera2/internal/a3;

.field private final d:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Landroidx/camera/core/f3;",
            ">;"
        }
    .end annotation
.end field

.field final e:Landroidx/camera/camera2/internal/z2$b;

.field private f:Z

.field private g:Landroidx/camera/camera2/internal/t$c;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/t;Lr/z;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/z2;->f:Z

    .line 3
    new-instance v0, Landroidx/camera/camera2/internal/z2$a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/z2$a;-><init>(Landroidx/camera/camera2/internal/z2;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/z2;->g:Landroidx/camera/camera2/internal/t$c;

    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/z2;->a:Landroidx/camera/camera2/internal/t;

    .line 5
    iput-object p3, p0, Landroidx/camera/camera2/internal/z2;->b:Ljava/util/concurrent/Executor;

    .line 6
    invoke-static {p2}, Landroidx/camera/camera2/internal/z2;->b(Lr/z;)Landroidx/camera/camera2/internal/z2$b;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/camera2/internal/z2;->e:Landroidx/camera/camera2/internal/z2$b;

    .line 7
    new-instance p3, Landroidx/camera/camera2/internal/a3;

    invoke-interface {p2}, Landroidx/camera/camera2/internal/z2$b;->b()F

    move-result v0

    invoke-interface {p2}, Landroidx/camera/camera2/internal/z2$b;->d()F

    move-result p2

    invoke-direct {p3, v0, p2}, Landroidx/camera/camera2/internal/a3;-><init>(FF)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/z2;->c:Landroidx/camera/camera2/internal/a3;

    const/high16 p2, 0x3f800000    # 1.0f

    .line 8
    invoke-virtual {p3, p2}, Landroidx/camera/camera2/internal/a3;->f(F)V

    .line 9
    new-instance p2, Landroidx/lifecycle/r;

    invoke-static {p3}, Lz/f;->e(Landroidx/camera/core/f3;)Landroidx/camera/core/f3;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/z2;->d:Landroidx/lifecycle/r;

    .line 10
    iget-object p2, p0, Landroidx/camera/camera2/internal/z2;->g:Landroidx/camera/camera2/internal/t$c;

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/t;->s(Landroidx/camera/camera2/internal/t$c;)V

    return-void
.end method

.method private static b(Lr/z;)Landroidx/camera/camera2/internal/z2$b;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/camera/camera2/internal/z2;->e(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroidx/camera/camera2/internal/a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/a;-><init>(Lr/z;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Landroidx/camera/camera2/internal/u1;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/u1;-><init>(Lr/z;)V

    return-object v0
.end method

.method private static c(Lr/z;)Landroid/util/Range;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/z;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_ZOOM_RATIO_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/Range;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "ZoomControl"

    const-string v1, "AssertionError, fail to get camera characteristic."

    .line 2
    invoke-static {v0, v1, p0}, Landroidx/camera/core/q1;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method static e(Lr/z;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/camera/camera2/internal/z2;->c(Lr/z;)Landroid/util/Range;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private g(Landroidx/camera/core/f3;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/z2;->d:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->o(Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/z2;->d:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->m(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method a(Lq/a$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/z2;->e:Landroidx/camera/camera2/internal/z2$b;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/z2$b;->c(Lq/a$a;)V

    return-void
.end method

.method d()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/camera/core/f3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/z2;->d:Landroidx/lifecycle/r;

    return-object v0
.end method

.method f(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/z2;->f:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/z2;->f:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Landroidx/camera/camera2/internal/z2;->c:Landroidx/camera/camera2/internal/a3;

    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/z2;->c:Landroidx/camera/camera2/internal/a3;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/a3;->f(F)V

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/z2;->c:Landroidx/camera/camera2/internal/a3;

    invoke-static {v0}, Lz/f;->e(Landroidx/camera/core/f3;)Landroidx/camera/core/f3;

    move-result-object v0

    .line 6
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/z2;->g(Landroidx/camera/core/f3;)V

    .line 8
    iget-object p1, p0, Landroidx/camera/camera2/internal/z2;->e:Landroidx/camera/camera2/internal/z2$b;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/z2$b;->e()V

    .line 9
    iget-object p1, p0, Landroidx/camera/camera2/internal/z2;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->f0()J

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
