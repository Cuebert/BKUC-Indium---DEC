.class public final Landroidx/camera/camera2/internal/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/j0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lr/z;

.field private final c:Lv/h;

.field private final d:Ljava/lang/Object;

.field private e:Landroidx/camera/camera2/internal/t;

.field private f:Landroidx/camera/camera2/internal/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/camera2/internal/j0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroidx/camera/camera2/internal/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/camera2/internal/j0$a<",
            "Landroidx/camera/core/f3;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroidx/camera/camera2/internal/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/camera2/internal/j0$a<",
            "Landroidx/camera/core/t;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lw/h;",
            "Ljava/util/concurrent/Executor;",
            ">;>;"
        }
    .end annotation
.end field

.field private final j:Lw/y1;

.field private final k:Lw/g;

.field private final l:Lr/m0;


# direct methods
.method constructor <init>(Ljava/lang/String;Lr/m0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->f:Landroidx/camera/camera2/internal/j0$a;

    .line 4
    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->g:Landroidx/camera/camera2/internal/j0$a;

    .line 5
    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    .line 6
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Landroidx/camera/camera2/internal/j0;->l:Lr/m0;

    .line 8
    invoke-virtual {p2, v0}, Lr/m0;->c(Ljava/lang/String;)Lr/z;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/camera2/internal/j0;->b:Lr/z;

    .line 9
    new-instance v0, Lv/h;

    invoke-direct {v0, p0}, Lv/h;-><init>(Landroidx/camera/camera2/internal/j0;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Lv/h;

    .line 10
    invoke-static {p1, p2}, Lt/g;->a(Ljava/lang/String;Lr/z;)Lw/y1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->j:Lw/y1;

    .line 11
    new-instance v0, Landroidx/camera/camera2/internal/d;

    invoke-direct {v0, p1, p2}, Landroidx/camera/camera2/internal/d;-><init>(Ljava/lang/String;Lr/z;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->k:Lw/g;

    .line 12
    new-instance p1, Landroidx/camera/camera2/internal/j0$a;

    sget-object p2, Landroidx/camera/core/t$b;->r:Landroidx/camera/core/t$b;

    .line 13
    invoke-static {p2}, Landroidx/camera/core/t;->a(Landroidx/camera/core/t$b;)Landroidx/camera/core/t;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/camera/camera2/internal/j0$a;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/j0;->h:Landroidx/camera/camera2/internal/j0$a;

    return-void
.end method

.method private l()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->m()V

    return-void
.end method

.method private m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->j()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL"

    goto :goto_0

    :cond_1
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_3"

    goto :goto_0

    :cond_2
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY"

    goto :goto_0

    :cond_3
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_FULL"

    goto :goto_0

    :cond_4
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"

    .line 3
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device Level: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraInfo"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->b:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 2
    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 4
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b(Lw/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/t;

    if-nez v1, :cond_3

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    if-nez v1, :cond_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 6
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    .line 8
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-ne v2, p1, :cond_1

    .line 9
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 10
    :cond_2
    monitor-exit v0

    return-void

    .line 11
    :cond_3
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/t;->X(Lw/h;)V

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->j()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "androidx.camera.camera2.legacy"

    goto :goto_0

    :cond_0
    const-string v0, "androidx.camera.camera2"

    :goto_0
    return-object v0
.end method

.method public e(I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 2
    invoke-static {p1}, Landroidx/camera/core/impl/utils/b;->b(I)I

    move-result p1

    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->a()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 6
    invoke-static {p1, v0, v2}, Landroidx/camera/core/impl/utils/b;->a(IIZ)I

    move-result p1

    return p1
.end method

.method public f(Ljava/util/concurrent/Executor;Lw/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/t;

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    new-instance v2, Landroid/util/Pair;

    invoke-direct {v2, p2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    monitor-exit v0

    return-void

    .line 7
    :cond_1
    invoke-virtual {v1, p1, p2}, Landroidx/camera/camera2/internal/t;->t(Ljava/util/concurrent/Executor;Lw/h;)V

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g()Lw/y1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->j:Lw/y1;

    return-object v0
.end method

.method public h()Lr/z;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->b:Lr/z;

    return-object v0
.end method

.method i()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->b:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 3
    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method j()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->b:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 3
    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method k(Landroidx/camera/camera2/internal/t;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/t;

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->g:Landroidx/camera/camera2/internal/j0$a;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t;->F()Landroidx/camera/camera2/internal/z2;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/z2;->d()Landroidx/lifecycle/LiveData;

    move-result-object p1

    .line 5
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j0$a;->r(Landroidx/lifecycle/LiveData;)V

    .line 6
    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->f:Landroidx/camera/camera2/internal/j0$a;

    if-eqz p1, :cond_1

    .line 7
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/t;

    .line 8
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/t;->D()Landroidx/camera/camera2/internal/y2;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/y2;->c()Landroidx/lifecycle/LiveData;

    move-result-object v1

    .line 9
    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/j0$a;->r(Landroidx/lifecycle/LiveData;)V

    .line 10
    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 12
    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/t;

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lw/h;

    invoke-virtual {v2, v3, v1}, Landroidx/camera/camera2/internal/t;->t(Ljava/util/concurrent/Executor;Lw/h;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Landroidx/camera/camera2/internal/j0;->i:Ljava/util/List;

    .line 14
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->l()V

    return-void

    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method n(Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/camera/core/t;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->h:Landroidx/camera/camera2/internal/j0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j0$a;->r(Landroidx/lifecycle/LiveData;)V

    return-void
.end method
