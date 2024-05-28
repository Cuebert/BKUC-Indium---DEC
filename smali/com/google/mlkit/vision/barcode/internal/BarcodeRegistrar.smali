.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj5/d<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lj6/d;

    .line 1
    invoke-static {v0}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lg6/i;

    .line 2
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    sget-object v2, Lj6/c;->a:Lj6/c;

    .line 3
    invoke-virtual {v1, v2}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Lj5/d$b;->d()Lj5/d;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/vision/barcode/internal/b;

    .line 5
    invoke-static {v2}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v2

    .line 6
    invoke-static {v0}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v0

    invoke-virtual {v2, v0}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    const-class v2, Lg6/d;

    .line 7
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    sget-object v2, Lcom/google/mlkit/vision/barcode/internal/a;->a:Lcom/google/mlkit/vision/barcode/internal/a;

    .line 8
    invoke-virtual {v0, v2}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lj5/d$b;->d()Lj5/d;

    move-result-object v0

    .line 10
    invoke-static {v1, v0}, Lw3/c1;->p(Ljava/lang/Object;Ljava/lang/Object;)Lw3/c1;

    move-result-object v0

    return-object v0
.end method
