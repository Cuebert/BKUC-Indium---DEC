.class abstract Landroidx/camera/camera2/internal/g0$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "h"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/Class;Lw/c2;Landroid/util/Size;)Landroidx/camera/camera2/internal/g0$h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Lw/c2;",
            "Landroid/util/Size;",
            ")",
            "Landroidx/camera/camera2/internal/g0$h;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/b;

    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/camera/camera2/internal/b;-><init>(Ljava/lang/String;Ljava/lang/Class;Lw/c2;Landroid/util/Size;)V

    return-object v0
.end method

.method static b(Landroidx/camera/core/y2;)Landroidx/camera/camera2/internal/g0$h;
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/camera/camera2/internal/g0;->I(Landroidx/camera/core/y2;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/y2;->l()Lw/c2;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/camera/core/y2;->c()Landroid/util/Size;

    move-result-object p0

    .line 3
    invoke-static {v0, v1, v2, p0}, Landroidx/camera/camera2/internal/g0$h;->a(Ljava/lang/String;Ljava/lang/Class;Lw/c2;Landroid/util/Size;)Landroidx/camera/camera2/internal/g0$h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method abstract c()Lw/c2;
.end method

.method abstract d()Landroid/util/Size;
.end method

.method abstract e()Ljava/lang/String;
.end method

.method abstract f()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method
