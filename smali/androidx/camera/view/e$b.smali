.class Landroidx/camera/view/e$b;
.super Lw/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/e;->i(Landroidx/camera/core/r;Ljava/util/List;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Landroidx/camera/core/r;

.field final synthetic c:Landroidx/camera/view/e;


# direct methods
.method constructor <init>(Landroidx/camera/view/e;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/e$b;->c:Landroidx/camera/view/e;

    iput-object p2, p0, Landroidx/camera/view/e$b;->a:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Landroidx/camera/view/e$b;->b:Landroidx/camera/core/r;

    invoke-direct {p0}, Lw/h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw/q;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/camera/view/e$b;->a:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p0, Landroidx/camera/view/e$b;->b:Landroidx/camera/core/r;

    check-cast p1, Lw/b0;

    invoke-interface {p1, p0}, Lw/b0;->b(Lw/h;)V

    return-void
.end method
