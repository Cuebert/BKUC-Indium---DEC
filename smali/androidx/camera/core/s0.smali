.class final Landroidx/camera/core/s0;
.super Landroidx/camera/core/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/s0$b;
    }
.end annotation


# instance fields
.field final u:Ljava/util/concurrent/Executor;

.field private final v:Ljava/lang/Object;

.field w:Landroidx/camera/core/l1;

.field private x:Landroidx/camera/core/s0$b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/camera/core/q0;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/s0;->v:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Landroidx/camera/core/s0;->u:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method A()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/s0;->v:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iput-object v1, p0, Landroidx/camera/core/s0;->x:Landroidx/camera/core/s0$b;

    .line 3
    iget-object v2, p0, Landroidx/camera/core/s0;->w:Landroidx/camera/core/l1;

    if-eqz v2, :cond_0

    .line 4
    iput-object v1, p0, Landroidx/camera/core/s0;->w:Landroidx/camera/core/l1;

    .line 5
    invoke-virtual {p0, v2}, Landroidx/camera/core/s0;->p(Landroidx/camera/core/l1;)V

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

.method d(Lw/h1;)Landroidx/camera/core/l1;
    .locals 0

    invoke-interface {p1}, Lw/h1;->c()Landroidx/camera/core/l1;

    move-result-object p1

    return-object p1
.end method

.method g()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/s0;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/s0;->w:Landroidx/camera/core/l1;

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v1}, Landroidx/camera/core/l1;->close()V

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Landroidx/camera/core/s0;->w:Landroidx/camera/core/l1;

    .line 5
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

.method p(Landroidx/camera/core/l1;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/core/s0;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/q0;->s:Z

    if-nez v1, :cond_0

    .line 3
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/s0;->x:Landroidx/camera/core/s0$b;

    if-eqz v1, :cond_3

    .line 6
    invoke-interface {p1}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/i1;->c()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/camera/core/s0;->x:Landroidx/camera/core/s0$b;

    .line 7
    invoke-virtual {v3}, Landroidx/camera/core/i0;->q()Landroidx/camera/core/i1;

    move-result-object v3

    invoke-interface {v3}, Landroidx/camera/core/i1;->c()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    .line 8
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/s0;->w:Landroidx/camera/core/l1;

    if-eqz v1, :cond_2

    .line 10
    invoke-interface {v1}, Landroidx/camera/core/l1;->close()V

    .line 11
    :cond_2
    iput-object p1, p0, Landroidx/camera/core/s0;->w:Landroidx/camera/core/l1;

    .line 12
    :goto_0
    monitor-exit v0

    return-void

    .line 13
    :cond_3
    new-instance v1, Landroidx/camera/core/s0$b;

    invoke-direct {v1, p1, p0}, Landroidx/camera/core/s0$b;-><init>(Landroidx/camera/core/l1;Landroidx/camera/core/s0;)V

    .line 14
    iput-object v1, p0, Landroidx/camera/core/s0;->x:Landroidx/camera/core/s0$b;

    .line 15
    invoke-virtual {p0, v1}, Landroidx/camera/core/q0;->e(Landroidx/camera/core/l1;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    new-instance v2, Landroidx/camera/core/s0$a;

    invoke-direct {v2, p0, v1}, Landroidx/camera/core/s0$a;-><init>(Landroidx/camera/core/s0;Landroidx/camera/core/s0$b;)V

    .line 16
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 17
    invoke-static {p1, v2, v1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 18
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
