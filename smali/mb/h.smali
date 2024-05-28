.class public final Lmb/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmb/a0;

.field public static final b:Lmb/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmb/a0;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lmb/h;->a:Lmb/a0;

    .line 2
    new-instance v0, Lmb/a0;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lmb/h;->b:Lmb/a0;

    return-void
.end method

.method public static final synthetic a()Lmb/a0;
    .locals 1

    sget-object v0, Lmb/h;->a:Lmb/a0;

    return-object v0
.end method

.method public static final b(Lva/c;Ljava/lang/Object;Ldb/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lva/c<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lmb/g;

    if-eqz v0, :cond_8

    check-cast p0, Lmb/g;

    .line 2
    invoke-static {p1, p2}, Lkb/t;->b(Ljava/lang/Object;Ldb/l;)Ljava/lang/Object;

    move-result-object p2

    .line 3
    iget-object v0, p0, Lmb/g;->q:Lkb/v;

    invoke-virtual {p0}, Lmb/g;->getContext()Lva/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkb/v;->k0(Lva/e;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 4
    iput-object p2, p0, Lmb/g;->s:Ljava/lang/Object;

    .line 5
    iput v1, p0, Lkb/e0;->p:I

    .line 6
    iget-object p1, p0, Lmb/g;->q:Lkb/v;

    invoke-virtual {p0}, Lmb/g;->getContext()Lva/e;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lkb/v;->j0(Lva/e;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    .line 7
    :cond_0
    sget-object v0, Lkb/j1;->a:Lkb/j1;

    invoke-virtual {v0}, Lkb/j1;->a()Lkb/j0;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lkb/j0;->s0()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    iput-object p2, p0, Lmb/g;->s:Ljava/lang/Object;

    .line 10
    iput v1, p0, Lkb/e0;->p:I

    .line 11
    invoke-virtual {v0, p0}, Lkb/j0;->o0(Lkb/e0;)V

    goto/16 :goto_4

    .line 12
    :cond_1
    invoke-virtual {v0, v1}, Lkb/j0;->q0(Z)V

    const/4 v2, 0x0

    .line 13
    :try_start_0
    invoke-virtual {p0}, Lmb/g;->getContext()Lva/e;

    move-result-object v3

    sget-object v4, Lkb/v0;->k:Lkb/v0$b;

    invoke-interface {v3, v4}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object v3

    check-cast v3, Lkb/v0;

    if-eqz v3, :cond_2

    .line 14
    invoke-interface {v3}, Lkb/v0;->c()Z

    move-result v4

    if-nez v4, :cond_2

    .line 15
    invoke-interface {v3}, Lkb/v0;->T()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    .line 16
    invoke-virtual {p0, p2, v3}, Lmb/g;->b(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 17
    sget-object p2, Lta/h;->n:Lta/h$a;

    invoke-static {v3}, Lta/i;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lta/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lva/c;->d(Ljava/lang/Object;)V

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    .line 18
    iget-object p2, p0, Lmb/g;->r:Lva/c;

    iget-object v3, p0, Lmb/g;->t:Ljava/lang/Object;

    .line 19
    invoke-interface {p2}, Lva/c;->getContext()Lva/e;

    move-result-object v4

    .line 20
    invoke-static {v4, v3}, Lmb/e0;->c(Lva/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 21
    sget-object v5, Lmb/e0;->a:Lmb/a0;

    if-eq v3, v5, :cond_3

    .line 22
    invoke-static {p2, v4, v3}, Lkb/u;->c(Lva/c;Lva/e;Ljava/lang/Object;)Lkb/l1;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    .line 23
    :goto_1
    :try_start_1
    iget-object v5, p0, Lmb/g;->r:Lva/c;

    invoke-interface {v5, p1}, Lva/c;->d(Ljava/lang/Object;)V

    .line 24
    sget-object p1, Lta/l;->a:Lta/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    .line 25
    :try_start_2
    invoke-virtual {p2}, Lkb/l1;->p0()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 26
    :cond_4
    invoke-static {v4, v3}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    .line 27
    invoke-virtual {p2}, Lkb/l1;->p0()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 28
    :cond_5
    invoke-static {v4, v3}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    :cond_6
    throw p1

    .line 29
    :cond_7
    :goto_2
    invoke-virtual {v0}, Lkb/j0;->u0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    .line 30
    :try_start_3
    invoke-virtual {p0, p1, v2}, Lkb/e0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 31
    :goto_3
    invoke-virtual {v0, v1}, Lkb/j0;->m0(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lkb/j0;->m0(Z)V

    throw p0

    .line 32
    :cond_8
    invoke-interface {p0, p1}, Lva/c;->d(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Lva/c;Ljava/lang/Object;Ldb/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lmb/h;->b(Lva/c;Ljava/lang/Object;Ldb/l;)V

    return-void
.end method
