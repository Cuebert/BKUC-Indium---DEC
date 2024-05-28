.class public Lea/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea/d$c;
    }
.end annotation


# static fields
.field private static final g:Ljava/lang/String; = "d"


# instance fields
.field private final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private final b:Lcom/roblox/universalapp/messagebus/Connection;

.field private final c:Lcom/roblox/universalapp/messagebus/Connection;

.field private final d:Lcom/roblox/universalapp/messagebus/Connection;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lea/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lea/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    new-instance v0, Lea/e;

    invoke-direct {v0}, Lea/e;-><init>()V

    iput-object v0, p0, Lea/d;->f:Lea/e;

    .line 5
    new-instance v0, Lea/b;

    invoke-direct {v0, p0}, Lea/b;-><init>(Lea/d;)V

    const-string v1, "Credentials.isAvailableRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lea/d;->b:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    new-instance v0, Lea/a;

    invoke-direct {v0, p0}, Lea/a;-><init>(Lea/d;)V

    const-string v1, "Credentials.registerCredentialsRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lea/d;->c:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    new-instance v0, Lea/c;

    invoke-direct {v0, p0}, Lea/c;-><init>(Lea/d;)V

    const-string v1, "Credentials.getCredentialsRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lea/d;->d:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lea/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lea/d;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static synthetic a(Lea/d;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lea/d;->k(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Lea/d;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lea/d;->j(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Lea/d;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lea/d;->l(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic d(Lea/d;ILjava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    invoke-direct {p0, p1, p2}, Lea/d;->f(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private f(ILjava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "errorCode"

    .line 2
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string p1, "errorMsg"

    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    .line 4
    :catch_0
    sget-object p1, Lea/d;->g:Ljava/lang/String;

    const-string p2, "JSON exception when creating error response!"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method private g(ZZ)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "isAvailable"

    .line 2
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p1, "supportsDeviceBoundOnly"

    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    sget-object p2, Lea/d;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON exception on checking credentials availability: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0
.end method

.method private h(ZZZ)Lorg/json/JSONObject;
    .locals 4

    const-string v0, "supportsDeviceBoundOnly"

    const-string v1, "isAvailable"

    .line 1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 3
    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 4
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 5
    invoke-virtual {v3, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 6
    invoke-virtual {v3, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p1, "FIDO2"

    .line 7
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 9
    invoke-virtual {p1, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p2, "password"

    .line 10
    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    sget-object p2, Lea/d;->g:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "JSON exception on checking credentials availability: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v2
.end method

.method private synthetic j(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lea/d;->o(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic k(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lea/d;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic l(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lea/d;->m(Lorg/json/JSONObject;)V

    return-void
.end method

.method private m(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    sget-object v0, Lea/d;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getCredentials request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lea/d;->e:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lea/d;->f:Lea/e;

    invoke-virtual {p0, v1, v2}, Lea/d;->i(Ljava/lang/ref/WeakReference;Lea/e;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string p1, "CredentialManager not available while getting credentials."

    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lea/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, v0, v1}, Lea/d;->f(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "Credentials.getCredentialsResponse"

    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lea/d;->e:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lea/d;->f:Lea/e;

    iget-object v2, p0, Lea/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lea/d;->n(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method private o(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    sget-object v0, Lea/d;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isAvailable request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lea/d;->e:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lea/d;->f:Lea/e;

    iget-object v2, p0, Lea/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lea/d;->p(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method private q(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    sget-object v0, Lea/d;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerCredentials request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lea/d;->e:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lea/d;->f:Lea/e;

    invoke-virtual {p0, v1, v2}, Lea/d;->i(Ljava/lang/ref/WeakReference;Lea/e;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string p1, "CredentialManager not available while registering credentials."

    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lea/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, v0, v1}, Lea/d;->f(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "Credentials.registerCredentialsResponse"

    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lea/d;->e:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lea/d;->f:Lea/e;

    iget-object v2, p0, Lea/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lea/d;->r(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static u()Lea/d;
    .locals 1

    invoke-static {}, Lea/d$c;->a()Lea/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method e(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 13

    const-string v0, "userHandle"

    const-string v1, "signature"

    const-string v2, "username"

    const-string v3, "clientDataJSON"

    const-string v4, "authenticatorData"

    const-string v5, "type"

    const-string v6, "rawId"

    const-string v7, "id"

    const-string v8, "password"

    const-string v9, "response"

    .line 1
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    if-eqz p1, :cond_d

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    :try_start_0
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 5
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 6
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p1, v7, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    :cond_1
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 8
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    :cond_2
    invoke-virtual {v11, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 10
    invoke-virtual {v11, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    :cond_3
    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 12
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 13
    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 14
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 15
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 16
    invoke-virtual {v5, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    :cond_4
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 18
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 19
    invoke-virtual {v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    :cond_5
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 21
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-virtual {v5, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    :cond_6
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 24
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    :cond_7
    invoke-virtual {p1, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    :cond_8
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->a1()Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz p2, :cond_c

    const-string v0, "all"

    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_c

    .line 29
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 30
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 31
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    :cond_9
    invoke-virtual {v11, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 33
    invoke-virtual {v11, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    :cond_a
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "credentialType"

    if-lez v0, :cond_b

    .line 35
    :try_start_1
    invoke-virtual {v10, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    invoke-virtual {v10, v9, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 37
    :cond_b
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result p2

    if-lez p2, :cond_d

    const-string p2, "FIDO2"

    .line 38
    invoke-virtual {v10, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    invoke-virtual {v10, v9, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_c
    move-object v10, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 40
    sget-object p2, Lea/d;->g:Ljava/lang/String;

    const-string v0, "JSON exception on getting credentials: "

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_d
    :goto_0
    return-object v10
.end method

.method i(Ljava/lang/ref/WeakReference;Lea/e;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lea/e;",
            ")Z"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->a1()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_1
    invoke-virtual {p2}, Lea/e;->j()Z

    move-result p1

    return p1

    .line 4
    :cond_2
    :goto_0
    sget-object p1, Lea/d;->g:Ljava/lang/String;

    const-string p2, "Activity is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method

.method n(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lea/e;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    .line 2
    new-instance v0, Lea/d$b;

    invoke-direct {v0, p0, p4}, Lea/d$b;-><init>(Lea/d;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    invoke-virtual {p3, p2, p1, v0}, Lea/e;->e(Landroid/app/Activity;Lorg/json/JSONObject;Lea/e$c;)V

    return-void
.end method

.method p(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lea/e;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2, p3}, Lea/d;->i(Ljava/lang/ref/WeakReference;Lea/e;)Z

    move-result p1

    const-string p2, "Credentials.isAvailableResponse"

    if-nez p1, :cond_1

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->a1()Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0, p3, p3, p3}, Lea/d;->h(ZZZ)Lorg/json/JSONObject;

    move-result-object p1

    .line 4
    invoke-virtual {p4, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0, p3, p3}, Lea/d;->g(ZZ)Lorg/json/JSONObject;

    move-result-object p1

    .line 6
    invoke-virtual {p4, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    :goto_0
    return-void

    .line 7
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->a1()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {p3}, Lea/e;->j()Z

    move-result p1

    .line 9
    invoke-direct {p0, p1, p1, v0}, Lea/d;->h(ZZZ)Lorg/json/JSONObject;

    move-result-object p1

    .line 10
    invoke-virtual {p4, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-direct {p0, v0, v0}, Lea/d;->g(ZZ)Lorg/json/JSONObject;

    move-result-object p1

    .line 12
    invoke-virtual {p4, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    :goto_1
    return-void
.end method

.method r(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lea/e;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lea/e;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    const-string v0, "credentialType"

    .line 1
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->a1()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "Credentials.registerCredentialsResponse"

    if-eqz v1, :cond_3

    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "FIDO2"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p3}, Lea/e;->j()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x5

    .line 7
    invoke-direct {p0, p1, v2}, Lea/d;->f(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 8
    invoke-virtual {p4, v3, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_1
    move-object v2, v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x3

    const-string p2, "Credential type not specified!"

    .line 9
    invoke-direct {p0, p1, p2}, Lea/d;->f(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 10
    invoke-virtual {p4, v3, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x4

    .line 11
    invoke-direct {p0, p1, v2}, Lea/d;->f(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 12
    invoke-virtual {p4, v3, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_3
    :try_start_1
    const-string v0, "parameters"

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "publicKey"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 14
    :goto_1
    new-instance v0, Lea/d$a;

    invoke-direct {v0, p0, p4}, Lea/d$a;-><init>(Lea/d;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    invoke-virtual {p3, p2, p1, v2, v0}, Lea/e;->b(Landroid/app/Activity;Lorg/json/JSONObject;Ljava/lang/String;Lea/e$c;)V

    return-void

    :catch_1
    move-exception p1

    .line 15
    sget-object p2, Lea/d;->g:Ljava/lang/String;

    const-string p3, "JSON exception on registering credentials: "

    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p4, v3, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method s(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 11

    const-string v0, "attestationObject"

    const-string v1, "clientDataJSON"

    const-string v2, "authenticatorAttachment"

    const-string v3, "response"

    const-string v4, "type"

    const-string v5, "rawId"

    const-string v6, "id"

    .line 1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 2
    sget-object v8, Lea/d;->g:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "register credential result: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_7

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    :cond_1
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-virtual {v7, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    :cond_2
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    :cond_3
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 13
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 15
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 16
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 17
    invoke-virtual {p1, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    :cond_4
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 19
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    :cond_5
    invoke-virtual {v7, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    :cond_6
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 23
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-virtual {v7, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    sget-object v0, Lea/d;->g:Ljava/lang/String;

    const-string v1, "JSON exception on registering credentials: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_7
    :goto_0
    return-object v7
.end method

.method public t(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lea/d;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method
