.class public final Lw/i;
.super Lw/h;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/h;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/i;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/h;

    .line 2
    invoke-virtual {v1}, Lw/h;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lw/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/i;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/h;

    .line 2
    invoke-virtual {v1, p1}, Lw/h;->b(Lw/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lw/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/i;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/h;

    .line 2
    invoke-virtual {v1, p1}, Lw/h;->c(Lw/j;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/i;->a:Ljava/util/List;

    return-object v0
.end method
