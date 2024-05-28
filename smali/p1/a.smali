.class public Lp1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/JobQueue;


# instance fields
.field a:Lcom/birbit/android/jobqueue/JobQueue;

.field private b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/birbit/android/jobqueue/JobQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    return-void
.end method

.method private a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    return-void
.end method

.method private b()Z
    .locals 1

    iget-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->a()V

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/JobQueue;->clear()V

    return-void
.end method

.method public count()I
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/JobQueue;->count()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    .line 3
    :cond_0
    iget-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public countReadyJobs(Lcom/birbit/android/jobqueue/c;)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->countReadyJobs(Lcom/birbit/android/jobqueue/c;)I

    move-result p1

    return p1
.end method

.method public findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;
    .locals 1

    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    return-object p1
.end method

.method public findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;
    .locals 1
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

    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public insert(Lcom/birbit/android/jobqueue/f;)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->a()V

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->insert(Lcom/birbit/android/jobqueue/f;)Z

    move-result p1

    return p1
.end method

.method public insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->a()V

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z

    move-result p1

    return p1
.end method

.method public nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lp1/a;->b:Ljava/lang/Integer;

    :cond_1
    return-object p1
.end method

.method public onJobCancelled(Lcom/birbit/android/jobqueue/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->a()V

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->onJobCancelled(Lcom/birbit/android/jobqueue/f;)V

    return-void
.end method

.method public remove(Lcom/birbit/android/jobqueue/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->a()V

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->remove(Lcom/birbit/android/jobqueue/f;)V

    return-void
.end method

.method public substitute(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp1/a;->a()V

    .line 2
    iget-object v0, p0, Lp1/a;->a:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1, p2}, Lcom/birbit/android/jobqueue/JobQueue;->substitute(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)V

    return-void
.end method
