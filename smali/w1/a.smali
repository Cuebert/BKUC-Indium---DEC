.class public Lw1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/timer/Timer;


# instance fields
.field final a:J

.field final b:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "creating system timer"

    .line 2
    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lw1/a;->a:J

    .line 4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lw1/a;->b:J

    return-void
.end method


# virtual methods
.method public nanoTime()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lw1/a;->b:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lw1/a;->a:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public notifyObject(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method

.method public waitOnObject(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->wait()V

    return-void
.end method

.method public waitOnObjectUntilNs(Ljava/lang/Object;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lw1/a;->nanoTime()J

    move-result-wide v0

    cmp-long v2, v0, p2

    if-lez v2, :cond_0

    const-wide/16 p2, 0x1

    .line 2
    invoke-virtual {p1, p2, p3}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    .line 3
    :cond_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    sub-long/2addr p2, v0

    invoke-virtual {v2, p1, p2, p3}, Ljava/util/concurrent/TimeUnit;->timedWait(Ljava/lang/Object;J)V

    :goto_0
    return-void
.end method
