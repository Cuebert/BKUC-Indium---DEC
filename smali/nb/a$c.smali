.class public final Lnb/a$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# static fields
.field private static final v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile indexInArray:I

.field public final n:Lnb/n;

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field private final o:Lkotlin/jvm/internal/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/o<",
            "Lnb/h;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lnb/a$d;

.field private q:J

.field private r:J

.field private s:I

.field public t:Z

.field final synthetic u:Lnb/a;

.field private volatile workerCtl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lnb/a$c;

    const-string v1, "workerCtl"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lnb/a$c;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method private constructor <init>(Lnb/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnb/a$c;->u:Lnb/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    new-instance p1, Lnb/n;

    invoke-direct {p1}, Lnb/n;-><init>()V

    iput-object p1, p0, Lnb/a$c;->n:Lnb/n;

    .line 4
    new-instance p1, Lkotlin/jvm/internal/o;

    invoke-direct {p1}, Lkotlin/jvm/internal/o;-><init>()V

    iput-object p1, p0, Lnb/a$c;->o:Lkotlin/jvm/internal/o;

    .line 5
    sget-object p1, Lnb/a$d;->q:Lnb/a$d;

    iput-object p1, p0, Lnb/a$c;->p:Lnb/a$d;

    .line 6
    sget-object p1, Lnb/a;->y:Lmb/a0;

    iput-object p1, p0, Lnb/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 7
    sget-object p1, Leb/c;->n:Leb/c$a;

    invoke-virtual {p1}, Leb/c$a;->b()I

    move-result p1

    iput p1, p0, Lnb/a$c;->s:I

    return-void
.end method

.method public constructor <init>(Lnb/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1}, Lnb/a$c;-><init>(Lnb/a;)V

    .line 9
    invoke-virtual {p0, p2}, Lnb/a$c;->q(I)V

    return-void
.end method

.method public static final synthetic a(Lnb/a$c;)Lnb/a;
    .locals 0

    iget-object p0, p0, Lnb/a$c;->u:Lnb/a;

    return-object p0
.end method

.method private final b(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object p1, p0, Lnb/a$c;->u:Lnb/a;

    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/32 v1, -0x200000

    .line 2
    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 3
    iget-object p1, p0, Lnb/a$c;->p:Lnb/a$d;

    .line 4
    sget-object v0, Lnb/a$d;->r:Lnb/a$d;

    if-eq p1, v0, :cond_1

    .line 5
    sget-object p1, Lnb/a$d;->q:Lnb/a$d;

    iput-object p1, p0, Lnb/a$c;->p:Lnb/a$d;

    :cond_1
    return-void
.end method

.method private final c(I)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    sget-object p1, Lnb/a$d;->o:Lnb/a$d;

    invoke-virtual {p0, p1}, Lnb/a$c;->u(Lnb/a$d;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lnb/a$c;->u:Lnb/a;

    invoke-virtual {p1}, Lnb/a;->k0()V

    :cond_1
    return-void
.end method

.method private final d(Lnb/h;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lnb/h;->o:Lnb/i;

    invoke-interface {v0}, Lnb/i;->b()I

    move-result v0

    .line 2
    invoke-direct {p0, v0}, Lnb/a$c;->k(I)V

    .line 3
    invoke-direct {p0, v0}, Lnb/a$c;->c(I)V

    .line 4
    iget-object v1, p0, Lnb/a$c;->u:Lnb/a;

    invoke-virtual {v1, p1}, Lnb/a;->Y(Lnb/h;)V

    .line 5
    invoke-direct {p0, v0}, Lnb/a$c;->b(I)V

    return-void
.end method

.method private final e(Z)Lnb/h;
    .locals 1

    if-eqz p1, :cond_3

    .line 1
    iget-object p1, p0, Lnb/a$c;->u:Lnb/a;

    iget p1, p1, Lnb/a;->n:I

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lnb/a$c;->m(I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 2
    invoke-direct {p0}, Lnb/a$c;->o()Lnb/h;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 3
    :cond_1
    iget-object v0, p0, Lnb/a$c;->n:Lnb/n;

    invoke-virtual {v0}, Lnb/n;->g()Lnb/h;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    if-nez p1, :cond_4

    .line 4
    invoke-direct {p0}, Lnb/a$c;->o()Lnb/h;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    .line 5
    :cond_3
    invoke-direct {p0}, Lnb/a$c;->o()Lnb/h;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    :cond_4
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lnb/a$c;->v(I)Lnb/h;

    move-result-object p1

    return-object p1
.end method

.method private final f()Lnb/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/a$c;->n:Lnb/n;

    invoke-virtual {v0}, Lnb/n;->h()Lnb/h;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v0, v0, Lnb/a;->s:Lnb/d;

    invoke-virtual {v0}, Lmb/p;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/h;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, v0}, Lnb/a$c;->v(I)Lnb/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static final j()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, Lnb/a$c;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final k(I)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    iput-wide v0, p0, Lnb/a$c;->q:J

    .line 2
    iget-object p1, p0, Lnb/a$c;->p:Lnb/a$d;

    sget-object v0, Lnb/a$d;->p:Lnb/a$d;

    if-ne p1, v0, :cond_0

    .line 3
    sget-object p1, Lnb/a$d;->o:Lnb/a$d;

    iput-object p1, p0, Lnb/a$c;->p:Lnb/a$d;

    :cond_0
    return-void
.end method

.method private final l()Z
    .locals 2

    iget-object v0, p0, Lnb/a$c;->nextParkedWorker:Ljava/lang/Object;

    sget-object v1, Lnb/a;->y:Lmb/a0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final n()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lnb/a$c;->q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v4, p0, Lnb/a$c;->u:Lnb/a;

    iget-wide v4, v4, Lnb/a;->p:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lnb/a$c;->q:J

    .line 2
    :cond_0
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-wide v0, v0, Lnb/a;->p:J

    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v4, p0, Lnb/a$c;->q:J

    sub-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 4
    iput-wide v2, p0, Lnb/a$c;->q:J

    .line 5
    invoke-direct {p0}, Lnb/a$c;->w()V

    :cond_1
    return-void
.end method

.method private final o()Lnb/h;
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Lnb/a$c;->m(I)I

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v0, v0, Lnb/a;->r:Lnb/d;

    invoke-virtual {v0}, Lmb/p;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/h;

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v0, v0, Lnb/a;->s:Lnb/d;

    invoke-virtual {v0}, Lmb/p;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/h;

    return-object v0

    .line 4
    :cond_1
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v0, v0, Lnb/a;->s:Lnb/d;

    invoke-virtual {v0}, Lmb/p;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/h;

    if-eqz v0, :cond_2

    return-object v0

    .line 5
    :cond_2
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v0, v0, Lnb/a;->r:Lnb/d;

    invoke-virtual {v0}, Lmb/p;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/h;

    return-object v0
.end method

.method private final p()V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 1
    :goto_1
    iget-object v2, p0, Lnb/a$c;->u:Lnb/a;

    invoke-virtual {v2}, Lnb/a;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lnb/a$c;->p:Lnb/a$d;

    sget-object v3, Lnb/a$d;->r:Lnb/a$d;

    if-eq v2, v3, :cond_3

    .line 2
    iget-boolean v2, p0, Lnb/a$c;->t:Z

    invoke-virtual {p0, v2}, Lnb/a$c;->g(Z)Lnb/h;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    .line 3
    iput-wide v3, p0, Lnb/a$c;->r:J

    .line 4
    invoke-direct {p0, v2}, Lnb/a$c;->d(Lnb/h;)V

    goto :goto_0

    .line 5
    :cond_0
    iput-boolean v0, p0, Lnb/a$c;->t:Z

    .line 6
    iget-wide v5, p0, Lnb/a$c;->r:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    .line 7
    :cond_1
    sget-object v1, Lnb/a$d;->p:Lnb/a$d;

    invoke-virtual {p0, v1}, Lnb/a$c;->u(Lnb/a$d;)Z

    .line 8
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 9
    iget-wide v1, p0, Lnb/a$c;->r:J

    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 10
    iput-wide v3, p0, Lnb/a$c;->r:J

    goto :goto_0

    .line 11
    :cond_2
    invoke-direct {p0}, Lnb/a$c;->t()V

    goto :goto_1

    .line 12
    :cond_3
    sget-object v0, Lnb/a$d;->r:Lnb/a$d;

    invoke-virtual {p0, v0}, Lnb/a$c;->u(Lnb/a$d;)Z

    return-void
.end method

.method private final s()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lnb/a$c;->p:Lnb/a$d;

    sget-object v1, Lnb/a$d;->n:Lnb/a$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    :goto_0
    const/4 v2, 0x1

    goto :goto_2

    .line 2
    :cond_0
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v6

    const-wide v4, 0x7ffffc0000000000L

    and-long/2addr v4, v6

    const/16 v8, 0x2a

    shr-long/2addr v4, v8

    long-to-int v5, v4

    if-nez v5, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const-wide v4, 0x40000000000L

    sub-long v8, v6, v4

    .line 3
    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v4

    move-object v5, v0

    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    .line 4
    sget-object v0, Lnb/a$d;->n:Lnb/a$d;

    iput-object v0, p0, Lnb/a$c;->p:Lnb/a$d;

    goto :goto_0

    :cond_3
    :goto_2
    return v2
.end method

.method private final t()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lnb/a$c;->l()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    invoke-virtual {v0, p0}, Lnb/a;->W(Lnb/a$c;)Z

    return-void

    .line 3
    :cond_0
    sget-object v0, Lnb/a$c;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, -0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 5
    :goto_0
    invoke-direct {p0}, Lnb/a$c;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lnb/a$c;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 6
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    invoke-virtual {v0}, Lnb/a;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lnb/a$c;->p:Lnb/a$d;

    sget-object v2, Lnb/a$d;->r:Lnb/a$d;

    if-ne v0, v2, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    sget-object v0, Lnb/a$d;->p:Lnb/a$d;

    invoke-virtual {p0, v0}, Lnb/a$c;->u(Lnb/a$d;)Z

    .line 8
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 9
    invoke-direct {p0}, Lnb/a$c;->n()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private final v(I)Lnb/h;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lnb/a$c;->u:Lnb/a;

    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    .line 2
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide/32 v3, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x2

    if-ge v2, v3, :cond_0

    return-object v1

    .line 3
    :cond_0
    invoke-virtual {v0, v2}, Lnb/a$c;->m(I)I

    move-result v3

    .line 4
    iget-object v4, v0, Lnb/a$c;->u:Lnb/a;

    const/4 v5, 0x0

    const-wide v6, 0x7fffffffffffffffL

    move-wide v8, v6

    :goto_0
    const-wide/16 v10, 0x0

    if-ge v5, v2, :cond_5

    const/4 v12, 0x1

    add-int/2addr v3, v12

    if-le v3, v2, :cond_1

    const/4 v3, 0x1

    .line 5
    :cond_1
    iget-object v12, v4, Lnb/a;->t:Lmb/x;

    invoke-virtual {v12, v3}, Lmb/x;->b(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lnb/a$c;

    if-eqz v12, :cond_3

    if-eq v12, v0, :cond_3

    .line 6
    iget-object v12, v12, Lnb/a$c;->n:Lnb/n;

    iget-object v13, v0, Lnb/a$c;->o:Lkotlin/jvm/internal/o;

    move/from16 v14, p1

    invoke-virtual {v12, v14, v13}, Lnb/n;->n(ILkotlin/jvm/internal/o;)J

    move-result-wide v12

    const-wide/16 v15, -0x1

    cmp-long v17, v12, v15

    if-nez v17, :cond_2

    .line 7
    iget-object v2, v0, Lnb/a$c;->o:Lkotlin/jvm/internal/o;

    iget-object v3, v2, Lkotlin/jvm/internal/o;->n:Ljava/lang/Object;

    check-cast v3, Lnb/h;

    .line 8
    iput-object v1, v2, Lkotlin/jvm/internal/o;->n:Ljava/lang/Object;

    return-object v3

    :cond_2
    cmp-long v15, v12, v10

    if-lez v15, :cond_4

    .line 9
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    goto :goto_1

    :cond_3
    move/from16 v14, p1

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    cmp-long v2, v8, v6

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    move-wide v8, v10

    .line 10
    :goto_2
    iput-wide v8, v0, Lnb/a$c;->r:J

    return-object v1
.end method

.method private final w()V
    .locals 8

    .line 1
    iget-object v0, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v1, v0, Lnb/a;->t:Lmb/x;

    .line 2
    monitor-enter v1

    .line 3
    :try_start_0
    invoke-virtual {v0}, Lnb/a;->isTerminated()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v1

    return-void

    .line 4
    :cond_0
    :try_start_1
    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    .line 5
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/32 v4, 0x1fffff

    and-long/2addr v2, v4

    long-to-int v3, v2

    .line 6
    iget v2, v0, Lnb/a;->n:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt v3, v2, :cond_1

    monitor-exit v1

    return-void

    .line 7
    :cond_1
    :try_start_2
    sget-object v2, Lnb/a$c;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, -0x1

    const/4 v6, 0x1

    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    .line 8
    :cond_2
    :try_start_3
    iget v2, p0, Lnb/a$c;->indexInArray:I

    const/4 v3, 0x0

    .line 9
    invoke-virtual {p0, v3}, Lnb/a$c;->q(I)V

    .line 10
    invoke-virtual {v0, p0, v2, v3}, Lnb/a;->X(Lnb/a$c;II)V

    .line 11
    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v6

    and-long v3, v6, v4

    long-to-int v4, v3

    if-eq v4, v2, :cond_3

    .line 12
    iget-object v3, v0, Lnb/a;->t:Lmb/x;

    invoke-virtual {v3, v4}, Lmb/x;->b(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;)V

    check-cast v3, Lnb/a$c;

    .line 13
    iget-object v5, v0, Lnb/a;->t:Lmb/x;

    invoke-virtual {v5, v2, v3}, Lmb/x;->c(ILjava/lang/Object;)V

    .line 14
    invoke-virtual {v3, v2}, Lnb/a$c;->q(I)V

    .line 15
    invoke-virtual {v0, v3, v4, v2}, Lnb/a;->X(Lnb/a$c;II)V

    .line 16
    :cond_3
    iget-object v0, v0, Lnb/a;->t:Lmb/x;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2}, Lmb/x;->c(ILjava/lang/Object;)V

    .line 17
    sget-object v0, Lta/l;->a:Lta/l;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 18
    monitor-exit v1

    .line 19
    sget-object v0, Lnb/a$d;->r:Lnb/a$d;

    iput-object v0, p0, Lnb/a$c;->p:Lnb/a$d;

    return-void

    :catchall_0
    move-exception v0

    .line 20
    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final g(Z)Lnb/h;
    .locals 1

    .line 1
    invoke-direct {p0}, Lnb/a$c;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lnb/a$c;->e(Z)Lnb/h;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    invoke-direct {p0}, Lnb/a$c;->f()Lnb/h;

    move-result-object p1

    return-object p1
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lnb/a$c;->indexInArray:I

    return v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnb/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final m(I)I
    .locals 3

    .line 1
    iget v0, p0, Lnb/a$c;->s:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    .line 2
    iput v0, p0, Lnb/a$c;->s:I

    add-int/lit8 v1, p1, -0x1

    and-int v2, v1, p1

    if-nez v2, :cond_0

    and-int p1, v0, v1

    return p1

    :cond_0
    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 3
    rem-int/2addr v0, p1

    return v0
.end method

.method public final q(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnb/a$c;->u:Lnb/a;

    iget-object v1, v1, Lnb/a;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "TERMINATED"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lnb/a$c;->indexInArray:I

    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lnb/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public run()V
    .locals 0

    invoke-direct {p0}, Lnb/a$c;->p()V

    return-void
.end method

.method public final u(Lnb/a$d;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lnb/a$c;->p:Lnb/a$d;

    .line 2
    sget-object v1, Lnb/a$d;->n:Lnb/a$d;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    iget-object v2, p0, Lnb/a$c;->u:Lnb/a;

    invoke-static {}, Lnb/a;->b()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    const-wide v4, 0x40000000000L

    .line 4
    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    :cond_1
    if-eq v0, p1, :cond_2

    .line 5
    iput-object p1, p0, Lnb/a$c;->p:Lnb/a$d;

    :cond_2
    return v1
.end method
