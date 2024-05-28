.class Lia/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lia/a;->h(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lia/a;


# direct methods
.method constructor <init>(Lia/a;)V
    .locals 0

    iput-object p1, p0, Lia/a$a;->a:Lia/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lia/a$a;->a:Lia/a;

    invoke-virtual {p1}, Lia/a;->g()Z

    move-result p1

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "supportsHaptics"

    .line 3
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    iget-object p1, p0, Lia/a$a;->a:Lia/a;

    invoke-static {p1}, Lia/a;->a(Lia/a;)Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const-string v2, "HapticProtocol"

    const-string v3, "SupportsHaptics"

    const-string v6, "{}"

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :catch_0
    const-string p1, "HapticProtocol"

    const-string v0, "Failed to write supportsHaptics in response to SupportsHaptics request"

    .line 5
    invoke-static {p1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
