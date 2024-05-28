.class Lx/c$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/c$c$a;->a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lx/c$c$a;


# direct methods
.method constructor <init>(Lx/c$c$a;)V
    .locals 0

    iput-object p1, p0, Lx/c$c$a$a;->n:Lx/c$c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx/c$c$a$a;->n:Lx/c$c$a;

    iget-object v0, v0, Lx/c$c$a;->c:Lx/c$c;

    iget-object v0, v0, Lx/c$c;->n:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lx/c$c$a$a;->n:Lx/c$c$a;

    iget-object v1, v0, Lx/c$c$a;->a:Landroid/os/Handler;

    iget-object v0, v0, Lx/c$c$a;->c:Lx/c$c;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
