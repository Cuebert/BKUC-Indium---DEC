.class final Lb5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lb5/l0;


# direct methods
.method static declared-synchronized a(Landroid/content/Context;)Lb5/l0;
    .locals 3

    const-class v0, Lb5/e;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lb5/e;->a:Lb5/l0;

    if-nez v1, :cond_0

    new-instance v1, Lb5/j0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lb5/j0;-><init>(Lb5/i0;)V

    invoke-static {p0}, Ld5/f;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 2
    invoke-virtual {v1, p0}, Lb5/j0;->b(Landroid/content/Context;)Lb5/j0;

    .line 3
    invoke-interface {v1}, Lb5/d;->a()Lb5/l0;

    move-result-object p0

    sput-object p0, Lb5/e;->a:Lb5/l0;

    :cond_0
    sget-object p0, Lb5/e;->a:Lb5/l0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
