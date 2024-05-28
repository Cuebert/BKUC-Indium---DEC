.class final Lt3/t2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static final a(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/m2;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lt3/t2;->b(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Lt3/v2;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-object p0

    :catchall_0
    move-exception p0

    :try_start_2
    invoke-virtual {p1}, Lt3/v2;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3
    :catch_1
    throw p0
.end method

.method private static final b(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/m2;
        }
    .end annotation

    const-string v0, "Error in decoding CborValue from bytes"

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lt3/v2;->i()Lt3/u2;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v1, :cond_10

    .line 2
    :try_start_1
    invoke-virtual {v1}, Lt3/u2;->a()B

    move-result v2

    invoke-virtual {v1}, Lt3/u2;->b()B

    move-result v3

    const/16 v4, -0x80

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x0

    if-eq v3, v4, :cond_d

    const/16 v4, -0x60

    if-eq v3, v4, :cond_6

    const/16 v4, -0x40

    if-eq v3, v4, :cond_5

    const/16 v4, -0x20

    if-eq v3, v4, :cond_4

    if-eqz v3, :cond_2

    const/16 v4, 0x20

    if-eq v3, v4, :cond_2

    const/16 v4, 0x40

    if-eq v3, v4, :cond_1

    const/16 v4, 0x60

    if-ne v3, v4, :cond_0

    .line 3
    invoke-virtual {p1}, Lt3/v2;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    .line 4
    invoke-static {v2, v3, v4, p0, p1}, Lt3/t2;->c(BJLjava/io/InputStream;Lt3/v2;)V

    new-instance p0, Lt3/q2;

    invoke-direct {p0, v1}, Lt3/q2;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 5
    :cond_0
    new-instance p0, Lt3/m2;

    invoke-virtual {v1}, Lt3/u2;->c()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unidentifiable major type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/m2;-><init>(Ljava/lang/String;)V

    throw p0

    .line 7
    :cond_1
    invoke-virtual {p1}, Lt3/v2;->O()[B

    move-result-object v1

    array-length v3, v1

    int-to-long v4, v3

    .line 8
    invoke-static {v2, v4, v5, p0, p1}, Lt3/t2;->c(BJLjava/io/InputStream;Lt3/v2;)V

    new-instance p0, Lt3/l2;

    .line 9
    invoke-static {v1, v7, v3}, Lt3/a2;->s([BII)Lt3/a2;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/l2;-><init>(Lt3/a2;)V

    return-object p0

    .line 10
    :cond_2
    invoke-virtual {p1}, Lt3/v2;->c()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_3

    move-wide v5, v3

    goto :goto_0

    :cond_3
    not-long v5, v3

    .line 11
    :goto_0
    invoke-static {v2, v5, v6, p0, p1}, Lt3/t2;->c(BJLjava/io/InputStream;Lt3/v2;)V

    new-instance p0, Lt3/n2;

    invoke-direct {p0, v3, v4}, Lt3/n2;-><init>(J)V

    return-object p0

    .line 12
    :cond_4
    invoke-virtual {p1}, Lt3/v2;->z()Z

    move-result p0

    new-instance p1, Lt3/k2;

    invoke-direct {p1, p0}, Lt3/k2;-><init>(Z)V

    return-object p1

    .line 13
    :cond_5
    new-instance p0, Lt3/m2;

    const-string p1, "Tags are currently unsupported"

    .line 14
    invoke-direct {p0, p1}, Lt3/m2;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_6
    invoke-virtual {p1}, Lt3/v2;->e()J

    move-result-wide v3

    cmp-long v1, v3, v5

    if-gtz v1, :cond_c

    .line 16
    invoke-static {v2, v3, v4, p0, p1}, Lt3/t2;->c(BJLjava/io/InputStream;Lt3/v2;)V

    long-to-int v1, v3

    new-array v2, v1, [Lt3/o2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    int-to-long v8, v6

    cmp-long v10, v8, v3

    if-gez v10, :cond_9

    .line 17
    invoke-static {p0, p1}, Lt3/t2;->b(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;

    move-result-object v8

    if-eqz v5, :cond_8

    .line 18
    invoke-interface {v8, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-lez v9, :cond_7

    goto :goto_2

    .line 19
    :cond_7
    new-instance p0, Lt3/i2;

    const-string p1, "Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 21
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p0

    .line 22
    :cond_8
    :goto_2
    new-instance v5, Lt3/o2;

    .line 23
    invoke-static {p0, p1}, Lt3/t2;->b(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;

    move-result-object v9

    invoke-direct {v5, v8, v9}, Lt3/o2;-><init>(Lt3/s2;Lt3/s2;)V

    aput-object v5, v2, v6

    add-int/lit8 v6, v6, 0x1

    move-object v5, v8

    goto :goto_1

    :cond_9
    new-instance p0, Ljava/util/TreeMap;

    .line 24
    invoke-direct {p0}, Ljava/util/TreeMap;-><init>()V

    :goto_3
    if-ge v7, v1, :cond_b

    .line 25
    aget-object p1, v2, v7

    .line 26
    invoke-virtual {p1}, Lt3/o2;->a()Lt3/s2;

    move-result-object v3

    invoke-interface {p0, v3}, Ljava/util/NavigableMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 27
    invoke-virtual {p1}, Lt3/o2;->a()Lt3/s2;

    move-result-object v3

    invoke-virtual {p1}, Lt3/o2;->b()Lt3/s2;

    move-result-object p1

    invoke-interface {p0, v3, p1}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 28
    :cond_a
    new-instance p0, Lt3/i2;

    const-string p1, "Attempted to add duplicate key to canonical CBOR Map."

    .line 29
    invoke-direct {p0, p1}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p0

    .line 30
    :cond_b
    new-instance p1, Lt3/p2;

    .line 31
    invoke-static {p0}, Lt3/i0;->e(Ljava/util/Map;)Lt3/i0;

    move-result-object p0

    invoke-direct {p1, p0}, Lt3/p2;-><init>(Lt3/i0;)V

    return-object p1

    .line 32
    :cond_c
    new-instance p0, Lt3/m2;

    const-string p1, "Parser being asked to read a large CBOR map"

    .line 33
    invoke-direct {p0, p1}, Lt3/m2;-><init>(Ljava/lang/String;)V

    throw p0

    .line 34
    :cond_d
    invoke-virtual {p1}, Lt3/v2;->b()J

    move-result-wide v3

    cmp-long v1, v3, v5

    if-gtz v1, :cond_f

    .line 35
    invoke-static {v2, v3, v4, p0, p1}, Lt3/t2;->c(BJLjava/io/InputStream;Lt3/v2;)V

    long-to-int v1, v3

    new-array v1, v1, [Lt3/s2;

    :goto_4
    int-to-long v5, v7

    cmp-long v2, v5, v3

    if-gez v2, :cond_e

    .line 36
    invoke-static {p0, p1}, Lt3/t2;->b(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;

    move-result-object v2

    aput-object v2, v1, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_e
    new-instance p0, Lt3/j2;

    .line 37
    invoke-static {v1}, Lt3/a0;->q([Ljava/lang/Object;)Lt3/a0;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/j2;-><init>(Lt3/a0;)V

    return-object p0

    .line 38
    :cond_f
    new-instance p0, Lt3/m2;

    const-string p1, "Parser being asked to read a large CBOR array"

    .line 39
    invoke-direct {p0, p1}, Lt3/m2;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    goto :goto_5

    :catch_1
    move-exception p0

    .line 40
    :goto_5
    new-instance p1, Lt3/m2;

    .line 41
    invoke-direct {p1, v0, p0}, Lt3/m2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 42
    :cond_10
    new-instance p0, Lt3/m2;

    const-string p1, "Parser being asked to parse an empty input stream"

    .line 43
    invoke-direct {p0, p1}, Lt3/m2;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_2
    move-exception p0

    .line 44
    new-instance p1, Lt3/m2;

    .line 45
    invoke-direct {p1, v0, p0}, Lt3/m2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static final c(BJLjava/io/InputStream;Lt3/v2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p3, "Integer value "

    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const-wide v0, 0x100000000L

    cmp-long p0, p1, v0

    if-ltz p0, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    new-instance p0, Lt3/i2;

    new-instance p4, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0-4 additional bytes, but used 8"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    const-wide/32 v0, 0x10000

    cmp-long p0, p1, v0

    if-ltz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Lt3/i2;

    new-instance p4, Ljava/lang/StringBuilder;

    .line 3
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0-2 additional bytes, but used 4"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_2
    const-wide/16 v0, 0x100

    cmp-long p0, p1, v0

    if-ltz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lt3/i2;

    new-instance p4, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0-1 additional bytes, but used 2"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_3
    const-wide/16 v0, 0x18

    cmp-long p0, p1, v0

    if-ltz p0, :cond_3

    goto :goto_0

    .line 5
    :cond_3
    new-instance p0, Lt3/i2;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0 additional bytes, but used 1"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lt3/i2;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
