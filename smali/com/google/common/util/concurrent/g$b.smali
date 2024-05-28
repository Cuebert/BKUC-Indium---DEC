.class abstract Lcom/google/common/util/concurrent/g$b;
.super Lcom/google/common/util/concurrent/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/util/concurrent/l<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final p:Ljava/util/concurrent/Executor;

.field final synthetic q:Lcom/google/common/util/concurrent/g;


# direct methods
.method constructor <init>(Lcom/google/common/util/concurrent/g;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    invoke-direct {p0}, Lcom/google/common/util/concurrent/l;-><init>()V

    .line 2
    invoke-static {p2}, Le5/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/google/common/util/concurrent/g$b;->p:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/common/util/concurrent/g;->Z(Lcom/google/common/util/concurrent/g;Lcom/google/common/util/concurrent/g$b;)Lcom/google/common/util/concurrent/g$b;

    .line 2
    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/a;->C(Ljava/lang/Throwable;)Z

    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/common/util/concurrent/a$j;->cancel(Z)Z

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/a;->C(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method final b(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/common/util/concurrent/g;->Z(Lcom/google/common/util/concurrent/g;Lcom/google/common/util/concurrent/g$b;)Lcom/google/common/util/concurrent/g$b;

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/g$b;->i(Ljava/lang/Object;)V

    return-void
.end method

.method final d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    invoke-virtual {v0}, Lcom/google/common/util/concurrent/a$j;->isDone()Z

    move-result v0

    return v0
.end method

.method final h()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/common/util/concurrent/g$b;->p:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lcom/google/common/util/concurrent/g$b;->q:Lcom/google/common/util/concurrent/g;

    invoke-virtual {v1, v0}, Lcom/google/common/util/concurrent/a;->C(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method abstract i(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
