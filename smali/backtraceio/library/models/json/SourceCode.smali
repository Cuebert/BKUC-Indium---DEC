.class public Lbacktraceio/library/models/json/SourceCode;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public sourceCodeFileName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "path"
    .end annotation
.end field

.field public startLine:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "startLine"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/BacktraceStackFrame;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCodeFileName:Ljava/lang/String;

    iput-object v0, p0, Lbacktraceio/library/models/json/SourceCode;->sourceCodeFileName:Ljava/lang/String;

    .line 3
    iget-object p1, p1, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    iput-object p1, p0, Lbacktraceio/library/models/json/SourceCode;->startLine:Ljava/lang/Integer;

    return-void
.end method
