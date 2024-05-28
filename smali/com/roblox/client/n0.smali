.class public Lcom/roblox/client/n0;
.super Lcom/roblox/client/t0;
.source "SourceFile"


# instance fields
.field private k1:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/t0;-><init>()V

    return-void
.end method

.method private j3(FFIIII)Landroid/graphics/Point;
    .locals 1

    int-to-float v0, p5

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_4

    int-to-float v0, p6

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_4

    const v0, 0x3f666666    # 0.9f

    mul-float v0, v0, p1

    float-to-int v0, v0

    if-le v0, p5, :cond_0

    move p5, v0

    :cond_0
    const v0, 0x3f4ccccd    # 0.8f

    mul-float v0, v0, p2

    float-to-int v0, v0

    if-le v0, p6, :cond_1

    move p6, v0

    :cond_1
    int-to-float v0, p4

    cmpl-float p2, v0, p2

    if-lez p2, :cond_2

    move p4, p6

    :cond_2
    int-to-float p2, p3

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    move p3, p5

    :cond_3
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1, p3, p4}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/t0;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    const-string p2, "RobloxModalWebFragment"

    const-string p3, "onCreate."

    .line 2
    invoke-static {p2, p3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance p3, Landroid/animation/LayoutTransition;

    invoke-direct {p3}, Landroid/animation/LayoutTransition;-><init>()V

    const/4 v0, 0x2

    .line 4
    invoke-virtual {p3, v0}, Landroid/animation/LayoutTransition;->enableTransitionType(I)V

    const/4 v0, 0x3

    .line 5
    invoke-virtual {p3, v0}, Landroid/animation/LayoutTransition;->enableTransitionType(I)V

    .line 6
    iput-object p1, p0, Lcom/roblox/client/n0;->k1:Landroid/view/View;

    .line 7
    move-object v0, p1

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, p3}, Landroid/widget/LinearLayout;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 8
    sget p3, Lcom/roblox/client/y;->J1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    sget v0, Lcom/roblox/client/y;->I1:I

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/n0$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/n0$a;-><init>(Lcom/roblox/client/n0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v0

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v3, v0

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "widthInPixels: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ". heightInPixels: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->O0()I

    move-result v0

    invoke-virtual {p3}, Landroid/widget/LinearLayout;->getHeight()I

    move-result p3

    add-int v7, v0, p3

    .line 15
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p3

    invoke-interface {p3}, Lc7/e;->K()I

    move-result v6

    int-to-float p3, v7

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int v5, p3

    int-to-float p3, v6

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int v4, p3

    .line 18
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "minWidthInDip: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". minHeightInDip: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, p0

    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/roblox/client/n0;->j3(FFIIII)Landroid/graphics/Point;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "width: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p3, Landroid/graphics/Point;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". height: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p3, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    iget v0, p3, Landroid/graphics/Point;->x:I

    iget p3, p3, Landroid/graphics/Point;->y:I

    const/16 v1, 0x11

    invoke-direct {p2, v0, p3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    :cond_0
    iget-boolean p2, p0, Lcom/roblox/client/t0;->f1:Z

    invoke-virtual {p0, p2}, Lcom/roblox/client/n0;->e3(Z)V

    return-object p1
.end method

.method public H0()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->H0()V

    const-string v0, "RobloxModalWebFragment"

    const-string v1, "onDetach."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public P0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/t0;->P0()V

    const-string v0, "RobloxModalWebFragment"

    const-string v1, "onPause."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public U0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/t0;->U0()V

    const-string v0, "RobloxModalWebFragment"

    const-string v1, "onResume."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public W0()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/t0;->W0()V

    return-void
.end method

.method public e3(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->e3(Z)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/n0;->k1:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 3
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public i3(Lcom/roblox/client/app/d;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->i3(Lcom/roblox/client/app/d;)V

    const-string p1, "RobloxModalWebFragment"

    const-string v0, "updateWebView."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->t0(Landroid/os/Bundle;)V

    const-string p1, "RobloxModalWebFragment"

    const-string v0, "onActivityCreated."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    const-string p1, "RobloxModalWebFragment"

    const-string v0, "onAttach."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/client/t0;->z0(Landroid/os/Bundle;)V

    return-void
.end method
