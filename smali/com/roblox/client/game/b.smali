.class public Lcom/roblox/client/game/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/g$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/b$f;,
        Lcom/roblox/client/game/b$e;,
        Lcom/roblox/client/game/b$g;,
        Lcom/roblox/client/game/b$d;,
        Lcom/roblox/client/game/b$h;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lcom/roblox/client/game/b$d;

.field private h:Lcom/roblox/client/game/b$f;

.field private i:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lh9/b;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/roblox/client/game/b$e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.appshell"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/game/b;->a:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->b:Z

    .line 4
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->c:Z

    .line 5
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    .line 6
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->e:Z

    .line 7
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->f:Z

    .line 8
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/game/b;->i:Ljava/util/Vector;

    return-void
.end method

.method public static synthetic b(Lcom/google/common/util/concurrent/q;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/game/b;->m(Lcom/google/common/util/concurrent/q;I)V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/game/b;Landroid/content/Context;Lcom/roblox/client/game/b$h;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/game/b;->n(Landroid/content/Context;Lcom/roblox/client/game/b$h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lcom/roblox/client/game/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/game/b;->c:Z

    return p1
.end method

.method private f()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    if-eqz v0, :cond_0

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.destroy() ...."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2DestroyApp()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/game/b;->v()V

    return-void
.end method

.method private g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/client/game/b$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    :cond_0
    return-void
.end method

.method public static i()Lcom/roblox/client/game/b;
    .locals 1

    sget-object v0, Lcom/roblox/client/game/b$g;->a:Lcom/roblox/client/game/b;

    return-object v0
.end method

.method private static synthetic m(Lcom/google/common/util/concurrent/q;I)V
    .locals 1

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p1

    const-string v0, "asset_unpack_end"

    invoke-virtual {p1, v0}, Lma/a;->b(Ljava/lang/String;)V

    const-string p1, "asset finish"

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/q;->B(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic n(Landroid/content/Context;Lcom/roblox/client/game/b$h;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/client/game/b;->s(Landroid/content/Context;Lcom/roblox/client/game/b$h;Z)V

    const-string p1, "load setting finish"

    return-object p1
.end method

.method private s(Landroid/content/Context;Lcom/roblox/client/game/b$h;Z)V
    .locals 0

    if-eqz p3, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->E(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p1

    const-string p3, "update_setting_to_app_bridge_start"

    invoke-virtual {p1, p3}, Lma/a;->b(Ljava/lang/String;)V

    .line 3
    new-instance p1, Lcom/roblox/client/game/b$a;

    invoke-direct {p1, p0, p2}, Lcom/roblox/client/game/b$a;-><init>(Lcom/roblox/client/game/b;Lcom/roblox/client/game/b$h;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->p(Lcom/roblox/client/game/b$h;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 4
    invoke-interface {p2, p1}, Lcom/roblox/client/game/b$h;->a(I)V

    :goto_0
    return-void
.end method

.method private u(Ljava/util/Vector;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector<",
            "Lh9/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh9/b;

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "publishPendingReadyEvents() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lh9/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lh9/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lh9/c;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lh9/b;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.appshell"

    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v1, v0, Lh9/c;->a:Ljava/lang/String;

    iget-object v2, v0, Lh9/c;->b:Ljava/lang/String;

    iget-object v3, v0, Lh9/c;->c:Ljava/lang/String;

    iget-object v0, v0, Lh9/b;->d:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2SendAppEventOnAppReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/b;->h:Lcom/roblox/client/game/b$f;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "rbx.appshell"

    const-string v2, "ASMA.resetTask: Cancel the current (running) task..."

    .line 3
    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/roblox/client/game/b;->h:Lcom/roblox/client/game/b$f;

    return-void
.end method


# virtual methods
.method public A(Lh9/c;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->b:Z

    if-nez v0, :cond_0

    const-string p1, "rbx.appshell"

    const-string v0, "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    iget-object v0, p1, Lh9/c;->a:Ljava/lang/String;

    iget-object v1, p1, Lh9/c;->b:Ljava/lang/String;

    iget-object p1, p1, Lh9/c;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2SendAppEventOnGameLoaded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public B(Z)V
    .locals 1

    new-instance v0, Lh9/a;

    invoke-direct {v0, p1}, Lh9/a;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/b;->A(Lh9/c;)V

    return-void
.end method

.method public C(Lh9/b;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/b;->i:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/game/b;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/roblox/client/game/b;->i:Ljava/util/Vector;

    invoke-direct {p0, p1}, Lcom/roblox/client/game/b;->u(Ljava/util/Vector;)V

    :cond_1
    return-void
.end method

.method public D(Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/roblox/client/game/b$e;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/game/b$e;-><init>(Lcom/roblox/client/game/b;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    iput-object v0, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/client/game/b$e;

    .line 2
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    return-void
.end method

.method public E(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.setup() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/game/b;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.appshell"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->b:Z

    .line 4
    invoke-static {}, Lcom/roblox/client/p0;->W0()V

    .line 5
    invoke-static {p1}, Lorg/fmod/FMOD;->init(Landroid/content/Context;)V

    .line 6
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGameGlobalInit()V

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->V0()V

    .line 8
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->Y0()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUpdateAdapterInit()V

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lcom/roblox/client/p0;->U0()V

    :cond_1
    :goto_0
    return-void
.end method

.method public F(Landroid/view/Surface;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->f:Z

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/game/b;->z()V

    .line 4
    invoke-virtual {p0}, Lcom/roblox/client/game/b;->h()Lcom/roblox/client/game/b$d;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->builder()Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object v1

    .line 6
    invoke-virtual {v1, p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->i(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lcom/roblox/client/game/b$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 7
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->g(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lcom/roblox/client/game/b$d;->d:Ljava/lang/String;

    .line 8
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lcom/roblox/client/game/b$d;->e:Ljava/lang/String;

    .line 9
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-wide v1, v0, Lcom/roblox/client/game/b$d;->f:J

    .line 10
    invoke-virtual {p1, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->d(J)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-boolean v1, v0, Lcom/roblox/client/game/b$d;->g:Z

    .line 11
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->e(Z)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lcom/roblox/client/game/b$d;->h:Ljava/lang/String;

    .line 12
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget v1, v0, Lcom/roblox/client/game/b$d;->i:I

    .line 13
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->f(I)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lcom/roblox/client/game/b$d;->j:Ljava/lang/String;

    .line 14
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    .line 15
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 16
    iget-object v1, v0, Lcom/roblox/client/game/b$d;->a:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->k(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->a()Lcom/roblox/engine/jni/autovalue/StartAppParams;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2StartAppWithParams(Lcom/roblox/engine/jni/autovalue/StartAppParams;)V

    .line 18
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 19
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v1, Lcom/roblox/client/game/b$c;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/game/b$c;-><init>(Lcom/roblox/client/game/b;Lcom/roblox/client/game/b$d;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public G()V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.stop"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roblox/client/game/b;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->f:Z

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2PauseApp()V

    .line 5
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 6
    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public H(Landroid/view/Surface;F)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.updateWindowHandle"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p1, p2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UpdateSurfaceApp(Landroid/view/Surface;F)V

    :cond_0
    return-void
.end method

.method public a()V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "onCookieChanged."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->U0()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/roblox/client/game/b;->f()V

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public h()Lcom/roblox/client/game/b$d;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/b;->g:Lcom/roblox/client/game/b$d;

    return-object v0
.end method

.method public j(Lcom/roblox/client/game/b$d;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.initializeDataModel: mHasSettings:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/game/b;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mIsInitialized:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/game/b;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.appshell"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->c:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/game/b;->g()V

    const-string v0, "ASMA.initializeDataModel()"

    .line 4
    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iput-object p1, p0, Lcom/roblox/client/game/b;->g:Lcom/roblox/client/game/b$d;

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-static {}, Lcom/roblox/client/p0;->o0()Z

    move-result v2

    .line 10
    invoke-static {}, Lcom/roblox/engine/jni/autovalue/InitParams;->builder()Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v3

    iget-object v4, p1, Lcom/roblox/client/game/b$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 11
    invoke-virtual {v3, v4}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->g(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v3

    iget-object p1, p1, Lcom/roblox/client/game/b$d;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    .line 12
    invoke-virtual {v3, p1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->d(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1, v0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object p1

    .line 15
    invoke-virtual {p1, v2}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->e(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object p1

    .line 16
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "googleProd"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "release"

    .line 18
    invoke-static {v1}, Lc9/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    .line 19
    :cond_0
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->f(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    .line 20
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->a()Lcom/roblox/engine/jni/autovalue/InitParams;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2InitWithParams(Lcom/roblox/engine/jni/autovalue/InitParams;)V

    :cond_1
    return-void
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/game/b;->e:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    return v0
.end method

.method public o(Landroid/content/Context;Lcom/roblox/client/game/b$h;)V
    .locals 4

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.loadAllAppSettings()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/google/common/util/concurrent/q;->E()Lcom/google/common/util/concurrent/q;

    move-result-object v0

    .line 3
    invoke-static {}, Lf9/g;->j()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lf7/b;

    invoke-direct {v1, v0}, Lf7/b;-><init>(Lcom/google/common/util/concurrent/q;)V

    invoke-static {v1}, Lz6/a;->b(Lz6/a$a;)Lcom/roblox/client/components/k;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Lcom/roblox/client/components/k;->a()V

    goto :goto_0

    :cond_0
    const-string v1, "asset finish"

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/q;->B(Ljava/lang/Object;)Z

    .line 7
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v1

    const-string v2, "asset_unpack_end"

    invoke-virtual {v1, v2}, Lma/a;->b(Ljava/lang/String;)V

    :goto_0
    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/common/util/concurrent/m;

    const/4 v2, 0x0

    .line 8
    invoke-static {p1}, Lw8/d;->e(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Lcom/google/common/util/concurrent/j;->b([Lcom/google/common/util/concurrent/m;)Lcom/google/common/util/concurrent/j$a;

    move-result-object v0

    new-instance v1, Lf7/a;

    invoke-direct {v1, p0, p1, p2}, Lf7/a;-><init>(Lcom/roblox/client/game/b;Landroid/content/Context;Lcom/roblox/client/game/b$h;)V

    .line 9
    invoke-static {}, Lcom/google/common/util/concurrent/n;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 10
    invoke-virtual {v0, v1, p1}, Lcom/google/common/util/concurrent/j$a;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/m;

    return-void
.end method

.method public p(Lcom/roblox/client/game/b$h;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.loadSettings() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/game/b;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.appshell"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v0, p0, Lcom/roblox/client/game/b;->c:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const-string v0, "ASMA.loadSettings() ... skipping because Init already does it!"

    .line 3
    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1, v2}, Lcom/roblox/client/game/b$h;->a(I)V

    :cond_0
    return-void

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/roblox/client/game/b;->w()V

    .line 6
    new-instance v0, Lcom/roblox/client/game/b$f;

    new-instance v1, Lcom/roblox/client/game/b$b;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/game/b$b;-><init>(Lcom/roblox/client/game/b;Lcom/roblox/client/game/b$h;)V

    invoke-direct {v0, v1}, Lcom/roblox/client/game/b$f;-><init>(Lcom/roblox/client/game/b$h;)V

    iput-object v0, p0, Lcom/roblox/client/game/b;->h:Lcom/roblox/client/game/b$f;

    .line 7
    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.onAppReady() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.appshell"

    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/roblox/client/game/b;->e:Z

    .line 3
    iget-object p1, p0, Lcom/roblox/client/game/b;->i:Ljava/util/Vector;

    invoke-direct {p0, p1}, Lcom/roblox/client/game/b;->u(Ljava/util/Vector;)V

    return-void
.end method

.method public r()V
    .locals 0

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeHandleBackPressed()V

    return-void
.end method

.method public t()V
    .locals 3

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.pause"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v2, p0, Lcom/roblox/client/game/b;->d:Z

    if-eqz v2, :cond_0

    const-string v2, "ASMA.pause(): Do nothing in AppBridge refactor!"

    .line 3
    invoke-static {v0, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf7/b0;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 5
    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public v()V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.reset()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->b:Z

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->d:Z

    .line 4
    iput-boolean v0, p0, Lcom/roblox/client/game/b;->e:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/roblox/client/game/b;->g:Lcom/roblox/client/game/b$d;

    .line 6
    const-class v0, Lcom/roblox/client/game/b$e;

    new-instance v1, Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-direct {v1}, Lcom/roblox/engine/jni/EngineJavaCallback2;-><init>()V

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->replaceImplementation(Ljava/lang/Class;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    .line 7
    invoke-direct {p0}, Lcom/roblox/client/game/b;->w()V

    .line 8
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object v0

    invoke-virtual {v0}, Lfa/a;->c()V

    .line 9
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->f1()Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    invoke-virtual {v0}, Lla/c;->t()V

    :cond_0
    return-void
.end method

.method public x(Landroid/content/Context;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/game/b;->y(Landroid/content/Context;Landroid/view/Surface;Landroid/app/Activity;)V

    return-void
.end method

.method public y(Landroid/content/Context;Landroid/view/Surface;Landroid/app/Activity;)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.restart"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/game/b;->e()V

    .line 3
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1, p3}, Lcom/roblox/client/game/d;->b(Landroid/content/Context;Landroid/app/Activity;)Lcom/roblox/client/game/b$d;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/roblox/client/game/d;->a(Landroid/content/Context;)Lcom/roblox/client/game/b$d;

    move-result-object p1

    .line 6
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->j(Lcom/roblox/client/game/b$d;)V

    .line 7
    invoke-virtual {p0, p2}, Lcom/roblox/client/game/b;->F(Landroid/view/Surface;)V

    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/game/b;->g()V

    const/4 v0, 0x0

    const-string v1, "ASMA.start"

    .line 2
    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    return-void
.end method
