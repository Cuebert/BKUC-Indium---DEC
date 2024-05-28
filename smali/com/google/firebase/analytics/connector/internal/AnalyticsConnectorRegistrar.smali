.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/i;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getComponents$0(Lj5/e;)Li5/a;
    .locals 3

    .line 1
    const-class v0, Lh5/c;

    invoke-interface {p0, v0}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/c;

    const-class v1, Landroid/content/Context;

    .line 2
    invoke-interface {p0, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lp5/d;

    .line 3
    invoke-interface {p0, v2}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp5/d;

    .line 4
    invoke-static {v0, v1, p0}, Li5/b;->c(Lh5/c;Landroid/content/Context;Lp5/d;)Li5/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj5/d<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lj5/d;

    .line 1
    const-class v1, Li5/a;

    invoke-static {v1}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lh5/c;

    .line 2
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    .line 3
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lp5/d;

    .line 4
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/analytics/connector/internal/a;->a:Lcom/google/firebase/analytics/connector/internal/a;

    .line 5
    invoke-virtual {v1, v2}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lj5/d$b;->e()Lj5/d$b;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lj5/d$b;->d()Lj5/d;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-analytics"

    const-string v2, "20.0.0"

    .line 8
    invoke-static {v1, v2}, La6/h;->b(Ljava/lang/String;Ljava/lang/String;)Lj5/d;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 9
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
