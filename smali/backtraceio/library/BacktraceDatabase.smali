.class public Lbacktraceio/library/BacktraceDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/Database;


# static fields
.field private static k:Z

.field private static l:Ljava/util/Timer;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final transient c:Ljava/lang/String;

.field private d:Lbacktraceio/library/interfaces/Api;

.field private e:Landroid/content/Context;

.field private f:Lbacktraceio/library/interfaces/DatabaseContext;

.field private g:Lbacktraceio/library/interfaces/DatabaseFileContext;

.field private h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

.field private i:Z

.field private j:Lbacktraceio/library/interfaces/Breadcrumbs;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "/libcrashpad_handler.so"

    .line 2
    iput-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->a:Ljava/lang/String;

    const-string v0, "/crashpad"

    .line 3
    iput-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->b:Ljava/lang/String;

    .line 4
    const-class v0, Lbacktraceio/library/BacktraceDatabase;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->c:Ljava/lang/String;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lbacktraceio/library/BacktraceDatabase;->i:Z

    const-string v1, "Disabled instance of BacktraceDatabase created, native crashes won\'t be captured"

    .line 6
    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "/libcrashpad_handler.so"

    .line 8
    iput-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->a:Ljava/lang/String;

    const-string v0, "/crashpad"

    .line 9
    iput-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->b:Ljava/lang/String;

    .line 10
    const-class v0, Lbacktraceio/library/BacktraceDatabase;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->c:Ljava/lang/String;

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lbacktraceio/library/BacktraceDatabase;->i:Z

    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    .line 12
    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 14
    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbacktraceio/library/common/FileHelper;->isFileExists(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 15
    new-instance v0, Ljava/io/File;

    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbacktraceio/library/common/FileHelper;->isFileExists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Incorrect database path or application doesn\'t have permission to write to this path"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    :goto_0
    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    .line 19
    iput-object p2, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 20
    new-instance p1, Lbacktraceio/library/services/BacktraceDatabaseContext;

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    invoke-direct {p1, v0, p2}, Lbacktraceio/library/services/BacktraceDatabaseContext;-><init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V

    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    .line 21
    new-instance p1, Lbacktraceio/library/services/BacktraceDatabaseFileContext;

    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->j()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 22
    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxDatabaseSize()J

    move-result-wide v0

    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 23
    invoke-virtual {v2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxRecordCount()I

    move-result v2

    invoke-direct {p1, p2, v0, v1, v2}, Lbacktraceio/library/services/BacktraceDatabaseFileContext;-><init>(Ljava/lang/String;JI)V

    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase;->g:Lbacktraceio/library/interfaces/DatabaseFileContext;

    .line 24
    new-instance p1, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbs;

    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->j()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbs;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase;->j:Lbacktraceio/library/interfaces/Breadcrumbs;

    return-void

    .line 25
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Database path is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Database settings or application context is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/BacktraceDatabase;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/DatabaseContext;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    return-object p0
.end method

.method static synthetic c()Z
    .locals 1

    sget-boolean v0, Lbacktraceio/library/BacktraceDatabase;->k:Z

    return v0
.end method

.method static synthetic d(Z)Z
    .locals 0

    sput-boolean p0, Lbacktraceio/library/BacktraceDatabase;->k:Z

    return p0
.end method

.method private native disable()V
.end method

.method static synthetic e()Ljava/util/Timer;
    .locals 1

    sget-object v0, Lbacktraceio/library/BacktraceDatabase;->l:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic f(Ljava/util/Timer;)Ljava/util/Timer;
    .locals 0

    sput-object p0, Lbacktraceio/library/BacktraceDatabase;->l:Ljava/util/Timer;

    return-object p0
.end method

.method static synthetic g(Lbacktraceio/library/BacktraceDatabase;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic h(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/Api;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/BacktraceDatabase;->d:Lbacktraceio/library/interfaces/Api;

    return-object p0
.end method

.method static synthetic i(Lbacktraceio/library/BacktraceDatabase;)V
    .locals 0

    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->m()V

    return-void
.end method

.method private native initialize(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLbacktraceio/library/enums/UnwindingMode;)Z
.end method

.method private j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->g:Lbacktraceio/library/interfaces/DatabaseFileContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseFileContext;->getRecords()Ljava/lang/Iterable;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .line 3
    invoke-static {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->readFromFile(Ljava/io/File;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->valid()Z

    move-result v2

    if-nez v2, :cond_0

    .line 5
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v2, v1}, Lbacktraceio/library/interfaces/DatabaseContext;->add(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    .line 7
    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->n()Z

    .line 8
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->close()Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->get()Ljava/lang/Iterable;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase;->g:Lbacktraceio/library/interfaces/DatabaseFileContext;

    invoke-interface {v1, v0}, Lbacktraceio/library/interfaces/DatabaseFileContext;->removeOrphaned(Ljava/lang/Iterable;)V

    return-void
.end method

.method private m()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lbacktraceio/library/BacktraceDatabase;->l:Ljava/util/Timer;

    .line 2
    new-instance v1, Lbacktraceio/library/BacktraceDatabase$a;

    invoke-direct {v1, p0}, Lbacktraceio/library/BacktraceDatabase$a;-><init>(Lbacktraceio/library/BacktraceDatabase;)V

    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 3
    invoke-virtual {v2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryInterval()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    iget-object v4, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    invoke-virtual {v4}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryInterval()I

    move-result v4

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    .line 4
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method private n()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->count()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    invoke-virtual {v2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxRecordCount()I

    move-result v2

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 2
    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxRecordCount()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->removeOldestRecord()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->c:Ljava/lang/String;

    const-string v1, "Can\'t remove last record. Database size is invalid"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    .line 5
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxDatabaseSize()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    .line 6
    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->getDatabaseSize()J

    move-result-wide v4

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxDatabaseSize()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    const/4 v0, 0x5

    .line 7
    :cond_1
    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v2}, Lbacktraceio/library/interfaces/DatabaseContext;->getDatabaseSize()J

    move-result-wide v4

    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 8
    invoke-virtual {v2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getMaxDatabaseSize()J

    move-result-wide v6

    cmp-long v2, v4, v6

    if-lez v2, :cond_2

    .line 9
    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v2}, Lbacktraceio/library/interfaces/DatabaseContext;->removeOldestRecord()Z

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_1

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_0
    return v1
.end method


# virtual methods
.method public add(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lbacktraceio/library/BacktraceDatabase;->add(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object p1

    return-object p1
.end method

.method public add(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;"
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lbacktraceio/library/BacktraceDatabase;->i:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->n()Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    .line 4
    :cond_1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    invoke-virtual {p1, v0, p2, p3}, Lbacktraceio/library/models/json/BacktraceReport;->toBacktraceData(Landroid/content/Context;Ljava/util/Map;Z)Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    .line 5
    iget-object p2, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {p2, p1}, Lbacktraceio/library/interfaces/DatabaseContext;->add(Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->clear()V

    .line 3
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->g:Lbacktraceio/library/interfaces/DatabaseFileContext;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseFileContext;->clear()V

    :cond_1
    return-void
.end method

.method public delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/DatabaseContext;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z

    return-void
.end method

.method public disableNativeIntegration()V
    .locals 0

    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->disable()V

    return-void
.end method

.method public flush()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->d:Lbacktraceio/library/interfaces/Api;

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getBacktraceData(Landroid/content/Context;)Lbacktraceio/library/models/BacktraceData;

    move-result-object v1

    .line 4
    invoke-virtual {p0, v0}, Lbacktraceio/library/BacktraceDatabase;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V

    if-eqz v1, :cond_0

    .line 5
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->d:Lbacktraceio/library/interfaces/Api;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lbacktraceio/library/interfaces/Api;->send(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "BacktraceApi is required if you want to use Flush method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public get()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->get()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->j:Lbacktraceio/library/interfaces/Breadcrumbs;

    return-object v0
.end method

.method public getDatabaseSize()J
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->getDatabaseSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public getSettings()Lbacktraceio/library/models/database/BacktraceDatabaseSettings;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    return-object v0
.end method

.method public setApi(Lbacktraceio/library/interfaces/Api;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase;->d:Lbacktraceio/library/interfaces/Api;

    return-void
.end method

.method public setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;)Ljava/lang/Boolean;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lbacktraceio/library/BacktraceDatabase;->setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;Z)Ljava/lang/Boolean;
    .locals 1

    .line 2
    sget-object v0, Lbacktraceio/library/enums/UnwindingMode;->REMOTE_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;

    invoke-virtual {p0, p1, p2, p3, v0}, Lbacktraceio/library/BacktraceDatabase;->setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;ZLbacktraceio/library/enums/UnwindingMode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;ZLbacktraceio/library/enums/UnwindingMode;)Ljava/lang/Boolean;
    .locals 9

    .line 3
    invoke-virtual {p0}, Lbacktraceio/library/BacktraceDatabase;->getSettings()Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p2}, Lm1/b;->c()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 7
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/libcrashpad_handler.so"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 8
    new-instance p2, Lbacktraceio/library/models/json/BacktraceAttributes;

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->e:Landroid/content/Context;

    const/4 v2, 0x0

    iget-object v4, p1, Lbacktraceio/library/base/BacktraceBase;->attributes:Ljava/util/Map;

    invoke-direct {p2, v0, v2, v4}, Lbacktraceio/library/models/json/BacktraceAttributes;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V

    .line 9
    iget-object v0, p2, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x0

    new-array v4, v2, [Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Ljava/lang/String;

    .line 10
    iget-object p2, p2, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    new-array v0, v2, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Ljava/lang/String;

    .line 11
    iget-object p2, p1, Lbacktraceio/library/base/BacktraceBase;->attachments:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    new-array v6, p2, [Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lbacktraceio/library/base/BacktraceBase;->attachments:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 13
    :goto_0
    iget-object v0, p1, Lbacktraceio/library/base/BacktraceBase;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 14
    iget-object v0, p1, Lbacktraceio/library/base/BacktraceBase;->attachments:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 p2, p2, -0x1

    .line 15
    iget-object p1, p0, Lbacktraceio/library/BacktraceDatabase;->j:Lbacktraceio/library/interfaces/Breadcrumbs;

    invoke-interface {p1}, Lbacktraceio/library/interfaces/Breadcrumbs;->getBreadcrumbLogPath()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v6, p2

    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lbacktraceio/library/BacktraceDatabase;->getSettings()Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    move-result-object p2

    invoke-virtual {p2}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/crashpad"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 17
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Ljava/io/File;->mkdir()Z

    move-object v0, p0

    move v7, p3

    move-object v8, p4

    .line 19
    invoke-direct/range {v0 .. v8}, Lbacktraceio/library/BacktraceDatabase;->initialize(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLbacktraceio/library/enums/UnwindingMode;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public start()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->f:Lbacktraceio/library/interfaces/DatabaseContext;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseContext;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iput-boolean v1, p0, Lbacktraceio/library/BacktraceDatabase;->i:Z

    return-void

    .line 4
    :cond_1
    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->k()V

    .line 5
    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->l()V

    .line 6
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryBehavior()Lbacktraceio/library/enums/database/RetryBehavior;

    move-result-object v0

    sget-object v2, Lbacktraceio/library/enums/database/RetryBehavior;->ByInterval:Lbacktraceio/library/enums/database/RetryBehavior;

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->h:Lbacktraceio/library/models/database/BacktraceDatabaseSettings;

    .line 7
    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->isAutoSendMode()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    :cond_2
    invoke-direct {p0}, Lbacktraceio/library/BacktraceDatabase;->m()V

    .line 9
    :cond_3
    iput-boolean v1, p0, Lbacktraceio/library/BacktraceDatabase;->i:Z

    return-void
.end method

.method public validConsistency()Z
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase;->g:Lbacktraceio/library/interfaces/DatabaseFileContext;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/DatabaseFileContext;->validFileConsistency()Z

    move-result v0

    return v0
.end method
