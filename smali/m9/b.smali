.class public Lm9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lbc/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lbc/c;
    .locals 2

    .line 1
    sget-object v0, Lm9/b;->a:Lbc/c;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lm9/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lm9/b;->a:Lbc/c;

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lbc/c;->b()Lbc/d;

    move-result-object v1

    invoke-virtual {v1}, Lbc/d;->a()Lbc/c;

    move-result-object v1

    sput-object v1, Lm9/b;->a:Lbc/c;

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
    sget-object v0, Lm9/b;->a:Lbc/c;

    return-object v0
.end method
