.class public Lcom/roblox/client/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/n$a;
    }
.end annotation


# static fields
.field private static c:Lcom/roblox/client/n;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 2

    const-string v0, "rbx.main"

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "com.roblox.client.implementation.AppImplementations"

    .line 2
    iput-object v1, p0, Lcom/roblox/client/n;->a:Ljava/lang/String;

    .line 3
    :try_start_0
    const-class v1, Lcom/roblox/client/implementation/AppImplementations;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "Failed to instantiate implementation"

    .line 5
    invoke-static {v0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    const-string v1, "Failed to find implementation class"

    .line 6
    invoke-static {v0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static h()Lcom/roblox/client/n;
    .locals 2

    .line 1
    sget-object v0, Lcom/roblox/client/n;->c:Lcom/roblox/client/n;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/roblox/client/n;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/roblox/client/n;->c:Lcom/roblox/client/n;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/roblox/client/n;

    invoke-direct {v1}, Lcom/roblox/client/n;-><init>()V

    sput-object v1, Lcom/roblox/client/n;->c:Lcom/roblox/client/n;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/roblox/client/n;->c:Lcom/roblox/client/n;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/roblox/client/game/c$a;Lcom/roblox/client/game/c$b;)Lcom/roblox/client/game/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/b;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/b;

    invoke-interface {v0, p1, p2}, Ls8/b;->a(Lcom/roblox/client/game/c$a;Lcom/roblox/client/game/c$b;)Lcom/roblox/client/game/c;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default DataModelNotifications"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Lcom/roblox/client/game/c;

    invoke-direct {v0, p1, p2}, Lcom/roblox/client/game/c;-><init>(Lcom/roblox/client/game/c$a;Lcom/roblox/client/game/c$b;)V

    return-object v0
.end method

.method public b()Le7/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/d;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/d;

    invoke-interface {v0}, Ls8/d;->a()Le7/b;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default GenericWebFragment"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Le7/b;

    invoke-direct {v0}, Le7/b;-><init>()V

    return-object v0
.end method

.method public c(Landroid/content/Context;)Lq6/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Lq6/b;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lq6/b;

    .line 3
    invoke-interface {v0, p1}, Lq6/b;->getRtcAudioManager(Landroid/content/Context;)Lq6/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No AudioRtcManager"

    .line 4
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Lx7/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/a;

    invoke-interface {v0}, Ls8/a;->getAppsFlyerManager()Lx7/c;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No AppsFlyer"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Lx7/c;

    invoke-direct {v0}, Lx7/c;-><init>()V

    return-object v0
.end method

.method public e()Lea/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Lv6/c;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lv6/c;

    .line 3
    invoke-interface {v0}, Lv6/c;->a()Lea/d;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-static {}, Lea/d;->u()Lea/d;

    move-result-object v0

    return-object v0
.end method

.method public f()Lf7/b0;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/c;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/c;

    invoke-interface {v0}, Ls8/c;->a()Lf7/b0;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/roblox/client/n$a;->a()Lf7/b0;

    move-result-object v0

    return-object v0
.end method

.method public g()Lja/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Lm7/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lm7/a;

    .line 3
    invoke-interface {v0}, Lm7/a;->getIdentityProtocol()Lja/e;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-static {}, Lja/e;->w()Lja/e;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/e;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/e;

    invoke-interface {v0, p1}, Ls8/e;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Main class"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public j(Landroid/app/Activity;)Lg8/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/f;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/f;

    invoke-interface {v0, p1}, Ls8/f;->a(Landroid/app/Activity;)Lg8/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "Using empty Midas"

    .line 3
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance p1, Lg8/a;

    invoke-direct {p1}, Lg8/a;-><init>()V

    return-object p1
.end method

.method public k()Ly9/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, La8/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, La8/a;

    .line 3
    invoke-interface {v0}, La8/a;->getNativeUtilProtocol()Ly9/i;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-static {}, Ly9/i;->O()Ly9/i;

    move-result-object v0

    return-object v0
.end method

.method public l()Lna/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Lb8/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lb8/a;

    .line 3
    invoke-interface {v0}, Lb8/a;->getPermissionsProtocol()Lna/d;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-static {}, Lna/e;->C()Lna/e;

    move-result-object v0

    return-object v0
.end method

.method public m()Ln9/f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/h;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/h;

    invoke-interface {v0}, Ls8/h;->a()Ln9/f;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Provider"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Ln9/a;

    invoke-direct {v0}, Ln9/a;-><init>()V

    return-object v0
.end method

.method public n()Lh8/n;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/i;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/i;

    invoke-interface {v0}, Ls8/i;->a()Lh8/n;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No default push registrar"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public o(Lt9/c;)Lgc/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/c;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/g;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/g;

    invoke-interface {v0, p1}, Ls8/g;->a(Lt9/c;)Lgc/b;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No default push registration call"

    .line 3
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public p(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/j;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/j;

    invoke-interface {v0, p1}, Ls8/j;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Start class"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/landing/ActivityStartMVP;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public q()Lp8/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Ls8/k;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls8/k;

    invoke-interface {v0}, Ls8/k;->a()Lp8/a;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using empty TSS"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Lp8/a;

    invoke-direct {v0}, Lp8/a;-><init>()V

    return-object v0
.end method

.method public r(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/n;->b:Ljava/lang/Object;

    instance-of v1, v0, Lw8/n;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lw8/n;

    invoke-interface {v0, p1}, Lw8/n;->installSecurityProviderIfNeeded(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
