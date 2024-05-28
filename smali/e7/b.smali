.class public Le7/b;
.super Lcom/roblox/client/t0;
.source "SourceFile"


# instance fields
.field private A1:Ly7/h;

.field private B1:Landroid/app/ProgressDialog;

.field protected k1:Ljava/lang/String;

.field protected l1:Z

.field private m1:I

.field private n1:Ljava/lang/String;

.field protected o1:Z

.field private p1:Lorg/json/JSONObject;

.field private q1:Z

.field protected r1:Lcom/roblox/client/components/RobloxToolbar;

.field protected s1:Lcom/roblox/client/components/RobloxToolbar;

.field protected t1:Ly7/d;

.field protected u1:Landroid/view/Menu;

.field private v1:Z

.field private w1:Z

.field private x1:Landroid/view/View;

.field private y1:Landroid/view/View$OnClickListener;

.field protected z1:Ly7/f;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/t0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le7/b;->k1:Ljava/lang/String;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Le7/b;->l1:Z

    const/4 v2, -0x1

    .line 4
    iput v2, p0, Le7/b;->m1:I

    .line 5
    iput-boolean v1, p0, Le7/b;->o1:Z

    .line 6
    iput-boolean v1, p0, Le7/b;->v1:Z

    .line 7
    iput-boolean v1, p0, Le7/b;->w1:Z

    .line 8
    iput-object v0, p0, Le7/b;->x1:Landroid/view/View;

    return-void
.end method

.method static synthetic j3(Le7/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Le7/b;->w1:Z

    return p1
.end method

.method static synthetic k3(Le7/b;)V
    .locals 0

    invoke-direct {p0}, Le7/b;->m3()V

    return-void
.end method

.method private l3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    .line 1
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p2, 0x1

    .line 4
    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    const/4 p2, 0x0

    .line 5
    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 6
    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 7
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method

.method private m3()V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/b;->B1:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le7/b;->B1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private r3()V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/b;->t1:Ly7/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ly7/d;->j()V

    :cond_0
    return-void
.end method

.method private s3(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/b;->z1:Ly7/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Le7/b;->A1:Ly7/h;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly7/h;->f(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Le7/b;->z1:Ly7/f;

    invoke-virtual {p1}, Ly7/f;->r()V

    :cond_0
    return-void
.end method

.method private t3(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le7/b;->v1:Z

    if-eq v0, p1, :cond_2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateToolbar() canGoBack:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iput-boolean p1, p0, Le7/b;->v1:Z

    .line 4
    iget-object v0, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    if-nez p1, :cond_1

    iget-boolean p1, p0, Le7/b;->l1:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Le7/b;->y1:Landroid/view/View$OnClickListener;

    :goto_1
    invoke-static {v0, p1}, Lcom/roblox/client/components/m;->e(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    sget v0, Lcom/roblox/client/a0;->L:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    .line 2
    sget v0, Lcom/roblox/client/y;->u1:I

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Le7/b;->r1:Lcom/roblox/client/components/RobloxToolbar;

    .line 3
    sget v0, Lcom/roblox/client/y;->v1:I

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    .line 4
    iget-boolean v2, p0, Le7/b;->q1:Z

    if-eqz v2, :cond_0

    .line 5
    iget-object v0, p0, Le7/b;->r1:Lcom/roblox/client/components/RobloxToolbar;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v2, Lcom/roblox/client/components/RobloxToolbar$f;

    invoke-direct {v2}, Lcom/roblox/client/components/RobloxToolbar$f;-><init>()V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setThemeColorDelegate(Lcom/roblox/client/components/RobloxToolbar$h;)V

    .line 7
    iget-object v0, p0, Le7/b;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v2}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setIconDelegate(Lcom/roblox/client/components/RobloxToolbar$e;)V

    .line 8
    iget-object v0, p0, Le7/b;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Lcom/roblox/client/components/RobloxToolbar$d;

    invoke-direct {v2}, Lcom/roblox/client/components/RobloxToolbar$d;-><init>()V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setThemeColorDelegate(Lcom/roblox/client/components/RobloxToolbar$h;)V

    .line 9
    iget-object v0, p0, Le7/b;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Le7/b$b;

    invoke-direct {v2, p0}, Le7/b$b;-><init>(Le7/b;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :goto_0
    sget v0, Lcom/roblox/client/y;->k:I

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 11
    invoke-super {p0, p1, v0, p3}, Lcom/roblox/client/t0;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 13
    iget-object p1, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Le7/b;->p3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 14
    iput-object p2, p0, Le7/b;->x1:Landroid/view/View;

    .line 15
    iget-boolean p1, p0, Lcom/roblox/client/t0;->f1:Z

    if-nez p1, :cond_1

    .line 16
    invoke-virtual {p0, v1}, Le7/b;->e3(Z)V

    :cond_1
    return-object p2
.end method

.method public G0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le7/b;->m3()V

    .line 2
    invoke-super {p0}, Lcom/roblox/client/t0;->G0()V

    return-void
.end method

.method public J0(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->J0(Z)V

    if-nez p1, :cond_0

    .line 2
    invoke-direct {p0}, Le7/b;->r3()V

    :cond_0
    return-void
.end method

.method public Q2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le7/b;->w1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-super {p0}, Lcom/roblox/client/t0;->Q2()Z

    move-result v0

    return v0
.end method

.method public U(Ly8/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->U(Ly8/f;)V

    .line 2
    iget-object v0, p0, Le7/b;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->U(Ly8/f;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    .line 6
    invoke-virtual {v0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Le7/b;->p3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 7
    :cond_0
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->U(Ly8/f;)V

    return-void
.end method

.method public U0()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/roblox/client/t0;->U0()V

    .line 2
    invoke-direct {p0}, Le7/b;->r3()V

    return-void
.end method

.method public W0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/t0;->W0()V

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public X0()V
    .locals 1

    .line 1
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Lcom/roblox/client/t0;->X0()V

    return-void
.end method

.method public Z2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/b;->s3(Ljava/lang/String;)V

    return-void
.end method

.method public b3(Landroid/webkit/WebView;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/roblox/client/t0;->b3(Landroid/webkit/WebView;I)V

    .line 2
    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    invoke-direct {p0, p1}, Le7/b;->t3(Z)V

    return-void
.end method

.method public e3(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->e3(Z)V

    .line 2
    iget-object v0, p0, Le7/b;->x1:Landroid/view/View;

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

    .line 2
    iget-object p1, p1, Lcom/roblox/client/app/d;->b:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected n3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .line 1
    new-instance v0, Ly7/d;

    invoke-direct {v0, p0}, Ly7/d;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Le7/b;->t1:Ly7/d;

    .line 2
    invoke-virtual {v0, p1, p2}, Ly7/d;->d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    return-void
.end method

.method o3(Landroid/app/Activity;Ls7/h;Ls7/h$c;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0, p3}, Ls7/h;->b(Landroid/content/Context;ZLs7/h$c;)V

    return-void
.end method

.method public onAppLocaleChangeEvent(La7/a;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    sget v0, Lcom/roblox/client/c0;->Z2:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Le7/b;->l3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Le7/b;->B1:Landroid/app/ProgressDialog;

    .line 3
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 4
    new-instance v0, Ls7/h;

    invoke-direct {v0}, Ls7/h;-><init>()V

    new-instance v1, Le7/b$c;

    invoke-direct {v1, p0, p1}, Le7/b$c;-><init>(Le7/b;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, v1}, Le7/b;->o3(Landroid/app/Activity;Ls7/h;Ls7/h$c;)V

    :cond_0
    return-void
.end method

.method public onUnreadNotificationCountEvent(La7/m;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GWF.onUnreadNotificationCountEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, La7/m;->a()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->g(Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Le7/b;->t1:Ly7/d;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Ly7/d;->j()V

    :cond_0
    return-void
.end method

.method protected p3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .line 1
    iput-object p1, p0, Le7/b;->u1:Landroid/view/Menu;

    .line 2
    iget-boolean v0, p0, Le7/b;->o1:Z

    if-nez v0, :cond_0

    const/16 v0, 0x22

    .line 3
    invoke-virtual {p0, p1, p2, v0}, Le7/b;->q3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    .line 4
    new-instance v0, Ly7/e;

    iget-object v1, p0, Le7/b;->k1:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Ly7/e;-><init>(Lcom/roblox/client/m0;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ly7/e;->e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    .line 5
    invoke-virtual {p0, p1, p2}, Le7/b;->n3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Le7/b;->p1:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0x36

    .line 7
    invoke-virtual {p0, p1, p2, v0}, Le7/b;->q3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected q3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Le7/b;->p1:Lorg/json/JSONObject;

    const-string v1, "searchType"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ly7/g;

    invoke-direct {v1, p0, v0}, Ly7/g;-><init>(Lcom/roblox/client/t0;Ljava/lang/String;)V

    iput-object v1, p0, Le7/b;->A1:Ly7/h;

    .line 3
    :cond_0
    iget-object v0, p0, Le7/b;->A1:Ly7/h;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ly7/h;

    invoke-direct {v0, p0}, Ly7/h;-><init>(Lcom/roblox/client/t0;)V

    iput-object v0, p0, Le7/b;->A1:Ly7/h;

    .line 5
    :cond_1
    new-instance v0, Ly7/f;

    invoke-direct {v0, p0}, Ly7/f;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Le7/b;->z1:Ly7/f;

    .line 6
    invoke-virtual {v0, p1}, Ly7/f;->n(Landroid/view/Menu;)V

    .line 7
    iget-object v0, p0, Le7/b;->z1:Ly7/f;

    iget-object v1, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, v1}, Ly7/f;->p(Lcom/roblox/client/components/RobloxToolbar;)V

    .line 8
    iget-object v0, p0, Le7/b;->z1:Ly7/f;

    iget-object v1, p0, Le7/b;->A1:Ly7/h;

    invoke-virtual {v0, v1}, Ly7/f;->o(Ly7/f$e;)V

    .line 9
    iget-object v0, p0, Le7/b;->z1:Ly7/f;

    invoke-virtual {v0, p1, p2}, Ly7/f;->k(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    .line 10
    iget-object p1, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/roblox/client/y;->d:I

    invoke-static {p1, p2, v0, p3}, Lcom/roblox/client/components/m;->a(Landroidx/appcompat/widget/Toolbar;Landroid/content/Context;II)V

    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->t0(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Le7/b;->n1:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    iget p1, p0, Le7/b;->m1:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lcom/roblox/client/c0;->J2:I

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    .line 7
    :goto_0
    iget-object p1, p0, Le7/b;->s1:Lcom/roblox/client/components/RobloxToolbar;

    iget-boolean v0, p0, Le7/b;->l1:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Le7/b;->y1:Landroid/view/View$OnClickListener;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-static {p1, v0}, Lcom/roblox/client/components/m;->e(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    .line 2
    instance-of p1, p1, Lcom/roblox/client/ActivityNativeMain;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Le7/b;->q1:Z

    :cond_0
    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/t0;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    const-string v1, "TITLE_ID"

    .line 3
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Le7/b;->m1:I

    const-string v0, "TITLE_STRING"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le7/b;->n1:Ljava/lang/String;

    const-string v0, "REPORTING_TAB_NAME"

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le7/b;->k1:Ljava/lang/String;

    const-string v0, "HAS_PARENT"

    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Le7/b;->l1:Z

    const-string v0, "HIDE_ACCESSORY_BUTTONS"

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Le7/b;->o1:Z

    const/4 v0, 0x0

    const-string v1, "SEARCH_PARAMS"

    .line 8
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Le7/b;->p1:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 10
    :cond_0
    :goto_0
    iget-object p1, p0, Le7/b;->p1:Lorg/json/JSONObject;

    if-nez p1, :cond_1

    .line 11
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Le7/b;->p1:Lorg/json/JSONObject;

    .line 12
    :cond_1
    new-instance p1, Le7/b$a;

    invoke-direct {p1, p0}, Le7/b$a;-><init>(Le7/b;)V

    iput-object p1, p0, Le7/b;->y1:Landroid/view/View$OnClickListener;

    return-void
.end method
