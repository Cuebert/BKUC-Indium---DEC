.class public Lo9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lob/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lob/i0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/d0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lob/i0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lo9/f;->b(Lob/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lob/i0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lob/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lob/i0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/d0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lob/i0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v2, Lob/g0$a;

    invoke-direct {v2}, Lob/g0$a;-><init>()V

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v7}, Lo9/f;->c(Lob/d0;Lob/g0$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lob/i0;

    move-result-object p1

    return-object p1
.end method

.method public c(Lob/d0;Lob/g0$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lob/i0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/d0;",
            "Lob/g0$a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lob/i0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2, p3}, Lob/g0$a;->h(Ljava/lang/String;)Lob/g0$a;

    if-eqz p5, :cond_1

    .line 2
    invoke-interface {p5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 3
    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v2, :cond_0

    if-eqz v5, :cond_0

    .line 4
    invoke-virtual {p2, v2, v5}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    goto :goto_0

    :cond_1
    const-string v1, "X-CSRF-TOKEN"

    if-eqz p4, :cond_4

    if-nez p6, :cond_2

    const-string v2, "application/x-www-form-urlencoded;charset=UTF-8"

    goto :goto_1

    :cond_2
    move-object v2, p6

    .line 5
    :goto_1
    invoke-static {v2}, Lob/b0;->d(Ljava/lang/String;)Lob/b0;

    move-result-object v5

    .line 6
    invoke-static {v5, p4}, Lob/h0;->d(Lob/b0;Ljava/lang/String;)Lob/h0;

    move-result-object v5

    .line 7
    invoke-virtual {p2, v5}, Lob/g0$a;->e(Lob/h0;)Lob/g0$a;

    .line 8
    invoke-static {}, Lq9/b;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 9
    invoke-virtual {p2, v1, v5}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    :cond_3
    move-object v5, v2

    goto :goto_2

    :cond_4
    move-object v5, p6

    .line 10
    :goto_2
    invoke-virtual {p2}, Lob/g0$a;->a()Lob/g0;

    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Lob/d0;->a(Lob/g0;)Lob/g;

    move-result-object v0

    invoke-interface {v0}, Lob/g;->c()Lob/i0;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lob/i0;->e()I

    move-result v6

    const/16 v7, 0x193

    if-ne v6, v7, :cond_7

    .line 13
    invoke-virtual {v0, v1}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "rbx.platform"

    if-nez p7, :cond_5

    if-eqz v1, :cond_5

    const-string v0, "XSRF: got token. retrying"

    .line 14
    invoke-static {v6, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-static {v1}, Lq9/b;->d(Ljava/lang/String;)V

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    .line 16
    invoke-virtual/range {v0 .. v6}, Lo9/f;->b(Lob/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lob/i0;

    move-result-object v0

    return-object v0

    :cond_5
    if-eqz p7, :cond_6

    const-string v1, "XSRF Error: retry already attempted. Will not retry"

    .line 17
    invoke-static {v6, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_6
    const-string v1, "XSRF Error: token not present in response. Will not retry"

    .line 18
    invoke-static {v6, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_3
    return-object v0
.end method
