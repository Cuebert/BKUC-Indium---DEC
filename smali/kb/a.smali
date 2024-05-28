.class public abstract Lkb/a;
.super Lkb/b1;
.source "SourceFile"

# interfaces
.implements Lva/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkb/b1;",
        "Lva/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final p:Lva/e;


# virtual methods
.method public final H(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lkb/a;->p:Lva/e;

    invoke-static {v0, p1}, Lkb/x;->a(Lva/e;Ljava/lang/Throwable;)V

    return-void
.end method

.method public M()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lkb/a;->p:Lva/e;

    invoke-static {v0}, Lkb/u;->a(Lva/e;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lkb/b1;->M()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lkb/b1;->M()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final U(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lkb/p;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lkb/p;

    iget-object v0, p1, Lkb/p;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lkb/p;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lkb/a;->n0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lkb/a;->o0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public c()Z
    .locals 1

    invoke-super {p0}, Lkb/b1;->c()Z

    move-result v0

    return v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p1, v0, v1, v0}, Lkb/t;->d(Ljava/lang/Object;Ldb/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkb/b1;->K(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    sget-object v0, Lkb/c1;->b:Lmb/a0;

    if-ne p1, v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lkb/a;->m0(Ljava/lang/Object;)V

    return-void
.end method

.method public final getContext()Lva/e;
    .locals 1

    iget-object v0, p0, Lkb/a;->p:Lva/e;

    return-object v0
.end method

.method protected m0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lkb/b1;->m(Ljava/lang/Object;)V

    return-void
.end method

.method protected n0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected o0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method protected r()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lkb/z;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
