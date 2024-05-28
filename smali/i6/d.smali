.class public Li6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Li6/c;)Li6/b;
    .locals 2
    .param p0    # Li6/c;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    const-string v0, "You must provide a valid BarcodeScannerOptions."

    .line 1
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Lg6/i;->c()Lg6/i;

    move-result-object v0

    const-class v1, Lcom/google/mlkit/vision/barcode/internal/b;

    invoke-virtual {v0, v1}, Lg6/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/vision/barcode/internal/b;

    invoke-virtual {v0, p0}, Lcom/google/mlkit/vision/barcode/internal/b;->a(Li6/c;)Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    move-result-object p0

    return-object p0
.end method
