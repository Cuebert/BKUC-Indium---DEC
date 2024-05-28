.class public Lh8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lj8/i;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj8/i;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private b(Lorg/json/JSONObject;)Lj8/i;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lj8/i;

    invoke-direct {v0, p1}, Lj8/i;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lh8/g; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 3
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method c(Landroid/content/Context;Lj8/i;Lh8/h;Lh8/d;Lh8/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p2, :cond_3

    .line 1
    invoke-direct {p0, p2}, Lh8/j;->a(Lj8/i;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p3, :cond_1

    const-string v1, "FriendRequestAccepted"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "FriendRequestReceived"

    .line 3
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PrivateMessageReceived"

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "ChatNewMessage"

    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    :cond_0
    invoke-virtual {p3, p2, p1}, Lh8/h;->f(Lj8/i;Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    const-string p3, "PushExpiryMessage"

    .line 7
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_2

    .line 8
    invoke-virtual {p4, p2, p1}, Lh8/d;->b(Lj8/i;Landroid/content/Context;)V

    goto :goto_0

    :cond_2
    const-string p3, "PushCategoryExpiryMessage"

    .line 9
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    if-eqz p5, :cond_3

    .line 10
    invoke-virtual {p5, p2, p1}, Lh8/c;->b(Lj8/i;Landroid/content/Context;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public d(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lh8/j;->b(Lorg/json/JSONObject;)Lj8/i;

    move-result-object v2

    .line 2
    new-instance v3, Lh8/h;

    invoke-direct {v3}, Lh8/h;-><init>()V

    .line 3
    new-instance v4, Lh8/d;

    invoke-direct {v4}, Lh8/d;-><init>()V

    .line 4
    new-instance v5, Lh8/c;

    invoke-direct {v5}, Lh8/c;-><init>()V

    move-object v0, p0

    move-object v1, p2

    .line 5
    invoke-virtual/range {v0 .. v5}, Lh8/j;->c(Landroid/content/Context;Lj8/i;Lh8/h;Lh8/d;Lh8/c;)V

    return-void
.end method
