.class public Lcom/roblox/client/RobloxApplication;
.super Landroid/app/Application;
.source "SourceFile"


# static fields
.field private static n:Landroid/content/Context;

.field private static o:Ljava/util/Locale;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/roblox/client/RobloxApplication;->n:Landroid/content/Context;

    return-object v0
.end method

.method public static b(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_6

    const/16 v0, 0xa

    if-eq p1, v0, :cond_5

    const/16 v0, 0xf

    if-eq p1, v0, :cond_4

    const/16 v0, 0x14

    if-eq p1, v0, :cond_3

    const/16 v0, 0x28

    if-eq p1, v0, :cond_2

    const/16 v0, 0x3c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x50

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "TRIM_MEMORY_COMPLETE"

    .line 1
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string p1, "TRIM_MEMORY_MODERATE"

    .line 2
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    const-string p1, "TRIM_MEMORY_BACKGROUND"

    .line 3
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    const-string p1, "TRIM_MEMORY_UI_HIDDEN"

    .line 4
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_4
    const-string p1, "TRIM_MEMORY_RUNNING_CRITICAL"

    .line 5
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_5
    const-string p1, "TRIM_MEMORY_RUNNING_LOW"

    .line 6
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_6
    const-string p1, "TRIM_MEMORY_RUNNING_MODERATE"

    .line 7
    invoke-static {p0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lh1/a;->l(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 3
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls7/b;->q(Ljava/util/Locale;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0, p1}, Ls7/b;->q(Ljava/util/Locale;)V

    :goto_0
    return-void
.end method

.method public onCreate()V
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 3
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sput-object v2, Lcom/roblox/client/RobloxApplication;->n:Landroid/content/Context;

    .line 4
    invoke-static {}, Lc7/f;->c()Lc7/f;

    move-result-object v2

    invoke-static {p0}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc7/f;->d(Landroid/content/SharedPreferences;)V

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 6
    sget-object v4, Lcom/roblox/client/RobloxApplication;->n:Landroid/content/Context;

    invoke-static {v4}, Lw8/m;->c(Landroid/content/Context;)V

    .line 7
    sget-object v4, Lcom/roblox/client/RobloxApplication;->n:Landroid/content/Context;

    invoke-static {v4}, Lw8/d;->o(Landroid/content/Context;)V

    .line 8
    invoke-static {}, Lw8/d;->m()V

    .line 9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    sput-object v4, Lcom/roblox/client/RobloxApplication;->o:Ljava/util/Locale;

    .line 10
    sget-object v4, Lcom/roblox/client/RobloxApplication;->n:Landroid/content/Context;

    sget-object v5, Lcom/roblox/client/i;->g:[Ljava/lang/String;

    sget-object v6, Lcom/roblox/client/RobloxApplication;->n:Landroid/content/Context;

    .line 11
    invoke-virtual {v6}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 12
    invoke-static {v4, v5, v6}, Lcom/roblox/client/i;->i(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v4

    const-string v5, "flag_prefetch_begin"

    invoke-virtual {v4, v5, v2, v3}, Lma/a;->d(Ljava/lang/String;J)V

    .line 14
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v2

    const-string v3, "application_oncreate"

    invoke-virtual {v2, v3, v0, v1}, Lma/a;->d(Ljava/lang/String;J)V

    .line 15
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/universalapp/linking/JNIBaseUrlProtocol;->init(Landroid/content/Context;)V

    .line 16
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/universalapp/linking/JNIWebLoginProtocol;->init(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
