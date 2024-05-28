.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements Li6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/vision/common/internal/MobileVisionBase<",
        "Ljava/util/List<",
        "Li6/a;",
        ">;>;",
        "Li6/b;"
    }
.end annotation


# static fields
.field private static final t:Li6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li6/c$a;

    invoke-direct {v0}, Li6/c$a;-><init>()V

    invoke-virtual {v0}, Li6/c$a;->a()Li6/c;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->t:Li6/c;

    return-void
.end method

.method constructor <init>(Li6/c;Lj6/g;Ljava/util/concurrent/Executor;Lw3/pa;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(Lg6/f;Ljava/util/concurrent/Executor;)V

    new-instance p2, Lw3/r8;

    invoke-direct {p2}, Lw3/r8;-><init>()V

    .line 2
    invoke-static {p1}, Lj6/b;->c(Li6/c;)Lw3/ca;

    move-result-object p1

    invoke-virtual {p2, p1}, Lw3/r8;->i(Lw3/ca;)Lw3/r8;

    invoke-virtual {p2}, Lw3/r8;->j()Lw3/s8;

    move-result-object p1

    new-instance p2, Lw3/f8;

    invoke-direct {p2}, Lw3/f8;-><init>()V

    .line 3
    invoke-virtual {p2, p1}, Lw3/f8;->f(Lw3/s8;)Lw3/f8;

    const/4 p1, 0x1

    .line 4
    invoke-static {p2, p1}, Lw3/sa;->e(Lw3/f8;I)Lw3/sa;

    move-result-object p1

    sget-object p2, Lw3/d8;->x:Lw3/d8;

    .line 5
    invoke-virtual {p4, p1, p2}, Lw3/pa;->d(Lw3/sa;Lw3/d8;)V

    return-void
.end method


# virtual methods
.method public final N(Lk6/a;)Lg4/l;
    .locals 0
    .param p1    # Lk6/a;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/a;",
            ")",
            "Lg4/l<",
            "Ljava/util/List<",
            "Li6/a;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->b(Lk6/a;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
