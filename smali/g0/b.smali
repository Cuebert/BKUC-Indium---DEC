.class Lg0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/d;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private n(Lg0/c;)Lg0/e;
    .locals 0

    invoke-interface {p1}, Lg0/c;->e()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lg0/e;

    return-object p1
.end method


# virtual methods
.method public a(Lg0/c;)F
    .locals 0

    invoke-direct {p0, p1}, Lg0/b;->n(Lg0/c;)Lg0/e;

    move-result-object p1

    invoke-virtual {p1}, Lg0/e;->c()F

    move-result p1

    return p1
.end method

.method public b(Lg0/c;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/b;->n(Lg0/c;)Lg0/e;

    move-result-object p1

    invoke-virtual {p1, p2}, Lg0/e;->f(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public c(Lg0/c;F)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lg0/b;->n(Lg0/c;)Lg0/e;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Lg0/c;->d()Z

    move-result v1

    invoke-interface {p1}, Lg0/c;->c()Z

    move-result v2

    .line 3
    invoke-virtual {v0, p2, v1, v2}, Lg0/e;->g(FZZ)V

    .line 4
    invoke-virtual {p0, p1}, Lg0/b;->o(Lg0/c;)V

    return-void
.end method

.method public d(Lg0/c;F)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/b;->n(Lg0/c;)Lg0/e;

    move-result-object p1

    invoke-virtual {p1, p2}, Lg0/e;->h(F)V

    return-void
.end method

.method public e(Lg0/c;)F
    .locals 1

    invoke-virtual {p0, p1}, Lg0/b;->h(Lg0/c;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g(Lg0/c;F)V
    .locals 0

    invoke-interface {p1}, Lg0/c;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public h(Lg0/c;)F
    .locals 0

    invoke-direct {p0, p1}, Lg0/b;->n(Lg0/c;)Lg0/e;

    move-result-object p1

    invoke-virtual {p1}, Lg0/e;->d()F

    move-result p1

    return p1
.end method

.method public i(Lg0/c;)F
    .locals 1

    invoke-virtual {p0, p1}, Lg0/b;->h(Lg0/c;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public j(Lg0/c;)V
    .locals 1

    invoke-virtual {p0, p1}, Lg0/b;->a(Lg0/c;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lg0/b;->c(Lg0/c;F)V

    return-void
.end method

.method public k(Lg0/c;)F
    .locals 0

    invoke-interface {p1}, Lg0/c;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public l(Lg0/c;)V
    .locals 1

    invoke-virtual {p0, p1}, Lg0/b;->a(Lg0/c;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lg0/b;->c(Lg0/c;F)V

    return-void
.end method

.method public m(Lg0/c;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-direct {p0, p1}, Lg0/b;->n(Lg0/c;)Lg0/e;

    move-result-object p1

    invoke-virtual {p1}, Lg0/e;->b()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public o(Lg0/c;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lg0/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, v0, v0, v0}, Lg0/c;->a(IIII)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lg0/b;->a(Lg0/c;)F

    move-result v0

    .line 4
    invoke-virtual {p0, p1}, Lg0/b;->h(Lg0/c;)F

    move-result v1

    .line 5
    invoke-interface {p1}, Lg0/c;->c()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lg0/f;->a(FFZ)F

    move-result v2

    float-to-double v2, v2

    .line 6
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 7
    invoke-interface {p1}, Lg0/c;->c()Z

    move-result v3

    invoke-static {v0, v1, v3}, Lg0/f;->b(FFZ)F

    move-result v0

    float-to-double v0, v0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 9
    invoke-interface {p1, v2, v0, v2, v0}, Lg0/c;->a(IIII)V

    return-void
.end method
