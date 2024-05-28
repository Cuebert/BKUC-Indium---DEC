.class Landroidx/camera/camera2/internal/g0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/g0;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/g0;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/g0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lw/r0$a;

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    check-cast p1, Lw/r0$a;

    .line 3
    invoke-virtual {p1}, Lw/r0$a;->a()Lw/r0;

    move-result-object p1

    .line 4
    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/g0;->F(Lw/r0;)Lw/c2;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/g0;->b0(Lw/c2;)V

    :cond_0
    return-void

    .line 6
    :cond_1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_2

    .line 7
    iget-object p1, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    const-string v0, "Unable to configure camera cancelled"

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->r:Landroidx/camera/camera2/internal/g0$f;

    sget-object v1, Landroidx/camera/camera2/internal/g0$f;->q:Landroidx/camera/camera2/internal/g0$f;

    if-ne v0, v1, :cond_3

    .line 9
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    const/4 v2, 0x4

    .line 10
    invoke-static {v2, p1}, Landroidx/camera/core/t$a;->b(ILjava/lang/Throwable;)Landroidx/camera/core/t$a;

    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Landroidx/camera/camera2/internal/g0;->h0(Landroidx/camera/camera2/internal/g0$f;Landroidx/camera/core/t$a;)V

    .line 12
    :cond_3
    instance-of v0, p1, Landroid/hardware/camera2/CameraAccessException;

    if-eqz v0, :cond_4

    .line 13
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to configure camera due to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/g0;->D(Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_4
    instance-of p1, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz p1, :cond_5

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to configure camera "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$b;->a:Landroidx/camera/camera2/internal/g0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/g0;->w:Landroidx/camera/camera2/internal/j0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/j0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeout!"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/g0$b;->b(Ljava/lang/Void;)V

    return-void
.end method
