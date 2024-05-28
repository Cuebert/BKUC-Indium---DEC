.class public final Lmb/k;
.super Lkb/v;
.source "SourceFile"

# interfaces
.implements Lkb/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/k$a;
    }
.end annotation


# static fields
.field private static final u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final p:Lkb/v;

.field private final q:I

.field private final synthetic r:Lkb/c0;

.field private volatile runningWorkers:I

.field private final s:Lmb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmb/p<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmb/k;

    const-string v1, "runningWorkers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lmb/k;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lkb/v;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkb/v;-><init>()V

    .line 2
    iput-object p1, p0, Lmb/k;->p:Lkb/v;

    .line 3
    iput p2, p0, Lmb/k;->q:I

    .line 4
    instance-of p2, p1, Lkb/c0;

    if-eqz p2, :cond_0

    check-cast p1, Lkb/c0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Lkb/b0;->a()Lkb/c0;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lmb/k;->r:Lkb/c0;

    .line 5
    new-instance p1, Lmb/p;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lmb/p;-><init>(Z)V

    iput-object p1, p0, Lmb/k;->s:Lmb/p;

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmb/k;->t:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic m0(Lmb/k;)Lkb/v;
    .locals 0

    iget-object p0, p0, Lmb/k;->p:Lkb/v;

    return-object p0
.end method

.method public static final synthetic n0(Lmb/k;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, Lmb/k;->o0()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method private final o0()Ljava/lang/Runnable;
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lmb/k;->s:Lmb/p;

    invoke-virtual {v0}, Lmb/p;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lmb/k;->t:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    :try_start_0
    sget-object v1, Lmb/k;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 4
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 5
    iget-object v2, p0, Lmb/k;->s:Lmb/p;

    invoke-virtual {v2}, Lmb/p;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    .line 6
    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method private final p0()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lmb/k;->t:Ljava/lang/Object;

    .line 2
    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lmb/k;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    iget v3, p0, Lmb/k;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v2, v3, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return v1

    .line 4
    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    .line 5
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public j0(Lva/e;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lmb/k;->s:Lmb/p;

    invoke-virtual {p1, p2}, Lmb/p;->a(Ljava/lang/Object;)Z

    .line 2
    sget-object p1, Lmb/k;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lmb/k;->q:I

    if-ge p1, p2, :cond_1

    .line 3
    invoke-direct {p0}, Lmb/k;->p0()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    invoke-direct {p0}, Lmb/k;->o0()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p2, Lmb/k$a;

    invoke-direct {p2, p0, p1}, Lmb/k$a;-><init>(Lmb/k;Ljava/lang/Runnable;)V

    .line 6
    iget-object p1, p0, Lmb/k;->p:Lkb/v;

    invoke-virtual {p1, p0, p2}, Lkb/v;->j0(Lva/e;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
