.class public Lbacktraceio/library/services/BacktraceHandlerThread;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;
    }
.end annotation


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String;


# instance fields
.field private mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

.field private mSummedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

.field private mUniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/services/BacktraceHandlerThread;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->url:Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Landroid/os/HandlerThread;->start()V

    return-void
.end method


# virtual methods
.method createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 2
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    return-object v0
.end method

.method createSummedEventsHandler(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;)Lbacktraceio/library/services/SummedEventsHandler;
    .locals 1

    new-instance v0, Lbacktraceio/library/services/SummedEventsHandler;

    invoke-direct {v0, p1, p2, p0}, Lbacktraceio/library/services/SummedEventsHandler;-><init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mSummedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    return-object v0
.end method

.method createUniqueEventsHandler(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;)Lbacktraceio/library/services/UniqueEventsHandler;
    .locals 1

    new-instance v0, Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-direct {v0, p1, p2, p0}, Lbacktraceio/library/services/UniqueEventsHandler;-><init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mUniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    return-object v0
.end method

.method protected onLooperPrepared()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/os/HandlerThread;->onLooperPrepared()V

    .line 2
    new-instance v0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->url:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;-><init>(Lbacktraceio/library/services/BacktraceHandlerThread;Landroid/os/Looper;Ljava/lang/String;Lbacktraceio/library/services/BacktraceHandlerThread$1;)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    return-void
.end method

.method sendReport(Lbacktraceio/library/services/BacktraceHandlerInputReport;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    invoke-virtual {p0, p1}, Lbacktraceio/library/services/BacktraceHandlerThread;->createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method sendSummedEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mSummedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {p0, p1}, Lbacktraceio/library/services/BacktraceHandlerThread;->createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method sendUniqueEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mUniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {p0, p1}, Lbacktraceio/library/services/BacktraceHandlerThread;->createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
