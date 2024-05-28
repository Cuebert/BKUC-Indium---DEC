.class Lcom/roblox/client/login/mvp/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/login/mvp/a;->Q2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/content/Context;

.field final synthetic o:Lcom/roblox/client/login/mvp/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/a;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    iput-object p2, p0, Lcom/roblox/client/login/mvp/a$a;->n:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "login"

    const-string v1, "submit"

    .line 1
    invoke-static {v0, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v0}, Lcom/roblox/client/login/mvp/a;->H2(Lcom/roblox/client/login/mvp/a;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    iget-object v1, v1, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    iget-object v4, p0, Lcom/roblox/client/login/mvp/a$a;->n:Landroid/content/Context;

    sget v5, Lcom/roblox/client/c0;->U:I

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v4, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roblox/client/components/RbxEditText;->w(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v1, v2}, Lcom/roblox/client/login/mvp/a;->D2(Lcom/roblox/client/login/mvp/a;Z)Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    iget-object v1, v1, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v1}, Lcom/roblox/client/components/RbxEditText;->r()V

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v1}, Lcom/roblox/client/login/mvp/a;->I2(Lcom/roblox/client/login/mvp/a;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 9
    iget-object v4, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v4}, Lcom/roblox/client/login/mvp/a;->G2(Lcom/roblox/client/login/mvp/a;)Lcom/roblox/client/components/RbxEditText;

    move-result-object v4

    iget-object v5, p0, Lcom/roblox/client/login/mvp/a$a;->n:Landroid/content/Context;

    sget v6, Lcom/roblox/client/c0;->T:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v5, v6, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/roblox/client/components/RbxEditText;->w(Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v3, v2}, Lcom/roblox/client/login/mvp/a;->F2(Lcom/roblox/client/login/mvp/a;Z)Z

    .line 11
    iget-object v2, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v2}, Lcom/roblox/client/login/mvp/a;->I2(Lcom/roblox/client/login/mvp/a;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->requestFocus()Z

    .line 12
    iget-object v2, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v2}, Lcom/roblox/client/login/mvp/a;->J2(Lcom/roblox/client/login/mvp/a;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v3}, Lcom/roblox/client/login/mvp/a;->I2(Lcom/roblox/client/login/mvp/a;)Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/roblox/client/d1;->p(Landroid/view/View;Landroid/widget/EditText;)V

    goto :goto_1

    .line 13
    :cond_1
    iget-object v2, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v2}, Lcom/roblox/client/login/mvp/a;->G2(Lcom/roblox/client/login/mvp/a;)Lcom/roblox/client/components/RbxEditText;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/client/components/RbxEditText;->r()V

    .line 14
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 15
    :cond_2
    iget-object v2, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    iget-object v3, v2, Lcom/roblox/client/login/mvp/a;->c1:Lcom/roblox/client/login/mvp/a$m;

    if-eqz v3, :cond_3

    .line 16
    invoke-virtual {v2, v0, v1}, Lcom/roblox/client/login/mvp/a;->O2(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void

    .line 17
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a$a;->o:Lcom/roblox/client/login/mvp/a;

    invoke-static {v0}, Lcom/roblox/client/login/mvp/a;->K2(Lcom/roblox/client/login/mvp/a;)V

    return-void
.end method
