.class public Lu/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/c2$b;)V
    .locals 3

    .line 1
    const-class v0, Lt/x;

    invoke-static {v0}, Lt/l;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lt/x;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    .line 3
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x2

    .line 4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v1, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 6
    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lw/c2$b;->g(Lw/o0;)V

    return-void
.end method
