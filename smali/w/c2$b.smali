.class public Lw/c2$b;
.super Lw/c2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw/c2$a;-><init>()V

    return-void
.end method

.method public static o(Lw/o2;)Lw/c2$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;)",
            "Lw/c2$b;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, v0}, Lw/o2;->r(Lw/c2$d;)Lw/c2$d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lw/c2$b;

    invoke-direct {v1}, Lw/c2$b;-><init>()V

    .line 3
    invoke-interface {v0, p0, v1}, Lw/c2$d;->a(Lw/o2;Lw/c2$b;)V

    return-object v1

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Implementation is missing option unpacker for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lz/i;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/hardware/camera2/CameraDevice$StateCallback;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 2
    invoke-virtual {p0, v0}, Lw/c2$b;->e(Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lw/h;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->a(Ljava/util/Collection;)V

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 2
    invoke-virtual {p0, v0}, Lw/c2$b;->j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Lw/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->c(Lw/h;)V

    .line 2
    iget-object v0, p0, Lw/c2$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lw/c2$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public e(Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/c2$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lw/c2$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lw/c2$c;)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Lw/o0;)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->e(Lw/o0;)V

    return-void
.end method

.method public h(Lw/r0;)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i(Lw/h;)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->c(Lw/h;)V

    return-void
.end method

.method public j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/c2$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lw/c2$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Lw/r0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->f(Lw/r0;)V

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1, p2}, Lw/k0$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public m()Lw/c2;
    .locals 9

    .line 1
    new-instance v8, Lw/c2;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Lw/c2$a;->c:Ljava/util/List;

    iget-object v3, p0, Lw/c2$a;->d:Ljava/util/List;

    iget-object v4, p0, Lw/c2$a;->f:Ljava/util/List;

    iget-object v5, p0, Lw/c2$a;->e:Ljava/util/List;

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    .line 2
    invoke-virtual {v0}, Lw/k0$a;->h()Lw/k0;

    move-result-object v6

    iget-object v7, p0, Lw/c2$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lw/c2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lw/k0;Landroid/hardware/camera2/params/InputConfiguration;)V

    return-object v8
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 2
    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0}, Lw/k0$a;->i()V

    return-void
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/c2$a;->f:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public q(Lw/o0;)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->o(Lw/o0;)V

    return-void
.end method

.method public r(Landroid/hardware/camera2/params/InputConfiguration;)V
    .locals 0

    iput-object p1, p0, Lw/c2$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    return-void
.end method

.method public s(I)V
    .locals 1

    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0, p1}, Lw/k0$a;->p(I)V

    return-void
.end method
