.class public Lcom/roblox/client/login/mvp/ActivityLoginMVP;
.super Lz7/f;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/login/mvp/a$m;
.implements La9/a$e;
.implements Lcom/roblox/client/login/mvp/d;
.implements Lcom/roblox/client/captcha/a$a;


# instance fields
.field protected U:Lcom/roblox/client/login/mvp/c;

.field protected V:Landroid/content/DialogInterface$OnDismissListener;

.field private W:Landroid/content/DialogInterface$OnDismissListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz7/f;-><init>()V

    .line 2
    new-instance v0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$b;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V

    iput-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->V:Landroid/content/DialogInterface$OnDismissListener;

    .line 3
    new-instance v0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$c;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$c;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V

    iput-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->W:Landroid/content/DialogInterface$OnDismissListener;

    return-void
.end method

.method static synthetic B1(Lcom/roblox/client/login/mvp/ActivityLoginMVP;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->I1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C1(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)Lcom/roblox/client/login/mvp/a;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->E1()Lcom/roblox/client/login/mvp/a;

    move-result-object p0

    return-object p0
.end method

.method private E1()Lcom/roblox/client/login/mvp/a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "login_window_mvp"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/login/mvp/a;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/login/mvp/a;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private G1(ILandroid/content/Intent;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Result code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {p1, p2}, Lcom/roblox/client/login/mvp/c;->j(Landroid/content/Intent;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {p1}, Lcom/roblox/client/login/mvp/c;->b()V

    :goto_0
    return-void
.end method

.method private H1(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {v0, p2}, Lcom/roblox/client/login/mvp/c;->f(I)V

    const-string v0, "SAVE: Credentials saved."

    const/4 v1, -0x1

    const-string v2, "rbx.authlogin"

    const/16 v3, 0x4e97

    if-ne p1, v3, :cond_1

    if-ne p2, v1, :cond_0

    .line 2
    invoke-static {v2, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SAVE: Canceled by user or NEVER was clicked. ResultCode: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {p1}, Lcom/roblox/client/login/mvp/c;->a()V

    goto :goto_1

    :cond_1
    const/16 v3, 0x4e98

    if-ne p1, v3, :cond_3

    if-ne p2, v1, :cond_2

    .line 5
    invoke-static {v2, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    const-string p1, "SAVE: Canceled by user or NEVER was clicked."

    .line 6
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_1
    return-void
.end method

.method private I1(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->n(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroidx/fragment/app/t;->i()I

    .line 5
    :cond_0
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v0, Lcom/roblox/client/c0;->i0:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->G2:I

    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    invoke-static {p0, v0, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/login/mvp/ActivityLoginMVP$g;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$g;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->q(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$f;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V

    .line 7
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->m(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private J1(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCaptchaCallback: success => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {v0, p1, p2, p3}, Lcom/roblox/client/login/mvp/c;->d(ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onLoginClicked:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {v0, p1, p2}, Lcom/roblox/client/login/mvp/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public C(I)V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "showInvalidCredentialsAlert:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-static {p0, p1, v0}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->V:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/k0;->Y0(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public D1()Lcom/roblox/client/login/mvp/LoginPresenter;
    .locals 7

    .line 1
    new-instance v6, Lcom/roblox/client/login/mvp/LoginPresenter;

    .line 2
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/login/mvp/g;

    new-instance v0, Lcom/roblox/client/login/mvp/f;

    .line 3
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    .line 4
    invoke-static {}, Lb9/b;->c()Lb9/b;

    move-result-object v4

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lc9/p;->e(Landroid/content/Context;)Lc9/p;

    move-result-object v5

    invoke-direct {v0, v1, v4, v5}, Lcom/roblox/client/login/mvp/f;-><init>(Lb9/c;Lb9/b;Lc9/p;)V

    invoke-direct {v3, v0}, Lcom/roblox/client/login/mvp/g;-><init>(Lcom/roblox/client/login/mvp/f;)V

    .line 6
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->f()Landroidx/lifecycle/f;

    move-result-object v4

    new-instance v5, Lu8/a;

    new-instance v0, Lv6/b;

    invoke-direct {v0}, Lv6/b;-><init>()V

    invoke-direct {v5, p0, v0}, Lu8/a;-><init>(Landroid/app/Activity;Lv6/b;)V

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roblox/client/login/mvp/LoginPresenter;-><init>(Lcom/roblox/client/login/mvp/d;Lx7/e;Lcom/roblox/client/login/mvp/b;Landroidx/lifecycle/f;Lv6/a;)V

    return-object v6
.end method

.method protected F1(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 3
    sget p1, Lcom/roblox/client/t;->a:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public I(I)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/k0;->X0(Ljava/lang/String;)V

    return-void
.end method

.method protected K1()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onResetPasswordClosed."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/c;->l()V

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->E1()Lcom/roblox/client/login/mvp/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/a;->L2()V

    :cond_0
    return-void
.end method

.method protected L1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "WrongCredentialsForgotPassword"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Android-AppLogin-ForgotPassword-Pressed"

    goto :goto_0

    :cond_0
    const-string v0, "FloodcheckedResetPassword"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Android-AppLogin-ResetPassword-Pressed"

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 3
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public M()V
    .locals 0

    return-void
.end method

.method public M1(Lcom/roblox/client/login/mvp/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    return-void
.end method

.method public N(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finishViewWithResult: resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0, p1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->F1(I)V

    return-void
.end method

.method protected N1(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/k0;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$d;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$d;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;Landroid/os/Bundle;)V

    .line 3
    new-instance v1, Landroidx/appcompat/app/b$a;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const-string v2, "DialogTitle"

    .line 4
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p0, v2, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->t(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const-string v2, "DialogMessage"

    .line 5
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p0, v2, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const-string v2, "PositiveButton"

    .line 6
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p0, v2, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/app/b$a;->q(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const-string v2, "NegativeButton"

    .line 7
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {p0, p1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Landroidx/appcompat/app/b$a;->j(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1, v3}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    .line 10
    new-instance v0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$e;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$e;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 11
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showTwoStepVerificationUI: username = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->Q1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected O1()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->E1()Lcom/roblox/client/login/mvp/a;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "rbx.authlogin"

    const-string v1, "Create a new FragmentLoginMVP..."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lcom/roblox/client/login/mvp/a;->P2()Lcom/roblox/client/login/mvp/a;

    move-result-object v0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v1

    sget v2, Lcom/roblox/client/y;->D0:I

    const-string v3, "login_window_mvp"

    .line 6
    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/t;->p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/t;->h()I

    return-void
.end method

.method public P(I)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->W:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/k0;->Y0(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method protected P1()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "showResetPassword:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "login"

    const-string v1, "forgot_password"

    .line 2
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/resetpassword/ResetPasswordActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x4e91

    .line 4
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method protected Q1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1, p2, p3}, La9/a;->B2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La9/a;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    .line 3
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object p2

    sget p3, Lcom/roblox/client/t;->b:I

    sget v0, Lcom/roblox/client/t;->a:I

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p2, p3, v1, v1, v0}, Landroidx/fragment/app/t;->q(IIII)Landroidx/fragment/app/t;

    move-result-object p2

    sget p3, Lcom/roblox/client/y;->D0:I

    const-string v0, "Fragment2SV"

    .line 5
    invoke-virtual {p2, p3, p1, v0}, Landroidx/fragment/app/t;->p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroidx/fragment/app/t;->g(Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/t;->h()I

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->E1()Lcom/roblox/client/login/mvp/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/roblox/client/login/mvp/a;->V2(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/client/k0;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public b0()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onForgotPasswordClicked:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->P1()V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onCancelClicked:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "login"

    const-string v1, "close"

    .line 2
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->F1(I)V

    return-void
.end method

.method public c0()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onSignUpClicked:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "login"

    const-string v1, "signup"

    .line 2
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x69

    .line 3
    invoke-virtual {p0, v0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->F1(I)V

    return-void
.end method

.method public dismiss()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, v1, v1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->J1(ZLjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public e(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCodeVerified: userId => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {v0, p1, p2}, Lcom/roblox/client/login/mvp/c;->h(J)V

    return-void
.end method

.method public g()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/k0;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "rbx.authlogin"

    const-string v1, "showPasswordResetRequestedAlert:"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roblox/client/c0;->j0:I

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->G2:I

    new-array v3, v2, [Ljava/lang/Object;

    .line 4
    invoke-static {p0, v1, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;

    invoke-direct {v3, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V

    invoke-virtual {v0, v1, v3}, Landroidx/appcompat/app/b$a;->q(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public bridge synthetic h0(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/roblox/client/login/mvp/c;

    invoke-virtual {p0, p1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->M1(Lcom/roblox/client/login/mvp/c;)V

    return-void
.end method

.method public j0(Lcom/roblox/client/captcha/LoginCaptchaConfig;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/lifecycle/f$c;->r:Landroidx/lifecycle/f$c;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->f()Landroidx/lifecycle/f;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCaptchaUI: config = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {p1}, Lcom/roblox/client/captcha/a;->k3(Lcom/roblox/client/captcha/CaptchaConfig;)Lcom/roblox/client/captcha/a;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v0

    sget v1, Lcom/roblox/client/y;->C0:I

    const-string v2, "FragmentFunCaptcha"

    .line 5
    invoke-virtual {v0, v1, p1, v2}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/t;->g(Ljava/lang/String;)Landroidx/fragment/app/t;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/t;->h()I

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->w()V

    :goto_0
    return-void
.end method

.method public k0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->E1()Lcom/roblox/client/login/mvp/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/login/mvp/a;->U2(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public l0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W0()V

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->J1(ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "showForgotPasswordAlert:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0, p1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->N1(Landroid/os/Bundle;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/i0;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x4e91

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 3
    :pswitch_0
    invoke-direct {p0, p2, p3}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->G1(ILandroid/content/Intent;)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->H1(II)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->K1()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4e97
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n0()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    :cond_0
    const-string v0, "login"

    const-string v1, "close"

    .line 3
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->F1(I)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lz7/f;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "rbx.authlogin"

    const-string v0, "onCreate:"

    .line 2
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    sget p1, Lcom/roblox/client/a0;->d:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 4
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->O1()V

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->D1()Lcom/roblox/client/login/mvp/LoginPresenter;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    return-void
.end method

.method public t()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->U:Lcom/roblox/client/login/mvp/c;

    invoke-interface {v0, p0}, Lcom/roblox/client/login/mvp/c;->g(Landroid/app/Activity;)V

    return-void
.end method

.method public u(Lz7/a;)V
    .locals 0

    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->E1()Lcom/roblox/client/login/mvp/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/a;->W2()V

    :cond_0
    return-void
.end method
