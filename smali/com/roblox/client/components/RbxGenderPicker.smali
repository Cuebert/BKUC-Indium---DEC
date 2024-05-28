.class public Lcom/roblox/client/components/RbxGenderPicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/RbxGenderPicker$SavedState;,
        Lcom/roblox/client/components/RbxGenderPicker$e;
    }
.end annotation


# instance fields
.field private n:Lcom/roblox/client/components/RbxButton;

.field private o:Lcom/roblox/client/components/RbxButton;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Lcom/roblox/client/components/RbxTextView;

.field private v:I

.field private w:I

.field private x:I

.field private y:Lcom/roblox/client/components/RbxGenderPicker$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    .line 3
    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    .line 4
    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->p:Landroid/widget/ImageView;

    .line 5
    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->q:Landroid/widget/ImageView;

    .line 6
    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->r:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->v:I

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/components/RbxGenderPicker;->m(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/components/RbxGenderPicker;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxGenderPicker;->o()V

    return-void
.end method

.method static synthetic b(Lcom/roblox/client/components/RbxGenderPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->v:I

    return p0
.end method

.method static synthetic c(Lcom/roblox/client/components/RbxGenderPicker;)Lcom/roblox/client/components/RbxButton;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    return-object p0
.end method

.method static synthetic d(Lcom/roblox/client/components/RbxGenderPicker;I)I
    .locals 0

    iput p1, p0, Lcom/roblox/client/components/RbxGenderPicker;->v:I

    return p1
.end method

.method static synthetic e(Lcom/roblox/client/components/RbxGenderPicker;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->p:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic f(Lcom/roblox/client/components/RbxGenderPicker;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->q:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic g(Lcom/roblox/client/components/RbxGenderPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->x:I

    return p0
.end method

.method static synthetic h(Lcom/roblox/client/components/RbxGenderPicker;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->s:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic i(Lcom/roblox/client/components/RbxGenderPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->w:I

    return p0
.end method

.method static synthetic j(Lcom/roblox/client/components/RbxGenderPicker;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->t:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic k(Lcom/roblox/client/components/RbxGenderPicker;)Lcom/roblox/client/components/RbxGenderPicker$e;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->y:Lcom/roblox/client/components/RbxGenderPicker$e;

    return-object p0
.end method

.method static synthetic l(Lcom/roblox/client/components/RbxGenderPicker;)Lcom/roblox/client/components/RbxButton;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    return-object p0
.end method

.method private m(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roblox/client/a0;->K:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getRootView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/roblox/client/y;->Y0:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->s:Landroid/widget/TextView;

    .line 3
    sget v0, Lcom/roblox/client/y;->V0:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->t:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/roblox/client/v;->e:I

    invoke-static {p1, v0}, Landroidx/core/content/a;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->w:I

    .line 5
    sget v0, Lcom/roblox/client/v;->a:I

    invoke-static {p1, v0}, Landroidx/core/content/a;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->x:I

    .line 6
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->s:Landroid/widget/TextView;

    invoke-static {v0, p1, p2}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->t:Landroid/widget/TextView;

    invoke-static {v0, p1, p2}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    sget p2, Lcom/roblox/client/y;->W0:I

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/roblox/client/components/RbxButton;

    iput-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    .line 9
    sget p2, Lcom/roblox/client/y;->T0:I

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/roblox/client/components/RbxButton;

    iput-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    .line 10
    sget p2, Lcom/roblox/client/y;->X0:I

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->p:Landroid/widget/ImageView;

    .line 11
    sget p2, Lcom/roblox/client/y;->U0:I

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->q:Landroid/widget/ImageView;

    .line 12
    sget p2, Lcom/roblox/client/y;->Z0:I

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->r:Landroid/widget/LinearLayout;

    .line 13
    sget p2, Lcom/roblox/client/y;->S0:I

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/roblox/client/components/RbxTextView;

    iput-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->u:Lcom/roblox/client/components/RbxTextView;

    .line 14
    iget-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    sget v0, Lcom/roblox/client/c0;->r0:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 15
    iget-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    sget v0, Lcom/roblox/client/c0;->s0:I

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 16
    iget-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->t:Landroid/widget/TextView;

    sget v0, Lcom/roblox/client/c0;->p1:I

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->u:Lcom/roblox/client/components/RbxTextView;

    sget v0, Lcom/roblox/client/c0;->q1:I

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object p2, p0, Lcom/roblox/client/components/RbxGenderPicker;->s:Landroid/widget/TextView;

    sget v0, Lcom/roblox/client/c0;->r1:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    new-instance p1, Lcom/roblox/client/components/RbxGenderPicker$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/components/RbxGenderPicker$a;-><init>(Lcom/roblox/client/components/RbxGenderPicker;)V

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object p1, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    new-instance p2, Lcom/roblox/client/components/RbxGenderPicker$b;

    invoke-direct {p2, p0}, Lcom/roblox/client/components/RbxGenderPicker$b;-><init>(Lcom/roblox/client/components/RbxGenderPicker;)V

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object p1, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    new-instance p2, Lcom/roblox/client/components/RbxGenderPicker$c;

    invoke-direct {p2, p0}, Lcom/roblox/client/components/RbxGenderPicker$c;-><init>(Lcom/roblox/client/components/RbxGenderPicker;)V

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private o()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->v:I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->q:Landroid/widget/ImageView;

    sget v1, Lcom/roblox/client/x;->n:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->p:Landroid/widget/ImageView;

    sget v1, Lcom/roblox/client/x;->p:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->r:Landroid/widget/LinearLayout;

    sget v1, Lcom/roblox/client/x;->z:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->s:Landroid/widget/TextView;

    iget v1, p0, Lcom/roblox/client/components/RbxGenderPicker;->w:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->t:Landroid/widget/TextView;

    iget v1, p0, Lcom/roblox/client/components/RbxGenderPicker;->w:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method public getOnGenderButtonPressedListener()Lcom/roblox/client/components/RbxGenderPicker$e;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->y:Lcom/roblox/client/components/RbxGenderPicker$e;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->v:I

    return v0
.end method

.method public n()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/components/h;->b(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    new-instance v0, Lcom/roblox/client/components/RbxGenderPicker$d;

    invoke-direct {v0, p0}, Lcom/roblox/client/components/RbxGenderPicker$d;-><init>(Lcom/roblox/client/components/RbxGenderPicker;)V

    .line 4
    iget-object v1, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 5
    iget-object v1, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3
    :cond_0
    check-cast p1, Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    .line 4
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 5
    iget p1, p1, Lcom/roblox/client/components/RbxGenderPicker$SavedState;->n:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RbxGenderPicker;->setValue(I)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    invoke-direct {v1, v0}, Lcom/roblox/client/components/RbxGenderPicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3
    iget v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->v:I

    iput v0, v1, Lcom/roblox/client/components/RbxGenderPicker$SavedState;->n:I

    return-object v1
.end method

.method public p()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->r:Landroid/widget/LinearLayout;

    sget v1, Lcom/roblox/client/x;->A:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->u:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/roblox/client/components/RbxGenderPicker;->u:Lcom/roblox/client/components/RbxTextView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const-wide/16 v5, 0xc8

    invoke-static/range {v1 .. v6}, Lcom/roblox/client/components/h;->a(Landroid/view/View;IFFJ)V

    :cond_0
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->r:Landroid/widget/LinearLayout;

    sget v1, Lcom/roblox/client/x;->B:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->u:Lcom/roblox/client/components/RbxTextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/components/h;->d(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public setOnGenderButtonPressedListener(Lcom/roblox/client/components/RbxGenderPicker$e;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxGenderPicker;->y:Lcom/roblox/client/components/RbxGenderPicker$e;

    return-void
.end method

.method public setValue(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxGenderPicker;->o:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {p1}, Landroid/widget/Button;->callOnClick()Z

    goto :goto_0

    .line 2
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/components/RbxGenderPicker;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {p1}, Landroid/widget/Button;->callOnClick()Z

    :goto_0
    return-void
.end method
