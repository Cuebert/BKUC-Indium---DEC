.class final Lg4/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/n0;

.field final synthetic o:Ljava/util/concurrent/Callable;


# direct methods
.method constructor <init>(Lg4/n0;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lg4/o0;->n:Lg4/n0;

    iput-object p2, p0, Lg4/o0;->o:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lg4/o0;->n:Lg4/n0;

    iget-object v1, p0, Lg4/o0;->o:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg4/n0;->s(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lg4/o0;->n:Lg4/n0;

    new-instance v2, Ljava/lang/RuntimeException;

    .line 3
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception v0

    .line 4
    iget-object v1, p0, Lg4/o0;->n:Lg4/n0;

    .line 5
    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void
.end method
