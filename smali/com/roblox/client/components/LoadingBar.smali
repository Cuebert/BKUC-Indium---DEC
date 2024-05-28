.class public Lcom/roblox/client/components/LoadingBar;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/LoadingBar$c;,
        Lcom/roblox/client/components/LoadingBar$b;
    }
.end annotation


# instance fields
.field private final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/roblox/client/components/LoadingBar;->n:Ljava/util/ArrayList;

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/components/LoadingBar;->e()V

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/components/LoadingBar;Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/components/LoadingBar;->d(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/roblox/client/components/LoadingBar;Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/components/LoadingBar;->c(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method

.method private c(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 3

    .line 1
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x320

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 3
    invoke-virtual {v0, p1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method private d(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 3

    .line 1
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x320

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 3
    invoke-virtual {v0, p1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roblox/client/a0;->B:I

    invoke-static {v0, v1, p0}, Landroid/widget/LinearLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->n:Ljava/util/ArrayList;

    sget v1, Lcom/roblox/client/y;->v:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->n:Ljava/util/ArrayList;

    sget v1, Lcom/roblox/client/y;->w:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->n:Ljava/util/ArrayList;

    sget v1, Lcom/roblox/client/y;->x:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private f()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    iget-object v2, p0, Lcom/roblox/client/components/LoadingBar;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 3
    new-instance v3, Lcom/roblox/client/components/LoadingBar$c;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/roblox/client/components/LoadingBar$c;-><init>(Lcom/roblox/client/components/LoadingBar;Lcom/roblox/client/components/LoadingBar$a;)V

    .line 4
    new-instance v5, Lcom/roblox/client/components/LoadingBar$b;

    invoke-direct {v5, p0, v4}, Lcom/roblox/client/components/LoadingBar$b;-><init>(Lcom/roblox/client/components/LoadingBar;Lcom/roblox/client/components/LoadingBar$a;)V

    .line 5
    invoke-virtual {v5, v2}, Lcom/roblox/client/components/LoadingBar$b;->a(Landroid/widget/ImageView;)V

    .line 6
    iput-object v3, v5, Lcom/roblox/client/components/LoadingBar$b;->b:Lcom/roblox/client/components/LoadingBar$c;

    .line 7
    iput-object v5, v3, Lcom/roblox/client/components/LoadingBar$c;->b:Lcom/roblox/client/components/LoadingBar$b;

    .line 8
    invoke-virtual {v3, v2}, Lcom/roblox/client/components/LoadingBar$c;->a(Landroid/widget/ImageView;)V

    .line 9
    invoke-direct {p0, v3}, Lcom/roblox/client/components/LoadingBar;->d(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object v3

    mul-int/lit16 v4, v1, 0x190

    int-to-long v4, v4

    .line 10
    invoke-virtual {v3, v4, v5}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    .line 11
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    if-nez p1, :cond_0

    .line 2
    iget-boolean p1, p0, Lcom/roblox/client/components/LoadingBar;->o:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/roblox/client/components/LoadingBar;->o:Z

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/components/LoadingBar;->f()V

    :cond_0
    return-void
.end method
