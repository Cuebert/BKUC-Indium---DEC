.class Lbacktraceio/library/BacktraceDatabase$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/events/OnServerResponseEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/BacktraceDatabase$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lbacktraceio/library/BacktraceDatabase$a;


# direct methods
.method constructor <init>(Lbacktraceio/library/BacktraceDatabase$a;Lbacktraceio/library/models/database/BacktraceDatabaseRecord;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->c:Lbacktraceio/library/BacktraceDatabase$a;

    iput-object p2, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->a:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    iput-object p3, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lbacktraceio/library/models/BacktraceResult;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lbacktraceio/library/models/BacktraceResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    sget-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->c:Lbacktraceio/library/BacktraceDatabase$a;

    iget-object p1, p1, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {p1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Timer - deleting record"

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->c:Lbacktraceio/library/BacktraceDatabase$a;

    iget-object p1, p1, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    iget-object v0, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->a:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    invoke-virtual {p1, v0}, Lbacktraceio/library/BacktraceDatabase;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->c:Lbacktraceio/library/BacktraceDatabase$a;

    iget-object p1, p1, Lbacktraceio/library/BacktraceDatabase$a;->n:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {p1}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Timer - closing record"

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->a:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    invoke-virtual {p1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->close()Z

    .line 6
    :goto_0
    iget-object p1, p0, Lbacktraceio/library/BacktraceDatabase$a$a;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
