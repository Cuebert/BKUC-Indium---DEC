.class public Lk8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lc9/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private c()Lh8/r;
    .locals 1

    new-instance v0, Lh8/r;

    invoke-direct {v0}, Lh8/r;-><init>()V

    return-object v0
.end method


# virtual methods
.method a(Landroid/content/Context;Ljava/lang/String;Lh8/r;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p3, p1, p2}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/content/Context;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lh8/o;->a()Lh8/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/o;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    sget-object v1, Lx7/b$d;->o:Lx7/b$d;

    invoke-virtual {v0, p1, v1}, Lx7/b;->k(Landroid/content/Context;Lx7/b$d;)V

    .line 4
    invoke-static {p1}, Lh7/b;->e(Landroid/content/Context;)V

    .line 5
    invoke-direct {p0}, Lk8/a;->c()Lh8/r;

    move-result-object v0

    .line 6
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lh8/m;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lk8/a;->a(Landroid/content/Context;Ljava/lang/String;Lh8/r;)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-direct {p0, p1}, Lk8/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 8
    new-instance v0, Lk8/e;

    invoke-direct {v0}, Lk8/e;-><init>()V

    .line 9
    invoke-virtual {v0, p2}, Lk8/e;->a(Ljava/util/Map;)Ll8/c;

    move-result-object p2

    .line 10
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {p2}, Ll8/c;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "foreground"

    .line 12
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 13
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ll8/c;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-interface {p2}, Ll8/c;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2}, Ll8/c;->b()Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-interface {p2}, Ll8/c;->t()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Ll8/c;->d()Ljava/util/List;

    move-result-object v8

    .line 16
    invoke-static/range {v2 .. v8}, Lcom/roblox/client/f0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 17
    new-instance v0, Lk8/f;

    invoke-direct {v0}, Lk8/f;-><init>()V

    .line 18
    invoke-virtual {v0, p2}, Lk8/f;->a(Ll8/c;)Lk8/b;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 19
    invoke-interface {v0, p1, p2}, Lk8/b;->a(Landroid/content/Context;Ll8/c;)V

    :cond_3
    :goto_0
    return-void
.end method
