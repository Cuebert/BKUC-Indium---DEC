.class public final Lt3/n2;
.super Lt3/s2;
.source "SourceFile"


# instance fields
.field private final n:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lt3/s2;-><init>()V

    iput-wide p1, p0, Lt3/n2;->n:J

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lt3/s2;

    invoke-virtual {p0}, Lt3/n2;->zza()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Lt3/s2;->zza()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lt3/n2;->zza()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Lt3/s2;->zza()I

    move-result p1

    sub-int/2addr v0, p1

    goto :goto_0

    .line 4
    :cond_0
    check-cast p1, Lt3/n2;

    iget-wide v0, p0, Lt3/n2;->n:J

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    .line 6
    iget-wide v2, p1, Lt3/n2;->n:J

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    if-lez p1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const-class v2, Lt3/n2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Lt3/n2;

    iget-wide v2, p0, Lt3/n2;->n:J

    iget-wide v4, p1, Lt3/n2;->n:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Lt3/n2;->zza()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-wide v1, p0, Lt3/n2;->n:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 2
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Lt3/n2;->n:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lt3/n2;->n:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final zza()I
    .locals 5

    iget-wide v0, p0, Lt3/n2;->n:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x20

    :goto_0
    invoke-static {v0}, Lt3/s2;->d(B)I

    move-result v0

    return v0
.end method
