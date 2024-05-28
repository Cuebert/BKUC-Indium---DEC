.class public final synthetic Lr/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/g$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/h;->n:Lr/g$b;

    iput-object p2, p0, Lr/h;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, Lr/h;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr/h;->n:Lr/g$b;

    iget-object v1, p0, Lr/h;->o:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, Lr/h;->p:I

    invoke-static {v0, v1, v2}, Lr/g$b;->c(Lr/g$b;Landroid/hardware/camera2/CameraCaptureSession;I)V

    return-void
.end method
