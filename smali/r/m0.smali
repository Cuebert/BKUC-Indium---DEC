.class public final Lr/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/m0$a;,
        Lr/m0$b;
    }
.end annotation


# instance fields
.field private final a:Lr/m0$b;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr/z;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lr/m0$b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/ArrayMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/ArrayMap;-><init>(I)V

    iput-object v0, p0, Lr/m0;->b:Ljava/util/Map;

    .line 3
    iput-object p1, p0, Lr/m0;->a:Lr/m0$b;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lr/m0;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/k;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p0, v0}, Lr/m0;->b(Landroid/content/Context;Landroid/os/Handler;)Lr/m0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/Handler;)Lr/m0;
    .locals 1

    new-instance v0, Lr/m0;

    invoke-static {p0, p1}, Lr/n0;->a(Landroid/content/Context;Landroid/os/Handler;)Lr/m0$b;

    move-result-object p0

    invoke-direct {v0, p0}, Lr/m0;-><init>(Lr/m0$b;)V

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;)Lr/z;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lr/m0;->b:Ljava/util/Map;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lr/m0;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 3
    :try_start_1
    iget-object v1, p0, Lr/m0;->a:Lr/m0$b;

    .line 4
    invoke-interface {v1, p1}, Lr/m0$b;->c(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    .line 5
    invoke-static {v1}, Lr/z;->c(Landroid/hardware/camera2/CameraCharacteristics;)Lr/z;

    move-result-object v1

    .line 6
    iget-object v2, p0, Lr/m0;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    :try_start_2
    new-instance v1, Lr/f;

    const/16 v2, 0x2712

    .line 8
    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, p1}, Lr/f;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 9
    :cond_0
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public d()[Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    iget-object v0, p0, Lr/m0;->a:Lr/m0$b;

    invoke-interface {v0}, Lr/m0$b;->e()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    iget-object v0, p0, Lr/m0;->a:Lr/m0$b;

    invoke-interface {v0, p1, p2, p3}, Lr/m0$b;->d(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    return-void
.end method

.method public f(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 1

    iget-object v0, p0, Lr/m0;->a:Lr/m0$b;

    invoke-interface {v0, p1, p2}, Lr/m0$b;->a(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method

.method public g(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 1

    iget-object v0, p0, Lr/m0;->a:Lr/m0$b;

    invoke-interface {v0, p1}, Lr/m0$b;->b(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method
