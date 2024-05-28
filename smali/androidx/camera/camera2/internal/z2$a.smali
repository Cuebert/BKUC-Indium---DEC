.class Landroidx/camera/camera2/internal/z2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/z2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/z2;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/z2;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/z2$a;->a:Landroidx/camera/camera2/internal/z2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/z2$a;->a:Landroidx/camera/camera2/internal/z2;

    iget-object v0, v0, Landroidx/camera/camera2/internal/z2;->e:Landroidx/camera/camera2/internal/z2$b;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/z2$b;->a(Landroid/hardware/camera2/TotalCaptureResult;)V

    const/4 p1, 0x0

    return p1
.end method
