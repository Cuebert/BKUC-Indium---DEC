.class public final synthetic Lr/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/g$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic p:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic q:J

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/j;->n:Lr/g$b;

    iput-object p2, p0, Lr/j;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/j;->p:Landroid/hardware/camera2/CaptureRequest;

    iput-wide p4, p0, Lr/j;->q:J

    iput-wide p6, p0, Lr/j;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lr/j;->n:Lr/g$b;

    iget-object v1, p0, Lr/j;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/j;->p:Landroid/hardware/camera2/CaptureRequest;

    iget-wide v3, p0, Lr/j;->q:J

    iget-wide v5, p0, Lr/j;->r:J

    invoke-static/range {v0 .. v6}, Lr/g$b;->d(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    return-void
.end method
