.class public Ly7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroidx/fragment/app/d;

.field private c:Ly8/c;

.field private d:I

.field private e:I

.field private f:Landroid/view/MenuItem;

.field private g:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    new-instance v0, Ly8/g;

    invoke-direct {v0}, Ly8/g;-><init>()V

    invoke-direct {p0, p1, v0}, Ly7/d;-><init>(Landroidx/fragment/app/Fragment;Ly8/c;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Ly8/c;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "NOTIFICATION_STREAM_TAG"

    .line 3
    iput-object v0, p0, Ly7/d;->a:Ljava/lang/String;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Ly7/d;->d:I

    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    iput-object p1, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    .line 6
    iput-object p2, p0, Ly7/d;->c:Ly8/c;

    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    sget p2, Lcom/roblox/client/v;->r:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, -0xbbbbbc

    :goto_0
    iput p1, p0, Ly7/d;->e:I

    return-void
.end method

.method private a()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/d;->c:Ly8/c;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    .line 2
    sget-object v1, Ly7/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 3
    iget v0, p0, Ly7/d;->e:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private b()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/d;->c:Ly8/c;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    .line 2
    sget-object v1, Ly7/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 3
    sget v0, Lcom/roblox/client/x;->F:I

    return v0

    .line 4
    :cond_0
    sget v0, Lcom/roblox/client/x;->G:I

    return v0
.end method

.method private c()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/d;->c:Ly8/c;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    .line 2
    sget-object v1, Ly7/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 3
    sget v0, Lcom/roblox/client/x;->R:I

    return v0

    .line 4
    :cond_0
    sget v0, Lcom/roblox/client/x;->S:I

    return v0
.end method

.method private g(I)V
    .locals 1

    .line 1
    iput p1, p0, Ly7/d;->d:I

    .line 2
    iget-object p1, p0, Ly7/d;->f:Landroid/view/MenuItem;

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    .line 3
    sget v0, Lcom/roblox/client/y;->F0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 4
    iget v0, p0, Ly7/d;->d:I

    invoke-direct {p0, p1, v0}, Ly7/d;->h(Landroid/widget/TextView;I)V

    return-void
.end method

.method private h(Landroid/widget/TextView;I)V
    .locals 1

    if-lez p2, :cond_1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    const/16 v0, 0x63

    if-le p2, v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/roblox/client/c0;->j3:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p2}, Ls7/e;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x8

    .line 4
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private i(Landroidx/lifecycle/k;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    invoke-static {v0}, Lcom/roblox/client/d1;->h(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v0

    .line 2
    iget-object v1, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roblox/client/w;->d:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 3
    iget-object v2, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/w;->c:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 4
    iget-object v3, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    const/16 v4, 0x50

    invoke-static {v3, v4}, Lcom/roblox/client/d1;->c(Landroid/content/Context;I)F

    move-result v3

    float-to-int v3, v3

    .line 5
    iget-object v4, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    const/16 v5, 0x1a4

    invoke-static {v4, v5}, Lcom/roblox/client/d1;->c(Landroid/content/Context;I)F

    move-result v4

    float-to-int v4, v4

    .line 6
    iget v0, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v2

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    .line 7
    iget-object v2, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    const/16 v3, 0xf

    invoke-static {v2, v3}, Lcom/roblox/client/d1;->c(Landroid/content/Context;I)F

    move-result v2

    float-to-int v2, v2

    .line 8
    new-instance v3, Lcom/roblox/client/r;

    invoke-direct {v3}, Lcom/roblox/client/r;-><init>()V

    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 9
    invoke-virtual {v3, v5, v6}, Landroidx/fragment/app/c;->m2(II)V

    .line 10
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "dialogWidth"

    .line 11
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "dialogHeight"

    .line 12
    invoke-virtual {v5, v4, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "dialogGravity"

    const/16 v4, 0x35

    .line 13
    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "dialogOffsetY"

    .line 14
    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "dialogOffsetX"

    .line 15
    invoke-virtual {v5, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 16
    invoke-static {}, Lcom/roblox/client/p0;->y0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DEFAULT_URL"

    invoke-virtual {v5, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 18
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 19
    :cond_0
    iget-object p1, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    invoke-virtual {p1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "NOTIFICATION_STREAM_TAG"

    invoke-virtual {v3, p1, v0}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    sget v0, Lcom/roblox/client/b0;->a:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 2
    sget p2, Lcom/roblox/client/y;->b:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Ly7/d;->f:Landroid/view/MenuItem;

    .line 3
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    .line 4
    sget p2, Lcom/roblox/client/y;->E0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 5
    sget v0, Lcom/roblox/client/y;->F0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ly7/d;->g:Landroid/widget/TextView;

    .line 6
    iget v0, p0, Ly7/d;->d:I

    invoke-direct {p0, p1, v0}, Ly7/d;->h(Landroid/widget/TextView;I)V

    .line 7
    new-instance p1, Ly7/d$a;

    invoke-direct {p1, p0}, Ly7/d$a;-><init>(Ly7/d;)V

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    invoke-direct {p0}, Ly7/d;->c()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 9
    iget-object p1, p0, Ly7/d;->g:Landroid/widget/TextView;

    invoke-direct {p0}, Ly7/d;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 10
    iget-object p1, p0, Ly7/d;->g:Landroid/widget/TextView;

    invoke-direct {p0}, Ly7/d;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object p1, p0, Ly7/d;->f:Landroid/view/MenuItem;

    return-object p1
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly7/d;->f(Landroidx/lifecycle/k;)V

    return-void
.end method

.method public f(Landroidx/lifecycle/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->e()I

    move-result v0

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->F0()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    invoke-static {v0}, Lcom/roblox/client/f0;->m(I)V

    .line 5
    :cond_1
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb9/c;->q(I)V

    .line 6
    iput v1, p0, Ly7/d;->d:I

    .line 7
    iget-object v0, p0, Ly7/d;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    const/16 v2, 0x8

    .line 8
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :cond_2
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->c()Lr9/i;

    move-result-object v0

    invoke-interface {v0}, Lr9/i;->e()Lgc/b;

    move-result-object v0

    new-instance v2, Lp9/a;

    invoke-direct {v2}, Lp9/a;-><init>()V

    invoke-interface {v0, v2}, Lgc/b;->W(Lgc/d;)V

    .line 10
    invoke-static {}, Lcom/roblox/client/p0;->l0()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    const-class v3, Lcom/roblox/client/NotificationStreamActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    const-string v2, "SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA"

    .line 12
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 13
    :cond_3
    iget-object p1, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    const/16 v2, 0x4e8e

    invoke-virtual {p1, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 14
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUserGameSettingsGetReducedMotion()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 15
    iget-object p1, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    invoke-virtual {p1, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0

    .line 16
    :cond_4
    iget-object p1, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    sget v0, Lcom/roblox/client/t;->b:I

    const v1, 0x10a0001

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0

    .line 17
    :cond_5
    invoke-direct {p0, p1}, Ly7/d;->i(Landroidx/lifecycle/k;)V

    :goto_0
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/d;->b:Landroidx/fragment/app/d;

    invoke-virtual {v0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "NOTIFICATION_STREAM_TAG"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb9/c;->q(I)V

    .line 4
    :cond_0
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->e()I

    move-result v0

    invoke-direct {p0, v0}, Ly7/d;->g(I)V

    return-void
.end method
