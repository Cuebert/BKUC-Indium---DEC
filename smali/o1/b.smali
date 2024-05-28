.class public Lo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/QueueFactory;


# instance fields
.field a:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$c;

    invoke-direct {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$c;-><init>()V

    iput-object v0, p0, Lo1/b;->a:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;

    return-void
.end method


# virtual methods
.method public createNonPersistent(Lq1/a;J)Lcom/birbit/android/jobqueue/JobQueue;
    .locals 2

    new-instance v0, Lp1/a;

    new-instance v1, Lr1/a;

    invoke-direct {v1, p1, p2, p3}, Lr1/a;-><init>(Lq1/a;J)V

    invoke-direct {v0, v1}, Lp1/a;-><init>(Lcom/birbit/android/jobqueue/JobQueue;)V

    return-object v0
.end method

.method public createPersistentQueue(Lq1/a;J)Lcom/birbit/android/jobqueue/JobQueue;
    .locals 3

    new-instance v0, Lp1/a;

    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;

    iget-object v2, p0, Lo1/b;->a:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;

    invoke-direct {v1, p1, p2, p3, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;-><init>(Lq1/a;JLcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;)V

    invoke-direct {v0, v1}, Lp1/a;-><init>(Lcom/birbit/android/jobqueue/JobQueue;)V

    return-object v0
.end method
