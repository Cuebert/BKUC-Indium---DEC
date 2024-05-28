.class Landroidx/camera/core/z1$a;
.super Lw/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/z1;->M(Ljava/lang/String;Lw/w1;Landroid/util/Size;)Lw/c2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/b1;

.field final synthetic b:Landroidx/camera/core/z1;


# direct methods
.method constructor <init>(Landroidx/camera/core/z1;Lw/b1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/z1$a;->b:Landroidx/camera/core/z1;

    iput-object p2, p0, Landroidx/camera/core/z1$a;->a:Lw/b1;

    invoke-direct {p0}, Lw/h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw/q;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lw/h;->b(Lw/q;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/z1$a;->a:Lw/b1;

    new-instance v1, Lz/b;

    invoke-direct {v1, p1}, Lz/b;-><init>(Lw/q;)V

    invoke-interface {v0, v1}, Lw/b1;->a(Landroidx/camera/core/i1;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Landroidx/camera/core/z1$a;->b:Landroidx/camera/core/z1;

    invoke-virtual {p1}, Landroidx/camera/core/y2;->v()V

    :cond_0
    return-void
.end method
