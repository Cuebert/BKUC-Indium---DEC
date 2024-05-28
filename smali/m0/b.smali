.class public Lm0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/b$a;,
        Lm0/b$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ll0/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lm0/b$a;

.field private c:Ll0/f;


# direct methods
.method public constructor <init>(Ll0/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm0/b;->a:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Lm0/b$a;

    invoke-direct {v0}, Lm0/b$a;-><init>()V

    iput-object v0, p0, Lm0/b;->b:Lm0/b$a;

    .line 4
    iput-object p1, p0, Lm0/b;->c:Ll0/f;

    return-void
.end method

.method private a(Lm0/b$b;Ll0/e;I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lm0/b;->b:Lm0/b$a;

    invoke-virtual {p2}, Ll0/e;->y()Ll0/e$b;

    move-result-object v1

    iput-object v1, v0, Lm0/b$a;->a:Ll0/e$b;

    .line 2
    iget-object v0, p0, Lm0/b;->b:Lm0/b$a;

    invoke-virtual {p2}, Ll0/e;->O()Ll0/e$b;

    move-result-object v1

    iput-object v1, v0, Lm0/b$a;->b:Ll0/e$b;

    .line 3
    iget-object v0, p0, Lm0/b;->b:Lm0/b$a;

    invoke-virtual {p2}, Ll0/e;->R()I

    move-result v1

    iput v1, v0, Lm0/b$a;->c:I

    .line 4
    iget-object v0, p0, Lm0/b;->b:Lm0/b$a;

    invoke-virtual {p2}, Ll0/e;->v()I

    move-result v1

    iput v1, v0, Lm0/b$a;->d:I

    .line 5
    iget-object v0, p0, Lm0/b;->b:Lm0/b$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lm0/b$a;->i:Z

    .line 6
    iput p3, v0, Lm0/b$a;->j:I

    .line 7
    iget-object p3, v0, Lm0/b$a;->a:Ll0/e$b;

    sget-object v2, Ll0/e$b;->p:Ll0/e$b;

    const/4 v3, 0x1

    if-ne p3, v2, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 8
    :goto_0
    iget-object v4, v0, Lm0/b$a;->b:Ll0/e$b;

    if-ne v4, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    .line 9
    iget p3, p2, Ll0/e;->W:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    const/4 p3, 0x1

    goto :goto_2

    :cond_2
    const/4 p3, 0x0

    :goto_2
    if-eqz v2, :cond_3

    .line 10
    iget v2, p2, Ll0/e;->W:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    const/4 v4, 0x4

    if-eqz p3, :cond_4

    .line 11
    iget-object p3, p2, Ll0/e;->r:[I

    aget p3, p3, v1

    if-ne p3, v4, :cond_4

    .line 12
    sget-object p3, Ll0/e$b;->n:Ll0/e$b;

    iput-object p3, v0, Lm0/b$a;->a:Ll0/e$b;

    :cond_4
    if-eqz v2, :cond_5

    .line 13
    iget-object p3, p2, Ll0/e;->r:[I

    aget p3, p3, v3

    if-ne p3, v4, :cond_5

    .line 14
    sget-object p3, Ll0/e$b;->n:Ll0/e$b;

    iput-object p3, v0, Lm0/b$a;->b:Ll0/e$b;

    .line 15
    :cond_5
    invoke-interface {p1, p2, v0}, Lm0/b$b;->b(Ll0/e;Lm0/b$a;)V

    .line 16
    iget-object p1, p0, Lm0/b;->b:Lm0/b$a;

    iget p1, p1, Lm0/b$a;->e:I

    invoke-virtual {p2, p1}, Ll0/e;->U0(I)V

    .line 17
    iget-object p1, p0, Lm0/b;->b:Lm0/b$a;

    iget p1, p1, Lm0/b$a;->f:I

    invoke-virtual {p2, p1}, Ll0/e;->v0(I)V

    .line 18
    iget-object p1, p0, Lm0/b;->b:Lm0/b$a;

    iget-boolean p1, p1, Lm0/b$a;->h:Z

    invoke-virtual {p2, p1}, Ll0/e;->u0(Z)V

    .line 19
    iget-object p1, p0, Lm0/b;->b:Lm0/b$a;

    iget p1, p1, Lm0/b$a;->g:I

    invoke-virtual {p2, p1}, Ll0/e;->k0(I)V

    .line 20
    iget-object p1, p0, Lm0/b;->b:Lm0/b$a;

    sget p2, Lm0/b$a;->k:I

    iput p2, p1, Lm0/b$a;->j:I

    .line 21
    iget-boolean p1, p1, Lm0/b$a;->i:Z

    return p1
.end method

.method private b(Ll0/f;)V
    .locals 12

    .line 1
    iget-object v0, p1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x40

    .line 2
    invoke-virtual {p1, v1}, Ll0/f;->B1(I)Z

    move-result v1

    .line 3
    invoke-virtual {p1}, Ll0/f;->r1()Lm0/b$b;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_a

    .line 4
    iget-object v5, p1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll0/e;

    .line 5
    instance-of v6, v5, Ll0/g;

    if-eqz v6, :cond_0

    goto/16 :goto_3

    .line 6
    :cond_0
    instance-of v6, v5, Ll0/a;

    if-eqz v6, :cond_1

    goto/16 :goto_3

    .line 7
    :cond_1
    invoke-virtual {v5}, Ll0/e;->c0()Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    if-eqz v1, :cond_3

    .line 8
    iget-object v6, v5, Ll0/e;->e:Lm0/l;

    if-eqz v6, :cond_3

    iget-object v7, v5, Ll0/e;->f:Lm0/n;

    if-eqz v7, :cond_3

    iget-object v6, v6, Lm0/p;->e:Lm0/g;

    iget-boolean v6, v6, Lm0/f;->j:Z

    if-eqz v6, :cond_3

    iget-object v6, v7, Lm0/p;->e:Lm0/g;

    iget-boolean v6, v6, Lm0/f;->j:Z

    if-eqz v6, :cond_3

    goto :goto_3

    .line 9
    :cond_3
    invoke-virtual {v5, v3}, Ll0/e;->s(I)Ll0/e$b;

    move-result-object v6

    const/4 v7, 0x1

    .line 10
    invoke-virtual {v5, v7}, Ll0/e;->s(I)Ll0/e$b;

    move-result-object v8

    .line 11
    sget-object v9, Ll0/e$b;->p:Ll0/e$b;

    if-ne v6, v9, :cond_4

    iget v10, v5, Ll0/e;->p:I

    if-eq v10, v7, :cond_4

    if-ne v8, v9, :cond_4

    iget v10, v5, Ll0/e;->q:I

    if-eq v10, v7, :cond_4

    const/4 v10, 0x1

    goto :goto_1

    :cond_4
    const/4 v10, 0x0

    :goto_1
    if-nez v10, :cond_8

    .line 12
    invoke-virtual {p1, v7}, Ll0/f;->B1(I)Z

    move-result v11

    if-eqz v11, :cond_8

    instance-of v11, v5, Ll0/k;

    if-nez v11, :cond_8

    if-ne v6, v9, :cond_5

    .line 13
    iget v11, v5, Ll0/e;->p:I

    if-nez v11, :cond_5

    if-eq v8, v9, :cond_5

    .line 14
    invoke-virtual {v5}, Ll0/e;->Z()Z

    move-result v11

    if-nez v11, :cond_5

    const/4 v10, 0x1

    :cond_5
    if-ne v8, v9, :cond_6

    .line 15
    iget v11, v5, Ll0/e;->q:I

    if-nez v11, :cond_6

    if-eq v6, v9, :cond_6

    .line 16
    invoke-virtual {v5}, Ll0/e;->Z()Z

    move-result v11

    if-nez v11, :cond_6

    const/4 v10, 0x1

    :cond_6
    if-eq v6, v9, :cond_7

    if-ne v8, v9, :cond_8

    .line 17
    :cond_7
    iget v6, v5, Ll0/e;->W:F

    const/4 v8, 0x0

    cmpl-float v6, v6, v8

    if-lez v6, :cond_8

    goto :goto_2

    :cond_8
    move v7, v10

    :goto_2
    if-eqz v7, :cond_9

    goto :goto_3

    .line 18
    :cond_9
    sget v6, Lm0/b$a;->k:I

    invoke-direct {p0, v2, v5, v6}, Lm0/b;->a(Lm0/b$b;Ll0/e;I)Z

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 19
    :cond_a
    invoke-interface {v2}, Lm0/b$b;->a()V

    return-void
.end method

.method private c(Ll0/f;Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ll0/e;->G()I

    move-result p2

    .line 2
    invoke-virtual {p1}, Ll0/e;->F()I

    move-result v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v1}, Ll0/e;->K0(I)V

    .line 4
    invoke-virtual {p1, v1}, Ll0/e;->J0(I)V

    .line 5
    invoke-virtual {p1, p3}, Ll0/e;->U0(I)V

    .line 6
    invoke-virtual {p1, p4}, Ll0/e;->v0(I)V

    .line 7
    invoke-virtual {p1, p2}, Ll0/e;->K0(I)V

    .line 8
    invoke-virtual {p1, v0}, Ll0/e;->J0(I)V

    .line 9
    iget-object p1, p0, Lm0/b;->c:Ll0/f;

    invoke-virtual {p1}, Ll0/f;->b1()V

    return-void
.end method


# virtual methods
.method public d(Ll0/f;IIIIIIIII)J
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    move/from16 v4, p7

    .line 1
    invoke-virtual/range {p1 .. p1}, Ll0/f;->r1()Lm0/b$b;

    move-result-object v5

    .line 2
    iget-object v6, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 3
    invoke-virtual/range {p1 .. p1}, Ll0/e;->R()I

    move-result v7

    .line 4
    invoke-virtual/range {p1 .. p1}, Ll0/e;->v()I

    move-result v8

    const/16 v9, 0x80

    .line 5
    invoke-static {v2, v9}, Ll0/j;->b(II)Z

    move-result v9

    const/4 v10, 0x0

    if-nez v9, :cond_1

    const/16 v12, 0x40

    .line 6
    invoke-static {v2, v12}, Ll0/j;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_a

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v6, :cond_a

    .line 7
    iget-object v13, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll0/e;

    .line 8
    invoke-virtual {v13}, Ll0/e;->y()Ll0/e$b;

    move-result-object v14

    sget-object v15, Ll0/e$b;->p:Ll0/e$b;

    if-ne v14, v15, :cond_2

    const/4 v14, 0x1

    goto :goto_3

    :cond_2
    const/4 v14, 0x0

    .line 9
    :goto_3
    invoke-virtual {v13}, Ll0/e;->O()Ll0/e$b;

    move-result-object v11

    if-ne v11, v15, :cond_3

    const/4 v11, 0x1

    goto :goto_4

    :cond_3
    const/4 v11, 0x0

    :goto_4
    if-eqz v14, :cond_4

    if-eqz v11, :cond_4

    .line 10
    invoke-virtual {v13}, Ll0/e;->t()F

    move-result v11

    const/4 v14, 0x0

    cmpl-float v11, v11, v14

    if-lez v11, :cond_4

    const/4 v11, 0x1

    goto :goto_5

    :cond_4
    const/4 v11, 0x0

    .line 11
    :goto_5
    invoke-virtual {v13}, Ll0/e;->Z()Z

    move-result v14

    if-eqz v14, :cond_6

    if-eqz v11, :cond_6

    :cond_5
    :goto_6
    const/4 v2, 0x0

    goto :goto_7

    .line 12
    :cond_6
    invoke-virtual {v13}, Ll0/e;->b0()Z

    move-result v14

    if-eqz v14, :cond_7

    if-eqz v11, :cond_7

    goto :goto_6

    .line 13
    :cond_7
    instance-of v11, v13, Ll0/k;

    if-eqz v11, :cond_8

    goto :goto_6

    .line 14
    :cond_8
    invoke-virtual {v13}, Ll0/e;->Z()Z

    move-result v11

    if-nez v11, :cond_5

    .line 15
    invoke-virtual {v13}, Ll0/e;->b0()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    .line 16
    sget-boolean v11, Lk0/d;->r:Z

    :cond_b
    const/high16 v11, 0x40000000    # 2.0f

    if-ne v3, v11, :cond_c

    if-eq v4, v11, :cond_d

    :cond_c
    if-eqz v9, :cond_e

    :cond_d
    const/4 v12, 0x1

    goto :goto_8

    :cond_e
    const/4 v12, 0x0

    :goto_8
    and-int/2addr v2, v12

    const/4 v12, 0x2

    if-eqz v2, :cond_16

    .line 17
    invoke-virtual/range {p1 .. p1}, Ll0/e;->E()I

    move-result v13

    move/from16 v14, p6

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    .line 18
    invoke-virtual/range {p1 .. p1}, Ll0/e;->D()I

    move-result v14

    move/from16 v15, p8

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-ne v3, v11, :cond_f

    .line 19
    invoke-virtual/range {p1 .. p1}, Ll0/e;->R()I

    move-result v15

    if-eq v15, v13, :cond_f

    .line 20
    invoke-virtual {v1, v13}, Ll0/e;->U0(I)V

    .line 21
    invoke-virtual/range {p1 .. p1}, Ll0/f;->u1()V

    :cond_f
    if-ne v4, v11, :cond_10

    .line 22
    invoke-virtual/range {p1 .. p1}, Ll0/e;->v()I

    move-result v13

    if-eq v13, v14, :cond_10

    .line 23
    invoke-virtual {v1, v14}, Ll0/e;->v0(I)V

    .line 24
    invoke-virtual/range {p1 .. p1}, Ll0/f;->u1()V

    :cond_10
    if-ne v3, v11, :cond_11

    if-ne v4, v11, :cond_11

    .line 25
    invoke-virtual {v1, v9}, Ll0/f;->o1(Z)Z

    move-result v9

    const/4 v14, 0x2

    goto :goto_a

    .line 26
    :cond_11
    invoke-virtual {v1, v9}, Ll0/f;->p1(Z)Z

    move-result v13

    if-ne v3, v11, :cond_12

    .line 27
    invoke-virtual {v1, v9, v10}, Ll0/f;->q1(ZI)Z

    move-result v14

    and-int/2addr v13, v14

    const/4 v14, 0x1

    goto :goto_9

    :cond_12
    const/4 v14, 0x0

    :goto_9
    if-ne v4, v11, :cond_13

    const/4 v15, 0x1

    .line 28
    invoke-virtual {v1, v9, v15}, Ll0/f;->q1(ZI)Z

    move-result v9

    and-int/2addr v9, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_13
    move v9, v13

    :goto_a
    if-eqz v9, :cond_17

    if-ne v3, v11, :cond_14

    const/4 v15, 0x1

    goto :goto_b

    :cond_14
    const/4 v15, 0x0

    :goto_b
    if-ne v4, v11, :cond_15

    const/4 v3, 0x1

    goto :goto_c

    :cond_15
    const/4 v3, 0x0

    .line 29
    :goto_c
    invoke-virtual {v1, v15, v3}, Ll0/f;->Y0(ZZ)V

    goto :goto_d

    :cond_16
    const/4 v9, 0x0

    const/4 v14, 0x0

    :cond_17
    :goto_d
    if-eqz v9, :cond_18

    if-eq v14, v12, :cond_35

    .line 30
    :cond_18
    invoke-virtual/range {p1 .. p1}, Ll0/f;->s1()I

    move-result v3

    if-lez v6, :cond_19

    .line 31
    invoke-direct/range {p0 .. p1}, Lm0/b;->b(Ll0/f;)V

    .line 32
    :cond_19
    invoke-virtual/range {p0 .. p1}, Lm0/b;->e(Ll0/f;)V

    .line 33
    iget-object v4, v0, Lm0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v6, :cond_1a

    const-string v6, "First pass"

    .line 34
    invoke-direct {v0, v1, v6, v7, v8}, Lm0/b;->c(Ll0/f;Ljava/lang/String;II)V

    :cond_1a
    if-lez v4, :cond_33

    .line 35
    invoke-virtual/range {p1 .. p1}, Ll0/e;->y()Ll0/e$b;

    move-result-object v6

    sget-object v9, Ll0/e$b;->o:Ll0/e$b;

    if-ne v6, v9, :cond_1b

    const/4 v15, 0x1

    goto :goto_e

    :cond_1b
    const/4 v15, 0x0

    .line 36
    :goto_e
    invoke-virtual/range {p1 .. p1}, Ll0/e;->O()Ll0/e$b;

    move-result-object v6

    if-ne v6, v9, :cond_1c

    const/4 v6, 0x1

    goto :goto_f

    :cond_1c
    const/4 v6, 0x0

    .line 37
    :goto_f
    invoke-virtual/range {p1 .. p1}, Ll0/e;->R()I

    move-result v9

    iget-object v11, v0, Lm0/b;->c:Ll0/f;

    invoke-virtual {v11}, Ll0/e;->G()I

    move-result v11

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 38
    invoke-virtual/range {p1 .. p1}, Ll0/e;->v()I

    move-result v11

    iget-object v13, v0, Lm0/b;->c:Ll0/f;

    invoke-virtual {v13}, Ll0/e;->F()I

    move-result v13

    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_10
    if-ge v13, v4, :cond_22

    .line 39
    iget-object v10, v0, Lm0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll0/e;

    .line 40
    instance-of v12, v10, Ll0/k;

    if-nez v12, :cond_1d

    move/from16 p5, v3

    goto :goto_12

    .line 41
    :cond_1d
    invoke-virtual {v10}, Ll0/e;->R()I

    move-result v12

    move/from16 p5, v3

    .line 42
    invoke-virtual {v10}, Ll0/e;->v()I

    move-result v3

    .line 43
    sget v1, Lm0/b$a;->l:I

    invoke-direct {v0, v5, v10, v1}, Lm0/b;->a(Lm0/b$b;Ll0/e;I)Z

    move-result v1

    or-int/2addr v1, v14

    .line 44
    invoke-virtual {v10}, Ll0/e;->R()I

    move-result v14

    move/from16 p6, v1

    .line 45
    invoke-virtual {v10}, Ll0/e;->v()I

    move-result v1

    if-eq v14, v12, :cond_1f

    .line 46
    invoke-virtual {v10, v14}, Ll0/e;->U0(I)V

    if-eqz v15, :cond_1e

    .line 47
    invoke-virtual {v10}, Ll0/e;->K()I

    move-result v12

    if-le v12, v9, :cond_1e

    .line 48
    invoke-virtual {v10}, Ll0/e;->K()I

    move-result v12

    sget-object v14, Ll0/d$b;->q:Ll0/d$b;

    .line 49
    invoke-virtual {v10, v14}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v14

    invoke-virtual {v14}, Ll0/d;->e()I

    move-result v14

    add-int/2addr v12, v14

    .line 50
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_1e
    const/4 v12, 0x1

    goto :goto_11

    :cond_1f
    move/from16 v12, p6

    :goto_11
    if-eq v1, v3, :cond_21

    .line 51
    invoke-virtual {v10, v1}, Ll0/e;->v0(I)V

    if-eqz v6, :cond_20

    .line 52
    invoke-virtual {v10}, Ll0/e;->p()I

    move-result v1

    if-le v1, v11, :cond_20

    .line 53
    invoke-virtual {v10}, Ll0/e;->p()I

    move-result v1

    sget-object v3, Ll0/d$b;->r:Ll0/d$b;

    .line 54
    invoke-virtual {v10, v3}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v3

    invoke-virtual {v3}, Ll0/d;->e()I

    move-result v3

    add-int/2addr v1, v3

    .line 55
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v11, v1

    :cond_20
    const/4 v12, 0x1

    .line 56
    :cond_21
    check-cast v10, Ll0/k;

    .line 57
    invoke-virtual {v10}, Ll0/k;->d1()Z

    move-result v1

    or-int v14, v12, v1

    :goto_12
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p1

    move/from16 v3, p5

    const/4 v10, 0x0

    const/4 v12, 0x2

    goto/16 :goto_10

    :cond_22
    move/from16 p5, v3

    const/4 v1, 0x0

    const/4 v3, 0x2

    :goto_13
    if-ge v1, v3, :cond_30

    const/4 v10, 0x0

    :goto_14
    if-ge v10, v4, :cond_2f

    .line 58
    iget-object v12, v0, Lm0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll0/e;

    .line 59
    instance-of v13, v12, Ll0/h;

    if-eqz v13, :cond_23

    instance-of v13, v12, Ll0/k;

    if-eqz v13, :cond_27

    :cond_23
    instance-of v13, v12, Ll0/g;

    if-eqz v13, :cond_24

    goto :goto_15

    .line 60
    :cond_24
    invoke-virtual {v12}, Ll0/e;->Q()I

    move-result v13

    const/16 v3, 0x8

    if-ne v13, v3, :cond_25

    goto :goto_15

    :cond_25
    if-eqz v2, :cond_26

    .line 61
    iget-object v3, v12, Ll0/e;->e:Lm0/l;

    iget-object v3, v3, Lm0/p;->e:Lm0/g;

    iget-boolean v3, v3, Lm0/f;->j:Z

    if-eqz v3, :cond_26

    iget-object v3, v12, Ll0/e;->f:Lm0/n;

    iget-object v3, v3, Lm0/p;->e:Lm0/g;

    iget-boolean v3, v3, Lm0/f;->j:Z

    if-eqz v3, :cond_26

    goto :goto_15

    .line 62
    :cond_26
    instance-of v3, v12, Ll0/k;

    if-eqz v3, :cond_28

    :cond_27
    :goto_15
    move/from16 p9, v2

    move/from16 p6, v4

    goto/16 :goto_17

    .line 63
    :cond_28
    invoke-virtual {v12}, Ll0/e;->R()I

    move-result v3

    .line 64
    invoke-virtual {v12}, Ll0/e;->v()I

    move-result v13

    move/from16 p9, v2

    .line 65
    invoke-virtual {v12}, Ll0/e;->n()I

    move-result v2

    .line 66
    sget v16, Lm0/b$a;->l:I

    move/from16 p6, v4

    const/4 v4, 0x1

    if-ne v1, v4, :cond_29

    .line 67
    sget v16, Lm0/b$a;->m:I

    :cond_29
    move/from16 v4, v16

    .line 68
    invoke-direct {v0, v5, v12, v4}, Lm0/b;->a(Lm0/b$b;Ll0/e;I)Z

    move-result v4

    or-int/2addr v4, v14

    .line 69
    invoke-virtual {v12}, Ll0/e;->R()I

    move-result v14

    move/from16 p7, v4

    .line 70
    invoke-virtual {v12}, Ll0/e;->v()I

    move-result v4

    if-eq v14, v3, :cond_2b

    .line 71
    invoke-virtual {v12, v14}, Ll0/e;->U0(I)V

    if-eqz v15, :cond_2a

    .line 72
    invoke-virtual {v12}, Ll0/e;->K()I

    move-result v3

    if-le v3, v9, :cond_2a

    .line 73
    invoke-virtual {v12}, Ll0/e;->K()I

    move-result v3

    sget-object v14, Ll0/d$b;->q:Ll0/d$b;

    .line 74
    invoke-virtual {v12, v14}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v14

    invoke-virtual {v14}, Ll0/d;->e()I

    move-result v14

    add-int/2addr v3, v14

    .line 75
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_2a
    const/4 v3, 0x1

    goto :goto_16

    :cond_2b
    move/from16 v3, p7

    :goto_16
    if-eq v4, v13, :cond_2d

    .line 76
    invoke-virtual {v12, v4}, Ll0/e;->v0(I)V

    if-eqz v6, :cond_2c

    .line 77
    invoke-virtual {v12}, Ll0/e;->p()I

    move-result v3

    if-le v3, v11, :cond_2c

    .line 78
    invoke-virtual {v12}, Ll0/e;->p()I

    move-result v3

    sget-object v4, Ll0/d$b;->r:Ll0/d$b;

    .line 79
    invoke-virtual {v12, v4}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v4

    invoke-virtual {v4}, Ll0/d;->e()I

    move-result v4

    add-int/2addr v3, v4

    .line 80
    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v11, v3

    :cond_2c
    const/4 v3, 0x1

    .line 81
    :cond_2d
    invoke-virtual {v12}, Ll0/e;->U()Z

    move-result v4

    if-eqz v4, :cond_2e

    invoke-virtual {v12}, Ll0/e;->n()I

    move-result v4

    if-eq v2, v4, :cond_2e

    const/4 v14, 0x1

    goto :goto_17

    :cond_2e
    move v14, v3

    :goto_17
    add-int/lit8 v10, v10, 0x1

    move/from16 v4, p6

    move/from16 v2, p9

    const/4 v3, 0x2

    goto/16 :goto_14

    :cond_2f
    move/from16 p9, v2

    move/from16 p6, v4

    if-eqz v14, :cond_30

    const-string v2, "intermediate pass"

    move-object/from16 v3, p1

    .line 82
    invoke-direct {v0, v3, v2, v7, v8}, Lm0/b;->c(Ll0/f;Ljava/lang/String;II)V

    add-int/lit8 v1, v1, 0x1

    move/from16 v4, p6

    move/from16 v2, p9

    const/4 v3, 0x2

    const/4 v14, 0x0

    goto/16 :goto_13

    :cond_30
    move-object/from16 v3, p1

    if-eqz v14, :cond_34

    const-string v1, "2nd pass"

    .line 83
    invoke-direct {v0, v3, v1, v7, v8}, Lm0/b;->c(Ll0/f;Ljava/lang/String;II)V

    .line 84
    invoke-virtual/range {p1 .. p1}, Ll0/e;->R()I

    move-result v1

    if-ge v1, v9, :cond_31

    .line 85
    invoke-virtual {v3, v9}, Ll0/e;->U0(I)V

    const/4 v10, 0x1

    goto :goto_18

    :cond_31
    const/4 v10, 0x0

    .line 86
    :goto_18
    invoke-virtual/range {p1 .. p1}, Ll0/e;->v()I

    move-result v1

    if-ge v1, v11, :cond_32

    .line 87
    invoke-virtual {v3, v11}, Ll0/e;->v0(I)V

    const/4 v11, 0x1

    goto :goto_19

    :cond_32
    move v11, v10

    :goto_19
    if-eqz v11, :cond_34

    const-string v1, "3rd pass"

    .line 88
    invoke-direct {v0, v3, v1, v7, v8}, Lm0/b;->c(Ll0/f;Ljava/lang/String;II)V

    goto :goto_1a

    :cond_33
    move/from16 p5, v3

    move-object v3, v1

    :cond_34
    :goto_1a
    move/from16 v1, p5

    .line 89
    invoke-virtual {v3, v1}, Ll0/f;->E1(I)V

    :cond_35
    const-wide/16 v1, 0x0

    return-wide v1
.end method

.method public e(Ll0/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lm0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    iget-object v0, p1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 3
    iget-object v2, p1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/e;

    .line 4
    invoke-virtual {v2}, Ll0/e;->y()Ll0/e$b;

    move-result-object v3

    sget-object v4, Ll0/e$b;->p:Ll0/e$b;

    if-eq v3, v4, :cond_0

    .line 5
    invoke-virtual {v2}, Ll0/e;->O()Ll0/e$b;

    move-result-object v3

    if-ne v3, v4, :cond_1

    .line 6
    :cond_0
    iget-object v3, p0, Lm0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p1}, Ll0/f;->u1()V

    return-void
.end method
