.class final Lob/f0$a;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final o:Lob/h;

.field private volatile p:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic q:Lob/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lob/f0;

    return-void
.end method

.method constructor <init>(Lob/f0;Lob/h;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lob/f0$a;->q:Lob/f0;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Lob/f0;->h()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lob/f0$a;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    iput-object p2, p0, Lob/f0$a;->o:Lob/h;

    return-void
.end method


# virtual methods
.method protected k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lob/f0$a;->q:Lob/f0;

    invoke-static {v0}, Lob/f0;->a(Lob/f0;)Lrb/k;

    move-result-object v0

    invoke-virtual {v0}, Lrb/k;->p()V

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lob/f0$a;->q:Lob/f0;

    invoke-virtual {v1}, Lob/f0;->f()Lob/i0;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x1

    .line 3
    :try_start_1
    iget-object v2, p0, Lob/f0$a;->o:Lob/h;

    iget-object v3, p0, Lob/f0$a;->q:Lob/f0;

    invoke-interface {v2, v3, v0}, Lob/h;->a(Lob/g;Lob/i0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    :goto_0
    iget-object v0, p0, Lob/f0$a;->q:Lob/f0;

    iget-object v0, v0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->n()Lob/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lob/q;->f(Lob/f0$a;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v1

    move-object v0, v1

    const/4 v1, 0x0

    .line 5
    :goto_1
    :try_start_2
    iget-object v2, p0, Lob/f0$a;->q:Lob/f0;

    invoke-virtual {v2}, Lob/f0;->cancel()V

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "canceled due to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1, v0}, Ljava/io/IOException;->addSuppressed(Ljava/lang/Throwable;)V

    .line 8
    iget-object v2, p0, Lob/f0$a;->o:Lob/h;

    iget-object v3, p0, Lob/f0$a;->q:Lob/f0;

    invoke-interface {v2, v3, v1}, Lob/h;->b(Lob/g;Ljava/io/IOException;)V

    .line 9
    :cond_0
    throw v0

    :catchall_2
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v1

    move-object v0, v1

    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_1

    .line 10
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Callback failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lob/f0$a;->q:Lob/f0;

    invoke-virtual {v4}, Lob/f0;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lwb/f;->t(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, p0, Lob/f0$a;->o:Lob/h;

    iget-object v2, p0, Lob/f0$a;->q:Lob/f0;

    invoke-interface {v1, v2, v0}, Lob/h;->b(Lob/g;Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :goto_3
    return-void

    .line 12
    :goto_4
    iget-object v1, p0, Lob/f0$a;->q:Lob/f0;

    iget-object v1, v1, Lob/f0;->n:Lob/d0;

    invoke-virtual {v1}, Lob/d0;->n()Lob/q;

    move-result-object v1

    invoke-virtual {v1, p0}, Lob/q;->f(Lob/f0$a;)V

    throw v0
.end method

.method l()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    iget-object v0, p0, Lob/f0$a;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method m(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 2
    :try_start_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 4
    iget-object p1, p0, Lob/f0$a;->q:Lob/f0;

    invoke-static {p1}, Lob/f0;->a(Lob/f0;)Lrb/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Lrb/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 5
    iget-object p1, p0, Lob/f0$a;->o:Lob/h;

    iget-object v1, p0, Lob/f0$a;->q:Lob/f0;

    invoke-interface {p1, v1, v0}, Lob/h;->b(Lob/g;Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    iget-object p1, p0, Lob/f0$a;->q:Lob/f0;

    iget-object p1, p1, Lob/f0;->n:Lob/d0;

    invoke-virtual {p1}, Lob/d0;->n()Lob/q;

    move-result-object p1

    invoke-virtual {p1, p0}, Lob/q;->f(Lob/f0$a;)V

    :goto_0
    return-void

    :goto_1
    iget-object v0, p0, Lob/f0$a;->q:Lob/f0;

    iget-object v0, v0, Lob/f0;->n:Lob/d0;

    invoke-virtual {v0}, Lob/d0;->n()Lob/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lob/q;->f(Lob/f0$a;)V

    throw p1
.end method

.method n()Lob/f0;
    .locals 1

    iget-object v0, p0, Lob/f0$a;->q:Lob/f0;

    return-object v0
.end method

.method o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/f0$a;->q:Lob/f0;

    iget-object v0, v0, Lob/f0;->p:Lob/g0;

    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method p(Lob/f0$a;)V
    .locals 0

    iget-object p1, p1, Lob/f0$a;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lob/f0$a;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method
