.class public final synthetic Landroidx/camera/core/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/core/util/a;

.field public final synthetic o:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/util/a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/w2;->n:Landroidx/core/util/a;

    iput-object p2, p0, Landroidx/camera/core/w2;->o:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w2;->n:Landroidx/core/util/a;

    iget-object v1, p0, Landroidx/camera/core/w2;->o:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/core/x2;->b(Landroidx/core/util/a;Landroid/view/Surface;)V

    return-void
.end method
