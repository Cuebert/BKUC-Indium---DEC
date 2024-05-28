.class Lcom/roblox/client/game/a$a;
.super Lg9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/a;->K2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/roblox/client/game/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/game/a;Landroid/content/Context;Lg9/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/a$a;->e:Lcom/roblox/client/game/a;

    invoke-direct {p0, p2, p3}, Lg9/a;-><init>(Landroid/content/Context;Lg9/a$a;)V

    return-void
.end method


# virtual methods
.method public c()Lg9/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/a$a;->e:Lcom/roblox/client/game/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/roblox/client/game/a$a;->e:Lcom/roblox/client/game/a;

    .line 3
    invoke-static {v1}, Lcom/roblox/client/game/a;->z2(Lcom/roblox/client/game/a;)Landroid/view/SurfaceView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getRootView()Landroid/view/View;

    move-result-object v1

    .line 4
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/game/a$a;->e:Lcom/roblox/client/game/a;

    .line 5
    invoke-static {v2}, Lcom/roblox/client/game/a;->B2(Lcom/roblox/client/game/a;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/game/a$a;->e:Lcom/roblox/client/game/a;

    .line 6
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v3

    check-cast v3, Lcom/roblox/client/i0;

    invoke-virtual {v3}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object v3

    invoke-virtual {v3}, Lo7/a;->c()Landroid/graphics/Rect;

    move-result-object v3

    .line 7
    invoke-static {v1, v0, v2, v3}, Lg9/b;->a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lg9/b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
