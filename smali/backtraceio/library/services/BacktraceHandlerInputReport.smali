.class public Lbacktraceio/library/services/BacktraceHandlerInputReport;
.super Lbacktraceio/library/services/BacktraceHandlerInput;
.source "SourceFile"


# instance fields
.field public data:Lbacktraceio/library/models/BacktraceData;

.field requestHandler:Lbacktraceio/library/events/RequestHandler;

.field serverResponseEventListener:Lbacktraceio/library/events/OnServerResponseEventListener;


# direct methods
.method constructor <init>(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;Lbacktraceio/library/events/OnServerErrorEventListener;Lbacktraceio/library/events/RequestHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lbacktraceio/library/services/BacktraceHandlerInput;-><init>(Lbacktraceio/library/events/OnServerErrorEventListener;)V

    .line 2
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceHandlerInputReport;->data:Lbacktraceio/library/models/BacktraceData;

    .line 3
    iput-object p2, p0, Lbacktraceio/library/services/BacktraceHandlerInputReport;->serverResponseEventListener:Lbacktraceio/library/events/OnServerResponseEventListener;

    .line 4
    iput-object p4, p0, Lbacktraceio/library/services/BacktraceHandlerInputReport;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    return-void
.end method
