.class public final Lrb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final g:Ljava/util/concurrent/Executor;


# instance fields
.field private final a:I

.field private final b:J

.field private final c:Ljava/lang/Runnable;

.field private final d:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lrb/e;",
            ">;"
        }
    .end annotation
.end field

.field final e:Lrb/h;

.field f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v0, 0x1

    const-string v7, "OkHttp ConnectionPool"

    .line 2
    invoke-static {v7, v0}, Lpb/e;->I(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, Lrb/g;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lrb/f;

    invoke-direct {v0, p0}, Lrb/f;-><init>(Lrb/g;)V

    iput-object v0, p0, Lrb/g;->c:Ljava/lang/Runnable;

    .line 3
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lrb/g;->d:Ljava/util/Deque;

    .line 4
    new-instance v0, Lrb/h;

    invoke-direct {v0}, Lrb/h;-><init>()V

    iput-object v0, p0, Lrb/g;->e:Lrb/h;

    .line 5
    iput p1, p0, Lrb/g;->a:I

    .line 6
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lrb/g;->b:J

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-lez p1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "keepAliveDuration <= 0: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lrb/g;)V
    .locals 0

    invoke-direct {p0}, Lrb/g;->e()V

    return-void
.end method

.method private synthetic e()V
    .locals 6

    .line 1
    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lrb/g;->b(J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    return-void

    :cond_1
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const-wide/32 v2, 0xf4240

    .line 2
    div-long v4, v0, v2

    mul-long v2, v2, v4

    sub-long/2addr v0, v2

    .line 3
    monitor-enter p0

    long-to-int v1, v0

    .line 4
    :try_start_0
    invoke-virtual {p0, v4, v5, v1}, Ljava/lang/Object;->wait(JI)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 5
    :catch_0
    :goto_1
    :try_start_1
    monitor-exit p0

    goto :goto_0

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private f(Lrb/e;J)I
    .locals 6

    .line 1
    iget-object v0, p1, Lrb/e;->p:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 3
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    .line 4
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_1
    check-cast v3, Lrb/k$b;

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "A connection to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lrb/e;->r()Lob/k0;

    move-result-object v5

    invoke-virtual {v5}, Lob/k0;->a()Lob/a;

    move-result-object v5

    invoke-virtual {v5}, Lob/a;->l()Lob/z;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v5

    iget-object v3, v3, Lrb/k$b;->a:Ljava/lang/Object;

    invoke-virtual {v5, v4, v3}, Lwb/f;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v3, 0x1

    .line 9
    iput-boolean v3, p1, Lrb/e;->k:Z

    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 11
    iget-wide v2, p0, Lrb/g;->b:J

    sub-long/2addr p2, v2

    iput-wide p2, p1, Lrb/e;->q:J

    return v1

    .line 12
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method


# virtual methods
.method b(J)J
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lrb/g;->d:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/high16 v3, -0x8000000000000000L

    const/4 v5, 0x0

    const/4 v6, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrb/e;

    .line 4
    invoke-direct {p0, v7, p1, p2}, Lrb/g;->f(Lrb/e;J)I

    move-result v8

    if-lez v8, :cond_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 5
    iget-wide v8, v7, Lrb/e;->q:J

    sub-long v8, p1, v8

    cmp-long v10, v8, v3

    if-lez v10, :cond_0

    move-object v2, v7

    move-wide v3, v8

    goto :goto_0

    .line 6
    :cond_2
    iget-wide p1, p0, Lrb/g;->b:J

    cmp-long v0, v3, p1

    if-gez v0, :cond_6

    iget v0, p0, Lrb/g;->a:I

    if-le v5, v0, :cond_3

    goto :goto_1

    :cond_3
    if-lez v5, :cond_4

    sub-long/2addr p1, v3

    .line 7
    monitor-exit p0

    return-wide p1

    :cond_4
    if-lez v6, :cond_5

    .line 8
    monitor-exit p0

    return-wide p1

    .line 9
    :cond_5
    iput-boolean v1, p0, Lrb/g;->f:Z

    const-wide/16 p1, -0x1

    .line 10
    monitor-exit p0

    return-wide p1

    .line 11
    :cond_6
    :goto_1
    iget-object p1, p0, Lrb/g;->d:Ljava/util/Deque;

    invoke-interface {p1, v2}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    .line 12
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {v2}, Lrb/e;->t()Ljava/net/Socket;

    move-result-object p1

    invoke-static {p1}, Lpb/e;->h(Ljava/net/Socket;)V

    const-wide/16 p1, 0x0

    return-wide p1

    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Lob/k0;Ljava/io/IOException;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lob/k0;->a()Lob/a;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lob/a;->i()Ljava/net/ProxySelector;

    move-result-object v1

    .line 4
    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->E()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p1}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    .line 5
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 6
    :cond_0
    iget-object p2, p0, Lrb/g;->e:Lrb/h;

    invoke-virtual {p2, p1}, Lrb/h;->b(Lob/k0;)V

    return-void
.end method

.method d(Lrb/e;)Z
    .locals 1

    .line 1
    iget-boolean v0, p1, Lrb/e;->k:Z

    if-nez v0, :cond_1

    iget v0, p0, Lrb/g;->a:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lrb/g;->d:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method g(Lrb/e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lrb/g;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lrb/g;->f:Z

    .line 3
    sget-object v0, Lrb/g;->g:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lrb/g;->c:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lrb/g;->d:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method h(Lob/a;Lrb/k;Ljava/util/List;Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/a;",
            "Lrb/k;",
            "Ljava/util/List<",
            "Lob/k0;",
            ">;Z)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/g;->d:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrb/e;

    if-eqz p4, :cond_0

    .line 2
    invoke-virtual {v1}, Lrb/e;->o()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v1, p1, p3}, Lrb/e;->m(Lob/a;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p2, v1}, Lrb/k;->a(Lrb/e;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
