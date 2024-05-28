.class public Laa/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa/c$b;
    }
.end annotation


# instance fields
.field private a:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method private constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Laa/c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getDeviceIntegrityAvailableMethodName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Laa/b;->a:Laa/b;

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/a;)V

    .line 5
    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getGetIntegrityTokenMethodName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Laa/a;->a:Laa/a;

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Laa/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Laa/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static synthetic a(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 0

    invoke-static {p0}, Laa/c;->d(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 0

    invoke-static {p0}, Laa/c;->c(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 3

    .line 1
    new-instance p0, Lcom/roblox/universalapp/messagebus/b;

    invoke-direct {p0}, Lcom/roblox/universalapp/messagebus/b;-><init>()V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/b;->a:Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getSupportKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception while handling DeviceIntegrityAvailable request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AccountProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object p0
.end method

.method private static synthetic d(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 1

    invoke-static {}, Laa/f;->h()Laa/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Laa/f;->c(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;

    move-result-object p0

    return-object p0
.end method

.method public static e()Laa/c;
    .locals 1

    invoke-static {}, Laa/c$b;->a()Laa/c;

    move-result-object v0

    return-object v0
.end method
