.class public abstract Lkb/j0;
.super Lkb/v;
.source "SourceFile"


# instance fields
.field private p:J

.field private q:Z

.field private r:Lua/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lua/d<",
            "Lkb/e0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/v;-><init>()V

    return-void
.end method

.method private final n0(Z)J
    .locals 2

    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0
.end method

.method public static synthetic r0(Lkb/j0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lkb/j0;->q0(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final m0(Z)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lkb/j0;->p:J

    invoke-direct {p0, p1}, Lkb/j0;->n0(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lkb/j0;->p:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean p1, p0, Lkb/j0;->q:Z

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Lkb/j0;->shutdown()V

    :cond_1
    return-void
.end method

.method public final o0(Lkb/e0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/e0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkb/j0;->r:Lua/d;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lua/d;

    invoke-direct {v0}, Lua/d;-><init>()V

    iput-object v0, p0, Lkb/j0;->r:Lua/d;

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lua/d;->k(Ljava/lang/Object;)V

    return-void
.end method

.method protected p0()J
    .locals 3

    .line 1
    iget-object v0, p0, Lkb/j0;->r:Lua/d;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lua/d;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public final q0(Z)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lkb/j0;->p:J

    invoke-direct {p0, p1}, Lkb/j0;->n0(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lkb/j0;->p:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lkb/j0;->q:Z

    :cond_0
    return-void
.end method

.method public final s0()Z
    .locals 6

    iget-wide v0, p0, Lkb/j0;->p:J

    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lkb/j0;->n0(Z)J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method

.method public final t0()Z
    .locals 1

    iget-object v0, p0, Lkb/j0;->r:Lua/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lua/d;->isEmpty()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public final u0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/j0;->r:Lua/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lua/d;->v()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkb/e0;

    if-nez v0, :cond_1

    return v1

    .line 3
    :cond_1
    invoke-virtual {v0}, Lkb/e0;->run()V

    const/4 v0, 0x1

    return v0
.end method
