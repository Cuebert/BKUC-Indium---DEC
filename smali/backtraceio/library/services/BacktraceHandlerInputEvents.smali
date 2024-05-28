.class public Lbacktraceio/library/services/BacktraceHandlerInputEvents;
.super Lbacktraceio/library/services/BacktraceHandlerInput;
.source "SourceFile"


# instance fields
.field public eventsOnServerResponseEventListener:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

.field public eventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

.field public payload:Lbacktraceio/library/models/metrics/EventsPayload;


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/metrics/EventsPayload;Lbacktraceio/library/events/EventsOnServerResponseEventListener;Lbacktraceio/library/events/OnServerErrorEventListener;Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lbacktraceio/library/services/BacktraceHandlerInput;-><init>(Lbacktraceio/library/events/OnServerErrorEventListener;)V

    .line 2
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceHandlerInputEvents;->payload:Lbacktraceio/library/models/metrics/EventsPayload;

    .line 3
    iput-object p2, p0, Lbacktraceio/library/services/BacktraceHandlerInputEvents;->eventsOnServerResponseEventListener:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    .line 4
    iput-object p4, p0, Lbacktraceio/library/services/BacktraceHandlerInputEvents;->eventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    return-void
.end method
