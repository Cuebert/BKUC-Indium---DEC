.class public final synthetic Landroidx/camera/camera2/internal/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/camera2/internal/g0;

.field public final synthetic o:Landroidx/camera/camera2/internal/q1;

.field public final synthetic p:Lw/r0;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/g0;Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/x;->n:Landroidx/camera/camera2/internal/g0;

    iput-object p2, p0, Landroidx/camera/camera2/internal/x;->o:Landroidx/camera/camera2/internal/q1;

    iput-object p3, p0, Landroidx/camera/camera2/internal/x;->p:Lw/r0;

    iput-object p4, p0, Landroidx/camera/camera2/internal/x;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/x;->n:Landroidx/camera/camera2/internal/g0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/x;->o:Landroidx/camera/camera2/internal/q1;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x;->p:Lw/r0;

    iget-object v3, p0, Landroidx/camera/camera2/internal/x;->q:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/camera2/internal/g0;->p(Landroidx/camera/camera2/internal/g0;Landroidx/camera/camera2/internal/q1;Lw/r0;Ljava/lang/Runnable;)V

    return-void
.end method
