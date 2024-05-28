.class final Lrb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lrb/k;

.field private final b:Lob/a;

.field private final c:Lrb/g;

.field private final d:Lob/g;

.field private final e:Lob/v;

.field private f:Lrb/j$a;

.field private final g:Lrb/j;

.field private h:Lrb/e;

.field private i:Z

.field private j:Lob/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lrb/k;Lrb/g;Lob/a;Lob/g;Lob/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrb/d;->a:Lrb/k;

    .line 3
    iput-object p2, p0, Lrb/d;->c:Lrb/g;

    .line 4
    iput-object p3, p0, Lrb/d;->b:Lob/a;

    .line 5
    iput-object p4, p0, Lrb/d;->d:Lob/g;

    .line 6
    iput-object p5, p0, Lrb/d;->e:Lob/v;

    .line 7
    new-instance p1, Lrb/j;

    iget-object p2, p2, Lrb/g;->e:Lrb/h;

    invoke-direct {p1, p3, p2, p4, p5}, Lrb/j;-><init>(Lob/a;Lrb/h;Lob/g;Lob/v;)V

    iput-object p1, p0, Lrb/d;->g:Lrb/j;

    return-void
.end method

.method private c(IIIIZ)Lrb/e;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 1
    iget-object v2, v1, Lrb/d;->c:Lrb/g;

    monitor-enter v2

    .line 2
    :try_start_0
    iget-object v0, v1, Lrb/d;->a:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->i()Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, v1, Lrb/d;->i:Z

    .line 4
    iget-object v3, v1, Lrb/d;->a:Lrb/k;

    iget-object v4, v3, Lrb/k;->i:Lrb/e;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 5
    iget-boolean v6, v4, Lrb/e;->k:Z

    if-eqz v6, :cond_0

    .line 6
    invoke-virtual {v3}, Lrb/k;->n()Ljava/net/Socket;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v5

    .line 7
    :goto_0
    iget-object v6, v1, Lrb/d;->a:Lrb/k;

    iget-object v7, v6, Lrb/k;->i:Lrb/e;

    if-eqz v7, :cond_1

    move-object v4, v5

    goto :goto_1

    :cond_1
    move-object v7, v5

    :goto_1
    const/4 v8, 0x1

    if-nez v7, :cond_4

    .line 8
    iget-object v9, v1, Lrb/d;->c:Lrb/g;

    iget-object v10, v1, Lrb/d;->b:Lob/a;

    invoke-virtual {v9, v10, v6, v5, v0}, Lrb/g;->h(Lob/a;Lrb/k;Ljava/util/List;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 9
    iget-object v6, v1, Lrb/d;->a:Lrb/k;

    iget-object v7, v6, Lrb/k;->i:Lrb/e;

    move-object v6, v5

    const/4 v9, 0x1

    goto :goto_3

    .line 10
    :cond_2
    iget-object v6, v1, Lrb/d;->j:Lob/k0;

    if-eqz v6, :cond_3

    .line 11
    iput-object v5, v1, Lrb/d;->j:Lob/k0;

    goto :goto_2

    .line 12
    :cond_3
    invoke-direct/range {p0 .. p0}, Lrb/d;->g()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 13
    iget-object v6, v1, Lrb/d;->a:Lrb/k;

    iget-object v6, v6, Lrb/k;->i:Lrb/e;

    invoke-virtual {v6}, Lrb/e;->r()Lob/k0;

    move-result-object v6

    goto :goto_2

    :cond_4
    move-object v6, v5

    :goto_2
    const/4 v9, 0x0

    .line 14
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    invoke-static {v3}, Lpb/e;->h(Ljava/net/Socket;)V

    if-eqz v4, :cond_5

    .line 16
    iget-object v2, v1, Lrb/d;->e:Lob/v;

    iget-object v3, v1, Lrb/d;->d:Lob/g;

    invoke-virtual {v2, v3, v4}, Lob/v;->i(Lob/g;Lob/l;)V

    :cond_5
    if-eqz v9, :cond_6

    .line 17
    iget-object v2, v1, Lrb/d;->e:Lob/v;

    iget-object v3, v1, Lrb/d;->d:Lob/g;

    invoke-virtual {v2, v3, v7}, Lob/v;->h(Lob/g;Lob/l;)V

    :cond_6
    if-eqz v7, :cond_7

    return-object v7

    :cond_7
    if-nez v6, :cond_9

    .line 18
    iget-object v2, v1, Lrb/d;->f:Lrb/j$a;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lrb/j$a;->b()Z

    move-result v2

    if-nez v2, :cond_9

    .line 19
    :cond_8
    iget-object v2, v1, Lrb/d;->g:Lrb/j;

    invoke-virtual {v2}, Lrb/j;->d()Lrb/j$a;

    move-result-object v2

    iput-object v2, v1, Lrb/d;->f:Lrb/j$a;

    const/4 v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    .line 20
    :goto_4
    iget-object v3, v1, Lrb/d;->c:Lrb/g;

    monitor-enter v3

    .line 21
    :try_start_1
    iget-object v4, v1, Lrb/d;->a:Lrb/k;

    invoke-virtual {v4}, Lrb/k;->i()Z

    move-result v4

    if-nez v4, :cond_10

    if-eqz v2, :cond_a

    .line 22
    iget-object v2, v1, Lrb/d;->f:Lrb/j$a;

    invoke-virtual {v2}, Lrb/j$a;->a()Ljava/util/List;

    move-result-object v2

    .line 23
    iget-object v4, v1, Lrb/d;->c:Lrb/g;

    iget-object v10, v1, Lrb/d;->b:Lob/a;

    iget-object v11, v1, Lrb/d;->a:Lrb/k;

    invoke-virtual {v4, v10, v11, v2, v0}, Lrb/g;->h(Lob/a;Lrb/k;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 24
    iget-object v0, v1, Lrb/d;->a:Lrb/k;

    iget-object v7, v0, Lrb/k;->i:Lrb/e;

    const/4 v9, 0x1

    goto :goto_5

    :cond_a
    move-object v2, v5

    :cond_b
    :goto_5
    if-nez v9, :cond_d

    if-nez v6, :cond_c

    .line 25
    iget-object v0, v1, Lrb/d;->f:Lrb/j$a;

    invoke-virtual {v0}, Lrb/j$a;->c()Lob/k0;

    move-result-object v0

    move-object v6, v0

    .line 26
    :cond_c
    new-instance v7, Lrb/e;

    iget-object v0, v1, Lrb/d;->c:Lrb/g;

    invoke-direct {v7, v0, v6}, Lrb/e;-><init>(Lrb/g;Lob/k0;)V

    .line 27
    iput-object v7, v1, Lrb/d;->h:Lrb/e;

    .line 28
    :cond_d
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v9, :cond_e

    .line 29
    iget-object v0, v1, Lrb/d;->e:Lob/v;

    iget-object v2, v1, Lrb/d;->d:Lob/g;

    invoke-virtual {v0, v2, v7}, Lob/v;->h(Lob/g;Lob/l;)V

    return-object v7

    .line 30
    :cond_e
    iget-object v0, v1, Lrb/d;->d:Lob/g;

    iget-object v3, v1, Lrb/d;->e:Lob/v;

    move-object v10, v7

    move/from16 v11, p1

    move/from16 v12, p2

    move/from16 v13, p3

    move/from16 v14, p4

    move/from16 v15, p5

    move-object/from16 v16, v0

    move-object/from16 v17, v3

    invoke-virtual/range {v10 .. v17}, Lrb/e;->e(IIIIZLob/g;Lob/v;)V

    .line 31
    iget-object v0, v1, Lrb/d;->c:Lrb/g;

    iget-object v0, v0, Lrb/g;->e:Lrb/h;

    invoke-virtual {v7}, Lrb/e;->r()Lob/k0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lrb/h;->a(Lob/k0;)V

    .line 32
    iget-object v4, v1, Lrb/d;->c:Lrb/g;

    monitor-enter v4

    .line 33
    :try_start_2
    iput-object v5, v1, Lrb/d;->h:Lrb/e;

    .line 34
    iget-object v0, v1, Lrb/d;->c:Lrb/g;

    iget-object v3, v1, Lrb/d;->b:Lob/a;

    iget-object v9, v1, Lrb/d;->a:Lrb/k;

    invoke-virtual {v0, v3, v9, v2, v8}, Lrb/g;->h(Lob/a;Lrb/k;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 35
    iput-boolean v8, v7, Lrb/e;->k:Z

    .line 36
    invoke-virtual {v7}, Lrb/e;->t()Ljava/net/Socket;

    move-result-object v5

    .line 37
    iget-object v0, v1, Lrb/d;->a:Lrb/k;

    iget-object v7, v0, Lrb/k;->i:Lrb/e;

    .line 38
    iput-object v6, v1, Lrb/d;->j:Lob/k0;

    goto :goto_6

    .line 39
    :cond_f
    iget-object v0, v1, Lrb/d;->c:Lrb/g;

    invoke-virtual {v0, v7}, Lrb/g;->g(Lrb/e;)V

    .line 40
    iget-object v0, v1, Lrb/d;->a:Lrb/k;

    invoke-virtual {v0, v7}, Lrb/k;->a(Lrb/e;)V

    .line 41
    :goto_6
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    invoke-static {v5}, Lpb/e;->h(Ljava/net/Socket;)V

    .line 43
    iget-object v0, v1, Lrb/d;->e:Lob/v;

    iget-object v2, v1, Lrb/d;->d:Lob/g;

    invoke-virtual {v0, v2, v7}, Lob/v;->h(Lob/g;Lob/l;)V

    return-object v7

    :catchall_0
    move-exception v0

    .line 44
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 45
    :cond_10
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 46
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 47
    :cond_11
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    .line 48
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method private d(IIIIZZ)Lrb/e;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    invoke-direct/range {p0 .. p5}, Lrb/d;->c(IIIIZ)Lrb/e;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lrb/d;->c:Lrb/g;

    monitor-enter v1

    .line 3
    :try_start_0
    iget v2, v0, Lrb/e;->m:I

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lrb/e;->o()Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    monitor-exit v1

    return-object v0

    .line 5
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-virtual {v0, p6}, Lrb/e;->n(Z)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {v0}, Lrb/e;->q()V

    goto :goto_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    .line 8
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private g()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/d;->a:Lrb/k;

    iget-object v0, v0, Lrb/k;->i:Lrb/e;

    if-eqz v0, :cond_0

    iget v1, v0, Lrb/e;->l:I

    if-nez v1, :cond_0

    .line 2
    invoke-virtual {v0}, Lrb/e;->r()Lob/k0;

    move-result-object v0

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    iget-object v1, p0, Lrb/d;->b:Lob/a;

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-static {v0, v1}, Lpb/e;->E(Lob/z;Lob/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method a()Lrb/e;
    .locals 1

    iget-object v0, p0, Lrb/d;->h:Lrb/e;

    return-object v0
.end method

.method public b(Lob/d0;Lob/a0$a;Z)Lsb/c;
    .locals 7

    .line 1
    invoke-interface {p2}, Lob/a0$a;->c()I

    move-result v1

    .line 2
    invoke-interface {p2}, Lob/a0$a;->d()I

    move-result v2

    .line 3
    invoke-interface {p2}, Lob/a0$a;->f()I

    move-result v3

    .line 4
    invoke-virtual {p1}, Lob/d0;->y()I

    move-result v4

    .line 5
    invoke-virtual {p1}, Lob/d0;->F()Z

    move-result v5

    move-object v0, p0

    move v6, p3

    .line 6
    :try_start_0
    invoke-direct/range {v0 .. v6}, Lrb/d;->d(IIIIZZ)Lrb/e;

    move-result-object p3

    .line 7
    invoke-virtual {p3, p1, p2}, Lrb/e;->p(Lob/d0;Lob/a0$a;)Lsb/c;

    move-result-object p1
    :try_end_0
    .catch Lrb/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p0}, Lrb/d;->h()V

    .line 9
    new-instance p2, Lrb/i;

    invoke-direct {p2, p1}, Lrb/i;-><init>(Ljava/io/IOException;)V

    throw p2

    :catch_1
    move-exception p1

    .line 10
    invoke-virtual {p0}, Lrb/d;->h()V

    .line 11
    throw p1
.end method

.method e()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lrb/d;->c:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lrb/d;->j:Lob/k0;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return v2

    .line 4
    :cond_0
    invoke-direct {p0}, Lrb/d;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lrb/d;->a:Lrb/k;

    iget-object v1, v1, Lrb/k;->i:Lrb/e;

    invoke-virtual {v1}, Lrb/e;->r()Lob/k0;

    move-result-object v1

    iput-object v1, p0, Lrb/d;->j:Lob/k0;

    .line 6
    monitor-exit v0

    return v2

    .line 7
    :cond_1
    iget-object v1, p0, Lrb/d;->f:Lrb/j$a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lrb/j$a;->b()Z

    move-result v1

    if-nez v1, :cond_4

    :cond_2
    iget-object v1, p0, Lrb/d;->g:Lrb/j;

    .line 8
    invoke-virtual {v1}, Lrb/j;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method f()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/d;->c:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lrb/d;->i:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/d;->c:Lrb/g;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lrb/d;->i:Z

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
