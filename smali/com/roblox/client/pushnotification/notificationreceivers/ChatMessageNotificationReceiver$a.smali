.class Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->p(JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;


# direct methods
.method constructor <init>(Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->e:Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;

    iput-object p2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->b:Ljava/lang/String;

    iput-wide p4, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->c:J

    iput-object p6, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->j1()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "moderated"

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const-string p2, "Moderated"

    .line 3
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    move v6, p1

    .line 4
    new-instance v0, Lh8/h;

    invoke-direct {v0}, Lh8/h;-><init>()V

    iget-object v1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->b:Ljava/lang/String;

    iget-wide v3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->c:J

    iget-object v5, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;->d:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lh8/h;->e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Z)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
