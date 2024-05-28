.class public Lk8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic b(Lk8/d;Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk8/d;->g(Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;)V

    return-void
.end method

.method static synthetic c(Lk8/d;Landroid/content/Context;Ll8/c;)Landroidx/core/app/k$e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lk8/d;->d(Landroid/content/Context;Ll8/c;)Landroidx/core/app/k$e;

    move-result-object p0

    return-object p0
.end method

.method private d(Landroid/content/Context;Ll8/c;)Landroidx/core/app/k$e;
    .locals 6

    .line 1
    new-instance v0, Landroidx/core/app/k$e;

    .line 2
    invoke-interface {p2}, Ll8/c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroidx/core/app/k$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    invoke-interface {p2, p1}, Ll8/c;->c(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->m(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 5
    invoke-interface {p2, p1}, Ll8/c;->s(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->q(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 7
    invoke-interface {p2}, Ll8/c;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->y(I)Landroidx/core/app/k$e;

    .line 8
    invoke-interface {p2}, Ll8/c;->getVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->E(I)Landroidx/core/app/k$e;

    .line 9
    invoke-interface {p2, p1}, Ll8/c;->l(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->z(I)Landroidx/core/app/k$e;

    .line 10
    invoke-interface {p2}, Ll8/c;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->o(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 11
    invoke-interface {p2}, Ll8/c;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->g(Z)Landroidx/core/app/k$e;

    .line 13
    invoke-interface {p2}, Ll8/c;->q()I

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/core/app/k$e;->w(I)Landroidx/core/app/k$e;

    .line 14
    invoke-interface {p2, p1}, Ll8/c;->m(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/core/app/k$e;->A(Landroid/net/Uri;)Landroidx/core/app/k$e;

    .line 15
    invoke-interface {p2}, Ll8/c;->k()Z

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/core/app/k$e;->x(Z)Landroidx/core/app/k$e;

    .line 16
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->k()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ll8/c;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 17
    sget v2, Lcom/roblox/client/c0;->P3:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 18
    new-instance v3, Landroidx/core/app/p$d;

    const-string v4, "key_reply_message"

    invoke-direct {v3, v4}, Landroidx/core/app/p$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Landroidx/core/app/p$d;->b(Ljava/lang/CharSequence;)Landroidx/core/app/p$d;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/core/app/p$d;->a()Landroidx/core/app/p;

    move-result-object v3

    .line 19
    new-instance v4, Landroidx/core/app/k$a$a;

    sget v5, Lcom/roblox/client/x;->b:I

    .line 20
    invoke-direct {p0, p1, p2}, Lk8/d;->f(Landroid/content/Context;Ll8/c;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-direct {v4, v5, v2, p1}, Landroidx/core/app/k$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 21
    invoke-virtual {v4, v3}, Landroidx/core/app/k$a$a;->a(Landroidx/core/app/p;)Landroidx/core/app/k$a$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/core/app/k$a$a;->d(Z)Landroidx/core/app/k$a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/k$a$a;->b()Landroidx/core/app/k$a;

    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Landroidx/core/app/k$e;->b(Landroidx/core/app/k$a;)Landroidx/core/app/k$e;

    .line 23
    :cond_0
    new-instance p1, Landroidx/core/app/k$c;

    invoke-direct {p1}, Landroidx/core/app/k$c;-><init>()V

    invoke-interface {p2}, Ll8/c;->j()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/core/app/k$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Landroidx/core/app/k$e;->B(Landroidx/core/app/k$g;)Landroidx/core/app/k$e;

    return-object v0
.end method

.method private e(Landroid/content/Context;Ll8/c;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-eqz p6, :cond_0

    .line 1
    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v4, v2

    aput-object p6, v4, v1

    aput-object p7, v4, v0

    const-string p3, "roblox://placeId=%d&reservedServerAccessCode=%s&callId=%s"

    invoke-static {p5, p3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    .line 2
    sget-object p6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v4, v2

    aput-object p5, v4, v1

    aput-object p7, v4, v0

    const-string p3, "roblox://placeId=%d&gameInstanceId=%s&callId=%s"

    invoke-static {p6, p3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 3
    :cond_1
    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    new-array p6, v0, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p6, v2

    aput-object p7, p6, v1

    const-string p3, "roblox://placeId=%d&callId=%s"

    invoke-static {p5, p3, p6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 4
    :goto_0
    new-instance p4, Landroid/content/Intent;

    const-string p5, "push_notification_action"

    invoke-direct {p4, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5
    const-class p5, Lcom/roblox/client/startup/ActivitySplash;

    invoke-virtual {p4, p1, p5}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 6
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 7
    sget-object p1, Lw8/o;->x:Lw8/o;

    const-string p5, "STARTED_FOR_INTENT_KEY"

    invoke-virtual {p4, p5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 8
    invoke-interface {p2}, Ll8/c;->b()Ljava/lang/String;

    move-result-object p1

    const-string p5, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p4, p5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_INTENT_ACTION_TYPE_CODE"

    .line 9
    invoke-virtual {p4, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 10
    invoke-interface {p2}, Ll8/c;->e()Ljava/lang/String;

    move-result-object p1

    const-string p5, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p4, p5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    .line 11
    invoke-virtual {p4, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    invoke-interface {p2}, Ll8/c;->t()Ljava/lang/String;

    move-result-object p1

    const-string p2, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {p4, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p4
.end method

.method private f(Landroid/content/Context;Ll8/c;)Landroid/app/PendingIntent;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "chat_message_replied"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-interface {p2}, Ll8/c;->u()J

    move-result-wide v1

    const-string v3, "EXTRA_CONVERSATION_ID"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 5
    invoke-interface {p2}, Ll8/c;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "tag"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    invoke-interface {p2}, Ll8/c;->o()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_MESSAGE_ID"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-interface {p2}, Ll8/c;->getTitle()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_CONVERSATION_TITLE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-interface {p2}, Ll8/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-interface {p2}, Ll8/c;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    invoke-interface {p2}, Ll8/c;->i()I

    move-result p2

    const/high16 v1, 0x12000000

    invoke-static {p1, p2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private g(Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;)V
    .locals 27

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-interface/range {p3 .. p3}, Ll8/c;->y()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "CallId"

    .line 2
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v2, "InstanceId"

    .line 3
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v2, "ReservedServerAccessCode"

    .line 4
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v2, "CallerId"

    .line 5
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v11

    const-string v2, "CallerCombinedName"

    .line 6
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v2, "CalleeId"

    .line 7
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    const-string v2, "CalleeCombinedName"

    .line 8
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v2, "PlaceId"

    .line 9
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v19

    const-string v2, "CreatedUtc"

    .line 10
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v21

    const-string v2, "IsCalleeMicEnabled"

    .line 11
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v23
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v1, 0x8000000

    .line 12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    const/high16 v1, 0xc000000

    const/high16 v8, 0xc000000

    goto :goto_0

    :cond_0
    const/high16 v8, 0x8000000

    .line 13
    :goto_0
    invoke-static {v0, v10}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    const/4 v6, 0x0

    .line 14
    invoke-static {v0, v6, v7, v8}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    if-eqz v23, :cond_1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object v9, v4

    move-wide/from16 v4, v19

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object v6, v13

    move-object/from16 v25, v7

    move-object v7, v14

    move-object/from16 v26, v14

    move v14, v8

    move-object v8, v10

    .line 15
    invoke-direct/range {v1 .. v8}, Lk8/d;->e(Landroid/content/Context;Ll8/c;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 16
    invoke-static {v0, v9, v1, v14}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object/from16 v24, v4

    move-object/from16 v25, v7

    move-object/from16 v26, v14

    const/4 v9, 0x0

    move v14, v8

    .line 17
    invoke-static {v0, v10}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 18
    invoke-static {v0, v9, v1, v14}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    :goto_1
    move-object v7, v2

    move-object v2, v1

    move-object/from16 v1, p1

    move-object/from16 v3, v25

    move-wide v4, v11

    move-object v6, v15

    .line 19
    invoke-static/range {v1 .. v6}, Lcom/roblox/client/IncomingCallActivity;->U0(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;JLjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 20
    invoke-static {v0, v9, v1, v14}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 21
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->j0()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    .line 22
    new-instance v2, Landroidx/core/app/o$b;

    invoke-direct {v2}, Landroidx/core/app/o$b;-><init>()V

    invoke-virtual {v2, v15}, Landroidx/core/app/o$b;->f(Ljava/lang/CharSequence;)Landroidx/core/app/o$b;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/core/app/o$b;->a()Landroidx/core/app/o;

    move-result-object v2

    move-object/from16 v4, v24

    .line 23
    invoke-static {v2, v4, v7}, Landroidx/core/app/k$f;->h(Landroidx/core/app/o;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroidx/core/app/k$f;

    move-result-object v2

    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roblox/client/v;->k:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroidx/core/app/k$f;->q(I)Landroidx/core/app/k$f;

    move-result-object v2

    .line 25
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roblox/client/v;->l:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroidx/core/app/k$f;->r(I)Landroidx/core/app/k$f;

    move-result-object v2

    move-object/from16 v4, p2

    .line 26
    invoke-virtual {v4, v2}, Landroidx/core/app/k$e;->B(Landroidx/core/app/k$g;)Landroidx/core/app/k$e;

    .line 27
    invoke-virtual {v4, v3}, Landroidx/core/app/k$e;->k(Z)Landroidx/core/app/k$e;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p2

    move-object/from16 v2, v24

    .line 28
    sget v5, Lcom/roblox/client/c0;->O3:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v9, v5, v2}, Landroidx/core/app/k$e;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 29
    sget v2, Lcom/roblox/client/c0;->N3:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v9, v2, v7}, Landroidx/core/app/k$e;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    const-string v2, "call"

    .line 30
    invoke-virtual {v4, v2}, Landroidx/core/app/k$e;->h(Ljava/lang/String;)Landroidx/core/app/k$e;

    .line 31
    :goto_2
    invoke-virtual {v4, v1}, Landroidx/core/app/k$e;->m(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 32
    invoke-virtual {v4, v1, v3}, Landroidx/core/app/k$e;->s(Landroid/app/PendingIntent;Z)Landroidx/core/app/k$e;

    .line 33
    sget-object v1, Lh8/l;->a:[J

    invoke-virtual {v4, v1}, Landroidx/core/app/k$e;->D([J)Landroidx/core/app/k$e;

    .line 34
    invoke-virtual/range {p2 .. p2}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object v5

    .line 35
    invoke-interface/range {p3 .. p3}, Ll8/c;->k()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 36
    iget v1, v5, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x24

    iput v1, v5, Landroid/app/Notification;->flags:I

    .line 37
    :cond_3
    invoke-interface/range {p3 .. p3}, Ll8/c;->h()Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v8

    new-instance v9, Lk8/d$c;

    move-object v1, v9

    move-object/from16 v2, p0

    move-object/from16 v4, p1

    move/from16 v6, v23

    move-object/from16 v7, p3

    invoke-direct/range {v1 .. v7}, Lk8/d$c;-><init>(Lk8/d;Ljava/lang/String;Landroid/content/Context;Landroid/app/Notification;ZLl8/c;)V

    invoke-virtual {v8, v9}, Lba/g;->g(Lba/g$a;)V

    .line 39
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v3

    .line 40
    invoke-interface/range {p3 .. p3}, Ll8/c;->b()Ljava/lang/String;

    move-result-object v0

    move-object v4, v10

    move-wide v5, v11

    move-object v7, v15

    move-wide/from16 v8, v16

    move-object/from16 v10, v18

    move-wide/from16 v11, v19

    move-object/from16 v14, v26

    move-wide/from16 v15, v21

    move/from16 v17, v23

    move-object/from16 v18, v0

    .line 41
    invoke-virtual/range {v3 .. v18}, Lba/g;->v(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Sendr1PushNotificationHandler"

    const-string v2, "Call receive notification parse exception."

    .line 42
    invoke-static {v1, v2, v0}, Lc9/k;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ll8/c;)V
    .locals 11

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lk8/d;->d(Landroid/content/Context;Ll8/c;)Landroidx/core/app/k$e;

    move-result-object v7

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {p2}, Ll8/c;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CallReceived"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-static {}, Lw8/d;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, p1, v7, p2}, Lk8/d;->g(Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v6

    .line 8
    new-instance v8, Lk8/d$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, v7

    move-object v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lk8/d$a;-><init>(Lk8/d;Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;Lw8/k;)V

    invoke-virtual {v6, v8}, Lw8/k;->M(Lw8/h;)V

    .line 9
    invoke-virtual {v6}, Lw8/k;->Q()V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->Z()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    new-instance v10, Lk8/d$b;

    invoke-interface {p2}, Ll8/c;->v()J

    move-result-wide v3

    .line 12
    invoke-interface {p2}, Ll8/c;->x()Ll8/b;

    move-result-object v5

    invoke-interface {p2}, Ll8/c;->r()Ljava/lang/String;

    move-result-object v6

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v8, p1

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lk8/d$b;-><init>(Lk8/d;Landroid/content/Context;JLl8/b;Ljava/lang/String;Landroidx/core/app/k$e;Landroid/content/Context;Ll8/c;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    .line 13
    invoke-virtual {v10, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    .line 14
    :cond_3
    invoke-virtual {v7}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object v0

    .line 15
    invoke-static {p1}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p1

    .line 16
    invoke-interface {p2}, Ll8/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ll8/c;->i()I

    move-result p2

    invoke-virtual {p1, v1, p2, v0}, Landroidx/core/app/n;->e(Ljava/lang/String;ILandroid/app/Notification;)V

    :cond_4
    :goto_0
    return-void
.end method
