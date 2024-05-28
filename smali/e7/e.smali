.class public Le7/e;
.super Lcom/roblox/client/t0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/e$c;,
        Le7/e$e;,
        Le7/e$d;
    }
.end annotation


# instance fields
.field private k1:Z

.field private l1:Z

.field private m1:Landroid/widget/TextView;

.field private n1:Landroid/widget/FrameLayout;

.field private o1:Landroid/widget/ImageView;

.field private p1:Ly8/d;

.field private q1:Ly8/d;

.field private r1:Ly8/d;

.field private s1:Lcom/roblox/client/components/RobloxToolbar$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/t0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Le7/e;->k1:Z

    .line 3
    iput-boolean v0, p0, Le7/e;->l1:Z

    return-void
.end method

.method public static synthetic j3(Le7/e;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/e;->m3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k3(Le7/e;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/e;->l3(Landroidx/fragment/app/d;)V

    return-void
.end method

.method private synthetic l3(Landroidx/fragment/app/d;)V
    .locals 1

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-boolean p1, p0, Le7/e;->l1:Z

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/c;->a2()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Le7/e;->o3()V

    :cond_2
    :goto_0
    return-void
.end method

.method private synthetic m3(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->a2()V

    return-void
.end method

.method private n3(Landroid/view/LayoutInflater;)V
    .locals 2

    .line 1
    sget v0, Lcom/roblox/client/a0;->M:I

    iget-object v1, p0, Lcom/roblox/client/t0;->Z0:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    sget v0, Lcom/roblox/client/y;->o:I

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Le7/e;->o1:Landroid/widget/ImageView;

    .line 4
    new-instance v1, Le7/c;

    invoke-direct {v1, p0}, Le7/c;-><init>(Le7/e;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    sget v0, Lcom/roblox/client/y;->t:I

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le7/e;->m1:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/roblox/client/y;->u:I

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Le7/e;->n1:Landroid/widget/FrameLayout;

    return-void
.end method

.method private p3(Ly8/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le7/e;->n1:Landroid/widget/FrameLayout;

    iget-boolean v1, p0, Le7/e;->l1:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Le7/e;->q1:Ly8/d;

    invoke-interface {v1, p1}, Ly8/d;->a(Ly8/f;)I

    move-result v1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Le7/e;->p1:Ly8/d;

    invoke-interface {v1, p1}, Ly8/d;->a(Ly8/f;)I

    move-result v1

    .line 4
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 5
    iget-object v0, p0, Le7/e;->m1:Landroid/widget/TextView;

    iget-object v1, p0, Le7/e;->r1:Ly8/d;

    invoke-interface {v1, p1}, Ly8/d;->a(Ly8/f;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    iget-object v0, p0, Le7/e;->o1:Landroid/widget/ImageView;

    iget-object v1, p0, Le7/e;->s1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Ly8/f;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/t0;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p2

    .line 2
    new-instance p3, Le7/e$e;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Le7/e$e;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Le7/e;->p1:Ly8/d;

    .line 3
    new-instance p3, Le7/e$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Le7/e$d;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Le7/e;->q1:Ly8/d;

    .line 4
    new-instance p3, Le7/e$c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Le7/e$c;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Le7/e;->r1:Ly8/d;

    .line 5
    new-instance p3, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {p3}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object p3, p0, Le7/e;->s1:Lcom/roblox/client/components/RobloxToolbar$c;

    .line 6
    invoke-direct {p0, p1}, Le7/e;->n3(Landroid/view/LayoutInflater;)V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p3, "showRobux"

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    const/4 v1, 0x1

    if-eqz p3, :cond_0

    .line 9
    iput-boolean v1, p0, Le7/e;->k1:Z

    .line 10
    invoke-virtual {p0}, Le7/e;->o3()V

    .line 11
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    new-instance p3, Le7/e$a;

    invoke-direct {p3, p0}, Le7/e$a;-><init>(Le7/e;)V

    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    invoke-virtual {p1, p3, v0}, Lx7/g;->n(Lx7/g$d;Lh7/f;)V

    goto :goto_0

    :cond_0
    const-string p3, "showPremium"

    .line 12
    invoke-virtual {p1, p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    iput-boolean v1, p0, Le7/e;->l1:Z

    .line 14
    iget-object p1, p0, Le7/e;->m1:Landroid/widget/TextView;

    sget p3, Lcom/roblox/client/c0;->N2:I

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    .line 15
    :cond_1
    :goto_0
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p1

    invoke-virtual {p1}, Lb9/c;->g()Ly8/f;

    move-result-object p1

    invoke-direct {p0, p1}, Le7/e;->p3(Ly8/f;)V

    return-object p2
.end method

.method protected L2(Le8/h;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->L2(Le8/h;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Le7/d;

    invoke-direct {v0, p0, p1}, Le7/d;-><init>(Le7/e;Landroidx/fragment/app/d;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method protected O2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Le7/e;->l1:Z

    if-eqz v0, :cond_0

    const-string v0, "buildersClub"

    return-object v0

    .line 2
    :cond_0
    iget-boolean v0, p0, Le7/e;->k1:Z

    if-eqz v0, :cond_1

    const-string v0, "robux"

    return-object v0

    .line 3
    :cond_1
    invoke-super {p0}, Lcom/roblox/client/t0;->O2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public U(Ly8/f;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->U(Ly8/f;)V

    .line 2
    invoke-direct {p0, p1}, Le7/e;->p3(Ly8/f;)V

    return-void
.end method

.method public o3()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Le7/e;->k1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->g0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->f()I

    move-result v0

    .line 3
    sget v1, Lcom/roblox/client/c0;->l4:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 4
    invoke-static {v0}, Le8/i;->a(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    .line 5
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/Fragment;->Z(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 6
    iget-object v1, p0, Le7/e;->m1:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    invoke-virtual {p1}, Lx7/g;->f()Z

    move-result p1

    if-nez p1, :cond_1

    .line 3
    iget-boolean p1, p0, Le7/e;->l1:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Le7/e;->k1:Z

    if-eqz p1, :cond_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Le7/e;->O2()Ljava/lang/String;

    move-result-object p1

    const-string v0, "close"

    invoke-static {p1, v0}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
