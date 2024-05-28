.class public final synthetic Landroidx/camera/core/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/n0$a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/n0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/n0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/j0;->a:Landroidx/camera/core/n0$a;

    return-void
.end method


# virtual methods
.method public synthetic a()Landroid/util/Size;
    .locals 1

    invoke-static {p0}, Landroidx/camera/core/m0;->a(Landroidx/camera/core/n0$a;)Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroidx/camera/core/l1;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/j0;->a:Landroidx/camera/core/n0$a;

    invoke-static {v0, p1}, Landroidx/camera/core/n0;->K(Landroidx/camera/core/n0$a;Landroidx/camera/core/l1;)V

    return-void
.end method
