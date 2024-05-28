.class Lcom/birbit/android/jobqueue/d$b$b;
.super Lt1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/birbit/android/jobqueue/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/birbit/android/jobqueue/d$b;


# direct methods
.method constructor <init>(Lcom/birbit/android/jobqueue/d$b;)V
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    invoke-direct {p0}, Lt1/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt1/b;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/birbit/android/jobqueue/d$a;->a:[I

    iget-object v1, p1, Lt1/b;->a:Lt1/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    check-cast p1, Lu1/e;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/d$b;->c(Lcom/birbit/android/jobqueue/d$b;Lu1/e;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    check-cast p1, Lu1/i;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/d$b;->a(Lcom/birbit/android/jobqueue/d$b;Lu1/i;)V

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    iget-object v0, p1, Lcom/birbit/android/jobqueue/d$b;->q:Lcom/birbit/android/jobqueue/timer/Timer;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/timer/Timer;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/birbit/android/jobqueue/d$b;->s:J

    .line 5
    iget-object p1, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    invoke-static {p1}, Lcom/birbit/android/jobqueue/d$b;->b(Lcom/birbit/android/jobqueue/d$b;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "consumer manager on idle"

    .line 1
    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/d$b;->p:Lt1/c;

    const-class v1, Lu1/g;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/g;

    .line 3
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    invoke-virtual {v0, v1}, Lu1/g;->f(Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    iget-wide v1, v1, Lcom/birbit/android/jobqueue/d$b;->s:J

    invoke-virtual {v0, v1, v2}, Lu1/g;->e(J)V

    .line 5
    iget-object v1, p0, Lcom/birbit/android/jobqueue/d$b$b;->a:Lcom/birbit/android/jobqueue/d$b;

    iget-object v1, v1, Lcom/birbit/android/jobqueue/d$b;->o:Lcom/birbit/android/jobqueue/messaging/MessageQueue;

    invoke-interface {v1, v0}, Lcom/birbit/android/jobqueue/messaging/MessageQueue;->post(Lt1/b;)V

    return-void
.end method
