.class Lcom/birbit/android/jobqueue/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lo1/g;

.field private final c:[Ljava/lang/String;

.field private final d:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;


# direct methods
.method constructor <init>(Lo1/g;[Ljava/lang/String;Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/birbit/android/jobqueue/b;->b:Lo1/g;

    .line 3
    iput-object p2, p0, Lcom/birbit/android/jobqueue/b;->c:[Ljava/lang/String;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/b;->e:Ljava/util/Collection;

    .line 6
    iput-object p3, p0, Lcom/birbit/android/jobqueue/b;->f:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    return-void
.end method


# virtual methods
.method a(Lcom/birbit/android/jobqueue/h;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    const/4 v2, 0x3

    .line 2
    :try_start_0
    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/f;->t(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "job\'s on cancel has thrown an exception. Ignoring..."

    .line 3
    invoke-static {v2, v4, v3}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :goto_1
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p1, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v2, v1}, Lcom/birbit/android/jobqueue/JobQueue;->remove(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->f:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    if-eqz v0, :cond_4

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/b;->e:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    iget-object v2, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/birbit/android/jobqueue/f;

    .line 10
    invoke-virtual {v3}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 11
    :cond_2
    iget-object v2, p0, Lcom/birbit/android/jobqueue/b;->e:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/birbit/android/jobqueue/f;

    .line 12
    invoke-virtual {v3}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 13
    :cond_3
    new-instance v2, Lcom/birbit/android/jobqueue/CancelResult;

    invoke-direct {v2, v0, v1}, Lcom/birbit/android/jobqueue/CancelResult;-><init>(Ljava/util/Collection;Ljava/util/Collection;)V

    .line 14
    iget-object v0, p1, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/b;->f:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    invoke-virtual {v0, v2, v1}, Lcom/birbit/android/jobqueue/a;->j(Lcom/birbit/android/jobqueue/CancelResult;Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;)V

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    .line 16
    iget-object v2, p1, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Lcom/birbit/android/jobqueue/a;->m(Lcom/birbit/android/jobqueue/e;Z)V

    goto :goto_4

    :cond_5
    return-void
.end method

.method b()Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method c(Lcom/birbit/android/jobqueue/f;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 2
    iget-object p2, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/birbit/android/jobqueue/b;->e:Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method d(Lcom/birbit/android/jobqueue/h;Lcom/birbit/android/jobqueue/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->b:Lo1/g;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/b;->c:[Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lcom/birbit/android/jobqueue/d;->l(Lo1/g;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/birbit/android/jobqueue/b;->a:Ljava/util/Set;

    .line 2
    iget-object p2, p1, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    .line 3
    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/c;->a()V

    .line 4
    iget-object v0, p1, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/birbit/android/jobqueue/c;->m(J)V

    .line 5
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->b:Lo1/g;

    invoke-virtual {p2, v0}, Lcom/birbit/android/jobqueue/c;->p(Lo1/g;)V

    .line 6
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->a:Ljava/util/Set;

    invoke-virtual {p2, v0}, Lcom/birbit/android/jobqueue/c;->j(Ljava/util/Collection;)V

    .line 7
    iget-object v0, p0, Lcom/birbit/android/jobqueue/b;->c:[Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/birbit/android/jobqueue/c;->q([Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p2, v0}, Lcom/birbit/android/jobqueue/c;->k(Z)V

    .line 9
    iget-object v0, p1, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p2}, Lcom/birbit/android/jobqueue/JobQueue;->findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;

    move-result-object v0

    .line 10
    iget-object v1, p1, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v1, p2}, Lcom/birbit/android/jobqueue/JobQueue;->findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;

    move-result-object p2

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    .line 12
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->q()V

    .line 13
    iget-object v2, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v2, p1, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v2, v1}, Lcom/birbit/android/jobqueue/JobQueue;->onJobCancelled(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/birbit/android/jobqueue/f;

    .line 16
    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/f;->q()V

    .line 17
    iget-object v1, p0, Lcom/birbit/android/jobqueue/b;->d:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object v1, p1, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v1, v0}, Lcom/birbit/android/jobqueue/JobQueue;->onJobCancelled(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_1

    :cond_1
    return-void
.end method
