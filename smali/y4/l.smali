.class public Ly4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/l$c;,
        Ly4/l$b;,
        Ly4/l$a;
    }
.end annotation


# instance fields
.field private final a:[Ly4/m;

.field private final b:[Landroid/graphics/Matrix;

.field private final c:[Landroid/graphics/Matrix;

.field private final d:Landroid/graphics/PointF;

.field private final e:Landroid/graphics/Path;

.field private final f:Landroid/graphics/Path;

.field private final g:Ly4/m;

.field private final h:[F

.field private final i:[F

.field private final j:Landroid/graphics/Path;

.field private final k:Landroid/graphics/Path;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Ly4/m;

    .line 2
    iput-object v1, p0, Ly4/l;->a:[Ly4/m;

    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 3
    iput-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 4
    iput-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    .line 5
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Ly4/l;->d:Landroid/graphics/PointF;

    .line 6
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ly4/l;->e:Landroid/graphics/Path;

    .line 7
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ly4/l;->f:Landroid/graphics/Path;

    .line 8
    new-instance v1, Ly4/m;

    invoke-direct {v1}, Ly4/m;-><init>()V

    iput-object v1, p0, Ly4/l;->g:Ly4/m;

    const/4 v1, 0x2

    new-array v2, v1, [F

    .line 9
    iput-object v2, p0, Ly4/l;->h:[F

    new-array v1, v1, [F

    .line 10
    iput-object v1, p0, Ly4/l;->i:[F

    .line 11
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ly4/l;->j:Landroid/graphics/Path;

    .line 12
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ly4/l;->k:Landroid/graphics/Path;

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Ly4/l;->l:Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    iget-object v2, p0, Ly4/l;->a:[Ly4/m;

    new-instance v3, Ly4/m;

    invoke-direct {v3}, Ly4/m;-><init>()V

    aput-object v3, v2, v1

    .line 15
    iget-object v2, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    .line 16
    iget-object v2, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(I)F
    .locals 0

    add-int/lit8 p1, p1, 0x1

    mul-int/lit8 p1, p1, 0x5a

    int-to-float p1, p1

    return p1
.end method

.method private b(Ly4/l$c;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->a:[Ly4/m;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ly4/m;->k()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 2
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->a:[Ly4/m;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ly4/m;->l()F

    move-result v1

    const/4 v3, 0x1

    aput v1, v0, v3

    .line 3
    iget-object v0, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v0, v0, p2

    iget-object v1, p0, Ly4/l;->h:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    if-nez p2, :cond_0

    .line 4
    iget-object v0, p1, Ly4/l$c;->b:Landroid/graphics/Path;

    iget-object v1, p0, Ly4/l;->h:[F

    aget v2, v1, v2

    aget v1, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p1, Ly4/l$c;->b:Landroid/graphics/Path;

    iget-object v1, p0, Ly4/l;->h:[F

    aget v2, v1, v2

    aget v1, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 6
    :goto_0
    iget-object v0, p0, Ly4/l;->a:[Ly4/m;

    aget-object v0, v0, p2

    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    iget-object v2, p1, Ly4/l$c;->b:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v2}, Ly4/m;->d(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 7
    iget-object p1, p1, Ly4/l$c;->d:Ly4/l$b;

    if-eqz p1, :cond_1

    .line 8
    iget-object v0, p0, Ly4/l;->a:[Ly4/m;

    aget-object v0, v0, p2

    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    invoke-interface {p1, v0, v1, p2}, Ly4/l$b;->b(Ly4/m;Landroid/graphics/Matrix;I)V

    :cond_1
    return-void
.end method

.method private c(Ly4/l$c;I)V
    .locals 8

    add-int/lit8 v0, p2, 0x1

    .line 1
    rem-int/lit8 v0, v0, 0x4

    .line 2
    iget-object v1, p0, Ly4/l;->h:[F

    iget-object v2, p0, Ly4/l;->a:[Ly4/m;

    aget-object v2, v2, p2

    invoke-virtual {v2}, Ly4/m;->i()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 3
    iget-object v1, p0, Ly4/l;->h:[F

    iget-object v2, p0, Ly4/l;->a:[Ly4/m;

    aget-object v2, v2, p2

    invoke-virtual {v2}, Ly4/m;->j()F

    move-result v2

    const/4 v4, 0x1

    aput v2, v1, v4

    .line 4
    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    iget-object v2, p0, Ly4/l;->h:[F

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 5
    iget-object v1, p0, Ly4/l;->i:[F

    iget-object v2, p0, Ly4/l;->a:[Ly4/m;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ly4/m;->k()F

    move-result v2

    aput v2, v1, v3

    .line 6
    iget-object v1, p0, Ly4/l;->i:[F

    iget-object v2, p0, Ly4/l;->a:[Ly4/m;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ly4/m;->l()F

    move-result v2

    aput v2, v1, v4

    .line 7
    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v1, v1, v0

    iget-object v2, p0, Ly4/l;->i:[F

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 8
    iget-object v1, p0, Ly4/l;->h:[F

    aget v2, v1, v3

    iget-object v5, p0, Ly4/l;->i:[F

    aget v6, v5, v3

    sub-float/2addr v2, v6

    float-to-double v6, v2

    aget v1, v1, v4

    aget v2, v5, v4

    sub-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v1

    double-to-float v1, v1

    const v2, 0x3a83126f    # 0.001f

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 10
    iget-object v5, p1, Ly4/l$c;->c:Landroid/graphics/RectF;

    invoke-direct {p0, v5, p2}, Ly4/l;->i(Landroid/graphics/RectF;I)F

    move-result v5

    .line 11
    iget-object v6, p0, Ly4/l;->g:Ly4/m;

    invoke-virtual {v6, v2, v2}, Ly4/m;->n(FF)V

    .line 12
    iget-object v2, p1, Ly4/l$c;->a:Ly4/k;

    invoke-direct {p0, p2, v2}, Ly4/l;->j(ILy4/k;)Ly4/f;

    move-result-object v2

    .line 13
    iget v6, p1, Ly4/l$c;->e:F

    iget-object v7, p0, Ly4/l;->g:Ly4/m;

    invoke-virtual {v2, v1, v5, v6, v7}, Ly4/f;->d(FFFLy4/m;)V

    .line 14
    iget-object v1, p0, Ly4/l;->j:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 15
    iget-object v1, p0, Ly4/l;->g:Ly4/m;

    iget-object v5, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v5, v5, p2

    iget-object v6, p0, Ly4/l;->j:Landroid/graphics/Path;

    invoke-virtual {v1, v5, v6}, Ly4/m;->d(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 16
    iget-boolean v1, p0, Ly4/l;->l:Z

    if-eqz v1, :cond_1

    .line 17
    invoke-virtual {v2}, Ly4/f;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ly4/l;->j:Landroid/graphics/Path;

    .line 18
    invoke-direct {p0, v1, p2}, Ly4/l;->l(Landroid/graphics/Path;I)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ly4/l;->j:Landroid/graphics/Path;

    .line 19
    invoke-direct {p0, v1, v0}, Ly4/l;->l(Landroid/graphics/Path;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 20
    :cond_0
    iget-object v0, p0, Ly4/l;->j:Landroid/graphics/Path;

    iget-object v1, p0, Ly4/l;->f:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    invoke-virtual {v0, v0, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 21
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->g:Ly4/m;

    invoke-virtual {v1}, Ly4/m;->k()F

    move-result v1

    aput v1, v0, v3

    .line 22
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->g:Ly4/m;

    invoke-virtual {v1}, Ly4/m;->l()F

    move-result v1

    aput v1, v0, v4

    .line 23
    iget-object v0, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v0, v0, p2

    iget-object v1, p0, Ly4/l;->h:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 24
    iget-object v0, p0, Ly4/l;->e:Landroid/graphics/Path;

    iget-object v1, p0, Ly4/l;->h:[F

    aget v2, v1, v3

    aget v1, v1, v4

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 25
    iget-object v0, p0, Ly4/l;->g:Ly4/m;

    iget-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    iget-object v2, p0, Ly4/l;->e:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v2}, Ly4/m;->d(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, p0, Ly4/l;->g:Ly4/m;

    iget-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    iget-object v2, p1, Ly4/l$c;->b:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v2}, Ly4/m;->d(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 27
    :goto_0
    iget-object p1, p1, Ly4/l$c;->d:Ly4/l$b;

    if-eqz p1, :cond_2

    .line 28
    iget-object v0, p0, Ly4/l;->g:Ly4/m;

    iget-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    invoke-interface {p1, v0, v1, p2}, Ly4/l$b;->a(Ly4/m;Landroid/graphics/Matrix;I)V

    :cond_2
    return-void
.end method

.method private f(ILandroid/graphics/RectF;Landroid/graphics/PointF;)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 1
    iget p1, p2, Landroid/graphics/RectF;->right:F

    iget p2, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p3, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_0

    .line 2
    :cond_0
    iget p1, p2, Landroid/graphics/RectF;->left:F

    iget p2, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p3, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_0

    .line 3
    :cond_1
    iget p1, p2, Landroid/graphics/RectF;->left:F

    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p3, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_0

    .line 4
    :cond_2
    iget p1, p2, Landroid/graphics/RectF;->right:F

    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p3, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    :goto_0
    return-void
.end method

.method private g(ILy4/k;)Ly4/c;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 1
    invoke-virtual {p2}, Ly4/k;->t()Ly4/c;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p2}, Ly4/k;->r()Ly4/c;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    invoke-virtual {p2}, Ly4/k;->j()Ly4/c;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p2}, Ly4/k;->l()Ly4/c;

    move-result-object p1

    return-object p1
.end method

.method private h(ILy4/k;)Ly4/d;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 1
    invoke-virtual {p2}, Ly4/k;->s()Ly4/d;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p2}, Ly4/k;->q()Ly4/d;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    invoke-virtual {p2}, Ly4/k;->i()Ly4/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p2}, Ly4/k;->k()Ly4/d;

    move-result-object p1

    return-object p1
.end method

.method private i(Landroid/graphics/RectF;I)F
    .locals 4

    .line 1
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->a:[Ly4/m;

    aget-object v2, v1, p2

    iget v2, v2, Ly4/m;->c:F

    const/4 v3, 0x0

    aput v2, v0, v3

    .line 2
    aget-object v1, v1, p2

    iget v1, v1, Ly4/m;->d:F

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 3
    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    if-eq p2, v2, :cond_0

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iget-object p2, p0, Ly4/l;->h:[F

    aget p2, p2, v2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    iget-object p2, p0, Ly4/l;->h:[F

    aget p2, p2, v3

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1
.end method

.method private j(ILy4/k;)Ly4/f;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 1
    invoke-virtual {p2}, Ly4/k;->o()Ly4/f;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p2}, Ly4/k;->p()Ly4/f;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    invoke-virtual {p2}, Ly4/k;->n()Ly4/f;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p2}, Ly4/k;->h()Ly4/f;

    move-result-object p1

    return-object p1
.end method

.method public static k()Ly4/l;
    .locals 1

    sget-object v0, Ly4/l$a;->a:Ly4/l;

    return-object v0
.end method

.method private l(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/l;->k:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2
    iget-object v0, p0, Ly4/l;->a:[Ly4/m;

    aget-object v0, v0, p2

    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object p2, v1, p2

    iget-object v1, p0, Ly4/l;->k:Landroid/graphics/Path;

    invoke-virtual {v0, p2, v1}, Ly4/m;->d(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 3
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 5
    iget-object v1, p0, Ly4/l;->k:Landroid/graphics/Path;

    invoke-virtual {v1, p2, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 6
    iget-object v1, p0, Ly4/l;->k:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 8
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method private m(Ly4/l$c;I)V
    .locals 7

    .line 1
    iget-object v0, p1, Ly4/l$c;->a:Ly4/k;

    invoke-direct {p0, p2, v0}, Ly4/l;->g(ILy4/k;)Ly4/c;

    move-result-object v6

    .line 2
    iget-object v0, p1, Ly4/l$c;->a:Ly4/k;

    invoke-direct {p0, p2, v0}, Ly4/l;->h(ILy4/k;)Ly4/d;

    move-result-object v1

    iget-object v0, p0, Ly4/l;->a:[Ly4/m;

    aget-object v2, v0, p2

    iget v4, p1, Ly4/l$c;->e:F

    iget-object v5, p1, Ly4/l$c;->c:Landroid/graphics/RectF;

    const/high16 v3, 0x42b40000    # 90.0f

    .line 3
    invoke-virtual/range {v1 .. v6}, Ly4/d;->b(Ly4/m;FFLandroid/graphics/RectF;Ly4/c;)V

    .line 4
    invoke-direct {p0, p2}, Ly4/l;->a(I)F

    move-result v0

    .line 5
    iget-object v1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 6
    iget-object p1, p1, Ly4/l$c;->c:Landroid/graphics/RectF;

    iget-object v1, p0, Ly4/l;->d:Landroid/graphics/PointF;

    invoke-direct {p0, p2, p1, v1}, Ly4/l;->f(ILandroid/graphics/RectF;Landroid/graphics/PointF;)V

    .line 7
    iget-object p1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object p1, p1, p2

    iget-object v1, p0, Ly4/l;->d:Landroid/graphics/PointF;

    iget v2, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 8
    iget-object p1, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object p1, p1, p2

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    return-void
.end method

.method private n(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->a:[Ly4/m;

    aget-object v1, v1, p1

    invoke-virtual {v1}, Ly4/m;->i()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 2
    iget-object v0, p0, Ly4/l;->h:[F

    iget-object v1, p0, Ly4/l;->a:[Ly4/m;

    aget-object v1, v1, p1

    invoke-virtual {v1}, Ly4/m;->j()F

    move-result v1

    const/4 v3, 0x1

    aput v1, v0, v3

    .line 3
    iget-object v0, p0, Ly4/l;->b:[Landroid/graphics/Matrix;

    aget-object v0, v0, p1

    iget-object v1, p0, Ly4/l;->h:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 4
    invoke-direct {p0, p1}, Ly4/l;->a(I)F

    move-result v0

    .line 5
    iget-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v1, v1, p1

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 6
    iget-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object v1, v1, p1

    iget-object v4, p0, Ly4/l;->h:[F

    aget v2, v4, v2

    aget v3, v4, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 7
    iget-object v1, p0, Ly4/l;->c:[Landroid/graphics/Matrix;

    aget-object p1, v1, p1

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    return-void
.end method


# virtual methods
.method public d(Ly4/k;FLandroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Ly4/l;->e(Ly4/k;FLandroid/graphics/RectF;Ly4/l$b;Landroid/graphics/Path;)V

    return-void
.end method

.method public e(Ly4/k;FLandroid/graphics/RectF;Ly4/l$b;Landroid/graphics/Path;)V
    .locals 8

    .line 1
    invoke-virtual {p5}, Landroid/graphics/Path;->rewind()V

    .line 2
    iget-object v0, p0, Ly4/l;->e:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 3
    iget-object v0, p0, Ly4/l;->f:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 4
    iget-object v0, p0, Ly4/l;->f:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, p3, v1}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 5
    new-instance v0, Ly4/l$c;

    move-object v2, v0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, Ly4/l$c;-><init>(Ly4/k;FLandroid/graphics/RectF;Ly4/l$b;Landroid/graphics/Path;)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    const/4 p3, 0x4

    if-ge p2, p3, :cond_0

    .line 6
    invoke-direct {p0, v0, p2}, Ly4/l;->m(Ly4/l$c;I)V

    .line 7
    invoke-direct {p0, p2}, Ly4/l;->n(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge p1, p3, :cond_1

    .line 8
    invoke-direct {p0, v0, p1}, Ly4/l;->b(Ly4/l$c;I)V

    .line 9
    invoke-direct {p0, v0, p1}, Ly4/l;->c(Ly4/l$c;I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p5}, Landroid/graphics/Path;->close()V

    .line 11
    iget-object p1, p0, Ly4/l;->e:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    .line 12
    iget-object p1, p0, Ly4/l;->e:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 13
    iget-object p1, p0, Ly4/l;->e:Landroid/graphics/Path;

    sget-object p2, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {p5, p1, p2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    :cond_2
    return-void
.end method
