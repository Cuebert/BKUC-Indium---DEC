.class Lcom/roblox/universalapp/messagebus/MessageBus$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/messagebus/MessageBus;->g(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/a;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/universalapp/messagebus/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lcom/roblox/universalapp/messagebus/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->d:Lcom/roblox/universalapp/messagebus/MessageBus;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->a:Lcom/roblox/universalapp/messagebus/a;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->a:Lcom/roblox/universalapp/messagebus/a;

    invoke-interface {v0, p1}, Lcom/roblox/universalapp/messagebus/a;->a(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;

    move-result-object p1

    .line 3
    iget-object v0, p1, Lcom/roblox/universalapp/messagebus/b;->b:Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->b(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->d:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->c:Ljava/lang/String;

    iget v4, p1, Lcom/roblox/universalapp/messagebus/b;->c:I

    invoke-static {v1, v2, v3, v4, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->c(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 5
    iget-object p1, p1, Lcom/roblox/universalapp/messagebus/b;->a:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->b(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Serializing message params in getRequestHandlerRaw failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MessageBus"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    return-object p1
.end method
