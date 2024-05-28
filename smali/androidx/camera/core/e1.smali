.class public final Landroidx/camera/core/e1;
.super Landroidx/camera/core/y2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/e1$f;,
        Landroidx/camera/core/e1$h;,
        Landroidx/camera/core/e1$g;,
        Landroidx/camera/core/e1$i;
    }
.end annotation


# static fields
.field public static final I:Landroidx/camera/core/e1$g;

.field static final J:Lc0/a;


# instance fields
.field A:Landroidx/camera/core/l2;

.field B:Landroidx/camera/core/d2;

.field private C:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private D:Lw/h;

.field private E:Lw/r0;

.field private F:Landroidx/camera/core/e1$i;

.field final G:Ljava/util/concurrent/Executor;

.field private H:Landroid/graphics/Matrix;

.field private final l:Lw/h1$a;

.field final m:Ljava/util/concurrent/Executor;

.field private final n:I

.field private final o:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final p:I

.field private q:I

.field private r:Landroid/util/Rational;

.field private s:Ljava/util/concurrent/ExecutorService;

.field private t:Lw/k0;

.field private u:Lw/j0;

.field private v:I

.field private w:Lw/l0;

.field private x:Z

.field private y:Z

.field z:Lw/c2$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/e1$g;

    invoke-direct {v0}, Landroidx/camera/core/e1$g;-><init>()V

    sput-object v0, Landroidx/camera/core/e1;->I:Landroidx/camera/core/e1$g;

    .line 2
    new-instance v0, Lc0/a;

    invoke-direct {v0}, Lc0/a;-><init>()V

    sput-object v0, Landroidx/camera/core/e1;->J:Lc0/a;

    return-void
.end method

.method constructor <init>(Lw/a1;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/y2;-><init>(Lw/o2;)V

    .line 2
    sget-object p1, Landroidx/camera/core/c1;->a:Landroidx/camera/core/c1;

    iput-object p1, p0, Landroidx/camera/core/e1;->l:Lw/h1$a;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Landroidx/camera/core/e1;->q:I

    .line 5
    iput-object v0, p0, Landroidx/camera/core/e1;->r:Landroid/util/Rational;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Landroidx/camera/core/e1;->x:Z

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Landroidx/camera/core/e1;->y:Z

    .line 8
    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/e1;->C:Lcom/google/common/util/concurrent/m;

    .line 9
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/e1;->H:Landroid/graphics/Matrix;

    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/a1;

    .line 11
    sget-object v2, Lw/a1;->A:Lw/o0$a;

    invoke-virtual {v0, v2}, Lw/a1;->e(Lw/o0$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 12
    invoke-virtual {v0}, Lw/a1;->I()I

    move-result v1

    iput v1, p0, Landroidx/camera/core/e1;->n:I

    goto :goto_0

    .line 13
    :cond_0
    iput v1, p0, Landroidx/camera/core/e1;->n:I

    .line 14
    :goto_0
    invoke-virtual {v0, p1}, Lw/a1;->L(I)I

    move-result p1

    iput p1, p0, Landroidx/camera/core/e1;->p:I

    .line 15
    invoke-static {}, Lx/a;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw/a1;->N(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 16
    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Landroidx/camera/core/e1;->m:Ljava/util/concurrent/Executor;

    .line 17
    invoke-static {p1}, Lx/a;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/e1;->G:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic K(Landroidx/camera/core/e1$h;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/e1;->h0(Landroidx/camera/core/e1$h;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic L(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/e1;->k0(Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static synthetic M(Lcom/google/common/util/concurrent/m;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/e1;->m0(Lcom/google/common/util/concurrent/m;)V

    return-void
.end method

.method public static synthetic N(Landroidx/camera/core/e1;Landroidx/camera/core/e1$h;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/e1;->n0(Landroidx/camera/core/e1$h;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Landroidx/concurrent/futures/c$a;Lw/h1;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/e1;->l0(Landroidx/concurrent/futures/c$a;Lw/h1;)V

    return-void
.end method

.method public static synthetic P(Landroidx/camera/core/e1;Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/e1;->f0(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lw/h1;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/e1;->j0(Lw/h1;)V

    return-void
.end method

.method public static synthetic R(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/e1;->i0(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Landroidx/camera/core/e1;Ljava/lang/String;Lw/a1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/e1;->g0(Ljava/lang/String;Lw/a1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V

    return-void
.end method

.method private T()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->F:Landroidx/camera/core/e1$i;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroidx/camera/core/l;

    const-string v1, "Camera is closed."

    invoke-direct {v0, v1}, Landroidx/camera/core/l;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Landroidx/camera/core/e1;->F:Landroidx/camera/core/e1$i;

    invoke-virtual {v1, v0}, Landroidx/camera/core/e1$i;->a(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method static V(Landroid/graphics/Rect;Landroid/util/Rational;ILandroid/util/Size;I)Landroid/graphics/Rect;
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-static {p0, p2, p3, p4}, Ld0/a;->b(Landroid/graphics/Rect;ILandroid/util/Size;I)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_2

    .line 2
    rem-int/lit16 p4, p4, 0xb4

    if-eqz p4, :cond_1

    .line 3
    new-instance p0, Landroid/util/Rational;

    .line 4
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result p2

    .line 5
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    move-result p1

    invoke-direct {p0, p2, p1}, Landroid/util/Rational;-><init>(II)V

    move-object p1, p0

    .line 6
    :cond_1
    invoke-static {p3, p1}, Ld0/a;->f(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 7
    invoke-static {p3, p1}, Ld0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0

    .line 8
    :cond_2
    new-instance p0, Landroid/graphics/Rect;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p2

    const/4 p3, 0x0

    invoke-direct {p0, p3, p3, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p0
.end method

.method static X(Lw/p1;)Z
    .locals 7

    .line 1
    sget-object v0, Lw/a1;->H:Lw/o0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    .line 2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1a

    const-string v6, "ImageCapture"

    if-ge v4, v5, :cond_0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Software JPEG only supported on API 26+, but current API level is "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 4
    :cond_0
    sget-object v4, Lw/a1;->E:Lw/o0$a;

    const/4 v5, 0x0

    invoke-interface {p0, v4, v5}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    .line 5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x100

    if-eq v4, v5, :cond_1

    const-string v2, "Software JPEG cannot be used with non-JPEG output buffer format."

    .line 6
    invoke-static {v6, v2}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-nez v3, :cond_2

    const-string v2, "Unable to support software JPEG. Disabling."

    .line 7
    invoke-static {v6, v2}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-interface {p0, v0, v1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    :cond_2
    return v3
.end method

.method private Y(Lw/j0;)Lw/j0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->u:Lw/j0;

    invoke-interface {v0}, Lw/j0;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v0}, Landroidx/camera/core/a0;->a(Ljava/util/List;)Lw/j0;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method static a0(Ljava/lang/Throwable;)I
    .locals 1

    .line 1
    instance-of v0, p0, Landroidx/camera/core/l;

    if-eqz v0, :cond_0

    const/4 p0, 0x3

    return p0

    .line 2
    :cond_0
    instance-of v0, p0, Landroidx/camera/core/h1;

    if-eqz v0, :cond_1

    .line 3
    check-cast p0, Landroidx/camera/core/h1;

    invoke-virtual {p0}, Landroidx/camera/core/h1;->a()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private c0()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/a1;

    .line 2
    sget-object v1, Lw/a1;->J:Lw/o0$a;

    invoke-virtual {v0, v1}, Lw/a1;->e(Lw/o0$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lw/a1;->O()I

    move-result v0

    return v0

    .line 4
    :cond_0
    iget v0, p0, Landroidx/camera/core/e1;->n:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CaptureMode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/core/e1;->n:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is invalid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/16 v0, 0x5f

    return v0

    :cond_3
    const/16 v0, 0x64

    return v0
.end method

.method private static d0(Ljava/util/List;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;I)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 2
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method private synthetic f0(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/e1;->q0(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic g0(Ljava/lang/String;Lw/a1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/e1;->U()V

    .line 2
    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->p(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/e1;->W(Ljava/lang/String;Lw/a1;Landroid/util/Size;)Lw/c2$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/e1;->z:Lw/c2$b;

    .line 4
    invoke-virtual {p1}, Lw/c2$b;->m()Lw/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/y2;->t()V

    :cond_0
    return-void
.end method

.method private static synthetic h0(Landroidx/camera/core/e1$h;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Processing image failed! "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageCapture"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Landroidx/camera/core/e1$h;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static synthetic i0(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic j0(Lw/h1;)V
    .locals 3

    const-string v0, "ImageCapture"

    .line 1
    :try_start_0
    invoke-interface {p0}, Lw/h1;->c()Landroidx/camera/core/l1;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_1

    .line 3
    :try_start_2
    invoke-interface {p0}, Landroidx/camera/core/l1;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    if-eqz p0, :cond_0

    .line 4
    :try_start_3
    invoke-interface {p0}, Landroidx/camera/core/l1;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    const-string v1, "Failed to acquire latest image."

    .line 5
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return-void
.end method

.method private static synthetic k0(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method private static synthetic l0(Landroidx/concurrent/futures/c$a;Lw/h1;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p1}, Lw/h1;->c()Landroidx/camera/core/l1;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to acquire image"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private static synthetic m0(Lcom/google/common/util/concurrent/m;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method private synthetic n0(Landroidx/camera/core/e1$h;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    new-instance v1, Landroidx/camera/core/b1;

    invoke-direct {v1, p2}, Landroidx/camera/core/b1;-><init>(Landroidx/concurrent/futures/c$a;)V

    .line 2
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    .line 3
    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/l2;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    .line 4
    invoke-direct {p0}, Landroidx/camera/core/e1;->o0()V

    .line 5
    invoke-virtual {p0, p1}, Landroidx/camera/core/e1;->e0(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 6
    new-instance v0, Landroidx/camera/core/e1$d;

    invoke-direct {v0, p0, p2}, Landroidx/camera/core/e1$d;-><init>(Landroidx/camera/core/e1;Landroidx/concurrent/futures/c$a;)V

    iget-object v1, p0, Landroidx/camera/core/e1;->s:Ljava/util/concurrent/ExecutorService;

    invoke-static {p1, v0, v1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 7
    new-instance v0, Landroidx/camera/core/y0;

    invoke-direct {v0, p1}, Landroidx/camera/core/y0;-><init>(Lcom/google/common/util/concurrent/m;)V

    .line 8
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 9
    invoke-virtual {p2, v0, p1}, Landroidx/concurrent/futures/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    const-string p1, "takePictureInternal"

    return-object p1
.end method

.method private o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Landroidx/camera/core/e1;->b0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private q0(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/e1$h;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/core/l1;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/x0;

    invoke-direct {v0, p0, p1}, Landroidx/camera/core/x0;-><init>(Landroidx/camera/core/e1;Landroidx/camera/core/e1$h;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private r0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/y2;->e()Lw/y;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/e1;->b0()I

    move-result v2

    invoke-interface {v1, v2}, Lw/y;->h(I)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->C:Lcom/google/common/util/concurrent/m;

    .line 2
    invoke-direct {p0}, Landroidx/camera/core/e1;->T()V

    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/e1;->U()V

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/camera/core/e1;->x:Z

    .line 5
    iget-object v1, p0, Landroidx/camera/core/e1;->s:Ljava/util/concurrent/ExecutorService;

    .line 6
    new-instance v2, Landroidx/camera/core/z0;

    invoke-direct {v2, v1}, Landroidx/camera/core/z0;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 7
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 8
    invoke-interface {v0, v2, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method protected B(Lw/b0;Lw/o2$a;)Lw/o2;
    .locals 7
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
    invoke-interface {p2}, Lw/o2$a;->b()Lw/o2;

    move-result-object v0

    sget-object v1, Lw/a1;->D:Lw/o0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lw/a2;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "ImageCapture"

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v0, v4, :cond_0

    const-string p1, "Requesting software JPEG due to a CaptureProcessor is set."

    .line 2
    invoke-static {v3, p1}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/a1;->H:Lw/o0$a;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v3}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Lw/b0;->g()Lw/y1;

    move-result-object p1

    const-class v0, Lb0/e;

    invoke-virtual {p1, v0}, Lw/y1;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/a1;->H:Lw/o0$a;

    .line 6
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    invoke-interface {p1, v0, v4}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    .line 8
    invoke-static {v3, p1}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "Requesting software JPEG due to device quirk."

    .line 9
    invoke-static {v3, p1}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    invoke-interface {p1, v0, v4}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 11
    :cond_2
    :goto_0
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    invoke-static {p1}, Landroidx/camera/core/e1;->X(Lw/p1;)Z

    move-result p1

    .line 12
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object v0

    sget-object v3, Lw/a1;->E:Lw/o0$a;

    invoke-interface {v0, v3, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x23

    if-eqz v0, :cond_5

    .line 13
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object v6

    invoke-interface {v6, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    const-string v2, "Cannot set buffer format with CaptureProcessor defined."

    .line 14
    invoke-static {v1, v2}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 15
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object v1

    sget-object v2, Lw/d1;->f:Lw/o0$a;

    if-eqz p1, :cond_4

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 17
    invoke-interface {v1, v2, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_4

    .line 18
    :cond_5
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    if-eqz p1, :cond_6

    goto :goto_3

    .line 19
    :cond_6
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/f1;->m:Lw/o0$a;

    invoke-interface {p1, v0, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/16 v0, 0x100

    if-nez p1, :cond_7

    .line 20
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v1, Lw/d1;->f:Lw/o0$a;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_4

    .line 21
    :cond_7
    invoke-static {p1, v0}, Landroidx/camera/core/e1;->d0(Ljava/util/List;I)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 22
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v1, Lw/d1;->f:Lw/o0$a;

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 24
    invoke-interface {p1, v1, v0}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_4

    .line 25
    :cond_8
    invoke-static {p1, v5}, Landroidx/camera/core/e1;->d0(Ljava/util/List;I)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 26
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/d1;->f:Lw/o0$a;

    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 28
    invoke-interface {p1, v0, v1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_4

    .line 29
    :cond_9
    :goto_3
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/d1;->f:Lw/o0$a;

    .line 30
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 31
    invoke-interface {p1, v0, v1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 32
    :cond_a
    :goto_4
    invoke-interface {p2}, Landroidx/camera/core/h0;->a()Lw/p1;

    move-result-object p1

    sget-object v0, Lw/a1;->F:Lw/o0$a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lt p1, v4, :cond_b

    const/4 v3, 0x1

    :cond_b
    const-string p1, "Maximum outstanding image count must be at least 1"

    .line 33
    invoke-static {v3, p1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 34
    invoke-interface {p2}, Lw/o2$a;->b()Lw/o2;

    move-result-object p1

    return-object p1
.end method

.method public D()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/e1;->T()V

    return-void
.end method

.method protected E(Landroid/util/Size;)Landroid/util/Size;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->f()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v1

    check-cast v1, Lw/a1;

    .line 3
    invoke-virtual {p0, v0, v1, p1}, Landroidx/camera/core/e1;->W(Ljava/lang/String;Lw/a1;Landroid/util/Size;)Lw/c2$b;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/e1;->z:Lw/c2$b;

    .line 4
    invoke-virtual {v0}, Lw/c2$b;->m()Lw/c2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/y2;->r()V

    return-object p1
.end method

.method public G(Landroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/e1;->H:Landroid/graphics/Matrix;

    return-void
.end method

.method U()V
    .locals 4

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/e1;->F:Landroidx/camera/core/e1$i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v3, "Request is canceled."

    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroidx/camera/core/e1$i;->a(Ljava/lang/Throwable;)V

    .line 4
    iput-object v1, p0, Landroidx/camera/core/e1;->F:Landroidx/camera/core/e1$i;

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/e1;->E:Lw/r0;

    .line 6
    iput-object v1, p0, Landroidx/camera/core/e1;->E:Lw/r0;

    .line 7
    iput-object v1, p0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    .line 8
    iput-object v1, p0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    .line 9
    invoke-static {v1}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/e1;->C:Lcom/google/common/util/concurrent/m;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lw/r0;->c()V

    :cond_1
    return-void
.end method

.method W(Ljava/lang/String;Lw/a1;Landroid/util/Size;)Lw/c2$b;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p3

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-static/range {p2 .. p2}, Lw/c2$b;->o(Lw/o2;)Lw/c2$b;

    move-result-object v2

    .line 3
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x2

    const/16 v5, 0x17

    if-lt v3, v5, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/e1;->Z()I

    move-result v5

    if-ne v5, v4, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/y2;->e()Lw/y;

    move-result-object v5

    invoke-interface {v5, v1, v2}, Lw/y;->a(Landroid/util/Size;Lw/c2$b;)V

    .line 5
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lw/a1;->M()Landroidx/camera/core/m1;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    .line 6
    new-instance v3, Landroidx/camera/core/l2;

    .line 7
    invoke-virtual/range {p2 .. p2}, Lw/a1;->M()Landroidx/camera/core/m1;

    move-result-object v7

    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 8
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v10

    const/4 v11, 0x2

    const-wide/16 v12, 0x0

    .line 9
    invoke-interface/range {v7 .. v13}, Landroidx/camera/core/m1;->a(IIIIJ)Lw/h1;

    move-result-object v5

    invoke-direct {v3, v5}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    iput-object v3, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    .line 10
    new-instance v3, Landroidx/camera/core/e1$a;

    invoke-direct {v3, p0}, Landroidx/camera/core/e1$a;-><init>(Landroidx/camera/core/e1;)V

    iput-object v3, v0, Landroidx/camera/core/e1;->D:Lw/h;

    goto/16 :goto_1

    .line 11
    :cond_1
    iget-boolean v5, v0, Landroidx/camera/core/e1;->y:Z

    const/16 v7, 0x1a

    const/16 v8, 0x100

    if-eqz v5, :cond_5

    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v5

    if-ne v5, v8, :cond_2

    .line 13
    new-instance v3, Landroidx/camera/core/d;

    .line 14
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    move-result v5

    .line 15
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    move-result v7

    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v8

    .line 16
    invoke-static {v5, v7, v8, v4}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v5

    invoke-direct {v3, v5}, Landroidx/camera/core/d;-><init>(Landroid/media/ImageReader;)V

    move-object v5, v6

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v5

    const/16 v9, 0x23

    if-ne v5, v9, :cond_4

    if-lt v3, v7, :cond_3

    .line 18
    new-instance v3, Lz/p;

    .line 19
    invoke-direct {p0}, Landroidx/camera/core/e1;->c0()I

    move-result v5

    invoke-direct {v3, v5, v4}, Lz/p;-><init>(II)V

    .line 20
    new-instance v5, Landroidx/camera/core/v1;

    .line 21
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    move-result v7

    .line 22
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    move-result v10

    .line 23
    invoke-static {v7, v10, v9, v4}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v7

    invoke-direct {v5, v7}, Landroidx/camera/core/v1;-><init>(Landroid/media/ImageReader;)V

    .line 24
    invoke-static {}, Landroidx/camera/core/a0;->c()Lw/j0;

    move-result-object v7

    .line 25
    new-instance v9, Landroidx/camera/core/d2$e;

    invoke-direct {v9, v5, v7, v3}, Landroidx/camera/core/d2$e;-><init>(Lw/h1;Lw/j0;Lw/l0;)V

    iget-object v10, v0, Landroidx/camera/core/e1;->s:Ljava/util/concurrent/ExecutorService;

    .line 26
    invoke-virtual {v9, v10}, Landroidx/camera/core/d2$e;->c(Ljava/util/concurrent/Executor;)Landroidx/camera/core/d2$e;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroidx/camera/core/d2$e;->b(I)Landroidx/camera/core/d2$e;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/camera/core/d2$e;->a()Landroidx/camera/core/d2;

    move-result-object v8

    .line 27
    invoke-static {}, Lw/r1;->f()Lw/r1;

    move-result-object v9

    .line 28
    invoke-virtual {v8}, Landroidx/camera/core/d2;->p()Ljava/lang/String;

    move-result-object v10

    .line 29
    invoke-interface {v7}, Lw/j0;->a()Ljava/util/List;

    move-result-object v7

    const/4 v11, 0x0

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lw/m0;

    invoke-interface {v7}, Lw/m0;->b()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 30
    invoke-virtual {v9, v10, v7}, Lw/r1;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    invoke-virtual {v5, v9}, Landroidx/camera/core/v1;->o(Lw/j2;)V

    move-object v5, v3

    move-object v3, v8

    .line 32
    :goto_0
    new-instance v7, Landroidx/camera/core/e1$b;

    invoke-direct {v7, p0}, Landroidx/camera/core/e1$b;-><init>(Landroidx/camera/core/e1;)V

    iput-object v7, v0, Landroidx/camera/core/e1;->D:Lw/h;

    .line 33
    new-instance v7, Landroidx/camera/core/l2;

    invoke-direct {v7, v3}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    iput-object v7, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    goto/16 :goto_5

    .line 34
    :cond_3
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Does not support API level < 26"

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 35
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported image format:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 36
    :cond_5
    iget-object v5, v0, Landroidx/camera/core/e1;->w:Lw/l0;

    if-nez v5, :cond_7

    iget-boolean v9, v0, Landroidx/camera/core/e1;->x:Z

    if-eqz v9, :cond_6

    goto :goto_2

    .line 37
    :cond_6
    new-instance v3, Landroidx/camera/core/t1;

    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    move-result v5

    .line 38
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    move-result v7

    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v8

    invoke-direct {v3, v5, v7, v8, v4}, Landroidx/camera/core/t1;-><init>(IIII)V

    .line 39
    invoke-virtual {v3}, Landroidx/camera/core/t1;->o()Lw/h;

    move-result-object v5

    iput-object v5, v0, Landroidx/camera/core/e1;->D:Lw/h;

    .line 40
    new-instance v5, Landroidx/camera/core/l2;

    invoke-direct {v5, v3}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    iput-object v5, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    :goto_1
    move-object v5, v6

    goto/16 :goto_5

    .line 41
    :cond_7
    :goto_2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v10

    .line 42
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v9

    .line 43
    iget-boolean v11, v0, Landroidx/camera/core/e1;->x:Z

    if-eqz v11, :cond_a

    if-lt v3, v7, :cond_9

    const-string v3, "ImageCapture"

    const-string v5, "Using software JPEG encoder."

    .line 44
    invoke-static {v3, v5}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v3, v0, Landroidx/camera/core/e1;->w:Lw/l0;

    if-eqz v3, :cond_8

    .line 46
    new-instance v3, Lz/p;

    invoke-direct {p0}, Landroidx/camera/core/e1;->c0()I

    move-result v5

    iget v7, v0, Landroidx/camera/core/e1;->v:I

    invoke-direct {v3, v5, v7}, Lz/p;-><init>(II)V

    .line 47
    new-instance v5, Landroidx/camera/core/g0;

    iget-object v7, v0, Landroidx/camera/core/e1;->w:Lw/l0;

    iget v9, v0, Landroidx/camera/core/e1;->v:I

    iget-object v11, v0, Landroidx/camera/core/e1;->s:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v5, v7, v9, v3, v11}, Landroidx/camera/core/g0;-><init>(Lw/l0;ILw/l0;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    .line 48
    :cond_8
    new-instance v3, Lz/p;

    .line 49
    invoke-direct {p0}, Landroidx/camera/core/e1;->c0()I

    move-result v5

    iget v7, v0, Landroidx/camera/core/e1;->v:I

    invoke-direct {v3, v5, v7}, Lz/p;-><init>(II)V

    move-object v5, v3

    :goto_3
    move-object v13, v5

    move-object v5, v3

    const/16 v3, 0x100

    goto :goto_4

    .line 50
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Software JPEG only supported on API 26+"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    move-object v13, v5

    move-object v5, v6

    move v3, v9

    .line 51
    :goto_4
    new-instance v14, Landroidx/camera/core/d2$e;

    .line 52
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 53
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    move-result v9

    iget v11, v0, Landroidx/camera/core/e1;->v:I

    .line 54
    invoke-static {}, Landroidx/camera/core/a0;->c()Lw/j0;

    move-result-object v7

    invoke-direct {p0, v7}, Landroidx/camera/core/e1;->Y(Lw/j0;)Lw/j0;

    move-result-object v12

    move-object v7, v14

    invoke-direct/range {v7 .. v13}, Landroidx/camera/core/d2$e;-><init>(IIIILw/j0;Lw/l0;)V

    iget-object v7, v0, Landroidx/camera/core/e1;->s:Ljava/util/concurrent/ExecutorService;

    .line 55
    invoke-virtual {v14, v7}, Landroidx/camera/core/d2$e;->c(Ljava/util/concurrent/Executor;)Landroidx/camera/core/d2$e;

    move-result-object v7

    invoke-virtual {v7, v3}, Landroidx/camera/core/d2$e;->b(I)Landroidx/camera/core/d2$e;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/d2$e;->a()Landroidx/camera/core/d2;

    move-result-object v3

    iput-object v3, v0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    .line 56
    invoke-virtual {v3}, Landroidx/camera/core/d2;->n()Lw/h;

    move-result-object v3

    iput-object v3, v0, Landroidx/camera/core/e1;->D:Lw/h;

    .line 57
    new-instance v3, Landroidx/camera/core/l2;

    iget-object v7, v0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    invoke-direct {v3, v7}, Landroidx/camera/core/l2;-><init>(Lw/h1;)V

    iput-object v3, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    .line 58
    :goto_5
    iget-object v3, v0, Landroidx/camera/core/e1;->F:Landroidx/camera/core/e1$i;

    if-eqz v3, :cond_b

    .line 59
    new-instance v7, Ljava/util/concurrent/CancellationException;

    const-string v8, "Request is canceled."

    invoke-direct {v7, v8}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Landroidx/camera/core/e1$i;->a(Ljava/lang/Throwable;)V

    .line 60
    :cond_b
    new-instance v3, Landroidx/camera/core/e1$i;

    new-instance v7, Landroidx/camera/core/v0;

    invoke-direct {v7, p0}, Landroidx/camera/core/v0;-><init>(Landroidx/camera/core/e1;)V

    if-nez v5, :cond_c

    move-object v8, v6

    goto :goto_6

    .line 61
    :cond_c
    new-instance v8, Landroidx/camera/core/e1$c;

    invoke-direct {v8, p0, v5}, Landroidx/camera/core/e1$c;-><init>(Landroidx/camera/core/e1;Lz/p;)V

    :goto_6
    invoke-direct {v3, v4, v7, v8}, Landroidx/camera/core/e1$i;-><init>(ILandroidx/camera/core/e1$i$b;Landroidx/camera/core/e1$i$c;)V

    iput-object v3, v0, Landroidx/camera/core/e1;->F:Landroidx/camera/core/e1$i;

    .line 62
    iget-object v3, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    iget-object v4, v0, Landroidx/camera/core/e1;->l:Lw/h1$a;

    .line 63
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v5

    .line 64
    invoke-virtual {v3, v4, v5}, Landroidx/camera/core/l2;->e(Lw/h1$a;Ljava/util/concurrent/Executor;)V

    .line 65
    iget-object v3, v0, Landroidx/camera/core/e1;->E:Lw/r0;

    if-eqz v3, :cond_d

    .line 66
    invoke-virtual {v3}, Lw/r0;->c()V

    .line 67
    :cond_d
    new-instance v3, Lw/i1;

    iget-object v4, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    .line 68
    invoke-virtual {v4}, Landroidx/camera/core/l2;->a()Landroid/view/Surface;

    move-result-object v4

    new-instance v5, Landroid/util/Size;

    iget-object v7, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    invoke-virtual {v7}, Landroidx/camera/core/l2;->g()I

    move-result v7

    iget-object v8, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    .line 69
    invoke-virtual {v8}, Landroidx/camera/core/l2;->getHeight()I

    move-result v8

    invoke-direct {v5, v7, v8}, Landroid/util/Size;-><init>(II)V

    iget-object v7, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    invoke-virtual {v7}, Landroidx/camera/core/l2;->d()I

    move-result v7

    invoke-direct {v3, v4, v5, v7}, Lw/i1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v3, v0, Landroidx/camera/core/e1;->E:Lw/r0;

    .line 70
    iget-object v3, v0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Landroidx/camera/core/d2;->o()Lcom/google/common/util/concurrent/m;

    move-result-object v3

    goto :goto_7

    .line 71
    :cond_e
    invoke-static {v6}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v3

    :goto_7
    iput-object v3, v0, Landroidx/camera/core/e1;->C:Lcom/google/common/util/concurrent/m;

    .line 72
    iget-object v3, v0, Landroidx/camera/core/e1;->E:Lw/r0;

    invoke-virtual {v3}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v3

    iget-object v4, v0, Landroidx/camera/core/e1;->A:Landroidx/camera/core/l2;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Landroidx/camera/camera2/internal/c3;

    invoke-direct {v5, v4}, Landroidx/camera/camera2/internal/c3;-><init>(Landroidx/camera/core/l2;)V

    .line 73
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v4

    .line 74
    invoke-interface {v3, v5, v4}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 75
    iget-object v3, v0, Landroidx/camera/core/e1;->E:Lw/r0;

    invoke-virtual {v2, v3}, Lw/c2$b;->h(Lw/r0;)V

    .line 76
    new-instance v3, Landroidx/camera/core/d1;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-direct {v3, p0, v4, v5, v1}, Landroidx/camera/core/d1;-><init>(Landroidx/camera/core/e1;Ljava/lang/String;Lw/a1;Landroid/util/Size;)V

    invoke-virtual {v2, v3}, Lw/c2$b;->f(Lw/c2$c;)V

    return-object v2
.end method

.method public Z()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/e1;->n:I

    return v0
.end method

.method public b0()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Landroidx/camera/core/e1;->q:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v1

    check-cast v1, Lw/a1;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lw/a1;->K(I)I

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method e0(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/e1$h;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "ImageCapture"

    const-string v1, "issueTakePicture"

    .line 1
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    .line 4
    invoke-static {}, Landroidx/camera/core/a0;->c()Lw/j0;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/camera/core/e1;->Y(Lw/j0;)Lw/j0;

    move-result-object v1

    if-nez v1, :cond_0

    .line 5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ImageCapture cannot set empty CaptureBundle."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    iget-object v3, p0, Landroidx/camera/core/e1;->w:Lw/l0;

    if-nez v3, :cond_1

    invoke-interface {v1}, Lw/j0;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_1

    .line 7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No CaptureProcessor can be found to process the images captured for multiple CaptureStages."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 8
    :cond_1
    invoke-interface {v1}, Lw/j0;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Landroidx/camera/core/e1;->v:I

    if-le v2, v3, :cond_2

    .line 9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ImageCapture has CaptureStages > Max CaptureStage size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    .line 10
    :cond_2
    iget-object v2, p0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    invoke-virtual {v2, v1}, Landroidx/camera/core/d2;->u(Lw/j0;)V

    .line 11
    iget-object v2, p0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    .line 12
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Landroidx/camera/core/w0;

    invoke-direct {v4, p1}, Landroidx/camera/core/w0;-><init>(Landroidx/camera/core/e1$h;)V

    .line 13
    invoke-virtual {v2, v3, v4}, Landroidx/camera/core/d2;->v(Ljava/util/concurrent/Executor;Landroidx/camera/core/d2$f;)V

    .line 14
    iget-object v2, p0, Landroidx/camera/core/e1;->B:Landroidx/camera/core/d2;

    invoke-virtual {v2}, Landroidx/camera/core/d2;->p()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 15
    :cond_3
    invoke-static {}, Landroidx/camera/core/a0;->c()Lw/j0;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/camera/core/e1;->Y(Lw/j0;)Lw/j0;

    move-result-object v1

    .line 16
    invoke-interface {v1}, Lw/j0;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_4

    .line 17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ImageCapture have no CaptureProcess set with CaptureBundle size > 1."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {v1}, Lw/j0;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/m0;

    .line 19
    new-instance v4, Lw/k0$a;

    invoke-direct {v4}, Lw/k0$a;-><init>()V

    .line 20
    iget-object v5, p0, Landroidx/camera/core/e1;->t:Lw/k0;

    invoke-virtual {v5}, Lw/k0;->g()I

    move-result v5

    invoke-virtual {v4, v5}, Lw/k0$a;->p(I)V

    .line 21
    iget-object v5, p0, Landroidx/camera/core/e1;->t:Lw/k0;

    invoke-virtual {v5}, Lw/k0;->d()Lw/o0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lw/k0$a;->e(Lw/o0;)V

    .line 22
    iget-object v5, p0, Landroidx/camera/core/e1;->z:Lw/c2$b;

    .line 23
    invoke-virtual {v5}, Lw/c2$b;->p()Ljava/util/List;

    move-result-object v5

    .line 24
    invoke-virtual {v4, v5}, Lw/k0$a;->a(Ljava/util/Collection;)V

    .line 25
    iget-object v5, p0, Landroidx/camera/core/e1;->E:Lw/r0;

    invoke-virtual {v4, v5}, Lw/k0$a;->f(Lw/r0;)V

    .line 26
    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v5

    const/16 v6, 0x100

    if-ne v5, v6, :cond_6

    .line 27
    sget-object v5, Landroidx/camera/core/e1;->J:Lc0/a;

    invoke-virtual {v5}, Lc0/a;->a()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 28
    sget-object v5, Lw/k0;->h:Lw/o0$a;

    iget v6, p1, Landroidx/camera/core/e1$h;->a:I

    .line 29
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 30
    invoke-virtual {v4, v5, v6}, Lw/k0$a;->d(Lw/o0$a;Ljava/lang/Object;)V

    .line 31
    :cond_5
    sget-object v5, Lw/k0;->i:Lw/o0$a;

    iget v6, p1, Landroidx/camera/core/e1$h;->b:I

    .line 32
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 33
    invoke-virtual {v4, v5, v6}, Lw/k0$a;->d(Lw/o0$a;Ljava/lang/Object;)V

    .line 34
    :cond_6
    invoke-interface {v3}, Lw/m0;->a()Lw/k0;

    move-result-object v5

    invoke-virtual {v5}, Lw/k0;->d()Lw/o0;

    move-result-object v5

    .line 35
    invoke-virtual {v4, v5}, Lw/k0$a;->e(Lw/o0;)V

    if-eqz v2, :cond_7

    .line 36
    invoke-interface {v3}, Lw/m0;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Lw/k0$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    :cond_7
    iget-object v3, p0, Landroidx/camera/core/e1;->D:Lw/h;

    invoke-virtual {v4, v3}, Lw/k0$a;->c(Lw/h;)V

    .line 38
    invoke-virtual {v4}, Lw/k0$a;->h()Lw/k0;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 39
    :cond_8
    invoke-virtual {p0}, Landroidx/camera/core/y2;->e()Lw/y;

    move-result-object p1

    iget v1, p0, Landroidx/camera/core/e1;->n:I

    iget v2, p0, Landroidx/camera/core/e1;->p:I

    invoke-interface {p1, v0, v1, v2}, Lw/y;->d(Ljava/util/List;II)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/a1;->a:Landroidx/camera/core/a1;

    .line 40
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 41
    invoke-static {p1, v0, v1}, Ly/f;->o(Lcom/google/common/util/concurrent/m;Ln/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
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
    sget-object v0, Lw/p2$b;->n:Lw/p2$b;

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/e1;->Z()I

    move-result v1

    .line 3
    invoke-interface {p2, v0, v1}, Lw/p2;->a(Lw/p2$b;I)Lw/o0;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 4
    sget-object p1, Landroidx/camera/core/e1;->I:Landroidx/camera/core/e1$g;

    invoke-virtual {p1}, Landroidx/camera/core/e1$g;->a()Lw/a1;

    move-result-object p1

    invoke-static {p2, p1}, Lw/n0;->b(Lw/o0;Lw/o0;)Lw/o0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/e1;->n(Lw/o0;)Lw/o2$a;

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

    invoke-static {p1}, Landroidx/camera/core/e1$f;->d(Lw/o0;)Landroidx/camera/core/e1$f;

    move-result-object p1

    return-object p1
.end method

.method public p0(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/e1;->r:Landroid/util/Rational;

    return-void
.end method

.method s0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e1;->o:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/core/e1;->b0()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 5
    invoke-direct {p0}, Landroidx/camera/core/e1;->r0()V

    .line 6
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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/y2;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/a1;

    .line 2
    invoke-static {v0}, Lw/k0$a;->j(Lw/o2;)Lw/k0$a;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lw/k0$a;->h()Lw/k0;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/e1;->t:Lw/k0;

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lw/a1;->J(Lw/l0;)Lw/l0;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/e1;->w:Lw/l0;

    const/4 v1, 0x2

    .line 5
    invoke-virtual {v0, v1}, Lw/a1;->P(I)I

    move-result v1

    iput v1, p0, Landroidx/camera/core/e1;->v:I

    .line 6
    invoke-static {}, Landroidx/camera/core/a0;->c()Lw/j0;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lw/a1;->H(Lw/j0;)Lw/j0;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/e1;->u:Lw/j0;

    .line 8
    invoke-virtual {v0}, Lw/a1;->S()Z

    move-result v1

    iput-boolean v1, p0, Landroidx/camera/core/e1;->x:Z

    .line 9
    invoke-virtual {v0}, Lw/a1;->R()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/camera/core/e1;->y:Z

    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/y2;->d()Lw/d0;

    move-result-object v0

    const-string v1, "Attached camera cannot be null"

    .line 11
    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    new-instance v0, Landroidx/camera/core/e1$e;

    invoke-direct {v0, p0}, Landroidx/camera/core/e1$e;-><init>(Landroidx/camera/core/e1;)V

    const/4 v1, 0x1

    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/e1;->s:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method protected y()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/e1;->r0()V

    return-void
.end method
