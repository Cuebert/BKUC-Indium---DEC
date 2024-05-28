.class public Lcom/roblox/client/startup/ActivitySplash;
.super Lcom/roblox/client/i0;
.source "SourceFile"

# interfaces
.implements Lw8/l;
.implements Lcom/roblox/client/startup/a$b;


# static fields
.field private static c0:Z = true

.field private static d0:Z


# instance fields
.field private S:Lcom/roblox/client/components/LoadingBar;

.field private T:Ljava/lang/Runnable;

.field private U:J

.field private V:Landroid/os/Handler;

.field private W:Z

.field private X:Landroid/content/Intent;

.field private Y:Z

.field private Z:Z

.field private a0:Lw8/o;

.field private b0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->W:Z

    return-void
.end method

.method static synthetic A1(Lcom/roblox/client/startup/ActivitySplash;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    return-object p1
.end method

.method static synthetic B1(Lcom/roblox/client/startup/ActivitySplash;)Lcom/roblox/client/components/LoadingBar;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    return-object p0
.end method

.method public static C1(Landroid/content/Context;Lw8/o;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/startup/ActivitySplash;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buildIntent for: "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "rbx.splash"

    invoke-static {v1, p0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "STARTED_FOR_INTENT_KEY"

    .line 3
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object v0
.end method

.method private D1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method private E1()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/a;->q2(Landroidx/appcompat/app/c;)V

    return-void
.end method

.method public static F1()Z
    .locals 1

    sget-boolean v0, Lcom/roblox/client/startup/ActivitySplash;->d0:Z

    return v0
.end method

.method private G1(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->H1()V

    const-string v0, "LaunchActivityNativeMain"

    .line 2
    invoke-static {v0}, Ln6/f;->a(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    invoke-virtual {v0}, Ln6/d;->d()V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    const-string v1, "rbx.splash"

    if-eqz v0, :cond_0

    const-string p1, "isFinishing"

    .line 5
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v0, "launchMainActivity"

    .line 6
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/client/n;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    if-eqz p1, :cond_1

    const-string p1, "protocolLaunch"

    .line 8
    invoke-static {p1}, Lcom/roblox/client/f0;->b(Ljava/lang/String;)V

    .line 9
    :cond_1
    iget-boolean p1, p0, Lcom/roblox/client/startup/ActivitySplash;->Z:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    const-string v1, "loginAfterSignup"

    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 12
    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 13
    :cond_3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private H1()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    sget-object v1, Lw8/o;->x:Lw8/o;

    if-eq v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh8/m;->r(Landroid/os/Bundle;)V

    :cond_1
    const-string v1, "EXTRA_NOTIFICATION_TYPE"

    const-string v2, ""

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "EXTRA_NOTIFICATION_VERSION"

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v1, "EXTRA_NOTIFICATION_ID"

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "ChatNewMessage"

    if-ne v5, v1, :cond_2

    const-string v1, "EXTRA_CATEGORY"

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh8/p;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0, v5}, Lh8/p;->d(Ljava/lang/String;)Lh8/i;

    move-result-object v0

    invoke-interface {v0}, Lh8/i;->clear()V

    .line 11
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-static {v0, p0}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->j(Landroid/content/Intent;Landroid/content/Context;)V

    .line 12
    :cond_3
    :goto_0
    new-instance v0, Lh8/r;

    invoke-direct {v0}, Lh8/r;-><init>()V

    const-string v1, "GcmPlatform"

    invoke-virtual {v0, p0, v1}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-static {p0}, Lc9/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    const-string v3, "clicked"

    .line 14
    invoke-static/range {v3 .. v9}, Lcom/roblox/client/f0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method private I1()V
    .locals 3

    .line 1
    invoke-static {}, Le7/j;->b()Le7/j;

    move-result-object v0

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->l1()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le7/j;->d(J)V

    .line 3
    invoke-static {}, Lcom/roblox/client/p0;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le7/j;->c(Ljava/lang/String;)V

    return-void
.end method

.method private J1(I)V
    .locals 2

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "retry_during_splash"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 2
    invoke-static {p0, p1}, Lcom/roblox/client/startup/a;->t2(Landroidx/appcompat/app/c;I)V

    return-void
.end method

.method private K1()V
    .locals 2

    const-string v0, "rbx.splash"

    const-string v1, "startup:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->L1(Z)V

    .line 3
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0}, Lw8/k;->Q()V

    return-void
.end method

.method private L1(Z)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "rbx.splash"

    const-string v0, "updateLoadingView is disabled to disable loading screen for full VR experience."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz p1, :cond_3

    .line 3
    sget-boolean p1, Lcom/roblox/client/startup/ActivitySplash;->c0:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 4
    sput-boolean v0, Lcom/roblox/client/startup/ActivitySplash;->c0:Z

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/roblox/client/startup/ActivitySplash;->U:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x1388

    cmp-long p1, v1, v3

    if-ltz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    .line 8
    new-instance p1, Lcom/roblox/client/startup/ActivitySplash$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/startup/ActivitySplash$a;-><init>(Lcom/roblox/client/startup/ActivitySplash;)V

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    .line 9
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    sub-long/2addr v3, v1

    invoke-virtual {v0, p1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->D1()V

    .line 12
    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public B()V
    .locals 3

    .line 1
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roblox/client/startup/ActivitySplash;->W:Z

    invoke-virtual {v0, v1}, Lx7/e;->q(Z)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->I1()V

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "rbx.splash"

    const-string v1, "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now..."

    .line 4
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->b0:Z

    .line 6
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v1

    invoke-virtual {v1, p0}, Lw8/k;->U(Lw8/l;)V

    .line 7
    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    sget-object v2, Lw8/o;->u:Lw8/o;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->G1(Z)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method public G()V
    .locals 0

    return-void
.end method

.method public H()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/roblox/client/c0;->m3:I

    invoke-static {p0, v0}, Lc9/n;->a(Landroid/app/Activity;I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->L1(Z)V

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    sget v0, Lcom/roblox/client/c0;->m3:I

    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->J1(I)V

    :cond_1
    return-void
.end method

.method public S()V
    .locals 1

    const-string v0, "NavigateToLandingScreen"

    .line 1
    invoke-static {v0}, Ln6/f;->a(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->G1(Z)V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method protected i1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected j1()Lo7/b;
    .locals 1

    new-instance v0, Lo7/c;

    invoke-direct {v0}, Lo7/c;-><init>()V

    return-object v0
.end method

.method public n()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->E1()V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->K1()V

    return-void
.end method

.method public n0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->E1()V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->K1()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-static {p0}, Lcom/Indium/IndiumMain;->Start(Landroid/content/Context;)V

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "splash_activity_oncreate"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 3
    invoke-static {p0}, Lka/a;->c(Landroid/content/Context;)V

    .line 4
    invoke-static {}, Lka/a;->d()Lka/a;

    move-result-object v0

    sget-object v1, Lka/a$a;->n:Lka/a$a;

    invoke-virtual {v0, v1, p1}, Lka/a;->a(Lka/a$a;Landroid/os/Bundle;)V

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/startup/ActivitySplash;->U:J

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    .line 7
    invoke-static {}, Ln6/f;->b()V

    const-string v0, "LaunchApp"

    .line 8
    invoke-static {v0}, Ln6/f;->a(Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p1()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/client/n;->r(Landroid/content/Context;)V

    .line 11
    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->initAppShellReporter()V

    .line 12
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    const-string v1, "STARTED_FOR_INTENT_KEY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lw8/o;

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    if-nez v0, :cond_1

    .line 13
    sget-object v0, Lw8/o;->o:Lw8/o;

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    .line 14
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Started for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.splash"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    sget-object v2, Lw8/o;->q:Lw8/o;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v2, :cond_3

    sget-object v2, Lw8/o;->y:Lw8/o;

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iput-boolean v2, p0, Lcom/roblox/client/startup/ActivitySplash;->Y:Z

    .line 16
    sget-object v2, Lw8/o;->s:Lw8/o;

    if-ne v0, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    iput-boolean v2, p0, Lcom/roblox/client/startup/ActivitySplash;->Z:Z

    .line 17
    sget-object v2, Lw8/o;->r:Lw8/o;

    if-ne v0, v2, :cond_5

    const/4 v3, 0x1

    .line 18
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCreate: startedForResult="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/roblox/client/startup/ActivitySplash;->Y:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", appRestarted="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    sget v0, Lcom/roblox/client/a0;->g:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 20
    sget v0, Lcom/roblox/client/y;->z0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/LoadingBar;

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    .line 21
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 22
    invoke-static {}, Lcom/roblox/client/p0;->F()Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Using "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 25
    :cond_6
    invoke-static {}, Ln7/a;->i()V

    .line 26
    invoke-virtual {p0}, Lcom/roblox/client/i0;->k1()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->W:Z

    if-nez p1, :cond_7

    .line 27
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lx7/b;->b(Landroid/content/Context;)V

    .line 28
    :cond_7
    invoke-static {}, Lx6/b;->a()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lcom/roblox/client/p0;->x0()Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "Alert: needs restart"

    .line 29
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    invoke-virtual {p0}, Lcom/roblox/client/i0;->h1()V

    return-void

    .line 31
    :cond_8
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lw8/o;

    invoke-virtual {p1, v0}, Lw8/k;->O(Lw8/o;)V

    .line 32
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Lw8/k;->P(Lw8/l;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onDestroy()V

    const-string v0, "rbx.splash"

    const-string v1, "onDestroy: unset the activity from InitHelper."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lw8/k;->U(Lw8/l;)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/k0;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onNewIntent: intent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.splash"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onPause()V

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "splash_activity_onpause"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPause: isFinishing = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.splash"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->D1()V

    .line 5
    iget-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->b0:Z

    if-nez v0, :cond_0

    .line 6
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    invoke-virtual {v0}, Ln6/d;->j()V

    .line 7
    invoke-static {}, Lka/a;->d()Lka/a;

    move-result-object v0

    sget-object v1, Lka/a$a;->n:Lka/a$a;

    invoke-virtual {v0, v1}, Lka/a;->b(Lka/a$a;)V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onResume()V

    const-string v0, "rbx.splash"

    const-string v1, "onResume:"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->E1()V

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->K1()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onStart()V

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/roblox/client/startup/ActivitySplash;->d0:Z

    const-string v0, "splash"

    .line 3
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    return-void
.end method
