.class Lcom/birbit/android/jobqueue/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/birbit/android/jobqueue/d$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/birbit/android/jobqueue/d$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/birbit/android/jobqueue/d$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:I

.field private final d:I

.field private final e:J

.field private final f:I

.field private final g:I

.field private final h:Ljava/lang/ThreadGroup;

.field private final i:Lcom/birbit/android/jobqueue/h;

.field private final j:Lcom/birbit/android/jobqueue/timer/Timer;

.field private final k:Lt1/c;

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation
.end field

.field final m:Lo1/f;

.field private n:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/birbit/android/jobqueue/h;Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;Lq1/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/d;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    iput-object p1, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    .line 6
    iput-object p2, p0, Lcom/birbit/android/jobqueue/d;->j:Lcom/birbit/android/jobqueue/timer/Timer;

    .line 7
    iput-object p3, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    .line 8
    invoke-virtual {p4}, Lq1/a;->g()I

    move-result p1

    iput p1, p0, Lcom/birbit/android/jobqueue/d;->g:I

    .line 9
    invoke-virtual {p4}, Lq1/a;->i()I

    move-result p1

    iput p1, p0, Lcom/birbit/android/jobqueue/d;->d:I

    .line 10
    invoke-virtual {p4}, Lq1/a;->h()I

    move-result p1

    iput p1, p0, Lcom/birbit/android/jobqueue/d;->c:I

    .line 11
    invoke-virtual {p4}, Lq1/a;->c()I

    move-result p1

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/d;->e:J

    .line 12
    invoke-virtual {p4}, Lq1/a;->m()I

    move-result p1

    iput p1, p0, Lcom/birbit/android/jobqueue/d;->f:I

    .line 13
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    .line 14
    new-instance p1, Lo1/f;

    invoke-direct {p1, p2}, Lo1/f;-><init>(Lcom/birbit/android/jobqueue/timer/Timer;)V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    .line 15
    new-instance p1, Ljava/lang/ThreadGroup;

    const-string p2, "JobConsumers"

    invoke-direct {p1, p2}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/d;->h:Ljava/lang/ThreadGroup;

    return-void
.end method

.method private a()V
    .locals 6

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "adding another consumer"

    .line 1
    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/birbit/android/jobqueue/d$b;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    iget-object v1, v1, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    new-instance v2, Lt1/f;

    iget-object v3, p0, Lcom/birbit/android/jobqueue/d;->j:Lcom/birbit/android/jobqueue/timer/Timer;

    iget-object v4, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    const-string v5, "consumer"

    invoke-direct {v2, v3, v4, v5}, Lt1/f;-><init>(Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    iget-object v4, p0, Lcom/birbit/android/jobqueue/d;->j:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/birbit/android/jobqueue/d$b;-><init>(Lcom/birbit/android/jobqueue/messaging/MessageQueue;Lt1/f;Lt1/c;Lcom/birbit/android/jobqueue/timer/Timer;)V

    .line 3
    new-instance v1, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->h:Ljava/lang/ThreadGroup;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "job-queue-worker-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 4
    iget v2, p0, Lcom/birbit/android/jobqueue/d;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 5
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private c(Z)V
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/h;->I()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "considering adding a new consumer. Should poke all waiting? %s isRunning? %s waiting workers? %d"

    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/h;->I()Z

    move-result v0

    if-nez v0, :cond_0

    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "jobqueue is not running, no consumers will be added"

    .line 3
    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "there are waiting workers, will poke them instead"

    .line 5
    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v3

    :goto_0
    if-ltz v0, :cond_2

    .line 7
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/d$b;

    .line 8
    iget-object v3, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    const-class v5, Lu1/e;

    invoke-virtual {v3, v5}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v3

    check-cast v3, Lu1/e;

    .line 9
    invoke-virtual {v3, v4}, Lu1/e;->d(I)V

    .line 10
    iget-object v1, v1, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    invoke-virtual {v1, v3}, Lt1/f;->post(Lt1/b;)V

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "there were waiting workers, poked them and I\'m done"

    .line 11
    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_3
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/d;->j()Z

    move-result p1

    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "nothing has been poked. are we above load factor? %s"

    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    .line 14
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/d;->a()V

    :cond_4
    return-void
.end method

.method private j()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 2
    iget v1, p0, Lcom/birbit/android/jobqueue/d;->c:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    new-array v1, v2, [Ljava/lang/Object;

    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v3

    const-string v0, "too many consumers, clearly above load factor %s"

    invoke-static {v0, v1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v3

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/h;->q()I

    move-result v1

    .line 5
    iget-object v4, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    .line 6
    iget v5, p0, Lcom/birbit/android/jobqueue/d;->g:I

    mul-int v5, v5, v0

    add-int v6, v1, v4

    if-lt v5, v6, :cond_2

    iget v5, p0, Lcom/birbit/android/jobqueue/d;->d:I

    if-ge v0, v5, :cond_1

    if-ge v0, v6, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v5, 0x1

    :goto_1
    const/4 v6, 0x7

    new-array v6, v6, [Ljava/lang/Object;

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v3

    iget v0, p0, Lcom/birbit/android/jobqueue/d;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v2

    const/4 v0, 0x2

    iget v2, p0, Lcom/birbit/android/jobqueue/d;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    iget v2, p0, Lcom/birbit/android/jobqueue/d;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v0

    const/4 v0, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v0

    const/4 v0, 0x5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v0

    const/4 v0, 0x6

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v6, v0

    const-string v0, "check above load factor: totalCons:%s minCons:%s maxConsCount: %s, loadFactor %s remainingJobs: %s runningsHolders: %s. isAbove:%s"

    invoke-static {v0, v6}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v5
.end method

.method private m(Lo1/g;[Ljava/lang/String;Z)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/g;",
            "[",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/birbit/android/jobqueue/f;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 3
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v5

    invoke-virtual {v5}, Lcom/birbit/android/jobqueue/e;->j()Ljava/util/Set;

    move-result-object v5

    aput-object v5, v3, v4

    const-string v4, "checking job tag %s. tags of job: %s"

    invoke-static {v4, v3}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->n()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->o()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->m()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p1, p2, v3}, Lo1/g;->c([Ljava/lang/String;Ljava/util/Set;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 7
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_3

    .line 8
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->r()V

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->q()V

    goto :goto_0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method e()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/d;->c(Z)V

    return-void
.end method

.method f(Lu1/g;)Z
    .locals 11

    .line 1
    const-class v0, Lu1/e;

    invoke-virtual {p1}, Lu1/g;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/d$b;

    .line 2
    iget-boolean v2, v1, Lcom/birbit/android/jobqueue/d$b;->r:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x0

    .line 3
    iget-object v4, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    invoke-virtual {v4}, Lcom/birbit/android/jobqueue/h;->I()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 4
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    iget-object v5, p0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {v5}, Lo1/f;->e()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/birbit/android/jobqueue/h;->u(Ljava/util/Collection;)Lcom/birbit/android/jobqueue/f;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_3

    .line 5
    iput-boolean v3, v1, Lcom/birbit/android/jobqueue/d$b;->r:Z

    .line 6
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo1/f;->a(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    const-class v0, Lu1/i;

    invoke-virtual {p1, v0}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object p1

    check-cast p1, Lu1/i;

    .line 8
    invoke-virtual {p1, v2}, Lu1/i;->d(Lcom/birbit/android/jobqueue/f;)V

    .line 9
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/birbit/android/jobqueue/e;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lo1/f;->a(Ljava/lang/String;)V

    .line 12
    :cond_2
    iget-object v0, v1, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    invoke-virtual {v0, p1}, Lt1/f;->post(Lt1/b;)V

    return v3

    .line 13
    :cond_3
    invoke-virtual {p1}, Lu1/g;->c()J

    move-result-wide v5

    iget-wide v7, p0, Lcom/birbit/android/jobqueue/d;->e:J

    add-long/2addr v5, v7

    new-array p1, v3, [Ljava/lang/Object;

    .line 14
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v7, 0x0

    aput-object v2, p1, v7

    const-string v2, "keep alive: %s"

    invoke-static {v2, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget v2, p0, Lcom/birbit/android/jobqueue/d;->d:I

    if-le p1, v2, :cond_4

    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    if-eqz v4, :cond_6

    if-eqz p1, :cond_5

    .line 16
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->j:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v2}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v8

    cmp-long v2, v5, v8

    if-gez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v2, 0x1

    :goto_2
    const/4 v8, 0x2

    new-array v9, v8, [Ljava/lang/Object;

    .line 17
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    aput-object v10, v9, v7

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v9, v3

    const-string v4, "Consumer idle, will kill? %s . isRunning: %s"

    invoke-static {v4, v9}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v2, :cond_7

    .line 18
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    invoke-virtual {p1, v0}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object p1

    check-cast p1, Lu1/e;

    .line 19
    invoke-virtual {p1, v3}, Lu1/e;->d(I)V

    .line 20
    iget-object v0, v1, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    invoke-virtual {v0, p1}, Lt1/f;->post(Lt1/b;)V

    .line 21
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 22
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    new-array p1, v3, [Ljava/lang/Object;

    .line 23
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, v7

    const-string v0, "killed consumers. remaining consumers %d"

    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p1, :cond_b

    .line 25
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 26
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_3

    .line 27
    :cond_7
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 28
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    if-nez p1, :cond_9

    .line 29
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->i:Lcom/birbit/android/jobqueue/h;

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/h;->l()Z

    move-result v2

    if-nez v2, :cond_b

    .line 30
    :cond_9
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    invoke-virtual {v2, v0}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/e;

    .line 31
    invoke-virtual {v0, v8}, Lu1/e;->d(I)V

    if-nez p1, :cond_a

    .line 32
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->j:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v4

    iget-wide v8, p0, Lcom/birbit/android/jobqueue/d;->e:J

    add-long v5, v4, v8

    .line 33
    :cond_a
    iget-object p1, v1, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    invoke-virtual {p1, v0, v5, v6}, Lt1/f;->postAt(Lt1/b;J)V

    new-array p1, v3, [Ljava/lang/Object;

    .line 34
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, p1, v7

    const-string v0, "poke consumer manager at %s"

    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_b
    return v7
.end method

.method g(Lu1/j;Lcom/birbit/android/jobqueue/f;Lo1/e;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lu1/j;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/birbit/android/jobqueue/d$b;

    .line 2
    iget-boolean v0, p1, Lcom/birbit/android/jobqueue/d$b;->r:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p1, Lcom/birbit/android/jobqueue/d$b;->r:Z

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo1/f;->f(Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 7
    invoke-virtual {p3}, Lo1/e;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lo1/e;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    .line 8
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->j:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    invoke-virtual {p3}, Lo1/e;->a()Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, 0xf4240

    mul-long v2, v2, v4

    add-long/2addr v0, v2

    invoke-virtual {p1, p2, v0, v1}, Lo1/f;->b(Ljava/lang/String;J)V

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "this worker should not have a job"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/d$b;

    .line 2
    iget-object v1, v1, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    .line 3
    iget-object v2, p0, Lcom/birbit/android/jobqueue/d;->k:Lt1/c;

    const-class v3, Lu1/e;

    invoke-virtual {v2, v3}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v2

    check-cast v2, Lu1/e;

    const/4 v3, 0x2

    .line 4
    invoke-virtual {v2, v3}, Lu1/e;->d(I)V

    .line 5
    invoke-virtual {v1, v2}, Lt1/f;->post(Lt1/b;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public i(Lv1/a;J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    .line 2
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p1}, Lv1/a;->b()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    invoke-virtual {v1, p2, p3}, Lcom/birbit/android/jobqueue/f;->u(J)Z

    move-result v2

    if-eqz v2, :cond_2

    return v4

    .line 4
    :cond_2
    invoke-virtual {p1}, Lv1/a;->b()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    invoke-virtual {v1, p2, p3}, Lcom/birbit/android/jobqueue/f;->v(J)Z

    move-result v1

    if-eqz v1, :cond_0

    return v4

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method k(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/d;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method l(Lo1/g;[Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/g;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/birbit/android/jobqueue/d;->m(Lo1/g;[Ljava/lang/String;Z)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method n(Lo1/g;[Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/g;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/birbit/android/jobqueue/d;->m(Lo1/g;[Ljava/lang/String;Z)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method o()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/d;->c(Z)V

    return-void
.end method
