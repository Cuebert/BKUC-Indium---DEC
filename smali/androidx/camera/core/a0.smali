.class final Landroidx/camera/core/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/a0$a;
    }
.end annotation


# direct methods
.method static a(Ljava/util/List;)Lw/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/m0;",
            ">;)",
            "Lw/j0;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/a0$a;

    invoke-direct {v0, p0}, Landroidx/camera/core/a0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static varargs b([Lw/m0;)Lw/j0;
    .locals 1

    new-instance v0, Landroidx/camera/core/a0$a;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/a0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static c()Lw/j0;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lw/m0;

    new-instance v1, Lw/m0$a;

    invoke-direct {v1}, Lw/m0$a;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Landroidx/camera/core/a0;->b([Lw/m0;)Lw/j0;

    move-result-object v0

    return-object v0
.end method
