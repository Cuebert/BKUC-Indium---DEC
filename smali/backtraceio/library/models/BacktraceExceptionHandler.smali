.class public Lbacktraceio/library/models/BacktraceExceptionHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String;

.field private static customAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final client:Lm1/a;

.field private final rootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final signal:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lbacktraceio/library/models/BacktraceExceptionHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lm1/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->signal:Ljava/util/concurrent/CountDownLatch;

    .line 3
    sget-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "BacktraceExceptionHandler initialization"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iput-object p1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->client:Lm1/a;

    .line 5
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->rootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 6
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    sget-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lbacktraceio/library/models/BacktraceExceptionHandler;)Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->rootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object p0
.end method

.method static synthetic access$200(Lbacktraceio/library/models/BacktraceExceptionHandler;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->signal:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method public static enable(Lm1/a;)V
    .locals 1

    new-instance v0, Lbacktraceio/library/models/BacktraceExceptionHandler;

    invoke-direct {v0, p0}, Lbacktraceio/library/models/BacktraceExceptionHandler;-><init>(Lm1/a;)V

    return-void
.end method

.method private getCallbackToDefaultHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)Lbacktraceio/library/events/OnServerResponseEventListener;
    .locals 1

    new-instance v0, Lbacktraceio/library/models/BacktraceExceptionHandler$1;

    invoke-direct {v0, p0, p1, p2}, Lbacktraceio/library/models/BacktraceExceptionHandler$1;-><init>(Lbacktraceio/library/models/BacktraceExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static setCustomAttributes(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sput-object p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->customAttributes:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lbacktraceio/library/models/BacktraceExceptionHandler;->getCallbackToDefaultHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)Lbacktraceio/library/events/OnServerResponseEventListener;

    move-result-object p1

    .line 2
    instance-of v0, p2, Ljava/lang/Exception;

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Sending uncaught exception to Backtrace API"

    invoke-static {v0, v1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 4
    iget-object v1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->client:Lm1/a;

    new-instance v2, Lbacktraceio/library/models/json/BacktraceReport;

    check-cast p2, Ljava/lang/Exception;

    sget-object v3, Lbacktraceio/library/models/BacktraceExceptionHandler;->customAttributes:Ljava/util/Map;

    invoke-direct {v2, p2, v3}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Exception;Ljava/util/Map;)V

    invoke-virtual {v1, v2, p1}, Lm1/a;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    const-string p1, "Uncaught exception sent to Backtrace API"

    .line 5
    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    :cond_0
    sget-object p1, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Default uncaught exception handler"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :try_start_0
    iget-object p1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->signal:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    sget-object p2, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Exception during waiting for response"

    invoke-static {p2, v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
