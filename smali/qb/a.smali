.class public final Lqb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0;


# instance fields
.field final a:Lqb/f;


# direct methods
.method public constructor <init>(Lqb/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqb/a;->a:Lqb/f;

    return-void
.end method

.method private b(Lqb/b;Lob/i0;)Lob/i0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-object p2

    .line 1
    :cond_0
    invoke-interface {p1}, Lqb/b;->a()Lac/s;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p2

    .line 2
    :cond_1
    invoke-virtual {p2}, Lob/i0;->b()Lob/j0;

    move-result-object v1

    invoke-virtual {v1}, Lob/j0;->Q()Lac/e;

    move-result-object v1

    .line 3
    invoke-static {v0}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object v0

    .line 4
    new-instance v2, Lqb/a$a;

    invoke-direct {v2, p0, v1, p1, v0}, Lqb/a$a;-><init>(Lqb/a;Lac/e;Lqb/b;Lac/d;)V

    const-string p1, "Content-Type"

    .line 5
    invoke-virtual {p2, p1}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {p2}, Lob/i0;->b()Lob/j0;

    move-result-object v0

    invoke-virtual {v0}, Lob/j0;->i()J

    move-result-wide v0

    .line 7
    invoke-virtual {p2}, Lob/i0;->X()Lob/i0$a;

    move-result-object p2

    new-instance v3, Lsb/h;

    .line 8
    invoke-static {v2}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object v2

    invoke-direct {v3, p1, v0, v1, v2}, Lsb/h;-><init>(Ljava/lang/String;JLac/e;)V

    invoke-virtual {p2, v3}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    return-object p1
.end method

.method private static c(Lob/y;Lob/y;)Lob/y;
    .locals 7

    .line 1
    new-instance v0, Lob/y$a;

    invoke-direct {v0}, Lob/y$a;-><init>()V

    .line 2
    invoke-virtual {p0}, Lob/y;->h()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 3
    invoke-virtual {p0, v3}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p0, v3}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Warning"

    .line 5
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    invoke-static {v4}, Lqb/a;->d(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 7
    invoke-static {v4}, Lqb/a;->e(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8
    invoke-virtual {p1, v4}, Lob/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    .line 9
    :cond_1
    sget-object v6, Lpb/a;->a:Lpb/a;

    invoke-virtual {v6, v0, v4, v5}, Lpb/a;->b(Lob/y$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1}, Lob/y;->h()I

    move-result p0

    :goto_2
    if-ge v2, p0, :cond_5

    .line 11
    invoke-virtual {p1, v2}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {v1}, Lqb/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Lqb/a;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 13
    sget-object v3, Lpb/a;->a:Lpb/a;

    invoke-virtual {p1, v2}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v1, v4}, Lpb/a;->b(Lob/y$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 14
    :cond_5
    invoke-virtual {v0}, Lob/y$a;->e()Lob/y;

    move-result-object p0

    return-object p0
.end method

.method static d(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Content-Length"

    .line 1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Encoding"

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Type"

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method static e(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    .line 1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static f(Lob/i0;)Lob/i0;
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Lob/i0;->b()Lob/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lob/i0;->X()Lob/i0$a;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object p0

    invoke-virtual {p0}, Lob/i0$a;->c()Lob/i0;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Lob/a0$a;)Lob/i0;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqb/a;->a:Lqb/f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lob/a0$a;->e()Lob/g0;

    move-result-object v1

    invoke-interface {v0, v1}, Lqb/f;->b(Lob/g0;)Lob/i0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 4
    new-instance v3, Lqb/c$a;

    invoke-interface {p1}, Lob/a0$a;->e()Lob/g0;

    move-result-object v4

    invoke-direct {v3, v1, v2, v4, v0}, Lqb/c$a;-><init>(JLob/g0;Lob/i0;)V

    invoke-virtual {v3}, Lqb/c$a;->c()Lqb/c;

    move-result-object v1

    .line 5
    iget-object v2, v1, Lqb/c;->a:Lob/g0;

    .line 6
    iget-object v3, v1, Lqb/c;->b:Lob/i0;

    .line 7
    iget-object v4, p0, Lqb/a;->a:Lqb/f;

    if-eqz v4, :cond_1

    .line 8
    invoke-interface {v4, v1}, Lqb/f;->d(Lqb/c;)V

    :cond_1
    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    .line 9
    invoke-virtual {v0}, Lob/i0;->b()Lob/j0;

    move-result-object v1

    invoke-static {v1}, Lpb/e;->g(Ljava/io/Closeable;)V

    :cond_2
    if-nez v2, :cond_3

    if-nez v3, :cond_3

    .line 10
    new-instance v0, Lob/i0$a;

    invoke-direct {v0}, Lob/i0$a;-><init>()V

    .line 11
    invoke-interface {p1}, Lob/a0$a;->e()Lob/g0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object p1

    sget-object v0, Lob/e0;->p:Lob/e0;

    .line 12
    invoke-virtual {p1, v0}, Lob/i0$a;->o(Lob/e0;)Lob/i0$a;

    move-result-object p1

    const/16 v0, 0x1f8

    .line 13
    invoke-virtual {p1, v0}, Lob/i0$a;->g(I)Lob/i0$a;

    move-result-object p1

    const-string v0, "Unsatisfiable Request (only-if-cached)"

    .line 14
    invoke-virtual {p1, v0}, Lob/i0$a;->l(Ljava/lang/String;)Lob/i0$a;

    move-result-object p1

    sget-object v0, Lpb/e;->d:Lob/j0;

    .line 15
    invoke-virtual {p1, v0}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 16
    invoke-virtual {p1, v0, v1}, Lob/i0$a;->r(J)Lob/i0$a;

    move-result-object p1

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lob/i0$a;->p(J)Lob/i0$a;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    return-object p1

    :cond_3
    if-nez v2, :cond_4

    .line 19
    invoke-virtual {v3}, Lob/i0;->X()Lob/i0$a;

    move-result-object p1

    .line 20
    invoke-static {v3}, Lqb/a;->f(Lob/i0;)Lob/i0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lob/i0$a;->d(Lob/i0;)Lob/i0$a;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    return-object p1

    .line 22
    :cond_4
    :try_start_0
    invoke-interface {p1, v2}, Lob/a0$a;->b(Lob/g0;)Lob/i0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_5

    if-eqz v0, :cond_5

    .line 23
    invoke-virtual {v0}, Lob/i0;->b()Lob/j0;

    move-result-object v0

    invoke-static {v0}, Lpb/e;->g(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v3, :cond_7

    .line 24
    invoke-virtual {p1}, Lob/i0;->e()I

    move-result v0

    const/16 v1, 0x130

    if-ne v0, v1, :cond_6

    .line 25
    invoke-virtual {v3}, Lob/i0;->X()Lob/i0$a;

    move-result-object v0

    .line 26
    invoke-virtual {v3}, Lob/i0;->O()Lob/y;

    move-result-object v1

    invoke-virtual {p1}, Lob/i0;->O()Lob/y;

    move-result-object v2

    invoke-static {v1, v2}, Lqb/a;->c(Lob/y;Lob/y;)Lob/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/i0$a;->j(Lob/y;)Lob/i0$a;

    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lob/i0;->l0()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lob/i0$a;->r(J)Lob/i0$a;

    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lob/i0;->j0()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lob/i0$a;->p(J)Lob/i0$a;

    move-result-object v0

    .line 29
    invoke-static {v3}, Lqb/a;->f(Lob/i0;)Lob/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/i0$a;->d(Lob/i0;)Lob/i0$a;

    move-result-object v0

    .line 30
    invoke-static {p1}, Lqb/a;->f(Lob/i0;)Lob/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/i0$a;->m(Lob/i0;)Lob/i0$a;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lob/i0$a;->c()Lob/i0;

    move-result-object v0

    .line 32
    invoke-virtual {p1}, Lob/i0;->b()Lob/j0;

    move-result-object p1

    invoke-virtual {p1}, Lob/j0;->close()V

    .line 33
    iget-object p1, p0, Lqb/a;->a:Lqb/f;

    invoke-interface {p1}, Lqb/f;->a()V

    .line 34
    iget-object p1, p0, Lqb/a;->a:Lqb/f;

    invoke-interface {p1, v3, v0}, Lqb/f;->c(Lob/i0;Lob/i0;)V

    return-object v0

    .line 35
    :cond_6
    invoke-virtual {v3}, Lob/i0;->b()Lob/j0;

    move-result-object v0

    invoke-static {v0}, Lpb/e;->g(Ljava/io/Closeable;)V

    .line 36
    :cond_7
    invoke-virtual {p1}, Lob/i0;->X()Lob/i0$a;

    move-result-object v0

    .line 37
    invoke-static {v3}, Lqb/a;->f(Lob/i0;)Lob/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/i0$a;->d(Lob/i0;)Lob/i0$a;

    move-result-object v0

    .line 38
    invoke-static {p1}, Lqb/a;->f(Lob/i0;)Lob/i0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lob/i0$a;->m(Lob/i0;)Lob/i0$a;

    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    .line 40
    iget-object v0, p0, Lqb/a;->a:Lqb/f;

    if-eqz v0, :cond_9

    .line 41
    invoke-static {p1}, Lsb/e;->c(Lob/i0;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1, v2}, Lqb/c;->a(Lob/i0;Lob/g0;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 42
    iget-object v0, p0, Lqb/a;->a:Lqb/f;

    invoke-interface {v0, p1}, Lqb/f;->f(Lob/i0;)Lqb/b;

    move-result-object v0

    .line 43
    invoke-direct {p0, v0, p1}, Lqb/a;->b(Lqb/b;Lob/i0;)Lob/i0;

    move-result-object p1

    return-object p1

    .line 44
    :cond_8
    invoke-virtual {v2}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsb/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 45
    :try_start_1
    iget-object v0, p0, Lqb/a;->a:Lqb/f;

    invoke-interface {v0, v2}, Lqb/f;->e(Lob/g0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_9
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_a

    .line 46
    invoke-virtual {v0}, Lob/i0;->b()Lob/j0;

    move-result-object v0

    invoke-static {v0}, Lpb/e;->g(Ljava/io/Closeable;)V

    :cond_a
    throw p1
.end method
