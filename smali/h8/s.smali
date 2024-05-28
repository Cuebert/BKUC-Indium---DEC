.class public Lh8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/s$b;
    }
.end annotation


# instance fields
.field a:Lh8/s$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lh8/s$a;

    invoke-direct {v0, p0}, Lh8/s$a;-><init>(Lh8/s;)V

    iput-object v0, p0, Lh8/s;->a:Lh8/s$b;

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

.method d(Landroid/content/Context;Li8/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    .line 2
    invoke-virtual/range {v0 .. v6}, Li8/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 1
    invoke-direct {p0}, Lh8/s;->c()Lh8/r;

    move-result-object v0

    .line 2
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lh8/m;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lh8/s;->a(Landroid/content/Context;Ljava/lang/String;Lh8/r;)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lh8/m;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lh8/s;->a(Landroid/content/Context;Ljava/lang/String;Lh8/r;)Ljava/lang/String;

    move-result-object v6

    .line 4
    invoke-direct {p0, p1}, Lh8/s;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 5
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    sget-object v1, Lx7/b$d;->o:Lx7/b$d;

    invoke-virtual {v0, p1, v1}, Lx7/b;->k(Landroid/content/Context;Lx7/b$d;)V

    .line 6
    invoke-static {p1}, Lh7/b;->e(Landroid/content/Context;)V

    .line 7
    new-instance v4, Li8/a;

    invoke-direct {v4}, Li8/a;-><init>()V

    iget-object v9, p0, Lh8/s;->a:Lh8/s$b;

    move-object v2, p0

    move-object v3, p1

    move-object v7, p2

    invoke-virtual/range {v2 .. v9}, Lh8/s;->d(Landroid/content/Context;Li8/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V

    :cond_0
    return-void
.end method
