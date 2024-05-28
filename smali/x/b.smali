.class final Lx/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field private static volatile n:Lx/b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget-object v0, Lx/b;->n:Lx/b;

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lx/b;->n:Lx/b;

    return-object v0

    .line 3
    :cond_0
    const-class v0, Lx/b;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lx/b;->n:Lx/b;

    if-nez v1, :cond_1

    .line 5
    new-instance v1, Lx/b;

    invoke-direct {v1}, Lx/b;-><init>()V

    sput-object v1, Lx/b;->n:Lx/b;

    .line 6
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    sget-object v0, Lx/b;->n:Lx/b;

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
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
