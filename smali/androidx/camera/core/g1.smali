.class public final synthetic Landroidx/camera/core/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/core/e1$h;

.field public final synthetic o:Landroidx/camera/core/l1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/e1$h;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/g1;->n:Landroidx/camera/core/e1$h;

    iput-object p2, p0, Landroidx/camera/core/g1;->o:Landroidx/camera/core/l1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/g1;->n:Landroidx/camera/core/e1$h;

    iget-object v1, p0, Landroidx/camera/core/g1;->o:Landroidx/camera/core/l1;

    invoke-static {v0, v1}, Landroidx/camera/core/e1$h;->b(Landroidx/camera/core/e1$h;Landroidx/camera/core/l1;)V

    return-void
.end method
