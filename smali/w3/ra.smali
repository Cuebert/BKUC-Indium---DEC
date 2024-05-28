.class public final Lw3/ra;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lz2/n;

.field private final b:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, -0x1

    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p2, p0, Lw3/ra;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    invoke-static {}, Lz2/o;->a()Lz2/o$a;

    move-result-object p2

    const-string v0, "mlkit:vision"

    invoke-virtual {p2, v0}, Lz2/o$a;->b(Ljava/lang/String;)Lz2/o$a;

    move-result-object p2

    invoke-virtual {p2}, Lz2/o$a;->a()Lz2/o;

    move-result-object p2

    .line 3
    invoke-static {p1, p2}, Lz2/m;->b(Landroid/content/Context;Lz2/o;)Lz2/n;

    move-result-object p1

    iput-object p1, p0, Lw3/ra;->a:Lz2/n;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lw3/ra;
    .locals 2

    new-instance v0, Lw3/ra;

    const-string v1, "mlkit:vision"

    invoke-direct {v0, p0, v1}, Lw3/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic b(JLjava/lang/Exception;)V
    .locals 0

    iget-object p3, p0, Lw3/ra;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public final declared-synchronized c(IIJJ)V
    .locals 18

    move-object/from16 v1, p0

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, v1, Lw3/ra;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, v1, Lw3/ra;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    sub-long v4, v2, v4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x1e

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v4, v6

    if-gtz v0, :cond_1

    monitor-exit p0

    return-void

    .line 5
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, v1, Lw3/ra;->a:Lz2/n;

    .line 6
    new-instance v4, Lcom/google/android/gms/common/internal/TelemetryData;

    const/4 v5, 0x1

    new-array v5, v5, [Lcom/google/android/gms/common/internal/MethodInvocation;

    new-instance v17, Lcom/google/android/gms/common/internal/MethodInvocation;

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v6, v17

    move/from16 v7, p1

    move/from16 v8, p2

    move-wide/from16 v10, p3

    move-wide/from16 v12, p5

    invoke-direct/range {v6 .. v16}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;I)V

    const/4 v6, 0x0

    aput-object v17, v5, v6

    .line 7
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v6, v5}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 8
    invoke-interface {v0, v4}, Lz2/n;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lg4/l;

    move-result-object v0

    .line 9
    new-instance v4, Lw3/qa;

    invoke-direct {v4, v1, v2, v3}, Lw3/qa;-><init>(Lw3/ra;J)V

    invoke-virtual {v0, v4}, Lg4/l;->d(Lg4/g;)Lg4/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
