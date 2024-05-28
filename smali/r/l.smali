.class public final synthetic Lr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/g$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic p:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic q:Landroid/hardware/camera2/CaptureResult;


# direct methods
.method public synthetic constructor <init>(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/l;->n:Lr/g$b;

    iput-object p2, p0, Lr/l;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/l;->p:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, Lr/l;->q:Landroid/hardware/camera2/CaptureResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lr/l;->n:Lr/g$b;

    iget-object v1, p0, Lr/l;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/l;->p:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, Lr/l;->q:Landroid/hardware/camera2/CaptureResult;

    invoke-static {v0, v1, v2, v3}, Lr/g$b;->b(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method
