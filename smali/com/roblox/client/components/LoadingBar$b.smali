.class Lcom/roblox/client/components/LoadingBar$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/LoadingBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field a:Landroid/widget/ImageView;

.field b:Lcom/roblox/client/components/LoadingBar$c;

.field final synthetic c:Lcom/roblox/client/components/LoadingBar;


# direct methods
.method private constructor <init>(Lcom/roblox/client/components/LoadingBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/client/components/LoadingBar$b;->c:Lcom/roblox/client/components/LoadingBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/client/components/LoadingBar;Lcom/roblox/client/components/LoadingBar$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/client/components/LoadingBar$b;-><init>(Lcom/roblox/client/components/LoadingBar;)V

    return-void
.end method


# virtual methods
.method a(Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/LoadingBar$b;->a:Landroid/widget/ImageView;

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/components/LoadingBar$b;->c:Lcom/roblox/client/components/LoadingBar;

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar$b;->b:Lcom/roblox/client/components/LoadingBar$c;

    invoke-static {p1, v0}, Lcom/roblox/client/components/LoadingBar;->a(Lcom/roblox/client/components/LoadingBar;Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar$b;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

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
