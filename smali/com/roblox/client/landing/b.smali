.class public Lcom/roblox/client/landing/b;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field private o0:Lcom/roblox/client/landing/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static X1(Lcom/roblox/client/landing/a;)Lcom/roblox/client/landing/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/roblox/client/landing/b;

    invoke-direct {v0}, Lcom/roblox/client/landing/b;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "itemId"

    .line 3
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 1
    sget p3, Lcom/roblox/client/a0;->n:I

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 3
    sget p2, Lcom/roblox/client/y;->t0:I

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 4
    sget p3, Lcom/roblox/client/y;->u0:I

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/roblox/client/components/RbxTextView;

    .line 5
    sget v1, Lcom/roblox/client/y;->s0:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roblox/client/components/RbxTextView;

    .line 6
    iget-object v2, p0, Lcom/roblox/client/landing/b;->o0:Lcom/roblox/client/landing/a;

    invoke-virtual {v2}, Lcom/roblox/client/landing/a;->b()I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p2

    .line 8
    iget-object v2, p0, Lcom/roblox/client/landing/b;->o0:Lcom/roblox/client/landing/a;

    invoke-virtual {v2}, Lcom/roblox/client/landing/a;->c()I

    move-result v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {p2, v2, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p3, p0, Lcom/roblox/client/landing/b;->o0:Lcom/roblox/client/landing/a;

    invoke-virtual {p3}, Lcom/roblox/client/landing/a;->a()I

    move-result p3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p3, v0}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "itemId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/landing/a;

    iput-object p1, p0, Lcom/roblox/client/landing/b;->o0:Lcom/roblox/client/landing/a;

    return-void
.end method
