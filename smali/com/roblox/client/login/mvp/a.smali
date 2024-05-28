.class public Lcom/roblox/client/login/mvp/a;
.super Lz7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/login/mvp/a$m;
    }
.end annotation


# instance fields
.field private R0:Landroid/widget/EditText;

.field private S0:Landroid/widget/EditText;

.field protected T0:Lcom/roblox/client/components/RbxEditText;

.field private U0:Lcom/roblox/client/components/RbxEditText;

.field private V0:Lcom/roblox/client/components/RbxTextView;

.field private W0:Lcom/roblox/client/components/RbxTextView;

.field private X0:Lcom/roblox/client/components/RbxProgressButton;

.field private Y0:Lcom/roblox/client/components/RbxButton;

.field private Z0:Lcom/roblox/client/components/RbxButton;

.field private a1:Lcom/roblox/client/components/RbxButton;

.field private b1:Landroid/view/View;

.field protected c1:Lcom/roblox/client/login/mvp/a$m;

.field private d1:Z

.field private e1:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz7/g;-><init>()V

    return-void
.end method

.method static synthetic A2(Lcom/roblox/client/login/mvp/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/login/mvp/a;->Q2()V

    return-void
.end method

.method static synthetic B2(Lcom/roblox/client/login/mvp/a;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/login/mvp/a;->R2(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic C2(Lcom/roblox/client/login/mvp/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/login/mvp/a;->d1:Z

    return p0
.end method

.method static synthetic D2(Lcom/roblox/client/login/mvp/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/login/mvp/a;->d1:Z

    return p1
.end method

.method static synthetic E2(Lcom/roblox/client/login/mvp/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/login/mvp/a;->e1:Z

    return p0
.end method

.method static synthetic F2(Lcom/roblox/client/login/mvp/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/login/mvp/a;->e1:Z

    return p1
.end method

.method static synthetic G2(Lcom/roblox/client/login/mvp/a;)Lcom/roblox/client/components/RbxEditText;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    return-object p0
.end method

.method static synthetic H2(Lcom/roblox/client/login/mvp/a;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic I2(Lcom/roblox/client/login/mvp/a;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic J2(Lcom/roblox/client/login/mvp/a;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/login/mvp/a;->b1:Landroid/view/View;

    return-object p0
.end method

.method static synthetic K2(Lcom/roblox/client/login/mvp/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/login/mvp/a;->X2()V

    return-void
.end method

.method private M2()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    new-instance v1, Lcom/roblox/client/login/mvp/a$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$b;-><init>(Lcom/roblox/client/login/mvp/a;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private N2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->q()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->q()V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->Y0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->b()V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->Z0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->b()V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->a1:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->b()V

    return-void
.end method

.method public static P2()Lcom/roblox/client/login/mvp/a;
    .locals 1

    new-instance v0, Lcom/roblox/client/login/mvp/a;

    invoke-direct {v0}, Lcom/roblox/client/login/mvp/a;-><init>()V

    return-object v0
.end method

.method private Q2()V
    .locals 5

    const-string v0, "rbx.authlogin"

    const-string v1, "onLoginButtonClick: ENTER"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/m0;->q2()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->clearFocus()V

    .line 5
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->clearFocus()V

    .line 6
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a;->X0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object v2, Lcom/roblox/client/components/RbxProgressButton$j;->o:Lcom/roblox/client/components/RbxProgressButton$j;

    sget v3, Lcom/roblox/client/c0;->e3:I

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roblox/client/components/RbxProgressButton;->z(Lcom/roblox/client/components/RbxProgressButton$j;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/roblox/client/login/mvp/a;->b1:Landroid/view/View;

    invoke-static {v1}, Lcom/roblox/client/d1;->k(Landroid/view/View;)V

    .line 8
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/a;->N2()V

    .line 9
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 10
    new-instance v2, Lcom/roblox/client/login/mvp/a$a;

    invoke-direct {v2, p0, v0}, Lcom/roblox/client/login/mvp/a$a;-><init>(Lcom/roblox/client/login/mvp/a;Landroid/content/Context;)V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private R2(Ljava/lang/String;Z)V
    .locals 1

    if-eqz p2, :cond_0

    const-string p2, "focus"

    goto :goto_0

    :cond_0
    const-string p2, "offFocus"

    :goto_0
    const-string v0, "login"

    invoke-static {v0, p1, p2}, Lcom/roblox/client/f0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private S2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    new-instance v1, Lcom/roblox/client/login/mvp/a$k;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$k;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    new-instance v1, Lcom/roblox/client/login/mvp/a$l;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$l;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private X2()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->X0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$j;->n:Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/roblox/client/c0;->y:I

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roblox/client/components/RbxProgressButton;->z(Lcom/roblox/client/components/RbxProgressButton$j;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->D()V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->D()V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->Y0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->c()V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->Z0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->c()V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->a1:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->c()V

    return-void
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->l0()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lcom/roblox/client/a0;->q:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/roblox/client/a0;->r:I

    .line 3
    :goto_0
    sget v2, Lcom/roblox/client/a0;->s:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 4
    sget v2, Lcom/roblox/client/y;->M:I

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 5
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 6
    sget v2, Lcom/roblox/client/y;->I:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 7
    sget v2, Lcom/roblox/client/a0;->p:I

    invoke-virtual {p1, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    sget p1, Lcom/roblox/client/y;->D:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    sget p1, Lcom/roblox/client/y;->E:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxButton;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->Y0:Lcom/roblox/client/components/RbxButton;

    .line 11
    sget p1, Lcom/roblox/client/y;->K:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxTextView;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->W0:Lcom/roblox/client/components/RbxTextView;

    .line 12
    sget v1, Lcom/roblox/client/c0;->G:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->Y0:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/c0;->u:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 14
    sget p1, Lcom/roblox/client/y;->J:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxTextView;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->V0:Lcom/roblox/client/components/RbxTextView;

    .line 15
    sget p1, Lcom/roblox/client/y;->N:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxEditText;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    .line 16
    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    .line 17
    sget v1, Lcom/roblox/client/y;->C1:I

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setId(I)V

    .line 18
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getBottomLabel()Landroid/widget/TextView;

    move-result-object p1

    sget v1, Lcom/roblox/client/y;->B1:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setId(I)V

    .line 19
    iput-object p2, p0, Lcom/roblox/client/login/mvp/a;->b1:Landroid/view/View;

    .line 20
    sget p1, Lcom/roblox/client/y;->L:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxEditText;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    .line 21
    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    .line 22
    sget v1, Lcom/roblox/client/y;->A1:I

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setId(I)V

    .line 23
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getBottomLabel()Landroid/widget/TextView;

    move-result-object p1

    sget v1, Lcom/roblox/client/y;->z1:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setId(I)V

    .line 24
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 25
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    new-instance v1, Lcom/roblox/client/login/mvp/a$d;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$d;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 26
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->Y0:Lcom/roblox/client/components/RbxButton;

    new-instance v1, Lcom/roblox/client/login/mvp/a$e;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$e;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    sget p1, Lcom/roblox/client/y;->G:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxProgressButton;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->X0:Lcom/roblox/client/components/RbxProgressButton;

    .line 28
    new-instance v1, Lcom/roblox/client/login/mvp/a$f;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$f;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxProgressButton;->setOnRbxClickedListener(Lcom/roblox/client/components/e;)V

    .line 29
    sget p1, Lcom/roblox/client/y;->H:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxButton;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->Z0:Lcom/roblox/client/components/RbxButton;

    .line 30
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->V0:Lcom/roblox/client/components/RbxTextView;

    sget v1, Lcom/roblox/client/c0;->F:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->X0:Lcom/roblox/client/components/RbxProgressButton;

    sget v1, Lcom/roblox/client/c0;->y:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxProgressButton;->setText(Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->Y0:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/c0;->B:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 33
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->X0:Lcom/roblox/client/components/RbxProgressButton;

    sget v1, Lcom/roblox/client/c0;->C:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 34
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->D:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 35
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->U0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->H:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 36
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->E:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->I:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 38
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->Z0:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/c0;->A:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 39
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    const/16 v1, 0x20

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 40
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->J:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 41
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    const/4 v1, 0x5

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 42
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->Z0:Lcom/roblox/client/components/RbxButton;

    new-instance v1, Lcom/roblox/client/login/mvp/a$g;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$g;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    sget p1, Lcom/roblox/client/y;->F:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxButton;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->a1:Lcom/roblox/client/components/RbxButton;

    .line 44
    sget v1, Lcom/roblox/client/c0;->x:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->a1:Lcom/roblox/client/components/RbxButton;

    new-instance v0, Lcom/roblox/client/login/mvp/a$h;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/a$h;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    new-instance v0, Lcom/roblox/client/login/mvp/a$i;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/a$i;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 47
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    new-instance v0, Lcom/roblox/client/login/mvp/a$j;

    invoke-direct {v0, p0}, Lcom/roblox/client/login/mvp/a$j;-><init>(Lcom/roblox/client/login/mvp/a;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 48
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/a;->S2()V

    if-nez p3, :cond_1

    .line 49
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->c1:Lcom/roblox/client/login/mvp/a$m;

    invoke-interface {p1}, Lcom/roblox/client/login/mvp/a$m;->t()V

    :cond_1
    return-object p2
.end method

.method public H0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz7/g;->H0()V

    const-string v0, "rbx.authlogin"

    const-string v1, "onDetach()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/roblox/client/login/mvp/a;->c1:Lcom/roblox/client/login/mvp/a$m;

    return-void
.end method

.method public L2()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    new-instance v1, Lcom/roblox/client/login/mvp/a$c;

    invoke-direct {v1, p0}, Lcom/roblox/client/login/mvp/a$c;-><init>(Lcom/roblox/client/login/mvp/a;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected O2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->c1:Lcom/roblox/client/login/mvp/a$m;

    invoke-interface {v0, p1, p2}, Lcom/roblox/client/login/mvp/a$m;->A(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public T2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    const v1, 0x80001

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roblox/client/c0;->I:I

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/a;->M2()V

    return-void
.end method

.method public U2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a;->S0:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public V2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->R0:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public W0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lz7/g;->W0()V

    const-string v0, "login"

    .line 2
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    return-void
.end method

.method public W2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/a;->X0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$j;->n:Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RbxProgressButton;->x(Lcom/roblox/client/components/RbxProgressButton$j;)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/a;->X2()V

    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lz7/g;->w0(Landroid/content/Context;)V

    const-string v0, "rbx.authlogin"

    const-string v1, "onAttach()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    instance-of v0, p1, Lcom/roblox/client/login/mvp/a$m;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Lcom/roblox/client/login/mvp/a$m;

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a;->c1:Lcom/roblox/client/login/mvp/a$m;

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
    invoke-super {p0, p1}, Lz7/g;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->l0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/c;->f2()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/c;->m2(II)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const v0, 0x103000a

    .line 4
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/c;->m2(II)V

    :goto_0
    return-void
.end method
