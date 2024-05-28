.class public Landroidx/camera/core/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/h1;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:I

.field private c:Z

.field private final d:Lw/h1;

.field private final e:Landroid/view/Surface;

.field private final f:Landroidx/camera/core/i0$a;


# direct methods
.method public constructor <init>(Lw/h1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Landroidx/camera/core/l2;->b:I

    .line 4
    iput-boolean v0, p0, Landroidx/camera/core/l2;->c:Z

    .line 5
    new-instance v0, Landroidx/camera/core/j2;

    invoke-direct {v0, p0}, Landroidx/camera/core/j2;-><init>(Landroidx/camera/core/l2;)V

    iput-object v0, p0, Landroidx/camera/core/l2;->f:Landroidx/camera/core/i0$a;

    .line 6
    iput-object p1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    .line 7
    invoke-interface {p1}, Lw/h1;->a()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/l2;->e:Landroid/view/Surface;

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/l2;Lw/h1$a;Lw/h1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/l2;->l(Lw/h1$a;Lw/h1;)V

    return-void
.end method

.method public static synthetic j(Landroidx/camera/core/l2;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/l2;->k(Landroidx/camera/core/l1;)V

    return-void
.end method

.method private synthetic k(Landroidx/camera/core/l1;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter p1

    .line 2
    :try_start_0
    iget v0, p0, Landroidx/camera/core/l2;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/camera/core/l2;->b:I

    .line 3
    iget-boolean v1, p0, Landroidx/camera/core/l2;->c:Z

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/l2;->close()V

    .line 5
    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private synthetic l(Lw/h1$a;Lw/h1;)V
    .locals 0

    invoke-interface {p1, p0}, Lw/h1$a;->a(Lw/h1;)V

    return-void
.end method

.method private n(Landroidx/camera/core/l1;)Landroidx/camera/core/l1;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget v0, p0, Landroidx/camera/core/l2;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/camera/core/l2;->b:I

    .line 2
    new-instance v0, Landroidx/camera/core/o2;

    invoke-direct {v0, p1}, Landroidx/camera/core/o2;-><init>(Landroidx/camera/core/l1;)V

    .line 3
    iget-object p1, p0, Landroidx/camera/core/l2;->f:Landroidx/camera/core/i0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/i0;->b(Landroidx/camera/core/i0$a;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public a()Landroid/view/Surface;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->a()Landroid/view/Surface;

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

.method public c()Landroidx/camera/core/l1;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->c()Landroidx/camera/core/l1;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/camera/core/l2;->n(Landroidx/camera/core/l1;)Landroidx/camera/core/l1;

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

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->e:Landroid/view/Surface;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->close()V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->d()I

    move-result v1

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

.method public e(Lw/h1$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    new-instance v2, Landroidx/camera/core/k2;

    invoke-direct {v2, p0, p1}, Landroidx/camera/core/k2;-><init>(Landroidx/camera/core/l2;Lw/h1$a;)V

    invoke-interface {v1, v2, p2}, Lw/h1;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->f()V

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

.method public g()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->g()I

    move-result v1

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

.method public getHeight()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->getHeight()I

    move-result v1

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

.method public h()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->h()I

    move-result v1

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

.method public i()Landroidx/camera/core/l1;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->i()Landroidx/camera/core/l1;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/camera/core/l2;->n(Landroidx/camera/core/l1;)Landroidx/camera/core/l1;

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

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/l2;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Landroidx/camera/core/l2;->c:Z

    .line 3
    iget-object v1, p0, Landroidx/camera/core/l2;->d:Lw/h1;

    invoke-interface {v1}, Lw/h1;->f()V

    .line 4
    iget v1, p0, Landroidx/camera/core/l2;->b:I

    if-nez v1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/l2;->close()V

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
