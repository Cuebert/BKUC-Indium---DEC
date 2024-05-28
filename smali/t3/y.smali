.class final Lt3/y;
.super Lt3/a0;
.source "SourceFile"


# instance fields
.field private final transient q:Lt3/a0;


# direct methods
.method constructor <init>(Lt3/a0;)V
    .locals 0

    invoke-direct {p0}, Lt3/a0;-><init>()V

    iput-object p1, p0, Lt3/y;->q:Lt3/a0;

    return-void
.end method

.method private final u(I)I
    .locals 1

    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0, p1}, Lt3/a0;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const-string v1, "index"

    .line 2
    invoke-static {p1, v0, v1}, Lt3/q;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    .line 3
    invoke-direct {p0, p1}, Lt3/y;->u(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0, p1}, Lt3/a0;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lt3/y;->u(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0, p1}, Lt3/a0;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lt3/y;->u(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final m()Lt3/a0;
    .locals 1

    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    return-object v0
.end method

.method public final o(II)Lt3/a0;
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 2
    invoke-static {p1, p2, v0}, Lt3/q;->e(III)V

    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    sub-int/2addr v1, p2

    iget-object p2, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    sub-int/2addr p2, p1

    .line 4
    invoke-virtual {v0, v1, p2}, Lt3/a0;->o(II)Lt3/a0;

    move-result-object p1

    invoke-virtual {p1}, Lt3/a0;->m()Lt3/a0;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lt3/y;->q:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/a0;->o(II)Lt3/a0;

    move-result-object p1

    return-object p1
.end method
