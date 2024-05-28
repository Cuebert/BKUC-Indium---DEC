.class public Lj8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/m;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:Ljava/lang/String;

.field private e:J

.field private f:J

.field private g:Ljava/lang/String;


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

    iput-object v0, p0, Lj8/f;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lj8/i;->b()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "AuthorUserName"

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
    iput-object v0, p0, Lj8/f;->d:Ljava/lang/String;

    const-string v0, "AuthorUserId"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lj8/f;->e:J

    const-string v0, "BodyPreview"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lj8/f;->b:Ljava/lang/String;

    const-string v0, "MessageId"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lj8/f;->c:J

    const-string v0, "EventDate"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lj8/f;->g:Ljava/lang/String;

    if-nez v2, :cond_3

    const-wide/16 v0, -0x1

    goto :goto_3

    .line 9
    :cond_3
    invoke-static {v2}, Lc9/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    :goto_3
    iput-wide v0, p0, Lj8/f;->f:J

    .line 10
    invoke-direct {p0}, Lj8/f;->d()V

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
    iget-object v0, p0, Lj8/f;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2
    iget-wide v0, p0, Lj8/f;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    .line 3
    iget-object v0, p0, Lj8/f;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 4
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-wide v0, p0, Lj8/f;->c:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v0, Lh8/g;

    const-string v1, "PrivateMessageNotification messageId <= 0"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_1
    new-instance v0, Lh8/g;

    const-string v1, "PrivateMessageNotification bodyPreview is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_2
    new-instance v0, Lh8/g;

    const-string v1, "PrivateMessageNotification date is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_3
    new-instance v0, Lh8/g;

    const-string v1, "PrivateMessageNotification authorUserId <= 0"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10
    :cond_4
    new-instance v0, Lh8/g;

    const-string v1, "PrivateMessageNotification authorUserName is null or empty"

    invoke-direct {v0, v1}, Lh8/g;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/f;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lj8/f;->f:J

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Lj8/m;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lj8/f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lj8/m;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/f;->a:Ljava/lang/String;

    .line 3
    move-object v0, p1

    check-cast v0, Lj8/f;

    invoke-virtual {v0}, Lj8/f;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lj8/f;->d:Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Lj8/f;->e()J

    move-result-wide v1

    iput-wide v1, p0, Lj8/f;->e:J

    .line 5
    invoke-direct {v0}, Lj8/f;->g()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lj8/f;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {v0}, Lj8/f;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lj8/f;->c:J

    .line 7
    invoke-interface {p1}, Lj8/m;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lj8/f;->f:J

    :cond_0
    return-void
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lj8/f;->e:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lj8/f;->c:J

    return-wide v0
.end method
