.class final Lg6/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field final synthetic n:Lg6/o;


# direct methods
.method synthetic constructor <init>(Lg6/o;Lg6/d0;)V
    .locals 0

    iput-object p1, p0, Lg6/f0;->n:Lg6/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lg6/o;->b(Lg6/o;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Thread;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-static {p1}, Lz2/j;->m(Z)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lg6/f0;->n:Lg6/o;

    invoke-static {v0}, Lg6/o;->b(Lg6/o;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lg6/f0;->n:Lg6/o;

    .line 2
    invoke-static {v0}, Lg6/o;->c(Lg6/o;)V

    return-void
.end method
