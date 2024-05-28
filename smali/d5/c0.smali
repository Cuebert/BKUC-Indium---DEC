.class final Ld5/c0;
.super Ld5/y;
.source "SourceFile"


# instance fields
.field final synthetic o:Ld5/d;


# direct methods
.method constructor <init>(Ld5/d;)V
    .locals 0

    iput-object p1, p0, Ld5/c0;->o:Ld5/d;

    invoke-direct {p0}, Ld5/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Ld5/c0;->o:Ld5/d;

    invoke-static {v0}, Ld5/d;->h(Ld5/d;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    invoke-static {v1}, Ld5/d;->j(Ld5/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    invoke-static {v1}, Ld5/d;->j(Ld5/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    invoke-static {v1}, Ld5/d;->f(Ld5/d;)Ld5/x;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    .line 3
    invoke-virtual {v1, v3, v2}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    :goto_0
    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    invoke-static {v1}, Ld5/d;->d(Ld5/d;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v1}, Ld5/d;->f(Ld5/d;)Ld5/x;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    .line 6
    invoke-virtual {v1, v3, v4}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    invoke-static {v1}, Ld5/d;->a(Ld5/d;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Ld5/d;->b(Ld5/d;)Landroid/content/ServiceConnection;

    move-result-object v1

    .line 7
    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    .line 8
    invoke-static {v1, v2}, Ld5/d;->m(Ld5/d;Z)V

    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2}, Ld5/d;->n(Ld5/d;Landroid/os/IInterface;)V

    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    .line 10
    invoke-static {v1, v2}, Ld5/d;->l(Ld5/d;Landroid/content/ServiceConnection;)V

    :cond_2
    iget-object v1, p0, Ld5/c0;->o:Ld5/d;

    .line 11
    invoke-static {v1}, Ld5/d;->p(Ld5/d;)V

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
