.class public Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;
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

.method private p(JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v0, Lq7/b;

    new-instance v8, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p4

    move-object v4, p5

    move-wide v5, p1

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V

    invoke-direct {v0, p1, p2, p3, v8}, Lq7/b;-><init>(JLjava/lang/String;Lq7/b$c;)V

    .line 2
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    return-void
.end method


# virtual methods
.method protected l(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string v0, "EXTRA_CATEGORY"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh8/p;->i(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->g(Landroid/content/Context;Landroid/content/Intent;)V

    const-string v3, "clicked"

    const/4 v6, 0x1

    const-string v7, "ChatNewMessage"

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    .line 4
    invoke-virtual/range {v2 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    return-void
.end method

.method protected m(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string v0, "EXTRA_CATEGORY"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh8/p;->i(Ljava/lang/String;)V

    const-string v3, "dismissed"

    const/4 v6, 0x0

    const-string v7, "ChatNewMessage"

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    .line 3
    invoke-virtual/range {v2 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    return-void
.end method

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
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "chat_message_replied"

    .line 3
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "rbx.push"

    const-string v1, "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED"

    .line 4
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, -0x1

    const-string v2, "EXTRA_CONVERSATION_ID"

    .line 5
    invoke-virtual {p2, v2, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    long-to-int v2, v0

    .line 6
    invoke-virtual {p0, p1, v2}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->a(Landroid/content/Context;I)V

    .line 7
    invoke-static {p2}, Lh8/b;->z(Landroid/content/Intent;)Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "EXTRA_CATEGORY"

    .line 8
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v3, "EXTRA_CONVERSATION_TITLE"

    .line 9
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v3, "EXTRA_MESSAGE_ID"

    .line 10
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 11
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v3, p0

    move-wide v4, v0

    move-object v7, p1

    move-object v8, v10

    invoke-direct/range {v3 .. v9}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->p(JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v2

    invoke-virtual {v2, v10}, Lh8/p;->i(Ljava/lang/String;)V

    .line 13
    invoke-direct {p0, v0, v1, v11}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->o(JLjava/lang/String;)V

    const/4 v7, 0x1

    const-string v4, "chat message replied"

    const-string v8, "ChatNewMessage"

    move-object v5, p1

    move-object v6, p2

    .line 14
    invoke-virtual/range {v3 .. v8}, Lcom/roblox/client/pushnotification/notificationreceivers/a;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    :cond_0
    return-void
.end method
