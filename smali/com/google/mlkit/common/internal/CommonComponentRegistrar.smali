.class public Lcom/google/mlkit/common/internal/CommonComponentRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 13
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj5/d<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Le6/a;

    const-class v1, Lg6/a;

    const-class v2, Lf6/c$a;

    const-class v3, Lg6/i;

    sget-object v4, Lg6/n;->b:Lj5/d;

    const-class v5, Lh6/b;

    .line 2
    invoke-static {v5}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v5

    .line 3
    invoke-static {v3}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v6

    invoke-virtual {v5, v6}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v5

    sget-object v6, Ld6/a;->a:Ld6/a;

    .line 4
    invoke-virtual {v5, v6}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v5

    .line 5
    invoke-virtual {v5}, Lj5/d$b;->d()Lj5/d;

    move-result-object v5

    const-class v6, Lg6/j;

    .line 6
    invoke-static {v6}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v6

    sget-object v7, Ld6/b;->a:Ld6/b;

    .line 7
    invoke-virtual {v6, v7}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v6

    .line 8
    invoke-virtual {v6}, Lj5/d$b;->d()Lj5/d;

    move-result-object v6

    const-class v7, Lf6/c;

    .line 9
    invoke-static {v7}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v7

    .line 10
    invoke-static {v2}, Lj5/q;->j(Ljava/lang/Class;)Lj5/q;

    move-result-object v8

    invoke-virtual {v7, v8}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v7

    sget-object v8, Ld6/c;->a:Ld6/c;

    .line 11
    invoke-virtual {v7, v8}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v7

    .line 12
    invoke-virtual {v7}, Lj5/d$b;->d()Lj5/d;

    move-result-object v7

    const-class v8, Lg6/d;

    .line 13
    invoke-static {v8}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v8

    const-class v9, Lg6/j;

    .line 14
    invoke-static {v9}, Lj5/q;->i(Ljava/lang/Class;)Lj5/q;

    move-result-object v9

    invoke-virtual {v8, v9}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v8

    sget-object v9, Ld6/d;->a:Ld6/d;

    .line 15
    invoke-virtual {v8, v9}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v8

    .line 16
    invoke-virtual {v8}, Lj5/d$b;->d()Lj5/d;

    move-result-object v8

    .line 17
    invoke-static {v1}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v9

    sget-object v10, Ld6/e;->a:Ld6/e;

    invoke-virtual {v9, v10}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v9

    invoke-virtual {v9}, Lj5/d$b;->d()Lj5/d;

    move-result-object v9

    const-class v10, Lg6/b;

    .line 18
    invoke-static {v10}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v10

    .line 19
    invoke-static {v1}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v1

    invoke-virtual {v10, v1}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    sget-object v10, Ld6/f;->a:Ld6/f;

    .line 20
    invoke-virtual {v1, v10}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lj5/d$b;->d()Lj5/d;

    move-result-object v10

    .line 22
    invoke-static {v0}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v1

    .line 23
    invoke-static {v3}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    sget-object v3, Ld6/g;->a:Ld6/g;

    .line 24
    invoke-virtual {v1, v3}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lj5/d$b;->d()Lj5/d;

    move-result-object v11

    .line 26
    invoke-static {v2}, Lj5/d;->j(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v1

    .line 27
    invoke-static {v0}, Lj5/q;->i(Ljava/lang/Class;)Lj5/q;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    sget-object v1, Ld6/h;->a:Ld6/h;

    .line 28
    invoke-virtual {v0, v1}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lj5/d$b;->d()Lj5/d;

    move-result-object v12

    .line 30
    invoke-static/range {v4 .. v12}, Lv3/h;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lv3/h;

    move-result-object v0

    return-object v0
.end method
