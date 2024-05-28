.class public Lf9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf9/d$a;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Point;

.field private b:Landroid/graphics/Point;

.field private c:Landroid/graphics/Point;

.field private d:Landroid/graphics/Point;

.field private e:I

.field private f:I

.field private g:I

.field private h:F

.field private i:Lf9/d$a;


# direct methods
.method public constructor <init>(Lf9/d$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lf9/d;->a:Landroid/graphics/Point;

    .line 3
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lf9/d;->b:Landroid/graphics/Point;

    .line 4
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lf9/d;->c:Landroid/graphics/Point;

    .line 5
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lf9/d;->d:Landroid/graphics/Point;

    .line 6
    iput-object p1, p0, Lf9/d;->i:Lf9/d$a;

    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lf9/d;->g:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    iput v0, p0, Lf9/d;->h:F

    .line 9
    iput p1, p0, Lf9/d;->e:I

    .line 10
    iput p1, p0, Lf9/d;->f:I

    return-void
.end method

.method private f()V
    .locals 9

    .line 1
    iget-object v0, p0, Lf9/d;->b:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lf9/d;->a:Landroid/graphics/Point;

    iget v3, v2, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    .line 2
    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    float-to-double v1, v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 3
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    float-to-double v5, v0

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    add-double/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    .line 4
    iget-object v2, p0, Lf9/d;->d:Landroid/graphics/Point;

    iget v5, v2, Landroid/graphics/Point;->x:I

    iget-object v6, p0, Lf9/d;->c:Landroid/graphics/Point;

    iget v7, v6, Landroid/graphics/Point;->x:I

    sub-int/2addr v5, v7

    int-to-float v5, v5

    .line 5
    iget v2, v2, Landroid/graphics/Point;->y:I

    iget v6, v6, Landroid/graphics/Point;->y:I

    sub-int/2addr v2, v6

    int-to-float v2, v2

    float-to-double v5, v5

    .line 6
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    float-to-double v7, v2

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v6, v0, v4

    if-eqz v6, :cond_0

    div-double/2addr v2, v0

    double-to-float v0, v2

    .line 7
    iput v0, p0, Lf9/d;->h:F

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    iput v0, p0, Lf9/d;->h:F

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Point;
    .locals 2

    .line 1
    iget v0, p0, Lf9/d;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lf9/d;->c:Landroid/graphics/Point;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    return-object v0
.end method

.method public b()Landroid/graphics/Point;
    .locals 2

    .line 1
    iget v0, p0, Lf9/d;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lf9/d;->d:Landroid/graphics/Point;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    return-object v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lf9/d;->h:F

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lf9/d;->g:I

    return v0
.end method

.method public e(Landroid/view/MotionEvent;)Z
    .locals 7

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz v1, :cond_6

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x2

    if-eq v1, v0, :cond_4

    if-eq v1, v5, :cond_3

    const/4 v6, 0x5

    if-eq v1, v6, :cond_2

    const/4 p1, 0x6

    if-eq v1, p1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iput v5, p0, Lf9/d;->g:I

    .line 3
    iget p1, p0, Lf9/d;->e:I

    if-eq p1, v3, :cond_1

    iget p1, p0, Lf9/d;->f:I

    if-eq p1, v3, :cond_1

    .line 4
    iget-object p1, p0, Lf9/d;->i:Lf9/d$a;

    invoke-interface {p1, p0}, Lf9/d$a;->b(Lf9/d;)V

    .line 5
    :cond_1
    iput v4, p0, Lf9/d;->h:F

    .line 6
    iput v3, p0, Lf9/d;->f:I

    goto/16 :goto_0

    .line 7
    :cond_2
    iget v1, p0, Lf9/d;->f:I

    if-ne v1, v3, :cond_7

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, p0, Lf9/d;->f:I

    .line 9
    iget-object v1, p0, Lf9/d;->a:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->e:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->x:I

    .line 10
    iget-object v1, p0, Lf9/d;->a:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->e:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->y:I

    .line 11
    iget-object v1, p0, Lf9/d;->b:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->f:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->x:I

    .line 12
    iget-object v1, p0, Lf9/d;->b:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->f:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->y:I

    .line 13
    iget-object v1, p0, Lf9/d;->c:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->e:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->x:I

    .line 14
    iget-object v1, p0, Lf9/d;->c:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->e:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->y:I

    .line 15
    iget-object v1, p0, Lf9/d;->d:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->f:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v1, Landroid/graphics/Point;->x:I

    .line 16
    iget-object v1, p0, Lf9/d;->d:Landroid/graphics/Point;

    iget v4, p0, Lf9/d;->f:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v1, Landroid/graphics/Point;->y:I

    .line 17
    iput v2, p0, Lf9/d;->g:I

    .line 18
    iget p1, p0, Lf9/d;->e:I

    if-eq p1, v3, :cond_7

    .line 19
    iget-object p1, p0, Lf9/d;->i:Lf9/d$a;

    invoke-interface {p1, p0}, Lf9/d$a;->b(Lf9/d;)V

    goto/16 :goto_0

    .line 20
    :cond_3
    iget v1, p0, Lf9/d;->e:I

    if-eq v1, v3, :cond_7

    iget v2, p0, Lf9/d;->f:I

    if-eq v2, v3, :cond_7

    .line 21
    iput v0, p0, Lf9/d;->g:I

    .line 22
    iget-object v2, p0, Lf9/d;->c:Landroid/graphics/Point;

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v2, Landroid/graphics/Point;->x:I

    .line 23
    iget-object v1, p0, Lf9/d;->c:Landroid/graphics/Point;

    iget v2, p0, Lf9/d;->e:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/graphics/Point;->y:I

    .line 24
    iget-object v1, p0, Lf9/d;->d:Landroid/graphics/Point;

    iget v2, p0, Lf9/d;->f:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/graphics/Point;->x:I

    .line 25
    iget-object v1, p0, Lf9/d;->d:Landroid/graphics/Point;

    iget v2, p0, Lf9/d;->f:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v1, Landroid/graphics/Point;->y:I

    .line 26
    invoke-direct {p0}, Lf9/d;->f()V

    .line 27
    iget-object p1, p0, Lf9/d;->i:Lf9/d$a;

    if-eqz p1, :cond_7

    .line 28
    invoke-interface {p1, p0}, Lf9/d$a;->b(Lf9/d;)V

    goto :goto_0

    .line 29
    :cond_4
    iput v5, p0, Lf9/d;->g:I

    .line 30
    iget p1, p0, Lf9/d;->e:I

    if-eq p1, v3, :cond_5

    iget p1, p0, Lf9/d;->f:I

    if-eq p1, v3, :cond_5

    .line 31
    iget-object p1, p0, Lf9/d;->i:Lf9/d$a;

    invoke-interface {p1, p0}, Lf9/d$a;->b(Lf9/d;)V

    .line 32
    :cond_5
    iput v4, p0, Lf9/d;->h:F

    .line 33
    iput v3, p0, Lf9/d;->e:I

    goto :goto_0

    .line 34
    :cond_6
    iget v1, p0, Lf9/d;->e:I

    if-ne v1, v3, :cond_7

    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lf9/d;->e:I

    .line 36
    iput v3, p0, Lf9/d;->f:I

    .line 37
    iput v2, p0, Lf9/d;->g:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    :goto_0
    return v0
.end method
