.class public Lcom/roblox/client/components/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/view/View;IFFJ)V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 2
    invoke-virtual {v0, p4, p5}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 4
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static b(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const v1, 0x3eb33333    # 0.35f

    const/16 v2, 0xc8

    invoke-static {p0, v0, v1, v2}, Lcom/roblox/client/components/h;->c(Landroid/view/View;FFI)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/view/View;FFI)Landroid/view/animation/AlphaAnimation;
    .locals 3

    .line 1
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    int-to-long v1, p3

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 3
    new-instance p3, Lcom/roblox/client/components/h$a;

    invoke-direct {p3, p0, p1, p2}, Lcom/roblox/client/components/h$a;-><init>(Landroid/view/View;FF)V

    invoke-virtual {v0, p3}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method public static d(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;
    .locals 3

    const v0, 0x3eb33333    # 0.35f

    const/high16 v1, 0x3f800000    # 1.0f

    const/16 v2, 0xc8

    invoke-static {p0, v0, v1, v2}, Lcom/roblox/client/components/h;->c(Landroid/view/View;FFI)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method
