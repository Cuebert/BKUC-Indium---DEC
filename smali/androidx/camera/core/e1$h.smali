.class Landroidx/camera/core/e1$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field final a:I

.field final b:I

.field private final c:Landroid/util/Rational;

.field private final d:Ljava/util/concurrent/Executor;

.field e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final f:Landroid/graphics/Rect;

.field private final g:Landroid/graphics/Matrix;


# direct methods
.method public static synthetic a(Landroidx/camera/core/e1$h;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/e1$h;->e(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/e1$h;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/e1$h;->d(Landroidx/camera/core/l1;)V

    return-void
.end method

.method private synthetic d(Landroidx/camera/core/l1;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method private synthetic e(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, Landroidx/camera/core/h1;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/core/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method c(Landroidx/camera/core/l1;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$h;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    return-void

    .line 3
    :cond_0
    sget-object v0, Landroidx/camera/core/e1;->J:Lc0/a;

    invoke-virtual {v0, p1}, Lc0/a;->b(Landroidx/camera/core/l1;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    :try_start_0
    invoke-interface {p1}, Landroidx/camera/core/l1;->k()[Landroidx/camera/core/l1$a;

    move-result-object v0

    .line 5
    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/l1$a;->d()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 7
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    new-array v1, v1, [B

    .line 8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 9
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v3}, Landroidx/camera/core/impl/utils/e;->d(Ljava/io/InputStream;)Landroidx/camera/core/impl/utils/e;

    move-result-object v1

    .line 10
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 11
    new-instance v0, Landroid/util/Size;

    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/e;->l()I

    move-result v3

    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/e;->g()I

    move-result v4

    invoke-direct {v0, v3, v4}, Landroid/util/Size;-><init>(II)V

    .line 12
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/e;->j()I

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to parse JPEG exif"

    .line 13
    invoke-virtual {p0, v2, v1, v0}, Landroidx/camera/core/e1$h;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    return-void

    .line 15
    :cond_1
    new-instance v0, Landroid/util/Size;

    invoke-interface {p1}, Landroidx/camera/core/l1;->g()I

    move-result v1

    invoke-interface {p1}, Landroidx/camera/core/l1;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 16
    iget v1, p0, Landroidx/camera/core/e1$h;->a:I

    .line 17
    :goto_0
    invoke-interface {p1}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v2

    invoke-interface {v2}, Landroidx/camera/core/i1;->a()Lw/j2;

    move-result-object v2

    .line 18
    invoke-interface {p1}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v3

    invoke-interface {v3}, Landroidx/camera/core/i1;->c()J

    move-result-wide v3

    iget-object v5, p0, Landroidx/camera/core/e1$h;->g:Landroid/graphics/Matrix;

    .line 19
    invoke-static {v2, v3, v4, v1, v5}, Landroidx/camera/core/o1;->f(Lw/j2;JILandroid/graphics/Matrix;)Landroidx/camera/core/i1;

    move-result-object v2

    .line 20
    new-instance v3, Landroidx/camera/core/m2;

    invoke-direct {v3, p1, v0, v2}, Landroidx/camera/core/m2;-><init>(Landroidx/camera/core/l1;Landroid/util/Size;Landroidx/camera/core/i1;)V

    .line 21
    iget-object v2, p0, Landroidx/camera/core/e1$h;->f:Landroid/graphics/Rect;

    iget-object v4, p0, Landroidx/camera/core/e1$h;->c:Landroid/util/Rational;

    iget v5, p0, Landroidx/camera/core/e1$h;->a:I

    invoke-static {v2, v4, v5, v0, v1}, Landroidx/camera/core/e1;->V(Landroid/graphics/Rect;Landroid/util/Rational;ILandroid/util/Size;I)Landroid/graphics/Rect;

    move-result-object v0

    .line 22
    invoke-interface {v3, v0}, Landroidx/camera/core/l1;->o(Landroid/graphics/Rect;)V

    .line 23
    :try_start_1
    iget-object v0, p0, Landroidx/camera/core/e1$h;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/core/g1;

    invoke-direct {v1, p0, v3}, Landroidx/camera/core/g1;-><init>(Landroidx/camera/core/e1$h;Landroidx/camera/core/l1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string v0, "ImageCapture"

    const-string v1, "Unable to post to the supplied executor."

    .line 24
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    :goto_1
    return-void
.end method

.method f(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$h;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/e1$h;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/core/f1;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/core/f1;-><init>(Landroidx/camera/core/e1$h;ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "ImageCapture"

    const-string p2, "Unable to post to the supplied executor."

    .line 3
    invoke-static {p1, p2}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
