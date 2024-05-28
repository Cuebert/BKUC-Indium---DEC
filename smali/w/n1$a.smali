.class final Lw/n1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/s<",
        "Lw/n1$b<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final b:Lw/s1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/s1$a<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final c:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lw/s1$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lw/s1$a<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lw/n1$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    iput-object p1, p0, Lw/n1$a;->c:Ljava/util/concurrent/Executor;

    .line 4
    iput-object p2, p0, Lw/n1$a;->b:Lw/s1$a;

    return-void
.end method

.method public static synthetic b(Lw/n1$a;Lw/n1$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lw/n1$a;->d(Lw/n1$b;)V

    return-void
.end method

.method private synthetic d(Lw/n1$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/n1$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lw/n1$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lw/n1$a;->b:Lw/s1$a;

    invoke-virtual {p1}, Lw/n1$b;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lw/s1$a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1}, Lw/n1$b;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lw/n1$a;->b:Lw/s1$a;

    invoke-virtual {p1}, Lw/n1$b;->c()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {v0, p1}, Lw/s1$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw/n1$b;

    invoke-virtual {p0, p1}, Lw/n1$a;->e(Lw/n1$b;)V

    return-void
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lw/n1$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public e(Lw/n1$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/n1$b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lw/n1$a;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lw/m1;

    invoke-direct {v1, p0, p1}, Lw/m1;-><init>(Lw/n1$a;Lw/n1$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
