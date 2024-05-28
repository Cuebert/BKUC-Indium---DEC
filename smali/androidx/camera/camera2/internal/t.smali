.class public Landroidx/camera/camera2/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/t$a;,
        Landroidx/camera/camera2/internal/t$b;,
        Landroidx/camera/camera2/internal/t$c;
    }
.end annotation


# instance fields
.field final b:Landroidx/camera/camera2/internal/t$b;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/lang/Object;

.field private final e:Lr/z;

.field private final f:Lw/y$c;

.field private final g:Lw/c2$b;

.field private final h:Landroidx/camera/camera2/internal/z1;

.field private final i:Landroidx/camera/camera2/internal/z2;

.field private final j:Landroidx/camera/camera2/internal/y2;

.field private final k:Landroidx/camera/camera2/internal/w1;

.field l:Landroidx/camera/camera2/internal/b3;

.field private final m:Lv/g;

.field private final n:Landroidx/camera/camera2/internal/o0;

.field private o:I

.field private volatile p:Z

.field private volatile q:I

.field private final r:Lu/a;

.field private final s:Lu/b;

.field private final t:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile u:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private v:I

.field private w:J

.field private final x:Landroidx/camera/camera2/internal/t$a;


# direct methods
.method constructor <init>(Lr/z;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Lw/y$c;Lw/y1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/t;->d:Ljava/lang/Object;

    .line 3
    new-instance v0, Lw/c2$b;

    invoke-direct {v0}, Lw/c2$b;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/t;->g:Lw/c2$b;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Landroidx/camera/camera2/internal/t;->o:I

    .line 5
    iput-boolean v1, p0, Landroidx/camera/camera2/internal/t;->p:Z

    const/4 v1, 0x2

    .line 6
    iput v1, p0, Landroidx/camera/camera2/internal/t;->q:I

    .line 7
    new-instance v1, Lu/b;

    invoke-direct {v1}, Lu/b;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/t;->s:Lu/b;

    .line 8
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v1, p0, Landroidx/camera/camera2/internal/t;->t:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/camera2/internal/t;->u:Lcom/google/common/util/concurrent/m;

    const/4 v1, 0x1

    .line 10
    iput v1, p0, Landroidx/camera/camera2/internal/t;->v:I

    .line 11
    iput-wide v2, p0, Landroidx/camera/camera2/internal/t;->w:J

    .line 12
    new-instance v1, Landroidx/camera/camera2/internal/t$a;

    invoke-direct {v1}, Landroidx/camera/camera2/internal/t$a;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/t;->x:Landroidx/camera/camera2/internal/t$a;

    .line 13
    iput-object p1, p0, Landroidx/camera/camera2/internal/t;->e:Lr/z;

    .line 14
    iput-object p4, p0, Landroidx/camera/camera2/internal/t;->f:Lw/y$c;

    .line 15
    iput-object p3, p0, Landroidx/camera/camera2/internal/t;->c:Ljava/util/concurrent/Executor;

    .line 16
    new-instance p4, Landroidx/camera/camera2/internal/t$b;

    invoke-direct {p4, p3}, Landroidx/camera/camera2/internal/t$b;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/t;->b:Landroidx/camera/camera2/internal/t$b;

    .line 17
    iget v2, p0, Landroidx/camera/camera2/internal/t;->v:I

    invoke-virtual {v0, v2}, Lw/c2$b;->s(I)V

    .line 18
    invoke-static {p4}, Landroidx/camera/camera2/internal/l1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/internal/l1;

    move-result-object p4

    .line 19
    invoke-virtual {v0, p4}, Lw/c2$b;->i(Lw/h;)V

    .line 20
    invoke-virtual {v0, v1}, Lw/c2$b;->i(Lw/h;)V

    .line 21
    new-instance p4, Landroidx/camera/camera2/internal/w1;

    invoke-direct {p4, p0, p1, p3}, Landroidx/camera/camera2/internal/w1;-><init>(Landroidx/camera/camera2/internal/t;Lr/z;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/t;->k:Landroidx/camera/camera2/internal/w1;

    .line 22
    new-instance p4, Landroidx/camera/camera2/internal/z1;

    invoke-direct {p4, p0, p2, p3, p5}, Landroidx/camera/camera2/internal/z1;-><init>(Landroidx/camera/camera2/internal/t;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Lw/y1;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/t;->h:Landroidx/camera/camera2/internal/z1;

    .line 23
    new-instance p2, Landroidx/camera/camera2/internal/z2;

    invoke-direct {p2, p0, p1, p3}, Landroidx/camera/camera2/internal/z2;-><init>(Landroidx/camera/camera2/internal/t;Lr/z;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->i:Landroidx/camera/camera2/internal/z2;

    .line 24
    new-instance p2, Landroidx/camera/camera2/internal/y2;

    invoke-direct {p2, p0, p1, p3}, Landroidx/camera/camera2/internal/y2;-><init>(Landroidx/camera/camera2/internal/t;Lr/z;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->j:Landroidx/camera/camera2/internal/y2;

    .line 25
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x17

    if-lt p2, p4, :cond_0

    .line 26
    new-instance p2, Landroidx/camera/camera2/internal/e3;

    invoke-direct {p2, p1}, Landroidx/camera/camera2/internal/e3;-><init>(Lr/z;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->l:Landroidx/camera/camera2/internal/b3;

    goto :goto_0

    .line 27
    :cond_0
    new-instance p2, Landroidx/camera/camera2/internal/f3;

    invoke-direct {p2}, Landroidx/camera/camera2/internal/f3;-><init>()V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->l:Landroidx/camera/camera2/internal/b3;

    .line 28
    :goto_0
    new-instance p2, Lu/a;

    invoke-direct {p2, p5}, Lu/a;-><init>(Lw/y1;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->r:Lu/a;

    .line 29
    new-instance p2, Lv/g;

    invoke-direct {p2, p0, p3}, Lv/g;-><init>(Landroidx/camera/camera2/internal/t;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    .line 30
    new-instance p2, Landroidx/camera/camera2/internal/o0;

    invoke-direct {p2, p0, p1, p5, p3}, Landroidx/camera/camera2/internal/o0;-><init>(Landroidx/camera/camera2/internal/t;Lr/z;Lw/y1;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->n:Landroidx/camera/camera2/internal/o0;

    .line 31
    new-instance p1, Landroidx/camera/camera2/internal/k;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/k;-><init>(Landroidx/camera/camera2/internal/t;)V

    invoke-interface {p3, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private C(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method private I()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/t;->E()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private J(I[I)Z
    .locals 4

    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p2, v2

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method static K(Landroid/hardware/camera2/TotalCaptureResult;J)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p0

    .line 3
    instance-of v0, p0, Lw/j2;

    if-eqz v0, :cond_2

    .line 4
    check-cast p0, Lw/j2;

    const-string v0, "CameraControlSessionUpdateId"

    .line 5
    invoke-virtual {p0, v0}, Lw/j2;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    if-nez p0, :cond_1

    return v1

    .line 6
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p0, v2, p1

    if-ltz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static synthetic M()V
    .locals 0

    return-void
.end method

.method private synthetic N(Ljava/util/concurrent/Executor;Lw/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->x:Landroidx/camera/camera2/internal/t$a;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/camera2/internal/t$a;->g(Ljava/util/concurrent/Executor;Lw/h;)V

    return-void
.end method

.method private static synthetic O()V
    .locals 0

    return-void
.end method

.method private synthetic P()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->l()Landroidx/camera/camera2/internal/t$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/t;->s(Landroidx/camera/camera2/internal/t$c;)V

    return-void
.end method

.method private synthetic Q(Lw/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->x:Landroidx/camera/camera2/internal/t$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/t$a;->k(Lw/h;)V

    return-void
.end method

.method private synthetic R(Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/m;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p5, p0, Landroidx/camera/camera2/internal/t;->n:Landroidx/camera/camera2/internal/o0;

    invoke-virtual {p5, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/o0;->d(Ljava/util/List;III)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic S(Landroidx/concurrent/futures/c$a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/t;->f0()J

    move-result-wide v0

    .line 2
    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/t;->g0(J)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    invoke-static {v0, p1}, Ly/f;->k(Lcom/google/common/util/concurrent/m;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private synthetic T(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/l;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/l;-><init>(Landroidx/camera/camera2/internal/t;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "updateSessionConfigAsync"

    return-object p1
.end method

.method private static synthetic U(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    .line 1
    invoke-static {p3, p0, p1}, Landroidx/camera/camera2/internal/t;->K(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 2
    invoke-virtual {p2, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private synthetic V(JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/f;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/f;-><init>(JLandroidx/concurrent/futures/c$a;)V

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/t;->s(Landroidx/camera/camera2/internal/t$c;)V

    .line 2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "waitForSessionUpdateId:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private g0(J)Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/i;

    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/camera2/internal/i;-><init>(Landroidx/camera/camera2/internal/t;J)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic i(Landroidx/camera/camera2/internal/t;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/t;->S(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic j(Landroidx/camera/camera2/internal/t;Lw/h;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/t;->Q(Lw/h;)V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/camera2/internal/t;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/t;->T(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/t;->U(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic m(Landroidx/camera/camera2/internal/t;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/t;->P()V

    return-void
.end method

.method public static synthetic n(Landroidx/camera/camera2/internal/t;Ljava/util/concurrent/Executor;Lw/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/t;->N(Ljava/util/concurrent/Executor;Lw/h;)V

    return-void
.end method

.method public static synthetic o(Landroidx/camera/camera2/internal/t;Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/camera2/internal/t;->R(Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Landroidx/camera/camera2/internal/t;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/t;->V(JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q()V
    .locals 0

    invoke-static {}, Landroidx/camera/camera2/internal/t;->O()V

    return-void
.end method

.method public static synthetic r()V
    .locals 0

    invoke-static {}, Landroidx/camera/camera2/internal/t;->M()V

    return-void
.end method


# virtual methods
.method A(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method B(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x4

    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    return p1

    :cond_2
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/t;->J(I[I)Z

    move-result v0

    if-eqz v0, :cond_3

    return p1

    :cond_3
    return v1
.end method

.method public D()Landroidx/camera/camera2/internal/y2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->j:Landroidx/camera/camera2/internal/y2;

    return-object v0
.end method

.method E()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/t;->o:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public F()Landroidx/camera/camera2/internal/z2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->i:Landroidx/camera/camera2/internal/z2;

    return-object v0
.end method

.method public G()Landroidx/camera/camera2/internal/b3;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->l:Landroidx/camera/camera2/internal/b3;

    return-object v0
.end method

.method H()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/t;->o:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/camera/camera2/internal/t;->o:I

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method L()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/t;->p:Z

    return v0
.end method

.method W(Landroidx/camera/camera2/internal/t$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->b:Landroidx/camera/camera2/internal/t$b;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/t$b;->d(Landroidx/camera/camera2/internal/t$c;)V

    return-void
.end method

.method X(Lw/h;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/n;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/n;-><init>(Landroidx/camera/camera2/internal/t;Lw/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method Y()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/t;->b0(I)V

    return-void
.end method

.method Z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->h:Landroidx/camera/camera2/internal/z1;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/z1;->l(Z)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->i:Landroidx/camera/camera2/internal/z2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/z2;->f(Z)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->j:Landroidx/camera/camera2/internal/y2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/y2;->e(Z)V

    .line 4
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->k:Landroidx/camera/camera2/internal/w1;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/w1;->b(Z)V

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    invoke-virtual {v0, p1}, Lv/g;->s(Z)V

    return-void
.end method

.method public a(Landroid/util/Size;Lw/c2$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->l:Landroidx/camera/camera2/internal/b3;

    invoke-interface {v0, p1, p2}, Landroidx/camera/camera2/internal/b3;->a(Landroid/util/Size;Lw/c2$b;)V

    return-void
.end method

.method public a0(Landroid/util/Rational;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->h:Landroidx/camera/camera2/internal/z1;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/z1;->m(Landroid/util/Rational;)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->l:Landroidx/camera/camera2/internal/b3;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/b3;->b(Z)V

    return-void
.end method

.method b0(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/camera/camera2/internal/t;->v:I

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->h:Landroidx/camera/camera2/internal/z1;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/z1;->n(I)V

    .line 3
    iget-object p1, p0, Landroidx/camera/camera2/internal/t;->n:Landroidx/camera/camera2/internal/o0;

    iget v0, p0, Landroidx/camera/camera2/internal/t;->v:I

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/o0;->c(I)V

    return-void
.end method

.method public c()Lw/o0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->k()Lq/a;

    move-result-object v0

    return-object v0
.end method

.method c0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->f:Lw/y$c;

    invoke-interface {v0, p1}, Lw/y$c;->b(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;II)Lcom/google/common/util/concurrent/m;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;II)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/t;->I()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string p2, "Camera is not active."

    .line 2
    invoke-static {p1, p2}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p1, Landroidx/camera/core/m;

    invoke-direct {p1, p2}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/t;->w()I

    move-result v4

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->u:Lcom/google/common/util/concurrent/m;

    invoke-static {v0}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object v6

    new-instance v7, Landroidx/camera/camera2/internal/g;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Landroidx/camera/camera2/internal/g;-><init>(Landroidx/camera/camera2/internal/t;Ljava/util/List;III)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/t;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v6, v7, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    return-object p1
.end method

.method public d0()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/j;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/j;-><init>(Landroidx/camera/camera2/internal/t;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v0

    .line 2
    sget-object v1, Landroidx/camera/camera2/internal/o;->n:Landroidx/camera/camera2/internal/o;

    .line 3
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 4
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method e0()Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/h;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/h;-><init>(Landroidx/camera/camera2/internal/t;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    .line 2
    invoke-static {v0}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    return-object v0
.end method

.method public f(Lw/o0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    .line 2
    invoke-static {p1}, Lv/j$a;->e(Lw/o0;)Lv/j$a;

    move-result-object p1

    invoke-virtual {p1}, Lv/j$a;->d()Lv/j;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Lv/g;->g(Lv/j;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 4
    sget-object v0, Landroidx/camera/camera2/internal/p;->n:Landroidx/camera/camera2/internal/p;

    .line 5
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 6
    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method f0()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->t:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/camera/camera2/internal/t;->w:J

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->f:Lw/y$c;

    invoke-interface {v0}, Lw/y$c;->a()V

    .line 3
    iget-wide v0, p0, Landroidx/camera/camera2/internal/t;->w:J

    return-wide v0
.end method

.method public g()Landroid/graphics/Rect;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 3
    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method

.method public h(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/t;->I()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string v0, "Camera is not active."

    .line 2
    invoke-static {p1, v0}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iput p1, p0, Landroidx/camera/camera2/internal/t;->q:I

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/t;->e0()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/t;->u:Lcom/google/common/util/concurrent/m;

    return-void
.end method

.method s(Landroidx/camera/camera2/internal/t$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->b:Landroidx/camera/camera2/internal/t$b;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/t$b;->b(Landroidx/camera/camera2/internal/t$c;)V

    return-void
.end method

.method t(Ljava/util/concurrent/Executor;Lw/h;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/m;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/m;-><init>(Landroidx/camera/camera2/internal/t;Ljava/util/concurrent/Executor;Lw/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method u()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/t;->o:I

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    .line 3
    iput v1, p0, Landroidx/camera/camera2/internal/t;->o:I

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Decrementing use count occurs more times than incrementing"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method v(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/t;->p:Z

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lw/k0$a;

    invoke-direct {p1}, Lw/k0$a;-><init>()V

    .line 3
    iget v0, p0, Landroidx/camera/camera2/internal/t;->v:I

    invoke-virtual {p1, v0}, Lw/k0$a;->p(I)V

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Lw/k0$a;->q(Z)V

    .line 5
    new-instance v1, Lq/a$a;

    invoke-direct {v1}, Lq/a$a;-><init>()V

    .line 6
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 7
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/t;->A(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 8
    invoke-virtual {v1, v2, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 9
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 11
    invoke-virtual {v1, v0, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 12
    invoke-virtual {v1}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lw/k0$a;->e(Lw/o0;)V

    .line 13
    invoke-virtual {p1}, Lw/k0$a;->h()Lw/k0;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/t;->c0(Ljava/util/List;)V

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/t;->f0()J

    return-void
.end method

.method public w()I
    .locals 1

    iget v0, p0, Landroidx/camera/camera2/internal/t;->q:I

    return v0
.end method

.method public x()Landroidx/camera/camera2/internal/z1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->h:Landroidx/camera/camera2/internal/z1;

    return-object v0
.end method

.method public y()Lw/c2;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->g:Lw/c2$b;

    iget v1, p0, Landroidx/camera/camera2/internal/t;->v:I

    invoke-virtual {v0, v1}, Lw/c2$b;->s(I)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->g:Lw/c2$b;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/t;->z()Lw/o0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/c2$b;->q(Lw/o0;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->k()Lq/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq/a;->K(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->g:Lw/c2$b;

    const-string v2, "Camera2CameraControl"

    invoke-virtual {v1, v2, v0}, Lw/c2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->g:Lw/c2$b;

    iget-wide v1, p0, Landroidx/camera/camera2/internal/t;->w:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "CameraControlSessionUpdateId"

    invoke-virtual {v0, v2, v1}, Lw/c2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->g:Lw/c2$b;

    invoke-virtual {v0}, Lw/c2$b;->m()Lw/c2;

    move-result-object v0

    return-object v0
.end method

.method z()Lw/o0;
    .locals 7

    .line 1
    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    .line 2
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 4
    invoke-virtual {v0, v1, v3}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->h:Landroidx/camera/camera2/internal/z1;

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/z1;->b(Lq/a$a;)V

    .line 6
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->r:Lu/a;

    invoke-virtual {v1, v0}, Lu/a;->a(Lq/a$a;)V

    .line 7
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->i:Landroidx/camera/camera2/internal/z2;

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/z2;->a(Lq/a$a;)V

    .line 8
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/t;->p:Z

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    .line 9
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 11
    invoke-virtual {v0, v1, v3}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    goto :goto_0

    .line 12
    :cond_0
    iget v1, p0, Landroidx/camera/camera2/internal/t;->q:I

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    goto :goto_1

    .line 13
    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->s:Lu/b;

    invoke-virtual {v1, v3}, Lu/b;->a(I)I

    move-result v1

    .line 14
    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/t;->A(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 15
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 16
    invoke-direct {p0, v2}, Landroidx/camera/camera2/internal/t;->C(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 18
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->k:Landroidx/camera/camera2/internal/w1;

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/w1;->c(Lq/a$a;)V

    .line 19
    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->m:Lv/g;

    invoke-virtual {v1}, Lv/g;->k()Lq/a;

    move-result-object v1

    .line 20
    invoke-interface {v1}, Lw/o0;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/o0$a;

    .line 21
    invoke-virtual {v0}, Lq/a$a;->a()Lw/p1;

    move-result-object v4

    sget-object v5, Lw/o0$c;->n:Lw/o0$c;

    .line 22
    invoke-interface {v1, v3}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v6

    .line 23
    invoke-interface {v4, v3, v5, v6}, Lw/p1;->G(Lw/o0$a;Lw/o0$c;Ljava/lang/Object;)V

    goto :goto_2

    .line 24
    :cond_3
    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    return-object v0
.end method
