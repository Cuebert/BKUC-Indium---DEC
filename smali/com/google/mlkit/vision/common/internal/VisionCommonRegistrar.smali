.class public Lcom/google/mlkit/vision/common/internal/VisionCommonRegistrar;
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
    .locals 2
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

    const-class v0, Lcom/google/mlkit/vision/common/internal/a;

    .line 1
    invoke-static {v0}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v0

    const-class v1, Lcom/google/mlkit/vision/common/internal/a$a;

    .line 2
    invoke-static {v1}, Lj5/q;->j(Ljava/lang/Class;)Lj5/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    sget-object v1, Lcom/google/mlkit/vision/common/internal/c;->a:Lcom/google/mlkit/vision/common/internal/c;

    .line 3
    invoke-virtual {v0, v1}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lj5/d$b;->d()Lj5/d;

    move-result-object v0

    .line 5
    invoke-static {v0}, Ly3/z7;->o(Ljava/lang/Object;)Ly3/z7;

    move-result-object v0

    return-object v0
.end method
