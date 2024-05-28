.class public Li8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lh8/m$b;)V
    .locals 1

    .line 1
    new-instance v0, Lt9/c;

    invoke-direct {v0, p2, p3, p4}, Lt9/c;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/roblox/client/n;->o(Lt9/c;)Lgc/b;

    move-result-object p2

    if-nez p2, :cond_1

    .line 3
    invoke-static {}, Lc9/l;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object p2

    invoke-interface {p2}, Ln9/d;->c()Lr9/i;

    move-result-object p2

    invoke-interface {p2, v0}, Lr9/i;->d(Lt9/c;)Lgc/b;

    move-result-object p2

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object p2

    invoke-interface {p2}, Ln9/d;->c()Lr9/i;

    move-result-object p2

    invoke-interface {p2, v0}, Lr9/i;->g(Lt9/c;)Lgc/b;

    move-result-object p2

    .line 6
    :cond_1
    :goto_0
    new-instance p3, Li8/a$a;

    invoke-direct {p3, p0, p5, p1}, Li8/a$a;-><init>(Li8/a;Lh8/m$b;Landroid/content/Context;)V

    invoke-interface {p2, p3}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->c()Lr9/i;

    move-result-object v0

    invoke-interface {v0}, Lr9/i;->a()Lgc/b;

    move-result-object v0

    new-instance v1, Li8/a$b;

    invoke-direct {v1, p0}, Li8/a$b;-><init>(Li8/a;)V

    invoke-interface {v0, v1}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V
    .locals 6

    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->c()Lr9/i;

    move-result-object v0

    invoke-interface {v0, p2, p3, p4}, Lr9/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lgc/b;

    move-result-object p3

    new-instance p4, Li8/a$c;

    move-object v0, p4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Li8/a$c;-><init>(Li8/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V

    invoke-interface {p3, p4}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method

.method d(Lh8/m$b;Lj8/n;Landroid/content/Context;)V
    .locals 0

    invoke-interface {p1, p2, p3}, Lh8/m$b;->a(Lj8/n;Landroid/content/Context;)V

    return-void
.end method

.method e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;Lj8/j;Lh8/j;)V
    .locals 6

    move-object v0, p4

    move-object v1, p5

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p6

    invoke-interface/range {v0 .. v5}, Lh8/s$b;->a(Lj8/j;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lh8/j;)V

    return-void
.end method

.method public f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLh8/m$b;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p4

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Li8/a;->c(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lh8/m$b;)V

    return-void
.end method
