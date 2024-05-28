.class public final synthetic Landroidx/camera/core/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/core/y;

.field public final synthetic o:Ljava/util/concurrent/Executor;

.field public final synthetic p:J

.field public final synthetic q:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/y;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/x;->n:Landroidx/camera/core/y;

    iput-object p2, p0, Landroidx/camera/core/x;->o:Ljava/util/concurrent/Executor;

    iput-wide p3, p0, Landroidx/camera/core/x;->p:J

    iput-object p5, p0, Landroidx/camera/core/x;->q:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/x;->n:Landroidx/camera/core/y;

    iget-object v1, p0, Landroidx/camera/core/x;->o:Ljava/util/concurrent/Executor;

    iget-wide v2, p0, Landroidx/camera/core/x;->p:J

    iget-object v4, p0, Landroidx/camera/core/x;->q:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/core/y;->c(Landroidx/camera/core/y;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    return-void
.end method
