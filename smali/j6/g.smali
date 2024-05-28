.class public final Lj6/g;
.super Lg6/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg6/f<",
        "Ljava/util/List<",
        "Li6/a;",
        ">;",
        "Lk6/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final j:Ll6/d;

.field static k:Z


# instance fields
.field private final d:Li6/c;

.field private final e:Lj6/h;

.field private final f:Lw3/pa;

.field private final g:Lw3/ra;

.field private final h:Ll6/a;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ll6/d;->b()Ll6/d;

    move-result-object v0

    sput-object v0, Lj6/g;->j:Ll6/d;

    const/4 v0, 0x1

    sput-boolean v0, Lj6/g;->k:Z

    return-void
.end method

.method public constructor <init>(Lg6/i;Li6/c;Lj6/h;Lw3/pa;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lg6/f;-><init>()V

    .line 2
    new-instance v0, Ll6/a;

    invoke-direct {v0}, Ll6/a;-><init>()V

    iput-object v0, p0, Lj6/g;->h:Ll6/a;

    const-string v0, "MlKitContext can not be null"

    .line 3
    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "BarcodeScannerOptions can not be null"

    .line 4
    invoke-static {p2, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lj6/g;->d:Li6/c;

    iput-object p3, p0, Lj6/g;->e:Lj6/h;

    iput-object p4, p0, Lj6/g;->f:Lw3/pa;

    .line 5
    invoke-virtual {p1}, Lg6/i;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lw3/ra;->a(Landroid/content/Context;)Lw3/ra;

    move-result-object p1

    iput-object p1, p0, Lj6/g;->g:Lw3/ra;

    return-void
.end method

.method private final l(Lw3/c8;JLk6/a;Ljava/util/List;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c8;",
            "J",
            "Lk6/a;",
            "Ljava/util/List<",
            "Li6/a;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v8, p0

    new-instance v9, Lw3/y0;

    .line 1
    invoke-direct {v9}, Lw3/y0;-><init>()V

    new-instance v10, Lw3/y0;

    .line 2
    invoke-direct {v10}, Lw3/y0;-><init>()V

    if-eqz p5, :cond_0

    .line 3
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li6/a;

    .line 4
    invoke-virtual {v1}, Li6/a;->a()I

    move-result v2

    invoke-static {v2}, Lj6/b;->a(I)Lw3/p8;

    move-result-object v2

    invoke-virtual {v9, v2}, Lw3/y0;->e(Ljava/lang/Object;)Lw3/y0;

    .line 5
    invoke-virtual {v1}, Li6/a;->c()I

    move-result v1

    invoke-static {v1}, Lj6/b;->b(I)Lw3/q8;

    move-result-object v1

    invoke-virtual {v10, v1}, Lw3/y0;->e(Ljava/lang/Object;)Lw3/y0;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v11, v0, p2

    new-instance v13, Lj6/f;

    move-object v0, v13

    move-object/from16 v1, p0

    move-wide v2, v11

    move-object/from16 v4, p1

    move-object v5, v9

    move-object v6, v10

    move-object/from16 v7, p4

    .line 7
    invoke-direct/range {v0 .. v7}, Lj6/f;-><init>(Lj6/g;JLw3/c8;Lw3/y0;Lw3/y0;Lk6/a;)V

    iget-object v0, v8, Lj6/g;->f:Lw3/pa;

    .line 8
    sget-object v1, Lw3/d8;->w:Lw3/d8;

    invoke-virtual {v0, v13, v1}, Lw3/pa;->b(Lw3/na;Lw3/d8;)V

    new-instance v0, Lw3/p2;

    invoke-direct {v0}, Lw3/p2;-><init>()V

    move-object/from16 v1, p1

    .line 9
    invoke-virtual {v0, v1}, Lw3/p2;->e(Lw3/c8;)Lw3/p2;

    sget-boolean v2, Lj6/g;->k:Z

    .line 10
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lw3/p2;->f(Ljava/lang/Boolean;)Lw3/p2;

    iget-object v2, v8, Lj6/g;->d:Li6/c;

    .line 11
    invoke-static {v2}, Lj6/b;->c(Li6/c;)Lw3/ca;

    move-result-object v2

    invoke-virtual {v0, v2}, Lw3/p2;->g(Lw3/ca;)Lw3/p2;

    .line 12
    invoke-virtual {v9}, Lw3/y0;->g()Lw3/c1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lw3/p2;->c(Lw3/c1;)Lw3/p2;

    .line 13
    invoke-virtual {v10}, Lw3/y0;->g()Lw3/c1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lw3/p2;->d(Lw3/c1;)Lw3/p2;

    invoke-virtual {v0}, Lw3/p2;->h()Lw3/q2;

    move-result-object v3

    new-instance v7, Lj6/e;

    .line 14
    invoke-direct {v7, v8}, Lj6/e;-><init>(Lj6/g;)V

    iget-object v2, v8, Lj6/g;->f:Lw3/pa;

    sget-object v6, Lw3/d8;->o1:Lw3/d8;

    move-wide v4, v11

    .line 15
    invoke-virtual/range {v2 .. v7}, Lw3/pa;->f(Ljava/lang/Object;JLw3/d8;Lj6/e;)V

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    iget-boolean v0, v8, Lj6/g;->i:Z

    sub-long v16, v18, v11

    iget-object v13, v8, Lj6/g;->g:Lw3/ra;

    const/4 v2, 0x1

    if-eq v2, v0, :cond_1

    const/16 v0, 0x5eed

    const/16 v14, 0x5eed

    goto :goto_1

    :cond_1
    const/16 v0, 0x5eee

    const/16 v14, 0x5eee

    .line 17
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lw3/c8;->zza()I

    move-result v15

    .line 18
    invoke-virtual/range {v13 .. v19}, Lw3/ra;->c(IIJJ)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj6/g;->e:Lj6/h;

    invoke-interface {v0}, Lj6/h;->a()Z

    move-result v0

    iput-boolean v0, p0, Lj6/g;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj6/g;->e:Lj6/h;

    invoke-interface {v0}, Lj6/h;->zzb()V

    const/4 v0, 0x1

    sput-boolean v0, Lj6/g;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final bridge synthetic h(Lg6/h;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation

    check-cast p1, Lk6/a;

    invoke-virtual {p0, p1}, Lj6/g;->i(Lk6/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized i(Lk6/a;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/a;",
            ")",
            "Ljava/util/List<",
            "Li6/a;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object v0, p0, Lj6/g;->h:Ll6/a;

    .line 2
    invoke-virtual {v0, p1}, Ll6/a;->a(Lk6/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lj6/g;->e:Lj6/h;

    .line 3
    invoke-interface {v0, p1}, Lj6/h;->b(Lk6/a;)Ljava/util/List;

    move-result-object v8

    .line 4
    sget-object v1, Lw3/c8;->o:Lw3/c8;

    move-object v0, p0

    move-wide v2, v6

    move-object v4, p1

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lj6/g;->l(Lw3/c8;JLk6/a;Ljava/util/List;)V

    const/4 v0, 0x0

    sput-boolean v0, Lj6/g;->k:Z
    :try_end_1
    .catch Lc6/a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v8

    :catch_0
    move-exception v0

    move-object v8, v0

    .line 5
    :try_start_2
    invoke-virtual {v8}, Lc6/a;->a()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_0

    .line 6
    sget-object v0, Lw3/c8;->y:Lw3/c8;

    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, Lw3/c8;->b0:Lw3/c8;

    :goto_0
    move-object v1, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, v6

    move-object v4, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lj6/g;->l(Lw3/c8;JLk6/a;Ljava/util/List;)V

    .line 9
    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final synthetic j(JLw3/c8;Lw3/y0;Lw3/y0;Lk6/a;)Lw3/sa;
    .locals 2

    new-instance v0, Lw3/r8;

    invoke-direct {v0}, Lw3/r8;-><init>()V

    new-instance v1, Lw3/v7;

    invoke-direct {v1}, Lw3/v7;-><init>()V

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw3/v7;->c(Ljava/lang/Long;)Lw3/v7;

    .line 2
    invoke-virtual {v1, p3}, Lw3/v7;->d(Lw3/c8;)Lw3/v7;

    sget-boolean p1, Lj6/g;->k:Z

    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw3/v7;->e(Ljava/lang/Boolean;)Lw3/v7;

    .line 4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Lw3/v7;->a(Ljava/lang/Boolean;)Lw3/v7;

    .line 5
    invoke-virtual {v1, p1}, Lw3/v7;->b(Ljava/lang/Boolean;)Lw3/v7;

    invoke-virtual {v1}, Lw3/v7;->f()Lw3/w7;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Lw3/r8;->h(Lw3/w7;)Lw3/r8;

    iget-object p1, p0, Lj6/g;->d:Li6/c;

    .line 7
    invoke-static {p1}, Lj6/b;->c(Li6/c;)Lw3/ca;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw3/r8;->i(Lw3/ca;)Lw3/r8;

    .line 8
    invoke-virtual {p4}, Lw3/y0;->g()Lw3/c1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw3/r8;->e(Lw3/c1;)Lw3/r8;

    .line 9
    invoke-virtual {p5}, Lw3/y0;->g()Lw3/c1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw3/r8;->f(Lw3/c1;)Lw3/r8;

    .line 10
    invoke-virtual {p6}, Lk6/a;->d()I

    move-result p1

    sget-object p2, Lj6/g;->j:Ll6/d;

    invoke-virtual {p2, p6}, Ll6/d;->c(Lk6/a;)I

    move-result p2

    new-instance p3, Lw3/q7;

    invoke-direct {p3}, Lw3/q7;-><init>()V

    const/4 p4, -0x1

    if-eq p1, p4, :cond_4

    const/16 p4, 0x23

    if-eq p1, p4, :cond_3

    const p4, 0x32315659

    if-eq p1, p4, :cond_2

    const/16 p4, 0x10

    if-eq p1, p4, :cond_1

    const/16 p4, 0x11

    if-eq p1, p4, :cond_0

    .line 11
    sget-object p1, Lw3/r7;->o:Lw3/r7;

    goto :goto_0

    .line 12
    :cond_0
    sget-object p1, Lw3/r7;->q:Lw3/r7;

    goto :goto_0

    .line 13
    :cond_1
    sget-object p1, Lw3/r7;->p:Lw3/r7;

    goto :goto_0

    .line 14
    :cond_2
    sget-object p1, Lw3/r7;->r:Lw3/r7;

    goto :goto_0

    .line 15
    :cond_3
    sget-object p1, Lw3/r7;->s:Lw3/r7;

    goto :goto_0

    .line 16
    :cond_4
    sget-object p1, Lw3/r7;->u:Lw3/r7;

    .line 17
    :goto_0
    invoke-virtual {p3, p1}, Lw3/q7;->a(Lw3/r7;)Lw3/q7;

    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lw3/q7;->b(Ljava/lang/Integer;)Lw3/q7;

    invoke-virtual {p3}, Lw3/q7;->d()Lw3/s7;

    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lw3/r8;->g(Lw3/s7;)Lw3/r8;

    new-instance p1, Lw3/f8;

    invoke-direct {p1}, Lw3/f8;-><init>()V

    iget-boolean p2, p0, Lj6/g;->i:Z

    .line 20
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lw3/f8;->e(Ljava/lang/Boolean;)Lw3/f8;

    invoke-virtual {v0}, Lw3/r8;->j()Lw3/s8;

    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Lw3/f8;->f(Lw3/s8;)Lw3/f8;

    .line 22
    invoke-static {p1}, Lw3/sa;->d(Lw3/f8;)Lw3/sa;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic k(Lw3/q2;ILw3/m7;)Lw3/sa;
    .locals 2

    new-instance v0, Lw3/f8;

    invoke-direct {v0}, Lw3/f8;-><init>()V

    iget-boolean v1, p0, Lj6/g;->i:Z

    .line 1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw3/f8;->e(Ljava/lang/Boolean;)Lw3/f8;

    new-instance v1, Lw3/o2;

    invoke-direct {v1}, Lw3/o2;-><init>()V

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lw3/o2;->a(Ljava/lang/Integer;)Lw3/o2;

    .line 3
    invoke-virtual {v1, p1}, Lw3/o2;->c(Lw3/q2;)Lw3/o2;

    .line 4
    invoke-virtual {v1, p3}, Lw3/o2;->b(Lw3/m7;)Lw3/o2;

    invoke-virtual {v1}, Lw3/o2;->e()Lw3/r2;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Lw3/f8;->c(Lw3/r2;)Lw3/f8;

    .line 6
    invoke-static {v0}, Lw3/sa;->d(Lw3/f8;)Lw3/sa;

    move-result-object p1

    return-object p1
.end method
