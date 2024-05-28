.class Landroidx/camera/core/t1$a;
.super Lw/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/t1;


# direct methods
.method constructor <init>(Landroidx/camera/core/t1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/t1$a;->a:Landroidx/camera/core/t1;

    invoke-direct {p0}, Lw/h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw/q;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lw/h;->b(Lw/q;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/t1$a;->a:Landroidx/camera/core/t1;

    invoke-virtual {v0, p1}, Landroidx/camera/core/t1;->u(Lw/q;)V

    return-void
.end method
