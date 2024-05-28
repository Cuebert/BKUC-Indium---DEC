.class public Lcom/roblox/client/ActivityProtocolLaunch;
.super Lcom/roblox/client/i0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    return-void
.end method


# virtual methods
.method protected A1()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/client/n;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 3
    invoke-static {}, Lw8/d;->h()Z

    move-result v0

    const-string v1, "rbx.externallaunch"

    if-eqz v0, :cond_0

    const-string v0, "onCreate() activity on existing stack - checking to launch data"

    .line 4
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/ActivityProtocolLaunch;->A1()V

    .line 6
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lla/c;->e(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf7/b0;->g(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "onCreate() activity is root - starting splash (regular start-up flow)"

    .line 9
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/roblox/universalapp/linking/JNIBaseUrlProtocol;->maybeHandleColdStartProtocolLaunch(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->f0()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 13
    invoke-static {v0}, Lcom/roblox/universalapp/linking/JNIWebLoginProtocol;->maybeHandleColdStartProtocolLaunch(Ljava/lang/String;)Z

    .line 14
    :cond_1
    sget-object v0, Lw8/o;->u:Lw8/o;

    invoke-static {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->C1(Landroid/content/Context;Lw8/o;)Landroid/content/Intent;

    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 16
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lla/c;->q(Landroid/content/Intent;)V

    .line 17
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx7/c;->h(Landroid/content/Intent;)V

    .line 18
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
