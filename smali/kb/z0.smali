.class final synthetic Lkb/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lva/e;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lkb/v0;->k:Lkb/v0$b;

    invoke-interface {p0, v0}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object p0

    check-cast p0, Lkb/v0;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkb/v0;->X(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lva/e;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lkb/y0;->a(Lva/e;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
