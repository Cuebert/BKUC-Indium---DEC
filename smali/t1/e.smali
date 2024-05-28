.class public Lt1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/messaging/MessageQueue;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:[Lt1/h;

.field private final c:Lt1/a;

.field private final d:Lcom/birbit/android/jobqueue/timer/Timer;

.field private final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private f:Z

.field private final g:Lt1/c;


# direct methods
.method public constructor <init>(Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt1/e;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lt1/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    iput-boolean v1, p0, Lt1/e;->f:Z

    .line 5
    new-instance v0, Lt1/a;

    invoke-direct {v0, p2}, Lt1/a;-><init>(Lt1/c;)V

    iput-object v0, p0, Lt1/e;->c:Lt1/a;

    .line 6
    iput-object p2, p0, Lt1/e;->g:Lt1/c;

    .line 7
    sget p2, Lt1/g;->B:I

    add-int/lit8 p2, p2, 0x1

    new-array p2, p2, [Lt1/h;

    iput-object p2, p0, Lt1/e;->b:[Lt1/h;

    .line 8
    iput-object p1, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    return-void
.end method


# virtual methods
.method public a(Lt1/d;)Lt1/b;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lt1/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 2
    iget-object v2, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 3
    :try_start_0
    iget-object v3, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v3}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v3

    const-string v5, "[%s] looking for next message at time %s"

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    const-string v8, "priority_mq"

    aput-object v8, v7, v0

    .line 4
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    invoke-static {v5, v7}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    iget-object v5, p0, Lt1/e;->c:Lt1/a;

    invoke-virtual {v5, v3, v4, p0}, Lt1/a;->b(JLcom/birbit/android/jobqueue/messaging/MessageQueue;)Ljava/lang/Long;

    move-result-object v5

    const-string v7, "[%s] next delayed job %s"

    new-array v8, v6, [Ljava/lang/Object;

    const-string v10, "priority_mq"

    aput-object v10, v8, v0

    aput-object v5, v8, v9

    .line 6
    invoke-static {v7, v8}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    sget v7, Lt1/g;->B:I

    :goto_1
    if-ltz v7, :cond_2

    .line 8
    iget-object v8, p0, Lt1/e;->b:[Lt1/h;

    aget-object v8, v8, v7

    if-nez v8, :cond_0

    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {v8}, Lt1/h;->a()Lt1/b;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 10
    monitor-exit v2

    return-object v8

    :cond_1
    :goto_2
    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    .line 11
    :cond_2
    iput-boolean v0, p0, Lt1/e;->f:Z

    .line 12
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_3

    .line 13
    invoke-virtual {p1}, Lt1/d;->b()V

    const/4 v1, 0x1

    .line 14
    :cond_3
    iget-object v7, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v7

    :try_start_1
    const-string v2, "[%s] did on idle post a message? %s"

    new-array v6, v6, [Ljava/lang/Object;

    const-string v8, "priority_mq"

    aput-object v8, v6, v0

    .line 15
    iget-boolean v8, p0, Lt1/e;->f:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v6, v9

    invoke-static {v2, v6}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    iget-boolean v2, p0, Lt1/e;->f:Z

    if-eqz v2, :cond_4

    .line 17
    monitor-exit v7

    goto :goto_0

    :cond_4
    if-eqz v5, :cond_5

    .line 18
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v2, v8, v3

    if-gtz v2, :cond_5

    .line 19
    monitor-exit v7

    goto :goto_0

    .line 20
    :cond_5
    iget-object v2, p0, Lt1/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_7

    if-nez v5, :cond_6

    .line 21
    :try_start_2
    iget-object v2, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v3, p0, Lt1/e;->a:Ljava/lang/Object;

    invoke-interface {v2, v3}, Lcom/birbit/android/jobqueue/timer/Timer;->waitOnObject(Ljava/lang/Object;)V

    goto :goto_3

    .line 22
    :cond_6
    iget-object v2, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v3, p0, Lt1/e;->a:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Lcom/birbit/android/jobqueue/timer/Timer;->waitOnObjectUntilNs(Ljava/lang/Object;J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    :catch_0
    :cond_7
    :goto_3
    :try_start_3
    monitor-exit v7

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 24
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :cond_8
    const/4 p1, 0x0

    return-object p1
.end method

.method public cancelMessages(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    :try_start_0
    sget v2, Lt1/g;->B:I

    if-gt v1, v2, :cond_1

    .line 3
    iget-object v2, p0, Lt1/e;->b:[Lt1/h;

    aget-object v2, v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {v2, p1}, Lt1/h;->c(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v1, p0, Lt1/e;->c:Lt1/a;

    invoke-virtual {v1, p1}, Lt1/a;->c(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V

    .line 6
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
    .locals 3

    .line 1
    iget-object v0, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget v1, Lt1/g;->B:I

    :goto_0
    if-ltz v1, :cond_1

    .line 3
    iget-object v2, p0, Lt1/e;->b:[Lt1/h;

    aget-object v2, v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {v2}, Lt1/h;->clear()V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 5
    :cond_1
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
    .locals 5

    .line 1
    iget-object v0, p0, Lt1/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    :cond_0
    :goto_0
    iget-object v0, p0, Lt1/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0, p1}, Lt1/e;->a(Lt1/d;)Lt1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "priority_mq"

    aput-object v4, v2, v3

    .line 4
    iget-object v3, v0, Lt1/b;->a:Lt1/g;

    aput-object v3, v2, v1

    const-string v3, "[%s] consuming message of type %s"

    invoke-static {v3, v2}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1, v0}, Lt1/d;->a(Lt1/b;)V

    .line 6
    iget-object v2, p0, Lt1/e;->g:Lt1/c;

    invoke-virtual {v2, v0}, Lt1/c;->b(Lt1/b;)V

    goto :goto_0

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "only 1 consumer per MQ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public post(Lt1/b;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lt1/e;->f:Z

    .line 3
    iget-object v1, p1, Lt1/b;->a:Lt1/g;

    iget v1, v1, Lt1/g;->o:I

    .line 4
    iget-object v2, p0, Lt1/e;->b:[Lt1/h;

    aget-object v3, v2, v1

    if-nez v3, :cond_0

    .line 5
    new-instance v3, Lt1/h;

    iget-object v4, p0, Lt1/e;->g:Lt1/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "queue_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p1, Lt1/b;->a:Lt1/g;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lt1/h;-><init>(Lt1/c;Ljava/lang/String;)V

    aput-object v3, v2, v1

    .line 6
    :cond_0
    iget-object v2, p0, Lt1/e;->b:[Lt1/h;

    aget-object v1, v2, v1

    invoke-virtual {v1, p1}, Lt1/h;->post(Lt1/b;)V

    .line 7
    iget-object p1, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v1, p0, Lt1/e;->a:Ljava/lang/Object;

    invoke-interface {p1, v1}, Lcom/birbit/android/jobqueue/timer/Timer;->notifyObject(Ljava/lang/Object;)V

    .line 8
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
    iget-object v0, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lt1/e;->f:Z

    .line 3
    iget-object v1, p0, Lt1/e;->c:Lt1/a;

    invoke-virtual {v1, p1, p2, p3}, Lt1/a;->a(Lt1/b;J)V

    .line 4
    iget-object p1, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object p2, p0, Lt1/e;->a:Ljava/lang/Object;

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
    iget-object v0, p0, Lt1/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 2
    iget-object v0, p0, Lt1/e;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lt1/e;->d:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v2, p0, Lt1/e;->a:Ljava/lang/Object;

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
