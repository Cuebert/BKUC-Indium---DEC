.class public Lcom/roblox/client/game/c;
.super Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/c$b;,
        Lcom/roblox/client/game/c$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private c:Lcom/roblox/client/game/c$a;

.field private d:Lcom/roblox/client/game/c$b;

.field private e:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/c$a;Lcom/roblox/client/game/c$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;-><init>()V

    const-string v0, "rbx.datamodel"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/game/c;->a:Ljava/lang/String;

    const-string v0, "OPEN_YOUTUBE_VIDEO"

    .line 3
    iput-object v0, p0, Lcom/roblox/client/game/c;->b:Ljava/lang/String;

    .line 4
    new-instance v0, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-direct {v0}, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/game/c;->e:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    .line 5
    iput-object p1, p0, Lcom/roblox/client/game/c;->c:Lcom/roblox/client/game/c$a;

    .line 6
    iput-object p2, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/game/c;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/game/c;->c(Lorg/json/JSONObject;)V

    return-void
.end method

.method private c(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {v0}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/g;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDataModelNotification() type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.datamodel"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "VIEW_PROFILE"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const-string p1, "PROFILE_TAG"

    .line 3
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 6
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    const-string v0, "SCAN_QR_CODE"

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 8
    new-instance p1, La7/i;

    invoke-direct {p1, v0}, La7/i;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    const-string v0, "REPORT_ABUSE"

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    new-instance p1, La7/i;

    const-string v0, "ABUSE_REPORT_TAG"

    invoke-direct {p1, v0}, La7/i;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 14
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    const-string v0, "VIEW_GAME_DETAILS"

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "GAME_DETAILS_TAG"

    .line 16
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 17
    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 19
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    const-string v0, "PRIVACY_SETTINGS"

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "SETTINGS_TAG"

    .line 21
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 22
    invoke-static {}, Lcom/roblox/client/p0;->V()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 24
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    const-string v0, "BACK_BUTTON_NOT_CONSUMED"

    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 26
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    new-instance p2, La7/c;

    invoke-direct {p2}, La7/c;-><init>()V

    invoke-virtual {p1, p2}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_6
    const-string v0, "PURCHASE_ROBUX"

    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 28
    new-instance p1, Ly7/e;

    iget-object p2, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p2}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p2

    const-string v0, "tabAvatar"

    invoke-direct {p1, p2, v0}, Ly7/e;-><init>(Lcom/roblox/client/m0;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/roblox/client/game/c;->e:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-virtual {p1, p2}, Ly7/e;->g(Landroidx/lifecycle/k;)V

    goto/16 :goto_3

    :cond_7
    const-string v0, "VIEW_NOTIFICATIONS"

    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 30
    new-instance p1, Ly7/d;

    iget-object p2, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p2}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p2

    invoke-direct {p1, p2}, Ly7/d;-><init>(Landroidx/fragment/app/Fragment;)V

    iget-object p2, p0, Lcom/roblox/client/game/c;->e:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-virtual {p1, p2}, Ly7/d;->f(Landroidx/lifecycle/k;)V

    goto/16 :goto_3

    :cond_8
    const-string v0, "APP_READY"

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 32
    iget-object p1, p0, Lcom/roblox/client/game/c;->c:Lcom/roblox/client/game/c$a;

    invoke-interface {p1, p2}, Lcom/roblox/client/game/c$a;->d(Ljava/lang/String;)V

    .line 33
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->f1()Z

    move-result p1

    if-nez p1, :cond_1e

    .line 34
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 35
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    .line 36
    invoke-interface {p2}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lla/c;->s(Landroid/content/Context;)V

    goto/16 :goto_3

    :cond_9
    const-string v0, "CLOSE_MODAL"

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto/16 :goto_3

    :cond_a
    const-string v0, "VIEW_GAME_DETAILS_ANIMATED"

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string p1, "ANIMATED_ASSET_DETAILS_TAG"

    .line 41
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 42
    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 44
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_b
    const-string v0, "OPEN_CUSTOM_WEBVIEW"

    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    const-string v0, "OPEN_SETTINGS_WEBVIEW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_2

    :cond_c
    const-string v0, "OPEN_BUILDERS_CLUB"

    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 47
    new-instance p1, Ly7/b;

    iget-object p2, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p2}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p2

    const-string v0, "tabMore"

    invoke-direct {p1, p2, v0}, Ly7/b;-><init>(Lcom/roblox/client/m0;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/roblox/client/game/c;->e:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-virtual {p1, p2}, Ly7/b;->c(Landroidx/lifecycle/k;)V

    goto/16 :goto_3

    :cond_d
    const-string v0, "VIEW_MY_FEED"

    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string p1, "MY_FEED_TAG"

    .line 49
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 50
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 51
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_e
    const-string v0, "SEARCH_GAMES"

    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string p1, "SEARCH_GAMES_TAG"

    .line 53
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 54
    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 56
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_f
    const-string v0, "GAMES_SEE_ALL"

    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const-string p1, "GAMES_SEE_ALL_TAG"

    .line 58
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 59
    invoke-virtual {p1, p2}, La7/i;->i(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 61
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_10
    const-string v0, "ACTION_LOG_OUT"

    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 63
    new-instance p1, Ly7/c;

    iget-object p2, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p2}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p2

    invoke-direct {p1, p2}, Ly7/c;-><init>(Lcom/roblox/client/m0;)V

    iget-object p2, p0, Lcom/roblox/client/game/c;->e:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-virtual {p1, p2}, Ly7/c;->c(Landroidx/lifecycle/k;)V

    goto/16 :goto_3

    :cond_11
    const-string v0, "LUA_HOME_PAGE_LOADED"

    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 65
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object p1

    invoke-virtual {p1, v2}, Ln6/d;->c(Z)V

    const-string p1, "LuaHomePageLoaded"

    .line 66
    invoke-static {p1}, Ln6/f;->a(Ljava/lang/String;)V

    .line 67
    invoke-static {}, Ln6/f;->d()V

    goto/16 :goto_3

    :cond_12
    const-string v0, "LAUNCH_CONVERSATION"

    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-wide/16 v2, -0x1

    .line 69
    :try_start_0
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p1, "could not parse data"

    .line 70
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    move-wide p1, v2

    :goto_1
    cmp-long v0, p1, v2

    if-eqz v0, :cond_1e

    .line 71
    new-instance v0, La7/h;

    invoke-direct {v0, p1, p2}, La7/h;-><init>(J)V

    .line 72
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_13
    const-string v0, "UNIVERSAL_FRIENDS"

    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 74
    new-instance p1, La7/i;

    const-string p2, "UNIVERSAL_FRIENDS_TAG"

    invoke-direct {p1, p2}, La7/i;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_14
    const-string v0, "OPEN_YOUTUBE_VIDEO"

    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string p1, "YOUTUBE_TAG"

    .line 77
    invoke-static {p1, p2}, La7/i;->a(Ljava/lang/String;Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 78
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 79
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_15
    const-string v0, "ACTION_LOG_IN"

    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 81
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object p1

    invoke-virtual {p1}, Ln6/d;->g()V

    .line 82
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 83
    invoke-static {p1}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p1

    invoke-virtual {p1}, Lw8/k;->K()V

    goto/16 :goto_3

    :cond_16
    const-string v0, "DID_LOG_IN"

    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 85
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 86
    invoke-static {p1, p2}, Lw8/k;->H(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_17
    const-string v0, "DID_SIGN_UP"

    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 88
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object p1

    invoke-virtual {p1}, Ln6/d;->g()V

    .line 89
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 90
    invoke-static {p1}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p1

    invoke-virtual {p1, p2}, Lw8/k;->J(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_18
    const-string v0, "DID_LOG_OUT"

    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 92
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 93
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p2

    invoke-virtual {p2}, Lx7/g;->f()Z

    move-result p2

    if-eqz p2, :cond_1e

    .line 94
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p2

    sget-object v0, Lx7/b$f;->o:Lx7/b$f;

    invoke-virtual {p2, p1, v0}, Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V

    .line 95
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object p1

    invoke-virtual {p1}, Lfa/a;->c()V

    .line 96
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->J0()Z

    move-result p1

    if-eqz p1, :cond_1e

    .line 97
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStop()V

    goto/16 :goto_3

    :cond_19
    const-string v0, "DID_SWITCH_ACCOUNT"

    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 99
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 100
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lx7/b;->i(Landroid/app/Activity;)V

    .line 101
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object p1

    invoke-virtual {p1}, Lfa/a;->c()V

    goto/16 :goto_3

    :cond_1a
    const-string v0, "OPEN_CAPTCHA_VIEW"

    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const-string p1, "CAPTCHA_TAG"

    .line 103
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 104
    invoke-virtual {p1, p2}, La7/i;->g(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 106
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1b
    const-string v0, "LUA_UNAUTHORIZED_LOG_OUT"

    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 108
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 109
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p2

    invoke-virtual {p2}, Lx7/g;->f()Z

    move-result p2

    if-eqz p2, :cond_1e

    .line 110
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p2

    sget-object v0, Lx7/b$f;->r:Lx7/b$f;

    invoke-virtual {p2, p1, v0}, Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V

    goto :goto_3

    :cond_1c
    const-string v0, "NATIVE_SHARE"

    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1e

    .line 112
    iget-object p1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {p1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 113
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1e

    instance-of v0, p1, Lv8/d;

    if-eqz v0, :cond_1e

    .line 114
    check-cast p1, Lv8/d;

    invoke-interface {p1, p2}, Lv8/d;->s(Ljava/lang/String;)V

    goto :goto_3

    :cond_1d
    :goto_2
    const-string p1, "CUSTOM_WEBVIEW_TAG"

    .line 115
    invoke-static {p1}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object p1

    .line 116
    invoke-virtual {p1, p2}, La7/i;->g(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p1, v2}, La7/i;->j(Z)V

    .line 118
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lbc/c;->j(Ljava/lang/Object;)V

    :cond_1e
    :goto_3
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    invoke-interface {v0}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object v0

    new-instance v1, Lf7/g;

    invoke-direct {v1, p0}, Lf7/g;-><init>(Lcom/roblox/client/game/c;)V

    invoke-virtual {v0, v1}, Lfa/a;->b(Lfa/a$b;)V

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->f1()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/c;->d:Lcom/roblox/client/game/c$b;

    .line 5
    invoke-interface {v1}, Lcom/roblox/client/game/c$b;->a()Lcom/roblox/client/m0;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lla/c;->s(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
