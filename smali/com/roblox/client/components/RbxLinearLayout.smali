.class public Lcom/roblox/client/components/RbxLinearLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private n:Lcom/roblox/client/components/j;

.field private o:F

.field private p:Z

.field private q:F

.field private r:F

.field private s:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/RbxLinearLayout;->n:Lcom/roblox/client/components/j;

    const/high16 p1, 0x41a00000    # 20.0f

    .line 3
    iput p1, p0, Lcom/roblox/client/components/RbxLinearLayout;->o:F

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/roblox/client/components/RbxLinearLayout;->p:Z

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/components/RbxLinearLayout;->s:Ljava/lang/Integer;

    .line 6
    new-instance p1, Lcom/roblox/client/components/j;

    invoke-direct {p1, p0, p2}, Lcom/roblox/client/components/j;-><init>(Landroid/view/View;Landroid/util/AttributeSet;)V

    iput-object p1, p0, Lcom/roblox/client/components/RbxLinearLayout;->n:Lcom/roblox/client/components/j;

    .line 7
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lcom/roblox/client/v;->g:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/j;->m(I)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/components/RbxLinearLayout;->p:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 3
    iget-object v1, p0, Lcom/roblox/client/components/RbxLinearLayout;->s:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget v1, p0, Lcom/roblox/client/components/RbxLinearLayout;->q:F

    iget v2, p0, Lcom/roblox/client/components/RbxLinearLayout;->r:F

    iget v3, p0, Lcom/roblox/client/components/RbxLinearLayout;->o:F

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 5
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getXFraction()F
    .locals 2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public getYFraction()F
    .locals 2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getY()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public setXFraction(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    int-to-float v0, v0

    mul-float p1, p1, v0

    goto :goto_0

    :cond_0
    const p1, -0x39e3c400    # -9999.0f

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setX(F)V

    return-void
.end method

.method public setYFraction(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    int-to-float v0, v0

    mul-float p1, p1, v0

    goto :goto_0

    :cond_0
    const p1, -0x39e3c400    # -9999.0f

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setY(F)V

    return-void
.end method
