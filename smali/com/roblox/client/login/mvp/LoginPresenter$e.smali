.class Lcom/roblox/client/login/mvp/LoginPresenter$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/login/mvp/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/login/mvp/LoginPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/login/mvp/LoginPresenter;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/LoginPresenter;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/login/mvp/e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLoginFailure: errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lcom/roblox/client/login/mvp/e;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.authlogin"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0, p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->s(Lcom/roblox/client/login/mvp/e;)V

    .line 3
    iget p1, p1, Lcom/roblox/client/login/mvp/e;->c:I

    const/16 v0, -0x7e5

    if-eq p1, v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/d;->w()V

    :cond_0
    const-string v0, "PhoneNumber"

    const-string v1, "Email"

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    .line 5
    :pswitch_0
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->s3:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto/16 :goto_2

    .line 6
    :pswitch_1
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->R:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto/16 :goto_2

    .line 7
    :pswitch_2
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {p1, v2}, Lcom/roblox/client/login/mvp/LoginPresenter;->o(Lcom/roblox/client/login/mvp/LoginPresenter;Z)Z

    .line 8
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->L:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto/16 :goto_2

    .line 9
    :pswitch_3
    sget p1, Lcom/roblox/client/c0;->P:I

    .line 10
    iget-object v2, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    iget-object v2, v2, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v2}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    sget p1, Lcom/roblox/client/c0;->N:I

    goto :goto_0

    .line 12
    :cond_1
    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    iget-object v1, v1, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v1}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13
    sget p1, Lcom/roblox/client/c0;->O:I

    .line 14
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->q(Lcom/roblox/client/login/mvp/LoginPresenter;)Lv6/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {v1}, Lcom/roblox/client/login/mvp/LoginPresenter;->p(Lcom/roblox/client/login/mvp/LoginPresenter;)Lv6/d;

    move-result-object v1

    invoke-interface {v0, v1}, Lv6/a;->d(Lv6/d;)V

    .line 15
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/roblox/client/login/mvp/d;->C(I)V

    goto/16 :goto_2

    .line 16
    :pswitch_4
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->Q:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto/16 :goto_2

    .line 17
    :pswitch_5
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->K:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto/16 :goto_2

    .line 18
    :pswitch_6
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {p1, v2}, Lcom/roblox/client/login/mvp/LoginPresenter;->o(Lcom/roblox/client/login/mvp/LoginPresenter;Z)Z

    .line 19
    sget p1, Lcom/roblox/client/c0;->L:I

    .line 20
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    iget-object v0, v0, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 21
    sget p1, Lcom/roblox/client/c0;->S:I

    .line 22
    :cond_3
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/roblox/client/login/mvp/d;->P(I)V

    goto :goto_2

    .line 23
    :pswitch_7
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {p1, v2}, Lcom/roblox/client/login/mvp/LoginPresenter;->o(Lcom/roblox/client/login/mvp/LoginPresenter;Z)Z

    .line 24
    sget p1, Lcom/roblox/client/c0;->L:I

    .line 25
    iget-object v2, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    iget-object v2, v2, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v2}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 26
    sget p1, Lcom/roblox/client/c0;->d0:I

    goto :goto_1

    .line 27
    :cond_4
    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    iget-object v1, v1, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v1}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 28
    sget p1, Lcom/roblox/client/c0;->e0:I

    .line 29
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/roblox/client/login/mvp/d;->P(I)V

    goto :goto_2

    .line 30
    :pswitch_8
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->c0:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto :goto_2

    .line 31
    :pswitch_9
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->X:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    goto :goto_2

    .line 32
    :pswitch_a
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->r(Lcom/roblox/client/login/mvp/LoginPresenter;)V

    goto :goto_2

    .line 33
    :pswitch_b
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->M:I

    invoke-interface {p1, v0}, Lcom/roblox/client/login/mvp/d;->I(I)V

    :goto_2
    :pswitch_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x7e7
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/d;->w()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/roblox/client/login/mvp/d;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {p1}, Lcom/roblox/client/login/mvp/LoginPresenter;->y()V

    return-void
.end method

.method public c()V
    .locals 3

    const-string v0, "rbx.authlogin"

    const-string v1, "onFloodCheck."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/d;->w()V

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    sget v1, Lcom/roblox/client/c0;->t3:I

    const-string v2, "DialogTitle"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    sget v1, Lcom/roblox/client/c0;->h0:I

    const-string v2, "PositiveButton"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6
    sget v1, Lcom/roblox/client/c0;->G2:I

    const-string v2, "NegativeButton"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 7
    sget v1, Lcom/roblox/client/c0;->Y:I

    const-string v2, "DialogMessage"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CallContext"

    const-string v2, "FloodcheckedResetPassword"

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/roblox/client/login/mvp/d;->m(Landroid/os/Bundle;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-static {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->n(Lcom/roblox/client/login/mvp/LoginPresenter;)V

    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "rbx.authlogin"

    const-string v1, "onPasswordResetRequested: "

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/d;->w()V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/d;->g()V

    return-void
.end method

.method public f()V
    .locals 4

    const-string v0, "rbx.authlogin"

    const-string v1, "onTooManyFailedCredentials."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/login/mvp/d;->w()V

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    sget v1, Lcom/roblox/client/c0;->V:I

    const-string v2, "DialogTitle"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    sget v1, Lcom/roblox/client/c0;->w:I

    const-string v2, "PositiveButton"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6
    sget v1, Lcom/roblox/client/c0;->G2:I

    const-string v2, "NegativeButton"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 7
    sget v1, Lcom/roblox/client/c0;->b0:I

    .line 8
    iget-object v2, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    iget-object v2, v2, Lcom/roblox/client/login/mvp/LoginPresenter;->o:Lcom/roblox/client/login/mvp/b;

    invoke-interface {v2}, Lcom/roblox/client/login/mvp/b;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "PhoneNumber"

    .line 9
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 10
    sget v1, Lcom/roblox/client/c0;->a0:I

    goto :goto_0

    :cond_0
    const-string v3, "Email"

    .line 11
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 12
    sget v1, Lcom/roblox/client/c0;->Z:I

    :cond_1
    :goto_0
    const-string v2, "DialogMessage"

    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CallContext"

    const-string v2, "WrongCredentialsForgotPassword"

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lcom/roblox/client/login/mvp/LoginPresenter$e;->a:Lcom/roblox/client/login/mvp/LoginPresenter;

    invoke-virtual {v1}, Lcom/roblox/client/login/mvp/LoginPresenter;->v()Lcom/roblox/client/login/mvp/d;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/roblox/client/login/mvp/d;->m(Landroid/os/Bundle;)V

    return-void
.end method
