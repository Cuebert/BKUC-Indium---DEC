.class final Lg4/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/l;

.field final synthetic o:Lg4/h0;


# direct methods
.method constructor <init>(Lg4/h0;Lg4/l;)V
    .locals 0

    iput-object p1, p0, Lg4/g0;->o:Lg4/h0;

    iput-object p2, p0, Lg4/g0;->n:Lg4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lg4/g0;->o:Lg4/h0;

    invoke-static {v0}, Lg4/h0;->c(Lg4/h0;)Lg4/k;

    move-result-object v0

    iget-object v1, p0, Lg4/g0;->n:Lg4/l;

    invoke-virtual {v1}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lg4/k;->a(Ljava/lang/Object;)Lg4/l;

    move-result-object v0
    :try_end_0
    .catch Lg4/j; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg4/g0;->o:Lg4/h0;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    .line 2
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lg4/h0;->onFailure(Ljava/lang/Exception;)V

    return-void

    .line 3
    :cond_0
    sget-object v1, Lg4/n;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lg4/g0;->o:Lg4/h0;

    invoke-virtual {v0, v1, v2}, Lg4/l;->g(Ljava/util/concurrent/Executor;Lg4/h;)Lg4/l;

    iget-object v2, p0, Lg4/g0;->o:Lg4/h0;

    .line 4
    invoke-virtual {v0, v1, v2}, Lg4/l;->e(Ljava/util/concurrent/Executor;Lg4/g;)Lg4/l;

    iget-object v2, p0, Lg4/g0;->o:Lg4/h0;

    .line 5
    invoke-virtual {v0, v1, v2}, Lg4/l;->a(Ljava/util/concurrent/Executor;Lg4/e;)Lg4/l;

    return-void

    :catch_0
    move-exception v0

    .line 6
    iget-object v1, p0, Lg4/g0;->o:Lg4/h0;

    .line 7
    invoke-virtual {v1, v0}, Lg4/h0;->onFailure(Ljava/lang/Exception;)V

    return-void

    .line 8
    :catch_1
    iget-object v0, p0, Lg4/g0;->o:Lg4/h0;

    .line 9
    invoke-virtual {v0}, Lg4/h0;->a()V

    return-void

    :catch_2
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg4/g0;->o:Lg4/h0;

    .line 11
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lg4/h0;->onFailure(Ljava/lang/Exception;)V

    return-void

    .line 12
    :cond_1
    iget-object v1, p0, Lg4/g0;->o:Lg4/h0;

    .line 13
    invoke-virtual {v1, v0}, Lg4/h0;->onFailure(Ljava/lang/Exception;)V

    return-void
.end method
