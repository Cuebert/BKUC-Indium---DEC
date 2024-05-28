.class public Lm1/a;
.super Lbacktraceio/library/base/BacktraceBase;
.source "SourceFile"


# instance fields
.field private a:Lbacktraceio/library/watchdog/BacktraceANRWatchdog;


# direct methods
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

    .line 2
    invoke-direct/range {v0 .. v5}, Lm1/a;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
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

    .line 3
    invoke-direct/range {p0 .. p5}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

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

    .line 1
    invoke-direct {p0, p1, p2, v0, p3}, Lm1/a;-><init>(Landroid/content/Context;Lm1/b;Lbacktraceio/library/interfaces/Database;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lm1/a;->b(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V

    return-void
.end method

.method public b(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V
    .locals 1

    .line 1
    new-instance v0, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;

    invoke-direct {v0, p0, p1, p3}, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;-><init>(Lm1/a;IZ)V

    iput-object v0, p0, Lm1/a;->a:Lbacktraceio/library/watchdog/BacktraceANRWatchdog;

    .line 2
    invoke-virtual {v0, p2}, Lbacktraceio/library/watchdog/BacktraceANRWatchdog;->setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V

    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lm1/a;->d(Ljava/lang/Exception;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 1

    new-instance v0, Lbacktraceio/library/models/json/BacktraceReport;

    invoke-direct {v0, p1}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Exception;)V

    invoke-super {p0, v0, p2}, Lbacktraceio/library/base/BacktraceBase;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public send(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lm1/a;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lbacktraceio/library/base/BacktraceBase;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method
