.class public Lcom/google/mlkit/vision/barcode/bundled/internal/ThickBarcodeScannerCreator;
.super Lx3/e;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public newBarcodeScanner(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzs;)Lx3/c;
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;

    invoke-static {p1}, Li3/b;->n(Li3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1, p2}, Lcom/google/mlkit/vision/barcode/bundled/internal/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzs;)V

    return-object v0
.end method
