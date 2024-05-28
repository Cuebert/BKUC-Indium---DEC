.class public Lbacktraceio/library/watchdog/BacktraceWatchdog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceWatchdog"


# instance fields
.field private final backtraceClient:Lm1/a;

.field private onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

.field private final sendException:Z

.field private final threadsIdWatcher:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Thread;",
            "Lbacktraceio/library/watchdog/BacktraceThreadWatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm1/a;)V
    .locals 1

    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/watchdog/BacktraceWatchdog;-><init>(Lm1/a;Z)V

    return-void
.end method

.method public constructor <init>(Lm1/a;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    .line 3
    iput-boolean p2, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->sendException:Z

    .line 4
    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->backtraceClient:Lm1/a;

    return-void
.end method


# virtual methods
.method public activateWatcher(Ljava/lang/Thread;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setActive(Z)V

    return-void
.end method

.method public checkIsAnyThreadIsBlocked()Z
    .locals 14

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 3
    sget-object v3, Lbacktraceio/library/watchdog/BacktraceWatchdog;->LOG_TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Checking watchdog. Timestamp: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v3, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 5
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Thread;

    .line 6
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-eqz v6, :cond_0

    if-eqz v4, :cond_0

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    if-ne v6, v7, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Thread;->isAlive()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->isActive()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getCounter()I

    move-result v7

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getPrivateCounter()I

    move-result v8

    if-eq v7, v8, :cond_3

    .line 10
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getCounter()I

    move-result v5

    invoke-virtual {v4, v5}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setPrivateCounter(I)V

    .line 11
    invoke-virtual {v4, v0, v1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setLastTimestamp(J)V

    goto :goto_0

    .line 12
    :cond_3
    sget-object v7, Lbacktraceio/library/watchdog/BacktraceWatchdog;->LOG_TAG:Ljava/lang/String;

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    .line 13
    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v8, v5

    invoke-virtual {v6}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x1

    aput-object v5, v8, v9

    const/4 v5, 0x2

    aput-object v2, v8, v5

    const-string v5, "Thread %d %s  might be hung, timestamp: %s"

    .line 14
    invoke-static {v5, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getLastTimestamp()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v5, v10, v12

    if-nez v5, :cond_4

    .line 16
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getTimeout()I

    move-result v4

    int-to-long v4, v4

    goto :goto_1

    .line 17
    :cond_4
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getTimeout()I

    move-result v5

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getDelay()I

    move-result v4

    add-int/2addr v5, v4

    int-to-long v4, v5

    :goto_1
    sub-long v10, v0, v10

    cmp-long v8, v10, v4

    if-lez v8, :cond_0

    .line 18
    iget-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->sendException:Z

    if-eqz v0, :cond_5

    .line 19
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->backtraceClient:Lm1/a;

    iget-object v1, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    invoke-static {v0, v6, v1, v7}, Lbacktraceio/library/watchdog/BacktraceWatchdogShared;->sendReportCauseBlockedThread(Lm1/a;Ljava/lang/Thread;Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Ljava/lang/String;)V

    :cond_5
    return v9

    :cond_6
    return v5
.end method

.method public deactivateWatcher(Ljava/lang/Thread;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setActive(Z)V

    return-void
.end method

.method public registerThread(Ljava/lang/Thread;II)V
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    new-instance v1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    invoke-direct {v1, p2, p3}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;-><init>(II)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    return-void
.end method

.method public tick(Ljava/lang/Thread;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-nez p1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->tickCounter()V

    return-void
.end method

.method public unRegisterThread(Ljava/lang/Thread;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
