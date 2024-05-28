.class Landroidx/camera/camera2/internal/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final u:[Landroid/hardware/camera2/params/MeteringRectangle;


# instance fields
.field private final a:Landroidx/camera/camera2/internal/t;

.field final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private volatile d:Z

.field private volatile e:Landroid/util/Rational;

.field private final f:Lu/k;

.field private g:Z

.field h:Ljava/lang/Integer;

.field private i:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field j:J

.field k:Z

.field l:Z

.field private m:I

.field private n:Landroidx/camera/camera2/internal/t$c;

.field private o:Landroidx/camera/camera2/internal/t$c;

.field private p:[Landroid/hardware/camera2/params/MeteringRectangle;

.field private q:[Landroid/hardware/camera2/params/MeteringRectangle;

.field private r:[Landroid/hardware/camera2/params/MeteringRectangle;

.field s:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field t:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/hardware/camera2/params/MeteringRectangle;

    sput-object v0, Landroidx/camera/camera2/internal/z1;->u:[Landroid/hardware/camera2/params/MeteringRectangle;

    return-void
.end method

.method constructor <init>(Landroidx/camera/camera2/internal/t;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Lw/y1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Landroidx/camera/camera2/internal/z1;->e:Landroid/util/Rational;

    .line 4
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->g:Z

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/camera2/internal/z1;->h:Ljava/lang/Integer;

    const-wide/16 v2, 0x0

    .line 6
    iput-wide v2, p0, Landroidx/camera/camera2/internal/z1;->j:J

    .line 7
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->k:Z

    .line 8
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->l:Z

    const/4 v0, 0x1

    .line 9
    iput v0, p0, Landroidx/camera/camera2/internal/z1;->m:I

    .line 10
    iput-object v1, p0, Landroidx/camera/camera2/internal/z1;->n:Landroidx/camera/camera2/internal/t$c;

    .line 11
    iput-object v1, p0, Landroidx/camera/camera2/internal/z1;->o:Landroidx/camera/camera2/internal/t$c;

    .line 12
    sget-object v0, Landroidx/camera/camera2/internal/z1;->u:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, Landroidx/camera/camera2/internal/z1;->p:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 13
    iput-object v0, p0, Landroidx/camera/camera2/internal/z1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 14
    iput-object v0, p0, Landroidx/camera/camera2/internal/z1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 15
    iput-object v1, p0, Landroidx/camera/camera2/internal/z1;->s:Landroidx/concurrent/futures/c$a;

    .line 16
    iput-object v1, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    .line 17
    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    .line 18
    iput-object p3, p0, Landroidx/camera/camera2/internal/z1;->b:Ljava/util/concurrent/Executor;

    .line 19
    iput-object p2, p0, Landroidx/camera/camera2/internal/z1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    new-instance p1, Lu/k;

    invoke-direct {p1, p4}, Lu/k;-><init>(Lw/y1;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->f:Lu/k;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/z1;IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/z1;->k(IJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 3
    iput-object v1, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->i:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/camera2/internal/z1;->i:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    iget-object v1, p0, Landroidx/camera/camera2/internal/z1;->n:Landroidx/camera/camera2/internal/t$c;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/t;->W(Landroidx/camera/camera2/internal/t$c;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->s:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Landroidx/camera/core/m;

    invoke-direct {v1, p1}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->s:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    iget-object v1, p0, Landroidx/camera/camera2/internal/z1;->o:Landroidx/camera/camera2/internal/t$c;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/t;->W(Landroidx/camera/camera2/internal/t$c;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Landroidx/camera/core/m;

    invoke-direct {v1, p1}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method private synthetic k(IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p4, v0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 3
    invoke-static {p4, p2, p3}, Landroidx/camera/camera2/internal/t;->K(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-direct {p0}, Landroidx/camera/camera2/internal/z1;->f()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private o()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->p:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method b(Lq/a$a;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/z1;->j()I

    move-result v0

    .line 3
    :goto_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v2, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    .line 4
    invoke-virtual {v2, v0}, Landroidx/camera/camera2/internal/t;->B(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 6
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->p:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_1

    .line 7
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 8
    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_2

    .line 9
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 10
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_3

    .line 11
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_3
    return-void
.end method

.method c(ZZ)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lw/k0$a;

    invoke-direct {v0}, Lw/k0$a;-><init>()V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lw/k0$a;->q(Z)V

    .line 4
    iget v1, p0, Landroidx/camera/camera2/internal/z1;->m:I

    invoke-virtual {v0, v1}, Lw/k0$a;->p(I)V

    .line 5
    new-instance v1, Lq/a$a;

    invoke-direct {v1}, Lq/a$a;-><init>()V

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    .line 6
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 8
    invoke-virtual {v1, p1, v3}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 9
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt p1, v3, :cond_2

    if-eqz p2, :cond_2

    .line 10
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 12
    invoke-virtual {v1, p1, p2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 13
    :cond_2
    invoke-virtual {v1}, Lq/a$a;->c()Lq/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw/k0$a;->e(Lw/o0;)V

    .line 14
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0}, Lw/k0$a;->h()Lw/k0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/t;->c0(Ljava/util/List;)V

    return-void
.end method

.method d(Landroidx/concurrent/futures/c$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Cancelled by another cancelFocusAndMetering()"

    .line 1
    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/z1;->i(Ljava/lang/String;)V

    const-string v0, "Cancelled by cancelFocusAndMetering()"

    .line 2
    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/z1;->h(Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    .line 4
    invoke-direct {p0}, Landroidx/camera/camera2/internal/z1;->g()V

    .line 5
    invoke-direct {p0}, Landroidx/camera/camera2/internal/z1;->o()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/z1;->c(ZZ)V

    .line 7
    :cond_0
    sget-object p1, Landroidx/camera/camera2/internal/z1;->u:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->p:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 8
    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 9
    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 10
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->g:Z

    .line 11
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->f0()J

    move-result-wide v0

    .line 12
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->t:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_1

    .line 13
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/z1;->j()I

    move-result v2

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/t;->B(I)I

    move-result p1

    .line 14
    new-instance v2, Landroidx/camera/camera2/internal/y1;

    invoke-direct {v2, p0, p1, v0, v1}, Landroidx/camera/camera2/internal/y1;-><init>(Landroidx/camera/camera2/internal/z1;IJ)V

    iput-object v2, p0, Landroidx/camera/camera2/internal/z1;->o:Landroidx/camera/camera2/internal/t$c;

    .line 15
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/t;->s(Landroidx/camera/camera2/internal/t$c;)V

    :cond_1
    return-void
.end method

.method e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/z1;->d(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method j()I
    .locals 2

    iget v0, p0, Landroidx/camera/camera2/internal/z1;->m:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    return v0

    :cond_0
    return v1
.end method

.method l(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    .line 3
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    if-nez p1, :cond_1

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/z1;->e()V

    :cond_1
    return-void
.end method

.method public m(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->e:Landroid/util/Rational;

    return-void
.end method

.method n(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/camera2/internal/z1;->m:I

    return-void
.end method

.method p(Landroidx/concurrent/futures/c$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Landroidx/camera/core/m;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    .line 3
    :cond_1
    new-instance v0, Lw/k0$a;

    invoke-direct {v0}, Lw/k0$a;-><init>()V

    .line 4
    iget v1, p0, Landroidx/camera/camera2/internal/z1;->m:I

    invoke-virtual {v0, v1}, Lw/k0$a;->p(I)V

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lw/k0$a;->q(Z)V

    .line 6
    new-instance v2, Lq/a$a;

    invoke-direct {v2}, Lq/a$a;-><init>()V

    .line 7
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 9
    invoke-virtual {v2, v3, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 10
    invoke-virtual {v2}, Lq/a$a;->c()Lq/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/k0$a;->e(Lw/o0;)V

    .line 11
    new-instance v1, Landroidx/camera/camera2/internal/z1$b;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/z1$b;-><init>(Landroidx/camera/camera2/internal/z1;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {v0, v1}, Lw/k0$a;->c(Lw/h;)V

    .line 12
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0}, Lw/k0$a;->h()Lw/k0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/t;->c0(Ljava/util/List;)V

    return-void
.end method

.method q(Landroidx/concurrent/futures/c$a;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Lw/q;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/z1;->d:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    new-instance p2, Landroidx/camera/core/m;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    .line 3
    :cond_1
    new-instance v0, Lw/k0$a;

    invoke-direct {v0}, Lw/k0$a;-><init>()V

    .line 4
    iget v1, p0, Landroidx/camera/camera2/internal/z1;->m:I

    invoke-virtual {v0, v1}, Lw/k0$a;->p(I)V

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lw/k0$a;->q(Z)V

    .line 6
    new-instance v2, Lq/a$a;

    invoke-direct {v2}, Lq/a$a;-><init>()V

    .line 7
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 9
    invoke-virtual {v2, v3, v4}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    if-eqz p2, :cond_2

    .line 10
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v3, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    .line 11
    invoke-virtual {v3, v1}, Landroidx/camera/camera2/internal/t;->A(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 12
    invoke-virtual {v2, p2, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 13
    :cond_2
    invoke-virtual {v2}, Lq/a$a;->c()Lq/a;

    move-result-object p2

    invoke-virtual {v0, p2}, Lw/k0$a;->e(Lw/o0;)V

    .line 14
    new-instance p2, Landroidx/camera/camera2/internal/z1$a;

    invoke-direct {p2, p0, p1}, Landroidx/camera/camera2/internal/z1$a;-><init>(Landroidx/camera/camera2/internal/z1;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {v0, p2}, Lw/k0$a;->c(Lw/h;)V

    .line 15
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0}, Lw/k0$a;->h()Lw/k0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/t;->c0(Ljava/util/List;)V

    return-void
.end method
