.class public abstract Landroidx/camera/core/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/t$a;,
        Landroidx/camera/core/t$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroidx/camera/core/t$b;)Landroidx/camera/core/t;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/camera/core/t;->b(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)Landroidx/camera/core/t;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)Landroidx/camera/core/t;
    .locals 1

    new-instance v0, Landroidx/camera/core/f;

    invoke-direct {v0, p0, p1}, Landroidx/camera/core/f;-><init>(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Landroidx/camera/core/t$a;
.end method

.method public abstract d()Landroidx/camera/core/t$b;
.end method
