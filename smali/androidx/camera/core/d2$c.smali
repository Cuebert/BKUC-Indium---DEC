.class Landroidx/camera/core/d2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/util/List<",
        "Landroidx/camera/core/l1;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/d2;


# direct methods
.method constructor <init>(Landroidx/camera/core/d2;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/d2$f;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/d2$c;->c(Landroidx/camera/core/d2$f;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic c(Landroidx/camera/core/d2$f;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 2
    invoke-interface {p0, v0, p1}, Landroidx/camera/core/d2$f;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/l1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    iget-object p1, p1, Landroidx/camera/core/d2;->a:Ljava/lang/Object;

    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    iget-boolean v1, v0, Landroidx/camera/core/d2;->e:Z

    if-eqz v1, :cond_0

    .line 3
    monitor-exit p1

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Landroidx/camera/core/d2;->f:Z

    .line 5
    iget-object v1, v0, Landroidx/camera/core/d2;->q:Landroidx/camera/core/n2;

    .line 6
    iget-object v2, v0, Landroidx/camera/core/d2;->t:Landroidx/camera/core/d2$f;

    .line 7
    iget-object v3, v0, Landroidx/camera/core/d2;->u:Ljava/util/concurrent/Executor;

    .line 8
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    :try_start_1
    iget-object p1, v0, Landroidx/camera/core/d2;->n:Lw/l0;

    invoke-interface {p1, v1}, Lw/l0;->a(Lw/g1;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    iget-object v0, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    iget-object v0, v0, Landroidx/camera/core/d2;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_2
    iget-object v1, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    iget-object v1, v1, Landroidx/camera/core/d2;->q:Landroidx/camera/core/n2;

    invoke-virtual {v1}, Landroidx/camera/core/n2;->e()V

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    .line 12
    new-instance v1, Landroidx/camera/core/f2;

    invoke-direct {v1, v2, p1}, Landroidx/camera/core/f2;-><init>(Landroidx/camera/core/d2$f;Ljava/lang/Exception;)V

    invoke-interface {v3, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 14
    :goto_0
    iget-object p1, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    iget-object p1, p1, Landroidx/camera/core/d2;->a:Ljava/lang/Object;

    monitor-enter p1

    .line 15
    :try_start_3
    iget-object v0, p0, Landroidx/camera/core/d2$c;->a:Landroidx/camera/core/d2;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/camera/core/d2;->f:Z

    .line 16
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 17
    invoke-virtual {v0}, Landroidx/camera/core/d2;->m()V

    return-void

    :catchall_0
    move-exception v0

    .line 18
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    .line 19
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :catchall_2
    move-exception v0

    .line 20
    :try_start_6
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroidx/camera/core/d2$c;->d(Ljava/util/List;)V

    return-void
.end method
