.class public Ly7/b;
.super Ly7/a;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roblox/client/m0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-direct {p0, p1}, Ly7/a;-><init>(Landroidx/fragment/app/d;)V

    .line 2
    iput-object p2, p0, Ly7/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c(Landroidx/lifecycle/k;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly7/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "showPremium"

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 4
    iget-object v1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    sget v3, Lcom/roblox/client/y;->m:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    .line 5
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v1

    const-string v4, "robux_buildsclub_no_container_for_purchase"

    invoke-virtual {v1, v4}, Lx7/e;->A(Ljava/lang/String;)V

    .line 6
    :cond_1
    iget-object v1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v4, "dialog"

    if-eqz v1, :cond_3

    .line 7
    new-instance v1, Le7/h;

    invoke-direct {v1}, Le7/h;-><init>()V

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 9
    :cond_2
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 10
    invoke-static {}, Lcom/roblox/client/p0;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/roblox/client/z0;->x2(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    .line 12
    invoke-virtual {p1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object p1

    const-string v0, "robuxPurchase"

    .line 14
    invoke-virtual {p1, v0}, Landroidx/fragment/app/t;->g(Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 15
    invoke-virtual {p1, v3, v1, v4}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/t;->h()I

    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {p0}, Ly7/a;->b()I

    move-result v1

    const-string v3, "dialogHeight"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 18
    new-instance v1, Le7/e;

    invoke-direct {v1}, Le7/e;-><init>()V

    if-eqz p1, :cond_4

    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 20
    :cond_4
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 21
    invoke-static {}, Lcom/roblox/client/p0;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/roblox/client/t0;->X2(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v1}, Landroidx/fragment/app/c;->f2()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/c;->m2(II)V

    .line 23
    iget-object p1, p0, Ly7/a;->a:Landroidx/fragment/app/d;

    invoke-virtual {p1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {v1, p1, v4}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 24
    :goto_0
    iget-object p1, p0, Ly7/b;->b:Ljava/lang/String;

    const-string v0, "nativeMain"

    const-string v1, "buildersClub"

    invoke-static {v0, v1, p1}, Lcom/roblox/client/f0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
