.class public final Lmb/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()I
    .locals 1

    invoke-static {}, Lmb/c0;->a()I

    move-result v0

    return v0
.end method

.method public static final b(Ljava/lang/String;III)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmb/d0;->a(Ljava/lang/String;III)I

    move-result p0

    return p0
.end method

.method public static final c(Ljava/lang/String;JJJ)J
    .locals 0

    invoke-static/range {p0 .. p6}, Lmb/d0;->b(Ljava/lang/String;JJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lmb/c0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lmb/d0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Z)Z
    .locals 0

    invoke-static {p0, p1}, Lmb/d0;->d(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Ljava/lang/String;IIIILjava/lang/Object;)I
    .locals 0

    invoke-static/range {p0 .. p5}, Lmb/d0;->e(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Ljava/lang/String;JJJILjava/lang/Object;)J
    .locals 0

    invoke-static/range {p0 .. p8}, Lmb/d0;->f(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method
