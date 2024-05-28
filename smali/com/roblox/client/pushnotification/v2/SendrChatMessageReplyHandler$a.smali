.class Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->p(JLjava/lang/String;Landroid/content/Context;JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;


# direct methods
.method constructor <init>(Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;Landroid/content/Context;JJLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->e:Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;

    iput-object p2, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->a:Landroid/content/Context;

    iput-wide p3, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->b:J

    iput-wide p5, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->c:J

    iput-object p7, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->d:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->a:Landroid/content/Context;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ChatNewMessage_"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->b:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->c:J

    iget-object v5, p0, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler$a;->d:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lh8/h;->e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Z)V

    const-string p1, "rbx.push"

    const-string p2, "Failed to send Chat Message"

    .line 5
    invoke-static {p1, p2}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
