.class public final Lub/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lub/f$j;,
        Lub/f$l;,
        Lub/f$h;,
        Lub/f$i;,
        Lub/f$k;
    }
.end annotation


# static fields
.field private static final M:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:J

.field E:J

.field F:J

.field G:Lub/m;

.field final H:Lub/m;

.field final I:Ljava/net/Socket;

.field final J:Lub/j;

.field final K:Lub/f$l;

.field final L:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final n:Z

.field final o:Lub/f$j;

.field final p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lub/i;",
            ">;"
        }
    .end annotation
.end field

.field final q:Ljava/lang/String;

.field r:I

.field s:I

.field private t:Z

.field private final u:Ljava/util/concurrent/ScheduledExecutorService;

.field private final v:Ljava/util/concurrent/ExecutorService;

.field final w:Lub/l;

.field private x:J

.field private y:J

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-class v0, Lub/f;

    .line 2
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x1

    const-string v8, "OkHttp Http2Connection"

    .line 3
    invoke-static {v8, v1}, Lpb/e;->I(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lub/f;->M:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>(Lub/f$h;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lub/f;->p:Ljava/util/Map;

    const-wide/16 v2, 0x0

    .line 3
    iput-wide v2, v0, Lub/f;->x:J

    .line 4
    iput-wide v2, v0, Lub/f;->y:J

    .line 5
    iput-wide v2, v0, Lub/f;->z:J

    .line 6
    iput-wide v2, v0, Lub/f;->A:J

    .line 7
    iput-wide v2, v0, Lub/f;->B:J

    .line 8
    iput-wide v2, v0, Lub/f;->C:J

    .line 9
    iput-wide v2, v0, Lub/f;->D:J

    .line 10
    iput-wide v2, v0, Lub/f;->E:J

    .line 11
    new-instance v2, Lub/m;

    invoke-direct {v2}, Lub/m;-><init>()V

    iput-object v2, v0, Lub/f;->G:Lub/m;

    .line 12
    new-instance v2, Lub/m;

    invoke-direct {v2}, Lub/m;-><init>()V

    iput-object v2, v0, Lub/f;->H:Lub/m;

    .line 13
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v3, v0, Lub/f;->L:Ljava/util/Set;

    .line 14
    iget-object v3, v1, Lub/f$h;->f:Lub/l;

    iput-object v3, v0, Lub/f;->w:Lub/l;

    .line 15
    iget-boolean v3, v1, Lub/f$h;->g:Z

    iput-boolean v3, v0, Lub/f;->n:Z

    .line 16
    iget-object v4, v1, Lub/f$h;->e:Lub/f$j;

    iput-object v4, v0, Lub/f;->o:Lub/f$j;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    .line 17
    :goto_0
    iput v6, v0, Lub/f;->s:I

    if-eqz v3, :cond_1

    add-int/2addr v6, v4

    .line 18
    iput v6, v0, Lub/f;->s:I

    :cond_1
    const/4 v4, 0x7

    if-eqz v3, :cond_2

    .line 19
    iget-object v6, v0, Lub/f;->G:Lub/m;

    const/high16 v7, 0x1000000

    invoke-virtual {v6, v4, v7}, Lub/m;->i(II)Lub/m;

    .line 20
    :cond_2
    iget-object v6, v1, Lub/f$h;->b:Ljava/lang/String;

    iput-object v6, v0, Lub/f;->q:Ljava/lang/String;

    .line 21
    new-instance v7, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-array v8, v5, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v6, v8, v14

    const-string v9, "OkHttp %s Writer"

    .line 22
    invoke-static {v9, v8}, Lpb/e;->q(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v14}, Lpb/e;->I(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    invoke-direct {v7, v5, v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, Lub/f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    iget v8, v1, Lub/f$h;->h:I

    if-eqz v8, :cond_3

    .line 24
    new-instance v8, Lub/f$i;

    invoke-direct {v8, v0}, Lub/f$i;-><init>(Lub/f;)V

    iget v9, v1, Lub/f$h;->h:I

    int-to-long v10, v9

    int-to-long v12, v9

    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v9, v10

    move-wide v11, v12

    move-object v13, v15

    invoke-interface/range {v7 .. v13}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 25
    :cond_3
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v17, 0x0

    const/16 v18, 0x1

    const-wide/16 v19, 0x3c

    sget-object v21, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v22, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-array v8, v5, [Ljava/lang/Object;

    aput-object v6, v8, v14

    const-string v6, "OkHttp %s Push Observer"

    .line 26
    invoke-static {v6, v8}, Lpb/e;->q(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lpb/e;->I(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v23

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, Lub/f;->v:Ljava/util/concurrent/ExecutorService;

    const v5, 0xffff

    .line 27
    invoke-virtual {v2, v4, v5}, Lub/m;->i(II)Lub/m;

    const/4 v4, 0x5

    const/16 v5, 0x4000

    .line 28
    invoke-virtual {v2, v4, v5}, Lub/m;->i(II)Lub/m;

    .line 29
    invoke-virtual {v2}, Lub/m;->d()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, v0, Lub/f;->F:J

    .line 30
    iget-object v2, v1, Lub/f$h;->a:Ljava/net/Socket;

    iput-object v2, v0, Lub/f;->I:Ljava/net/Socket;

    .line 31
    new-instance v2, Lub/j;

    iget-object v4, v1, Lub/f$h;->d:Lac/d;

    invoke-direct {v2, v4, v3}, Lub/j;-><init>(Lac/d;Z)V

    iput-object v2, v0, Lub/f;->J:Lub/j;

    .line 32
    new-instance v2, Lub/f$l;

    new-instance v4, Lub/h;

    iget-object v1, v1, Lub/f$h;->c:Lac/e;

    invoke-direct {v4, v1, v3}, Lub/h;-><init>(Lac/e;Z)V

    invoke-direct {v2, v0, v4}, Lub/f$l;-><init>(Lub/f;Lub/h;)V

    iput-object v2, v0, Lub/f;->K:Lub/f$l;

    return-void
.end method

.method static synthetic O(Lub/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lub/f;->t:Z

    return p1
.end method

.method static synthetic Q()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lub/f;->M:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic T(Lub/f;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lub/f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method static synthetic W(Lub/f;)J
    .locals 4

    iget-wide v0, p0, Lub/f;->A:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lub/f;->A:J

    return-wide v0
.end method

.method static synthetic X(Lub/f;)J
    .locals 4

    iget-wide v0, p0, Lub/f;->C:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lub/f;->C:J

    return-wide v0
.end method

.method static synthetic b(Lub/f;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Lub/f;->e0(Ljava/io/IOException;)V

    return-void
.end method

.method static synthetic c(Lub/f;)J
    .locals 2

    iget-wide v0, p0, Lub/f;->y:J

    return-wide v0
.end method

.method static synthetic e(Lub/f;)J
    .locals 4

    iget-wide v0, p0, Lub/f;->y:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lub/f;->y:J

    return-wide v0
.end method

.method private e0(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Lub/b;->p:Lub/b;

    invoke-virtual {p0, v0, v0, p1}, Lub/f;->Y(Lub/b;Lub/b;Ljava/io/IOException;)V

    return-void
.end method

.method static synthetic i(Lub/f;)J
    .locals 2

    iget-wide v0, p0, Lub/f;->x:J

    return-wide v0
.end method

.method static synthetic l(Lub/f;)J
    .locals 4

    iget-wide v0, p0, Lub/f;->x:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lub/f;->x:J

    return-wide v0
.end method

.method private m0(ILjava/util/List;Z)Lub/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lub/c;",
            ">;Z)",
            "Lub/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    xor-int/lit8 v6, p3, 0x1

    const/4 v4, 0x0

    .line 1
    iget-object v7, p0, Lub/f;->J:Lub/j;

    monitor-enter v7

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget v0, p0, Lub/f;->s:I

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    .line 4
    sget-object v0, Lub/b;->s:Lub/b;

    invoke-virtual {p0, v0}, Lub/f;->w0(Lub/b;)V

    .line 5
    :cond_0
    iget-boolean v0, p0, Lub/f;->t:Z

    if-nez v0, :cond_7

    .line 6
    iget v8, p0, Lub/f;->s:I

    add-int/lit8 v0, v8, 0x2

    .line 7
    iput v0, p0, Lub/f;->s:I

    .line 8
    new-instance v9, Lub/i;

    const/4 v5, 0x0

    move-object v0, v9

    move v1, v8

    move-object v2, p0

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lub/i;-><init>(ILub/f;ZZLob/y;)V

    if-eqz p3, :cond_2

    .line 9
    iget-wide v0, p0, Lub/f;->F:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_2

    iget-wide v0, v9, Lub/i;->b:J

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x1

    .line 10
    :goto_1
    invoke-virtual {v9}, Lub/i;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    iget-object v0, p0, Lub/f;->p:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_4

    .line 13
    :try_start_2
    iget-object p1, p0, Lub/f;->J:Lub/j;

    invoke-virtual {p1, v6, v8, p2}, Lub/j;->O(ZILjava/util/List;)V

    goto :goto_2

    .line 14
    :cond_4
    iget-boolean v0, p0, Lub/f;->n:Z

    if-nez v0, :cond_6

    .line 15
    iget-object v0, p0, Lub/f;->J:Lub/j;

    invoke-virtual {v0, p1, v8, p2}, Lub/j;->W(IILjava/util/List;)V

    .line 16
    :goto_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p3, :cond_5

    .line 17
    iget-object p1, p0, Lub/f;->J:Lub/j;

    invoke-virtual {p1}, Lub/j;->flush()V

    :cond_5
    return-object v9

    .line 18
    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "client streams shouldn\'t have associated stream IDs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 19
    :cond_7
    :try_start_4
    new-instance p1, Lub/a;

    invoke-direct {p1}, Lub/a;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 20
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    .line 21
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method private declared-synchronized p0(Lpb/b;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lub/f;->t:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lub/f;->v:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic z(Lub/f;)Z
    .locals 0

    iget-boolean p0, p0, Lub/f;->t:Z

    return p0
.end method


# virtual methods
.method public A0(IZLac/c;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    .line 1
    iget-object p4, p0, Lub/f;->J:Lub/j;

    invoke-virtual {p4, p2, p1, p3, v0}, Lub/j;->e(ZILac/c;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v3, p4, v1

    if-lez v3, :cond_4

    .line 2
    monitor-enter p0

    .line 3
    :goto_1
    :try_start_0
    iget-wide v3, p0, Lub/f;->F:J

    cmp-long v5, v3, v1

    if-gtz v5, :cond_2

    .line 4
    iget-object v3, p0, Lub/f;->p:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    .line 6
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :cond_2
    :try_start_1
    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 8
    iget-object v3, p0, Lub/f;->J:Lub/j;

    invoke-virtual {v3}, Lub/j;->Q()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 9
    iget-wide v4, p0, Lub/f;->F:J

    int-to-long v6, v3

    sub-long/2addr v4, v6

    iput-wide v4, p0, Lub/f;->F:J

    .line 10
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long/2addr p4, v6

    .line 11
    iget-object v4, p0, Lub/f;->J:Lub/j;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v1

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v3}, Lub/j;->e(ZILac/c;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 12
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 13
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    .line 14
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method B0(IZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List<",
            "Lub/c;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lub/f;->J:Lub/j;

    invoke-virtual {v0, p2, p1, p3}, Lub/j;->O(ZILjava/util/List;)V

    return-void
.end method

.method C0(ZII)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f;->J:Lub/j;

    invoke-virtual {v0, p1, p2, p3}, Lub/j;->T(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-direct {p0, p1}, Lub/f;->e0(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method D0(ILub/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lub/f;->J:Lub/j;

    invoke-virtual {v0, p1, p2}, Lub/j;->X(ILub/b;)V

    return-void
.end method

.method E0(ILub/b;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lub/f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v7, Lub/f$a;

    const-string v3, "OkHttp %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lub/f;->q:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lub/f$a;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILub/b;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method F0(IJ)V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Lub/f$b;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lub/f;->q:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v8

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lub/f$b;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    .line 3
    invoke-interface {v0, v8}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method Y(Lub/b;Lub/b;Ljava/io/IOException;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lub/f;->w0(Lub/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    .line 2
    monitor-enter p0

    .line 3
    :try_start_1
    iget-object v0, p0, Lub/f;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object p1, p0, Lub/f;->p:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    iget-object v0, p0, Lub/f;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Lub/i;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lub/i;

    .line 5
    iget-object v0, p0, Lub/f;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 6
    :cond_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    .line 7
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 8
    :try_start_2
    invoke-virtual {v2, p2, p3}, Lub/i;->d(Lub/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_1
    :try_start_3
    iget-object p1, p0, Lub/f;->J:Lub/j;

    invoke-virtual {p1}, Lub/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 10
    :catch_2
    :try_start_4
    iget-object p1, p0, Lub/f;->I:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 11
    :catch_3
    iget-object p1, p0, Lub/f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 12
    iget-object p1, p0, Lub/f;->v:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    .line 13
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public close()V
    .locals 3

    sget-object v0, Lub/b;->o:Lub/b;

    sget-object v1, Lub/b;->t:Lub/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lub/f;->Y(Lub/b;Lub/b;Ljava/io/IOException;)V

    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lub/f;->J:Lub/j;

    invoke-virtual {v0}, Lub/j;->flush()V

    return-void
.end method

.method declared-synchronized j0(I)Lub/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lub/f;->p:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lub/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized k0(J)Z
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lub/f;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    .line 2
    :cond_0
    :try_start_1
    iget-wide v2, p0, Lub/f;->A:J

    iget-wide v4, p0, Lub/f;->z:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, Lub/f;->D:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    const/4 p1, 0x1

    .line 3
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized l0()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lub/f;->H:Lub/m;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Lub/m;->e(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public n0(Ljava/util/List;Z)Lub/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lub/c;",
            ">;Z)",
            "Lub/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lub/f;->m0(ILjava/util/List;Z)Lub/i;

    move-result-object p1

    return-object p1
.end method

.method o0(ILac/e;IZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v5, Lac/c;

    invoke-direct {v5}, Lac/c;-><init>()V

    int-to-long v0, p3

    .line 2
    invoke-interface {p2, v0, v1}, Lac/e;->a0(J)V

    .line 3
    invoke-interface {p2, v5, v0, v1}, Lac/t;->V(Lac/c;J)J

    .line 4
    invoke-virtual {v5}, Lac/c;->y0()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    .line 5
    new-instance p2, Lub/f$f;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lub/f;->q:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    const-string v2, "OkHttp %s Push Data[%s]"

    move-object v0, p2

    move-object v1, p0

    move v4, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lub/f$f;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILac/c;IZ)V

    invoke-direct {p0, p2}, Lub/f;->p0(Lpb/b;)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lac/c;->y0()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " != "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method q0(ILjava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lub/c;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v7, Lub/f$e;

    const-string v2, "OkHttp %s Push Headers[%s]"

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lub/f;->q:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    move-object v0, v7

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lub/f$e;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    .line 3
    invoke-direct {p0, v7}, Lub/f;->p0(Lpb/b;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method r0(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lub/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lub/f;->L:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object p2, Lub/b;->p:Lub/b;

    invoke-virtual {p0, p1, p2}, Lub/f;->E0(ILub/b;)V

    .line 4
    monitor-exit p0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lub/f;->L:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    new-instance v0, Lub/f$d;

    const-string v4, "OkHttp %s Push Request[%s]"

    const/4 v1, 0x2

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lub/f;->q:Ljava/lang/String;

    aput-object v2, v5, v1

    const/4 v1, 0x1

    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v1

    move-object v2, v0

    move-object v3, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lub/f$d;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    .line 9
    invoke-direct {p0, v0}, Lub/f;->p0(Lpb/b;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    .line 10
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method s0(ILub/b;)V
    .locals 7

    new-instance v6, Lub/f$g;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v0, p0, Lub/f;->q:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v2, "OkHttp %s Push Reset[%s]"

    move-object v0, v6

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lub/f$g;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILub/b;)V

    invoke-direct {p0, v6}, Lub/f;->p0(Lpb/b;)V

    return-void
.end method

.method t0(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method declared-synchronized u0(I)Lub/i;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f;->p:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lub/i;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method v0()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lub/f;->A:J

    iget-wide v2, p0, Lub/f;->z:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    .line 3
    iput-wide v2, p0, Lub/f;->z:J

    .line 4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0x3b9aca00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lub/f;->D:J

    .line 5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    iget-object v0, p0, Lub/f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lub/f$c;

    const-string v2, "OkHttp %s ping"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lub/f;->q:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-direct {v1, p0, v2, v3}, Lub/f$c;-><init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v0

    .line 7
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public w0(Lub/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lub/f;->J:Lub/j;

    monitor-enter v0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget-boolean v1, p0, Lub/f;->t:Z

    if-eqz v1, :cond_0

    .line 4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 5
    :try_start_3
    iput-boolean v1, p0, Lub/f;->t:Z

    .line 6
    iget v1, p0, Lub/f;->r:I

    .line 7
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 8
    :try_start_4
    iget-object v2, p0, Lub/f;->J:Lub/j;

    sget-object v3, Lpb/e;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lub/j;->z(ILub/b;[B)V

    .line 9
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 10
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    :catchall_1
    move-exception p1

    .line 11
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public x0()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lub/f;->y0(Z)V

    return-void
.end method

.method y0(Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lub/f;->J:Lub/j;

    invoke-virtual {p1}, Lub/j;->c()V

    .line 2
    iget-object p1, p0, Lub/f;->J:Lub/j;

    iget-object v0, p0, Lub/f;->G:Lub/m;

    invoke-virtual {p1, v0}, Lub/j;->Y(Lub/m;)V

    .line 3
    iget-object p1, p0, Lub/f;->G:Lub/m;

    invoke-virtual {p1}, Lub/m;->d()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    .line 4
    iget-object v1, p0, Lub/f;->J:Lub/j;

    const/4 v2, 0x0

    sub-int/2addr p1, v0

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lub/j;->e0(IJ)V

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    iget-object v0, p0, Lub/f;->K:Lub/f$l;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method declared-synchronized z0(J)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-wide v0, p0, Lub/f;->E:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lub/f;->E:J

    .line 2
    iget-object p1, p0, Lub/f;->G:Lub/m;

    invoke-virtual {p1}, Lub/m;->d()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    const/4 p1, 0x0

    .line 3
    iget-wide v0, p0, Lub/f;->E:J

    invoke-virtual {p0, p1, v0, v1}, Lub/f;->F0(IJ)V

    const-wide/16 p1, 0x0

    .line 4
    iput-wide p1, p0, Lub/f;->E:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
