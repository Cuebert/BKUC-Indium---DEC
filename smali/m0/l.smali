.class public Lm0/l;
.super Lm0/p;
.source "SourceFile"


# static fields
.field private static k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Lm0/l;->k:[I

    return-void
.end method

.method public constructor <init>(Ll0/e;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lm0/p;-><init>(Ll0/e;)V

    .line 2
    iget-object p1, p0, Lm0/p;->h:Lm0/f;

    sget-object v0, Lm0/f$a;->q:Lm0/f$a;

    iput-object v0, p1, Lm0/f;->e:Lm0/f$a;

    .line 3
    iget-object p1, p0, Lm0/p;->i:Lm0/f;

    sget-object v0, Lm0/f$a;->r:Lm0/f$a;

    iput-object v0, p1, Lm0/f;->e:Lm0/f$a;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lm0/p;->f:I

    return-void
.end method

.method private q([IIIIIFI)V
    .locals 2

    sub-int/2addr p3, p2

    sub-int/2addr p5, p4

    const/4 p2, -0x1

    const/4 p4, 0x0

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    if-eq p7, p2, :cond_2

    if-eqz p7, :cond_1

    if-eq p7, v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p2, p3

    mul-float p2, p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    .line 1
    aput p3, p1, p4

    .line 2
    aput p2, p1, v1

    goto :goto_0

    :cond_1
    int-to-float p2, p5

    mul-float p2, p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    .line 3
    aput p2, p1, p4

    .line 4
    aput p5, p1, v1

    goto :goto_0

    :cond_2
    int-to-float p2, p5

    mul-float p2, p2, p6

    add-float/2addr p2, v0

    float-to-int p2, p2

    int-to-float p7, p3

    div-float/2addr p7, p6

    add-float/2addr p7, v0

    float-to-int p6, p7

    if-gt p2, p3, :cond_3

    .line 5
    aput p2, p1, p4

    .line 6
    aput p5, p1, v1

    goto :goto_0

    :cond_3
    if-gt p6, p5, :cond_4

    .line 7
    aput p3, p1, p4

    .line 8
    aput p6, p1, v1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lm0/d;)V
    .locals 16

    move-object/from16 v8, p0

    .line 1
    sget-object v0, Lm0/l$a;->a:[I

    iget-object v1, v8, Lm0/p;->j:Lm0/p$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v0, v9, :cond_2

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v1, v0, Ll0/e;->H:Ll0/d;

    iget-object v0, v0, Ll0/e;->J:Ll0/d;

    move-object/from16 v3, p1

    invoke-virtual {v8, v3, v1, v0, v10}, Lm0/p;->n(Lm0/d;Ll0/d;Ll0/d;I)V

    return-void

    :cond_1
    move-object/from16 v3, p1

    .line 3
    invoke-virtual/range {p0 .. p1}, Lm0/p;->o(Lm0/d;)V

    goto :goto_0

    :cond_2
    move-object/from16 v3, p1

    .line 4
    invoke-virtual/range {p0 .. p1}, Lm0/p;->p(Lm0/d;)V

    .line 5
    :goto_0
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget-boolean v0, v0, Lm0/f;->j:Z

    const/high16 v11, 0x3f000000    # 0.5f

    if-nez v0, :cond_24

    .line 6
    iget-object v0, v8, Lm0/p;->d:Ll0/e$b;

    sget-object v3, Ll0/e$b;->p:Ll0/e$b;

    if-ne v0, v3, :cond_24

    .line 7
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget v3, v0, Ll0/e;->p:I

    if-eq v3, v1, :cond_23

    if-eq v3, v2, :cond_3

    goto/16 :goto_f

    .line 8
    :cond_3
    iget v1, v0, Ll0/e;->q:I

    const/4 v3, -0x1

    if-eqz v1, :cond_8

    if-ne v1, v2, :cond_4

    goto :goto_4

    .line 9
    :cond_4
    invoke-virtual {v0}, Ll0/e;->u()I

    move-result v0

    if-eq v0, v3, :cond_7

    if-eqz v0, :cond_6

    if-eq v0, v9, :cond_5

    const/4 v0, 0x0

    goto :goto_3

    .line 10
    :cond_5
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v1, v0, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->e:Lm0/g;

    iget v1, v1, Lm0/f;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, Ll0/e;->t()F

    move-result v0

    goto :goto_1

    .line 11
    :cond_6
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v1, v0, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->e:Lm0/g;

    iget v1, v1, Lm0/f;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, Ll0/e;->t()F

    move-result v0

    div-float/2addr v1, v0

    goto :goto_2

    .line 12
    :cond_7
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v1, v0, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->e:Lm0/g;

    iget v1, v1, Lm0/f;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, Ll0/e;->t()F

    move-result v0

    :goto_1
    mul-float v1, v1, v0

    :goto_2
    add-float/2addr v1, v11

    float-to-int v0, v1

    .line 13
    :goto_3
    iget-object v1, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v1, v0}, Lm0/g;->d(I)V

    goto/16 :goto_f

    .line 14
    :cond_8
    :goto_4
    iget-object v1, v0, Ll0/e;->f:Lm0/n;

    iget-object v12, v1, Lm0/p;->h:Lm0/f;

    .line 15
    iget-object v13, v1, Lm0/p;->i:Lm0/f;

    .line 16
    iget-object v1, v0, Ll0/e;->H:Ll0/d;

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_5

    :cond_9
    const/4 v1, 0x0

    .line 17
    :goto_5
    iget-object v2, v0, Ll0/e;->I:Ll0/d;

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    .line 18
    :goto_6
    iget-object v4, v0, Ll0/e;->J:Ll0/d;

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_b

    const/4 v4, 0x1

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    .line 19
    :goto_7
    iget-object v5, v0, Ll0/e;->K:Ll0/d;

    iget-object v5, v5, Ll0/d;->f:Ll0/d;

    if-eqz v5, :cond_c

    const/4 v5, 0x1

    goto :goto_8

    :cond_c
    const/4 v5, 0x0

    .line 20
    :goto_8
    invoke-virtual {v0}, Ll0/e;->u()I

    move-result v14

    if-eqz v1, :cond_15

    if-eqz v2, :cond_15

    if-eqz v4, :cond_15

    if-eqz v5, :cond_15

    .line 21
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->t()F

    move-result v15

    .line 22
    iget-boolean v0, v12, Lm0/f;->j:Z

    if-eqz v0, :cond_f

    iget-boolean v0, v13, Lm0/f;->j:Z

    if-eqz v0, :cond_f

    .line 23
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-boolean v1, v0, Lm0/f;->c:Z

    if-eqz v1, :cond_e

    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-boolean v1, v1, Lm0/f;->c:Z

    if-nez v1, :cond_d

    goto :goto_9

    .line 24
    :cond_d
    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget-object v1, v8, Lm0/p;->h:Lm0/f;

    iget v1, v1, Lm0/f;->f:I

    add-int v2, v0, v1

    .line 25
    iget-object v0, v8, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget v1, v1, Lm0/f;->f:I

    sub-int v3, v0, v1

    .line 26
    iget v0, v12, Lm0/f;->g:I

    iget v1, v12, Lm0/f;->f:I

    add-int v4, v0, v1

    .line 27
    iget v0, v13, Lm0/f;->g:I

    iget v1, v13, Lm0/f;->f:I

    sub-int v5, v0, v1

    .line 28
    sget-object v1, Lm0/l;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-direct/range {v0 .. v7}, Lm0/l;->q([IIIIIFI)V

    .line 29
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    sget-object v1, Lm0/l;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    .line 30
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    sget-object v1, Lm0/l;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    :cond_e
    :goto_9
    return-void

    .line 31
    :cond_f
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-boolean v1, v0, Lm0/f;->j:Z

    if-eqz v1, :cond_12

    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-boolean v2, v1, Lm0/f;->j:Z

    if-eqz v2, :cond_12

    .line 32
    iget-boolean v2, v12, Lm0/f;->c:Z

    if-eqz v2, :cond_11

    iget-boolean v2, v13, Lm0/f;->c:Z

    if-nez v2, :cond_10

    goto :goto_a

    .line 33
    :cond_10
    iget v2, v0, Lm0/f;->g:I

    iget v0, v0, Lm0/f;->f:I

    add-int/2addr v2, v0

    .line 34
    iget v0, v1, Lm0/f;->g:I

    iget v1, v1, Lm0/f;->f:I

    sub-int v3, v0, v1

    .line 35
    iget-object v0, v12, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget v1, v12, Lm0/f;->f:I

    add-int v4, v0, v1

    .line 36
    iget-object v0, v13, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget v1, v13, Lm0/f;->f:I

    sub-int v5, v0, v1

    .line 37
    sget-object v1, Lm0/l;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-direct/range {v0 .. v7}, Lm0/l;->q([IIIIIFI)V

    .line 38
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    sget-object v1, Lm0/l;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    .line 39
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    sget-object v1, Lm0/l;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    goto :goto_b

    :cond_11
    :goto_a
    return-void

    .line 40
    :cond_12
    :goto_b
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-boolean v1, v0, Lm0/f;->c:Z

    if-eqz v1, :cond_14

    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-boolean v1, v1, Lm0/f;->c:Z

    if-eqz v1, :cond_14

    iget-boolean v1, v12, Lm0/f;->c:Z

    if-eqz v1, :cond_14

    iget-boolean v1, v13, Lm0/f;->c:Z

    if-nez v1, :cond_13

    goto :goto_c

    .line 41
    :cond_13
    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget-object v1, v8, Lm0/p;->h:Lm0/f;

    iget v1, v1, Lm0/f;->f:I

    add-int v2, v0, v1

    .line 42
    iget-object v0, v8, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget v1, v1, Lm0/f;->f:I

    sub-int v3, v0, v1

    .line 43
    iget-object v0, v12, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget v1, v12, Lm0/f;->f:I

    add-int v4, v0, v1

    .line 44
    iget-object v0, v13, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    iget v1, v13, Lm0/f;->f:I

    sub-int v5, v0, v1

    .line 45
    sget-object v1, Lm0/l;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-direct/range {v0 .. v7}, Lm0/l;->q([IIIIIFI)V

    .line 46
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    sget-object v1, Lm0/l;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    .line 47
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    sget-object v1, Lm0/l;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    goto/16 :goto_f

    :cond_14
    :goto_c
    return-void

    :cond_15
    if-eqz v1, :cond_1c

    if-eqz v4, :cond_1c

    .line 48
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->c:Z

    if-eqz v0, :cond_1b

    iget-object v0, v8, Lm0/p;->i:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->c:Z

    if-nez v0, :cond_16

    goto/16 :goto_d

    .line 49
    :cond_16
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->t()F

    move-result v0

    .line 50
    iget-object v1, v8, Lm0/p;->h:Lm0/f;

    iget-object v1, v1, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/f;

    iget v1, v1, Lm0/f;->g:I

    iget-object v2, v8, Lm0/p;->h:Lm0/f;

    iget v2, v2, Lm0/f;->f:I

    add-int/2addr v1, v2

    .line 51
    iget-object v2, v8, Lm0/p;->i:Lm0/f;

    iget-object v2, v2, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/f;

    iget v2, v2, Lm0/f;->g:I

    iget-object v4, v8, Lm0/p;->i:Lm0/f;

    iget v4, v4, Lm0/f;->f:I

    sub-int/2addr v2, v4

    if-eq v14, v3, :cond_19

    if-eqz v14, :cond_19

    if-eq v14, v9, :cond_17

    goto/16 :goto_f

    :cond_17
    sub-int/2addr v2, v1

    .line 52
    invoke-virtual {v8, v2, v10}, Lm0/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    .line 53
    invoke-virtual {v8, v2, v9}, Lm0/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_18

    int-to-float v1, v3

    mul-float v1, v1, v0

    add-float/2addr v1, v11

    float-to-int v1, v1

    .line 54
    :cond_18
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    .line 55
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v3}, Lm0/g;->d(I)V

    goto/16 :goto_f

    :cond_19
    sub-int/2addr v2, v1

    .line 56
    invoke-virtual {v8, v2, v10}, Lm0/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float v2, v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    .line 57
    invoke-virtual {v8, v2, v9}, Lm0/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1a

    int-to-float v1, v3

    div-float/2addr v1, v0

    add-float/2addr v1, v11

    float-to-int v1, v1

    .line 58
    :cond_1a
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    .line 59
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v3}, Lm0/g;->d(I)V

    goto/16 :goto_f

    :cond_1b
    :goto_d
    return-void

    :cond_1c
    if-eqz v2, :cond_24

    if-eqz v5, :cond_24

    .line 60
    iget-boolean v0, v12, Lm0/f;->c:Z

    if-eqz v0, :cond_22

    iget-boolean v0, v13, Lm0/f;->c:Z

    if-nez v0, :cond_1d

    goto :goto_e

    .line 61
    :cond_1d
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->t()F

    move-result v0

    .line 62
    iget-object v1, v12, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/f;

    iget v1, v1, Lm0/f;->g:I

    iget v2, v12, Lm0/f;->f:I

    add-int/2addr v1, v2

    .line 63
    iget-object v2, v13, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/f;

    iget v2, v2, Lm0/f;->g:I

    iget v4, v13, Lm0/f;->f:I

    sub-int/2addr v2, v4

    if-eq v14, v3, :cond_20

    if-eqz v14, :cond_1e

    if-eq v14, v9, :cond_20

    goto :goto_f

    :cond_1e
    sub-int/2addr v2, v1

    .line 64
    invoke-virtual {v8, v2, v9}, Lm0/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float v2, v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    .line 65
    invoke-virtual {v8, v2, v10}, Lm0/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1f

    int-to-float v1, v3

    div-float/2addr v1, v0

    add-float/2addr v1, v11

    float-to-int v1, v1

    .line 66
    :cond_1f
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v3}, Lm0/g;->d(I)V

    .line 67
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    goto :goto_f

    :cond_20
    sub-int/2addr v2, v1

    .line 68
    invoke-virtual {v8, v2, v9}, Lm0/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    .line 69
    invoke-virtual {v8, v2, v10}, Lm0/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_21

    int-to-float v1, v3

    mul-float v1, v1, v0

    add-float/2addr v1, v11

    float-to-int v1, v1

    .line 70
    :cond_21
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v3}, Lm0/g;->d(I)V

    .line 71
    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    goto :goto_f

    :cond_22
    :goto_e
    return-void

    .line 72
    :cond_23
    invoke-virtual {v0}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 73
    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    iget-boolean v1, v0, Lm0/f;->j:Z

    if-eqz v1, :cond_24

    .line 74
    iget-object v1, v8, Lm0/p;->b:Ll0/e;

    iget v1, v1, Ll0/e;->u:F

    .line 75
    iget v0, v0, Lm0/f;->g:I

    int-to-float v0, v0

    mul-float v0, v0, v1

    add-float/2addr v0, v11

    float-to-int v0, v0

    .line 76
    iget-object v1, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v1, v0}, Lm0/g;->d(I)V

    .line 77
    :cond_24
    :goto_f
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-boolean v1, v0, Lm0/f;->c:Z

    if-eqz v1, :cond_2c

    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-boolean v2, v1, Lm0/f;->c:Z

    if-nez v2, :cond_25

    goto/16 :goto_10

    .line 78
    :cond_25
    iget-boolean v0, v0, Lm0/f;->j:Z

    if-eqz v0, :cond_26

    iget-boolean v0, v1, Lm0/f;->j:Z

    if-eqz v0, :cond_26

    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-eqz v0, :cond_26

    return-void

    .line 79
    :cond_26
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-nez v0, :cond_27

    iget-object v0, v8, Lm0/p;->d:Ll0/e$b;

    sget-object v1, Ll0/e$b;->p:Ll0/e$b;

    if-ne v0, v1, :cond_27

    iget-object v0, v8, Lm0/p;->b:Ll0/e;

    iget v1, v0, Ll0/e;->p:I

    if-nez v1, :cond_27

    .line 80
    invoke-virtual {v0}, Ll0/e;->Z()Z

    move-result v0

    if-nez v0, :cond_27

    .line 81
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    .line 82
    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-object v1, v1, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/f;

    .line 83
    iget v0, v0, Lm0/f;->g:I

    iget-object v2, v8, Lm0/p;->h:Lm0/f;

    iget v3, v2, Lm0/f;->f:I

    add-int/2addr v0, v3

    .line 84
    iget v1, v1, Lm0/f;->g:I

    iget-object v3, v8, Lm0/p;->i:Lm0/f;

    iget v3, v3, Lm0/f;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    .line 85
    invoke-virtual {v2, v0}, Lm0/f;->d(I)V

    .line 86
    iget-object v0, v8, Lm0/p;->i:Lm0/f;

    invoke-virtual {v0, v1}, Lm0/f;->d(I)V

    .line 87
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v3}, Lm0/g;->d(I)V

    return-void

    .line 88
    :cond_27
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-nez v0, :cond_29

    iget-object v0, v8, Lm0/p;->d:Ll0/e$b;

    sget-object v1, Ll0/e$b;->p:Ll0/e$b;

    if-ne v0, v1, :cond_29

    iget v0, v8, Lm0/p;->a:I

    if-ne v0, v9, :cond_29

    .line 89
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_29

    iget-object v0, v8, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_29

    .line 90
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    .line 91
    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-object v1, v1, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/f;

    .line 92
    iget v0, v0, Lm0/f;->g:I

    iget-object v2, v8, Lm0/p;->h:Lm0/f;

    iget v2, v2, Lm0/f;->f:I

    add-int/2addr v0, v2

    .line 93
    iget v1, v1, Lm0/f;->g:I

    iget-object v2, v8, Lm0/p;->i:Lm0/f;

    iget v2, v2, Lm0/f;->f:I

    add-int/2addr v1, v2

    sub-int/2addr v1, v0

    .line 94
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget v0, v0, Lm0/g;->m:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 95
    iget-object v1, v8, Lm0/p;->b:Ll0/e;

    iget v2, v1, Ll0/e;->t:I

    .line 96
    iget v1, v1, Ll0/e;->s:I

    .line 97
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v2, :cond_28

    .line 98
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 99
    :cond_28
    iget-object v1, v8, Lm0/p;->e:Lm0/g;

    invoke-virtual {v1, v0}, Lm0/g;->d(I)V

    .line 100
    :cond_29
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-nez v0, :cond_2a

    return-void

    .line 101
    :cond_2a
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/f;

    .line 102
    iget-object v1, v8, Lm0/p;->i:Lm0/f;

    iget-object v1, v1, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/f;

    .line 103
    iget v2, v0, Lm0/f;->g:I

    iget-object v3, v8, Lm0/p;->h:Lm0/f;

    iget v3, v3, Lm0/f;->f:I

    add-int/2addr v2, v3

    .line 104
    iget v3, v1, Lm0/f;->g:I

    iget-object v4, v8, Lm0/p;->i:Lm0/f;

    iget v4, v4, Lm0/f;->f:I

    add-int/2addr v3, v4

    .line 105
    iget-object v4, v8, Lm0/p;->b:Ll0/e;

    invoke-virtual {v4}, Ll0/e;->w()F

    move-result v4

    if-ne v0, v1, :cond_2b

    .line 106
    iget v2, v0, Lm0/f;->g:I

    .line 107
    iget v3, v1, Lm0/f;->g:I

    const/high16 v4, 0x3f000000    # 0.5f

    :cond_2b
    sub-int/2addr v3, v2

    .line 108
    iget-object v0, v8, Lm0/p;->e:Lm0/g;

    iget v0, v0, Lm0/f;->g:I

    sub-int/2addr v3, v0

    .line 109
    iget-object v0, v8, Lm0/p;->h:Lm0/f;

    int-to-float v1, v2

    add-float/2addr v1, v11

    int-to-float v2, v3

    mul-float v2, v2, v4

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lm0/f;->d(I)V

    .line 110
    iget-object v0, v8, Lm0/p;->i:Lm0/f;

    iget-object v1, v8, Lm0/p;->h:Lm0/f;

    iget v1, v1, Lm0/f;->g:I

    iget-object v2, v8, Lm0/p;->e:Lm0/g;

    iget v2, v2, Lm0/f;->g:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lm0/f;->d(I)V

    :cond_2c
    :goto_10
    return-void
.end method

.method d()V
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-boolean v1, v0, Ll0/e;->a:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0}, Ll0/e;->R()I

    move-result v0

    invoke-virtual {v1, v0}, Lm0/g;->d(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-nez v0, :cond_4

    .line 4
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v0

    iput-object v0, p0, Lm0/p;->d:Ll0/e$b;

    .line 5
    sget-object v1, Ll0/e$b;->p:Ll0/e$b;

    if-eq v0, v1, :cond_7

    .line 6
    sget-object v1, Ll0/e$b;->q:Ll0/e$b;

    if-ne v0, v1, :cond_3

    .line 7
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v2

    sget-object v3, Ll0/e$b;->n:Ll0/e$b;

    if-eq v2, v3, :cond_2

    .line 9
    :cond_1
    invoke-virtual {v0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v2

    if-ne v2, v1, :cond_3

    .line 10
    :cond_2
    invoke-virtual {v0}, Ll0/e;->R()I

    move-result v1

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->H:Ll0/d;

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->J:Ll0/d;

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    sub-int/2addr v1, v2

    .line 11
    iget-object v2, p0, Lm0/p;->h:Lm0/f;

    iget-object v3, v0, Ll0/e;->e:Lm0/l;

    iget-object v3, v3, Lm0/p;->h:Lm0/f;

    iget-object v4, p0, Lm0/p;->b:Ll0/e;

    iget-object v4, v4, Ll0/e;->H:Ll0/d;

    invoke-virtual {v4}, Ll0/d;->e()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 12
    iget-object v2, p0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v3, p0, Lm0/p;->b:Ll0/e;

    iget-object v3, v3, Ll0/e;->J:Ll0/d;

    invoke-virtual {v3}, Ll0/d;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 13
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    return-void

    .line 14
    :cond_3
    iget-object v0, p0, Lm0/p;->d:Ll0/e$b;

    sget-object v1, Ll0/e$b;->n:Ll0/e$b;

    if-ne v0, v1, :cond_7

    .line 15
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v1}, Ll0/e;->R()I

    move-result v1

    invoke-virtual {v0, v1}, Lm0/g;->d(I)V

    goto :goto_0

    .line 16
    :cond_4
    iget-object v0, p0, Lm0/p;->d:Ll0/e$b;

    sget-object v1, Ll0/e$b;->q:Ll0/e$b;

    if-ne v0, v1, :cond_7

    .line 17
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 18
    invoke-virtual {v0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v2

    sget-object v3, Ll0/e$b;->n:Ll0/e$b;

    if-eq v2, v3, :cond_6

    .line 19
    :cond_5
    invoke-virtual {v0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v2

    if-ne v2, v1, :cond_7

    .line 20
    :cond_6
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, v0, Ll0/e;->e:Lm0/l;

    iget-object v2, v2, Lm0/p;->h:Lm0/f;

    iget-object v3, p0, Lm0/p;->b:Ll0/e;

    iget-object v3, v3, Ll0/e;->H:Ll0/d;

    invoke-virtual {v3}, Ll0/d;->e()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 21
    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->J:Ll0/d;

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    return-void

    .line 22
    :cond_7
    :goto_0
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-boolean v1, v0, Lm0/f;->j:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-boolean v4, v1, Ll0/e;->a:Z

    if-eqz v4, :cond_e

    .line 23
    iget-object v0, v1, Ll0/e;->P:[Ll0/d;

    aget-object v4, v0, v2

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_b

    aget-object v4, v0, v3

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_b

    .line 24
    invoke-virtual {v1}, Ll0/e;->Z()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 25
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->P:[Ll0/d;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ll0/d;->e()I

    move-result v1

    iput v1, v0, Lm0/f;->f:I

    .line 26
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->P:[Ll0/d;

    aget-object v1, v1, v3

    invoke-virtual {v1}, Ll0/d;->e()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lm0/f;->f:I

    goto/16 :goto_2

    .line 27
    :cond_8
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->P:[Ll0/d;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 28
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v4, p0, Lm0/p;->b:Ll0/e;

    iget-object v4, v4, Ll0/e;->P:[Ll0/d;

    aget-object v2, v4, v2

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 29
    :cond_9
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->P:[Ll0/d;

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 30
    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->P:[Ll0/d;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 31
    :cond_a
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iput-boolean v3, v0, Lm0/f;->b:Z

    .line 32
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iput-boolean v3, v0, Lm0/f;->b:Z

    goto/16 :goto_2

    .line 33
    :cond_b
    aget-object v4, v0, v2

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_c

    .line 34
    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 35
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v3, p0, Lm0/p;->b:Ll0/e;

    iget-object v3, v3, Ll0/e;->P:[Ll0/d;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 36
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, p0, Lm0/p;->e:Lm0/g;

    iget v2, v2, Lm0/f;->g:I

    invoke-virtual {p0, v0, v1, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    goto/16 :goto_2

    .line 37
    :cond_c
    aget-object v2, v0, v3

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-eqz v2, :cond_d

    .line 38
    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 39
    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->P:[Ll0/d;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 40
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    iget-object v2, p0, Lm0/p;->e:Lm0/g;

    iget v2, v2, Lm0/f;->g:I

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    goto/16 :goto_2

    .line 41
    :cond_d
    instance-of v0, v1, Ll0/h;

    if-nez v0, :cond_1a

    invoke-virtual {v1}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    sget-object v1, Ll0/d$b;->t:Ll0/d$b;

    .line 42
    invoke-virtual {v0, v1}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v0

    iget-object v0, v0, Ll0/d;->f:Ll0/d;

    if-nez v0, :cond_1a

    .line 43
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    .line 44
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v2}, Ll0/e;->S()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 45
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, p0, Lm0/p;->e:Lm0/g;

    iget v2, v2, Lm0/f;->g:I

    invoke-virtual {p0, v0, v1, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    goto/16 :goto_2

    .line 46
    :cond_e
    iget-object v1, p0, Lm0/p;->d:Ll0/e$b;

    sget-object v4, Ll0/e$b;->p:Ll0/e$b;

    if-ne v1, v4, :cond_15

    .line 47
    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget v4, v1, Ll0/e;->p:I

    const/4 v5, 0x2

    if-eq v4, v5, :cond_13

    const/4 v5, 0x3

    if-eq v4, v5, :cond_f

    goto/16 :goto_1

    .line 48
    :cond_f
    iget v4, v1, Ll0/e;->q:I

    if-ne v4, v5, :cond_12

    .line 49
    iget-object v4, p0, Lm0/p;->h:Lm0/f;

    iput-object p0, v4, Lm0/f;->a:Lm0/d;

    .line 50
    iget-object v4, p0, Lm0/p;->i:Lm0/f;

    iput-object p0, v4, Lm0/f;->a:Lm0/d;

    .line 51
    iget-object v4, v1, Ll0/e;->f:Lm0/n;

    iget-object v5, v4, Lm0/p;->h:Lm0/f;

    iput-object p0, v5, Lm0/f;->a:Lm0/d;

    .line 52
    iget-object v4, v4, Lm0/p;->i:Lm0/f;

    iput-object p0, v4, Lm0/f;->a:Lm0/d;

    .line 53
    iput-object p0, v0, Lm0/f;->a:Lm0/d;

    .line 54
    invoke-virtual {v1}, Ll0/e;->b0()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 55
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v1, v0, Lm0/p;->e:Lm0/g;

    iput-object p0, v1, Lm0/f;->a:Lm0/d;

    .line 58
    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    iget-object v1, v1, Lm0/f;->l:Ljava/util/List;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 62
    :cond_10
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->Z()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 63
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 65
    :cond_11
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 66
    :cond_12
    iget-object v1, v1, Ll0/e;->f:Lm0/n;

    iget-object v1, v1, Lm0/p;->e:Lm0/g;

    .line 67
    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v0, v1, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iput-boolean v3, v0, Lm0/f;->b:Z

    .line 72
    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v0, v0, Lm0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 76
    :cond_13
    invoke-virtual {v1}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_1

    .line 77
    :cond_14
    iget-object v0, v0, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->e:Lm0/g;

    .line 78
    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    iget-object v1, v1, Lm0/f;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iput-boolean v3, v0, Lm0/f;->b:Z

    .line 81
    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    iget-object v0, v0, Lm0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_15
    :goto_1
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v0, Ll0/e;->P:[Ll0/d;

    aget-object v4, v1, v2

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_17

    aget-object v4, v1, v3

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_17

    .line 84
    invoke-virtual {v0}, Ll0/e;->Z()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 85
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->P:[Ll0/d;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ll0/d;->e()I

    move-result v1

    iput v1, v0, Lm0/f;->f:I

    .line 86
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->P:[Ll0/d;

    aget-object v1, v1, v3

    invoke-virtual {v1}, Ll0/d;->e()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lm0/f;->f:I

    goto/16 :goto_2

    .line 87
    :cond_16
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget-object v0, v0, Ll0/e;->P:[Ll0/d;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    .line 88
    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget-object v1, v1, Ll0/e;->P:[Ll0/d;

    aget-object v1, v1, v3

    invoke-virtual {p0, v1}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v1

    .line 89
    invoke-virtual {v0, p0}, Lm0/f;->b(Lm0/d;)V

    .line 90
    invoke-virtual {v1, p0}, Lm0/f;->b(Lm0/d;)V

    .line 91
    sget-object v0, Lm0/p$b;->q:Lm0/p$b;

    iput-object v0, p0, Lm0/p;->j:Lm0/p$b;

    goto/16 :goto_2

    .line 92
    :cond_17
    aget-object v4, v1, v2

    iget-object v4, v4, Ll0/d;->f:Ll0/d;

    if-eqz v4, :cond_18

    .line 93
    aget-object v0, v1, v2

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 94
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v4, p0, Lm0/p;->b:Ll0/e;

    iget-object v4, v4, Ll0/e;->P:[Ll0/d;

    aget-object v2, v4, v2

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 95
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, p0, Lm0/p;->e:Lm0/g;

    invoke-virtual {p0, v0, v1, v3, v2}, Lm0/p;->c(Lm0/f;Lm0/f;ILm0/g;)V

    goto :goto_2

    .line 96
    :cond_18
    aget-object v2, v1, v3

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-eqz v2, :cond_19

    .line 97
    aget-object v0, v1, v3

    invoke-virtual {p0, v0}, Lm0/p;->h(Ll0/d;)Lm0/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 98
    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    iget-object v2, v2, Ll0/e;->P:[Ll0/d;

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 99
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    const/4 v2, -0x1

    iget-object v3, p0, Lm0/p;->e:Lm0/g;

    invoke-virtual {p0, v0, v1, v2, v3}, Lm0/p;->c(Lm0/f;Lm0/f;ILm0/g;)V

    goto :goto_2

    .line 100
    :cond_19
    instance-of v1, v0, Ll0/h;

    if-nez v1, :cond_1a

    invoke-virtual {v0}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 101
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v0}, Ll0/e;->I()Ll0/e;

    move-result-object v0

    iget-object v0, v0, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    .line 102
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v2}, Ll0/e;->S()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, Lm0/p;->b(Lm0/f;Lm0/f;I)V

    .line 103
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iget-object v2, p0, Lm0/p;->e:Lm0/g;

    invoke-virtual {p0, v0, v1, v3, v2}, Lm0/p;->c(Lm0/f;Lm0/f;ILm0/g;)V

    :cond_1a
    :goto_2
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    iget-boolean v1, v0, Lm0/f;->j:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    iget v0, v0, Lm0/f;->g:I

    invoke-virtual {v1, v0}, Ll0/e;->V0(I)V

    :cond_0
    return-void
.end method

.method f()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lm0/p;->c:Lm0/m;

    .line 2
    iget-object v0, p0, Lm0/p;->h:Lm0/f;

    invoke-virtual {v0}, Lm0/f;->c()V

    .line 3
    iget-object v0, p0, Lm0/p;->i:Lm0/f;

    invoke-virtual {v0}, Lm0/f;->c()V

    .line 4
    iget-object v0, p0, Lm0/p;->e:Lm0/g;

    invoke-virtual {v0}, Lm0/f;->c()V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm0/p;->g:Z

    return-void
.end method

.method m()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/p;->d:Ll0/e$b;

    sget-object v1, Ll0/e$b;->p:Ll0/e$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lm0/p;->b:Ll0/e;

    iget v0, v0, Ll0/e;->p:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method r()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lm0/p;->g:Z

    .line 2
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    invoke-virtual {v1}, Lm0/f;->c()V

    .line 3
    iget-object v1, p0, Lm0/p;->h:Lm0/f;

    iput-boolean v0, v1, Lm0/f;->j:Z

    .line 4
    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    invoke-virtual {v1}, Lm0/f;->c()V

    .line 5
    iget-object v1, p0, Lm0/p;->i:Lm0/f;

    iput-boolean v0, v1, Lm0/f;->j:Z

    .line 6
    iget-object v1, p0, Lm0/p;->e:Lm0/g;

    iput-boolean v0, v1, Lm0/f;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HorizontalRun "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/p;->b:Ll0/e;

    invoke-virtual {v1}, Ll0/e;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
