.class Landroidx/camera/core/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/r0;->p(Landroidx/camera/core/l1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/l1;

.field final synthetic b:Landroidx/camera/core/r0;


# direct methods
.method constructor <init>(Landroidx/camera/core/r0;Landroidx/camera/core/l1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/r0$a;->b:Landroidx/camera/core/r0;

    iput-object p2, p0, Landroidx/camera/core/r0$a;->a:Landroidx/camera/core/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Landroidx/camera/core/r0$a;->a:Landroidx/camera/core/l1;

    invoke-interface {p1}, Landroidx/camera/core/l1;->close()V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/r0$a;->b(Ljava/lang/Void;)V

    return-void
.end method
