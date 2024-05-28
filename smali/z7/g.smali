.class public Lz7/g;
.super Lcom/roblox/client/m0;
.source "SourceFile"


# instance fields
.field protected Q0:Lz7/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/m0;-><init>()V

    return-void
.end method

.method private z2(Lz7/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/g;->Q0:Lz7/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lz7/e;->a(Lz7/d;)V

    goto :goto_0

    :cond_0
    const-string p1, "RobloxMVPFragment"

    const-string v0, "Lifecycle listener is null."

    .line 3
    invoke-static {p1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 2
    sget-object p2, Lz7/d;->u:Lz7/d;

    invoke-direct {p0, p2}, Lz7/g;->z2(Lz7/d;)V

    return-object p1
.end method

.method public G0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->G0()V

    .line 2
    sget-object v0, Lz7/d;->w:Lz7/d;

    invoke-direct {p0, v0}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public H0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->H0()V

    .line 2
    sget-object v0, Lz7/d;->x:Lz7/d;

    invoke-direct {p0, v0}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public P0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->P0()V

    .line 2
    sget-object v0, Lz7/d;->q:Lz7/d;

    invoke-direct {p0, v0}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public U0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->U0()V

    .line 2
    sget-object v0, Lz7/d;->p:Lz7/d;

    invoke-direct {p0, v0}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public W0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->W0()V

    .line 2
    sget-object v0, Lz7/d;->o:Lz7/d;

    invoke-direct {p0, v0}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public X0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->X0()V

    .line 2
    sget-object v0, Lz7/d;->r:Lz7/d;

    invoke-direct {p0, v0}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->t0(Landroid/os/Bundle;)V

    .line 2
    sget-object p1, Lz7/d;->v:Lz7/d;

    invoke-direct {p0, p1}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    .line 2
    sget-object p1, Lz7/d;->t:Lz7/d;

    invoke-direct {p0, p1}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->z0(Landroid/os/Bundle;)V

    .line 2
    sget-object p1, Lz7/d;->n:Lz7/d;

    invoke-direct {p0, p1}, Lz7/g;->z2(Lz7/d;)V

    return-void
.end method
