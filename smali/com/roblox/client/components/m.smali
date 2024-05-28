.class public Lcom/roblox/client/components/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/appcompat/widget/Toolbar;Landroid/content/Context;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 3
    invoke-static {p1, p3}, Lcom/roblox/client/d1;->c(Landroid/content/Context;I)F

    move-result p1

    float-to-int p1, p1

    iput p1, p2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 4
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public static b(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static c(Landroidx/appcompat/widget/Toolbar;Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->n0()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_2

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/p0;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public static d(Landroidx/appcompat/widget/Toolbar;I)V
    .locals 4

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroidx/appcompat/widget/AppCompatImageButton;

    if-ne v2, v3, :cond_0

    .line 4
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 5
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageResource(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static e(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/roblox/client/components/m;->f(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;Z)V

    return-void
.end method

.method public static f(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p2}, Lcom/roblox/client/components/m;->c(Landroidx/appcompat/widget/Toolbar;Z)V

    .line 2
    invoke-static {p0, p1}, Lcom/roblox/client/components/m;->b(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V

    return-void
.end method
