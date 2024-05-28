.class final Landroidx/lifecycle/LifecycleController$observer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/j;


# instance fields
.field final synthetic n:Lkb/v0;


# virtual methods
.method public final e(Landroidx/lifecycle/l;Landroidx/lifecycle/f$b;)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 1>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Landroidx/lifecycle/l;->f()Landroidx/lifecycle/f;

    move-result-object p2

    const-string v0, "source.lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object p2

    sget-object v1, Landroidx/lifecycle/f$c;->n:Landroidx/lifecycle/f$c;

    const/4 v2, 0x0

    if-eq p2, v1, :cond_1

    .line 2
    invoke-interface {p1}, Landroidx/lifecycle/l;->f()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object p1

    invoke-static {v2}, Landroidx/lifecycle/g;->b(Landroidx/lifecycle/g;)Landroidx/lifecycle/f$c;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-gez p1, :cond_0

    .line 3
    invoke-static {v2}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/g;)Landroidx/lifecycle/b;

    throw v2

    .line 4
    :cond_0
    invoke-static {v2}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/g;)Landroidx/lifecycle/b;

    throw v2

    .line 5
    :cond_1
    iget-object p1, p0, Landroidx/lifecycle/LifecycleController$observer$1;->n:Lkb/v0;

    const/4 p2, 0x1

    .line 6
    invoke-static {p1, v2, p2, v2}, Lkb/v0$a;->a(Lkb/v0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 7
    throw v2
.end method
