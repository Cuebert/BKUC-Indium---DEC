.class final Landroidx/camera/camera2/internal/g0$d;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "SourceFile"

# interfaces
.implements Lw/g0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Z

.field final synthetic c:Landroidx/camera/camera2/internal/g0;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/camera2/internal/g0$d;->c:Landroidx/camera/camera2/internal/g0;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/g0$d;->b:Z

    .line 3
    iput-object p2, p0, Landroidx/camera/camera2/internal/g0$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$d;->c:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->o:Landroidx/camera/camera2/internal/g0$f;

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$d;->c:Landroidx/camera/camera2/internal/g0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/g0;->o0(Z)V

    :cond_0
    return-void
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/g0$d;->b:Z

    return v0
.end method

.method public onCameraAvailable(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$d;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/g0$d;->b:Z

    .line 3
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$d;->c:Landroidx/camera/camera2/internal/g0;

    iget-object p1, p1, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v0, Landroidx/camera/camera2/internal/g0$f;->o:Landroidx/camera/camera2/internal/g0$f;

    if-ne p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$d;->c:Landroidx/camera/camera2/internal/g0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/g0;->o0(Z)V

    :cond_1
    return-void
.end method

.method public onCameraUnavailable(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$d;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/g0$d;->b:Z

    return-void
.end method
