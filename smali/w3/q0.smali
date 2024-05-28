.class final Lw3/q0;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# instance fields
.field final synthetic n:Lw3/r0;


# direct methods
.method constructor <init>(Lw3/r0;)V
    .locals 0

    iput-object p1, p0, Lw3/q0;->n:Lw3/r0;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lw3/q0;->n:Lw3/r0;

    invoke-virtual {v0}, Lw3/r0;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator;"
        }
    .end annotation

    iget-object v0, p0, Lw3/q0;->n:Lw3/r0;

    .line 1
    invoke-virtual {v0}, Lw3/r0;->j()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Lw3/l0;

    .line 3
    invoke-direct {v1, v0}, Lw3/l0;-><init>(Lw3/r0;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lw3/q0;->n:Lw3/r0;

    invoke-virtual {v0}, Lw3/r0;->size()I

    move-result v0

    return v0
.end method
