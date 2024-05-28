.class Lt1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lt1/b;

.field final b:Lt1/c;


# direct methods
.method constructor <init>(Lt1/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt1/a;->a:Lt1/b;

    .line 3
    iput-object p1, p0, Lt1/a;->b:Lt1/c;

    return-void
.end method


# virtual methods
.method a(Lt1/b;J)V
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "add delayed message %s at time %s"

    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iput-wide p2, p1, Lt1/b;->c:J

    .line 3
    iget-object v0, p0, Lt1/a;->a:Lt1/b;

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lt1/a;->a:Lt1/b;

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 5
    iget-wide v2, v0, Lt1/b;->c:J

    cmp-long v4, v2, p2

    if-gtz v4, :cond_1

    .line 6
    iget-object v1, v0, Lt1/b;->b:Lt1/b;

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    .line 7
    iget-object p2, p0, Lt1/a;->a:Lt1/b;

    iput-object p2, p1, Lt1/b;->b:Lt1/b;

    .line 8
    iput-object p1, p0, Lt1/a;->a:Lt1/b;

    goto :goto_1

    .line 9
    :cond_2
    iput-object p1, v1, Lt1/b;->b:Lt1/b;

    .line 10
    iput-object v0, p1, Lt1/b;->b:Lt1/b;

    :goto_1
    return-void
.end method

.method b(JLcom/birbit/android/jobqueue/messaging/MessageQueue;)Ljava/lang/Long;
    .locals 7

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "flushing messages at time %s"

    invoke-static {v2, v1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    :goto_0
    iget-object v1, p0, Lt1/a;->a:Lt1/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-wide v4, v1, Lt1/b;->c:J

    cmp-long v6, v4, p1

    if-gtz v6, :cond_0

    .line 3
    iget-object v4, v1, Lt1/b;->b:Lt1/b;

    iput-object v4, p0, Lt1/a;->a:Lt1/b;

    .line 4
    iput-object v2, v1, Lt1/b;->b:Lt1/b;

    .line 5
    invoke-interface {p3, v1}, Lcom/birbit/android/jobqueue/messaging/MessageQueue;->post(Lt1/b;)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    new-array p3, v0, [Ljava/lang/Object;

    .line 6
    iget-wide v0, v1, Lt1/b;->c:J

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, p3, v3

    const-string p1, "returning next ready at %d ns"

    invoke-static {p1, p3}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lt1/a;->a:Lt1/b;

    iget-wide p1, p1, Lt1/b;->c:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public c(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lt1/a;->a:Lt1/b;

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 2
    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/messaging/MessagePredicate;->onMessage(Lt1/b;)Z

    move-result v2

    .line 3
    iget-object v3, v0, Lt1/b;->b:Lt1/b;

    if-eqz v2, :cond_1

    if-nez v1, :cond_0

    .line 4
    iput-object v3, p0, Lt1/a;->a:Lt1/b;

    goto :goto_1

    .line 5
    :cond_0
    iput-object v3, v1, Lt1/b;->b:Lt1/b;

    .line 6
    :goto_1
    iget-object v2, p0, Lt1/a;->b:Lt1/c;

    invoke-virtual {v2, v0}, Lt1/c;->b(Lt1/b;)V

    goto :goto_2

    :cond_1
    move-object v1, v0

    :goto_2
    move-object v0, v3

    goto :goto_0

    :cond_2
    return-void
.end method
