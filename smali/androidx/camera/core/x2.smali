.class public final Landroidx/camera/core/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/x2$g;,
        Landroidx/camera/core/x2$f;,
        Landroidx/camera/core/x2$h;,
        Landroidx/camera/core/x2$e;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/util/Size;

.field private final c:Z

.field private final d:Lw/d0;

.field final e:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lw/r0;

.field private j:Landroidx/camera/core/x2$g;

.field private k:Landroidx/camera/core/x2$h;

.field private l:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/util/Size;Lw/d0;Z)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/x2;->a:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Landroidx/camera/core/x2;->b:Landroid/util/Size;

    .line 4
    iput-object p2, p0, Landroidx/camera/core/x2;->d:Lw/d0;

    .line 5
    iput-boolean p3, p0, Landroidx/camera/core/x2;->c:Z

    .line 6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SurfaceRequest[size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", id: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 8
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 9
    new-instance v1, Landroidx/camera/core/q2;

    invoke-direct {v1, p3, p2}, Landroidx/camera/core/q2;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    .line 10
    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    .line 11
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/concurrent/futures/c$a;

    invoke-static {p3}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/concurrent/futures/c$a;

    .line 12
    iput-object p3, p0, Landroidx/camera/core/x2;->h:Landroidx/concurrent/futures/c$a;

    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    new-instance v3, Landroidx/camera/core/r2;

    invoke-direct {v3, v2, p2}, Landroidx/camera/core/r2;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {v3}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/core/x2;->g:Lcom/google/common/util/concurrent/m;

    .line 15
    new-instance v4, Landroidx/camera/core/x2$a;

    invoke-direct {v4, p0, p3, v1}, Landroidx/camera/core/x2$a;-><init>(Landroidx/camera/core/x2;Landroidx/concurrent/futures/c$a;Lcom/google/common/util/concurrent/m;)V

    .line 16
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    .line 17
    invoke-static {v3, v4, p3}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 18
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/concurrent/futures/c$a;

    invoke-static {p3}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/concurrent/futures/c$a;

    .line 19
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 20
    new-instance v0, Landroidx/camera/core/p2;

    invoke-direct {v0, v1, p2}, Landroidx/camera/core/p2;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/x2;->e:Lcom/google/common/util/concurrent/m;

    .line 21
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/concurrent/futures/c$a;

    invoke-static {v1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/concurrent/futures/c$a;

    iput-object v1, p0, Landroidx/camera/core/x2;->f:Landroidx/concurrent/futures/c$a;

    .line 22
    new-instance v1, Landroidx/camera/core/x2$b;

    const/16 v2, 0x22

    invoke-direct {v1, p0, p1, v2}, Landroidx/camera/core/x2$b;-><init>(Landroidx/camera/core/x2;Landroid/util/Size;I)V

    iput-object v1, p0, Landroidx/camera/core/x2;->i:Lw/r0;

    .line 23
    invoke-virtual {v1}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 24
    new-instance v1, Landroidx/camera/core/x2$c;

    invoke-direct {v1, p0, p1, p3, p2}, Landroidx/camera/core/x2$c;-><init>(Landroidx/camera/core/x2;Lcom/google/common/util/concurrent/m;Landroidx/concurrent/futures/c$a;Ljava/lang/String;)V

    .line 25
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 26
    invoke-static {v0, v1, p2}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 27
    new-instance p2, Landroidx/camera/core/u2;

    invoke-direct {p2, p0}, Landroidx/camera/core/u2;-><init>(Landroidx/camera/core/x2;)V

    .line 28
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    .line 29
    invoke-interface {p1, p2, p3}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic a(Landroidx/core/util/a;Landroid/view/Surface;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/x2;->r(Landroidx/core/util/a;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic b(Landroidx/core/util/a;Landroid/view/Surface;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/x2;->s(Landroidx/core/util/a;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/x2;->t(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V

    return-void
.end method

.method public static synthetic d(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/x2;->u(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V

    return-void
.end method

.method public static synthetic e(Landroidx/camera/core/x2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/x2;->q()V

    return-void
.end method

.method public static synthetic f(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/x2;->p(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/x2;->n(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/x2;->o(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-cancellation"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic o(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-status"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic p(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-Surface"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic q()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/x2;->e:Lcom/google/common/util/concurrent/m;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method private static synthetic r(Landroidx/core/util/a;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-static {v0, p1}, Landroidx/camera/core/x2$f;->c(ILandroid/view/Surface;)Landroidx/camera/core/x2$f;

    move-result-object p1

    .line 2
    invoke-interface {p0, p1}, Landroidx/core/util/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic s(Landroidx/core/util/a;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-static {v0, p1}, Landroidx/camera/core/x2$f;->c(ILandroid/view/Surface;)Landroidx/camera/core/x2$f;

    move-result-object p1

    .line 2
    invoke-interface {p0, p1}, Landroidx/core/util/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic t(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/x2$h;->a(Landroidx/camera/core/x2$g;)V

    return-void
.end method

.method private static synthetic u(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/x2$h;->a(Landroidx/camera/core/x2$g;)V

    return-void
.end method


# virtual methods
.method public i(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PairedRegistration"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/x2;->h:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p2, p1}, Landroidx/concurrent/futures/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public j()Lw/d0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/x2;->d:Lw/d0;

    return-object v0
.end method

.method public k()Lw/r0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/x2;->i:Lw/r0;

    return-object v0
.end method

.method public l()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/x2;->b:Landroid/util/Size;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/x2;->c:Z

    return v0
.end method

.method public v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/a<",
            "Landroidx/camera/core/x2$f;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/x2;->f:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/camera/core/x2;->e:Lcom/google/common/util/concurrent/m;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/x2;->e:Lcom/google/common/util/concurrent/m;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    .line 3
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/x2;->e:Lcom/google/common/util/concurrent/m;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    new-instance v0, Landroidx/camera/core/v2;

    invoke-direct {v0, p3, p1}, Landroidx/camera/core/v2;-><init>(Landroidx/core/util/a;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 5
    :catch_0
    new-instance v0, Landroidx/camera/core/w2;

    invoke-direct {v0, p3, p1}, Landroidx/camera/core/w2;-><init>(Landroidx/core/util/a;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/x2;->g:Lcom/google/common/util/concurrent/m;

    new-instance v1, Landroidx/camera/core/x2$d;

    invoke-direct {v1, p0, p3, p1}, Landroidx/camera/core/x2$d;-><init>(Landroidx/camera/core/x2;Landroidx/core/util/a;Landroid/view/Surface;)V

    invoke-static {v0, v1, p2}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    :goto_1
    return-void
.end method

.method public w(Ljava/util/concurrent/Executor;Landroidx/camera/core/x2$h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/x2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p2, p0, Landroidx/camera/core/x2;->k:Landroidx/camera/core/x2$h;

    .line 3
    iput-object p1, p0, Landroidx/camera/core/x2;->l:Ljava/util/concurrent/Executor;

    .line 4
    iget-object v1, p0, Landroidx/camera/core/x2;->j:Landroidx/camera/core/x2$g;

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 6
    new-instance v0, Landroidx/camera/core/s2;

    invoke-direct {v0, p2, v1}, Landroidx/camera/core/s2;-><init>(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public x(Landroidx/camera/core/x2$g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/x2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/x2;->j:Landroidx/camera/core/x2$g;

    .line 3
    iget-object v1, p0, Landroidx/camera/core/x2;->k:Landroidx/camera/core/x2$h;

    .line 4
    iget-object v2, p0, Landroidx/camera/core/x2;->l:Ljava/util/concurrent/Executor;

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 6
    new-instance v0, Landroidx/camera/core/t2;

    invoke-direct {v0, v1, p1}, Landroidx/camera/core/t2;-><init>(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public y()Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/x2;->f:Landroidx/concurrent/futures/c$a;

    new-instance v1, Lw/r0$b;

    const-string v2, "Surface request will not complete."

    invoke-direct {v1, v2}, Lw/r0$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method
