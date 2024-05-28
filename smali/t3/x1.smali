.class Lt3/x1;
.super Lt3/w1;
.source "SourceFile"


# instance fields
.field protected final r:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt3/w1;-><init>()V

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lt3/x1;->r:[B

    return-void
.end method


# virtual methods
.method public c(I)B
    .locals 1

    iget-object v0, p0, Lt3/x1;->r:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method e(I)B
    .locals 1

    iget-object v0, p0, Lt3/x1;->r:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lt3/a2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v1

    move-object v3, p1

    check-cast v3, Lt3/a2;

    invoke-virtual {v3}, Lt3/a2;->i()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    instance-of v1, p1, Lt3/x1;

    if-eqz v1, :cond_a

    .line 2
    check-cast p1, Lt3/x1;

    invoke-virtual {p0}, Lt3/a2;->r()I

    move-result v1

    .line 3
    invoke-virtual {p1}, Lt3/a2;->r()I

    move-result v3

    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    if-ne v1, v3, :cond_4

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v1

    .line 4
    invoke-virtual {p1}, Lt3/a2;->i()I

    move-result v3

    if-gt v1, v3, :cond_9

    .line 5
    invoke-virtual {p1}, Lt3/a2;->i()I

    move-result v3

    if-gt v1, v3, :cond_8

    .line 6
    iget-object v3, p0, Lt3/x1;->r:[B

    .line 7
    iget-object v4, p1, Lt3/x1;->r:[B

    invoke-virtual {p0}, Lt3/x1;->v()I

    move-result v5

    add-int/2addr v5, v1

    invoke-virtual {p0}, Lt3/x1;->v()I

    move-result v1

    .line 8
    invoke-virtual {p1}, Lt3/x1;->v()I

    move-result p1

    :goto_1
    if-ge v1, v5, :cond_7

    .line 9
    aget-byte v6, v3, v1

    aget-byte v7, v4, p1

    if-eq v6, v7, :cond_6

    const/4 v0, 0x0

    goto :goto_2

    :cond_6
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    return v0

    .line 10
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    invoke-virtual {p1}, Lt3/a2;->i()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ran off end of other: 0, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Length too large: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_a
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lt3/x1;->r:[B

    array-length v0, v0

    return v0
.end method

.method protected k([BIII)V
    .locals 0

    iget-object p2, p0, Lt3/x1;->r:[B

    const/4 p3, 0x0

    invoke-static {p2, p3, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method protected final l(III)I
    .locals 3

    .line 1
    iget-object p2, p0, Lt3/x1;->r:[B

    invoke-virtual {p0}, Lt3/x1;->v()I

    move-result v0

    sget-object v1, Lt3/f2;->d:[B

    move v1, v0

    :goto_0
    add-int v2, v0, p3

    if-ge v1, v2, :cond_0

    mul-int/lit8 p1, p1, 0x1f

    .line 2
    aget-byte v2, p2, v1

    add-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public final m(II)Lt3/a2;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v0

    invoke-static {p1, p2, v0}, Lt3/a2;->q(III)I

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lt3/a2;->o:Lt3/a2;

    return-object p1

    :cond_0
    new-instance v0, Lt3/u1;

    iget-object v1, p0, Lt3/x1;->r:[B

    invoke-virtual {p0}, Lt3/x1;->v()I

    move-result v2

    add-int/2addr v2, p1

    .line 2
    invoke-direct {v0, v1, v2, p2}, Lt3/u1;-><init>([BII)V

    return-object v0
.end method

.method public final o()Ljava/io/InputStream;
    .locals 4

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lt3/x1;->r:[B

    invoke-virtual {p0}, Lt3/x1;->v()I

    move-result v2

    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    return-object v0
.end method

.method public final p()Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Lt3/x1;->r:[B

    invoke-virtual {p0}, Lt3/x1;->v()I

    move-result v1

    invoke-virtual {p0}, Lt3/x1;->i()I

    move-result v2

    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method protected v()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
