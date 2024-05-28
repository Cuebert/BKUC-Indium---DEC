.class public Lcom/roblox/client/components/RbxEditText;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/RbxEditText$i;,
        Lcom/roblox/client/components/RbxEditText$j;
    }
.end annotation


# instance fields
.field private A:I

.field private B:F

.field private C:Z

.field D:Z

.field private E:F

.field private final F:Lcom/roblox/client/components/RbxEditText$i;

.field protected n:Landroid/widget/EditText;

.field protected o:Landroid/widget/LinearLayout;

.field protected p:Landroid/widget/LinearLayout;

.field protected q:Z

.field protected r:Lcom/roblox/client/components/RbxEditText$j;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/util/AttributeSet;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Lcom/roblox/client/components/g;

.field private y:Lcom/roblox/client/components/d;

.field private z:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/components/RbxEditText;->q:Z

    .line 4
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    .line 5
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->t:Landroid/util/AttributeSet;

    .line 6
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->u:Ljava/lang/String;

    .line 7
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->v:Ljava/lang/String;

    .line 8
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->w:Ljava/lang/String;

    .line 9
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->x:Lcom/roblox/client/components/g;

    .line 10
    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->y:Lcom/roblox/client/components/d;

    .line 11
    iput v0, p0, Lcom/roblox/client/components/RbxEditText;->A:I

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/roblox/client/components/RbxEditText;->D:Z

    const/high16 p1, 0x41b00000    # 22.0f

    .line 13
    iput p1, p0, Lcom/roblox/client/components/RbxEditText;->E:F

    .line 14
    new-instance p1, Lcom/roblox/client/components/RbxEditText$h;

    invoke-direct {p1, p0}, Lcom/roblox/client/components/RbxEditText$h;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->F:Lcom/roblox/client/components/RbxEditText$i;

    .line 15
    iput-object p2, p0, Lcom/roblox/client/components/RbxEditText;->t:Landroid/util/AttributeSet;

    .line 16
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->p()V

    return-void
.end method

.method private C(Landroid/content/Context;)I
    .locals 1

    invoke-static {p1}, Lc9/g;->a(Landroid/content/Context;)I

    move-result p1

    const/16 v0, 0x168

    if-ge p1, v0, :cond_0

    const/16 p1, 0x12

    return p1

    :cond_0
    const/16 p1, 0x16

    return p1
.end method

.method static synthetic a(Lcom/roblox/client/components/RbxEditText;)Lcom/roblox/client/components/g;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxEditText;->x:Lcom/roblox/client/components/g;

    return-object p0
.end method

.method static synthetic b(Lcom/roblox/client/components/RbxEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/components/RbxEditText;->C:Z

    return p0
.end method

.method static synthetic c(Lcom/roblox/client/components/RbxEditText;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/components/RbxEditText;->C:Z

    return p1
.end method

.method static synthetic d(Lcom/roblox/client/components/RbxEditText;Landroid/content/Context;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/components/RbxEditText;->C(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method static synthetic e(Lcom/roblox/client/components/RbxEditText;)F
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxEditText;->B:F

    return p0
.end method

.method static synthetic f(Lcom/roblox/client/components/RbxEditText;F)F
    .locals 0

    iput p1, p0, Lcom/roblox/client/components/RbxEditText;->B:F

    return p1
.end method

.method static synthetic g(Lcom/roblox/client/components/RbxEditText;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic h(Lcom/roblox/client/components/RbxEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->s()V

    return-void
.end method

.method static synthetic i(Lcom/roblox/client/components/RbxEditText;)Lcom/roblox/client/components/d;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxEditText;->y:Lcom/roblox/client/components/d;

    return-object p0
.end method

.method static synthetic j(Lcom/roblox/client/components/RbxEditText;)Landroid/view/View$OnClickListener;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxEditText;->z:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method private l(IFF)V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 p2, 0xc8

    .line 2
    invoke-virtual {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 3
    iget-object p2, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 4
    iget-object p2, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private m()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v2}, Lcom/roblox/client/components/RbxEditText;->l(IFF)V

    return-void
.end method

.method private p()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roblox/client/a0;->H:I

    invoke-static {v0, v1, p0}, Landroid/widget/LinearLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/roblox/client/y;->P0:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roblox/client/components/RbxEditText;->o:Landroid/widget/LinearLayout;

    .line 3
    sget v0, Lcom/roblox/client/y;->R0:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roblox/client/components/RbxEditText;->p:Landroid/widget/LinearLayout;

    .line 4
    sget v0, Lcom/roblox/client/y;->Q0:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    .line 5
    sget v0, Lcom/roblox/client/y;->O0:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    .line 6
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->t:Landroid/util/AttributeSet;

    sget-object v2, Lcom/roblox/client/e0;->d1:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 7
    sget v1, Lcom/roblox/client/e0;->f1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/components/RbxEditText;->w:Ljava/lang/String;

    .line 8
    sget v1, Lcom/roblox/client/e0;->e1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/components/RbxEditText;->u:Ljava/lang/String;

    .line 9
    sget v1, Lcom/roblox/client/e0;->i1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/components/RbxEditText;->v:Ljava/lang/String;

    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lcom/roblox/client/components/RbxEditText;->q:Z

    .line 11
    sget v1, Lcom/roblox/client/e0;->h1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 12
    invoke-virtual {p0, v1}, Lcom/roblox/client/components/RbxEditText;->setTextBoxInput(Ljava/lang/String;)V

    .line 13
    :cond_0
    sget v1, Lcom/roblox/client/e0;->g1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 14
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/roblox/client/components/RbxEditText;->t:Landroid/util/AttributeSet;

    invoke-static {v2, v3, v4}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/roblox/client/components/RbxEditText;->t:Landroid/util/AttributeSet;

    invoke-static {v2, v3, v4}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/roblox/client/components/RbxEditText;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roblox/client/v;->d:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setHintTextColor(I)V

    .line 18
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setContentDescription(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_1

    .line 19
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 20
    :cond_1
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :goto_0
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/v;->c:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    new-instance v2, Lcom/roblox/client/components/RbxEditText$a;

    invoke-direct {v2, p0}, Lcom/roblox/client/components/RbxEditText$a;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 24
    iget-boolean v1, p0, Lcom/roblox/client/components/RbxEditText;->q:Z

    if-eqz v1, :cond_2

    .line 25
    new-instance v1, Lcom/roblox/client/components/RbxEditText$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/RbxEditText$b;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    iput-object v1, p0, Lcom/roblox/client/components/RbxEditText;->y:Lcom/roblox/client/components/d;

    .line 26
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    new-instance v2, Lcom/roblox/client/components/RbxEditText$c;

    invoke-direct {v2, p0}, Lcom/roblox/client/components/RbxEditText$c;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 27
    :cond_2
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getTextSize()F

    move-result v1

    iput v1, p0, Lcom/roblox/client/components/RbxEditText;->B:F

    .line 28
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    new-instance v2, Lcom/roblox/client/components/RbxEditText$d;

    invoke-direct {v2, p0}, Lcom/roblox/client/components/RbxEditText$d;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 29
    new-instance v1, Lcom/roblox/client/components/RbxEditText$j;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/roblox/client/components/RbxEditText;->F:Lcom/roblox/client/components/RbxEditText$i;

    const/4 v9, 0x0

    move-object v3, v1

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Lcom/roblox/client/components/RbxEditText$j;-><init>(Lcom/roblox/client/components/RbxEditText;Landroid/view/View$OnTouchListener;Lcom/roblox/client/components/RbxEditText$i;Lcom/roblox/client/components/RbxEditText$i;Lcom/roblox/client/components/RbxEditText$i;Lcom/roblox/client/components/RbxEditText$i;)V

    iput-object v1, p0, Lcom/roblox/client/components/RbxEditText;->r:Lcom/roblox/client/components/RbxEditText$j;

    .line 30
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 31
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    sget v1, Lcom/roblox/client/x;->w:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 2
    sget v0, Lcom/roblox/client/p0;->q:I

    const/16 v1, 0x78

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    iget v1, p0, Lcom/roblox/client/components/RbxEditText;->E:F

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextSize(F)V

    :cond_0
    return-void
.end method

.method private u()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roblox/client/v;->i:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->m()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    const/16 v1, 0xb

    const/16 v2, 0x64

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/core/widget/i;->h(Landroid/widget/TextView;IIII)V

    .line 6
    sget v0, Lcom/roblox/client/p0;->q:I

    const/16 v1, 0x78

    if-ne v0, v1, :cond_1

    .line 7
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    sget v1, Lcom/roblox/client/x;->x:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    return-void
.end method

.method private x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roblox/client/v;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->m()V

    .line 5
    :cond_0
    sget v0, Lcom/roblox/client/p0;->q:I

    const/16 v1, 0x78

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->s()V

    return-void
.end method

.method private z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getTextSize()F

    move-result v0

    iput v0, p0, Lcom/roblox/client/components/RbxEditText;->E:F

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roblox/client/v;->f:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->m()V

    .line 6
    :cond_0
    sget v0, Lcom/roblox/client/p0;->q:I

    const/16 v1, 0x78

    if-ne v0, v1, :cond_2

    .line 7
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextSize(F)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :cond_2
    :goto_0
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getId()I

    move-result v0

    sget v1, Lcom/roblox/client/y;->Z:I

    if-ne v0, v1, :cond_3

    .line 10
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    sget v1, Lcom/roblox/client/x;->w:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    goto :goto_1

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    sget v1, Lcom/roblox/client/x;->y:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RbxEditText;->B(Ljava/lang/String;)V

    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->z()V

    return-void
.end method

.method public D()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/components/h;->d(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->r:Lcom/roblox/client/components/RbxEditText$j;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    return-void
.end method

.method public getBottomContainer()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->o:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public getBottomLabel()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    return-object v0
.end method

.method public getRbxFocusChangedListener()Lcom/roblox/client/components/g;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->x:Lcom/roblox/client/components/g;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTextBox()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    return-object v0
.end method

.method public getTopContainer()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->p:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method k(Ljava/lang/String;Landroid/graphics/Paint;F)I
    .locals 4

    const/high16 v0, 0x42c80000    # 100.0f

    const/high16 v1, 0x41400000    # 12.0f

    :goto_0
    sub-float v2, v0, v1

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1

    add-float v2, v0, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 1
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    cmpl-float v3, v3, p3

    if-ltz v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    float-to-int p1, v1

    return p1
.end method

.method protected n(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Landroidx/core/content/a;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method protected o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RbxEditText;->setRightIcon(I)V

    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/widget/LinearLayout;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    :cond_0
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/components/h;->b(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    new-instance v0, Lcom/roblox/client/components/RbxEditText$g;

    invoke-direct {v0, p0}, Lcom/roblox/client/components/RbxEditText$g;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    .line 4
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    return-void
.end method

.method public r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->s()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0xfa

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 5
    new-instance v1, Lcom/roblox/client/components/RbxEditText$e;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/RbxEditText$e;-><init>(Lcom/roblox/client/components/RbxEditText;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 6
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public setHintText(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V

    return-void
.end method

.method public setHintText(Ljava/lang/String;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    new-instance v1, Lcom/roblox/client/components/RbxEditText$f;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/components/RbxEditText$f;-><init>(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->post(Ljava/lang/Runnable;)Z

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLongHintText(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setLongHintText(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->r:Lcom/roblox/client/components/RbxEditText$j;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxEditText$j;->a(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public setRbxFocusChangedListener(Lcom/roblox/client/components/g;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->x:Lcom/roblox/client/components/g;

    return-void
.end method

.method public setRightDrawableClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText;->z:Landroid/view/View$OnClickListener;

    return-void
.end method

.method protected setRightIcon(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/roblox/client/components/RbxEditText;->A:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/roblox/client/components/RbxEditText;->A:I

    .line 3
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/components/RbxEditText;->n(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1, v1}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected setTextBoxInput(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "password"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "textNoSuggestions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "email"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "date"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "uri"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_6
    const-string v0, "number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 2
    :pswitch_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_1

    .line 3
    :pswitch_1
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const v0, 0x80001

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_1

    .line 4
    :pswitch_2
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_1

    .line 5
    :pswitch_3
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/16 v0, 0x21

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_1

    .line 6
    :pswitch_4
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/16 v0, 0x14

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_1

    .line 7
    :pswitch_5
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_1

    .line 8
    :pswitch_6
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p1, v2}, Landroid/widget/EditText;->setInputType(I)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3da724b7 -> :sswitch_6
        0x1c56c -> :sswitch_5
        0x2eefae -> :sswitch_4
        0x5c24b9c -> :sswitch_3
        0x65b3d6e -> :sswitch_2
        0xd501a41 -> :sswitch_1
        0x4889ba9b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setTextBoxText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText;->r:Lcom/roblox/client/components/RbxEditText$j;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2
    sget v0, Lcom/roblox/client/x;->d:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RbxEditText;->setRightIcon(I)V

    return-void
.end method

.method public v(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RbxEditText;->w(Ljava/lang/String;)V

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->u()V

    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText;->s:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxEditText;->x()V

    return-void
.end method
