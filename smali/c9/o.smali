.class public Lc9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lgc/t;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/t<",
            "Lob/j0;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, ""

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lob/j0;

    invoke-virtual {p0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v0, p0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lgc/t;->d()Lob/j0;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lgc/t;->d()Lob/j0;

    move-result-object p0

    invoke-virtual {p0}, Lob/j0;->T()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    :goto_1
    return-object v0
.end method
