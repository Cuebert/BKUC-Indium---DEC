.class Lgb/f;
.super Lgb/e;
.source "SourceFile"


# direct methods
.method public static a(II)I
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static b(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static c(II)I
    .locals 0

    if-le p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static d(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-lez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static e(II)Lgb/a;
    .locals 2

    sget-object v0, Lgb/a;->q:Lgb/a$a;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, Lgb/a$a;->a(III)Lgb/a;

    move-result-object p0

    return-object p0
.end method
