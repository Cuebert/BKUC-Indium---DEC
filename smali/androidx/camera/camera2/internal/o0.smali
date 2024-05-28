.class Landroidx/camera/camera2/internal/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/o0$e;,
        Landroidx/camera/camera2/internal/o0$a;,
        Landroidx/camera/camera2/internal/o0$f;,
        Landroidx/camera/camera2/internal/o0$b;,
        Landroidx/camera/camera2/internal/o0$d;,
        Landroidx/camera/camera2/internal/o0$c;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/t;

.field private final b:Lu/r;

.field private final c:Lw/y1;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Z

.field private f:I


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/t;Lr/z;Lw/y1;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/camera/camera2/internal/o0;->f:I

    .line 3
    iput-object p1, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/t;

    .line 4
    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 5
    invoke-virtual {p2, p1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/o0;->e:Z

    .line 7
    iput-object p4, p0, Landroidx/camera/camera2/internal/o0;->d:Ljava/util/concurrent/Executor;

    .line 8
    iput-object p3, p0, Landroidx/camera/camera2/internal/o0;->c:Lw/y1;

    .line 9
    new-instance p1, Lu/r;

    invoke-direct {p1, p3}, Lu/r;-><init>(Lw/y1;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/o0;->b:Lu/r;

    return-void
.end method

.method static a(ILandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(I)V

    throw p1

    :cond_1
    return v1

    :cond_2
    if-eqz p1, :cond_3

    .line 2
    sget-object p0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, p0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_4

    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 p1, 0x4

    if-ne p0, p1, :cond_4

    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method private b(I)Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/o0;->b:Lu/r;

    invoke-virtual {v0}, Lu/r;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget v0, p0, Landroidx/camera/camera2/internal/o0;->f:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public c(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/camera2/internal/o0;->f:I

    return-void
.end method

.method public d(Ljava/util/List;III)Lcom/google/common/util/concurrent/m;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;III)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v6, Lu/l;

    iget-object v0, p0, Landroidx/camera/camera2/internal/o0;->c:Lw/y1;

    invoke-direct {v6, v0}, Lu/l;-><init>(Lw/y1;)V

    .line 2
    new-instance v7, Landroidx/camera/camera2/internal/o0$c;

    iget v1, p0, Landroidx/camera/camera2/internal/o0;->f:I

    iget-object v2, p0, Landroidx/camera/camera2/internal/o0;->d:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/t;

    iget-boolean v4, p0, Landroidx/camera/camera2/internal/o0;->e:Z

    move-object v0, v7

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Landroidx/camera/camera2/internal/o0$c;-><init>(ILjava/util/concurrent/Executor;Landroidx/camera/camera2/internal/t;ZLu/l;)V

    if-nez p2, :cond_0

    .line 3
    new-instance p2, Landroidx/camera/camera2/internal/o0$b;

    iget-object v0, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/t;

    invoke-direct {p2, v0}, Landroidx/camera/camera2/internal/o0$b;-><init>(Landroidx/camera/camera2/internal/t;)V

    invoke-virtual {v7, p2}, Landroidx/camera/camera2/internal/o0$c;->g(Landroidx/camera/camera2/internal/o0$d;)V

    .line 4
    :cond_0
    invoke-direct {p0, p4}, Landroidx/camera/camera2/internal/o0;->b(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 5
    new-instance p2, Landroidx/camera/camera2/internal/o0$f;

    iget-object p4, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/t;

    invoke-direct {p2, p4, p3}, Landroidx/camera/camera2/internal/o0$f;-><init>(Landroidx/camera/camera2/internal/t;I)V

    invoke-virtual {v7, p2}, Landroidx/camera/camera2/internal/o0$c;->g(Landroidx/camera/camera2/internal/o0$d;)V

    goto :goto_0

    .line 6
    :cond_1
    new-instance p2, Landroidx/camera/camera2/internal/o0$a;

    iget-object p4, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/t;

    invoke-direct {p2, p4, p3, v6}, Landroidx/camera/camera2/internal/o0$a;-><init>(Landroidx/camera/camera2/internal/t;ILu/l;)V

    invoke-virtual {v7, p2}, Landroidx/camera/camera2/internal/o0$c;->g(Landroidx/camera/camera2/internal/o0$d;)V

    .line 7
    :goto_0
    invoke-virtual {v7, p1, p3}, Landroidx/camera/camera2/internal/o0$c;->j(Ljava/util/List;I)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    .line 8
    invoke-static {p1}, Ly/f;->j(Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method
