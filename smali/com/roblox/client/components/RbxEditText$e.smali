.class Lcom/roblox/client/components/RbxEditText$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxEditText;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/components/RbxEditText;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText$e;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$e;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {p1}, Lcom/roblox/client/components/RbxEditText;->g(Lcom/roblox/client/components/RbxEditText;)Landroid/widget/TextView;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$e;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {p1}, Lcom/roblox/client/components/RbxEditText;->h(Lcom/roblox/client/components/RbxEditText;)V

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
