.class Landroidx/camera/view/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private n:Landroid/util/Size;

.field private o:Landroidx/camera/core/x2;

.field private p:Landroid/util/Size;

.field private q:Z

.field final synthetic r:Landroidx/camera/view/q;


# direct methods
.method constructor <init>(Landroidx/camera/view/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/view/q$b;->r:Landroidx/camera/view/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/camera/view/q$b;->q:Z

    return-void
.end method

.method public static synthetic a(Landroidx/camera/view/q$b;Landroidx/camera/core/x2$f;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/q$b;->e(Landroidx/camera/core/x2$f;)V

    return-void
.end method

.method private b()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/camera/view/q$b;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/q$b;->n:Landroid/util/Size;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/camera/view/q$b;->p:Landroid/util/Size;

    .line 2
    invoke-virtual {v0, v1}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request canceled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceViewImpl"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    invoke-virtual {v0}, Landroidx/camera/core/x2;->y()Z

    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Surface invalidated "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceViewImpl"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    invoke-virtual {v0}, Landroidx/camera/core/x2;->k()Lw/r0;

    move-result-object v0

    invoke-virtual {v0}, Lw/r0;->c()V

    :cond_0
    return-void
.end method

.method private synthetic e(Landroidx/camera/core/x2$f;)V
    .locals 1

    const-string p1, "SurfaceViewImpl"

    const-string v0, "Safe to release surface."

    .line 1
    invoke-static {p1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Landroidx/camera/view/q$b;->r:Landroidx/camera/view/q;

    invoke-virtual {p1}, Landroidx/camera/view/q;->o()V

    return-void
.end method

.method private g()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/view/q$b;->r:Landroidx/camera/view/q;

    iget-object v0, v0, Landroidx/camera/view/q;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    .line 2
    invoke-direct {p0}, Landroidx/camera/view/q$b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "SurfaceViewImpl"

    const-string v2, "Surface set on Preview."

    .line 3
    invoke-static {v1, v2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    iget-object v2, p0, Landroidx/camera/view/q$b;->r:Landroidx/camera/view/q;

    iget-object v2, v2, Landroidx/camera/view/q;->e:Landroid/view/SurfaceView;

    .line 5
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/content/a;->f(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Landroidx/camera/view/r;

    invoke-direct {v3, p0}, Landroidx/camera/view/r;-><init>(Landroidx/camera/view/q$b;)V

    .line 6
    invoke-virtual {v1, v0, v2, v3}, Landroidx/camera/core/x2;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/camera/view/q$b;->q:Z

    .line 8
    iget-object v1, p0, Landroidx/camera/view/q$b;->r:Landroidx/camera/view/q;

    invoke-virtual {v1}, Landroidx/camera/view/k;->f()V

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method f(Landroidx/camera/core/x2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/camera/view/q$b;->c()V

    .line 2
    iput-object p1, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    .line 3
    invoke-virtual {p1}, Landroidx/camera/core/x2;->l()Landroid/util/Size;

    move-result-object p1

    .line 4
    iput-object p1, p0, Landroidx/camera/view/q$b;->n:Landroid/util/Size;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/view/q$b;->q:Z

    .line 6
    invoke-direct {p0}, Landroidx/camera/view/q$b;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SurfaceViewImpl"

    const-string v1, "Wait for new Surface creation."

    .line 7
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Landroidx/camera/view/q$b;->r:Landroidx/camera/view/q;

    iget-object v0, v0, Landroidx/camera/view/q;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    .line 10
    invoke-interface {v0, v1, p1}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Surface changed. Size: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SurfaceViewImpl"

    invoke-static {p2, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, p3, p4}, Landroid/util/Size;-><init>(II)V

    iput-object p1, p0, Landroidx/camera/view/q$b;->p:Landroid/util/Size;

    .line 3
    invoke-direct {p0}, Landroidx/camera/view/q$b;->g()Z

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "SurfaceViewImpl"

    const-string v0, "Surface created."

    invoke-static {p1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "SurfaceViewImpl"

    const-string v0, "Surface destroyed."

    .line 1
    invoke-static {p1, v0}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-boolean p1, p0, Landroidx/camera/view/q$b;->q:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Landroidx/camera/view/q$b;->d()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Landroidx/camera/view/q$b;->c()V

    :goto_0
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/camera/view/q$b;->q:Z

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/camera/view/q$b;->o:Landroidx/camera/core/x2;

    .line 7
    iput-object p1, p0, Landroidx/camera/view/q$b;->p:Landroid/util/Size;

    .line 8
    iput-object p1, p0, Landroidx/camera/view/q$b;->n:Landroid/util/Size;

    return-void
.end method
