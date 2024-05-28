.class public final synthetic Landroidx/camera/core/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/core/x2$h;

.field public final synthetic o:Landroidx/camera/core/x2$g;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/t2;->n:Landroidx/camera/core/x2$h;

    iput-object p2, p0, Landroidx/camera/core/t2;->o:Landroidx/camera/core/x2$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t2;->n:Landroidx/camera/core/x2$h;

    iget-object v1, p0, Landroidx/camera/core/t2;->o:Landroidx/camera/core/x2$g;

    invoke-static {v0, v1}, Landroidx/camera/core/x2;->d(Landroidx/camera/core/x2$h;Landroidx/camera/core/x2$g;)V

    return-void
.end method
