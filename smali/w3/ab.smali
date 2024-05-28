.class public final Lw3/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lw3/za;


# direct methods
.method public static declared-synchronized a(Lw3/ia;)Lw3/pa;
    .locals 3

    const-class v0, Lw3/ab;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw3/ab;->a:Lw3/za;

    if-nez v1, :cond_0

    .line 1
    new-instance v1, Lw3/za;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lw3/za;-><init>(Lw3/ya;)V

    sput-object v1, Lw3/ab;->a:Lw3/za;

    :cond_0
    sget-object v1, Lw3/ab;->a:Lw3/za;

    .line 2
    invoke-virtual {v1, p0}, Lg6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw3/pa;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Lw3/pa;
    .locals 1

    const-class v0, Lw3/ab;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {p0}, Lw3/ia;->d(Ljava/lang/String;)Lw3/ha;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Lw3/ha;->c()Lw3/ia;

    move-result-object p0

    .line 3
    invoke-static {p0}, Lw3/ab;->a(Lw3/ia;)Lw3/pa;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
