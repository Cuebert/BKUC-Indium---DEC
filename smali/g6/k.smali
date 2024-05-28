.class public abstract Lg6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lg6/o;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    .line 1
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lg6/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lg6/o;

    .line 2
    invoke-direct {v0}, Lg6/o;-><init>()V

    iput-object v0, p0, Lg6/k;->a:Lg6/o;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lg6/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;Lg4/a;)Lg4/l;
    .locals 9
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p3    # Lg4/a;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "Lg4/a;",
            ")",
            "Lg4/l<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lg6/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lz2/j;->m(Z)V

    .line 2
    invoke-virtual {p3}, Lg4/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lg4/o;->d()Lg4/l;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    new-instance v3, Lg4/b;

    invoke-direct {v3}, Lg4/b;-><init>()V

    .line 5
    new-instance v6, Lg4/m;

    .line 6
    invoke-virtual {v3}, Lg4/b;->b()Lg4/a;

    move-result-object v0

    invoke-direct {v6, v0}, Lg4/m;-><init>(Lg4/a;)V

    new-instance v7, Lg6/a0;

    .line 7
    invoke-direct {v7, p1, p3, v3, v6}, Lg6/a0;-><init>(Ljava/util/concurrent/Executor;Lg4/a;Lg4/b;Lg4/m;)V

    iget-object p1, p0, Lg6/k;->a:Lg6/o;

    new-instance v8, Lg6/z;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p3

    move-object v4, p2

    move-object v5, v6

    .line 8
    invoke-direct/range {v0 .. v5}, Lg6/z;-><init>(Lg6/k;Lg4/a;Lg4/b;Ljava/util/concurrent/Callable;Lg4/m;)V

    invoke-virtual {p1, v7, v8}, Lg6/o;->a(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    .line 9
    invoke-virtual {v6}, Lg4/m;->a()Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public abstract b()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lg6/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method protected abstract d()V
.end method

.method public e(Ljava/util/concurrent/Executor;)V
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lg6/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lz2/j;->m(Z)V

    iget-object v0, p0, Lg6/k;->a:Lg6/o;

    new-instance v1, Lg6/y;

    .line 2
    invoke-direct {v1, p0}, Lg6/y;-><init>(Lg6/k;)V

    invoke-virtual {v0, p1, v1}, Lg6/o;->a(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic f(Lg4/a;Lg4/b;Ljava/util/concurrent/Callable;Lg4/m;)V
    .locals 3
    .param p1    # Lg4/a;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p2    # Lg4/b;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p4    # Lg4/m;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lg4/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lg4/b;->a()V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lg6/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lg6/k;->b()V

    iget-object v0, p0, Lg6/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    :cond_1
    invoke-virtual {p1}, Lg4/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p2}, Lg4/b;->a()V

    return-void

    .line 8
    :cond_2
    invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :try_start_1
    invoke-virtual {p1}, Lg4/a;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {p2}, Lg4/b;->a()V

    return-void

    .line 11
    :cond_3
    invoke-virtual {p4, p3}, Lg4/m;->c(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p3

    goto :goto_0

    :catch_1
    move-exception p3

    new-instance v0, Lc6/a;

    const-string v1, "Internal error has occurred when executing ML Kit tasks"

    const/16 v2, 0xd

    .line 12
    invoke-direct {v0, v1, v2, p3}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 13
    :goto_0
    invoke-virtual {p1}, Lg4/a;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p2}, Lg4/b;->a()V

    return-void

    .line 15
    :cond_4
    invoke-virtual {p4, p3}, Lg4/m;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public final synthetic g()V
    .locals 3

    iget-object v0, p0, Lg6/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-static {v2}, Lz2/j;->m(Z)V

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lg6/k;->d()V

    iget-object v0, p0, Lg6/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_1
    return-void
.end method
