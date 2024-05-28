.class final Lg4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/z;


# direct methods
.method constructor <init>(Lg4/z;)V
    .locals 0

    iput-object p1, p0, Lg4/y;->n:Lg4/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/y;->n:Lg4/z;

    invoke-static {v0}, Lg4/z;->c(Lg4/z;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg4/y;->n:Lg4/z;

    invoke-static {v1}, Lg4/z;->a(Lg4/z;)Lg4/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lg4/z;->a(Lg4/z;)Lg4/e;

    move-result-object v1

    invoke-interface {v1}, Lg4/e;->a()V

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
