.class Lbacktraceio/library/watchdog/BacktraceWatchdogShared;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static sendReportCauseBlockedThread(Lm1/a;Ljava/lang/Thread;Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;

    invoke-direct {v0}, Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    const-string p1, "Blocked thread detected, sending a report"

    .line 3
    invoke-static {p3, p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    if-eqz p2, :cond_0

    .line 4
    invoke-interface {p2, v0}, Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;->onEvent(Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;)V

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 5
    invoke-virtual {p0, v0}, Lm1/a;->c(Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    return-void
.end method
