.class final Lg4/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/i0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Lg4/g;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lg4/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg4/d0;->b:Ljava/lang/Object;

    iput-object p1, p0, Lg4/d0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg4/d0;->c:Lg4/g;

    return-void
.end method

.method static bridge synthetic a(Lg4/d0;)Lg4/g;
    .locals 0

    iget-object p0, p0, Lg4/d0;->c:Lg4/g;

    return-object p0
.end method

.method static bridge synthetic c(Lg4/d0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lg4/d0;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final b(Lg4/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg4/l;->o()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lg4/l;->m()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lg4/d0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg4/d0;->c:Lg4/g;

    if-nez v1, :cond_0

    .line 2
    monitor-exit v0

    return-void

    .line 3
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lg4/d0;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lg4/c0;

    invoke-direct {v1, p0, p1}, Lg4/c0;-><init>(Lg4/d0;Lg4/l;)V

    .line 4
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method
