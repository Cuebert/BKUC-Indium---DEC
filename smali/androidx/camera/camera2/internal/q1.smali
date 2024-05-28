.class final Landroidx/camera/camera2/internal/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/r1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/q1$e;,
        Landroidx/camera/camera2/internal/q1$d;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/k0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

.field private final d:Landroidx/camera/camera2/internal/q1$e;

.field e:Landroidx/camera/camera2/internal/v2;

.field f:Landroidx/camera/camera2/internal/j2;

.field g:Lw/c2;

.field h:Lw/o0;

.field i:Lq/c;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lw/r0;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field

.field l:Landroidx/camera/camera2/internal/q1$d;

.field m:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field n:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field final o:Lu/o;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    .line 4
    new-instance v0, Landroidx/camera/camera2/internal/q1$a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/q1$a;-><init>(Landroidx/camera/camera2/internal/q1;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->c:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 5
    invoke-static {}, Lw/u1;->I()Lw/u1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->h:Lw/o0;

    .line 6
    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->i:Lq/c;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->k:Ljava/util/List;

    .line 9
    sget-object v0, Landroidx/camera/camera2/internal/q1$d;->n:Landroidx/camera/camera2/internal/q1$d;

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    .line 10
    new-instance v0, Lu/o;

    invoke-direct {v0}, Lu/o;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->o:Lu/o;

    .line 11
    sget-object v0, Landroidx/camera/camera2/internal/q1$d;->o:Landroidx/camera/camera2/internal/q1$d;

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    .line 12
    new-instance v0, Landroidx/camera/camera2/internal/q1$e;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/q1$e;-><init>(Landroidx/camera/camera2/internal/q1;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->d:Landroidx/camera/camera2/internal/q1$e;

    return-void
.end method

.method public static synthetic h(Landroidx/camera/camera2/internal/q1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/q1;->r(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/camera/camera2/internal/q1;Lw/c2;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/q1;->q(Lw/c2;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/camera/camera2/internal/q1;Landroid/hardware/camera2/CameraCaptureSession;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/q1;->p(Landroid/hardware/camera2/CameraCaptureSession;IZ)V

    return-void
.end method

.method private varargs k(Ljava/util/List;[Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/h;",
            ">;[",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    array-length v2, p2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/h;

    .line 4
    invoke-static {v1}, Landroidx/camera/camera2/internal/m1;->a(Lw/h;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {v0, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 6
    invoke-static {v0}, Landroidx/camera/camera2/internal/k0;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    return-object p1
.end method

.method private synthetic p(Landroid/hardware/camera2/CameraCaptureSession;IZ)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter p1

    .line 2
    :try_start_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    sget-object p3, Landroidx/camera/camera2/internal/q1$d;->r:Landroidx/camera/camera2/internal/q1$d;

    if-ne p2, p3, :cond_0

    .line 3
    iget-object p2, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    invoke-virtual {p0, p2}, Landroidx/camera/camera2/internal/q1;->o(Lw/c2;)I

    .line 4
    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private synthetic q(Lw/c2;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-direct {p0, p3, p1, p2}, Landroidx/camera/camera2/internal/q1;->t(Ljava/util/List;Lw/c2;Landroid/hardware/camera2/CameraDevice;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic r(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->n:Landroidx/concurrent/futures/c$a;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Release completer expected to be null"

    invoke-static {v1, v2}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 3
    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->n:Landroidx/concurrent/futures/c$a;

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release[session="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static s(Ljava/util/List;)Lw/o0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)",
            "Lw/o0;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object v0

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/k0;

    .line 3
    invoke-virtual {v1}, Lw/k0;->d()Lw/o0;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Lw/o0;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/o0$a;

    const/4 v4, 0x0

    .line 5
    invoke-interface {v1, v3, v4}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 6
    invoke-virtual {v0, v3}, Lw/u1;->e(Lw/o0$a;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 7
    invoke-virtual {v0, v3, v4}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 8
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 9
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Detect conflicting option "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {v3}, Lw/o0$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " : "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " != "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "CaptureSession"

    .line 11
    invoke-static {v4, v3}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {v0, v3, v5}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private t(Ljava/util/List;Lw/c2;Landroid/hardware/camera2/CameraDevice;)Lcom/google/common/util/concurrent/m;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;",
            "Lw/c2;",
            "Landroid/hardware/camera2/CameraDevice;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$c;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_5

    const/4 v4, 0x3

    if-eq v1, v4, :cond_0

    const/4 p1, 0x5

    if-eq v1, p1, :cond_5

    .line 3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "openCaptureSession() not execute in state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 6
    iget-object v5, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    iget-object v6, p0, Landroidx/camera/camera2/internal/q1;->k:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw/r0;

    .line 7
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/Surface;

    .line 8
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 9
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    sget-object p1, Landroidx/camera/camera2/internal/q1$d;->q:Landroidx/camera/camera2/internal/q1$d;

    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    const-string p1, "CaptureSession"

    const-string v5, "Opening capture session."

    .line 11
    invoke-static {p1, v5}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-array p1, v3, [Landroidx/camera/camera2/internal/j2$a;

    .line 12
    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->d:Landroidx/camera/camera2/internal/q1$e;

    aput-object v3, p1, v1

    new-instance v3, Landroidx/camera/camera2/internal/w2$a;

    .line 13
    invoke-virtual {p2}, Lw/c2;->h()Ljava/util/List;

    move-result-object v5

    invoke-direct {v3, v5}, Landroidx/camera/camera2/internal/w2$a;-><init>(Ljava/util/List;)V

    aput-object v3, p1, v2

    .line 14
    invoke-static {p1}, Landroidx/camera/camera2/internal/w2;->v([Landroidx/camera/camera2/internal/j2$a;)Landroidx/camera/camera2/internal/j2$a;

    move-result-object p1

    .line 15
    new-instance v2, Lq/a;

    .line 16
    invoke-virtual {p2}, Lw/c2;->d()Lw/o0;

    move-result-object v3

    invoke-direct {v2, v3}, Lq/a;-><init>(Lw/o0;)V

    .line 17
    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lq/a;->I(Lq/c;)Lq/c;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/camera2/internal/q1;->i:Lq/c;

    .line 18
    invoke-virtual {v3}, Lq/c;->d()Lq/c$a;

    move-result-object v3

    invoke-virtual {v3}, Lq/c$a;->c()Ljava/util/List;

    move-result-object v3

    .line 19
    invoke-virtual {p2}, Lw/c2;->g()Lw/k0;

    move-result-object p2

    invoke-static {p2}, Lw/k0$a;->k(Lw/k0;)Lw/k0$a;

    move-result-object p2

    .line 20
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw/k0;

    .line 21
    invoke-virtual {v5}, Lw/k0;->d()Lw/o0;

    move-result-object v5

    .line 22
    invoke-virtual {p2, v5}, Lw/k0$a;->e(Lw/o0;)V

    goto :goto_1

    .line 23
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/Surface;

    .line 25
    new-instance v6, Ls/b;

    invoke-direct {v6, v5}, Ls/b;-><init>(Landroid/view/Surface;)V

    const/4 v5, 0x0

    .line 26
    invoke-virtual {v2, v5}, Lq/a;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual {v6, v5}, Ls/b;->c(Ljava/lang/String;)V

    .line 28
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 29
    :cond_3
    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    .line 30
    invoke-virtual {v2, v1, v3, p1}, Landroidx/camera/camera2/internal/v2;->a(ILjava/util/List;Landroidx/camera/camera2/internal/j2$a;)Ls/g;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :try_start_1
    invoke-virtual {p2}, Lw/k0$a;->h()Lw/k0;

    move-result-object p2

    .line 32
    invoke-static {p2, p3}, Landroidx/camera/camera2/internal/z0;->c(Lw/k0;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 33
    invoke-virtual {p1, p2}, Ls/g;->f(Landroid/hardware/camera2/CaptureRequest;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :cond_4
    :try_start_2
    iget-object p2, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->k:Ljava/util/List;

    invoke-virtual {p2, p3, p1, v1}, Landroidx/camera/camera2/internal/v2;->c(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catch_0
    move-exception p1

    .line 35
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 36
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "openCaptureSession() should not be possible in state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 37
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(Z)Lcom/google/common/util/concurrent/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$c;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    .line 3
    :pswitch_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    .line 4
    :try_start_1
    invoke-interface {v1}, Landroidx/camera/camera2/internal/j2;->j()V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v1, "CaptureSession"

    const-string v2, "Unable to abort captures."

    .line 5
    invoke-static {v1, v2, p1}, Landroidx/camera/core/q1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->close()V

    .line 7
    :cond_1
    :pswitch_1
    sget-object p1, Landroidx/camera/camera2/internal/q1$d;->t:Landroidx/camera/camera2/internal/q1$d;

    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    .line 8
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The Opener shouldn\'t null in state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/v2;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/q1;->l()V

    goto :goto_1

    .line 11
    :cond_2
    :pswitch_2
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->m:Lcom/google/common/util/concurrent/m;

    if-nez p1, :cond_3

    .line 12
    new-instance p1, Landroidx/camera/camera2/internal/o1;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/o1;-><init>(Landroidx/camera/camera2/internal/q1;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->m:Lcom/google/common/util/concurrent/m;

    .line 13
    :cond_3
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->m:Lcom/google/common/util/concurrent/m;

    monitor-exit v0

    return-object p1

    .line 14
    :pswitch_3
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The Opener shouldn\'t null in state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/v2;->e()Z

    .line 16
    :pswitch_4
    sget-object p1, Landroidx/camera/camera2/internal/q1$d;->u:Landroidx/camera/camera2/internal/q1$d;

    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    goto :goto_1

    .line 17
    :pswitch_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "release() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p1, 0x0

    .line 19
    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 20
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$c;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 3
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot issue capture request on a closed/released session."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :pswitch_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/q1;->n()V

    goto :goto_0

    .line 6
    :pswitch_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 7
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "issueCaptureRequests() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public close()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$c;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->i:Lq/c;

    .line 5
    invoke-virtual {v1}, Lq/c;->d()Lq/c$a;

    move-result-object v1

    invoke-virtual {v1}, Lq/c$a;->a()Ljava/util/List;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    .line 7
    :try_start_1
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/q1;->u(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/q1;->c(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "CaptureSession"

    const-string v3, "Unable to issue the request before close the capture session"

    .line 8
    invoke-static {v2, v3, v1}, Landroidx/camera/core/q1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    :cond_1
    :goto_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The Opener shouldn\'t null in state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/v2;->e()Z

    .line 11
    sget-object v1, Landroidx/camera/camera2/internal/q1$d;->s:Landroidx/camera/camera2/internal/q1$d;

    iput-object v1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    goto :goto_1

    .line 13
    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The Opener shouldn\'t null in state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/v2;->e()Z

    .line 15
    :cond_3
    sget-object v1, Landroidx/camera/camera2/internal/q1$d;->u:Landroidx/camera/camera2/internal/q1$d;

    iput-object v1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    .line 16
    :goto_1
    monitor-exit v0

    return-void

    .line 17
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "close() should not be possible in state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public d()Lw/c2;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 5
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/k0;

    .line 7
    invoke-virtual {v1}, Lw/k0;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw/h;

    .line 8
    invoke-virtual {v2}, Lw/h;->a()V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public f(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)Lcom/google/common/util/concurrent/m;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/c2;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Landroidx/camera/camera2/internal/v2;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$c;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const-string p1, "CaptureSession"

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Open not allowed in state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "open() should not allow the state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 5
    :cond_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$d;->p:Landroidx/camera/camera2/internal/q1$d;

    iput-object v1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    .line 6
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Landroidx/camera/camera2/internal/q1;->k:Ljava/util/List;

    .line 8
    iput-object p3, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    const-wide/16 v3, 0x1388

    .line 9
    invoke-virtual {p3, v2, v3, v4}, Landroidx/camera/camera2/internal/v2;->d(Ljava/util/List;J)Lcom/google/common/util/concurrent/m;

    move-result-object p3

    .line 10
    invoke-static {p3}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object p3

    new-instance v1, Landroidx/camera/camera2/internal/p1;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/p1;-><init>(Landroidx/camera/camera2/internal/q1;Lw/c2;Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    .line 11
    invoke-virtual {p1}, Landroidx/camera/camera2/internal/v2;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 12
    invoke-virtual {p3, v1, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    .line 13
    new-instance p2, Landroidx/camera/camera2/internal/q1$b;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/q1$b;-><init>(Landroidx/camera/camera2/internal/q1;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/q1;->e:Landroidx/camera/camera2/internal/v2;

    .line 14
    invoke-virtual {p3}, Landroidx/camera/camera2/internal/v2;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    .line 15
    invoke-static {p1, p2, p3}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 16
    invoke-static {p1}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g(Lw/c2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/q1$c;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 3
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Session configuration cannot be set on a closed/released session."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :pswitch_1
    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    if-nez p1, :cond_0

    .line 5
    monitor-exit v0

    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "CaptureSession"

    const-string v1, "Does not have the proper configured lists"

    .line 7
    invoke-static {p1, v1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    monitor-exit v0

    return-void

    :cond_1
    const-string p1, "CaptureSession"

    const-string v1, "Attempting to submit CaptureRequest after setting"

    .line 9
    invoke-static {p1, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/q1;->o(Lw/c2;)I

    goto :goto_0

    .line 11
    :pswitch_2
    iput-object p1, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    goto :goto_0

    .line 12
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setSessionConfig() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method l()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    sget-object v1, Landroidx/camera/camera2/internal/q1$d;->u:Landroidx/camera/camera2/internal/q1$d;

    if-ne v0, v1, :cond_0

    const-string v0, "CaptureSession"

    const-string v1, "Skipping finishClose due to being state RELEASED."

    .line 2
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iput-object v1, p0, Landroidx/camera/camera2/internal/q1;->l:Landroidx/camera/camera2/internal/q1$d;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->n:Landroidx/concurrent/futures/c$a;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 7
    iput-object v0, p0, Landroidx/camera/camera2/internal/q1;->n:Landroidx/concurrent/futures/c$a;

    :cond_1
    return-void
.end method

.method m(Ljava/util/List;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    .line 4
    :cond_0
    :try_start_1
    new-instance v1, Landroidx/camera/camera2/internal/e1;

    invoke-direct {v1}, Landroidx/camera/camera2/internal/e1;-><init>()V

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "CaptureSession"

    const-string v5, "Issuing capture request."

    .line 6
    invoke-static {v4, v5}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw/k0;

    .line 8
    invoke-virtual {v6}, Lw/k0;->e()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v6, "CaptureSession"

    const-string v7, "Skipping issuing empty capture request."

    .line 9
    invoke-static {v6, v7}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v6}, Lw/k0;->e()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw/r0;

    .line 11
    iget-object v10, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    invoke-interface {v10, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v7, "CaptureSession"

    .line 12
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Skipping capture request with invalid surface: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x0

    goto :goto_1

    :cond_3
    const/4 v7, 0x1

    :goto_1
    if-nez v7, :cond_4

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {v6}, Lw/k0;->g()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_5

    const/4 v5, 0x1

    .line 14
    :cond_5
    invoke-static {v6}, Lw/k0$a;->k(Lw/k0;)Lw/k0$a;

    move-result-object v7

    .line 15
    invoke-virtual {v6}, Lw/k0;->g()I

    move-result v8

    const/4 v9, 0x5

    if-ne v8, v9, :cond_6

    .line 16
    invoke-virtual {v6}, Lw/k0;->c()Lw/q;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 17
    invoke-virtual {v6}, Lw/k0;->c()Lw/q;

    move-result-object v8

    .line 18
    invoke-virtual {v7, v8}, Lw/k0$a;->n(Lw/q;)V

    .line 19
    :cond_6
    iget-object v8, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    if-eqz v8, :cond_7

    .line 20
    invoke-virtual {v8}, Lw/c2;->g()Lw/k0;

    move-result-object v8

    .line 21
    invoke-virtual {v8}, Lw/k0;->d()Lw/o0;

    move-result-object v8

    .line 22
    invoke-virtual {v7, v8}, Lw/k0$a;->e(Lw/o0;)V

    .line 23
    :cond_7
    iget-object v8, p0, Landroidx/camera/camera2/internal/q1;->h:Lw/o0;

    invoke-virtual {v7, v8}, Lw/k0$a;->e(Lw/o0;)V

    .line 24
    invoke-virtual {v6}, Lw/k0;->d()Lw/o0;

    move-result-object v8

    .line 25
    invoke-virtual {v7, v8}, Lw/k0$a;->e(Lw/o0;)V

    .line 26
    invoke-virtual {v7}, Lw/k0$a;->h()Lw/k0;

    move-result-object v7

    iget-object v8, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {v8}, Landroidx/camera/camera2/internal/j2;->k()Landroid/hardware/camera2/CameraDevice;

    move-result-object v8

    iget-object v9, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    .line 27
    invoke-static {v7, v8, v9}, Landroidx/camera/camera2/internal/z0;->b(Lw/k0;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object v7

    if-nez v7, :cond_8

    const-string p1, "CaptureSession"

    const-string v1, "Skipping issuing request without surface."

    .line 28
    invoke-static {p1, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v2

    .line 30
    :cond_8
    :try_start_3
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 31
    invoke-virtual {v6}, Lw/k0;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lw/h;

    .line 32
    invoke-static {v9, v8}, Landroidx/camera/camera2/internal/m1;->b(Lw/h;Ljava/util/List;)V

    goto :goto_2

    .line 33
    :cond_9
    invoke-virtual {v1, v7, v8}, Landroidx/camera/camera2/internal/e1;->a(Landroid/hardware/camera2/CaptureRequest;Ljava/util/List;)V

    .line 34
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 35
    :cond_a
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_c

    .line 36
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->o:Lu/o;

    .line 37
    invoke-virtual {p1, v3, v5}, Lu/o;->a(Ljava/util/List;Z)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 38
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->e()V

    .line 39
    new-instance p1, Landroidx/camera/camera2/internal/n1;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/n1;-><init>(Landroidx/camera/camera2/internal/q1;)V

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/e1;->c(Landroidx/camera/camera2/internal/e1$a;)V

    .line 40
    :cond_b
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {p1, v3, v1}, Landroidx/camera/camera2/internal/j2;->g(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return p1

    :cond_c
    :try_start_5
    const-string p1, "CaptureSession"

    const-string v1, "Skipping issuing burst request due to no valid request elements"

    .line 41
    invoke-static {p1, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_6
    const-string v1, "CaptureSession"

    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to access camera: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraAccessException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    .line 44
    :goto_3
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 45
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method n()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/q1;->m(Ljava/util/List;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/q1;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 4
    throw v0
.end method

.method o(Lw/c2;)I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/q1;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, "CaptureSession"

    const-string v2, "Skipping issueRepeatingCaptureRequests for no configuration case."

    .line 2
    invoke-static {p1, v2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    monitor-exit v0

    return v1

    .line 4
    :cond_0
    invoke-virtual {p1}, Lw/c2;->g()Lw/k0;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lw/k0;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p1, "CaptureSession"

    const-string v2, "Skipping issueRepeatingCaptureRequests for no surface."

    .line 6
    invoke-static {p1, v2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/j2;->e()V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v2, "CaptureSession"

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to access camera: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraAccessException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    .line 10
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v1

    :cond_1
    :try_start_3
    const-string v2, "CaptureSession"

    const-string v3, "Issuing request for session."

    .line 11
    invoke-static {v2, v3}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-static {p1}, Lw/k0$a;->k(Lw/k0;)Lw/k0$a;

    move-result-object v2

    .line 13
    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->i:Lq/c;

    .line 14
    invoke-virtual {v3}, Lq/c;->d()Lq/c$a;

    move-result-object v3

    invoke-virtual {v3}, Lq/c$a;->d()Ljava/util/List;

    move-result-object v3

    .line 15
    invoke-static {v3}, Landroidx/camera/camera2/internal/q1;->s(Ljava/util/List;)Lw/o0;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/camera2/internal/q1;->h:Lw/o0;

    .line 16
    invoke-virtual {v2, v3}, Lw/k0$a;->e(Lw/o0;)V

    .line 17
    invoke-virtual {v2}, Lw/k0$a;->h()Lw/k0;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {v3}, Landroidx/camera/camera2/internal/j2;->k()Landroid/hardware/camera2/CameraDevice;

    move-result-object v3

    iget-object v4, p0, Landroidx/camera/camera2/internal/q1;->j:Ljava/util/Map;

    .line 18
    invoke-static {v2, v3, v4}, Landroidx/camera/camera2/internal/z0;->b(Lw/k0;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    if-nez v2, :cond_2

    const-string p1, "CaptureSession"

    const-string v2, "Skipping issuing empty request for session."

    .line 19
    invoke-static {p1, v2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 20
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return v1

    .line 21
    :cond_2
    :try_start_5
    invoke-virtual {p1}, Lw/k0;->b()Ljava/util/List;

    move-result-object p1

    const/4 v3, 0x1

    new-array v3, v3, [Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/camera/camera2/internal/q1;->c:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    aput-object v5, v3, v4

    .line 22
    invoke-direct {p0, p1, v3}, Landroidx/camera/camera2/internal/q1;->k(Ljava/util/List;[Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    .line 23
    iget-object v3, p0, Landroidx/camera/camera2/internal/q1;->f:Landroidx/camera/camera2/internal/j2;

    invoke-interface {v3, v2, p1}, Landroidx/camera/camera2/internal/j2;->m(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    monitor-exit v0

    return p1

    :catch_1
    move-exception p1

    const-string v2, "CaptureSession"

    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to access camera: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraAccessException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    .line 26
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method u(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;"
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

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/k0;

    .line 3
    invoke-static {v1}, Lw/k0$a;->k(Lw/k0;)Lw/k0$a;

    move-result-object v1

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v1, v2}, Lw/k0$a;->p(I)V

    .line 5
    iget-object v2, p0, Landroidx/camera/camera2/internal/q1;->g:Lw/c2;

    invoke-virtual {v2}, Lw/c2;->g()Lw/k0;

    move-result-object v2

    invoke-virtual {v2}, Lw/k0;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/r0;

    .line 6
    invoke-virtual {v1, v3}, Lw/k0$a;->f(Lw/r0;)V

    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {v1}, Lw/k0$a;->h()Lw/k0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
