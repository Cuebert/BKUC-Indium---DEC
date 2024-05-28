.class public final Lx2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx2/m;Lx2/f;)Lx2/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lx2/m;",
            ">(TR;",
            "Lx2/f;",
            ")",
            "Lx2/h<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    .line 1
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-interface {p0}, Lx2/m;->q()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->B()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Status code must not be SUCCESS"

    invoke-static {v0, v1}, Lz2/j;->b(ZLjava/lang/Object;)V

    .line 3
    new-instance v0, Lx2/r;

    invoke-direct {v0, p1, p0}, Lx2/r;-><init>(Lx2/f;Lx2/m;)V

    .line 4
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lx2/m;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/common/api/Status;Lx2/f;)Lx2/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Lx2/f;",
            ")",
            "Lx2/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    .line 1
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Ly2/n;

    invoke-direct {v0, p1}, Ly2/n;-><init>(Lx2/f;)V

    .line 3
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lx2/m;)V

    return-object v0
.end method
