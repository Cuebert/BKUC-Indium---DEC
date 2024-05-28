.class public final Lkb/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lva/e;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Lxa/d;)Lkb/l1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/d;",
            ")",
            "Lkb/l1<",
            "*>;"
        }
    .end annotation

    .line 1
    :cond_0
    instance-of v0, p0, Lkb/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    .line 2
    :cond_1
    invoke-interface {p0}, Lxa/d;->a()Lxa/d;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    .line 3
    :cond_2
    instance-of v0, p0, Lkb/l1;

    if-eqz v0, :cond_0

    check-cast p0, Lkb/l1;

    return-object p0
.end method

.method public static final c(Lva/c;Lva/e;Ljava/lang/Object;)Lkb/l1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/c<",
            "*>;",
            "Lva/e;",
            "Ljava/lang/Object;",
            ")",
            "Lkb/l1<",
            "*>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lxa/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    sget-object v0, Lkb/m1;->n:Lkb/m1;

    invoke-interface {p1, v0}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    .line 3
    :cond_2
    check-cast p0, Lxa/d;

    invoke-static {p0}, Lkb/u;->b(Lxa/d;)Lkb/l1;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 4
    invoke-virtual {p0, p1, p2}, Lkb/l1;->q0(Lva/e;Ljava/lang/Object;)V

    :cond_3
    return-object p0
.end method
