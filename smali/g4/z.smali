.class final Lg4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/i0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Lg4/e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lg4/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg4/z;->b:Ljava/lang/Object;

    iput-object p1, p0, Lg4/z;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg4/z;->c:Lg4/e;

    return-void
.end method

.method static bridge synthetic a(Lg4/z;)Lg4/e;
    .locals 0

    iget-object p0, p0, Lg4/z;->c:Lg4/e;

    return-object p0
.end method

.method static bridge synthetic c(Lg4/z;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lg4/z;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final b(Lg4/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lg4/l;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lg4/z;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lg4/z;->c:Lg4/e;

    if-nez v0, :cond_0

    .line 2
    monitor-exit p1

    return-void

    .line 3
    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg4/z;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lg4/y;

    invoke-direct {v0, p0}, Lg4/y;-><init>(Lg4/z;)V

    .line 4
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    .line 5
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method
