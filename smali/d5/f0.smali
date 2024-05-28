.class final Ld5/f0;
.super Ld5/y;
.source "SourceFile"


# instance fields
.field final synthetic o:Landroid/os/IBinder;

.field final synthetic p:Ld5/c;


# direct methods
.method constructor <init>(Ld5/c;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Ld5/f0;->p:Ld5/c;

    iput-object p2, p0, Ld5/f0;->o:Landroid/os/IBinder;

    invoke-direct {p0}, Ld5/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld5/f0;->p:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->g(Ld5/d;)Ld5/e0;

    move-result-object v1

    iget-object v2, p0, Ld5/f0;->o:Landroid/os/IBinder;

    invoke-interface {v1, v2}, Ld5/e0;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IInterface;

    invoke-static {v0, v1}, Ld5/d;->n(Ld5/d;Landroid/os/IInterface;)V

    iget-object v0, p0, Ld5/f0;->p:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    .line 2
    invoke-static {v0}, Ld5/d;->r(Ld5/d;)V

    iget-object v0, p0, Ld5/f0;->p:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v1}, Ld5/d;->m(Ld5/d;Z)V

    iget-object v0, p0, Ld5/f0;->p:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->i(Ld5/d;)Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 5
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld5/f0;->p:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->i(Ld5/d;)Ljava/util/List;

    move-result-object v0

    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
