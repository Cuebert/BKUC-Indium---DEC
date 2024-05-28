.class public final synthetic Landroidx/camera/camera2/internal/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/camera2/internal/g0;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lw/c2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/b0;->n:Landroidx/camera/camera2/internal/g0;

    iput-object p2, p0, Landroidx/camera/camera2/internal/b0;->o:Ljava/lang/String;

    iput-object p3, p0, Landroidx/camera/camera2/internal/b0;->p:Lw/c2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/b0;->n:Landroidx/camera/camera2/internal/g0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/b0;->o:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/camera2/internal/b0;->p:Lw/c2;

    invoke-static {v0, v1, v2}, Landroidx/camera/camera2/internal/g0;->r(Landroidx/camera/camera2/internal/g0;Ljava/lang/String;Lw/c2;)V

    return-void
.end method
