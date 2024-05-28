.class final Lt3/z;
.super Lt3/a0;
.source "SourceFile"


# instance fields
.field final transient q:I

.field final transient r:I

.field final synthetic s:Lt3/a0;


# direct methods
.method constructor <init>(Lt3/a0;II)V
    .locals 0

    iput-object p1, p0, Lt3/z;->s:Lt3/a0;

    invoke-direct {p0}, Lt3/a0;-><init>()V

    iput p2, p0, Lt3/z;->q:I

    iput p3, p0, Lt3/z;->r:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Lt3/z;->s:Lt3/a0;

    invoke-virtual {v0}, Lt3/w;->i()I

    move-result v0

    iget v1, p0, Lt3/z;->q:I

    add-int/2addr v0, v1

    iget v1, p0, Lt3/z;->r:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lt3/z;->r:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lt3/q;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lt3/z;->s:Lt3/a0;

    iget v1, p0, Lt3/z;->q:I

    add-int/2addr p1, v1

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final i()I
    .locals 2

    iget-object v0, p0, Lt3/z;->s:Lt3/a0;

    invoke-virtual {v0}, Lt3/w;->i()I

    move-result v0

    iget v1, p0, Lt3/z;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method final l()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt3/z;->s:Lt3/a0;

    invoke-virtual {v0}, Lt3/w;->l()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final o(II)Lt3/a0;
    .locals 2

    .line 1
    iget v0, p0, Lt3/z;->r:I

    invoke-static {p1, p2, v0}, Lt3/q;->e(III)V

    iget-object v0, p0, Lt3/z;->s:Lt3/a0;

    iget v1, p0, Lt3/z;->q:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    .line 2
    invoke-virtual {v0, p1, p2}, Lt3/a0;->o(II)Lt3/a0;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lt3/z;->r:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/a0;->o(II)Lt3/a0;

    move-result-object p1

    return-object p1
.end method
