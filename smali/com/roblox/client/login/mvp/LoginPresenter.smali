.class public Lcom/roblox/client/login/mvp/LoginPresenter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/login/mvp/c;
.implements Lz7/a;
.implements Landroidx/lifecycle/k;


# static fields
.field private static final v:Lcom/roblox/client/login/mvp/d;


# instance fields
.field private n:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/client/login/mvp/d;",
            ">;"
        }
    .end annotation
.end field

.field protected o:Lcom/roblox/client/login/mvp/b;

.field private p:Landroidx/lifecycle/f;

.field private q:Lx7/e;

.field private r:Lv6/a;

.field private s:Z

.field private t:Z

.field private final u:Lcom/roblox/client/login/mvp/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/client/login/mvp/LoginPresenter$a;

    invoke-direct {v0}, Lcom/roblox/client/login/mvp/LoginPresenter$a;-><init>()V

    sput-object v0, Lcom/roblox/client/login/mvp/LoginPresenter;->v:Lcom/roblox/client/login/mvp/d;

    return-void
.end method

.method constructor <init>(Lcom/roblox/client/login/mvp/d;Lx7/e;Lcom/roblox/client/login/mvp/b;Landroidx/lifecycle/f;Lv6/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/roblox/client/login/mvp/LoginPresenter$e;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/LoginPresenter$e;-><init>(Lcom/roblox/client/login/mvp/LoginPresenter;)V

    iput-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->u:Lcom/roblox/client/login/mvp/h;

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->n:Ljava/lang/ref/WeakReference;

    .line 4
    iput-object p3, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    .line 5
    iput-object p4, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->p:Landroidx/lifecycle/f;

    .line 6
    iput-object p2, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->q:Lx7/e;

    .line 7
    iput-object p5, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    .line 8
    invoke-virtual {p4, p0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 9
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    invoke-interface {p1, p0}, Lz7/b;->h0(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    invoke-interface {p1, p0}, Lz7/b;->u(Lz7/a;)V

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->s:Z

    .line 12
    iput-boolean p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->t:Z

    return-void
.end method

.method private A()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0xbfc130a

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    const v2, 0x3ff5b7c

    if-eq v1, v2, :cond_1

    const v2, 0x1c4e6237

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "PhoneNumber"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "Email"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const-string v1, "Username"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    .line 2
    sget-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->n:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    .line 3
    :cond_4
    sget-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->p:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    .line 4
    :cond_5
    sget-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->o:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    .line 5
    :goto_2
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/captcha/LoginCaptchaConfig;

    iget-object v3, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v3}, Lcom/roblox/client/login/mvp/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/roblox/client/captcha/LoginCaptchaConfig;-><init>(Lcom/roblox/client/captcha/LoginCaptchaConfig$c;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/roblox/client/login/mvp/d;->j0(Lcom/roblox/client/captcha/LoginCaptchaConfig;)V

    return-void
.end method

.method static synthetic m(Lcom/roblox/client/login/mvp/LoginPresenter;Lv6/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->z(Lv6/d;)V

    return-void
.end method

.method static synthetic n(Lcom/roblox/client/login/mvp/LoginPresenter;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->x()V

    return-void
.end method

.method static synthetic o(Lcom/roblox/client/login/mvp/LoginPresenter;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->s:Z

    return p1
.end method

.method static synthetic p(Lcom/roblox/client/login/mvp/LoginPresenter;)Lv6/d;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->u()Lv6/d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q(Lcom/roblox/client/login/mvp/LoginPresenter;)Lv6/a;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    return-object p0
.end method

.method static synthetic r(Lcom/roblox/client/login/mvp/LoginPresenter;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->A()V

    return-void
.end method

.method private u()Lv6/d;
    .locals 3

    new-instance v0, Lv6/d;

    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v1}, Lcom/roblox/client/login/mvp/b;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v2}, Lcom/roblox/client/login/mvp/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lv6/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private x()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->u()Lv6/d;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/login/mvp/LoginPresenter$c;

    invoke-direct {v3, p0}, Lcom/roblox/client/login/mvp/LoginPresenter$c;-><init>(Lcom/roblox/client/login/mvp/LoginPresenter;)V

    const/16 v4, 0x4e97

    .line 4
    invoke-interface {v0, v1, v4, v2, v3}, Lv6/a;->f(Landroid/app/Activity;ILv6/d;Lv6/a$a;)V

    return-void
.end method

.method private z(Lv6/d;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lv6/d;->a:Ljava/lang/String;

    .line 2
    iget-object p1, p1, Lv6/d;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v2, v1, v0, p1}, Lcom/roblox/client/login/mvp/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Lcom/roblox/client/login/mvp/d;->k0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    invoke-interface {v0}, Lv6/a;->a()V

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->w()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    invoke-interface {v0}, Lv6/a;->b()V

    return-void
.end method

.method cleanup()V
    .locals 1
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->p:Landroidx/lifecycle/f;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/k;)V

    return-void
.end method

.method public d(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->t:Z

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    .line 3
    invoke-interface {v0}, Lcom/roblox/client/login/mvp/b;->b()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    .line 4
    invoke-interface {p1}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    .line 5
    invoke-interface {p1}, Lcom/roblox/client/login/mvp/b;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v6, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->u:Lcom/roblox/client/login/mvp/h;

    move-object v4, p2

    move-object v5, p3

    .line 6
    invoke-interface/range {v0 .. v6}, Lcom/roblox/client/login/mvp/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/login/mvp/h;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/roblox/client/login/mvp/d;->w()V

    :goto_0
    return-void
.end method

.method public f(I)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    invoke-interface {p1}, Lv6/a;->a()V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    invoke-interface {p1}, Lv6/a;->e()V

    :goto_0
    return-void
.end method

.method public g(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    new-instance v1, Lcom/roblox/client/login/mvp/LoginPresenter$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/LoginPresenter$b;-><init>(Lcom/roblox/client/login/mvp/LoginPresenter;)V

    const/16 v2, 0x4e99

    invoke-interface {v0, p1, v2, v1}, Lv6/a;->c(Landroid/app/Activity;ILv6/a$b;)V

    return-void
.end method

.method public h(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "on2SVCodeVerified: userId => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.authlogin"

    invoke-static {p2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {p1}, Lcom/roblox/client/login/mvp/b;->a()V

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->w()V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    iget-object v6, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->u:Lcom/roblox/client/login/mvp/h;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p2

    invoke-interface/range {v0 .. v6}, Lcom/roblox/client/login/mvp/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/login/mvp/h;)V

    return-void
.end method

.method public j(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    invoke-interface {v0}, Lv6/a;->h()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    invoke-interface {v0, p1}, Lv6/a;->g(Landroid/content/Intent;)Lv6/d;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->z(Lv6/d;)V

    return-void
.end method

.method public k(Lz7/h;Lz7/c;)V
    .locals 0

    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/b;->d()V

    return-void
.end method

.method protected s(Lcom/roblox/client/login/mvp/e;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->q:Lx7/e;

    iget-object v1, p1, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/roblox/client/login/mvp/e;->b:Ljava/lang/String;

    iget p1, p1, Lcom/roblox/client/login/mvp/e;->d:I

    invoke-virtual {v0, v1, v2, p1}, Lx7/e;->c(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method setStoreCredentialValue()V
    .locals 2
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_RESUME:Landroidx/lifecycle/f$b;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v1}, Lcom/roblox/client/login/mvp/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/roblox/client/login/mvp/d;->V(Ljava/lang/String;)V

    return-void
.end method

.method protected t(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->s:Z

    const-string v1, "Username"

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "@"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Email"

    return-object p1

    .line 3
    :cond_1
    sget-object v0, Landroid/util/Patterns;->PHONE:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "PhoneNumber"

    return-object p1

    :cond_2
    return-object v1
.end method

.method protected v()Lcom/roblox/client/login/mvp/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/login/mvp/d;

    return-object v0

    .line 3
    :cond_0
    sget-object v0, Lcom/roblox/client/login/mvp/LoginPresenter;->v:Lcom/roblox/client/login/mvp/d;

    return-object v0
.end method

.method protected w()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onLoginSuccess: Will finish the view as success..."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->q:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->d()V

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    const/16 v1, 0x68

    invoke-interface {v0, v1}, Lcom/roblox/client/login/mvp/d;->N(I)V

    return-void
.end method

.method protected y()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter;->r:Lv6/a;

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/LoginPresenter;->u()Lv6/d;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/login/mvp/LoginPresenter$d;

    invoke-direct {v3, p0}, Lcom/roblox/client/login/mvp/LoginPresenter$d;-><init>(Lcom/roblox/client/login/mvp/LoginPresenter;)V

    const/16 v4, 0x4e98

    .line 4
    invoke-interface {v0, v1, v4, v2, v3}, Lv6/a;->f(Landroid/app/Activity;ILv6/d;Lv6/a$a;)V

    return-void
.end method
