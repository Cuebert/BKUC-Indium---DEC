.class public abstract Ly7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroidx/fragment/app/d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    instance-of v2, v0, Lcom/roblox/client/i0;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/roblox/client/i0;

    invoke-virtual {v0}, Lcom/roblox/client/i0;->g1()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method protected b()I
    .locals 4

    .line 1
    iget-object v0, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    .line 3
    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    iget-object v3, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    check-cast v3, Lcom/roblox/client/i0;

    .line 4
    invoke-virtual {v3}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object v3

    invoke-virtual {v3}, Lo7/a;->c()Landroid/graphics/Rect;

    move-result-object v3

    .line 5
    invoke-static {v1, v2, v0, v3}, Lg9/b;->a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lg9/b;

    move-result-object v0

    .line 6
    iget v1, v0, Lg9/b;->b:I

    iget v2, v0, Lg9/b;->g:I

    sub-int/2addr v1, v2

    iget v0, v0, Lg9/b;->c:I

    sub-int/2addr v1, v0

    return v1
.end method
