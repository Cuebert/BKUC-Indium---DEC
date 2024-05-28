.class Lbacktraceio/library/BacktraceDatabase$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/BacktraceDatabase;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lbacktraceio/library/BacktraceDatabase;


# direct methods
.method constructor <init>(Lbacktraceio/library/BacktraceDatabase;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timer - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->b(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/DatabaseContext;

    move-result-object v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timer - database context is null: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->b(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/DatabaseContext;

    move-result-object v1

    invoke-interface {v1}, Lbacktraceio/library/interfaces/DatabaseContext;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timer - database is empty (no records): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 7
    :cond_1
    invoke-static {}, Lbacktraceio/library/BacktraceDatabase;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timer - another timer works now: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 9
    :cond_2
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timer - continue working: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Lbacktraceio/library/BacktraceDatabase;->d(Z)Z

    .line 11
    invoke-static {}, Lbacktraceio/library/BacktraceDatabase;->e()Ljava/util/Timer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 12
    invoke-static {}, Lbacktraceio/library/BacktraceDatabase;->e()Ljava/util/Timer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Timer;->purge()I

    const/4 v1, 0x0

    .line 13
    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->f(Ljava/util/Timer;)Ljava/util/Timer;

    .line 14
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->b(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/DatabaseContext;

    move-result-object v1

    invoke-interface {v1}, Lbacktraceio/library/interfaces/DatabaseContext;->first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_6

    .line 15
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v2, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 16
    iget-object v3, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v3}, Lbacktraceio/library/BacktraceDatabase;->g(Lbacktraceio/library/BacktraceDatabase;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v3}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getBacktraceData(Landroid/content/Context;)Lbacktraceio/library/models/BacktraceData;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 17
    iget-object v4, v3, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    if-nez v4, :cond_3

    goto :goto_2

    .line 18
    :cond_3
    iget-object v4, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v4}, Lbacktraceio/library/BacktraceDatabase;->h(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/Api;

    move-result-object v4

    new-instance v5, Lbacktraceio/library/BacktraceDatabase$a$a;

    invoke-direct {v5, p0, v1, v2}, Lbacktraceio/library/BacktraceDatabase$a$a;-><init>(Lbacktraceio/library/BacktraceDatabase$a;Lbacktraceio/library/models/database/BacktraceDatabaseRecord;Ljava/util/concurrent/CountDownLatch;)V

    invoke-interface {v4, v3, v5}, Lbacktraceio/library/interfaces/Api;->send(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    .line 19
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 20
    iget-object v3, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v3}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Error during waiting for result in Timer"

    invoke-static {v3, v4, v2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 21
    :goto_1
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->valid()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-boolean v1, v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    if-nez v1, :cond_5

    .line 22
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v0}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Timer - record is valid and unlocked"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    .line 23
    :cond_4
    :goto_2
    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v2}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Timer - backtrace data or report is null - deleting record"

    invoke-static {v2, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    iget-object v2, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-virtual {v2, v1}, Lbacktraceio/library/BacktraceDatabase;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V

    .line 25
    :cond_5
    iget-object v1, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v1}, Lbacktraceio/library/BacktraceDatabase;->b(Lbacktraceio/library/BacktraceDatabase;)Lbacktraceio/library/interfaces/DatabaseContext;

    move-result-object v1

    invoke-interface {v1}, Lbacktraceio/library/interfaces/DatabaseContext;->first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v1

    goto :goto_0

    .line 26
    :cond_6
    :goto_3
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v0}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Setup new timer"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 27
    invoke-static {v0}, Lbacktraceio/library/BacktraceDatabase;->d(Z)Z

    .line 28
    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v0}, Lbacktraceio/library/BacktraceDatabase;->i(Lbacktraceio/library/BacktraceDatabase;)V

    return-void
.end method
