.class public Lo7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/p;


# instance fields
.field private n:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private o:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/r;

    invoke-direct {v0}, Landroidx/lifecycle/r;-><init>()V

    iput-object v0, p0, Lo7/a;->n:Landroidx/lifecycle/r;

    .line 3
    new-instance v0, Landroidx/lifecycle/r;

    invoke-direct {v0}, Landroidx/lifecycle/r;-><init>()V

    iput-object v0, p0, Lo7/a;->o:Landroidx/lifecycle/r;

    return-void
.end method


# virtual methods
.method public L(Landroid/view/View;Landroidx/core/view/g0;)Landroidx/core/view/g0;
    .locals 2

    .line 1
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 2
    invoke-virtual {p2}, Landroidx/core/view/g0;->l()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 3
    invoke-virtual {p2}, Landroidx/core/view/g0;->j()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 4
    invoke-virtual {p2}, Landroidx/core/view/g0;->k()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 5
    invoke-virtual {p2}, Landroidx/core/view/g0;->i()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 6
    iget-object v0, p0, Lo7/a;->n:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->o(Ljava/lang/Object;)V

    .line 7
    invoke-static {}, Landroidx/core/view/g0$m;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Landroidx/core/view/g0;->f(I)Landroidx/core/graphics/b;

    move-result-object p1

    .line 8
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    iget v1, p1, Landroidx/core/graphics/b;->a:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 10
    iget v1, p1, Landroidx/core/graphics/b;->b:I

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 11
    iget v1, p1, Landroidx/core/graphics/b;->c:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 12
    iget p1, p1, Landroidx/core/graphics/b;->d:I

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 13
    iget-object p1, p0, Lo7/a;->o:Landroidx/lifecycle/r;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/r;->o(Ljava/lang/Object;)V

    return-object p2
.end method

.method public a()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo7/a;->o:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public b()Landroidx/lifecycle/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/r<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo7/a;->n:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public c()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lo7/a;->n:Landroidx/lifecycle/r;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    invoke-static {p1, p0}, Landroidx/core/view/v;->B0(Landroid/view/View;Landroidx/core/view/p;)V

    return-void
.end method
