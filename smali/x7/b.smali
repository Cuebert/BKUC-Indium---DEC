.class public Lx7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/b$g;,
        Lx7/b$e;,
        Lx7/b$c;,
        Lx7/b$f;,
        Lx7/b$d;
    }
.end annotation


# static fields
.field private static e:Z

.field private static f:Z

.field public static g:Z


# instance fields
.field private a:Lx7/b$d;

.field private b:Lx7/b$c;

.field private c:Z

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lx7/b$d;->n:Lx7/b$d;

    iput-object v0, p0, Lx7/b;->a:Lx7/b$d;

    .line 4
    sget-object v0, Lx7/b$c;->n:Lx7/b$c;

    iput-object v0, p0, Lx7/b;->b:Lx7/b$c;

    const-string v0, "rbx.AppManager"

    const-string v1, "[AppManager]: Constructor called."

    .line 5
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method synthetic constructor <init>(Lx7/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx7/b;-><init>()V

    return-void
.end method

.method static synthetic a(Z)Z
    .locals 0

    sput-boolean p0, Lx7/b;->e:Z

    return p0
.end method

.method private c(Lx7/b$f;)V
    .locals 4

    .line 1
    sget-object v0, Lx7/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "manual"

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    const-string v3, "luaapp"

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    const-string v2, "failedSessionCheck"

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fireLogoutEvent: Unknown logoutType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.AppManager"

    invoke-static {v0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v2, v3}, Lcom/roblox/client/f0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "webview"

    .line 4
    invoke-static {v2, p1}, Lcom/roblox/client/f0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, "native"

    .line 5
    invoke-static {v2, p1}, Lcom/roblox/client/f0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_3
    invoke-static {v2, v3}, Lcom/roblox/client/f0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_4
    invoke-static {v2, v2}, Lcom/roblox/client/f0;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static d()Z
    .locals 2

    .line 1
    sget-boolean v0, Lx7/b;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    sput-boolean v1, Lx7/b;->f:Z

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public static e()Lx7/b;
    .locals 1

    sget-object v0, Lx7/b$e;->a:Lx7/b;

    return-object v0
.end method

.method public static f(Landroid/os/Bundle;)Lx7/b$f;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "logout_type"

    .line 1
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    check-cast p0, Lx7/b$f;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "rbx.AppManager"

    const-string v0, "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!"

    .line 2
    invoke-static {p0, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    sget-object p0, Lx7/b$f;->n:Lx7/b$f;

    return-object p0
.end method

.method private j(Landroid/content/Context;)V
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 2
    new-instance v0, Landroid/app/NotificationChannel;

    sget v1, Lcom/roblox/client/c0;->h4:I

    .line 3
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "channel_general"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v1, "notification"

    .line 4
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    .line 5
    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const-string v0, "channel_games"

    .line 6
    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    const/4 v2, 0x1

    const-string v4, "channel_calls"

    const/4 v5, 0x4

    if-nez v0, :cond_0

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Landroid/app/NotificationChannel;

    sget v6, Lcom/roblox/client/c0;->f4:I

    .line 9
    invoke-virtual {p1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v4, v6, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 10
    new-instance v4, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v6, 0x6

    .line 11
    invoke-virtual {v4, v6}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v4

    .line 12
    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v4

    .line 13
    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v4

    .line 14
    invoke-static {v2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v0, v6, v4}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 15
    sget-object v4, Lh8/l;->a:[J

    invoke-virtual {v0, v4}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 16
    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v1, v4}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 18
    :goto_0
    sget v0, Lcom/roblox/client/c0;->k4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v4, Landroid/app/NotificationChannel;

    const-string v6, "channel_urgent"

    invoke-direct {v4, v6, v0, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 20
    sget v0, Lcom/roblox/client/c0;->g4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 21
    new-instance v5, Landroid/app/NotificationChannel;

    const-string v6, "channel_default"

    invoke-direct {v5, v6, v0, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 22
    sget v0, Lcom/roblox/client/c0;->i4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 23
    new-instance v3, Landroid/app/NotificationChannel;

    const/4 v6, 0x2

    const-string v7, "channel_medium"

    invoke-direct {v3, v7, v0, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 24
    sget v0, Lcom/roblox/client/c0;->j4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 25
    new-instance v0, Landroid/app/NotificationChannel;

    const-string v6, "channel_minimum"

    invoke-direct {v0, v6, p1, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 26
    invoke-virtual {v1, v4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 27
    invoke-virtual {v1, v5}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 28
    invoke-virtual {v1, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 29
    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_1
    return-void
.end method

.method public static l()Z
    .locals 1

    sget-boolean v0, Lx7/b;->g:Z

    return v0
.end method

.method public static m()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lx7/b;->f:Z

    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 3

    const-string v0, "DeviceInstallPreferences"

    .line 1
    invoke-static {p1, v0}, Lc9/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "AppFirstLaunch"

    const/4 v1, 0x1

    .line 2
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lx7/b;->c:Z

    if-eqz v1, :cond_0

    const-string v1, "rbx.AppManager"

    const-string v2, "First App launch!"

    .line 3
    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v1

    invoke-virtual {v1}, Lx7/e;->m()V

    .line 5
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const/4 v1, 0x0

    .line 6
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string v2, "AppFirstLaunchTime"

    invoke-interface {p1, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 8
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lx7/b;->g:Z

    return-void
.end method

.method public h(Landroid/app/Activity;Lx7/b$f;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleLogout: logoutType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lx7/b;->e:Z

    .line 3
    invoke-direct {p0, p2}, Lx7/b;->c(Lx7/b$f;)V

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "logout_type"

    .line 5
    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->x0()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-static {}, Lc9/c;->g()Lc9/c;

    move-result-object v2

    invoke-virtual {v2}, Lc9/c;->c()V

    .line 8
    invoke-static {}, Lcom/roblox/client/p0;->X0()V

    .line 9
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v2

    invoke-virtual {v2}, Lx7/c;->b()V

    .line 10
    :cond_0
    sget-object v2, Lx7/b$f;->n:Lx7/b$f;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne p2, v2, :cond_3

    .line 11
    instance-of p2, p1, Lcom/roblox/client/i0;

    if-eqz p2, :cond_1

    .line 12
    move-object v3, p1

    check-cast v3, Lcom/roblox/client/i0;

    :cond_1
    if-eqz v3, :cond_2

    .line 13
    invoke-virtual {v3, v3}, Lcom/roblox/client/i0;->v1(Landroid/content/Context;)V

    .line 14
    :cond_2
    invoke-static {p1}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p2

    new-instance v2, Lx7/b$a;

    invoke-direct {v2, p0, p1, v3, v1}, Lx7/b$a;-><init>(Lx7/b;Landroid/app/Activity;Lcom/roblox/client/i0;Landroid/os/Bundle;)V

    invoke-virtual {p2, p1, v0, v2}, Lw8/k;->D(Landroid/content/Context;ZLy7/c$b;)V

    goto :goto_0

    .line 15
    :cond_3
    invoke-static {p1}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p2

    invoke-virtual {p2, p1, v4, v3}, Lw8/k;->D(Landroid/content/Context;ZLy7/c$b;)V

    .line 16
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p2, v0, v1}, Lx7/d;->f(ILandroid/os/Bundle;)V

    .line 17
    sput-boolean v4, Lx7/b;->e:Z

    .line 18
    :goto_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->n1()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 19
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x2000

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    .line 20
    :cond_4
    sput-boolean v4, Lx7/b;->g:Z

    return-void
.end method

.method public i(Landroid/app/Activity;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSwitchAccount activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    .line 3
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 4
    sput-boolean v0, Lx7/b;->e:Z

    .line 5
    invoke-static {}, Lcom/roblox/client/f0;->x()V

    .line 6
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    sget-object v1, Lx7/b$f;->o:Lx7/b$f;

    const-string v2, "logout_type"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 8
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->x0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    invoke-static {}, Lc9/c;->g()Lc9/c;

    move-result-object v1

    invoke-virtual {v1}, Lc9/c;->c()V

    .line 10
    invoke-static {}, Lcom/roblox/client/p0;->X0()V

    .line 11
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v1

    invoke-virtual {v1}, Lx7/c;->b()V

    .line 12
    :cond_0
    invoke-static {p1}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Lw8/k;->D(Landroid/content/Context;ZLy7/c$b;)V

    .line 13
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lx7/d;->f(ILandroid/os/Bundle;)V

    .line 14
    sput-boolean v3, Lx7/b;->e:Z

    .line 15
    sput-boolean v3, Lx7/b;->g:Z

    return-void
.end method

.method public k(Landroid/content/Context;Lx7/b$d;)V
    .locals 5

    .line 1
    sget-object v0, Lx7/b$d;->o:Lx7/b$d;

    if-eq p2, v0, :cond_1

    sget-object v0, Lx7/b$d;->p:Lx7/b$d;

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid AppInitType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lx7/b;->b:Lx7/b$c;

    sget-object v1, Lx7/b$c;->n:Lx7/b$c;

    if-eq v0, v1, :cond_2

    return-void

    .line 4
    :cond_2
    const-class v0, Lx7/b;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v2, p0, Lx7/b;->b:Lx7/b$c;

    if-eq v2, v1, :cond_3

    .line 6
    monitor-exit v0

    return-void

    .line 7
    :cond_3
    sget-object v1, Lx7/b$c;->o:Lx7/b$c;

    iput-object v1, p0, Lx7/b;->b:Lx7/b$c;

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iput-object p2, p0, Lx7/b;->a:Lx7/b$d;

    const-string p2, "rbx.AppManager"

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initialize: ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx7/b;->a:Lx7/b$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] Start..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lc9/p;->e(Landroid/content/Context;)Lc9/p;

    .line 13
    :try_start_1
    invoke-static {p1}, Lcom/roblox/client/p0;->e0(Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lcom/roblox/client/p0;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetBaseUrl(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lcom/roblox/client/p0;->T()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetRobloxChannel(Ljava/lang/String;)V

    .line 16
    new-instance p2, Lp7/c;

    invoke-direct {p2}, Lp7/c;-><init>()V

    invoke-static {p2}, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->setImplementation(Lk9/a;)V

    .line 17
    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object p2

    const-string v2, "rbx.AppManager"

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ROBLOX | User-Agent = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "rbx.AppManager"

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ROBLOX | Build = googleProd"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "release"

    invoke-static {v3}, Lc9/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/roblox/client/p0;->H()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "rbx.AppManager"

    const-string v2, "ROBLOX | Version = 2.622.471, Code = 1606"

    .line 20
    invoke-static {p2, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "rbx.AppManager"

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ROBLOX | BaseUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/roblox/client/p0;->G()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "rbx.AppManager"

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ROBLOX | OS Ver. = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", Lvl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "rbx.AppManager"

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ROBLOX | Arch = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/roblox/client/l;->g()Lcom/roblox/client/l;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roblox/client/l;->i()Lcom/roblox/client/l$b;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    invoke-static {p1}, Lw8/m;->b(Landroid/content/Context;)V

    .line 25
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p2

    invoke-virtual {p2}, Lcom/roblox/client/n;->m()Ln9/f;

    move-result-object p2

    invoke-static {p2}, Ln9/g;->i(Ln9/f;)V

    const/4 p2, 0x0

    .line 26
    invoke-static {p1, p2}, Lx7/f;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/client/n;->q()Lp8/a;

    .line 28
    invoke-static {}, Lx7/g;->e()Lx7/g;

    .line 29
    invoke-static {}, Lcom/roblox/client/l;->g()Lcom/roblox/client/l;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/roblox/client/l;->d(Lcom/roblox/client/l$c;)V

    .line 30
    invoke-static {}, Lo6/a;->e()Lo6/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo6/a;->g(Landroid/content/Context;)V

    .line 31
    invoke-static {}, Lx6/d;->b()V

    .line 32
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    .line 33
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v2

    invoke-virtual {v2, p2}, Ls7/b;->q(Ljava/util/Locale;)V

    .line 34
    invoke-direct {p0, p1}, Lx7/b;->j(Landroid/content/Context;)V

    .line 35
    new-instance p2, Lr8/b;

    invoke-direct {p2}, Lr8/b;-><init>()V

    invoke-static {p2}, Lf9/a;->f(Lf9/a$a;)V

    .line 36
    new-instance p2, Lx7/b$g;

    invoke-direct {p2}, Lx7/b$g;-><init>()V

    invoke-static {p2}, Lf9/g;->q(Lf9/g$c;)V

    .line 37
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2, v2}, Lf9/g;->p(Landroid/content/Context;)V

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lorg/webrtc/ContextUtils;->initialize(Landroid/content/Context;)V

    .line 39
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf9/g;->x(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 40
    sput-boolean p1, Lx7/b;->g:Z

    .line 41
    sget-object p1, Lx7/b$c;->p:Lx7/b$c;

    iput-object p1, p0, Lx7/b;->b:Lx7/b$c;

    .line 42
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    sub-long/2addr p1, v0

    const-string v0, "rbx.AppManager"

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initialize: Completed OK. elapsedTime(ms) = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :catch_0
    move-exception p1

    const-string p2, "rbx.AppManager"

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "*** Exception caught in initConfig: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    sget-object p1, Lx7/b$c;->q:Lx7/b$c;

    iput-object p1, p0, Lx7/b;->b:Lx7/b$c;

    .line 46
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "IOException in RobloxSettings.initConfig()"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 47
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, Lx7/b;->d:Z

    return-void
.end method
