.class final Lob/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob/f0$a;
    }
.end annotation


# instance fields
.field final n:Lob/d0;

.field private o:Lrb/k;

.field final p:Lob/g0;

.field final q:Z

.field private r:Z


# direct methods
.method private constructor <init>(Lob/d0;Lob/g0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lob/f0;->n:Lob/d0;

    .line 3
    iput-object p2, p0, Lob/f0;->p:Lob/g0;

    .line 4
    iput-boolean p3, p0, Lob/f0;->q:Z

    return-void
.end method

.method static synthetic a(Lob/f0;)Lrb/k;
    .locals 0

    iget-object p0, p0, Lob/f0;->o:Lrb/k;

    return-object p0
.end method

.method static g(Lob/d0;Lob/g0;Z)Lob/f0;
    .locals 1

    .line 1
    new-instance v0, Lob/f0;

    invoke-direct {v0, p0, p1, p2}, Lob/f0;-><init>(Lob/d0;Lob/g0;Z)V

    .line 2
    new-instance p1, Lrb/k;

    invoke-direct {p1, p0, v0}, Lrb/k;-><init>(Lob/d0;Lob/g;)V

    iput-object p1, v0, Lob/f0;->o:Lrb/k;

    return-object v0
.end method


# virtual methods
.method public c()Lob/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lob/f0;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lob/f0;->r:Z

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->p()V

    .line 6
    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->b()V

    .line 7
    :try_start_1
    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->n()Lob/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lob/q;->b(Lob/f0;)V

    .line 8
    invoke-virtual {p0}, Lob/f0;->f()Lob/i0;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    iget-object v1, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v1}, Lob/d0;->n()Lob/q;

    move-result-object v1

    invoke-virtual {v1, p0}, Lob/q;->g(Lob/f0;)V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v1}, Lob/d0;->n()Lob/q;

    move-result-object v1

    invoke-virtual {v1, p0}, Lob/q;->g(Lob/f0;)V

    throw v0

    .line 10
    :cond_0
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 11
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->d()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lob/f0;->d()Lob/f0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lob/f0;
    .locals 3

    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    iget-object v1, p0, Lob/f0;->p:Lob/g0;

    iget-boolean v2, p0, Lob/f0;->q:Z

    invoke-static {v0, v1, v2}, Lob/f0;->g(Lob/d0;Lob/g0;Z)Lob/f0;

    move-result-object v0

    return-object v0
.end method

.method public e()Lob/g0;
    .locals 1

    iget-object v0, p0, Lob/f0;->p:Lob/g0;

    return-object v0
.end method

.method f()Lob/i0;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    new-instance v0, Lsb/j;

    iget-object v2, p0, Lob/f0;->n:Lob/d0;

    invoke-direct {v0, v2}, Lsb/j;-><init>(Lob/d0;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v0, Lsb/a;

    iget-object v2, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->m()Lob/p;

    move-result-object v2

    invoke-direct {v0, v2}, Lsb/a;-><init>(Lob/p;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v0, Lqb/a;

    iget-object v2, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v2}, Lob/d0;->u()Lqb/f;

    move-result-object v2

    invoke-direct {v0, v2}, Lqb/a;-><init>(Lqb/f;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v0, Lrb/a;

    iget-object v2, p0, Lob/f0;->n:Lob/d0;

    invoke-direct {v0, v2}, Lrb/a;-><init>(Lob/d0;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-boolean v0, p0, Lob/f0;->q:Z

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    :cond_0
    new-instance v0, Lsb/b;

    iget-boolean v2, p0, Lob/f0;->q:Z

    invoke-direct {v0, v2}, Lsb/b;-><init>(Z)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v10, Lsb/g;

    iget-object v2, p0, Lob/f0;->o:Lrb/k;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lob/f0;->p:Lob/g0;

    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    .line 11
    invoke-virtual {v0}, Lob/d0;->h()I

    move-result v7

    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    .line 12
    invoke-virtual {v0}, Lob/d0;->E()I

    move-result v8

    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->I()I

    move-result v9

    move-object v0, v10

    move-object v6, p0

    invoke-direct/range {v0 .. v9}, Lsb/g;-><init>(Ljava/util/List;Lrb/k;Lrb/c;ILob/g0;Lob/g;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 13
    :try_start_0
    iget-object v2, p0, Lob/f0;->p:Lob/g0;

    invoke-interface {v10, v2}, Lob/a0$a;->b(Lob/g0;)Lob/i0;

    move-result-object v2

    .line 14
    iget-object v3, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v3}, Lrb/k;->i()Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    .line 15
    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0, v1}, Lrb/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    .line 16
    :cond_1
    :try_start_1
    invoke-static {v2}, Lpb/e;->g(Ljava/io/Closeable;)V

    .line 17
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    .line 18
    :try_start_2
    iget-object v3, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v3, v0}, Lrb/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_2

    .line 19
    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0, v1}, Lrb/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v2
.end method

.method h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/f0;->p:Lob/g0;

    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->B()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->i()Z

    move-result v0

    return v0
.end method

.method j()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lob/f0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-boolean v1, p0, Lob/f0;->q:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Lob/f0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z(Lob/h;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lob/f0;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lob/f0;->r:Z

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, p0, Lob/f0;->o:Lrb/k;

    invoke-virtual {v0}, Lrb/k;->b()V

    .line 6
    iget-object v0, p0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->n()Lob/q;

    move-result-object v0

    new-instance v1, Lob/f0$a;

    invoke-direct {v1, p0, p1}, Lob/f0$a;-><init>(Lob/f0;Lob/h;)V

    invoke-virtual {v0, v1}, Lob/q;->a(Lob/f0$a;)V

    return-void

    .line 7
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 8
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
