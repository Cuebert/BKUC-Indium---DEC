.class final Lt3/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[C

.field final c:I

.field final d:I

.field final e:I

.field final f:I

.field private final g:[B

.field private final h:Z


# direct methods
.method constructor <init>(Ljava/lang/String;[C)V
    .locals 9

    const/16 v0, 0x80

    new-array v1, v0, [B

    const/4 v2, -0x1

    .line 1
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 2
    :goto_0
    array-length v5, p2

    if-ge v4, v5, :cond_2

    .line 3
    aget-char v5, p2, v4

    const/4 v6, 0x1

    if-ge v5, v0, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    const-string v8, "Non-ASCII character: %s"

    .line 4
    invoke-static {v7, v8, v5}, Lt3/q;->d(ZLjava/lang/String;C)V

    .line 5
    aget-byte v7, v1, v5

    if-ne v7, v2, :cond_1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    const-string v7, "Duplicate character: %s"

    invoke-static {v6, v7, v5}, Lt3/q;->d(ZLjava/lang/String;C)V

    int-to-byte v6, v4

    .line 6
    aput-byte v6, v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, v1, v3}, Lt3/e1;-><init>(Ljava/lang/String;[C[BZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;[C[BZ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/e1;->a:Ljava/lang/String;

    .line 8
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lt3/e1;->b:[C

    :try_start_0
    array-length p1, p2

    .line 10
    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {p1, v0}, Lt3/k1;->b(ILjava/math/RoundingMode;)I

    move-result v0

    iput v0, p0, Lt3/e1;->d:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p2

    rsub-int/lit8 v1, p2, 0x3

    const/4 v2, 0x1

    shl-int v1, v2, v1

    iput v1, p0, Lt3/e1;->e:I

    shr-int p2, v0, p2

    iput p2, p0, Lt3/e1;->f:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lt3/e1;->c:I

    iput-object p3, p0, Lt3/e1;->g:[B

    .line 12
    new-array p1, v1, [Z

    const/4 p2, 0x0

    :goto_0
    iget p3, p0, Lt3/e1;->f:I

    if-ge p2, p3, :cond_0

    mul-int/lit8 p3, p2, 0x8

    iget v0, p0, Lt3/e1;->d:I

    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 13
    invoke-static {p3, v0, v1}, Lt3/k1;->a(IILjava/math/RoundingMode;)I

    move-result p3

    aput-boolean v2, p1, p3

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 14
    :cond_0
    iput-boolean p4, p0, Lt3/e1;->h:Z

    return-void

    :catch_0
    move-exception p1

    .line 15
    array-length p2, p2

    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    .line 16
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal alphabet length "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method static bridge synthetic d(Lt3/e1;)[C
    .locals 0

    iget-object p0, p0, Lt3/e1;->b:[C

    return-object p0
.end method


# virtual methods
.method final a(I)C
    .locals 1

    iget-object v0, p0, Lt3/e1;->b:[C

    aget-char p1, v0, p1

    return p1
.end method

.method final b()Lt3/e1;
    .locals 12

    .line 1
    iget-object v0, p0, Lt3/e1;->b:[C

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_b

    aget-char v4, v0, v3

    invoke-static {v4}, Lt3/e;->a(C)Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v0, p0, Lt3/e1;->b:[C

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x5a

    const/16 v5, 0x41

    const/4 v6, 0x1

    if-ge v3, v1, :cond_1

    .line 2
    aget-char v7, v0, v3

    if-lt v7, v5, :cond_0

    if-gt v7, v4, :cond_0

    const/4 v0, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_2
    xor-int/2addr v0, v6

    if-eqz v0, :cond_9

    iget-object v0, p0, Lt3/e1;->b:[C

    array-length v0, v0

    new-array v0, v0, [C

    const/4 v1, 0x0

    :goto_3
    iget-object v3, p0, Lt3/e1;->b:[C

    array-length v7, v3

    if-ge v1, v7, :cond_3

    .line 3
    aget-char v3, v3, v1

    invoke-static {v3}, Lt3/e;->a(C)Z

    move-result v7

    if-eqz v7, :cond_2

    xor-int/lit8 v3, v3, 0x20

    :cond_2
    int-to-char v3, v3

    aput-char v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    new-instance v1, Lt3/e1;

    iget-object v3, p0, Lt3/e1;->a:Ljava/lang/String;

    const-string v7, ".upperCase()"

    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-direct {v1, v3, v0}, Lt3/e1;-><init>(Ljava/lang/String;[C)V

    iget-boolean v0, p0, Lt3/e1;->h:Z

    if-eqz v0, :cond_8

    iget-boolean v0, v1, Lt3/e1;->h:Z

    if-eqz v0, :cond_4

    goto :goto_6

    :cond_4
    iget-object v0, v1, Lt3/e1;->g:[B

    .line 5
    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    :goto_4
    if-gt v5, v4, :cond_7

    or-int/lit8 v3, v5, 0x20

    iget-object v7, v1, Lt3/e1;->g:[B

    .line 6
    aget-byte v8, v7, v5

    .line 7
    aget-byte v7, v7, v3

    const/4 v9, -0x1

    if-ne v8, v9, :cond_5

    .line 8
    aput-byte v7, v0, v5

    goto :goto_5

    :cond_5
    int-to-char v10, v5

    int-to-char v11, v3

    if-ne v7, v9, :cond_6

    .line 9
    aput-byte v8, v0, v3

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 10
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    aput-object v2, v1, v6

    const-string v2, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values"

    invoke-static {v2, v1}, Lt3/r;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_7
    new-instance v2, Lt3/e1;

    iget-object v3, v1, Lt3/e1;->a:Ljava/lang/String;

    iget-object v1, v1, Lt3/e1;->b:[C

    const-string v4, ".ignoreCase()"

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-direct {v2, v3, v1, v0, v6}, Lt3/e1;-><init>(Ljava/lang/String;[C[BZ)V

    move-object v1, v2

    :cond_8
    :goto_6
    return-object v1

    .line 14
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call upperCase() on a mixed-case alphabet"

    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_b
    return-object p0
.end method

.method public final c(C)Z
    .locals 2

    iget-object p1, p0, Lt3/e1;->g:[B

    array-length v0, p1

    const/16 v1, 0x3d

    if-le v0, v1, :cond_0

    aget-byte p1, p1, v1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lt3/e1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lt3/e1;

    iget-boolean v0, p0, Lt3/e1;->h:Z

    .line 2
    iget-boolean v2, p1, Lt3/e1;->h:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lt3/e1;->b:[C

    iget-object p1, p1, Lt3/e1;->b:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lt3/e1;->b:[C

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([C)I

    move-result v0

    iget-boolean v1, p0, Lt3/e1;->h:Z

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    const/16 v1, 0x4d5

    goto :goto_0

    :cond_0
    const/16 v1, 0x4cf

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt3/e1;->a:Ljava/lang/String;

    return-object v0
.end method
