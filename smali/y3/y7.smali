.class final Ly3/y7;
.super Ly3/z7;
.source "SourceFile"


# instance fields
.field final transient p:I

.field final transient q:I

.field final synthetic r:Ly3/z7;


# direct methods
.method constructor <init>(Ly3/z7;II)V
    .locals 0

    iput-object p1, p0, Ly3/y7;->r:Ly3/z7;

    invoke-direct {p0}, Ly3/z7;-><init>()V

    iput p2, p0, Ly3/y7;->p:I

    iput p3, p0, Ly3/y7;->q:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Ly3/y7;->r:Ly3/z7;

    invoke-virtual {v0}, Ly3/v7;->i()I

    move-result v0

    iget v1, p0, Ly3/y7;->p:I

    add-int/2addr v0, v1

    iget v1, p0, Ly3/y7;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ly3/y7;->q:I

    const-string v1, "index"

    .line 1
    invoke-static {p1, v0, v1}, Ly3/f4;->a(IILjava/lang/String;)I

    iget-object v0, p0, Ly3/y7;->r:Ly3/z7;

    iget v1, p0, Ly3/y7;->p:I

    add-int/2addr p1, v1

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final i()I
    .locals 2

    iget-object v0, p0, Ly3/y7;->r:Ly3/z7;

    invoke-virtual {v0}, Ly3/v7;->i()I

    move-result v0

    iget v1, p0, Ly3/y7;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method final k()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly3/y7;->r:Ly3/z7;

    invoke-virtual {v0}, Ly3/v7;->k()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final l(II)Ly3/z7;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ly3/z7;"
        }
    .end annotation

    iget v0, p0, Ly3/y7;->q:I

    .line 1
    invoke-static {p1, p2, v0}, Ly3/f4;->c(III)V

    iget-object v0, p0, Ly3/y7;->r:Ly3/z7;

    iget v1, p0, Ly3/y7;->p:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    .line 2
    invoke-virtual {v0, p1, p2}, Ly3/z7;->l(II)Ly3/z7;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Ly3/y7;->q:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly3/z7;->l(II)Ly3/z7;

    move-result-object p1

    return-object p1
.end method
