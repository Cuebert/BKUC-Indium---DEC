.class public Lq7/b;
.super Lq7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq7/b$c;
    }
.end annotation


# instance fields
.field private F:Ljava/lang/String;

.field private G:J

.field private H:Lq7/b$c;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lq7/b$c;)V
    .locals 2

    .line 1
    invoke-static {}, Lq7/f;->u()Lo1/d;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/d;->i(Ljava/lang/String;)Lo1/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lq7/f;-><init>(Lo1/d;)V

    .line 2
    iput-wide p1, p0, Lq7/b;->G:J

    .line 3
    iput-object p3, p0, Lq7/b;->F:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lq7/b;->H:Lq7/b$c;

    return-void
.end method

.method private A(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_0

    move-object v0, p2

    goto :goto_0

    :cond_0
    const-string v0, "Send Failed"

    :goto_0
    if-nez p2, :cond_2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->j1()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "failed"

    goto :goto_1

    :cond_1
    const-string p1, "Failure"

    .line 2
    :cond_2
    :goto_1
    invoke-direct {p0, p1, v0}, Lq7/b;->y(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic x(Lq7/b;)Lq7/b$c;
    .locals 0

    iget-object p0, p0, Lq7/b;->H:Lq7/b$c;

    return-object p0
.end method

.method private y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq7/b;->H:Lq7/b$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lq7/f;->v()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lq7/b$b;

    invoke-direct {v1, p0, p1, p2}, Lq7/b$b;-><init>(Lq7/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private z(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq7/b;->H:Lq7/b$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lq7/f;->v()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lq7/b$a;

    invoke-direct {v1, p0, p1}, Lq7/b$a;-><init>(Lq7/b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public n()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->j1()Z

    move-result v0

    const-string v1, "CPMJ.onRun() payload:"

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    .line 2
    iget-object v2, p0, Lq7/b;->F:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 3
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v2

    invoke-interface {v2}, Ln9/d;->h()Lr9/j;

    move-result-object v2

    new-instance v4, Lu9/b;

    iget-wide v5, p0, Lq7/b;->G:J

    invoke-direct {v4, v5, v6, v0}, Lu9/b;-><init>(J[Ljava/lang/String;)V

    invoke-interface {v2, v4}, Lr9/j;->b(Lu9/b;)Lgc/b;

    move-result-object v0

    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/j0;

    invoke-virtual {v0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object v0

    .line 5
    sget-object v2, Ls6/a;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "messages"

    .line 7
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 9
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "status"

    .line 10
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "success"

    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "id"

    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, Lq7/b;->z(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "Send Failed"

    .line 14
    invoke-direct {p0, v1, v0}, Lq7/b;->A(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "failed"

    const-string v1, "No messages in the response"

    .line 15
    invoke-direct {p0, v0, v1}, Lq7/b;->A(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_2
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->d()Lr9/d;

    move-result-object v0

    new-instance v2, Ls9/b;

    iget-wide v3, p0, Lq7/b;->G:J

    iget-object v5, p0, Lq7/b;->F:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5}, Ls9/b;-><init>(JLjava/lang/String;)V

    invoke-interface {v0, v2}, Lr9/d;->b(Ls9/b;)Lgc/b;

    move-result-object v0

    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/j0;

    invoke-virtual {v0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object v0

    .line 18
    sget-object v2, Ls6/a;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "resultType"

    .line 20
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Success"

    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "statusMessage"

    .line 22
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {p0, v0, v1}, Lq7/b;->A(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v0, "messageId"

    .line 24
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-direct {p0, v0}, Lq7/b;->z(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected w(Lq7/f$a;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1, p1}, Lq7/b;->A(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
