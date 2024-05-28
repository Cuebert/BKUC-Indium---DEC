.class public final Landroidx/camera/core/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/y$a;
    }
.end annotation


# static fields
.field private static final o:Ljava/lang/Object;

.field private static final p:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Lw/e0;

.field private final b:Ljava/lang/Object;

.field private final c:Landroidx/camera/core/z;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Landroid/os/Handler;

.field private final f:Landroid/os/HandlerThread;

.field private g:Lw/a0;

.field private h:Lw/z;

.field private i:Lw/p2;

.field private j:Landroid/content/Context;

.field private final k:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private l:Landroidx/camera/core/y$a;

.field private m:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/camera/core/y;->o:Ljava/lang/Object;

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/camera/core/y;->p:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/camera/core/z$b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lw/e0;

    invoke-direct {v0}, Lw/e0;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/y;->a:Lw/e0;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/y;->b:Ljava/lang/Object;

    .line 4
    sget-object v0, Landroidx/camera/core/y$a;->n:Landroidx/camera/core/y$a;

    iput-object v0, p0, Landroidx/camera/core/y;->l:Landroidx/camera/core/y$a;

    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/y;->m:Lcom/google/common/util/concurrent/m;

    if-eqz p2, :cond_0

    .line 6
    invoke-interface {p2}, Landroidx/camera/core/z$b;->getCameraXConfig()Landroidx/camera/core/z;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Landroidx/camera/core/y;->f(Landroid/content/Context;)Landroidx/camera/core/z$b;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 8
    invoke-interface {p2}, Landroidx/camera/core/z$b;->getCameraXConfig()Landroidx/camera/core/z;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    .line 9
    :goto_0
    iget-object p2, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    invoke-virtual {p2, v0}, Landroidx/camera/core/z;->I(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 10
    iget-object v1, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    invoke-virtual {v1, v0}, Landroidx/camera/core/z;->L(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object v1

    if-nez p2, :cond_1

    .line 11
    new-instance p2, Landroidx/camera/core/o;

    invoke-direct {p2}, Landroidx/camera/core/o;-><init>()V

    :cond_1
    iput-object p2, p0, Landroidx/camera/core/y;->d:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_2

    .line 12
    new-instance p2, Landroid/os/HandlerThread;

    const/16 v1, 0xa

    const-string v2, "CameraX-scheduler"

    invoke-direct {p2, v2, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Landroidx/camera/core/y;->f:Landroid/os/HandlerThread;

    .line 13
    invoke-virtual {p2}, Landroid/os/HandlerThread;->start()V

    .line 14
    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {p2}, Landroidx/core/os/e;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/y;->e:Landroid/os/Handler;

    goto :goto_1

    .line 15
    :cond_2
    iput-object v0, p0, Landroidx/camera/core/y;->f:Landroid/os/HandlerThread;

    .line 16
    iput-object v1, p0, Landroidx/camera/core/y;->e:Landroid/os/Handler;

    .line 17
    :goto_1
    iget-object p2, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    sget-object v1, Landroidx/camera/core/z;->F:Lw/o0$a;

    invoke-virtual {p2, v1, v0}, Landroidx/camera/core/z;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    iput-object p2, p0, Landroidx/camera/core/y;->n:Ljava/lang/Integer;

    .line 18
    invoke-static {p2}, Landroidx/camera/core/y;->i(Ljava/lang/Integer;)V

    .line 19
    invoke-direct {p0, p1}, Landroidx/camera/core/y;->k(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/y;->k:Lcom/google/common/util/concurrent/m;

    return-void

    .line 20
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Landroidx/camera/core/y;Landroid/content/Context;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/y;->n(Landroid/content/Context;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/core/y;Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/y;->m(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/core/y;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/core/y;->l(Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private static f(Landroid/content/Context;)Landroidx/camera/core/z$b;
    .locals 5

    const-string v0, "CameraX"

    .line 1
    invoke-static {p0}, Landroidx/camera/core/impl/utils/d;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    .line 2
    instance-of v2, v1, Landroidx/camera/core/z$b;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 3
    move-object v3, v1

    check-cast v3, Landroidx/camera/core/z$b;

    goto :goto_2

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p0}, Landroidx/camera/core/impl/utils/d;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    const-class v4, Landroidx/camera/core/impl/MetadataHolderService;

    invoke-direct {v2, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 p0, 0x280

    invoke-virtual {v1, v2, p0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    .line 6
    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v1, "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"

    .line 7
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, v3

    :goto_0
    if-nez p0, :cond_2

    const-string p0, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    .line 8
    invoke-static {v0, p0}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    .line 9
    :cond_2
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    .line 10
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/z$b;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, p0

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    goto :goto_1

    :catch_5
    move-exception p0

    goto :goto_1

    :catch_6
    move-exception p0

    :goto_1
    const-string v1, "Failed to retrieve default CameraXConfig.Provider from meta-data"

    .line 12
    invoke-static {v0, v1, p0}, Landroidx/camera/core/q1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-object v3
.end method

.method private static i(Ljava/lang/Integer;)V
    .locals 5

    .line 1
    sget-object v0, Landroidx/camera/core/y;->o:Ljava/lang/Object;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 2
    :try_start_0
    monitor-exit v0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x6

    const-string v4, "minLogLevel"

    invoke-static {v1, v2, v3, v4}, Landroidx/core/util/h;->c(IIILjava/lang/String;)I

    .line 4
    sget-object v1, Landroidx/camera/core/y;->p:Landroid/util/SparseArray;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v3, v2

    .line 6
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 7
    invoke-static {}, Landroidx/camera/core/y;->p()V

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private j(Ljava/util/concurrent/Executor;JLandroid/content/Context;Landroidx/concurrent/futures/c$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "J",
            "Landroid/content/Context;",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v7, Landroidx/camera/core/w;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p5

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Landroidx/camera/core/w;-><init>(Landroidx/camera/core/y;Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V

    invoke-interface {p1, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private k(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/y;->l:Landroidx/camera/core/y$a;

    sget-object v2, Landroidx/camera/core/y$a;->n:Landroidx/camera/core/y$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "CameraX.initInternal() should only be called once per instance"

    invoke-static {v1, v2}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 3
    sget-object v1, Landroidx/camera/core/y$a;->o:Landroidx/camera/core/y$a;

    iput-object v1, p0, Landroidx/camera/core/y;->l:Landroidx/camera/core/y$a;

    .line 4
    new-instance v1, Landroidx/camera/core/v;

    invoke-direct {v1, p0, p1}, Landroidx/camera/core/v;-><init>(Landroidx/camera/core/y;Landroid/content/Context;)V

    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

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

.method private synthetic l(Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 6

    iget-object v4, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Landroidx/camera/core/y;->j(Ljava/util/concurrent/Executor;JLandroid/content/Context;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private synthetic m(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V
    .locals 7

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {p1}, Landroidx/camera/core/impl/utils/d;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 2
    invoke-static {p1}, Landroidx/camera/core/impl/utils/d;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    .line 3
    :cond_0
    iget-object p1, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    .line 4
    invoke-virtual {p1, v0}, Landroidx/camera/core/z;->J(Lw/a0$a;)Lw/a0$a;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 5
    iget-object v1, p0, Landroidx/camera/core/y;->d:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/camera/core/y;->e:Landroid/os/Handler;

    invoke-static {v1, v2}, Lw/h0;->a(Ljava/util/concurrent/Executor;Landroid/os/Handler;)Lw/h0;

    move-result-object v1

    .line 6
    iget-object v2, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    .line 7
    invoke-virtual {v2, v0}, Landroidx/camera/core/z;->H(Landroidx/camera/core/s;)Landroidx/camera/core/s;

    move-result-object v2

    .line 8
    iget-object v3, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    invoke-interface {p1, v3, v1, v2}, Lw/a0$a;->a(Landroid/content/Context;Lw/h0;Landroidx/camera/core/s;)Lw/a0;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/y;->g:Lw/a0;

    .line 9
    iget-object p1, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    .line 10
    invoke-virtual {p1, v0}, Landroidx/camera/core/z;->K(Lw/z$a;)Lw/z$a;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 11
    iget-object v1, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    iget-object v3, p0, Landroidx/camera/core/y;->g:Lw/a0;

    .line 12
    invoke-interface {v3}, Lw/a0;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Landroidx/camera/core/y;->g:Lw/a0;

    .line 13
    invoke-interface {v4}, Lw/a0;->c()Ljava/util/Set;

    move-result-object v4

    .line 14
    invoke-interface {p1, v1, v3, v4}, Lw/z$a;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lw/z;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/y;->h:Lw/z;

    .line 15
    iget-object p1, p0, Landroidx/camera/core/y;->c:Landroidx/camera/core/z;

    .line 16
    invoke-virtual {p1, v0}, Landroidx/camera/core/z;->M(Lw/p2$c;)Lw/p2$c;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 17
    iget-object v1, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    invoke-interface {p1, v1}, Lw/p2$c;->a(Landroid/content/Context;)Lw/p2;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/y;->i:Lw/p2;

    .line 18
    instance-of p1, p2, Landroidx/camera/core/o;

    if-eqz p1, :cond_1

    .line 19
    move-object p1, p2

    check-cast p1, Landroidx/camera/core/o;

    .line 20
    iget-object v1, p0, Landroidx/camera/core/y;->g:Lw/a0;

    invoke-virtual {p1, v1}, Landroidx/camera/core/o;->c(Lw/a0;)V

    .line 21
    :cond_1
    iget-object p1, p0, Landroidx/camera/core/y;->a:Lw/e0;

    iget-object v1, p0, Landroidx/camera/core/y;->g:Lw/a0;

    invoke-virtual {p1, v1}, Lw/e0;->b(Lw/a0;)V

    .line 22
    iget-object p1, p0, Landroidx/camera/core/y;->j:Landroid/content/Context;

    iget-object v1, p0, Landroidx/camera/core/y;->a:Lw/e0;

    invoke-static {p1, v1, v2}, Lw/i0;->a(Landroid/content/Context;Lw/e0;Landroidx/camera/core/s;)V

    .line 23
    invoke-direct {p0}, Landroidx/camera/core/y;->o()V

    .line 24
    invoke-virtual {p3, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 25
    :cond_2
    new-instance p1, Landroidx/camera/core/p1;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing UseCaseConfigFactory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Landroidx/camera/core/p1;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 26
    :cond_3
    new-instance p1, Landroidx/camera/core/p1;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Landroidx/camera/core/p1;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 27
    :cond_4
    new-instance p1, Landroidx/camera/core/p1;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing CameraFactory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Landroidx/camera/core/p1;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_0
    .catch Lw/i0$a; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroidx/camera/core/p1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 28
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long/2addr v1, p4

    const-wide/16 v3, 0x9c4

    cmp-long v5, v1, v3

    if-gez v5, :cond_5

    const-string v0, "CameraX"

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retry init. Start time "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " current time "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {v0, v1, p1}, Landroidx/camera/core/q1;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    iget-object p1, p0, Landroidx/camera/core/y;->e:Landroid/os/Handler;

    new-instance v6, Landroidx/camera/core/x;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Landroidx/camera/core/x;-><init>(Landroidx/camera/core/y;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    const-string p2, "retry_token"

    const-wide/16 p3, 0x1f4

    invoke-static {p1, v6, p2, p3, p4}, Landroidx/core/os/e;->b(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_1

    .line 33
    :cond_5
    iget-object p2, p0, Landroidx/camera/core/y;->b:Ljava/lang/Object;

    monitor-enter p2

    .line 34
    :try_start_1
    sget-object p4, Landroidx/camera/core/y$a;->p:Landroidx/camera/core/y$a;

    iput-object p4, p0, Landroidx/camera/core/y;->l:Landroidx/camera/core/y$a;

    .line 35
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    instance-of p2, p1, Lw/i0$a;

    if-eqz p2, :cond_6

    const-string p1, "CameraX"

    const-string p2, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."

    .line 37
    invoke-static {p1, p2}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p3, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    goto :goto_1

    .line 39
    :cond_6
    instance-of p2, p1, Landroidx/camera/core/p1;

    if-eqz p2, :cond_7

    .line 40
    invoke-virtual {p3, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_1

    .line 41
    :cond_7
    new-instance p2, Landroidx/camera/core/p1;

    invoke-direct {p2, p1}, Landroidx/camera/core/p1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p3, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 42
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private synthetic n(Landroid/content/Context;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v1, p0, Landroidx/camera/core/y;->d:Ljava/util/concurrent/Executor;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/camera/core/y;->j(Ljava/util/concurrent/Executor;JLandroid/content/Context;Landroidx/concurrent/futures/c$a;)V

    const-string p1, "CameraX initInternal"

    return-object p1
.end method

.method private o()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/core/y$a;->q:Landroidx/camera/core/y$a;

    iput-object v1, p0, Landroidx/camera/core/y;->l:Landroidx/camera/core/y$a;

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

.method private static p()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/core/y;->p:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {}, Landroidx/camera/core/q1;->h()V

    return-void

    :cond_0
    const/4 v1, 0x3

    .line 3
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-static {v1}, Landroidx/camera/core/q1;->i(I)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    .line 5
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 6
    invoke-static {v1}, Landroidx/camera/core/q1;->i(I)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    .line 7
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 8
    invoke-static {v1}, Landroidx/camera/core/q1;->i(I)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x6

    .line 9
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 10
    invoke-static {v1}, Landroidx/camera/core/q1;->i(I)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public d()Lw/z;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y;->h:Lw/z;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lw/e0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y;->a:Lw/e0;

    return-object v0
.end method

.method public g()Lw/p2;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y;->i:Lw/p2;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/y;->k:Lcom/google/common/util/concurrent/m;

    return-object v0
.end method
