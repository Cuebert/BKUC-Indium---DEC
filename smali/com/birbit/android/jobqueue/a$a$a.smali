.class Lcom/birbit/android/jobqueue/a$a$a;
.super Lt1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/birbit/android/jobqueue/a$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:J

.field final synthetic b:Lcom/birbit/android/jobqueue/a$a;


# direct methods
.method constructor <init>(Lcom/birbit/android/jobqueue/a$a;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    invoke-direct {p0}, Lt1/d;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    iput-wide v0, p0, Lcom/birbit/android/jobqueue/a$a$a;->a:J

    return-void
.end method


# virtual methods
.method public a(Lt1/b;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lt1/b;->a:Lt1/g;

    sget-object v1, Lt1/g;->p:Lt1/g;

    if-ne v0, v1, :cond_0

    .line 2
    check-cast p1, Lu1/b;

    .line 3
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/a$a;->n:Lcom/birbit/android/jobqueue/a;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/a;->a(Lcom/birbit/android/jobqueue/a;Lu1/b;)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/a$a;->n:Lcom/birbit/android/jobqueue/a;

    invoke-static {p1}, Lcom/birbit/android/jobqueue/a;->b(Lcom/birbit/android/jobqueue/a;)Lcom/birbit/android/jobqueue/timer/Timer;

    move-result-object p1

    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/a$a$a;->a:J

    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Lt1/g;->q:Lt1/g;

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/a$a;->n:Lcom/birbit/android/jobqueue/a;

    check-cast p1, Lu1/d;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/a;->c(Lcom/birbit/android/jobqueue/a;Lu1/d;)V

    .line 7
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/a$a;->n:Lcom/birbit/android/jobqueue/a;

    invoke-static {p1}, Lcom/birbit/android/jobqueue/a;->b(Lcom/birbit/android/jobqueue/a;)Lcom/birbit/android/jobqueue/timer/Timer;

    move-result-object p1

    invoke-interface {p1}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/birbit/android/jobqueue/a$a$a;->a:J

    goto :goto_0

    .line 8
    :cond_1
    sget-object v1, Lt1/g;->s:Lt1/g;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 9
    check-cast p1, Lu1/e;

    .line 10
    invoke-virtual {p1}, Lu1/e;->c()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 11
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/a$a;->n:Lcom/birbit/android/jobqueue/a;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/a;->a:Lt1/f;

    invoke-virtual {p1}, Lt1/f;->stop()V

    .line 12
    iget-object p1, p0, Lcom/birbit/android/jobqueue/a$a$a;->b:Lcom/birbit/android/jobqueue/a$a;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/a$a;->n:Lcom/birbit/android/jobqueue/a;

    invoke-static {p1}, Lcom/birbit/android/jobqueue/a;->d(Lcom/birbit/android/jobqueue/a;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 13
    :cond_2
    sget-object v1, Lt1/g;->t:Lt1/g;

    if-ne v0, v1, :cond_3

    .line 14
    check-cast p1, Lu1/h;

    invoke-virtual {p1}, Lu1/h;->c()Lcom/birbit/android/jobqueue/IntCallback;

    move-result-object p1

    invoke-interface {p1, v2}, Lcom/birbit/android/jobqueue/IntCallback;->onResult(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method
