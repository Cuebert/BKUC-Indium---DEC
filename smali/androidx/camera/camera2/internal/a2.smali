.class final Landroidx/camera/camera2/internal/a2;
.super Landroidx/camera/camera2/internal/l0;
.source "SourceFile"


# static fields
.field static final c:Landroidx/camera/camera2/internal/a2;


# instance fields
.field private final b:Lu/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/camera/camera2/internal/a2;

    new-instance v1, Lu/i;

    invoke-direct {v1}, Lu/i;-><init>()V

    invoke-direct {v0, v1}, Landroidx/camera/camera2/internal/a2;-><init>(Lu/i;)V

    sput-object v0, Landroidx/camera/camera2/internal/a2;->c:Landroidx/camera/camera2/internal/a2;

    return-void
.end method

.method private constructor <init>(Lu/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/l0;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/a2;->b:Lu/i;

    return-void
.end method


# virtual methods
.method public a(Lw/o2;Lw/k0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;",
            "Lw/k0$a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/camera/camera2/internal/l0;->a(Lw/o2;Lw/k0$a;)V

    .line 2
    instance-of v0, p1, Lw/a1;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lw/a1;

    .line 4
    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    .line 5
    invoke-virtual {p1}, Lw/a1;->Q()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Landroidx/camera/camera2/internal/a2;->b:Lu/i;

    invoke-virtual {p1}, Lw/a1;->I()I

    move-result p1

    invoke-virtual {v1, p1, v0}, Lu/i;->a(ILq/a$a;)V

    .line 7
    :cond_0
    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lw/k0$a;->e(Lw/o0;)V

    return-void

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "config is not ImageCaptureConfig"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
