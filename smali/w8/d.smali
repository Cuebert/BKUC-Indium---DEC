.class public Lw8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw8/d$a;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lw8/d$a;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Z

.field private static d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lw8/d$a;->n:Lw8/d$a;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lw8/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lw8/d;->c:Z

    const-wide/16 v0, 0x0

    .line 3
    sput-wide v0, Lw8/d;->d:J

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lw8/d;->k(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lw8/d;->j(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;Lcom/google/common/util/concurrent/q;)V
    .locals 0

    invoke-static {p0, p1}, Lw8/d;->i(Landroid/content/Context;Lcom/google/common/util/concurrent/q;)V

    return-void
.end method

.method private static d()V
    .locals 4

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    sget-wide v1, Lw8/d;->d:J

    const-string v3, "fetch_flag_begin"

    invoke-virtual {v0, v3, v1, v2}, Lma/a;->d(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public static declared-synchronized e(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Lw8/d;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lw8/d;->b:Lcom/google/common/util/concurrent/m;

    if-eqz v1, :cond_0

    sget-boolean v2, Lw8/d;->c:Z

    if-eqz v2, :cond_0

    const/4 p0, 0x0

    .line 2
    sput-boolean p0, Lw8/d;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/common/util/concurrent/q;->E()Lcom/google/common/util/concurrent/q;

    move-result-object v1

    .line 5
    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v3, Lw8/c;

    invoke-direct {v3, p0, v1}, Lw8/c;-><init>(Landroid/content/Context;Lcom/google/common/util/concurrent/q;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 6
    sput-object v1, Lw8/d;->b:Lcom/google/common/util/concurrent/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "AndroidAppSettingsCache"

    const-string v1, "{}"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    const/4 p0, 0x1

    .line 4
    invoke-static {v0, p0}, Lw8/d;->u(Lorg/json/JSONObject;I)Z

    return-void
.end method

.method public static g(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lx6/a;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x2

    .line 3
    invoke-static {p0, v0}, Lw8/d;->u(Lorg/json/JSONObject;I)Z

    .line 4
    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->readLocalFlags()Lcom/roblox/engine/jni/model/ClientLocalFlags;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ClientLocalFlags;->isEmpty()Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "localFlags size:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ClientLocalFlags;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AndroidAppSettings"

    invoke-static {v2, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {p0}, Lcom/roblox/engine/jni/model/ClientLocalFlags;->getAll()Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0, v1}, Lw8/d;->u(Lorg/json/JSONObject;I)Z

    .line 8
    :cond_1
    invoke-static {}, Lx6/b;->a()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 9
    invoke-static {}, Lx6/c;->a()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 10
    invoke-static {}, Lx6/c;->b()Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0, v1}, Lw8/d;->u(Lorg/json/JSONObject;I)Z

    :cond_2
    return-void
.end method

.method public static h()Z
    .locals 2

    sget-object v0, Lw8/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lw8/d$a;->p:Lw8/d$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static synthetic i(Landroid/content/Context;Lcom/google/common/util/concurrent/q;)V
    .locals 1

    .line 1
    invoke-static {}, Lw8/d;->p()V

    .line 2
    invoke-static {p0}, Lw8/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0, p0}, Lw8/d;->t(Ljava/lang/String;Landroid/content/Context;)Z

    .line 4
    invoke-static {}, Lw8/d;->d()V

    .line 5
    invoke-static {}, Lw8/d;->q()V

    .line 6
    invoke-virtual {p1, v0}, Lcom/google/common/util/concurrent/q;->B(Ljava/lang/Object;)Z

    .line 7
    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object p0

    instance-of p0, p0, Lh7/r;

    if-eqz p0, :cond_0

    .line 8
    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object p0

    check-cast p0, Lh7/r;

    invoke-virtual {p0}, Lh7/r;->k()V

    :cond_0
    return-void
.end method

.method private static synthetic j(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lc9/c;->d:Lcom/google/common/util/concurrent/q;

    invoke-virtual {v0, p0}, Lcom/google/common/util/concurrent/q;->B(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic k(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {}, Lo9/i;->e()Lo9/i;

    .line 2
    invoke-static {}, Lc9/c;->g()Lc9/c;

    move-result-object v0

    sget-object v1, Lw8/a;->a:Lw8/a;

    invoke-virtual {v0, p0, v1}, Lc9/c;->f(Landroid/content/Context;Lc9/a$a;)V

    return-void
.end method

.method public static l(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lw8/d;->f(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lw8/d;->g(Landroid/content/Context;)V

    return-void
.end method

.method public static declared-synchronized m()V
    .locals 3

    const-class v0, Lw8/d;

    monitor-enter v0

    :try_start_0
    const-string v1, "roblox"

    .line 1
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "AndroidAppSettings"

    .line 2
    invoke-virtual {v1}, Ljava/lang/UnsatisfiedLinkError;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public static n()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lw8/d;->b:Lcom/google/common/util/concurrent/m;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2
    sput-object v0, Lw8/d;->b:Lcom/google/common/util/concurrent/m;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public static o(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lw8/d;->e(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    sput-object v0, Lw8/d;->b:Lcom/google/common/util/concurrent/m;

    .line 2
    sget-object v0, Lw8/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lw8/d$a;->o:Lw8/d$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 3
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lw8/b;

    invoke-direct {v1, p0}, Lw8/b;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static p()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lw8/d;->d:J

    :cond_0
    return-void
.end method

.method private static q()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "fetch_flag_end"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static r(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    .line 2
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p0

    const-string v0, "fastflag_load_success"

    invoke-virtual {p0, v0}, Lma/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p0

    const-string v0, "fastflag_load_failure"

    invoke-virtual {p0, v0}, Lma/a;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static s()V
    .locals 2

    sget-object v0, Lw8/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lw8/d$a;->p:Lw8/d$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static t(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Lw8/e;->b(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AndroidAppSettingsCache"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x1

    .line 4
    invoke-static {p0, v0}, Lw8/d;->u(Lorg/json/JSONObject;I)Z

    move-result p0

    .line 5
    invoke-static {p0}, Lw8/d;->r(Z)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Lw8/d;->f(Landroid/content/Context;)V

    const/4 p0, 0x0

    .line 7
    :goto_0
    invoke-static {p1}, Lw8/d;->g(Landroid/content/Context;)V

    .line 8
    invoke-static {}, Lc7/f;->c()Lc7/f;

    move-result-object v0

    invoke-static {p1}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc7/f;->a(Landroid/content/SharedPreferences;)V

    return p0
.end method

.method public static u(Lorg/json/JSONObject;I)Z
    .locals 6

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/b;->r1()Ljava/util/Set;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc7/a;

    .line 5
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 6
    :try_start_0
    instance-of v4, v2, Lc7/a$b;

    if-eqz v4, :cond_0

    .line 7
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_1

    .line 8
    :cond_0
    instance-of v4, v2, Lc7/a$d;

    if-eqz v4, :cond_1

    .line 9
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_1

    .line 10
    :cond_1
    instance-of v4, v2, Lc7/a$c;

    if-eqz v4, :cond_2

    .line 11
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 13
    :goto_1
    invoke-virtual {v2, v4, p1}, Lc7/a;->e(Ljava/lang/Object;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    goto :goto_0

    .line 14
    :catch_0
    invoke-virtual {v2, p1}, Lc7/a;->c(I)V

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error reading value for setting: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AndroidAppSettings"

    invoke-static {v3, v2}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 16
    :cond_3
    invoke-virtual {v2, p1}, Lc7/a;->c(I)V

    goto :goto_0

    :cond_4
    return v1
.end method
