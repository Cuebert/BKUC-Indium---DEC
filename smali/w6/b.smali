.class public abstract Lw6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw6/b$c;
    }
.end annotation


# instance fields
.field a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lw6/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lw6/b$c;

.field private c:Landroid/os/Handler;

.field private d:Lw6/a;

.field private e:Ljava/lang/Runnable;


# direct methods
.method protected constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lw6/b$c;->n:Lw6/b$c;

    iput-object v0, p0, Lw6/b;->b:Lw6/b$c;

    .line 3
    new-instance v0, Lw6/b$a;

    invoke-direct {v0, p0}, Lw6/b$a;-><init>(Lw6/b;)V

    iput-object v0, p0, Lw6/b;->d:Lw6/a;

    .line 4
    new-instance v0, Lw6/b$b;

    invoke-direct {v0, p0}, Lw6/b$b;-><init>(Lw6/b;)V

    iput-object v0, p0, Lw6/b;->e:Ljava/lang/Runnable;

    .line 5
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lw6/b;->a:Ljava/util/Queue;

    .line 6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    .line 7
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 8
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lw6/b;->c:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lw6/b;Lw6/b$c;)Lw6/b$c;
    .locals 0

    iput-object p1, p0, Lw6/b;->b:Lw6/b$c;

    return-object p1
.end method


# virtual methods
.method public b(Lw6/c;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lw6/b;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "RbxBlockingQueue"

    const-string v0, "Queue full! Cannot add more reports."

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :goto_0
    invoke-virtual {p0}, Lw6/b;->c()V

    return-void
.end method

.method protected c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw6/b;->b:Lw6/b$c;

    sget-object v1, Lw6/b$c;->n:Lw6/b$c;

    if-ne v0, v1, :cond_2

    .line 2
    sget-object v0, Lw6/b$c;->o:Lw6/b$c;

    iput-object v0, p0, Lw6/b;->b:Lw6/b$c;

    .line 3
    iget-object v0, p0, Lw6/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw6/c;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lw6/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lw6/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw6/c;

    if-eqz v0, :cond_0

    .line 6
    iget-object v1, p0, Lw6/b;->d:Lw6/a;

    invoke-interface {v0, v1}, Lw6/c;->b(Lw6/a;)V

    goto :goto_0

    .line 7
    :cond_0
    iput-object v1, p0, Lw6/b;->b:Lw6/b$c;

    goto :goto_0

    .line 8
    :cond_1
    iput-object v1, p0, Lw6/b;->b:Lw6/b$c;

    .line 9
    iget-object v0, p0, Lw6/b;->c:Landroid/os/Handler;

    iget-object v1, p0, Lw6/b;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    iget-object v0, p0, Lw6/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 11
    iget-object v0, p0, Lw6/b;->c:Landroid/os/Handler;

    iget-object v1, p0, Lw6/b;->e:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_0
    return-void
.end method
