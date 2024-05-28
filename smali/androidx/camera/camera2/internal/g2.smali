.class public final synthetic Landroidx/camera/camera2/internal/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/h2;

.field public final synthetic b:Lw/c2;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic d:Landroidx/camera/camera2/internal/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/h2;Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/g2;->a:Landroidx/camera/camera2/internal/h2;

    iput-object p2, p0, Landroidx/camera/camera2/internal/g2;->b:Lw/c2;

    iput-object p3, p0, Landroidx/camera/camera2/internal/g2;->c:Landroid/hardware/camera2/CameraDevice;

    iput-object p4, p0, Landroidx/camera/camera2/internal/g2;->d:Landroidx/camera/camera2/internal/v2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/g2;->a:Landroidx/camera/camera2/internal/h2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g2;->b:Lw/c2;

    iget-object v2, p0, Landroidx/camera/camera2/internal/g2;->c:Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Landroidx/camera/camera2/internal/g2;->d:Landroidx/camera/camera2/internal/v2;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/camera/camera2/internal/h2;->h(Landroidx/camera/camera2/internal/h2;Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method
