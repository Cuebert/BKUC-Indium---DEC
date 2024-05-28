.class Lcom/birbit/android/jobqueue/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/birbit/android/jobqueue/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field static final u:Lcom/birbit/android/jobqueue/messaging/MessagePredicate;


# instance fields
.field final n:Lt1/f;

.field final o:Lcom/birbit/android/jobqueue/messaging/MessageQueue;

.field final p:Lt1/c;

.field final q:Lcom/birbit/android/jobqueue/timer/Timer;

.field r:Z

.field s:J

.field final t:Lt1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/birbit/android/jobqueue/d$b$a;

    invoke-direct {v0}, Lcom/birbit/android/jobqueue/d$b$a;-><init>()V

    sput-object v0, Lcom/birbit/android/jobqueue/d$b;->u:Lcom/birbit/android/jobqueue/messaging/MessagePredicate;

    return-void
.end method

.method public constructor <init>(Lcom/birbit/android/jobqueue/messaging/MessageQueue;Lt1/f;Lt1/c;Lcom/birbit/android/jobqueue/timer/Timer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/birbit/android/jobqueue/d$b$b;

    invoke-direct {v0, p0}, Lcom/birbit/android/jobqueue/d$b$b;-><init>(Lcom/birbit/android/jobqueue/d$b;)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/d$b;->t:Lt1/d;

    .line 3
    iput-object p2, p0, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    .line 4
    iput-object p3, p0, Lcom/birbit/android/jobqueue/d$b;->p:Lt1/c;

    .line 5
    iput-object p1, p0, Lcom/birbit/android/jobqueue/d$b;->o:Lcom/birbit/android/jobqueue/messaging/MessageQueue;

    .line 6
    iput-object p4, p0, Lcom/birbit/android/jobqueue/d$b;->q:Lcom/birbit/android/jobqueue/timer/Timer;

    .line 7
    invoke-interface {p4}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/d$b;->s:J

    return-void
.end method

.method static synthetic a(Lcom/birbit/android/jobqueue/d$b;Lu1/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/d$b;->e(Lu1/i;)V

    return-void
.end method

.method static synthetic b(Lcom/birbit/android/jobqueue/d$b;)V
    .locals 0

    invoke-direct {p0}, Lcom/birbit/android/jobqueue/d$b;->f()V

    return-void
.end method

.method static synthetic c(Lcom/birbit/android/jobqueue/d$b;Lu1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/d$b;->d(Lu1/e;)V

    return-void
.end method

.method private d(Lu1/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu1/e;->c()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Consumer has been poked."

    .line 2
    invoke-static {v0, p1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    invoke-virtual {p1}, Lt1/f;->stop()V

    :goto_0
    return-void
.end method

.method private e(Lu1/i;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Lu1/i;->c()Lcom/birbit/android/jobqueue/f;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "running job %s"

    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lu1/i;->c()Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/f;->w(I)I

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d$b;->p:Lt1/c;

    const-class v2, Lu1/j;

    invoke-virtual {v1, v2}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v1

    check-cast v1, Lu1/j;

    .line 5
    invoke-virtual {v1, p1}, Lu1/j;->f(Lcom/birbit/android/jobqueue/f;)V

    .line 6
    invoke-virtual {v1, v0}, Lu1/j;->g(I)V

    .line 7
    invoke-virtual {v1, p0}, Lu1/j;->h(Ljava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d$b;->o:Lcom/birbit/android/jobqueue/messaging/MessageQueue;

    invoke-interface {p1, v1}, Lcom/birbit/android/jobqueue/messaging/MessageQueue;->post(Lt1/b;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    sget-object v1, Lcom/birbit/android/jobqueue/d$b;->u:Lcom/birbit/android/jobqueue/messaging/MessagePredicate;

    invoke-virtual {v0, v1}, Lt1/f;->cancelMessages(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/d$b;->n:Lt1/f;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/d$b;->t:Lt1/d;

    invoke-virtual {v0, v1}, Lt1/f;->consume(Lt1/d;)V

    return-void
.end method
