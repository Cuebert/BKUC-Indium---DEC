.class public final Lr/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/a0$b;,
        Lr/a0$a;
    }
.end annotation


# instance fields
.field private final a:Lr/a0$a;


# direct methods
.method private constructor <init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 3
    new-instance p2, Lr/h0;

    invoke-direct {p2, p1}, Lr/h0;-><init>(Landroid/hardware/camera2/CameraDevice;)V

    iput-object p2, p0, Lr/a0;->a:Lr/a0$a;

    goto :goto_0

    :cond_0
    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    .line 4
    invoke-static {p1, p2}, Lr/g0;->h(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/g0;

    move-result-object p1

    iput-object p1, p0, Lr/a0;->a:Lr/a0$a;

    goto :goto_0

    :cond_1
    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 5
    invoke-static {p1, p2}, Lr/f0;->g(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/f0;

    move-result-object p1

    iput-object p1, p0, Lr/a0;->a:Lr/a0$a;

    goto :goto_0

    .line 6
    :cond_2
    invoke-static {p1, p2}, Lr/i0;->d(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/i0;

    move-result-object p1

    iput-object p1, p0, Lr/a0;->a:Lr/a0$a;

    :goto_0
    return-void
.end method

.method public static b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/a0;
    .locals 1

    new-instance v0, Lr/a0;

    invoke-direct {v0, p0, p1}, Lr/a0;-><init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Ls/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lr/f;
        }
    .end annotation

    iget-object v0, p0, Lr/a0;->a:Lr/a0$a;

    invoke-interface {v0, p1}, Lr/a0$a;->a(Ls/g;)V

    return-void
.end method
