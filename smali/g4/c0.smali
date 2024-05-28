.class final Lg4/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/l;

.field final synthetic o:Lg4/d0;


# direct methods
.method constructor <init>(Lg4/d0;Lg4/l;)V
    .locals 0

    iput-object p1, p0, Lg4/c0;->o:Lg4/d0;

    iput-object p2, p0, Lg4/c0;->n:Lg4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/c0;->o:Lg4/d0;

    invoke-static {v0}, Lg4/d0;->c(Lg4/d0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg4/c0;->o:Lg4/d0;

    invoke-static {v1}, Lg4/d0;->a(Lg4/d0;)Lg4/g;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lg4/d0;->a(Lg4/d0;)Lg4/g;

    move-result-object v1

    iget-object v2, p0, Lg4/c0;->n:Lg4/l;

    invoke-virtual {v2}, Lg4/l;->j()Ljava/lang/Exception;

    move-result-object v2

    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-interface {v1, v2}, Lg4/g;->onFailure(Ljava/lang/Exception;)V

    .line 2
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
