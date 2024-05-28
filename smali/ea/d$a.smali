.class Lea/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lea/e$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/d;->r(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field final synthetic b:Lea/d;


# direct methods
.method constructor <init>(Lea/d;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 0

    iput-object p1, p0, Lea/d$a;->b:Lea/d;

    iput-object p2, p0, Lea/d$a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lea/d$a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v0, p0, Lea/d$a;->b:Lea/d;

    .line 2
    invoke-virtual {v0, p1}, Lea/d;->s(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "Credentials.registerCredentialsResponse"

    .line 3
    invoke-virtual {p2, v0, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lea/d$a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v1, p0, Lea/d$a;->b:Lea/d;

    .line 2
    invoke-static {v1, p1, p2}, Lea/d;->d(Lea/d;ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "Credentials.registerCredentialsResponse"

    .line 3
    invoke-virtual {v0, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
