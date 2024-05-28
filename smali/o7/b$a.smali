.class Lo7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/b;->h(Lcom/roblox/client/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/s<",
        "Landroid/graphics/Rect;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo7/b;


# direct methods
.method constructor <init>(Lo7/b;)V
    .locals 0

    iput-object p1, p0, Lo7/b$a;->a:Lo7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lo7/b$a;->b(Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Landroid/graphics/Rect;)V
    .locals 4

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lo7/b$a;->a:Lo7/b;

    invoke-static {v0}, Lo7/b;->a(Lo7/b;)Lf7/f0;

    move-result-object v0

    sget-object v1, Lf7/f0;->n:Lf7/f0;

    if-ne v0, v1, :cond_0

    .line 2
    iget-object p1, p0, Lo7/b$a;->a:Lo7/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Lo7/b;->b(IIII)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lo7/b$a;->a:Lo7/b;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->left:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, p1}, Lo7/b;->b(IIII)V

    :cond_1
    :goto_0
    return-void
.end method
