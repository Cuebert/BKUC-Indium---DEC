.class public Lcom/roblox/client/q;
.super Lcom/roblox/client/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/q$d;
    }
.end annotation


# instance fields
.field private Q0:Lcom/roblox/client/q$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/m0;-><init>()V

    return-void
.end method

.method static synthetic z2(Lcom/roblox/client/q;)Lcom/roblox/client/q$d;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/q;->Q0:Lcom/roblox/client/q$d;

    return-object p0
.end method


# virtual methods
.method public A2(Lcom/roblox/client/q$d;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/q;->Q0:Lcom/roblox/client/q$d;

    return-void
.end method

.method public W0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->W0()V

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public X0()V
    .locals 1

    .line 1
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Lcom/roblox/client/m0;->X0()V

    return-void
.end method

.method public g2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v0, Lcom/roblox/client/c0;->n:I

    .line 2
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->m:I

    new-instance v1, Lcom/roblox/client/q$c;

    invoke-direct {v1, p0}, Lcom/roblox/client/q$c;-><init>(Lcom/roblox/client/q;)V

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->E2:I

    new-instance v1, Lcom/roblox/client/q$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/q$b;-><init>(Lcom/roblox/client/q;)V

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lcom/roblox/client/q$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/q$a;-><init>(Lcom/roblox/client/q;)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onNavigatToFeatureEvent(La7/i;)V
    .locals 0
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->e2()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/c;->d2()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
