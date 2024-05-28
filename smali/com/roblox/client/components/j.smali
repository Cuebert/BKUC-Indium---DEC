.class public Lcom/roblox/client/components/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Z

.field private o:Landroid/animation/ValueAnimator;

.field private p:Landroid/animation/ValueAnimator;

.field private q:Landroid/animation/ValueAnimator;

.field private r:Landroid/graphics/Rect;

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:F


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/roblox/client/components/j;->n:Z

    .line 4
    iput-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    .line 5
    iput-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    .line 6
    iput-object v0, p0, Lcom/roblox/client/components/j;->q:Landroid/animation/ValueAnimator;

    .line 7
    iput-object v0, p0, Lcom/roblox/client/components/j;->r:Landroid/graphics/Rect;

    const/16 v0, 0x3c

    .line 8
    iput v0, p0, Lcom/roblox/client/components/j;->s:I

    const/16 v1, 0xa

    .line 9
    iput v1, p0, Lcom/roblox/client/components/j;->t:I

    const v2, 0xb8b8b8

    .line 10
    iput v2, p0, Lcom/roblox/client/components/j;->u:I

    const/16 v3, 0xdac

    .line 11
    iput v3, p0, Lcom/roblox/client/components/j;->v:I

    const/16 v4, 0x12c

    .line 12
    iput v4, p0, Lcom/roblox/client/components/j;->w:I

    const/high16 v5, 0x42480000    # 50.0f

    .line 13
    iput v5, p0, Lcom/roblox/client/components/j;->x:F

    if-eqz p1, :cond_1

    .line 14
    iput-object p1, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    if-eqz p2, :cond_0

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v6, Lcom/roblox/client/e0;->w1:[I

    invoke-virtual {p1, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 16
    sget p2, Lcom/roblox/client/e0;->D1:I

    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->d:F

    .line 17
    iput p2, p0, Lcom/roblox/client/components/j;->e:F

    .line 18
    sget p2, Lcom/roblox/client/e0;->z1:I

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->i:I

    .line 19
    sget p2, Lcom/roblox/client/e0;->A1:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->j:I

    .line 20
    sget p2, Lcom/roblox/client/e0;->B1:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->f:I

    .line 21
    sget p2, Lcom/roblox/client/e0;->x1:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->g:I

    .line 22
    sget p2, Lcom/roblox/client/e0;->C1:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->k:I

    .line 23
    sget p2, Lcom/roblox/client/e0;->y1:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/roblox/client/components/j;->m:I

    .line 24
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 25
    :cond_0
    iput v5, p0, Lcom/roblox/client/components/j;->d:F

    .line 26
    iput v5, p0, Lcom/roblox/client/components/j;->e:F

    .line 27
    iput v3, p0, Lcom/roblox/client/components/j;->i:I

    .line 28
    iput v4, p0, Lcom/roblox/client/components/j;->j:I

    .line 29
    iput v0, p0, Lcom/roblox/client/components/j;->f:I

    .line 30
    iput v1, p0, Lcom/roblox/client/components/j;->g:I

    .line 31
    iput v2, p0, Lcom/roblox/client/components/j;->k:I

    .line 32
    iput v2, p0, Lcom/roblox/client/components/j;->m:I

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/roblox/client/components/j;F)F
    .locals 0

    iput p1, p0, Lcom/roblox/client/components/j;->d:F

    return p1
.end method

.method static synthetic b(Lcom/roblox/client/components/j;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    return-object p0
.end method

.method static synthetic c(Lcom/roblox/client/components/j;I)I
    .locals 0

    iput p1, p0, Lcom/roblox/client/components/j;->h:I

    return p1
.end method

.method static synthetic d(Lcom/roblox/client/components/j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/components/j;->n:Z

    return p1
.end method

.method static synthetic e(Lcom/roblox/client/components/j;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/j;->h()V

    return-void
.end method

.method private f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/components/j;->q:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private g(II)F
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/j;->r:Landroid/graphics/Rect;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget v1, v0, Landroid/graphics/Rect;->left:I

    sub-int v2, p1, v1

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int v4, v3, p1

    if-le v2, v4, :cond_0

    sub-int/2addr p1, v1

    move v1, p1

    goto :goto_0

    :cond_0
    sub-int/2addr v3, p1

    move v1, v3

    .line 3
    :goto_0
    iget p1, v0, Landroid/graphics/Rect;->top:I

    sub-int v2, p2, p1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v3, v0, p2

    if-le v2, v3, :cond_1

    sub-int p1, p2, p1

    goto :goto_1

    :cond_1
    sub-int p1, v0, p2

    :goto_1
    move v5, v1

    move v1, p1

    move p1, v5

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-le v1, p1, :cond_3

    goto :goto_3

    :cond_3
    move v1, p1

    :goto_3
    int-to-float p1, v1

    const/high16 p2, 0x43960000    # 300.0f

    add-float/2addr p1, p2

    return p1
.end method

.method private h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/roblox/client/components/j;->q:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 9
    iget-object v0, p0, Lcom/roblox/client/components/j;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    :cond_2
    return-void
.end method

.method private j()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/components/j;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/j;->h()V

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 3
    iget v1, p0, Lcom/roblox/client/components/j;->h:I

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    .line 4
    new-instance v1, Lcom/roblox/client/components/j$c;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/j$c;-><init>(Lcom/roblox/client/components/j;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/roblox/client/components/j$d;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/j$d;-><init>(Lcom/roblox/client/components/j;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    iget v1, p0, Lcom/roblox/client/components/j;->j:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 7
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 8
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private k(II)Z
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 1
    iget-object v1, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v0, v0, v3

    .line 2
    iget-object v4, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 3
    iget-object v5, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    if-lt p1, v2, :cond_1

    add-int/2addr v2, v4

    if-gt p1, v2, :cond_1

    if-lt p2, v0, :cond_1

    add-int/2addr v0, v5

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    return v1
.end method

.method private n()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/components/j;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/j;->h()V

    .line 3
    :cond_0
    iget v0, p0, Lcom/roblox/client/components/j;->e:F

    iput v0, p0, Lcom/roblox/client/components/j;->d:F

    .line 4
    iget v1, p0, Lcom/roblox/client/components/j;->f:I

    iput v1, p0, Lcom/roblox/client/components/j;->h:I

    .line 5
    iget v1, p0, Lcom/roblox/client/components/j;->k:I

    iput v1, p0, Lcom/roblox/client/components/j;->l:I

    const/4 v1, 0x2

    new-array v2, v1, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    .line 6
    iget v0, p0, Lcom/roblox/client/components/j;->b:F

    float-to-int v0, v0

    iget v4, p0, Lcom/roblox/client/components/j;->c:F

    float-to-int v4, v4

    invoke-direct {p0, v0, v4}, Lcom/roblox/client/components/j;->g(II)F

    move-result v0

    const/4 v4, 0x1

    aput v0, v2, v4

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    .line 7
    new-instance v2, Lcom/roblox/client/components/j$a;

    invoke-direct {v2, p0}, Lcom/roblox/client/components/j$a;-><init>(Lcom/roblox/client/components/j;)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 8
    iget-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    iget v2, p0, Lcom/roblox/client/components/j;->i:I

    int-to-long v5, v2

    invoke-virtual {v0, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 9
    iget-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    new-instance v2, Lc1/c;

    invoke-direct {v2}, Lc1/c;-><init>()V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 10
    iget-object v0, p0, Lcom/roblox/client/components/j;->o:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    new-array v0, v1, [I

    .line 11
    iget v1, p0, Lcom/roblox/client/components/j;->h:I

    aput v1, v0, v3

    iget v1, p0, Lcom/roblox/client/components/j;->g:I

    aput v1, v0, v4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    .line 12
    new-instance v1, Lcom/roblox/client/components/j$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/j$b;-><init>(Lcom/roblox/client/components/j;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 13
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    iget v1, p0, Lcom/roblox/client/components/j;->i:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 14
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Lc1/a;

    invoke-direct {v1}, Lc1/a;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 15
    iget-object v0, p0, Lcom/roblox/client/components/j;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public i(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/components/j;->n:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 3
    iget v1, p0, Lcom/roblox/client/components/j;->l:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget v1, p0, Lcom/roblox/client/components/j;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 5
    iget v1, p0, Lcom/roblox/client/components/j;->b:F

    iget v2, p0, Lcom/roblox/client/components/j;->c:F

    iget v3, p0, Lcom/roblox/client/components/j;->d:F

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public l(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/j;->r:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/j;->r:Landroid/graphics/Rect;

    .line 3
    iget-object v1, p0, Lcom/roblox/client/components/j;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/components/j;->j()V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p0, v0, p1}, Lcom/roblox/client/components/j;->k(II)Z

    move-result p1

    if-nez p1, :cond_5

    .line 7
    invoke-direct {p0}, Lcom/roblox/client/components/j;->j()V

    goto :goto_0

    .line 8
    :cond_3
    invoke-direct {p0}, Lcom/roblox/client/components/j;->j()V

    goto :goto_0

    .line 9
    :cond_4
    iput-boolean v1, p0, Lcom/roblox/client/components/j;->n:Z

    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roblox/client/components/j;->b:F

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/roblox/client/components/j;->c:F

    .line 12
    invoke-direct {p0}, Lcom/roblox/client/components/j;->n()V

    :cond_5
    :goto_0
    return-void
.end method

.method public m(I)V
    .locals 0

    iput p1, p0, Lcom/roblox/client/components/j;->k:I

    return-void
.end method
