.class public Ly7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/c$b;
    }
.end annotation


# instance fields
.field private a:Lcom/roblox/client/m0;


# direct methods
.method public constructor <init>(Lcom/roblox/client/m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly7/c;->a:Lcom/roblox/client/m0;

    return-void
.end method

.method static synthetic a(Ly7/c;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Ly7/c;->b(Landroid/app/Activity;)V

    return-void
.end method

.method private b(Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    sget-object v1, Lx7/b$f;->n:Lx7/b$f;

    invoke-virtual {v0, p1, v1}, Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public c(Landroidx/lifecycle/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly7/c;->a:Lcom/roblox/client/m0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "logout"

    .line 2
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Ly7/c;->a:Lcom/roblox/client/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/roblox/client/q;

    invoke-direct {v1}, Lcom/roblox/client/q;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 5
    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/c;->m2(II)V

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 7
    :cond_1
    new-instance p1, Ly7/c$a;

    invoke-direct {p1, p0, v0}, Ly7/c$a;-><init>(Ly7/c;Landroidx/fragment/app/d;)V

    invoke-virtual {v1, p1}, Lcom/roblox/client/q;->A2(Lcom/roblox/client/q$d;)V

    .line 8
    invoke-virtual {v0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "dialog"

    invoke-virtual {v1, p1, v0}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
