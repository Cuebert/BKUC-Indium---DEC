.class public Lo7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/ViewGroup;

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Lf7/f0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lf7/f0;->o:Lf7/f0;

    iput-object v0, p0, Lo7/b;->e:Lf7/f0;

    return-void
.end method

.method static synthetic a(Lo7/b;)Lf7/f0;
    .locals 0

    iget-object p0, p0, Lo7/b;->e:Lf7/f0;

    return-object p0
.end method

.method private d(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 2

    .line 1
    sget v0, Lcom/roblox/client/a0;->A:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 2
    sget v0, Lcom/roblox/client/y;->o0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lo7/b;->a:Landroid/view/ViewGroup;

    .line 3
    sget v0, Lcom/roblox/client/y;->q0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo7/b;->b:Landroid/view/View;

    .line 4
    sget v0, Lcom/roblox/client/y;->p0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo7/b;->c:Landroid/view/View;

    .line 5
    sget v0, Lcom/roblox/client/y;->n0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo7/b;->d:Landroid/view/View;

    return-object p1
.end method

.method private h(Lcom/roblox/client/k0;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object v0

    invoke-virtual {v0}, Lo7/a;->b()Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v1, Lo7/b$a;

    invoke-direct {v1, p0}, Lo7/b$a;-><init>(Lo7/b;)V

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/LiveData;->i(Landroidx/lifecycle/l;Landroidx/lifecycle/s;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b(IIII)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo7/b;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting insets: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.screen"

    invoke-static {v0, p2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object p2, p0, Lo7/b;->a:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    iget v0, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget v3, p2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    if-eq v3, p3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 6
    :goto_1
    iget v4, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    if-eq v4, p4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-nez v0, :cond_4

    if-nez v3, :cond_4

    if-eqz v1, :cond_5

    .line 7
    :cond_4
    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 8
    iput p3, p2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 9
    iput p4, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 10
    iget-object v2, p0, Lo7/b;->a:Landroid/view/ViewGroup;

    invoke-virtual {v2, p2}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    :cond_5
    iget-object p2, p0, Lo7/b;->b:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_6

    .line 12
    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 13
    iget-object p1, p0, Lo7/b;->b:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    :cond_6
    iget-object p1, p0, Lo7/b;->c:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v3, :cond_7

    .line 15
    iput p3, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 16
    iget-object p2, p0, Lo7/b;->c:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    :cond_7
    iget-object p1, p0, Lo7/b;->d:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_8

    .line 18
    iput p4, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 19
    iget-object p2, p0, Lo7/b;->d:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    return-void
.end method

.method public c()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lo7/b;->a:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public e(Landroid/view/LayoutInflater;Landroidx/fragment/app/Fragment;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lo7/b;->d(Landroid/view/LayoutInflater;)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    instance-of v0, p2, Lcom/roblox/client/k0;

    if-eqz v0, :cond_0

    .line 4
    check-cast p2, Lcom/roblox/client/k0;

    invoke-direct {p0, p2}, Lo7/b;->h(Lcom/roblox/client/k0;)V

    :cond_0
    return-object p1
.end method

.method public f(Landroid/view/LayoutInflater;Lcom/roblox/client/k0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lo7/b;->d(Landroid/view/LayoutInflater;)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 2
    invoke-direct {p0, p2}, Lo7/b;->h(Lcom/roblox/client/k0;)V

    :cond_0
    return-object p1
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public i(Lf7/f0;)V
    .locals 0

    iput-object p1, p0, Lo7/b;->e:Lf7/f0;

    return-void
.end method
