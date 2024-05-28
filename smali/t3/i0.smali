.class public final Lt3/i0;
.super Lt3/j0;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableMap;


# static fields
.field private static final s:Ljava/util/Comparator;

.field private static final t:Lt3/i0;

.field public static final synthetic u:I


# instance fields
.field private final transient p:Lt3/u0;

.field private final transient q:Lt3/a0;

.field private final transient r:Lt3/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lt3/p0;->n:Lt3/p0;

    sput-object v0, Lt3/i0;->s:Ljava/util/Comparator;

    new-instance v1, Lt3/i0;

    invoke-static {v0}, Lt3/k0;->A(Ljava/util/Comparator;)Lt3/u0;

    move-result-object v0

    sget v2, Lt3/a0;->p:I

    .line 2
    sget-object v2, Lt3/s0;->s:Lt3/a0;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lt3/i0;-><init>(Lt3/u0;Lt3/a0;Lt3/i0;)V

    sput-object v1, Lt3/i0;->t:Lt3/i0;

    return-void
.end method

.method constructor <init>(Lt3/u0;Lt3/a0;Lt3/i0;)V
    .locals 0

    invoke-direct {p0}, Lt3/j0;-><init>()V

    iput-object p1, p0, Lt3/i0;->p:Lt3/u0;

    iput-object p2, p0, Lt3/i0;->q:Lt3/a0;

    iput-object p3, p0, Lt3/i0;->r:Lt3/i0;

    return-void
.end method

.method static bridge synthetic d(Lt3/i0;)Lt3/a0;
    .locals 0

    iget-object p0, p0, Lt3/i0;->q:Lt3/a0;

    return-object p0
.end method

.method public static e(Ljava/util/Map;)Lt3/i0;
    .locals 11

    .line 1
    sget-object v0, Lt3/i0;->s:Ljava/util/Comparator;

    invoke-interface {p0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    sget-object v3, Lt3/c0;->o:[Ljava/util/Map$Entry;

    .line 4
    instance-of v4, p0, Ljava/util/Collection;

    if-nez v4, :cond_2

    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    new-instance v4, Ljava/util/ArrayList;

    .line 6
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object p0, v4

    .line 10
    :cond_2
    invoke-interface {p0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 11
    check-cast p0, [Ljava/util/Map$Entry;

    .line 12
    array-length v3, p0

    if-eqz v3, :cond_7

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eq v3, v2, :cond_6

    new-array v6, v3, [Ljava/lang/Object;

    new-array v7, v3, [Ljava/lang/Object;

    if-eqz v1, :cond_3

    :goto_2
    if-ge v5, v3, :cond_5

    .line 13
    aget-object v1, p0, v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 15
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 16
    invoke-static {v2, v1}, Lt3/t;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    aput-object v2, v6, v5

    .line 18
    aput-object v1, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 19
    :cond_3
    new-instance v1, Lt3/f0;

    invoke-direct {v1, v0}, Lt3/f0;-><init>(Ljava/util/Comparator;)V

    .line 20
    invoke-static {p0, v5, v3, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 21
    aget-object v1, p0, v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    .line 23
    aput-object v8, v6, v5

    .line 24
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v7, v5

    .line 25
    aget-object v5, v6, v5

    invoke-static {v5, v1}, Lt3/t;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    if-ge v2, v3, :cond_5

    add-int/lit8 v1, v2, -0x1

    .line 26
    aget-object v1, p0, v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    aget-object v5, p0, v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    .line 29
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    .line 30
    invoke-static {v9, v10}, Lt3/t;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    aput-object v9, v6, v2

    .line 32
    aput-object v10, v7, v2

    .line 33
    invoke-interface {v0, v8, v9}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v8

    if-eqz v8, :cond_4

    add-int/lit8 v2, v2, 0x1

    move-object v8, v9

    goto :goto_3

    .line 34
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 35
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Multiple entries with same key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    throw p0

    .line 37
    :cond_5
    new-instance p0, Lt3/i0;

    .line 38
    new-instance v1, Lt3/u0;

    .line 39
    invoke-static {v6, v3}, Lt3/a0;->p([Ljava/lang/Object;I)Lt3/a0;

    move-result-object v2

    .line 40
    invoke-direct {v1, v2, v0}, Lt3/u0;-><init>(Lt3/a0;Ljava/util/Comparator;)V

    .line 41
    invoke-static {v7, v3}, Lt3/a0;->p([Ljava/lang/Object;I)Lt3/a0;

    move-result-object v0

    invoke-direct {p0, v1, v0, v4}, Lt3/i0;-><init>(Lt3/u0;Lt3/a0;Lt3/i0;)V

    goto :goto_4

    .line 42
    :cond_6
    aget-object p0, p0, v5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v2, Lt3/i0;

    .line 44
    new-instance v3, Lt3/u0;

    .line 45
    invoke-static {v1}, Lt3/a0;->r(Ljava/lang/Object;)Lt3/a0;

    move-result-object v1

    invoke-direct {v3, v1, v0}, Lt3/u0;-><init>(Lt3/a0;Ljava/util/Comparator;)V

    .line 46
    invoke-static {p0}, Lt3/a0;->r(Ljava/lang/Object;)Lt3/a0;

    move-result-object p0

    invoke-direct {v2, v3, p0, v4}, Lt3/i0;-><init>(Lt3/u0;Lt3/a0;Lt3/i0;)V

    move-object p0, v2

    goto :goto_4

    .line 47
    :cond_7
    invoke-static {v0}, Lt3/i0;->f(Ljava/util/Comparator;)Lt3/i0;

    move-result-object p0

    :goto_4
    return-object p0
.end method

.method static f(Ljava/util/Comparator;)Lt3/i0;
    .locals 3

    .line 1
    sget-object v0, Lt3/p0;->n:Lt3/p0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lt3/i0;->t:Lt3/i0;

    return-object p0

    :cond_0
    new-instance v0, Lt3/i0;

    .line 2
    invoke-static {p0}, Lt3/k0;->A(Ljava/util/Comparator;)Lt3/u0;

    move-result-object p0

    sget v1, Lt3/a0;->p:I

    .line 3
    sget-object v1, Lt3/s0;->s:Lt3/a0;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lt3/i0;-><init>(Lt3/u0;Lt3/a0;Lt3/i0;)V

    return-object v0
.end method

.method static bridge synthetic j(Lt3/i0;)Lt3/u0;
    .locals 0

    iget-object p0, p0, Lt3/i0;->p:Lt3/u0;

    return-object p0
.end method

.method private final k(II)Lt3/i0;
    .locals 3

    if-nez p1, :cond_1

    .line 1
    iget-object p1, p0, Lt3/i0;->q:Lt3/a0;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lt3/i0;->p:Lt3/u0;

    iget-object p1, p1, Lt3/k0;->p:Ljava/util/Comparator;

    .line 2
    invoke-static {p1}, Lt3/i0;->f(Ljava/util/Comparator;)Lt3/i0;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Lt3/i0;

    iget-object v1, p0, Lt3/i0;->p:Lt3/u0;

    .line 3
    invoke-virtual {v1, p1, p2}, Lt3/u0;->E(II)Lt3/u0;

    move-result-object v1

    iget-object v2, p0, Lt3/i0;->q:Lt3/a0;

    invoke-virtual {v2, p1, p2}, Lt3/a0;->o(II)Lt3/a0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v0, v1, p1, p2}, Lt3/i0;-><init>(Lt3/u0;Lt3/a0;Lt3/i0;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lt3/w;
    .locals 1

    iget-object v0, p0, Lt3/i0;->q:Lt3/a0;

    return-object v0
.end method

.method final b()Lt3/e0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt3/c0;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lt3/t0;->v:Lt3/t0;

    goto :goto_0

    :cond_0
    new-instance v0, Lt3/h0;

    .line 3
    invoke-direct {v0, p0}, Lt3/h0;-><init>(Lt3/i0;)V

    :goto_0
    return-object v0
.end method

.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lt3/i0;->i(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    invoke-virtual {p1}, Lt3/i0;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt3/i0;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Lt3/n0;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    iget-object v0, v0, Lt3/k0;->p:Ljava/util/Comparator;

    return-object v0
.end method

.method public final synthetic descendingKeySet()Ljava/util/NavigableSet;
    .locals 1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    invoke-virtual {v0}, Lt3/k0;->v()Lt3/k0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic descendingMap()Ljava/util/NavigableMap;
    .locals 3

    .line 1
    iget-object v0, p0, Lt3/i0;->r:Lt3/i0;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lt3/c0;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    iget-object v0, v0, Lt3/k0;->p:Ljava/util/Comparator;

    instance-of v1, v0, Lt3/r0;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lt3/r0;

    goto :goto_0

    .line 3
    :cond_0
    new-instance v1, Lt3/u;

    .line 4
    invoke-direct {v1, v0}, Lt3/u;-><init>(Ljava/util/Comparator;)V

    move-object v0, v1

    .line 5
    :goto_0
    invoke-virtual {v0}, Lt3/r0;->a()Lt3/r0;

    move-result-object v0

    invoke-static {v0}, Lt3/i0;->f(Ljava/util/Comparator;)Lt3/i0;

    move-result-object v0

    goto :goto_1

    .line 6
    :cond_1
    new-instance v0, Lt3/i0;

    iget-object v1, p0, Lt3/i0;->p:Lt3/u0;

    .line 7
    invoke-virtual {v1}, Lt3/k0;->v()Lt3/k0;

    move-result-object v1

    check-cast v1, Lt3/u0;

    iget-object v2, p0, Lt3/i0;->q:Lt3/a0;

    invoke-virtual {v2}, Lt3/a0;->m()Lt3/a0;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, Lt3/i0;-><init>(Lt3/u0;Lt3/a0;Lt3/i0;)V

    :cond_2
    :goto_1
    return-object v0
.end method

.method public final bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lt3/c0;->c()Lt3/e0;

    move-result-object v0

    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 2

    invoke-virtual {p0}, Lt3/c0;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lt3/c0;->c()Lt3/e0;

    move-result-object v0

    invoke-virtual {v0}, Lt3/e0;->q()Lt3/a0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    invoke-virtual {v0}, Lt3/k0;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lt3/i0;->g(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    invoke-virtual {p1}, Lt3/i0;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt3/i0;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Lt3/n0;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;Z)Lt3/i0;
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, p2}, Lt3/u0;->C(Ljava/lang/Object;Z)I

    move-result p1

    invoke-direct {p0, v1, p1}, Lt3/i0;->k(II)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    const/4 v1, -0x1

    if-nez p1, :cond_0

    :catch_0
    :goto_0
    const/4 p1, -0x1

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v2, v0, Lt3/u0;->r:Lt3/a0;

    iget-object v0, v0, Lt3/k0;->p:Ljava/util/Comparator;

    .line 2
    invoke-static {v2, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_2
    iget-object v0, p0, Lt3/i0;->q:Lt3/a0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/i0;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    iget-object v0, v0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    .line 4
    invoke-virtual {p0, p3, p4}, Lt3/i0;->g(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lt3/i0;->i(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/4 p4, 0x2

    new-array p4, p4, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p4, v0

    const/4 p1, 0x1

    aput-object p3, p4, p1

    const-string p1, "expected fromKey <= toKey but %s > %s"

    .line 6
    invoke-static {p1, p4}, Lt3/r;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final bridge synthetic headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lt3/i0;->g(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lt3/i0;->g(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lt3/i0;->i(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    invoke-virtual {p1}, Lt3/i0;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt3/i0;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Lt3/n0;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/Object;Z)Lt3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {v0, p1, p2}, Lt3/u0;->D(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, p0, Lt3/i0;->q:Lt3/a0;

    .line 3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 4
    invoke-direct {p0, p1, p2}, Lt3/i0;->k(II)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt3/c0;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lt3/c0;->c()Lt3/e0;

    move-result-object v0

    invoke-virtual {v0}, Lt3/e0;->q()Lt3/a0;

    move-result-object v0

    iget-object v1, p0, Lt3/i0;->q:Lt3/a0;

    .line 2
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    invoke-virtual {v0}, Lt3/k0;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lt3/i0;->g(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    invoke-virtual {p1}, Lt3/i0;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt3/i0;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Lt3/n0;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    iget-object v0, p0, Lt3/i0;->p:Lt3/u0;

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lt3/i0;->q:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lt3/i0;->h(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, v1}, Lt3/i0;->h(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lt3/i0;->i(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lt3/i0;->i(Ljava/lang/Object;Z)Lt3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lt3/i0;->q:Lt3/a0;

    return-object v0
.end method
