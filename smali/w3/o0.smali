.class final Lw3/o0;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field final synthetic n:Lw3/r0;


# direct methods
.method constructor <init>(Lw3/r0;)V
    .locals 0

    iput-object p1, p0, Lw3/o0;->n:Lw3/r0;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lw3/o0;->n:Lw3/r0;

    invoke-virtual {v0}, Lw3/r0;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lw3/o0;->n:Lw3/r0;

    invoke-virtual {v0, p1}, Lw3/r0;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator;"
        }
    .end annotation

    iget-object v0, p0, Lw3/o0;->n:Lw3/r0;

    .line 1
    invoke-virtual {v0}, Lw3/r0;->j()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Lw3/j0;

    .line 3
    invoke-direct {v1, v0}, Lw3/j0;-><init>(Lw3/r0;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    iget-object v0, p0, Lw3/o0;->n:Lw3/r0;

    .line 1
    invoke-virtual {v0}, Lw3/r0;->j()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw3/o0;->n:Lw3/r0;

    .line 3
    invoke-static {v0, p1}, Lw3/r0;->g(Lw3/r0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lw3/r0;->h()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lw3/o0;->n:Lw3/r0;

    invoke-virtual {v0}, Lw3/r0;->size()I

    move-result v0

    return v0
.end method
