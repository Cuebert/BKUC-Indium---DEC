.class public Loa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Loa/a;

.field private static d:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Loa/a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Realtime"

    const-string v1, "appResume"

    .line 2
    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Loa/a;->e:Ljava/lang/String;

    const-string v1, "appStop"

    .line 3
    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Loa/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Loa/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->H0()Z

    move-result p1

    const/16 v0, 0x2710

    if-eqz p1, :cond_1

    .line 4
    new-instance p1, Ljava/security/SecureRandom;

    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    .line 5
    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Loa/a;->b:I

    goto :goto_1

    .line 6
    :cond_1
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 7
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Loa/a;->b:I

    :goto_1
    return-void
.end method

.method public static c()Loa/a;
    .locals 2

    .line 1
    sget-object v0, Loa/a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Loa/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loa/a;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Loa/a;->c:Loa/a;

    .line 3
    :cond_0
    sget-object v0, Loa/a;->c:Loa/a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "RealtimeProtocol"

    const-string v1, "App Resumed"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Loa/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Loa/a;->e:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public b()V
    .locals 3

    const-string v0, "RealtimeProtocol"

    const-string v1, "App Stopped"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Loa/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Loa/a;->f:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
