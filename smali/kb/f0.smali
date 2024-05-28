.class public final Lkb/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lkb/e0;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkb/e0<",
            "-TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkb/e0;->c()Lva/c;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    .line 2
    instance-of v2, v0, Lmb/g;

    if-eqz v2, :cond_2

    invoke-static {p1}, Lkb/f0;->b(I)Z

    move-result p1

    iget v2, p0, Lkb/e0;->p:I

    invoke-static {v2}, Lkb/f0;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    .line 3
    move-object p1, v0

    check-cast p1, Lmb/g;

    iget-object p1, p1, Lmb/g;->q:Lkb/v;

    .line 4
    invoke-interface {v0}, Lva/c;->getContext()Lva/e;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lkb/v;->k0(Lva/e;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p1, v0, p0}, Lkb/v;->j0(Lva/e;Ljava/lang/Runnable;)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-static {p0}, Lkb/f0;->e(Lkb/e0;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {p0, v0, v1}, Lkb/f0;->d(Lkb/e0;Lva/c;Z)V

    :goto_1
    return-void
.end method

.method public static final b(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final c(I)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(Lkb/e0;Lva/c;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkb/e0<",
            "-TT;>;",
            "Lva/c<",
            "-TT;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkb/e0;->i()Ljava/lang/Object;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Lkb/e0;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    sget-object p0, Lta/h;->n:Lta/h$a;

    invoke-static {v1}, Lta/i;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Lta/h;->n:Lta/h$a;

    invoke-virtual {p0, v0}, Lkb/e0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lta/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p2, :cond_5

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 4
    invoke-static {p1, p2}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lmb/g;

    .line 5
    iget-object p2, p1, Lmb/g;->r:Lva/c;

    iget-object v0, p1, Lmb/g;->t:Ljava/lang/Object;

    .line 6
    invoke-interface {p2}, Lva/c;->getContext()Lva/e;

    move-result-object v1

    .line 7
    invoke-static {v1, v0}, Lmb/e0;->c(Lva/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 8
    sget-object v2, Lmb/e0;->a:Lmb/a0;

    if-eq v0, v2, :cond_1

    .line 9
    invoke-static {p2, v1, v0}, Lkb/u;->c(Lva/c;Lva/e;Ljava/lang/Object;)Lkb/l1;

    move-result-object p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 10
    :goto_1
    :try_start_0
    iget-object p1, p1, Lmb/g;->r:Lva/c;

    invoke-interface {p1, p0}, Lva/c;->d(Ljava/lang/Object;)V

    .line 11
    sget-object p0, Lta/l;->a:Lta/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_2

    .line 12
    invoke-virtual {p2}, Lkb/l1;->p0()Z

    move-result p0

    if-eqz p0, :cond_6

    .line 13
    :cond_2
    invoke-static {v1, v0}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_3

    .line 14
    invoke-virtual {p2}, Lkb/l1;->p0()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 15
    :cond_3
    invoke-static {v1, v0}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    :cond_4
    throw p0

    .line 16
    :cond_5
    invoke-interface {p1, p0}, Lva/c;->d(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method private static final e(Lkb/e0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/e0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lkb/j1;->a:Lkb/j1;

    invoke-virtual {v0}, Lkb/j1;->a()Lkb/j0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lkb/j0;->s0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lkb/j0;->o0(Lkb/e0;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lkb/j0;->q0(Z)V

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lkb/e0;->c()Lva/c;

    move-result-object v2

    invoke-static {p0, v2, v1}, Lkb/f0;->d(Lkb/e0;Lva/c;Z)V

    .line 6
    :cond_1
    invoke-virtual {v0}, Lkb/j0;->u0()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v2

    const/4 v3, 0x0

    .line 7
    :try_start_1
    invoke-virtual {p0, v2, v3}, Lkb/e0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8
    :goto_0
    invoke-virtual {v0, v1}, Lkb/j0;->m0(Z)V

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, Lkb/j0;->m0(Z)V

    throw p0
.end method
