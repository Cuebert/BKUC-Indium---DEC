.class public abstract Lcom/roblox/client/i0;
.super Lcom/roblox/client/k0;
.source "SourceFile"

# interfaces
.implements Ly8/e$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/i0$g;
    }
.end annotation


# static fields
.field public static R:I


# instance fields
.field private I:Landroidx/appcompat/app/b;

.field private J:Landroidx/appcompat/app/b;

.field private K:Landroidx/appcompat/app/b;

.field private L:Landroid/app/ProgressDialog;

.field private M:Z

.field private N:Lo7/b;

.field private O:Lr6/a;

.field protected P:Landroidx/appcompat/widget/Toolbar;

.field protected Q:Ly8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/k0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/i0;->M:Z

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/i0;->j1()Lo7/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    .line 4
    new-instance v0, Lr6/a;

    invoke-direct {v0}, Lr6/a;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/i0;->O:Lr6/a;

    return-void
.end method

.method static synthetic f1(Lcom/roblox/client/i0;Landroidx/appcompat/app/b;)Landroidx/appcompat/app/b;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    return-object p1
.end method

.method private l1(Landroidx/appcompat/app/b;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Le/b;->dismiss()V

    :cond_0
    return-void
.end method

.method private n1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    invoke-direct {p0, v0}, Lcom/roblox/client/i0;->l1(Landroidx/appcompat/app/b;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    return-void
.end method

.method private q1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lo7/b;->f(Landroid/view/LayoutInflater;Lcom/roblox/client/k0;)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-super {p0, v0}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method private r1(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;->q1()V

    .line 2
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->c()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    return-void
.end method

.method private s1(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;->q1()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    invoke-virtual {v0}, Lo7/b;->c()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private t1(Ly8/f;)V
    .locals 4

    .line 1
    sget-object v0, Ly8/f;->o:Ly8/f;

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_2

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v2

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    if-eqz v0, :cond_1

    and-int/lit16 v0, v2, -0x2001

    goto :goto_1

    :cond_1
    or-int/lit16 v0, v2, 0x2000

    :goto_1
    invoke-virtual {v3, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 5
    :cond_2
    invoke-static {}, Lcom/roblox/client/p0;->i0()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6
    sget-object v0, Lcom/roblox/client/i0$f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v1, :cond_3

    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->p:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_2

    .line 8
    :cond_3
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->w:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    .line 9
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 10
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/v;->m:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method private w1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->m3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/roblox/client/d1;->b(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/app/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    .line 4
    new-instance v1, Lcom/roblox/client/i0$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/i0$b;-><init>(Lcom/roblox/client/i0;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    goto :goto_0

    :cond_1
    const-string v0, "RobloxActivity"

    const-string v1, "A network-disconnected alert already exists. Do nothing."

    .line 7
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private z1()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "using new api on app resume. mIsAppResumedFromColdStart: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/i0;->M:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Ls7/h;

    invoke-direct {v0}, Ls7/h;-><init>()V

    new-instance v1, Lcom/roblox/client/i0$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/i0$a;-><init>(Lcom/roblox/client/i0;)V

    invoke-virtual {v0, p0, v1}, Ls7/h;->c(Landroid/content/Context;Ls7/h$d;)V

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
    iget-object v0, p0, Lcom/roblox/client/i0;->P:Landroidx/appcompat/widget/Toolbar;

    instance-of v1, v0, Lcom/roblox/client/components/RobloxToolbar;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->U(Ly8/f;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    if-eqz v0, :cond_3

    .line 5
    sget-object v0, Lcom/roblox/client/i0$f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/v;->p:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/v;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/v;->w:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    invoke-virtual {v1, v0}, Lo7/b;->g(I)V

    .line 10
    :cond_3
    invoke-direct {p0, p1}, Lcom/roblox/client/i0;->t1(Ly8/f;)V

    return-void
.end method

.method public g1()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/roblox/client/d1;->l(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/i0;->w1()V

    :cond_0
    return v0
.end method

.method protected h1()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;->n1()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/i0;->J:Landroidx/appcompat/app/b;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roblox/client/c0;->q3:I

    .line 4
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->s(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->l3:I

    .line 5
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->g(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/i0;->J:Landroidx/appcompat/app/b;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/i0;->J:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/roblox/client/i0;->J:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method

.method protected i1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected j1()Lo7/b;
    .locals 1

    new-instance v0, Lo7/b;

    invoke-direct {v0}, Lo7/b;-><init>()V

    return-object v0
.end method

.method protected k1()Z
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "ROBLOXCrash"

    const/4 v2, 0x0

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public m1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/i0;->L:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/i0;->L:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/roblox/client/i0;->L:Landroid/app/ProgressDialog;

    :cond_0
    return-void
.end method

.method public o1()Lo7/b;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/i0;->N:Lo7/b;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: requestCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x4e87

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    .line 2
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Sharing with="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0, p3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 5
    invoke-static {p1}, Lcom/roblox/client/f0;->w(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object p1

    const-string p2, "Android-AppMain-GameShare-AppSelected"

    invoke-virtual {p1, p2}, Lx7/e;->A(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Sharing dialog dismissed."

    .line 7
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object p1

    const-string p2, "Android-AppMain-GameShare-ChooserDismissed"

    invoke-virtual {p1, p2}, Lx7/e;->A(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    const-string v1, "RobloxActivity"

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0, p1}, Lcom/roblox/client/k0;->onCreate(Landroid/os/Bundle;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    sget-object v2, Lx7/b$d;->o:Lx7/b$d;

    invoke-virtual {v0, p0, v2}, Lx7/b;->k(Landroid/content/Context;Lx7/b$d;)V

    .line 5
    instance-of v0, p0, Lcom/roblox/client/startup/ActivitySplash;

    .line 6
    invoke-static {}, Lw8/d;->h()Z

    move-result v2

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    const-string v0, "onCreate ... settingsLoaded = false. Load from preferences!!!"

    .line 7
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {p0}, Lw8/d;->l(Landroid/content/Context;)V

    .line 9
    :cond_1
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ls7/b;->u(Landroid/content/Context;)V

    .line 10
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lx7/d;->d(Landroid/content/Context;)V

    .line 11
    invoke-super {p0, p1}, Lcom/roblox/client/k0;->onCreate(Landroid/os/Bundle;)V

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "activity onCreate, name = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    invoke-virtual {p0}, Lcom/roblox/client/k0;->S0()V

    .line 14
    invoke-virtual {p0}, Lcom/roblox/client/i0;->u1()V

    if-nez v2, :cond_2

    .line 15
    invoke-virtual {p0}, Lcom/roblox/client/i0;->i1()Z

    move-result p1

    if-nez p1, :cond_2

    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onCreate: no AppSettings in activity:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Finish self!"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_2
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/roblox/client/i0;->M:Z

    .line 19
    new-instance p1, Ly8/e;

    invoke-direct {p1, p0}, Ly8/e;-><init>(Ly8/e$b;)V

    iput-object p1, p0, Lcom/roblox/client/i0;->Q:Ly8/e;

    .line 20
    invoke-virtual {p1, p0}, Ly8/e;->b(Landroidx/lifecycle/l;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "RobloxActivity"

    const-string v1, "onCreate: App was previously destroyed due to process death"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0}, Lcom/roblox/client/k0;->onDestroy()V

    return-void

    .line 4
    :cond_0
    invoke-super {p0}, Lcom/roblox/client/k0;->onDestroy()V

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/i0;->n1()V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/i0;->J:Landroidx/appcompat/app/b;

    invoke-direct {p0, v0}, Lcom/roblox/client/i0;->l1(Landroidx/appcompat/app/b;)V

    return-void
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/k0;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/k0;->onResume()V

    .line 2
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v0

    invoke-virtual {v0, p0}, Lh8/m;->j(Landroid/content/Context;)V

    return-void
.end method

.method protected onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/roblox/client/k0;->onStart()V

    .line 2
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/p0;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "RobloxActivity"

    const-string v1, "Alert: needs restart"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0}, Lcom/roblox/client/i0;->h1()V

    .line 5
    :cond_0
    sget v0, Lcom/roblox/client/i0;->R:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/roblox/client/i0;->R:I

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-static {}, Lx7/a;->a()Lx7/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbc/c;->n(Ljava/lang/Object;)V

    .line 7
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lx7/b;->n(Z)V

    .line 8
    invoke-static {p0}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "ROBLOXCrash"

    .line 9
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    iget-boolean v0, p0, Lcom/roblox/client/i0;->M:Z

    if-nez v0, :cond_1

    .line 11
    invoke-direct {p0}, Lcom/roblox/client/i0;->z1()V

    .line 12
    :cond_1
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->l0()V

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/roblox/client/i0;->M:Z

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    sget v0, Lcom/roblox/client/i0;->R:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/roblox/client/i0;->R:I

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-static {}, Lx7/a;->a()Lx7/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 3
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx7/b;->n(Z)V

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->g0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->stopPushNotificationSession()V

    .line 6
    :cond_0
    invoke-static {p0}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ROBLOXCrash"

    .line 7
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v0, "RobloxActivity"

    const-string v1, "The Shell is in background."

    .line 8
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0}, Ln6/c;->u()V

    .line 10
    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0}, Ln6/c;->t()V

    .line 11
    :cond_1
    invoke-super {p0}, Lcom/roblox/client/k0;->onStop()V

    return-void
.end method

.method public p1(Lx7/b$f;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToPostLogoutUI: logoutType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", foreground = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/k0;->c1()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    .line 3
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "navigateToPostLogoutUI: [New Startup] Launch Main activity..."

    .line 4
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/client/n;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 7
    sget-object v0, Lx7/b$f;->o:Lx7/b$f;

    if-eq p1, v0, :cond_0

    const-string p1, "navigateToPostLogoutUI: notify Lua about this 401 logout condition"

    .line 8
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "NativeShellEvent"

    const-string v0, "NETWORK_ERROR_401"

    .line 9
    invoke-static {p1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->fire(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/roblox/client/i0;->r1(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/roblox/client/i0;->s1(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/i0;->s1(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected u1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x500

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 3
    iget-object v1, p0, Lcom/roblox/client/k0;->E:Lo7/a;

    invoke-virtual {v1, v0}, Lo7/a;->d(Landroid/view/View;)V

    return-void
.end method

.method public v1(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget v0, Lcom/roblox/client/c0;->f0:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    sget v1, Lcom/roblox/client/c0;->g0:I

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Landroid/app/ProgressDialog;

    invoke-direct {v2, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v2, v0}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 6
    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 8
    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    const/4 p1, 0x0

    .line 9
    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 10
    iput-object v2, p0, Lcom/roblox/client/i0;->L:Landroid/app/ProgressDialog;

    .line 11
    invoke-virtual {v2}, Landroid/app/ProgressDialog;->show()V

    return-void
.end method

.method protected x1(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/i0;->y1(ZLcom/roblox/client/i0$g;)V

    return-void
.end method

.method protected y1(ZLcom/roblox/client/i0$g;)V
    .locals 11

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    sget p2, Lcom/roblox/client/c0;->v3:I

    invoke-static {p0, p2}, Lc9/n;->a(Landroid/app/Activity;I)V

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/roblox/client/i0;->I:Landroidx/appcompat/app/b;

    invoke-direct {p0, v0}, Lcom/roblox/client/i0;->l1(Landroidx/appcompat/app/b;)V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/i0;->K:Landroidx/appcompat/app/b;

    invoke-direct {p0, v0}, Lcom/roblox/client/i0;->l1(Landroidx/appcompat/app/b;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-static {}, Lcom/roblox/client/c1;->e()Lcom/roblox/client/c1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/c1;->d()Lcom/roblox/client/c1$d;

    move-result-object v3

    .line 8
    invoke-static {}, Lc9/l;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lcom/roblox/client/c0;->M2:I

    goto :goto_0

    :cond_2
    sget v0, Lcom/roblox/client/c0;->S2:I

    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {}, Lc9/l;->g()Z

    move-result v1

    const/4 v8, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    .line 10
    sget v0, Lcom/roblox/client/c0;->r:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 11
    :cond_3
    sget v1, Lcom/roblox/client/c0;->t:I

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v0, v4, v8

    invoke-virtual {p0, v1, v4}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-eqz p1, :cond_5

    .line 12
    iget-object v1, p0, Lcom/roblox/client/i0;->J:Landroidx/appcompat/app/b;

    invoke-direct {p0, v1}, Lcom/roblox/client/i0;->l1(Landroidx/appcompat/app/b;)V

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-static {v1}, Lr6/a;->a(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 14
    invoke-static {p0, v2, v3}, Lr6/a;->b(Landroid/app/Activity;ZLcom/roblox/client/c1$d;)V

    return-void

    .line 15
    :cond_4
    new-instance v1, Landroidx/appcompat/app/b$a;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/roblox/client/c0;->s:I

    .line 16
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->s(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    sget v9, Lcom/roblox/client/c0;->q:I

    new-instance v10, Lcom/roblox/client/i0$c;

    move-object v1, v10

    move-object v2, p0

    move-object v4, p0

    move-object v6, p2

    move v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/roblox/client/i0$c;-><init>(Lcom/roblox/client/i0;Lcom/roblox/client/c1$d;Landroid/app/Activity;Ljava/lang/String;Lcom/roblox/client/i0$g;Z)V

    .line 18
    invoke-virtual {v0, v9, v10}, Landroidx/appcompat/app/b$a;->p(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/i0;->K:Landroidx/appcompat/app/b;

    goto :goto_2

    .line 20
    :cond_5
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roblox/client/c0;->s:I

    .line 21
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/b$a;->s(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    .line 22
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->q:I

    new-instance v7, Lcom/roblox/client/i0$e;

    move-object v1, v7

    move-object v2, p0

    move-object v4, p0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/roblox/client/i0$e;-><init>(Lcom/roblox/client/i0;Lcom/roblox/client/c1$d;Landroid/app/Activity;Ljava/lang/String;Lcom/roblox/client/i0$g;)V

    .line 23
    invoke-virtual {p1, v0, v7}, Landroidx/appcompat/app/b$a;->p(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->p:I

    new-instance v1, Lcom/roblox/client/i0$d;

    invoke-direct {v1, p0, p2}, Lcom/roblox/client/i0$d;-><init>(Lcom/roblox/client/i0;Lcom/roblox/client/i0$g;)V

    .line 24
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/i0;->K:Landroidx/appcompat/app/b;

    .line 26
    :goto_2
    iget-object p1, p0, Lcom/roblox/client/i0;->K:Landroidx/appcompat/app/b;

    invoke-virtual {p1, v8}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 27
    iget-object p1, p0, Lcom/roblox/client/i0;->K:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
