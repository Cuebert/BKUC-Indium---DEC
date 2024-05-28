.class public Lh8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)J
    .locals 2

    invoke-static {p1}, Lc9/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method private d(Ljava/lang/String;)Lh8/i;
    .locals 1

    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/p;->b(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    return-object p1
.end method

.method private e(Ljava/lang/String;)Lh8/i;
    .locals 1

    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/p;->d(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    return-object p1
.end method

.method private f(Lj8/g;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj8/g;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private g(Lj8/g;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj8/g;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public b(Lj8/i;Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lh8/c;->c(Lj8/i;)Lj8/g;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 2
    invoke-direct {p0, p1}, Lh8/c;->g(Lj8/g;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-direct {p0, p1}, Lh8/c;->f(Lj8/g;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    .line 4
    invoke-direct {p0, v1}, Lh8/c;->a(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, -0x1

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "FriendRequestReceived"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v4, "PrivateMessageReceived"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v4, "ChatNewMessage"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_3
    const-string v4, "FriendRequestAccepted"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    invoke-virtual {p1}, Lj8/g;->d()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lh8/c;->d(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    .line 8
    invoke-virtual {p0, p1, p2, v1, v2}, Lh8/c;->h(Lh8/i;Landroid/content/Context;J)V

    goto :goto_1

    .line 9
    :pswitch_1
    invoke-direct {p0, v0}, Lh8/c;->e(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    .line 10
    invoke-virtual {p0, p1, p2, v1, v2}, Lh8/c;->h(Lh8/i;Landroid/content/Context;J)V

    :cond_4
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x253fa4b8 -> :sswitch_3
        0x3766c7df -> :sswitch_2
        0x3ea07f25 -> :sswitch_1
        0x74fceef2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method c(Lj8/i;)Lj8/g;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lj8/g;

    invoke-direct {v0, p1}, Lj8/g;-><init>(Lj8/i;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method h(Lh8/i;Landroid/content/Context;J)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, p3, p4}, Lh8/i;->d(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method
