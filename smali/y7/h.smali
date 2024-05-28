.class public Ly7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/f$e;


# instance fields
.field private a:Lcom/roblox/client/t0;

.field private b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private g:Ly8/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/t0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly7/h;->a:Lcom/roblox/client/t0;

    .line 3
    sget v0, Lcom/roblox/client/c0;->y4:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly7/h;->c:Ljava/lang/String;

    .line 4
    iget-object p1, p0, Ly7/h;->a:Lcom/roblox/client/t0;

    sget v0, Lcom/roblox/client/c0;->A4:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly7/h;->d:Ljava/lang/String;

    .line 5
    iget-object p1, p0, Ly7/h;->a:Lcom/roblox/client/t0;

    sget v0, Lcom/roblox/client/c0;->x4:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly7/h;->e:Ljava/lang/String;

    .line 6
    iget-object p1, p0, Ly7/h;->a:Lcom/roblox/client/t0;

    sget v0, Lcom/roblox/client/c0;->z4:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly7/h;->f:Ljava/lang/String;

    .line 7
    new-instance p1, Ly8/g;

    invoke-direct {p1}, Ly8/g;-><init>()V

    iput-object p1, p0, Ly7/h;->g:Ly8/c;

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly7/h;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly7/h;->a:Lcom/roblox/client/t0;

    invoke-virtual {v0}, Lcom/roblox/client/t0;->P2()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly7/h;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Ly7/h;->c:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Ly7/h;->f:Ljava/lang/String;

    return-object v0

    .line 4
    :cond_1
    iget-object v0, p0, Ly7/h;->e:Ljava/lang/String;

    return-object v0

    .line 5
    :cond_2
    iget-object v0, p0, Ly7/h;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 3

    .line 1
    invoke-direct {p0}, Ly7/h;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    const-string v2, "profile"

    .line 2
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "friends"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "users"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "games"

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "catalog"

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x3

    goto :goto_1

    :cond_2
    const-string v2, "groups"

    .line 5
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x5

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x1

    :cond_4
    :goto_1
    return v1
.end method

.method public c()Ly8/f;
    .locals 1

    iget-object v0, p0, Ly7/h;->g:Ly8/c;

    invoke-interface {v0}, Ly8/c;->c()Ly8/f;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroidx/appcompat/widget/SearchView;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, La7/p;

    invoke-virtual {p0}, Ly7/h;->b()I

    move-result v1

    invoke-direct {v0, v1, p2}, La7/p;-><init>(ILjava/lang/String;)V

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    invoke-virtual {p2, v0}, Lbc/c;->j(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView;->onActionViewCollapsed()V

    const/4 p1, 0x1

    return p1
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ly7/h;->b:Ljava/lang/String;

    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
