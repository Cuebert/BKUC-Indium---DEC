.class public final Landroidx/camera/camera2/Camera2Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/Camera2Config$DefaultProvider;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/Context;)Lw/p2;
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/Camera2Config;->e(Landroid/content/Context;)Lw/p2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lw/z;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/camera2/Camera2Config;->d(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lw/z;

    move-result-object p0

    return-object p0
.end method

.method public static c()Landroidx/camera/core/z;
    .locals 4

    .line 1
    sget-object v0, Lp/b;->a:Lp/b;

    .line 2
    sget-object v1, Lp/a;->a:Lp/a;

    .line 3
    sget-object v2, Lp/c;->a:Lp/c;

    .line 4
    new-instance v3, Landroidx/camera/core/z$a;

    invoke-direct {v3}, Landroidx/camera/core/z$a;-><init>()V

    .line 5
    invoke-virtual {v3, v0}, Landroidx/camera/core/z$a;->c(Lw/a0$a;)Landroidx/camera/core/z$a;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/camera/core/z$a;->d(Lw/z$a;)Landroidx/camera/core/z$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v2}, Landroidx/camera/core/z$a;->g(Lw/p2$c;)Landroidx/camera/core/z$a;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/camera/core/z$a;->a()Landroidx/camera/core/z;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lw/z;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/p1;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Landroidx/camera/camera2/internal/a1;

    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/camera2/internal/a1;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V
    :try_end_0
    .catch Landroidx/camera/core/u; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 2
    new-instance p1, Landroidx/camera/core/p1;

    invoke-direct {p1, p0}, Landroidx/camera/core/p1;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static synthetic e(Landroid/content/Context;)Lw/p2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/p1;
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/d1;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/d1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
