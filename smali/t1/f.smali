.class public Lt1/f;
.super Lt1/h;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/messaging/MessageQueue;


# instance fields
.field private final f:Ljava/lang/Object;

.field private final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final h:Lcom/birbit/android/jobqueue/timer/Timer;

.field private final i:Lt1/a;

.field private j:Z

.field private final k:Lt1/c;


# direct methods
.method public constructor <init>(Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2, p3}, Lt1/h;-><init>(Lt1/c;Ljava/lang/String;)V

    .line 2
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lt1/f;->f:Ljava/lang/Object;

    .line 3
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p3, p0, Lt1/f;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    iput-boolean v0, p0, Lt1/f;->j:Z

    .line 5
    iput-object p2, p0, Lt1/f;->k:Lt1/c;

    .line 6
    iput-object p1, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    .line 7
    new-instance p1, Lt1/a;

    invoke-direct {p1, p2}, Lt1/a;-><init>(Lt1/c;)V

    iput-object p1, p0, Lt1/f;->i:Lt1/a;

    return-void
.end method


# virtual methods
.method public cancelMessages(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-super {p0, p1}, Lt1/h;->c(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V

    .line 3
    iget-object v1, p0, Lt1/f;->i:Lt1/a;

    invoke-virtual {v1, p1}, Lt1/a;->c(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-super {p0}, Lt1/h;->clear()V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public consume(Lt1/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt1/f;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p1}, Lt1/d;->c()V

    .line 3
    :cond_0
    :goto_0
    iget-object v0, p0, Lt1/f;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Lt1/f;->d(Lt1/d;)Lt1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p1, v0}, Lt1/d;->a(Lt1/b;)V

    .line 6
    iget-object v2, p0, Lt1/f;->k:Lt1/c;

    invoke-virtual {v2, v0}, Lt1/c;->b(Lt1/b;)V

    goto :goto_0

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lt1/h;->c:Ljava/lang/String;

    aput-object v1, p1, v0

    const-string v0, "[%s] finished queue"

    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "only 1 consumer per MQ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method d(Lt1/d;)Lt1/b;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lt1/f;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2
    iget-object v2, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v2

    .line 3
    :try_start_0
    iget-object v3, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v3}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v3

    .line 4
    iget-object v5, p0, Lt1/f;->i:Lt1/a;

    invoke-virtual {v5, v3, v4, p0}, Lt1/a;->b(JLcom/birbit/android/jobqueue/messaging/MessageQueue;)Ljava/lang/Long;

    move-result-object v5

    .line 5
    invoke-super {p0}, Lt1/h;->a()Lt1/b;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 6
    monitor-exit v2

    return-object v6

    .line 7
    :cond_0
    iput-boolean v0, p0, Lt1/f;->j:Z

    .line 8
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 9
    invoke-virtual {p1}, Lt1/d;->b()V

    const/4 v1, 0x1

    .line 10
    :cond_1
    iget-object v6, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v6

    .line 11
    :try_start_1
    iget-boolean v7, p0, Lt1/f;->j:Z

    if-eqz v7, :cond_2

    .line 12
    monitor-exit v6

    goto :goto_0

    :cond_2
    if-eqz v5, :cond_3

    .line 13
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v9, v7, v3

    if-gtz v9, :cond_3

    const-string v3, "[%s] next message is ready, requery"

    new-array v2, v2, [Ljava/lang/Object;

    .line 14
    iget-object v4, p0, Lt1/h;->c:Ljava/lang/String;

    aput-object v4, v2, v0

    invoke-static {v3, v2}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    monitor-exit v6

    goto :goto_0

    .line 16
    :cond_3
    iget-object v3, p0, Lt1/f;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_5

    if-nez v5, :cond_4

    :try_start_2
    const-string v3, "[%s] will wait on the lock forever"

    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    iget-object v4, p0, Lt1/h;->c:Ljava/lang/String;

    aput-object v4, v2, v0

    invoke-static {v3, v2}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    iget-object v2, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v3, p0, Lt1/f;->f:Ljava/lang/Object;

    invoke-interface {v2, v3}, Lcom/birbit/android/jobqueue/timer/Timer;->waitOnObject(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    const-string v3, "[%s] will wait on the lock until %d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    .line 19
    iget-object v7, p0, Lt1/h;->c:Ljava/lang/String;

    aput-object v7, v4, v0

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    iget-object v2, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v3, p0, Lt1/f;->f:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Lcom/birbit/android/jobqueue/timer/Timer;->waitOnObjectUntilNs(Ljava/lang/Object;J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    :catch_0
    :cond_5
    :goto_1
    :try_start_3
    monitor-exit v6

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 22
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method public post(Lt1/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lt1/f;->j:Z

    .line 3
    invoke-super {p0, p1}, Lt1/h;->post(Lt1/b;)V

    .line 4
    iget-object p1, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v1, p0, Lt1/f;->f:Ljava/lang/Object;

    invoke-interface {p1, v1}, Lcom/birbit/android/jobqueue/timer/Timer;->notifyObject(Ljava/lang/Object;)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public postAt(Lt1/b;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lt1/f;->j:Z

    .line 3
    iget-object v1, p0, Lt1/f;->i:Lt1/a;

    invoke-virtual {v1, p1, p2, p3}, Lt1/a;->a(Lt1/b;J)V

    .line 4
    iget-object p1, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object p2, p0, Lt1/f;->f:Ljava/lang/Object;

    invoke-interface {p1, p2}, Lcom/birbit/android/jobqueue/timer/Timer;->notifyObject(Ljava/lang/Object;)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public stop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt1/f;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 2
    iget-object v0, p0, Lt1/f;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lt1/f;->h:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v2, p0, Lt1/f;->f:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lcom/birbit/android/jobqueue/timer/Timer;->notifyObject(Ljava/lang/Object;)V

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
