.class public Ly9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly9/i$d;
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

.field private h:Lcom/roblox/universalapp/messagebus/Connection;

.field private i:Lcom/roblox/universalapp/messagebus/Connection;

.field private j:Lcom/roblox/universalapp/messagebus/Connection;

.field private k:Lcom/roblox/universalapp/messagebus/Connection;


# direct methods
.method private constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    new-instance v0, Ly9/f;

    invoke-direct {v0, p0}, Ly9/f;-><init>(Ly9/i;)V

    const-string v1, "NativeUtilProtocol"

    const-string v2, "sendSMS"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 5
    new-instance v0, Ly9/b;

    invoke-direct {v0, p0}, Ly9/b;-><init>(Ly9/i;)V

    const-string v2, "supportsSMS"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->e:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    new-instance v0, Ly9/g;

    invoke-direct {v0, p0}, Ly9/g;-><init>(Ly9/i;)V

    const-string v2, "supportsSwitchToSettingsApp"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->f:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    new-instance v0, Ly9/e;

    invoke-direct {v0, p0}, Ly9/e;-><init>(Ly9/i;)V

    const-string v2, "switchToSettingsApp"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->g:Lcom/roblox/universalapp/messagebus/Connection;

    .line 8
    new-instance v0, Ly9/h;

    invoke-direct {v0, p0}, Ly9/h;-><init>(Ly9/i;)V

    const-string v2, "getSMSOTP"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->h:Lcom/roblox/universalapp/messagebus/Connection;

    .line 9
    new-instance v0, Ly9/a;

    invoke-direct {v0, p0}, Ly9/a;-><init>(Ly9/i;)V

    const-string v2, "supportsGetSMSOTP"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->i:Lcom/roblox/universalapp/messagebus/Connection;

    .line 10
    new-instance v0, Ly9/c;

    invoke-direct {v0, p0}, Ly9/c;-><init>(Ly9/i;)V

    const-string v2, "getPhoneNumber"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Ly9/i;->j:Lcom/roblox/universalapp/messagebus/Connection;

    .line 11
    new-instance v0, Ly9/d;

    invoke-direct {v0, p0}, Ly9/d;-><init>(Ly9/i;)V

    const-string v2, "supportsGetPhoneNumber"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Ly9/i;->k:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Ly9/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly9/i;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method private J(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "NativeUtilProtocol"

    const/16 v4, 0xd

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void
.end method

.method private K(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2
    invoke-virtual {v3, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 3
    iget-object v0, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "NativeUtilProtocol"

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

    const-string p3, "NativeUtilProtocol"

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object v0, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const/16 v4, 0xd

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "NativeUtilProtocol"

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    :goto_0
    return-void
.end method

.method public static O()Ly9/i;
    .locals 1

    invoke-static {}, Ly9/i$d;->a()Ly9/i;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->w(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->s(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->x(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic d(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->y(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic e(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->u(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic f(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->r(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic g(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->t(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic h(Ly9/i;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->v(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic i(Ly9/i;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly9/i;->K(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic j(Ly9/i;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ly9/i;->J(Ljava/lang/String;)V

    return-void
.end method

.method private static k()Z
    .locals 1

    const-string v0, "EnableAndroidGetPhoneNumberTemp"

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static l()Z
    .locals 1

    const-string v0, "EnableAndroidGetSMSOTPTemp"

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static m()Z
    .locals 1

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p0()Z

    move-result v0

    return v0
.end method

.method private static n()Z
    .locals 1

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->F()Z

    move-result v0

    return v0
.end method

.method private static o()Z
    .locals 1

    const-string v0, "EnableAndroidSwitchToSettingsApp"

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static p()Z
    .locals 1

    const-string v0, "EnableAndroidNativeUtilProtocol"

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private synthetic r(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->D(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic s(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->G(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic t(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->H(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic u(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->I(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic v(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->B(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic w(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->F(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic x(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->A(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic y(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly9/i;->E(Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method protected A(Lorg/json/JSONObject;)V
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

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->p()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Ly9/i;->k()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3
    invoke-static {}, Ly9/i;->m()Z

    move-result p1

    if-nez p1, :cond_2

    .line 4
    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    if-eqz p1, :cond_1

    iget-object p1, p0, Ly9/i;->c:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Ly9/i;->c:Ljava/lang/ref/WeakReference;

    .line 7
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/activity/result/b;

    .line 8
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object v0

    iget-object v1, p0, Ly9/i;->b:Landroid/content/Context;

    new-instance v2, Ly9/i$b;

    invoke-direct {v2, p0}, Ly9/i$b;-><init>(Ly9/i;)V

    invoke-virtual {v0, v1, p1, v2}, Lja/j;->m(Landroid/content/Context;Landroidx/activity/result/b;Lja/j$b;)V

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "Context or launcher is null while getting phone number!"

    .line 9
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    .line 10
    invoke-virtual {p0, p1}, Ly9/i;->M(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method protected B(Lorg/json/JSONObject;)V
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

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    new-instance v0, Lz9/d;

    invoke-direct {v0}, Lz9/d;-><init>()V

    invoke-virtual {p0, p1, v0}, Ly9/i;->q(Landroid/content/Context;Lz9/d;)V

    return-void
.end method

.method public C(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-static {}, Ly9/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Ly9/i;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Ly9/i;->m()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 4
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lja/j;->e(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ly9/i;->M(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected D(Lorg/json/JSONObject;)V
    .locals 9

    const-string v0, "Exception while handling send SMS request: "

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSendSMS: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NativeUtilProtocol"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    :try_start_0
    const-string v3, "address"

    .line 3
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "message"

    .line 4
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    const-string v6, "sms"

    const/4 v7, 0x0

    invoke-static {v6, v3, v7}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const v3, 0x10008000

    .line 6
    invoke-virtual {v4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v3, "sms_body"

    .line 7
    invoke-virtual {v4, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    :goto_0
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string p1, "sent"

    .line 12
    invoke-virtual {v6, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 13
    iget-object v3, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v4, "NativeUtilProtocol"

    const-string v5, "sendSMS"

    const/4 v7, 0x0

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {v3 .. v8}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :catch_2
    move-exception p1

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    iget-object v3, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const/16 v7, 0xd

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const-string v4, "NativeUtilProtocol"

    const-string v5, "sendSMS"

    invoke-virtual/range {v3 .. v8}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    :cond_0
    :goto_1
    return-void
.end method

.method protected E(Lorg/json/JSONObject;)V
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

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ly9/i;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-static {}, Ly9/i;->m()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object p1

    iget-object v0, p0, Ly9/i;->b:Landroid/content/Context;

    new-instance v1, Ly9/i$c;

    invoke-direct {v1, p0}, Ly9/i$c;-><init>(Ly9/i;)V

    invoke-virtual {p1, v0, v1}, Lja/j;->g(Landroid/content/Context;Lja/j$b;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    const-string v0, "supportsGetPhoneNumber"

    const-string v1, "support"

    .line 5
    invoke-direct {p0, v0, v1, p1}, Ly9/i;->K(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method protected F(Lorg/json/JSONObject;)V
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

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ly9/i;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-static {}, Ly9/i;->n()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lja/j;->f()Lja/j;

    move-result-object p1

    iget-object v0, p0, Ly9/i;->b:Landroid/content/Context;

    new-instance v1, Ly9/i$a;

    invoke-direct {v1, p0}, Ly9/i$a;-><init>(Ly9/i;)V

    invoke-virtual {p1, v0, v1}, Lja/j;->g(Landroid/content/Context;Lja/j$b;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    const-string v0, "supportsGetSMSOTP"

    const-string v1, "support"

    .line 5
    invoke-direct {p0, v0, v1, p1}, Ly9/i;->K(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method protected G(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSupportsSMS: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->p()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v1, "android.hardware.telephony"

    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "support"

    .line 5
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 6
    iget-object v1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v2, "NativeUtilProtocol"

    const-string v3, "supportsSMS"

    const/4 v5, 0x0

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON exception while handling supports sms request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object v1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const/16 v5, 0xd

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v2, "NativeUtilProtocol"

    const-string v3, "supportsSMS"

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    :goto_1
    return-void
.end method

.method protected H(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSupportsSwitchToSettingsApp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->o()Z

    move-result p1

    .line 3
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "support"

    .line 4
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 5
    iget-object v1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v2, "NativeUtilProtocol"

    const-string v3, "supportsSwitchToSettingsApp"

    const/4 v5, 0x0

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON exception while handling supports switch to settings app request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iget-object v1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const/16 v5, 0xd

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v2, "NativeUtilProtocol"

    const-string v3, "supportsSwitchToSettingsApp"

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    :goto_0
    return-void
.end method

.method protected I(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSwitchToSettingsApp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ly9/i;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    :try_start_0
    iget-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception while handling switch to settings app request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :goto_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    iget-object v0, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const/4 v4, 0x0

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "NativeUtilProtocol"

    const-string v2, "switchToSettingsApp"

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method public L(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Ly9/i;->b:Landroid/content/Context;

    return-void
.end method

.method M(Ljava/lang/String;)V
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
    iget-object v1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v2, "NativeUtilProtocol"

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

    const-string v0, "NativeUtilProtocol"

    const-string v1, "Exception while handling get phone number request"

    .line 5
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const-string p1, "getPhoneNumber"

    .line 6
    invoke-direct {p0, p1}, Ly9/i;->J(Ljava/lang/String;)V

    return-void
.end method

.method public N(Landroidx/activity/result/b;)V
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

    iput-object v0, p0, Ly9/i;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method q(Landroid/content/Context;Lz9/d;)V
    .locals 7

    .line 1
    invoke-static {}, Ly9/i;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ly9/i;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Ly9/i;->n()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    .line 3
    iget-object v1, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const/16 v5, 0xd

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v2, "NativeUtilProtocol"

    const-string v3, "getSMSOTP"

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void

    :cond_0
    const-string v0, "NativeUtilProtocol"

    .line 4
    invoke-virtual {p2, p1, v0}, Lz9/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public z(Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "result"

    .line 2
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    iget-object v0, p0, Ly9/i;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "NativeUtilProtocol"

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

    const-string v0, "NativeUtilProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "getSMSOTP"

    .line 5
    invoke-direct {p0, p1}, Ly9/i;->J(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
