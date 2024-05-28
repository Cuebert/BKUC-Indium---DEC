.class public Lh8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lj8/i;)Lj8/b;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lj8/b;

    invoke-direct {v0, p1}, Lj8/b;-><init>(Lj8/i;)V
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

.method private b(Lj8/i;Lj8/m;)Lh8/i;
    .locals 1

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Lj8/i;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "FriendRequestAccepted"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "FriendRequestReceived"

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PrivateMessageReceived"

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    const-string v0, "ChatNewMessage"

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    check-cast p2, Lj8/b;

    invoke-direct {p0, p2}, Lh8/h;->d(Lj8/b;)Lh8/i;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    :goto_0
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object p2

    invoke-virtual {p2, p1}, Lh8/p;->d(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private d(Lj8/b;)Lh8/i;
    .locals 4

    .line 1
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lj8/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj8/b;->f()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lh8/p;->e(Ljava/lang/String;J)Lh8/i;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method c(Lj8/i;)Lj8/m;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p1}, Lj8/i;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    :try_start_0
    const-string v2, "FriendRequestAccepted"

    .line 2
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    new-instance v1, Lj8/c;

    invoke-direct {v1, p1}, Lj8/c;-><init>(Lj8/i;)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_0
    const-string v2, "FriendRequestReceived"

    .line 4
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    new-instance v1, Lj8/d;

    invoke-direct {v1, p1}, Lj8/d;-><init>(Lj8/i;)V

    goto :goto_0

    :cond_1
    const-string v2, "PrivateMessageReceived"

    .line 6
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    new-instance v1, Lj8/f;

    invoke-direct {v1, p1}, Lj8/f;-><init>(Lj8/i;)V

    goto :goto_0

    :cond_2
    const-string v2, "ChatNewMessage"

    .line 8
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    invoke-direct {p0, p1}, Lh8/h;->a(Lj8/i;)Lj8/b;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lh8/g; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    move-exception p1

    .line 11
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_3
    :goto_1
    return-object v0
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Z)V
    .locals 7

    .line 1
    new-instance v6, Lj8/a;

    move-object v0, v6

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lj8/a;-><init>(Ljava/lang/String;JLjava/lang/String;Z)V

    .line 2
    invoke-direct {p0, v6}, Lh8/h;->d(Lj8/b;)Lh8/i;

    move-result-object p2

    .line 3
    invoke-virtual {p0, v6, p1, p2}, Lh8/h;->g(Lj8/m;Landroid/content/Context;Lh8/i;)V

    return-void
.end method

.method public f(Lj8/i;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lh8/h;->c(Lj8/i;)Lj8/m;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1, v0}, Lh8/h;->b(Lj8/i;Lj8/m;)Lh8/i;

    move-result-object p1

    .line 3
    invoke-virtual {p0, v0, p2, p1}, Lh8/h;->g(Lj8/m;Landroid/content/Context;Lh8/i;)V

    return-void
.end method

.method g(Lj8/m;Landroid/content/Context;Lh8/i;)V
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    invoke-interface {p3, p2, p1}, Lh8/i;->c(Landroid/content/Context;Lj8/m;)V

    :cond_0
    return-void
.end method
