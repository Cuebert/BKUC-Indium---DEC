.class final Lx/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field private static volatile o:Ljava/util/concurrent/Executor;


# instance fields
.field private final n:Ljava/util/concurrent/ExecutorService;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lx/e$a;

    invoke-direct {v0, p0}, Lx/e$a;-><init>(Lx/e;)V

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lx/e;->n:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static a()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget-object v0, Lx/e;->o:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lx/e;->o:Ljava/util/concurrent/Executor;

    return-object v0

    .line 3
    :cond_0
    const-class v0, Lx/e;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lx/e;->o:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_1

    .line 5
    new-instance v1, Lx/e;

    invoke-direct {v1}, Lx/e;-><init>()V

    sput-object v1, Lx/e;->o:Ljava/util/concurrent/Executor;

    .line 6
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    sget-object v0, Lx/e;->o:Ljava/util/concurrent/Executor;

    return-object v0

    :catchall_0
    move-exception v1

    .line 8
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lx/e;->n:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
