.class public Lma/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lma/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized e()Lma/a;
    .locals 2

    const-class v0, Lma/a;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lma/a;->a:Lma/a;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lma/a;

    invoke-direct {v1}, Lma/a;-><init>()V

    sput-object v1, Lma/a;->a:Lma/a;

    .line 3
    :cond_0
    sget-object v1, Lma/a;->a:Lma/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()J
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->nativeGetTimestamp()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lma/a;->c(Ljava/lang/String;J)V

    return-void
.end method

.method public c(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, p3, v0}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->a(Ljava/lang/String;J[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public d(Ljava/lang/String;J)V
    .locals 3

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lma/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    sub-long/2addr v1, p2

    .line 3
    invoke-virtual {v0, p1, v1, v2}, Lma/a;->c(Ljava/lang/String;J)V

    return-void
.end method
