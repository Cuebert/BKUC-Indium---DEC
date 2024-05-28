.class public Lcom/roblox/client/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/l$c;,
        Lcom/roblox/client/l$b;
    }
.end annotation


# static fields
.field private static b:Lcom/roblox/client/l;


# instance fields
.field private a:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/l;->a:Z

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/l;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/l;->e()Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/roblox/client/l;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/l;->f()Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/roblox/client/l;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/l;->a:Z

    return p1
.end method

.method private e()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "test-keys"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()Z
    .locals 10

    const-string v0, "/system/app/Superuser.apk"

    const-string v1, "/sbin/su"

    const-string v2, "/system/bin/su"

    const-string v3, "/system/xbin/su"

    const-string v4, "/data/local/xbin/su"

    const-string v5, "/data/local/bin/su"

    const-string v6, "/system/sd/xbin/su"

    const-string v7, "/system/bin/failsafe/su"

    const-string v8, "/data/local/su"

    const-string v9, "/su/bin/su"

    .line 1
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xa

    if-ge v2, v3, :cond_1

    .line 2
    aget-object v3, v0, v2

    .line 3
    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static g()Lcom/roblox/client/l;
    .locals 2

    .line 1
    sget-object v0, Lcom/roblox/client/l;->b:Lcom/roblox/client/l;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    const-class v0, Lcom/roblox/client/l;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/roblox/client/l;->b:Lcom/roblox/client/l;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Lcom/roblox/client/l;

    invoke-direct {v1}, Lcom/roblox/client/l;-><init>()V

    sput-object v1, Lcom/roblox/client/l;->b:Lcom/roblox/client/l;

    .line 5
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    sget-object v0, Lcom/roblox/client/l;->b:Lcom/roblox/client/l;

    return-object v0

    :catchall_0
    move-exception v1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public d(Lcom/roblox/client/l$c;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/roblox/client/l$a;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/l$a;-><init>(Lcom/roblox/client/l;Lcom/roblox/client/l$c;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 2
    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/l;->a:Z

    return v0
.end method

.method public i()Lcom/roblox/client/l$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/engine/jni/NativeSettingsInterface;->getRunningArchitecture()I

    move-result v0

    .line 2
    invoke-static {v0}, Lcom/roblox/client/l$b;->b(I)Lcom/roblox/client/l$b;

    move-result-object v0

    return-object v0
.end method
