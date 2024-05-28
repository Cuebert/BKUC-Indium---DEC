.class Lm0/j;
.super Lm0/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ll0/e;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lm0/p;-><init>(Ll0/e;)V

    .line 2
    iget-object v0, p1, Ll0/e;->e:Lm0/l;

    invoke-virtual {v0}, Lm0/l;->f()V

    .line 3
    iget-object v0, p1, Ll0/e;->f:Lm0/n;

    invoke-virtual {v0}, Lm0/n;->f()V

    .line 4
    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->b1()I

    move-result p1

    iput p1, p0, Lm0/p;->f:I

    return-void
.end method

.method private q(Lm0/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p1, Lm0/f;->l:Ljava/util/List;

    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Lm0/d;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lm0/p;->h:Lm0/f;

    iget-boolean v0, p1, Lm0/f;->c:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p1, Lm0/f;->j:Z

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object p1, p1, Lm0/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/f;

    .line 4
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    check-cast v0, Ll0/g;

    const/high16 v1, 0x3f000000    # 0.5f

    .line 5
    iget p1, p1, Lm0/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Ll0/g;->e1()F

    move-result v0

    mul-float p1, p1, v0

    add-float/2addr p1, v1

    float-to-int p1, p1

    .line 6
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    invoke-virtual {v0, p1}, Lm0/f;->d(I)V

    return-void
.end method

.method d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    check-cast v0, Ll0/g;

    .line 2
    invoke-virtual {v0}, Ll0/g;->c1()I

    move-result v1

    .line 3
    invoke-virtual {v0}, Ll0/g;->d1()I

    move-result v2

    .line 4
    invoke-virtual {v0}, Ll0/g;->e1()F

    .line 5
    invoke-virtual {v0}, Ll0/g;->b1()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v0, v3, :cond_2

    if-eq v1, v4, :cond_0

    .line 6
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->T:Ll0/e;

    iget-object v2, v2, Ll0/e;->e:Lm0/l;

    iget-object v2, v2, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v2, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iput v1, v0, Lm0/f;->f:I

    goto :goto_0

    :cond_0
    if-eq v2, v4, :cond_1

    .line 9
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->T:Ll0/e;

    iget-object v1, v1, Ll0/e;->e:Lm0/l;

    iget-object v1, v1, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    neg-int v1, v2

    iput v1, v0, Lm0/f;->f:I

    goto :goto_0

    .line 12
    :cond_1
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iput-boolean v3, v0, Lm0/f;->b:Z

    .line 13
    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->T:Ll0/e;

    iget-object v1, v1, Ll0/e;->e:Lm0/l;

    iget-object v1, v1, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    :goto_0
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    invoke-direct {p0, v0}, Lm0/j;->q(Lm0/f;)V

    .line 16
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    invoke-direct {p0, v0}, Lm0/j;->q(Lm0/f;)V

    goto/16 :goto_2

    :cond_2
    if-eq v1, v4, :cond_3

    .line 17
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->T:Ll0/e;

    iget-object v2, v2, Ll0/e;->f:Lm0/n;

    iget-object v2, v2, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v2, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iput v1, v0, Lm0/f;->f:I

    goto :goto_1

    :cond_3
    if-eq v2, v4, :cond_4

    .line 20
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->T:Ll0/e;

    iget-object v1, v1, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    neg-int v1, v2

    iput v1, v0, Lm0/f;->f:I

    goto :goto_1

    .line 23
    :cond_4
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iput-boolean v3, v0, Lm0/f;->b:Z

    .line 24
    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->T:Ll0/e;

    iget-object v1, v1, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    :goto_1
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    invoke-direct {p0, v0}, Lm0/j;->q(Lm0/f;)V

    .line 27
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    invoke-direct {p0, v0}, Lm0/j;->q(Lm0/f;)V

    :goto_2
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    check-cast v0, Ll0/g;

    .line 2
    invoke-virtual {v0}, Ll0/g;->b1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget v1, v1, Lm0/f;->g:I

    invoke-virtual {v0, v1}, Ll0/e;->V0(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget v1, v1, Lm0/f;->g:I

    invoke-virtual {v0, v1}, Ll0/e;->W0(I)V

    :goto_0
    return-void
.end method

.method f()V
    .locals 1

    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    invoke-virtual {v0}, Lm0/f;->c()V

    return-void
.end method

.method m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
