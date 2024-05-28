.class public abstract Lt3/k0;
.super Lt3/l0;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Lt3/z0;


# instance fields
.field final transient p:Ljava/util/Comparator;

.field transient q:Lt3/k0;


# direct methods
.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Lt3/l0;-><init>()V

    iput-object p1, p0, Lt3/k0;->p:Ljava/util/Comparator;

    return-void
.end method

.method static A(Ljava/util/Comparator;)Lt3/u0;
    .locals 2

    .line 1
    sget-object v0, Lt3/p0;->n:Lt3/p0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p0, Lt3/u0;->s:Lt3/u0;

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lt3/u0;

    sget v1, Lt3/a0;->p:I

    .line 4
    sget-object v1, Lt3/s0;->s:Lt3/a0;

    .line 5
    invoke-direct {v0, v1, p0}, Lt3/u0;-><init>(Lt3/a0;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lt3/k0;->p:Ljava/util/Comparator;

    return-object v0
.end method

.method public final bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, Lt3/k0;->v()Lt3/k0;

    move-result-object v0

    return-object v0
.end method

.method public abstract first()Ljava/lang/Object;
.end method

.method public final synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0, p1, p2}, Lt3/k0;->w(Ljava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lt3/k0;->w(Ljava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method public abstract last()Ljava/lang/Object;
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lt3/k0;->x(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, v1}, Lt3/k0;->x(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0, p1, p2}, Lt3/k0;->z(Ljava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lt3/k0;->z(Ljava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method abstract u()Lt3/k0;
.end method

.method public final v()Lt3/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lt3/k0;->q:Lt3/k0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lt3/k0;->u()Lt3/k0;

    move-result-object v0

    iput-object v0, p0, Lt3/k0;->q:Lt3/k0;

    .line 2
    iput-object p0, v0, Lt3/k0;->q:Lt3/k0;

    :cond_0
    return-object v0
.end method

.method abstract w(Ljava/lang/Object;Z)Lt3/k0;
.end method

.method public final x(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/k0;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lt3/k0;->p:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt3/q;->c(Z)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lt3/k0;->y(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/k0;

    move-result-object p1

    return-object p1
.end method

.method abstract y(Ljava/lang/Object;ZLjava/lang/Object;Z)Lt3/k0;
.end method

.method abstract z(Ljava/lang/Object;Z)Lt3/k0;
.end method
