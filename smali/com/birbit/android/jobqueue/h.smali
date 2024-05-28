.class Lcom/birbit/android/jobqueue/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/birbit/android/jobqueue/network/NetworkEventProvider$Listener;


# instance fields
.field private A:Z

.field private B:Z

.field final C:Lt1/e;

.field D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

.field final n:Lcom/birbit/android/jobqueue/timer/Timer;

.field private final o:Landroid/content/Context;

.field private final p:J

.field final q:Lcom/birbit/android/jobqueue/JobQueue;

.field final r:Lcom/birbit/android/jobqueue/JobQueue;

.field private final s:Lcom/birbit/android/jobqueue/network/NetworkUtil;

.field private final t:Lcom/birbit/android/jobqueue/di/DependencyInjector;

.field private final u:Lt1/c;

.field final v:Lcom/birbit/android/jobqueue/d;

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/birbit/android/jobqueue/b;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field

.field final y:Lcom/birbit/android/jobqueue/c;

.field final z:Lcom/birbit/android/jobqueue/a;


# direct methods
.method constructor <init>(Lq1/a;Lt1/e;Lt1/c;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/birbit/android/jobqueue/c;

    invoke-direct {v0}, Lcom/birbit/android/jobqueue/c;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/h;->B:Z

    .line 5
    iput-object p2, p0, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    .line 6
    invoke-virtual {p1}, Lq1/a;->d()Lcom/birbit/android/jobqueue/log/CustomLogger;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p1}, Lq1/a;->d()Lcom/birbit/android/jobqueue/log/CustomLogger;

    move-result-object p2

    invoke-static {p2}, Ls1/a;->f(Lcom/birbit/android/jobqueue/log/CustomLogger;)V

    .line 8
    :cond_0
    iput-object p3, p0, Lcom/birbit/android/jobqueue/h;->u:Lt1/c;

    .line 9
    invoke-virtual {p1}, Lq1/a;->n()Lcom/birbit/android/jobqueue/timer/Timer;

    move-result-object p2

    iput-object p2, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    .line 10
    invoke-virtual {p1}, Lq1/a;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/birbit/android/jobqueue/h;->o:Landroid/content/Context;

    .line 11
    invoke-interface {p2}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/h;->p:J

    .line 12
    invoke-virtual {p1}, Lq1/a;->l()Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    move-result-object v2

    iput-object v2, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-eqz v2, :cond_1

    .line 13
    invoke-virtual {p1}, Lq1/a;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    instance-of v2, v2, Lo1/a;

    if-nez v2, :cond_1

    .line 14
    new-instance v2, Lo1/a;

    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-direct {v2, v3, p2}, Lo1/a;-><init>(Lcom/birbit/android/jobqueue/scheduling/Scheduler;Lcom/birbit/android/jobqueue/timer/Timer;)V

    iput-object v2, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    .line 15
    :cond_1
    invoke-virtual {p1}, Lq1/a;->k()Lcom/birbit/android/jobqueue/QueueFactory;

    move-result-object v2

    invoke-interface {v2, p1, v0, v1}, Lcom/birbit/android/jobqueue/QueueFactory;->createPersistentQueue(Lq1/a;J)Lcom/birbit/android/jobqueue/JobQueue;

    move-result-object v2

    iput-object v2, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    .line 16
    invoke-virtual {p1}, Lq1/a;->k()Lcom/birbit/android/jobqueue/QueueFactory;

    move-result-object v2

    invoke-interface {v2, p1, v0, v1}, Lcom/birbit/android/jobqueue/QueueFactory;->createNonPersistent(Lq1/a;J)Lcom/birbit/android/jobqueue/JobQueue;

    move-result-object v0

    iput-object v0, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    .line 17
    invoke-virtual {p1}, Lq1/a;->j()Lcom/birbit/android/jobqueue/network/NetworkUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/birbit/android/jobqueue/h;->s:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    .line 18
    invoke-virtual {p1}, Lq1/a;->e()Lcom/birbit/android/jobqueue/di/DependencyInjector;

    move-result-object v1

    iput-object v1, p0, Lcom/birbit/android/jobqueue/h;->t:Lcom/birbit/android/jobqueue/di/DependencyInjector;

    .line 19
    instance-of v1, v0, Lcom/birbit/android/jobqueue/network/NetworkEventProvider;

    if-eqz v1, :cond_2

    .line 20
    check-cast v0, Lcom/birbit/android/jobqueue/network/NetworkEventProvider;

    invoke-interface {v0, p0}, Lcom/birbit/android/jobqueue/network/NetworkEventProvider;->setListener(Lcom/birbit/android/jobqueue/network/NetworkEventProvider$Listener;)V

    .line 21
    :cond_2
    new-instance v0, Lcom/birbit/android/jobqueue/d;

    invoke-direct {v0, p0, p2, p3, p1}, Lcom/birbit/android/jobqueue/d;-><init>(Lcom/birbit/android/jobqueue/h;Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;Lq1/a;)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    .line 22
    new-instance p1, Lcom/birbit/android/jobqueue/a;

    invoke-direct {p1, p3, p2}, Lcom/birbit/android/jobqueue/a;-><init>(Lt1/c;Lcom/birbit/android/jobqueue/timer/Timer;)V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    return-void
.end method

.method private A(Lu1/h;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lu1/h;->e()I

    move-result v0

    const/16 v1, 0x65

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot handle public query with type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lu1/h;->e()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :pswitch_0
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/d;->d()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->n()V

    .line 5
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    invoke-interface {p1, v2}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    goto :goto_0

    .line 7
    :pswitch_2
    invoke-virtual {p1}, Lu1/h;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/h;->s(Ljava/lang/String;)Lo1/c;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    goto :goto_0

    :pswitch_3
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "handling stop request..."

    .line 9
    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    iput-boolean v2, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    .line 11
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/d;->h()V

    goto :goto_0

    :pswitch_4
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "handling start request..."

    .line 12
    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    iget-boolean p1, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    .line 15
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/d;->e()V

    goto :goto_0

    .line 16
    :pswitch_5
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->t()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/h;->p(I)I

    move-result v0

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    goto :goto_0

    .line 17
    :pswitch_6
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/h;->o()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    invoke-interface {p1, v2}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private B(Lu1/j;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lu1/j;->d()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Lu1/j;->c()Lcom/birbit/android/jobqueue/f;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/birbit/android/jobqueue/a;->q(Lcom/birbit/android/jobqueue/e;I)V

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "unknown job holder result"

    .line 4
    invoke-static {v4, v3}, Ls1/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    const/4 v3, 0x6

    .line 5
    invoke-direct {p0, v1, v3}, Lcom/birbit/android/jobqueue/h;->m(Lcom/birbit/android/jobqueue/f;I)V

    .line 6
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->K(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_0

    :pswitch_1
    const/4 v3, 0x5

    .line 7
    invoke-direct {p0, v1, v3}, Lcom/birbit/android/jobqueue/h;->m(Lcom/birbit/android/jobqueue/f;I)V

    .line 8
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->K(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_0

    .line 9
    :pswitch_2
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->j()Lo1/e;

    move-result-object v3

    .line 10
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->G(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_1

    :pswitch_3
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "running job failed and cancelled, doing nothing. Will be removed after it\'s onCancel is called by the CancelHandler"

    .line 11
    invoke-static {v4, v3}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    const/4 v3, 0x2

    .line 12
    invoke-direct {p0, v1, v3}, Lcom/birbit/android/jobqueue/h;->m(Lcom/birbit/android/jobqueue/f;I)V

    .line 13
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->K(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_0

    .line 14
    :pswitch_5
    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->s()V

    .line 15
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->K(Lcom/birbit/android/jobqueue/f;)V

    :goto_0
    const/4 v3, 0x0

    .line 16
    :goto_1
    iget-object v4, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v4, p1, v1, v3}, Lcom/birbit/android/jobqueue/d;->g(Lu1/j;Lcom/birbit/android/jobqueue/f;Lo1/e;)V

    .line 17
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v3

    invoke-virtual {p1, v3, v0}, Lcom/birbit/android/jobqueue/a;->h(Lcom/birbit/android/jobqueue/e;I)V

    .line 18
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->w:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 19
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_2
    if-ge v2, p1, :cond_1

    .line 20
    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->w:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/birbit/android/jobqueue/b;

    .line 21
    invoke-virtual {v3, v1, v0}, Lcom/birbit/android/jobqueue/b;->c(Lcom/birbit/android/jobqueue/f;I)V

    .line 22
    invoke-virtual {v3}, Lcom/birbit/android/jobqueue/b;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 23
    invoke-virtual {v3, p0}, Lcom/birbit/android/jobqueue/b;->a(Lcom/birbit/android/jobqueue/h;)V

    .line 24
    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->w:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 p1, p1, -0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private C(Lu1/k;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lu1/k;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lu1/k;->c()Lv1/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->D(Lv1/a;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3
    invoke-virtual {p1}, Lu1/k;->c()Lv1/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->E(Lv1/a;)V

    :goto_0
    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown scheduler message with what "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private D(Lv1/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/h;->I()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, p1, v1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->c(Lv1/a;Z)V

    :cond_0
    return-void

    .line 4
    :cond_1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->F(Lv1/a;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 5
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->c(Lv1/a;Z)V

    :cond_2
    return-void

    .line 7
    :cond_3
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    if-nez v0, :cond_4

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/d;->e()V

    return-void
.end method

.method private E(Lv1/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv1/a;

    .line 4
    invoke-virtual {v2}, Lv1/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lv1/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-nez v0, :cond_2

    return-void

    .line 7
    :cond_2
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->F(Lv1/a;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->d(Lv1/a;)V

    :cond_3
    return-void
.end method

.method private F(Lv1/a;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/birbit/android/jobqueue/d;->i(Lv1/a;J)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/c;->a()V

    .line 3
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v2}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/birbit/android/jobqueue/c;->m(J)V

    .line 4
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {p1}, Lv1/a;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/c;->l(I)V

    .line 5
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/JobQueue;->countReadyJobs(Lcom/birbit/android/jobqueue/c;)I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private G(Lcom/birbit/android/jobqueue/f;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->j()Lo1/e;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->J(Lcom/birbit/android/jobqueue/f;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lo1/e;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v0}, Lo1/e;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/birbit/android/jobqueue/f;->A(I)V

    :cond_1
    const-wide/16 v1, -0x1

    .line 5
    invoke-virtual {v0}, Lo1/e;->a()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 6
    invoke-virtual {v0}, Lo1/e;->a()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_2
    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v3

    const-wide/32 v5, 0xf4240

    mul-long v1, v1, v5

    add-long/2addr v3, v1

    goto :goto_0

    :cond_3
    const-wide/high16 v3, -0x8000000000000000L

    :goto_0
    invoke-virtual {p1, v3, v4}, Lcom/birbit/android/jobqueue/f;->y(J)V

    .line 8
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->J(Lcom/birbit/android/jobqueue/f;)V

    return-void
.end method

.method private H()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 3
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->x:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv1/a;

    .line 4
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->F(Lv1/a;)Z

    move-result v2

    .line 5
    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-virtual {v3, v1, v2}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->c(Lv1/a;Z)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private J(Lcom/birbit/android/jobqueue/f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "not re-adding cancelled job "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private K(Lcom/birbit/android/jobqueue/f;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->remove(Lcom/birbit/android/jobqueue/f;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->remove(Lcom/birbit/android/jobqueue/f;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/a;->o(Lcom/birbit/android/jobqueue/e;)V

    return-void
.end method

.method private L(Lcom/birbit/android/jobqueue/e;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/e;->o(Lcom/birbit/android/jobqueue/timer/Timer;)Z

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-virtual {p1, v1}, Lcom/birbit/android/jobqueue/e;->p(Lcom/birbit/android/jobqueue/timer/Timer;)Z

    move-result v1

    .line 4
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    move-wide v2, v4

    :goto_0
    if-nez v0, :cond_2

    if-nez v1, :cond_2

    const-wide/16 v4, 0x7530

    cmp-long p1, v2, v4

    if-gez p1, :cond_2

    return-void

    .line 5
    :cond_2
    new-instance p1, Lv1/a;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p1, v4}, Lv1/a;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    const/4 v0, 0x3

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_4

    const/4 v0, 0x2

    goto :goto_1

    :cond_4
    const/4 v0, 0x1

    .line 6
    :goto_1
    invoke-virtual {p1, v0}, Lv1/a;->e(I)V

    .line 7
    invoke-virtual {p1, v2, v3}, Lv1/a;->d(J)V

    .line 8
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->d(Lv1/a;)V

    .line 9
    iput-boolean v4, p0, Lcom/birbit/android/jobqueue/h;->B:Z

    return-void
.end method

.method static synthetic a(Lcom/birbit/android/jobqueue/h;Lu1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->x(Lu1/a;)V

    return-void
.end method

.method static synthetic b(Lcom/birbit/android/jobqueue/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->H()V

    return-void
.end method

.method static synthetic c(Lcom/birbit/android/jobqueue/h;Lu1/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->B(Lu1/j;)V

    return-void
.end method

.method static synthetic d(Lcom/birbit/android/jobqueue/h;Lu1/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->y(Lu1/c;)V

    return-void
.end method

.method static synthetic e(Lcom/birbit/android/jobqueue/h;Lu1/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->A(Lu1/h;)V

    return-void
.end method

.method static synthetic f(Lcom/birbit/android/jobqueue/h;Lu1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->z(Lu1/e;)V

    return-void
.end method

.method static synthetic g(Lcom/birbit/android/jobqueue/h;Lu1/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->C(Lu1/k;)V

    return-void
.end method

.method static synthetic h(Lcom/birbit/android/jobqueue/h;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    return p0
.end method

.method static synthetic i(Lcom/birbit/android/jobqueue/h;)Lt1/c;
    .locals 0

    iget-object p0, p0, Lcom/birbit/android/jobqueue/h;->u:Lt1/c;

    return-object p0
.end method

.method static synthetic j(Lcom/birbit/android/jobqueue/h;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/birbit/android/jobqueue/h;->B:Z

    return p0
.end method

.method static synthetic k(Lcom/birbit/android/jobqueue/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/birbit/android/jobqueue/h;->B:Z

    return p1
.end method

.method private m(Lcom/birbit/android/jobqueue/f;I)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/birbit/android/jobqueue/f;->t(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "job\'s onCancel did throw an exception, ignoring..."

    .line 2
    invoke-static {p2, v2, v1}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :goto_0
    iget-object p2, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lcom/birbit/android/jobqueue/a;->m(Lcom/birbit/android/jobqueue/e;Z)V

    return-void
.end method

.method private n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/JobQueue;->clear()V

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/JobQueue;->clear()V

    return-void
.end method

.method private p(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {v0}, Lo1/f;->e()Ljava/util/Collection;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/c;->a()V

    .line 3
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v2}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/birbit/android/jobqueue/c;->m(J)V

    .line 4
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v1, p1}, Lcom/birbit/android/jobqueue/c;->l(I)V

    .line 5
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/c;->i(Ljava/util/Collection;)V

    .line 6
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/c;->k(Z)V

    .line 7
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/c;->r(Ljava/lang/Long;)V

    .line 8
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/JobQueue;->countReadyJobs(Lcom/birbit/android/jobqueue/c;)I

    move-result p1

    add-int/lit8 p1, p1, 0x0

    .line 9
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {v0, v1}, Lcom/birbit/android/jobqueue/JobQueue;->countReadyJobs(Lcom/birbit/android/jobqueue/c;)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method private r(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;
    .locals 4

    if-eqz p1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/c;->a()V

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/birbit/android/jobqueue/c;->q([Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    sget-object v0, Lo1/g;->o:Lo1/g;

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/c;->p(Lo1/g;)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/JobQueue;->findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {v0, v1}, Lcom/birbit/android/jobqueue/JobQueue;->findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 6
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/f;

    .line 8
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/birbit/android/jobqueue/d;->k(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    .line 9
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/birbit/android/jobqueue/f;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private s(Ljava/lang/String;)Lo1/c;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/d;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p1, Lo1/c;->p:Lo1/c;

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/JobQueue;->findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    .line 5
    sget-object p1, Lo1/c;->q:Lo1/c;

    return-object p1

    .line 6
    :cond_2
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->t()I

    move-result p1

    .line 7
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v1

    const/4 v3, 0x1

    if-ne p1, v3, :cond_3

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/birbit/android/jobqueue/f;->u(J)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 9
    sget-object p1, Lo1/c;->n:Lo1/c;

    return-object p1

    :cond_3
    const/4 v3, 0x3

    if-eq p1, v3, :cond_4

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/birbit/android/jobqueue/f;->v(J)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 11
    sget-object p1, Lo1/c;->n:Lo1/c;

    return-object p1

    .line 12
    :cond_4
    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/f;->b()J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-lez p1, :cond_5

    .line 13
    sget-object p1, Lo1/c;->n:Lo1/c;

    return-object p1

    .line 14
    :cond_5
    sget-object p1, Lo1/c;->o:Lo1/c;

    return-object p1
.end method

.method private t()I
    .locals 2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->s:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    if-nez v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->o:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/birbit/android/jobqueue/network/NetworkUtil;->getNetworkStatus(Landroid/content/Context;)I

    move-result v0

    :goto_0
    return v0
.end method

.method private x(Lu1/a;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lu1/a;->c()Lcom/birbit/android/jobqueue/e;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->b()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-lez v6, :cond_0

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->b()J

    move-result-wide v4

    const-wide/32 v6, 0xf4240

    mul-long v4, v4, v6

    add-long/2addr v0, v4

    goto :goto_0

    :cond_0
    move-wide v0, v2

    .line 3
    :goto_0
    iget-object v4, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-virtual {p1, v4}, Lcom/birbit/android/jobqueue/e;->r(Lcom/birbit/android/jobqueue/timer/Timer;)V

    .line 4
    new-instance v4, Lcom/birbit/android/jobqueue/f$b;

    invoke-direct {v4}, Lcom/birbit/android/jobqueue/f$b;-><init>()V

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->d()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/birbit/android/jobqueue/f$b;->g(I)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/birbit/android/jobqueue/f$b;->f(Lcom/birbit/android/jobqueue/e;)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v4

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/birbit/android/jobqueue/f$b;->d(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v4

    iget-object v5, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v5}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/birbit/android/jobqueue/f$b;->b(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lcom/birbit/android/jobqueue/f$b;->c(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/birbit/android/jobqueue/f$b;->i(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/f$b;->a()Lcom/birbit/android/jobqueue/f;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/h;->r(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    .line 6
    iget-object v4, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/birbit/android/jobqueue/d;->k(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_5

    .line 7
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    goto :goto_3

    :cond_3
    iget-object v5, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    :goto_3
    if-eqz v1, :cond_4

    .line 8
    iget-object v6, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    sget-object v7, Lo1/g;->o:Lo1/g;

    new-array v8, v3, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->i()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v2

    invoke-virtual {v6, v7, v8}, Lcom/birbit/android/jobqueue/d;->n(Lo1/g;[Ljava/lang/String;)Ljava/util/Set;

    .line 9
    invoke-interface {v5, v0, v1}, Lcom/birbit/android/jobqueue/JobQueue;->substitute(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)V

    goto :goto_4

    .line 10
    :cond_4
    invoke-interface {v5, v0}, Lcom/birbit/android/jobqueue/JobQueue;->insert(Lcom/birbit/android/jobqueue/f;)Z

    .line 11
    :goto_4
    invoke-static {}, Ls1/a;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->d()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v3

    const/4 v5, 0x2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->b()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v1, v5

    const/4 v5, 0x3

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->h()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v5

    const/4 v5, 0x4

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v1, v5

    const/4 v5, 0x5

    iget-object v6, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-virtual {p1, v6}, Lcom/birbit/android/jobqueue/e;->o(Lcom/birbit/android/jobqueue/timer/Timer;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v1, v5

    const-string v5, "added job class: %s priority: %d delay: %d group : %s persistent: %s requires network: %s"

    invoke-static {v5, v1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    new-array v1, v3, [Ljava/lang/Object;

    .line 13
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->i()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v2

    const-string v5, "another job with same singleId: %s was already queued"

    invoke-static {v5, v1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    :cond_6
    :goto_5
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->t:Lcom/birbit/android/jobqueue/di/DependencyInjector;

    if-eqz v1, :cond_7

    .line 15
    invoke-interface {v1, p1}, Lcom/birbit/android/jobqueue/di/DependencyInjector;->inject(Lcom/birbit/android/jobqueue/e;)V

    .line 16
    :cond_7
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/birbit/android/jobqueue/f;->x(Landroid/content/Context;)V

    .line 17
    :try_start_0
    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/e;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v5, "job\'s onAdded did throw an exception, ignoring..."

    .line 18
    invoke-static {v1, v5, v2}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    :goto_6
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/a;->k(Lcom/birbit/android/jobqueue/e;)V

    if-eqz v4, :cond_8

    .line 20
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/d;->o()V

    .line 21
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/e;->k()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 22
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/h;->L(Lcom/birbit/android/jobqueue/e;)V

    goto :goto_7

    .line 23
    :cond_8
    invoke-direct {p0, v0, v3}, Lcom/birbit/android/jobqueue/h;->m(Lcom/birbit/android/jobqueue/f;I)V

    .line 24
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->z:Lcom/birbit/android/jobqueue/a;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/a;->o(Lcom/birbit/android/jobqueue/e;)V

    :cond_9
    :goto_7
    return-void
.end method

.method private y(Lu1/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/birbit/android/jobqueue/b;

    invoke-virtual {p1}, Lu1/c;->d()Lo1/g;

    move-result-object v1

    invoke-virtual {p1}, Lu1/c;->e()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lu1/c;->c()Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/birbit/android/jobqueue/b;-><init>(Lo1/g;[Ljava/lang/String;Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;)V

    .line 2
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {v0, p0, p1}, Lcom/birbit/android/jobqueue/b;->d(Lcom/birbit/android/jobqueue/h;Lcom/birbit/android/jobqueue/d;)V

    .line 3
    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/b;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lcom/birbit/android/jobqueue/b;->a(Lcom/birbit/android/jobqueue/h;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->w:Ljava/util/List;

    if-nez p1, :cond_1

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/birbit/android/jobqueue/h;->w:Ljava/util/List;

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->w:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private z(Lu1/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu1/e;->c()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    invoke-virtual {p1}, Lt1/e;->stop()V

    .line 3
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    invoke-virtual {p1}, Lt1/e;->clear()V

    :cond_0
    return-void
.end method


# virtual methods
.method I()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    return v0
.end method

.method l()Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->s:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    instance-of v0, v0, Lcom/birbit/android/jobqueue/network/NetworkEventProvider;

    return v0
.end method

.method o()I
    .locals 2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/JobQueue;->count()I

    move-result v0

    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v1}, Lcom/birbit/android/jobqueue/JobQueue;->count()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public onNetworkChange(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->u:Lt1/c;

    const-class v0, Lu1/f;

    invoke-virtual {p1, v0}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object p1

    check-cast p1, Lu1/f;

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    invoke-virtual {v0, p1}, Lt1/e;->post(Lt1/b;)V

    return-void
.end method

.method q()I
    .locals 1

    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->t()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/h;->p(I)I

    move-result v0

    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    new-instance v1, Lcom/birbit/android/jobqueue/h$a;

    invoke-direct {v1, p0}, Lcom/birbit/android/jobqueue/h$a;-><init>(Lcom/birbit/android/jobqueue/h;)V

    invoke-virtual {v0, v1}, Lt1/e;->consume(Lt1/d;)V

    return-void
.end method

.method u(Ljava/util/Collection;)Lcom/birbit/android/jobqueue/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/birbit/android/jobqueue/f;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/birbit/android/jobqueue/h;->v(Ljava/util/Collection;Z)Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    return-object p1
.end method

.method v(Ljava/util/Collection;Z)Lcom/birbit/android/jobqueue/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/birbit/android/jobqueue/f;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/h;->A:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->t()I

    move-result p2

    const/4 v0, 0x0

    new-array v2, v0, [Ljava/lang/Object;

    const-string v3, "looking for next job"

    .line 3
    invoke-static {v3, v2}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v2}, Lcom/birbit/android/jobqueue/c;->a()V

    .line 5
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v3}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/birbit/android/jobqueue/c;->m(J)V

    .line 6
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v2, p2}, Lcom/birbit/android/jobqueue/c;->l(I)V

    .line 7
    iget-object p2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {p2, p1}, Lcom/birbit/android/jobqueue/c;->i(Ljava/util/Collection;)V

    .line 8
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/birbit/android/jobqueue/c;->k(Z)V

    .line 9
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v2}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/birbit/android/jobqueue/c;->r(Ljava/lang/Long;)V

    .line 10
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {p1, v2}, Lcom/birbit/android/jobqueue/JobQueue;->nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    new-array v2, p2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    const-string v3, "non persistent result %s"

    .line 11
    invoke-static {v3, v2}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_1

    .line 12
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {p1, v2}, Lcom/birbit/android/jobqueue/JobQueue;->nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    new-array v2, p2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    const-string v0, "persistent result %s"

    .line 13
    invoke-static {v0, v2}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    :cond_1
    if-nez p1, :cond_2

    return-object v1

    :cond_2
    if-eqz v0, :cond_3

    .line 14
    iget-object p2, p0, Lcom/birbit/android/jobqueue/h;->t:Lcom/birbit/android/jobqueue/di/DependencyInjector;

    if-eqz p2, :cond_3

    .line 15
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/birbit/android/jobqueue/di/DependencyInjector;->inject(Lcom/birbit/android/jobqueue/e;)V

    .line 16
    :cond_3
    iget-object p2, p0, Lcom/birbit/android/jobqueue/h;->o:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/birbit/android/jobqueue/f;->x(Landroid/content/Context;)V

    return-object p1
.end method

.method w(Z)Ljava/lang/Long;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {v0}, Lo1/f;->d()Ljava/lang/Long;

    move-result-object v0

    .line 2
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/h;->t()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    iget-object v2, v2, Lcom/birbit/android/jobqueue/d;->m:Lo1/f;

    invoke-virtual {v2}, Lo1/f;->e()Ljava/util/Collection;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v3}, Lcom/birbit/android/jobqueue/c;->a()V

    .line 5
    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    iget-object v4, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v4}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/birbit/android/jobqueue/c;->m(J)V

    .line 6
    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v3, v1}, Lcom/birbit/android/jobqueue/c;->l(I)V

    .line 7
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/c;->i(Ljava/util/Collection;)V

    .line 8
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/c;->k(Z)V

    .line 9
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h;->r:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {v1, v2}, Lcom/birbit/android/jobqueue/JobQueue;->getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    iget-object v3, p0, Lcom/birbit/android/jobqueue/h;->y:Lcom/birbit/android/jobqueue/c;

    invoke-interface {v2, v3}, Lcom/birbit/android/jobqueue/JobQueue;->getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_2
    if-eqz v2, :cond_4

    if-nez v0, :cond_3

    .line 12
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_4
    if-eqz p1, :cond_6

    .line 13
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->s:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    instance-of p1, p1, Lcom/birbit/android/jobqueue/network/NetworkEventProvider;

    if-nez p1, :cond_6

    .line 14
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h;->n:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v1

    sget-wide v3, Lcom/birbit/android/jobqueue/g;->e:J

    add-long/2addr v1, v3

    if-nez v0, :cond_5

    goto :goto_3

    .line 15
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :goto_3
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_6
    return-object v0
.end method
