.class public Lbacktraceio/library/services/BacktraceDatabaseContext;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/DatabaseContext;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceDatabaseContext"


# instance fields
.field private final _applicationContext:Landroid/content/Context;

.field private final _path:Ljava/lang/String;

.field private final _retryNumber:I

.field private final batchRetry:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;>;"
        }
    .end annotation
.end field

.field private final retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

.field private totalRecords:I

.field private totalSize:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryLimit()I

    move-result v1

    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryOrder()Lbacktraceio/library/enums/database/RetryOrder;

    move-result-object p2

    invoke-direct {p0, p1, v0, v1, p2}, Lbacktraceio/library/services/BacktraceDatabaseContext;-><init>(Landroid/content/Context;Ljava/lang/String;ILbacktraceio/library/enums/database/RetryOrder;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;ILbacktraceio/library/enums/database/RetryOrder;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    .line 6
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_applicationContext:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_path:Ljava/lang/String;

    .line 8
    iput p3, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    .line 9
    iput-object p4, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    .line 10
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->SetupBatch()V

    return-void
.end method

.method private SetupBatch()V
    .locals 4

    .line 1
    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Retry number must be greater than 0!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getFirstRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getRecordFromCache(Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0
.end method

.method private getLastRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getRecordFromCache(Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0
.end method

.method private getRecordFromCache(Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 5

    .line 1
    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_3

    .line 2
    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 3
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 4
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    .line 5
    iget-boolean v4, v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    if-nez v4, :cond_1

    .line 6
    iput-boolean v1, v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    return-object v3

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private incrementBatches()V
    .locals 5

    .line 1
    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    add-int/lit8 v0, v0, -0x2

    :goto_0
    if-ltz v0, :cond_0

    .line 2
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 3
    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private removeMaxRetries()V
    .locals 6

    .line 1
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    iget v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    .line 3
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->valid()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    .line 5
    iget v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    .line 6
    iget-wide v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getSize()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public add(Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 1
    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Adding new record to database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_path:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;-><init>(Lbacktraceio/library/models/BacktraceData;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->save()Z

    .line 4
    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->add(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "BacktraceData is null"

    .line 5
    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "BacktraceData"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public add(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 5

    .line 7
    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Adding new record to database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    .line 9
    iget-wide v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    invoke-virtual {p1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getSize()J

    move-result-wide v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    .line 10
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    add-int/2addr v1, v0

    iput v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    return-object p1

    :cond_0
    const-string p1, "Backtrace database record is null"

    .line 12
    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "BacktraceDatabaseRecord"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public clear()V
    .locals 3

    .line 1
    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Deleting all records from database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    .line 5
    invoke-virtual {v2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    .line 8
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 9
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public contains(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z
    .locals 4

    const-string v0, "BacktraceDatabaseRecord"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v2, :cond_1

    .line 5
    iget-object v2, v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    iget-object v3, p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    if-ne v2, v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public count()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    return v0
.end method

.method public delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 2
    iget-object v3, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v4, :cond_2

    .line 3
    iget-object v5, p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    iget-object v6, v4, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    if-eq v5, v6, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    invoke-virtual {v4}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    .line 5
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 6
    iget p1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    iput p1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    .line 7
    iget-wide v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    invoke-virtual {v4}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getSize()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    :cond_4
    return v0
.end method

.method public first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2

    .line 1
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    sget-object v1, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getFirstRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getLastRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public get()Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getDatabaseSize()J
    .locals 2

    iget-wide v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:J

    return-wide v0
.end method

.method public incrementBatchRetry()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->removeMaxRetries()V

    .line 2
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->incrementBatches()V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public last()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    sget-object v1, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getLastRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getFirstRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public removeOldestRecord()Z
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Removing oldest record from database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "Oldest record in database is null"

    .line 3
    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    .line 4
    :cond_0
    invoke-virtual {p0, v1}, Lbacktraceio/library/services/BacktraceDatabaseContext;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z

    move-result v0

    return v0
.end method
