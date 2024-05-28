.class public Lj8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/m;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:J

.field private f:J

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj8/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lh8/g;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lj8/i;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lj8/i;->b()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "SenderUserName"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lj8/b;->b:Ljava/lang/String;

    const-string v0, "SenderDisplayName"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lj8/b;->c:Ljava/lang/String;

    const-string v0, "SenderUserId"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lj8/b;->d:J

    const-string v0, "EventDate"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v0, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lj8/b;->l:Ljava/lang/String;

    if-nez v0, :cond_3

    const-wide/16 v0, -0x1

    goto :goto_3

    .line 8
    :cond_3
    invoke-static {v0}, Lc9/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    :goto_3
    iput-wide v0, p0, Lj8/b;->e:J

    const-string v0, "ConversationTitle"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v0, v2

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    iput-object v0, p0, Lj8/b;->g:Ljava/lang/String;

    const-string v0, "ConversationId"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lj8/b;->f:J

    const-string v0, "ConversationType"

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    move-object v0, v2

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    iput-object v0, p0, Lj8/b;->h:Ljava/lang/String;

    const-string v0, "MessageId"

    .line 12
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v0, v2

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    iput-object v0, p0, Lj8/b;->i:Ljava/lang/String;

    const-string v0, "MessageContent"

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v0, v2

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_7
    iput-object v0, p0, Lj8/b;->j:Ljava/lang/String;

    const-string v0, "Category"

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_8
    iput-object v2, p0, Lj8/b;->k:Ljava/lang/String;

    .line 15
    invoke-direct {p0}, Lj8/b;->d()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lj8/b;->k:Ljava/lang/String;

    .line 18
    iput-wide p2, p0, Lj8/b;->f:J

    .line 19
    iput-object p4, p0, Lj8/b;->g:Ljava/lang/String;

    .line 20
    iput-object p5, p0, Lj8/b;->a:Ljava/lang/String;

    return-void
.end method

.method private d()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lh8/g;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lj8/b;->b:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 2
    iget-wide v0, p0, Lj8/b;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_8

    .line 3
    iget-object v0, p0, Lj8/b;->k:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 4
    iget-object v0, p0, Lj8/b;->l:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 5
    iget-object v0, p0, Lj8/b;->g:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 6
    iget-wide v0, p0, Lj8/b;->f:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_4

    .line 7
    iget-object v0, p0, Lj8/b;->i:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 8
    iget-object v0, p0, Lj8/b;->j:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    iget-object v0, p0, Lj8/b;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lj8/b;->h:Ljava/lang/String;

    invoke-direct {p0, v0}, Lj8/b;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 11
    :cond_0
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification conversationType is invalid"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_1
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification conversationType is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13
    :cond_2
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification messageContent is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_3
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification messageId is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :cond_4
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification conversationId is null"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 16
    :cond_5
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification conversationTitle is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17
    :cond_6
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification date is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_7
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification category is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_8
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification senderId <= 0"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :cond_9
    new-instance v0, Lh8/g;

    const-string v1, "ChatNewMessageNotification senderName is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private n(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "OneToOneConversation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MultiUserConversation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lj8/b;->e:J

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Lj8/m;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lj8/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lj8/m;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->a:Ljava/lang/String;

    .line 3
    invoke-interface {p1}, Lj8/m;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lj8/b;->e:J

    .line 4
    check-cast p1, Lj8/b;

    invoke-virtual {p1}, Lj8/b;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lj8/b;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->c:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lj8/b;->l()J

    move-result-wide v0

    iput-wide v0, p0, Lj8/b;->d:J

    .line 7
    invoke-virtual {p1}, Lj8/b;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lj8/b;->f:J

    .line 8
    invoke-virtual {p1}, Lj8/b;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->g:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lj8/b;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->h:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lj8/b;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->i:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Lj8/b;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/b;->j:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lj8/b;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj8/b;->k:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lj8/b;->f:J

    return-wide v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lj8/b;->d:J

    return-wide v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/b;->b:Ljava/lang/String;

    return-object v0
.end method
