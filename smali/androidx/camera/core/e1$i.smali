.class Landroidx/camera/core/e1$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/i0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/e1$i$c;,
        Landroidx/camera/core/e1$i$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Landroidx/camera/core/e1$h;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroidx/camera/core/e1$h;

.field c:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/core/l1;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field private final e:Landroidx/camera/core/e1$i$b;

.field private final f:I

.field private final g:Landroidx/camera/core/e1$i$c;

.field final h:Ljava/lang/Object;


# direct methods
.method constructor <init>(ILandroidx/camera/core/e1$i$b;Landroidx/camera/core/e1$i$c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/e1$i;->a:Ljava/util/Deque;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    .line 4
    iput-object v0, p0, Landroidx/camera/core/e1$i;->c:Lcom/google/common/util/concurrent/m;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/camera/core/e1$i;->d:I

    .line 6
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/e1$i;->h:Ljava/lang/Object;

    .line 7
    iput p1, p0, Landroidx/camera/core/e1$i;->f:I

    .line 8
    iput-object p2, p0, Landroidx/camera/core/e1$i;->e:Landroidx/camera/core/e1$i$b;

    .line 9
    iput-object p3, p0, Landroidx/camera/core/e1$i;->g:Landroidx/camera/core/e1$i$c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$i;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    const/4 v2, 0x0

    .line 3
    iput-object v2, p0, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    .line 4
    iget-object v3, p0, Landroidx/camera/core/e1$i;->c:Lcom/google/common/util/concurrent/m;

    .line 5
    iput-object v2, p0, Landroidx/camera/core/e1$i;->c:Lcom/google/common/util/concurrent/m;

    .line 6
    new-instance v2, Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/camera/core/e1$i;->a:Ljava/util/Deque;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    iget-object v4, p0, Landroidx/camera/core/e1$i;->a:Ljava/util/Deque;

    invoke-interface {v4}, Ljava/util/Deque;->clear()V

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    if-eqz v3, :cond_0

    .line 9
    invoke-static {p1}, Landroidx/camera/core/e1;->a0(Ljava/lang/Throwable;)I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0, v4, p1}, Landroidx/camera/core/e1$h;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    .line 10
    invoke-interface {v3, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 11
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/e1$h;

    .line 12
    invoke-static {p1}, Landroidx/camera/core/e1;->a0(Ljava/lang/Throwable;)I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p1}, Landroidx/camera/core/e1$h;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b(Landroidx/camera/core/l1;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/camera/core/e1$i;->h:Ljava/lang/Object;

    monitor-enter p1

    .line 2
    :try_start_0
    iget v0, p0, Landroidx/camera/core/e1$i;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/camera/core/e1$i;->d:I

    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/e1$i;->c()V

    .line 4
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method c()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$i;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    iget v1, p0, Landroidx/camera/core/e1$i;->d:I

    iget v2, p0, Landroidx/camera/core/e1$i;->f:I

    if-lt v1, v2, :cond_1

    const-string v1, "ImageCapture"

    const-string v2, "Too many acquire images. Close image to be able to process next."

    .line 5
    invoke-static {v1, v2}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    monitor-exit v0

    return-void

    .line 7
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/e1$i;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/e1$h;

    if-nez v1, :cond_2

    .line 8
    monitor-exit v0

    return-void

    .line 9
    :cond_2
    iput-object v1, p0, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    .line 10
    iget-object v2, p0, Landroidx/camera/core/e1$i;->g:Landroidx/camera/core/e1$i$c;

    if-eqz v2, :cond_3

    .line 11
    invoke-interface {v2, v1}, Landroidx/camera/core/e1$i$c;->a(Landroidx/camera/core/e1$h;)V

    .line 12
    :cond_3
    iget-object v2, p0, Landroidx/camera/core/e1$i;->e:Landroidx/camera/core/e1$i$b;

    invoke-interface {v2, v1}, Landroidx/camera/core/e1$i$b;->a(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/core/e1$i;->c:Lcom/google/common/util/concurrent/m;

    .line 13
    new-instance v3, Landroidx/camera/core/e1$i$a;

    invoke-direct {v3, p0, v1}, Landroidx/camera/core/e1$i$a;-><init>(Landroidx/camera/core/e1$i;Landroidx/camera/core/e1$h;)V

    .line 14
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 15
    invoke-static {v2, v3, v1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 16
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
