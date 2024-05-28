.class Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbacktraceio/library/services/BacktraceHandlerThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BacktraceHandler"
.end annotation


# instance fields
.field private final transient LOG_TAG:Ljava/lang/String;

.field final synthetic this$0:Lbacktraceio/library/services/BacktraceHandlerThread;

.field url:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lbacktraceio/library/services/BacktraceHandlerThread;Landroid/os/Looper;Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->this$0:Lbacktraceio/library/services/BacktraceHandlerThread;

    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    const-class p1, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->LOG_TAG:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->url:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lbacktraceio/library/services/BacktraceHandlerThread;Landroid/os/Looper;Ljava/lang/String;Lbacktraceio/library/services/BacktraceHandlerThread$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;-><init>(Lbacktraceio/library/services/BacktraceHandlerThread;Landroid/os/Looper;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;

    .line 2
    iget-object v0, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Sending using custom request handler"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v0, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    iget-object v1, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->data:Lbacktraceio/library/models/BacktraceData;

    invoke-interface {v0, v1}, Lbacktraceio/library/events/RequestHandler;->onRequest(Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Sending report using default request handler"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->data:Lbacktraceio/library/models/BacktraceData;

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceSerializeHelper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 7
    iget-object v1, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->data:Lbacktraceio/library/models/BacktraceData;

    invoke-virtual {v1}, Lbacktraceio/library/models/BacktraceData;->getAttachments()Ljava/util/List;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->url:Ljava/lang/String;

    iget-object v3, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->data:Lbacktraceio/library/models/BacktraceData;

    iget-object v3, v3, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    iget-object v4, p1, Lbacktraceio/library/services/BacktraceHandlerInput;->serverErrorEventListener:Lbacktraceio/library/events/OnServerErrorEventListener;

    invoke-static {v2, v0, v1, v3, v4}, Lbacktraceio/library/services/BacktraceReportSender;->sendReport(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerErrorEventListener;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object v0

    .line 9
    :goto_0
    iget-object v1, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->serverResponseEventListener:Lbacktraceio/library/events/OnServerResponseEventListener;

    if-eqz v1, :cond_1

    .line 10
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Processing result using custom event"

    invoke-static {v1, v2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iget-object p1, p1, Lbacktraceio/library/services/BacktraceHandlerInputReport;->serverResponseEventListener:Lbacktraceio/library/events/OnServerResponseEventListener;

    invoke-interface {p1, v0}, Lbacktraceio/library/events/OnServerResponseEventListener;->onEvent(Lbacktraceio/library/models/BacktraceResult;)V

    :cond_1
    return-void
.end method
