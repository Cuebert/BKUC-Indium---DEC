.class public final synthetic Lw/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/o0$c;Lw/o0$c;)Z
    .locals 2

    .line 1
    sget-object v0, Lw/o0$c;->n:Lw/o0$c;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    if-ne p1, v0, :cond_0

    return v1

    .line 2
    :cond_0
    sget-object v0, Lw/o0$c;->o:Lw/o0$c;

    if-ne p0, v0, :cond_1

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Lw/o0;Lw/o0;)Lw/o0;
    .locals 4

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 1
    invoke-static {}, Lw/u1;->I()Lw/u1;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    invoke-static {p1}, Lw/q1;->M(Lw/o0;)Lw/q1;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object p1

    :goto_0
    if-eqz p0, :cond_2

    .line 4
    invoke-interface {p0}, Lw/o0;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/o0$a;

    .line 5
    invoke-interface {p0, v1}, Lw/o0;->d(Lw/o0$a;)Lw/o0$c;

    move-result-object v2

    .line 6
    invoke-interface {p0, v1}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v3

    .line 7
    invoke-virtual {p1, v1, v2, v3}, Lw/q1;->G(Lw/o0$a;Lw/o0$c;Ljava/lang/Object;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {p1}, Lw/u1;->J(Lw/o0;)Lw/u1;

    move-result-object p0

    return-object p0
.end method
