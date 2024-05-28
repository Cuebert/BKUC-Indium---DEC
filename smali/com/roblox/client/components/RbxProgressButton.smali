.class public Lcom/roblox/client/components/RbxProgressButton;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/RbxProgressButton$i;,
        Lcom/roblox/client/components/RbxProgressButton$j;
    }
.end annotation


# instance fields
.field private final A:I

.field private final B:I

.field private final C:I

.field D:Lcom/roblox/client/components/j;

.field private n:Lcom/roblox/client/components/RbxButton;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ProgressBar;

.field private q:Landroid/widget/LinearLayout;

.field private r:Lcom/roblox/client/components/e;

.field private s:Lcom/roblox/client/components/RbxProgressButton$i;

.field private t:Lcom/roblox/client/components/RbxProgressButton$j;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private final x:I

.field private final y:I

.field private final z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    .line 3
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    .line 4
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->p:Landroid/widget/ProgressBar;

    .line 5
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->q:Landroid/widget/LinearLayout;

    .line 6
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->r:Lcom/roblox/client/components/e;

    .line 7
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$i;->n:Lcom/roblox/client/components/RbxProgressButton$i;

    iput-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    .line 8
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->t:Lcom/roblox/client/components/RbxProgressButton$j;

    .line 9
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    .line 10
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->v:Ljava/lang/String;

    .line 11
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    const/16 v0, 0x96

    .line 12
    iput v0, p0, Lcom/roblox/client/components/RbxProgressButton;->x:I

    const/16 v0, 0xc8

    .line 13
    iput v0, p0, Lcom/roblox/client/components/RbxProgressButton;->y:I

    const/16 v0, 0x19

    .line 14
    iput v0, p0, Lcom/roblox/client/components/RbxProgressButton;->z:I

    const/high16 v1, 0xff0000

    .line 15
    iput v1, p0, Lcom/roblox/client/components/RbxProgressButton;->A:I

    .line 16
    iput v0, p0, Lcom/roblox/client/components/RbxProgressButton;->B:I

    .line 17
    iput v1, p0, Lcom/roblox/client/components/RbxProgressButton;->C:I

    .line 18
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->D:Lcom/roblox/client/components/j;

    .line 19
    invoke-direct {p0, p2}, Lcom/roblox/client/components/RbxProgressButton;->t(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/RbxProgressButton$i;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    return-object p0
.end method

.method static synthetic b(Lcom/roblox/client/components/RbxProgressButton;Lcom/roblox/client/components/RbxProgressButton$i;)Lcom/roblox/client/components/RbxProgressButton$i;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    return-object p1
.end method

.method static synthetic c(Lcom/roblox/client/components/RbxProgressButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->w()V

    return-void
.end method

.method static synthetic d(Lcom/roblox/client/components/RbxProgressButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->u()V

    return-void
.end method

.method static synthetic e(Lcom/roblox/client/components/RbxProgressButton;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->q:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic f(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/RbxButton;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    return-object p0
.end method

.method static synthetic g(Lcom/roblox/client/components/RbxProgressButton;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lcom/roblox/client/components/RbxProgressButton;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic i(Lcom/roblox/client/components/RbxProgressButton;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic j(Lcom/roblox/client/components/RbxProgressButton;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic k(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/e;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxProgressButton;->r:Lcom/roblox/client/components/e;

    return-object p0
.end method

.method private l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->p:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$i;->o:Lcom/roblox/client/components/RbxProgressButton$i;

    iput-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    .line 3
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v3, 0xc8

    .line 4
    invoke-virtual {v0, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 5
    new-instance v3, Lcom/roblox/client/components/RbxProgressButton$a;

    invoke-direct {v3, p0}, Lcom/roblox/client/components/RbxProgressButton$a;-><init>(Lcom/roblox/client/components/RbxProgressButton;)V

    invoke-virtual {v0, v3}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 6
    new-instance v3, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v3, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x96

    .line 7
    invoke-virtual {v3, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 8
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 9
    new-instance v1, Lcom/roblox/client/components/RbxProgressButton$b;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/components/RbxProgressButton$b;-><init>(Lcom/roblox/client/components/RbxProgressButton;Landroid/view/animation/AlphaAnimation;)V

    invoke-virtual {v3, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->o:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_1

    .line 11
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$j;->n:Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-direct {p0, v0}, Lcom/roblox/client/components/RbxProgressButton;->v(Lcom/roblox/client/components/RbxProgressButton$j;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private m(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->l()V

    return-void
.end method

.method private n(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->l()V

    return-void
.end method

.method private o(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->p:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    if-nez p1, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->i3:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->s()V

    return-void
.end method

.method private p(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->p:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->s()V

    return-void
.end method

.method private q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->l()V

    return-void
.end method

.method private r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->p:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    iput-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :goto_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->s()V

    return-void
.end method

.method private s()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->n:Lcom/roblox/client/components/RbxProgressButton$i;

    const-wide/16 v2, 0x96

    const-wide/16 v4, 0xc8

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$i;->o:Lcom/roblox/client/components/RbxProgressButton$i;

    iput-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    .line 3
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v7, v6}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 4
    invoke-virtual {v0, v4, v5}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 5
    new-instance v1, Lcom/roblox/client/components/RbxProgressButton$c;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/RbxProgressButton$c;-><init>(Lcom/roblox/client/components/RbxProgressButton;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 6
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v1, v6, v7}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 7
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 8
    iget-object v2, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v2, v1}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    .line 9
    new-instance v2, Lcom/roblox/client/components/RbxProgressButton$d;

    invoke-direct {v2, p0, v0}, Lcom/roblox/client/components/RbxProgressButton$d;-><init>(Lcom/roblox/client/components/RbxProgressButton;Landroid/view/animation/AlphaAnimation;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->p:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_1

    .line 11
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$i;->o:Lcom/roblox/client/components/RbxProgressButton$i;

    iput-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    .line 12
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v7, v6}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 13
    invoke-virtual {v0, v4, v5}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 14
    new-instance v1, Lcom/roblox/client/components/RbxProgressButton$e;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/RbxProgressButton$e;-><init>(Lcom/roblox/client/components/RbxProgressButton;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 15
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v1, v6, v7}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 16
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 17
    iget-object v2, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 18
    new-instance v2, Lcom/roblox/client/components/RbxProgressButton$f;

    invoke-direct {v2, p0, v0}, Lcom/roblox/client/components/RbxProgressButton$f;-><init>(Lcom/roblox/client/components/RbxProgressButton;Landroid/view/animation/AlphaAnimation;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    .line 19
    :cond_1
    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->o:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_2

    .line 20
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->u:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 21
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$j;->o:Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-direct {p0, v0}, Lcom/roblox/client/components/RbxProgressButton;->v(Lcom/roblox/client/components/RbxProgressButton$j;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private t(Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roblox/client/a0;->G:I

    invoke-static {v0, v1, p0}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/e0;->m1:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 3
    sget v1, Lcom/roblox/client/e0;->q1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->v:Ljava/lang/String;

    .line 4
    sget v1, Lcom/roblox/client/e0;->r1:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    .line 5
    iget-object v2, p0, Lcom/roblox/client/components/RbxProgressButton;->v:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    .line 6
    iput-object v2, p0, Lcom/roblox/client/components/RbxProgressButton;->v:Ljava/lang/String;

    :cond_0
    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roblox/client/c0;->h3:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    .line 8
    :cond_1
    sget v1, Lcom/roblox/client/y;->d1:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roblox/client/components/RbxButton;

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    .line 9
    sget v1, Lcom/roblox/client/y;->c1:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    .line 10
    sget v1, Lcom/roblox/client/y;->a1:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->p:Landroid/widget/ProgressBar;

    .line 11
    sget v1, Lcom/roblox/client/y;->b1:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->q:Landroid/widget/LinearLayout;

    .line 12
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    iget-object v2, p0, Lcom/roblox/client/components/RbxProgressButton;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roblox/client/components/RbxProgressButton;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    sget v2, Lcom/roblox/client/e0;->t1:I

    const/high16 v3, 0x41c80000    # 25.0f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 16
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->o:Landroid/widget/TextView;

    sget v2, Lcom/roblox/client/e0;->s1:I

    const/high16 v5, 0xff0000

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 17
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lcom/roblox/client/components/i;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    sget v2, Lcom/roblox/client/e0;->p1:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v1, v4, v2}, Landroid/widget/Button;->setTextSize(IF)V

    .line 19
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    sget v2, Lcom/roblox/client/e0;->o1:I

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 20
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->q:Landroid/widget/LinearLayout;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 22
    new-instance v1, Lcom/roblox/client/components/j;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/components/j;-><init>(Landroid/view/View;Landroid/util/AttributeSet;)V

    iput-object v1, p0, Lcom/roblox/client/components/RbxProgressButton;->D:Lcom/roblox/client/components/j;

    .line 23
    sget p1, Lcom/roblox/client/e0;->u1:I

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/v;->e:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/j;->m(I)V

    .line 24
    iget-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    sget v1, Lcom/roblox/client/e0;->n1:I

    sget v2, Lcom/roblox/client/x;->C:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 26
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->w()V

    .line 27
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->t:Lcom/roblox/client/components/RbxProgressButton$j;

    if-eqz v0, :cond_2

    .line 2
    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$h;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->s()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->l()V

    :goto_0
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->t:Lcom/roblox/client/components/RbxProgressButton$j;

    :cond_2
    return-void
.end method

.method private v(Lcom/roblox/client/components/RbxProgressButton$j;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->t:Lcom/roblox/client/components/RbxProgressButton$j;

    return-void
.end method

.method private w()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    new-instance v1, Lcom/roblox/client/components/RbxProgressButton$g;

    invoke-direct {v1, p0}, Lcom/roblox/client/components/RbxProgressButton$g;-><init>(Lcom/roblox/client/components/RbxProgressButton;)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->D:Lcom/roblox/client/components/j;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/j;->i(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getCurrentState()Lcom/roblox/client/components/RbxProgressButton$i;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->s:Lcom/roblox/client/components/RbxProgressButton$i;

    return-object v0
.end method

.method public getOnRbxClickedListener()Lcom/roblox/client/components/e;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->r:Lcom/roblox/client/components/e;

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->D:Lcom/roblox/client/components/j;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/j;->l(Landroid/view/MotionEvent;)V

    .line 2
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setOnRbxClickedListener(Lcom/roblox/client/components/e;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton;->r:Lcom/roblox/client/components/e;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton;->n:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public x(Lcom/roblox/client/components/RbxProgressButton$j;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$h;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->r()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/components/RbxProgressButton;->q()V

    :goto_0
    return-void
.end method

.method public y(Lcom/roblox/client/components/RbxProgressButton$j;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$h;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p2}, Lcom/roblox/client/components/RbxProgressButton;->o(I)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, p2}, Lcom/roblox/client/components/RbxProgressButton;->m(I)V

    :goto_0
    return-void
.end method

.method public z(Lcom/roblox/client/components/RbxProgressButton$j;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$h;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p2}, Lcom/roblox/client/components/RbxProgressButton;->p(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, p2}, Lcom/roblox/client/components/RbxProgressButton;->n(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
