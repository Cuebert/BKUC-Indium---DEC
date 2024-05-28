.class final Landroidx/camera/camera2/internal/g0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/g0;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/g0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/g0$e;->a:Landroidx/camera/camera2/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$e;->a:Landroidx/camera/camera2/internal/g0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0;->p0()V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$e;->a:Landroidx/camera/camera2/internal/g0;

    invoke-static {p1}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/g0;->j0(Ljava/util/List;)V

    return-void
.end method
