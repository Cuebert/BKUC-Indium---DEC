.class public final Lt3/j2;
.super Lt3/s2;
.source "SourceFile"


# instance fields
.field private final n:Lt3/a0;

.field private final o:I


# direct methods
.method constructor <init>(Lt3/a0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/i2;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lt3/s2;-><init>()V

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lt3/j2;->n:Lt3/a0;

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt3/j2;->n:Lt3/a0;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge p1, v2, :cond_1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/s2;

    invoke-virtual {v1}, Lt3/s2;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lt3/j2;->o:I

    const/4 p1, 0x4

    if-gt v0, p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Lt3/i2;

    const-string v0, "Exceeded cutoff limit for max depth of cbor value"

    .line 4
    invoke-direct {p1, v0}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected final b()I
    .locals 1

    iget v0, p0, Lt3/j2;->o:I

    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 5

    .line 1
    check-cast p1, Lt3/s2;

    .line 2
    invoke-virtual {p1}, Lt3/s2;->zza()I

    move-result v0

    const/16 v1, -0x80

    invoke-static {v1}, Lt3/s2;->d(B)I

    move-result v2

    const/4 v3, 0x0

    if-eq v2, v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lt3/s2;->zza()I

    move-result p1

    invoke-static {v1}, Lt3/s2;->d(B)I

    move-result v0

    sub-int v3, v0, p1

    goto :goto_1

    .line 4
    :cond_0
    check-cast p1, Lt3/j2;

    iget-object v0, p0, Lt3/j2;->n:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 5
    iget-object v2, p1, Lt3/j2;->n:Lt3/a0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-eq v1, v4, :cond_1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    sub-int v3, p1, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt3/j2;->n:Lt3/a0;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 6
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/s2;

    .line 7
    iget-object v2, p1, Lt3/j2;->n:Lt3/a0;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt3/s2;

    .line 8
    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v3
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 1
    :cond_1
    const-class v1, Lt3/j2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lt3/j2;

    iget-object v0, p0, Lt3/j2;->n:Lt3/a0;

    iget-object p1, p1, Lt3/j2;->n:Lt3/a0;

    .line 2
    invoke-virtual {v0, p1}, Lt3/a0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, -0x80

    .line 1
    invoke-static {v1}, Lt3/s2;->d(B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lt3/j2;->n:Lt3/a0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 2
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lt3/j2;->n:Lt3/a0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lt3/j2;->n:Lt3/a0;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 3
    check-cast v4, Lt3/s2;

    .line 4
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "\n"

    const-string v6, "\n  "

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string v1, ",\n  "

    invoke-static {v1}, Lt3/h;->a(Ljava/lang/String;)Lt3/h;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[\n  "

    .line 5
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {v1, v2, v0}, Lt3/h;->b(Ljava/lang/Appendable;Ljava/util/Iterator;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "\n]"

    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 9
    new-instance v1, Ljava/lang/AssertionError;

    .line 10
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method protected final zza()I
    .locals 1

    const/16 v0, -0x80

    invoke-static {v0}, Lt3/s2;->d(B)I

    move-result v0

    return v0
.end method
