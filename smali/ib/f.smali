.class Lib/f;
.super Lib/e;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/Iterator;)Lib/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lib/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lib/f$a;

    invoke-direct {v0, p0}, Lib/f$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lib/f;->b(Lib/b;)Lib/b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lib/b;)Lib/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lib/b<",
            "+TT;>;)",
            "Lib/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lib/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lib/a;

    invoke-direct {v0, p0}, Lib/a;-><init>(Lib/b;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
