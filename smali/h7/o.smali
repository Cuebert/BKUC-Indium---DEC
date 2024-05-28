.class public Lh7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/m;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Lh8/r;

    invoke-direct {v1}, Lh8/r;-><init>()V

    .line 3
    invoke-virtual {v1, p1, v0}, Lh8/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->c()Lr9/i;

    move-result-object v0

    new-instance v1, Lt9/a;

    invoke-direct {v1, p1, p2}, Lt9/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lr9/i;->c(Lt9/a;)Lgc/b;

    move-result-object p1

    new-instance p2, Lh7/o$a;

    invoke-direct {p2, p0}, Lh7/o$a;-><init>(Lh7/o;)V

    invoke-interface {p1, p2}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method
