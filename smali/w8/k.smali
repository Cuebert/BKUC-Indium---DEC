.class public Lw8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw8/k$g;,
        Lw8/k$f;
    }
.end annotation


# static fields
.field private static j:Z

.field private static k:Lw8/k;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Lw8/k$f;

.field private d:Lw8/o;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lw8/l;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/content/Context;

.field private final g:Lx7/e;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw8/h;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lx7/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "InitHelper"

    .line 2
    iput-object v0, p0, Lw8/k;->a:Ljava/lang/String;

    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lw8/k;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    sget-object v1, Lw8/k$f;->n:Lw8/k$f;

    iput-object v1, p0, Lw8/k;->c:Lw8/k$f;

    .line 5
    sget-object v1, Lw8/o;->o:Lw8/o;

    iput-object v1, p0, Lw8/k;->d:Lw8/o;

    .line 6
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lw8/k;->h:Ljava/util/Set;

    .line 7
    new-instance v1, Lw8/k$c;

    invoke-direct {v1, p0}, Lw8/k$c;-><init>(Lw8/k;)V

    iput-object v1, p0, Lw8/k;->i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    const-string v1, "InitHelper created."

    .line 8
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lw8/k;->f:Landroid/content/Context;

    .line 10
    iput-object p2, p0, Lw8/k;->g:Lx7/e;

    .line 11
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object p1

    invoke-virtual {p1}, Ln6/d;->f()V

    return-void
.end method

.method public static A()Z
    .locals 1

    sget-boolean v0, Lw8/k;->j:Z

    return v0
.end method

.method private static synthetic B(Ljava/lang/String;)V
    .locals 0

    invoke-static {}, Lcom/roblox/client/p0;->X0()V

    return-void
.end method

.method private static synthetic C(Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/roblox/client/g;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method private E()V
    .locals 2

    const-string v0, "InitHelper"

    const-string v1, "AppSettings FAILURE"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lw8/k$f;->t:Lw8/k$f;

    iput-object v0, p0, Lw8/k;->c:Lw8/k$f;

    .line 3
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln6/d;->e(Z)V

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "init_failure"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->H()V

    .line 7
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lw8/k;->h:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw8/h;

    .line 10
    invoke-interface {v1}, Lw8/h;->b()V

    goto :goto_0

    .line 11
    :cond_1
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method private F()V
    .locals 9

    const-string v0, "InitHelper"

    const-string v1, "AppSettings loaded."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lw8/d;->s()V

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lw8/k;->h:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw8/h;

    .line 6
    invoke-interface {v1}, Lw8/h;->a()V

    goto :goto_0

    .line 7
    :cond_0
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 8
    :cond_1
    :goto_1
    invoke-static {}, Lo6/a;->e()Lo6/a;

    move-result-object v1

    .line 9
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->w()I

    move-result v2

    .line 10
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->n()I

    move-result v3

    .line 11
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->v0()I

    move-result v4

    .line 12
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->P0()I

    move-result v5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 13
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v6

    invoke-interface {v6}, Lc7/e;->b1()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    .line 14
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->W()I

    move-result v8

    .line 15
    invoke-virtual/range {v1 .. v8}, Lo6/a;->j(IIIIJI)V

    .line 16
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->B()V

    return-void
.end method

.method private G(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw8/k;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Init FAILURE: ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InitHelper"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object p1

    invoke-virtual {p1, v2}, Ln6/d;->e(Z)V

    .line 4
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p1

    const-string v0, "init_failure"

    invoke-virtual {p1, v0}, Lma/a;->b(Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object p1

    invoke-interface {p1}, Lw8/l;->H()V

    :cond_0
    return-void
.end method

.method public static H(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw8/k;->I(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->n1()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p1

    invoke-virtual {p1}, Lx7/b;->g()V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 5
    :cond_0
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object p1

    new-instance v0, Lw8/j;

    invoke-direct {v0, p0}, Lw8/j;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v0}, Lfa/a;->b(Lfa/a$b;)V

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p0

    invoke-interface {p0}, Lc7/e;->J0()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 7
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStartByGuac()V

    :cond_1
    return-void
.end method

.method static L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "reason"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "subreason"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p0, "INVALID USE OF FUNCTION"

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, ") "

    .line 4
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x28

    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-eq v1, v0, :cond_1

    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "APPLICATION EXIT INFO FORMAT CHANGED"

    return-object p0
.end method

.method private N()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/roblox/client/game/d;->c(Landroid/content/Context;)Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V

    return-void
.end method

.method private R()V
    .locals 5

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "start_app_bridge_begin"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    const-string v0, "InitHelper"

    const-string v1, "startAppBridge:..."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-direct {p0}, Lw8/k;->N()V

    .line 4
    iget-object v0, p0, Lw8/k;->i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V

    .line 5
    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->o0()Z

    move-result v2

    .line 8
    sget-object v3, Lcom/roblox/client/p0;->p:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/roblox/client/p0;->D()Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {v0, v1, v2, v3, v4}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->nativeAppBridgeAppStart(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "start_app_bridge_end"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method private V()V
    .locals 10

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->B0()Z

    move-result v0

    const-string v1, "InitHelper"

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetCookiesInNetscapeFormat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCookiesFromEngine: nativeGetCookiesInNetscapeFormat Got Cookies = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/roblox/client/p0;->F()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetCookiesForDomain(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCookiesFromEngine: nativeGetCookiesForDomain Got Cookies = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string v2, ";"

    .line 6
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 7
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_5

    aget-object v5, v0, v4

    .line 8
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\t"

    .line 9
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 10
    array-length v7, v6

    const/4 v8, 0x6

    const/4 v9, 0x7

    if-eq v7, v9, :cond_2

    array-length v7, v6

    if-ne v7, v8, :cond_1

    goto :goto_2

    .line 11
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "updateCookiesFromEngine: Invalid cookie format: ["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    .line 12
    :cond_2
    :goto_2
    aget-object v5, v6, v3

    .line 13
    invoke-static {}, Lcom/roblox/client/p0;->K()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x5

    .line 14
    aget-object v5, v6, v5

    .line 15
    array-length v7, v6

    if-ne v7, v9, :cond_3

    aget-object v6, v6, v8

    goto :goto_3

    :cond_3
    const-string v6, ""

    .line 16
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; Domain="

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/roblox/client/p0;->K()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 17
    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object v6

    invoke-static {}, Lcom/roblox/client/p0;->K()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Lo9/i;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "updateCookiesFromEngine: Set Cookies : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_5
    return-void
.end method

.method public static synthetic a(Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1}, Lw8/k;->C(Landroid/app/Activity;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lw8/k;->B(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lw8/k;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lw8/k;->f:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic d(Lw8/k;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw8/k;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lw8/k;)Lw8/l;
    .locals 0

    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lw8/k;)V
    .locals 0

    invoke-direct {p0}, Lw8/k;->o()V

    return-void
.end method

.method static synthetic g(Lw8/k;Lw8/k$f;)Lw8/k$f;
    .locals 0

    iput-object p1, p0, Lw8/k;->c:Lw8/k$f;

    return-object p1
.end method

.method static synthetic h(Lw8/k;)V
    .locals 0

    invoke-direct {p0}, Lw8/k;->x()V

    return-void
.end method

.method static synthetic i(Lw8/k;)V
    .locals 0

    invoke-direct {p0}, Lw8/k;->F()V

    return-void
.end method

.method static synthetic j(Lw8/k;)V
    .locals 0

    invoke-direct {p0}, Lw8/k;->E()V

    return-void
.end method

.method static synthetic k(Lw8/k;)Lx7/e;
    .locals 0

    iget-object p0, p0, Lw8/k;->g:Lx7/e;

    return-object p0
.end method

.method static synthetic l(Lw8/k;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lw8/k;->G(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic m(Lw8/k;)V
    .locals 0

    invoke-direct {p0}, Lw8/k;->V()V

    return-void
.end method

.method static synthetic n(Lw8/k;)V
    .locals 0

    invoke-direct {p0}, Lw8/k;->p()V

    return-void
.end method

.method private o()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "After post login. StartedFor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->d:Lw8/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lc9/c;->g()Lc9/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    sget-object v2, Lw8/i;->a:Lw8/i;

    invoke-virtual {v0, v1, v2}, Lc9/c;->f(Landroid/content/Context;Lc9/a$a;)V

    .line 4
    :cond_0
    sget-object v0, Lw8/k$e;->a:[I

    iget-object v1, p0, Lw8/k;->d:Lw8/o;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    invoke-direct {p0}, Lw8/k;->s()Lx7/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lx7/c;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 6
    :pswitch_1
    invoke-direct {p0}, Lw8/k;->s()Lx7/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lx7/c;->g(Landroid/content/Context;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private p()V
    .locals 2

    invoke-static {}, Lc9/c;->g()Lc9/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lc9/c;->e(Landroid/content/Context;)V

    return-void
.end method

.method private q()V
    .locals 3

    const-string v0, "InitHelper"

    const-string v1, "getAllAppSettings:..."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "load_setting_begin"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    new-instance v2, Lw8/k$a;

    invoke-direct {v2, p0}, Lw8/k$a;-><init>(Lw8/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/client/game/b;->o(Landroid/content/Context;Lcom/roblox/client/game/b$h;)V

    return-void
.end method

.method private s()Lx7/c;
    .locals 1

    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v0

    return-object v0
.end method

.method public static t(Landroid/content/Context;)Lw8/k;
    .locals 3

    .line 1
    sget-object v0, Lw8/k;->k:Lw8/k;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lw8/k;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lw8/k;->k:Lw8/k;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lw8/k;

    .line 5
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lw8/k;-><init>(Landroid/content/Context;Lx7/e;)V

    sput-object v1, Lw8/k;->k:Lw8/k;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 7
    :cond_1
    :goto_0
    sget-object p0, Lw8/k;->k:Lw8/k;

    return-object p0
.end method

.method private u()Lw8/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lw8/k;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Lw8/k$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw8/k$g;-><init>(Lw8/k$a;)V

    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lw8/k;->e:Ljava/lang/ref/WeakReference;

    .line 4
    :cond_1
    iget-object v0, p0, Lw8/k;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw8/l;

    return-object v0
.end method

.method private v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    new-instance v1, Lw8/k$b;

    invoke-direct {v1, p0, p1, p2}, Lw8/k$b;-><init>(Lw8/k;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private x()V
    .locals 2

    const-string v0, "CookieProtocolEnabled"

    .line 1
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/cookie/CookieProtocol;->a()Lcom/roblox/universalapp/cookie/CookieProtocol;

    .line 3
    :cond_0
    invoke-static {}, Lca/c;->j()Lca/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lca/c;->i(Landroid/content/Context;)V

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p0()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->F()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    :cond_1
    invoke-static {}, Lja/e;->w()Lja/e;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lja/e;->t(Landroid/content/Context;)V

    :cond_2
    const-string v0, "EnableAndroidNativeUtilProtocol"

    .line 7
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-static {}, Ly9/i;->O()Ly9/i;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ly9/i;->L(Landroid/content/Context;)V

    :cond_3
    const-string v0, "EnableAndroidSMSProtocol"

    .line 9
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    invoke-static {}, Lz9/c;->i()Lz9/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lz9/c;->h(Landroid/content/Context;)V

    :cond_4
    const-string v0, "EnableAndroidLinkingProtocolSwitchToSettingsApp2"

    .line 11
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lla/c;->p(Landroid/content/Context;)V

    .line 13
    :cond_5
    invoke-static {}, Lia/a;->f()Lia/a;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lia/a;->h(Landroid/content/Context;)V

    .line 14
    invoke-static {}, Lba/g;->y()Lba/g;

    .line 15
    invoke-static {}, Loa/a;->c()Loa/a;

    .line 16
    invoke-static {}, Lga/b;->i()Lga/b;

    move-result-object v0

    invoke-virtual {v0}, Lga/b;->g()V

    .line 17
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lc9/l;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 18
    invoke-static {}, Laa/c;->e()Laa/c;

    .line 19
    :cond_6
    invoke-static {}, Lc9/l;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 20
    invoke-static {}, Lea/d;->u()Lea/d;

    :cond_7
    return-void
.end method

.method public static y(Z)V
    .locals 0

    sput-boolean p0, Lw8/k;->j:Z

    return-void
.end method


# virtual methods
.method public D(Landroid/content/Context;ZLy7/c$b;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "logout: callServer = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->c:Lw8/k$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lw8/k$f;->r:Lw8/k$f;

    iput-object v0, p0, Lw8/k;->c:Lw8/k$f;

    .line 3
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lx7/g;->c(Landroid/content/Context;ZLy7/c$b;)V

    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDidLoginEventFromLua: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->c:Lw8/k$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lw8/k$f;->q:Lw8/k$f;

    iput-object v0, p0, Lw8/k;->c:Lw8/k$f;

    .line 3
    invoke-direct {p0}, Lw8/k;->V()V

    .line 4
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln6/d;->i(Z)V

    .line 5
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    new-instance v2, Lw8/k$d;

    invoke-direct {v2, p0}, Lw8/k$d;-><init>(Lw8/k;)V

    invoke-virtual {v0, v1, p1, v2}, Lx7/g;->j(Landroid/content/Context;Ljava/lang/String;Lx7/g$f;)V

    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDidSignUpEventFromLua: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->c:Lw8/k$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InitHelper"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object p1, Lw8/o;->s:Lw8/o;

    invoke-virtual {p0, p1}, Lw8/k;->O(Lw8/o;)V

    return-void
.end method

.method public K()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLoginRequestFromLua: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->c:Lw8/k$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lw8/k$f;->s:Lw8/k$f;

    iput-object v0, p0, Lw8/k;->c:Lw8/k$f;

    .line 3
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln6/d;->i(Z)V

    .line 4
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->h()V

    return-void
.end method

.method public declared-synchronized M(Lw8/h;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lw8/k;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public O(Lw8/o;)V
    .locals 0

    iput-object p1, p0, Lw8/k;->d:Lw8/o;

    return-void
.end method

.method public P(Lw8/l;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start: setView = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lw8/k;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public Q()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->c:Lw8/k$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", StartedFor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->d:Lw8/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lw8/k;->c:Lw8/k$f;

    sget-object v2, Lw8/k$f;->n:Lw8/k$f;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lf9/g;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object v0

    iget-object v3, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lf9/g;->s(Landroid/content/Context;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lw8/k;->c:Lw8/k$f;

    sget-object v3, Lw8/k$f;->q:Lw8/k$f;

    if-ne v0, v3, :cond_1

    .line 5
    iput-object v2, p0, Lw8/k;->c:Lw8/k$f;

    .line 6
    :cond_1
    iget-object v0, p0, Lw8/k;->c:Lw8/k$f;

    if-eq v0, v2, :cond_6

    sget-object v2, Lw8/k$f;->t:Lw8/k$f;

    if-ne v0, v2, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    sget-object v2, Lw8/k$f;->p:Lw8/k$f;

    if-ne v0, v2, :cond_3

    .line 8
    invoke-direct {p0}, Lw8/k;->F()V

    goto :goto_2

    .line 9
    :cond_3
    sget-object v3, Lw8/k$f;->r:Lw8/k$f;

    if-eq v0, v3, :cond_5

    sget-object v3, Lw8/k$f;->s:Lw8/k$f;

    if-ne v0, v3, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "The initialization must be in progress. Do nothing."

    .line 10
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 11
    :cond_5
    :goto_0
    iput-object v2, p0, Lw8/k;->c:Lw8/k$f;

    .line 12
    invoke-direct {p0}, Lw8/k;->F()V

    goto :goto_2

    .line 13
    :cond_6
    :goto_1
    sget-object v0, Lw8/k$f;->o:Lw8/k$f;

    iput-object v0, p0, Lw8/k;->c:Lw8/k$f;

    .line 14
    invoke-direct {p0}, Lw8/k;->q()V

    :goto_2
    return-void
.end method

.method public S()V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startV2: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->c:Lw8/k$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", StartedFor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8/k;->d:Lw8/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lw8/k;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lw8/k;->R()V

    .line 4
    :cond_0
    iget-object v0, p0, Lw8/k;->c:Lw8/k$f;

    sget-object v2, Lw8/k$f;->q:Lw8/k$f;

    if-eq v0, v2, :cond_3

    sget-object v4, Lw8/k$f;->s:Lw8/k$f;

    if-eq v0, v4, :cond_3

    sget-object v4, Lw8/k$f;->r:Lw8/k$f;

    if-ne v0, v4, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    sget-object v4, Lw8/k$f;->p:Lw8/k$f;

    if-ne v0, v4, :cond_2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " mContext: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "rbx.locale"

    invoke-static {v4, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    iget-object v4, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v4}, Ls7/b;->m(Landroid/content/Context;)V

    .line 8
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln6/d;->e(Z)V

    .line 9
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->G()V

    const-string v0, "SessionCheck... New startup flow. Go directly to the Main screen."

    .line 10
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iput-object v2, p0, Lw8/k;->c:Lw8/k$f;

    .line 12
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->S()V

    goto :goto_1

    :cond_2
    const-string v0, "The initialization must be in progress. Do nothing."

    .line 13
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_3
    :goto_0
    const-string v0, "The initialization is done or unauthorized. Go to Main screen."

    .line 14
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-direct {p0}, Lw8/k;->u()Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->S()V

    .line 16
    :goto_1
    invoke-static {}, Lca/c;->j()Lca/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lca/c;->i(Landroid/content/Context;)V

    .line 17
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p0()Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->F()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 19
    :cond_4
    invoke-static {}, Lja/e;->w()Lja/e;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lja/e;->t(Landroid/content/Context;)V

    :cond_5
    const-string v0, "EnableAndroidNativeUtilProtocol"

    .line 20
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 21
    invoke-static {}, Ly9/i;->O()Ly9/i;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ly9/i;->L(Landroid/content/Context;)V

    :cond_6
    const-string v0, "EnableAndroidSMSProtocol"

    .line 22
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 23
    invoke-static {}, Lz9/c;->i()Lz9/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lz9/c;->h(Landroid/content/Context;)V

    :cond_7
    const-string v0, "EnableAndroidLinkingProtocolSwitchToSettingsApp2"

    .line 24
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 25
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lla/c;->p(Landroid/content/Context;)V

    :cond_8
    return-void
.end method

.method public declared-synchronized T(Lw8/h;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lw8/k;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public U(Lw8/l;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start: unsetView = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lw8/k;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw8/l;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lw8/k;->e:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public r()Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;",
            ">;"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Lw8/k;->f:Landroid/content/Context;

    const-string v2, "activity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1

    .line 4
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->c()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 5
    invoke-virtual {v1, v3, v4, v2}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ApplicationExitInfo;

    .line 9
    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v4

    .line 10
    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getStatus()I

    move-result v7

    .line 11
    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "reason"

    .line 12
    invoke-static {v5, v6}, Lw8/k;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v6, "subreason"

    .line 13
    invoke-static {v5, v6}, Lw8/k;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "APPLICATION EXIT INFO FORMAT CHANGED"

    .line 14
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 15
    invoke-static {}, Landroid/app/ActivityManager;->isLowMemoryKillReportSupported()Z

    move-result v6

    if-nez v6, :cond_1

    const/4 v6, 0x2

    if-ne v4, v6, :cond_1

    .line 16
    sget v4, Landroid/system/OsConstants;->SIGKILL:I

    if-ne v7, v4, :cond_1

    const-string v4, "LOW_MEMORY"

    move-object v11, v4

    goto :goto_1

    :cond_1
    move-object v11, v5

    .line 17
    :goto_1
    new-instance v4, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getPid()I

    move-result v6

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v8

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getDescription()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getPss()J

    move-result-wide v13

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getRss()J

    move-result-wide v15

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v17

    move-object v5, v4

    invoke-direct/range {v5 .. v17}, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJI)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v2

    :cond_3
    move-object/from16 v0, p0

    .line 18
    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, Lw8/k;->c:Lw8/k$f;

    sget-object v1, Lw8/k$f;->n:Lw8/k$f;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z()V
    .locals 2

    invoke-direct {p0}, Lw8/k;->s()Lx7/c;

    move-result-object v0

    iget-object v1, p0, Lw8/k;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lx7/c;->a(Landroid/content/Context;)V

    return-void
.end method
