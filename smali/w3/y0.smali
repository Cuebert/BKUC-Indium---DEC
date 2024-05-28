.class public final Lw3/y0;
.super Lw3/u0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lw3/u0<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lw3/u0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Lw3/v0;
    .locals 0

    invoke-super {p0, p1}, Lw3/u0;->b(Ljava/lang/Object;)Lw3/u0;

    return-object p0
.end method

.method public final e(Ljava/lang/Object;)Lw3/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lw3/y0<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lw3/u0;->b(Ljava/lang/Object;)Lw3/u0;

    return-object p0
.end method

.method public final f(Ljava/lang/Iterable;)Lw3/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lw3/y0<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lw3/u0;->c(Ljava/lang/Iterable;)Lw3/v0;

    return-object p0
.end method

.method public final g()Lw3/c1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw3/u0;->c:Z

    iget-object v0, p0, Lw3/u0;->a:[Ljava/lang/Object;

    iget v1, p0, Lw3/u0;->b:I

    invoke-static {v0, v1}, Lw3/c1;->o([Ljava/lang/Object;I)Lw3/c1;

    move-result-object v0

    return-object v0
.end method
