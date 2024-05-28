.class public Lbacktraceio/library/models/BacktraceStackTrace;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceStackTrace"


# instance fields
.field private final exception:Ljava/lang/Exception;

.field private final stackFrames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceStackTrace;->stackFrames:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Lbacktraceio/library/models/BacktraceStackTrace;->exception:Ljava/lang/Exception;

    .line 4
    invoke-direct {p0}, Lbacktraceio/library/models/BacktraceStackTrace;->initialize()V

    return-void
.end method

.method private initialize()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/BacktraceStackTrace;->exception:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 3
    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-direct {p0, v0}, Lbacktraceio/library/models/BacktraceStackTrace;->setStacktraceInformation([Ljava/lang/StackTraceElement;)V

    return-void

    .line 5
    :cond_2
    :goto_1
    sget-object v0, Lbacktraceio/library/models/BacktraceStackTrace;->LOG_TAG:Ljava/lang/String;

    const-string v1, "StackTraceElements are null or empty"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private setStacktraceInformation([Ljava/lang/StackTraceElement;)V
    .locals 5

    if-eqz p1, :cond_3

    .line 1
    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    if-eqz v2, :cond_1

    .line 3
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Backtrace"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    sget-object v2, Lbacktraceio/library/models/BacktraceStackTrace;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Skipping frame because it comes from inside the Backtrace library"

    invoke-static {v2, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 6
    :cond_1
    new-instance v3, Lbacktraceio/library/models/BacktraceStackFrame;

    invoke-direct {v3, v2}, Lbacktraceio/library/models/BacktraceStackFrame;-><init>(Ljava/lang/StackTraceElement;)V

    .line 7
    iget-object v2, p0, Lbacktraceio/library/models/BacktraceStackTrace;->stackFrames:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 8
    :cond_3
    :goto_2
    sget-object p1, Lbacktraceio/library/models/BacktraceStackTrace;->LOG_TAG:Ljava/lang/String;

    const-string v0, "StackTraceFrames are null or empty"

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public getException()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceStackTrace;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getStackFrames()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceStackTrace;->stackFrames:Ljava/util/ArrayList;

    return-object v0
.end method
