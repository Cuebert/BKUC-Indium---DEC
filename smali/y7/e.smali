.class public Ly7/e;
.super Ly7/a;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ly8/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/m0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-direct {p0, p1}, Ly7/a;-><init>(Landroidx/fragment/app/d;)V

    .line 2
    iput-object p2, p0, Ly7/e;->b:Ljava/lang/String;

    .line 3
    new-instance p1, Ly8/g;

    invoke-direct {p1}, Ly8/g;-><init>()V

    iput-object p1, p0, Ly7/e;->c:Ly8/c;

    return-void
.end method

.method private c(Ly8/f;)I
    .locals 1

    .line 1
    sget-object v0, Ly7/e$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 2
    sget p1, Lcom/roblox/client/d0;->c:I

    return p1

    .line 3
    :cond_0
    sget p1, Lcom/roblox/client/d0;->a:I

    return p1
.end method

.method private d(Ly8/f;)I
    .locals 0

    sget p1, Lcom/roblox/client/x;->T:I

    return p1
.end method


# virtual methods
.method public e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    sget v0, Lcom/roblox/client/b0;->b:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 2
    sget p2, Lcom/roblox/client/y;->c:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p2

    .line 4
    new-instance v0, Ly7/e$a;

    invoke-direct {v0, p0}, Ly7/e$a;-><init>(Ly7/e;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    sget v0, Lcom/roblox/client/y;->g0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 6
    iget-object v0, p0, Ly7/e;->c:Ly8/c;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    invoke-direct {p0, v0}, Ly7/e;->d(Ly8/f;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object p1
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly7/e;->g(Landroidx/lifecycle/k;)V

    return-void
.end method

.method public g(Landroidx/lifecycle/k;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ly7/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/w;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const-string v1, ""

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lcom/roblox/client/p0;->H0()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p0}, Ly7/a;->b()I

    move-result v0

    .line 6
    :goto_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "showRobux"

    const/4 v4, 0x1

    .line 7
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 8
    iget-object v3, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    sget v5, Lcom/roblox/client/y;->m:I

    invoke-virtual {v3, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_2

    .line 9
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v3

    const-string v6, "robux_menuoption_no_container_for_purchase"

    invoke-virtual {v3, v6}, Lx7/e;->A(Ljava/lang/String;)V

    .line 10
    :cond_2
    iget-object v3, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    invoke-virtual {v3, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v6, "dialog"

    if-eqz v3, :cond_4

    .line 11
    new-instance v0, Le7/h;

    invoke-direct {v0}, Le7/h;-><init>()V

    .line 12
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 13
    invoke-virtual {v0, v1}, Lcom/roblox/client/z0;->x2(Ljava/lang/String;)V

    if-eqz p1, :cond_3

    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 15
    :cond_3
    iget-object p1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object p1

    const-string v1, "robuxPurchase"

    .line 18
    invoke-virtual {p1, v1}, Landroidx/fragment/app/t;->g(Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 19
    invoke-virtual {p1, v5, v0, v6}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroidx/fragment/app/t;->h()I

    goto :goto_1

    :cond_4
    const-string v3, "dialogHeight"

    .line 21
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 22
    new-instance v0, Le7/e;

    invoke-direct {v0}, Le7/e;-><init>()V

    .line 23
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 24
    invoke-virtual {v0, v1}, Lcom/roblox/client/t0;->X2(Ljava/lang/String;)V

    .line 25
    iget-object v1, p0, Ly7/e;->c:Ly8/c;

    invoke-interface {v1}, Ly8/c;->c()Ly8/f;

    move-result-object v1

    invoke-direct {p0, v1}, Ly7/e;->c(Ly8/f;)I

    move-result v1

    invoke-virtual {v0, v4, v1}, Landroidx/fragment/app/c;->m2(II)V

    if-eqz p1, :cond_5

    .line 26
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 27
    :cond_5
    iget-object p1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    invoke-virtual {p1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {v0, p1, v6}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 28
    :goto_1
    iget-object p1, p0, Ly7/e;->b:Ljava/lang/String;

    const-string v0, "nativeMain"

    const-string v1, "robux"

    invoke-static {v0, v1, p1}, Lcom/roblox/client/f0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
