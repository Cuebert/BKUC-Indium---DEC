.class public Lbacktraceio/library/models/BacktraceResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private backtraceReport:Lbacktraceio/library/models/json/BacktraceReport;

.field public message:Ljava/lang/String;

.field public rxId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "_rxid"
    .end annotation
.end field

.field public status:Lbacktraceio/library/models/types/BacktraceResultStatus;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    return-void
.end method

.method public constructor <init>(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/String;Lbacktraceio/library/models/types/BacktraceResultStatus;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    .line 5
    invoke-virtual {p0, p1}, Lbacktraceio/library/models/BacktraceResult;->setBacktraceReport(Lbacktraceio/library/models/json/BacktraceReport;)V

    .line 6
    iput-object p2, p0, Lbacktraceio/library/models/BacktraceResult;->message:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lbacktraceio/library/models/BacktraceResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    return-void
.end method

.method public static OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;
    .locals 2

    .line 1
    new-instance v0, Lbacktraceio/library/models/BacktraceResult;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lbacktraceio/library/models/types/BacktraceResultStatus;->ServerError:Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-direct {v0, p0, p1, v1}, Lbacktraceio/library/models/BacktraceResult;-><init>(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/String;Lbacktraceio/library/models/types/BacktraceResultStatus;)V

    return-object v0
.end method


# virtual methods
.method public getBacktraceReport()Lbacktraceio/library/models/json/BacktraceReport;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceResult;->backtraceReport:Lbacktraceio/library/models/json/BacktraceReport;

    return-object v0
.end method

.method public setBacktraceReport(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceResult;->backtraceReport:Lbacktraceio/library/models/json/BacktraceReport;

    return-void
.end method
