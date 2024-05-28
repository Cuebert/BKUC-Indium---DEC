.class public Lcom/roblox/client/signup/ActivitySignUp;
.super Lcom/roblox/client/i0;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/signup/a$x;
.implements Lcom/roblox/client/captcha/a$a;


# instance fields
.field S:Lv6/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    return-void
.end method

.method static synthetic A1(Lcom/roblox/client/signup/ActivitySignUp;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/signup/ActivitySignUp;->B1(I)V

    return-void
.end method

.method private B1(I)V
    .locals 2

    if-nez p1, :cond_0

    const-string v0, "signup"

    const-string v1, "close"

    .line 1
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x0

    .line 4
    sget v0, Lcom/roblox/client/t;->a:I

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private C1()Landroidx/fragment/app/Fragment;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "signup_window"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method private D1(I)V
    .locals 3

    const-string v0, "ActivitySignUp"

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const-string p1, "SAVE: Credentials saved."

    .line 1
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/roblox/client/signup/ActivitySignUp;->S:Lv6/a;

    invoke-interface {p1}, Lv6/a;->a()V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SAVE: Canceled by user or NEVER was clicked. ResultCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lcom/roblox/client/signup/ActivitySignUp;->S:Lv6/a;

    invoke-interface {p1}, Lv6/a;->e()V

    :goto_0
    const/16 p1, 0x66

    .line 5
    invoke-direct {p0, p1}, Lcom/roblox/client/signup/ActivitySignUp;->B1(I)V

    return-void
.end method

.method private E1()V
    .locals 2

    new-instance v0, Lu8/a;

    new-instance v1, Lv6/b;

    invoke-direct {v1}, Lv6/b;-><init>()V

    invoke-direct {v0, p0, v1}, Lu8/a;-><init>(Landroid/app/Activity;Lv6/b;)V

    iput-object v0, p0, Lcom/roblox/client/signup/ActivitySignUp;->S:Lv6/a;

    return-void
.end method

.method private F1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/signup/ActivitySignUp;->C1()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Lcom/roblox/client/signup/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/signup/a;->B3(ZLjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public M()V
    .locals 0

    return-void
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/client/k0;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roblox/client/signup/ActivitySignUp;->B1(I)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/signup/ActivitySignUp;->C1()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/signup/a;

    invoke-virtual {v0}, Lcom/roblox/client/signup/a;->L3()V

    :cond_0
    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/signup/ActivitySignUp;->S:Lv6/a;

    new-instance v1, Lv6/d;

    invoke-direct {v1, p1, p2}, Lv6/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/roblox/client/signup/ActivitySignUp$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/signup/ActivitySignUp$a;-><init>(Lcom/roblox/client/signup/ActivitySignUp;)V

    const/16 p2, 0x4e9a

    invoke-interface {v0, p0, p2, v1, p1}, Lv6/a;->f(Landroid/app/Activity;ILv6/d;Lv6/a$a;)V

    return-void
.end method

.method public l0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "ActivitySignUp"

    const-string v1, "Invisible captcha success. Sign up again."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W0()V

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/signup/ActivitySignUp;->F1(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m0()V
    .locals 4

    const-string v0, "ActivitySignUp"

    const-string v1, "Try invisible captcha."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    invoke-direct {v0}, Lcom/roblox/client/captcha/SignUpCaptchaConfig;-><init>()V

    .line 3
    invoke-static {v0}, Lcom/roblox/client/captcha/a;->k3(Lcom/roblox/client/captcha/CaptchaConfig;)Lcom/roblox/client/captcha/a;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v1

    sget v2, Lcom/roblox/client/y;->h1:I

    const-string v3, "FragmentFunCaptcha"

    .line 5
    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object v0

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->g(Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/t;->h()I

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/i0;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onActivityResult: resultCode = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "ActivitySignUp"

    invoke-static {v0, p3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p3, 0x4e9a

    if-eq p1, p3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p2}, Lcom/roblox/client/signup/ActivitySignUp;->D1(I)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->f:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "signup_window"

    .line 4
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/signup/a;

    if-nez p1, :cond_0

    .line 5
    invoke-static {}, Lcom/roblox/client/signup/a;->z3()Lcom/roblox/client/signup/a;

    move-result-object p1

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v1

    sget v2, Lcom/roblox/client/y;->i1:I

    .line 7
    invoke-virtual {v1, v2, p1, v0}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/t;->h()I

    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FragmentSignUp not null. isAdded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->g0()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ". isVisible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->r0()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ActivitySignUp"

    .line 12
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/signup/ActivitySignUp;->E1()V

    return-void
.end method

.method public r()V
    .locals 1

    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lcom/roblox/client/signup/ActivitySignUp;->B1(I)V

    return-void
.end method
