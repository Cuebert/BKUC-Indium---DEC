.class public final synthetic Lr/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/g$c;

.field public final synthetic o:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic p:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lr/g$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/u;->n:Lr/g$c;

    iput-object p2, p0, Lr/u;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/u;->p:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr/u;->n:Lr/g$c;

    iget-object v1, p0, Lr/u;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/u;->p:Landroid/view/Surface;

    invoke-static {v0, v1, v2}, Lr/g$c;->a(Lr/g$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
