.class public Lcom/roblox/client/RBXSurfaceView;
.super Landroid/view/SurfaceView;
.source "SourceFile"


# instance fields
.field private n:Landroid/content/Context;

.field protected o:Lcom/roblox/client/components/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 2
    iput-object p2, p0, Lcom/roblox/client/RBXSurfaceView;->n:Landroid/content/Context;

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/RBXSurfaceView;->a()V

    .line 4
    iput-object p1, p0, Lcom/roblox/client/RBXSurfaceView;->n:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 1
    new-instance v0, Lcom/roblox/client/components/n;

    invoke-direct {v0}, Lcom/roblox/client/components/n;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/RBXSurfaceView;->o:Lcom/roblox/client/components/n;

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/n;->a(I)V

    return-void
.end method

.method public onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/RBXSurfaceView;->o:Lcom/roblox/client/components/n;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/n;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    iget-object p1, p0, Lcom/roblox/client/RBXSurfaceView;->n:Landroid/content/Context;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/SurfaceView;->onSizeChanged(IIII)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceView size has changed: old width "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " new width "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " old height "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " new height "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "RBXSurfaceView"

    invoke-static {p2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
