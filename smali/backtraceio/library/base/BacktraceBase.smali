.class public Lbacktraceio/library/base/BacktraceBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/Client;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceBase"


# instance fields
.field public final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private backtraceApi:Lbacktraceio/library/interfaces/Api;

.field private beforeSendEventListener:Lbacktraceio/library/events/OnBeforeSendEventListener;

.field protected context:Landroid/content/Context;

.field private final credentials:Lm1/b;

.field public final database:Lbacktraceio/library/interfaces/Database;

.field private isProguardEnabled:Z

.field public metrics:Lbacktraceio/library/interfaces/Metrics;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "backtrace-native"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Lbacktraceio/library/interfaces/Database;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 10
    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Lbacktraceio/library/interfaces/Database;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Lbacktraceio/library/interfaces/Database;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->metrics:Lbacktraceio/library/interfaces/Metrics;

    .line 14
    iput-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->beforeSendEventListener:Lbacktraceio/library/events/OnBeforeSendEventListener;

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lbacktraceio/library/base/BacktraceBase;->isProguardEnabled:Z

    .line 16
    iput-object p1, p0, Lbacktraceio/library/base/BacktraceBase;->context:Landroid/content/Context;

    .line 17
    iput-object p2, p0, Lbacktraceio/library/base/BacktraceBase;->credentials:Lm1/b;

    if-eqz p4, :cond_0

    move-object v0, p4

    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_0
    iput-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->attributes:Ljava/util/Map;

    if-eqz p5, :cond_1

    goto :goto_1

    .line 19
    :cond_1
    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    iput-object p5, p0, Lbacktraceio/library/base/BacktraceBase;->attachments:Ljava/util/List;

    if-eqz p3, :cond_2

    goto :goto_2

    .line 20
    :cond_2
    new-instance p3, Lbacktraceio/library/BacktraceDatabase;

    invoke-direct {p3}, Lbacktraceio/library/BacktraceDatabase;-><init>()V

    :goto_2
    iput-object p3, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    .line 21
    new-instance p5, Lbacktraceio/library/services/BacktraceApi;

    invoke-direct {p5, p2}, Lbacktraceio/library/services/BacktraceApi;-><init>(Lm1/b;)V

    invoke-direct {p0, p5}, Lbacktraceio/library/base/BacktraceBase;->setBacktraceApi(Lbacktraceio/library/interfaces/Api;)V

    .line 22
    invoke-interface {p3}, Lbacktraceio/library/interfaces/Database;->start()V

    .line 23
    new-instance p2, Lbacktraceio/library/services/BacktraceMetrics;

    iget-object p3, p0, Lbacktraceio/library/base/BacktraceBase;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-direct {p2, p1, p4, p3}, Lbacktraceio/library/services/BacktraceMetrics;-><init>(Landroid/content/Context;Ljava/util/Map;Lbacktraceio/library/interfaces/Api;)V

    iput-object p2, p0, Lbacktraceio/library/base/BacktraceBase;->metrics:Lbacktraceio/library/interfaces/Metrics;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V
    .locals 1

    .line 5
    new-instance v0, Lbacktraceio/library/BacktraceDatabase;

    invoke-direct {v0, p1, p3}, Lbacktraceio/library/BacktraceDatabase;-><init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V

    invoke-direct {p0, p1, p2, v0}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Lbacktraceio/library/models/database/BacktraceDatabaseSettings;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 6
    new-instance v0, Lbacktraceio/library/BacktraceDatabase;

    invoke-direct {v0, p1, p3}, Lbacktraceio/library/BacktraceDatabase;-><init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V

    invoke-direct {p0, p1, p2, v0, p4}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Lbacktraceio/library/models/database/BacktraceDatabaseSettings;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 7
    new-instance v0, Lbacktraceio/library/BacktraceDatabase;

    invoke-direct {v0, p1, p3}, Lbacktraceio/library/BacktraceDatabase;-><init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V

    invoke-direct {p0, p1, p2, v0, p4}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;Ljava/util/Map;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Lbacktraceio/library/models/database/BacktraceDatabaseSettings;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 8
    new-instance v3, Lbacktraceio/library/BacktraceDatabase;

    invoke-direct {v3, p1, p3}, Lbacktraceio/library/BacktraceDatabase;-><init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0, p3}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Ljava/util/Map;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm1/b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 4
    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method private addReportAttachments(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->attachments:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    iget-object v2, p1, Lbacktraceio/library/models/json/BacktraceReport;->attachmentPaths:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getDatabaseCallback(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;Lbacktraceio/library/events/OnServerResponseEventListener;)Lbacktraceio/library/events/OnServerResponseEventListener;
    .locals 1

    new-instance v0, Lbacktraceio/library/base/BacktraceBase$1;

    invoke-direct {v0, p0, p2, p1}, Lbacktraceio/library/base/BacktraceBase$1;-><init>(Lbacktraceio/library/base/BacktraceBase;Lbacktraceio/library/events/OnServerResponseEventListener;Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V

    return-object v0
.end method

.method private setBacktraceApi(Lbacktraceio/library/interfaces/Api;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lbacktraceio/library/base/BacktraceBase;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    .line 2
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Database;->setApi(Lbacktraceio/library/interfaces/Api;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addBreadcrumb(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbType;)Z
    .locals 1

    .line 5
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbType;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .locals 1

    .line 6
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 1
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

    .line 3
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ")Z"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ")Z"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;)Z

    move-result p1

    return p1
.end method

.method public addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ")Z"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lbacktraceio/library/interfaces/Breadcrumbs;->addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z

    move-result p1

    return p1
.end method

.method public clearBreadcrumbs()Z
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Breadcrumbs;->clearBreadcrumbs()Z

    move-result v0

    return v0
.end method

.method public native crash()V
.end method

.method public disableNativeIntegration()V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->disableNativeIntegration()V

    return-void
.end method

.method public native dumpWithoutCrash(Ljava/lang/String;)V
.end method

.method public native dumpWithoutCrash(Ljava/lang/String;Z)V
.end method

.method public enableBreadcrumbs(Landroid/content/Context;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Breadcrumbs;->enableBreadcrumbs(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public enableBreadcrumbs(Landroid/content/Context;I)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lbacktraceio/library/interfaces/Breadcrumbs;->enableBreadcrumbs(Landroid/content/Context;I)Z

    move-result p1

    return p1
.end method

.method public enableBreadcrumbs(Landroid/content/Context;Ljava/util/EnumSet;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;)Z"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lbacktraceio/library/interfaces/Breadcrumbs;->enableBreadcrumbs(Landroid/content/Context;Ljava/util/EnumSet;)Z

    move-result p1

    return p1
.end method

.method public enableBreadcrumbs(Landroid/content/Context;Ljava/util/EnumSet;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;I)Z"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbacktraceio/library/interfaces/Breadcrumbs;->enableBreadcrumbs(Landroid/content/Context;Ljava/util/EnumSet;I)Z

    move-result p1

    return p1
.end method

.method public enableNativeIntegration()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase;->credentials:Lm1/b;

    invoke-interface {v0, p0, v1}, Lbacktraceio/library/interfaces/Database;->setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;)Ljava/lang/Boolean;

    return-void
.end method

.method public enableNativeIntegration(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase;->credentials:Lm1/b;

    invoke-interface {v0, p0, v1, p1}, Lbacktraceio/library/interfaces/Database;->setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;Z)Ljava/lang/Boolean;

    return-void
.end method

.method public enableNativeIntegration(ZLbacktraceio/library/enums/UnwindingMode;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase;->credentials:Lm1/b;

    invoke-interface {v0, p0, v1, p1, p2}, Lbacktraceio/library/interfaces/Database;->setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lm1/b;ZLbacktraceio/library/enums/UnwindingMode;)Ljava/lang/Boolean;

    return-void
.end method

.method public enableProguard()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbacktraceio/library/base/BacktraceBase;->isProguardEnabled:Z

    return-void
.end method

.method public getAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->attributes:Ljava/util/Map;

    return-object v0
.end method

.method public nativeCrash()V
    .locals 0

    invoke-virtual {p0}, Lbacktraceio/library/base/BacktraceBase;->crash()V

    return-void
.end method

.method public send(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lbacktraceio/library/base/BacktraceBase;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v0}, Lbacktraceio/library/interfaces/Database;->getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Breadcrumbs;->processReportBreadcrumbs(Lbacktraceio/library/models/json/BacktraceReport;)V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lbacktraceio/library/base/BacktraceBase;->addReportAttachments(Lbacktraceio/library/models/json/BacktraceReport;)V

    .line 5
    new-instance v0, Lbacktraceio/library/models/BacktraceData;

    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase;->context:Landroid/content/Context;

    iget-object v2, p0, Lbacktraceio/library/base/BacktraceBase;->attributes:Ljava/util/Map;

    invoke-direct {v0, v1, p1, v2}, Lbacktraceio/library/models/BacktraceData;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V

    .line 6
    iget-boolean v1, p0, Lbacktraceio/library/base/BacktraceBase;->isProguardEnabled:Z

    if-eqz v1, :cond_1

    const-string v2, "proguard"

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iput-object v2, v0, Lbacktraceio/library/models/BacktraceData;->symbolication:Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    iget-object v3, p0, Lbacktraceio/library/base/BacktraceBase;->attributes:Ljava/util/Map;

    invoke-interface {v2, p1, v3, v1}, Lbacktraceio/library/interfaces/Database;->add(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object p1

    .line 8
    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase;->beforeSendEventListener:Lbacktraceio/library/events/OnBeforeSendEventListener;

    if-eqz v1, :cond_2

    .line 9
    invoke-interface {v1, v0}, Lbacktraceio/library/events/OnBeforeSendEventListener;->onEvent(Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;

    move-result-object v0

    .line 10
    :cond_2
    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-direct {p0, p1, p2}, Lbacktraceio/library/base/BacktraceBase;->getDatabaseCallback(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;Lbacktraceio/library/events/OnServerResponseEventListener;)Lbacktraceio/library/events/OnServerResponseEventListener;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Lbacktraceio/library/interfaces/Api;->send(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public setOnBeforeSendEventListener(Lbacktraceio/library/events/OnBeforeSendEventListener;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/base/BacktraceBase;->beforeSendEventListener:Lbacktraceio/library/events/OnBeforeSendEventListener;

    return-void
.end method

.method public setOnRequestHandler(Lbacktraceio/library/events/RequestHandler;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setRequestHandler(Lbacktraceio/library/events/RequestHandler;)V

    return-void
.end method

.method public setOnServerErrorEventListener(Lbacktraceio/library/events/OnServerErrorEventListener;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setOnServerError(Lbacktraceio/library/events/OnServerErrorEventListener;)V

    return-void
.end method
