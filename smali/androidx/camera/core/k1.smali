.class public final synthetic Landroidx/camera/core/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/i0$a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/l1;

.field public final synthetic b:Landroidx/camera/core/l1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/l1;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/k1;->a:Landroidx/camera/core/l1;

    iput-object p2, p0, Landroidx/camera/core/k1;->b:Landroidx/camera/core/l1;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/camera/core/l1;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/k1;->a:Landroidx/camera/core/l1;

    iget-object v1, p0, Landroidx/camera/core/k1;->b:Landroidx/camera/core/l1;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/ImageProcessingUtil;->b(Landroidx/camera/core/l1;Landroidx/camera/core/l1;Landroidx/camera/core/l1;)V

    return-void
.end method
