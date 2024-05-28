.class public final Lrb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/k$b;
    }
.end annotation


# instance fields
.field private final a:Lob/d0;

.field private final b:Lrb/g;

.field private final c:Lob/g;

.field private final d:Lob/v;

.field private final e:Lac/a;

.field private f:Ljava/lang/Object;

.field private g:Lob/g0;

.field private h:Lrb/d;

.field public i:Lrb/e;

.field private j:Lrb/c;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lob/d0;Lob/g;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lrb/k$a;

    invoke-direct {v0, p0}, Lrb/k$a;-><init>(Lrb/k;)V

    iput-object v0, p0, Lrb/k;->e:Lac/a;

    .line 3
    iput-object p1, p0, Lrb/k;->a:Lob/d0;

    .line 4
    sget-object v1, Lpb/a;->a:Lpb/a;

    invoke-virtual {p1}, Lob/d0;->j()Lob/m;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpb/a;->h(Lob/m;)Lrb/g;

    move-result-object v1

    iput-object v1, p0, Lrb/k;->b:Lrb/g;

    .line 5
    iput-object p2, p0, Lrb/k;->c:Lob/g;

    .line 6
    invoke-virtual {p1}, Lob/d0;->p()Lob/v$b;

    move-result-object v1

    invoke-interface {v1, p2}, Lob/v$b;->a(Lob/g;)Lob/v;

    move-result-object p2

    iput-object p2, p0, Lrb/k;->d:Lob/v;

    .line 7
    invoke-virtual {p1}, Lob/d0;->f()I

    move-result p1

    int-to-long p1, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v1}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    return-void
.end method

.method private e(Lob/z;)Lob/a;
    .locals 17

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p1 .. p1}, Lob/z;->n()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v1}, Lob/d0;->H()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    .line 3
    iget-object v1, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v1}, Lob/d0;->s()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    .line 4
    iget-object v3, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v3}, Lob/d0;->g()Lob/i;

    move-result-object v3

    move-object v10, v1

    move-object v9, v2

    move-object v11, v3

    goto :goto_0

    :cond_0
    move-object v9, v2

    move-object v10, v9

    move-object v11, v10

    .line 5
    :goto_0
    new-instance v1, Lob/a;

    invoke-virtual/range {p1 .. p1}, Lob/z;->m()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lob/z;->y()I

    move-result v6

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->o()Lob/t;

    move-result-object v7

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->G()Ljavax/net/SocketFactory;

    move-result-object v8

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    .line 6
    invoke-virtual {v2}, Lob/d0;->C()Lob/d;

    move-result-object v12

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    .line 7
    invoke-virtual {v2}, Lob/d0;->B()Ljava/net/Proxy;

    move-result-object v13

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->A()Ljava/util/List;

    move-result-object v14

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->k()Ljava/util/List;

    move-result-object v15

    iget-object v2, v0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->D()Ljava/net/ProxySelector;

    move-result-object v16

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, Lob/a;-><init>(Ljava/lang/String;ILob/t;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lob/i;Lob/d;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v1
.end method

.method private j(Ljava/io/IOException;Z)Ljava/io/IOException;
    .locals 5

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    if-eqz p2, :cond_1

    .line 2
    :try_start_0
    iget-object v1, p0, Lrb/k;->j:Lrb/c;

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot release connection while it is in use"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    :goto_0
    iget-object v1, p0, Lrb/k;->i:Lrb/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 5
    iget-object v3, p0, Lrb/k;->j:Lrb/c;

    if-nez v3, :cond_3

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lrb/k;->o:Z

    if-eqz p2, :cond_3

    .line 6
    :cond_2
    invoke-virtual {p0}, Lrb/k;->n()Ljava/net/Socket;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v2

    .line 7
    :goto_1
    iget-object v3, p0, Lrb/k;->i:Lrb/e;

    if-eqz v3, :cond_4

    move-object v1, v2

    .line 8
    :cond_4
    iget-boolean v2, p0, Lrb/k;->o:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-object v2, p0, Lrb/k;->j:Lrb/c;

    if-nez v2, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    .line 9
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-static {p2}, Lpb/e;->h(Ljava/net/Socket;)V

    if-eqz v1, :cond_6

    .line 11
    iget-object p2, p0, Lrb/k;->d:Lob/v;

    iget-object v0, p0, Lrb/k;->c:Lob/g;

    invoke-virtual {p2, v0, v1}, Lob/v;->i(Lob/g;Lob/l;)V

    :cond_6
    if-eqz v2, :cond_9

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    .line 12
    :goto_3
    invoke-direct {p0, p1}, Lrb/k;->q(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    if-eqz v3, :cond_8

    .line 13
    iget-object p2, p0, Lrb/k;->d:Lob/v;

    iget-object v0, p0, Lrb/k;->c:Lob/g;

    invoke-virtual {p2, v0, p1}, Lob/v;->c(Lob/g;Ljava/io/IOException;)V

    goto :goto_4

    .line 14
    :cond_8
    iget-object p2, p0, Lrb/k;->d:Lob/v;

    iget-object v0, p0, Lrb/k;->c:Lob/g;

    invoke-virtual {p2, v0}, Lob/v;->b(Lob/g;)V

    :cond_9
    :goto_4
    return-object p1

    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private q(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lrb/k;->n:Z

    if-eqz v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lrb/k;->e:Lac/a;

    invoke-virtual {v0}, Lac/a;->n()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    .line 3
    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_2
    return-object v0
.end method


# virtual methods
.method a(Lrb/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/k;->i:Lrb/e;

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lrb/k;->i:Lrb/e;

    .line 3
    iget-object p1, p1, Lrb/e;->p:Ljava/util/List;

    new-instance v0, Lrb/k$b;

    iget-object v1, p0, Lrb/k;->f:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lrb/k$b;-><init>(Lrb/k;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Lwb/f;->p(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lrb/k;->f:Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lrb/k;->d:Lob/v;

    iget-object v1, p0, Lrb/k;->c:Lob/g;

    invoke-virtual {v0, v1}, Lob/v;->d(Lob/g;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lrb/k;->h:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrb/k;->h:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lrb/k;->m:Z

    .line 3
    iget-object v1, p0, Lrb/k;->j:Lrb/c;

    .line 4
    iget-object v2, p0, Lrb/k;->h:Lrb/d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lrb/d;->a()Lrb/e;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lrb/k;->h:Lrb/d;

    invoke-virtual {v2}, Lrb/d;->a()Lrb/e;

    move-result-object v2

    goto :goto_0

    .line 6
    :cond_0
    iget-object v2, p0, Lrb/k;->i:Lrb/e;

    .line 7
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v1}, Lrb/c;->b()V

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    .line 9
    invoke-virtual {v2}, Lrb/e;->d()V

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception v1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lrb/k;->o:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lrb/k;->j:Lrb/c;

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method g(Lrb/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lrb/k;->j:Lrb/c;

    if-eq p1, v1, :cond_0

    .line 3
    monitor-exit v0

    return-object p4

    :cond_0
    const/4 p1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_1

    .line 4
    iget-boolean p2, p0, Lrb/k;->k:Z

    xor-int/2addr p2, v2

    .line 5
    iput-boolean v2, p0, Lrb/k;->k:Z

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p3, :cond_3

    .line 6
    iget-boolean p3, p0, Lrb/k;->l:Z

    if-nez p3, :cond_2

    const/4 p2, 0x1

    .line 7
    :cond_2
    iput-boolean v2, p0, Lrb/k;->l:Z

    .line 8
    :cond_3
    iget-boolean p3, p0, Lrb/k;->k:Z

    if-eqz p3, :cond_4

    iget-boolean p3, p0, Lrb/k;->l:Z

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    .line 9
    invoke-virtual {v1}, Lrb/c;->c()Lrb/e;

    move-result-object p2

    iget p3, p2, Lrb/e;->m:I

    add-int/2addr p3, v2

    iput p3, p2, Lrb/e;->m:I

    const/4 p2, 0x0

    .line 10
    iput-object p2, p0, Lrb/k;->j:Lrb/c;

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    .line 11
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_5

    .line 12
    invoke-direct {p0, p4, p1}, Lrb/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    move-result-object p4

    :cond_5
    return-object p4

    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lrb/k;->j:Lrb/c;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
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

.method public i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lrb/k;->m:Z

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

.method k(Lob/a0$a;Z)Lrb/c;
    .locals 8

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lrb/k;->o:Z

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Lrb/k;->j:Lrb/c;

    if-nez v1, :cond_0

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    iget-object v0, p0, Lrb/k;->h:Lrb/d;

    iget-object v1, p0, Lrb/k;->a:Lob/d0;

    invoke-virtual {v0, v1, p1, p2}, Lrb/d;->b(Lob/d0;Lob/a0$a;Z)Lsb/c;

    move-result-object v7

    .line 6
    new-instance p1, Lrb/c;

    iget-object v4, p0, Lrb/k;->c:Lob/g;

    iget-object v5, p0, Lrb/k;->d:Lob/v;

    iget-object v6, p0, Lrb/k;->h:Lrb/d;

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lrb/c;-><init>(Lrb/k;Lob/g;Lob/v;Lrb/d;Lsb/c;)V

    .line 7
    iget-object p2, p0, Lrb/k;->b:Lrb/g;

    monitor-enter p2

    .line 8
    :try_start_1
    iput-object p1, p0, Lrb/k;->j:Lrb/c;

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lrb/k;->k:Z

    .line 10
    iput-boolean v0, p0, Lrb/k;->l:Z

    .line 11
    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    .line 12
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 13
    :cond_0
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot make a new request because the previous response is still open: please call response.close()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "released"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/k;->b:Lrb/g;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lrb/k;->o:Z

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lrb/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public m(Lob/g0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lrb/k;->g:Lob/g0;

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v0

    invoke-virtual {p1}, Lob/g0;->j()Lob/z;

    move-result-object v1

    invoke-static {v0, v1}, Lpb/e;->E(Lob/z;Lob/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrb/k;->h:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lrb/k;->j:Lrb/c;

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lrb/k;->h:Lrb/d;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, v1, v0}, Lrb/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    .line 6
    iput-object v1, p0, Lrb/k;->h:Lrb/d;

    goto :goto_0

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 8
    :cond_2
    :goto_0
    iput-object p1, p0, Lrb/k;->g:Lob/g0;

    .line 9
    new-instance v6, Lrb/d;

    iget-object v2, p0, Lrb/k;->b:Lrb/g;

    invoke-virtual {p1}, Lob/g0;->j()Lob/z;

    move-result-object p1

    invoke-direct {p0, p1}, Lrb/k;->e(Lob/z;)Lob/a;

    move-result-object v3

    iget-object v4, p0, Lrb/k;->c:Lob/g;

    iget-object v5, p0, Lrb/k;->d:Lob/v;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lrb/d;-><init>(Lrb/k;Lrb/g;Lob/a;Lob/g;Lob/v;)V

    iput-object v6, p0, Lrb/k;->h:Lrb/d;

    return-void
.end method

.method n()Ljava/net/Socket;
    .locals 4

    const/4 v0, 0x0

    .line 1
    iget-object v1, p0, Lrb/k;->i:Lrb/e;

    iget-object v1, v1, Lrb/e;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v3, p0, Lrb/k;->i:Lrb/e;

    iget-object v3, v3, Lrb/e;->p:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    .line 3
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-eq v0, v2, :cond_3

    .line 4
    iget-object v1, p0, Lrb/k;->i:Lrb/e;

    .line 5
    iget-object v2, v1, Lrb/e;->p:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lrb/k;->i:Lrb/e;

    .line 7
    iget-object v2, v1, Lrb/e;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, v1, Lrb/e;->q:J

    .line 9
    iget-object v2, p0, Lrb/k;->b:Lrb/g;

    invoke-virtual {v2, v1}, Lrb/g;->d(Lrb/e;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10
    invoke-virtual {v1}, Lrb/e;->t()Ljava/net/Socket;

    move-result-object v0

    :cond_2
    return-object v0

    .line 11
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public o()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrb/k;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lrb/k;->n:Z

    .line 3
    iget-object v0, p0, Lrb/k;->e:Lac/a;

    invoke-virtual {v0}, Lac/a;->n()Z

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lrb/k;->e:Lac/a;

    invoke-virtual {v0}, Lac/a;->k()V

    return-void
.end method
