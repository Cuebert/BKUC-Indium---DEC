.class Lt3/h1;
.super Lt3/i1;
.source "SourceFile"


# instance fields
.field final f:Lt3/e1;

.field final g:Ljava/lang/Character;

.field private volatile h:Lt3/i1;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V
    .locals 1

    .line 5
    new-instance v0, Lt3/e1;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lt3/e1;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v0, p3}, Lt3/h1;-><init>(Lt3/e1;Ljava/lang/Character;)V

    return-void
.end method

.method constructor <init>(Lt3/e1;Ljava/lang/Character;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lt3/i1;-><init>()V

    iput-object p1, p0, Lt3/h1;->f:Lt3/e1;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    const/16 v2, 0x3d

    invoke-virtual {p1, v2}, Lt3/e1;->c(C)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    .line 2
    iput-object p2, p0, Lt3/h1;->g:Ljava/lang/Character;

    return-void

    .line 3
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    const-string p2, "Padding character %s was already in alphabet"

    .line 4
    invoke-static {p2, v1}, Lt3/r;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method a(Ljava/lang/Appendable;[BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length p3, p2

    const/4 v0, 0x0

    invoke-static {v0, p4, p3}, Lt3/q;->e(III)V

    :goto_0
    if-ge v0, p4, :cond_0

    iget-object p3, p0, Lt3/h1;->f:Lt3/e1;

    iget p3, p3, Lt3/e1;->f:I

    sub-int v1, p4, v0

    .line 2
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-virtual {p0, p1, p2, v0, p3}, Lt3/h1;->g(Ljava/lang/Appendable;[BII)V

    iget-object p3, p0, Lt3/h1;->f:Lt3/e1;

    iget p3, p3, Lt3/e1;->f:I

    add-int/2addr v0, p3

    goto :goto_0

    :cond_0
    return-void
.end method

.method final b(I)I
    .locals 3

    iget-object v0, p0, Lt3/h1;->f:Lt3/e1;

    iget v1, v0, Lt3/e1;->e:I

    iget v0, v0, Lt3/e1;->f:I

    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p1, v0, v2}, Lt3/k1;->a(IILjava/math/RoundingMode;)I

    move-result p1

    mul-int v1, v1, p1

    return v1
.end method

.method public final c()Lt3/i1;
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/h1;->h:Lt3/i1;

    if-nez v0, :cond_1

    iget-object v0, p0, Lt3/h1;->f:Lt3/e1;

    invoke-virtual {v0}, Lt3/e1;->b()Lt3/e1;

    move-result-object v0

    iget-object v1, p0, Lt3/h1;->f:Lt3/e1;

    if-ne v0, v1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lt3/h1;->g:Ljava/lang/Character;

    .line 2
    invoke-virtual {p0, v0, v1}, Lt3/h1;->f(Lt3/e1;Ljava/lang/Character;)Lt3/i1;

    move-result-object v0

    .line 3
    :goto_0
    iput-object v0, p0, Lt3/h1;->h:Lt3/i1;

    :cond_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lt3/h1;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lt3/h1;

    iget-object v0, p0, Lt3/h1;->f:Lt3/e1;

    .line 2
    iget-object v2, p1, Lt3/h1;->f:Lt3/e1;

    invoke-virtual {v0, v2}, Lt3/e1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt3/h1;->g:Ljava/lang/Character;

    iget-object p1, p1, Lt3/h1;->g:Ljava/lang/Character;

    if-eq v0, p1, :cond_0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method f(Lt3/e1;Ljava/lang/Character;)Lt3/i1;
    .locals 1

    new-instance v0, Lt3/h1;

    invoke-direct {v0, p1, p2}, Lt3/h1;-><init>(Lt3/e1;Ljava/lang/Character;)V

    return-object v0
.end method

.method final g(Ljava/lang/Appendable;[BII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    add-int v0, p3, p4

    .line 1
    array-length v1, p2

    invoke-static {p3, v0, v1}, Lt3/q;->e(III)V

    iget-object v0, p0, Lt3/h1;->f:Lt3/e1;

    iget v0, v0, Lt3/e1;->f:I

    const/4 v1, 0x0

    if-gt p4, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-static {v0}, Lt3/q;->c(Z)V

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    :goto_1
    const/16 v4, 0x8

    if-ge v0, p4, :cond_1

    add-int v5, p3, v0

    .line 3
    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v2, v5

    shl-long/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p4, 0x1

    mul-int/lit8 p2, p2, 0x8

    iget-object p3, p0, Lt3/h1;->f:Lt3/e1;

    iget p3, p3, Lt3/e1;->d:I

    sub-int/2addr p2, p3

    :goto_2
    mul-int/lit8 p3, p4, 0x8

    if-ge v1, p3, :cond_2

    sub-int p3, p2, v1

    ushr-long v5, v2, p3

    iget-object p3, p0, Lt3/h1;->f:Lt3/e1;

    iget v0, p3, Lt3/e1;->c:I

    long-to-int v6, v5

    and-int/2addr v0, v6

    .line 4
    invoke-virtual {p3, v0}, Lt3/e1;->a(I)C

    move-result p3

    invoke-interface {p1, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    iget-object p3, p0, Lt3/h1;->f:Lt3/e1;

    iget p3, p3, Lt3/e1;->d:I

    add-int/2addr v1, p3

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lt3/h1;->g:Ljava/lang/Character;

    if-eqz p2, :cond_3

    :goto_3
    iget-object p2, p0, Lt3/h1;->f:Lt3/e1;

    iget p2, p2, Lt3/e1;->f:I

    mul-int/lit8 p2, p2, 0x8

    if-ge v1, p2, :cond_3

    iget-object p2, p0, Lt3/h1;->g:Ljava/lang/Character;

    .line 5
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    const/16 p2, 0x3d

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    iget-object p2, p0, Lt3/h1;->f:Lt3/e1;

    iget p2, p2, Lt3/e1;->d:I

    add-int/2addr v1, p2

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/h1;->f:Lt3/e1;

    invoke-virtual {v0}, Lt3/e1;->hashCode()I

    move-result v0

    iget-object v1, p0, Lt3/h1;->g:Ljava/lang/Character;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseEncoding."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt3/h1;->f:Lt3/e1;

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/h1;->f:Lt3/e1;

    iget v1, v1, Lt3/e1;->d:I

    const/16 v2, 0x8

    .line 3
    rem-int/2addr v2, v1

    if-eqz v2, :cond_1

    iget-object v1, p0, Lt3/h1;->g:Ljava/lang/Character;

    if-nez v1, :cond_0

    const-string v1, ".omitPadding()"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, ".withPadChar(\'"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/h1;->g:Ljava/lang/Character;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
