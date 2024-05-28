.class public final Lbacktraceio/library/services/BacktraceMetrics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/Metrics;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceMetrics"

.field public static final defaultBaseUrl:Ljava/lang/String; = "https://events.backtrace.io/api"

.field public static final defaultTimeBetweenRetriesMs:I = 0x2710

.field public static final defaultTimeIntervalInMin:I = 0x1e

.field public static final defaultTimeIntervalMs:J = 0x1b7740L

.field public static final maxNumberOfAttempts:I = 0x3

.field public static final maxTimeBetweenRetriesMs:I = 0x493e0


# instance fields
.field private final backtraceApi:Lbacktraceio/library/interfaces/Api;

.field protected context:Landroid/content/Context;

.field protected customReportAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final defaultUniqueEventName:Ljava/lang/String;

.field private maximumNumberOfEvents:I

.field private final requestHandler:Lbacktraceio/library/events/RequestHandler;

.field protected settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

.field private final startupSummedEventName:Ljava/lang/String;

.field private startupUniqueEventName:Ljava/lang/String;

.field public summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

.field public uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;Lbacktraceio/library/interfaces/Api;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/interfaces/Api;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "guid"

    .line 2
    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->defaultUniqueEventName:Ljava/lang/String;

    const-string v1, "Application Launches"

    .line 3
    iput-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupSummedEventName:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

    .line 5
    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    const/16 v0, 0x15e

    .line 6
    iput v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    .line 7
    iput-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    .line 8
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->context:Landroid/content/Context;

    .line 9
    iput-object p2, p0, Lbacktraceio/library/services/BacktraceMetrics;->customReportAttributes:Ljava/util/Map;

    .line 10
    iput-object p3, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    return-void
.end method

.method private shouldProcessEvent(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Cannot process event, attribute name is null or empty"

    invoke-static {p1, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 3
    :cond_0
    iget p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    const/4 v1, 0x1

    if-lez p1, :cond_1

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result p1

    add-int/2addr p1, v1

    iget v2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    if-le p1, v2, :cond_1

    .line 4
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot process event, reached maximum number of events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " events count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_1
    return v1
.end method

.method private startMetricsEventHandlers(Lbacktraceio/library/interfaces/Api;)V
    .locals 1

    .line 1
    invoke-interface {p1, p0}, Lbacktraceio/library/interfaces/Api;->enableUniqueEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/UniqueEventsHandler;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    .line 2
    invoke-interface {p1, p0}, Lbacktraceio/library/interfaces/Api;->enableSummedEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/SummedEventsHandler;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    return-void
.end method


# virtual methods
.method public addSummedEvent(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addSummedEvent(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public addSummedEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceMetrics;->shouldProcessEvent(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Skipping report"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p2, :cond_1

    .line 5
    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 6
    :cond_1
    new-instance p2, Lbacktraceio/library/models/metrics/SummedEvent;

    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v1

    invoke-direct {p2, p1, v1, v2, v0}, Lbacktraceio/library/models/metrics/SummedEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 7
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    iget-object p1, p1, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addLast(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result p1

    iget p2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    if-ne p1, p2, :cond_2

    .line 9
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    .line 10
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public addUniqueEvent(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addUniqueEvent(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public addUniqueEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceMetrics;->shouldProcessEvent(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Skipping report"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 4
    :cond_0
    invoke-virtual {p0, p2}, Lbacktraceio/library/services/BacktraceMetrics;->createLocalAttributes(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isObjectNotNullOrNotEmptyString(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Attribute name for Unique Event is not available in attribute scope"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 8
    :cond_1
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    iget-object v0, v0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/metrics/UniqueEvent;

    .line 9
    invoke-virtual {v2}, Lbacktraceio/library/models/metrics/UniqueEvent;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Already defined unique event with this attribute name, skipping"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 11
    :cond_3
    new-instance v0, Lbacktraceio/library/models/metrics/UniqueEvent;

    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2, p2}, Lbacktraceio/library/models/metrics/UniqueEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 12
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    iget-object p1, p1, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addLast(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result p1

    iget p2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    if-ne p1, p2, :cond_4

    .line 14
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    .line 15
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public count()I
    .locals 2

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->getUniqueEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v0

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->getSummedEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method protected createLocalAttributes(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 3
    :cond_0
    new-instance p1, Lbacktraceio/library/models/json/BacktraceAttributes;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->context:Landroid/content/Context;

    const/4 v2, 0x0

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceMetrics;->customReportAttributes:Ljava/util/Map;

    invoke-direct {p1, v1, v2, v3}, Lbacktraceio/library/models/json/BacktraceAttributes;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V

    .line 4
    invoke-virtual {p1}, Lbacktraceio/library/models/json/BacktraceAttributes;->getAllAttributes()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public enable(Lbacktraceio/library/models/BacktraceMetricsSettings;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

    .line 2
    invoke-static {}, Lbacktraceio/library/models/json/BacktraceAttributes;->enableMetrics()V

    .line 3
    :try_start_0
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceMetrics;->startMetricsEventHandlers(Lbacktraceio/library/interfaces/Api;)V

    .line 4
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->sendStartupEvent()V

    .line 5
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Metrics enabled"

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    sget-object v0, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not enable metrics, exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

    invoke-virtual {v0}, Lbacktraceio/library/models/BacktraceMetricsSettings;->getBaseUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getStartupUniqueEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    return-object v0
.end method

.method public getSummedEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/SummedEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    iget-object v0, v0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-object v0
.end method

.method public getUniqueEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/UniqueEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    iget-object v0, v0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-object v0
.end method

.method public send()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    .line 2
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    return-void
.end method

.method public sendStartupEvent()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addUniqueEvent(Ljava/lang/String;)Z

    const-string v0, "Application Launches"

    .line 2
    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addSummedEvent(Ljava/lang/String;)Z

    .line 3
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    .line 4
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    return-void
.end method

.method public setMaximumNumberOfEvents(I)V
    .locals 1

    .line 1
    iput p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    .line 2
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {v0, p1}, Lbacktraceio/library/services/UniqueEventsHandler;->setMaximumNumberOfEvents(I)V

    .line 3
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {v0, p1}, Lbacktraceio/library/services/SummedEventsHandler;->setMaximumNumberOfEvents(I)V

    return-void
.end method

.method public setStartupUniqueEventName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    return-void
.end method

.method public setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V

    return-void
.end method

.method public setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V

    return-void
.end method

.method public setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V

    return-void
.end method

.method public setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V

    return-void
.end method
