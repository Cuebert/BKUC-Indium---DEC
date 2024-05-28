.class public final synthetic Lr/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/a0$b;

.field public final synthetic o:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/e0;->n:Lr/a0$b;

    iput-object p2, p0, Lr/e0;->o:Landroid/hardware/camera2/CameraDevice;

    iput p3, p0, Lr/e0;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr/e0;->n:Lr/a0$b;

    iget-object v1, p0, Lr/e0;->o:Landroid/hardware/camera2/CameraDevice;

    iget v2, p0, Lr/e0;->p:I

    invoke-static {v0, v1, v2}, Lr/a0$b;->c(Lr/a0$b;Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method
