.class final Lr/a0$b;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 2
    iput-object p1, p0, Lr/a0$b;->b:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lr/a0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    return-void
.end method

.method public static synthetic a(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/a0$b;->f(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method public static synthetic b(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/a0$b;->h(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method public static synthetic c(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr/a0$b;->g(Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method

.method public static synthetic d(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/a0$b;->e(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method private synthetic e(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object v0, p0, Lr/a0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onClosed(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method private synthetic f(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object v0, p0, Lr/a0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onDisconnected(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method private synthetic g(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 1

    iget-object v0, p0, Lr/a0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method

.method private synthetic h(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object v0, p0, Lr/a0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onOpened(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, Lr/a0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lr/d0;

    invoke-direct {v1, p0, p1}, Lr/d0;-><init>(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, Lr/a0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lr/b0;

    invoke-direct {v1, p0, p1}, Lr/b0;-><init>(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 2

    iget-object v0, p0, Lr/a0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lr/e0;

    invoke-direct {v1, p0, p1, p2}, Lr/e0;-><init>(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, Lr/a0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lr/c0;

    invoke-direct {v1, p0, p1}, Lr/c0;-><init>(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
