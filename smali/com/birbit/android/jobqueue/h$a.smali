.class Lcom/birbit/android/jobqueue/h$a;
.super Lt1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/birbit/android/jobqueue/h;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/birbit/android/jobqueue/h;


# direct methods
.method constructor <init>(Lcom/birbit/android/jobqueue/h;)V
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-direct {p0}, Lt1/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt1/b;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/birbit/android/jobqueue/h$b;->a:[I

    iget-object v1, p1, Lt1/b;->a:Lt1/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    check-cast p1, Lu1/k;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/h;->g(Lcom/birbit/android/jobqueue/h;Lu1/k;)V

    goto :goto_0

    .line 3
    :pswitch_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    check-cast p1, Lu1/e;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/h;->f(Lcom/birbit/android/jobqueue/h;Lu1/e;)V

    goto :goto_0

    .line 4
    :pswitch_2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    check-cast p1, Lu1/h;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/h;->e(Lcom/birbit/android/jobqueue/h;Lu1/h;)V

    goto :goto_0

    .line 5
    :pswitch_3
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    check-cast p1, Lu1/c;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/h;->d(Lcom/birbit/android/jobqueue/h;Lu1/c;)V

    goto :goto_0

    .line 6
    :pswitch_4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/d;->e()V

    goto :goto_0

    .line 7
    :pswitch_5
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    check-cast p1, Lu1/j;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/h;->c(Lcom/birbit/android/jobqueue/h;Lu1/j;)V

    goto :goto_0

    .line 8
    :pswitch_6
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/h;->v:Lcom/birbit/android/jobqueue/d;

    check-cast p1, Lu1/g;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/d;->f(Lu1/g;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-static {p1}, Lcom/birbit/android/jobqueue/h;->b(Lcom/birbit/android/jobqueue/h;)V

    goto :goto_0

    .line 10
    :pswitch_7
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    check-cast p1, Lu1/a;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/h;->a(Lcom/birbit/android/jobqueue/h;Lu1/a;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    .line 1
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-static {v2}, Lcom/birbit/android/jobqueue/h;->h(Lcom/birbit/android/jobqueue/h;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "joq idle. running:? %s"

    invoke-static {v2, v1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-static {v1}, Lcom/birbit/android/jobqueue/h;->h(Lcom/birbit/android/jobqueue/h;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-virtual {v1, v0}, Lcom/birbit/android/jobqueue/h;->w(Z)Ljava/lang/Long;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v3

    const-string v2, "Job queue idle. next job at: %s"

    .line 4
    invoke-static {v2, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-static {v0}, Lcom/birbit/android/jobqueue/h;->i(Lcom/birbit/android/jobqueue/h;)Lt1/c;

    move-result-object v0

    const-class v2, Lu1/f;

    invoke-virtual {v0, v2}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/f;

    .line 6
    iget-object v2, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    iget-object v2, v2, Lcom/birbit/android/jobqueue/h;->C:Lt1/e;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Lt1/e;->postAt(Lt1/b;J)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    iget-object v1, v0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    if-eqz v1, :cond_2

    .line 8
    invoke-static {v0}, Lcom/birbit/android/jobqueue/h;->j(Lcom/birbit/android/jobqueue/h;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/h;->q:Lcom/birbit/android/jobqueue/JobQueue;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/JobQueue;->count()I

    move-result v0

    if-nez v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    invoke-static {v0, v3}, Lcom/birbit/android/jobqueue/h;->k(Lcom/birbit/android/jobqueue/h;Z)Z

    .line 10
    iget-object v0, p0, Lcom/birbit/android/jobqueue/h$a;->a:Lcom/birbit/android/jobqueue/h;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/h;->D:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->a()V

    :cond_2
    :goto_0
    return-void
.end method
