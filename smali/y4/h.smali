.class public Ly4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(I)Ly4/d;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    .line 1
    invoke-static {}, Ly4/h;->b()Ly4/d;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ly4/e;

    invoke-direct {p0}, Ly4/e;-><init>()V

    return-object p0

    .line 3
    :cond_1
    new-instance p0, Ly4/j;

    invoke-direct {p0}, Ly4/j;-><init>()V

    return-object p0
.end method

.method static b()Ly4/d;
    .locals 1

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    return-object v0
.end method

.method static c()Ly4/f;
    .locals 1

    new-instance v0, Ly4/f;

    invoke-direct {v0}, Ly4/f;-><init>()V

    return-object v0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 2
    instance-of v0, p0, Ly4/g;

    if-eqz v0, :cond_0

    .line 3
    check-cast p0, Ly4/g;

    invoke-virtual {p0, p1}, Ly4/g;->W(F)V

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2
    instance-of v1, v0, Ly4/g;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Ly4/g;

    invoke-static {p0, v0}, Ly4/h;->f(Landroid/view/View;Ly4/g;)V

    :cond_0
    return-void
.end method

.method public static f(Landroid/view/View;Ly4/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ly4/g;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/google/android/material/internal/l;->c(Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, Ly4/g;->a0(F)V

    :cond_0
    return-void
.end method
