.class public Laa/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa/f$b;
    }
.end annotation


# instance fields
.field private a:Le5/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/d<",
            "Lb5/c$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Le5/d;->a()Le5/d;

    move-result-object v0

    iput-object v0, p0, Laa/f;->a:Le5/d;

    return-void
.end method

.method synthetic constructor <init>(Laa/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Laa/f;-><init>()V

    return-void
.end method

.method public static synthetic a(Laa/f;Lb5/c$c;)V
    .locals 0

    invoke-direct {p0, p1}, Laa/f;->e(Lb5/c$c;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Laa/f;->f(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic e(Lb5/c$c;)V
    .locals 2

    const-string v0, "DeviceIntegrityManager"

    const-string v1, "Successfully set integrity token provider"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p1}, Le5/d;->d(Ljava/lang/Object;)Le5/d;

    move-result-object p1

    iput-object p1, p0, Laa/f;->a:Le5/d;

    return-void
.end method

.method private static synthetic f(Ljava/lang/Exception;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to set token provider "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeviceIntegrityManager"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static h()Laa/f;
    .locals 1

    invoke-static {}, Laa/f$b;->a()Laa/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 7

    const-string v0, "DeviceIntegrityManager"

    const-string v1, ""

    .line 1
    new-instance v2, Lcom/roblox/universalapp/messagebus/b;

    invoke-direct {v2}, Lcom/roblox/universalapp/messagebus/b;-><init>()V

    .line 2
    sget-object v3, Laa/h;->o:Laa/h;

    .line 3
    :try_start_0
    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getRequestHashKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    :try_start_1
    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getTimeoutKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    move-object v4, v1

    .line 5
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "JSON exception on retrieving integrity token: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v5, 0x12c

    .line 6
    :goto_1
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    sget-object p1, Laa/h;->p:Laa/h;

    invoke-static {v1, p1}, Laa/g;->a(Ljava/lang/String;Laa/h;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, v2, Lcom/roblox/universalapp/messagebus/b;->a:Lorg/json/JSONObject;

    return-object v2

    .line 8
    :cond_0
    iget-object p1, p0, Laa/f;->a:Le5/d;

    invoke-virtual {p1}, Le5/d;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Laa/f;->a:Le5/d;

    .line 10
    invoke-virtual {p1}, Le5/d;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb5/c$c;

    .line 11
    invoke-static {}, Lb5/c$d;->b()Lb5/c$d$a;

    move-result-object v3

    .line 12
    invoke-virtual {v3, v4}, Lb5/c$d$a;->b(Ljava/lang/String;)Lb5/c$d$a;

    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lb5/c$d$a;->a()Lb5/c$d;

    move-result-object v3

    .line 14
    invoke-interface {p1, v3}, Lb5/c$c;->a(Lb5/c$d;)Lg4/l;

    move-result-object p1

    .line 15
    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v5, v6, v3}, Lg4/o;->b(Lg4/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb5/c$b;

    .line 16
    invoke-virtual {p1}, Lb5/c$b;->a()Ljava/lang/String;

    move-result-object v1

    .line 17
    sget-object v3, Laa/h;->t:Laa/h;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Integrity request timed out: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/concurrent/TimeoutException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    sget-object v3, Laa/h;->q:Laa/h;

    goto :goto_2

    :catch_3
    move-exception p1

    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Integrity request interrupted: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    sget-object v3, Laa/h;->s:Laa/h;

    goto :goto_2

    :catch_4
    move-exception p1

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception during integrity token retrieval: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    sget-object v3, Laa/h;->r:Laa/h;

    .line 24
    :cond_1
    :goto_2
    invoke-static {v1, v3}, Laa/g;->a(Ljava/lang/String;Laa/h;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, v2, Lcom/roblox/universalapp/messagebus/b;->a:Lorg/json/JSONObject;

    return-object v2
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public declared-synchronized g(Landroid/content/Context;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Laa/f;->a:Le5/d;

    invoke-virtual {v0}, Le5/d;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "DeviceIntegrityManager"

    const-string v0, "Token provider already initialized"

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lb5/a;->a(Landroid/content/Context;)Lb5/c;

    move-result-object p1

    .line 5
    invoke-static {}, Lb5/c$a;->b()Lb5/c$a$a;

    move-result-object v0

    const-wide v1, 0xd344527c8L

    .line 6
    invoke-virtual {v0, v1, v2}, Lb5/c$a$a;->b(J)Lb5/c$a$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lb5/c$a$a;->a()Lb5/c$a;

    move-result-object v0

    .line 8
    invoke-interface {p1, v0}, Lb5/c;->a(Lb5/c$a;)Lg4/l;

    move-result-object p1

    new-instance v0, Laa/e;

    invoke-direct {v0, p0}, Laa/e;-><init>(Laa/f;)V

    .line 9
    invoke-virtual {p1, v0}, Lg4/l;->f(Lg4/h;)Lg4/l;

    move-result-object p1

    sget-object v0, Laa/d;->a:Laa/d;

    .line 10
    invoke-virtual {p1, v0}, Lg4/l;->d(Lg4/g;)Lg4/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
