.class public Lcom/roblox/client/captcha/a;
.super Lcom/roblox/client/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/captcha/a$a;
    }
.end annotation


# instance fields
.field private l1:Lcom/roblox/client/captcha/a$a;

.field private m1:Z

.field private n1:Z

.field private o1:Lcom/roblox/client/captcha/CaptchaConfig;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/n0;-><init>()V

    return-void
.end method

.method public static k3(Lcom/roblox/client/captcha/CaptchaConfig;)Lcom/roblox/client/captcha/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/roblox/client/captcha/a;

    invoke-direct {v0}, Lcom/roblox/client/captcha/a;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "captchaConfig"

    .line 3
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private l3()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b0()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/captcha/a;->l1:Lcom/roblox/client/captcha/a$a;

    invoke-interface {v0}, Lcom/roblox/client/captcha/a$a;->M()V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/roblox/client/n0;->e3(Z)V

    return-void
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/n0;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public H0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/n0;->H0()V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onDetach."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-boolean v0, p0, Lcom/roblox/client/captcha/a;->n1:Z

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/roblox/client/captcha/a;->l1:Lcom/roblox/client/captcha/a$a;

    invoke-interface {v0}, Lcom/roblox/client/captcha/a$a;->dismiss()V

    const-string v0, "captcha"

    const-string v1, "close"

    .line 5
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/roblox/client/captcha/a;->l1:Lcom/roblox/client/captcha/a$a;

    return-void
.end method

.method public P0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/n0;->P0()V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onPause."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/roblox/client/n0;->e3(Z)V

    return-void
.end method

.method public U0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/n0;->U0()V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onResume."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    .line 4
    iget-boolean v0, p0, Lcom/roblox/client/captcha/a;->m1:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/captcha/a;->l3()V

    :cond_0
    return-void
.end method

.method public W0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/n0;->W0()V

    const-string v0, "captcha"

    .line 2
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    return-void
.end method

.method public onNavigateToFeatureEvent(La7/i;)V
    .locals 3
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigateToFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, La7/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentFunCaptcha"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v2, "CAPTCHA_SUCCESS_TAG"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 3
    iput-boolean v2, p0, Lcom/roblox/client/captcha/a;->n1:Z

    .line 4
    invoke-virtual {p1}, La7/i;->e()Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "captchaData"

    .line 5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "captchaToken"

    .line 6
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "captchaProvider"

    .line 7
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object p1, v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object p1, v0

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/roblox/client/captcha/a;->l1:Lcom/roblox/client/captcha/a$a;

    invoke-interface {v1, v0, p1}, Lcom/roblox/client/captcha/a$a;->l0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object p1, p1, La7/i;->a:Ljava/lang/String;

    const-string v0, "CAPTCHA_SHOWN_TAG"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isCaptchaShown: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/roblox/client/captcha/a;->m1:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iget-boolean p1, p0, Lcom/roblox/client/captcha/a;->m1:Z

    if-nez p1, :cond_2

    .line 12
    iput-boolean v2, p0, Lcom/roblox/client/captcha/a;->m1:Z

    .line 13
    invoke-direct {p0}, Lcom/roblox/client/captcha/a;->l3()V

    :cond_2
    :goto_1
    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/n0;->t0(Landroid/os/Bundle;)V

    const-string p1, "FragmentFunCaptcha"

    const-string v0, "onActivityCreated."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lcom/roblox/client/captcha/a;->o1:Lcom/roblox/client/captcha/CaptchaConfig;

    invoke-interface {v0}, Lcom/roblox/client/captcha/CaptchaConfig;->s()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Load captcha url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object p1, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/roblox/client/t0;->X2(Ljava/lang/String;)V

    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/n0;->w0(Landroid/content/Context;)V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onAttach."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    instance-of v0, v0, Lcom/roblox/client/captcha/a$a;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/captcha/a$a;

    iput-object p1, p0, Lcom/roblox/client/captcha/a;->l1:Lcom/roblox/client/captcha/a$a;

    return-void

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement OnFragmentInteractionListener"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/n0;->z0(Landroid/os/Bundle;)V

    const-string p1, "FragmentFunCaptcha"

    const-string v0, "onCreate."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "captchaConfig"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/captcha/CaptchaConfig;

    iput-object p1, p0, Lcom/roblox/client/captcha/a;->o1:Lcom/roblox/client/captcha/CaptchaConfig;

    :cond_0
    return-void
.end method
