.class Landroidx/camera/core/x2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/x2;-><init>(Landroid/util/Size;Lw/d0;Z)V
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
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Lcom/google/common/util/concurrent/m;

.field final synthetic c:Landroidx/camera/core/x2;


# direct methods
.method constructor <init>(Landroidx/camera/core/x2;Landroidx/concurrent/futures/c$a;Lcom/google/common/util/concurrent/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/x2$a;->c:Landroidx/camera/core/x2;

    iput-object p2, p0, Landroidx/camera/core/x2$a;->a:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Landroidx/camera/core/x2$a;->b:Lcom/google/common/util/concurrent/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of p1, p1, Landroidx/camera/core/x2$e;

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Landroidx/camera/core/x2$a;->b:Lcom/google/common/util/concurrent/m;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->h(Z)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Landroidx/camera/core/x2$a;->a:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->h(Z)V

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/core/x2$a;->a:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->h(Z)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/x2$a;->b(Ljava/lang/Void;)V

    return-void
.end method
