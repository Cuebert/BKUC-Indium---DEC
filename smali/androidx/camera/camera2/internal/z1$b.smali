.class Landroidx/camera/camera2/internal/z1$b;
.super Lw/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/z1;->p(Landroidx/concurrent/futures/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Landroidx/camera/camera2/internal/z1;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/z1;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/z1$b;->b:Landroidx/camera/camera2/internal/z1;

    iput-object p2, p0, Landroidx/camera/camera2/internal/z1$b;->a:Landroidx/concurrent/futures/c$a;

    invoke-direct {p0}, Lw/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1$b;->a:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Landroidx/camera/core/m;

    const-string v2, "Camera is closed"

    invoke-direct {v1, v2}, Landroidx/camera/core/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public b(Lw/q;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/camera/camera2/internal/z1$b;->a:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c(Lw/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z1$b;->a:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lw/y$b;

    invoke-direct {v1, p1}, Lw/y$b;-><init>(Lw/j;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method
