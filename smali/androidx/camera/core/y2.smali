.class public abstract Landroidx/camera/core/y2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/y2$b;,
        Landroidx/camera/core/y2$d;,
        Landroidx/camera/core/y2$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/y2$d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;

.field private c:Landroidx/camera/core/y2$c;

.field private d:Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end field

.field private e:Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end field

.field private f:Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end field

.field private g:Landroid/util/Size;

.field private h:Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end field

.field private i:Landroid/graphics/Rect;

.field private j:Lw/d0;

.field private k:Lw/c2;


# direct methods
.method protected constructor <init>(Lw/o2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/y2;->b:Ljava/lang/Object;

    .line 4
    sget-object v0, Landroidx/camera/core/y2$c;->o:Landroidx/camera/core/y2$c;

    iput-object v0, p0, Landroidx/camera/core/y2;->c:Landroidx/camera/core/y2$c;

    .line 5
    invoke-static {}, Lw/c2;->a()Lw/c2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/y2;->k:Lw/c2;

    .line 6
    iput-object p1, p0, Landroidx/camera/core/y2;->e:Lw/o2;

    .line 7
    iput-object p1, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    return-void
.end method

.method private F(Landroidx/camera/core/y2$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Landroidx/camera/core/y2$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    return-void
.end method

.method protected B(Lw/b0;Lw/o2$a;)Lw/o2;
    .locals 0
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

    invoke-interface {p2}, Lw/o2$a;->b()Lw/o2;

    move-result-object p1

    return-object p1
.end method

.method public C()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/y2;->y()V

    return-void
.end method

.method public D()V
    .locals 0

    return-void
.end method

.method protected abstract E(Landroid/util/Size;)Landroid/util/Size;
.end method

.method public G(Landroid/graphics/Matrix;)V
    .locals 0

    return-void
.end method

.method public H(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/y2;->i:Landroid/graphics/Rect;

    return-void
.end method

.method protected I(Lw/c2;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/camera/core/y2;->k:Lw/c2;

    .line 2
    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/r0;

    .line 3
    invoke-virtual {v0}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/r0;->o(Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public J(Landroid/util/Size;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->E(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/y2;->g:Landroid/util/Size;

    return-void
.end method

.method protected b()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    check-cast v0, Lw/f1;

    const/4 v1, -0x1

    .line 2
    invoke-interface {v0, v1}, Lw/f1;->A(I)I

    move-result v0

    return v0
.end method

.method public c()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y2;->g:Landroid/util/Size;

    return-object v0
.end method

.method public d()Lw/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y2;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/y2;->j:Lw/d0;

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

.method protected e()Lw/y;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y2;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/y2;->j:Lw/d0;

    if-nez v1, :cond_0

    .line 3
    sget-object v1, Lw/y;->a:Lw/y;

    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    invoke-interface {v1}, Lw/d0;->l()Lw/y;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected f()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No camera attached to use case: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/d0;

    .line 2
    invoke-interface {v0}, Lw/d0;->h()Lw/b0;

    move-result-object v0

    invoke-interface {v0}, Lw/b0;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Lw/o2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw/o2<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    return-object v0
.end method

.method public abstract h(ZLw/p2;)Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/p2;",
            ")",
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    invoke-interface {v0}, Lw/d1;->q()I

    move-result v0

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<UnknownUseCase-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lz/i;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected k(Lw/d0;)I
    .locals 1

    .line 1
    invoke-interface {p1}, Lw/d0;->h()Lw/b0;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->m()I

    move-result v0

    .line 3
    invoke-interface {p1, v0}, Landroidx/camera/core/r;->e(I)I

    move-result p1

    return p1
.end method

.method public l()Lw/c2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y2;->k:Lw/c2;

    return-object v0
.end method

.method protected m()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    check-cast v0, Lw/f1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lw/f1;->E(I)I

    move-result v0

    return v0
.end method

.method public abstract n(Lw/o0;)Lw/o2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o0;",
            ")",
            "Lw/o2$a<",
            "***>;"
        }
    .end annotation
.end method

.method public o()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/y2;->i:Landroid/graphics/Rect;

    return-object v0
.end method

.method protected p(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/y2;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public q(Lw/b0;Lw/o2;Lw/o2;)Lw/o2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/b0;",
            "Lw/o2<",
            "*>;",
            "Lw/o2<",
            "*>;)",
            "Lw/o2<",
            "*>;"
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 1
    invoke-static {p3}, Lw/q1;->M(Lw/o0;)Lw/q1;

    move-result-object p3

    .line 2
    sget-object v0, Lz/i;->v:Lw/o0$a;

    invoke-virtual {p3, v0}, Lw/q1;->N(Lw/o0$a;)Ljava/lang/Object;

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object p3

    .line 4
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/y2;->e:Lw/o2;

    invoke-interface {v0}, Lw/a2;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/o0$a;

    .line 5
    iget-object v2, p0, Landroidx/camera/core/y2;->e:Lw/o2;

    .line 6
    invoke-interface {v2, v1}, Lw/a2;->d(Lw/o0$a;)Lw/o0$c;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/core/y2;->e:Lw/o2;

    .line 7
    invoke-interface {v3, v1}, Lw/a2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v3

    .line 8
    invoke-virtual {p3, v1, v2, v3}, Lw/q1;->G(Lw/o0$a;Lw/o0$c;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_3

    .line 9
    invoke-interface {p2}, Lw/a2;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/o0$a;

    .line 10
    invoke-virtual {v1}, Lw/o0$a;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lz/i;->v:Lw/o0$a;

    invoke-virtual {v3}, Lw/o0$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 11
    :cond_2
    invoke-interface {p2, v1}, Lw/a2;->d(Lw/o0$a;)Lw/o0$c;

    move-result-object v2

    .line 12
    invoke-interface {p2, v1}, Lw/a2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v3

    .line 13
    invoke-virtual {p3, v1, v2, v3}, Lw/q1;->G(Lw/o0$a;Lw/o0$c;Ljava/lang/Object;)V

    goto :goto_2

    .line 14
    :cond_3
    sget-object p2, Lw/f1;->j:Lw/o0$a;

    invoke-virtual {p3, p2}, Lw/u1;->e(Lw/o0$a;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lw/f1;->g:Lw/o0$a;

    .line 15
    invoke-virtual {p3, p2}, Lw/u1;->e(Lw/o0$a;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    invoke-virtual {p3, p2}, Lw/q1;->N(Lw/o0$a;)Ljava/lang/Object;

    .line 17
    :cond_4
    invoke-virtual {p0, p3}, Landroidx/camera/core/y2;->n(Lw/o0;)Lw/o2$a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/y2;->B(Lw/b0;Lw/o2$a;)Lw/o2;

    move-result-object p1

    return-object p1
.end method

.method protected final r()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/core/y2$c;->n:Landroidx/camera/core/y2$c;

    iput-object v0, p0, Landroidx/camera/core/y2;->c:Landroidx/camera/core/y2$c;

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->u()V

    return-void
.end method

.method protected final s()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/core/y2$c;->o:Landroidx/camera/core/y2$c;

    iput-object v0, p0, Landroidx/camera/core/y2;->c:Landroidx/camera/core/y2$c;

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->u()V

    return-void
.end method

.method protected final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2$d;

    .line 2
    invoke-interface {v1, p0}, Landroidx/camera/core/y2$d;->e(Landroidx/camera/core/y2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/camera/core/y2$a;->a:[I

    iget-object v1, p0, Landroidx/camera/core/y2;->c:Landroidx/camera/core/y2$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2$d;

    .line 3
    invoke-interface {v1, p0}, Landroidx/camera/core/y2$d;->c(Landroidx/camera/core/y2;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2$d;

    .line 5
    invoke-interface {v1, p0}, Landroidx/camera/core/y2$d;->i(Landroidx/camera/core/y2;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method protected final v()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y2;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/y2$d;

    .line 2
    invoke-interface {v1, p0}, Landroidx/camera/core/y2$d;->j(Landroidx/camera/core/y2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lw/d0;Lw/o2;Lw/o2;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/d0;",
            "Lw/o2<",
            "*>;",
            "Lw/o2<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/y2;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/y2;->j:Lw/d0;

    .line 3
    invoke-direct {p0, p1}, Landroidx/camera/core/y2;->a(Landroidx/camera/core/y2$d;)V

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iput-object p2, p0, Landroidx/camera/core/y2;->d:Lw/o2;

    .line 6
    iput-object p3, p0, Landroidx/camera/core/y2;->h:Lw/o2;

    .line 7
    invoke-interface {p1}, Lw/d0;->h()Lw/b0;

    move-result-object p2

    iget-object p3, p0, Landroidx/camera/core/y2;->d:Lw/o2;

    iget-object v0, p0, Landroidx/camera/core/y2;->h:Lw/o2;

    invoke-virtual {p0, p2, p3, v0}, Landroidx/camera/core/y2;->q(Lw/b0;Lw/o2;Lw/o2;)Lw/o2;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    const/4 p3, 0x0

    .line 8
    invoke-interface {p2, p3}, Lz/m;->D(Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 9
    invoke-interface {p1}, Lw/d0;->h()Lw/b0;

    move-result-object p1

    invoke-interface {p2, p1}, Landroidx/camera/core/y2$b;->b(Landroidx/camera/core/r;)V

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/y2;->x()V

    return-void

    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public x()V
    .locals 0

    return-void
.end method

.method protected y()V
    .locals 0

    return-void
.end method

.method public z(Lw/d0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->A()V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lz/m;->D(Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Landroidx/camera/core/y2$b;->a()V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/y2;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v2, p0, Landroidx/camera/core/y2;->j:Lw/d0;

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Landroidx/core/util/h;->a(Z)V

    .line 6
    iget-object p1, p0, Landroidx/camera/core/y2;->j:Lw/d0;

    invoke-direct {p0, p1}, Landroidx/camera/core/y2;->F(Landroidx/camera/core/y2$d;)V

    .line 7
    iput-object v1, p0, Landroidx/camera/core/y2;->j:Lw/d0;

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iput-object v1, p0, Landroidx/camera/core/y2;->g:Landroid/util/Size;

    .line 10
    iput-object v1, p0, Landroidx/camera/core/y2;->i:Landroid/graphics/Rect;

    .line 11
    iget-object p1, p0, Landroidx/camera/core/y2;->e:Lw/o2;

    iput-object p1, p0, Landroidx/camera/core/y2;->f:Lw/o2;

    .line 12
    iput-object v1, p0, Landroidx/camera/core/y2;->d:Lw/o2;

    .line 13
    iput-object v1, p0, Landroidx/camera/core/y2;->h:Lw/o2;

    return-void

    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
