.class Lcom/roblox/client/game/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/a;->K2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/game/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/game/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/a$b;->n:Lcom/roblox/client/game/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/a$b;->n:Lcom/roblox/client/game/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->g0()Z

    move-result v0

    const-string v1, "AppShellFragment"

    if-nez v0, :cond_0

    const-string v0, "onGlobalLayout() fragment not attached"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/a$b;->n:Lcom/roblox/client/game/a;

    invoke-static {v0}, Lcom/roblox/client/game/a;->C2(Lcom/roblox/client/game/a;)Lg9/a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lg9/a;->e(Z)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/game/a$b;->n:Lcom/roblox/client/game/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Lcom/roblox/client/game/a$b;->n:Lcom/roblox/client/game/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    sget v2, Lcom/roblox/client/y;->f:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 7
    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v3, v4, :cond_3

    :cond_1
    const-string v3, "Resetting surface container\'s layout."

    .line 8
    invoke-static {v1, v3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 10
    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 11
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_2
    const-string v0, "Surface view not found! Cannot reset its layout."

    .line 12
    invoke-static {v1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void
.end method
