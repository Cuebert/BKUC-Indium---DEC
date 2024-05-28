.class public Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;
.super Lcom/roblox/client/pushnotification/notificationreceivers/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/pushnotification/notificationreceivers/a;-><init>()V

    return-void
.end method

.method private o(JLjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In markChatNotificationAsRead(), conversationId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ,messageId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lq7/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lq7/a;-><init>(JLjava/lang/String;Lq7/a$b;)V

    .line 3
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    return-void
.end method

.method private p(JLjava/lang/String;Landroid/content/Context;JLjava/lang/String;)V
    .locals 10

    .line 1
    new-instance v0, Lq7/b;

    new-instance v9, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p4

    move-wide v4, p5

    move-wide v6, p1

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;-><init>(Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;Landroid/content/Context;JJLjava/lang/String;)V

    move-wide v1, p1

    move-object v3, p3

    invoke-direct {v0, p1, p2, p3, v9}, Lq7/b;-><init>(JLjava/lang/String;Lq7/b$c;)V

    .line 2
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    return-void
.end method


# virtual methods
.method protected n(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2

    const-string p1, "EXTRA_NOTIFICATION_TYPE"

    const-string v0, "ChatNewMessage"

    .line 1
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_CONVERSATION_ID"

    const-wide/16 v0, -0x1

    .line 2
    invoke-virtual {p3, p1, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p2
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 14

    move-object/from16 v3, p2

    .line 1
    invoke-super/range {p0 .. p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    if-eqz v3, :cond_1

    .line 2
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "chat_message_replied"

    .line 3
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "rbx.push"

    const-string v1, "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED"

    .line 4
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EXTRA_MESSAGE_ID"

    .line 5
    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, -0x1

    const-string v4, "EXTRA_CONVERSATION_ID"

    .line 6
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    const-string v4, "EXTRA_CONVERSATION_TITLE"

    .line 7
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v4, "tag"

    .line 8
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "notification"

    move-object v13, p1

    .line 9
    invoke-virtual {p1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/NotificationManager;

    if-eqz v5, :cond_0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-virtual {v5, v4, v6}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 11
    :cond_0
    invoke-static/range {p2 .. p2}, Lh8/b;->z(Landroid/content/Intent;)Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 12
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    move-object v5, p0

    move-wide v6, v1

    move-object v9, p1

    move-wide v10, v1

    invoke-direct/range {v5 .. v12}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->p(JLjava/lang/String;Landroid/content/Context;JLjava/lang/String;)V

    move-object v6, p0

    .line 13
    invoke-direct {p0, v1, v2, v0}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->o(JLjava/lang/String;)V

    const/4 v4, 0x1

    const-string v1, "chat message replied"

    const-string v5, "ChatNewMessage"

    move-object v0, p0

    move-object v2, p1

    move-object/from16 v3, p2

    .line 14
    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v6, p0

    :goto_0
    return-void
.end method
