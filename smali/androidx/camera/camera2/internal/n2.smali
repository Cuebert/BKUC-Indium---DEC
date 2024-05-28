.class public final synthetic Landroidx/camera/camera2/internal/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/camera2/internal/p2;

.field public final synthetic o:Landroidx/camera/camera2/internal/j2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/p2;Landroidx/camera/camera2/internal/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/n2;->n:Landroidx/camera/camera2/internal/p2;

    iput-object p2, p0, Landroidx/camera/camera2/internal/n2;->o:Landroidx/camera/camera2/internal/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/n2;->n:Landroidx/camera/camera2/internal/p2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/n2;->o:Landroidx/camera/camera2/internal/j2;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/p2;->x(Landroidx/camera/camera2/internal/p2;Landroidx/camera/camera2/internal/j2;)V

    return-void
.end method
