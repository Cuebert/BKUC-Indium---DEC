.class final Ld5/b0;
.super Ld5/y;
.source "SourceFile"


# instance fields
.field final synthetic o:Lg4/m;

.field final synthetic p:Ld5/y;

.field final synthetic q:Ld5/d;


# direct methods
.method constructor <init>(Ld5/d;Lg4/m;Lg4/m;Ld5/y;)V
    .locals 0

    iput-object p1, p0, Ld5/b0;->q:Ld5/d;

    iput-object p3, p0, Ld5/b0;->o:Lg4/m;

    iput-object p4, p0, Ld5/b0;->p:Ld5/y;

    invoke-direct {p0, p2}, Ld5/y;-><init>(Lg4/m;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5/b0;->q:Ld5/d;

    invoke-static {v0}, Ld5/d;->h(Ld5/d;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld5/b0;->q:Ld5/d;

    iget-object v2, p0, Ld5/b0;->o:Lg4/m;

    invoke-static {v1, v2}, Ld5/d;->o(Ld5/d;Lg4/m;)V

    iget-object v1, p0, Ld5/b0;->q:Ld5/d;

    invoke-static {v1}, Ld5/d;->j(Ld5/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Ld5/b0;->q:Ld5/d;

    invoke-static {v1}, Ld5/d;->f(Ld5/d;)Ld5/x;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 3
    invoke-virtual {v1, v2, v3}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_0
    iget-object v1, p0, Ld5/b0;->q:Ld5/d;

    iget-object v2, p0, Ld5/b0;->p:Ld5/y;

    .line 4
    invoke-static {v1, v2}, Ld5/d;->q(Ld5/d;Ld5/y;)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
