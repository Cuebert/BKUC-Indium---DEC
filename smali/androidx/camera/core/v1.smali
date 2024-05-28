.class Landroidx/camera/core/v1;
.super Landroidx/camera/core/d;
.source "SourceFile"


# instance fields
.field private volatile c:Lw/j2;

.field private volatile d:Ljava/lang/Long;

.field private volatile e:Ljava/lang/Integer;

.field private volatile f:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>(Landroid/media/ImageReader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/d;-><init>(Landroid/media/ImageReader;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/camera/core/v1;->c:Lw/j2;

    .line 3
    iput-object p1, p0, Landroidx/camera/core/v1;->d:Ljava/lang/Long;

    .line 4
    iput-object p1, p0, Landroidx/camera/core/v1;->e:Ljava/lang/Integer;

    .line 5
    iput-object p1, p0, Landroidx/camera/core/v1;->f:Landroid/graphics/Matrix;

    return-void
.end method

.method private n(Landroidx/camera/core/l1;)Landroidx/camera/core/l1;
    .locals 6

    .line 1
    invoke-interface {p1}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v0

    .line 2
    iget-object v1, p0, Landroidx/camera/core/v1;->c:Lw/j2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/core/v1;->c:Lw/j2;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroidx/camera/core/i1;->a()Lw/j2;

    move-result-object v1

    .line 3
    :goto_0
    iget-object v2, p0, Landroidx/camera/core/v1;->d:Ljava/lang/Long;

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/camera/core/v1;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Landroidx/camera/core/i1;->c()J

    move-result-wide v2

    .line 4
    :goto_1
    iget-object v4, p0, Landroidx/camera/core/v1;->e:Ljava/lang/Integer;

    if-eqz v4, :cond_2

    iget-object v4, p0, Landroidx/camera/core/v1;->e:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_2

    .line 5
    :cond_2
    invoke-interface {v0}, Landroidx/camera/core/i1;->d()I

    move-result v4

    .line 6
    :goto_2
    iget-object v5, p0, Landroidx/camera/core/v1;->f:Landroid/graphics/Matrix;

    if-eqz v5, :cond_3

    iget-object v0, p0, Landroidx/camera/core/v1;->f:Landroid/graphics/Matrix;

    goto :goto_3

    .line 7
    :cond_3
    invoke-interface {v0}, Landroidx/camera/core/i1;->e()Landroid/graphics/Matrix;

    move-result-object v0

    .line 8
    :goto_3
    invoke-static {v1, v2, v3, v4, v0}, Landroidx/camera/core/o1;->f(Lw/j2;JILandroid/graphics/Matrix;)Landroidx/camera/core/i1;

    move-result-object v0

    .line 9
    new-instance v1, Landroidx/camera/core/m2;

    invoke-direct {v1, p1, v0}, Landroidx/camera/core/m2;-><init>(Landroidx/camera/core/l1;Landroidx/camera/core/i1;)V

    return-object v1
.end method


# virtual methods
.method public c()Landroidx/camera/core/l1;
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/d;->i()Landroidx/camera/core/l1;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/v1;->n(Landroidx/camera/core/l1;)Landroidx/camera/core/l1;

    move-result-object v0

    return-object v0
.end method

.method public i()Landroidx/camera/core/l1;
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/d;->i()Landroidx/camera/core/l1;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/v1;->n(Landroidx/camera/core/l1;)Landroidx/camera/core/l1;

    move-result-object v0

    return-object v0
.end method

.method o(Lw/j2;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/v1;->c:Lw/j2;

    return-void
.end method
