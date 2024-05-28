.class Landroidx/camera/core/x2$b;
.super Lw/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/x2;-><init>(Landroid/util/Size;Lw/d0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroidx/camera/core/x2;


# direct methods
.method constructor <init>(Landroidx/camera/core/x2;Landroid/util/Size;I)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/x2$b;->m:Landroidx/camera/core/x2;

    invoke-direct {p0, p2, p3}, Lw/r0;-><init>(Landroid/util/Size;I)V

    return-void
.end method


# virtual methods
.method protected n()Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/m<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/x2$b;->m:Landroidx/camera/core/x2;

    iget-object v0, v0, Landroidx/camera/core/x2;->e:Lcom/google/common/util/concurrent/m;

    return-object v0
.end method
