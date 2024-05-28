.class public Lcom/roblox/client/AutoResizeTextView;
.super Landroid/widget/TextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/AutoResizeTextView$b;
    }
.end annotation


# instance fields
.field private n:Landroid/graphics/RectF;

.field private o:Landroid/graphics/RectF;

.field private p:Landroid/util/SparseIntArray;

.field private q:Landroid/text/TextPaint;

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:I

.field private w:I

.field private x:Z

.field private y:Z

.field private final z:Lcom/roblox/client/AutoResizeTextView$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/AutoResizeTextView;->n:Landroid/graphics/RectF;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->s:F

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->t:F

    const/high16 p1, 0x41a00000    # 20.0f

    .line 5
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->u:F

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/roblox/client/AutoResizeTextView;->x:Z

    .line 7
    new-instance p1, Lcom/roblox/client/AutoResizeTextView$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/AutoResizeTextView$a;-><init>(Lcom/roblox/client/AutoResizeTextView;)V

    iput-object p1, p0, Lcom/roblox/client/AutoResizeTextView;->z:Lcom/roblox/client/AutoResizeTextView$b;

    .line 8
    invoke-direct {p0}, Lcom/roblox/client/AutoResizeTextView;->i()V

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/AutoResizeTextView;)Landroid/text/TextPaint;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/AutoResizeTextView;->q:Landroid/text/TextPaint;

    return-object p0
.end method

.method static synthetic b(Lcom/roblox/client/AutoResizeTextView;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/AutoResizeTextView;->n:Landroid/graphics/RectF;

    return-object p0
.end method

.method static synthetic c(Lcom/roblox/client/AutoResizeTextView;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/AutoResizeTextView;->v:I

    return p0
.end method

.method static synthetic d(Lcom/roblox/client/AutoResizeTextView;)F
    .locals 0

    iget p0, p0, Lcom/roblox/client/AutoResizeTextView;->s:F

    return p0
.end method

.method static synthetic e(Lcom/roblox/client/AutoResizeTextView;)F
    .locals 0

    iget p0, p0, Lcom/roblox/client/AutoResizeTextView;->t:F

    return p0
.end method

.method private f(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-boolean p1, p0, Lcom/roblox/client/AutoResizeTextView;->y:Z

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget p1, p0, Lcom/roblox/client/AutoResizeTextView;->u:F

    float-to-int p1, p1

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    .line 6
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/roblox/client/AutoResizeTextView;->v:I

    .line 7
    iget-object v2, p0, Lcom/roblox/client/AutoResizeTextView;->o:Landroid/graphics/RectF;

    int-to-float v1, v1

    iput v1, v2, Landroid/graphics/RectF;->right:F

    int-to-float v0, v0

    .line 8
    iput v0, v2, Landroid/graphics/RectF;->bottom:F

    const/4 v0, 0x0

    .line 9
    iget v1, p0, Lcom/roblox/client/AutoResizeTextView;->r:F

    float-to-int v1, v1

    iget-object v3, p0, Lcom/roblox/client/AutoResizeTextView;->z:Lcom/roblox/client/AutoResizeTextView$b;

    .line 10
    invoke-direct {p0, p1, v1, v3, v2}, Lcom/roblox/client/AutoResizeTextView;->h(IILcom/roblox/client/AutoResizeTextView$b;Landroid/graphics/RectF;)I

    move-result p1

    int-to-float p1, p1

    .line 11
    invoke-super {p0, v0, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void
.end method

.method private static g(IILcom/roblox/client/AutoResizeTextView$b;Landroid/graphics/RectF;)I
    .locals 3

    add-int/lit8 p1, p1, -0x1

    move v0, p1

    move p1, p0

    :goto_0
    if-gt p0, v0, :cond_1

    add-int p1, p0, v0

    ushr-int/lit8 p1, p1, 0x1

    invoke-interface {p2, p1, p3}, Lcom/roblox/client/AutoResizeTextView$b;->a(ILandroid/graphics/RectF;)I

    move-result v1

    if-gez v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    move v2, p1

    move p1, p0

    move p0, v2

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    add-int/lit8 p1, p1, -0x1

    move v0, p1

    goto :goto_0

    :cond_1
    return p1
.end method

.method private h(IILcom/roblox/client/AutoResizeTextView$b;Landroid/graphics/RectF;)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/AutoResizeTextView;->x:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1, p2, p3, p4}, Lcom/roblox/client/AutoResizeTextView;->g(IILcom/roblox/client/AutoResizeTextView$b;Landroid/graphics/RectF;)I

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/roblox/client/AutoResizeTextView;->p:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    if-eqz v1, :cond_2

    return v1

    .line 6
    :cond_2
    invoke-static {p1, p2, p3, p4}, Lcom/roblox/client/AutoResizeTextView;->g(IILcom/roblox/client/AutoResizeTextView$b;Landroid/graphics/RectF;)I

    move-result p1

    .line 7
    iget-object p2, p0, Lcom/roblox/client/AutoResizeTextView;->p:Landroid/util/SparseIntArray;

    invoke-virtual {p2, v0, p1}, Landroid/util/SparseIntArray;->put(II)V

    return p1
.end method

.method private i()V
    .locals 2

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lcom/roblox/client/AutoResizeTextView;->q:Landroid/text/TextPaint;

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    iput v0, p0, Lcom/roblox/client/AutoResizeTextView;->r:F

    .line 3
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/AutoResizeTextView;->o:Landroid/graphics/RectF;

    .line 4
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/AutoResizeTextView;->p:Landroid/util/SparseIntArray;

    .line 5
    iget v0, p0, Lcom/roblox/client/AutoResizeTextView;->w:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lcom/roblox/client/AutoResizeTextView;->w:I

    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/roblox/client/AutoResizeTextView;->y:Z

    return-void
.end method

.method private j()V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roblox/client/AutoResizeTextView;->f(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onSizeChanged(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/AutoResizeTextView;->p:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/AutoResizeTextView;->j()V

    :cond_1
    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/AutoResizeTextView;->j()V

    return-void
.end method

.method public setLineSpacing(FF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 2
    iput p2, p0, Lcom/roblox/client/AutoResizeTextView;->s:F

    .line 3
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->t:F

    return-void
.end method

.method public setLines(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setLines(I)V

    .line 2
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->w:I

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/AutoResizeTextView;->j()V

    return-void
.end method

.method public setSingleLine()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->setSingleLine()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/roblox/client/AutoResizeTextView;->w:I

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/AutoResizeTextView;->j()V

    return-void
.end method

.method public setSingleLine(Z)V
    .locals 0

    .line 4
    invoke-super {p0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->w:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->w:I

    .line 7
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/AutoResizeTextView;->j()V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/roblox/client/AutoResizeTextView;->f(Ljava/lang/String;)V

    return-void
.end method

.method public setTextSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->r:F

    .line 2
    iget-object p1, p0, Lcom/roblox/client/AutoResizeTextView;->p:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/roblox/client/AutoResizeTextView;->f(Ljava/lang/String;)V

    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 7
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 8
    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/roblox/client/AutoResizeTextView;->r:F

    .line 9
    iget-object p1, p0, Lcom/roblox/client/AutoResizeTextView;->p:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 10
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/roblox/client/AutoResizeTextView;->f(Ljava/lang/String;)V

    return-void
.end method
