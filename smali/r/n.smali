.class public final synthetic Lr/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/g$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic p:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic q:Landroid/view/Surface;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/n;->n:Lr/g$b;

    iput-object p2, p0, Lr/n;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/n;->p:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, Lr/n;->q:Landroid/view/Surface;

    iput-wide p5, p0, Lr/n;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lr/n;->n:Lr/g$b;

    iget-object v1, p0, Lr/n;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/n;->p:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, Lr/n;->q:Landroid/view/Surface;

    iget-wide v4, p0, Lr/n;->r:J

    invoke-static/range {v0 .. v5}, Lr/g$b;->a(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V

    return-void
.end method
