.class Lw8/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/k;->v(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Lw8/k;


# direct methods
.method constructor <init>(Lw8/k;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lw8/k$b;->p:Lw8/k;

    iput-object p2, p0, Lw8/k$b;->n:Ljava/lang/String;

    iput-object p3, p0, Lw8/k$b;->o:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const-string v0, ""

    const-string v1, "AppBridgeNotification: JSON Result failure"

    const-string v2, "Android-AppLogin-BrowserTracker-JsonFailed"

    .line 1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleAppBridgeNotification: type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lw8/k$b;->n:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lw8/k$b;->o:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "InitHelper"

    invoke-static {v4, v3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v3, Lcom/roblox/client/c1$d;

    invoke-direct {v3}, Lcom/roblox/client/c1$d;-><init>()V

    .line 3
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    iget-object v6, p0, Lw8/k$b;->o:Ljava/lang/String;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v6, "result"

    .line 4
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_0

    .line 5
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0}, Lw8/k;->k(Lw8/k;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lx7/e;->A(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0, v1}, Lw8/k;->l(Lw8/k;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v6, "btid"

    .line 7
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    const-string v6, "upgradeStatus"

    .line 8
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    .line 9
    invoke-virtual {v3}, Lcom/roblox/client/c1$d;->f()V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v3}, Lcom/roblox/client/c1$d;->e()V

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {v3}, Lcom/roblox/client/c1$d;->d()V

    :goto_0
    const-string v6, "upgradeSource"

    .line 12
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v3, Lcom/roblox/client/c1$d;->b:Ljava/lang/String;

    const-string v6, "MD5Sum"

    .line 13
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roblox/client/c1$d;->c:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0}, Lw8/k;->k(Lw8/k;)Lx7/e;

    move-result-object v0

    const-string v1, "Android-AppLogin-BrowserTracker-Success"

    invoke-virtual {v0, v1}, Lx7/e;->A(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0}, Lw8/k;->m(Lw8/k;)V

    .line 16
    invoke-virtual {v3}, Lcom/roblox/client/c1$d;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v3}, Lcom/roblox/client/c1$d;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 17
    :cond_3
    invoke-static {}, Lcom/roblox/client/c1;->e()Lcom/roblox/client/c1;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roblox/client/c1;->g(Lcom/roblox/client/c1$d;)V

    :cond_4
    const-string v0, "doAfterFetchBrowserTrackerId:..."

    .line 18
    invoke-static {v4, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "appLaunch"

    .line 19
    invoke-static {v0}, Lcom/roblox/client/f0;->b(Ljava/lang/String;)V

    .line 20
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->x0()Z

    move-result v0

    if-nez v0, :cond_5

    .line 21
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0}, Lw8/k;->n(Lw8/k;)V

    :cond_5
    return-void

    .line 22
    :catch_0
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0}, Lw8/k;->k(Lw8/k;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lx7/e;->A(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lw8/k$b;->p:Lw8/k;

    invoke-static {v0, v1}, Lw8/k;->l(Lw8/k;Ljava/lang/String;)V

    return-void
.end method
