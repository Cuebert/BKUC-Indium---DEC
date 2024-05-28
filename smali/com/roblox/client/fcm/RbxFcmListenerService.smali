.class public Lcom/roblox/client/fcm/RbxFcmListenerService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    invoke-static {p0}, Lka/a;->c(Landroid/content/Context;)V

    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V

    .line 2
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lx7/b$d;->o:Lx7/b$d;

    .line 4
    invoke-virtual {v0, v1, v2}, Lx7/b;->k(Landroid/content/Context;Lx7/b$d;)V

    .line 5
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->x()Ljava/util/Map;

    move-result-object p1

    .line 6
    invoke-static {p0}, Lw8/d;->l(Landroid/content/Context;)V

    const-string v0, "version"

    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RGLS.onMessageReceived() NotificationVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.push"

    invoke-static {v2, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v1

    invoke-virtual {v1, p0}, Ls7/b;->u(Landroid/content/Context;)V

    .line 10
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->K0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    invoke-static {p0}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/app/n;->a()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 12
    new-instance v0, Lk8/a;

    invoke-direct {v0}, Lk8/a;-><init>()V

    invoke-virtual {v0, p0, p1}, Lk8/a;->d(Landroid/content/Context;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const-string v0, "message"

    .line 13
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RGLS.onMessageReceived() Message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    new-instance v0, Lh8/s;

    invoke-direct {v0}, Lh8/s;-><init>()V

    invoke-virtual {v0, p0, p1}, Lh8/s;->e(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onNewToken(Ljava/lang/String;)V

    const-string p1, "rbx.push"

    const-string v0, "Token refresh triggered."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object p1

    invoke-virtual {p1, p0}, Lh8/m;->f(Landroid/content/Context;)Lj8/k;

    move-result-object p1

    sget-object v0, Lj8/k;->o:Lj8/k;

    if-ne p1, v0, :cond_0

    .line 4
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/roblox/client/fcm/RegistrationIntentService;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5
    invoke-static {p0, p1}, Lcom/roblox/client/fcm/RegistrationIntentService;->i(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
