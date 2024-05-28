.class public final synthetic Landroidx/camera/camera2/internal/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/camera2/internal/p2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/p2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/l2;->n:Landroidx/camera/camera2/internal/p2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/l2;->n:Landroidx/camera/camera2/internal/p2;

    invoke-static {v0}, Landroidx/camera/camera2/internal/p2;->z(Landroidx/camera/camera2/internal/p2;)V

    return-void
.end method
