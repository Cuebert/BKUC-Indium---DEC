.class public Lcom/roblox/client/qrscanner/CustomViewfinderView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private final n:F

.field private final o:F

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private t:I

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p2, 0x41800000    # 16.0f

    .line 2
    iput p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->n:F

    .line 3
    iput p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->o:F

    const/16 v0, 0x190

    .line 4
    iput v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->p:I

    const/16 v0, 0x50

    .line 5
    iput v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->q:I

    .line 6
    invoke-direct {p0, p2, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->r:I

    .line 7
    invoke-direct {p0, p2, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->s:I

    return-void
.end method

.method private a(FLandroid/content/Context;)I
    .locals 0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->densityDpi:I

    div-int/lit16 p2, p2, 0xa0

    int-to-float p2, p2

    mul-float p1, p1, p2

    float-to-int p1, p1

    return p1
.end method

.method private b(Landroid/graphics/Canvas;Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-direct {p0, p2}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e(Landroid/content/Context;)Landroid/graphics/Rect;

    move-result-object p2

    .line 2
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 3
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 4
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    .line 5
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    const/high16 v2, 0x7f000000

    .line 6
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget v2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->t:I

    int-to-float v5, v2

    int-to-float v9, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move v6, v9

    move-object v7, v8

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    int-to-float v5, v0

    add-int/2addr v1, p2

    int-to-float v1, v1

    move v4, v9

    move v6, v1

    .line 8
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v0, p2

    int-to-float v3, v0

    .line 9
    iget p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->t:I

    int-to-float v5, p2

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 10
    iget p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->t:I

    int-to-float v5, p2

    iget p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->u:I

    int-to-float v6, p2

    const/4 v3, 0x0

    move v4, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Landroidx/core/content/a;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 2
    invoke-virtual {p2, p4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 3
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private d(Landroid/graphics/Canvas;Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-direct {p0, p2}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e(Landroid/content/Context;)Landroid/graphics/Rect;

    move-result-object v0

    .line 2
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 3
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 4
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 5
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 6
    iget v4, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->r:I

    add-int/2addr v4, v1

    iget v5, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->s:I

    add-int/2addr v5, v2

    invoke-virtual {v3, v1, v2, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 7
    sget v4, Lcom/roblox/client/x;->g:I

    invoke-direct {p0, p1, p2, v4, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    add-int v4, v1, v0

    .line 8
    iget v5, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->r:I

    sub-int v5, v4, v5

    iget v6, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->s:I

    add-int/2addr v6, v2

    invoke-virtual {v3, v5, v2, v4, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 9
    sget v5, Lcom/roblox/client/x;->i:I

    invoke-direct {p0, p1, p2, v5, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    add-int/2addr v2, v0

    .line 10
    iget v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->s:I

    sub-int v0, v2, v0

    iget v5, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->r:I

    add-int/2addr v5, v1

    invoke-virtual {v3, v1, v0, v5, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 11
    sget v0, Lcom/roblox/client/x;->f:I

    invoke-direct {p0, p1, p2, v0, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    .line 12
    iget v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->r:I

    sub-int v0, v4, v0

    iget v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->s:I

    sub-int v1, v2, v1

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 13
    sget v0, Lcom/roblox/client/x;->h:I

    invoke-direct {p0, p1, p2, v0, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    return-void
.end method

.method private e(Landroid/content/Context;)Landroid/graphics/Rect;
    .locals 4

    const/high16 v0, 0x42a00000    # 80.0f

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result v0

    const/high16 v1, 0x43c80000    # 400.0f

    .line 2
    invoke-direct {p0, v1, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result p1

    .line 3
    iget v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->t:I

    mul-int/lit8 v2, v0, 0x2

    sub-int v2, v1, v2

    if-le v2, p1, :cond_0

    sub-int/2addr v1, p1

    .line 4
    div-int/lit8 v0, v1, 0x2

    goto :goto_0

    :cond_0
    move p1, v2

    .line 5
    :goto_0
    iget v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->u:I

    sub-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x2

    .line 6
    new-instance v2, Landroid/graphics/Rect;

    add-int v3, v0, p1

    add-int/2addr p1, v1

    invoke-direct {v2, v0, v1, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->t:I

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->u:I

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->b(Landroid/graphics/Canvas;Landroid/content/Context;)V

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->d(Landroid/graphics/Canvas;Landroid/content/Context;)V

    return-void
.end method
