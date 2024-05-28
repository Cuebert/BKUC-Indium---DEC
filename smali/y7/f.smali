.class public Ly7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/f$e;
    }
.end annotation


# instance fields
.field private a:Landroidx/fragment/app/Fragment;

.field private b:Landroid/view/MenuItem;

.field private c:Landroid/view/Menu;

.field private d:Lcom/roblox/client/components/RobloxToolbar;

.field private e:Ly7/f$e;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly7/f;->a:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method static synthetic a(Ly7/f;)Lcom/roblox/client/components/RobloxToolbar;
    .locals 0

    iget-object p0, p0, Ly7/f;->d:Lcom/roblox/client/components/RobloxToolbar;

    return-object p0
.end method

.method static synthetic b(Ly7/f;)I
    .locals 0

    invoke-direct {p0}, Ly7/f;->i()I

    move-result p0

    return p0
.end method

.method static synthetic c(Ly7/f;)Landroid/view/Menu;
    .locals 0

    iget-object p0, p0, Ly7/f;->c:Landroid/view/Menu;

    return-object p0
.end method

.method static synthetic d(Ly7/f;)Landroid/view/MenuItem;
    .locals 0

    iget-object p0, p0, Ly7/f;->b:Landroid/view/MenuItem;

    return-object p0
.end method

.method static synthetic e(Ly7/f;Landroid/view/Menu;Landroid/view/MenuItem;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly7/f;->m(Landroid/view/Menu;Landroid/view/MenuItem;Z)V

    return-void
.end method

.method static synthetic f(Ly7/f;)Ly7/f$e;
    .locals 0

    iget-object p0, p0, Ly7/f;->e:Ly7/f$e;

    return-object p0
.end method

.method static synthetic g(Ly7/f;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly7/f;->l(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic h(Ly7/f;)Landroidx/fragment/app/Fragment;
    .locals 0

    iget-object p0, p0, Ly7/f;->a:Landroidx/fragment/app/Fragment;

    return-object p0
.end method

.method private i()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/f;->e:Ly7/f$e;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    .line 2
    sget-object v1, Ly7/f$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    sget v0, Lcom/roblox/client/x;->J:I

    return v0

    .line 4
    :cond_0
    sget v0, Lcom/roblox/client/x;->I:I

    return v0

    .line 5
    :cond_1
    sget v0, Lcom/roblox/client/x;->K:I

    return v0
.end method

.method private j()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/f;->e:Ly7/f$e;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    .line 2
    sget-object v1, Ly7/f$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    sget v0, Lcom/roblox/client/x;->V:I

    return v0

    .line 4
    :cond_0
    sget v0, Lcom/roblox/client/x;->U:I

    return v0

    .line 5
    :cond_1
    sget v0, Lcom/roblox/client/x;->W:I

    return v0
.end method

.method private l(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportEvents: searchType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", buttonEvent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SearchMenuOption"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    const-string v1, "nativeMain"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "nativeMain|friends"

    .line 2
    invoke-static {p1, p2}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "catalog"

    .line 3
    invoke-static {v1, p2, p1}, Lcom/roblox/client/f0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, "games"

    .line 4
    invoke-static {v1, p2, p1}, Lcom/roblox/client/f0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string p1, "users"

    .line 5
    invoke-static {v1, p2, p1}, Lcom/roblox/client/f0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private m(Landroid/view/Menu;Landroid/view/MenuItem;Z)V
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-interface {p1, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    if-eq v1, p2, :cond_0

    .line 3
    invoke-interface {v1, p3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private q()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly7/f;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SearchView;

    .line 2
    iget-object v1, p0, Ly7/f;->b:Landroid/view/MenuItem;

    new-instance v2, Ly7/f$a;

    invoke-direct {v2, p0, v0}, Ly7/f$a;-><init>(Ly7/f;Landroidx/appcompat/widget/SearchView;)V

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 3
    sget v1, Ld/f;->J:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const/high16 v2, -0x1000000

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setTextColor(I)V

    const v2, -0x777778

    .line 5
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setHintTextColor(I)V

    .line 6
    invoke-virtual {v1}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "SourceSansPro-Regular.ttf"

    invoke-static {v1, v2, v3}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    sget v2, Ld/f;->I:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 8
    sget v3, Lcom/roblox/client/x;->H:I

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/roblox/client/c0;->B4:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 10
    new-instance v2, Ly7/f$b;

    invoke-direct {v2, p0, v0}, Ly7/f$b;-><init>(Ly7/f;Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$OnQueryTextListener;)V

    .line 11
    new-instance v0, Ly7/f$c;

    invoke-direct {v0, p0}, Ly7/f$c;-><init>(Ly7/f;)V

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method


# virtual methods
.method public k(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    sget v0, Lcom/roblox/client/b0;->c:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 2
    sget p2, Lcom/roblox/client/y;->d:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Ly7/f;->b:Landroid/view/MenuItem;

    .line 3
    iget-object p2, p0, Ly7/f;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p2

    invoke-direct {p0}, Ly7/f;->j()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 4
    invoke-direct {p0}, Ly7/f;->q()V

    .line 5
    iget-object p1, p0, Ly7/f;->b:Landroid/view/MenuItem;

    return-object p1
.end method

.method public n(Landroid/view/Menu;)V
    .locals 0

    iput-object p1, p0, Ly7/f;->c:Landroid/view/Menu;

    return-void
.end method

.method public o(Ly7/f$e;)V
    .locals 0

    iput-object p1, p0, Ly7/f;->e:Ly7/f$e;

    return-void
.end method

.method public p(Lcom/roblox/client/components/RobloxToolbar;)V
    .locals 0

    iput-object p1, p0, Ly7/f;->d:Lcom/roblox/client/components/RobloxToolbar;

    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly7/f;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SearchView;

    .line 2
    iget-object v1, p0, Ly7/f;->e:Ly7/f$e;

    invoke-interface {v1}, Ly7/f$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly7/f;->e:Ly7/f$e;

    invoke-interface {v0}, Ly7/f$e;->b()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 4
    :goto_1
    iget-object v1, p0, Ly7/f;->b:Landroid/view/MenuItem;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 5
    iget-object v1, p0, Ly7/f;->b:Landroid/view/MenuItem;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method
