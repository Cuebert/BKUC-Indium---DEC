.class public abstract Lkb/l0;
.super Lkb/j0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/j0;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract v0()Ljava/lang/Thread;
.end method

.method protected w0(JLkb/k0$a;)V
    .locals 1

    sget-object v0, Lkb/a0;->v:Lkb/a0;

    invoke-virtual {v0, p1, p2, p3}, Lkb/k0;->I0(JLkb/k0$a;)V

    return-void
.end method

.method protected final x0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkb/l0;->v0()Ljava/lang/Thread;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    .line 3
    invoke-static {}, Lkb/c;->a()Lkb/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
