.class public final synthetic Landroidx/camera/camera2/internal/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/u$c;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/u2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/u2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/camera2/internal/u2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/camera2/internal/u2;

    invoke-static {v0, p1, p2}, Landroidx/camera/camera2/internal/u2;->M(Landroidx/camera/camera2/internal/u2;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method
