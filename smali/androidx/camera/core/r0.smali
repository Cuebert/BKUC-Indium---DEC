.class final Landroidx/camera/core/r0;
.super Landroidx/camera/core/q0;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/q0;-><init>()V

    return-void
.end method


# virtual methods
.method d(Lw/h1;)Landroidx/camera/core/l1;
    .locals 0

    invoke-interface {p1}, Lw/h1;->i()Landroidx/camera/core/l1;

    move-result-object p1

    return-object p1
.end method

.method g()V
    .locals 0

    return-void
.end method

.method p(Landroidx/camera/core/l1;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/q0;->e(Landroidx/camera/core/l1;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    .line 2
    new-instance v1, Landroidx/camera/core/r0$a;

    invoke-direct {v1, p0, p1}, Landroidx/camera/core/r0$a;-><init>(Landroidx/camera/core/r0;Landroidx/camera/core/l1;)V

    .line 3
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 4
    invoke-static {v0, v1, p1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method
