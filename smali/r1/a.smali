.class public Lr1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/JobQueue;


# instance fields
.field private final a:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/atomic/AtomicLong;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:J


# direct methods
.method public constructor <init>(Lq1/a;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/TreeSet;

    new-instance v0, Lr1/a$a;

    invoke-direct {v0, p0}, Lr1/a$a;-><init>(Lr1/a;)V

    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object p1, p0, Lr1/a;->a:Ljava/util/TreeSet;

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lr1/a;->b:Ljava/util/Map;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lr1/a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lr1/a;->d:Ljava/util/List;

    .line 6
    iput-wide p2, p0, Lr1/a;->e:J

    return-void
.end method

.method private static a(Lcom/birbit/android/jobqueue/f;ZZ)Ljava/lang/Long;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->h()J

    move-result-wide v0

    .line 2
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->i()J

    move-result-wide v2

    .line 3
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->b()J

    move-result-wide v4

    const/4 p0, 0x0

    const-wide v6, 0x7fffffffffffffffL

    if-nez p1, :cond_1

    cmp-long p1, v0, v6

    if-nez p1, :cond_0

    return-object p0

    .line 4
    :cond_0
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    :cond_1
    if-nez p2, :cond_3

    cmp-long p1, v2, v6

    if-nez p1, :cond_2

    return-object p0

    .line 5
    :cond_2
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 6
    :cond_3
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lr1/a;->c(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;Z)Z

    move-result p0

    return p0
.end method

.method private static c(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;Z)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p2, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->s()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->e()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/birbit/android/jobqueue/f;->u(J)Z

    move-result p2

    if-eqz p2, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->t()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->e()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/birbit/android/jobqueue/f;->v(J)Z

    move-result p2

    if-eqz p2, :cond_1

    return v0

    .line 3
    :cond_1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->h()Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->b()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->h()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long p2, v1, v3

    if-lez p2, :cond_2

    return v0

    .line 4
    :cond_2
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return v0

    .line 5
    :cond_3
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    return v0

    .line 6
    :cond_4
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->m()Ljava/util/Set;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object p2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->m()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lo1/g;->b(Ljava/util/Collection;Ljava/util/Set;)Z

    move-result p0

    if-nez p0, :cond_6

    :cond_5
    return v0

    :cond_6
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    .line 2
    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public count()I
    .locals 1

    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    move-result v0

    return v0
.end method

.method public countReadyJobs(Lcom/birbit/android/jobqueue/c;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lr1/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/birbit/android/jobqueue/f;

    .line 3
    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 4
    iget-object v4, p0, Lr1/a;->d:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    invoke-static {v2, p1}, Lr1/a;->b(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    if-eqz v3, :cond_0

    .line 5
    iget-object v2, p0, Lr1/a;->d:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_2
    iget-object p1, p0, Lr1/a;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return v1
.end method

.method public findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;
    .locals 1

    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/birbit/android/jobqueue/f;

    return-object p1
.end method

.method public findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/birbit/android/jobqueue/c;",
            ")",
            "Ljava/util/Set<",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2
    iget-object v1, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/birbit/android/jobqueue/f;

    .line 3
    invoke-static {v2, p1}, Lr1/a;->b(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->s()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 2
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->t()Z

    move-result v2

    xor-int/2addr v2, v1

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    if-nez v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    .line 4
    invoke-static {v1, p1}, Lr1/a;->b(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v3, :cond_2

    .line 5
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->b()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v2, v4, v6

    if-gez v2, :cond_1

    .line 6
    :cond_2
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    .line 7
    :cond_3
    :goto_1
    iget-object v4, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v4}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/birbit/android/jobqueue/f;

    .line 8
    invoke-static {v5, p1, v1}, Lr1/a;->c(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;Z)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 9
    invoke-static {v5, v0, v2}, Lr1/a;->a(Lcom/birbit/android/jobqueue/f;ZZ)Ljava/lang/Long;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v3, :cond_6

    .line 10
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-gez v10, :cond_4

    :cond_6
    move-object v3, v5

    goto :goto_2

    :cond_7
    return-object v3
.end method

.method public insert(Lcom/birbit/android/jobqueue/f;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr1/a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/birbit/android/jobqueue/f;->z(J)V

    .line 2
    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/birbit/android/jobqueue/f;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot add a job with the same id twice"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->e()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lr1/a;->insert(Lcom/birbit/android/jobqueue/f;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/birbit/android/jobqueue/f;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0, v0}, Lr1/a;->remove(Lcom/birbit/android/jobqueue/f;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    .line 2
    invoke-static {v1, p1}, Lr1/a;->b(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/c;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Lr1/a;->remove(Lcom/birbit/android/jobqueue/f;)V

    .line 4
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->k()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/birbit/android/jobqueue/f;->B(I)V

    .line 5
    iget-wide v2, p0, Lr1/a;->e:J

    invoke-virtual {v1, v2, v3}, Lcom/birbit/android/jobqueue/f;->C(J)V

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public onJobCancelled(Lcom/birbit/android/jobqueue/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lr1/a;->remove(Lcom/birbit/android/jobqueue/f;)V

    return-void
.end method

.method public remove(Lcom/birbit/android/jobqueue/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr1/a;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lr1/a;->a:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public substitute(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lr1/a;->remove(Lcom/birbit/android/jobqueue/f;)V

    .line 2
    invoke-virtual {p0, p1}, Lr1/a;->insert(Lcom/birbit/android/jobqueue/f;)Z

    return-void
.end method
