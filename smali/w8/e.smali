.class public Lw8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lob/e;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-wide/32 v1, 0x200000

    invoke-direct {v0, p0, v1, v2}, Lob/e;-><init>(Ljava/io/File;J)V

    .line 2
    new-instance p0, Lw8/f;

    invoke-direct {p0}, Lw8/f;-><init>()V

    .line 3
    new-instance v1, Lob/d0$b;

    invoke-direct {v1}, Lob/d0$b;-><init>()V

    .line 4
    invoke-virtual {v1, p0}, Lob/d0$b;->g(Lob/v;)Lob/d0$b;

    move-result-object v1

    .line 5
    invoke-virtual {v1, v0}, Lob/d0$b;->d(Lob/e;)Lob/d0$b;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lob/d0$b;->c()Lob/d0;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lw8/e;->d(Lob/d0;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v1}, Lw8/e;->b(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 9
    invoke-static {}, Lw8/d;->m()V

    .line 10
    invoke-virtual {p0}, Lw8/f;->z()V

    .line 11
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p0

    invoke-interface {p0}, Lc7/e;->Y0()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 12
    invoke-static {}, Lcom/roblox/client/p0;->c0()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 13
    invoke-static {v2}, Lw8/e;->c(Lorg/json/JSONObject;)V

    .line 14
    invoke-static {}, Lcom/roblox/client/p0;->c0()Z

    move-result p0

    if-nez p0, :cond_1

    .line 15
    invoke-static {v0}, Lw8/e;->d(Lob/d0;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-static {}, Lw8/e;->e()V

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v2}, Lw8/e;->c(Lorg/json/JSONObject;)V

    .line 18
    invoke-static {}, Lcom/roblox/client/p0;->c0()Z

    move-result p0

    if-nez p0, :cond_1

    .line 19
    invoke-static {v0}, Lw8/e;->d(Lob/d0;)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-static {}, Lw8/e;->e()V

    :cond_1
    :goto_0
    return-object v1
.end method

.method static b(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "ClientSettingsRequest"

    const-string v1, "can\'t parse flag json."

    .line 2
    invoke-static {p0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    const-string p0, "applicationSettings"

    .line 3
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static c(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->c0()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p0, :cond_2

    const-string v0, "FStringClientChannelProbabilityString"

    .line 2
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeParseRandomChannelSelection(Ljava/lang/String;)Lcom/roblox/engine/jni/model/ChannelRecord;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ChannelRecord;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/roblox/engine/jni/model/ChannelRecord;->b(J)Z

    move-result v0

    const-string v1, "Channel roll \'"

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ChannelRecord;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' expired, using production"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc9/k;->e(Ljava/lang/String;)I

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ChannelRecord;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Channel roll is production"

    .line 7
    invoke-static {p0}, Lc9/k;->e(Ljava/lang/String;)I

    goto :goto_0

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ChannelRecord;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc9/k;->e(Ljava/lang/String;)I

    .line 9
    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ChannelRecord;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_2
    :goto_0
    const-string p0, ""

    .line 10
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 11
    invoke-static {p0}, Lcom/roblox/client/p0;->O0(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private static d(Lob/d0;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lob/g0$a;

    invoke-direct {v0}, Lob/g0$a;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/g0$a;->h(Ljava/lang/String;)Lob/g0$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lob/g0$a;->a()Lob/g0;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0}, Lob/d0;->a(Lob/g0;)Lob/g;

    move-result-object p0

    .line 5
    invoke-interface {p0}, Lob/g;->c()Lob/i0;

    move-result-object p0

    invoke-virtual {p0}, Lob/i0;->b()Lob/j0;

    move-result-object p0

    invoke-virtual {p0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method

.method private static e()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "fastflag_load_channel"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
