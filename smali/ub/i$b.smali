.class final Lub/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final n:Lac/c;

.field private final o:Lac/c;

.field private final p:J

.field private q:Lob/y;

.field r:Z

.field s:Z

.field final synthetic t:Lub/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lub/i;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lub/i$b;->t:Lub/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lac/c;

    invoke-direct {p1}, Lac/c;-><init>()V

    iput-object p1, p0, Lub/i$b;->n:Lac/c;

    .line 3
    new-instance p1, Lac/c;

    invoke-direct {p1}, Lac/c;-><init>()V

    iput-object p1, p0, Lub/i$b;->o:Lac/c;

    .line 4
    iput-wide p2, p0, Lub/i$b;->p:J

    return-void
.end method

.method static synthetic b(Lub/i$b;Lob/y;)Lob/y;
    .locals 0

    iput-object p1, p0, Lub/i$b;->q:Lob/y;

    return-object p1
.end method

.method private e(J)V
    .locals 1

    iget-object v0, p0, Lub/i$b;->t:Lub/i;

    iget-object v0, v0, Lub/i;->d:Lub/f;

    invoke-virtual {v0, p1, p2}, Lub/f;->z0(J)V

    return-void
.end method


# virtual methods
.method public V(Lac/c;J)J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_8

    :goto_0
    const/4 v2, 0x0

    .line 1
    iget-object v3, p0, Lub/i$b;->t:Lub/i;

    monitor-enter v3

    .line 2
    :try_start_0
    iget-object v4, p0, Lub/i$b;->t:Lub/i;

    iget-object v4, v4, Lub/i;->i:Lub/i$c;

    invoke-virtual {v4}, Lac/a;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget-object v4, p0, Lub/i$b;->t:Lub/i;

    iget-object v5, v4, Lub/i;->k:Lub/b;

    if-eqz v5, :cond_1

    .line 4
    iget-object v2, v4, Lub/i;->l:Ljava/io/IOException;

    if-eqz v2, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    new-instance v2, Lub/n;

    iget-object v4, p0, Lub/i$b;->t:Lub/i;

    iget-object v4, v4, Lub/i;->k:Lub/b;

    invoke-direct {v2, v4}, Lub/n;-><init>(Lub/b;)V

    .line 6
    :cond_1
    :goto_1
    iget-boolean v4, p0, Lub/i$b;->r:Z

    if-nez v4, :cond_7

    .line 7
    iget-object v4, p0, Lub/i$b;->o:Lac/c;

    invoke-virtual {v4}, Lac/c;->y0()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v0

    if-lez v8, :cond_2

    .line 8
    iget-object v4, p0, Lub/i$b;->o:Lac/c;

    invoke-virtual {v4}, Lac/c;->y0()J

    move-result-wide v8

    invoke-static {p2, p3, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v4, p1, p2, p3}, Lac/c;->V(Lac/c;J)J

    move-result-wide p1

    .line 9
    iget-object p3, p0, Lub/i$b;->t:Lub/i;

    iget-wide v4, p3, Lub/i;->a:J

    add-long/2addr v4, p1

    iput-wide v4, p3, Lub/i;->a:J

    if-nez v2, :cond_4

    .line 10
    iget-object p3, p3, Lub/i;->d:Lub/f;

    iget-object p3, p3, Lub/f;->G:Lub/m;

    .line 11
    invoke-virtual {p3}, Lub/m;->d()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-long v8, p3

    cmp-long p3, v4, v8

    if-ltz p3, :cond_4

    .line 12
    iget-object p3, p0, Lub/i$b;->t:Lub/i;

    iget-object v4, p3, Lub/i;->d:Lub/f;

    iget v5, p3, Lub/i;->c:I

    iget-wide v8, p3, Lub/i;->a:J

    invoke-virtual {v4, v5, v8, v9}, Lub/f;->F0(IJ)V

    .line 13
    iget-object p3, p0, Lub/i$b;->t:Lub/i;

    iput-wide v0, p3, Lub/i;->a:J

    goto :goto_2

    .line 14
    :cond_2
    iget-boolean v4, p0, Lub/i$b;->s:Z

    if-nez v4, :cond_3

    if-nez v2, :cond_3

    .line 15
    iget-object v2, p0, Lub/i$b;->t:Lub/i;

    invoke-virtual {v2}, Lub/i;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :try_start_2
    iget-object v2, p0, Lub/i$b;->t:Lub/i;

    iget-object v2, v2, Lub/i;->i:Lub/i$c;

    invoke-virtual {v2}, Lub/i$c;->u()V

    monitor-exit v3

    goto :goto_0

    :cond_3
    move-wide p1, v6

    :cond_4
    :goto_2
    iget-object p3, p0, Lub/i$b;->t:Lub/i;

    iget-object p3, p3, Lub/i;->i:Lub/i$c;

    invoke-virtual {p3}, Lub/i$c;->u()V

    .line 17
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    cmp-long p3, p1, v6

    if-eqz p3, :cond_5

    .line 18
    invoke-direct {p0, p1, p2}, Lub/i$b;->e(J)V

    return-wide p1

    :cond_5
    if-nez v2, :cond_6

    return-wide v6

    .line 19
    :cond_6
    throw v2

    .line 20
    :cond_7
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 21
    :try_start_4
    iget-object p2, p0, Lub/i$b;->t:Lub/i;

    iget-object p2, p2, Lub/i;->i:Lub/i$c;

    invoke-virtual {p2}, Lub/i$c;->u()V

    throw p1

    :catchall_1
    move-exception p1

    .line 22
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    .line 23
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method c(Lac/e;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_8

    .line 1
    iget-object v2, p0, Lub/i$b;->t:Lub/i;

    monitor-enter v2

    .line 2
    :try_start_0
    iget-boolean v3, p0, Lub/i$b;->s:Z

    .line 3
    iget-object v4, p0, Lub/i$b;->o:Lac/c;

    invoke-virtual {v4}, Lac/c;->y0()J

    move-result-wide v4

    add-long/2addr v4, p2

    iget-wide v6, p0, Lub/i$b;->p:J

    const/4 v8, 0x1

    const/4 v9, 0x0

    cmp-long v10, v4, v6

    if-lez v10, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 4
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_2

    .line 5
    invoke-interface {p1, p2, p3}, Lac/e;->r(J)V

    .line 6
    iget-object p1, p0, Lub/i$b;->t:Lub/i;

    sget-object p2, Lub/b;->r:Lub/b;

    invoke-virtual {p1, p2}, Lub/i;->f(Lub/b;)V

    return-void

    :cond_2
    if-eqz v3, :cond_3

    .line 7
    invoke-interface {p1, p2, p3}, Lac/e;->r(J)V

    return-void

    .line 8
    :cond_3
    iget-object v2, p0, Lub/i$b;->n:Lac/c;

    invoke-interface {p1, v2, p2, p3}, Lac/t;->V(Lac/c;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_7

    sub-long/2addr p2, v2

    .line 9
    iget-object v2, p0, Lub/i$b;->t:Lub/i;

    monitor-enter v2

    .line 10
    :try_start_1
    iget-boolean v3, p0, Lub/i$b;->r:Z

    if-eqz v3, :cond_4

    .line 11
    iget-object v3, p0, Lub/i$b;->n:Lac/c;

    invoke-virtual {v3}, Lac/c;->y0()J

    move-result-wide v3

    .line 12
    iget-object v5, p0, Lub/i$b;->n:Lac/c;

    invoke-virtual {v5}, Lac/c;->Y()V

    goto :goto_3

    .line 13
    :cond_4
    iget-object v3, p0, Lub/i$b;->o:Lac/c;

    invoke-virtual {v3}, Lac/c;->y0()J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    .line 14
    :goto_2
    iget-object v3, p0, Lub/i$b;->o:Lac/c;

    iget-object v4, p0, Lub/i$b;->n:Lac/c;

    invoke-virtual {v3, v4}, Lac/c;->F0(Lac/t;)J

    if-eqz v8, :cond_6

    .line 15
    iget-object v3, p0, Lub/i$b;->t:Lub/i;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    :cond_6
    move-wide v3, v0

    .line 16
    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v2, v3, v0

    if-lez v2, :cond_0

    .line 17
    invoke-direct {p0, v3, v4}, Lub/i$b;->e(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 18
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 19
    :cond_7
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :catchall_1
    move-exception p1

    .line 20
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_8
    return-void
.end method

.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lub/i$b;->t:Lub/i;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lub/i$b;->r:Z

    .line 3
    iget-object v1, p0, Lub/i$b;->o:Lac/c;

    invoke-virtual {v1}, Lac/c;->y0()J

    move-result-wide v1

    .line 4
    iget-object v3, p0, Lub/i$b;->o:Lac/c;

    invoke-virtual {v3}, Lac/c;->Y()V

    .line 5
    iget-object v3, p0, Lub/i$b;->t:Lub/i;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_0

    .line 7
    invoke-direct {p0, v1, v2}, Lub/i$b;->e(J)V

    .line 8
    :cond_0
    iget-object v0, p0, Lub/i$b;->t:Lub/i;

    invoke-virtual {v0}, Lub/i;->b()V

    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public f()Lac/u;
    .locals 1

    iget-object v0, p0, Lub/i$b;->t:Lub/i;

    iget-object v0, v0, Lub/i;->i:Lub/i$c;

    return-object v0
.end method
