.class public Lo1/a;
.super Lcom/birbit/android/jobqueue/scheduling/Scheduler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/a$b;
    }
.end annotation


# static fields
.field public static final h:J


# instance fields
.field private c:J

.field private d:J

.field private final e:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo1/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/birbit/android/jobqueue/timer/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x384

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lo1/a;->h:J

    return-void
.end method

.method public constructor <init>(Lcom/birbit/android/jobqueue/scheduling/Scheduler;Lcom/birbit/android/jobqueue/timer/Timer;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;-><init>()V

    .line 2
    sget-wide v0, Lo1/a;->h:J

    iput-wide v0, p0, Lo1/a;->c:J

    .line 3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo1/a;->d:J

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo1/a;->f:Ljava/util/List;

    .line 5
    iput-object p1, p0, Lo1/a;->e:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    .line 6
    iput-object p2, p0, Lo1/a;->g:Lcom/birbit/android/jobqueue/timer/Timer;

    return-void
.end method

.method static synthetic g(Lo1/a;Lv1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/a;->j(Lv1/a;)V

    return-void
.end method

.method private i(Lo1/a$b;Lv1/a;J)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lo1/a$b;->b:Lv1/a;

    invoke-virtual {v0}, Lv1/a;->b()I

    move-result v0

    invoke-virtual {p2}, Lv1/a;->b()I

    move-result p2

    const/4 v1, 0x0

    if-eq v0, p2, :cond_0

    return v1

    .line 2
    :cond_0
    iget-wide p1, p1, Lo1/a$b;->a:J

    sub-long/2addr p1, p3

    const-wide/16 p3, 0x0

    cmp-long v0, p1, p3

    if-lez v0, :cond_1

    .line 3
    iget-wide p3, p0, Lo1/a;->d:J

    cmp-long v0, p1, p3

    if-gtz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private j(Lv1/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo1/a;->f:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lo1/a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    .line 3
    iget-object v2, p0, Lo1/a;->f:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo1/a$b;

    .line 4
    iget-object v2, v2, Lo1/a$b;->b:Lv1/a;

    invoke-virtual {v2}, Lv1/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lv1/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lo1/a;->f:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 6
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo1/a;->f:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lo1/a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iget-object v0, p0, Lo1/a;->e:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->a()V

    return-void

    :catchall_0
    move-exception v1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public b(Landroid/content/Context;Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->b(Landroid/content/Context;Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;)V

    .line 2
    iget-object p2, p0, Lo1/a;->e:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    new-instance v0, Lo1/a$a;

    invoke-direct {v0, p0}, Lo1/a$a;-><init>(Lo1/a;)V

    invoke-virtual {p2, p1, v0}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->b(Landroid/content/Context;Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;)V

    return-void
.end method

.method public c(Lv1/a;Z)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lo1/a;->j(Lv1/a;)V

    .line 2
    iget-object v0, p0, Lo1/a;->e:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->c(Lv1/a;Z)V

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lo1/a;->d(Lv1/a;)V

    :cond_0
    return-void
.end method

.method public d(Lv1/a;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lo1/a;->h(Lv1/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lo1/a;->e:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->d(Lv1/a;)V

    :cond_0
    return-void
.end method

.method protected h(Lv1/a;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lo1/a;->g:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    .line 2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lv1/a;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 3
    iget-object v4, p0, Lo1/a;->f:Ljava/util/List;

    monitor-enter v4

    .line 4
    :try_start_0
    iget-object v5, p0, Lo1/a;->f:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo1/a$b;

    .line 5
    invoke-direct {p0, v6, p1, v2, v3}, Lo1/a;->i(Lo1/a$b;Lv1/a;J)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 p1, 0x0

    .line 6
    monitor-exit v4

    return p1

    .line 7
    :cond_1
    invoke-virtual {p1}, Lv1/a;->a()J

    move-result-wide v2

    iget-wide v5, p0, Lo1/a;->c:J

    div-long/2addr v2, v5

    const-wide/16 v7, 0x1

    add-long/2addr v2, v7

    mul-long v2, v2, v5

    .line 8
    invoke-virtual {p1, v2, v3}, Lv1/a;->d(J)V

    .line 9
    iget-object v5, p0, Lo1/a;->f:Ljava/util/List;

    new-instance v6, Lo1/a$b;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-direct {v6, v0, v1, p1}, Lo1/a$b;-><init>(JLv1/a;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 10
    monitor-exit v4

    return p1

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
