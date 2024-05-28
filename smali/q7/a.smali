.class public Lq7/a;
.super Lq7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq7/a$b;
    }
.end annotation


# instance fields
.field private F:Ljava/lang/String;

.field private G:J

.field private H:Lq7/a$b;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lq7/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq7/f;-><init>()V

    .line 2
    iput-wide p1, p0, Lq7/a;->G:J

    .line 3
    iput-object p3, p0, Lq7/a;->F:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lq7/a;->H:Lq7/a$b;

    return-void
.end method

.method static synthetic x(Lq7/a;)Lq7/a$b;
    .locals 0

    iget-object p0, p0, Lq7/a;->H:Lq7/a$b;

    return-object p0
.end method

.method private y(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq7/a;->H:Lq7/a$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lq7/f;->v()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lq7/a$a;

    invoke-direct {v1, p0, p1}, Lq7/a$a;-><init>(Lq7/a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public n()V
    .locals 6
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

    const-string v1, "payload:"

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [J

    const/4 v2, 0x0

    .line 2
    iget-wide v3, p0, Lq7/a;->G:J

    aput-wide v3, v0, v2

    .line 3
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v2

    invoke-interface {v2}, Ln9/d;->h()Lr9/j;

    move-result-object v2

    new-instance v3, Lu9/a;

    invoke-direct {v3, v0}, Lu9/a;-><init>([J)V

    .line 4
    invoke-interface {v2, v3}, Lr9/j;->a(Lu9/a;)Lgc/b;

    move-result-object v0

    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/j0;

    invoke-virtual {v0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v2, Ls6/a;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "status"

    .line 8
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "success"

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-direct {p0, v0}, Lq7/a;->y(Z)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->d()Lr9/d;

    move-result-object v0

    new-instance v2, Ls9/a;

    iget-wide v3, p0, Lq7/a;->G:J

    iget-object v5, p0, Lq7/a;->F:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5}, Ls9/a;-><init>(JLjava/lang/String;)V

    .line 11
    invoke-interface {v0, v2}, Lr9/d;->a(Ls9/a;)Lgc/b;

    move-result-object v0

    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/j0;

    invoke-virtual {v0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object v0

    .line 13
    sget-object v2, Ls6/a;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "resultType"

    .line 15
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Success"

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-direct {p0, v0}, Lq7/a;->y(Z)V

    :goto_0
    return-void
.end method

.method protected w(Lq7/f$a;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lq7/a;->y(Z)V

    return-void
.end method
