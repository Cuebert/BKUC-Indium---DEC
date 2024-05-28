.class public final Lsb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0;


# instance fields
.field private final a:Lob/p;


# direct methods
.method public constructor <init>(Lob/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsb/a;->a:Lob/p;

    return-void
.end method

.method private b(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lob/o;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    if-lez v2, :cond_0

    const-string v3, "; "

    .line 3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lob/o;

    .line 5
    invoke-virtual {v3}, Lob/o;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lob/o;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lob/a0$a;)Lob/i0;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lob/a0$a;->e()Lob/g0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lob/g0;->h()Lob/g0$a;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lob/g0;->a()Lob/h0;

    move-result-object v2

    const-string v3, "Content-Type"

    const-wide/16 v4, -0x1

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {v2}, Lob/h0;->b()Lob/b0;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 5
    invoke-virtual {v7}, Lob/b0;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v3, v7}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    .line 6
    :cond_0
    invoke-virtual {v2}, Lob/h0;->a()J

    move-result-wide v7

    const-string v2, "Transfer-Encoding"

    cmp-long v9, v7, v4

    if-eqz v9, :cond_1

    .line 7
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    .line 8
    invoke-virtual {v1, v2}, Lob/g0$a;->f(Ljava/lang/String;)Lob/g0$a;

    goto :goto_0

    :cond_1
    const-string v7, "chunked"

    .line 9
    invoke-virtual {v1, v2, v7}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    .line 10
    invoke-virtual {v1, v6}, Lob/g0$a;->f(Ljava/lang/String;)Lob/g0$a;

    :cond_2
    :goto_0
    const-string v2, "Host"

    .line 11
    invoke-virtual {v0, v2}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v7, :cond_3

    .line 12
    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v7

    invoke-static {v7, v8}, Lpb/e;->s(Lob/z;Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    :cond_3
    const-string v2, "Connection"

    .line 13
    invoke-virtual {v0, v2}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    .line 14
    invoke-virtual {v1, v2, v7}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    :cond_4
    const-string v2, "Accept-Encoding"

    .line 15
    invoke-virtual {v0, v2}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "gzip"

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    const/4 v8, 0x1

    .line 16
    invoke-virtual {v1, v2, v9}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    .line 17
    :cond_5
    iget-object v2, p0, Lsb/a;->a:Lob/p;

    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v7

    invoke-interface {v2, v7}, Lob/p;->b(Lob/z;)Ljava/util/List;

    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_6

    .line 19
    invoke-direct {p0, v2}, Lsb/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "Cookie"

    invoke-virtual {v1, v7, v2}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    :cond_6
    const-string v2, "User-Agent"

    .line 20
    invoke-virtual {v0, v2}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    .line 21
    invoke-static {}, Lpb/f;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    .line 22
    :cond_7
    invoke-virtual {v1}, Lob/g0$a;->a()Lob/g0;

    move-result-object v1

    invoke-interface {p1, v1}, Lob/a0$a;->b(Lob/g0;)Lob/i0;

    move-result-object p1

    .line 23
    iget-object v1, p0, Lsb/a;->a:Lob/p;

    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v2

    invoke-virtual {p1}, Lob/i0;->O()Lob/y;

    move-result-object v7

    invoke-static {v1, v2, v7}, Lsb/e;->g(Lob/p;Lob/z;Lob/y;)V

    .line 24
    invoke-virtual {p1}, Lob/i0;->X()Lob/i0$a;

    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object v0

    if-eqz v8, :cond_8

    const-string v1, "Content-Encoding"

    .line 26
    invoke-virtual {p1, v1}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 27
    invoke-static {p1}, Lsb/e;->c(Lob/i0;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 28
    new-instance v2, Lac/j;

    invoke-virtual {p1}, Lob/i0;->b()Lob/j0;

    move-result-object v7

    invoke-virtual {v7}, Lob/j0;->Q()Lac/e;

    move-result-object v7

    invoke-direct {v2, v7}, Lac/j;-><init>(Lac/t;)V

    .line 29
    invoke-virtual {p1}, Lob/i0;->O()Lob/y;

    move-result-object v7

    invoke-virtual {v7}, Lob/y;->f()Lob/y$a;

    move-result-object v7

    .line 30
    invoke-virtual {v7, v1}, Lob/y$a;->g(Ljava/lang/String;)Lob/y$a;

    move-result-object v1

    .line 31
    invoke-virtual {v1, v6}, Lob/y$a;->g(Ljava/lang/String;)Lob/y$a;

    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lob/y$a;->e()Lob/y;

    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lob/i0$a;->j(Lob/y;)Lob/i0$a;

    .line 34
    invoke-virtual {p1, v3}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    new-instance v1, Lsb/h;

    invoke-static {v2}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object v2

    invoke-direct {v1, p1, v4, v5, v2}, Lsb/h;-><init>(Ljava/lang/String;JLac/e;)V

    invoke-virtual {v0, v1}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    .line 36
    :cond_8
    invoke-virtual {v0}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    return-object p1
.end method
