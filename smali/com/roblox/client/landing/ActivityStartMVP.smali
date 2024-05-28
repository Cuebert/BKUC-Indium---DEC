.class public Lcom/roblox/client/landing/ActivityStartMVP;
.super Lz7/f;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/landing/ActivityStartMVP$b;
    }
.end annotation


# static fields
.field private static final a0:[Lcom/roblox/client/landing/a;


# instance fields
.field private U:Lr7/b;

.field private V:Lz7/a;

.field private W:Landroid/widget/Button;

.field private X:Landroid/widget/Button;

.field private Y:Landroid/view/View;

.field private Z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/roblox/client/landing/a;

    new-instance v1, Lcom/roblox/client/landing/a;

    sget v2, Lcom/roblox/client/c0;->H0:I

    sget v3, Lcom/roblox/client/c0;->G0:I

    sget v4, Lcom/roblox/client/x;->u:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roblox/client/landing/a;-><init>(III)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/roblox/client/landing/a;

    sget v2, Lcom/roblox/client/c0;->F0:I

    sget v3, Lcom/roblox/client/c0;->E0:I

    sget v4, Lcom/roblox/client/x;->t:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roblox/client/landing/a;-><init>(III)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/roblox/client/landing/a;

    sget v2, Lcom/roblox/client/c0;->D0:I

    sget v3, Lcom/roblox/client/c0;->C0:I

    sget v4, Lcom/roblox/client/x;->s:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roblox/client/landing/a;-><init>(III)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/roblox/client/landing/ActivityStartMVP;->a0:[Lcom/roblox/client/landing/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz7/f;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->Z:Z

    return-void
.end method

.method private B1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->X:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->W:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->Y:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private C1()V
    .locals 7

    .line 1
    sget v0, Lcom/roblox/client/y;->x0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 3
    new-instance v1, Lcom/roblox/client/landing/ActivityStartMVP$b;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    sget-object v3, Lcom/roblox/client/landing/ActivityStartMVP;->a0:[Lcom/roblox/client/landing/a;

    const/4 v4, 0x0

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/roblox/client/landing/ActivityStartMVP$b;-><init>(Lcom/roblox/client/landing/ActivityStartMVP;Landroidx/fragment/app/FragmentManager;[Lcom/roblox/client/landing/a;Lcom/roblox/client/landing/ActivityStartMVP$a;)V

    .line 5
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 6
    sget v1, Lcom/roblox/client/y;->w0:I

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    const/4 v2, 0x1

    .line 7
    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/tabs/TabLayout;->J(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 8
    :cond_0
    sget v0, Lcom/roblox/client/y;->y1:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    check-cast v0, Landroid/widget/TextView;

    invoke-static {p0, v0}, Ld9/b;->b(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 10
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ANIMATE_BUTTONS_EXTRA"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    sget v0, Lcom/roblox/client/y;->r0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-wide/16 v3, 0x1f4

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    .line 12
    new-instance v6, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v6, v5, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 13
    invoke-virtual {v6, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 14
    invoke-virtual {v0, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 15
    :cond_2
    sget v0, Lcom/roblox/client/y;->v0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 16
    new-instance v6, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v6, v5, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 17
    invoke-virtual {v6, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 18
    invoke-virtual {v0, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 19
    :cond_3
    sget v0, Lcom/roblox/client/y;->j1:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->W:Landroid/widget/Button;

    .line 20
    sget v0, Lcom/roblox/client/y;->a:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->Y:Landroid/view/View;

    .line 21
    sget v0, Lcom/roblox/client/y;->B0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->X:Landroid/widget/Button;

    .line 22
    sget v1, Lcom/roblox/client/c0;->z:I

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->W:Landroid/widget/Button;

    sget v1, Lcom/roblox/client/c0;->m0:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private D1(Lw8/o;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/roblox/client/startup/ActivitySplash;->C1(Landroid/content/Context;Lw8/o;)Landroid/content/Intent;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private E1(Lz7/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->V:Lz7/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, p1, v1}, Lz7/a;->k(Lz7/h;Lz7/c;)V

    goto :goto_0

    :cond_0
    const-string p1, "Warning: Touch event is received before listener is received."

    .line 3
    invoke-static {p1}, Lc9/k;->i(Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method protected i1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/i0;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x4e8d

    if-ne p1, p3, :cond_2

    const/16 p1, 0x66

    if-eq p2, p1, :cond_1

    const/16 p1, 0x67

    if-eq p2, p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object p1, Lr7/c;->r:Lr7/c;

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/ActivityStartMVP;->E1(Lz7/h;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/landing/ActivityStartMVP;->U:Lr7/b;

    invoke-interface {p1}, Lr7/b;->a()V

    goto :goto_0

    :cond_2
    const/16 p3, 0x4e8f

    if-ne p1, p3, :cond_5

    const/16 p1, 0x68

    if-eq p2, p1, :cond_4

    const/16 p1, 0x69

    if-eq p2, p1, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    sget-object p1, Lr7/c;->o:Lr7/c;

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/ActivityStartMVP;->E1(Lz7/h;)V

    goto :goto_0

    .line 5
    :cond_4
    iget-object p1, p0, Lcom/roblox/client/landing/ActivityStartMVP;->U:Lr7/b;

    invoke-interface {p1}, Lr7/b;->b()V

    :cond_5
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roblox/client/y;->B0:I

    if-ne v0, v1, :cond_0

    .line 2
    sget-object p1, Lr7/c;->p:Lr7/c;

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/ActivityStartMVP;->E1(Lz7/h;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roblox/client/y;->j1:I

    if-ne v0, v1, :cond_1

    .line 4
    sget-object p1, Lr7/c;->o:Lr7/c;

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/ActivityStartMVP;->E1(Lz7/h;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lcom/roblox/client/y;->a:I

    if-ne p1, v0, :cond_2

    .line 6
    sget-object p1, Lr7/c;->q:Lr7/c;

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/ActivityStartMVP;->E1(Lz7/h;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lz7/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Lw8/d;->h()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "ActivityStartMVP"

    const-string v0, "onCreate: no AppSettings - Start Splash..."

    .line 3
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    sget-object p1, Lw8/o;->p:Lw8/o;

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/ActivityStartMVP;->D1(Lw8/o;)V

    return-void

    .line 5
    :cond_0
    sget p1, Lcom/roblox/client/a0;->h:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    sput-object p1, Lcom/roblox/client/d1;->a:Landroid/util/DisplayMetrics;

    .line 7
    invoke-direct {p0}, Lcom/roblox/client/landing/ActivityStartMVP;->C1()V

    .line 8
    invoke-direct {p0}, Lcom/roblox/client/landing/ActivityStartMVP;->B1()V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "send_app_input_focus_to_lua"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/landing/ActivityStartMVP;->Z:Z

    return-void
.end method

.method protected onPause()V
    .locals 3

    .line 1
    invoke-super {p0}, Lz7/f;->onPause()V

    const-string v0, "ActivityStartMVP"

    const-string v1, "onPause()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-boolean v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->Z:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    new-instance v1, Lh9/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lh9/a;-><init>(Z)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/game/b;->A(Lh9/c;)V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lz7/f;->onResume()V

    const-string v0, "ActivityStartMVP"

    const-string v1, "onResume()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ls7/b;->g()Ls7/b$b;

    move-result-object v1

    sget-object v2, Ls7/b$b;->o:Ls7/b$b;

    if-ne v1, v2, :cond_1

    .line 5
    invoke-virtual {v0, p0}, Ls7/b;->d(Landroid/content/Context;)Ls7/f;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ls7/b;->n(Ls7/f;Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    .line 7
    :cond_0
    sget-object v1, Ls7/b$b;->n:Ls7/b$b;

    invoke-virtual {v0, v1}, Ls7/b;->s(Ls7/b$b;)V

    .line 8
    :cond_1
    iget-boolean v0, p0, Lcom/roblox/client/landing/ActivityStartMVP;->Z:Z

    if-eqz v0, :cond_2

    .line 9
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    new-instance v1, Lh9/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lh9/a;-><init>(Z)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/game/b;->A(Lh9/c;)V

    :cond_2
    return-void
.end method
