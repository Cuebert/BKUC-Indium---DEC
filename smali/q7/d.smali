.class public Lq7/d;
.super Lq7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq7/d$c;,
        Lq7/d$b;
    }
.end annotation


# instance fields
.field private F:J

.field private G:Lq7/d$b;


# direct methods
.method public constructor <init>(JLq7/d$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq7/f;-><init>()V

    .line 2
    iput-wide p1, p0, Lq7/d;->F:J

    .line 3
    iput-object p3, p0, Lq7/d;->G:Lq7/d$b;

    return-void
.end method

.method static synthetic x(Lq7/d;)Lq7/d$b;
    .locals 0

    iget-object p0, p0, Lq7/d;->G:Lq7/d$b;

    return-object p0
.end method

.method private y()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->g()Lr9/l;

    move-result-object v1

    iget-wide v2, p0, Lq7/d;->F:J

    .line 2
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 3
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const-string v4, "420x420"

    const-string v5, "Png"

    .line 4
    invoke-interface/range {v1 .. v6}, Lr9/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lgc/b;

    move-result-object v0

    .line 5
    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lgc/t;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw9/b;

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, v0, Lw9/b;->data:Ljava/util/List;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    iget-object v0, v0, Lw9/b;->data:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw9/a;

    iget-object v0, v0, Lw9/a;->imageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private z(ZLq7/d$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq7/d;->G:Lq7/d$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lq7/f;->v()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lq7/d$a;

    invoke-direct {v1, p0, p1, p2}, Lq7/d$a;-><init>(Lq7/d;ZLq7/d$c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public n()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lq7/d;->F:J

    invoke-static {v0, v1}, Lcom/roblox/client/p0;->v0(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1, v1}, Lh7/b;->i(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;)Lh7/j;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "payload:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.catalog"

    invoke-static {v2, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "Name"

    .line 6
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "Description"

    .line 7
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-direct {p0}, Lq7/d;->y()Ljava/lang/String;

    move-result-object v7

    .line 9
    new-instance v0, Lq7/d$c;

    iget-wide v3, p0, Lq7/d;->F:J

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lq7/d$c;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 10
    invoke-direct {p0, v1, v0}, Lq7/d;->z(ZLq7/d$c;)V

    return-void
.end method

.method protected w(Lq7/f$a;)V
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lq7/d;->z(ZLq7/d$c;)V

    return-void
.end method
