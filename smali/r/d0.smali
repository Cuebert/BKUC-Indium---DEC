.class public final synthetic Lr/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/a0$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/d0;->n:Lr/a0$b;

    iput-object p2, p0, Lr/d0;->o:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr/d0;->n:Lr/a0$b;

    iget-object v1, p0, Lr/d0;->o:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, v1}, Lr/a0$b;->d(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method
