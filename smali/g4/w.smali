.class final Lg4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/l;

.field final synthetic o:Lg4/x;


# direct methods
.method constructor <init>(Lg4/x;Lg4/l;)V
    .locals 0

    iput-object p1, p0, Lg4/w;->o:Lg4/x;

    iput-object p2, p0, Lg4/w;->n:Lg4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lg4/w;->o:Lg4/x;

    invoke-static {v0}, Lg4/x;->c(Lg4/x;)Lg4/c;

    move-result-object v0

    iget-object v1, p0, Lg4/w;->n:Lg4/l;

    invoke-interface {v0, v1}, Lg4/c;->a(Lg4/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg4/l;
    :try_end_0
    .catch Lg4/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg4/w;->o:Lg4/x;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    .line 2
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lg4/x;->onFailure(Ljava/lang/Exception;)V

    return-void

    .line 3
    :cond_0
    sget-object v1, Lg4/n;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lg4/w;->o:Lg4/x;

    invoke-virtual {v0, v1, v2}, Lg4/l;->g(Ljava/util/concurrent/Executor;Lg4/h;)Lg4/l;

    iget-object v2, p0, Lg4/w;->o:Lg4/x;

    .line 4
    invoke-virtual {v0, v1, v2}, Lg4/l;->e(Ljava/util/concurrent/Executor;Lg4/g;)Lg4/l;

    iget-object v2, p0, Lg4/w;->o:Lg4/x;

    .line 5
    invoke-virtual {v0, v1, v2}, Lg4/l;->a(Ljava/util/concurrent/Executor;Lg4/e;)Lg4/l;

    return-void

    :catch_0
    move-exception v0

    .line 6
    iget-object v1, p0, Lg4/w;->o:Lg4/x;

    invoke-static {v1}, Lg4/x;->d(Lg4/x;)Lg4/n0;

    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg4/w;->o:Lg4/x;

    invoke-static {v1}, Lg4/x;->d(Lg4/x;)Lg4/n0;

    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void

    .line 10
    :cond_1
    iget-object v1, p0, Lg4/w;->o:Lg4/x;

    invoke-static {v1}, Lg4/x;->d(Lg4/x;)Lg4/n0;

    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void
.end method
