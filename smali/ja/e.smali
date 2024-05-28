.class public Lja/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja/e$d;
    }
.end annotation


# instance fields
.field private a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/activity/result/b<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Lcom/roblox/universalapp/messagebus/Connection;

.field private e:Lcom/roblox/universalapp/messagebus/Connection;

.field private f:Lcom/roblox/universalapp/messagebus/Connection;

.field private g:Lcom/roblox/universalapp/messagebus/Connection;


# direct methods
.method private constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    new-instance v0, Lja/b;

    invoke-direct {v0, p0}, Lja/b;-><init>(Lja/e;)V

    const-string v1, "IdentityProtocol"

    const-string v2, "getSMSOTP"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lja/e;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 5
    new-instance v0, Lja/a;

    invoke-direct {v0, p0}, Lja/a;-><init>(Lja/e;)V

    const-string v2, "supportsGetSMSOTP"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lja/e;->e:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    new-instance v0, Lja/c;

    invoke-direct {v0, p0}, Lja/c;-><init>(Lja/e;)V

    const-string v2, "getPhoneNumber"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lja/e;->f:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    new-instance v0, Lja/d;

    invoke-direct {v0, p0}, Lja/d;-><init>(Lja/e;)V

    const-string v2, "supportsGetPhoneNumber"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lja/e;->g:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lja/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lja/e;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static synthetic a(Lja/e;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lja/e;->i(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Lja/e;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lja/e;->h(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Lja/e;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lja/e;->j(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic d(Lja/e;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lja/e;->k(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic e(Lja/e;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lja/e;->s(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic f(Lja/e;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lja/e;->r(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic h(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lja/e;->n(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic i(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lja/e;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic j(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lja/e;->m(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic k(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lja/e;->p(Lorg/json/JSONObject;)V

    return-void
.end method

.method private r(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "IdentityProtocol"

    const/16 v4, 0xd

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void
.end method

.method private s(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2
    invoke-virtual {v3, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 3
    iget-object v0, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "IdentityProtocol"

    const/4 v4, 0x0

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 4
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "JSON exception in "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "IdentityProtocol"

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object v0, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const/16 v4, 0xd

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "IdentityProtocol"

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    :goto_0
    return-void
.end method

.method public static w()Lja/e;
    .locals 1

    invoke-static {}, Lja/e$d;->a()Lja/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method g(Landroid/content/Context;Lz9/d;)V
    .locals 7

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    .line 2
    iget-object v1, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const/16 v5, 0xd

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v2, "IdentityProtocol"

    const-string v3, "getSMSOTP"

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void

    :cond_0
    const-string v0, "IdentityProtocol"

    .line 3
    invoke-virtual {p2, p1, v0}, Lz9/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "result"

    .line 2
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    iget-object v0, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "IdentityProtocol"

    const-string v2, "getSMSOTP"

    const/4 v4, 0x0

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JSON exception while handling supports get sms otp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "getSMSOTP"

    .line 5
    invoke-direct {p0, p1}, Lja/e;->r(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected m(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGetPhoneNumber: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->p0()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3
    iget-object p1, p0, Lja/e;->b:Landroid/content/Context;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lja/e;->c:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lja/e;->c:Ljava/lang/ref/WeakReference;

    .line 6
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/activity/result/b;

    .line 7
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object v0

    iget-object v1, p0, Lja/e;->b:Landroid/content/Context;

    new-instance v2, Lja/e$b;

    invoke-direct {v2, p0}, Lja/e$b;-><init>(Lja/e;)V

    invoke-virtual {v0, v1, p1, v2}, Lja/j;->m(Landroid/content/Context;Landroidx/activity/result/b;Lja/j$b;)V

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "Context or launcher is null while getting phone number!"

    .line 8
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    .line 9
    invoke-virtual {p0, p1}, Lja/e;->u(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method protected n(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGetSMSOTP: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lja/e;->b:Landroid/content/Context;

    new-instance v0, Lz9/d;

    invoke-direct {v0}, Lz9/d;-><init>()V

    invoke-virtual {p0, p1, v0}, Lja/e;->g(Landroid/content/Context;Lz9/d;)V

    return-void
.end method

.method public o(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lja/j;->e(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lja/e;->u(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected p(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSupportsGetPhoneNumber: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->p0()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lja/e;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object p1

    iget-object v0, p0, Lja/e;->b:Landroid/content/Context;

    new-instance v1, Lja/e$c;

    invoke-direct {v1, p0}, Lja/e$c;-><init>(Lja/e;)V

    invoke-virtual {p1, v0, v1}, Lja/j;->g(Landroid/content/Context;Lja/j$b;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    const-string v0, "supportsGetPhoneNumber"

    const-string v1, "support"

    .line 4
    invoke-direct {p0, v0, v1, p1}, Lja/e;->s(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method protected q(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSupportsGetSMSOTP: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->F()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lja/e;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object p1

    iget-object v0, p0, Lja/e;->b:Landroid/content/Context;

    new-instance v1, Lja/e$a;

    invoke-direct {v1, p0}, Lja/e$a;-><init>(Lja/e;)V

    invoke-virtual {p1, v0, v1}, Lja/j;->g(Landroid/content/Context;Lja/j$b;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    const-string v0, "supportsGetSMSOTP"

    const-string v1, "support"

    .line 4
    invoke-direct {p0, v0, v1, p1}, Lja/e;->s(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public t(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lja/e;->b:Landroid/content/Context;

    return-void
.end method

.method u(Ljava/lang/String;)V
    .locals 7

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "result"

    .line 3
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    iget-object v1, p0, Lja/e;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v2, "IdentityProtocol"

    const-string v3, "getPhoneNumber"

    const/4 v5, 0x0

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "IdentityProtocol"

    const-string v1, "Exception while handling get phone number request"

    .line 5
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const-string p1, "getPhoneNumber"

    .line 6
    invoke-direct {p0, p1}, Lja/e;->r(Ljava/lang/String;)V

    return-void
.end method

.method public v(Landroidx/activity/result/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/b<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lja/e;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method
