.class public Lbacktraceio/library/watchdog/BacktraceThreadWatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private active:Z

.field private counter:I

.field private final delay:I

.field private lastTimestamp:J

.field private privateCounter:I

.field private final timeout:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->timeout:I

    .line 3
    iput p2, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->delay:I

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setActive(Z)V

    return-void
.end method


# virtual methods
.method declared-synchronized getCounter()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->counter:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method getDelay()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->delay:I

    return v0
.end method

.method getLastTimestamp()J
    .locals 2

    iget-wide v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->lastTimestamp:J

    return-wide v0
.end method

.method getPrivateCounter()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->privateCounter:I

    return v0
.end method

.method getTimeout()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->timeout:I

    return v0
.end method

.method declared-synchronized isActive()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->active:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized setActive(Z)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-boolean p1, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->active:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method setLastTimestamp(J)V
    .locals 0

    iput-wide p1, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->lastTimestamp:J

    return-void
.end method

.method setPrivateCounter(I)V
    .locals 0

    iput p1, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->privateCounter:I

    return-void
.end method

.method public declared-synchronized tickCounter()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->counter:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->counter:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method tickPrivateCounter()V
    .locals 1

    iget v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->privateCounter:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->privateCounter:I

    return-void
.end method
