.class public Lf7/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf9/e;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lf9/e;

    invoke-direct {v0}, Lf9/e;-><init>()V

    iput-object v0, p0, Lf7/i0;->a:Lf9/e;

    .line 3
    iput-object p1, p0, Lf7/i0;->b:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lf7/i0;)F
    .locals 0

    invoke-direct {p0}, Lf7/i0;->c()F

    move-result p0

    return p0
.end method

.method static synthetic b(Lf7/i0;Landroid/graphics/RectF;F)Landroid/graphics/Rect;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/i0;->e(Landroid/graphics/RectF;F)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method private c()F
    .locals 2

    iget-object v0, p0, Lf7/i0;->a:Lf9/e;

    iget-object v1, p0, Lf7/i0;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method private d(FF)I
    .locals 2

    div-float/2addr p1, p2

    float-to-double p1, p1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double/2addr p1, v0

    double-to-int p1, p1

    return p1
.end method

.method private e(Landroid/graphics/RectF;F)Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/RectF;->left:F

    invoke-direct {p0, v1, p2}, Lf7/i0;->d(FF)I

    move-result v1

    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 2
    invoke-direct {p0, v2, p2}, Lf7/i0;->d(FF)I

    move-result v2

    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 3
    invoke-direct {p0, v3, p2}, Lf7/i0;->d(FF)I

    move-result v3

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 4
    invoke-direct {p0, p1, p2}, Lf7/i0;->d(FF)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method


# virtual methods
.method public f(Landroidx/lifecycle/l;Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/l;",
            "Landroidx/lifecycle/LiveData<",
            "Landroid/graphics/Rect;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lf7/i0$a;

    invoke-direct {v0, p0}, Lf7/i0$a;-><init>(Lf7/i0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/LiveData;->i(Landroidx/lifecycle/l;Landroidx/lifecycle/s;)V

    return-void
.end method
