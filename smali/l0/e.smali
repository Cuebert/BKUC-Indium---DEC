.class public Ll0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/e$b;
    }
.end annotation


# static fields
.field public static C0:F = 0.5f


# instance fields
.field private A:[I

.field public A0:I

.field private B:F

.field public B0:I

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:I

.field private G:I

.field public H:Ll0/d;

.field public I:Ll0/d;

.field public J:Ll0/d;

.field public K:Ll0/d;

.field public L:Ll0/d;

.field M:Ll0/d;

.field N:Ll0/d;

.field public O:Ll0/d;

.field public P:[Ll0/d;

.field protected Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ll0/d;",
            ">;"
        }
    .end annotation
.end field

.field private R:[Z

.field public S:[Ll0/e$b;

.field public T:Ll0/e;

.field U:I

.field V:I

.field public W:F

.field protected X:I

.field protected Y:I

.field protected Z:I

.field public a:Z

.field a0:I

.field public b:[Lm0/p;

.field b0:I

.field public c:Lm0/c;

.field protected c0:I

.field public d:Lm0/c;

.field protected d0:I

.field public e:Lm0/l;

.field e0:I

.field public f:Lm0/n;

.field protected f0:I

.field public g:[Z

.field protected g0:I

.field h:Z

.field h0:F

.field private i:Z

.field i0:F

.field private j:Z

.field private j0:Ljava/lang/Object;

.field private k:Z

.field private k0:I

.field private l:Z

.field private l0:I

.field private m:Z

.field private m0:Ljava/lang/String;

.field public n:I

.field private n0:Ljava/lang/String;

.field public o:I

.field o0:Z

.field public p:I

.field p0:Z

.field public q:I

.field q0:Z

.field public r:[I

.field r0:I

.field public s:I

.field s0:I

.field public t:I

.field t0:Z

.field public u:F

.field u0:Z

.field public v:I

.field public v0:[F

.field public w:I

.field protected w0:[Ll0/e;

.field public x:F

.field protected x0:[Ll0/e;

.field y:I

.field y0:Ll0/e;

.field z:F

.field z0:Ll0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ll0/e;->a:Z

    const/4 v1, 0x2

    new-array v2, v1, [Lm0/p;

    .line 3
    iput-object v2, p0, Ll0/e;->b:[Lm0/p;

    const/4 v2, 0x0

    .line 4
    iput-object v2, p0, Ll0/e;->e:Lm0/l;

    .line 5
    iput-object v2, p0, Ll0/e;->f:Lm0/n;

    new-array v3, v1, [Z

    .line 6
    fill-array-data v3, :array_0

    iput-object v3, p0, Ll0/e;->g:[Z

    .line 7
    iput-boolean v0, p0, Ll0/e;->h:Z

    const/4 v3, 0x1

    .line 8
    iput-boolean v3, p0, Ll0/e;->i:Z

    .line 9
    iput-boolean v0, p0, Ll0/e;->j:Z

    .line 10
    iput-boolean v3, p0, Ll0/e;->k:Z

    .line 11
    iput-boolean v0, p0, Ll0/e;->l:Z

    .line 12
    iput-boolean v0, p0, Ll0/e;->m:Z

    const/4 v4, -0x1

    .line 13
    iput v4, p0, Ll0/e;->n:I

    .line 14
    iput v4, p0, Ll0/e;->o:I

    .line 15
    iput v0, p0, Ll0/e;->p:I

    .line 16
    iput v0, p0, Ll0/e;->q:I

    new-array v5, v1, [I

    .line 17
    iput-object v5, p0, Ll0/e;->r:[I

    .line 18
    iput v0, p0, Ll0/e;->s:I

    .line 19
    iput v0, p0, Ll0/e;->t:I

    const/high16 v5, 0x3f800000    # 1.0f

    .line 20
    iput v5, p0, Ll0/e;->u:F

    .line 21
    iput v0, p0, Ll0/e;->v:I

    .line 22
    iput v0, p0, Ll0/e;->w:I

    .line 23
    iput v5, p0, Ll0/e;->x:F

    .line 24
    iput v4, p0, Ll0/e;->y:I

    .line 25
    iput v5, p0, Ll0/e;->z:F

    new-array v5, v1, [I

    .line 26
    fill-array-data v5, :array_1

    iput-object v5, p0, Ll0/e;->A:[I

    const/4 v5, 0x0

    .line 27
    iput v5, p0, Ll0/e;->B:F

    .line 28
    iput-boolean v0, p0, Ll0/e;->C:Z

    .line 29
    iput-boolean v0, p0, Ll0/e;->E:Z

    .line 30
    iput v0, p0, Ll0/e;->F:I

    .line 31
    iput v0, p0, Ll0/e;->G:I

    .line 32
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->o:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->H:Ll0/d;

    .line 33
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->p:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->I:Ll0/d;

    .line 34
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->q:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->J:Ll0/d;

    .line 35
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->r:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->K:Ll0/d;

    .line 36
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->s:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->L:Ll0/d;

    .line 37
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->u:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->M:Ll0/d;

    .line 38
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->v:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->N:Ll0/d;

    .line 39
    new-instance v6, Ll0/d;

    sget-object v7, Ll0/d$b;->t:Ll0/d$b;

    invoke-direct {v6, p0, v7}, Ll0/d;-><init>(Ll0/e;Ll0/d$b;)V

    iput-object v6, p0, Ll0/e;->O:Ll0/d;

    const/4 v7, 0x6

    new-array v7, v7, [Ll0/d;

    .line 40
    iget-object v8, p0, Ll0/e;->H:Ll0/d;

    aput-object v8, v7, v0

    iget-object v8, p0, Ll0/e;->J:Ll0/d;

    aput-object v8, v7, v3

    iget-object v8, p0, Ll0/e;->I:Ll0/d;

    aput-object v8, v7, v1

    iget-object v8, p0, Ll0/e;->K:Ll0/d;

    const/4 v9, 0x3

    aput-object v8, v7, v9

    iget-object v8, p0, Ll0/e;->L:Ll0/d;

    const/4 v9, 0x4

    aput-object v8, v7, v9

    const/4 v8, 0x5

    aput-object v6, v7, v8

    iput-object v7, p0, Ll0/e;->P:[Ll0/d;

    .line 41
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    new-array v6, v1, [Z

    .line 42
    iput-object v6, p0, Ll0/e;->R:[Z

    new-array v6, v1, [Ll0/e$b;

    .line 43
    sget-object v7, Ll0/e$b;->n:Ll0/e$b;

    aput-object v7, v6, v0

    aput-object v7, v6, v3

    iput-object v6, p0, Ll0/e;->S:[Ll0/e$b;

    .line 44
    iput-object v2, p0, Ll0/e;->T:Ll0/e;

    .line 45
    iput v0, p0, Ll0/e;->U:I

    .line 46
    iput v0, p0, Ll0/e;->V:I

    .line 47
    iput v5, p0, Ll0/e;->W:F

    .line 48
    iput v4, p0, Ll0/e;->X:I

    .line 49
    iput v0, p0, Ll0/e;->Y:I

    .line 50
    iput v0, p0, Ll0/e;->Z:I

    .line 51
    iput v0, p0, Ll0/e;->a0:I

    .line 52
    iput v0, p0, Ll0/e;->b0:I

    .line 53
    iput v0, p0, Ll0/e;->c0:I

    .line 54
    iput v0, p0, Ll0/e;->d0:I

    .line 55
    iput v0, p0, Ll0/e;->e0:I

    .line 56
    sget v5, Ll0/e;->C0:F

    iput v5, p0, Ll0/e;->h0:F

    .line 57
    iput v5, p0, Ll0/e;->i0:F

    .line 58
    iput v0, p0, Ll0/e;->k0:I

    .line 59
    iput v0, p0, Ll0/e;->l0:I

    .line 60
    iput-object v2, p0, Ll0/e;->m0:Ljava/lang/String;

    .line 61
    iput-object v2, p0, Ll0/e;->n0:Ljava/lang/String;

    .line 62
    iput-boolean v0, p0, Ll0/e;->q0:Z

    .line 63
    iput v0, p0, Ll0/e;->r0:I

    .line 64
    iput v0, p0, Ll0/e;->s0:I

    new-array v5, v1, [F

    .line 65
    fill-array-data v5, :array_2

    iput-object v5, p0, Ll0/e;->v0:[F

    new-array v5, v1, [Ll0/e;

    aput-object v2, v5, v0

    aput-object v2, v5, v3

    .line 66
    iput-object v5, p0, Ll0/e;->w0:[Ll0/e;

    new-array v1, v1, [Ll0/e;

    aput-object v2, v1, v0

    aput-object v2, v1, v3

    .line 67
    iput-object v1, p0, Ll0/e;->x0:[Ll0/e;

    .line 68
    iput-object v2, p0, Ll0/e;->y0:Ll0/e;

    .line 69
    iput-object v2, p0, Ll0/e;->z0:Ll0/e;

    .line 70
    iput v4, p0, Ll0/e;->A0:I

    .line 71
    iput v4, p0, Ll0/e;->B0:I

    .line 72
    invoke-direct {p0}, Ll0/e;->d()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_2
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private Y(I)Z
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Ll0/e;->P:[Ll0/d;

    aget-object v1, v0, p1

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    aget-object v3, v0, p1

    if-eq v1, v3, :cond_0

    add-int/2addr p1, v2

    aget-object v1, v0, p1

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    aget-object p1, v0, p1

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method private d()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->M:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->N:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->O:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Ll0/e;->L:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private i(Lk0/d;ZZZZLk0/i;Lk0/i;Ll0/e$b;ZLl0/d;Ll0/d;IIIIFZZZZZIIIIFZ)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p23

    move/from16 v3, p24

    move/from16 v4, p25

    .line 1
    invoke-virtual {v10, v13}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v9

    .line 2
    invoke-virtual {v10, v14}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v8

    .line 3
    invoke-virtual/range {p10 .. p10}, Ll0/d;->i()Ll0/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v7

    .line 4
    invoke-virtual/range {p11 .. p11}, Ll0/d;->i()Ll0/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v6

    .line 5
    invoke-static {}, Lk0/d;->w()Lk0/e;

    .line 6
    invoke-virtual/range {p10 .. p10}, Ll0/d;->n()Z

    move-result v16

    .line 7
    invoke-virtual/range {p11 .. p11}, Ll0/d;->n()Z

    move-result v17

    .line 8
    iget-object v5, v0, Ll0/e;->O:Ll0/d;

    invoke-virtual {v5}, Ll0/d;->n()Z

    move-result v18

    if-eqz v17, :cond_0

    add-int/lit8 v5, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v5, v16

    :goto_0
    if-eqz v18, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    if-eqz p17, :cond_2

    const/16 v19, 0x3

    goto :goto_1

    :cond_2
    move/from16 v19, p22

    .line 9
    :goto_1
    sget-object v20, Ll0/e$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v21

    aget v12, v20, v21

    const/4 v2, 0x1

    if-eq v12, v2, :cond_3

    const/4 v2, 0x2

    if-eq v12, v2, :cond_3

    const/4 v2, 0x3

    if-eq v12, v2, :cond_3

    const/4 v2, 0x4

    if-eq v12, v2, :cond_5

    :cond_3
    move/from16 v12, v19

    :cond_4
    const/16 v19, 0x0

    goto :goto_2

    :cond_5
    move/from16 v12, v19

    if-eq v12, v2, :cond_4

    const/16 v19, 0x1

    .line 10
    :goto_2
    iget v2, v0, Ll0/e;->l0:I

    const/16 v14, 0x8

    if-ne v2, v14, :cond_6

    const/4 v2, 0x0

    const/16 v19, 0x0

    goto :goto_3

    :cond_6
    move/from16 v2, p13

    :goto_3
    if-eqz p27, :cond_8

    if-nez v16, :cond_7

    if-nez v17, :cond_7

    if-nez v18, :cond_7

    move/from16 v14, p12

    .line 11
    invoke-virtual {v10, v9, v14}, Lk0/d;->f(Lk0/i;I)V

    goto :goto_4

    :cond_7
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    .line 12
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v14

    move-object/from16 v23, v6

    const/16 v6, 0x8

    invoke-virtual {v10, v9, v7, v14, v6}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v23, v6

    const/16 v6, 0x8

    :goto_5
    if-nez v19, :cond_c

    if-eqz p9, :cond_a

    const/4 v6, 0x0

    const/4 v14, 0x3

    .line 13
    invoke-virtual {v10, v8, v9, v6, v14}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    const/16 v6, 0x8

    if-lez v15, :cond_9

    .line 14
    invoke-virtual {v10, v8, v9, v15, v6}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_9
    const v2, 0x7fffffff

    if-ge v1, v2, :cond_b

    .line 15
    invoke-virtual {v10, v8, v9, v1, v6}, Lk0/d;->j(Lk0/i;Lk0/i;II)V

    goto :goto_6

    .line 16
    :cond_a
    invoke-virtual {v10, v8, v9, v2, v6}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    :cond_b
    :goto_6
    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    :goto_7
    move/from16 v25, v19

    move-object/from16 v14, v23

    move/from16 v19, p5

    :goto_8
    move/from16 v23, v5

    goto/16 :goto_11

    :cond_c
    const/4 v1, 0x2

    if-eq v5, v1, :cond_f

    if-nez p17, :cond_f

    const/4 v1, 0x1

    if-eq v12, v1, :cond_d

    if-nez v12, :cond_f

    .line 17
    :cond_d
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_e

    .line 18
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_e
    const/16 v2, 0x8

    .line 19
    invoke-virtual {v10, v8, v9, v1, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    move/from16 v19, p5

    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    move-object/from16 v14, v23

    const/16 v25, 0x0

    goto :goto_8

    :cond_f
    const/4 v1, -0x2

    if-ne v3, v1, :cond_10

    move v14, v2

    goto :goto_9

    :cond_10
    move v14, v3

    :goto_9
    if-ne v4, v1, :cond_11

    move v1, v2

    goto :goto_a

    :cond_11
    move v1, v4

    :goto_a
    if-lez v2, :cond_12

    const/4 v3, 0x1

    if-eq v12, v3, :cond_12

    const/4 v2, 0x0

    :cond_12
    if-lez v14, :cond_13

    const/16 v3, 0x8

    .line 20
    invoke-virtual {v10, v8, v9, v14, v3}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 21
    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_13
    if-lez v1, :cond_16

    if-eqz p3, :cond_14

    const/4 v3, 0x1

    if-ne v12, v3, :cond_14

    const/4 v3, 0x0

    goto :goto_b

    :cond_14
    const/4 v3, 0x1

    :goto_b
    if-eqz v3, :cond_15

    const/16 v3, 0x8

    .line 22
    invoke-virtual {v10, v8, v9, v1, v3}, Lk0/d;->j(Lk0/i;Lk0/i;II)V

    goto :goto_c

    :cond_15
    const/16 v3, 0x8

    .line 23
    :goto_c
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_d

    :cond_16
    const/16 v3, 0x8

    :goto_d
    const/4 v4, 0x1

    if-ne v12, v4, :cond_19

    if-eqz p3, :cond_17

    .line 24
    invoke-virtual {v10, v8, v9, v2, v3}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    goto :goto_e

    :cond_17
    if-eqz p19, :cond_18

    const/4 v4, 0x5

    .line 25
    invoke-virtual {v10, v8, v9, v2, v4}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    .line 26
    invoke-virtual {v10, v8, v9, v2, v3}, Lk0/d;->j(Lk0/i;Lk0/i;II)V

    goto :goto_e

    :cond_18
    const/4 v4, 0x5

    .line 27
    invoke-virtual {v10, v8, v9, v2, v4}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    .line 28
    invoke-virtual {v10, v8, v9, v2, v3}, Lk0/d;->j(Lk0/i;Lk0/i;II)V

    :goto_e
    move-object v15, v7

    move-object v2, v8

    move/from16 v24, v14

    goto/16 :goto_7

    :cond_19
    const/4 v2, 0x2

    if-ne v12, v2, :cond_1c

    .line 29
    invoke-virtual/range {p10 .. p10}, Ll0/d;->j()Ll0/d$b;

    move-result-object v3

    sget-object v4, Ll0/d$b;->p:Ll0/d$b;

    if-eq v3, v4, :cond_1b

    invoke-virtual/range {p10 .. p10}, Ll0/d;->j()Ll0/d$b;

    move-result-object v3

    sget-object v6, Ll0/d$b;->r:Ll0/d$b;

    if-ne v3, v6, :cond_1a

    goto :goto_f

    .line 30
    :cond_1a
    iget-object v3, v0, Ll0/e;->T:Ll0/e;

    sget-object v4, Ll0/d$b;->o:Ll0/d$b;

    invoke-virtual {v3, v4}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v3

    .line 31
    iget-object v4, v0, Ll0/e;->T:Ll0/e;

    sget-object v6, Ll0/d$b;->q:Ll0/d$b;

    invoke-virtual {v4, v6}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v4

    goto :goto_10

    .line 32
    :cond_1b
    :goto_f
    iget-object v3, v0, Ll0/e;->T:Ll0/e;

    invoke-virtual {v3, v4}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v3

    .line 33
    iget-object v4, v0, Ll0/e;->T:Ll0/e;

    sget-object v6, Ll0/d$b;->r:Ll0/d$b;

    invoke-virtual {v4, v6}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v4

    :goto_10
    move-object/from16 v19, v3

    move-object v6, v4

    .line 34
    invoke-virtual/range {p1 .. p1}, Lk0/d;->r()Lk0/b;

    move-result-object v3

    move-object v4, v8

    move v2, v5

    move-object v5, v9

    move/from16 p9, v14

    move-object/from16 v14, v23

    move-object v15, v7

    move-object/from16 v7, v19

    move/from16 v23, v2

    move-object v2, v8

    move/from16 v8, p26

    invoke-virtual/range {v3 .. v8}, Lk0/b;->k(Lk0/i;Lk0/i;Lk0/i;Lk0/i;F)Lk0/b;

    move-result-object v3

    invoke-virtual {v10, v3}, Lk0/d;->d(Lk0/b;)V

    move/from16 v19, p5

    move/from16 v24, p9

    const/16 v25, 0x0

    goto :goto_11

    :cond_1c
    move-object v15, v7

    move-object v2, v8

    move/from16 p9, v14

    move-object/from16 v14, v23

    move/from16 v23, v5

    move/from16 v24, p9

    move/from16 v25, v19

    const/16 v19, 0x1

    :goto_11
    if-eqz p27, :cond_56

    if-eqz p19, :cond_1d

    move-object/from16 v3, p7

    move-object v4, v2

    move-object v13, v9

    move-object v1, v11

    move/from16 v5, v23

    const/4 v2, 0x0

    const/4 v7, 0x2

    const/16 v30, 0x1

    goto/16 :goto_2f

    :cond_1d
    if-nez v16, :cond_1e

    if-nez v17, :cond_1e

    if-nez v18, :cond_1e

    goto/16 :goto_2c

    :cond_1e
    if-eqz v16, :cond_1f

    if-nez v17, :cond_1f

    goto/16 :goto_2c

    :cond_1f
    if-nez v16, :cond_22

    if-eqz v17, :cond_22

    .line 35
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v1

    neg-int v1, v1

    const/16 v3, 0x8

    invoke-virtual {v10, v2, v14, v1, v3}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    if-eqz p3, :cond_51

    .line 36
    iget-boolean v1, v0, Ll0/e;->j:Z

    if-eqz v1, :cond_21

    iget-boolean v1, v9, Lk0/i;->g:Z

    if-eqz v1, :cond_21

    iget-object v1, v0, Ll0/e;->T:Ll0/e;

    if-eqz v1, :cond_21

    .line 37
    check-cast v1, Ll0/f;

    if-eqz p2, :cond_20

    .line 38
    invoke-virtual {v1, v13}, Ll0/f;->i1(Ll0/d;)V

    goto/16 :goto_2c

    .line 39
    :cond_20
    invoke-virtual {v1, v13}, Ll0/f;->n1(Ll0/d;)V

    goto/16 :goto_2c

    :cond_21
    const/4 v1, 0x5

    const/4 v3, 0x0

    .line 40
    invoke-virtual {v10, v9, v11, v3, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto/16 :goto_2c

    :cond_22
    const/4 v3, 0x0

    if-eqz v16, :cond_51

    if-eqz v17, :cond_51

    .line 41
    iget-object v4, v13, Ll0/d;->f:Ll0/d;

    iget-object v8, v4, Ll0/d;->d:Ll0/e;

    move-object/from16 v6, p11

    const/4 v7, 0x0

    .line 42
    iget-object v3, v6, Ll0/d;->f:Ll0/d;

    iget-object v5, v3, Ll0/d;->d:Ll0/e;

    .line 43
    invoke-virtual/range {p0 .. p0}, Ll0/e;->I()Ll0/e;

    move-result-object v4

    const/16 v16, 0x6

    if-eqz v25, :cond_35

    if-nez v12, :cond_27

    if-nez v1, :cond_24

    if-nez v24, :cond_24

    .line 44
    iget-boolean v1, v15, Lk0/i;->g:Z

    if-eqz v1, :cond_23

    iget-boolean v1, v14, Lk0/i;->g:Z

    if-eqz v1, :cond_23

    .line 45
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v1

    const/16 v3, 0x8

    invoke-virtual {v10, v9, v15, v1, v3}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    .line 46
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v2, v14, v1, v3}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    return-void

    :cond_23
    const/4 v1, 0x0

    const/4 v3, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x8

    const/16 v21, 0x8

    goto :goto_12

    :cond_24
    const/4 v1, 0x1

    const/4 v3, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x5

    const/16 v21, 0x5

    .line 47
    :goto_12
    instance-of v7, v8, Ll0/a;

    if-nez v7, :cond_26

    instance-of v7, v5, Ll0/a;

    if-eqz v7, :cond_25

    goto :goto_13

    :cond_25
    move/from16 v20, v17

    move/from16 v23, v18

    move/from16 v22, v21

    const/4 v7, 0x1

    const/16 v21, 0x6

    goto :goto_14

    :cond_26
    :goto_13
    move/from16 v20, v17

    move/from16 v23, v18

    const/4 v7, 0x1

    const/16 v21, 0x6

    const/16 v22, 0x4

    :goto_14
    move/from16 v17, v1

    move/from16 v18, v3

    const/4 v1, 0x3

    :goto_15
    move-object/from16 v3, p7

    goto/16 :goto_20

    :cond_27
    const/4 v3, 0x1

    if-ne v12, v3, :cond_28

    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/4 v7, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x6

    const/16 v22, 0x4

    :goto_16
    const/16 v23, 0x8

    goto/16 :goto_20

    :cond_28
    const/4 v3, 0x3

    if-ne v12, v3, :cond_34

    .line 48
    iget v7, v0, Ll0/e;->y:I

    const/4 v3, -0x1

    if-ne v7, v3, :cond_2b

    if-eqz p20, :cond_2a

    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/4 v7, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x1

    if-eqz p3, :cond_29

    const/16 v21, 0x5

    goto :goto_17

    :cond_29
    const/16 v21, 0x4

    goto :goto_17

    :cond_2a
    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/4 v7, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x8

    :goto_17
    const/16 v22, 0x5

    goto :goto_16

    :cond_2b
    if-eqz p17, :cond_2f

    move/from16 v3, p23

    const/4 v7, 0x2

    if-eq v3, v7, :cond_2d

    const/4 v7, 0x1

    if-ne v3, v7, :cond_2c

    goto :goto_18

    :cond_2c
    const/4 v1, 0x0

    goto :goto_19

    :cond_2d
    const/4 v7, 0x1

    :goto_18
    const/4 v1, 0x1

    :goto_19
    if-nez v1, :cond_2e

    const/16 v1, 0x8

    const/4 v3, 0x5

    goto :goto_1a

    :cond_2e
    const/4 v1, 0x5

    const/4 v3, 0x4

    :goto_1a
    move/from16 v23, v1

    move/from16 v22, v3

    const/4 v1, 0x3

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x6

    goto :goto_15

    :cond_2f
    const/4 v7, 0x1

    if-lez v1, :cond_30

    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x6

    const/16 v22, 0x5

    goto/16 :goto_1f

    :cond_30
    if-nez v1, :cond_33

    if-nez v24, :cond_33

    if-nez p20, :cond_31

    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x6

    const/16 v22, 0x8

    goto/16 :goto_1f

    :cond_31
    if-eq v8, v4, :cond_32

    if-eq v5, v4, :cond_32

    const/4 v1, 0x4

    goto :goto_1b

    :cond_32
    const/4 v1, 0x5

    :goto_1b
    move-object/from16 v3, p7

    move/from16 v23, v1

    const/4 v1, 0x3

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x6

    const/16 v22, 0x4

    goto/16 :goto_20

    :cond_33
    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/16 v17, 0x1

    const/16 v18, 0x1

    goto :goto_1d

    :cond_34
    const/4 v7, 0x1

    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    goto :goto_1e

    :cond_35
    const/4 v7, 0x1

    .line 49
    iget-boolean v1, v15, Lk0/i;->g:Z

    if-eqz v1, :cond_38

    iget-boolean v1, v14, Lk0/i;->g:Z

    if-eqz v1, :cond_38

    .line 50
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v1

    .line 51
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v3

    const/16 v4, 0x8

    move-object/from16 p17, p1

    move-object/from16 p18, v9

    move-object/from16 p19, v15

    move/from16 p20, v1

    move/from16 p21, p16

    move-object/from16 p22, v14

    move-object/from16 p23, v2

    move/from16 p24, v3

    move/from16 p25, v4

    .line 52
    invoke-virtual/range {p17 .. p25}, Lk0/d;->c(Lk0/i;Lk0/i;IFLk0/i;Lk0/i;II)V

    if-eqz p3, :cond_37

    if-eqz v19, :cond_37

    .line 53
    iget-object v1, v6, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_36

    .line 54
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v1

    move-object/from16 v3, p7

    goto :goto_1c

    :cond_36
    move-object/from16 v3, p7

    const/4 v1, 0x0

    :goto_1c
    if-eq v14, v3, :cond_37

    const/4 v4, 0x5

    .line 55
    invoke-virtual {v10, v3, v2, v1, v4}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_37
    return-void

    :cond_38
    move-object/from16 v3, p7

    const/4 v1, 0x3

    const/16 v17, 0x1

    const/16 v18, 0x0

    :goto_1d
    const/16 v20, 0x1

    :goto_1e
    const/16 v21, 0x6

    const/16 v22, 0x4

    :goto_1f
    const/16 v23, 0x5

    :goto_20
    if-eqz v20, :cond_39

    if-ne v15, v14, :cond_39

    if-eq v8, v4, :cond_39

    const/16 v20, 0x0

    const/16 v26, 0x0

    goto :goto_21

    :cond_39
    const/16 v26, 0x1

    :goto_21
    if-eqz v17, :cond_3b

    if-nez v25, :cond_3a

    if-nez p18, :cond_3a

    if-nez p20, :cond_3a

    if-ne v15, v11, :cond_3a

    if-ne v14, v3, :cond_3a

    const/16 v17, 0x0

    const/16 v21, 0x8

    const/16 v23, 0x8

    const/16 v26, 0x0

    goto :goto_22

    :cond_3a
    move/from16 v17, p3

    .line 56
    :goto_22
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v27

    .line 57
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v28

    const/4 v13, 0x3

    move-object/from16 v1, p1

    move-object/from16 p8, v2

    const/16 v29, 0x4

    const/16 v30, 0x1

    move-object v2, v9

    move-object v7, v3

    move-object v3, v15

    move-object v13, v4

    move/from16 v4, v27

    move/from16 v27, v12

    move-object v12, v5

    move/from16 v5, p16

    move-object v6, v14

    move-object/from16 v7, p8

    move-object v11, v8

    move/from16 v8, v28

    move-object/from16 v28, v13

    move-object v13, v9

    move/from16 v9, v21

    .line 58
    invoke-virtual/range {v1 .. v9}, Lk0/d;->c(Lk0/i;Lk0/i;IFLk0/i;Lk0/i;II)V

    goto :goto_23

    :cond_3b
    move-object/from16 p8, v2

    move-object/from16 v28, v4

    move-object v11, v8

    move-object v13, v9

    move/from16 v27, v12

    const/16 v29, 0x4

    const/16 v30, 0x1

    move-object v12, v5

    move/from16 v17, p3

    :goto_23
    move/from16 v2, v26

    .line 59
    iget v1, v0, Ll0/e;->l0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_3c

    invoke-virtual/range {p11 .. p11}, Ll0/d;->l()Z

    move-result v1

    if-nez v1, :cond_3c

    return-void

    :cond_3c
    if-eqz v20, :cond_3f

    if-eqz v17, :cond_3e

    if-eq v15, v14, :cond_3e

    if-nez v25, :cond_3e

    .line 60
    instance-of v1, v11, Ll0/a;

    if-nez v1, :cond_3d

    instance-of v1, v12, Ll0/a;

    if-eqz v1, :cond_3e

    :cond_3d
    const/4 v1, 0x6

    goto :goto_24

    :cond_3e
    move/from16 v1, v23

    .line 61
    :goto_24
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v3

    invoke-virtual {v10, v13, v15, v3, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 62
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v3

    neg-int v3, v3

    move-object/from16 v4, p8

    invoke-virtual {v10, v4, v14, v3, v1}, Lk0/d;->j(Lk0/i;Lk0/i;II)V

    move/from16 v23, v1

    goto :goto_25

    :cond_3f
    move-object/from16 v4, p8

    :goto_25
    if-eqz v17, :cond_40

    if-eqz p21, :cond_40

    .line 63
    instance-of v1, v11, Ll0/a;

    if-nez v1, :cond_40

    instance-of v1, v12, Ll0/a;

    if-nez v1, :cond_40

    const/4 v1, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x6

    goto :goto_26

    :cond_40
    move/from16 v1, v22

    move/from16 v3, v23

    :goto_26
    if-eqz v2, :cond_4c

    if-eqz v18, :cond_49

    if-eqz p20, :cond_41

    if-eqz p4, :cond_49

    :cond_41
    move-object/from16 v2, v28

    if-eq v11, v2, :cond_43

    if-ne v12, v2, :cond_42

    goto :goto_27

    :cond_42
    move/from16 v16, v1

    .line 64
    :cond_43
    :goto_27
    instance-of v5, v11, Ll0/g;

    if-nez v5, :cond_44

    instance-of v5, v12, Ll0/g;

    if-eqz v5, :cond_45

    :cond_44
    const/16 v16, 0x5

    .line 65
    :cond_45
    instance-of v5, v11, Ll0/a;

    if-nez v5, :cond_46

    instance-of v5, v12, Ll0/a;

    if-eqz v5, :cond_47

    :cond_46
    const/16 v16, 0x5

    :cond_47
    if-eqz p20, :cond_48

    const/4 v5, 0x5

    goto :goto_28

    :cond_48
    move/from16 v5, v16

    .line 66
    :goto_28
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_29

    :cond_49
    move-object/from16 v2, v28

    :goto_29
    if-eqz v17, :cond_4b

    .line 67
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-eqz p17, :cond_4b

    if-nez p20, :cond_4b

    if-eq v11, v2, :cond_4a

    if-ne v12, v2, :cond_4b

    :cond_4a
    const/4 v2, 0x4

    goto :goto_2a

    :cond_4b
    move v2, v1

    .line 68
    :goto_2a
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v1

    invoke-virtual {v10, v13, v15, v1, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    .line 69
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v4, v14, v1, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    :cond_4c
    if-eqz v17, :cond_4e

    move-object/from16 v1, p6

    if-ne v1, v15, :cond_4d

    .line 70
    invoke-virtual/range {p10 .. p10}, Ll0/d;->e()I

    move-result v2

    goto :goto_2b

    :cond_4d
    const/4 v2, 0x0

    :goto_2b
    if-eq v15, v1, :cond_4e

    const/4 v3, 0x5

    .line 71
    invoke-virtual {v10, v13, v1, v2, v3}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_4e
    if-eqz v17, :cond_50

    if-eqz v25, :cond_50

    if-nez p14, :cond_50

    if-nez v24, :cond_50

    if-eqz v25, :cond_4f

    move/from16 v12, v27

    const/4 v1, 0x3

    if-ne v12, v1, :cond_4f

    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 72
    invoke-virtual {v10, v4, v13, v2, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto :goto_2d

    :cond_4f
    const/4 v2, 0x0

    const/4 v1, 0x5

    .line 73
    invoke-virtual {v10, v4, v13, v2, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto :goto_2d

    :cond_50
    const/4 v2, 0x0

    goto :goto_2d

    :cond_51
    :goto_2c
    move-object v4, v2

    const/4 v2, 0x0

    move/from16 v17, p3

    :goto_2d
    if-eqz v17, :cond_55

    if-eqz v19, :cond_55

    move-object/from16 v1, p11

    .line 74
    iget-object v3, v1, Ll0/d;->f:Ll0/d;

    if-eqz v3, :cond_52

    .line 75
    invoke-virtual/range {p11 .. p11}, Ll0/d;->e()I

    move-result v2

    :cond_52
    move-object/from16 v3, p7

    if-eq v14, v3, :cond_55

    .line 76
    iget-boolean v5, v0, Ll0/e;->j:Z

    if-eqz v5, :cond_54

    iget-boolean v5, v4, Lk0/i;->g:Z

    if-eqz v5, :cond_54

    iget-object v5, v0, Ll0/e;->T:Ll0/e;

    if-eqz v5, :cond_54

    .line 77
    check-cast v5, Ll0/f;

    if-eqz p2, :cond_53

    .line 78
    invoke-virtual {v5, v1}, Ll0/f;->h1(Ll0/d;)V

    goto :goto_2e

    .line 79
    :cond_53
    invoke-virtual {v5, v1}, Ll0/f;->m1(Ll0/d;)V

    :goto_2e
    return-void

    :cond_54
    const/4 v1, 0x5

    .line 80
    invoke-virtual {v10, v3, v4, v2, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_55
    return-void

    :cond_56
    move-object/from16 v3, p7

    move-object v4, v2

    move-object v13, v9

    move-object v1, v11

    const/4 v2, 0x0

    const/4 v7, 0x2

    const/16 v30, 0x1

    move/from16 v5, v23

    :goto_2f
    if-ge v5, v7, :cond_5b

    if-eqz p3, :cond_5b

    if-eqz v19, :cond_5b

    const/16 v5, 0x8

    .line 81
    invoke-virtual {v10, v13, v1, v2, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    if-nez p2, :cond_58

    .line 82
    iget-object v1, v0, Ll0/e;->L:Ll0/d;

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-nez v1, :cond_57

    goto :goto_30

    :cond_57
    const/4 v1, 0x0

    goto :goto_31

    :cond_58
    :goto_30
    const/4 v1, 0x1

    :goto_31
    if-nez p2, :cond_5a

    .line 83
    iget-object v5, v0, Ll0/e;->L:Ll0/d;

    iget-object v5, v5, Ll0/d;->f:Ll0/d;

    if-eqz v5, :cond_5a

    .line 84
    iget-object v1, v5, Ll0/d;->d:Ll0/e;

    .line 85
    iget v5, v1, Ll0/e;->W:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-eqz v5, :cond_59

    iget-object v1, v1, Ll0/e;->S:[Ll0/e$b;

    aget-object v5, v1, v2

    sget-object v6, Ll0/e$b;->p:Ll0/e$b;

    if-ne v5, v6, :cond_59

    aget-object v1, v1, v30

    if-ne v1, v6, :cond_59

    goto :goto_32

    :cond_59
    const/16 v30, 0x0

    goto :goto_32

    :cond_5a
    move/from16 v30, v1

    :goto_32
    if-eqz v30, :cond_5b

    const/16 v1, 0x8

    .line 86
    invoke-virtual {v10, v3, v4, v2, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_5b
    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Ll0/e;->F:I

    return v0
.end method

.method public A0(IIIF)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->p:I

    .line 2
    iput p2, p0, Ll0/e;->s:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    .line 3
    :cond_0
    iput p3, p0, Ll0/e;->t:I

    .line 4
    iput p4, p0, Ll0/e;->u:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    .line 5
    iput p1, p0, Ll0/e;->p:I

    :cond_1
    return-void
.end method

.method public B()I
    .locals 1

    iget v0, p0, Ll0/e;->G:I

    return v0
.end method

.method public B0(F)V
    .locals 2

    iget-object v0, p0, Ll0/e;->v0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public C(I)I
    .locals 1

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Ll0/e;->R()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    invoke-virtual {p0}, Ll0/e;->v()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected C0(IZ)V
    .locals 1

    iget-object v0, p0, Ll0/e;->R:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public D()I
    .locals 2

    iget-object v0, p0, Ll0/e;->A:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public D0(Z)V
    .locals 0

    iput-boolean p1, p0, Ll0/e;->D:Z

    return-void
.end method

.method public E()I
    .locals 2

    iget-object v0, p0, Ll0/e;->A:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public E0(Z)V
    .locals 0

    iput-boolean p1, p0, Ll0/e;->E:Z

    return-void
.end method

.method public F()I
    .locals 1

    iget v0, p0, Ll0/e;->g0:I

    return v0
.end method

.method public F0(II)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->F:I

    .line 2
    iput p2, p0, Ll0/e;->G:I

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Ll0/e;->I0(Z)V

    return-void
.end method

.method public G()I
    .locals 1

    iget v0, p0, Ll0/e;->f0:I

    return v0
.end method

.method public G0(I)V
    .locals 2

    iget-object v0, p0, Ll0/e;->A:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public H(I)Ll0/e;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Ll0/e;->J:Ll0/d;

    iget-object v0, p1, Ll0/d;->f:Ll0/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-ne v1, p1, :cond_1

    .line 2
    iget-object p1, v0, Ll0/d;->d:Ll0/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Ll0/e;->K:Ll0/d;

    iget-object v0, p1, Ll0/d;->f:Ll0/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-ne v1, p1, :cond_1

    .line 4
    iget-object p1, v0, Ll0/d;->d:Ll0/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public H0(I)V
    .locals 2

    iget-object v0, p0, Ll0/e;->A:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public I()Ll0/e;
    .locals 1

    iget-object v0, p0, Ll0/e;->T:Ll0/e;

    return-object v0
.end method

.method public I0(Z)V
    .locals 0

    iput-boolean p1, p0, Ll0/e;->i:Z

    return-void
.end method

.method public J(I)Ll0/e;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    iget-object v0, p1, Ll0/d;->f:Ll0/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-ne v1, p1, :cond_1

    .line 2
    iget-object p1, v0, Ll0/d;->d:Ll0/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    iget-object v0, p1, Ll0/d;->f:Ll0/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-ne v1, p1, :cond_1

    .line 4
    iget-object p1, v0, Ll0/d;->d:Ll0/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public J0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Ll0/e;->g0:I

    goto :goto_0

    .line 2
    :cond_0
    iput p1, p0, Ll0/e;->g0:I

    :goto_0
    return-void
.end method

.method public K()I
    .locals 2

    invoke-virtual {p0}, Ll0/e;->S()I

    move-result v0

    iget v1, p0, Ll0/e;->U:I

    add-int/2addr v0, v1

    return v0
.end method

.method public K0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Ll0/e;->f0:I

    goto :goto_0

    .line 2
    :cond_0
    iput p1, p0, Ll0/e;->f0:I

    :goto_0
    return-void
.end method

.method public L(I)Lm0/p;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Ll0/e;->e:Lm0/l;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Ll0/e;->f:Lm0/n;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public L0(II)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->Y:I

    .line 2
    iput p2, p0, Ll0/e;->Z:I

    return-void
.end method

.method public M()F
    .locals 1

    iget v0, p0, Ll0/e;->i0:F

    return v0
.end method

.method public M0(Ll0/e;)V
    .locals 0

    iput-object p1, p0, Ll0/e;->T:Ll0/e;

    return-void
.end method

.method public N()I
    .locals 1

    iget v0, p0, Ll0/e;->s0:I

    return v0
.end method

.method public N0(F)V
    .locals 0

    iput p1, p0, Ll0/e;->i0:F

    return-void
.end method

.method public O()Ll0/e$b;
    .locals 2

    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public O0(I)V
    .locals 0

    iput p1, p0, Ll0/e;->s0:I

    return-void
.end method

.method public P()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    iget v0, v0, Ll0/d;->g:I

    add-int/2addr v1, v0

    .line 3
    :cond_0
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    iget v0, v0, Ll0/d;->g:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public P0(II)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->Z:I

    sub-int/2addr p2, p1

    .line 2
    iput p2, p0, Ll0/e;->V:I

    .line 3
    iget p1, p0, Ll0/e;->g0:I

    if-ge p2, p1, :cond_0

    .line 4
    iput p1, p0, Ll0/e;->V:I

    :cond_0
    return-void
.end method

.method public Q()I
    .locals 1

    iget v0, p0, Ll0/e;->l0:I

    return v0
.end method

.method public Q0(Ll0/e$b;)V
    .locals 2

    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public R()I
    .locals 2

    .line 1
    iget v0, p0, Ll0/e;->l0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, p0, Ll0/e;->U:I

    return v0
.end method

.method public R0(IIIF)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->q:I

    .line 2
    iput p2, p0, Ll0/e;->v:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    .line 3
    :cond_0
    iput p3, p0, Ll0/e;->w:I

    .line 4
    iput p4, p0, Ll0/e;->x:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    .line 5
    iput p1, p0, Ll0/e;->q:I

    :cond_1
    return-void
.end method

.method public S()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ll0/f;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ll0/f;

    iget v0, v0, Ll0/f;->J0:I

    iget v1, p0, Ll0/e;->Y:I

    add-int/2addr v0, v1

    return v0

    .line 3
    :cond_0
    iget v0, p0, Ll0/e;->Y:I

    return v0
.end method

.method public S0(F)V
    .locals 2

    iget-object v0, p0, Ll0/e;->v0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public T()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ll0/f;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ll0/f;

    iget v0, v0, Ll0/f;->K0:I

    iget v1, p0, Ll0/e;->Z:I

    add-int/2addr v0, v1

    return v0

    .line 3
    :cond_0
    iget v0, p0, Ll0/e;->Z:I

    return v0
.end method

.method public T0(I)V
    .locals 0

    iput p1, p0, Ll0/e;->l0:I

    return-void
.end method

.method public U()Z
    .locals 1

    iget-boolean v0, p0, Ll0/e;->C:Z

    return v0
.end method

.method public U0(I)V
    .locals 1

    .line 1
    iput p1, p0, Ll0/e;->U:I

    .line 2
    iget v0, p0, Ll0/e;->f0:I

    if-ge p1, v0, :cond_0

    .line 3
    iput v0, p0, Ll0/e;->U:I

    :cond_0
    return-void
.end method

.method public V(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    .line 1
    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    iget-object p1, p1, Ll0/d;->f:Ll0/d;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v3, p0, Ll0/e;->J:Ll0/d;

    iget-object v3, v3, Ll0/d;->f:Ll0/d;

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    return v1

    .line 2
    :cond_3
    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    iget-object p1, p1, Ll0/d;->f:Ll0/d;

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    iget-object v3, p0, Ll0/e;->K:Ll0/d;

    iget-object v3, v3, Ll0/d;->f:Ll0/d;

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    add-int/2addr p1, v3

    iget-object v3, p0, Ll0/e;->L:Ll0/d;

    iget-object v3, v3, Ll0/d;->f:Ll0/d;

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_7

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    :goto_6
    return v1
.end method

.method public V0(I)V
    .locals 0

    iput p1, p0, Ll0/e;->Y:I

    return-void
.end method

.method public W()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    iget-object v3, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/d;

    .line 3
    invoke-virtual {v3}, Ll0/d;->l()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public W0(I)V
    .locals 0

    iput p1, p0, Ll0/e;->Z:I

    return-void
.end method

.method public X(Ll0/d$b;Ll0/e;Ll0/d$b;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object p1

    .line 2
    invoke-virtual {p2, p3}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object p2

    const/4 p3, 0x1

    .line 3
    invoke-virtual {p1, p2, p4, p5, p3}, Ll0/d;->a(Ll0/d;IIZ)Z

    return-void
.end method

.method public X0(ZZZZ)V
    .locals 3

    .line 1
    iget p1, p0, Ll0/e;->y:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    .line 2
    iput v0, p0, Ll0/e;->y:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    .line 3
    iput v2, p0, Ll0/e;->y:I

    .line 4
    iget p1, p0, Ll0/e;->X:I

    if-ne p1, v1, :cond_1

    .line 5
    iget p1, p0, Ll0/e;->z:F

    div-float p1, p2, p1

    iput p1, p0, Ll0/e;->z:F

    .line 6
    :cond_1
    :goto_0
    iget p1, p0, Ll0/e;->y:I

    if-nez p1, :cond_3

    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-nez p1, :cond_3

    .line 7
    :cond_2
    iput v2, p0, Ll0/e;->y:I

    goto :goto_1

    .line 8
    :cond_3
    iget p1, p0, Ll0/e;->y:I

    if-ne p1, v2, :cond_5

    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-nez p1, :cond_5

    .line 9
    :cond_4
    iput v0, p0, Ll0/e;->y:I

    .line 10
    :cond_5
    :goto_1
    iget p1, p0, Ll0/e;->y:I

    if-ne p1, v1, :cond_8

    .line 11
    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    .line 12
    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-nez p1, :cond_8

    .line 13
    :cond_6
    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 14
    iput v0, p0, Ll0/e;->y:I

    goto :goto_2

    .line 15
    :cond_7
    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->n()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 16
    iget p1, p0, Ll0/e;->z:F

    div-float p1, p2, p1

    iput p1, p0, Ll0/e;->z:F

    .line 17
    iput v2, p0, Ll0/e;->y:I

    .line 18
    :cond_8
    :goto_2
    iget p1, p0, Ll0/e;->y:I

    if-ne p1, v1, :cond_a

    .line 19
    iget p1, p0, Ll0/e;->s:I

    if-lez p1, :cond_9

    iget p3, p0, Ll0/e;->v:I

    if-nez p3, :cond_9

    .line 20
    iput v0, p0, Ll0/e;->y:I

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    .line 21
    iget p1, p0, Ll0/e;->v:I

    if-lez p1, :cond_a

    .line 22
    iget p1, p0, Ll0/e;->z:F

    div-float/2addr p2, p1

    iput p2, p0, Ll0/e;->z:F

    .line 23
    iput v2, p0, Ll0/e;->y:I

    :cond_a
    :goto_3
    return-void
.end method

.method public Y0(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll0/e;->e:Lm0/l;

    invoke-virtual {v0}, Lm0/p;->k()Z

    move-result v0

    and-int/2addr p1, v0

    .line 2
    iget-object v0, p0, Ll0/e;->f:Lm0/n;

    invoke-virtual {v0}, Lm0/p;->k()Z

    move-result v0

    and-int/2addr p2, v0

    .line 3
    iget-object v0, p0, Ll0/e;->e:Lm0/l;

    iget-object v1, v0, Lm0/p;->h:Lm0/f;

    iget v1, v1, Lm0/f;->g:I

    .line 4
    iget-object v2, p0, Ll0/e;->f:Lm0/n;

    iget-object v3, v2, Lm0/p;->h:Lm0/f;

    iget v3, v3, Lm0/f;->g:I

    .line 5
    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    .line 6
    iget-object v2, v2, Lm0/p;->i:Lm0/f;

    iget v2, v2, Lm0/f;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    .line 7
    iput v1, p0, Ll0/e;->Y:I

    :cond_2
    if-eqz p2, :cond_3

    .line 8
    iput v3, p0, Ll0/e;->Z:I

    .line 9
    :cond_3
    iget v1, p0, Ll0/e;->l0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    .line 10
    iput v6, p0, Ll0/e;->U:I

    .line 11
    iput v6, p0, Ll0/e;->V:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    .line 12
    iget-object p1, p0, Ll0/e;->S:[Ll0/e$b;

    aget-object p1, p1, v6

    sget-object v1, Ll0/e$b;->n:Ll0/e$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Ll0/e;->U:I

    if-ge v0, p1, :cond_5

    move v0, p1

    .line 13
    :cond_5
    iput v0, p0, Ll0/e;->U:I

    .line 14
    iget p1, p0, Ll0/e;->f0:I

    if-ge v0, p1, :cond_6

    .line 15
    iput p1, p0, Ll0/e;->U:I

    :cond_6
    if-eqz p2, :cond_8

    .line 16
    iget-object p1, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Ll0/e$b;->n:Ll0/e$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Ll0/e;->V:I

    if-ge v2, p1, :cond_7

    move v2, p1

    .line 17
    :cond_7
    iput v2, p0, Ll0/e;->V:I

    .line 18
    iget p1, p0, Ll0/e;->g0:I

    if-ge v2, p1, :cond_8

    .line 19
    iput p1, p0, Ll0/e;->V:I

    :cond_8
    return-void
.end method

.method public Z()Z
    .locals 2

    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public Z0(Lk0/d;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {p1, v0}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result v0

    .line 2
    iget-object v1, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {p1, v1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result v1

    .line 3
    iget-object v2, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {p1, v2}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result v2

    .line 4
    iget-object v3, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {p1, v3}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    if-eqz p2, :cond_0

    .line 5
    iget-object v3, p0, Ll0/e;->e:Lm0/l;

    if-eqz v3, :cond_0

    iget-object v4, v3, Lm0/p;->h:Lm0/f;

    iget-boolean v5, v4, Lm0/f;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Lm0/p;->i:Lm0/f;

    iget-boolean v5, v3, Lm0/f;->j:Z

    if-eqz v5, :cond_0

    .line 6
    iget v0, v4, Lm0/f;->g:I

    .line 7
    iget v2, v3, Lm0/f;->g:I

    :cond_0
    if-eqz p2, :cond_1

    .line 8
    iget-object p2, p0, Ll0/e;->f:Lm0/n;

    if-eqz p2, :cond_1

    iget-object v3, p2, Lm0/p;->h:Lm0/f;

    iget-boolean v4, v3, Lm0/f;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, Lm0/p;->i:Lm0/f;

    iget-boolean v4, p2, Lm0/f;->j:Z

    if-eqz v4, :cond_1

    .line 9
    iget v1, v3, Lm0/f;->g:I

    .line 10
    iget p1, p2, Lm0/f;->g:I

    :cond_1
    sub-int p2, v2, v0

    sub-int v3, p1, v1

    const/4 v4, 0x0

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq v0, p2, :cond_2

    const v3, 0x7fffffff

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-eq v2, v3, :cond_2

    if-eq p1, p2, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 11
    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Ll0/e;->t0(IIII)V

    return-void
.end method

.method public a0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/e;->D:Z

    return v0
.end method

.method public b0()Z
    .locals 2

    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    iget-object v1, v0, Ll0/d;->f:Ll0/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Ll0/d;->f:Ll0/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/e;->E:Z

    return v0
.end method

.method public d0()Z
    .locals 2

    iget-boolean v0, p0, Ll0/e;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll0/e;->l0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/f;",
            "Lk0/d;",
            "Ljava/util/HashSet<",
            "Ll0/e;",
            ">;IZ)V"
        }
    .end annotation

    if-eqz p5, :cond_1

    .line 1
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p1, p2, p0}, Ll0/j;->a(Ll0/f;Lk0/d;Ll0/e;)V

    .line 3
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 p5, 0x40

    .line 4
    invoke-virtual {p1, p5}, Ll0/f;->B1(I)Z

    move-result p5

    invoke-virtual {p0, p2, p5}, Ll0/e;->g(Lk0/d;Z)V

    :cond_1
    if-nez p4, :cond_3

    .line 5
    iget-object p5, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {p5}, Ll0/d;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_2

    .line 6
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    .line 7
    iget-object v1, v0, Ll0/d;->d:Ll0/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Ll0/e;->e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p5, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {p5}, Ll0/d;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    .line 9
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    .line 10
    iget-object v1, v0, Ll0/d;->d:Ll0/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Ll0/e;->e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V

    goto :goto_1

    .line 11
    :cond_3
    iget-object p5, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {p5}, Ll0/d;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_4

    .line 12
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    .line 13
    iget-object v1, v0, Ll0/d;->d:Ll0/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Ll0/e;->e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V

    goto :goto_2

    .line 14
    :cond_4
    iget-object p5, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {p5}, Ll0/d;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_5

    .line 15
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    .line 16
    iget-object v1, v0, Ll0/d;->d:Ll0/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Ll0/e;->e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V

    goto :goto_3

    .line 17
    :cond_5
    iget-object p5, p0, Ll0/e;->L:Ll0/d;

    invoke-virtual {p5}, Ll0/d;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    .line 18
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    .line 19
    iget-object v1, v0, Ll0/d;->d:Ll0/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    :try_start_0
    invoke-virtual/range {v1 .. v6}, Ll0/e;->e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_6
    return-void

    :catchall_0
    move-exception p1

    throw p1
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/e;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method f()Z
    .locals 1

    instance-of v0, p0, Ll0/k;

    if-nez v0, :cond_1

    instance-of v0, p0, Ll0/g;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/e;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public g(Lk0/d;Z)V
    .locals 53

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    .line 1
    iget-object v0, v15, Ll0/e;->H:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v13

    .line 2
    iget-object v0, v15, Ll0/e;->J:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v12

    .line 3
    iget-object v0, v15, Ll0/e;->I:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v11

    .line 4
    iget-object v0, v15, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v10

    .line 5
    iget-object v0, v15, Ll0/e;->L:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v9

    .line 6
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    const/4 v8, 0x1

    const/4 v7, 0x0

    if-eqz v0, :cond_2

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, v0, Ll0/e;->S:[Ll0/e$b;

    aget-object v1, v1, v7

    sget-object v2, Ll0/e$b;->o:Ll0/e$b;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 8
    iget-object v0, v0, Ll0/e;->S:[Ll0/e$b;

    aget-object v0, v0, v8

    sget-object v2, Ll0/e$b;->o:Ll0/e$b;

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move v6, v0

    move v5, v1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 9
    :goto_2
    iget v0, v15, Ll0/e;->l0:I

    const/16 v4, 0x8

    if-ne v0, v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Ll0/e;->W()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v15, Ll0/e;->R:[Z

    aget-boolean v1, v0, v7

    if-nez v1, :cond_3

    aget-boolean v0, v0, v8

    if-nez v0, :cond_3

    return-void

    .line 10
    :cond_3
    iget-boolean v0, v15, Ll0/e;->l:Z

    const/4 v3, 0x5

    if-nez v0, :cond_4

    iget-boolean v1, v15, Ll0/e;->m:Z

    if-eqz v1, :cond_a

    :cond_4
    if-eqz v0, :cond_6

    .line 11
    iget v0, v15, Ll0/e;->Y:I

    invoke-virtual {v14, v13, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 12
    iget v0, v15, Ll0/e;->Y:I

    iget v1, v15, Ll0/e;->U:I

    add-int/2addr v0, v1

    invoke-virtual {v14, v12, v0}, Lk0/d;->f(Lk0/i;I)V

    if-eqz v5, :cond_6

    .line 13
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_6

    .line 14
    iget-boolean v1, v15, Ll0/e;->k:Z

    if-eqz v1, :cond_5

    .line 15
    check-cast v0, Ll0/f;

    .line 16
    iget-object v1, v15, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0, v1}, Ll0/f;->n1(Ll0/d;)V

    .line 17
    iget-object v1, v15, Ll0/e;->J:Ll0/d;

    invoke-virtual {v0, v1}, Ll0/f;->h1(Ll0/d;)V

    goto :goto_3

    .line 18
    :cond_5
    iget-object v0, v0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v7, v3}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 19
    :cond_6
    :goto_3
    iget-boolean v0, v15, Ll0/e;->m:Z

    if-eqz v0, :cond_9

    .line 20
    iget v0, v15, Ll0/e;->Z:I

    invoke-virtual {v14, v11, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 21
    iget v0, v15, Ll0/e;->Z:I

    iget v1, v15, Ll0/e;->V:I

    add-int/2addr v0, v1

    invoke-virtual {v14, v10, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 22
    iget-object v0, v15, Ll0/e;->L:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->l()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 23
    iget v0, v15, Ll0/e;->Z:I

    iget v1, v15, Ll0/e;->e0:I

    add-int/2addr v0, v1

    invoke-virtual {v14, v9, v0}, Lk0/d;->f(Lk0/i;I)V

    :cond_7
    if-eqz v6, :cond_9

    .line 24
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_9

    .line 25
    iget-boolean v1, v15, Ll0/e;->k:Z

    if-eqz v1, :cond_8

    .line 26
    check-cast v0, Ll0/f;

    .line 27
    iget-object v1, v15, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0, v1}, Ll0/f;->n1(Ll0/d;)V

    .line 28
    iget-object v1, v15, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0, v1}, Ll0/f;->m1(Ll0/d;)V

    goto :goto_4

    .line 29
    :cond_8
    iget-object v0, v0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v7, v3}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 30
    :cond_9
    :goto_4
    iget-boolean v0, v15, Ll0/e;->l:Z

    if-eqz v0, :cond_a

    iget-boolean v0, v15, Ll0/e;->m:Z

    if-eqz v0, :cond_a

    .line 31
    iput-boolean v7, v15, Ll0/e;->l:Z

    .line 32
    iput-boolean v7, v15, Ll0/e;->m:Z

    return-void

    .line 33
    :cond_a
    sget-boolean v0, Lk0/d;->r:Z

    if-eqz p2, :cond_d

    .line 34
    iget-object v0, v15, Ll0/e;->e:Lm0/l;

    if-eqz v0, :cond_d

    iget-object v1, v15, Ll0/e;->f:Lm0/n;

    if-eqz v1, :cond_d

    iget-object v2, v0, Lm0/p;->h:Lm0/f;

    iget-boolean v3, v2, Lm0/f;->j:Z

    if-eqz v3, :cond_d

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-eqz v0, :cond_d

    iget-object v0, v1, Lm0/p;->h:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-eqz v0, :cond_d

    iget-object v0, v1, Lm0/p;->i:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-eqz v0, :cond_d

    .line 35
    iget v0, v2, Lm0/f;->g:I

    invoke-virtual {v14, v13, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 36
    iget-object v0, v15, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    invoke-virtual {v14, v12, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 37
    iget-object v0, v15, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->h:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    invoke-virtual {v14, v11, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 38
    iget-object v0, v15, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    invoke-virtual {v14, v10, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 39
    iget-object v0, v15, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/n;->k:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    invoke-virtual {v14, v9, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 40
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_c

    if-eqz v5, :cond_b

    .line 41
    iget-object v0, v15, Ll0/e;->g:[Z

    aget-boolean v0, v0, v7

    if-eqz v0, :cond_b

    invoke-virtual/range {p0 .. p0}, Ll0/e;->Z()Z

    move-result v0

    if-nez v0, :cond_b

    .line 42
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    .line 43
    invoke-virtual {v14, v0, v12, v7, v4}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_b
    if-eqz v6, :cond_c

    .line 44
    iget-object v0, v15, Ll0/e;->g:[Z

    aget-boolean v0, v0, v8

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, Ll0/e;->b0()Z

    move-result v0

    if-nez v0, :cond_c

    .line 45
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    .line 46
    invoke-virtual {v14, v0, v10, v7, v4}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 47
    :cond_c
    iput-boolean v7, v15, Ll0/e;->l:Z

    .line 48
    iput-boolean v7, v15, Ll0/e;->m:Z

    return-void

    .line 49
    :cond_d
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_12

    .line 50
    invoke-direct {v15, v7}, Ll0/e;->Y(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 51
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    check-cast v0, Ll0/f;

    invoke-virtual {v0, v15, v7}, Ll0/f;->e1(Ll0/e;I)V

    const/4 v0, 0x1

    goto :goto_5

    .line 52
    :cond_e
    invoke-virtual/range {p0 .. p0}, Ll0/e;->Z()Z

    move-result v0

    .line 53
    :goto_5
    invoke-direct {v15, v8}, Ll0/e;->Y(I)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 54
    iget-object v1, v15, Ll0/e;->T:Ll0/e;

    check-cast v1, Ll0/f;

    invoke-virtual {v1, v15, v8}, Ll0/f;->e1(Ll0/e;I)V

    const/4 v1, 0x1

    goto :goto_6

    .line 55
    :cond_f
    invoke-virtual/range {p0 .. p0}, Ll0/e;->b0()Z

    move-result v1

    :goto_6
    if-nez v0, :cond_10

    if-eqz v5, :cond_10

    .line 56
    iget v2, v15, Ll0/e;->l0:I

    if-eq v2, v4, :cond_10

    iget-object v2, v15, Ll0/e;->H:Ll0/d;

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-nez v2, :cond_10

    iget-object v2, v15, Ll0/e;->J:Ll0/d;

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-nez v2, :cond_10

    .line 57
    iget-object v2, v15, Ll0/e;->T:Ll0/e;

    iget-object v2, v2, Ll0/e;->J:Ll0/d;

    invoke-virtual {v14, v2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v2

    .line 58
    invoke-virtual {v14, v2, v12, v7, v8}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_10
    if-nez v1, :cond_11

    if-eqz v6, :cond_11

    .line 59
    iget v2, v15, Ll0/e;->l0:I

    if-eq v2, v4, :cond_11

    iget-object v2, v15, Ll0/e;->I:Ll0/d;

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-nez v2, :cond_11

    iget-object v2, v15, Ll0/e;->K:Ll0/d;

    iget-object v2, v2, Ll0/d;->f:Ll0/d;

    if-nez v2, :cond_11

    iget-object v2, v15, Ll0/e;->L:Ll0/d;

    if-nez v2, :cond_11

    .line 60
    iget-object v2, v15, Ll0/e;->T:Ll0/e;

    iget-object v2, v2, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v2

    .line 61
    invoke-virtual {v14, v2, v10, v7, v8}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_11
    move/from16 v29, v0

    move/from16 v28, v1

    goto :goto_7

    :cond_12
    const/16 v28, 0x0

    const/16 v29, 0x0

    .line 62
    :goto_7
    iget v0, v15, Ll0/e;->U:I

    .line 63
    iget v1, v15, Ll0/e;->f0:I

    if-ge v0, v1, :cond_13

    goto :goto_8

    :cond_13
    move v1, v0

    .line 64
    :goto_8
    iget v2, v15, Ll0/e;->V:I

    .line 65
    iget v3, v15, Ll0/e;->g0:I

    if-ge v2, v3, :cond_14

    goto :goto_9

    :cond_14
    move v3, v2

    .line 66
    :goto_9
    iget-object v4, v15, Ll0/e;->S:[Ll0/e$b;

    aget-object v8, v4, v7

    sget-object v7, Ll0/e$b;->p:Ll0/e$b;

    move/from16 v20, v1

    if-eq v8, v7, :cond_15

    const/4 v8, 0x1

    goto :goto_a

    :cond_15
    const/4 v8, 0x0

    :goto_a
    const/16 v18, 0x1

    .line 67
    aget-object v1, v4, v18

    move/from16 v21, v3

    if-eq v1, v7, :cond_16

    const/4 v1, 0x1

    goto :goto_b

    :cond_16
    const/4 v1, 0x0

    .line 68
    :goto_b
    iget v3, v15, Ll0/e;->X:I

    iput v3, v15, Ll0/e;->y:I

    move-object/from16 v22, v9

    .line 69
    iget v9, v15, Ll0/e;->W:F

    iput v9, v15, Ll0/e;->z:F

    move-object/from16 v23, v10

    .line 70
    iget v10, v15, Ll0/e;->p:I

    move-object/from16 v27, v11

    .line 71
    iget v11, v15, Ll0/e;->q:I

    const/16 v24, 0x0

    const/16 v25, 0x4

    move-object/from16 v30, v12

    cmpl-float v24, v9, v24

    if-lez v24, :cond_20

    .line 72
    iget v12, v15, Ll0/e;->l0:I

    move-object/from16 v31, v13

    const/16 v13, 0x8

    if-eq v12, v13, :cond_21

    const/4 v12, 0x0

    .line 73
    aget-object v13, v4, v12

    if-ne v13, v7, :cond_17

    if-nez v10, :cond_17

    const/4 v10, 0x3

    :cond_17
    const/4 v13, 0x1

    .line 74
    aget-object v12, v4, v13

    if-ne v12, v7, :cond_18

    if-nez v11, :cond_18

    const/4 v11, 0x3

    :cond_18
    const/4 v12, 0x0

    .line 75
    aget-object v14, v4, v12

    if-ne v14, v7, :cond_19

    aget-object v12, v4, v13

    if-ne v12, v7, :cond_19

    const/4 v12, 0x3

    if-ne v10, v12, :cond_1a

    if-ne v11, v12, :cond_1a

    .line 76
    invoke-virtual {v15, v5, v6, v8, v1}, Ll0/e;->X0(ZZZZ)V

    goto :goto_c

    :cond_19
    const/4 v12, 0x3

    :cond_1a
    const/4 v1, 0x0

    .line 77
    aget-object v8, v4, v1

    if-ne v8, v7, :cond_1c

    if-ne v10, v12, :cond_1c

    .line 78
    iput v1, v15, Ll0/e;->y:I

    int-to-float v0, v2

    mul-float v9, v9, v0

    float-to-int v1, v9

    const/4 v2, 0x1

    .line 79
    aget-object v0, v4, v2

    if-eq v0, v7, :cond_1b

    move/from16 v33, v11

    move/from16 v32, v21

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v34, 0x4

    goto :goto_e

    :cond_1b
    move/from16 v34, v10

    move/from16 v33, v11

    move/from16 v32, v21

    const/4 v14, 0x1

    const/16 v19, 0x0

    goto :goto_e

    :cond_1c
    const/4 v2, 0x1

    .line 80
    aget-object v1, v4, v2

    if-ne v1, v7, :cond_1f

    const/4 v1, 0x3

    if-ne v11, v1, :cond_1f

    .line 81
    iput v2, v15, Ll0/e;->y:I

    const/4 v1, -0x1

    if-ne v3, v1, :cond_1d

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v9

    .line 82
    iput v1, v15, Ll0/e;->z:F

    .line 83
    :cond_1d
    iget v1, v15, Ll0/e;->z:F

    int-to-float v0, v0

    mul-float v1, v1, v0

    float-to-int v3, v1

    const/16 v19, 0x0

    .line 84
    aget-object v0, v4, v19

    move/from16 v32, v3

    move/from16 v34, v10

    if-eq v0, v7, :cond_1e

    move/from16 v1, v20

    const/4 v14, 0x0

    const/16 v33, 0x4

    goto :goto_e

    :cond_1e
    move/from16 v33, v11

    move/from16 v1, v20

    goto :goto_d

    :cond_1f
    :goto_c
    const/16 v19, 0x0

    move/from16 v34, v10

    move/from16 v33, v11

    move/from16 v1, v20

    move/from16 v32, v21

    :goto_d
    const/4 v14, 0x1

    goto :goto_e

    :cond_20
    move-object/from16 v31, v13

    :cond_21
    const/16 v19, 0x0

    move/from16 v34, v10

    move/from16 v33, v11

    move/from16 v1, v20

    move/from16 v32, v21

    const/4 v14, 0x0

    .line 85
    :goto_e
    iget-object v0, v15, Ll0/e;->r:[I

    aput v34, v0, v19

    const/4 v2, 0x1

    .line 86
    aput v33, v0, v2

    .line 87
    iput-boolean v14, v15, Ll0/e;->h:Z

    if-eqz v14, :cond_23

    .line 88
    iget v0, v15, Ll0/e;->y:I

    const/4 v2, -0x1

    if-eqz v0, :cond_22

    if-ne v0, v2, :cond_24

    :cond_22
    const/16 v20, 0x1

    goto :goto_f

    :cond_23
    const/4 v2, -0x1

    :cond_24
    const/16 v20, 0x0

    :goto_f
    if-eqz v14, :cond_26

    .line 89
    iget v0, v15, Ll0/e;->y:I

    const/4 v3, 0x1

    if-eq v0, v3, :cond_25

    if-ne v0, v2, :cond_26

    :cond_25
    const/16 v35, 0x1

    goto :goto_10

    :cond_26
    const/16 v35, 0x0

    .line 90
    :goto_10
    iget-object v0, v15, Ll0/e;->S:[Ll0/e$b;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    sget-object v13, Ll0/e$b;->o:Ll0/e$b;

    if-ne v0, v13, :cond_27

    instance-of v0, v15, Ll0/f;

    if-eqz v0, :cond_27

    const/4 v9, 0x1

    goto :goto_11

    :cond_27
    const/4 v9, 0x0

    :goto_11
    if-eqz v9, :cond_28

    const/16 v21, 0x0

    goto :goto_12

    :cond_28
    move/from16 v21, v1

    .line 91
    :goto_12
    iget-object v0, v15, Ll0/e;->O:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->n()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v36, v0, 0x1

    .line 92
    iget-object v0, v15, Ll0/e;->R:[Z

    const/4 v2, 0x0

    aget-boolean v37, v0, v2

    .line 93
    aget-boolean v38, v0, v1

    .line 94
    iget v0, v15, Ll0/e;->n:I

    const/4 v12, 0x2

    const/16 v39, 0x0

    if-eq v0, v12, :cond_30

    iget-boolean v0, v15, Ll0/e;->l:Z

    if-nez v0, :cond_30

    if-eqz p2, :cond_2c

    .line 95
    iget-object v0, v15, Ll0/e;->e:Lm0/l;

    if-eqz v0, :cond_2c

    iget-object v1, v0, Lm0/p;->h:Lm0/f;

    iget-boolean v2, v1, Lm0/f;->j:Z

    if-eqz v2, :cond_2c

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-nez v0, :cond_29

    goto :goto_13

    :cond_29
    if-eqz p2, :cond_2b

    .line 96
    iget v0, v1, Lm0/f;->g:I

    move-object/from16 v11, p1

    move-object/from16 v10, v31

    invoke-virtual {v11, v10, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 97
    iget-object v0, v15, Ll0/e;->e:Lm0/l;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    move-object/from16 v8, v30

    invoke-virtual {v11, v8, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 98
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_2a

    if-eqz v5, :cond_2a

    .line 99
    iget-object v0, v15, Ll0/e;->g:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_2a

    invoke-virtual/range {p0 .. p0}, Ll0/e;->Z()Z

    move-result v0

    if-nez v0, :cond_2a

    .line 100
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    iget-object v0, v0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v11, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    const/16 v4, 0x8

    .line 101
    invoke-virtual {v11, v0, v8, v1, v4}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_2a
    move/from16 v47, v5

    move/from16 v31, v6

    move-object/from16 v48, v7

    move-object/from16 v30, v8

    move-object/from16 v40, v10

    move-object/from16 v52, v13

    move/from16 v41, v14

    move-object/from16 v49, v22

    move-object/from16 v50, v23

    move-object/from16 v51, v27

    goto/16 :goto_18

    :cond_2b
    move-object/from16 v11, p1

    goto/16 :goto_17

    :cond_2c
    :goto_13
    move-object/from16 v11, p1

    move-object/from16 v8, v30

    move-object/from16 v10, v31

    const/16 v4, 0x8

    .line 102
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_2d

    iget-object v0, v0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v11, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_14

    :cond_2d
    move-object/from16 v17, v39

    .line 103
    :goto_14
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_2e

    iget-object v0, v0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v11, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    move-object/from16 v30, v0

    goto :goto_15

    :cond_2e
    move-object/from16 v30, v39

    .line 104
    :goto_15
    iget-object v0, v15, Ll0/e;->g:[Z

    const/16 v19, 0x0

    aget-boolean v31, v0, v19

    iget-object v0, v15, Ll0/e;->S:[Ll0/e$b;

    aget-object v40, v0, v19

    iget-object v3, v15, Ll0/e;->H:Ll0/d;

    iget-object v1, v15, Ll0/e;->J:Ll0/d;

    iget v12, v15, Ll0/e;->Y:I

    iget v2, v15, Ll0/e;->f0:I

    iget-object v4, v15, Ll0/e;->A:[I

    aget v44, v4, v19

    iget v4, v15, Ll0/e;->h0:F

    const/16 v18, 0x1

    aget-object v0, v0, v18

    if-ne v0, v7, :cond_2f

    const/16 v45, 0x1

    goto :goto_16

    :cond_2f
    const/16 v45, 0x0

    :goto_16
    iget v0, v15, Ll0/e;->s:I

    move/from16 v24, v0

    iget v0, v15, Ll0/e;->t:I

    move/from16 v25, v0

    iget v0, v15, Ll0/e;->u:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move-object/from16 v46, v1

    move-object/from16 v1, p1

    move/from16 v42, v2

    const/4 v2, 0x1

    move-object/from16 v16, v3

    move v3, v5

    move/from16 v43, v4

    move v4, v6

    move/from16 v47, v5

    move/from16 v5, v31

    move/from16 v31, v6

    move-object/from16 v6, v30

    move-object/from16 v48, v7

    move-object/from16 v7, v17

    move-object/from16 v17, v8

    move-object/from16 v8, v40

    move-object/from16 v49, v22

    move-object/from16 v18, v10

    move-object/from16 v50, v23

    move-object/from16 v10, v16

    move-object/from16 v51, v27

    move-object/from16 v11, v46

    move-object/from16 v30, v17

    move-object/from16 v52, v13

    move-object/from16 v40, v18

    move/from16 v13, v21

    move/from16 v41, v14

    move/from16 v14, v42

    move/from16 v15, v44

    move/from16 v16, v43

    move/from16 v17, v20

    move/from16 v18, v45

    move/from16 v19, v29

    move/from16 v20, v28

    move/from16 v21, v37

    move/from16 v22, v34

    move/from16 v23, v33

    move/from16 v27, v36

    invoke-direct/range {v0 .. v27}, Ll0/e;->i(Lk0/d;ZZZZLk0/i;Lk0/i;Ll0/e$b;ZLl0/d;Ll0/d;IIIIFZZZZZIIIIFZ)V

    goto :goto_18

    :cond_30
    :goto_17
    move/from16 v47, v5

    move-object/from16 v48, v7

    move-object/from16 v52, v13

    move/from16 v41, v14

    move-object/from16 v49, v22

    move-object/from16 v50, v23

    move-object/from16 v51, v27

    move-object/from16 v40, v31

    move/from16 v31, v6

    :goto_18
    if-eqz p2, :cond_34

    move-object/from16 v15, p0

    .line 105
    iget-object v0, v15, Ll0/e;->f:Lm0/n;

    if-eqz v0, :cond_33

    iget-object v1, v0, Lm0/p;->h:Lm0/f;

    iget-boolean v2, v1, Lm0/f;->j:Z

    if-eqz v2, :cond_33

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget-boolean v0, v0, Lm0/f;->j:Z

    if-eqz v0, :cond_33

    .line 106
    iget v0, v1, Lm0/f;->g:I

    move-object/from16 v14, p1

    move-object/from16 v13, v51

    invoke-virtual {v14, v13, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 107
    iget-object v0, v15, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/p;->i:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    move-object/from16 v12, v50

    invoke-virtual {v14, v12, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 108
    iget-object v0, v15, Ll0/e;->f:Lm0/n;

    iget-object v0, v0, Lm0/n;->k:Lm0/f;

    iget v0, v0, Lm0/f;->g:I

    move-object/from16 v1, v49

    invoke-virtual {v14, v1, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 109
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_32

    if-nez v28, :cond_32

    if-eqz v31, :cond_32

    .line 110
    iget-object v2, v15, Ll0/e;->g:[Z

    const/4 v11, 0x1

    aget-boolean v2, v2, v11

    if-eqz v2, :cond_31

    .line 111
    iget-object v0, v0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v10, 0x0

    .line 112
    invoke-virtual {v14, v0, v12, v10, v2}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto :goto_19

    :cond_31
    const/16 v2, 0x8

    const/4 v10, 0x0

    goto :goto_19

    :cond_32
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_19
    const/4 v8, 0x0

    goto :goto_1b

    :cond_33
    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_1a

    :cond_34
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    :goto_1a
    const/4 v8, 0x1

    .line 113
    :goto_1b
    iget v0, v15, Ll0/e;->o:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_35

    const/4 v7, 0x0

    goto :goto_1c

    :cond_35
    move v7, v8

    :goto_1c
    if-eqz v7, :cond_40

    .line 114
    iget-boolean v0, v15, Ll0/e;->m:Z

    if-nez v0, :cond_40

    .line 115
    iget-object v0, v15, Ll0/e;->S:[Ll0/e$b;

    aget-object v0, v0, v11

    move-object/from16 v3, v52

    if-ne v0, v3, :cond_36

    instance-of v0, v15, Ll0/f;

    if-eqz v0, :cond_36

    const/4 v9, 0x1

    goto :goto_1d

    :cond_36
    const/4 v9, 0x0

    :goto_1d
    if-eqz v9, :cond_37

    const/16 v32, 0x0

    .line 116
    :cond_37
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_38

    iget-object v0, v0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    move-object v7, v0

    goto :goto_1e

    :cond_38
    move-object/from16 v7, v39

    .line 117
    :goto_1e
    iget-object v0, v15, Ll0/e;->T:Ll0/e;

    if-eqz v0, :cond_39

    iget-object v0, v0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    move-object v6, v0

    goto :goto_1f

    :cond_39
    move-object/from16 v6, v39

    .line 118
    :goto_1f
    iget v0, v15, Ll0/e;->e0:I

    if-gtz v0, :cond_3a

    iget v0, v15, Ll0/e;->l0:I

    if-ne v0, v2, :cond_3e

    .line 119
    :cond_3a
    iget-object v0, v15, Ll0/e;->L:Ll0/d;

    iget-object v0, v0, Ll0/d;->f:Ll0/d;

    if-eqz v0, :cond_3c

    .line 120
    invoke-virtual/range {p0 .. p0}, Ll0/e;->n()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    .line 121
    iget-object v0, v15, Ll0/e;->L:Ll0/d;

    iget-object v0, v0, Ll0/d;->f:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    .line 122
    invoke-virtual {v14, v1, v0, v10, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    if-eqz v31, :cond_3b

    .line 123
    iget-object v0, v15, Ll0/e;->K:Ll0/d;

    invoke-virtual {v14, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    const/4 v1, 0x5

    .line 124
    invoke-virtual {v14, v7, v0, v10, v1}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    :cond_3b
    const/16 v27, 0x0

    goto :goto_21

    .line 125
    :cond_3c
    iget v0, v15, Ll0/e;->l0:I

    if-ne v0, v2, :cond_3d

    .line 126
    invoke-virtual {v14, v1, v13, v10, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    goto :goto_20

    .line 127
    :cond_3d
    invoke-virtual/range {p0 .. p0}, Ll0/e;->n()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    :cond_3e
    :goto_20
    move/from16 v27, v36

    .line 128
    :goto_21
    iget-object v0, v15, Ll0/e;->g:[Z

    aget-boolean v5, v0, v11

    iget-object v0, v15, Ll0/e;->S:[Ll0/e$b;

    aget-object v8, v0, v11

    iget-object v4, v15, Ll0/e;->I:Ll0/d;

    iget-object v3, v15, Ll0/e;->K:Ll0/d;

    iget v1, v15, Ll0/e;->Z:I

    iget v2, v15, Ll0/e;->g0:I

    iget-object v10, v15, Ll0/e;->A:[I

    aget v16, v10, v11

    iget v10, v15, Ll0/e;->i0:F

    const/16 v17, 0x0

    aget-object v0, v0, v17

    move-object/from16 v11, v48

    if-ne v0, v11, :cond_3f

    const/16 v18, 0x1

    goto :goto_22

    :cond_3f
    const/16 v18, 0x0

    :goto_22
    iget v0, v15, Ll0/e;->v:I

    move/from16 v24, v0

    iget v0, v15, Ll0/e;->w:I

    move/from16 v25, v0

    iget v0, v15, Ll0/e;->x:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v20, v2

    const/4 v2, 0x0

    move-object v11, v3

    move/from16 v3, v31

    move-object/from16 v21, v4

    move/from16 v4, v47

    move/from16 v17, v10

    move-object/from16 v10, v21

    move-object/from16 v31, v12

    move/from16 v12, v19

    move-object/from16 v36, v13

    move/from16 v13, v32

    move/from16 v14, v20

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v35

    move/from16 v19, v28

    move/from16 v20, v29

    move/from16 v21, v38

    move/from16 v22, v33

    move/from16 v23, v34

    invoke-direct/range {v0 .. v27}, Ll0/e;->i(Lk0/d;ZZZZLk0/i;Lk0/i;Ll0/e$b;ZLl0/d;Ll0/d;IIIIFZZZZZIIIIFZ)V

    goto :goto_23

    :cond_40
    move-object/from16 v31, v12

    move-object/from16 v36, v13

    :goto_23
    if-eqz v41, :cond_42

    const/16 v6, 0x8

    move-object/from16 v7, p0

    .line 129
    iget v0, v7, Ll0/e;->y:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_41

    .line 130
    iget v5, v7, Ll0/e;->z:F

    move-object/from16 v0, p1

    move-object/from16 v1, v31

    move-object/from16 v2, v36

    move-object/from16 v3, v30

    move-object/from16 v4, v40

    invoke-virtual/range {v0 .. v6}, Lk0/d;->k(Lk0/i;Lk0/i;Lk0/i;Lk0/i;FI)V

    goto :goto_24

    .line 131
    :cond_41
    iget v5, v7, Ll0/e;->z:F

    const/16 v6, 0x8

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    move-object/from16 v2, v40

    move-object/from16 v3, v31

    move-object/from16 v4, v36

    invoke-virtual/range {v0 .. v6}, Lk0/d;->k(Lk0/i;Lk0/i;Lk0/i;Lk0/i;FI)V

    goto :goto_24

    :cond_42
    move-object/from16 v7, p0

    .line 132
    :goto_24
    iget-object v0, v7, Ll0/e;->O:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->n()Z

    move-result v0

    if-eqz v0, :cond_43

    .line 133
    iget-object v0, v7, Ll0/e;->O:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->i()Ll0/d;

    move-result-object v0

    invoke-virtual {v0}, Ll0/d;->g()Ll0/e;

    move-result-object v0

    iget v1, v7, Ll0/e;->B:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Ll0/e;->O:Ll0/d;

    invoke-virtual {v2}, Ll0/d;->e()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Lk0/d;->b(Ll0/e;Ll0/e;FI)V

    :cond_43
    const/4 v0, 0x0

    .line 134
    iput-boolean v0, v7, Ll0/e;->l:Z

    .line 135
    iput-boolean v0, v7, Ll0/e;->m:Z

    return-void
.end method

.method public g0()Z
    .locals 5

    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v3, Ll0/e$b;->p:Ll0/e$b;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_0

    aget-object v0, v0, v4

    if-ne v0, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h()Z
    .locals 2

    iget v0, p0, Ll0/e;->l0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h0()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 2
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 3
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 4
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 5
    iget-object v0, p0, Ll0/e;->L:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 6
    iget-object v0, p0, Ll0/e;->M:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 7
    iget-object v0, p0, Ll0/e;->N:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    .line 8
    iget-object v0, p0, Ll0/e;->O:Ll0/d;

    invoke-virtual {v0}, Ll0/d;->p()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ll0/e;->T:Ll0/e;

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Ll0/e;->B:F

    const/4 v2, 0x0

    .line 11
    iput v2, p0, Ll0/e;->U:I

    .line 12
    iput v2, p0, Ll0/e;->V:I

    .line 13
    iput v1, p0, Ll0/e;->W:F

    const/4 v1, -0x1

    .line 14
    iput v1, p0, Ll0/e;->X:I

    .line 15
    iput v2, p0, Ll0/e;->Y:I

    .line 16
    iput v2, p0, Ll0/e;->Z:I

    .line 17
    iput v2, p0, Ll0/e;->c0:I

    .line 18
    iput v2, p0, Ll0/e;->d0:I

    .line 19
    iput v2, p0, Ll0/e;->e0:I

    .line 20
    iput v2, p0, Ll0/e;->f0:I

    .line 21
    iput v2, p0, Ll0/e;->g0:I

    .line 22
    sget v3, Ll0/e;->C0:F

    iput v3, p0, Ll0/e;->h0:F

    .line 23
    iput v3, p0, Ll0/e;->i0:F

    .line 24
    iget-object v3, p0, Ll0/e;->S:[Ll0/e$b;

    sget-object v4, Ll0/e$b;->n:Ll0/e$b;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    .line 25
    aput-object v4, v3, v5

    .line 26
    iput-object v0, p0, Ll0/e;->j0:Ljava/lang/Object;

    .line 27
    iput v2, p0, Ll0/e;->k0:I

    .line 28
    iput v2, p0, Ll0/e;->l0:I

    .line 29
    iput-object v0, p0, Ll0/e;->n0:Ljava/lang/String;

    .line 30
    iput-boolean v2, p0, Ll0/e;->o0:Z

    .line 31
    iput-boolean v2, p0, Ll0/e;->p0:Z

    .line 32
    iput v2, p0, Ll0/e;->r0:I

    .line 33
    iput v2, p0, Ll0/e;->s0:I

    .line 34
    iput-boolean v2, p0, Ll0/e;->t0:Z

    .line 35
    iput-boolean v2, p0, Ll0/e;->u0:Z

    .line 36
    iget-object v0, p0, Ll0/e;->v0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    .line 37
    aput v3, v0, v5

    .line 38
    iput v1, p0, Ll0/e;->n:I

    .line 39
    iput v1, p0, Ll0/e;->o:I

    .line 40
    iget-object v0, p0, Ll0/e;->A:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    .line 41
    aput v3, v0, v5

    .line 42
    iput v2, p0, Ll0/e;->p:I

    .line 43
    iput v2, p0, Ll0/e;->q:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 44
    iput v0, p0, Ll0/e;->u:F

    .line 45
    iput v0, p0, Ll0/e;->x:F

    .line 46
    iput v3, p0, Ll0/e;->t:I

    .line 47
    iput v3, p0, Ll0/e;->w:I

    .line 48
    iput v2, p0, Ll0/e;->s:I

    .line 49
    iput v2, p0, Ll0/e;->v:I

    .line 50
    iput-boolean v2, p0, Ll0/e;->h:Z

    .line 51
    iput v1, p0, Ll0/e;->y:I

    .line 52
    iput v0, p0, Ll0/e;->z:F

    .line 53
    iput-boolean v2, p0, Ll0/e;->q0:Z

    .line 54
    iget-object v0, p0, Ll0/e;->g:[Z

    aput-boolean v5, v0, v2

    .line 55
    aput-boolean v5, v0, v5

    .line 56
    iput-boolean v2, p0, Ll0/e;->E:Z

    .line 57
    iget-object v0, p0, Ll0/e;->R:[Z

    aput-boolean v2, v0, v2

    .line 58
    aput-boolean v2, v0, v5

    .line 59
    iput-boolean v5, p0, Ll0/e;->i:Z

    return-void
.end method

.method public i0()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Ll0/e;->l:Z

    .line 2
    iput-boolean v0, p0, Ll0/e;->m:Z

    .line 3
    iget-object v1, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 4
    iget-object v2, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/d;

    .line 5
    invoke-virtual {v2}, Ll0/d;->q()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(Ll0/e;FI)V
    .locals 6

    .line 1
    sget-object v3, Ll0/d$b;->t:Ll0/d$b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Ll0/e;->X(Ll0/d$b;Ll0/e;Ll0/d$b;II)V

    .line 2
    iput p2, p0, Ll0/e;->B:F

    return-void
.end method

.method public j0(Lk0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 2
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 3
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 4
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 5
    iget-object v0, p0, Ll0/e;->L:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 6
    iget-object v0, p0, Ll0/e;->O:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 7
    iget-object v0, p0, Ll0/e;->M:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    .line 8
    iget-object v0, p0, Ll0/e;->N:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->r(Lk0/c;)V

    return-void
.end method

.method public k(Lk0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    .line 2
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    .line 3
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    .line 4
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    .line 5
    iget v0, p0, Ll0/e;->e0:I

    if-lez v0, :cond_0

    .line 6
    iget-object v0, p0, Ll0/e;->L:Ll0/d;

    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    :cond_0
    return-void
.end method

.method public k0(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->e0:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iput-boolean p1, p0, Ll0/e;->C:Z

    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->e:Lm0/l;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm0/l;

    invoke-direct {v0, p0}, Lm0/l;-><init>(Ll0/e;)V

    iput-object v0, p0, Ll0/e;->e:Lm0/l;

    .line 3
    :cond_0
    iget-object v0, p0, Ll0/e;->f:Lm0/n;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Lm0/n;

    invoke-direct {v0, p0}, Lm0/n;-><init>(Ll0/e;)V

    iput-object v0, p0, Ll0/e;->f:Lm0/n;

    :cond_1
    return-void
.end method

.method public l0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Ll0/e;->j0:Ljava/lang/Object;

    return-void
.end method

.method public m(Ll0/d$b;)Ll0/d;
    .locals 2

    .line 1
    sget-object v0, Ll0/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    .line 3
    :pswitch_1
    iget-object p1, p0, Ll0/e;->N:Ll0/d;

    return-object p1

    .line 4
    :pswitch_2
    iget-object p1, p0, Ll0/e;->M:Ll0/d;

    return-object p1

    .line 5
    :pswitch_3
    iget-object p1, p0, Ll0/e;->O:Ll0/d;

    return-object p1

    .line 6
    :pswitch_4
    iget-object p1, p0, Ll0/e;->L:Ll0/d;

    return-object p1

    .line 7
    :pswitch_5
    iget-object p1, p0, Ll0/e;->K:Ll0/d;

    return-object p1

    .line 8
    :pswitch_6
    iget-object p1, p0, Ll0/e;->J:Ll0/d;

    return-object p1

    .line 9
    :pswitch_7
    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    return-object p1

    .line 10
    :pswitch_8
    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ll0/e;->m0:Ljava/lang/String;

    return-void
.end method

.method public n()I
    .locals 1

    iget v0, p0, Ll0/e;->e0:I

    return v0
.end method

.method public n0(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v1, -0x1

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x2c

    .line 3
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v3, :cond_3

    add-int/lit8 v6, v2, -0x1

    if-ge v3, v6, :cond_3

    .line 4
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    .line 5
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const-string v4, "H"

    .line 6
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v1, 0x1

    :cond_2
    :goto_0
    add-int/lit8 v4, v3, 0x1

    :cond_3
    const/16 v3, 0x3a

    .line 7
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ltz v3, :cond_5

    sub-int/2addr v2, v5

    if-ge v3, v2, :cond_5

    .line 8
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v3, v5

    .line 9
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    .line 11
    :try_start_0
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 12
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v3, v2, v0

    if-lez v3, :cond_6

    cmpl-float v3, p1, v0

    if-lez v3, :cond_6

    if-ne v1, v5, :cond_4

    div-float/2addr p1, v2

    .line 13
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v2, p1

    .line 14
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 15
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    .line 17
    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    const/4 p1, 0x0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    .line 18
    iput p1, p0, Ll0/e;->W:F

    .line 19
    iput v1, p0, Ll0/e;->X:I

    :cond_7
    return-void

    .line 20
    :cond_8
    :goto_2
    iput v0, p0, Ll0/e;->W:F

    return-void
.end method

.method public o(I)F
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget p1, p0, Ll0/e;->h0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget p1, p0, Ll0/e;->i0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method public o0(I)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ll0/e;->C:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Ll0/e;->e0:I

    sub-int v0, p1, v0

    .line 3
    iget v1, p0, Ll0/e;->V:I

    add-int/2addr v1, v0

    .line 4
    iput v0, p0, Ll0/e;->Z:I

    .line 5
    iget-object v2, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v2, v0}, Ll0/d;->s(I)V

    .line 6
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0, v1}, Ll0/d;->s(I)V

    .line 7
    iget-object v0, p0, Ll0/e;->L:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->s(I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Ll0/e;->m:Z

    return-void
.end method

.method public p()I
    .locals 2

    invoke-virtual {p0}, Ll0/e;->T()I

    move-result v0

    iget v1, p0, Ll0/e;->V:I

    add-int/2addr v0, v1

    return v0
.end method

.method public p0(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->s(I)V

    .line 2
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    invoke-virtual {v0, p2}, Ll0/d;->s(I)V

    .line 3
    iput p1, p0, Ll0/e;->Y:I

    sub-int/2addr p2, p1

    .line 4
    iput p2, p0, Ll0/e;->U:I

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Ll0/e;->l:Z

    return-void
.end method

.method public q()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll0/e;->j0:Ljava/lang/Object;

    return-object v0
.end method

.method public q0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->s(I)V

    .line 2
    iput p1, p0, Ll0/e;->Y:I

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll0/e;->m0:Ljava/lang/String;

    return-object v0
.end method

.method public r0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->s(I)V

    .line 2
    iput p1, p0, Ll0/e;->Z:I

    return-void
.end method

.method public s(I)Ll0/e$b;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Ll0/e;->y()Ll0/e$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    invoke-virtual {p0}, Ll0/e;->O()Ll0/e$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public s0(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->s(I)V

    .line 2
    iget-object v0, p0, Ll0/e;->K:Ll0/d;

    invoke-virtual {v0, p2}, Ll0/d;->s(I)V

    .line 3
    iput p1, p0, Ll0/e;->Z:I

    sub-int/2addr p2, p1

    .line 4
    iput p2, p0, Ll0/e;->V:I

    .line 5
    iget-boolean p2, p0, Ll0/e;->C:Z

    if-eqz p2, :cond_0

    .line 6
    iget-object p2, p0, Ll0/e;->L:Ll0/d;

    iget v0, p0, Ll0/e;->e0:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ll0/d;->s(I)V

    :cond_0
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Ll0/e;->m:Z

    return-void
.end method

.method public t()F
    .locals 1

    iget v0, p0, Ll0/e;->W:F

    return v0
.end method

.method public t0(IIII)V
    .locals 1

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    .line 1
    iput p1, p0, Ll0/e;->Y:I

    .line 2
    iput p2, p0, Ll0/e;->Z:I

    .line 3
    iget p1, p0, Ll0/e;->l0:I

    const/4 p2, 0x0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 4
    iput p2, p0, Ll0/e;->U:I

    .line 5
    iput p2, p0, Ll0/e;->V:I

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Ll0/e;->S:[Ll0/e$b;

    aget-object p2, p1, p2

    sget-object v0, Ll0/e$b;->n:Ll0/e$b;

    if-ne p2, v0, :cond_1

    iget p2, p0, Ll0/e;->U:I

    if-ge p3, p2, :cond_1

    move p3, p2

    :cond_1
    const/4 p2, 0x1

    .line 7
    aget-object p1, p1, p2

    if-ne p1, v0, :cond_2

    iget p1, p0, Ll0/e;->V:I

    if-ge p4, p1, :cond_2

    move p4, p1

    .line 8
    :cond_2
    iput p3, p0, Ll0/e;->U:I

    .line 9
    iput p4, p0, Ll0/e;->V:I

    .line 10
    iget p1, p0, Ll0/e;->g0:I

    if-ge p4, p1, :cond_3

    .line 11
    iput p1, p0, Ll0/e;->V:I

    .line 12
    :cond_3
    iget p1, p0, Ll0/e;->f0:I

    if-ge p3, p1, :cond_4

    .line 13
    iput p1, p0, Ll0/e;->U:I

    :cond_4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll0/e;->n0:Ljava/lang/String;

    const-string v2, " "

    const-string v3, ""

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll0/e;->n0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll0/e;->m0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "id: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll0/e;->m0:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll0/e;->Y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll0/e;->Z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll0/e;->U:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll0/e;->V:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Ll0/e;->X:I

    return v0
.end method

.method public u0(Z)V
    .locals 0

    iput-boolean p1, p0, Ll0/e;->C:Z

    return-void
.end method

.method public v()I
    .locals 2

    .line 1
    iget v0, p0, Ll0/e;->l0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, p0, Ll0/e;->V:I

    return v0
.end method

.method public v0(I)V
    .locals 1

    .line 1
    iput p1, p0, Ll0/e;->V:I

    .line 2
    iget v0, p0, Ll0/e;->g0:I

    if-ge p1, v0, :cond_0

    .line 3
    iput v0, p0, Ll0/e;->V:I

    :cond_0
    return-void
.end method

.method public w()F
    .locals 1

    iget v0, p0, Ll0/e;->h0:F

    return v0
.end method

.method public w0(F)V
    .locals 0

    iput p1, p0, Ll0/e;->h0:F

    return-void
.end method

.method public x()I
    .locals 1

    iget v0, p0, Ll0/e;->r0:I

    return v0
.end method

.method public x0(I)V
    .locals 0

    iput p1, p0, Ll0/e;->r0:I

    return-void
.end method

.method public y()Ll0/e$b;
    .locals 2

    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public y0(II)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/e;->Y:I

    sub-int/2addr p2, p1

    .line 2
    iput p2, p0, Ll0/e;->U:I

    .line 3
    iget p1, p0, Ll0/e;->f0:I

    if-ge p2, p1, :cond_0

    .line 4
    iput p1, p0, Ll0/e;->U:I

    :cond_0
    return-void
.end method

.method public z()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/e;->H:Ll0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Ll0/d;->g:I

    add-int/2addr v1, v0

    .line 3
    :cond_0
    iget-object v0, p0, Ll0/e;->J:Ll0/d;

    if-eqz v0, :cond_1

    .line 4
    iget v0, v0, Ll0/d;->g:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public z0(Ll0/e$b;)V
    .locals 2

    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method
