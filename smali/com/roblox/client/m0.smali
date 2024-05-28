.class public Lcom/roblox/client/m0;
.super Landroidx/fragment/app/c;
.source "SourceFile"

# interfaces
.implements Ly8/e$b;


# instance fields
.field public final E0:Ljava/lang/String;

.field public final F0:Ljava/lang/String;

.field public final G0:Ljava/lang/String;

.field public final H0:Ljava/lang/String;

.field public final I0:Ljava/lang/String;

.field protected J0:I

.field protected K0:I

.field protected L0:I

.field protected M0:I

.field protected N0:I

.field protected O0:Ly8/e;

.field protected P0:Lo7/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    const-string v0, "dialogHeight"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/m0;->E0:Ljava/lang/String;

    const-string v0, "dialogWidth"

    .line 3
    iput-object v0, p0, Lcom/roblox/client/m0;->F0:Ljava/lang/String;

    const-string v0, "dialogGravity"

    .line 4
    iput-object v0, p0, Lcom/roblox/client/m0;->G0:Ljava/lang/String;

    const-string v0, "dialogOffsetY"

    .line 5
    iput-object v0, p0, Lcom/roblox/client/m0;->H0:Ljava/lang/String;

    const-string v0, "dialogOffsetX"

    .line 6
    iput-object v0, p0, Lcom/roblox/client/m0;->I0:Ljava/lang/String;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/roblox/client/m0;->J0:I

    .line 8
    iput v0, p0, Lcom/roblox/client/m0;->K0:I

    .line 9
    iput v0, p0, Lcom/roblox/client/m0;->L0:I

    .line 10
    iput v0, p0, Lcom/roblox/client/m0;->M0:I

    .line 11
    iput v0, p0, Lcom/roblox/client/m0;->N0:I

    .line 12
    invoke-virtual {p0}, Lcom/roblox/client/m0;->v2()Lo7/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/m0;->P0:Lo7/b;

    return-void
.end method


# virtual methods
.method public U(Ly8/f;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".onThemeChanged() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.theme"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/m0;->P0:Lo7/b;

    if-eqz v0, :cond_2

    .line 3
    sget-object v0, Lcom/roblox/client/m0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->p:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->b:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->w:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/roblox/client/m0;->P0:Lo7/b;

    invoke-virtual {v0, p1}, Lo7/b;->g(I)V

    :cond_2
    return-void
.end method

.method public W0()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/c;->W0()V

    return-void
.end method

.method public X0()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/c;->X0()V

    return-void
.end method

.method public varargs p2(I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/k0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/k0;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/k0;->T0(I[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public q2()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/i0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/i0;

    invoke-virtual {v0}, Lcom/roblox/client/i0;->g1()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "roblox.app"

    const-string v1, "The activity containing this fragment must be of type RobloxActivity!"

    .line 4
    invoke-static {v0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method

.method public r2(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/k0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/k0;

    invoke-virtual {v0, p1}, Lcom/roblox/client/k0;->U0(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public s2(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/k0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/k0;

    invoke-virtual {v0, p1}, Lcom/roblox/client/k0;->W0(I)V

    :cond_0
    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->t0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/c;->d2()Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    iget v1, p0, Lcom/roblox/client/m0;->J0:I

    if-eqz v1, :cond_1

    .line 5
    iget v2, p0, Lcom/roblox/client/m0;->K0:I

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, -0x2

    :goto_0
    invoke-virtual {v0, v2, v1}, Landroid/view/Window;->setLayout(II)V

    .line 6
    :cond_1
    iget v1, p0, Lcom/roblox/client/m0;->L0:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 8
    iget v2, p0, Lcom/roblox/client/m0;->M0:I

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 9
    iget v2, p0, Lcom/roblox/client/m0;->N0:I

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_2
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 12
    :cond_3
    new-instance p1, Ly8/e;

    invoke-direct {p1, p0}, Ly8/e;-><init>(Ly8/e$b;)V

    iput-object p1, p0, Lcom/roblox/client/m0;->O0:Ly8/e;

    .line 13
    invoke-virtual {p1, p0}, Ly8/e;->b(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public t2(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/k0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/k0;

    invoke-virtual {v0, p1}, Lcom/roblox/client/k0;->X0(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public declared-synchronized u2(Ljava/lang/CharSequence;)V
    .locals 12

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v8

    .line 4
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 5
    sget v0, Lcom/roblox/client/c0;->r3:I

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int v5, v4, v0

    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v9, 0x1

    new-array v7, v9, [Ld9/a;

    const/4 v10, 0x0

    new-instance v11, Ld9/c;

    const/4 v2, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v5}, Ld9/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    aput-object v11, v7, v10

    invoke-static {v6, p1, v7}, Ld9/b;->e(Landroid/widget/TextView;Ljava/lang/String;[Ld9/a;)V

    const/high16 p1, 0x41a00000    # 20.0f

    .line 9
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p1, 0x0

    .line 10
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v4, 0x96

    const/16 v5, 0x64

    const/16 p1, 0x96

    const/16 v7, 0x64

    move-object v2, v8

    move-object v3, v6

    move v6, p1

    .line 11
    invoke-virtual/range {v2 .. v7}, Landroidx/appcompat/app/b;->i(Landroid/view/View;IIII)V

    .line 12
    invoke-virtual {v8, v9}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    :try_start_2
    invoke-virtual {v8}, Landroid/app/Dialog;->show()V
    :try_end_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    :catch_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected v2()Lo7/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected w2(Landroid/view/LayoutInflater;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/m0;->P0:Lo7/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p0}, Lo7/b;->e(Landroid/view/LayoutInflater;Landroidx/fragment/app/Fragment;)Landroid/view/View;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/roblox/client/m0;->P0:Lo7/b;

    invoke-virtual {v0}, Lo7/b;->c()Landroid/view/ViewGroup;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1

    :cond_0
    return-object p2
.end method

.method public x2(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/k0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/k0;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/k0;->d1(II)V

    :cond_0
    return-void
.end method

.method public y2(Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/k0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/k0;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/k0;->e1(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "dialogHeight"

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/m0;->J0:I

    const-string v0, "dialogWidth"

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/m0;->K0:I

    const-string v0, "dialogGravity"

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/m0;->L0:I

    const-string v0, "dialogOffsetY"

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/m0;->M0:I

    const-string v0, "dialogOffsetX"

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/roblox/client/m0;->N0:I

    :cond_0
    return-void
.end method
