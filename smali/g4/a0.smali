.class final Lg4/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/l;

.field final synthetic o:Lg4/b0;


# direct methods
.method constructor <init>(Lg4/b0;Lg4/l;)V
    .locals 0

    iput-object p1, p0, Lg4/a0;->o:Lg4/b0;

    iput-object p2, p0, Lg4/a0;->n:Lg4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/a0;->o:Lg4/b0;

    invoke-static {v0}, Lg4/b0;->c(Lg4/b0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg4/a0;->o:Lg4/b0;

    invoke-static {v1}, Lg4/b0;->a(Lg4/b0;)Lg4/f;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lg4/b0;->a(Lg4/b0;)Lg4/f;

    move-result-object v1

    iget-object v2, p0, Lg4/a0;->n:Lg4/l;

    invoke-interface {v1, v2}, Lg4/f;->a(Lg4/l;)V

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
