.class public final Landroidx/camera/core/z1;
.super Landroidx/camera/core/y2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/z1$b;,
        Landroidx/camera/core/z1$c;,
        Landroidx/camera/core/z1$d;
    }
.end annotation


# static fields
.field public static final r:Landroidx/camera/core/z1$c;

.field private static final s:Ljava/util/concurrent/Executor;


# instance fields
.field private l:Landroidx/camera/core/z1$d;

.field private m:Ljava/util/concurrent/Executor;

.field private n:Lw/r0;

.field o:Landroidx/camera/core/x2;

.field private p:Z

.field private q:Landroid/util/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/z1$c;

    invoke-direct {v0}, Landroidx/camera/core/z1$c;-><init>()V

    sput-object v0, Landroidx/camera/core/z1;->r:Landroidx/camera/core/z1$c;

    .line 2
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z1;->s:Ljava/util/concurrent/Executor;

    return-void
.end method

.method constructor <init>(Lw/w1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/y2;-><init>(Lw/o2;)V

    .line 2
    sget-object p1, Landroidx/camera/core/z1;->s:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Landroidx/camera/core/z1;->m:Ljava/util/concurrent/Executor;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Landroidx/camera/core/z1;->p:Z

    return-void
.end method

.method public static synthetic K(Landroidx/camera/core/z1;Ljava/lang/String;Lw/w1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/z1;->O(Ljava/lang/String;Lw/w1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V

    return-void
.end method

.method public static synthetic L(Landroidx/camera/core/z1$d;Landroidx/camera/core/x2;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/z1;->P(Landroidx/camera/core/z1$d;Landroidx/camera/core/x2;)V

    return-void
.end method

.method private N(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->o()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->o()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic O(Ljava/lang/String;Lw/w1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->p(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/z1;->M(Ljava/lang/String;Lw/w1;Landroid/util/Size;)Lw/c2$b;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lw/c2$b;->m()Lw/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/y2;->t()V

    :cond_0
    return-void
.end method

.method private static synthetic P(Landroidx/camera/core/z1$d;Landroidx/camera/core/x2;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/z1$d;->a(Landroidx/camera/core/x2;)V

    return-void
.end method

.method private Q()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/z1;->o:Landroidx/camera/core/x2;

    .line 2
    iget-object v1, p0, Landroidx/camera/core/z1;->l:Landroidx/camera/core/z1$d;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 3
    iget-object v2, p0, Landroidx/camera/core/z1;->m:Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/camera/core/x1;

    invoke-direct {v3, v1, v0}, Landroidx/camera/core/x1;-><init>(Landroidx/camera/core/z1$d;Landroidx/camera/core/x2;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private R()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v0

    .line 2
    iget-object v1, p0, Landroidx/camera/core/z1;->l:Landroidx/camera/core/z1$d;

    .line 3
    iget-object v2, p0, Landroidx/camera/core/z1;->q:Landroid/util/Size;

    invoke-direct {p0, v2}, Landroidx/camera/core/z1;->N(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v2

    .line 4
    iget-object v3, p0, Landroidx/camera/core/z1;->o:Landroidx/camera/core/x2;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/camera/core/y2;->k(Lw/d0;)I

    move-result v0

    invoke-virtual {p0}, Landroidx/camera/core/y2;->b()I

    move-result v1

    .line 6
    invoke-static {v2, v0, v1}, Landroidx/camera/core/x2$g;->d(Landroid/graphics/Rect;II)Landroidx/camera/core/x2$g;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroidx/camera/core/x2;->x(Landroidx/camera/core/x2$g;)V

    :cond_0
    return-void
.end method

.method private U(Ljava/lang/String;Lw/w1;Landroid/util/Size;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/z1;->M(Ljava/lang/String;Lw/w1;Landroid/util/Size;)Lw/c2$b;

    move-result-object p1

    invoke-virtual {p1}, Lw/c2$b;->m()Lw/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/z1;->n:Lw/r0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lw/r0;->c()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/core/z1;->o:Landroidx/camera/core/x2;

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
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/w1;->B:Lw/o0$a;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/d1;->f:Lw/o0$a;

    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/d1;->f:Lw/o0$a;

    const/16 v1, 0x22

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 5
    invoke-interface {p1, v0, v1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 6
    :goto_0
    invoke-interface {p2}, Lw/o2$a;->b()Lw/o2;

    move-result-object p1

    return-object p1
.end method

.method protected E(Landroid/util/Size;)Landroid/util/Size;
    .locals 3

    .line 1
    iput-object p1, p0, Landroidx/camera/core/z1;->q:Landroid/util/Size;

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v1

    check-cast v1, Lw/w1;

    iget-object v2, p0, Landroidx/camera/core/z1;->q:Landroid/util/Size;

    invoke-direct {p0, v0, v1, v2}, Landroidx/camera/core/z1;->U(Ljava/lang/String;Lw/w1;Landroid/util/Size;)V

    return-object p1
.end method

.method public H(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/camera/core/y2;->H(Landroid/graphics/Rect;)V

    .line 2
    invoke-direct {p0}, Landroidx/camera/core/z1;->R()V

    return-void
.end method

.method M(Ljava/lang/String;Lw/w1;Landroid/util/Size;)Lw/c2$b;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-static/range {p2 .. p2}, Lw/c2$b;->o(Lw/o2;)Lw/c2$b;

    move-result-object v3

    const/4 v4, 0x0

    .line 3
    invoke-virtual {v1, v4}, Lw/w1;->H(Lw/l0;)Lw/l0;

    move-result-object v11

    .line 4
    iget-object v5, v0, Landroidx/camera/core/z1;->n:Lw/r0;

    if-eqz v5, :cond_0

    .line 5
    invoke-virtual {v5}, Lw/r0;->c()V

    :cond_0
    const/4 v5, 0x0

    .line 6
    invoke-virtual {v1, v5}, Lw/w1;->J(Z)Z

    move-result v5

    .line 7
    new-instance v6, Landroidx/camera/core/x2;

    invoke-virtual/range {p0 .. p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v7

    invoke-direct {v6, v2, v7, v5}, Landroidx/camera/core/x2;-><init>(Landroid/util/Size;Lw/d0;Z)V

    .line 8
    iput-object v6, v0, Landroidx/camera/core/z1;->o:Landroidx/camera/core/x2;

    .line 9
    invoke-direct/range {p0 .. p0}, Landroidx/camera/core/z1;->Q()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 10
    invoke-direct/range {p0 .. p0}, Landroidx/camera/core/z1;->R()V

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    .line 11
    iput-boolean v5, v0, Landroidx/camera/core/z1;->p:Z

    :goto_0
    if-eqz v11, :cond_2

    .line 12
    new-instance v4, Lw/m0$a;

    invoke-direct {v4}, Lw/m0$a;-><init>()V

    .line 13
    new-instance v14, Landroid/os/HandlerThread;

    const-string v5, "CameraX-preview_processing"

    invoke-direct {v14, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v14}, Landroid/os/HandlerThread;->start()V

    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v15

    .line 16
    new-instance v13, Landroidx/camera/core/i2;

    .line 17
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    move-result v7

    .line 18
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    move-result v8

    .line 19
    invoke-virtual/range {p2 .. p2}, Lw/w1;->q()I

    move-result v9

    new-instance v10, Landroid/os/Handler;

    .line 20
    invoke-virtual {v14}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v10, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    invoke-virtual {v6}, Landroidx/camera/core/x2;->k()Lw/r0;

    move-result-object v12

    move-object v5, v13

    move v6, v7

    move v7, v8

    move v8, v9

    move-object v9, v10

    move-object v10, v4

    move-object/from16 v16, v13

    move-object v13, v15

    invoke-direct/range {v5 .. v13}, Landroidx/camera/core/i2;-><init>(IIILandroid/os/Handler;Lw/m0;Lw/l0;Lw/r0;Ljava/lang/String;)V

    .line 22
    invoke-virtual/range {v16 .. v16}, Landroidx/camera/core/i2;->r()Lw/h;

    move-result-object v5

    .line 23
    invoke-virtual {v3, v5}, Lw/c2$b;->d(Lw/h;)V

    .line 24
    invoke-virtual/range {v16 .. v16}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v5

    new-instance v6, Landroidx/camera/core/w1;

    invoke-direct {v6, v14}, Landroidx/camera/core/w1;-><init>(Landroid/os/HandlerThread;)V

    .line 25
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v7

    .line 26
    invoke-interface {v5, v6, v7}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move-object/from16 v5, v16

    .line 27
    iput-object v5, v0, Landroidx/camera/core/z1;->n:Lw/r0;

    .line 28
    invoke-interface {v4}, Lw/m0;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v15, v4}, Lw/c2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 29
    :cond_2
    invoke-virtual {v1, v4}, Lw/w1;->I(Lw/b1;)Lw/b1;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 30
    new-instance v5, Landroidx/camera/core/z1$a;

    invoke-direct {v5, v0, v4}, Landroidx/camera/core/z1$a;-><init>(Landroidx/camera/core/z1;Lw/b1;)V

    invoke-virtual {v3, v5}, Lw/c2$b;->d(Lw/h;)V

    .line 31
    :cond_3
    invoke-virtual {v6}, Landroidx/camera/core/x2;->k()Lw/r0;

    move-result-object v4

    iput-object v4, v0, Landroidx/camera/core/z1;->n:Lw/r0;

    .line 32
    :goto_1
    iget-object v4, v0, Landroidx/camera/core/z1;->n:Lw/r0;

    invoke-virtual {v3, v4}, Lw/c2$b;->k(Lw/r0;)V

    .line 33
    new-instance v4, Landroidx/camera/core/y1;

    move-object/from16 v5, p1

    invoke-direct {v4, v0, v5, v1, v2}, Landroidx/camera/core/y1;-><init>(Landroidx/camera/core/z1;Ljava/lang/String;Lw/w1;Landroid/util/Size;)V

    invoke-virtual {v3, v4}, Lw/c2$b;->f(Lw/c2$c;)V

    return-object v3
.end method

.method public S(Landroidx/camera/core/z1$d;)V
    .locals 1

    sget-object v0, Landroidx/camera/core/z1;->s:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/z1;->T(Ljava/util/concurrent/Executor;Landroidx/camera/core/z1$d;)V

    return-void
.end method

.method public T(Ljava/util/concurrent/Executor;Landroidx/camera/core/z1$d;)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/camera/core/z1;->l:Landroidx/camera/core/z1$d;

    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/y2;->s()V

    goto :goto_0

    .line 4
    :cond_0
    iput-object p2, p0, Landroidx/camera/core/z1;->l:Landroidx/camera/core/z1$d;

    .line 5
    iput-object p1, p0, Landroidx/camera/core/z1;->m:Ljava/util/concurrent/Executor;

    .line 6
    invoke-virtual {p0}, Landroidx/camera/core/y2;->r()V

    .line 7
    iget-boolean p1, p0, Landroidx/camera/core/z1;->p:Z

    if-eqz p1, :cond_1

    .line 8
    invoke-direct {p0}, Landroidx/camera/core/z1;->Q()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-direct {p0}, Landroidx/camera/core/z1;->R()V

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Landroidx/camera/core/z1;->p:Z

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->c()Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/y2;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object p2

    check-cast p2, Lw/w1;

    .line 13
    invoke-virtual {p0}, Landroidx/camera/core/y2;->c()Landroid/util/Size;

    move-result-object v0

    .line 14
    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/core/z1;->U(Ljava/lang/String;Lw/w1;Landroid/util/Size;)V

    .line 15
    invoke-virtual {p0}, Landroidx/camera/core/y2;->t()V

    :cond_2
    :goto_0
    return-void
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
    sget-object v0, Lw/p2$b;->o:Lw/p2$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Lw/p2;->a(Lw/p2$b;I)Lw/o0;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Landroidx/camera/core/z1;->r:Landroidx/camera/core/z1$c;

    invoke-virtual {p1}, Landroidx/camera/core/z1$c;->a()Lw/w1;

    move-result-object p1

    invoke-static {p2, p1}, Lw/n0;->b(Lw/o0;Lw/o0;)Lw/o0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/z1;->n(Lw/o0;)Lw/o2$a;

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

    invoke-static {p1}, Landroidx/camera/core/z1$b;->d(Lw/o0;)Landroidx/camera/core/z1$b;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/y2;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
