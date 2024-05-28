.class public final synthetic Landroidx/camera/camera2/internal/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/o0$e$a;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/o0$c;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/o0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/p0;->a:Landroidx/camera/camera2/internal/o0$c;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/p0;->a:Landroidx/camera/camera2/internal/o0$c;

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/o0$c;->c(Landroidx/camera/camera2/internal/o0$c;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
