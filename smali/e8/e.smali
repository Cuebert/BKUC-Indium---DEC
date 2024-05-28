.class public Le8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/e$d;,
        Le8/e$c;
    }
.end annotation


# instance fields
.field private a:Lh7/f;

.field private b:Lx7/e;


# direct methods
.method public constructor <init>(Lh7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le8/e;->a:Lh7/f;

    .line 3
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object p1

    iput-object p1, p0, Le8/e;->b:Lx7/e;

    return-void
.end method

.method static synthetic a(Le8/e;)Lx7/e;
    .locals 0

    iget-object p0, p0, Le8/e;->b:Lx7/e;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V
    .locals 1

    .line 1
    new-instance v0, Li7/e;

    invoke-direct {v0, p2, p3}, Li7/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p3, Le8/e$a;

    invoke-direct {p3, p0, p4, p2}, Le8/e$a;-><init>(Le8/e;Le8/e$d;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Le8/e;->a:Lh7/f;

    const/4 p4, 0x0

    invoke-interface {p2, p1, v0, p4, p3}, Lh7/f;->a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lh7/a;->c()V

    .line 5
    iget-object p1, p0, Le8/e;->b:Lx7/e;

    invoke-virtual {p1}, Lx7/e;->E()V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V
    .locals 8

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Get balance."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    new-instance v7, Le8/e$b;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Le8/e$b;-><init>(Le8/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V

    iget-object p1, p0, Le8/e;->a:Lh7/f;

    invoke-virtual {v0, v7, p1}, Lx7/g;->n(Lx7/g$d;Lh7/f;)V

    return-void
.end method
