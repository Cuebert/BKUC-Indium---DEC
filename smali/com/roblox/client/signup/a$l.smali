.class Lcom/roblox/client/signup/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a;->B3(ZLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/content/Context;

.field final synthetic o:Landroid/os/Handler;

.field final synthetic p:Ljava/lang/String;

.field final synthetic q:Ljava/lang/String;

.field final synthetic r:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    iput-object p2, p0, Lcom/roblox/client/signup/a$l;->n:Landroid/content/Context;

    iput-object p3, p0, Lcom/roblox/client/signup/a$l;->o:Landroid/os/Handler;

    iput-object p4, p0, Lcom/roblox/client/signup/a$l;->p:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/client/signup/a$l;->q:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const-string v3, "Empty"

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v4

    iget-object v5, p0, Lcom/roblox/client/signup/a$l;->n:Landroid/content/Context;

    sget v6, Lcom/roblox/client/c0;->V1:I

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v5, v6, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v4, v5}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    sget-object v4, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    invoke-static {v0, v4}, Lcom/roblox/client/signup/a;->C2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    const-string v0, "username"

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v4, v0

    .line 4
    :goto_0
    iget-object v5, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v5}, Lcom/roblox/client/signup/a;->J2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    iget-object v1, v0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    iget-object v4, p0, Lcom/roblox/client/signup/a$l;->n:Landroid/content/Context;

    sget v5, Lcom/roblox/client/c0;->U1:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v4, v5, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    sget-object v1, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    invoke-static {v0, v1}, Lcom/roblox/client/signup/a;->N2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    const-string v0, "password"

    goto :goto_1

    :cond_1
    move-object v3, v4

    .line 7
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    const-string v2, "signup"

    .line 8
    invoke-static {v2, v0, v3, v1}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->l3(Lcom/roblox/client/signup/a;)V

    .line 10
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->X2(Lcom/roblox/client/signup/a;)V

    .line 11
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->K2(Lcom/roblox/client/signup/a;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-virtual {v0}, Lcom/roblox/client/signup/a;->L3()V

    return-void

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/roblox/client/signup/a$l;->o:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/client/signup/a$l$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$l$a;-><init>(Lcom/roblox/client/signup/a$l;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
