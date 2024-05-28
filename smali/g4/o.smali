.class public final Lg4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lg4/l;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lg4/l<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lz2/j;->h()V

    const-string v0, "Task must not be null"

    .line 2
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Lg4/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p0}, Lg4/o;->g(Lg4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lg4/r;

    const/4 v1, 0x0

    .line 5
    invoke-direct {v0, v1}, Lg4/r;-><init>(Lg4/q;)V

    .line 6
    invoke-static {p0, v0}, Lg4/o;->h(Lg4/l;Lg4/s;)V

    .line 7
    invoke-virtual {v0}, Lg4/r;->b()V

    .line 8
    invoke-static {p0}, Lg4/o;->g(Lg4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lg4/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lg4/l<",
            "TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lz2/j;->h()V

    const-string v0, "Task must not be null"

    .line 2
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    .line 3
    invoke-static {p3, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0}, Lg4/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {p0}, Lg4/o;->g(Lg4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lg4/r;

    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Lg4/r;-><init>(Lg4/q;)V

    .line 7
    invoke-static {p0, v0}, Lg4/o;->h(Lg4/l;Lg4/s;)V

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lg4/r;->c(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    invoke-static {p0}, Lg4/o;->g(Lg4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 10
    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Timed out waiting for Task"

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Executor must not be null"

    .line 1
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    .line 2
    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lg4/n0;

    .line 3
    invoke-direct {v0}, Lg4/n0;-><init>()V

    new-instance v1, Lg4/o0;

    invoke-direct {v1, v0, p1}, Lg4/o0;-><init>(Lg4/n0;Ljava/util/concurrent/Callable;)V

    .line 4
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static d()Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">()",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    invoke-virtual {v0}, Lg4/n0;->t()Z

    return-object v0
.end method

.method public static e(Ljava/lang/Exception;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    invoke-virtual {v0, p0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Object;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    invoke-virtual {v0, p0}, Lg4/n0;->s(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static g(Lg4/l;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lg4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lg4/l;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 5
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lg4/l;->j()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static h(Lg4/l;Lg4/s;)V
    .locals 1

    .line 1
    sget-object v0, Lg4/n;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lg4/l;->g(Ljava/util/concurrent/Executor;Lg4/h;)Lg4/l;

    .line 2
    invoke-virtual {p0, v0, p1}, Lg4/l;->e(Ljava/util/concurrent/Executor;Lg4/g;)Lg4/l;

    .line 3
    invoke-virtual {p0, v0, p1}, Lg4/l;->a(Ljava/util/concurrent/Executor;Lg4/e;)Lg4/l;

    return-void
.end method
