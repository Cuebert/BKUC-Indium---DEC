.class public final synthetic Landroidx/camera/camera2/internal/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/camera2/internal/g0;

.field public final synthetic o:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/g0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/d0;->n:Landroidx/camera/camera2/internal/g0;

    iput-object p2, p0, Landroidx/camera/camera2/internal/d0;->o:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/d0;->n:Landroidx/camera/camera2/internal/g0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/d0;->o:Ljava/util/List;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/g0;->v(Landroidx/camera/camera2/internal/g0;Ljava/util/List;)V

    return-void
.end method
