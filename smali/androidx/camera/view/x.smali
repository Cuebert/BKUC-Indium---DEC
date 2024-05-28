.class final Landroidx/camera/view/x;
.super Landroidx/camera/view/k;
.source "SourceFile"


# instance fields
.field e:Landroid/view/TextureView;

.field f:Landroid/graphics/SurfaceTexture;

.field g:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/core/x2$f;",
            ">;"
        }
    .end annotation
.end field

.field h:Landroidx/camera/core/x2;

.field i:Z

.field j:Landroid/graphics/SurfaceTexture;

.field k:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field l:Landroidx/camera/view/k$a;


# direct methods
.method constructor <init>(Landroid/widget/FrameLayout;Landroidx/camera/view/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/camera/view/k;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/f;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/camera/view/x;->i:Z

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/x;->k:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static synthetic j(Landroidx/camera/view/x;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/x;->r(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/camera/view/x;Landroidx/camera/core/x2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/x;->o(Landroidx/camera/core/x2;)V

    return-void
.end method

.method public static synthetic l(Landroidx/camera/view/x;Landroid/view/Surface;Lcom/google/common/util/concurrent/m;Landroidx/camera/core/x2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/view/x;->q(Landroid/view/Surface;Lcom/google/common/util/concurrent/m;Landroidx/camera/core/x2;)V

    return-void
.end method

.method public static synthetic m(Landroidx/camera/view/x;Landroid/view/Surface;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/x;->p(Landroid/view/Surface;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic o(Landroidx/camera/core/x2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    .line 3
    iput-object p1, p0, Landroidx/camera/view/x;->g:Lcom/google/common/util/concurrent/m;

    .line 4
    :cond_0
    invoke-direct {p0}, Landroidx/camera/view/x;->s()V

    return-void
.end method

.method private synthetic p(Landroid/view/Surface;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "TextureViewImpl"

    const-string v1, "Surface set on Preview."

    .line 1
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    .line 3
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Landroidx/camera/view/u;

    invoke-direct {v2, p2}, Landroidx/camera/view/u;-><init>(Landroidx/concurrent/futures/c$a;)V

    .line 4
    invoke-virtual {v0, p1, v1, v2}, Landroidx/camera/core/x2;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "provideSurface[request="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " surface="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic q(Landroid/view/Surface;Lcom/google/common/util/concurrent/m;Landroidx/camera/core/x2;)V
    .locals 2

    const-string v0, "TextureViewImpl"

    const-string v1, "Safe to release surface."

    .line 1
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroidx/camera/view/x;->s()V

    .line 3
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    .line 4
    iget-object p1, p0, Landroidx/camera/view/x;->g:Lcom/google/common/util/concurrent/m;

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    .line 5
    iput-object v0, p0, Landroidx/camera/view/x;->g:Lcom/google/common/util/concurrent/m;

    .line 6
    :cond_0
    iget-object p1, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    if-ne p1, p3, :cond_1

    .line 7
    iput-object v0, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    :cond_1
    return-void
.end method

.method private synthetic r(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/view/x;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p1, "textureViewImpl_waitForNextFrame"

    return-object p1
.end method

.method private s()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/view/x;->l:Landroidx/camera/view/k$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Landroidx/camera/view/k$a;->a()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/view/x;->l:Landroidx/camera/view/k$a;

    :cond_0
    return-void
.end method

.method private t()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/camera/view/x;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/x;->j:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    .line 2
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/x;->j:Landroid/graphics/SurfaceTexture;

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/camera/view/x;->j:Landroid/graphics/SurfaceTexture;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/view/x;->i:Z

    :cond_0
    return-void
.end method


# virtual methods
.method b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    return-object v0
.end method

.method c()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method d()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/view/x;->t()V

    return-void
.end method

.method e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/view/x;->i:Z

    return-void
.end method

.method g(Landroidx/camera/core/x2;Landroidx/camera/view/k$a;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/camera/core/x2;->l()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/view/k;->a:Landroid/util/Size;

    .line 2
    iput-object p2, p0, Landroidx/camera/view/x;->l:Landroidx/camera/view/k$a;

    .line 3
    invoke-virtual {p0}, Landroidx/camera/view/x;->n()V

    .line 4
    iget-object p2, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p2}, Landroidx/camera/core/x2;->y()Z

    .line 6
    :cond_0
    iput-object p1, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    .line 7
    iget-object p2, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    .line 8
    invoke-virtual {p2}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroidx/core/content/a;->f(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance v0, Landroidx/camera/view/w;

    invoke-direct {v0, p0, p1}, Landroidx/camera/view/w;-><init>(Landroidx/camera/view/x;Landroidx/camera/core/x2;)V

    .line 9
    invoke-virtual {p1, p2, v0}, Landroidx/camera/core/x2;->i(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    .line 10
    invoke-virtual {p0}, Landroidx/camera/view/x;->u()V

    return-void
.end method

.method i()Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/view/s;

    invoke-direct {v0, p0}, Landroidx/camera/view/s;-><init>(Landroidx/camera/view/x;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    return-object v0
.end method

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/view/k;->b:Landroid/widget/FrameLayout;

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/camera/view/k;->a:Landroid/util/Size;

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v0, Landroid/view/TextureView;

    iget-object v1, p0, Landroidx/camera/view/k;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    .line 4
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Landroidx/camera/view/k;->a:Landroid/util/Size;

    .line 5
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    iget-object v3, p0, Landroidx/camera/view/k;->a:Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    new-instance v1, Landroidx/camera/view/x$a;

    invoke-direct {v1, p0}, Landroidx/camera/view/x$a;-><init>(Landroidx/camera/view/x;)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 8
    iget-object v0, p0, Landroidx/camera/view/k;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 9
    iget-object v0, p0, Landroidx/camera/view/k;->b:Landroid/widget/FrameLayout;

    iget-object v1, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method u()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/view/k;->a:Landroid/util/Size;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/camera/view/x;->f:Landroid/graphics/SurfaceTexture;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    if-nez v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    iget-object v2, p0, Landroidx/camera/view/k;->a:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 3
    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Landroidx/camera/view/x;->f:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 4
    iget-object v1, p0, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    .line 5
    new-instance v2, Landroidx/camera/view/t;

    invoke-direct {v2, p0, v0}, Landroidx/camera/view/t;-><init>(Landroidx/camera/view/x;Landroid/view/Surface;)V

    invoke-static {v2}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v2

    .line 6
    iput-object v2, p0, Landroidx/camera/view/x;->g:Lcom/google/common/util/concurrent/m;

    .line 7
    new-instance v3, Landroidx/camera/view/v;

    invoke-direct {v3, p0, v0, v2, v1}, Landroidx/camera/view/v;-><init>(Landroidx/camera/view/x;Landroid/view/Surface;Lcom/google/common/util/concurrent/m;Landroidx/camera/core/x2;)V

    iget-object v0, p0, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    .line 8
    invoke-virtual {v0}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/content/a;->f(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 9
    invoke-interface {v2, v3, v0}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 10
    invoke-virtual {p0}, Landroidx/camera/view/k;->f()V

    :cond_1
    :goto_0
    return-void
.end method
