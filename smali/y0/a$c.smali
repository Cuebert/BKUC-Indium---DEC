.class Ly0/a$c;
.super Landroidx/core/view/accessibility/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Ly0/a;


# direct methods
.method constructor <init>(Ly0/a;)V
    .locals 0

    iput-object p1, p0, Ly0/a$c;->b:Ly0/a;

    invoke-direct {p0}, Landroidx/core/view/accessibility/d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)Landroidx/core/view/accessibility/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0/a$c;->b:Ly0/a;

    .line 2
    invoke-virtual {v0, p1}, Ly0/a;->H(I)Landroidx/core/view/accessibility/c;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroidx/core/view/accessibility/c;->N(Landroidx/core/view/accessibility/c;)Landroidx/core/view/accessibility/c;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Landroidx/core/view/accessibility/c;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Ly0/a$c;->b:Ly0/a;

    iget p1, p1, Ly0/a;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ly0/a$c;->b:Ly0/a;

    iget p1, p1, Ly0/a;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_1
    invoke-virtual {p0, p1}, Ly0/a$c;->b(I)Landroidx/core/view/accessibility/c;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Ly0/a$c;->b:Ly0/a;

    invoke-virtual {v0, p1, p2, p3}, Ly0/a;->P(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
