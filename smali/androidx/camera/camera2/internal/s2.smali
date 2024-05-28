.class public final synthetic Landroidx/camera/camera2/internal/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/u$b;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/u2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/u2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/s2;->a:Landroidx/camera/camera2/internal/u2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/s2;->a:Landroidx/camera/camera2/internal/u2;

    invoke-static {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/u2;->K(Landroidx/camera/camera2/internal/u2;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method
