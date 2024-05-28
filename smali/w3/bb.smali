.class public final Lw3/bb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lw3/bb;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lw3/bb;
    .locals 2

    const-class v0, Lw3/bb;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw3/bb;->a:Lw3/bb;

    if-nez v1, :cond_0

    new-instance v1, Lw3/bb;

    invoke-direct {v1}, Lw3/bb;-><init>()V

    sput-object v1, Lw3/bb;->a:Lw3/bb;

    :cond_0
    sget-object v1, Lw3/bb;->a:Lw3/bb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
