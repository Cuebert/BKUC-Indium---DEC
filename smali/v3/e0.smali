.class public final Lv3/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lv3/d0;


# direct methods
.method public static declared-synchronized a(Lv3/r;)Lv3/w;
    .locals 3

    const-class v0, Lv3/e0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lv3/e0;->a:Lv3/d0;

    if-nez v1, :cond_0

    new-instance v1, Lv3/d0;

    const/4 v2, 0x0

    .line 1
    invoke-direct {v1, v2}, Lv3/d0;-><init>(Lv3/c0;)V

    sput-object v1, Lv3/e0;->a:Lv3/d0;

    :cond_0
    sget-object v1, Lv3/e0;->a:Lv3/d0;

    .line 2
    invoke-virtual {v1, p0}, Lg6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv3/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Lv3/w;
    .locals 1

    const-class p0, Lv3/e0;

    monitor-enter p0

    :try_start_0
    const-string v0, "common"

    .line 1
    invoke-static {v0}, Lv3/r;->d(Ljava/lang/String;)Lv3/q;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lv3/q;->c()Lv3/r;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lv3/e0;->a(Lv3/r;)Lv3/w;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
