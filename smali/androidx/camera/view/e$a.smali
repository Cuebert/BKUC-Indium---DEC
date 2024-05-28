.class Landroidx/camera/view/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/e;->k(Landroidx/camera/core/r;)V
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
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Landroidx/camera/core/r;

.field final synthetic c:Landroidx/camera/view/e;


# direct methods
.method constructor <init>(Landroidx/camera/view/e;Ljava/util/List;Landroidx/camera/core/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/e$a;->c:Landroidx/camera/view/e;

    iput-object p2, p0, Landroidx/camera/view/e$a;->a:Ljava/util/List;

    iput-object p3, p0, Landroidx/camera/view/e$a;->b:Landroidx/camera/core/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/camera/view/e$a;->c:Landroidx/camera/view/e;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/camera/view/e;->e:Lcom/google/common/util/concurrent/m;

    .line 2
    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/h;

    .line 4
    iget-object v1, p0, Landroidx/camera/view/e$a;->b:Landroidx/camera/core/r;

    check-cast v1, Lw/b0;

    invoke-interface {v1, v0}, Lw/b0;->b(Lw/h;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/view/e$a;->c:Landroidx/camera/view/e;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/camera/view/e;->e:Lcom/google/common/util/concurrent/m;

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/view/e$a;->b(Ljava/lang/Void;)V

    return-void
.end method
