.class public Lmb/y;
.super Lkb/a;
.source "SourceFile"

# interfaces
.implements Lxa/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkb/a<",
        "TT;>;",
        "Lxa/d;"
    }
.end annotation


# instance fields
.field public final q:Lva/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lva/c<",
            "TT;>;"
        }
    .end annotation
.end field


# virtual methods
.method protected final I()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final a()Lxa/d;
    .locals 2

    iget-object v0, p0, Lmb/y;->q:Lva/c;

    instance-of v1, v0, Lxa/d;

    if-eqz v1, :cond_0

    check-cast v0, Lxa/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected m(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lmb/y;->q:Lva/c;

    invoke-static {v0}, Lwa/b;->a(Lva/c;)Lva/c;

    move-result-object v0

    iget-object v1, p0, Lmb/y;->q:Lva/c;

    invoke-static {p1, v1}, Lkb/t;->a(Ljava/lang/Object;Lva/c;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lmb/h;->c(Lva/c;Ljava/lang/Object;Ldb/l;ILjava/lang/Object;)V

    return-void
.end method

.method protected m0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lmb/y;->q:Lva/c;

    invoke-static {p1, v0}, Lkb/t;->a(Ljava/lang/Object;Lva/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lva/c;->d(Ljava/lang/Object;)V

    return-void
.end method
