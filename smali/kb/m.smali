.class public final Lkb/m;
.super Lkb/x0;
.source "SourceFile"

# interfaces
.implements Lkb/l;


# instance fields
.field public final r:Lkb/n;


# virtual methods
.method public e(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lkb/a1;->t()Lkb/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkb/b1;->s(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkb/m;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lta/l;->a:Lta/l;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lkb/m;->r:Lkb/n;

    invoke-virtual {p0}, Lkb/a1;->t()Lkb/b1;

    move-result-object v0

    invoke-interface {p1, v0}, Lkb/n;->e(Lkb/h1;)V

    return-void
.end method
