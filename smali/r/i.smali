.class public final synthetic Lr/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/g$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic p:I

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/i;->n:Lr/g$b;

    iput-object p2, p0, Lr/i;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, Lr/i;->p:I

    iput-wide p4, p0, Lr/i;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lr/i;->n:Lr/g$b;

    iget-object v1, p0, Lr/i;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, Lr/i;->p:I

    iget-wide v3, p0, Lr/i;->q:J

    invoke-static {v0, v1, v2, v3, v4}, Lr/g$b;->e(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V

    return-void
.end method
