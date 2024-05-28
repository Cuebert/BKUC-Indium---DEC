.class final Lt3/g0;
.super Lt3/a0;
.source "SourceFile"


# instance fields
.field final synthetic q:Lt3/h0;


# direct methods
.method constructor <init>(Lt3/h0;)V
    .locals 0

    iput-object p1, p0, Lt3/g0;->q:Lt3/h0;

    invoke-direct {p0}, Lt3/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    iget-object v1, p0, Lt3/g0;->q:Lt3/h0;

    iget-object v1, v1, Lt3/h0;->p:Lt3/i0;

    invoke-static {v1}, Lt3/i0;->j(Lt3/i0;)Lt3/u0;

    move-result-object v1

    iget-object v1, v1, Lt3/u0;->r:Lt3/a0;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lt3/g0;->q:Lt3/h0;

    iget-object v2, v2, Lt3/h0;->p:Lt3/i0;

    invoke-static {v2}, Lt3/i0;->d(Lt3/i0;)Lt3/a0;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lt3/g0;->q:Lt3/h0;

    iget-object v0, v0, Lt3/h0;->p:Lt3/i0;

    invoke-virtual {v0}, Lt3/i0;->size()I

    move-result v0

    return v0
.end method
