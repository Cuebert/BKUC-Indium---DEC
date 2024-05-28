.class public final Lcom/google/mlkit/vision/barcode/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj6/d;

.field private final b:Lg6/d;


# direct methods
.method constructor <init>(Lj6/d;Lg6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/b;->a:Lj6/d;

    iput-object p2, p0, Lcom/google/mlkit/vision/barcode/internal/b;->b:Lg6/d;

    return-void
.end method


# virtual methods
.method public final a(Li6/c;)Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/internal/b;->a:Lj6/d;

    .line 2
    invoke-virtual {v1, p1}, Lg6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/g;

    iget-object v2, p0, Lcom/google/mlkit/vision/barcode/internal/b;->b:Lg6/d;

    .line 3
    invoke-virtual {p1}, Li6/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg6/d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 4
    invoke-static {}, Lj6/b;->d()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-static {v3}, Lw3/ab;->b(Ljava/lang/String;)Lw3/pa;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;-><init>(Li6/c;Lj6/g;Ljava/util/concurrent/Executor;Lw3/pa;)V

    return-object v0
.end method
