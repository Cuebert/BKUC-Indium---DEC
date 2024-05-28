.class public final Lmb/g;
.super Lkb/e0;
.source "SourceFile"

# interfaces
.implements Lxa/d;
.implements Lva/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkb/e0<",
        "TT;>;",
        "Lxa/d;",
        "Lva/c<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _reusableCancellableContinuation:Ljava/lang/Object;

.field public final q:Lkb/v;

.field public final r:Lva/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lva/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public s:Ljava/lang/Object;

.field public final t:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lmb/g;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_reusableCancellableContinuation"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lkb/v;Lva/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/v;",
            "Lva/c<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, v0}, Lkb/e0;-><init>(I)V

    .line 2
    iput-object p1, p0, Lmb/g;->q:Lkb/v;

    .line 3
    iput-object p2, p0, Lmb/g;->r:Lva/c;

    .line 4
    invoke-static {}, Lmb/h;->a()Lmb/a0;

    move-result-object p1

    iput-object p1, p0, Lmb/g;->s:Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lmb/g;->getContext()Lva/e;

    move-result-object p1

    invoke-static {p1}, Lmb/e0;->b(Lva/e;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lmb/g;->t:Ljava/lang/Object;

    return-void
.end method

.method private final k()Lkb/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkb/i<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lkb/i;

    if-eqz v1, :cond_0

    check-cast v0, Lkb/i;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()Lxa/d;
    .locals 2

    iget-object v0, p0, Lmb/g;->r:Lva/c;

    instance-of v1, v0, Lxa/d;

    if-eqz v1, :cond_0

    check-cast v0, Lxa/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lkb/q;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lkb/q;

    iget-object p1, p1, Lkb/q;->b:Ldb/l;

    invoke-interface {p1, p2}, Ldb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c()Lva/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lva/c<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lmb/g;->r:Lva/c;

    invoke-interface {v0}, Lva/c;->getContext()Lva/e;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2
    invoke-static {p1, v1, v2, v1}, Lkb/t;->d(Ljava/lang/Object;Ldb/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 3
    iget-object v4, p0, Lmb/g;->q:Lkb/v;

    invoke-virtual {v4, v0}, Lkb/v;->k0(Lva/e;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 4
    iput-object v3, p0, Lmb/g;->s:Ljava/lang/Object;

    .line 5
    iput v5, p0, Lkb/e0;->p:I

    .line 6
    iget-object p1, p0, Lmb/g;->q:Lkb/v;

    invoke-virtual {p1, v0, p0}, Lkb/v;->j0(Lva/e;Ljava/lang/Runnable;)V

    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, Lkb/j1;->a:Lkb/j1;

    invoke-virtual {v0}, Lkb/j1;->a()Lkb/j0;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lkb/j0;->s0()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 9
    iput-object v3, p0, Lmb/g;->s:Ljava/lang/Object;

    .line 10
    iput v5, p0, Lkb/e0;->p:I

    .line 11
    invoke-virtual {v0, p0}, Lkb/j0;->o0(Lkb/e0;)V

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v0, v2}, Lkb/j0;->q0(Z)V

    .line 13
    :try_start_0
    invoke-virtual {p0}, Lmb/g;->getContext()Lva/e;

    move-result-object v3

    iget-object v4, p0, Lmb/g;->t:Ljava/lang/Object;

    .line 14
    invoke-static {v3, v4}, Lmb/e0;->c(Lva/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object v5, p0, Lmb/g;->r:Lva/c;

    invoke-interface {v5, p1}, Lva/c;->d(Ljava/lang/Object;)V

    .line 16
    sget-object p1, Lta/l;->a:Lta/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    :try_start_2
    invoke-static {v3, v4}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    .line 18
    :cond_2
    invoke-virtual {v0}, Lkb/j0;->u0()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 19
    invoke-static {v3, v4}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    .line 20
    :try_start_3
    invoke-virtual {p0, p1, v1}, Lkb/e0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 21
    :goto_0
    invoke-virtual {v0, v2}, Lkb/j0;->m0(Z)V

    :goto_1
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0, v2}, Lkb/j0;->m0(Z)V

    throw p1
.end method

.method public getContext()Lva/e;
    .locals 1

    iget-object v0, p0, Lmb/g;->r:Lva/c;

    invoke-interface {v0}, Lva/c;->getContext()Lva/e;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lmb/g;->s:Ljava/lang/Object;

    .line 2
    invoke-static {}, Lmb/h;->a()Lmb/a0;

    move-result-object v1

    iput-object v1, p0, Lmb/g;->s:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()V
    .locals 3

    sget-object v0, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lmb/h;->b:Lmb/a0;

    if-eq v1, v2, :cond_0

    return-void
.end method

.method public final l()Z
    .locals 1

    sget-object v0, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m(Ljava/lang/Throwable;)Z
    .locals 5

    sget-object v0, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1
    sget-object v2, Lmb/h;->b:Lmb/a0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 2
    sget-object v1, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v2, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v4

    .line 3
    :cond_1
    instance-of v2, v1, Ljava/lang/Throwable;

    if-eqz v2, :cond_2

    return v4

    .line 4
    :cond_2
    sget-object v2, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-static {v2, p0, v1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final n()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lmb/g;->j()V

    .line 2
    invoke-direct {p0}, Lmb/g;->k()Lkb/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkb/i;->p()V

    :cond_0
    return-void
.end method

.method public final o(Lkb/h;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/h<",
            "*>;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    sget-object v0, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1
    sget-object v2, Lmb/h;->b:Lmb/a0;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    .line 2
    sget-object v1, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v2, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v3

    .line 3
    :cond_1
    instance-of p1, v1, Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    sget-object p1, Lmb/g;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    invoke-static {p1, p0, v1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    check-cast v1, Ljava/lang/Throwable;

    return-object v1

    .line 6
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent state "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DispatchedContinuation["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lmb/g;->q:Lkb/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lmb/g;->r:Lva/c;

    invoke-static {v1}, Lkb/z;->c(Lva/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
