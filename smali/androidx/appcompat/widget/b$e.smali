.class Landroidx/appcompat/widget/b$e;
.super Landroidx/appcompat/view/menu/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic m:Landroidx/appcompat/widget/b;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/b;Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;Z)V
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/b$e;->m:Landroidx/appcompat/widget/b;

    .line 2
    sget v5, Ld/a;->n:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/view/menu/i;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;ZI)V

    const p2, 0x800005

    .line 3
    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/i;->j(I)V

    .line 4
    iget-object p1, p1, Landroidx/appcompat/widget/b;->P:Landroidx/appcompat/widget/b$f;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/i;->l(Landroidx/appcompat/view/menu/j$a;)V

    return-void
.end method


# virtual methods
.method protected g()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/b$e;->m:Landroidx/appcompat/widget/b;

    invoke-static {v0}, Landroidx/appcompat/widget/b;->s(Landroidx/appcompat/widget/b;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/b$e;->m:Landroidx/appcompat/widget/b;

    invoke-static {v0}, Landroidx/appcompat/widget/b;->t(Landroidx/appcompat/widget/b;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/b$e;->m:Landroidx/appcompat/widget/b;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/b;->L:Landroidx/appcompat/widget/b$e;

    .line 4
    invoke-super {p0}, Landroidx/appcompat/view/menu/i;->g()V

    return-void
.end method
