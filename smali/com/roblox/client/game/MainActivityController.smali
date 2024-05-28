.class public Lcom/roblox/client/game/MainActivityController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/j;
.implements Lcom/roblox/client/game/a$f;
.implements Lf9/b$e;
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field public n:Lf7/f0;

.field private final o:Ljava/lang/String;

.field private p:Lq6/a;

.field private q:Ljava/lang/Boolean;

.field private final r:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/client/i0;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Lf9/b;

.field private final t:Landroid/view/SurfaceView;

.field private final u:Lf9/e;


# direct methods
.method public constructor <init>(Lcom/roblox/client/i0;Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lf7/f0;->o:Lf7/f0;

    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    const-string v0, "MainScreenController"

    .line 3
    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->o:Ljava/lang/String;

    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->q:Ljava/lang/Boolean;

    .line 5
    new-instance v0, Lf9/e;

    invoke-direct {v0}, Lf9/e;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->u:Lf9/e;

    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->r:Ljava/lang/ref/WeakReference;

    .line 7
    iput-object p2, p0, Lcom/roblox/client/game/MainActivityController;->t:Landroid/view/SurfaceView;

    .line 8
    new-instance v0, Lf9/b;

    invoke-direct {v0, p1, p2, p0}, Lf9/b;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lf9/b$e;)V

    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->s:Lf9/b;

    .line 9
    invoke-virtual {p2, v0}, Landroid/view/SurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 10
    invoke-virtual {p2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method private f(I)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/16 v0, 0x19

    if-eq p1, v0, :cond_0

    const/16 v0, 0x18

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private g()V
    .locals 2

    const-string v0, "MainScreenController"

    const-string v1, "Disposing RTC audio manager."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->p:Lq6/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lq6/a;->b()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->p:Lq6/a;

    :cond_0
    return-void
.end method

.method private h(Landroidx/appcompat/app/c;)V
    .locals 2

    const-string v0, "MainScreenController"

    const-string v1, "Initializing RTC audio manager."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/n;->c(Landroid/content/Context;)Lq6/a;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/game/MainActivityController;->p:Lq6/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lq6/a;->a(Landroidx/appcompat/app/c;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public E()V
    .locals 0

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->q:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->s:Lf9/b;

    invoke-virtual {v0, p1}, Lf9/b;->t(Z)V

    return-void
.end method

.method public d()F
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->u:Lf9/e;

    iget-object v1, p0, Lcom/roblox/client/game/MainActivityController;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public e(Landroidx/lifecycle/l;Landroidx/lifecycle/f$b;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged: event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainScreenController"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lcom/roblox/client/game/MainActivityController$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 p1, 0x2

    if-eq p2, p1, :cond_2

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/game/MainActivityController;->g()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/game/MainActivityController;->s:Lf9/b;

    invoke-virtual {p1}, Lf9/b;->u()V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/roblox/client/game/MainActivityController;->s:Lf9/b;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lf9/b;->t(Z)V

    goto :goto_0

    .line 6
    :cond_3
    check-cast p1, Landroidx/appcompat/app/c;

    invoke-direct {p0, p1}, Lcom/roblox/client/game/MainActivityController;->h(Landroidx/appcompat/app/c;)V

    .line 7
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->n1()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 8
    invoke-static {}, Lx7/b;->l()Z

    move-result p1

    if-nez p1, :cond_4

    .line 9
    iget-object p1, p0, Lcom/roblox/client/game/MainActivityController;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/i0;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x2000

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    :cond_4
    :goto_0
    return-void
.end method

.method public i(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/roblox/client/game/MainActivityController;->f(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    const/4 v3, 0x1

    if-lez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-static {v3, v0, v2, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassKeyEvent(ZIIZ)V

    return v3
.end method

.method public j(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/roblox/client/game/MainActivityController;->f(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    const/4 v3, 0x1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {v1, v0, v2, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassKeyEvent(ZIIZ)V

    return v3
.end method

.method public k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    sget-object v1, Lf7/f0;->n:Lf7/f0;

    if-ne v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Handling onTrimMemory level: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainScreenController"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0xf

    if-ne p1, v0, :cond_0

    const-string p1, "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine..."

    .line 3
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2OnLowMemory()V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->s:Lf9/b;

    invoke-virtual {v0}, Lf9/b;->q()V

    return-void
.end method

.method public m(Lf7/f0;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Roblox has entered "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mode."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainScreenController"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iput-object p1, p0, Lcom/roblox/client/game/MainActivityController;->n:Lf7/f0;

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p1, "MainScreenController"

    const-string p2, "surfaceChanged"

    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "MainScreenController"

    const-string v0, "surfaceCreated"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/roblox/client/game/MainActivityController;->q:Ljava/lang/Boolean;

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "MainScreenController"

    const-string v0, "surfaceDestroyed"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/roblox/client/game/MainActivityController;->q:Ljava/lang/Boolean;

    return-void
.end method

.method public z()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/MainActivityController;->s:Lf9/b;

    invoke-virtual {v0}, Lf9/b;->u()V

    return-void
.end method
