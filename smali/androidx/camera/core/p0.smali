.class public final synthetic Landroidx/camera/core/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/core/q0;

.field public final synthetic o:Landroidx/camera/core/l1;

.field public final synthetic p:Landroid/graphics/Matrix;

.field public final synthetic q:Landroidx/camera/core/l1;

.field public final synthetic r:Landroid/graphics/Rect;

.field public final synthetic s:Landroidx/camera/core/n0$a;

.field public final synthetic t:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/q0;Landroidx/camera/core/l1;Landroid/graphics/Matrix;Landroidx/camera/core/l1;Landroid/graphics/Rect;Landroidx/camera/core/n0$a;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/p0;->n:Landroidx/camera/core/q0;

    iput-object p2, p0, Landroidx/camera/core/p0;->o:Landroidx/camera/core/l1;

    iput-object p3, p0, Landroidx/camera/core/p0;->p:Landroid/graphics/Matrix;

    iput-object p4, p0, Landroidx/camera/core/p0;->q:Landroidx/camera/core/l1;

    iput-object p5, p0, Landroidx/camera/core/p0;->r:Landroid/graphics/Rect;

    iput-object p6, p0, Landroidx/camera/core/p0;->s:Landroidx/camera/core/n0$a;

    iput-object p7, p0, Landroidx/camera/core/p0;->t:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Landroidx/camera/core/p0;->n:Landroidx/camera/core/q0;

    iget-object v1, p0, Landroidx/camera/core/p0;->o:Landroidx/camera/core/l1;

    iget-object v2, p0, Landroidx/camera/core/p0;->p:Landroid/graphics/Matrix;

    iget-object v3, p0, Landroidx/camera/core/p0;->q:Landroidx/camera/core/l1;

    iget-object v4, p0, Landroidx/camera/core/p0;->r:Landroid/graphics/Rect;

    iget-object v5, p0, Landroidx/camera/core/p0;->s:Landroidx/camera/core/n0$a;

    iget-object v6, p0, Landroidx/camera/core/p0;->t:Landroidx/concurrent/futures/c$a;

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/q0;->c(Landroidx/camera/core/q0;Landroidx/camera/core/l1;Landroid/graphics/Matrix;Landroidx/camera/core/l1;Landroid/graphics/Rect;Landroidx/camera/core/n0$a;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
