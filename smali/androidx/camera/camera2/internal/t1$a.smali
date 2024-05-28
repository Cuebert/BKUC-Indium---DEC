.class Landroidx/camera/camera2/internal/t1$a;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/t1;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/t1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/LinkedHashSet;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/t1$a;->d(Ljava/util/LinkedHashSet;)V

    return-void
.end method

.method private b()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v0, v0, Landroidx/camera/camera2/internal/t1;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/t1;->g()Ljava/util/List;

    move-result-object v1

    .line 3
    iget-object v2, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/t1;->e:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 4
    iget-object v2, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/t1;->c:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 5
    iget-object v2, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/t1;->d:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2;

    .line 8
    invoke-interface {v1}, Landroidx/camera/camera2/internal/j2;->b()V

    goto :goto_0

    :cond_0
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

.method private c()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2
    iget-object v1, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v1, v1, Landroidx/camera/camera2/internal/t1;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 3
    :try_start_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/t1;->e:Ljava/util/Set;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashSet;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object v2, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/t1;->c:Ljava/util/Set;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashSet;->addAll(Ljava/util/Collection;)Z

    .line 5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v1, p0, Landroidx/camera/camera2/internal/t1$a;->a:Landroidx/camera/camera2/internal/t1;

    iget-object v1, v1, Landroidx/camera/camera2/internal/t1;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/camera/camera2/internal/s1;

    invoke-direct {v2, v0}, Landroidx/camera/camera2/internal/s1;-><init>(Ljava/util/LinkedHashSet;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static synthetic d(Ljava/util/LinkedHashSet;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/t1;->b(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/t1$a;->b()V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/t1$a;->c()V

    .line 2
    invoke-direct {p0}, Landroidx/camera/camera2/internal/t1$a;->b()V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/t1$a;->c()V

    .line 2
    invoke-direct {p0}, Landroidx/camera/camera2/internal/t1$a;->b()V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    return-void
.end method
