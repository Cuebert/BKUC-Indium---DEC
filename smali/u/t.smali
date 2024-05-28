.class public final synthetic Lu/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lu/u$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Ls/g;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lu/u$b;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/t;->a:Lu/u$b;

    iput-object p2, p0, Lu/t;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p3, p0, Lu/t;->c:Ls/g;

    iput-object p4, p0, Lu/t;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;
    .locals 4

    iget-object v0, p0, Lu/t;->a:Lu/u$b;

    iget-object v1, p0, Lu/t;->b:Landroid/hardware/camera2/CameraDevice;

    iget-object v2, p0, Lu/t;->c:Ls/g;

    iget-object v3, p0, Lu/t;->d:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lu/u;->b(Lu/u$b;Landroid/hardware/camera2/CameraDevice;Ls/g;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method
