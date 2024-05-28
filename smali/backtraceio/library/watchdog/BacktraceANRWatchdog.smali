.class public Lbacktraceio/library/watchdog/BacktraceANRWatchdog;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field private static final transient DEFAULT_ANR_TIMEOUT:I = 0x1388

.field private static final transient LOG_TAG:Ljava/lang/String;


# instance fields
.field private final backtraceClient:Lm1/a;

.field private final debug:Z

.field private final mainThreadHandler:Landroid/os/Handler;

.field private onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

.field private volatile shouldStop:Z

.field private final timeout:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lm1/a;)V
    .locals 1

    const/16 v0, 0x1388

    .line 1
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;-><init>(Lm1/a;I)V

    return-void
.end method

.method public constructor <init>(Lm1/a;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;-><init>(Lm1/a;IZ)V

    return-void
.end method

.method public constructor <init>(Lm1/a;IZ)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->mainThreadHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->shouldStop:Z

    .line 6
    sget-object v0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Start monitoring ANR"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->backtraceClient:Lm1/a;

    .line 8
    iput p2, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->timeout:I

    .line 9
    iput-boolean p3, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->debug:Z

    .line 10
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    :goto_0
    iget-boolean v1, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->shouldStop:Z

    if-nez v1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    if-nez v1, :cond_4

    .line 3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ANR WATCHDOG - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;-><init>(II)V

    .line 6
    iget-object v3, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->mainThreadHandler:Landroid/os/Handler;

    new-instance v4, Lbacktraceio/library/watchdog/BacktraceANRWatchdog$1;

    invoke-direct {v4, p0, v1}, Lbacktraceio/library/watchdog/BacktraceANRWatchdog$1;-><init>(Lbacktraceio/library/watchdog/BacktraceANRWatchdog;Lbacktraceio/library/watchdog/BacktraceThreadWatcher;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 7
    :try_start_0
    iget v3, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->timeout:I

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    invoke-virtual {v1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->tickPrivateCounter()V

    .line 9
    invoke-virtual {v1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getCounter()I

    move-result v3

    invoke-virtual {v1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getPrivateCounter()I

    move-result v1

    if-ne v3, v1, :cond_0

    .line 10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "ANR is not detected"

    .line 11
    invoke-static {v2, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v1, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->debug:Z

    if-eqz v1, :cond_2

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "ANR detected but will be ignored because debug mode is on and connected debugger"

    .line 13
    invoke-static {v2, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 15
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    iget-object v1, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->backtraceClient:Lm1/a;

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    iget-object v4, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    .line 18
    invoke-static {v1, v3, v4, v2}, Lbacktraceio/library/watchdog/BacktraceWatchdogShared;->sendReportCauseBlockedThread(Lm1/a;Ljava/lang/Thread;Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    .line 19
    sget-object v1, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Thread is interrupted"

    invoke-static {v1, v2, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    return-void
.end method

.method public setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    return-void
.end method

.method public stopMonitoringAnr()V
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Stop monitoring ANR"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->shouldStop:Z

    return-void
.end method
