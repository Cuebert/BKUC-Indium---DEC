.class final Landroidx/camera/camera2/internal/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/r1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/h2$e;,
        Landroidx/camera/camera2/internal/h2$d;
    }
.end annotation


# static fields
.field private static r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field

.field private static s:I


# instance fields
.field private final a:Lw/d2;

.field private final b:Landroidx/camera/camera2/internal/j0;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Landroidx/camera/camera2/internal/q1;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lw/c2;

.field private h:Landroidx/camera/camera2/internal/b1;

.field private i:Lw/c2;

.field private j:Z

.field private k:Landroidx/camera/camera2/internal/h2$d;

.field private volatile l:Lw/k0;

.field volatile m:Z

.field private final n:Landroidx/camera/camera2/internal/h2$e;

.field private o:Lv/j;

.field private p:Lv/j;

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/h2;->r:Ljava/util/List;

    const/4 v0, 0x0

    .line 2
    sput v0, Landroidx/camera/camera2/internal/h2;->s:I

    return-void
.end method

.method constructor <init>(Lw/d2;Landroidx/camera/camera2/internal/j0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->f:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->j:Z

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    .line 5
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->m:Z

    .line 6
    new-instance v1, Lv/j$a;

    invoke-direct {v1}, Lv/j$a;-><init>()V

    invoke-virtual {v1}, Lv/j$a;->d()Lv/j;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->o:Lv/j;

    .line 7
    new-instance v1, Lv/j$a;

    invoke-direct {v1}, Lv/j$a;-><init>()V

    .line 8
    invoke-virtual {v1}, Lv/j$a;->d()Lv/j;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->p:Lv/j;

    .line 9
    iput v0, p0, Landroidx/camera/camera2/internal/h2;->q:I

    .line 10
    new-instance v0, Landroidx/camera/camera2/internal/q1;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/q1;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->e:Landroidx/camera/camera2/internal/q1;

    .line 11
    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    .line 12
    iput-object p2, p0, Landroidx/camera/camera2/internal/h2;->b:Landroidx/camera/camera2/internal/j0;

    .line 13
    iput-object p3, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/Executor;

    .line 14
    iput-object p4, p0, Landroidx/camera/camera2/internal/h2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    sget-object p1, Landroidx/camera/camera2/internal/h2$d;->n:Landroidx/camera/camera2/internal/h2$d;

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    .line 16
    new-instance p1, Landroidx/camera/camera2/internal/h2$e;

    invoke-direct {p1, p3}, Landroidx/camera/camera2/internal/h2$e;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->n:Landroidx/camera/camera2/internal/h2$e;

    .line 17
    sget p1, Landroidx/camera/camera2/internal/h2;->s:I

    add-int/lit8 p2, p1, 0x1

    sput p2, Landroidx/camera/camera2/internal/h2;->s:I

    iput p1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "New ProcessingCaptureSession (id="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ProcessingCaptureSession"

    invoke-static {p2, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Landroidx/camera/camera2/internal/h2;Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/h2;->q(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;Ljava/util/List;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/camera/camera2/internal/h2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/h2;->o()V

    return-void
.end method

.method public static synthetic j(Lw/r0;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/h2;->p(Lw/r0;)V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/camera2/internal/h2;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/h2;->r(Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private static l(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/k0;

    .line 2
    invoke-virtual {v0}, Lw/k0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/h;

    .line 3
    invoke-virtual {v1}, Lw/h;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static m(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;)",
            "Ljava/util/List<",
            "Lw/e2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/r0;

    .line 3
    instance-of v2, v1, Lw/e2;

    const-string v3, "Surface must be SessionProcessorSurface"

    invoke-static {v2, v3}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 4
    check-cast v1, Lw/e2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private n(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/k0;

    .line 3
    invoke-virtual {v0}, Lw/k0;->g()I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private synthetic o()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->f:Ljava/util/List;

    invoke-static {v0}, Lw/w0;->e(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic p(Lw/r0;)V
    .locals 1

    sget-object v0, Landroidx/camera/camera2/internal/h2;->r:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic q(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;Ljava/util/List;)Lcom/google/common/util/concurrent/m;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-- getSurfaces done, start init (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ProcessingCaptureSession"

    invoke-static {v2, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    sget-object v3, Landroidx/camera/camera2/internal/h2$d;->r:Landroidx/camera/camera2/internal/h2$d;

    if-ne v0, v3, :cond_0

    .line 3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SessionProcessorCaptureSession is closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/r0;

    .line 6
    new-instance p2, Lw/r0$a;

    const-string p3, "Surface closed"

    invoke-direct {p2, p3, p1}, Lw/r0$a;-><init>(Ljava/lang/String;Lw/r0;)V

    invoke-static {p2}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    :try_start_0
    iget-object p4, p0, Landroidx/camera/camera2/internal/h2;->f:Ljava/util/List;

    invoke-static {p4}, Lw/w0;->f(Ljava/util/List;)V
    :try_end_0
    .catch Lw/r0$a; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p4, 0x0

    move-object v3, v0

    move-object v4, v3

    const/4 v5, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    .line 9
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw/r0;

    .line 10
    invoke-virtual {v6}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/z1;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 11
    invoke-virtual {v6}, Lw/r0;->h()Lcom/google/common/util/concurrent/m;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    .line 12
    invoke-virtual {v6}, Lw/r0;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 13
    invoke-virtual {v6}, Lw/r0;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 14
    invoke-virtual {v6}, Lw/r0;->g()I

    move-result v6

    .line 15
    invoke-static {v0, v7, v6}, Lw/v1;->a(Landroid/view/Surface;Landroid/util/Size;I)Lw/v1;

    move-result-object v0

    goto :goto_1

    .line 16
    :cond_2
    invoke-virtual {v6}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/e1;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 17
    invoke-virtual {v6}, Lw/r0;->h()Lcom/google/common/util/concurrent/m;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    .line 18
    invoke-virtual {v6}, Lw/r0;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 19
    invoke-virtual {v6}, Lw/r0;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 20
    invoke-virtual {v6}, Lw/r0;->g()I

    move-result v6

    .line 21
    invoke-static {v3, v7, v6}, Lw/v1;->a(Landroid/view/Surface;Landroid/util/Size;I)Lw/v1;

    move-result-object v3

    goto :goto_1

    .line 22
    :cond_3
    invoke-virtual {v6}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/n0;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 23
    invoke-virtual {v6}, Lw/r0;->h()Lcom/google/common/util/concurrent/m;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    .line 24
    invoke-virtual {v6}, Lw/r0;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 25
    invoke-virtual {v6}, Lw/r0;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 26
    invoke-virtual {v6}, Lw/r0;->g()I

    move-result v6

    .line 27
    invoke-static {v4, v7, v6}, Lw/v1;->a(Landroid/view/Surface;Landroid/util/Size;I)Lw/v1;

    move-result-object v4

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 28
    :cond_5
    sget-object v5, Landroidx/camera/camera2/internal/h2$d;->o:Landroidx/camera/camera2/internal/h2$d;

    iput-object v5, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "== initSession (id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    iget-object v2, p0, Landroidx/camera/camera2/internal/h2;->b:Landroidx/camera/camera2/internal/j0;

    invoke-interface {v1, v2, v0, v3, v4}, Lw/d2;->a(Landroidx/camera/core/r;Lw/v1;Lw/v1;Lw/v1;)Lw/c2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->i:Lw/c2;

    .line 31
    invoke-virtual {v0}, Lw/c2;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lw/r0;

    invoke-virtual {p4}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object p4

    new-instance v0, Landroidx/camera/camera2/internal/d2;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/d2;-><init>(Landroidx/camera/camera2/internal/h2;)V

    .line 32
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 33
    invoke-interface {p4, v0, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 34
    iget-object p4, p0, Landroidx/camera/camera2/internal/h2;->i:Lw/c2;

    invoke-virtual {p4}, Lw/c2;->j()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/r0;

    .line 35
    sget-object v1, Landroidx/camera/camera2/internal/h2;->r:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual {v0}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v1

    new-instance v2, Landroidx/camera/camera2/internal/e2;

    invoke-direct {v2, v0}, Landroidx/camera/camera2/internal/e2;-><init>(Lw/r0;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v0}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    .line 37
    :cond_6
    new-instance p4, Lw/c2$f;

    invoke-direct {p4}, Lw/c2$f;-><init>()V

    .line 38
    invoke-virtual {p4, p1}, Lw/c2$f;->a(Lw/c2;)V

    .line 39
    invoke-virtual {p4}, Lw/c2$f;->c()V

    .line 40
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->i:Lw/c2;

    invoke-virtual {p4, p1}, Lw/c2$f;->a(Lw/c2;)V

    .line 41
    invoke-virtual {p4}, Lw/c2$f;->d()Z

    move-result p1

    const-string v0, "Cannot transform the SessionConfig"

    invoke-static {p1, v0}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 42
    invoke-virtual {p4}, Lw/c2$f;->b()Lw/c2;

    move-result-object p1

    .line 43
    iget-object p4, p0, Landroidx/camera/camera2/internal/h2;->e:Landroidx/camera/camera2/internal/q1;

    .line 44
    invoke-static {p2}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    .line 45
    invoke-virtual {p4, p1, p2, p3}, Landroidx/camera/camera2/internal/q1;->f(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 46
    new-instance p2, Landroidx/camera/camera2/internal/h2$a;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/h2$a;-><init>(Landroidx/camera/camera2/internal/h2;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    return-object p1

    :catch_0
    move-exception p1

    .line 47
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic r(Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->e:Landroidx/camera/camera2/internal/q1;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/h2;->s(Landroidx/camera/camera2/internal/q1;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private t(Lv/j;Lv/j;)V
    .locals 1

    .line 1
    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lq/a$a;->d(Lw/o0;)Lq/a$a;

    .line 3
    invoke-virtual {v0, p2}, Lq/a$a;->d(Lw/o0;)Lq/a$a;

    .line 4
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lw/d2;->d(Lw/o0;)V

    return-void
.end method


# virtual methods
.method public a(Z)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    sget-object v1, Landroidx/camera/camera2/internal/h2$d;->r:Landroidx/camera/camera2/internal/h2$d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "release() can only be called in CLOSED state"

    invoke-static {v0, v1}, Landroidx/core/util/h;->i(ZLjava/lang/String;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "release (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->e:Landroidx/camera/camera2/internal/q1;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/q1;->a(Z)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Lw/k0;

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_9

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/h2;->n(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 3
    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    if-nez v0, :cond_8

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->m:Z

    if-eqz v0, :cond_2

    goto/16 :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/k0;

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "issueCaptureRequests (id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") + state ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ProcessingCaptureSession"

    invoke-static {v3, v2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    sget-object v2, Landroidx/camera/camera2/internal/h2$c;->a:[I

    iget-object v4, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    if-eq v2, v1, :cond_7

    const/4 v4, 0x2

    if-eq v2, v4, :cond_7

    const/4 v4, 0x3

    if-eq v2, v4, :cond_4

    const/4 v0, 0x4

    if-eq v2, v0, :cond_3

    const/4 v0, 0x5

    if-eq v2, v0, :cond_3

    goto/16 :goto_0

    .line 7
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Run issueCaptureRequests in wrong state, state = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {p1}, Landroidx/camera/camera2/internal/h2;->l(Ljava/util/List;)V

    goto :goto_0

    .line 9
    :cond_4
    iput-boolean v1, p0, Landroidx/camera/camera2/internal/h2;->m:Z

    .line 10
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object p1

    .line 11
    invoke-static {p1}, Lv/j$a;->e(Lw/o0;)Lv/j$a;

    move-result-object p1

    .line 12
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object v1

    sget-object v2, Lw/k0;->h:Lw/o0$a;

    invoke-interface {v1, v2}, Lw/o0;->e(Lw/o0$a;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 14
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object v3

    invoke-interface {v3, v2}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 15
    invoke-virtual {p1, v1, v2}, Lv/j$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/j$a;

    .line 16
    :cond_5
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object v1

    sget-object v2, Lw/k0;->i:Lw/o0$a;

    invoke-interface {v1, v2}, Lw/o0;->e(Lw/o0$a;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 17
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 18
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object v3

    invoke-interface {v3, v2}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->byteValue()B

    move-result v2

    .line 20
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    .line 21
    invoke-virtual {p1, v1, v2}, Lv/j$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/j$a;

    .line 22
    :cond_6
    invoke-virtual {p1}, Lv/j$a;->d()Lv/j;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->p:Lv/j;

    .line 23
    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->o:Lv/j;

    invoke-direct {p0, v1, p1}, Landroidx/camera/camera2/internal/h2;->t(Lv/j;Lv/j;)V

    .line 24
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    new-instance v1, Landroidx/camera/camera2/internal/h2$b;

    invoke-direct {v1, p0, v0}, Landroidx/camera/camera2/internal/h2$b;-><init>(Landroidx/camera/camera2/internal/h2;Lw/k0;)V

    invoke-interface {p1, v1}, Lw/d2;->e(Lw/d2$a;)I

    goto :goto_0

    .line 25
    :cond_7
    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    :goto_0
    return-void

    .line 26
    :cond_8
    :goto_1
    invoke-static {p1}, Landroidx/camera/camera2/internal/h2;->l(Ljava/util/List;)V

    return-void

    .line 27
    :cond_9
    :goto_2
    invoke-static {p1}, Landroidx/camera/camera2/internal/h2;->l(Ljava/util/List;)V

    return-void
.end method

.method public close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Landroidx/camera/camera2/internal/h2$c;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    invoke-interface {v0}, Lw/d2;->f()V

    .line 4
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->h:Landroidx/camera/camera2/internal/b1;

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/b1;->a()V

    .line 6
    :cond_2
    sget-object v0, Landroidx/camera/camera2/internal/h2$d;->q:Landroidx/camera/camera2/internal/h2$d;

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    .line 7
    :cond_3
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    invoke-interface {v0}, Lw/d2;->g()V

    .line 8
    :goto_0
    sget-object v0, Landroidx/camera/camera2/internal/h2$d;->r:Landroidx/camera/camera2/internal/h2$d;

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    .line 9
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->e:Landroidx/camera/camera2/internal/q1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/q1;->close()V

    return-void
.end method

.method public d()Lw/c2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->g:Lw/c2;

    return-object v0
.end method

.method public e()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cancelIssuedCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    invoke-virtual {v0}, Lw/k0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/h;

    .line 4
    invoke-virtual {v1}, Lw/h;->a()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    :cond_1
    return-void
.end method

.method public f(Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)Lcom/google/common/util/concurrent/m;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/c2;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Landroidx/camera/camera2/internal/v2;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    sget-object v1, Landroidx/camera/camera2/internal/h2$d;->n:Landroidx/camera/camera2/internal/h2$d;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state state:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "SessionConfig contains no surfaces"

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/camera2/internal/h2;->f:Ljava/util/List;

    const/4 v3, 0x0

    const-wide/16 v4, 0x1388

    .line 5
    iget-object v6, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Landroidx/camera/camera2/internal/h2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    invoke-static/range {v2 .. v7}, Lw/w0;->k(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    invoke-static {v0}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/g2;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/camera2/internal/g2;-><init>(Landroidx/camera/camera2/internal/h2;Lw/c2;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/v2;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/Executor;

    .line 7
    invoke-virtual {v0, v1, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    new-instance p2, Landroidx/camera/camera2/internal/f2;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/f2;-><init>(Landroidx/camera/camera2/internal/h2;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/Executor;

    .line 8
    invoke-virtual {p1, p2, p3}, Ly/d;->e(Ln/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    return-object p1
.end method

.method public g(Lw/c2;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSessionConfig (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->g:Lw/c2;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->h:Landroidx/camera/camera2/internal/b1;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/b1;->b(Lw/c2;)V

    .line 5
    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    sget-object v1, Landroidx/camera/camera2/internal/h2$d;->p:Landroidx/camera/camera2/internal/h2$d;

    if-ne v0, v1, :cond_2

    .line 6
    invoke-virtual {p1}, Lw/c2;->d()Lw/o0;

    move-result-object p1

    invoke-static {p1}, Lv/j$a;->e(Lw/o0;)Lv/j$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lv/j$a;->d()Lv/j;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->o:Lv/j;

    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->p:Lv/j;

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/h2;->t(Lv/j;Lv/j;)V

    .line 9
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/h2;->j:Z

    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->n:Landroidx/camera/camera2/internal/h2$e;

    invoke-interface {p1, v0}, Lw/d2;->b(Lw/d2$a;)I

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/h2;->j:Z

    :cond_2
    return-void
.end method

.method s(Landroidx/camera/camera2/internal/q1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    sget-object v1, Landroidx/camera/camera2/internal/h2$d;->o:Landroidx/camera/camera2/internal/h2$d;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid state state:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 2
    new-instance v0, Landroidx/camera/camera2/internal/b1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->i:Lw/c2;

    .line 3
    invoke-virtual {v1}, Lw/c2;->j()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Landroidx/camera/camera2/internal/h2;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroidx/camera/camera2/internal/b1;-><init>(Landroidx/camera/camera2/internal/q1;Ljava/util/List;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->h:Landroidx/camera/camera2/internal/b1;

    .line 4
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Lw/d2;

    invoke-interface {p1, v0}, Lw/d2;->c(Lw/b2;)V

    .line 5
    sget-object p1, Landroidx/camera/camera2/internal/h2$d;->p:Landroidx/camera/camera2/internal/h2$d;

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->k:Landroidx/camera/camera2/internal/h2$d;

    .line 6
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->g:Lw/c2;

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/h2;->g(Lw/c2;)V

    .line 8
    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    if-eqz p1, :cond_2

    new-array p1, v2, [Lw/k0;

    .line 9
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    aput-object v0, p1, v3

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->l:Lw/k0;

    .line 11
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/h2;->c(Ljava/util/List;)V

    :cond_2
    return-void
.end method
