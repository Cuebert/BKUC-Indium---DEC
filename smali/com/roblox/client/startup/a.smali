.class public Lcom/roblox/client/startup/a;
.super Landroidx/fragment/app/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/a$b;
    }
.end annotation


# instance fields
.field private E0:Lcom/roblox/client/startup/a$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    return-void
.end method

.method static synthetic p2(Lcom/roblox/client/startup/a;)Lcom/roblox/client/startup/a$b;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/a;->E0:Lcom/roblox/client/startup/a$b;

    return-object p0
.end method

.method public static q2(Landroidx/appcompat/app/c;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/startup/a;->r2(Landroidx/appcompat/app/c;)Lcom/roblox/client/startup/a;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "FragmentRetry"

    const-string v1, "Dismiss the existing Retry UI..."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/c;->b2()V

    :cond_0
    return-void
.end method

.method private static r2(Landroidx/appcompat/app/c;)Lcom/roblox/client/startup/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-string v0, "FragmentRetry"

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    .line 2
    instance-of v0, p0, Lcom/roblox/client/startup/a;

    if-eqz v0, :cond_0

    .line 3
    check-cast p0, Lcom/roblox/client/startup/a;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static t2(Landroidx/appcompat/app/c;I)V
    .locals 4

    const-string v0, "FragmentRetry"

    const-string v1, "showRetryFragment: "

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p0}, Lcom/roblox/client/startup/a;->r2(Landroidx/appcompat/app/c;)Lcom/roblox/client/startup/a;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "showRetryFragment: Found an existing Retry fragment."

    .line 3
    invoke-static {v0, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/roblox/client/startup/a;->s2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const-string v1, "showRetryFragment: Create a new FragmentRetry..."

    .line 5
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance v1, Lcom/roblox/client/startup/a;

    invoke-direct {v1}, Lcom/roblox/client/startup/a;-><init>()V

    .line 7
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "message"

    .line 8
    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 9
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v1, p0, v0}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public H0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->H0()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/startup/a;->E0:Lcom/roblox/client/startup/a$b;

    return-void
.end method

.method public g2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    const-string p1, "FragmentRetry"

    const-string v0, "onCreateDialog:"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "message"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 3
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roblox/client/c0;->P2:I

    .line 4
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->s(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->g(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->F2:I

    new-instance v1, Lcom/roblox/client/startup/a$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/a$a;-><init>(Lcom/roblox/client/startup/a;)V

    .line 6
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->p(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    .line 8
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    return-object p1
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onCancel(Landroid/content/DialogInterface;)V

    const-string p1, "FragmentRetry"

    const-string v0, "onCancel:"

    .line 2
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object p1, p0, Lcom/roblox/client/startup/a;->E0:Lcom/roblox/client/startup/a$b;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/roblox/client/startup/a$b;->n()V

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onDismiss(Landroid/content/DialogInterface;)V

    const-string p1, "FragmentRetry"

    const-string v0, "onDismiss: Do nothing."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public s2(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->d2()Landroid/app/Dialog;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroidx/appcompat/app/b;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroidx/appcompat/app/b;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b;->h(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    .line 2
    instance-of v0, p1, Lcom/roblox/client/startup/a$b;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/roblox/client/startup/a$b;

    iput-object p1, p0, Lcom/roblox/client/startup/a;->E0:Lcom/roblox/client/startup/a$b;

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement OnFragmentInteractionListener."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
