.class public abstract Lcom/birbit/android/jobqueue/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field transient A:Lo1/e;

.field private transient B:Z

.field private n:Ljava/lang/String;

.field private o:J

.field private transient p:J

.field private q:J

.field private transient r:J

.field private s:Ljava/lang/String;

.field private t:Z

.field private u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private transient v:I

.field transient w:I

.field private transient x:J

.field transient y:Z

.field private transient z:Landroid/content/Context;


# direct methods
.method protected constructor <init>(Lo1/d;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/birbit/android/jobqueue/e;->n:Ljava/lang/String;

    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->o:J

    const-wide/16 v2, 0x0

    .line 4
    iput-wide v2, p0, Lcom/birbit/android/jobqueue/e;->p:J

    .line 5
    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->q:J

    .line 6
    iput-wide v2, p0, Lcom/birbit/android/jobqueue/e;->r:J

    .line 7
    invoke-virtual {p1}, Lo1/d;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->p:J

    .line 8
    invoke-virtual {p1}, Lo1/d;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->r:J

    .line 9
    invoke-virtual {p1}, Lo1/d;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/e;->t:Z

    .line 10
    invoke-virtual {p1}, Lo1/d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/birbit/android/jobqueue/e;->s:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Lo1/d;->c()I

    move-result v0

    iput v0, p0, Lcom/birbit/android/jobqueue/e;->w:I

    .line 12
    invoke-virtual {p1}, Lo1/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->x:J

    .line 13
    invoke-virtual {p1}, Lo1/d;->f()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {p1}, Lo1/d;->g()Ljava/util/HashSet;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_3

    .line 15
    :cond_0
    invoke-virtual {p1}, Lo1/d;->g()Ljava/util/HashSet;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lo1/d;->g()Ljava/util/HashSet;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    :goto_0
    if-eqz v0, :cond_2

    .line 16
    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object v1, p0, Lcom/birbit/android/jobqueue/e;->s:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 19
    iput-object v0, p0, Lcom/birbit/android/jobqueue/e;->s:Ljava/lang/String;

    .line 20
    :cond_2
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/e;->u:Ljava/util/Set;

    :cond_3
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "job-single-id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/e;->x:J

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/e;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/birbit/android/jobqueue/e;->w:I

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/e;->o:J

    return-wide v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/e;->q:J

    return-wide v0
.end method

.method protected g()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/e;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/e;->u:Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "job-single-id:"

    .line 3
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/birbit/android/jobqueue/e;->u:Ljava/util/Set;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/e;->t:Z

    return v0
.end method

.method public abstract l()V
.end method

.method protected abstract m(I)V
.end method

.method public abstract n()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method

.method public final o(Lcom/birbit/android/jobqueue/timer/Timer;)Z
    .locals 7

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/e;->B:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-wide v3, p0, Lcom/birbit/android/jobqueue/e;->o:J

    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-lez p1, :cond_1

    goto :goto_0

    :cond_0
    iget-wide v3, p0, Lcom/birbit/android/jobqueue/e;->p:J

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long p1, v3, v5

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final p(Lcom/birbit/android/jobqueue/timer/Timer;)Z
    .locals 7

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/e;->B:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-wide v3, p0, Lcom/birbit/android/jobqueue/e;->q:J

    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-lez p1, :cond_1

    goto :goto_0

    :cond_0
    iget-wide v3, p0, Lcom/birbit/android/jobqueue/e;->r:J

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long p1, v3, v5

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method final q(Lcom/birbit/android/jobqueue/f;I)I
    .locals 8

    .line 1
    iput p2, p0, Lcom/birbit/android/jobqueue/e;->v:I

    .line 2
    invoke-static {}, Ls1/a;->e()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const-string v3, "running job %s"

    invoke-static {v3, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/e;->n()V

    .line 5
    invoke-static {}, Ls1/a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "finished job %s"

    new-array v3, v1, [Ljava/lang/Object;

    aput-object p0, v3, v2

    .line 6
    invoke-static {v0, v3}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_2

    :catchall_0
    move-exception v0

    new-array v3, v1, [Ljava/lang/Object;

    aput-object p0, v3, v2

    const-string v4, "error while executing job %s"

    .line 7
    invoke-static {v0, v4, v3}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/e;->g()I

    move-result v3

    if-ge p2, v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_4

    .line 9
    iget-boolean v4, p0, Lcom/birbit/android/jobqueue/e;->y:Z

    if-nez v4, :cond_4

    .line 10
    :try_start_1
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/e;->g()I

    move-result v4

    invoke-virtual {p0, v0, p2, v4}, Lcom/birbit/android/jobqueue/e;->t(Ljava/lang/Throwable;II)Lo1/e;

    move-result-object v0

    if-nez v0, :cond_3

    .line 11
    sget-object v0, Lo1/e;->e:Lo1/e;

    .line 12
    :cond_3
    iput-object v0, p0, Lcom/birbit/android/jobqueue/e;->A:Lo1/e;

    .line 13
    invoke-virtual {v0}, Lo1/e;->c()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "shouldReRunOnThrowable did throw an exception"

    .line 14
    invoke-static {v0, v5, v4}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    const/4 v4, 0x4

    new-array v5, v4, [Ljava/lang/Object;

    aput-object p0, v5, v2

    xor-int/lit8 v2, v0, 0x1

    .line 15
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v5, v1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v6, 0x2

    aput-object v2, v5, v6

    iget-boolean v2, p0, Lcom/birbit/android/jobqueue/e;->y:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v7, 0x3

    aput-object v2, v5, v7

    const-string v2, "safeRunResult for %s : %s. re run:%s. cancelled: %s"

    invoke-static {v2, v5}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v0, :cond_5

    return v1

    .line 16
    :cond_5
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->p()Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p1, 0x6

    return p1

    .line 17
    :cond_6
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    return v7

    :cond_7
    if-eqz v3, :cond_8

    return v4

    .line 18
    :cond_8
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/e;->g()I

    move-result p1

    if-ge p2, p1, :cond_9

    const/4 p1, 0x5

    return p1

    :cond_9
    return v6
.end method

.method public r(Lcom/birbit/android/jobqueue/timer/Timer;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/e;->B:Z

    if-nez v0, :cond_5

    .line 2
    iget-wide v0, p0, Lcom/birbit/android/jobqueue/e;->p:J

    const-wide v2, 0x7fffffffffffffffL

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    .line 3
    iput-wide v4, p0, Lcom/birbit/android/jobqueue/e;->o:J

    goto :goto_0

    :cond_0
    cmp-long v6, v0, v2

    if-nez v6, :cond_1

    .line 4
    iput-wide v2, p0, Lcom/birbit/android/jobqueue/e;->o:J

    goto :goto_0

    .line 5
    :cond_1
    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v7, p0, Lcom/birbit/android/jobqueue/e;->p:J

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v6

    add-long/2addr v0, v6

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->o:J

    .line 6
    :goto_0
    iget-wide v0, p0, Lcom/birbit/android/jobqueue/e;->r:J

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    .line 7
    iput-wide v4, p0, Lcom/birbit/android/jobqueue/e;->q:J

    goto :goto_1

    :cond_2
    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    .line 8
    iput-wide v2, p0, Lcom/birbit/android/jobqueue/e;->q:J

    goto :goto_1

    .line 9
    :cond_3
    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v2, p0, Lcom/birbit/android/jobqueue/e;->r:J

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/e;->q:J

    .line 10
    :goto_1
    iget-wide v0, p0, Lcom/birbit/android/jobqueue/e;->o:J

    iget-wide v2, p0, Lcom/birbit/android/jobqueue/e;->q:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_4

    .line 11
    iput-wide v2, p0, Lcom/birbit/android/jobqueue/e;->o:J

    :cond_4
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/birbit/android/jobqueue/e;->B:Z

    return-void

    .line 13
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot add the same job twice"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method s(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/e;->z:Landroid/content/Context;

    return-void
.end method

.method protected abstract t(Ljava/lang/Throwable;II)Lo1/e;
.end method
