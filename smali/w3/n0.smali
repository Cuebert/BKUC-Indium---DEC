.class abstract Lw3/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field n:I

.field o:I

.field p:I

.field final synthetic q:Lw3/r0;


# direct methods
.method synthetic constructor <init>(Lw3/r0;Lw3/j0;)V
    .locals 0

    iput-object p1, p0, Lw3/n0;->q:Lw3/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/r0;->a(Lw3/r0;)I

    move-result p2

    iput p2, p0, Lw3/n0;->n:I

    invoke-virtual {p1}, Lw3/r0;->e()I

    move-result p1

    iput p1, p0, Lw3/n0;->o:I

    const/4 p1, -0x1

    iput p1, p0, Lw3/n0;->p:I

    return-void
.end method

.method private final b()V
    .locals 2

    iget-object v0, p0, Lw3/n0;->q:Lw3/r0;

    invoke-static {v0}, Lw3/r0;->a(Lw3/r0;)I

    move-result v0

    iget v1, p0, Lw3/n0;->n:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method abstract a(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lw3/n0;->o:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lw3/n0;->b()V

    invoke-virtual {p0}, Lw3/n0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lw3/n0;->o:I

    iput v0, p0, Lw3/n0;->p:I

    .line 3
    invoke-virtual {p0, v0}, Lw3/n0;->a(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lw3/n0;->q:Lw3/r0;

    iget v2, p0, Lw3/n0;->o:I

    invoke-virtual {v1, v2}, Lw3/r0;->f(I)I

    move-result v1

    iput v1, p0, Lw3/n0;->o:I

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 5
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lw3/n0;->b()V

    iget v0, p0, Lw3/n0;->p:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    .line 2
    invoke-static {v0, v1}, Lw3/p;->d(ZLjava/lang/Object;)V

    iget v0, p0, Lw3/n0;->n:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lw3/n0;->n:I

    iget-object v0, p0, Lw3/n0;->q:Lw3/r0;

    iget-object v1, v0, Lw3/r0;->p:[Ljava/lang/Object;

    iget v2, p0, Lw3/n0;->p:I

    .line 3
    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lw3/r0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lw3/n0;->o:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, Lw3/n0;->o:I

    iput v1, p0, Lw3/n0;->p:I

    return-void
.end method
