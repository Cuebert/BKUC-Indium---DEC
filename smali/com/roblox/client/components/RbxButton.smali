.class public Lcom/roblox/client/components/RbxButton;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field n:Lcom/roblox/client/components/RbxButton;

.field o:Lcom/roblox/client/components/j;

.field private p:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/components/RbxButton;->n:Lcom/roblox/client/components/RbxButton;

    .line 3
    iput-object v0, p0, Lcom/roblox/client/components/RbxButton;->o:Lcom/roblox/client/components/j;

    .line 4
    invoke-static {p0, p1, p2}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-direct {p0, p2}, Lcom/roblox/client/components/RbxButton;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    iput-object p0, p0, Lcom/roblox/client/components/RbxButton;->n:Lcom/roblox/client/components/RbxButton;

    .line 2
    new-instance v0, Lcom/roblox/client/components/j;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/components/j;-><init>(Landroid/view/View;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/roblox/client/components/RbxButton;->o:Lcom/roblox/client/components/j;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxButton;->p:Landroid/view/View$OnClickListener;

    invoke-super {p0, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->draw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxButton;->o:Lcom/roblox/client/components/j;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/j;->i(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxButton;->o:Lcom/roblox/client/components/j;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/j;->l(Landroid/view/MotionEvent;)V

    .line 2
    invoke-super {p0, p1}, Landroid/widget/Button;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/RbxButton;->p:Landroid/view/View$OnClickListener;

    return-void
.end method
