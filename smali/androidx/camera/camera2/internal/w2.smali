.class final Landroidx/camera/camera2/internal/w2;
.super Landroidx/camera/camera2/internal/j2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/w2$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/j2$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/j2$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j2$a;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method static varargs v([Landroidx/camera/camera2/internal/j2$a;)Landroidx/camera/camera2/internal/j2$a;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/w2;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/w2;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public n(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->n(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->o(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->p(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->q(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->r(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->s(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method t(Landroidx/camera/camera2/internal/j2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/j2$a;->t(Landroidx/camera/camera2/internal/j2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u(Landroidx/camera/camera2/internal/j2;Landroid/view/Surface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/j2$a;

    .line 2
    invoke-virtual {v1, p1, p2}, Landroidx/camera/camera2/internal/j2$a;->u(Landroidx/camera/camera2/internal/j2;Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    return-void
.end method
