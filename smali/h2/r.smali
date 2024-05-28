.class public Lh2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lb2/e;

.field private final c:Li2/d;

.field private final d:Lh2/x;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lj2/b;

.field private final g:Lk2/a;

.field private final h:Lk2/a;

.field private final i:Li2/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb2/e;Li2/d;Lh2/x;Ljava/util/concurrent/Executor;Lj2/b;Lk2/a;Lk2/a;Li2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh2/r;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lh2/r;->b:Lb2/e;

    .line 4
    iput-object p3, p0, Lh2/r;->c:Li2/d;

    .line 5
    iput-object p4, p0, Lh2/r;->d:Lh2/x;

    .line 6
    iput-object p5, p0, Lh2/r;->e:Ljava/util/concurrent/Executor;

    .line 7
    iput-object p6, p0, Lh2/r;->f:Lj2/b;

    .line 8
    iput-object p7, p0, Lh2/r;->g:Lk2/a;

    .line 9
    iput-object p8, p0, Lh2/r;->h:Lk2/a;

    .line 10
    iput-object p9, p0, Lh2/r;->i:Li2/c;

    return-void
.end method

.method public static synthetic a(Lh2/r;La2/o;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/r;->t(La2/o;ILjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lh2/r;La2/o;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lh2/r;->l(La2/o;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh2/r;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lh2/r;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lh2/r;La2/o;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lh2/r;->m(La2/o;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lh2/r;Ljava/lang/Iterable;La2/o;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lh2/r;->n(Ljava/lang/Iterable;La2/o;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh2/r;La2/o;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/r;->r(La2/o;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lh2/r;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lh2/r;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lh2/r;La2/o;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lh2/r;->s(La2/o;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lh2/r;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lh2/r;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(La2/o;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lh2/r;->c:Li2/d;

    invoke-interface {v0, p1}, Li2/d;->w(La2/o;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(La2/o;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lh2/r;->c:Li2/d;

    invoke-interface {v0, p1}, Li2/d;->v(La2/o;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;La2/o;J)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh2/r;->c:Li2/d;

    invoke-interface {v0, p1}, Li2/d;->Z(Ljava/lang/Iterable;)V

    .line 2
    iget-object p1, p0, Lh2/r;->c:Li2/d;

    iget-object v0, p0, Lh2/r;->g:Lk2/a;

    .line 3
    invoke-interface {v0}, Lk2/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    .line 4
    invoke-interface {p1, p2, v0, v1}, Li2/d;->y(La2/o;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/r;->c:Li2/d;

    invoke-interface {v0, p1}, Li2/d;->m(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/r;->i:Li2/c;

    invoke-interface {v0}, Li2/c;->i()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2
    iget-object v1, p0, Lh2/r;->i:Li2/c;

    .line 3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Ld2/c$b;->t:Ld2/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    invoke-interface {v1, v2, v3, v4, v0}, Li2/c;->c(JLd2/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(La2/o;J)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lh2/r;->c:Li2/d;

    iget-object v1, p0, Lh2/r;->g:Lk2/a;

    .line 2
    invoke-interface {v1}, Lk2/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    .line 3
    invoke-interface {v0, p1, v1, v2}, Li2/d;->y(La2/o;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(La2/o;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/r;->d:Lh2/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lh2/x;->a(La2/o;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(La2/o;ILjava/lang/Runnable;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lh2/r;->f:Lj2/b;

    iget-object v1, p0, Lh2/r;->c:Li2/d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lh2/q;

    invoke-direct {v2, v1}, Lh2/q;-><init>(Li2/d;)V

    invoke-interface {v0, v2}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Lh2/r;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lh2/r;->f:Lj2/b;

    new-instance v1, Lh2/k;

    invoke-direct {v1, p0, p1, p2}, Lh2/k;-><init>(Lh2/r;La2/o;I)V

    invoke-interface {v0, v1}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2}, Lh2/r;->u(La2/o;I)Lb2/g;
    :try_end_0
    .catch Lj2/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :catch_0
    :try_start_1
    iget-object v0, p0, Lh2/r;->d:Lh2/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lh2/x;->a(La2/o;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 7
    throw p1
.end method


# virtual methods
.method public j(Lb2/m;)La2/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lh2/r;->f:Lj2/b;

    iget-object v1, p0, Lh2/r;->i:Li2/c;

    .line 2
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lh2/p;

    invoke-direct {v2, v1}, Lh2/p;-><init>(Li2/c;)V

    invoke-interface {v0, v2}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld2/a;

    .line 3
    invoke-static {}, La2/i;->a()La2/i$a;

    move-result-object v1

    iget-object v2, p0, Lh2/r;->g:Lk2/a;

    .line 4
    invoke-interface {v2}, Lk2/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La2/i$a;->i(J)La2/i$a;

    move-result-object v1

    iget-object v2, p0, Lh2/r;->h:Lk2/a;

    .line 5
    invoke-interface {v2}, Lk2/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La2/i$a;->k(J)La2/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    .line 6
    invoke-virtual {v1, v2}, La2/i$a;->j(Ljava/lang/String;)La2/i$a;

    move-result-object v1

    new-instance v2, La2/h;

    const-string v3, "proto"

    .line 7
    invoke-static {v3}, Ly1/b;->b(Ljava/lang/String;)Ly1/b;

    move-result-object v3

    invoke-virtual {v0}, Ld2/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, La2/h;-><init>(Ly1/b;[B)V

    .line 8
    invoke-virtual {v1, v2}, La2/i$a;->h(La2/h;)La2/i$a;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, La2/i$a;->d()La2/i;

    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lb2/m;->a(La2/i;)La2/i;

    move-result-object p1

    return-object p1
.end method

.method k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh2/r;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 3
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(La2/o;I)Lb2/g;
    .locals 11

    .line 1
    iget-object v0, p0, Lh2/r;->b:Lb2/e;

    invoke-virtual {p1}, La2/o;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lb2/e;->a(Ljava/lang/String;)Lb2/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 2
    invoke-static {v1, v2}, Lb2/g;->e(J)Lb2/g;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    .line 3
    :cond_1
    :goto_1
    iget-object v1, p0, Lh2/r;->f:Lj2/b;

    new-instance v2, Lh2/i;

    invoke-direct {v2, p0, p1}, Lh2/i;-><init>(Lh2/r;La2/o;)V

    invoke-interface {v1, v2}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 4
    iget-object v1, p0, Lh2/r;->f:Lj2/b;

    new-instance v2, Lh2/j;

    invoke-direct {v2, p0, p1}, Lh2/j;-><init>(Lh2/r;La2/o;)V

    .line 5
    invoke-interface {v1, v2}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    .line 6
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    .line 7
    invoke-static {v1, v2, p1}, Le2/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Lb2/g;->a()Lb2/g;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    .line 9
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/k;

    .line 11
    invoke-virtual {v3}, Li2/k;->b()La2/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 12
    :cond_4
    invoke-virtual {p1}, La2/o;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {p0, v0}, Lh2/r;->j(Lb2/m;)La2/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_5
    invoke-static {}, Lb2/f;->a()Lb2/f$a;

    move-result-object v2

    .line 15
    invoke-virtual {v2, v1}, Lb2/f$a;->b(Ljava/lang/Iterable;)Lb2/f$a;

    move-result-object v1

    .line 16
    invoke-virtual {p1}, La2/o;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/f$a;->c([B)Lb2/f$a;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lb2/f$a;->a()Lb2/f;

    move-result-object v1

    .line 18
    invoke-interface {v0, v1}, Lb2/m;->b(Lb2/f;)Lb2/g;

    move-result-object v1

    goto :goto_2

    .line 19
    :goto_4
    invoke-virtual {v3}, Lb2/g;->c()Lb2/g$a;

    move-result-object v1

    sget-object v2, Lb2/g$a;->o:Lb2/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    .line 20
    iget-object v0, p0, Lh2/r;->f:Lj2/b;

    new-instance v1, Lh2/n;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lh2/n;-><init>(Lh2/r;Ljava/lang/Iterable;La2/o;J)V

    invoke-interface {v0, v1}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    .line 21
    iget-object v0, p0, Lh2/r;->d:Lh2/x;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, Lh2/x;->b(La2/o;IZ)V

    return-object v3

    .line 22
    :cond_6
    iget-object v1, p0, Lh2/r;->f:Lj2/b;

    new-instance v2, Lh2/m;

    invoke-direct {v2, p0, v6}, Lh2/m;-><init>(Lh2/r;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    .line 23
    invoke-virtual {v3}, Lb2/g;->c()Lb2/g$a;

    move-result-object v1

    sget-object v2, Lb2/g$a;->n:Lb2/g$a;

    if-ne v1, v2, :cond_7

    .line 24
    invoke-virtual {v3}, Lb2/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 25
    invoke-virtual {p1}, La2/o;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 26
    iget-object v4, p0, Lh2/r;->f:Lj2/b;

    new-instance v5, Lh2/g;

    invoke-direct {v5, p0}, Lh2/g;-><init>(Lh2/r;)V

    invoke-interface {v4, v5}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 27
    :cond_7
    invoke-virtual {v3}, Lb2/g;->c()Lb2/g$a;

    move-result-object v1

    sget-object v2, Lb2/g$a;->q:Lb2/g$a;

    if-ne v1, v2, :cond_1

    .line 28
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/k;

    .line 30
    invoke-virtual {v4}, Li2/k;->b()La2/i;

    move-result-object v4

    invoke-virtual {v4}, La2/i;->j()Ljava/lang/String;

    move-result-object v4

    .line 31
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 32
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 33
    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 34
    :cond_9
    iget-object v2, p0, Lh2/r;->f:Lj2/b;

    new-instance v4, Lh2/o;

    invoke-direct {v4, p0, v1}, Lh2/o;-><init>(Lh2/r;Ljava/util/Map;)V

    invoke-interface {v2, v4}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 35
    :cond_a
    iget-object p2, p0, Lh2/r;->f:Lj2/b;

    new-instance v0, Lh2/l;

    invoke-direct {v0, p0, p1, v8, v9}, Lh2/l;-><init>(Lh2/r;La2/o;J)V

    invoke-interface {p2, v0}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(La2/o;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lh2/r;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lh2/h;

    invoke-direct {v1, p0, p1, p2, p3}, Lh2/h;-><init>(Lh2/r;La2/o;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
