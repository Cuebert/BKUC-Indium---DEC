.class public final synthetic Landroidx/camera/camera2/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/camera2/internal/t;

.field public final synthetic o:Lw/h;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/t;Lw/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/n;->n:Landroidx/camera/camera2/internal/t;

    iput-object p2, p0, Landroidx/camera/camera2/internal/n;->o:Lw/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/n;->n:Landroidx/camera/camera2/internal/t;

    iget-object v1, p0, Landroidx/camera/camera2/internal/n;->o:Lw/h;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/t;->j(Landroidx/camera/camera2/internal/t;Lw/h;)V

    return-void
.end method
