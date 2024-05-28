.class public final Lgc/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgc/b;Lva/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgc/b<",
            "TT;>;",
            "Lva/c<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkb/i;

    invoke-static {p1}, Lwa/b;->a(Lva/c;)Lva/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkb/i;-><init>(Lva/c;I)V

    .line 2
    new-instance v1, Lgc/m$a;

    invoke-direct {v1, p0}, Lgc/m$a;-><init>(Lgc/b;)V

    invoke-interface {v0, v1}, Lkb/h;->f(Ldb/l;)V

    .line 3
    new-instance v1, Lgc/m$c;

    invoke-direct {v1, v0}, Lgc/m$c;-><init>(Lkb/h;)V

    invoke-interface {p0, v1}, Lgc/b;->W(Lgc/d;)V

    .line 4
    invoke-virtual {v0}, Lkb/i;->u()Ljava/lang/Object;

    move-result-object p0

    .line 5
    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lxa/g;->b(Lva/c;)V

    :cond_0
    return-object p0
.end method

.method public static final b(Lgc/b;Lva/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgc/b<",
            "TT;>;",
            "Lva/c<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkb/i;

    invoke-static {p1}, Lwa/b;->a(Lva/c;)Lva/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkb/i;-><init>(Lva/c;I)V

    .line 2
    new-instance v1, Lgc/m$b;

    invoke-direct {v1, p0}, Lgc/m$b;-><init>(Lgc/b;)V

    invoke-interface {v0, v1}, Lkb/h;->f(Ldb/l;)V

    .line 3
    new-instance v1, Lgc/m$d;

    invoke-direct {v1, v0}, Lgc/m$d;-><init>(Lkb/h;)V

    invoke-interface {p0, v1}, Lgc/b;->W(Lgc/d;)V

    .line 4
    invoke-virtual {v0}, Lkb/i;->u()Ljava/lang/Object;

    move-result-object p0

    .line 5
    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lxa/g;->b(Lva/c;)V

    :cond_0
    return-object p0
.end method

.method public static final c(Lgc/b;Lva/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgc/b<",
            "TT;>;",
            "Lva/c<",
            "-",
            "Lgc/t<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkb/i;

    invoke-static {p1}, Lwa/b;->a(Lva/c;)Lva/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkb/i;-><init>(Lva/c;I)V

    .line 2
    new-instance v1, Lgc/m$e;

    invoke-direct {v1, p0}, Lgc/m$e;-><init>(Lgc/b;)V

    invoke-interface {v0, v1}, Lkb/h;->f(Ldb/l;)V

    .line 3
    new-instance v1, Lgc/m$f;

    invoke-direct {v1, v0}, Lgc/m$f;-><init>(Lkb/h;)V

    invoke-interface {p0, v1}, Lgc/b;->W(Lgc/d;)V

    .line 4
    invoke-virtual {v0}, Lkb/i;->u()Ljava/lang/Object;

    move-result-object p0

    .line 5
    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lxa/g;->b(Lva/c;)V

    :cond_0
    return-object p0
.end method

.method public static final d(Ljava/lang/Exception;Lva/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Lva/c<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lgc/m$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lgc/m$h;

    iget v1, v0, Lgc/m$h;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgc/m$h;->r:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgc/m$h;

    invoke-direct {v0, p1}, Lgc/m$h;-><init>(Lva/c;)V

    :goto_0
    iget-object p1, v0, Lgc/m$h;->q:Ljava/lang/Object;

    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lgc/m$h;->r:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lgc/m$h;->s:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Exception;

    invoke-static {p1}, Lta/i;->b(Ljava/lang/Object;)V

    goto :goto_1

    .line 2
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3
    :cond_2
    invoke-static {p1}, Lta/i;->b(Ljava/lang/Object;)V

    .line 4
    iput-object p0, v0, Lgc/m$h;->s:Ljava/lang/Object;

    iput v3, v0, Lgc/m$h;->r:I

    .line 5
    invoke-static {}, Lkb/g0;->a()Lkb/v;

    move-result-object p1

    invoke-interface {v0}, Lva/c;->getContext()Lva/e;

    move-result-object v2

    new-instance v3, Lgc/m$g;

    invoke-direct {v3, v0, p0}, Lgc/m$g;-><init>(Lva/c;Ljava/lang/Exception;)V

    invoke-virtual {p1, v2, v3}, Lkb/v;->j0(Lva/e;Ljava/lang/Runnable;)V

    .line 6
    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object p0

    .line 7
    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Lxa/g;->b(Lva/c;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    .line 8
    :cond_4
    :goto_1
    sget-object p0, Lta/l;->a:Lta/l;

    return-object p0
.end method
