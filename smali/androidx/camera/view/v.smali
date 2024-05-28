.class public final synthetic Landroidx/camera/view/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/view/x;

.field public final synthetic o:Landroid/view/Surface;

.field public final synthetic p:Lcom/google/common/util/concurrent/m;

.field public final synthetic q:Landroidx/camera/core/x2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/x;Landroid/view/Surface;Lcom/google/common/util/concurrent/m;Landroidx/camera/core/x2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/v;->n:Landroidx/camera/view/x;

    iput-object p2, p0, Landroidx/camera/view/v;->o:Landroid/view/Surface;

    iput-object p3, p0, Landroidx/camera/view/v;->p:Lcom/google/common/util/concurrent/m;

    iput-object p4, p0, Landroidx/camera/view/v;->q:Landroidx/camera/core/x2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/v;->n:Landroidx/camera/view/x;

    iget-object v1, p0, Landroidx/camera/view/v;->o:Landroid/view/Surface;

    iget-object v2, p0, Landroidx/camera/view/v;->p:Lcom/google/common/util/concurrent/m;

    iget-object v3, p0, Landroidx/camera/view/v;->q:Landroidx/camera/core/x2;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/view/x;->l(Landroidx/camera/view/x;Landroid/view/Surface;Lcom/google/common/util/concurrent/m;Landroidx/camera/core/x2;)V

    return-void
.end method
