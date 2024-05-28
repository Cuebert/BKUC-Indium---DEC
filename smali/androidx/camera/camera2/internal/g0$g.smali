.class final Landroidx/camera/camera2/internal/g0$g;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/g0$g$a;,
        Landroidx/camera/camera2/internal/g0$g$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private c:Landroidx/camera/camera2/internal/g0$g$b;

.field d:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private final e:Landroidx/camera/camera2/internal/g0$g$a;

.field final synthetic f:Landroidx/camera/camera2/internal/g0;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/g0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 2
    new-instance p1, Landroidx/camera/camera2/internal/g0$g$a;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/g0$g$a;-><init>(Landroidx/camera/camera2/internal/g0$g;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->e:Landroidx/camera/camera2/internal/g0$g$a;

    .line 3
    iput-object p2, p0, Landroidx/camera/camera2/internal/g0$g;->a:Ljava/util/concurrent/Executor;

    .line 4
    iput-object p3, p0, Landroidx/camera/camera2/internal/g0$g;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method private b(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->p:Landroidx/camera/camera2/internal/g0$f;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->s:Landroidx/camera/camera2/internal/g0$f;

    if-ne v0, v1, :cond_0

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

    const-string v4, "Attempt to handle open error from non open state: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v4, v4, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    const-string v0, "Camera2CameraImpl"

    const/4 v1, 0x2

    if-eq p2, v3, :cond_3

    if-eq p2, v1, :cond_3

    const/4 v4, 0x4

    if-eq p2, v4, :cond_3

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error observed on open (or opening) camera device "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-static {p2}, Landroidx/camera/camera2/internal/g0;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " closing camera."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {v0, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x3

    if-ne p2, p1, :cond_2

    const/4 p1, 0x5

    goto :goto_2

    :cond_2
    const/4 p1, 0x6

    .line 6
    :goto_2
    iget-object p2, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-static {p1}, Landroidx/camera/core/t$a;->a(I)Landroidx/camera/core/t$a;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroidx/camera/camera2/internal/g0;->h0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;)V

    .line 7
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/g0;->z(Z)V

    goto :goto_3

    :cond_3
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {p2}, Landroidx/camera/camera2/internal/g0;->H(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v3

    const-string p1, "Attempt to reopen camera[%s] after error[%s]"

    .line 9
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0, p2}, Landroidx/camera/camera2/internal/g0$g;->c(I)V

    :goto_3
    return-void
.end method

.method private c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget v0, v0, Landroidx/camera/camera2/internal/g0;->y:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, "Can only reopen camera device after error if the camera device is actually in an error state."

    invoke-static {v0, v3}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    const/4 v0, 0x2

    if-eq p1, v2, :cond_1

    if-eq p1, v0, :cond_2

    const/4 v2, 0x3

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    .line 2
    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->s:Landroidx/camera/camera2/internal/g0$f;

    invoke-static {v2}, Landroidx/camera/core/t$a;->a(I)Landroidx/camera/core/t$a;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroidx/camera/camera2/internal/g0;->h0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;)V

    .line 3
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/g0;->z(Z)V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cancelling scheduled re-open: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$g$b;->b()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    .line 5
    iget-object v2, p0, Landroidx/camera/camera2/internal/g0$g;->d:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v2, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 6
    iput-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method d()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->e:Landroidx/camera/camera2/internal/g0$g$a;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$g$a;->e()V

    return-void
.end method

.method e()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->h(Z)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->d:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Landroidx/core/util/h;->h(Z)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->e:Landroidx/camera/camera2/internal/g0$g$a;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$g$a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    new-instance v0, Landroidx/camera/camera2/internal/g0$g$b;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0$g;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, p0, v1}, Landroidx/camera/camera2/internal/g0$g$b;-><init>(Landroidx/camera/camera2/internal/g0$g;Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting camera re-open in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0$g;->e:Landroidx/camera/camera2/internal/g0$g$a;

    .line 6
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/g0$g$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "ms: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " activeResuming = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-boolean v2, v2, Landroidx/camera/camera2/internal/g0;->N:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0$g;->c:Landroidx/camera/camera2/internal/g0$g$b;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0$g;->e:Landroidx/camera/camera2/internal/g0$g$a;

    .line 9
    invoke-virtual {v2}, Landroidx/camera/camera2/internal/g0$g$a;->c()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->d:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_2

    .line 11
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera reopening attempted for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0$g;->e:Landroidx/camera/camera2/internal/g0$g$a;

    .line 12
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/g0$g$a;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "ms without success."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraImpl"

    .line 13
    invoke-static {v1, v0}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->o:Landroidx/camera/camera2/internal/g0$f;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/camera/camera2/internal/g0;->i0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;Z)V

    :goto_2
    return-void
.end method

.method f()Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-boolean v1, v0, Landroidx/camera/camera2/internal/g0;->N:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget v0, v0, Landroidx/camera/camera2/internal/g0;->y:I

    if-eq v0, v2, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    const-string v1, "CameraDevice.onClosed()"

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected onClose callback on camera device: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 3
    sget-object p1, Landroidx/camera/camera2/internal/g0$c;->a:[I

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_4

    const/4 v0, 0x6

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera closed while in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v1, v1, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_2
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget v0, p1, Landroidx/camera/camera2/internal/g0;->y:I

    if-eqz v0, :cond_3

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera closed due to error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget v1, v1, Landroidx/camera/camera2/internal/g0;->y:I

    invoke-static {v1}, Landroidx/camera/camera2/internal/g0;->H(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0$g;->e()V

    goto :goto_2

    .line 8
    :cond_3
    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/g0;->o0(Z)V

    goto :goto_2

    .line 9
    :cond_4
    :goto_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0;->K()Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->h(Z)V

    .line 10
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0;->G()V

    :goto_2
    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    const-string v1, "CameraDevice.onDisconnected()"

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/g0$g;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iput-object p1, v0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    .line 2
    iput p2, v0, Landroidx/camera/camera2/internal/g0;->y:I

    .line 3
    sget-object v1, Landroidx/camera/camera2/internal/g0$c;->a:[I

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-string v3, "Camera2CameraImpl"

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eq v0, v5, :cond_2

    const/4 v6, 0x4

    if-eq v0, v6, :cond_1

    const/4 v6, 0x5

    if-eq v0, v6, :cond_1

    const/4 v6, 0x6

    if-eq v0, v6, :cond_1

    const/4 v6, 0x7

    if-ne v0, v6, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onError() should not be possible from state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-array v0, v5, [Ljava/lang/Object;

    .line 5
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v4

    invoke-static {p2}, Landroidx/camera/camera2/internal/g0;->H(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    iget-object v2, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v2, v2, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error."

    .line 6
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/g0$g;->b(Landroid/hardware/camera2/CameraDevice;I)V

    goto :goto_1

    :cond_2
    :goto_0
    new-array v0, v5, [Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v4

    invoke-static {p2}, Landroidx/camera/camera2/internal/g0;->H(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object p1, p1, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera."

    .line 9
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1, v4}, Landroidx/camera/camera2/internal/g0;->z(Z)V

    :goto_1
    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    const-string v1, "CameraDevice.onOpened()"

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iput-object p1, v0, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    const/4 p1, 0x0

    .line 3
    iput p1, v0, Landroidx/camera/camera2/internal/g0;->y:I

    .line 4
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0$g;->d()V

    .line 5
    sget-object p1, Landroidx/camera/camera2/internal/g0$c;->a:[I

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOpened() should not be possible from state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object v1, v1, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/g0;->g0(Landroidx/camera/camera2/internal/g0$f;)V

    .line 8
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0;->Z()V

    goto :goto_1

    .line 9
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/g0;->K()Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->h(Z)V

    .line 10
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    iget-object p1, p1, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 11
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$g;->f:Landroidx/camera/camera2/internal/g0;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/camera/camera2/internal/g0;->x:Landroid/hardware/camera2/CameraDevice;

    :goto_1
    return-void
.end method
