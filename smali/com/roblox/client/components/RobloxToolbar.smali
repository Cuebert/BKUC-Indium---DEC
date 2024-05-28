.class public Lcom/roblox/client/components/RobloxToolbar;
.super Landroidx/appcompat/widget/Toolbar;
.source "SourceFile"

# interfaces
.implements Ly8/e$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/RobloxToolbar$g;,
        Lcom/roblox/client/components/RobloxToolbar$i;,
        Lcom/roblox/client/components/RobloxToolbar$j;,
        Lcom/roblox/client/components/RobloxToolbar$f;,
        Lcom/roblox/client/components/RobloxToolbar$d;,
        Lcom/roblox/client/components/RobloxToolbar$c;,
        Lcom/roblox/client/components/RobloxToolbar$b;,
        Lcom/roblox/client/components/RobloxToolbar$h;,
        Lcom/roblox/client/components/RobloxToolbar$e;
    }
.end annotation


# instance fields
.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Ljava/lang/Integer;

.field private q:Ljava/lang/Integer;

.field private r:Lcom/roblox/client/components/RobloxToolbar$e;

.field private s:Lcom/roblox/client/components/RobloxToolbar$h;

.field private t:Lcom/roblox/client/components/RobloxToolbar$i;

.field private u:Lcom/roblox/client/components/RobloxToolbar$g;

.field private v:Ly8/f;

.field private w:Ly8/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->p:Ljava/lang/Integer;

    .line 3
    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->q:Ljava/lang/Integer;

    .line 4
    new-instance p1, Ly8/g;

    invoke-direct {p1}, Ly8/g;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    .line 5
    new-instance p1, Lcom/roblox/client/components/RobloxToolbar$b;

    invoke-direct {p1}, Lcom/roblox/client/components/RobloxToolbar$b;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->r:Lcom/roblox/client/components/RobloxToolbar$e;

    .line 6
    new-instance p1, Lcom/roblox/client/components/RobloxToolbar$j;

    invoke-direct {p1}, Lcom/roblox/client/components/RobloxToolbar$j;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->s:Lcom/roblox/client/components/RobloxToolbar$h;

    .line 7
    new-instance p1, Lcom/roblox/client/components/RobloxToolbar$i;

    invoke-direct {p1}, Lcom/roblox/client/components/RobloxToolbar$i;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->t:Lcom/roblox/client/components/RobloxToolbar$i;

    .line 8
    new-instance p1, Lcom/roblox/client/components/RobloxToolbar$g;

    invoke-direct {p1}, Lcom/roblox/client/components/RobloxToolbar$g;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->u:Lcom/roblox/client/components/RobloxToolbar$g;

    return-void
.end method

.method private a(Ly8/f;)I
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    invoke-interface {p1}, Ly8/c;->c()Ly8/f;

    move-result-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->r:Lcom/roblox/client/components/RobloxToolbar$e;

    invoke-interface {v0, p1}, Lcom/roblox/client/components/RobloxToolbar$e;->a(Ly8/f;)I

    move-result p1

    return p1
.end method

.method private b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    sget v0, Lcom/roblox/client/y;->w1:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->q:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getSubTitleFont()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/components/RobloxToolbar;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    sget v0, Lcom/roblox/client/y;->x1:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->p:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getTitleFont()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/components/RobloxToolbar;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private d(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p1, p2}, Lcom/roblox/client/components/i;->f(Landroid/widget/TextView;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private e(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->v:Ly8/f;

    invoke-direct {p0, p1}, Lcom/roblox/client/components/RobloxToolbar;->a(Ly8/f;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method private getSubTitleFont()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->u:Lcom/roblox/client/components/RobloxToolbar$g;

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    invoke-interface {v1}, Ly8/c;->c()Ly8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RobloxToolbar$g;->a(Ly8/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getTitleFont()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->t:Lcom/roblox/client/components/RobloxToolbar$i;

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    invoke-interface {v1}, Ly8/c;->c()Ly8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RobloxToolbar$i;->a(Ly8/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public U(Ly8/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->v:Ly8/f;

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->v:Ly8/f;

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->getBackgroundColor()I

    move-result p1

    .line 4
    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->getForegroundColor()I

    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitleTextColor(I)V

    .line 7
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RobloxToolbar;->setSubtitleTextColor(I)V

    .line 8
    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getTitleFont()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getSubTitleFont()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lcom/roblox/client/components/RobloxToolbar;->e(Z)V

    return-void
.end method

.method public getBackgroundColor()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->s:Lcom/roblox/client/components/RobloxToolbar$h;

    iget-object v2, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    .line 2
    invoke-interface {v2}, Ly8/c;->c()Ly8/f;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/roblox/client/components/RobloxToolbar$h;->a(Ly8/f;)I

    move-result v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public getForegroundColor()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->s:Lcom/roblox/client/components/RobloxToolbar$h;

    iget-object v2, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    .line 2
    invoke-interface {v2}, Ly8/c;->c()Ly8/f;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/roblox/client/components/RobloxToolbar$h;->b(Ly8/f;)I

    move-result v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public setIconDelegate(Lcom/roblox/client/components/RobloxToolbar$e;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->r:Lcom/roblox/client/components/RobloxToolbar$e;

    return-void
.end method

.method public setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-direct {p0, p1}, Lcom/roblox/client/components/RobloxToolbar;->e(Z)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->b()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSubtitleTextColor(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->q:Ljava/lang/Integer;

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->o:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setThemeChooser(Ly8/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->w:Ly8/c;

    return-void
.end method

.method public setThemeColorDelegate(Lcom/roblox/client/components/RobloxToolbar$h;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->s:Lcom/roblox/client/components/RobloxToolbar$h;

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->c()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->c()V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleTextColor(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->p:Ljava/lang/Integer;

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
