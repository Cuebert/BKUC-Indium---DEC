.class public final Lt3/l2;
.super Lt3/s2;
.source "SourceFile"


# instance fields
.field private final n:Lt3/a2;


# direct methods
.method constructor <init>(Lt3/a2;)V
    .locals 0

    invoke-direct {p0}, Lt3/s2;-><init>()V

    iput-object p1, p0, Lt3/l2;->n:Lt3/a2;

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lt3/s2;

    .line 2
    invoke-virtual {p1}, Lt3/s2;->zza()I

    move-result v0

    const/16 v1, 0x40

    invoke-static {v1}, Lt3/s2;->d(B)I

    move-result v2

    if-eq v2, v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lt3/s2;->zza()I

    move-result p1

    invoke-static {v1}, Lt3/s2;->d(B)I

    move-result v0

    sub-int/2addr v0, p1

    goto :goto_0

    .line 4
    :cond_0
    check-cast p1, Lt3/l2;

    iget-object v0, p0, Lt3/l2;->n:Lt3/a2;

    invoke-virtual {v0}, Lt3/a2;->i()I

    move-result v1

    .line 5
    iget-object v2, p1, Lt3/l2;->n:Lt3/a2;

    invoke-virtual {v2}, Lt3/a2;->i()I

    move-result v3

    if-eq v1, v3, :cond_1

    invoke-virtual {v0}, Lt3/a2;->i()I

    move-result p1

    invoke-virtual {v2}, Lt3/a2;->i()I

    move-result v0

    sub-int v0, p1, v0

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Lt3/a2;->u()[B

    move-result-object v0

    .line 7
    iget-object p1, p1, Lt3/l2;->n:Lt3/a2;

    invoke-virtual {p1}, Lt3/a2;->u()[B

    move-result-object p1

    .line 8
    invoke-static {}, Lt3/p1;->a()Ljava/util/Comparator;

    move-result-object v1

    .line 9
    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0
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
    const-class v1, Lt3/l2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lt3/l2;

    iget-object v0, p0, Lt3/l2;->n:Lt3/a2;

    iget-object p1, p1, Lt3/l2;->n:Lt3/a2;

    .line 2
    invoke-virtual {v0, p1}, Lt3/a2;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0x40

    .line 1
    invoke-static {v1}, Lt3/s2;->d(B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lt3/l2;->n:Lt3/a2;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 2
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final l()Lt3/a2;
    .locals 1

    iget-object v0, p0, Lt3/l2;->n:Lt3/a2;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lt3/i1;->d()Lt3/i1;

    move-result-object v0

    invoke-virtual {v0}, Lt3/i1;->c()Lt3/i1;

    move-result-object v0

    iget-object v1, p0, Lt3/l2;->n:Lt3/a2;

    invoke-virtual {v1}, Lt3/a2;->u()[B

    move-result-object v1

    .line 2
    array-length v2, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lt3/i1;->e([BII)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    .line 3
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "h\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final zza()I
    .locals 1

    const/16 v0, 0x40

    invoke-static {v0}, Lt3/s2;->d(B)I

    move-result v0

    return v0
.end method
