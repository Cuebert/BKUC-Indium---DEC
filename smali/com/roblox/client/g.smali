.class public Lcom/roblox/client/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-static {p1}, Lc9/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "URL_EXTRA"

    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "TITLE_EXTRA"

    .line 3
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "USE_GENERIC_WEB_FRAG_EXTRA"

    .line 4
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA"

    .line 5
    invoke-virtual {v0, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "HIDE_ACCESSORY_BUTTONS_EXTRA"

    .line 6
    invoke-virtual {v0, p0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public static b(Lorg/json/JSONObject;Landroid/app/Activity;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v0, :cond_c

    const-string v2, "placeId"

    .line 1
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "userId"

    .line 2
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    const-string v6, "conversationId"

    .line 3
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    const-string v8, "gameInstanceId"

    .line 4
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "reservedServerAccessCode"

    .line 5
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "callId"

    .line 6
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "referralPage"

    .line 7
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "accessCode"

    .line 8
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "linkCode"

    .line 9
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "launchData"

    .line 10
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v14, "joinAttemptId"

    .line 11
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v14, "joinAttemptOrigin"

    .line 12
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v1, "isoContext"

    .line 13
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    const-wide/16 v0, 0x0

    const/16 v16, 0x0

    cmp-long v17, v2, v0

    if-lez v17, :cond_0

    cmp-long v18, v6, v0

    if-lez v18, :cond_0

    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 15
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 16
    invoke-static {v0, v1, v11, v15, v14}, Lf7/z;->b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf7/z;

    move-result-object v16

    goto :goto_0

    :cond_0
    if-gtz v17, :cond_2

    cmp-long v6, v4, v0

    if-lez v6, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v0, v16

    goto/16 :goto_8

    :cond_2
    :goto_1
    if-nez v17, :cond_3

    move-object/from16 v2, v16

    goto :goto_2

    .line 17
    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_2
    cmp-long v3, v4, v0

    if-nez v3, :cond_4

    move-object/from16 v0, v16

    goto :goto_3

    .line 18
    :cond_4
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 19
    :goto_3
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    move-object/from16 v1, v16

    goto :goto_4

    :cond_5
    move-object v1, v12

    .line 20
    :goto_4
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object/from16 v3, v16

    goto :goto_5

    :cond_6
    move-object v3, v13

    .line 21
    :goto_5
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v8, v16

    .line 22
    :cond_7
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v17, v16

    goto :goto_6

    :cond_8
    move-object/from16 v17, v9

    .line 23
    :goto_6
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object/from16 v18, v16

    goto :goto_7

    :cond_9
    move-object/from16 v18, v10

    :goto_7
    const/16 v19, 0x0

    move-object v12, v2

    move-object v13, v0

    move-object v0, v14

    move-object v14, v1

    move-object v1, v15

    move-object v15, v3

    move-object/from16 v16, v8

    move-object/from16 v20, v11

    move-object/from16 v22, v1

    move-object/from16 v23, v0

    .line 24
    invoke-static/range {v12 .. v24}, Lf7/z;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf7/z;

    move-result-object v16

    goto :goto_0

    :goto_8
    if-eqz v0, :cond_c

    .line 25
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->k0()Z

    move-result v1

    if-nez v1, :cond_b

    .line 26
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->n0()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 27
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v1

    const-string v2, "experience_launch_begin"

    invoke-virtual {v1, v2}, Lma/a;->b(Ljava/lang/String;)V

    goto :goto_9

    .line 28
    :cond_a
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v1

    const-string v2, "gamejoin_begin"

    invoke-virtual {v1, v2}, Lma/a;->b(Ljava/lang/String;)V

    :cond_b
    :goto_9
    move-object/from16 v1, p1

    .line 29
    invoke-static {v0, v1}, Lcom/roblox/client/g;->j(Lf7/z;Landroid/app/Activity;)V

    .line 30
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lx7/e;->t(Landroid/content/Context;)V

    :cond_c
    return-void
.end method

.method private static c(Lf7/z;Landroid/app/Activity;)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 2
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v1

    if-eqz p0, :cond_1

    .line 3
    invoke-virtual {p0}, Lf7/z;->m()J

    move-result-wide v2

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Launching PlaceId:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " Pid:"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " Debugger:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    const-string v0, "attached"

    goto :goto_0

    :cond_0
    const-string v0, "none"

    .line 5
    :goto_0
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ActivityUtils"

    .line 6
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :cond_1
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    const/16 v1, 0x4e88

    invoke-virtual {v0, p1, p0, v1}, Lf7/b0;->q(Landroid/app/Activity;Lf7/z;I)V

    return-void
.end method

.method public static d(Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    sget v0, Lcom/roblox/client/c0;->I2:I

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    .line 3
    invoke-static/range {v1 .. v6}, Lcom/roblox/client/g;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 5
    sget p1, Lcom/roblox/client/t;->b:I

    const p2, 0x10a0001

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public static e(Landroid/app/Activity;Ljava/lang/String;IZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/roblox/client/g;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/roblox/client/g;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-static/range {v0 .. v5}, Lcom/roblox/client/g;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object p1

    if-eqz p3, :cond_0

    const-string p2, "SEARCH_PARAMS"

    .line 2
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const/4 p2, 0x1

    .line 3
    invoke-static {p0, p1, p2}, Lcom/roblox/client/g;->k(Landroid/app/Activity;Landroid/content/Intent;Z)V

    return-void
.end method

.method public static h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/client/g;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/roblox/client/g;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object p1

    .line 2
    invoke-static {p0, p1, p3}, Lcom/roblox/client/g;->k(Landroid/app/Activity;Landroid/content/Intent;Z)V

    return-void
.end method

.method public static j(Lf7/z;Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/roblox/client/p0;->r:Z

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startLaunchGame: activity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GameLaunch"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {p0, p1}, Lcom/roblox/client/g;->c(Lf7/z;Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public static k(Landroid/app/Activity;Landroid/content/Intent;Z)V
    .locals 1

    const/16 v0, 0x4e8e

    .line 1
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    if-nez p2, :cond_1

    .line 2
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUserGameSettingsGetReducedMotion()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget p1, Lcom/roblox/client/t;->b:I

    const p2, 0x10a0001

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :goto_1
    return-void
.end method
