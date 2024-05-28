.class Landroidx/camera/core/e1$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/e1$i;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Landroidx/camera/core/l1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/e1$h;

.field final synthetic b:Landroidx/camera/core/e1$i;


# direct methods
.method constructor <init>(Landroidx/camera/core/e1$i;Landroidx/camera/core/e1$h;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    iput-object p2, p0, Landroidx/camera/core/e1$i$a;->a:Landroidx/camera/core/e1$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    iget-object v0, v0, Landroidx/camera/core/e1$i;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/e1$i$a;->a:Landroidx/camera/core/e1$h;

    invoke-static {p1}, Landroidx/camera/core/e1;->a0(Ljava/lang/Throwable;)I

    move-result v2

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-string v3, "Unknown error"

    .line 5
    :goto_0
    invoke-virtual {v1, v2, v3, p1}, Landroidx/camera/core/e1$h;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    :goto_1
    iget-object p1, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    const/4 v1, 0x0

    iput-object v1, p1, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    .line 7
    iput-object v1, p1, Landroidx/camera/core/e1$i;->c:Lcom/google/common/util/concurrent/m;

    .line 8
    invoke-virtual {p1}, Landroidx/camera/core/e1$i;->c()V

    .line 9
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Landroidx/camera/core/l1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    iget-object v0, v0, Landroidx/camera/core/e1$i;->h:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v1, Landroidx/camera/core/o2;

    invoke-direct {v1, p1}, Landroidx/camera/core/o2;-><init>(Landroidx/camera/core/l1;)V

    .line 4
    iget-object p1, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    invoke-virtual {v1, p1}, Landroidx/camera/core/i0;->b(Landroidx/camera/core/i0$a;)V

    .line 5
    iget-object p1, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    iget v2, p1, Landroidx/camera/core/e1$i;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p1, Landroidx/camera/core/e1$i;->d:I

    .line 6
    iget-object p1, p0, Landroidx/camera/core/e1$i$a;->a:Landroidx/camera/core/e1$h;

    invoke-virtual {p1, v1}, Landroidx/camera/core/e1$h;->c(Landroidx/camera/core/l1;)V

    .line 7
    iget-object p1, p0, Landroidx/camera/core/e1$i$a;->b:Landroidx/camera/core/e1$i;

    const/4 v1, 0x0

    iput-object v1, p1, Landroidx/camera/core/e1$i;->b:Landroidx/camera/core/e1$h;

    .line 8
    iput-object v1, p1, Landroidx/camera/core/e1$i;->c:Lcom/google/common/util/concurrent/m;

    .line 9
    invoke-virtual {p1}, Landroidx/camera/core/e1$i;->c()V

    .line 10
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/core/l1;

    invoke-virtual {p0, p1}, Landroidx/camera/core/e1$i$a;->b(Landroidx/camera/core/l1;)V

    return-void
.end method
