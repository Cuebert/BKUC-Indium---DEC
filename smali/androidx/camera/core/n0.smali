.class public final Landroidx/camera/core/n0;
.super Landroidx/camera/core/y2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/n0$c;,
        Landroidx/camera/core/n0$d;,
        Landroidx/camera/core/n0$a;,
        Landroidx/camera/core/n0$e;,
        Landroidx/camera/core/n0$b;
    }
.end annotation


# static fields
.field public static final p:Landroidx/camera/core/n0$d;

.field private static final q:Ljava/lang/Boolean;


# instance fields
.field final l:Landroidx/camera/core/q0;

.field private final m:Ljava/lang/Object;

.field private n:Landroidx/camera/core/n0$a;

.field private o:Lw/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/n0$d;

    invoke-direct {v0}, Landroidx/camera/core/n0$d;-><init>()V

    sput-object v0, Landroidx/camera/core/n0;->p:Landroidx/camera/core/n0$d;

    const/4 v0, 0x0

    .line 2
    sput-object v0, Landroidx/camera/core/n0;->q:Ljava/lang/Boolean;

    return-void
.end method

.method constructor <init>(Lw/z0;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/y2;-><init>(Lw/o2;)V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/n0;->m:Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lw/z0;->I(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5
    new-instance p1, Landroidx/camera/core/r0;

    invoke-direct {p1}, Landroidx/camera/core/r0;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroidx/camera/core/s0;

    .line 7
    invoke-static {}, Lx/a;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v1}, Lw/z0;->H(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/camera/core/s0;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    .line 8
    :goto_0
    iget-object p1, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {p0}, Landroidx/camera/core/n0;->S()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/q0;->u(I)V

    .line 9
    iget-object p1, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/n0;->U()Z

    move-result v0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/camera/core/q0;->v(Z)V

    return-void
.end method

.method public static synthetic K(Landroidx/camera/core/n0$a;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/n0;->X(Landroidx/camera/core/n0$a;Landroidx/camera/core/l1;)V

    return-void
.end method

.method public static synthetic L(Landroidx/camera/core/n0;Ljava/lang/String;Lw/z0;Landroid/util/Size;Lw/c2;Lw/c2$e;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/n0;->W(Ljava/lang/String;Lw/z0;Landroid/util/Size;Lw/c2;Lw/c2$e;)V

    return-void
.end method

.method public static synthetic M(Landroidx/camera/core/l2;Landroidx/camera/core/l2;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/n0;->V(Landroidx/camera/core/l2;Landroidx/camera/core/l2;)V

    return-void
.end method

.method private T(Lw/d0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/n0;->U()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->k(Lw/d0;)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private static synthetic V(Landroidx/camera/core/l2;Landroidx/camera/core/l2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/l2;->m()V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/camera/core/l2;->m()V

    :cond_0
    return-void
.end method

.method private synthetic W(Ljava/lang/String;Lw/z0;Landroid/util/Size;Lw/c2;Lw/c2$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/n0;->N()V

    .line 2
    iget-object p4, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {p4}, Landroidx/camera/core/q0;->g()V

    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->p(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/n0;->O(Ljava/lang/String;Lw/z0;Landroid/util/Size;)Lw/c2$b;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lw/c2$b;->m()Lw/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    .line 6
    invoke-virtual {p0}, Landroidx/camera/core/y2;->t()V

    :cond_0
    return-void
.end method

.method private static synthetic X(Landroidx/camera/core/n0$a;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/n0$a;->b(Landroidx/camera/core/l1;)V

    return-void
.end method

.method private Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {p0, v0}, Landroidx/camera/core/y2;->k(Lw/d0;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/q0;->x(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/n0;->N()V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {v0}, Landroidx/camera/core/q0;->j()V

    return-void
.end method

.method protected B(Lw/b0;Lw/o2$a;)Lw/o2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/b0;",
            "Lw/o2$a<",
            "***>;)",
            "Lw/o2<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/n0;->R()Ljava/lang/Boolean;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Lw/b0;->g()Lw/y1;

    move-result-object p1

    const-class v1, Lb0/d;

    invoke-virtual {p1, v1}, Lw/y1;->a(Ljava/lang/Class;)Z

    move-result p1

    .line 3
    iget-object v1, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 5
    :goto_0
    invoke-virtual {v1, p1}, Landroidx/camera/core/q0;->t(Z)V

    .line 6
    iget-object p1, p0, Landroidx/camera/core/n0;->m:Ljava/lang/Object;

    monitor-enter p1

    .line 7
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/n0;->n:Landroidx/camera/core/n0$a;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0}, Landroidx/camera/core/n0$a;->a()Landroid/util/Size;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 9
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 10
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v1, Lw/f1;->j:Lw/o0$a;

    invoke-interface {p1, v1, v0}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 11
    :cond_2
    invoke-interface {p2}, Lw/o2$a;->b()Lw/o2;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p2

    .line 12
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method protected E(Landroid/util/Size;)Landroid/util/Size;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1}, Landroidx/camera/core/n0;->O(Ljava/lang/String;Lw/z0;Landroid/util/Size;)Lw/c2$b;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lw/c2$b;->m()Lw/c2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    return-object p1
.end method

.method public G(Landroid/graphics/Matrix;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {v0, p1}, Landroidx/camera/core/q0;->y(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public H(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/camera/core/y2;->H(Landroid/graphics/Rect;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {v0, p1}, Landroidx/camera/core/q0;->z(Landroid/graphics/Rect;)V

    return-void
.end method

.method N()V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/n0;->o:Lw/r0;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lw/r0;->c()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/camera/core/n0;->o:Lw/r0;

    :cond_0
    return-void
.end method

.method O(Ljava/lang/String;Lw/z0;Landroid/util/Size;)Lw/c2$b;
    .locals 10

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-static {}, Lx/a;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 3
    invoke-virtual {p2, v0}, Lw/z0;->H(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/n0;->P()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/n0;->Q()I

    move-result v1

    move v7, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    const/4 v7, 0x4

    .line 5
    :goto_0
    invoke-virtual {p2}, Lw/z0;->K()Landroidx/camera/core/m1;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    new-instance v1, Landroidx/camera/core/l2;

    .line 7
    invoke-virtual {p2}, Lw/z0;->K()Landroidx/camera/core/m1;

    move-result-object v3

    .line 8
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v6

    const-wide/16 v8, 0x0

    .line 9
    invoke-interface/range {v3 .. v9}, Landroidx/camera/core/m1;->a(IIIIJ)Lw/h1;

    move-result-object v3

    invoke-direct {v1, v3}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    goto :goto_1

    .line 10
    :cond_1
    new-instance v1, Landroidx/camera/core/l2;

    .line 11
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v3

    .line 12
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v4

    .line 13
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v5

    .line 14
    invoke-static {v3, v4, v5, v7}, Landroidx/camera/core/n1;->a(IIII)Lw/h1;

    move-result-object v3

    invoke-direct {v1, v3}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    .line 15
    :goto_1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v3

    invoke-direct {p0, v3}, Landroidx/camera/core/n0;->T(Lw/d0;)Z

    move-result v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_3

    .line 16
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v5

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v5

    :goto_3
    if-eqz v3, :cond_4

    .line 17
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v3

    goto :goto_4

    :cond_4
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v3

    .line 18
    :goto_4
    invoke-virtual {p0}, Landroidx/camera/core/n0;->S()I

    move-result v6

    const/4 v7, 0x2

    const/16 v8, 0x23

    if-ne v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_5

    :cond_5
    const/16 v6, 0x23

    .line 19
    :goto_5
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v9

    if-ne v9, v8, :cond_6

    .line 20
    invoke-virtual {p0}, Landroidx/camera/core/n0;->S()I

    move-result v9

    if-ne v9, v7, :cond_6

    const/4 v7, 0x1

    goto :goto_6

    :cond_6
    const/4 v7, 0x0

    .line 21
    :goto_6
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v9

    if-ne v9, v8, :cond_8

    .line 22
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v8

    invoke-virtual {p0, v8}, Landroidx/camera/core/y2;->k(Lw/d0;)I

    move-result v8

    if-nez v8, :cond_9

    :cond_7
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    invoke-virtual {p0}, Landroidx/camera/core/n0;->R()Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_7

    :cond_8
    const/4 v2, 0x0

    :cond_9
    :goto_7
    if-nez v7, :cond_b

    if-eqz v2, :cond_a

    goto :goto_8

    :cond_a
    const/4 v2, 0x0

    goto :goto_9

    .line 24
    :cond_b
    :goto_8
    new-instance v2, Landroidx/camera/core/l2;

    .line 25
    invoke-virtual {v1}, Landroidx/camera/core/l2;->h()I

    move-result v4

    .line 26
    invoke-static {v5, v3, v6, v4}, Landroidx/camera/core/n1;->a(IIII)Lw/h1;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    :goto_9
    if-eqz v2, :cond_c

    .line 27
    iget-object v3, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {v3, v2}, Landroidx/camera/core/q0;->w(Landroidx/camera/core/l2;)V

    .line 28
    :cond_c
    invoke-direct {p0}, Landroidx/camera/core/n0;->Z()V

    .line 29
    iget-object v3, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {v1, v3, v0}, Landroidx/camera/core/l2;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    .line 30
    invoke-static {p2}, Lw/c2$b;->o(Lw/o2;)Lw/c2$b;

    move-result-object v0

    .line 31
    iget-object v3, p0, Landroidx/camera/core/n0;->o:Lw/r0;

    if-eqz v3, :cond_d

    .line 32
    invoke-virtual {v3}, Lw/r0;->c()V

    .line 33
    :cond_d
    new-instance v3, Lw/i1;

    invoke-virtual {v1}, Landroidx/camera/core/l2;->a()Landroid/view/Surface;

    move-result-object v4

    .line 34
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v5

    invoke-direct {v3, v4, p3, v5}, Lw/i1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v3, p0, Landroidx/camera/core/n0;->o:Lw/r0;

    .line 35
    invoke-virtual {v3}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v3

    new-instance v4, Landroidx/camera/core/k0;

    invoke-direct {v4, v1, v2}, Landroidx/camera/core/k0;-><init>(Landroidx/camera/core/l2;Landroidx/camera/core/l2;)V

    .line 36
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    .line 37
    invoke-interface {v3, v4, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 38
    iget-object v1, p0, Landroidx/camera/core/n0;->o:Lw/r0;

    invoke-virtual {v0, v1}, Lw/c2$b;->k(Lw/r0;)V

    .line 39
    new-instance v1, Landroidx/camera/core/l0;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/core/l0;-><init>(Landroidx/camera/core/n0;Ljava/lang/String;Lw/z0;Landroid/util/Size;)V

    invoke-virtual {v0, v1}, Lw/c2$b;->f(Lw/c2$c;)V

    return-object v0
.end method

.method public P()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lw/z0;->I(I)I

    move-result v0

    return v0
.end method

.method public Q()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lw/z0;->J(I)I

    move-result v0

    return v0
.end method

.method public R()Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    sget-object v1, Landroidx/camera/core/n0;->q:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lw/z0;->L(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public S()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lw/z0;->M(I)I

    move-result v0

    return v0
.end method

.method public U()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/z0;

    .line 2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    invoke-virtual {v0, v1}, Lw/z0;->N(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public Y(Ljava/util/concurrent/Executor;Landroidx/camera/core/n0$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/n0;->m:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    new-instance v2, Landroidx/camera/core/j0;

    invoke-direct {v2, p2}, Landroidx/camera/core/j0;-><init>(Landroidx/camera/core/n0$a;)V

    invoke-virtual {v1, p1, v2}, Landroidx/camera/core/q0;->s(Ljava/util/concurrent/Executor;Landroidx/camera/core/n0$a;)V

    .line 3
    iget-object p1, p0, Landroidx/camera/core/n0;->n:Landroidx/camera/core/n0$a;

    if-nez p1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/y2;->r()V

    .line 5
    :cond_0
    iput-object p2, p0, Landroidx/camera/core/n0;->n:Landroidx/camera/core/n0$a;

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(ZLw/p2;)Lw/o2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/p2;",
            ")",
            "Lw/o2<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw/p2$b;->p:Lw/p2$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Lw/p2;->a(Lw/p2$b;I)Lw/o0;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Landroidx/camera/core/n0;->p:Landroidx/camera/core/n0$d;

    invoke-virtual {p1}, Landroidx/camera/core/n0$d;->a()Lw/z0;

    move-result-object p1

    invoke-static {p2, p1}, Lw/n0;->b(Lw/o0;Lw/o0;)Lw/o0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/n0;->n(Lw/o0;)Lw/o2$a;

    move-result-object p1

    invoke-interface {p1}, Lw/o2$a;->b()Lw/o2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public n(Lw/o0;)Lw/o2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o0;",
            ")",
            "Lw/o2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/n0$c;->d(Lw/o0;)Landroidx/camera/core/n0$c;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageAnalysis:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/y2;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/n0;->l:Landroidx/camera/core/q0;

    invoke-virtual {v0}, Landroidx/camera/core/q0;->f()V

    return-void
.end method
