.class public abstract Lbacktraceio/library/services/BacktraceHandlerInput;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public serverErrorEventListener:Lbacktraceio/library/events/OnServerErrorEventListener;


# direct methods
.method protected constructor <init>(Lbacktraceio/library/events/OnServerErrorEventListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceHandlerInput;->serverErrorEventListener:Lbacktraceio/library/events/OnServerErrorEventListener;

    return-void
.end method
