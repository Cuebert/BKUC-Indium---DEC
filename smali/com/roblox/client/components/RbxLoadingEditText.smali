.class public Lcom/roblox/client/components/RbxLoadingEditText;
.super Lcom/roblox/client/components/RbxEditText;
.source "SourceFile"


# instance fields
.field protected G:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/components/RbxEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/client/components/RbxLoadingEditText;->setup(Landroid/content/Context;)V

    return-void
.end method

.method private setup(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget v0, Lcom/roblox/client/a0;->z:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/LinearLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roblox/client/components/RbxLoadingEditText;->G:Landroid/widget/ProgressBar;

    .line 2
    sget v1, Lcom/roblox/client/x;->D:I

    .line 3
    invoke-virtual {p0, p1, v1}, Lcom/roblox/client/components/RbxEditText;->n(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/components/RbxEditText;->B(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/components/RbxLoadingEditText;->E()V

    return-void
.end method

.method protected E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/widget/ProgressBar;

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public F()V
    .locals 3

    .line 1
    sget v0, Lcom/roblox/client/c0;->k3:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RbxEditText;->A(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->o:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roblox/client/components/RbxLoadingEditText;->G:Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/components/RbxEditText;->w(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/components/RbxLoadingEditText;->E()V

    return-void
.end method
