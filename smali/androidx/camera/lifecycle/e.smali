.class public final Landroidx/camera/lifecycle/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final h:Landroidx/camera/lifecycle/e;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Landroidx/camera/core/z$b;

.field private c:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/core/y;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

.field private f:Landroidx/camera/core/y;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/lifecycle/e;

    invoke-direct {v0}, Landroidx/camera/lifecycle/e;-><init>()V

    sput-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/lifecycle/e;->b:Landroidx/camera/core/z$b;

    .line 4
    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->d:Lcom/google/common/util/concurrent/m;

    .line 5
    new-instance v0, Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-direct {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;-><init>()V

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/core/y;Ljava/lang/Void;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/e;->i(Landroidx/camera/core/y;Ljava/lang/Void;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/lifecycle/e;Landroidx/camera/core/y;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/lifecycle/e;->j(Landroidx/camera/core/y;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Landroidx/camera/core/y;)Landroidx/camera/lifecycle/e;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/e;->h(Landroid/content/Context;Landroidx/camera/core/y;)Landroidx/camera/lifecycle/e;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/lifecycle/e;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    new-instance v1, Landroidx/camera/lifecycle/c;

    invoke-direct {v1, p0}, Landroidx/camera/lifecycle/c;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p0

    .line 4
    invoke-static {v0, v1, p0}, Ly/f;->o(Lcom/google/common/util/concurrent/m;Ln/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method private g(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/core/y;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->c:Lcom/google/common/util/concurrent/m;

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    new-instance v1, Landroidx/camera/core/y;

    iget-object v2, p0, Landroidx/camera/lifecycle/e;->b:Landroidx/camera/core/z$b;

    invoke-direct {v1, p1, v2}, Landroidx/camera/core/y;-><init>(Landroid/content/Context;Landroidx/camera/core/z$b;)V

    .line 5
    new-instance p1, Landroidx/camera/lifecycle/b;

    invoke-direct {p1, p0, v1}, Landroidx/camera/lifecycle/b;-><init>(Landroidx/camera/lifecycle/e;Landroidx/camera/core/y;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->c:Lcom/google/common/util/concurrent/m;

    .line 6
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static synthetic h(Landroid/content/Context;Landroidx/camera/core/y;)Landroidx/camera/lifecycle/e;
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    invoke-direct {v0, p1}, Landroidx/camera/lifecycle/e;->k(Landroidx/camera/core/y;)V

    .line 2
    invoke-static {p0}, Landroidx/camera/core/impl/utils/d;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/lifecycle/e;->l(Landroid/content/Context;)V

    return-object v0
.end method

.method private static synthetic i(Landroidx/camera/core/y;Ljava/lang/Void;)Lcom/google/common/util/concurrent/m;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/y;->h()Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method private synthetic j(Landroidx/camera/core/y;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->d:Lcom/google/common/util/concurrent/m;

    .line 3
    invoke-static {v1}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object v1

    new-instance v2, Landroidx/camera/lifecycle/d;

    invoke-direct {v2, p1}, Landroidx/camera/lifecycle/d;-><init>(Landroidx/camera/core/y;)V

    .line 4
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    .line 5
    invoke-virtual {v1, v2, v3}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object v1

    .line 6
    new-instance v2, Landroidx/camera/lifecycle/e$a;

    invoke-direct {v2, p0, p2, p1}, Landroidx/camera/lifecycle/e$a;-><init>(Landroidx/camera/lifecycle/e;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/y;)V

    .line 7
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 8
    invoke-static {v1, v2, p1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "ProcessCameraProvider-initializeCameraX"

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private k(Landroidx/camera/core/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/y;

    return-void
.end method

.method private l(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->g:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method varargs d(Landroidx/lifecycle/l;Landroidx/camera/core/s;Landroidx/camera/core/e3;[Landroidx/camera/core/y2;)Landroidx/camera/core/k;
    .locals 11

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-static {p2}, Landroidx/camera/core/s$a;->c(Landroidx/camera/core/s;)Landroidx/camera/core/s$a;

    move-result-object v0

    .line 3
    array-length v1, p4

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_1

    aget-object v5, p4, v3

    .line 4
    invoke-virtual {v5}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v5

    invoke-interface {v5, v4}, Lw/o2;->y(Landroidx/camera/core/s;)Landroidx/camera/core/s;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 5
    invoke-virtual {v4}, Landroidx/camera/core/s;->c()Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/camera/core/q;

    .line 6
    invoke-virtual {v0, v5}, Landroidx/camera/core/s$a;->a(Landroidx/camera/core/q;)Landroidx/camera/core/s$a;

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Landroidx/camera/core/s$a;->b()Landroidx/camera/core/s;

    move-result-object v0

    .line 8
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/y;

    .line 9
    invoke-virtual {v1}, Landroidx/camera/core/y;->e()Lw/e0;

    move-result-object v1

    invoke-virtual {v1}, Lw/e0;->a()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/s;->a(Ljava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    .line 11
    invoke-static {v0}, Lz/e;->u(Ljava/util/LinkedHashSet;)Lz/e$b;

    move-result-object v1

    .line 12
    iget-object v3, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 13
    invoke-virtual {v3, p1, v1}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->c(Landroidx/lifecycle/l;Lz/e$b;)Landroidx/camera/lifecycle/LifecycleCamera;

    move-result-object v1

    .line 14
    iget-object v3, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 15
    invoke-virtual {v3}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->e()Ljava/util/Collection;

    move-result-object v3

    .line 16
    array-length v5, p4

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_5

    aget-object v7, p4, v6

    .line 17
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/camera/lifecycle/LifecycleCamera;

    .line 18
    invoke-virtual {v9, v7}, Landroidx/camera/lifecycle/LifecycleCamera;->o(Landroidx/camera/core/y2;)Z

    move-result v10

    if-eqz v10, :cond_2

    if-ne v9, v1, :cond_3

    goto :goto_3

    .line 19
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    aput-object v7, p2, v2

    const-string p3, "Use case %s already bound to a different lifecycle."

    .line 20
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    if-nez v1, :cond_6

    .line 21
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    new-instance v2, Lz/e;

    iget-object v3, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/y;

    .line 22
    invoke-virtual {v3}, Landroidx/camera/core/y;->d()Lw/z;

    move-result-object v3

    iget-object v5, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/y;

    .line 23
    invoke-virtual {v5}, Landroidx/camera/core/y;->g()Lw/p2;

    move-result-object v5

    invoke-direct {v2, v0, v3, v5}, Lz/e;-><init>(Ljava/util/LinkedHashSet;Lw/z;Lw/p2;)V

    .line 24
    invoke-virtual {v1, p1, v2}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->b(Landroidx/lifecycle/l;Lz/e;)Landroidx/camera/lifecycle/LifecycleCamera;

    move-result-object v1

    .line 25
    :cond_6
    invoke-virtual {p2}, Landroidx/camera/core/s;->c()Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/q;

    .line 26
    invoke-interface {p2}, Landroidx/camera/core/q;->a()Lw/y0;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/q;->a:Lw/y0;

    if-eq v0, v2, :cond_7

    .line 27
    invoke-interface {p2}, Landroidx/camera/core/q;->a()Lw/y0;

    move-result-object p2

    .line 28
    invoke-static {p2}, Lw/x0;->a(Ljava/lang/Object;)Lw/w;

    move-result-object p2

    .line 29
    invoke-virtual {v1}, Landroidx/camera/lifecycle/LifecycleCamera;->b()Landroidx/camera/core/r;

    move-result-object v0

    iget-object v2, p0, Landroidx/camera/lifecycle/e;->g:Landroid/content/Context;

    .line 30
    invoke-interface {p2, v0, v2}, Lw/w;->a(Landroidx/camera/core/r;Landroid/content/Context;)Lw/t;

    move-result-object p2

    if-nez p2, :cond_8

    goto :goto_4

    :cond_8
    if-nez v4, :cond_9

    move-object v4, p2

    goto :goto_4

    .line 31
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot apply multiple extended camera configs at the same time."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_a
    invoke-virtual {v1, v4}, Landroidx/camera/lifecycle/LifecycleCamera;->g(Lw/t;)V

    .line 33
    array-length p1, p4

    if-nez p1, :cond_b

    return-object v1

    .line 34
    :cond_b
    iget-object p1, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 35
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 36
    invoke-virtual {p1, v1, p3, p2}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->a(Landroidx/camera/lifecycle/LifecycleCamera;Landroidx/camera/core/e3;Ljava/util/Collection;)V

    return-object v1

    .line 37
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Provided camera selector unable to resolve a camera for the given use case"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs e(Landroidx/lifecycle/l;Landroidx/camera/core/s;[Landroidx/camera/core/y2;)Landroidx/camera/core/k;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/camera/lifecycle/e;->d(Landroidx/lifecycle/l;Landroidx/camera/core/s;Landroidx/camera/core/e3;[Landroidx/camera/core/y2;)Landroidx/camera/core/k;

    move-result-object p1

    return-object p1
.end method
