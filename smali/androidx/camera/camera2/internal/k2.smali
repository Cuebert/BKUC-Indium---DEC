.class public final synthetic Landroidx/camera/camera2/internal/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/p2;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lr/a0;

.field public final synthetic d:Ls/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/p2;Ljava/util/List;Lr/a0;Ls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/k2;->a:Landroidx/camera/camera2/internal/p2;

    iput-object p2, p0, Landroidx/camera/camera2/internal/k2;->b:Ljava/util/List;

    iput-object p3, p0, Landroidx/camera/camera2/internal/k2;->c:Lr/a0;

    iput-object p4, p0, Landroidx/camera/camera2/internal/k2;->d:Ls/g;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/k2;->a:Landroidx/camera/camera2/internal/p2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/k2;->b:Ljava/util/List;

    iget-object v2, p0, Landroidx/camera/camera2/internal/k2;->c:Lr/a0;

    iget-object v3, p0, Landroidx/camera/camera2/internal/k2;->d:Ls/g;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/camera/camera2/internal/p2;->w(Landroidx/camera/camera2/internal/p2;Ljava/util/List;Lr/a0;Ls/g;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
