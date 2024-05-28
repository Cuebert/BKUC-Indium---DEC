.class public Lf7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/w$a;
    }
.end annotation


# instance fields
.field private n:Lf7/c0;

.field private final o:Ljava/lang/String;

.field private p:Landroid/widget/FrameLayout;

.field private q:J

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:Landroid/view/SurfaceView;

.field private u:Landroid/widget/FrameLayout;

.field private v:I

.field public w:Le8/d;

.field private x:Ljava/util/concurrent/ExecutorService;

.field private y:Lf7/g0;

.field private z:Lf7/n;


# direct methods
.method public constructor <init>(Lf7/n;Lf7/c0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.game"

    .line 2
    iput-object v0, p0, Lf7/w;->o:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lf7/w;->q:J

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lf7/w;->r:Ljava/lang/String;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lf7/w;->s:Z

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lf7/w;->v:I

    .line 7
    iput-object p1, p0, Lf7/w;->z:Lf7/n;

    .line 8
    iput-object p1, p0, Lf7/w;->y:Lf7/g0;

    .line 9
    iput-object p2, p0, Lf7/w;->n:Lf7/c0;

    return-void
.end method

.method private B(Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Lf7/w;->p()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lf7/v;

    invoke-direct {v1, p1}, Lf7/v;-><init>(Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private C(Lf7/c0;)V
    .locals 5

    const-string v0, "rbx.game"

    const-string v1, "startGame"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/roblox/engine/jni/model/a;

    invoke-direct {p0}, Lf7/w;->q()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roblox/engine/jni/model/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;)V

    .line 4
    invoke-static {}, Lcom/roblox/client/p0;->o0()Z

    move-result v2

    iput-boolean v2, v1, Lcom/roblox/engine/jni/model/a;->isTablet:Z

    .line 5
    iget-object v2, p0, Lf7/w;->y:Lf7/g0;

    iget-wide v3, p1, Lf7/c0;->c:J

    invoke-interface {v2, v3, v4}, Lf7/g0;->i(J)V

    .line 6
    invoke-static {}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->builder()Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v2

    .line 7
    invoke-virtual {v2, v0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->s(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->p(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->f(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lf7/c0;->c:J

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->o(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lf7/c0;->b:J

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->t(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->d:Ljava/lang/String;

    .line 12
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->e:Ljava/lang/String;

    .line 13
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->n(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->f:Ljava/lang/String;

    .line 14
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->g(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 15
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    invoke-virtual {v1}, Lb9/c;->m()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->h(Z)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 16
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    invoke-virtual {v1}, Lb9/c;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->u(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lf7/c0;->g:J

    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->e(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->h:Ljava/lang/String;

    .line 18
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->r(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->i:Ljava/lang/String;

    .line 19
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget v1, p1, Lf7/c0;->a:I

    .line 20
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->l(I)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->j:Ljava/lang/String;

    .line 21
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->q(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->k:Ljava/lang/String;

    .line 22
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->m(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->l:Ljava/lang/String;

    .line 23
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->m:Ljava/lang/String;

    .line 24
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->k(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lf7/c0;->n:Ljava/lang/String;

    .line 25
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->i(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 26
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 27
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->v(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    .line 28
    :cond_0
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v1

    new-instance v2, Lf7/q;

    invoke-direct {v2, p0}, Lf7/q;-><init>(Lf7/w;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 29
    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->b()Lcom/roblox/engine/jni/autovalue/StartGameParams;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2StartGameWithParam(Lcom/roblox/engine/jni/autovalue/StartGameParams;)I

    .line 30
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    new-instance v1, Lf7/r;

    invoke-direct {v1, p0}, Lf7/r;-><init>(Lf7/w;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 31
    iget-object v0, p0, Lf7/w;->y:Lf7/g0;

    iget-wide v1, p1, Lf7/c0;->c:J

    invoke-interface {v0, v1, v2}, Lf7/g0;->e(J)V

    return-void
.end method

.method private E()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopDataModel: dataModel = GAME, surfaceState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf7/w;->v:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsStarted = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lf7/w;->s:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lf7/w;->v:I

    return-void
.end method

.method private F()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surfaceDestroyed: surfaceState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf7/w;->v:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsStarted = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lf7/w;->s:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p0, Lf7/w;->v:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lf7/w;->s:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lf7/w;->s:Z

    .line 5
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2PauseGame()V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "surfaceDestroyed() activity finishing ignore task scheduler"

    .line 8
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object v0, p0, Lf7/w;->z:Lf7/n;

    invoke-virtual {v0}, Lf7/n;->S()V

    :cond_2
    return-void
.end method

.method private G()V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateSurface() surfaceState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf7/w;->v:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget v0, p0, Lf7/w;->v:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-nez v0, :cond_1

    .line 5
    iput v3, p0, Lf7/w;->v:I

    .line 6
    iput-boolean v2, p0, Lf7/w;->s:Z

    .line 7
    iget-object v0, p0, Lf7/w;->n:Lf7/c0;

    invoke-direct {p0, v0}, Lf7/w;->C(Lf7/c0;)V

    goto :goto_0

    :cond_1
    if-ne v0, v3, :cond_5

    .line 8
    iget-object v0, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    .line 9
    iget-boolean v3, p0, Lf7/w;->s:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    const-string v2, "updateSurface: nativeUpdateGraphics"

    .line 10
    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    invoke-virtual {p0}, Lf7/w;->n()F

    move-result v1

    .line 12
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v4

    .line 13
    :cond_2
    invoke-static {v0, v1, v4}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UpdateSurfaceGameNew(Landroid/view/Surface;FLandroid/app/Activity;)V

    goto :goto_0

    :cond_3
    const-string v3, "updateSurface: nativeStartUpGraphics"

    .line 14
    invoke-static {v1, v3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    iput-boolean v2, p0, Lf7/w;->s:Z

    .line 16
    invoke-virtual {p0}, Lf7/w;->n()F

    move-result v1

    .line 17
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v4

    :cond_4
    invoke-static {v0, v1, v4}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2ResumeGameNew(Landroid/view/Surface;FLandroid/app/Activity;)V

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const-string v0, "updateSurface() activity finishing ignore update"

    .line 18
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic a(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->x()V

    return-void
.end method

.method public static synthetic b(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->z()V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lf7/w;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic d(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->v()V

    return-void
.end method

.method public static synthetic e(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->w()V

    return-void
.end method

.method public static synthetic f(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->t()V

    return-void
.end method

.method public static synthetic g(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->G()V

    return-void
.end method

.method public static synthetic h(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;->y()V

    return-void
.end method

.method static synthetic i(Lf7/w;)Landroid/view/SurfaceView;
    .locals 0

    iget-object p0, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    return-object p0
.end method

.method private j()V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SM-T230NU"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x3c0

    const/16 v1, 0x258

    .line 2
    iget-object v2, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {v2}, Landroid/view/SurfaceView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const/16 v3, 0x500

    .line 3
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/16 v3, 0x320

    .line 4
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 5
    iget-object v3, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {v3, v2}, Landroid/view/SurfaceView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    iget-object v2, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    :cond_0
    return-void
.end method

.method private p()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/w;->x:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lf7/w;->x:Ljava/util/concurrent/ExecutorService;

    .line 3
    :cond_0
    iget-object v0, p0, Lf7/w;->x:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private q()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 3

    .line 1
    invoke-static {}, Lf9/g;->g()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object v0

    invoke-virtual {p0}, Lf7/w;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf9/g;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPlatformParams: assetFolderPath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.game"

    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v1, Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-direct {v1}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    .line 6
    iput-object v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    .line 7
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.touchscreen"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isTouchDevice:Z

    .line 8
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.type.pc"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isMouseDevice:Z

    .line 9
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isKeyboardDevice:Z

    .line 10
    invoke-virtual {p0}, Lf7/w;->n()F

    move-result v0

    iput v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    return-object v1
.end method

.method private s(Landroid/view/View;)V
    .locals 1

    const-string p1, "rbx.game"

    const-string v0, "initSurfaceView: ..."

    .line 1
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object p1

    sget v0, Lcom/roblox/client/y;->k1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setFocusable(Z)V

    .line 4
    iget-object p1, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setFocusableInTouchMode(Z)V

    .line 5
    iget-object p1, p0, Lf7/w;->t:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 6
    invoke-virtual {p0}, Lf7/w;->o()Lf7/n;

    move-result-object p1

    invoke-virtual {p1}, Lf7/n;->I()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lf7/w;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0, v0, v0}, Lf7/w;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    :cond_0
    return-void
.end method

.method private synthetic t()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf7/w;->E()V

    .line 2
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2LeaveGame()V

    return-void
.end method

.method private static synthetic u(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private synthetic v()V
    .locals 2

    iget-object v0, p0, Lf7/w;->p:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method private synthetic w()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/k0;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf7/w;->p:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private synthetic x()V
    .locals 0

    invoke-direct {p0}, Lf7/w;->E()V

    return-void
.end method

.method private synthetic y()V
    .locals 1

    iget-object v0, p0, Lf7/w;->z:Lf7/n;

    invoke-virtual {v0}, Lf7/n;->R()V

    return-void
.end method

.method private synthetic z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lf7/w;->F()V

    return-void
.end method


# virtual methods
.method public A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onCreateView: savedInstanceState = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", surfaceState = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lf7/w;->v:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.game"

    invoke-static {p2, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lw8/d;->h()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "onCreateView: No Settings with non-null savedInstanceState. No need to create view."

    .line 3
    invoke-static {p2, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lf7/w;->y:Lf7/g0;

    invoke-interface {p1}, Lf7/g0;->g()V

    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lf7/w;->m()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object p1

    iput-object p1, p0, Lf7/w;->w:Le8/d;

    .line 6
    invoke-virtual {p0}, Lf7/w;->r()Lcom/roblox/client/i0;

    move-result-object p1

    sget v1, Lcom/roblox/client/y;->f:I

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lf7/w;->u:Landroid/widget/FrameLayout;

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->i0()Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p3, :cond_1

    iget p1, p0, Lf7/w;->v:I

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    const-string p1, "onCreateView: The game is being recreated. Keep the current surface state."

    .line 8
    invoke-static {p2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lf7/w;->v:I

    .line 10
    :goto_0
    iget-object p1, p0, Lf7/w;->u:Landroid/widget/FrameLayout;

    sget p2, Lcom/roblox/client/y;->y0:I

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lf7/w;->p:Landroid/widget/FrameLayout;

    .line 11
    invoke-direct {p0, v0}, Lf7/w;->s(Landroid/view/View;)V

    .line 12
    new-instance p1, Lf7/w$a;

    iget-object p2, p0, Lf7/w;->n:Lf7/c0;

    iget-wide p2, p2, Lf7/c0;->c:J

    invoke-direct {p1, p0, p2, p3}, Lf7/w$a;-><init>(Lf7/w;J)V

    invoke-static {p1}, Lz6/a;->b(Lz6/a$a;)Lcom/roblox/client/components/k;

    move-result-object p1

    invoke-interface {p1}, Lcom/roblox/client/components/k;->a()V

    return-object v0
.end method

.method public D()V
    .locals 1

    new-instance v0, Lf7/o;

    invoke-direct {v0, p0}, Lf7/o;-><init>(Lf7/w;)V

    invoke-direct {p0, v0}, Lf7/w;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public k()V
    .locals 1

    new-instance v0, Lf7/s;

    invoke-direct {v0, p0}, Lf7/s;-><init>(Lf7/w;)V

    invoke-direct {p0, v0}, Lf7/w;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public l()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lf7/w;->u:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public m()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lf7/w;->o()Lf7/n;

    move-result-object v0

    invoke-virtual {v0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public n()F
    .locals 1

    invoke-virtual {p0}, Lf7/w;->o()Lf7/n;

    move-result-object v0

    invoke-virtual {v0}, Lf7/n;->E()F

    move-result v0

    return v0
.end method

.method public o()Lf7/n;
    .locals 1

    iget-object v0, p0, Lf7/w;->z:Lf7/n;

    return-object v0
.end method

.method public r()Lcom/roblox/client/i0;
    .locals 1

    iget-object v0, p0, Lf7/w;->z:Lf7/n;

    invoke-virtual {v0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/i0;

    return-object v0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p1, "rbx.game"

    const-string p2, "surfaceChanged: ..."

    .line 1
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lf7/w;->j()V

    .line 3
    new-instance p1, Lf7/t;

    invoke-direct {p1, p0}, Lf7/t;-><init>(Lf7/w;)V

    invoke-direct {p0, p1}, Lf7/w;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "rbx.game"

    const-string v0, "surfaceCreated: ..."

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance p1, Lf7/u;

    invoke-direct {p1, p0}, Lf7/u;-><init>(Lf7/w;)V

    invoke-direct {p0, p1}, Lf7/w;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lf7/w;->x:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lf7/p;

    invoke-direct {v0, p0}, Lf7/p;-><init>(Lf7/w;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "rbx.game"

    const-string v0, "game thread times out"

    .line 3
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
