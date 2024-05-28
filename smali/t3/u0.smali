.class final Lt3/u0;
.super Lt3/k0;
.source "SourceFile"


# static fields
.field static final s:Lt3/u0;


# instance fields
.field final transient r:Lt3/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lt3/u0;

    sget v1, Lt3/a0;->p:I

    .line 2
    sget-object v1, Lt3/s0;->s:Lt3/a0;

    sget-object v2, Lt3/p0;->n:Lt3/p0;

    .line 3
    invoke-direct {v0, v1, v2}, Lt3/u0;-><init>(Lt3/a0;Ljava/util/Comparator;)V

    sput-object v0, Lt3/u0;->s:Lt3/u0;

    return-void
.end method

.method constructor <init>(Lt3/a0;Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0, p2}, Lt3/k0;-><init>(Ljava/util/Comparator;)V

    iput-object p1, p0, Lt3/u0;->r:Lt3/a0;

    return-void
.end method


# virtual methods
.method public final B()Lt3/c1;
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    invoke-virtual {v0}, Lt3/a0;->m()Lt3/a0;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v0

    return-object v0
.end method

.method final C(Ljava/lang/Object;Z)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v1, p0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method

.method final D(Ljava/lang/Object;Z)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v1, p0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method

.method final E(II)Lt3/u0;
    .locals 2

    if-nez p1, :cond_1

    .line 1
    iget-object p1, p0, Lt3/u0;->r:Lt3/a0;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    if-ge p1, p2, :cond_2

    new-instance v0, Lt3/u0;

    iget-object v1, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-virtual {v1, p1, p2}, Lt3/a0;->o(II)Lt3/a0;

    move-result-object p1

    iget-object p2, p0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-direct {v0, p1, p2}, Lt3/u0;-><init>(Lt3/a0;Ljava/util/Comparator;)V

    return-object v0

    :cond_2
    iget-object p1, p0, Lt3/k0;->p:Ljava/util/Comparator;

    .line 3
    invoke-static {p1}, Lt3/k0;->A(Ljava/util/Comparator;)Lt3/u0;

    move-result-object p1

    return-object p1
.end method

.method final c([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Lt3/u0;->r:Lt3/a0;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lt3/w;->c([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lt3/u0;->D(Ljava/lang/Object;Z)I

    move-result p1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p0, Lt3/u0;->r:Lt3/a0;

    iget-object v2, p0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-static {v1, p1, v2}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lt3/o0;

    if-eqz v0, :cond_0

    check-cast p1, Lt3/o0;

    invoke-interface {p1}, Lt3/o0;->zza()Ljava/util/Set;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lt3/k0;->p:Ljava/util/Comparator;

    .line 2
    invoke-static {v0, p1}, Lt3/b1;->a(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v2}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v0

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    .line 7
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    :goto_0
    :try_start_0
    iget-object v5, p0, Lt3/k0;->p:Ljava/util/Comparator;

    .line 9
    invoke-interface {v5, v4, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_4

    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    return v2

    .line 11
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :cond_4
    if-nez v5, :cond_6

    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_5

    return v1

    .line 13
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_6
    return v2

    .line 14
    :cond_7
    :goto_1
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic descendingIterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lt3/u0;->B()Lt3/c1;

    move-result-object v0

    return-object v0
.end method

.method final e()I
    .locals 1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    invoke-virtual {v0}, Lt3/w;->e()I

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Ljava/util/Set;

    iget-object v1, p0, Lt3/u0;->r:Lt3/a0;

    .line 3
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 4
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    .line 5
    :cond_2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Lt3/k0;->p:Ljava/util/Comparator;

    .line 6
    invoke-static {v1, p1}, Lt3/b1;->a(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :try_start_0
    iget-object v1, p0, Lt3/u0;->r:Lt3/a0;

    .line 8
    invoke-virtual {v1, v2}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v1

    .line 9
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, Lt3/k0;->p:Ljava/util/Comparator;

    .line 12
    invoke-interface {v5, v3, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_4

    :cond_5
    return v2

    :cond_6
    return v0

    :catch_0
    return v2

    .line 13
    :cond_7
    invoke-virtual {p0, p1}, Lt3/u0;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 5
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lt3/u0;->C(Ljava/lang/Object;Z)I

    move-result p1

    const/4 v0, -0x1

    add-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lt3/u0;->D(Ljava/lang/Object;Z)I

    move-result p1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final i()I
    .locals 1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    invoke-virtual {v0}, Lt3/w;->i()I

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lt3/c1;
    .locals 2

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v0

    return-object v0
.end method

.method final l()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    invoke-virtual {v0}, Lt3/w;->l()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 6
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lt3/u0;->C(Ljava/lang/Object;Z)I

    move-result p1

    const/4 v0, -0x1

    add-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final q()Lt3/a0;
    .locals 1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lt3/u0;->r:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method final u()Lt3/k0;
    .locals 3

    .line 1
    iget-object v0, p0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-static {v0}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v0}, Lt3/k0;->A(Ljava/util/Comparator;)Lt3/u0;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Lt3/u0;

    iget-object v2, p0, Lt3/u0;->r:Lt3/a0;

    .line 4
    invoke-virtual {v2}, Lt3/a0;->m()Lt3/a0;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lt3/u0;-><init>(Lt3/a0;Ljava/util/Comparator;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method final w(Ljava/lang/Object;Z)Lt3/k0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/u0;->C(Ljava/lang/Object;Z)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Lt3/u0;->E(II)Lt3/u0;

    move-result-object p1

    return-object p1
.end method

.method final y(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/k0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/u0;->z(Ljava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lt3/k0;->w(Ljava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method final z(Ljava/lang/Object;Z)Lt3/k0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lt3/u0;->D(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, p0, Lt3/u0;->r:Lt3/a0;

    .line 2
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 3
    invoke-virtual {p0, p1, p2}, Lt3/u0;->E(II)Lt3/u0;

    move-result-object p1

    return-object p1
.end method
