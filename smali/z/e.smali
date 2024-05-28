.class public final Lz/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/e$a;,
        Lz/e$b;,
        Lz/e$c;
    }
.end annotation


# instance fields
.field private n:Lw/d0;

.field private final o:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lw/d0;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lw/z;

.field private final q:Lw/p2;

.field private final r:Lz/e$b;

.field private final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;"
        }
    .end annotation
.end field

.field private t:Landroidx/camera/core/e3;

.field private u:Lw/t;

.field private final v:Ljava/lang/Object;

.field private w:Z

.field private x:Lw/o0;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Lw/z;Lw/p2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Lw/d0;",
            ">;",
            "Lw/z;",
            "Lw/p2;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/e;->s:Ljava/util/List;

    .line 3
    invoke-static {}, Lw/x;->a()Lw/t;

    move-result-object v0

    iput-object v0, p0, Lz/e;->u:Lw/t;

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lz/e;->w:Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lz/e;->x:Lw/o0;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/e;->y:Ljava/util/List;

    .line 8
    invoke-virtual {p1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/d0;

    iput-object v0, p0, Lz/e;->n:Lw/d0;

    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lz/e;->o:Ljava/util/LinkedHashSet;

    .line 10
    new-instance p1, Lz/e$b;

    invoke-direct {p1, v0}, Lz/e$b;-><init>(Ljava/util/LinkedHashSet;)V

    iput-object p1, p0, Lz/e;->r:Lz/e$b;

    .line 11
    iput-object p2, p0, Lz/e;->p:Lw/z;

    .line 12
    iput-object p3, p0, Lz/e;->q:Lw/p2;

    return-void
.end method

.method private A(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/y2;

    .line 2
    invoke-direct {p0, v3}, Lz/e;->C(Landroidx/camera/core/y2;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, v3}, Lz/e;->B(Landroidx/camera/core/y2;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method private B(Landroidx/camera/core/y2;)Z
    .locals 0

    instance-of p1, p1, Landroidx/camera/core/e1;

    return p1
.end method

.method private C(Landroidx/camera/core/y2;)Z
    .locals 0

    instance-of p1, p1, Landroidx/camera/core/z1;

    return p1
.end method

.method private static synthetic D(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/x2$f;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    .line 2
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method private static synthetic E(Landroidx/camera/core/x2;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/x2;->l()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/x2;->l()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 5
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    .line 6
    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 7
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lz/d;

    invoke-direct {v3, v1, v0}, Lz/d;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    .line 8
    invoke-virtual {p0, v1, v2, v3}, Landroidx/camera/core/x2;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    return-void
.end method

.method private G()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lz/e;->x:Lw/o0;

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    invoke-interface {v1}, Lw/d0;->l()Lw/y;

    move-result-object v1

    iget-object v2, p0, Lz/e;->x:Lw/o0;

    invoke-interface {v1, v2}, Lw/y;->f(Lw/o0;)V

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private I(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/y2;",
            "Landroid/util/Size;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lz/e;->t:Landroidx/camera/core/e3;

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    invoke-interface {v1}, Lw/d0;->h()Lw/b0;

    move-result-object v1

    invoke-interface {v1}, Lw/b0;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    .line 5
    invoke-interface {v1}, Lw/d0;->l()Lw/y;

    move-result-object v1

    invoke-interface {v1}, Lw/y;->g()Landroid/graphics/Rect;

    move-result-object v2

    iget-object v1, p0, Lz/e;->t:Landroidx/camera/core/e3;

    .line 6
    invoke-virtual {v1}, Landroidx/camera/core/e3;->a()Landroid/util/Rational;

    move-result-object v4

    iget-object v1, p0, Lz/e;->n:Lw/d0;

    .line 7
    invoke-interface {v1}, Lw/d0;->h()Lw/b0;

    move-result-object v1

    iget-object v5, p0, Lz/e;->t:Landroidx/camera/core/e3;

    .line 8
    invoke-virtual {v5}, Landroidx/camera/core/e3;->c()I

    move-result v5

    .line 9
    invoke-interface {v1, v5}, Landroidx/camera/core/r;->e(I)I

    move-result v5

    iget-object v1, p0, Lz/e;->t:Landroidx/camera/core/e3;

    .line 10
    invoke-virtual {v1}, Landroidx/camera/core/e3;->d()I

    move-result v6

    iget-object v1, p0, Lz/e;->t:Landroidx/camera/core/e3;

    .line 11
    invoke-virtual {v1}, Landroidx/camera/core/e3;->b()I

    move-result v7

    move-object v8, p1

    .line 12
    invoke-static/range {v2 .. v8}, Lz/n;->a(Landroid/graphics/Rect;ZLandroid/util/Rational;IIILjava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 13
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/y2;

    .line 14
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    invoke-static {v3}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    .line 15
    invoke-virtual {v2, v3}, Landroidx/camera/core/y2;->H(Landroid/graphics/Rect;)V

    .line 16
    iget-object v3, p0, Lz/e;->n:Lw/d0;

    .line 17
    invoke-interface {v3}, Lw/d0;->l()Lw/y;

    move-result-object v3

    invoke-interface {v3}, Lw/y;->g()Landroid/graphics/Rect;

    move-result-object v3

    .line 18
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Size;

    .line 19
    invoke-static {v3, v4}, Lz/e;->o(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;

    move-result-object v3

    .line 20
    invoke-virtual {v2, v3}, Landroidx/camera/core/y2;->G(Landroid/graphics/Matrix;)V

    goto :goto_1

    .line 21
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic c(Landroidx/camera/core/x2;)V
    .locals 0

    invoke-static {p0}, Lz/e;->E(Landroidx/camera/core/x2;)V

    return-void
.end method

.method public static synthetic e(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/x2$f;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lz/e;->D(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/x2$f;)V

    return-void
.end method

.method private m()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    .line 3
    invoke-interface {v1}, Lw/d0;->l()Lw/y;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Lw/y;->c()Lw/o0;

    move-result-object v2

    iput-object v2, p0, Lz/e;->x:Lw/o0;

    .line 5
    invoke-interface {v1}, Lw/y;->e()V

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private n(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2
    invoke-direct {p0, p1}, Lz/e;->A(Ljava/util/List;)Z

    move-result v1

    .line 3
    invoke-direct {p0, p1}, Lz/e;->z(Ljava/util/List;)Z

    move-result p1

    .line 4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    move-object v3, v2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/y2;

    .line 5
    invoke-direct {p0, v4}, Lz/e;->C(Landroidx/camera/core/y2;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v2, v4

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0, v4}, Lz/e;->B(Landroidx/camera/core/y2;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v3, v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    .line 7
    invoke-direct {p0}, Lz/e;->r()Landroidx/camera/core/z1;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-nez v1, :cond_4

    if-eqz v2, :cond_4

    .line 8
    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    if-eqz p1, :cond_5

    if-nez v3, :cond_5

    .line 9
    invoke-direct {p0}, Lz/e;->q()Landroidx/camera/core/e1;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    if-nez p1, :cond_6

    if-eqz v3, :cond_6

    .line 10
    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    return-object v0
.end method

.method private static o(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Cannot compute viewport crop rects zero sized sensor rect."

    .line 2
    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 3
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 4
    new-instance p0, Landroid/graphics/Matrix;

    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 5
    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 6
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 7
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {p0, v1, v0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 8
    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    return-object p0
.end method

.method private p(Lw/b0;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/b0;",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/y2;",
            "Lz/e$c;",
            ">;)",
            "Ljava/util/Map<",
            "Landroidx/camera/core/y2;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p1}, Lw/b0;->c()Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/y2;

    .line 5
    iget-object v4, p0, Lz/e;->p:Lw/z;

    .line 6
    invoke-virtual {v3}, Landroidx/camera/core/y2;->i()I

    move-result v5

    .line 7
    invoke-virtual {v3}, Landroidx/camera/core/y2;->c()Landroid/util/Size;

    move-result-object v6

    .line 8
    invoke-interface {v4, v1, v5, v6}, Lw/z;->a(Ljava/lang/String;ILandroid/util/Size;)Lw/h2;

    move-result-object v4

    .line 9
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {v3}, Landroidx/camera/core/y2;->c()Landroid/util/Size;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    .line 12
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 13
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/y2;

    .line 14
    invoke-interface {p4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz/e$c;

    .line 15
    iget-object v5, v4, Lz/e$c;->a:Lw/o2;

    iget-object v4, v4, Lz/e$c;->b:Lw/o2;

    .line 16
    invoke-virtual {v3, p1, v5, v4}, Landroidx/camera/core/y2;->q(Lw/b0;Lw/o2;Lw/o2;)Lw/o2;

    move-result-object v4

    .line 17
    invoke-interface {p3, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 18
    :cond_1
    iget-object p1, p0, Lz/e;->p:Lw/z;

    new-instance p2, Ljava/util/ArrayList;

    .line 19
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    invoke-interface {p1, v1, v0, p2}, Lw/z;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 21
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 22
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/core/y2;

    .line 23
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/util/Size;

    .line 24
    invoke-interface {v2, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-object v2
.end method

.method private q()Landroidx/camera/core/e1;
    .locals 2

    new-instance v0, Landroidx/camera/core/e1$f;

    invoke-direct {v0}, Landroidx/camera/core/e1$f;-><init>()V

    const-string v1, "ImageCapture-Extra"

    invoke-virtual {v0, v1}, Landroidx/camera/core/e1$f;->i(Ljava/lang/String;)Landroidx/camera/core/e1$f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/e1$f;->c()Landroidx/camera/core/e1;

    move-result-object v0

    return-object v0
.end method

.method private r()Landroidx/camera/core/z1;
    .locals 2

    .line 1
    new-instance v0, Landroidx/camera/core/z1$b;

    invoke-direct {v0}, Landroidx/camera/core/z1$b;-><init>()V

    const-string v1, "Preview-Extra"

    invoke-virtual {v0, v1}, Landroidx/camera/core/z1$b;->i(Ljava/lang/String;)Landroidx/camera/core/z1$b;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/z1$b;->c()Landroidx/camera/core/z1;

    move-result-object v0

    .line 2
    sget-object v1, Lz/c;->a:Lz/c;

    invoke-virtual {v0, v1}, Landroidx/camera/core/z1;->S(Landroidx/camera/core/z1$d;)V

    return-object v0
.end method

.method private s(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 3
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    invoke-interface {v1, p1}, Lw/d0;->f(Ljava/util/Collection;)V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/y2;

    .line 5
    iget-object v3, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    iget-object v3, p0, Lz/e;->n:Lw/d0;

    invoke-virtual {v2, v3}, Landroidx/camera/core/y2;->z(Lw/d0;)V

    goto :goto_0

    :cond_0
    const-string v3, "CameraUseCaseAdapter"

    .line 7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Attempting to detach non-attached UseCase: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 9
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static u(Ljava/util/LinkedHashSet;)Lz/e$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Lw/d0;",
            ">;)",
            "Lz/e$b;"
        }
    .end annotation

    new-instance v0, Lz/e$b;

    invoke-direct {v0, p0}, Lz/e$b;-><init>(Ljava/util/LinkedHashSet;)V

    return-object v0
.end method

.method private w(Ljava/util/List;Lw/p2;Lw/p2;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;",
            "Lw/p2;",
            "Lw/p2;",
            ")",
            "Ljava/util/Map<",
            "Landroidx/camera/core/y2;",
            "Lz/e$c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2;

    .line 3
    new-instance v2, Lz/e$c;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, p2}, Landroidx/camera/core/y2;->h(ZLw/p2;)Lw/o2;

    move-result-object v3

    const/4 v4, 0x1

    .line 4
    invoke-virtual {v1, v4, p3}, Landroidx/camera/core/y2;->h(ZLw/p2;)Lw/o2;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lz/e$c;-><init>(Lw/o2;Lw/o2;)V

    .line 5
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private y()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lz/e;->u:Lw/t;

    invoke-interface {v1}, Lw/t;->F()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private z(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/y2;

    .line 2
    invoke-direct {p0, v3}, Lz/e;->C(Landroidx/camera/core/y2;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, v3}, Lz/e;->B(Landroidx/camera/core/y2;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method


# virtual methods
.method public F(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v1}, Lz/e;->s(Ljava/util/List;)V

    .line 3
    invoke-direct {p0}, Lz/e;->y()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lz/e;->y:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz/e;->i(Ljava/util/Collection;)V
    :try_end_1
    .catch Lz/e$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 6
    :catch_0
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to add extra fake Preview or ImageCapture use case!"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public H(Landroidx/camera/core/e3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Lz/e;->t:Landroidx/camera/core/e3;

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lz/e;->n:Lw/d0;

    invoke-interface {v0, p1}, Lw/d0;->a(Z)V

    return-void
.end method

.method public b()Landroidx/camera/core/r;
    .locals 1

    iget-object v0, p0, Lz/e;->n:Lw/d0;

    invoke-interface {v0}, Lw/d0;->h()Lw/b0;

    move-result-object v0

    return-object v0
.end method

.method public g(Lw/t;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    if-nez p1, :cond_0

    .line 2
    :try_start_0
    invoke-static {}, Lw/x;->a()Lw/t;

    move-result-object p1

    .line 3
    :cond_0
    iget-object v1, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lz/e;->u:Lw/t;

    invoke-interface {v1}, Lw/t;->s()Lw/y0;

    move-result-object v1

    .line 4
    invoke-interface {p1}, Lw/t;->s()Lw/y0;

    move-result-object v2

    .line 5
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Need to unbind all use cases before binding with extension enabled"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    :goto_0
    iput-object p1, p0, Lz/e;->u:Lw/t;

    .line 8
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    invoke-interface {v1, p1}, Lw/d0;->g(Lw/t;)V

    .line 9
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/y2;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lz/e$a;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/y2;

    .line 4
    iget-object v4, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v3, "CameraUseCaseAdapter"

    const-string v4, "Attempting to attach already attached UseCase"

    .line 5
    invoke-static {v3, v4}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lz/e;->s:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 9
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 10
    invoke-direct {p0}, Lz/e;->y()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 11
    iget-object v3, p0, Lz/e;->y:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lz/e;->y:Ljava/util/List;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v2, v3}, Lz/e;->n(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    iget-object v4, p0, Lz/e;->y:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 16
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    new-instance v4, Ljava/util/ArrayList;

    iget-object v2, p0, Lz/e;->y:Ljava/util/List;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    invoke-interface {v4, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 19
    :cond_2
    iget-object v2, p0, Lz/e;->u:Lw/t;

    .line 20
    invoke-interface {v2}, Lw/t;->h()Lw/p2;

    move-result-object v2

    iget-object v5, p0, Lz/e;->q:Lw/p2;

    .line 21
    invoke-direct {p0, v1, v2, v5}, Lz/e;->w(Ljava/util/List;Lw/p2;Lw/p2;)Ljava/util/Map;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    new-instance v5, Ljava/util/ArrayList;

    iget-object v6, p0, Lz/e;->s:Ljava/util/List;

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    invoke-interface {v5, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 24
    iget-object v6, p0, Lz/e;->n:Lw/d0;

    .line 25
    invoke-interface {v6}, Lw/d0;->h()Lw/b0;

    move-result-object v6

    invoke-direct {p0, v6, v1, v5, v2}, Lz/e;->p(Lw/b0;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :try_start_2
    invoke-direct {p0, v5, p1}, Lz/e;->I(Ljava/util/Map;Ljava/util/Collection;)V

    .line 27
    iput-object v3, p0, Lz/e;->y:Ljava/util/List;

    .line 28
    invoke-direct {p0, v4}, Lz/e;->s(Ljava/util/List;)V

    .line 29
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/y2;

    .line 30
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz/e$c;

    .line 31
    iget-object v6, p0, Lz/e;->n:Lw/d0;

    iget-object v7, v4, Lz/e$c;->a:Lw/o2;

    iget-object v4, v4, Lz/e$c;->b:Lw/o2;

    invoke-virtual {v3, v6, v7, v4}, Landroidx/camera/core/y2;->w(Lw/d0;Lw/o2;Lw/o2;)V

    .line 32
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Size;

    invoke-static {v4}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Size;

    .line 33
    invoke-virtual {v3, v4}, Landroidx/camera/core/y2;->J(Landroid/util/Size;)V

    goto :goto_1

    .line 34
    :cond_3
    iget-object p1, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    iget-boolean p1, p0, Lz/e;->w:Z

    if-eqz p1, :cond_4

    .line 36
    iget-object p1, p0, Lz/e;->n:Lw/d0;

    invoke-interface {p1, v1}, Lw/d0;->d(Ljava/util/Collection;)V

    .line 37
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2;

    .line 38
    invoke-virtual {v1}, Landroidx/camera/core/y2;->u()V

    goto :goto_2

    .line 39
    :cond_5
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    .line 40
    new-instance v1, Lz/e$a;

    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lz/e$a;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lz/e;->w:Z

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    iget-object v2, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {v1, v2}, Lw/d0;->d(Ljava/util/Collection;)V

    .line 4
    invoke-direct {p0}, Lz/e;->G()V

    .line 5
    iget-object v1, p0, Lz/e;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/y2;

    .line 6
    invoke-virtual {v2}, Landroidx/camera/core/y2;->u()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lz/e;->w:Z

    .line 8
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public t()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lz/e;->w:Z

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lz/e;->n:Lw/d0;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lz/e;->s:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, v2}, Lw/d0;->f(Ljava/util/Collection;)V

    .line 4
    invoke-direct {p0}, Lz/e;->m()V

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lz/e;->w:Z

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public v()Lz/e$b;
    .locals 1

    iget-object v0, p0, Lz/e;->r:Lz/e$b;

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/y2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz/e;->v:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lz/e;->s:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
