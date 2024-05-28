.class public Lcom/roblox/client/ActivityNativeMain;
.super Lcom/roblox/client/i0;
.source "SourceFile"

# interfaces
.implements Lx7/d$e;
.implements Lb7/c;
.implements Lw8/l;
.implements Lcom/roblox/client/app/a$d;
.implements Lcom/roblox/client/game/a$g;
.implements Lcom/roblox/client/startup/a$b;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;
.implements Lv8/d;
.implements Lcom/roblox/client/game/a$f;
.implements Lf7/n$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/ActivityNativeMain$n;
    }
.end annotation


# instance fields
.field private S:Z

.field private T:Lb7/a;

.field private U:Landroid/view/View;

.field private V:Landroid/view/View;

.field private W:Z

.field private X:I

.field private Y:Ls7/f;

.field private Z:Lcom/roblox/client/app/a;

.field private a0:Lcom/roblox/client/app/c;

.field private b0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private c0:Lcom/roblox/client/game/MainActivityController;

.field private d0:Landroidx/activity/result/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/b<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field

.field private e0:Z

.field private f0:Ly8/i;

.field private final g0:Lh7/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:Lcom/roblox/client/app/a;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Z

    .line 4
    new-instance v0, Lcom/roblox/client/ActivityNativeMain$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$f;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lh7/m;

    return-void
.end method

.method public static synthetic A1(Lcom/roblox/client/ActivityNativeMain;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->Q1(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic B1(Lcom/roblox/client/ActivityNativeMain;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->U1(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic C1(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->R1()V

    return-void
.end method

.method public static synthetic D1(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->S1()V

    return-void
.end method

.method public static synthetic E1(Lcom/roblox/client/ActivityNativeMain;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->T1(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method static synthetic F1(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->J1(Z)V

    return-void
.end method

.method static synthetic G1(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    return-object p0
.end method

.method static synthetic H1(Lcom/roblox/client/ActivityNativeMain;)Lb7/a;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->N1()Lb7/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic I1(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    return-object p0
.end method

.method private J1(Z)V
    .locals 6

    .line 1
    invoke-static {}, Lc9/l;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->k()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    invoke-virtual {v1}, Lb9/c;->j()J

    move-result-wide v1

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 5
    invoke-static {p0}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v3

    invoke-virtual {v3, v1, v2, v0, p1}, Lf8/h;->a0(JLjava/lang/String;Z)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lf8/h;->b0(Ljava/lang/String;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method private K1()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$a;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private L1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 2
    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    sget v1, Lcom/roblox/client/y;->e0:I

    iput v1, p0, Lcom/roblox/client/ActivityNativeMain;->X:I

    .line 4
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 6
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v1, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    sget v3, Lcom/roblox/client/a0;->t:I

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 8
    new-instance v1, Lcom/roblox/client/game/MainActivityController;

    sget v3, Lcom/roblox/client/y;->k1:I

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/SurfaceView;

    invoke-direct {v1, p0, v3}, Lcom/roblox/client/game/MainActivityController;-><init>(Lcom/roblox/client/i0;Landroid/view/SurfaceView;)V

    iput-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    .line 9
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->f()Landroidx/lifecycle/f;

    move-result-object v1

    iget-object v3, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v1, v3}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    const-string v1, "rbx.main"

    const-string v3, "createGlAppsFrame() apps frame created"

    .line 10
    invoke-static {v1, v3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method private M1()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/a;->q2(Landroidx/appcompat/app/c;)V

    return-void
.end method

.method private N1()Lb7/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lb7/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lb7/a;

    iget v1, p0, Lcom/roblox/client/ActivityNativeMain;->X:I

    invoke-direct {v0, p0, v1}, Lb7/a;-><init>(Lb7/c;I)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lb7/a;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lb7/a;

    return-object v0
.end method

.method private O1()La7/i;
    .locals 2

    const-string v0, "CUSTOM_WEBVIEW_TAG"

    .line 1
    invoke-static {v0}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object v0

    .line 2
    invoke-static {p0}, Lcom/roblox/client/p0;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La7/i;->g(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, La7/i;->j(Z)V

    return-object v0
.end method

.method private P1()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "internalOnResume:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    .line 2
    invoke-direct {p0, v1}, Lcom/roblox/client/ActivityNativeMain;->J1(Z)V

    .line 3
    invoke-static {}, Lcom/roblox/client/c1;->e()Lcom/roblox/client/c1;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$g;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v1, v2}, Lcom/roblox/client/c1;->b(Lcom/roblox/client/c1$c;)V

    .line 4
    invoke-static {}, Lw8/g;->q2()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-static {p0}, Lw8/g;->p2(Landroidx/fragment/app/d;)V

    .line 6
    :cond_0
    invoke-static {}, Lc9/l;->g()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v1

    invoke-virtual {v1}, Lx7/g;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    :cond_1
    invoke-static {p0}, Lcom/roblox/client/d1;->l(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lh7/m;

    invoke-virtual {v1, v2}, Lx7/g;->d(Lh7/m;)V

    .line 9
    :cond_2
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object v1

    invoke-virtual {v1, p0}, Lx7/d;->b(Lx7/d$e;)V

    .line 10
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    invoke-virtual {v1}, Lh8/m;->k()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    invoke-static {p0}, Lcom/roblox/client/d1;->l(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    .line 14
    :cond_3
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->i2()V

    .line 15
    :cond_4
    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-eqz v1, :cond_5

    const-string v1, "Back from game. Resuming Lua App."

    .line 16
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->f2()V

    .line 18
    :cond_5
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->N1()Lb7/a;

    move-result-object v0

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->f0()Z

    .line 20
    invoke-virtual {v0}, Lb7/a;->d()Lcom/roblox/client/game/a;

    move-result-object v1

    if-nez v1, :cond_6

    .line 21
    new-instance v1, Lcom/roblox/client/feature/FeatureState;

    const-string v2, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v1, v2}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lb7/a;->g(Lcom/roblox/client/feature/FeatureState;)V

    :cond_6
    return-void
.end method

.method private synthetic Q1(Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/roblox/client/g;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method private synthetic R1()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private synthetic S1()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->S()V

    return-void
.end method

.method private synthetic T1(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/client/n;->g()Lja/e;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lja/e;->o(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private synthetic U1(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/client/n;->k()Ly9/i;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ly9/i;->C(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private V1(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "loadDataModel()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/client/game/b;->E(Landroid/content/Context;)V

    .line 3
    invoke-static {p0}, Lcom/roblox/client/game/d;->a(Landroid/content/Context;)Lcom/roblox/client/game/b$d;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roblox/client/game/b;->j(Lcom/roblox/client/game/b$d;)V

    .line 5
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->isColdStartDeeplinkToGame()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lx7/g;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/c;

    invoke-direct {v1, p0}, Lcom/roblox/client/c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Lfa/a;->b(Lfa/a$b;)V

    .line 7
    invoke-static {}, Lx7/g;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lw8/k;->H(Landroid/app/Activity;Ljava/lang/String;)V

    .line 8
    :cond_0
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->r2(Lcom/roblox/client/feature/FeatureState;)V

    .line 10
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeStartLuaAppDM()V

    :cond_1
    return-void
.end method

.method private W1(Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    const-wide/16 v1, -0x1

    .line 1
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "EXTRA_STACKED_NOTIFICATION"

    const/4 v6, 0x0

    .line 3
    invoke-virtual {p1, v5, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v5, 0x0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    goto/16 :goto_1

    :cond_0
    const-string v6, "FriendRequestReceived"

    const-string v7, "FriendRequestAccepted"

    if-nez p1, :cond_5

    .line 5
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    cmp-long p1, v3, v1

    if-nez p1, :cond_2

    .line 6
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    invoke-virtual {p1}, Lx7/g;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/client/p0;->X(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {v3, v4}, Lcom/roblox/client/p0;->Z(J)Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_3
    cmp-long p1, v3, v1

    if-nez p1, :cond_4

    .line 8
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    invoke-virtual {p1}, Lx7/g;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/client/p0;->Y(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 9
    :cond_4
    invoke-static {v3, v4}, Lcom/roblox/client/p0;->Z(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 10
    :cond_5
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    .line 11
    :cond_6
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    invoke-virtual {p1}, Lx7/g;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/client/p0;->X(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 12
    :cond_7
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    invoke-virtual {p1}, Lx7/g;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/client/p0;->Y(J)Ljava/lang/String;

    move-result-object v5

    .line 13
    :goto_1
    invoke-direct {p0, v5}, Lcom/roblox/client/ActivityNativeMain;->v2(Ljava/lang/String;)V

    return-void
.end method

.method private X1(Landroid/os/Bundle;)V
    .locals 5

    const-string v0, "EXTRA_CONVERSATION_ID"

    const-wide/16 v1, -0x1

    .line 1
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->w0()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v3, v4}, Lcom/roblox/client/p0;->C0(J)Ljava/lang/String;

    move-result-object p1

    .line 4
    :goto_0
    invoke-direct {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->v2(Ljava/lang/String;)V

    return-void
.end method

.method private Y1()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "loginAfterSignup"

    .line 2
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    :cond_0
    return v1
.end method

.method private Z1(Landroid/content/Intent;)V
    .locals 5

    if-eqz p1, :cond_4

    const-string v0, "FEATURE_EXTRA"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "CHAT_TAG"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "USER_ID_EXTRA"

    const-wide/16 v1, -0x1

    .line 3
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0, v3, v4}, Lcom/roblox/client/ActivityNativeMain;->e2(J)V

    goto :goto_0

    :cond_0
    const-string v0, "CONVERSATION_ID_EXTRA"

    .line 5
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->b2(J)V

    goto :goto_0

    :cond_1
    const-string v1, "PROFILE_TAG"

    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "PATH_EXTRA"

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->X2:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/roblox/client/g;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v1, "SETTINGS_TAG"

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->a3:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/roblox/client/g;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-static {p0, v0}, Lb7/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {p0, p1, v0}, Lcom/roblox/client/g;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private a2()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OVERLAY_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->n0()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b2(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToConversation() conversation:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    const-string v1, "CHAT_CONVERSATION_ID"

    .line 3
    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/feature/FeatureState;->d(Ljava/lang/String;J)V

    .line 4
    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->c2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method private c2(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToFeature:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bundle:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->r2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method private d2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lc9/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lcom/roblox/client/g;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private e2(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToUserConversation() user:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    const-string v1, "USER_ID_EXTRA"

    .line 3
    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/feature/FeatureState;->d(Ljava/lang/String;J)V

    .line 4
    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->c2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method private f2()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->t2()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    return-void
.end method

.method private h2(Ljava/lang/String;)V
    .locals 4

    const-string v0, "rbx.main"

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "openFunCaptchaActivity: Exception parsing json data."

    .line 2
    invoke-static {v0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    const-string p1, "captchaType"

    .line 3
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "login"

    .line 4
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "cvalueType"

    .line 5
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "cvalue"

    .line 6
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "email"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_1
    const-string v3, "username"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_2
    const-string v3, "phone_number"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported credential Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :pswitch_0
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->o:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    .line 10
    :pswitch_1
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->n:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    .line 11
    :pswitch_2
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->p:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    .line 12
    :goto_2
    new-instance v2, Lcom/roblox/client/captcha/LoginCaptchaConfig;

    invoke-direct {v2, p1, v1}, Lcom/roblox/client/captcha/LoginCaptchaConfig;-><init>(Lcom/roblox/client/captcha/LoginCaptchaConfig$c;Ljava/lang/String;)V

    goto :goto_3

    .line 13
    :cond_3
    new-instance v2, Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    invoke-direct {v2}, Lcom/roblox/client/captcha/SignUpCaptchaConfig;-><init>()V

    .line 14
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openFunCaptchaActivity: config = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-static {p0, v2}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->A1(Landroid/content/Context;Lcom/roblox/client/captcha/CaptchaConfig;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x4e93

    .line 16
    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x247fbcc6 -> :sswitch_2
        -0xfd6772a -> :sswitch_1
        0x5c24b9c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private i2()V
    .locals 9

    const-string v0, "rbx.main"

    const-string v1, "processPushNotification."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v0

    invoke-virtual {v0}, Lh8/m;->b()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "EXTRA_NOTIFICATION_TYPE"

    const-string v2, ""

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "EXTRA_NOTIFICATION_VERSION"

    .line 4
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "EXTRA_NOTIFICATION_ID"

    .line 5
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const-string v7, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    if-nez v6, :cond_1

    .line 7
    invoke-virtual {v0, v7, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lla/c;->e(Ljava/lang/String;)V

    .line 9
    invoke-static {v3, v5, v4, v0}, Lcom/roblox/client/f0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 10
    :cond_1
    :try_start_0
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v8, 0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "FriendRequestReceived"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :sswitch_1
    const-string v3, "DefaultNotification"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :sswitch_2
    const-string v3, "PrivateMessageReceived"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x4

    goto :goto_0

    :sswitch_3
    const-string v3, "ChatNewMessage"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x3

    goto :goto_0

    :sswitch_4
    const-string v3, "FriendRequestAccepted"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    :cond_2
    :goto_0
    if-eqz v2, :cond_6

    if-eq v2, v8, :cond_5

    if-eq v2, v6, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    goto :goto_1

    .line 11
    :cond_3
    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X1(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_4
    const-string v1, "EXTRA_CONVERSATION_ID"

    const-wide/16 v2, -0x1

    .line 12
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_7

    .line 13
    invoke-direct {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->b2(J)V

    goto :goto_1

    .line 14
    :cond_5
    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->W1(Landroid/os/Bundle;)V

    goto :goto_1

    .line 15
    :cond_6
    invoke-static {}, Lo8/a;->a()Lo8/a;

    move-result-object v1

    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo8/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x253fa4b8 -> :sswitch_4
        0x3766c7df -> :sswitch_3
        0x3ea07f25 -> :sswitch_2
        0x664121ac -> :sswitch_1
        0x74fceef2 -> :sswitch_0
    .end sparse-switch
.end method

.method public static m2(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->N1()Lb7/a;

    move-result-object v0

    invoke-virtual {v0}, Lb7/a;->d()Lcom/roblox/client/game/a;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/t;->n(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/t;->i()I

    :cond_0
    const-string p0, "rbx.appshell"

    const-string p1, "removeGlApp() clearing app shell"

    .line 3
    invoke-static {p0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/client/game/b;->e()V

    return-void
.end method

.method private n2()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->M0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n0()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W0()V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private p2()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setupMainTabs: tabs-loaded = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->Y1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "GAMES_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    .line 7
    :goto_0
    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->V1(Lcom/roblox/client/feature/FeatureState;)V

    .line 8
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:Lcom/roblox/client/app/a;

    if-nez v0, :cond_2

    .line 9
    new-instance v0, Lcom/roblox/client/app/a;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/app/a;-><init>(Lcom/roblox/client/app/a$d;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:Lcom/roblox/client/app/a;

    .line 10
    invoke-virtual {v0}, Lcom/roblox/client/app/a;->c()V

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    if-nez v0, :cond_3

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->a1()Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    new-instance v0, Lcom/roblox/client/app/c;

    invoke-direct {v0, p0}, Lcom/roblox/client/app/c;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    .line 13
    invoke-virtual {v0}, Lcom/roblox/client/app/c;->c()V

    :cond_3
    return-void
.end method

.method private q2()V
    .locals 14

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->L()I

    move-result v0

    const/16 v1, 0x11

    const-string v2, "</body>"

    const-string v3, "</a>"

    const-string v4, "\'>"

    const-string v5, " <a href=\'"

    const-string v6, "<body>"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x5

    if-ne v0, v7, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->f0()Landroidx/fragment/app/d;

    move-result-object v0

    sget v10, Lcom/roblox/client/c0;->d:I

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    sget v10, Lcom/roblox/client/c0;->j:I

    invoke-virtual {p0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 4
    sget v11, Lcom/roblox/client/c0;->i:I

    invoke-virtual {p0, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 5
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v6, v7, [Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v8

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {v2, v9, v9, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 8
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 9
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 10
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 12
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->h:I

    .line 13
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 14
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->v:I

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$k;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$k;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->L()I

    move-result v0

    const/4 v10, 0x2

    if-ne v0, v10, :cond_1

    .line 19
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->f0()Landroidx/fragment/app/d;

    move-result-object v0

    sget v11, Lcom/roblox/client/c0;->b:I

    invoke-virtual {v0, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 20
    sget v11, Lcom/roblox/client/c0;->j:I

    invoke-virtual {p0, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 21
    sget v12, Lcom/roblox/client/c0;->i:I

    invoke-virtual {p0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 22
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v6, v10, [Ljava/lang/Object;

    sget v10, Lcom/roblox/client/c0;->e:I

    invoke-virtual {p0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v6, v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v7

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 23
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 24
    invoke-virtual {v2, v9, v9, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 25
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 26
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 27
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 29
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->f:I

    .line 30
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 31
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->v:I

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$l;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 35
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->L()I

    move-result v0

    const/4 v10, 0x3

    if-ne v0, v10, :cond_2

    .line 36
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->f0()Landroidx/fragment/app/d;

    move-result-object v0

    sget v10, Lcom/roblox/client/c0;->c:I

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 37
    sget v10, Lcom/roblox/client/c0;->j:I

    invoke-virtual {p0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 38
    sget v11, Lcom/roblox/client/c0;->i:I

    invoke-virtual {p0, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 39
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v6, v7, [Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v8

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 40
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-virtual {v2, v9, v9, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 42
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 43
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 44
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->g:I

    .line 47
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 48
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->k:I

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$m;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$m;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method private s2()V
    .locals 3

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roblox/client/c0;->l:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->k:I

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$j;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$j;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->E2:I

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$i;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$i;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$h;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private t2()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lt6/b;->b()Lt6/b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/b;->c()I

    move-result v0

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->y()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 4
    invoke-static {}, Lo6/a;->e()Lo6/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo6/a;->i(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method private u2(I)V
    .locals 2

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "retry_during_main"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 2
    invoke-static {p0, p1}, Lcom/roblox/client/startup/a;->t2(Landroidx/appcompat/app/c;I)V

    return-void
.end method

.method private v2(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_EXTRA"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 4
    sget p1, Lcom/roblox/client/t;->b:I

    sget v0, Lcom/roblox/client/t;->c:I

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private w2()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "startup:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v1

    invoke-virtual {v1}, Lw8/k;->w()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v1

    invoke-virtual {v1}, Lx7/g;->f()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lw8/d;->h()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 5
    invoke-static {}, Lc9/l;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Incomplete initialization, restarting app"

    .line 6
    invoke-static {v0, v1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    sget-object v0, Lw8/o;->p:Lw8/o;

    invoke-static {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->C1(Landroid/content/Context;Lw8/o;)Landroid/content/Intent;

    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 9
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    .line 10
    :cond_1
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0}, Lw8/k;->S()V

    return-void
.end method


# virtual methods
.method public B()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "updateViewAppSettingsLoaded:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->p2()V

    return-void
.end method

.method public E()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/k0;->S0()V

    return-void
.end method

.method public F(Landroid/os/Bundle;)V
    .locals 3

    const-string p1, "rbx.main"

    const-string v0, "Request to end the game. Performing app restoration."

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf7/b0;->l(Landroid/content/Context;)V

    .line 3
    sget-object v0, Lf7/f0;->o:Lf7/f0;

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->x2(Lf7/f0;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->M0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-static {p0}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "ROBLOXCrash"

    .line 7
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 8
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/b;->z()V

    .line 9
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/roblox/client/game/b;->B(Z)V

    .line 10
    new-instance p1, Lcom/roblox/client/f;

    invoke-direct {p1, p0}, Lcom/roblox/client/f;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    const-string v0, "Experience has been ended in the background."

    .line 11
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Z

    :goto_0
    return-void
.end method

.method public G()V
    .locals 0

    return-void
.end method

.method public H()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "showRetryUI:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget v0, Lcom/roblox/client/c0;->m3:I

    invoke-static {p0, v0}, Lc9/n;->a(Landroid/app/Activity;I)V

    .line 4
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    sget v0, Lcom/roblox/client/c0;->m3:I

    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->u2(I)V

    :cond_1
    return-void
.end method

.method public J()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/roblox/client/ActivityNativeMain$d;

    invoke-direct {v0, p0, p0}, Lcom/roblox/client/ActivityNativeMain$d;-><init>(Lcom/roblox/client/ActivityNativeMain;Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public Q()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->n2()Z

    return-void
.end method

.method public R()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "onAppStarted: "

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lx7/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/roblox/client/ActivityNativeMain$n;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$n;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 4
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public S()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToMainScreen: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v1

    invoke-virtual {v1}, Lx7/g;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->p2()V

    .line 3
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->P1()V

    :cond_1
    return-void
.end method

.method public Z(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0}, Lcom/roblox/client/game/MainActivityController;->a()Z

    move-result v0

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0, p1}, Lcom/roblox/client/game/MainActivityController;->b(Z)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAppReady: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$b;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    const-string v0, "Landing"

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "Home"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    if-eqz v0, :cond_2

    const-string v0, "Login"

    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    invoke-virtual {p1}, Lcom/roblox/client/app/c;->e()V

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->s1()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Push"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 9
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/n;->l()Lna/d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lna/d;->y(Landroid/content/Context;)V

    goto :goto_1

    .line 10
    :cond_3
    :goto_0
    invoke-static {}, Lcom/roblox/client/c1;->e()Lcom/roblox/client/c1;

    move-result-object p1

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$c;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Lcom/roblox/client/c1;->b(Lcom/roblox/client/c1$c;)V

    .line 11
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->shouldDisplayOpenGLUnsupportedMessage()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 12
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->q2()V

    :cond_4
    :goto_1
    return-void
.end method

.method public f0()Landroidx/fragment/app/d;
    .locals 0

    return-object p0
.end method

.method public finish()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 4
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_0
    return-void
.end method

.method public g2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lv8/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public h()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "navigateToLandingScreen:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/client/n;->p(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "send_app_input_focus_to_lua"

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

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

.method public j2()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->s2()V

    return-void
.end method

.method public k2()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "Registering activity result for IdentityProtocol."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lc/d;

    invoke-direct {v0}, Lc/d;-><init>()V

    new-instance v1, Lcom/roblox/client/b;

    invoke-direct {v1, p0}, Lcom/roblox/client/b;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->v0(Lc/a;Landroidx/activity/result/a;)Landroidx/activity/result/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Landroidx/activity/result/b;

    return-void
.end method

.method public l2()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "Registering activity result for NativeUtilProtocol."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lc/d;

    invoke-direct {v0}, Lc/d;-><init>()V

    new-instance v1, Lcom/roblox/client/a;

    invoke-direct {v1, p0}, Lcom/roblox/client/a;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->v0(Lc/a;Landroidx/activity/result/a;)Landroidx/activity/result/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Landroidx/activity/result/b;

    return-void
.end method

.method public n()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->M1()V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->w2()V

    return-void
.end method

.method public n0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->M1()V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->w2()V

    return-void
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0}, Lcom/roblox/client/game/MainActivityController;->l()V

    return-void
.end method

.method public o0(Lcom/roblox/client/app/d;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->K1()V

    .line 2
    iget-object v0, p1, Lcom/roblox/client/app/d;->d:Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Lcom/roblox/client/n0;

    invoke-direct {v0}, Lcom/roblox/client/n0;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v0, Le7/i;

    invoke-direct {v0}, Le7/i;-><init>()V

    .line 4
    :goto_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/app/AppWebViewLifecycleObserver;

    invoke-direct {v3}, Lcom/roblox/client/app/AppWebViewLifecycleObserver;-><init>()V

    invoke-virtual {v2, v3}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-direct {v3}, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;-><init>()V

    invoke-virtual {v2, v3}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 6
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 7
    iget-object v3, p1, Lcom/roblox/client/app/d;->a:Ljava/lang/String;

    const-string v4, "DEFAULT_URL"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "USE_APP_HYBRID"

    .line 8
    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    iget-object v3, p1, Lcom/roblox/client/app/d;->c:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "VISIBLE"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    iget-object v3, p1, Lcom/roblox/client/app/d;->e:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 11
    iget-object p1, p1, Lcom/roblox/client/app/d;->b:Ljava/lang/String;

    const-string v3, "TITLE_STRING"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "HAS_PARENT"

    .line 12
    invoke-virtual {v2, p1, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "HIDE_ACCESSORY_BUTTONS"

    .line 13
    invoke-virtual {v2, p1, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 14
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object p1

    .line 16
    sget v1, Lcom/roblox/client/y;->m:I

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->a2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v0, v2}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Landroidx/fragment/app/t;->g(Ljava/lang/String;)Landroidx/fragment/app/t;

    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/t;->i()I

    return-void
.end method

.method protected o2(Z)V
    .locals 2

    .line 1
    new-instance v0, Lh9/a;

    invoke-direct {v0, p1}, Lh9/a;-><init>(Z)V

    .line 2
    iget-object p1, v0, Lh9/c;->a:Ljava/lang/String;

    iget-object v1, v0, Lh9/c;->b:Ljava/lang/String;

    iget-object v0, v0, Lh9/c;->c:Ljava/lang/String;

    invoke-static {p1, v1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: requestCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Intent data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_8

    const/16 v2, 0x4e88

    const/4 v3, 0x1

    if-eq p1, v2, :cond_7

    const/16 v2, 0x4e8e

    if-eq p1, v2, :cond_6

    const/16 v0, 0x4e93

    if-eq p1, v0, :cond_4

    const/16 v0, 0x4e99

    if-eq p1, v0, :cond_3

    const/16 v0, 0x4e9c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4e9d

    if-eq p1, v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/i0;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {p3}, Lm8/g;->b(Landroid/content/Intent;)V

    goto :goto_1

    .line 4
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x16

    if-lt p1, p2, :cond_2

    .line 5
    invoke-static {}, Lv8/b;->a()V

    .line 6
    :cond_2
    invoke-virtual {p0, v3}, Lcom/roblox/client/ActivityNativeMain;->o2(Z)V

    goto :goto_1

    .line 7
    :cond_3
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    if-eqz p1, :cond_8

    .line 8
    invoke-virtual {p1, p2, p3}, Lcom/roblox/client/app/c;->d(ILandroid/content/Intent;)V

    goto :goto_1

    .line 9
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onActivityResult from FunCaptcha: code:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", result:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x65

    if-ne p2, p3, :cond_5

    const-string p2, "success"

    goto :goto_0

    :cond_5
    const-string p2, "dismiss"

    .line 10
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    new-instance p2, Lh9/a;

    invoke-direct {p2, v3}, Lh9/a;-><init>(Z)V

    invoke-virtual {p1, p2}, Lcom/roblox/client/game/b;->A(Lh9/c;)V

    .line 13
    new-instance p1, Lcom/roblox/client/feature/FeatureState;

    const-string p2, "HOME_TAG"

    invoke-direct {p1, p2}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->r2(Lcom/roblox/client/feature/FeatureState;)V

    goto :goto_1

    :cond_6
    if-ne p2, v0, :cond_8

    .line 14
    invoke-direct {p0, p3}, Lcom/roblox/client/ActivityNativeMain;->Z1(Landroid/content/Intent;)V

    goto :goto_1

    .line 15
    :cond_7
    iput-boolean v3, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_8
    :goto_1
    return-void
.end method

.method public onBackButtonNotConsumedEvent(La7/c;)V
    .locals 0
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->j2()V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n0()I

    move-result v0

    if-lez v0, :cond_3

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/roblox/client/y;->m:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->i0(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lcom/roblox/client/t0;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/roblox/client/t0;

    .line 5
    invoke-virtual {v0}, Lcom/roblox/client/t0;->T2()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/roblox/client/t0;->Q2()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W0()V

    goto :goto_0

    .line 7
    :cond_0
    instance-of v1, v0, Lcom/roblox/client/z0;

    if-eqz v1, :cond_1

    .line 8
    check-cast v0, Lcom/roblox/client/z0;

    .line 9
    invoke-virtual {v0}, Lcom/roblox/client/z0;->t2()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/roblox/client/z0;->q2()Z

    move-result v0

    if-nez v0, :cond_2

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W0()V

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W0()V

    :cond_2
    :goto_0
    return-void

    .line 12
    :cond_3
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->N1()Lb7/a;

    move-result-object v0

    invoke-virtual {v0}, Lb7/a;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    .line 13
    :cond_4
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->j2()V

    return-void
.end method

.method public onCodeParsedFromSMS(La7/o;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "rbx.main"

    const-string v1, "SMS code received."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->F()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Calling IdentityProtocol to parse OTP."

    .line 3
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->g()Lja/e;

    move-result-object v0

    iget-object p1, p1, La7/o;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {v0, p1}, Lja/e;->l(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "EnableAndroidGetSMSOTPTemp"

    .line 6
    invoke-static {v1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Calling NativeUtilProtocol to parse OTP."

    .line 7
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->k()Ly9/i;

    move-result-object v0

    iget-object p1, p1, La7/o;->a:Ljava/lang/String;

    .line 9
    invoke-virtual {v0, p1}, Ly9/i;->z(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-static {}, Lcom/roblox/client/startup/ActivitySplash;->F1()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "rbx.main"

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lw8/d;->h()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "RESTART_AFTER_PROCESS_DEATH"

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lw8/k;->y(Z)V

    .line 4
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    .line 5
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 7
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    .line 8
    :cond_0
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v3, "main_activity_oncreate"

    invoke-virtual {v0, v3}, Lma/a;->b(Ljava/lang/String;)V

    .line 9
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate NativeMain. savedInstanceState is null: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    if-nez p1, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    invoke-virtual {v0}, Ls7/b;->j()Ls7/f;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ls7/f;

    .line 12
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lw8/k;->P(Lw8/l;)V

    .line 13
    sget v0, Lcom/roblox/client/a0;->e:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/i0;->setContentView(I)V

    if-eqz p1, :cond_2

    const-string v0, "BACK_FROM_GAME"

    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    .line 15
    :cond_2
    invoke-static {p0}, Lka/a;->c(Landroid/content/Context;)V

    .line 16
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-nez v0, :cond_3

    .line 17
    invoke-static {}, Lka/a;->d()Lka/a;

    move-result-object v0

    sget-object v4, Lka/a$a;->o:Lka/a$a;

    invoke-virtual {v0, v4, p1}, Lka/a;->a(Lka/a$a;Landroid/os/Bundle;)V

    .line 18
    :cond_3
    sget p1, Lcom/roblox/client/y;->l:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    .line 19
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->L1()V

    .line 20
    sget p1, Lcom/roblox/client/y;->A0:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    .line 21
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object p1

    invoke-virtual {p1}, Lf7/b0;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 22
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v0, Lcom/roblox/client/e;

    invoke-direct {v0, p0}, Lcom/roblox/client/e;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 23
    :cond_4
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    :goto_1
    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    .line 25
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez p1, :cond_5

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->N0()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 26
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->R0()J

    move-result-wide v8

    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setup mPendingPurchaseExecutor to run every "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " seconds"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    new-instance v4, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-direct {v4, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    iput-object v4, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 29
    new-instance v5, Lcom/roblox/client/ActivityNativeMain$e;

    invoke-direct {v5, p0}, Lcom/roblox/client/ActivityNativeMain$e;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v6, v8

    invoke-virtual/range {v4 .. v10}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 30
    :cond_5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->p0()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 31
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k2()V

    goto :goto_2

    :cond_6
    const-string p1, "Autofill phone number not enabled!"

    .line 32
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    const-string p1, "EnableAndroidNativeUtilProtocol"

    .line 33
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "EnableAndroidGetPhoneNumberTemp"

    .line 34
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 35
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->p0()Z

    move-result p1

    if-nez p1, :cond_7

    .line 36
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l2()V

    .line 37
    :cond_7
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->h1()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Ly8/i;

    if-nez p1, :cond_8

    .line 38
    new-instance p1, Ly8/i;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, v0}, Ly8/i;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Ly8/i;

    .line 39
    invoke-virtual {p1}, Ly8/i;->a()V

    .line 40
    :cond_8
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object p1

    invoke-virtual {p1}, Lh8/m;->k()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 41
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->i2()V

    :cond_9
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string v0, "onDestroy: App was previously destroyed due to process death"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0}, Lcom/roblox/client/i0;->onDestroy()V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDestroy. isFinishing = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    .line 6
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    iget-object v1, v1, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v2, Lf7/f0;->n:Lf7/f0;

    if-ne v1, v2, :cond_1

    .line 7
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lf7/b0;->g(Z)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    .line 9
    invoke-static {p0, v1}, Lcom/roblox/client/ActivityNativeMain;->m2(Lcom/roblox/client/ActivityNativeMain;Z)V

    :goto_0
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    .line 11
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v1

    invoke-virtual {v1, p0}, Lw8/k;->U(Lw8/l;)V

    .line 12
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->Z:Lcom/roblox/client/app/a;

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v1}, Lcom/roblox/client/app/a;->e()V

    .line 14
    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:Lcom/roblox/client/app/a;

    .line 15
    :cond_2
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    if-eqz v1, :cond_3

    .line 16
    invoke-virtual {v1}, Lcom/roblox/client/app/c;->h()V

    .line 17
    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lcom/roblox/client/app/c;

    .line 18
    :cond_3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->h1()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 19
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Ly8/i;

    if-eqz v1, :cond_4

    .line 20
    invoke-virtual {v1}, Ly8/i;->b()V

    .line 21
    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Ly8/i;

    .line 22
    :cond_4
    invoke-super {p0}, Lcom/roblox/client/i0;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0, p2}, Lcom/roblox/client/game/MainActivityController;->i(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0, p2}, Lcom/roblox/client/game/MainActivityController;->j(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onNavigateToConversationEvent(La7/h;)V
    .locals 5
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-wide v0, p1, La7/h;->b:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 2
    invoke-direct {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->e2(J)V

    goto :goto_0

    .line 3
    :cond_0
    iget-wide v0, p1, La7/h;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->b2(J)V

    :goto_0
    return-void
.end method

.method public onNavigateToFeatureEvent(La7/i;)V
    .locals 7
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigateToFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, La7/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v2, "FRIEND_FINDER_TAG"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v2, "UNIVERSAL_FRIENDS_TAG"

    .line 3
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->O1()La7/i;

    move-result-object p1

    .line 5
    :cond_1
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v2, "PROFILE_TAG"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p1, La7/i;->b:Ljava/lang/String;

    sget v1, Lcom/roblox/client/c0;->X2:I

    iget-boolean v2, p1, La7/i;->e:Z

    invoke-virtual {p1}, La7/i;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lcom/roblox/client/g;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    goto/16 :goto_4

    .line 7
    :cond_2
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v2, "GAME_DETAILS_TAG"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "games/"

    if-eqz v0, :cond_3

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, La7/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->H2:I

    iget-boolean v2, p1, La7/i;->e:Z

    invoke-virtual {p1}, La7/i;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lcom/roblox/client/g;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    goto/16 :goto_4

    .line 9
    :cond_3
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "CUSTOM_WEBVIEW_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "YOUTUBE_TAG"

    if-nez v0, :cond_f

    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_1

    .line 10
    :cond_4
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "SOCIAL_MEDIA_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11
    new-instance v0, Lv8/a;

    invoke-direct {v0, v1}, Lv8/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, La7/i;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lv8/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 12
    :cond_5
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "MY_FEED_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "feeds/inapp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->U2:I

    iget-boolean v2, p1, La7/i;->e:Z

    invoke-virtual {p1}, La7/i;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lcom/roblox/client/g;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    goto/16 :goto_4

    .line 14
    :cond_6
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "SEARCH_GAMES_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 15
    iget-object v0, p1, La7/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/p0;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->Y2:I

    iget-boolean v2, p1, La7/i;->e:Z

    invoke-virtual {p1}, La7/i;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lcom/roblox/client/g;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    goto/16 :goto_4

    .line 16
    :cond_7
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "GAMES_SEE_ALL_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 17
    iget-object v0, p1, La7/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/p0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->R2:I

    iget-boolean v2, p1, La7/i;->e:Z

    invoke-virtual {p1}, La7/i;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lcom/roblox/client/g;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    goto/16 :goto_4

    .line 18
    :cond_8
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "ABUSE_REPORT_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 19
    iget-object v0, p1, La7/i;->b:Ljava/lang/String;

    invoke-virtual {p1}, La7/i;->f()Z

    move-result p1

    invoke-static {p0, v0, p1}, Lcom/roblox/client/g;->d(Landroid/app/Activity;Ljava/lang/String;Z)V

    goto/16 :goto_4

    .line 20
    :cond_9
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v3, "ANIMATED_ASSET_DETAILS_TAG"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 21
    iget-object v0, p1, La7/i;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "catalog/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, La7/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 23
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v2, v0

    .line 24
    sget v0, Lcom/roblox/client/c0;->c3:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p1, La7/i;->e:Z

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/roblox/client/g;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    goto/16 :goto_4

    .line 25
    :cond_b
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v2, "CAPTCHA_SUCCESS_TAG"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string p1, "NavigateToFeature: Received \'CAPTCHA_SUCCESS\' tag. Do nothing for now."

    .line 26
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    .line 27
    :cond_c
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v1, "CAPTCHA_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 28
    invoke-virtual {p1}, La7/i;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->h2(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 29
    :cond_d
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v1, "SCAN_QR_CODE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 p1, 0x4e9d

    .line 30
    invoke-static {p0, p1}, Lm8/g;->d(Landroid/app/Activity;I)V

    goto/16 :goto_4

    .line 31
    :cond_e
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lb7/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, La7/i;->b:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/roblox/client/ActivityNativeMain;->d2(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_f
    :goto_1
    const/4 v0, 0x0

    .line 32
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, La7/i;->d()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string v2, "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    .line 33
    invoke-static {v1, v2}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    move-object v2, v0

    :goto_2
    if-eqz v2, :cond_15

    const-string v4, "title"

    .line 34
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "url"

    .line 35
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_14

    .line 37
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v6

    invoke-interface {v6}, Lc7/e;->j()Z

    move-result v6

    if-eqz v6, :cond_11

    iget-object v6, p1, La7/i;->a:Ljava/lang/String;

    .line 38
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 39
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v3

    if-eqz v3, :cond_11

    .line 40
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 41
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 42
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_10

    .line 43
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    :cond_10
    const-string p1, "Unable to handle youtube links on Maquettes device."

    .line 44
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-void

    .line 45
    :cond_11
    iget-boolean p1, p1, La7/i;->e:Z

    if-nez p1, :cond_12

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 46
    invoke-static {p0, v5, v4, p1, v0}, Lcom/roblox/client/g;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_4

    :cond_12
    const-string p1, "searchParams"

    .line 47
    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_13

    .line 48
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 49
    :cond_13
    invoke-static {p0, v5, v4, v0}, Lcom/roblox/client/g;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_14
    const-string p1, "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    .line 50
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    :goto_4
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onPause()V

    const-string v0, "rbx.main"

    const-string v1, "onPause"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lha/a;->g()Lha/a;

    move-result-object v0

    invoke-virtual {v0}, Lha/a;->i()V

    .line 4
    invoke-static {}, Lka/a;->d()Lka/a;

    move-result-object v0

    sget-object v1, Lka/a$a;->o:Lka/a$a;

    invoke-virtual {v0, v1}, Lka/a;->b(Lka/a$a;)V

    .line 5
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lx7/d;->g(Lx7/d$e;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->l()Lna/d;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lna/d;->t(I[Ljava/lang/String;[I)V

    return-void
.end method

.method protected onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onResume()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResume: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v1

    invoke-virtual {v1}, Lx7/g;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    invoke-virtual {v0}, Ls7/b;->j()Ls7/f;

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ls7/f;

    if-eq v2, v0, :cond_0

    .line 5
    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ls7/f;

    const-string v0, "onResume: Recreating activity due to Locale change."

    .line 6
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lw8/k;->P(Lw8/l;)V

    .line 9
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 10
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->w2()V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    iget-object v0, v0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v3, Lf7/f0;->n:Lf7/f0;

    if-ne v0, v3, :cond_2

    .line 12
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v0

    invoke-virtual {v0}, Lh8/m;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lf7/b0;->g(Z)V

    .line 14
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Z

    if-eqz v0, :cond_3

    .line 15
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/roblox/client/game/b;->B(Z)V

    .line 16
    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Z

    .line 17
    :cond_3
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->l()Lna/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lna/d;->A(Landroid/app/Activity;)V

    .line 18
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->o0()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 19
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->l()Lna/d;

    move-result-object v0

    invoke-virtual {v0}, Lna/d;->z()V

    .line 20
    :cond_4
    invoke-static {}, Lha/a;->g()Lha/a;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v3, 0x4e9c

    new-instance v4, Lcom/roblox/client/d;

    invoke-direct {v4, p0}, Lcom/roblox/client/d;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p0, v2, v3, v4}, Lha/a;->h(Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V

    .line 21
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p0()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "Setting result launcher for IdentityProtocol"

    .line 22
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/roblox/client/n;->g()Lja/e;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Landroidx/activity/result/b;

    .line 25
    invoke-virtual {v0, v2}, Lja/e;->v(Landroidx/activity/result/b;)V

    :cond_5
    const-string v0, "EnableAndroidNativeUtilProtocol"

    .line 26
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "EnableAndroidGetPhoneNumberTemp"

    .line 27
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 28
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p0()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "Setting result launcher for NativeUtilProtocol"

    .line 29
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/roblox/client/n;->k()Ly9/i;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Landroidx/activity/result/b;

    .line 32
    invoke-virtual {v0, v1}, Ly9/i;->N(Landroidx/activity/result/b;)V

    .line 33
    :cond_6
    invoke-static {}, Lc9/l;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 34
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->e()Lea/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lea/d;->t(Landroid/app/Activity;)V

    :cond_7
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    const-string v1, "BACK_FROM_GAME"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 2
    invoke-super {p0, p1}, Lcom/roblox/client/k0;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onStart()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/d1;->a:Landroid/util/DisplayMetrics;

    .line 3
    sget v0, Lcom/roblox/client/i0;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    iget-object v0, v0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v1, Lf7/f0;->o:Lf7/f0;

    if-ne v0, v1, :cond_0

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationForegrounded()V

    .line 5
    :cond_0
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    .line 6
    invoke-static {}, Lo9/g;->h()Lo9/g;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo9/g;->i(Lo9/g$c;)V

    const-string v0, "main"

    .line 7
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lia/a;->f()Lia/a;

    move-result-object v0

    invoke-virtual {v0}, Lia/a;->d()V

    .line 9
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    iget-object v0, v0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v1, Lf7/f0;->n:Lf7/f0;

    if-ne v0, v1, :cond_1

    .line 10
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->p()V

    .line 11
    :cond_1
    invoke-static {}, Loa/a;->c()Loa/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a;->a()V

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 2
    sget v0, Lcom/roblox/client/i0;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    iget-object v0, v0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v1, Lf7/f0;->o:Lf7/f0;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationBackgrounded()V

    .line 4
    :cond_0
    invoke-static {}, Lo9/g;->h()Lo9/g;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo9/g;->j(Lo9/g$c;)V

    .line 5
    invoke-static {}, Lia/a;->f()Lia/a;

    move-result-object v0

    invoke-virtual {v0}, Lia/a;->e()V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    iget-object v0, v0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v1, Lf7/f0;->n:Lf7/f0;

    if-ne v0, v1, :cond_1

    .line 7
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->n()V

    .line 8
    :cond_1
    invoke-static {}, Loa/a;->c()Loa/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a;->b()V

    .line 9
    invoke-super {p0}, Lcom/roblox/client/i0;->onStop()V

    const-string v0, "rbx.main"

    const-string v1, "onStop"

    .line 10
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/k0;->onTrimMemory(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0, p1}, Lcom/roblox/client/game/MainActivityController;->k(I)V

    return-void
.end method

.method public q(ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x65

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "game_init_params"

    .line 1
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lf7/z;->c(Landroid/os/Bundle;)Lf7/z;

    move-result-object p1

    .line 2
    invoke-static {p1, p0}, Lcom/roblox/client/g;->j(Lf7/z;Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    const-string p1, "rbx.main"

    const-string v0, "ANM.handleNotification() Logout event..."

    .line 3
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UserDidLogout()V

    .line 5
    invoke-static {}, Lr8/c;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    new-instance p1, Lcom/roblox/client/ActivityNativeMain$n;

    invoke-direct {p1, p0}, Lcom/roblox/client/ActivityNativeMain$n;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    .line 7
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, p2, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p2}, Lx7/b;->f(Landroid/os/Bundle;)Lx7/b$f;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->p1(Lx7/b$f;)V

    :goto_0
    return-void
.end method

.method public r2(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ANM.showFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->N1()Lb7/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb7/a;->g(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string p1, "Share data is empty"

    .line 2
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "url"

    .line 4
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "context"

    .line 5
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 7
    :cond_1
    invoke-static {v0, p1}, Lv8/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0xa000000

    const/4 v2, 0x0

    .line 12
    invoke-static {p0, v2, p1, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    .line 13
    invoke-virtual {p0, v2}, Lcom/roblox/client/ActivityNativeMain;->o2(Z)V

    .line 14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x16

    const/16 v3, 0x4e9c

    const/4 v4, 0x0

    if-lt v1, v2, :cond_2

    .line 15
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    .line 16
    invoke-static {v0, v4, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 17
    :cond_2
    invoke-static {v0, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    return-void

    :catch_0
    const-string p1, "Error parsing share data."

    .line 18
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public x(Lcom/roblox/client/app/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n0()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/roblox/client/y;->m:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->i0(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lcom/roblox/client/t0;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/roblox/client/t0;

    invoke-virtual {v0, p1}, Lcom/roblox/client/t0;->i3(Lcom/roblox/client/app/d;)V

    :cond_0
    return-void
.end method

.method public x2(Lf7/f0;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0, p1}, Lcom/roblox/client/game/MainActivityController;->m(Lf7/f0;)V

    return-void
.end method

.method public y(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->g0()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p2}, Landroidx/fragment/app/t;->t(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 5
    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/t;->i()I

    :cond_1
    return-void
.end method

.method public z()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/client/game/MainActivityController;

    invoke-virtual {v0}, Lcom/roblox/client/game/MainActivityController;->z()V

    return-void
.end method
