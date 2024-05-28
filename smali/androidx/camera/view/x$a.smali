.class Landroidx/camera/view/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/x;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/view/x;


# direct methods
.method constructor <init>(Landroidx/camera/view/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceTexture available. Size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "TextureViewImpl"

    invoke-static {p3, p2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    iput-object p1, p2, Landroidx/camera/view/x;->f:Landroid/graphics/SurfaceTexture;

    .line 3
    iget-object p1, p2, Landroidx/camera/view/x;->g:Lcom/google/common/util/concurrent/m;

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p2, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Surface invalidated "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    iget-object p2, p2, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    iget-object p1, p1, Landroidx/camera/view/x;->h:Landroidx/camera/core/x2;

    invoke-virtual {p1}, Landroidx/camera/core/x2;->k()Lw/r0;

    move-result-object p1

    invoke-virtual {p1}, Lw/r0;->c()V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2}, Landroidx/camera/view/x;->u()V

    :goto_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/camera/view/x;->f:Landroid/graphics/SurfaceTexture;

    .line 2
    iget-object v0, v0, Landroidx/camera/view/x;->g:Lcom/google/common/util/concurrent/m;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Landroidx/camera/view/x$a$a;

    invoke-direct {v1, p0, p1}, Landroidx/camera/view/x$a$a;-><init>(Landroidx/camera/view/x$a;Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    iget-object v2, v2, Landroidx/camera/view/x;->e:Landroid/view/TextureView;

    .line 4
    invoke-virtual {v2}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/content/a;->f(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 5
    invoke-static {v0, v1, v2}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 6
    iget-object v0, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    iput-object p1, v0, Landroidx/camera/view/x;->j:Landroid/graphics/SurfaceTexture;

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string p1, "TextureViewImpl"

    const-string v0, "SurfaceTexture about to be destroyed"

    .line 7
    invoke-static {p1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SurfaceTexture size changed: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TextureViewImpl"

    invoke-static {p2, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/camera/view/x$a;->a:Landroidx/camera/view/x;

    iget-object p1, p1, Landroidx/camera/view/x;->k:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
