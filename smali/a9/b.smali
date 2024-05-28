.class public La9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/b$d;,
        La9/b$c;
    }
.end annotation


# instance fields
.field protected a:Lx7/e;

.field protected b:Lh7/f;


# direct methods
.method public constructor <init>(Lx7/e;Lh7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La9/b;->a:Lx7/e;

    .line 3
    iput-object p2, p0, La9/b;->b:Lh7/f;

    return-void
.end method

.method private c(Ljava/lang/String;La9/b$c;)Lh7/l;
    .locals 1

    new-instance v0, La9/b$a;

    invoke-direct {v0, p0, p2, p1}, La9/b$a;-><init>(La9/b;La9/b$c;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;La9/b$c;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->S0()Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Li7/a;

    const-string v2, "Login"

    invoke-direct {v1, p1, p2, v2}, Li7/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p3}, La9/b;->c(Ljava/lang/String;La9/b$c;)Lh7/l;

    move-result-object p1

    .line 4
    iget-object p2, p0, La9/b;->b:Lh7/f;

    const/4 p3, 0x0

    invoke-interface {p2, v0, v1, p3, p1}, Lh7/f;->a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;

    move-result-object p1

    .line 5
    invoke-interface {p1}, Lh7/e;->c()V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa9/b$c;)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->R0()Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v7, Li7/b;

    const-string v6, "Login"

    move-object v1, v7

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move v5, p4

    invoke-direct/range {v1 .. v6}, Li7/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1, p5}, La9/b;->d(Ljava/lang/String;La9/b$c;)Lh7/l;

    move-result-object p1

    .line 4
    iget-object p2, p0, La9/b;->b:Lh7/f;

    const/4 p3, 0x0

    invoke-interface {p2, v0, v7, p3, p1}, Lh7/f;->a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;

    move-result-object p1

    .line 5
    invoke-interface {p1}, Lh7/e;->c()V

    return-void
.end method

.method protected d(Ljava/lang/String;La9/b$c;)Lh7/l;
    .locals 1

    new-instance v0, La9/b$b;

    invoke-direct {v0, p0, p2, p1}, La9/b$b;-><init>(La9/b;La9/b$c;Ljava/lang/String;)V

    return-object v0
.end method
