.class public Lkb/i;
.super Lkb/e0;
.source "SourceFile"

# interfaces
.implements Lkb/h;
.implements Lxa/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkb/e0<",
        "TT;>;",
        "Lkb/h<",
        "TT;>;",
        "Lxa/d;"
    }
.end annotation


# static fields
.field private static final s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _decisionAndIndex:I

.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;

.field private final q:Lva/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lva/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final r:Lva/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lkb/i;

    const-string v2, "_decisionAndIndex"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    sput-object v1, Lkb/i;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v1, Lkb/i;

    const-string v2, "_state"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    sput-object v1, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-class v1, Lkb/i;

    const-string v2, "_parentHandle"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkb/i;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lva/c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/c<",
            "-TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lkb/e0;-><init>(I)V

    .line 2
    iput-object p1, p0, Lkb/i;->q:Lva/c;

    .line 3
    invoke-interface {p1}, Lva/c;->getContext()Lva/e;

    move-result-object p1

    iput-object p1, p0, Lkb/i;->r:Lva/e;

    const p1, 0x1fffffff

    .line 4
    iput p1, p0, Lkb/i;->_decisionAndIndex:I

    .line 5
    sget-object p1, Lkb/d;->n:Lkb/d;

    iput-object p1, p0, Lkb/i;->_state:Ljava/lang/Object;

    return-void
.end method

.method private final A(Ldb/l;)Lkb/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)",
            "Lkb/f;"
        }
    .end annotation

    instance-of v0, p1, Lkb/f;

    if-eqz v0, :cond_0

    check-cast p1, Lkb/f;

    goto :goto_0

    :cond_0
    new-instance v0, Lkb/s0;

    invoke-direct {v0, p1}, Lkb/s0;-><init>(Ldb/l;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method private final B(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final F(Ljava/lang/Object;ILdb/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1
    instance-of v2, v1, Lkb/g1;

    if-eqz v2, :cond_1

    .line 2
    move-object v4, v1

    check-cast v4, Lkb/g1;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, Lkb/i;->H(Lkb/g1;Ljava/lang/Object;ILdb/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 3
    sget-object v3, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-direct {p0}, Lkb/i;->q()V

    .line 5
    invoke-direct {p0, p2}, Lkb/i;->r(I)V

    return-void

    .line 6
    :cond_1
    instance-of p2, v1, Lkb/j;

    if-eqz p2, :cond_3

    .line 7
    check-cast v1, Lkb/j;

    invoke-virtual {v1}, Lkb/j;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    .line 8
    iget-object p1, v1, Lkb/p;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Lkb/i;->l(Ldb/l;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    .line 9
    :cond_3
    invoke-direct {p0, p1}, Lkb/i;->j(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lta/c;

    invoke-direct {p1}, Lta/c;-><init>()V

    throw p1
.end method

.method static synthetic G(Lkb/i;Ljava/lang/Object;ILdb/l;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lkb/i;->F(Ljava/lang/Object;ILdb/l;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final H(Lkb/g1;Ljava/lang/Object;ILdb/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/g1;",
            "Ljava/lang/Object;",
            "I",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lkb/p;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {p3}, Lkb/f0;->b(I)Z

    move-result p3

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    goto :goto_1

    :cond_1
    if-nez p4, :cond_2

    .line 3
    instance-of p3, p1, Lkb/f;

    if-nez p3, :cond_2

    if-eqz p5, :cond_4

    .line 4
    :cond_2
    new-instance p3, Lkb/o;

    instance-of v0, p1, Lkb/f;

    if-eqz v0, :cond_3

    check-cast p1, Lkb/f;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, Lkb/o;-><init>(Ljava/lang/Object;Lkb/f;Ldb/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/e;)V

    move-object p2, p3

    :cond_4
    :goto_1
    return-object p2
.end method

.method private final I()Z
    .locals 6

    sget-object v0, Lkb/i;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    const/4 v0, 0x0

    return v0

    .line 1
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    sget-object v2, Lkb/i;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v4, 0x1fffffff

    and-int/2addr v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    add-int/2addr v5, v4

    invoke-virtual {v2, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v3
.end method

.method private final J()Z
    .locals 5

    sget-object v0, Lkb/i;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_2

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 1
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    sget-object v2, Lkb/i;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v3, 0x1fffffff

    and-int/2addr v3, v1

    const/high16 v4, 0x20000000

    add-int/2addr v4, v3

    invoke-virtual {v2, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final m(Lmb/z;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmb/z<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lkb/i;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lkb/i;->getContext()Lva/e;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, Lmb/z;->a(ILjava/lang/Throwable;Lva/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 3
    invoke-virtual {p0}, Lkb/i;->getContext()Lva/e;

    move-result-object p2

    .line 4
    new-instance v0, Lkb/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkb/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    invoke-static {p2, v0}, Lkb/x;->a(Lva/e;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The index for Segment.onCancellation(..) is broken"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final o(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lkb/i;->z()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lkb/i;->q:Lva/c;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lmb/g;

    .line 3
    invoke-virtual {v0, p1}, Lmb/g;->m(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private final q()V
    .locals 1

    invoke-direct {p0}, Lkb/i;->z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkb/i;->p()V

    :cond_0
    return-void
.end method

.method private final r(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkb/i;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p0, p1}, Lkb/f0;->a(Lkb/e0;I)V

    return-void
.end method

.method private final t()Lkb/h0;
    .locals 1

    sget-object v0, Lkb/i;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkb/h0;

    return-object v0
.end method

.method private final w()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkb/i;->v()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lkb/g1;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, v0, Lkb/j;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method private final x()Lkb/h0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lkb/i;->getContext()Lva/e;

    move-result-object v0

    sget-object v1, Lkb/v0;->k:Lkb/v0$b;

    invoke-interface {v0, v1}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lkb/v0;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2
    new-instance v4, Lkb/k;

    invoke-direct {v4, p0}, Lkb/k;-><init>(Lkb/i;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 3
    invoke-static/range {v1 .. v6}, Lkb/v0$a;->d(Lkb/v0;ZZLdb/l;ILjava/lang/Object;)Lkb/h0;

    move-result-object v1

    sget-object v2, Lkb/i;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    invoke-static {v2, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v1
.end method

.method private final y(Ljava/lang/Object;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    sget-object v2, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .line 2
    instance-of v3, v11, Lkb/d;

    if-eqz v3, :cond_1

    .line 3
    sget-object v3, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, v0, v11, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    .line 4
    :cond_1
    instance-of v3, v11, Lkb/f;

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    instance-of v3, v11, Lmb/z;

    :goto_1
    if-eqz v3, :cond_3

    invoke-direct {v0, v1, v11}, Lkb/i;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_3
    instance-of v3, v11, Lkb/p;

    if-eqz v3, :cond_9

    .line 6
    move-object v2, v11

    check-cast v2, Lkb/p;

    invoke-virtual {v2}, Lkb/p;->b()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-direct {v0, v1, v11}, Lkb/i;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    :cond_4
    instance-of v4, v11, Lkb/j;

    if-eqz v4, :cond_8

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, v4

    :goto_2
    if-eqz v2, :cond_6

    .line 8
    iget-object v4, v2, Lkb/p;->a:Ljava/lang/Throwable;

    .line 9
    :cond_6
    instance-of v2, v1, Lkb/f;

    if-eqz v2, :cond_7

    .line 10
    check-cast v1, Lkb/f;

    invoke-virtual {v0, v1, v4}, Lkb/i;->k(Lkb/f;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_7
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"

    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lmb/z;

    .line 12
    invoke-direct {v0, v1, v4}, Lkb/i;->m(Lmb/z;Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    return-void

    .line 13
    :cond_9
    instance-of v3, v11, Lkb/o;

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"

    if-eqz v3, :cond_d

    .line 14
    move-object v12, v11

    check-cast v12, Lkb/o;

    iget-object v3, v12, Lkb/o;->b:Lkb/f;

    if-eqz v3, :cond_a

    invoke-direct {v0, v1, v11}, Lkb/i;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    :cond_a
    instance-of v3, v1, Lmb/z;

    if-eqz v3, :cond_b

    return-void

    .line 16
    :cond_b
    invoke-static {v1, v4}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v1

    check-cast v14, Lkb/f;

    .line 17
    invoke-virtual {v12}, Lkb/o;->c()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 18
    iget-object v1, v12, Lkb/o;->e:Ljava/lang/Throwable;

    invoke-virtual {v0, v14, v1}, Lkb/i;->k(Lkb/f;Ljava/lang/Throwable;)V

    return-void

    :cond_c
    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1d

    const/16 v19, 0x0

    .line 19
    invoke-static/range {v12 .. v19}, Lkb/o;->b(Lkb/o;Ljava/lang/Object;Lkb/f;Ldb/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lkb/o;

    move-result-object v3

    .line 20
    sget-object v4, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v11, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    .line 21
    :cond_d
    instance-of v3, v1, Lmb/z;

    if-eqz v3, :cond_e

    return-void

    .line 22
    :cond_e
    invoke-static {v1, v4}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    check-cast v5, Lkb/f;

    .line 23
    new-instance v12, Lkb/o;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x1c

    const/4 v10, 0x0

    move-object v3, v12

    move-object v4, v11

    invoke-direct/range {v3 .. v10}, Lkb/o;-><init>(Ljava/lang/Object;Lkb/f;Ldb/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/e;)V

    .line 24
    sget-object v3, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, v0, v11, v12}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void
.end method

.method private final z()Z
    .locals 2

    iget v0, p0, Lkb/e0;->p:I

    invoke-static {v0}, Lkb/f0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkb/i;->q:Lva/c;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lmb/g;

    invoke-virtual {v0}, Lmb/g;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final D(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lkb/i;->o(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lkb/i;->n(Ljava/lang/Throwable;)Z

    .line 3
    invoke-direct {p0}, Lkb/i;->q()V

    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/i;->q:Lva/c;

    instance-of v1, v0, Lmb/g;

    if-eqz v1, :cond_0

    check-cast v0, Lmb/g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lmb/g;->o(Lkb/h;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-virtual {p0}, Lkb/i;->p()V

    .line 3
    invoke-virtual {p0, v0}, Lkb/i;->n(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public a()Lxa/d;
    .locals 2

    iget-object v0, p0, Lkb/i;->q:Lva/c;

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
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 1
    instance-of v2, v10, Lkb/g1;

    if-nez v2, :cond_4

    .line 2
    instance-of v2, v10, Lkb/p;

    if-eqz v2, :cond_1

    return-void

    .line 3
    :cond_1
    instance-of v2, v10, Lkb/o;

    if-eqz v2, :cond_3

    .line 4
    move-object v2, v10

    check-cast v2, Lkb/o;

    invoke-virtual {v2}, Lkb/o;->c()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0xf

    const/16 v18, 0x0

    move-object v11, v2

    move-object/from16 v16, p2

    .line 5
    invoke-static/range {v11 .. v18}, Lkb/o;->b(Lkb/o;Ljava/lang/Object;Lkb/f;Ldb/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lkb/o;

    move-result-object v3

    .line 6
    sget-object v4, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v10, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v11, p2

    if-eqz v3, :cond_0

    .line 7
    invoke-virtual {v2, v0, v11}, Lkb/o;->d(Lkb/i;Ljava/lang/Throwable;)V

    return-void

    .line 8
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Must be called at most once"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object/from16 v11, p2

    .line 9
    sget-object v12, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v13, Lkb/o;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    move-object v2, v13

    move-object v3, v10

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v9}, Lkb/o;-><init>(Ljava/lang/Object;Lkb/f;Ldb/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/e;)V

    invoke-static {v12, v0, v10, v13}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 10
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Not completed"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()Lva/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lva/c<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lkb/i;->q:Lva/c;

    return-object v0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1, p0}, Lkb/t;->c(Ljava/lang/Object;Lkb/h;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lkb/e0;->p:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkb/i;->G(Lkb/i;Ljava/lang/Object;ILdb/l;ILjava/lang/Object;)V

    return-void
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, Lkb/e0;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public f(Ldb/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkb/i;->A(Ldb/l;)Lkb/f;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1}, Lkb/i;->y(Ljava/lang/Object;)V

    return-void
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lkb/o;

    if-eqz v0, :cond_0

    check-cast p1, Lkb/o;

    iget-object p1, p1, Lkb/o;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public getContext()Lva/e;
    .locals 1

    iget-object v0, p0, Lkb/i;->r:Lva/e;

    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkb/i;->v()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lkb/f;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Lkb/g;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-virtual {p0}, Lkb/i;->getContext()Lva/e;

    move-result-object p2

    .line 3
    new-instance v0, Lkb/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkb/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-static {p2, v0}, Lkb/x;->a(Lva/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final l(Ldb/l;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Ldb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-virtual {p0}, Lkb/i;->getContext()Lva/e;

    move-result-object p2

    .line 3
    new-instance v0, Lkb/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in resume onCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkb/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-static {p2, v0}, Lkb/x;->a(Lva/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public n(Ljava/lang/Throwable;)Z
    .locals 6

    sget-object v0, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1
    instance-of v2, v1, Lkb/g1;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    return v3

    .line 2
    :cond_1
    new-instance v2, Lkb/j;

    instance-of v4, v1, Lkb/f;

    const/4 v5, 0x1

    if-nez v4, :cond_2

    instance-of v4, v1, Lmb/z;

    if-eqz v4, :cond_3

    :cond_2
    const/4 v3, 0x1

    :cond_3
    invoke-direct {v2, p0, p1, v3}, Lkb/j;-><init>(Lva/c;Ljava/lang/Throwable;Z)V

    .line 3
    sget-object v3, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    move-object v0, v1

    check-cast v0, Lkb/g1;

    .line 5
    instance-of v2, v0, Lkb/f;

    if-eqz v2, :cond_4

    check-cast v1, Lkb/f;

    invoke-virtual {p0, v1, p1}, Lkb/i;->k(Lkb/f;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 6
    :cond_4
    instance-of v0, v0, Lmb/z;

    if-eqz v0, :cond_5

    check-cast v1, Lmb/z;

    invoke-direct {p0, v1, p1}, Lkb/i;->m(Lmb/z;Ljava/lang/Throwable;)V

    .line 7
    :cond_5
    :goto_0
    invoke-direct {p0}, Lkb/i;->q()V

    .line 8
    iget p1, p0, Lkb/e0;->p:I

    invoke-direct {p0, p1}, Lkb/i;->r(I)V

    return v5
.end method

.method public final p()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkb/i;->t()Lkb/h0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Lkb/h0;->b()V

    sget-object v0, Lkb/i;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    sget-object v1, Lkb/f1;->n:Lkb/f1;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public s(Lkb/v0;)Ljava/lang/Throwable;
    .locals 0

    invoke-interface {p1}, Lkb/v0;->T()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkb/i;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkb/i;->q:Lva/c;

    invoke-static {v1}, Lkb/z;->c(Lva/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lkb/i;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkb/z;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0}, Lkb/i;->z()Z

    move-result v0

    .line 2
    invoke-direct {p0}, Lkb/i;->J()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    invoke-direct {p0}, Lkb/i;->t()Lkb/h0;

    move-result-object v1

    if-nez v1, :cond_0

    .line 4
    invoke-direct {p0}, Lkb/i;->x()Lkb/h0;

    :cond_0
    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lkb/i;->E()V

    .line 6
    :cond_1
    invoke-static {}, Lwa/b;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p0}, Lkb/i;->E()V

    .line 8
    :cond_3
    invoke-virtual {p0}, Lkb/i;->v()Ljava/lang/Object;

    move-result-object v0

    .line 9
    instance-of v1, v0, Lkb/p;

    if-nez v1, :cond_6

    .line 10
    iget v1, p0, Lkb/e0;->p:I

    invoke-static {v1}, Lkb/f0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 11
    invoke-virtual {p0}, Lkb/i;->getContext()Lva/e;

    move-result-object v1

    sget-object v2, Lkb/v0;->k:Lkb/v0$b;

    invoke-interface {v1, v2}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object v1

    check-cast v1, Lkb/v0;

    if-eqz v1, :cond_5

    .line 12
    invoke-interface {v1}, Lkb/v0;->c()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    .line 13
    :cond_4
    invoke-interface {v1}, Lkb/v0;->T()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lkb/i;->b(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 15
    throw v1

    .line 16
    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, Lkb/i;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 17
    :cond_6
    check-cast v0, Lkb/p;

    iget-object v0, v0, Lkb/p;->a:Ljava/lang/Throwable;

    .line 18
    throw v0
.end method

.method public final v()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkb/i;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
