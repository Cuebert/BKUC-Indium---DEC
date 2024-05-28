.class public La9/a;
.super Lcom/roblox/client/m0;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/a$e;
    }
.end annotation


# instance fields
.field protected Q0:Ljava/lang/String;

.field protected R0:Ljava/lang/String;

.field protected S0:Ljava/lang/String;

.field protected T0:Landroid/widget/CheckBox;

.field protected U0:Landroid/widget/EditText;

.field protected V0:La9/a$e;

.field private W0:Lcom/roblox/client/components/RbxEditText;

.field private X0:Landroid/widget/TextView;

.field private Y0:Landroid/widget/TextView;

.field private Z0:Lcom/roblox/client/components/RbxProgressButton;

.field private a1:La9/b;

.field private b1:Landroid/view/View$OnTouchListener;

.field c1:La9/b$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/m0;-><init>()V

    .line 2
    new-instance v0, La9/a$a;

    invoke-direct {v0, p0}, La9/a$a;-><init>(La9/a;)V

    iput-object v0, p0, La9/a;->b1:Landroid/view/View$OnTouchListener;

    .line 3
    new-instance v0, La9/a$d;

    invoke-direct {v0, p0}, La9/a$d;-><init>(La9/a;)V

    iput-object v0, p0, La9/a;->c1:La9/b$c;

    return-void
.end method

.method public static B2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La9/a;
    .locals 3

    .line 1
    new-instance v0, La9/a;

    invoke-direct {v0}, La9/a;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "nonce"

    .line 3
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "mediaType"

    .line 4
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "username"

    .line 5
    invoke-virtual {v1, p0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private z2()V
    .locals 4

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, La9/a;->E2(Z)V

    .line 2
    iget-object v0, p0, La9/a;->U0:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, La9/a;->a1:La9/b;

    iget-object v1, p0, La9/a;->S0:Ljava/lang/String;

    iget-object v2, p0, La9/a;->Q0:Ljava/lang/String;

    iget-object v3, p0, La9/a;->c1:La9/b$c;

    invoke-virtual {v0, v1, v2, v3}, La9/b;->a(Ljava/lang/String;Ljava/lang/String;La9/b$c;)V

    return-void
.end method


# virtual methods
.method protected A2(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected C2()V
    .locals 8

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, La9/a;->E2(Z)V

    .line 2
    iget-object v1, p0, La9/a;->U0:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, La9/a;->A2(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v0, p0, La9/a;->T0:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v6

    .line 5
    iget-object v2, p0, La9/a;->a1:La9/b;

    iget-object v3, p0, La9/a;->S0:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, La9/a;->Q0:Ljava/lang/String;

    iget-object v7, p0, La9/a;->c1:La9/b$c;

    invoke-virtual/range {v2 .. v7}, La9/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa9/b$c;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, La9/a;->U0:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/roblox/client/c0;->B2:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, La9/a;->D2(ZLjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .line 1
    sget p3, Lcom/roblox/client/a0;->l:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    sget p2, Lcom/roblox/client/y;->y:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/roblox/client/components/RbxEditText;

    iput-object p2, p0, La9/a;->W0:Lcom/roblox/client/components/RbxEditText;

    .line 3
    invoke-virtual {p2}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object p2

    iput-object p2, p0, La9/a;->U0:Landroid/widget/EditText;

    .line 4
    new-instance p3, La9/a$b;

    invoke-direct {p3, p0}, La9/a$b;-><init>(La9/a;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 5
    sget p2, Lcom/roblox/client/y;->n1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, La9/a;->X0:Landroid/widget/TextView;

    .line 6
    sget p2, Lcom/roblox/client/y;->o1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, La9/a;->Y0:Landroid/widget/TextView;

    .line 7
    sget p2, Lcom/roblox/client/y;->g:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/roblox/client/components/RbxProgressButton;

    iput-object p2, p0, La9/a;->Z0:Lcom/roblox/client/components/RbxProgressButton;

    .line 8
    sget p2, Lcom/roblox/client/y;->i:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, La9/a;->T0:Landroid/widget/CheckBox;

    .line 9
    sget p2, Lcom/roblox/client/y;->m1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 10
    sget p3, Lcom/roblox/client/y;->p1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 11
    sget v1, Lcom/roblox/client/y;->h0:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    .line 13
    sget v3, Lcom/roblox/client/c0;->r3:I

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 14
    iget-object v3, p0, La9/a;->X0:Landroid/widget/TextView;

    sget v4, Lcom/roblox/client/c0;->n2:I

    new-array v5, v0, [Ljava/lang/Object;

    invoke-static {v2, v4, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v3, p0, La9/a;->Z0:Lcom/roblox/client/components/RbxProgressButton;

    sget v4, Lcom/roblox/client/c0;->o2:I

    new-array v5, v0, [Ljava/lang/Object;

    invoke-static {v2, v4, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roblox/client/components/RbxProgressButton;->setText(Ljava/lang/String;)V

    .line 16
    iget-object v3, p0, La9/a;->W0:Lcom/roblox/client/components/RbxEditText;

    sget v4, Lcom/roblox/client/c0;->p2:I

    new-array v5, v0, [Ljava/lang/Object;

    invoke-static {v2, v4, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 17
    sget v3, Lcom/roblox/client/c0;->q2:I

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v3, p0, La9/a;->T0:Landroid/widget/CheckBox;

    sget v4, Lcom/roblox/client/c0;->t2:I

    new-array v5, v0, [Ljava/lang/Object;

    invoke-static {v2, v4, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 19
    sget v3, Lcom/roblox/client/c0;->u2:I

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-array p3, v0, [Ljava/lang/Object;

    .line 20
    invoke-static {v2, v3, p3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 21
    iget-object p3, p0, La9/a;->Z0:Lcom/roblox/client/components/RbxProgressButton;

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Landroid/widget/RelativeLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 22
    sget p3, Lcom/roblox/client/c0;->s2:I

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    aput-object v8, v4, v0

    invoke-static {v2, p3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 23
    invoke-virtual {p3, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    .line 24
    new-instance v4, Ld9/d;

    invoke-static {}, Lcom/roblox/client/p0;->u()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v7

    .line 25
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v5

    add-int v10, v9, v5

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Ld9/d;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V

    .line 26
    iget-object v5, p0, La9/a;->Y0:Landroid/widget/TextView;

    new-array v3, v3, [Ld9/a;

    aput-object v4, v3, v0

    invoke-static {v5, p3, v3}, Ld9/b;->e(Landroid/widget/TextView;Ljava/lang/String;[Ld9/a;)V

    .line 27
    iget-object p3, p0, La9/a;->R0:Ljava/lang/String;

    const-string v3, "Sms"

    invoke-virtual {v3, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 28
    sget p3, Lcom/roblox/client/x;->X:I

    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    sget p3, Lcom/roblox/client/c0;->r2:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, p3, v0}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :cond_0
    iget-object p2, p0, La9/a;->X0:Landroid/widget/TextView;

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    iget-object p2, p0, La9/a;->U0:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->requestFocus()Z

    .line 32
    iget-object p2, p0, La9/a;->Z0:Lcom/roblox/client/components/RbxProgressButton;

    new-instance p3, La9/a$c;

    invoke-direct {p3, p0}, La9/a$c;-><init>(La9/a;)V

    invoke-virtual {p2, p3}, Lcom/roblox/client/components/RbxProgressButton;->setOnRbxClickedListener(Lcom/roblox/client/components/e;)V

    return-object p1
.end method

.method protected D2(ZLjava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, La9/a;->W0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxEditText;->w(Ljava/lang/String;)V

    .line 2
    :cond_0
    iget-object p1, p0, La9/a;->Z0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object p2, Lcom/roblox/client/components/RbxProgressButton$j;->n:Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->o2:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/roblox/client/components/RbxProgressButton;->z(Lcom/roblox/client/components/RbxProgressButton$j;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, La9/a;->X0:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 4
    iget-object p1, p0, La9/a;->Y0:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 5
    iget-object p1, p0, La9/a;->U0:Landroid/widget/EditText;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setEnabled(Z)V

    return-void
.end method

.method protected E2(Z)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, La9/a;->Z0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$j;->o:Lcom/roblox/client/components/RbxProgressButton$j;

    sget v1, Lcom/roblox/client/c0;->e3:I

    invoke-virtual {p1, v0, v1}, Lcom/roblox/client/components/RbxProgressButton;->y(Lcom/roblox/client/components/RbxProgressButton$j;I)V

    .line 2
    :cond_0
    iget-object p1, p0, La9/a;->W0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->r()V

    .line 3
    iget-object p1, p0, La9/a;->U0:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->clearFocus()V

    .line 4
    iget-object p1, p0, La9/a;->X0:Landroid/widget/TextView;

    iget-object v0, p0, La9/a;->b1:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 5
    iget-object p1, p0, La9/a;->Y0:Landroid/widget/TextView;

    iget-object v0, p0, La9/a;->b1:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 6
    iget-object p1, p0, La9/a;->U0:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 7
    iget-object p1, p0, La9/a;->U0:Landroid/widget/EditText;

    invoke-static {p1}, Lcom/roblox/client/d1;->k(Landroid/view/View;)V

    return-void
.end method

.method public H0()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->H0()V

    const-string v0, "Fragment2SV"

    const-string v1, "onDetach()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, La9/a;->V0:La9/a$e;

    return-void
.end method

.method public W0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->W0()V

    const-string v0, "twoStepVerification"

    .line 2
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lcom/roblox/client/y;->n1:I

    if-ne p1, v0, :cond_0

    .line 2
    invoke-direct {p0}, La9/a;->z2()V

    :cond_0
    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    const-string v0, "Fragment2SV"

    const-string v1, "onAttach()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    instance-of v0, p1, La9/a$e;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, La9/a$e;

    iput-object p1, p0, La9/a;->V0:La9/a$e;

    return-void

    .line 5
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

.method public z0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "nonce"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La9/a;->Q0:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "mediaType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La9/a;->R0:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "username"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La9/a;->S0:Ljava/lang/String;

    .line 6
    new-instance p1, La9/b;

    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    new-instance v1, Lh7/h;

    invoke-direct {v1}, Lh7/h;-><init>()V

    invoke-direct {p1, v0, v1}, La9/b;-><init>(Lx7/e;Lh7/f;)V

    iput-object p1, p0, La9/a;->a1:La9/b;

    :cond_0
    return-void
.end method
