.class public Lcom/birbit/android/jobqueue/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lt1/f;

.field private final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/birbit/android/jobqueue/callback/JobManagerCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lt1/c;

.field private final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final e:Lcom/birbit/android/jobqueue/timer/Timer;

.field private final f:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lt1/c;Lcom/birbit/android/jobqueue/timer/Timer;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/a;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    iput-object p2, p0, Lcom/birbit/android/jobqueue/a;->e:Lcom/birbit/android/jobqueue/timer/Timer;

    .line 5
    new-instance v0, Lt1/f;

    const-string v1, "jq_callback"

    invoke-direct {v0, p2, p1, v1}, Lt1/f;-><init>(Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    .line 6
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Lcom/birbit/android/jobqueue/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    iput-object p1, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    return-void
.end method

.method static synthetic a(Lcom/birbit/android/jobqueue/a;Lu1/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/a;->f(Lu1/b;)V

    return-void
.end method

.method static synthetic b(Lcom/birbit/android/jobqueue/a;)Lcom/birbit/android/jobqueue/timer/Timer;
    .locals 0

    iget-object p0, p0, Lcom/birbit/android/jobqueue/a;->e:Lcom/birbit/android/jobqueue/timer/Timer;

    return-object p0
.end method

.method static synthetic c(Lcom/birbit/android/jobqueue/a;Lu1/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/a;->e(Lu1/d;)V

    return-void
.end method

.method static synthetic d(Lcom/birbit/android/jobqueue/a;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/birbit/android/jobqueue/a;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private e(Lu1/d;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu1/d;->c()Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    move-result-object v0

    invoke-virtual {p1}, Lu1/d;->d()Lcom/birbit/android/jobqueue/CancelResult;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;->onCancelled(Lcom/birbit/android/jobqueue/CancelResult;)V

    .line 2
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->t()V

    return-void
.end method

.method private f(Lu1/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lu1/b;->e()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lu1/b;->c()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {p1}, Lu1/b;->d()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/birbit/android/jobqueue/a;->i(Lcom/birbit/android/jobqueue/e;I)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p1}, Lu1/b;->c()Lcom/birbit/android/jobqueue/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/a;->p(Lcom/birbit/android/jobqueue/e;)V

    goto :goto_0

    .line 4
    :cond_2
    invoke-virtual {p1}, Lu1/b;->c()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {p1}, Lu1/b;->f()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/birbit/android/jobqueue/a;->n(Lcom/birbit/android/jobqueue/e;Z)V

    goto :goto_0

    .line 5
    :cond_3
    invoke-virtual {p1}, Lu1/b;->c()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {p1}, Lu1/b;->d()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/birbit/android/jobqueue/a;->r(Lcom/birbit/android/jobqueue/e;I)V

    goto :goto_0

    .line 6
    :cond_4
    invoke-virtual {p1}, Lu1/b;->c()Lcom/birbit/android/jobqueue/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/a;->l(Lcom/birbit/android/jobqueue/e;)V

    :goto_0
    return-void
.end method

.method private g()Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i(Lcom/birbit/android/jobqueue/e;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;

    .line 2
    invoke-interface {v1, p1, p2}, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;->onAfterJobRun(Lcom/birbit/android/jobqueue/e;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private l(Lcom/birbit/android/jobqueue/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;

    .line 2
    invoke-interface {v1, p1}, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;->onJobAdded(Lcom/birbit/android/jobqueue/e;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private n(Lcom/birbit/android/jobqueue/e;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;

    .line 2
    invoke-interface {v1, p1, p2}, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;->onJobCancelled(Lcom/birbit/android/jobqueue/e;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private p(Lcom/birbit/android/jobqueue/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;

    .line 2
    invoke-interface {v1, p1}, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;->onDone(Lcom/birbit/android/jobqueue/e;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private r(Lcom/birbit/android/jobqueue/e;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;

    .line 2
    invoke-interface {v1, p1, p2}, Lcom/birbit/android/jobqueue/callback/JobManagerCallback;->onJobRun(Lcom/birbit/android/jobqueue/e;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private s()V
    .locals 3

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/birbit/android/jobqueue/a$a;

    invoke-direct {v1, p0}, Lcom/birbit/android/jobqueue/a$a;-><init>(Lcom/birbit/android/jobqueue/a;)V

    const-string v2, "job-manager-callbacks"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->s()V

    :cond_0
    return-void
.end method


# virtual methods
.method public h(Lcom/birbit/android/jobqueue/e;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    const-class v1, Lu1/b;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/b;

    const/4 v1, 0x5

    .line 3
    invoke-virtual {v0, p1, v1, p2}, Lu1/b;->h(Lcom/birbit/android/jobqueue/e;II)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1, v0}, Lt1/f;->post(Lt1/b;)V

    return-void
.end method

.method public j(Lcom/birbit/android/jobqueue/CancelResult;Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    const-class v1, Lu1/d;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/d;

    .line 2
    invoke-virtual {v0, p2, p1}, Lu1/d;->e(Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;Lcom/birbit/android/jobqueue/CancelResult;)V

    .line 3
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1, v0}, Lt1/f;->post(Lt1/b;)V

    .line 4
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->t()V

    return-void
.end method

.method public k(Lcom/birbit/android/jobqueue/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    const-class v1, Lu1/b;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/b;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, p1, v1}, Lu1/b;->g(Lcom/birbit/android/jobqueue/e;I)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1, v0}, Lt1/f;->post(Lt1/b;)V

    return-void
.end method

.method public m(Lcom/birbit/android/jobqueue/e;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    const-class v1, Lu1/b;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/b;

    const/4 v1, 0x3

    .line 3
    invoke-virtual {v0, p1, v1, p2}, Lu1/b;->i(Lcom/birbit/android/jobqueue/e;IZ)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1, v0}, Lt1/f;->post(Lt1/b;)V

    return-void
.end method

.method public o(Lcom/birbit/android/jobqueue/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    const-class v1, Lu1/b;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/b;

    const/4 v1, 0x4

    .line 3
    invoke-virtual {v0, p1, v1}, Lu1/b;->g(Lcom/birbit/android/jobqueue/e;I)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1, v0}, Lt1/f;->post(Lt1/b;)V

    return-void
.end method

.method public q(Lcom/birbit/android/jobqueue/e;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a;->c:Lt1/c;

    const-class v1, Lu1/b;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/b;

    const/4 v1, 0x2

    .line 3
    invoke-virtual {v0, p1, v1, p2}, Lu1/b;->h(Lcom/birbit/android/jobqueue/e;II)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1, v0}, Lt1/f;->post(Lt1/b;)V

    return-void
.end method
