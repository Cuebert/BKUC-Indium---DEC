.class public Lf7/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/b0$b;
    }
.end annotation


# instance fields
.field private a:Lf7/b0$b;

.field private b:Lf7/n;

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lf7/b0$b;->n:Lf7/b0$b;

    iput-object v0, p0, Lf7/b0;->a:Lf7/b0$b;

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lf7/b0;->c:J

    return-void
.end method

.method public static synthetic a(Lf7/b0;Landroid/app/Activity;Lf7/z;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/b0;->j(Landroid/app/Activity;Lf7/z;)V

    return-void
.end method

.method static synthetic b(Lf7/b0;)Lf7/n;
    .locals 0

    iget-object p0, p0, Lf7/b0;->b:Lf7/n;

    return-object p0
.end method

.method static synthetic c(Lf7/b0;Lf7/n;)Lf7/n;
    .locals 0

    iput-object p1, p0, Lf7/b0;->b:Lf7/n;

    return-object p1
.end method

.method static synthetic d(Lf7/b0;Landroid/content/Context;Lf7/z;)Lf7/n;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/b0;->e(Landroid/content/Context;Lf7/z;)Lf7/n;

    move-result-object p0

    return-object p0
.end method

.method private e(Landroid/content/Context;Lf7/z;)Lf7/n;
    .locals 3

    .line 1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-virtual {p2}, Lf7/z;->m()J

    move-result-wide v0

    const-string v2, "roblox_placeId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 3
    invoke-virtual {p2}, Lf7/z;->q()J

    move-result-wide v0

    const-string v2, "roblox_userId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 4
    invoke-virtual {p2}, Lf7/z;->f()J

    move-result-wide v0

    const-string v2, "roblox_conversationId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 5
    invoke-virtual {p2}, Lf7/z;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_accessCode"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lf7/z;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_linkCode"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lf7/z;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_gameId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lf7/z;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_reservedServerAccessCode"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Lf7/z;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_callId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Lf7/z;->o()I

    move-result v0

    const-string v1, "roblox_joinRequestType"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 11
    invoke-virtual {p2}, Lf7/z;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_referralPage"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2}, Lf7/z;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_launchData"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2}, Lf7/z;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_joinAttemptId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lf7/z;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "roblox_joinAttemptOrigin"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p2}, Lf7/z;->h()Ljava/lang/String;

    move-result-object p2

    const-string v0, "roblox_isoContext"

    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance p2, Lf7/n;

    invoke-direct {p2, p1}, Lf7/n;-><init>(Landroid/os/Bundle;)V

    return-object p2
.end method

.method private synthetic j(Landroid/app/Activity;Lf7/z;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/b0;->k(Landroid/app/Activity;Lf7/z;)V

    return-void
.end method

.method private k(Landroid/app/Activity;Lf7/z;)V
    .locals 4

    const-string v0, "GameManager"

    if-eqz p2, :cond_0

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "launchGameWithParams: Start game activity for placeId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lf7/z;->m()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p1}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ROBLOXCrash"

    .line 3
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 4
    new-instance v0, Lf7/b0$a;

    invoke-direct {v0, p0, p1, p2}, Lf7/b0$a;-><init>(Lf7/b0;Landroid/app/Activity;Lf7/z;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lf7/b0;->c:J

    .line 6
    invoke-virtual {p0}, Lf7/b0;->m()V

    goto :goto_0

    :cond_0
    const-string p1, "launchGameWithParams: game-params is null. Just close this activity!"

    .line 7
    invoke-static {v0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public f()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/client/c1;->e()Lcom/roblox/client/c1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/c1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GameManager"

    const-string v1, "canStartGame = false: Upgrade required"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public g(Z)V
    .locals 1

    const-string p1, "GameManager"

    const-string v0, "endGameSession"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/b0;->b:Lf7/n;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-virtual {v0, p1}, Lf7/n;->y(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "Error: Try to end but no game session exists."

    .line 4
    invoke-static {p1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lf7/b0;->a:Lf7/b0$b;

    sget-object v1, Lf7/b0$b;->p:Lf7/b0$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lf7/b0;->a:Lf7/b0$b;

    sget-object v1, Lf7/b0$b;->o:Lf7/b0$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(Landroid/content/Context;)V
    .locals 1

    const-string p1, "GameManager"

    const-string v0, "onGameEnded:"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object p1, Lf7/b0$b;->p:Lf7/b0$b;

    iput-object p1, p0, Lf7/b0;->a:Lf7/b0$b;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lf7/b0;->b:Lf7/n;

    .line 4
    invoke-virtual {p0}, Lf7/b0;->o()V

    return-void
.end method

.method public m()V
    .locals 2

    const-string v0, "GameManager"

    const-string v1, "onGameStarted:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lf7/b0;->c:J

    .line 3
    sget-object v0, Lf7/b0$b;->o:Lf7/b0$b;

    iput-object v0, p0, Lf7/b0;->a:Lf7/b0$b;

    return-void
.end method

.method public n()V
    .locals 2

    const-string v0, "GameManager"

    const-string v1, "pauseGameSession"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lf7/b0;->b:Lf7/n;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lf7/n;->U()V

    goto :goto_0

    :cond_0
    const-string v1, "Error: Try to pause but no game session exists."

    .line 4
    invoke-static {v0, v1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public o()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lf7/b0;->c:J

    sub-long/2addr v0, v2

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Game duration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GameManager"

    invoke-static {v3, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lo6/a;->e()Lo6/a;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lo6/a;->l(J)V

    return-void
.end method

.method public p()V
    .locals 2

    const-string v0, "GameManager"

    const-string v1, "resumeGameSession"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lf7/b0;->b:Lf7/n;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lf7/n;->Z()V

    goto :goto_0

    :cond_0
    const-string v1, "Error: Try to resume but no game session exists."

    .line 4
    invoke-static {v0, v1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public q(Landroid/app/Activity;Lf7/z;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf7/b0;->f()Z

    move-result v0

    const-string v1, "GameManager"

    if-nez v0, :cond_0

    const-string p1, "Game launch halted - Can\'t start game."

    .line 2
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startGameForResult: requestCode = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    move-object p3, p1

    check-cast p3, Lcom/roblox/client/ActivityNativeMain;

    sget-object v0, Lf7/f0;->n:Lf7/f0;

    invoke-virtual {p3, v0}, Lcom/roblox/client/ActivityNativeMain;->x2(Lf7/f0;)V

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-virtual {p3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-ne p3, v0, :cond_1

    .line 6
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p3

    new-instance v0, Lf7/a0;

    invoke-direct {v0, p0, p1, p2}, Lf7/a0;-><init>(Lf7/b0;Landroid/app/Activity;Lf7/z;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lf7/b0;->k(Landroid/app/Activity;Lf7/z;)V

    :goto_0
    return-void
.end method
