.class public interface abstract Lcom/birbit/android/jobqueue/JobQueue;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract clear()V
.end method

.method public abstract count()I
.end method

.method public abstract countReadyJobs(Lcom/birbit/android/jobqueue/c;)I
.end method

.method public abstract findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;
.end method

.method public abstract findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;
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
.end method

.method public abstract getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;
.end method

.method public abstract insert(Lcom/birbit/android/jobqueue/f;)Z
.end method

.method public abstract insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z
.end method

.method public abstract nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;
.end method

.method public abstract onJobCancelled(Lcom/birbit/android/jobqueue/f;)V
.end method

.method public abstract remove(Lcom/birbit/android/jobqueue/f;)V
.end method

.method public abstract substitute(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)V
.end method
