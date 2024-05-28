.class public Lcom/roblox/universalapp/messagebus/MessageBus;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static b:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/messagebus/MessageBus;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-static {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;->j(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodResponseTelemetryData(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private static d(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private native doSubscribeProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method private native doSubscribeProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method private native doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method public static e()Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/universalapp/messagebus/MessageBus;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-direct {v0}, Lcom/roblox/universalapp/messagebus/MessageBus;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/messagebus/MessageBus;->b:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 3
    :cond_0
    sget-object v0, Lcom/roblox/universalapp/messagebus/MessageBus;->b:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-object v0
.end method

.method private static f(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$a;

    invoke-direct {v0, p0}, Lcom/roblox/universalapp/messagebus/MessageBus$a;-><init>(Lcom/roblox/universalapp/messagebus/Callback;)V

    return-object v0
.end method

.method private g(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/a;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$b;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus$b;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lcom/roblox/universalapp/messagebus/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static native getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static j(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static k(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private native makeRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;)V
.end method

.method private native reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private native reportProtocolMethodResponseTelemetryData(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
.end method

.method private native setRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V
.end method


# virtual methods
.method public native getLastRaw(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public h(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->j(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishRaw(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const-string v1, "Publish response for protocol: %s, method: %s."

    .line 1
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessageBus"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->j(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static {p5}, Lcom/roblox/universalapp/messagebus/MessageBus;->k(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p4

    .line 4
    invoke-virtual/range {v2 .. v7}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->g(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/a;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V

    return-void
.end method

.method public m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->n(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->f(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->f(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public native publishProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public native publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public native publishRaw(Ljava/lang/String;Ljava/lang/String;)V
.end method
