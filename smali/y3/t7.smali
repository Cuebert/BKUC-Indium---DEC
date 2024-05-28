.class public final Ly3/t7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ly3/t7;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Ly3/t7;
    .locals 2

    const-class v0, Ly3/t7;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly3/t7;->a:Ly3/t7;

    if-nez v1, :cond_0

    new-instance v1, Ly3/t7;

    invoke-direct {v1}, Ly3/t7;-><init>()V

    sput-object v1, Ly3/t7;->a:Ly3/t7;

    :cond_0
    sget-object v1, Ly3/t7;->a:Ly3/t7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static final b()Z
    .locals 1

    const-string v0, "mlkit-dev-profiling"

    invoke-static {v0}, Ly3/s7;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
