.class public final Lkb/l1;
.super Lmb/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lmb/y<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final r:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lta/g<",
            "Lva/e;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile threadLocalIsSet:Z


# virtual methods
.method protected m0(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lkb/l1;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lkb/l1;->r:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lta/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lta/g;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lva/e;

    invoke-virtual {v0}, Lta/g;->b()Ljava/lang/Object;

    move-result-object v0

    .line 3
    invoke-static {v1, v0}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lkb/l1;->r:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 5
    :cond_1
    iget-object v0, p0, Lmb/y;->q:Lva/c;

    invoke-static {p1, v0}, Lkb/t;->a(Ljava/lang/Object;Lva/c;)Ljava/lang/Object;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lmb/y;->q:Lva/c;

    .line 7
    invoke-interface {v0}, Lva/c;->getContext()Lva/e;

    move-result-object v1

    const/4 v2, 0x0

    .line 8
    invoke-static {v1, v2}, Lmb/e0;->c(Lva/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 9
    sget-object v4, Lmb/e0;->a:Lmb/a0;

    if-eq v3, v4, :cond_2

    .line 10
    invoke-static {v0, v1, v3}, Lkb/u;->c(Lva/c;Lva/e;Ljava/lang/Object;)Lkb/l1;

    move-result-object v2

    .line 11
    :cond_2
    :try_start_0
    iget-object v0, p0, Lmb/y;->q:Lva/c;

    invoke-interface {v0, p1}, Lva/c;->d(Ljava/lang/Object;)V

    .line 12
    sget-object p1, Lta/l;->a:Lta/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 13
    invoke-virtual {v2}, Lkb/l1;->p0()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 14
    :cond_3
    invoke-static {v1, v3}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    .line 15
    invoke-virtual {v2}, Lkb/l1;->p0()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    :cond_5
    invoke-static {v1, v3}, Lmb/e0;->a(Lva/e;Ljava/lang/Object;)V

    :cond_6
    throw p1
.end method

.method public final p0()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lkb/l1;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkb/l1;->r:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lkb/l1;->r:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final q0(Lva/e;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lkb/l1;->threadLocalIsSet:Z

    .line 2
    iget-object v0, p0, Lkb/l1;->r:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Lta/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Lta/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
