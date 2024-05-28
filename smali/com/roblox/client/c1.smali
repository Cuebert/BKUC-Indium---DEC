.class public Lcom/roblox/client/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/c1$b;,
        Lcom/roblox/client/c1$c;,
        Lcom/roblox/client/c1$d;,
        Lcom/roblox/client/c1$e;
    }
.end annotation


# static fields
.field private static g:Lcom/roblox/client/c1;


# instance fields
.field a:Lcom/roblox/client/c1$d;

.field private b:J

.field private final c:Lc9/r;

.field private d:Lcom/roblox/client/c1$e;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lc9/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/roblox/client/c1$d;

    invoke-direct {v0}, Lcom/roblox/client/c1$d;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    .line 3
    sget-object v0, Lcom/roblox/client/c1$e;->n:Lcom/roblox/client/c1$e;

    iput-object v0, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lcom/roblox/client/c1;->e:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/roblox/client/c1;->f:Ljava/lang/String;

    .line 6
    iput-object p1, p0, Lcom/roblox/client/c1;->c:Lc9/r;

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/c1;Lh7/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/c1;->c(Lh7/j;)V

    return-void
.end method

.method private c(Lh7/j;)V
    .locals 7

    const-string v0, ""

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lh7/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "data"

    .line 2
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v2, "UpgradeAction"

    .line 3
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, -0x1

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x46e179c5

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v3, v4, :cond_3

    const v4, -0x13947041

    if-eq v3, v4, :cond_2

    const v4, -0x89820c0

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "NewAppRequired"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    const-string v3, "Required"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    const-string v3, "Recommended"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v2, 0x1

    :cond_4
    :goto_0
    if-eqz v2, :cond_7

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_5

    .line 5
    iget-object p1, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    sget-object v2, Lcom/roblox/client/c1$e;->q:Lcom/roblox/client/c1$e;

    iput-object v2, p1, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    goto :goto_1

    .line 6
    :cond_5
    iget-object p1, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    sget-object v2, Lcom/roblox/client/c1$e;->r:Lcom/roblox/client/c1$e;

    iput-object v2, p1, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    goto :goto_1

    .line 7
    :cond_6
    iget-object p1, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    sget-object v2, Lcom/roblox/client/c1$e;->o:Lcom/roblox/client/c1$e;

    iput-object v2, p1, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    goto :goto_1

    .line 8
    :cond_7
    iget-object p1, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    sget-object v2, Lcom/roblox/client/c1$e;->p:Lcom/roblox/client/c1$e;

    iput-object v2, p1, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    .line 9
    :goto_1
    iget-object p1, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    const-string v2, "upgradeSource"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/roblox/client/c1$d;->b:Ljava/lang/String;

    .line 10
    iget-object p1, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    const-string v2, "MD5Sum"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roblox/client/c1$d;->c:Ljava/lang/String;

    .line 11
    iget-object p1, p0, Lcom/roblox/client/c1;->c:Lc9/r;

    invoke-interface {p1}, Lc9/r;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/c1;->b:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "evaluateResponse: Exception caught: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UpgradeCheckHelper"

    invoke-static {v0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method

.method public static e()Lcom/roblox/client/c1;
    .locals 3

    .line 1
    sget-object v0, Lcom/roblox/client/c1;->g:Lcom/roblox/client/c1;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/roblox/client/c1;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/roblox/client/c1;->g:Lcom/roblox/client/c1;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/roblox/client/c1;

    new-instance v2, Lc9/s;

    invoke-direct {v2}, Lc9/s;-><init>()V

    invoke-direct {v1, v2}, Lcom/roblox/client/c1;-><init>(Lc9/r;)V

    sput-object v1, Lcom/roblox/client/c1;->g:Lcom/roblox/client/c1;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/roblox/client/c1;->g:Lcom/roblox/client/c1;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/roblox/client/c1$c;)V
    .locals 9

    .line 1
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/RobloxApplication;->a()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lx6/b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Lr6/b;

    invoke-direct {v1}, Lr6/b;-><init>()V

    .line 5
    invoke-virtual {v1, v0}, Lr6/b;->c(Landroid/content/Context;)V

    .line 6
    invoke-virtual {v1}, Lr6/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v1}, Lr6/b;->b()Lcom/roblox/client/c1$d;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/roblox/client/c1$c;->a(Lcom/roblox/client/c1$d;)V

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    sget-object v1, Lcom/roblox/client/c1$e;->n:Lcom/roblox/client/c1$e;

    const-string v2, "UpgradeCheckHelper"

    if-eq v0, v1, :cond_2

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Rely on the upgrade-status set by the Init process: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    iget-object v2, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    iput-object v2, v0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    .line 11
    iput-object v1, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    .line 12
    iget-object v1, p0, Lcom/roblox/client/c1;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/roblox/client/c1$d;->b:Ljava/lang/String;

    const-string v1, ""

    .line 13
    iput-object v1, p0, Lcom/roblox/client/c1;->e:Ljava/lang/String;

    .line 14
    iget-object v2, p0, Lcom/roblox/client/c1;->f:Ljava/lang/String;

    iput-object v2, v0, Lcom/roblox/client/c1$d;->c:Ljava/lang/String;

    .line 15
    iput-object v1, p0, Lcom/roblox/client/c1;->f:Ljava/lang/String;

    .line 16
    iget-object v0, p0, Lcom/roblox/client/c1;->c:Lc9/r;

    invoke-interface {v0}, Lc9/r;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/c1;->b:J

    if-eqz p1, :cond_1

    .line 17
    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    invoke-interface {p1, v0}, Lcom/roblox/client/c1$c;->a(Lcom/roblox/client/c1$d;)V

    :cond_1
    return-void

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/c1;->c:Lc9/r;

    invoke-interface {v0}, Lc9/r;->b()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/roblox/client/c1;->b:J

    sub-long/2addr v3, v5

    .line 19
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    const-wide/32 v5, 0x36ee80

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    iget-object v7, v0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    sget-object v8, Lcom/roblox/client/c1$e;->r:Lcom/roblox/client/c1$e;

    if-ne v7, v8, :cond_4

    cmp-long v7, v3, v5

    if-gez v7, :cond_6

    if-eqz p1, :cond_3

    .line 20
    invoke-interface {p1, v0}, Lcom/roblox/client/c1$c;->a(Lcom/roblox/client/c1$d;)V

    :cond_3
    return-void

    .line 21
    :cond_4
    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    iget-object v0, v0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    if-eq v0, v1, :cond_6

    cmp-long v0, v3, v5

    if-gez v0, :cond_6

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Skip upgrade check because it was completed not long ago: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_5

    .line 23
    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    invoke-interface {p1, v0}, Lcom/roblox/client/c1$c;->b(Lcom/roblox/client/c1$d;)V

    :cond_5
    return-void

    .line 24
    :cond_6
    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    iput-object v1, v0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    const-string v0, "Perform upgrade check with the server..."

    .line 25
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    invoke-static {}, Lh7/g;->a()Lh7/f;

    move-result-object v0

    .line 27
    invoke-static {}, Lcom/roblox/client/p0;->Y0()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/roblox/client/c1$a;

    invoke-direct {v3, p0, p1}, Lcom/roblox/client/c1$a;-><init>(Lcom/roblox/client/c1;Lcom/roblox/client/c1$c;)V

    .line 28
    invoke-interface {v0, v1, v2, v3}, Lh7/f;->b(Ljava/lang/String;[Lh7/b$a;Lh7/l;)Lh7/c;

    move-result-object p1

    .line 29
    new-instance v0, Lj7/b;

    invoke-direct {v0}, Lj7/b;-><init>()V

    invoke-virtual {p1, v0}, Lh7/a;->g(Lj7/d;)V

    .line 30
    invoke-virtual {p1}, Lh7/a;->c()V

    return-void
.end method

.method public d()Lcom/roblox/client/c1$d;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    return-object v0
.end method

.method public f()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    sget-object v1, Lcom/roblox/client/c1$e;->p:Lcom/roblox/client/c1$e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v4, p0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    iget-object v4, v4, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    if-ne v4, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 3
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isUpgradeRequired: ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "UpgradeCheckHelper"

    invoke-static {v5, v4}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_2
    return v2
.end method

.method public g(Lcom/roblox/client/c1$d;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set upgrade-status (from Init) = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UpgradeCheckHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p1, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    iput-object v0, p0, Lcom/roblox/client/c1;->d:Lcom/roblox/client/c1$e;

    .line 3
    iget-object v0, p1, Lcom/roblox/client/c1$d;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/roblox/client/c1;->e:Ljava/lang/String;

    .line 4
    iget-object p1, p1, Lcom/roblox/client/c1$d;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/roblox/client/c1;->f:Ljava/lang/String;

    return-void
.end method
