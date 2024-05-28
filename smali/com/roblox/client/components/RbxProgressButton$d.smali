.class Lcom/roblox/client/components/RbxProgressButton$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxProgressButton;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/animation/AlphaAnimation;

.field final synthetic b:Lcom/roblox/client/components/RbxProgressButton;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxProgressButton;Landroid/view/animation/AlphaAnimation;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton$d;->b:Lcom/roblox/client/components/RbxProgressButton;

    iput-object p2, p0, Lcom/roblox/client/components/RbxProgressButton$d;->a:Landroid/view/animation/AlphaAnimation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/components/RbxProgressButton$d;->b:Lcom/roblox/client/components/RbxProgressButton;

    invoke-static {p1}, Lcom/roblox/client/components/RbxProgressButton;->f(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/RbxButton;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/components/RbxProgressButton$d;->b:Lcom/roblox/client/components/RbxProgressButton;

    invoke-static {p1}, Lcom/roblox/client/components/RbxProgressButton;->e(Lcom/roblox/client/components/RbxProgressButton;)Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/components/RbxProgressButton$d;->b:Lcom/roblox/client/components/RbxProgressButton;

    invoke-static {p1}, Lcom/roblox/client/components/RbxProgressButton;->e(Lcom/roblox/client/components/RbxProgressButton;)Landroid/widget/LinearLayout;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton$d;->a:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
