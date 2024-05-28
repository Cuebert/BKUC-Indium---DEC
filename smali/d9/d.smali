.class public Ld9/d;
.super Ld9/a;
.source "SourceFile"


# instance fields
.field private s:Z

.field private t:Ljava/lang/String;

.field protected u:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v7}, Ld9/d;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;IIZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;IIZLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Ld9/a;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V

    const-wide/16 p1, 0x0

    .line 3
    iput-wide p1, p0, Ld9/d;->u:J

    .line 4
    iput-boolean p6, p0, Ld9/d;->s:Z

    .line 5
    iput-object p7, p0, Ld9/d;->t:Ljava/lang/String;

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld9/d;->t:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ld9/a;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_EXTRA"

    .line 2
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "TITLE_EXTRA"

    .line 3
    invoke-virtual {v0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected d()Z
    .locals 1

    iget-object v0, p0, Ld9/a;->o:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld9/a;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected g(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "span"

    .line 1
    invoke-static {p1, v0}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 3
    iget-wide v2, p0, Ld9/d;->u:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long p1, v2, v4

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    iput-wide v0, p0, Ld9/d;->u:J

    const/4 p1, 0x1

    return p1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    const-string p1, "clickableSpan"

    .line 1
    invoke-virtual {p0, p1}, Ld9/d;->g(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p0}, Ld9/d;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-boolean p1, p0, Ld9/d;->s:Z

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Ld9/a;->o:Landroid/content/Context;

    iget-object v0, p0, Ld9/a;->n:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/roblox/client/d1;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Ld9/a;->o:Landroid/content/Context;

    iget-object v0, p0, Ld9/a;->n:Ljava/lang/String;

    invoke-direct {p0}, Ld9/d;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Ld9/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
