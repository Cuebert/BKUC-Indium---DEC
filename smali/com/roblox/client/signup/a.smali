.class public Lcom/roblox/client/signup/a;
.super Lcom/roblox/client/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/signup/a$x;,
        Lcom/roblox/client/signup/a$w;,
        Lcom/roblox/client/signup/a$y;,
        Lcom/roblox/client/signup/a$b0;,
        Lcom/roblox/client/signup/a$z;,
        Lcom/roblox/client/signup/a$d0;,
        Lcom/roblox/client/signup/a$a0;,
        Lcom/roblox/client/signup/a$c0;
    }
.end annotation


# static fields
.field private static F1:Lcom/roblox/client/signup/a$x;


# instance fields
.field private A1:Ljava/lang/String;

.field private B1:Ljava/lang/String;

.field private C1:Ljava/lang/String;

.field private D1:Ljava/lang/String;

.field private E1:Lcom/roblox/client/signup/d$a;

.field private Q0:Lcom/roblox/client/components/RbxButton;

.field private R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

.field private S0:Landroid/widget/EditText;

.field private T0:Lcom/roblox/client/components/RbxProgressButton;

.field private U0:Landroid/widget/TextView;

.field private V0:Lcom/roblox/client/components/RbxButton;

.field private W0:Lcom/roblox/client/components/RbxTextView;

.field private X0:Lcom/roblox/client/components/RbxTextView;

.field Y0:Landroid/widget/EditText;

.field Z0:Lcom/roblox/client/components/RbxEditText;

.field a1:Lcom/roblox/client/components/RbxLoadingEditText;

.field b1:Lcom/roblox/client/components/RbxGenderPicker;

.field c1:Lcom/roblox/client/components/RbxBirthdayPicker;

.field private d1:Lcom/roblox/client/signup/e;

.field private e1:Lx7/e;

.field private f1:Ljava/lang/String;

.field private g1:Ljava/lang/String;

.field private h1:Ljava/lang/String;

.field private i1:I

.field private j1:I

.field private k1:I

.field private l1:I

.field private m1:Z

.field private n1:Lcom/roblox/client/signup/a$a0;

.field private o1:Lcom/roblox/client/signup/a$a0;

.field private p1:Lcom/roblox/client/signup/a$a0;

.field private q1:Lcom/roblox/client/signup/a$a0;

.field private r1:Lcom/roblox/client/signup/a$a0;

.field private s1:Landroid/view/View;

.field private t1:J

.field u1:Lcom/roblox/client/signup/a$x;

.field private final v1:I

.field private final w1:I

.field private x1:Lcom/roblox/client/signup/a$b0;

.field private y1:Lcom/roblox/client/signup/a$w;

.field private z1:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/client/signup/a$k;

    invoke-direct {v0}, Lcom/roblox/client/signup/a$k;-><init>()V

    sput-object v0, Lcom/roblox/client/signup/a;->F1:Lcom/roblox/client/signup/a$x;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/m0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    .line 3
    iput-object v0, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    .line 4
    iput-object v0, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    .line 5
    iput-object v0, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    .line 6
    iput-object v0, p0, Lcom/roblox/client/signup/a;->U0:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/roblox/client/signup/a;->V0:Lcom/roblox/client/components/RbxButton;

    .line 8
    iput-object v0, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    .line 9
    iput-object v0, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    .line 10
    iput-object v0, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    .line 11
    iput-object v0, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    .line 12
    iput-object v0, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    .line 13
    iput-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/roblox/client/signup/a;->g1:Ljava/lang/String;

    .line 15
    iput-object v0, p0, Lcom/roblox/client/signup/a;->h1:Ljava/lang/String;

    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lcom/roblox/client/signup/a;->i1:I

    .line 17
    iput v1, p0, Lcom/roblox/client/signup/a;->j1:I

    .line 18
    iput v1, p0, Lcom/roblox/client/signup/a;->k1:I

    const/4 v1, 0x0

    .line 19
    iput v1, p0, Lcom/roblox/client/signup/a;->l1:I

    .line 20
    iput-boolean v1, p0, Lcom/roblox/client/signup/a;->m1:Z

    .line 21
    sget-object v1, Lcom/roblox/client/signup/a$a0;->n:Lcom/roblox/client/signup/a$a0;

    iput-object v1, p0, Lcom/roblox/client/signup/a;->n1:Lcom/roblox/client/signup/a$a0;

    .line 22
    iput-object v1, p0, Lcom/roblox/client/signup/a;->o1:Lcom/roblox/client/signup/a$a0;

    .line 23
    sget-object v2, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    iput-object v2, p0, Lcom/roblox/client/signup/a;->p1:Lcom/roblox/client/signup/a$a0;

    .line 24
    sget-object v2, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    iput-object v2, p0, Lcom/roblox/client/signup/a;->q1:Lcom/roblox/client/signup/a$a0;

    .line 25
    iput-object v1, p0, Lcom/roblox/client/signup/a;->r1:Lcom/roblox/client/signup/a$a0;

    .line 26
    iput-object v0, p0, Lcom/roblox/client/signup/a;->s1:Landroid/view/View;

    .line 27
    sget-object v1, Lcom/roblox/client/signup/a;->F1:Lcom/roblox/client/signup/a$x;

    iput-object v1, p0, Lcom/roblox/client/signup/a;->u1:Lcom/roblox/client/signup/a$x;

    const/16 v1, 0x1f4

    .line 28
    iput v1, p0, Lcom/roblox/client/signup/a;->v1:I

    const/16 v1, 0x7d0

    .line 29
    iput v1, p0, Lcom/roblox/client/signup/a;->w1:I

    .line 30
    new-instance v1, Lcom/roblox/client/signup/a$y;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/signup/a$y;-><init>(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$k;)V

    iput-object v1, p0, Lcom/roblox/client/signup/a;->E1:Lcom/roblox/client/signup/d$a;

    return-void
.end method

.method static synthetic A2(Lcom/roblox/client/signup/a;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->s1:Landroid/view/View;

    return-object p0
.end method

.method static synthetic B2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$c0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/signup/a;->s3(Lcom/roblox/client/signup/a$c0;)V

    return-void
.end method

.method static synthetic C2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a;->n1:Lcom/roblox/client/signup/a$a0;

    return-object p1
.end method

.method private C3(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget v0, Lcom/roblox/client/c0;->d2:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a;->z1:Ljava/lang/String;

    .line 2
    sget v0, Lcom/roblox/client/c0;->a2:I

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a;->A1:Ljava/lang/String;

    .line 3
    sget v0, Lcom/roblox/client/c0;->H1:I

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a;->B1:Ljava/lang/String;

    .line 4
    sget v0, Lcom/roblox/client/c0;->X1:I

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a;->C1:Ljava/lang/String;

    .line 5
    sget v0, Lcom/roblox/client/c0;->J1:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/signup/a;->D1:Ljava/lang/String;

    return-void
.end method

.method static synthetic D2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/a$w;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->y1:Lcom/roblox/client/signup/a$w;

    return-object p0
.end method

.method static synthetic E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    return-object p0
.end method

.method static synthetic F2(Lcom/roblox/client/signup/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/signup/a;->q3()V

    return-void
.end method

.method private F3(Lcom/roblox/client/components/RbxEditText;I)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxEditText;->v(I)V

    return-void
.end method

.method static synthetic G2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a;->p1:Lcom/roblox/client/signup/a$a0;

    return-object p1
.end method

.method private G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxEditText;->w(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    return-object p0
.end method

.method private H3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxEditText;->B(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    return-void
.end method

.method private I3()V
    .locals 4

    .line 1
    new-instance v0, Lcom/roblox/client/signup/a$e;

    invoke-direct {v0, p0}, Lcom/roblox/client/signup/a$e;-><init>(Lcom/roblox/client/signup/a;)V

    .line 2
    new-instance v1, Lcom/roblox/client/signup/a$f;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$f;-><init>(Lcom/roblox/client/signup/a;)V

    .line 3
    new-instance v2, Lcom/roblox/client/signup/a$w;

    iget-object v3, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    invoke-direct {v2, v3}, Lcom/roblox/client/signup/a$w;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    iput-object v2, p0, Lcom/roblox/client/signup/a;->y1:Lcom/roblox/client/signup/a$w;

    .line 4
    iget-object v2, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    new-instance v3, Lcom/roblox/client/signup/a$g;

    invoke-direct {v3, p0, v0}, Lcom/roblox/client/signup/a$g;-><init>(Lcom/roblox/client/signup/a;Ljava/lang/Runnable;)V

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    new-instance v2, Lcom/roblox/client/signup/a$h;

    invoke-direct {v2, p0, v1}, Lcom/roblox/client/signup/a$h;-><init>(Lcom/roblox/client/signup/a;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    new-instance v0, Lcom/roblox/client/signup/a$i;

    invoke-direct {v0, p0}, Lcom/roblox/client/signup/a$i;-><init>(Lcom/roblox/client/signup/a;)V

    .line 7
    iget-object v1, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    invoke-virtual {v1}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/signup/a$j;

    invoke-direct {v2, p0, v0}, Lcom/roblox/client/signup/a$j;-><init>(Lcom/roblox/client/signup/a;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method static synthetic J2(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->g1:Ljava/lang/String;

    return-object p0
.end method

.method private J3()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a;->u1:Lcom/roblox/client/signup/a$x;

    invoke-interface {v0}, Lcom/roblox/client/signup/a$x;->m0()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/signup/a;->L3()V

    :goto_0
    return-void
.end method

.method static synthetic K2(Lcom/roblox/client/signup/a;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/signup/a;->M3()Z

    move-result p0

    return p0
.end method

.method static synthetic L2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/a$a0;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->o1:Lcom/roblox/client/signup/a$a0;

    return-object p0
.end method

.method static synthetic M2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/components/RbxProgressButton;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    return-object p0
.end method

.method private M3()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->w3()Z

    move-result v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "formValid: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentSignUp"

    invoke-static {v2, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v1, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    invoke-virtual {v1, v0}, Lcom/roblox/client/components/RbxProgressButton;->setEnabled(Z)V

    return v0
.end method

.method static synthetic N2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a;->o1:Lcom/roblox/client/signup/a$a0;

    return-object p1
.end method

.method static synthetic O2(Lcom/roblox/client/signup/a;)J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/client/signup/a;->t1:J

    return-wide v0
.end method

.method static synthetic P2(Lcom/roblox/client/signup/a;J)J
    .locals 0

    iput-wide p1, p0, Lcom/roblox/client/signup/a;->t1:J

    return-wide p1
.end method

.method static synthetic Q2(Lcom/roblox/client/signup/a;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/signup/a;->l1:I

    return p0
.end method

.method static synthetic R2(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->h1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic S2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/d$a;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->E1:Lcom/roblox/client/signup/d$a;

    return-object p0
.end method

.method static synthetic T2(Lcom/roblox/client/signup/a;)Lx7/e;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->e1:Lx7/e;

    return-object p0
.end method

.method static synthetic U2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/a$b0;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->x1:Lcom/roblox/client/signup/a$b0;

    return-object p0
.end method

.method static synthetic V2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/signup/a;->H3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W2(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->A1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic X2(Lcom/roblox/client/signup/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/signup/a;->r3()V

    return-void
.end method

.method static synthetic Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/signup/a;->o3(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Z2(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->z1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a3(Lcom/roblox/client/signup/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/signup/a;->J3()V

    return-void
.end method

.method static synthetic b3(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->B1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c3(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->C1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d3(Lcom/roblox/client/signup/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->D1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e3(Lcom/roblox/client/signup/a;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/signup/a;->v3()Z

    move-result p0

    return p0
.end method

.method static synthetic f3(Lcom/roblox/client/signup/a;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/signup/a;->k1:I

    return p0
.end method

.method static synthetic g3(Lcom/roblox/client/signup/a;I)I
    .locals 0

    iput p1, p0, Lcom/roblox/client/signup/a;->k1:I

    return p1
.end method

.method static synthetic h3(Lcom/roblox/client/signup/a;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/signup/a;->j1:I

    return p0
.end method

.method static synthetic i3(Lcom/roblox/client/signup/a;I)I
    .locals 0

    iput p1, p0, Lcom/roblox/client/signup/a;->j1:I

    return p1
.end method

.method static synthetic j3(Lcom/roblox/client/signup/a;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/signup/a;->i1:I

    return p0
.end method

.method static synthetic k3(Lcom/roblox/client/signup/a;I)I
    .locals 0

    iput p1, p0, Lcom/roblox/client/signup/a;->i1:I

    return p1
.end method

.method static synthetic l3(Lcom/roblox/client/signup/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/signup/a;->p3()V

    return-void
.end method

.method static synthetic m3(Lcom/roblox/client/signup/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/signup/a;->m1:Z

    return p0
.end method

.method static synthetic n3(Lcom/roblox/client/signup/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/signup/a;->m1:Z

    return p1
.end method

.method private o3(Ljava/lang/String;)V
    .locals 3

    sget v0, Lcom/roblox/client/c0;->u3:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/m0;->p2(I[Ljava/lang/Object;)V

    return-void
.end method

.method private p3()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->v3()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    :goto_0
    iput-object v0, p0, Lcom/roblox/client/signup/a;->q1:Lcom/roblox/client/signup/a$a0;

    .line 2
    sget-object v1, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    if-eq v0, v1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxBirthdayPicker;->q()V

    const/4 v0, 0x1

    const-string v1, "signup"

    const-string v2, "birthday"

    const-string v3, "incomplete"

    .line 4
    invoke-static {v1, v2, v3, v0}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->M3()Z

    return-void
.end method

.method private q3()V
    .locals 1

    sget-object v0, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    iput-object v0, p0, Lcom/roblox/client/signup/a;->p1:Lcom/roblox/client/signup/a$a0;

    return-void
.end method

.method private r3()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxGenderPicker;->getValue()I

    move-result v0

    iput v0, p0, Lcom/roblox/client/signup/a;->l1:I

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    :goto_0
    iput-object v0, p0, Lcom/roblox/client/signup/a;->r1:Lcom/roblox/client/signup/a$a0;

    .line 3
    sget-object v1, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxGenderPicker;->p()V

    const/4 v0, 0x1

    const-string v1, "signup"

    const-string v2, "gender"

    const-string v3, "not selected"

    .line 5
    invoke-static {v1, v2, v3, v0}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->M3()Z

    return-void
.end method

.method private s3(Lcom/roblox/client/signup/a$c0;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/signup/a;->u3()V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    .line 4
    sget-object v2, Lcom/roblox/client/signup/a$n;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const-string v3, "TooShort"

    const-string v4, "Empty"

    const-string v5, ""

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, "username"

    const-string v9, "password"

    if-eq v2, v6, :cond_6

    const/4 v8, 0x2

    if-eq v2, v8, :cond_1

    move-object v3, v5

    goto/16 :goto_5

    .line 5
    :cond_1
    sget-object v2, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    iput-object v2, p0, Lcom/roblox/client/signup/a;->o1:Lcom/roblox/client/signup/a$a0;

    .line 6
    invoke-static {v0}, Lcom/roblox/client/d1;->l(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v0, Lcom/roblox/client/c0;->m3:I

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->F3(Lcom/roblox/client/components/RbxEditText;I)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/signup/a;->g1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v0, Lcom/roblox/client/c0;->u0:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RbxEditText;->y(Ljava/lang/String;)V

    move-object v3, v4

    goto :goto_1

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/signup/a;->g1:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v0, Lcom/roblox/client/c0;->Q1:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v3, "IsUsername"

    goto :goto_1

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/roblox/client/signup/a;->g1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x8

    if-ge v0, v2, :cond_5

    .line 13
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v0, Lcom/roblox/client/c0;->Y1:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    goto :goto_1

    .line 14
    :cond_5
    new-instance v0, Lcom/roblox/client/signup/a$b0;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/signup/a$b0;-><init>(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$c0;)V

    new-array p1, v7, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    move-object v3, v5

    :goto_1
    move-object v5, v9

    goto/16 :goto_5

    .line 15
    :cond_6
    sget-object v2, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    iput-object v2, p0, Lcom/roblox/client/signup/a;->n1:Lcom/roblox/client/signup/a$a0;

    .line 16
    invoke-static {v0}, Lcom/roblox/client/d1;->l(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 17
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->m3:I

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->F3(Lcom/roblox/client/components/RbxEditText;I)V

    move-object v3, v5

    :cond_7
    :goto_2
    move-object v5, v8

    goto/16 :goto_5

    .line 18
    :cond_8
    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 19
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->z0:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RbxEditText;->y(Ljava/lang/String;)V

    move-object v3, v4

    goto/16 :goto_4

    .line 20
    :cond_9
    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_a

    .line 21
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->i2:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 22
    :cond_a
    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x14

    if-le v0, v2, :cond_b

    .line 23
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->i2:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v3, "TooLong"

    goto/16 :goto_4

    :cond_b
    const-string v0, "([A-Z]|[a-z]|[0-9]|_)*"

    .line 24
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_c

    .line 25
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->g2:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v3, "InvalidCharacters"

    goto/16 :goto_4

    .line 26
    :cond_c
    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x5f

    if-eq v0, v2, :cond_11

    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v2, :cond_d

    goto :goto_3

    .line 27
    :cond_d
    iget-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    invoke-static {v0, v2}, Lc9/q;->b(Ljava/lang/String;C)I

    move-result v0

    if-le v0, v6, :cond_e

    .line 28
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->l2:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v3, "InvalidUsernameDoubleUnderscore"

    goto :goto_4

    .line 29
    :cond_e
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->v3()Z

    move-result v0

    if-nez v0, :cond_f

    .line 30
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->I1:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v3, "BirthdayNotSet"

    goto :goto_4

    .line 31
    :cond_f
    iget-object v0, p0, Lcom/roblox/client/signup/a;->x1:Lcom/roblox/client/signup/a$b0;

    if-eqz v0, :cond_10

    .line 32
    invoke-virtual {v0, v6}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 33
    :cond_10
    new-instance v0, Lcom/roblox/client/signup/a$b0;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/signup/a$b0;-><init>(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$c0;)V

    iput-object v0, p0, Lcom/roblox/client/signup/a;->x1:Lcom/roblox/client/signup/a$b0;

    new-array p1, v7, [Ljava/lang/Void;

    .line 34
    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 35
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxLoadingEditText;->F()V

    move-object v3, v5

    goto :goto_4

    .line 36
    :cond_11
    :goto_3
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v0, Lcom/roblox/client/c0;->h2:I

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/signup/a;->G3(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v3, "InvalidFirstOrLastCharacter"

    .line 37
    :goto_4
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    .line 38
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    invoke-virtual {p1}, Lcom/roblox/client/signup/UsernameSignUpEditText;->I()V

    goto/16 :goto_2

    .line 39
    :goto_5
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->M3()Z

    .line 40
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_12

    const-string p1, "signup"

    .line 41
    invoke-static {p1, v5, v3, v6}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_12
    return-void
.end method

.method private t3(III)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/signup/a;->x3(III)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 3
    sget p1, Lcom/roblox/client/c0;->o1:I

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    sget p1, Lcom/roblox/client/c0;->n1:I

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 5
    :goto_0
    iget-object p2, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    invoke-virtual {p2, p1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->D()V

    return-void
.end method

.method private v3()Z
    .locals 2

    iget v0, p0, Lcom/roblox/client/signup/a;->i1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/roblox/client/signup/a;->j1:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/roblox/client/signup/a;->k1:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private w3()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/signup/a;->n1:Lcom/roblox/client/signup/a$a0;

    sget-object v1, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/signup/a;->q1:Lcom/roblox/client/signup/a$a0;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/signup/a;->o1:Lcom/roblox/client/signup/a$a0;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/signup/a;->r1:Lcom/roblox/client/signup/a$a0;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/signup/a;->p1:Lcom/roblox/client/signup/a$a0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private x3(III)Z
    .locals 0

    invoke-static {p1, p2, p3}, Lc9/f;->c(III)I

    move-result p1

    const/16 p2, 0xd

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private y3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->q()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->q()V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxGenderPicker;->n()V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxBirthdayPicker;->k()V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->q()V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->b()V

    .line 7
    iget-object v0, p0, Lcom/roblox/client/signup/a;->V0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->b()V

    return-void
.end method

.method static synthetic z2(Lcom/roblox/client/signup/a;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    return-object p0
.end method

.method static z3()Lcom/roblox/client/signup/a;
    .locals 1

    new-instance v0, Lcom/roblox/client/signup/a;

    invoke-direct {v0}, Lcom/roblox/client/signup/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A3(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->v3()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxBirthdayPicker;->r()V

    .line 3
    iget p1, p0, Lcom/roblox/client/signup/a;->k1:I

    iget v0, p0, Lcom/roblox/client/signup/a;->j1:I

    iget v1, p0, Lcom/roblox/client/signup/a;->i1:I

    invoke-direct {p0, p1, v0, v1}, Lcom/roblox/client/signup/a;->t3(III)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    return-void
.end method

.method public B3(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/m0;->q2()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const-string p1, "signup"

    const-string v0, "submit"

    .line 2
    invoke-static {p1, v0}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->p3()V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/signup/a;->q1:Lcom/roblox/client/signup/a$a0;

    sget-object v0, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    if-eq p1, v0, :cond_2

    return-void

    .line 5
    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/signup/a;->u3()V

    .line 6
    iget-object p1, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$j;->o:Lcom/roblox/client/components/RbxProgressButton$j;

    sget v1, Lcom/roblox/client/c0;->e3:I

    invoke-virtual {p1, v0, v1}, Lcom/roblox/client/components/RbxProgressButton;->y(Lcom/roblox/client/components/RbxProgressButton$j;I)V

    .line 7
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->y3()V

    .line 8
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v4

    .line 10
    new-instance v0, Lcom/roblox/client/signup/a$l;

    move-object v2, v0

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/roblox/client/signup/a$l;-><init>(Lcom/roblox/client/signup/a;Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 p2, 0x3e8

    invoke-virtual {p1, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    sget p3, Lcom/roblox/client/a0;->w:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 2
    sget p3, Lcom/roblox/client/y;->Y:I

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout;

    .line 3
    sget v1, Lcom/roblox/client/a0;->u:I

    invoke-virtual {p1, v1, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 4
    sget v1, Lcom/roblox/client/y;->S:I

    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout;

    .line 5
    sget v1, Lcom/roblox/client/a0;->v:I

    invoke-virtual {p1, v1, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    sget p1, Lcom/roblox/client/y;->P:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const/4 p3, 0x0

    .line 7
    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    sget p1, Lcom/roblox/client/y;->R:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxButton;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    .line 9
    sget p1, Lcom/roblox/client/y;->Z:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/signup/UsernameSignUpEditText;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    .line 10
    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    .line 11
    sget p3, Lcom/roblox/client/y;->G1:I

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->setId(I)V

    .line 12
    iget-object p1, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getBottomLabel()Landroid/widget/TextView;

    move-result-object p1

    sget p3, Lcom/roblox/client/y;->F1:I

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setId(I)V

    .line 13
    sget p1, Lcom/roblox/client/y;->W:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxEditText;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    .line 14
    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    .line 15
    sget p3, Lcom/roblox/client/y;->E1:I

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->setId(I)V

    .line 16
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->getBottomLabel()Landroid/widget/TextView;

    move-result-object p1

    sget p3, Lcom/roblox/client/y;->D1:I

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setId(I)V

    .line 17
    iget-object p1, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    new-instance p3, Lcom/roblox/client/signup/a$o;

    invoke-direct {p3, p0}, Lcom/roblox/client/signup/a$o;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p1, p3}, Lcom/roblox/client/components/RbxEditText;->setRightDrawableClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    sget p1, Lcom/roblox/client/y;->U:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxGenderPicker;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    .line 19
    sget p1, Lcom/roblox/client/y;->Q:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxBirthdayPicker;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    .line 20
    sget p1, Lcom/roblox/client/y;->T:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxLoadingEditText;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    .line 21
    sget p1, Lcom/roblox/client/y;->X:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxProgressButton;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    .line 22
    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RbxProgressButton;->setEnabled(Z)V

    .line 23
    sget p1, Lcom/roblox/client/y;->O:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->U0:Landroid/widget/TextView;

    .line 24
    sget p1, Lcom/roblox/client/y;->V:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxButton;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->V0:Lcom/roblox/client/components/RbxButton;

    .line 25
    sget p1, Lcom/roblox/client/y;->b0:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxTextView;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->W0:Lcom/roblox/client/components/RbxTextView;

    .line 26
    sget p1, Lcom/roblox/client/y;->a0:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/components/RbxTextView;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->X0:Lcom/roblox/client/components/RbxTextView;

    .line 27
    iput-object p2, p0, Lcom/roblox/client/signup/a;->s1:Landroid/view/View;

    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p1

    .line 29
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/c0;->k0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object p3, p0, Lcom/roblox/client/signup/a;->V0:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/c0;->l0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/c0;->q0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->f3:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 33
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->t0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxEditText;->setLongHintText(Ljava/lang/String;)V

    .line 34
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v1, Lcom/roblox/client/c0;->v0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 35
    iget-object p3, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v1, Lcom/roblox/client/c0;->w0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 36
    iget-object p3, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    sget v1, Lcom/roblox/client/c0;->x0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/RelativeLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    iget-object p3, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v1, Lcom/roblox/client/c0;->y0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 38
    iget-object p3, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v1, Lcom/roblox/client/c0;->A0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxEditText;->setLongHintText(Ljava/lang/String;)V

    .line 39
    iget-object p3, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    sget v1, Lcom/roblox/client/c0;->n1:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    .line 40
    iget-object p3, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 41
    iget-object p3, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    sget v1, Lcom/roblox/client/c0;->E1:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxProgressButton;->setText(Ljava/lang/String;)V

    .line 42
    iget-object p3, p0, Lcom/roblox/client/signup/a;->W0:Lcom/roblox/client/components/RbxTextView;

    sget v1, Lcom/roblox/client/c0;->F1:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    invoke-static {}, Lcom/roblox/client/p0;->l0()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 44
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-direct {p3, v1, v0, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 45
    iget-object v1, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    invoke-virtual {v1, p3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    :cond_0
    iget-object p3, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    sget v1, Lcom/roblox/client/c0;->z0:I

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxEditText;->y(Ljava/lang/String;)V

    .line 47
    iget-object p3, p0, Lcom/roblox/client/signup/a;->X0:Lcom/roblox/client/components/RbxTextView;

    const/16 v1, 0x8

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 48
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    const/4 v1, 0x5

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 49
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    new-instance v2, Lcom/roblox/client/signup/a$p;

    invoke-direct {v2, p0}, Lcom/roblox/client/signup/a$p;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 50
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    new-instance v2, Lcom/roblox/client/signup/a$q;

    invoke-direct {v2, p0}, Lcom/roblox/client/signup/a$q;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 51
    iget-object p3, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 52
    iget-object p3, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    new-instance v1, Lcom/roblox/client/signup/a$r;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$r;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 53
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    new-instance v1, Lcom/roblox/client/signup/a$s;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/signup/a$s;-><init>(Lcom/roblox/client/signup/a;Landroid/content/Context;)V

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxEditText;->setRbxFocusChangedListener(Lcom/roblox/client/components/g;)V

    .line 54
    iget-object p3, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    invoke-virtual {p3}, Lcom/roblox/client/components/RbxEditText;->getTextBox()Landroid/widget/EditText;

    move-result-object p3

    const/4 v1, 0x6

    .line 55
    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 56
    new-instance v1, Lcom/roblox/client/signup/a$t;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$t;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 57
    new-instance v1, Lcom/roblox/client/signup/a$u;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$u;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 58
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->I3()V

    .line 59
    iget-object p3, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    new-instance v1, Lcom/roblox/client/signup/a$v;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$v;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxGenderPicker;->setOnGenderButtonPressedListener(Lcom/roblox/client/components/RbxGenderPicker$e;)V

    .line 60
    iget-object p3, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    new-instance v1, Lcom/roblox/client/signup/a$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$a;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxBirthdayPicker;->setRbxDateChangedListener(Lcom/roblox/client/components/f;)V

    .line 61
    iget-object p3, p0, Lcom/roblox/client/signup/a;->V0:Lcom/roblox/client/components/RbxButton;

    new-instance v1, Lcom/roblox/client/signup/a$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$b;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object p3, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    new-instance v1, Lcom/roblox/client/signup/a$c;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$c;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    iget-object p3, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    new-instance v1, Lcom/roblox/client/signup/a$d;

    invoke-direct {v1, p0}, Lcom/roblox/client/signup/a$d;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {p3, v1}, Lcom/roblox/client/components/RbxProgressButton;->setOnRbxClickedListener(Lcom/roblox/client/components/e;)V

    .line 64
    iget-object p3, p0, Lcom/roblox/client/signup/a;->U0:Landroid/widget/TextView;

    invoke-static {p1, p3}, Ld9/b;->a(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 65
    iget-object p3, p0, Lcom/roblox/client/signup/a;->U0:Landroid/widget/TextView;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    const-string p3, "signup"

    .line 66
    invoke-static {p3}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    .line 67
    invoke-direct {p0, p1}, Lcom/roblox/client/signup/a;->C3(Landroid/content/Context;)V

    return-object p2
.end method

.method D3(Ljava/lang/String;Z)V
    .locals 1

    if-eqz p2, :cond_0

    const-string p2, "focus"

    goto :goto_0

    :cond_0
    const-string p2, "offFocus"

    :goto_0
    const-string v0, "signup"

    invoke-static {v0, p1, p2}, Lcom/roblox/client/f0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method E3(Ljava/lang/String;)V
    .locals 2

    const-string v0, "signup"

    const-string v1, "submit"

    invoke-static {v0, p1, v1}, Lcom/roblox/client/f0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public G0()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->G0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    iget-object v1, p0, Lcom/roblox/client/signup/a;->y1:Lcom/roblox/client/signup/a$w;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public H0()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->H0()V

    .line 2
    sget-object v0, Lcom/roblox/client/signup/a;->F1:Lcom/roblox/client/signup/a$x;

    iput-object v0, p0, Lcom/roblox/client/signup/a;->u1:Lcom/roblox/client/signup/a$x;

    .line 3
    iget-object v0, p0, Lcom/roblox/client/signup/a;->x1:Lcom/roblox/client/signup/a$b0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method public K3()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    .line 2
    new-instance v1, Landroidx/appcompat/app/b$a;

    invoke-direct {v1, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    .line 3
    sget v2, Lcom/roblox/client/c0;->t3:I

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->t(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    sget v2, Lcom/roblox/client/c0;->Z1:I

    new-array v4, v3, [Ljava/lang/Object;

    .line 4
    invoke-static {v0, v2, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    sget v2, Lcom/roblox/client/c0;->G2:I

    new-array v4, v3, [Ljava/lang/Object;

    .line 5
    invoke-static {v0, v2, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/roblox/client/signup/a$m;

    invoke-direct {v2, p0}, Lcom/roblox/client/signup/a$m;-><init>(Lcom/roblox/client/signup/a;)V

    invoke-virtual {v1, v0, v2}, Landroidx/appcompat/app/b$a;->q(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public L3()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/roblox/client/signup/a;->T0:Lcom/roblox/client/components/RbxProgressButton;

    sget-object v2, Lcom/roblox/client/components/RbxProgressButton$j;->n:Lcom/roblox/client/components/RbxProgressButton$j;

    sget v3, Lcom/roblox/client/c0;->E1:I

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/roblox/client/components/RbxProgressButton;->z(Lcom/roblox/client/components/RbxProgressButton$j;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/signup/a;->R0:Lcom/roblox/client/signup/UsernameSignUpEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->D()V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->D()V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxGenderPicker;->r()V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxBirthdayPicker;->s()V

    .line 7
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Q0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->c()V

    .line 8
    iget-object v0, p0, Lcom/roblox/client/signup/a;->V0:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxButton;->c()V

    .line 9
    invoke-direct {p0}, Lcom/roblox/client/signup/a;->v3()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->D()V

    :cond_0
    return-void
.end method

.method public W0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->W0()V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    const-string v0, "signup"

    .line 3
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    return-void
.end method

.method public X0()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/m0;->X0()V

    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->t0(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Lcom/roblox/client/signup/e;

    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    invoke-direct {p1, v0}, Lcom/roblox/client/signup/e;-><init>(Lh7/f;)V

    iput-object p1, p0, Lcom/roblox/client/signup/a;->d1:Lcom/roblox/client/signup/e;

    return-void
.end method

.method public u3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a;->Y0:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a;->f1:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a;->S0:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a;->g1:Ljava/lang/String;

    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    .line 2
    instance-of v0, p1, Lcom/roblox/client/signup/a$x;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/roblox/client/signup/a$x;

    iput-object p1, p0, Lcom/roblox/client/signup/a;->u1:Lcom/roblox/client/signup/a$x;

    return-void

    :cond_0
    const-string v0, "signup_window"

    const-string v1, "Parent activity does not implement FragmentSignUp.OnFragmentInteractionListener!"

    .line 4
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
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
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/c;->f2()I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/c;->m2(II)V

    .line 3
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/signup/a;->e1:Lx7/e;

    return-void
.end method
