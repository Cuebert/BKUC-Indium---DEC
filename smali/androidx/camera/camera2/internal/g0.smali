.class final Landroidx/camera/camera2/internal/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/g0$e;,
        Landroidx/camera/camera2/internal/g0$d;,
        Landroidx/camera/camera2/internal/g0$g;,
        Landroidx/camera/camera2/internal/g0$h;,
        Landroidx/camera/camera2/internal/g0$f;
    }
.end annotation


# instance fields
.field final A:Ljava/util/concurrent/atomic/AtomicInteger;

.field B:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field final C:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/camera2/internal/r1;",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field private final D:Landroidx/camera/camera2/internal/g0$d;

.field private final E:Lw/g0;

.field final F:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/camera2/internal/q1;",
            ">;"
        }
    .end annotation
.end field

.field private G:Landroidx/camera/camera2/internal/c2;

.field private final H:Landroidx/camera/camera2/internal/t1;

.field private final I:Landroidx/camera/camera2/internal/v2$a;

.field private final J:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private K:Lw/t;

.field final L:Ljava/lang/Object;

.field private M:Lw/d2;

.field N:Z

.field private final O:Landroidx/camera/camera2/internal/v1;

.field private final n:Lw/m2;

.field private final o:Lr/m0;

.field private final p:Ljava/util/concurrent/Executor;

.field private final q:Ljava/util/concurrent/ScheduledExecutorService;

.field volatile r:Landroidx/camera/camera2/internal/g0$f;

.field private final s:Lw/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/n1<",
            "Lw/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Landroidx/camera/camera2/internal/i1;

.field private final u:Landroidx/camera/camera2/internal/t;

.field private final v:Landroidx/camera/camera2/internal/g0$g;

.field final w:Landroidx/camera/camera2/internal/j0;

.field x:Landroid/hardware/camera2/CameraDevice;

.field y:I

.field z:Landroidx/camera/camera2/internal/r1;


# direct methods
.method constructor <init>(Lr/m0;Ljava/lang/String;Landroidx/camera/camera2/internal/j0;Lw/g0;Ljava/util/concurrent/Executor;Landroid/os/Handler;Landroidx/camera/camera2/internal/v1;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/u;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v5, Landroidx/camera/camera2/internal/g0$f;->n:Landroidx/camera/camera2/internal/g0$f;

    iput-object v5, v1, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    .line 3
    new-instance v5, Lw/n1;

    invoke-direct {v5}, Lw/n1;-><init>()V

    iput-object v5, v1, Landroidx/camera/camera2/internal/g0;->s:Lw/n1;

    const/4 v6, 0x0

    .line 4
    iput v6, v1, Landroidx/camera/camera2/internal/g0;->y:I

    .line 5
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v7, v1, Landroidx/camera/camera2/internal/g0;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/g0;->C:Ljava/util/Map;

    .line 7
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/g0;->F:Ljava/util/Set;

    .line 8
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/g0;->J:Ljava/util/Set;

    .line 9
    new-instance v7, Ljava/lang/Object;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/g0;->L:Ljava/lang/Object;

    .line 10
    iput-boolean v6, v1, Landroidx/camera/camera2/internal/g0;->N:Z

    .line 11
    iput-object v0, v1, Landroidx/camera/camera2/internal/g0;->o:Lr/m0;

    .line 12
    iput-object v4, v1, Landroidx/camera/camera2/internal/g0;->E:Lw/g0;

    .line 13
    invoke-static/range {p6 .. p6}, Lx/a;->e(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    iput-object v6, v1, Landroidx/camera/camera2/internal/g0;->q:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    invoke-static/range {p5 .. p5}, Lx/a;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v7

    iput-object v7, v1, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    .line 15
    new-instance v8, Landroidx/camera/camera2/internal/g0$g;

    invoke-direct {v8, v1, v7, v6}, Landroidx/camera/camera2/internal/g0$g;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v8, v1, Landroidx/camera/camera2/internal/g0;->v:Landroidx/camera/camera2/internal/g0$g;

    .line 16
    new-instance v8, Lw/m2;

    invoke-direct {v8, v2}, Lw/m2;-><init>(Ljava/lang/String;)V

    iput-object v8, v1, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    .line 17
    sget-object v8, Lw/d0$a;->s:Lw/d0$a;

    invoke-virtual {v5, v8}, Lw/n1;->g(Ljava/lang/Object;)V

    .line 18
    new-instance v5, Landroidx/camera/camera2/internal/i1;

    invoke-direct {v5, v4}, Landroidx/camera/camera2/internal/i1;-><init>(Lw/g0;)V

    iput-object v5, v1, Landroidx/camera/camera2/internal/g0;->t:Landroidx/camera/camera2/internal/i1;

    .line 19
    new-instance v14, Landroidx/camera/camera2/internal/t1;

    invoke-direct {v14, v7}, Landroidx/camera/camera2/internal/t1;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v14, v1, Landroidx/camera/camera2/internal/g0;->H:Landroidx/camera/camera2/internal/t1;

    move-object/from16 v8, p7

    .line 20
    iput-object v8, v1, Landroidx/camera/camera2/internal/g0;->O:Landroidx/camera/camera2/internal/v1;

    .line 21
    invoke-direct/range {p0 .. p0}, Landroidx/camera/camera2/internal/g0;->V()Landroidx/camera/camera2/internal/r1;

    move-result-object v8

    iput-object v8, v1, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    .line 22
    :try_start_0
    invoke-virtual/range {p1 .. p2}, Lr/m0;->c(Ljava/lang/String;)Lr/z;

    move-result-object v9

    .line 23
    new-instance v15, Landroidx/camera/camera2/internal/t;

    new-instance v12, Landroidx/camera/camera2/internal/g0$e;

    invoke-direct {v12, v1}, Landroidx/camera/camera2/internal/g0$e;-><init>(Landroidx/camera/camera2/internal/g0;)V

    .line 24
    invoke-virtual/range {p3 .. p3}, Landroidx/camera/camera2/internal/j0;->g()Lw/y1;

    move-result-object v13

    move-object v8, v15

    move-object v10, v6

    move-object v11, v7

    invoke-direct/range {v8 .. v13}, Landroidx/camera/camera2/internal/t;-><init>(Lr/z;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Lw/y$c;Lw/y1;)V

    iput-object v15, v1, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    .line 25
    iput-object v3, v1, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    .line 26
    invoke-virtual {v3, v15}, Landroidx/camera/camera2/internal/j0;->k(Landroidx/camera/camera2/internal/t;)V

    .line 27
    invoke-virtual {v5}, Landroidx/camera/camera2/internal/i1;->a()Landroidx/lifecycle/LiveData;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/camera/camera2/internal/j0;->n(Landroidx/lifecycle/LiveData;)V
    :try_end_0
    .catch Lr/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    new-instance v5, Landroidx/camera/camera2/internal/v2$a;

    .line 29
    invoke-virtual/range {p3 .. p3}, Landroidx/camera/camera2/internal/j0;->g()Lw/y1;

    move-result-object v13

    invoke-static {}, Lt/l;->b()Lw/y1;

    move-result-object v3

    move-object v8, v5

    move-object v9, v7

    move-object v10, v6

    move-object/from16 v11, p6

    move-object v12, v14

    move-object v14, v3

    invoke-direct/range {v8 .. v14}, Landroidx/camera/camera2/internal/v2$a;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Landroidx/camera/camera2/internal/t1;Lw/y1;Lw/y1;)V

    iput-object v5, v1, Landroidx/camera/camera2/internal/g0;->I:Landroidx/camera/camera2/internal/v2$a;

    .line 30
    new-instance v3, Landroidx/camera/camera2/internal/g0$d;

    invoke-direct {v3, v1, v2}, Landroidx/camera/camera2/internal/g0$d;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;)V

    iput-object v3, v1, Landroidx/camera/camera2/internal/g0;->D:Landroidx/camera/camera2/internal/g0$d;

    .line 31
    invoke-virtual {v4, v1, v7, v3}, Lw/g0;->e(Landroidx/camera/core/k;Ljava/util/concurrent/Executor;Lw/g0$b;)V

    .line 32
    invoke-virtual {v0, v7, v3}, Lr/m0;->f(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void

    :catch_0
    move-exception v0

    .line 33
    invoke-static {v0}, Landroidx/camera/camera2/internal/j1;->a(Lr/f;)Landroidx/camera/core/u;

    move-result-object v0

    throw v0
.end method

.method private A()V
    .locals 3

    const-string v0, "Closing camera."

    .line 1
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    sget-object v0, Landroidx/camera/camera2/internal/g0$c;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->v:Landroidx/camera/camera2/internal/g0$g;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$g;->a()Z

    move-result v0

    .line 5
    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    if-eqz v0, :cond_4

    .line 6
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->K()Z

    move-result v0

    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->G()V

    goto :goto_0

    .line 8
    :cond_1
    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 9
    invoke-virtual {p0, v2}, Landroidx/camera/camera2/internal/g0;->z(Z)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    if-nez v0, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Landroidx/core/util/h;->h(Z)V

    .line 11
    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->n:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private B(Z)V
    .locals 5

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/q1;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/q1;-><init>()V

    .line 2
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->F:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->f0(Z)V

    .line 4
    new-instance p1, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    .line 5
    invoke-virtual {p1, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 6
    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 7
    new-instance v2, Landroidx/camera/camera2/internal/w;

    invoke-direct {v2, v1, p1}, Landroidx/camera/camera2/internal/w;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    .line 8
    new-instance p1, Lw/c2$b;

    invoke-direct {p1}, Lw/c2$b;-><init>()V

    .line 9
    new-instance v3, Lw/i1;

    invoke-direct {v3, v1}, Lw/i1;-><init>(Landroid/view/Surface;)V

    .line 10
    invoke-virtual {p1, v3}, Lw/c2$b;->h(Lw/r0;)V

    const/4 v1, 0x1

    .line 11
    invoke-virtual {p1, v1}, Lw/c2$b;->s(I)V

    const-string v1, "Start configAndClose."

    .line 12
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lw/c2$b;->m()Lw/c2;

    move-result-object p1

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    .line 14
    invoke-static {v1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/CameraDevice;

    iget-object v4, p0, Landroidx/camera/camera2/internal/g0;->I:Landroidx/camera/camera2/internal/v2$a;

    invoke-virtual {v4}, Landroidx/camera/camera2/internal/v2$a;->a()Landroidx/camera/camera2/internal/v2;

    move-result-object v4

    .line 15
    invoke-virtual {v0, p1, v1, v4}, Landroidx/camera/camera2/internal/q1;->f(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 16
    new-instance v1, Landroidx/camera/camera2/internal/x;

    invoke-direct {v1, p0, v0, v3, v2}, Landroidx/camera/camera2/internal/x;-><init>(Landroidx/camera/camera2/internal/g0;Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v1, v0}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private C()Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0}, Lw/m2;->e()Lw/c2$f;

    move-result-object v0

    invoke-virtual {v0}, Lw/c2$f;->b()Lw/c2;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lw/c2;->b()Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->H:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/t1;->c()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->v:Landroidx/camera/camera2/internal/g0$g;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-static {v1}, Landroidx/camera/camera2/internal/g1;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    return-object v0
.end method

.method private E(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "{%s} %s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    .line 2
    invoke-static {v0, p1, p2}, Landroidx/camera/core/q1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static H(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN ERROR"

    return-object p0

    :cond_0
    const-string p0, "ERROR_CAMERA_SERVICE"

    return-object p0

    :cond_1
    const-string p0, "ERROR_CAMERA_DEVICE"

    return-object p0

    :cond_2
    const-string p0, "ERROR_CAMERA_DISABLED"

    return-object p0

    :cond_3
    const-string p0, "ERROR_MAX_CAMERAS_IN_USE"

    return-object p0

    :cond_4
    const-string p0, "ERROR_CAMERA_IN_USE"

    return-object p0

    :cond_5
    const-string p0, "ERROR_NONE"

    return-object p0
.end method

.method static I(Landroidx/camera/core/y2;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/camera/core/y2;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private J()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->h()Lw/b0;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/j0;

    .line 2
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/j0;->j()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic L(Ljava/util/List;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->l0(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->u()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/t;->u()V

    .line 3
    throw p1
.end method

.method private static synthetic M(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    .line 2
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method private synthetic N(Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/g0;->c0(Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic O(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->m0(Ljava/util/Collection;)V

    return-void
.end method

.method private synthetic P(Ljava/lang/String;Lw/c2;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0, p1, p2}, Lw/m2;->m(Ljava/lang/String;Lw/c2;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0, p1, p2}, Lw/m2;->q(Ljava/lang/String;Lw/c2;)V

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->p0()V

    return-void
.end method

.method private synthetic Q(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " INACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0, p1}, Lw/m2;->p(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->p0()V

    return-void
.end method

.method private synthetic R(Ljava/lang/String;Lw/c2;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " RESET"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0, p1, p2}, Lw/m2;->q(Ljava/lang/String;Lw/c2;)V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->f0(Z)V

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->p0()V

    .line 5
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object p2, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    if-ne p1, p2, :cond_0

    .line 6
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->Z()V

    :cond_0
    return-void
.end method

.method private synthetic S(Ljava/lang/String;Lw/c2;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " UPDATED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0, p1, p2}, Lw/m2;->q(Ljava/lang/String;Lw/c2;)V

    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->p0()V

    return-void
.end method

.method private static synthetic T(Lw/c2$c;Lw/c2;)V
    .locals 1

    sget-object v0, Lw/c2$e;->n:Lw/c2$e;

    invoke-interface {p0, p1, v0}, Lw/c2$c;->a(Lw/c2;Lw/c2$e;)V

    return-void
.end method

.method private synthetic U(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/g0;->N:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->o:Landroidx/camera/camera2/internal/g0$f;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->n0(Z)V

    :cond_0
    return-void
.end method

.method private V()Landroidx/camera/camera2/internal/r1;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->L:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->M:Lw/d2;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Landroidx/camera/camera2/internal/q1;

    invoke-direct {v1}, Landroidx/camera/camera2/internal/q1;-><init>()V

    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    new-instance v1, Landroidx/camera/camera2/internal/h2;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->M:Lw/d2;

    iget-object v3, p0, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    iget-object v4, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    iget-object v5, p0, Landroidx/camera/camera2/internal/g0;->q:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v1, v2, v3, v4, v5}, Landroidx/camera/camera2/internal/h2;-><init>(Lw/d2;Landroidx/camera/camera2/internal/j0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private W(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/y2;

    .line 2
    invoke-static {v0}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->J:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->J:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {v0}, Landroidx/camera/core/y2;->C()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private X(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/y2;

    .line 2
    invoke-static {v0}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->J:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/y2;->D()V

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->J:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private Y(Z)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "Unable to open camera due to "

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->v:Landroidx/camera/camera2/internal/g0$g;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0$g;->d()V

    .line 2
    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->v:Landroidx/camera/camera2/internal/g0$g;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0$g;->a()Z

    const-string p1, "Opening camera."

    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 4
    sget-object p1, Landroidx/camera/camera2/internal/g0$f;->p:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 5
    :try_start_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->o:Lr/m0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/j0;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    .line 6
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->C()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v3

    .line 7
    invoke-virtual {p1, v1, v2, v3}, Lr/m0;->e(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch Lr/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 9
    sget-object p1, Landroidx/camera/camera2/internal/g0$f;->s:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 10
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->v:Landroidx/camera/camera2/internal/g0$g;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0$g;->e()V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lr/f;->d()I

    move-result v0

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->n:Landroidx/camera/camera2/internal/g0$f;

    const/4 v1, 0x7

    invoke-static {v1, p1}, Landroidx/camera/core/t$a;->b(ILjava/lang/Throwable;)Landroidx/camera/core/t$a;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroidx/camera/camera2/internal/g0;->h0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;)V

    :goto_0
    return-void
.end method

.method private a0()V
    .locals 4

    .line 1
    sget-object v0, Landroidx/camera/camera2/internal/g0$c;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->s:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->K()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Landroidx/camera/camera2/internal/g0;->y:I

    if-nez v0, :cond_3

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    const-string v0, "Camera Device should be open if session close is not complete"

    invoke-static {v1, v0}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 6
    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->Z()V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/g0;->n0(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method private e0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 3
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/c2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lw/m2;->o(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 6
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/c2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lw/m2;->p(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/c2;->b()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    :cond_0
    return-void
.end method

.method private k0(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/y2;",
            ">;)",
            "Ljava/util/Collection<",
            "Landroidx/camera/camera2/internal/g0$h;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2;

    .line 3
    invoke-static {v1}, Landroidx/camera/camera2/internal/g0$h;->b(Landroidx/camera/core/y2;)Landroidx/camera/camera2/internal/g0$h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private l0(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/camera2/internal/g0$h;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    .line 2
    invoke-virtual {v0}, Lw/m2;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/camera2/internal/g0$h;

    .line 5
    iget-object v4, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lw/m2;->i(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 6
    iget-object v4, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->e()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->c()Lw/c2;

    move-result-object v6

    .line 8
    invoke-virtual {v4, v5, v6}, Lw/m2;->n(Ljava/lang/String;Lw/c2;)V

    .line 9
    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->f()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Landroidx/camera/core/z1;

    if-ne v4, v5, :cond_0

    .line 11
    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->d()Landroid/util/Size;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 12
    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    .line 13
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v2, v4, v3}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] now ATTACHED"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    if-eqz v0, :cond_3

    .line 16
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/t;->Z(Z)V

    .line 17
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->H()V

    .line 18
    :cond_3
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->x()V

    .line 19
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->p0()V

    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->f0(Z)V

    .line 21
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    if-ne p1, v0, :cond_4

    .line 22
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->Z()V

    goto :goto_1

    .line 23
    :cond_4
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->a0()V

    :goto_1
    if-eqz v2, :cond_5

    .line 24
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/t;->a0(Landroid/util/Rational;)V

    :cond_5
    return-void
.end method

.method public static synthetic m(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/g0;->S(Ljava/lang/String;Lw/c2;)V

    return-void
.end method

.method private m0(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/camera2/internal/g0$h;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/camera2/internal/g0$h;

    .line 3
    iget-object v4, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lw/m2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 4
    iget-object v4, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lw/m2;->l(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-virtual {v3}, Landroidx/camera/camera2/internal/g0$h;->f()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Landroidx/camera/core/z1;

    if-ne v3, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] now DETACHED for camera"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 9
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/t;->a0(Landroid/util/Rational;)V

    .line 10
    :cond_3
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->x()V

    .line 11
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {p1}, Lw/m2;->f()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 12
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->u()V

    .line 13
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/g0;->f0(Z)V

    .line 14
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/t;->Z(Z)V

    .line 15
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->V()Landroidx/camera/camera2/internal/r1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    .line 16
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->A()V

    goto :goto_1

    .line 17
    :cond_4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->p0()V

    .line 18
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/g0;->f0(Z)V

    .line 19
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    if-ne p1, v0, :cond_5

    .line 20
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->Z()V

    :cond_5
    :goto_1
    return-void
.end method

.method public static synthetic n(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/g0;->P(Ljava/lang/String;Lw/c2;)V

    return-void
.end method

.method public static synthetic o(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->Q(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic p(Landroidx/camera/camera2/internal/g0;Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/g0;->N(Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic q(Landroidx/camera/camera2/internal/g0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->L(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic r(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/g0;->R(Ljava/lang/String;Lw/c2;)V

    return-void
.end method

.method public static synthetic s(Lw/c2$c;Lw/c2;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/g0;->T(Lw/c2$c;Lw/c2;)V

    return-void
.end method

.method public static synthetic t(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/g0;->M(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method public static synthetic u(Landroidx/camera/camera2/internal/g0;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->U(Z)V

    return-void
.end method

.method public static synthetic v(Landroidx/camera/camera2/internal/g0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->O(Ljava/util/List;)V

    return-void
.end method

.method private w()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 3
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/c2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 4
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/c2;->e()Lw/c2;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v1, v2}, Lw/m2;->n(Ljava/lang/String;Lw/c2;)V

    .line 6
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 7
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/c2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 8
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/c2;->e()Lw/c2;

    move-result-object v2

    .line 9
    invoke-virtual {v0, v1, v2}, Lw/m2;->m(Ljava/lang/String;Lw/c2;)V

    :cond_0
    return-void
.end method

.method private x()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0}, Lw/m2;->e()Lw/c2$f;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lw/c2$f;->b()Lw/c2;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lw/c2;->g()Lw/k0;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Lw/k0;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    .line 5
    invoke-virtual {v0}, Lw/c2;->j()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    .line 6
    invoke-virtual {v0}, Lw/c2;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 7
    invoke-virtual {v1}, Lw/k0;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Landroidx/camera/camera2/internal/c2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    .line 10
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/j0;->h()Lr/z;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->O:Landroidx/camera/camera2/internal/v1;

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/c2;-><init>(Lr/z;Landroidx/camera/camera2/internal/v1;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/g0;->G:Landroidx/camera/camera2/internal/c2;

    .line 11
    :cond_0
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->w()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    if-ne v2, v0, :cond_2

    .line 12
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->e0()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-lt v2, v0, :cond_3

    .line 13
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->e0()V

    goto :goto_0

    .line 14
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", CaptureConfig Surfaces: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraImpl"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private y(Lw/k0$a;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lw/k0$a;->l()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Camera2CameraImpl"

    if-nez v0, :cond_0

    const-string p1, "The capture config builder already has surface inside."

    .line 2
    invoke-static {v2, p1}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0}, Lw/m2;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/c2;

    .line 4
    invoke-virtual {v3}, Lw/c2;->g()Lw/k0;

    move-result-object v3

    invoke-virtual {v3}, Lw/k0;->e()Ljava/util/List;

    move-result-object v3

    .line 5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 6
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw/r0;

    .line 7
    invoke-virtual {p1, v4}, Lw/k0$a;->f(Lw/r0;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1}, Lw/k0$a;->l()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Unable to find a repeating surface to attach to CaptureConfig"

    .line 9
    invoke-static {v2, p1}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method D(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/g0;->E(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method F(Lw/r0;)Lw/c2;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0}, Lw/m2;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/c2;

    .line 2
    invoke-virtual {v1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method G()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->t:Landroidx/camera/camera2/internal/g0$f;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->r:Landroidx/camera/camera2/internal/g0$f;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->C:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v2, Landroidx/camera/camera2/internal/g0$f;->r:Landroidx/camera/camera2/internal/g0$f;

    if-ne v1, v2, :cond_2

    .line 5
    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->n:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    goto :goto_2

    .line 6
    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->o:Lr/m0;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->D:Landroidx/camera/camera2/internal/g0$d;

    invoke-virtual {v1, v2}, Lr/m0;->g(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 7
    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->u:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 8
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->B:Landroidx/concurrent/futures/c$a;

    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {v1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 10
    iput-object v0, p0, Landroidx/camera/camera2/internal/g0;->B:Landroidx/concurrent/futures/c$a;

    :cond_3
    :goto_2
    return-void
.end method

.method K()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->C:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->F:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method Z()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0}, Lw/m2;->e()Lw/c2$f;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lw/c2$f;->d()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v0, "Unable to create capture session due to conflicting configurations"

    .line 4
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    .line 6
    invoke-virtual {v0}, Lw/c2$f;->b()Lw/c2;

    move-result-object v0

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    .line 7
    invoke-static {v2}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Landroidx/camera/camera2/internal/g0;->I:Landroidx/camera/camera2/internal/v2$a;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/v2$a;->a()Landroidx/camera/camera2/internal/v2;

    move-result-object v3

    .line 8
    invoke-interface {v1, v0, v2, v3}, Landroidx/camera/camera2/internal/r1;->f(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    .line 9
    new-instance v1, Landroidx/camera/camera2/internal/g0$b;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/g0$b;-><init>(Landroidx/camera/camera2/internal/g0;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/e0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/e0;-><init>(Landroidx/camera/camera2/internal/g0;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic b()Landroidx/camera/core/r;
    .locals 1

    invoke-static {p0}, Lw/c0;->a(Lw/d0;)Landroidx/camera/core/r;

    move-result-object v0

    return-object v0
.end method

.method b0(Lw/c2;)V
    .locals 4

    .line 1
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lw/c2;->c()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/c2$c;

    .line 5
    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    const-string v3, "Posting surface closed"

    invoke-direct {p0, v3, v2}, Landroidx/camera/camera2/internal/g0;->E(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    new-instance v2, Landroidx/camera/camera2/internal/f0;

    invoke-direct {v2, v1, p1}, Landroidx/camera/camera2/internal/f0;-><init>(Lw/c2$c;Lw/c2;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public c(Landroidx/camera/core/y2;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/camera/core/y2;->l()Lw/c2;

    move-result-object p1

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/camera/camera2/internal/a0;

    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/camera2/internal/a0;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method c0(Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/g0;->d0(Landroidx/camera/camera2/internal/r1;Z)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 3
    invoke-virtual {p2}, Lw/r0;->c()V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/common/util/concurrent/m;

    aput-object p1, v1, v0

    .line 4
    invoke-virtual {p2}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 5
    invoke-static {p1}, Ly/f;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 6
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 7
    invoke-interface {p1, p3, p2}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public d(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->H()V

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->W(Ljava/util/List;)V

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/g0;->k0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/c0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/c0;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Unable to attach use cases."

    .line 7
    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/g0;->E(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->u()V

    :goto_0
    return-void
.end method

.method d0(Landroidx/camera/camera2/internal/r1;Z)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/r1;",
            "Z)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/camera/camera2/internal/r1;->close()V

    .line 2
    invoke-interface {p1, p2}, Landroidx/camera/camera2/internal/r1;->a(Z)Lcom/google/common/util/concurrent/m;

    move-result-object p2

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing session in state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->C:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v0, Landroidx/camera/camera2/internal/g0$a;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/g0$a;-><init>(Landroidx/camera/camera2/internal/g0;Landroidx/camera/camera2/internal/r1;)V

    .line 6
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 7
    invoke-static {p2, v0, p1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    return-object p2
.end method

.method public e(Landroidx/camera/core/y2;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/camera/core/y2;->l()Lw/c2;

    move-result-object p1

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/camera/camera2/internal/b0;

    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/camera2/internal/b0;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/g0;->k0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v1}, Landroidx/camera/camera2/internal/g0;->X(Ljava/util/List;)V

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/d0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/d0;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method f0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    const-string v0, "Resetting Capture Session"

    .line 2
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    .line 4
    invoke-interface {v0}, Landroidx/camera/camera2/internal/r1;->d()Lw/c2;

    move-result-object v1

    .line 5
    invoke-interface {v0}, Landroidx/camera/camera2/internal/r1;->b()Ljava/util/List;

    move-result-object v2

    .line 6
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->V()Landroidx/camera/camera2/internal/r1;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    .line 7
    invoke-interface {v3, v1}, Landroidx/camera/camera2/internal/r1;->g(Lw/c2;)V

    .line 8
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    invoke-interface {v1, v2}, Landroidx/camera/camera2/internal/r1;->c(Ljava/util/List;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Landroidx/camera/camera2/internal/g0;->d0(Landroidx/camera/camera2/internal/r1;Z)Lcom/google/common/util/concurrent/m;

    return-void
.end method

.method public g(Lw/t;)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    invoke-static {}, Lw/x;->a()Lw/t;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Lw/t;->p(Lw/d2;)Lw/d2;

    move-result-object v0

    .line 3
    iput-object p1, p0, Landroidx/camera/camera2/internal/g0;->K:Lw/t;

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->L:Ljava/lang/Object;

    monitor-enter v1

    .line 5
    :try_start_0
    iput-object v0, p0, Landroidx/camera/camera2/internal/g0;->M:Lw/d2;

    .line 6
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0;->l()Lw/y;

    move-result-object v0

    invoke-interface {p1}, Lw/t;->C()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lw/y;->b(Z)V

    return-void

    :catchall_0
    move-exception p1

    .line 8
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method g0(Landroidx/camera/camera2/internal/g0$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/g0;->h0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;)V

    return-void
.end method

.method public h()Lw/b0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    return-object v0
.end method

.method h0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/camera/camera2/internal/g0;->i0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;Z)V

    return-void
.end method

.method public i(Landroidx/camera/core/y2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/y;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/y;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method i0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning camera internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    .line 3
    sget-object v0, Landroidx/camera/camera2/internal/g0$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 5
    :pswitch_0
    sget-object p1, Lw/d0$a;->u:Lw/d0$a;

    goto :goto_0

    .line 6
    :pswitch_1
    sget-object p1, Lw/d0$a;->t:Lw/d0$a;

    goto :goto_0

    .line 7
    :pswitch_2
    sget-object p1, Lw/d0$a;->p:Lw/d0$a;

    goto :goto_0

    .line 8
    :pswitch_3
    sget-object p1, Lw/d0$a;->q:Lw/d0$a;

    goto :goto_0

    .line 9
    :pswitch_4
    sget-object p1, Lw/d0$a;->r:Lw/d0$a;

    goto :goto_0

    .line 10
    :pswitch_5
    sget-object p1, Lw/d0$a;->o:Lw/d0$a;

    goto :goto_0

    .line 11
    :pswitch_6
    sget-object p1, Lw/d0$a;->s:Lw/d0$a;

    .line 12
    :goto_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->E:Lw/g0;

    invoke-virtual {v0, p0, p1, p3}, Lw/g0;->c(Landroidx/camera/core/k;Lw/d0$a;Z)V

    .line 13
    iget-object p3, p0, Landroidx/camera/camera2/internal/g0;->s:Lw/n1;

    invoke-virtual {p3, p1}, Lw/n1;->g(Ljava/lang/Object;)V

    .line 14
    iget-object p3, p0, Landroidx/camera/camera2/internal/g0;->t:Landroidx/camera/camera2/internal/i1;

    invoke-virtual {p3, p1, p2}, Landroidx/camera/camera2/internal/i1;->c(Lw/d0$a;Landroidx/camera/core/t$a;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(Landroidx/camera/core/y2;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/camera/core/y2;->l()Lw/c2;

    move-result-object p1

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->p:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/camera/camera2/internal/z;

    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/camera2/internal/z;-><init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method j0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/k0;

    .line 3
    invoke-static {v1}, Lw/k0$a;->k(Lw/k0;)Lw/k0$a;

    move-result-object v2

    .line 4
    invoke-virtual {v1}, Lw/k0;->g()I

    move-result v3

    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    .line 5
    invoke-virtual {v1}, Lw/k0;->c()Lw/q;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v1}, Lw/k0;->c()Lw/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Lw/k0$a;->n(Lw/q;)V

    .line 7
    :cond_0
    invoke-virtual {v1}, Lw/k0;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lw/k0;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-direct {p0, v2}, Landroidx/camera/camera2/internal/g0;->y(Lw/k0$a;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v2}, Lw/k0$a;->h()Lw/k0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string p1, "Issue capture request"

    .line 10
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    invoke-interface {p1, v0}, Landroidx/camera/camera2/internal/r1;->c(Ljava/util/List;)V

    return-void
.end method

.method public k()Lw/s1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw/s1<",
            "Lw/d0$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->s:Lw/n1;

    return-object v0
.end method

.method public l()Lw/y;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    return-object v0
.end method

.method n0(Z)V
    .locals 1

    const-string v0, "Attempting to force open the camera."

    .line 1
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->E:Lw/g0;

    invoke-virtual {v0, p0}, Lw/g0;->f(Landroidx/camera/core/k;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 4
    sget-object p1, Landroidx/camera/camera2/internal/g0$f;->o:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    return-void

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->Y(Z)V

    return-void
.end method

.method o0(Z)V
    .locals 1

    const-string v0, "Attempting to open the camera."

    .line 1
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->D:Landroidx/camera/camera2/internal/g0$d;

    .line 3
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->E:Lw/g0;

    invoke-virtual {v0, p0}, Lw/g0;->f(Landroidx/camera/core/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    .line 4
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 5
    sget-object p1, Landroidx/camera/camera2/internal/g0$f;->o:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    return-void

    .line 6
    :cond_1
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->Y(Z)V

    return-void
.end method

.method p0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->n:Lw/m2;

    invoke-virtual {v0}, Lw/m2;->c()Lw/c2$f;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lw/c2$f;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lw/c2$f;->b()Lw/c2;

    move-result-object v1

    .line 4
    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v1}, Lw/c2;->k()I

    move-result v1

    invoke-virtual {v2, v1}, Landroidx/camera/camera2/internal/t;->b0(I)V

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/t;->y()Lw/c2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/c2$f;->a(Lw/c2;)V

    .line 6
    invoke-virtual {v0}, Lw/c2$f;->b()Lw/c2;

    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    invoke-interface {v1, v0}, Landroidx/camera/camera2/internal/r1;->g(Lw/c2;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/t;->Y()V

    .line 9
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0;->u:Landroidx/camera/camera2/internal/t;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/t;->y()Lw/c2;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/camera/camera2/internal/r1;->g(Lw/c2;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    .line 2
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/j0;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "Camera@%x[id=%s]"

    .line 3
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method z(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->r:Landroidx/camera/camera2/internal/g0$f;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->t:Landroidx/camera/camera2/internal/g0$f;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->s:Landroidx/camera/camera2/internal/g0$f;

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/camera/camera2/internal/g0;->y:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/camera2/internal/g0;->y:I

    .line 2
    invoke-static {v2}, Landroidx/camera/camera2/internal/g0;->H(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_2

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_2

    .line 5
    invoke-direct {p0}, Landroidx/camera/camera2/internal/g0;->J()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Landroidx/camera/camera2/internal/g0;->y:I

    if-nez v0, :cond_2

    .line 6
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/g0;->B(Z)V

    goto :goto_2

    .line 7
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0;->f0(Z)V

    .line 8
    :goto_2
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0;->z:Landroidx/camera/camera2/internal/r1;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/r1;->e()V

    return-void
.end method
