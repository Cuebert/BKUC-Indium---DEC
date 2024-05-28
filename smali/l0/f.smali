.class public Ll0/f;
.super Ll0/l;
.source "SourceFile"


# instance fields
.field E0:Lm0/b;

.field public F0:Lm0/e;

.field protected G0:Lm0/b$b;

.field private H0:Z

.field protected I0:Lk0/d;

.field J0:I

.field K0:I

.field L0:I

.field M0:I

.field public N0:I

.field public O0:I

.field P0:[Ll0/c;

.field Q0:[Ll0/c;

.field public R0:Z

.field public S0:Z

.field public T0:Z

.field public U0:I

.field public V0:I

.field private W0:I

.field public X0:Z

.field private Y0:Z

.field private Z0:Z

.field a1:I

.field private b1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ll0/d;",
            ">;"
        }
    .end annotation
.end field

.field private c1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ll0/d;",
            ">;"
        }
    .end annotation
.end field

.field private d1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ll0/d;",
            ">;"
        }
    .end annotation
.end field

.field private e1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ll0/d;",
            ">;"
        }
    .end annotation
.end field

.field public f1:Lm0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ll0/l;-><init>()V

    .line 2
    new-instance v0, Lm0/b;

    invoke-direct {v0, p0}, Lm0/b;-><init>(Ll0/f;)V

    iput-object v0, p0, Ll0/f;->E0:Lm0/b;

    .line 3
    new-instance v0, Lm0/e;

    invoke-direct {v0, p0}, Lm0/e;-><init>(Ll0/f;)V

    iput-object v0, p0, Ll0/f;->F0:Lm0/e;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Ll0/f;->G0:Lm0/b$b;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Ll0/f;->H0:Z

    .line 6
    new-instance v2, Lk0/d;

    invoke-direct {v2}, Lk0/d;-><init>()V

    iput-object v2, p0, Ll0/f;->I0:Lk0/d;

    .line 7
    iput v1, p0, Ll0/f;->N0:I

    .line 8
    iput v1, p0, Ll0/f;->O0:I

    const/4 v2, 0x4

    new-array v3, v2, [Ll0/c;

    .line 9
    iput-object v3, p0, Ll0/f;->P0:[Ll0/c;

    new-array v2, v2, [Ll0/c;

    .line 10
    iput-object v2, p0, Ll0/f;->Q0:[Ll0/c;

    .line 11
    iput-boolean v1, p0, Ll0/f;->R0:Z

    .line 12
    iput-boolean v1, p0, Ll0/f;->S0:Z

    .line 13
    iput-boolean v1, p0, Ll0/f;->T0:Z

    .line 14
    iput v1, p0, Ll0/f;->U0:I

    .line 15
    iput v1, p0, Ll0/f;->V0:I

    const/16 v2, 0x101

    .line 16
    iput v2, p0, Ll0/f;->W0:I

    .line 17
    iput-boolean v1, p0, Ll0/f;->X0:Z

    .line 18
    iput-boolean v1, p0, Ll0/f;->Y0:Z

    .line 19
    iput-boolean v1, p0, Ll0/f;->Z0:Z

    .line 20
    iput v1, p0, Ll0/f;->a1:I

    .line 21
    iput-object v0, p0, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    .line 22
    iput-object v0, p0, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    .line 23
    iput-object v0, p0, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    .line 24
    iput-object v0, p0, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    .line 25
    new-instance v0, Lm0/b$a;

    invoke-direct {v0}, Lm0/b$a;-><init>()V

    iput-object v0, p0, Ll0/f;->f1:Lm0/b$a;

    return-void
.end method

.method public static A1(Ll0/e;Lm0/b$b;Lm0/b$a;I)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v1

    iput-object v1, p2, Lm0/b$a;->a:Ll0/e$b;

    .line 2
    invoke-virtual {p0}, Ll0/e;->O()Ll0/e$b;

    move-result-object v1

    iput-object v1, p2, Lm0/b$a;->b:Ll0/e$b;

    .line 3
    invoke-virtual {p0}, Ll0/e;->R()I

    move-result v1

    iput v1, p2, Lm0/b$a;->c:I

    .line 4
    invoke-virtual {p0}, Ll0/e;->v()I

    move-result v1

    iput v1, p2, Lm0/b$a;->d:I

    .line 5
    iput-boolean v0, p2, Lm0/b$a;->i:Z

    .line 6
    iput p3, p2, Lm0/b$a;->j:I

    .line 7
    iget-object p3, p2, Lm0/b$a;->a:Ll0/e$b;

    sget-object v1, Ll0/e$b;->p:Ll0/e$b;

    const/4 v2, 0x1

    if-ne p3, v1, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    .line 8
    :goto_0
    iget-object v3, p2, Lm0/b$a;->b:Ll0/e$b;

    if-ne v3, v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const/4 v3, 0x0

    if-eqz p3, :cond_3

    .line 9
    iget v4, p0, Ll0/e;->W:F

    cmpl-float v4, v4, v3

    if-lez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-eqz v1, :cond_4

    .line 10
    iget v5, p0, Ll0/e;->W:F

    cmpl-float v3, v5, v3

    if-lez v3, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    if-eqz p3, :cond_6

    .line 11
    invoke-virtual {p0, v0}, Ll0/e;->V(I)Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, p0, Ll0/e;->p:I

    if-nez v5, :cond_6

    if-nez v4, :cond_6

    .line 12
    sget-object p3, Ll0/e$b;->o:Ll0/e$b;

    iput-object p3, p2, Lm0/b$a;->a:Ll0/e$b;

    if-eqz v1, :cond_5

    .line 13
    iget p3, p0, Ll0/e;->q:I

    if-nez p3, :cond_5

    .line 14
    sget-object p3, Ll0/e$b;->n:Ll0/e$b;

    iput-object p3, p2, Lm0/b$a;->a:Ll0/e$b;

    :cond_5
    const/4 p3, 0x0

    :cond_6
    if-eqz v1, :cond_8

    .line 15
    invoke-virtual {p0, v2}, Ll0/e;->V(I)Z

    move-result v5

    if-eqz v5, :cond_8

    iget v5, p0, Ll0/e;->q:I

    if-nez v5, :cond_8

    if-nez v3, :cond_8

    .line 16
    sget-object v1, Ll0/e$b;->o:Ll0/e$b;

    iput-object v1, p2, Lm0/b$a;->b:Ll0/e$b;

    if-eqz p3, :cond_7

    .line 17
    iget v1, p0, Ll0/e;->p:I

    if-nez v1, :cond_7

    .line 18
    sget-object v1, Ll0/e$b;->n:Ll0/e$b;

    iput-object v1, p2, Lm0/b$a;->b:Ll0/e$b;

    :cond_7
    const/4 v1, 0x0

    .line 19
    :cond_8
    invoke-virtual {p0}, Ll0/e;->e0()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 20
    sget-object p3, Ll0/e$b;->n:Ll0/e$b;

    iput-object p3, p2, Lm0/b$a;->a:Ll0/e$b;

    const/4 p3, 0x0

    .line 21
    :cond_9
    invoke-virtual {p0}, Ll0/e;->f0()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 22
    sget-object v1, Ll0/e$b;->n:Ll0/e$b;

    iput-object v1, p2, Lm0/b$a;->b:Ll0/e$b;

    const/4 v1, 0x0

    :cond_a
    const/4 v5, -0x1

    const/4 v6, 0x4

    if-eqz v4, :cond_f

    .line 23
    iget-object v4, p0, Ll0/e;->r:[I

    aget v0, v4, v0

    if-ne v0, v6, :cond_b

    .line 24
    sget-object v0, Ll0/e$b;->n:Ll0/e$b;

    iput-object v0, p2, Lm0/b$a;->a:Ll0/e$b;

    goto :goto_6

    :cond_b
    if-nez v1, :cond_f

    .line 25
    iget-object v0, p2, Lm0/b$a;->b:Ll0/e$b;

    sget-object v1, Ll0/e$b;->n:Ll0/e$b;

    if-ne v0, v1, :cond_c

    .line 26
    iget v0, p2, Lm0/b$a;->d:I

    goto :goto_4

    .line 27
    :cond_c
    sget-object v0, Ll0/e$b;->o:Ll0/e$b;

    iput-object v0, p2, Lm0/b$a;->a:Ll0/e$b;

    .line 28
    invoke-interface {p1, p0, p2}, Lm0/b$b;->b(Ll0/e;Lm0/b$a;)V

    .line 29
    iget v0, p2, Lm0/b$a;->f:I

    .line 30
    :goto_4
    iput-object v1, p2, Lm0/b$a;->a:Ll0/e$b;

    .line 31
    iget v1, p0, Ll0/e;->X:I

    if-eqz v1, :cond_e

    if-ne v1, v5, :cond_d

    goto :goto_5

    .line 32
    :cond_d
    invoke-virtual {p0}, Ll0/e;->t()F

    move-result v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p2, Lm0/b$a;->c:I

    goto :goto_6

    .line 33
    :cond_e
    :goto_5
    invoke-virtual {p0}, Ll0/e;->t()F

    move-result v1

    int-to-float v0, v0

    mul-float v1, v1, v0

    float-to-int v0, v1

    iput v0, p2, Lm0/b$a;->c:I

    :cond_f
    :goto_6
    if-eqz v3, :cond_14

    .line 34
    iget-object v0, p0, Ll0/e;->r:[I

    aget v0, v0, v2

    if-ne v0, v6, :cond_10

    .line 35
    sget-object p3, Ll0/e$b;->n:Ll0/e$b;

    iput-object p3, p2, Lm0/b$a;->b:Ll0/e$b;

    goto :goto_9

    :cond_10
    if-nez p3, :cond_14

    .line 36
    iget-object p3, p2, Lm0/b$a;->a:Ll0/e$b;

    sget-object v0, Ll0/e$b;->n:Ll0/e$b;

    if-ne p3, v0, :cond_11

    .line 37
    iget p3, p2, Lm0/b$a;->c:I

    goto :goto_7

    .line 38
    :cond_11
    sget-object p3, Ll0/e$b;->o:Ll0/e$b;

    iput-object p3, p2, Lm0/b$a;->b:Ll0/e$b;

    .line 39
    invoke-interface {p1, p0, p2}, Lm0/b$b;->b(Ll0/e;Lm0/b$a;)V

    .line 40
    iget p3, p2, Lm0/b$a;->e:I

    .line 41
    :goto_7
    iput-object v0, p2, Lm0/b$a;->b:Ll0/e$b;

    .line 42
    iget v0, p0, Ll0/e;->X:I

    if-eqz v0, :cond_13

    if-ne v0, v5, :cond_12

    goto :goto_8

    :cond_12
    int-to-float p3, p3

    .line 43
    invoke-virtual {p0}, Ll0/e;->t()F

    move-result v0

    mul-float p3, p3, v0

    float-to-int p3, p3

    iput p3, p2, Lm0/b$a;->d:I

    goto :goto_9

    :cond_13
    :goto_8
    int-to-float p3, p3

    .line 44
    invoke-virtual {p0}, Ll0/e;->t()F

    move-result v0

    div-float/2addr p3, v0

    float-to-int p3, p3

    iput p3, p2, Lm0/b$a;->d:I

    .line 45
    :cond_14
    :goto_9
    invoke-interface {p1, p0, p2}, Lm0/b$b;->b(Ll0/e;Lm0/b$a;)V

    .line 46
    iget p1, p2, Lm0/b$a;->e:I

    invoke-virtual {p0, p1}, Ll0/e;->U0(I)V

    .line 47
    iget p1, p2, Lm0/b$a;->f:I

    invoke-virtual {p0, p1}, Ll0/e;->v0(I)V

    .line 48
    iget-boolean p1, p2, Lm0/b$a;->h:Z

    invoke-virtual {p0, p1}, Ll0/e;->u0(Z)V

    .line 49
    iget p1, p2, Lm0/b$a;->g:I

    invoke-virtual {p0, p1}, Ll0/e;->k0(I)V

    .line 50
    sget p0, Lm0/b$a;->k:I

    iput p0, p2, Lm0/b$a;->j:I

    .line 51
    iget-boolean p0, p2, Lm0/b$a;->i:Z

    return p0
.end method

.method private C1()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Ll0/f;->N0:I

    .line 2
    iput v0, p0, Ll0/f;->O0:I

    return-void
.end method

.method private g1(Ll0/e;)V
    .locals 5

    .line 1
    iget v0, p0, Ll0/f;->N0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll0/f;->Q0:[Ll0/c;

    array-length v2, v1

    if-lt v0, v2, :cond_0

    .line 2
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    .line 3
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll0/c;

    iput-object v0, p0, Ll0/f;->Q0:[Ll0/c;

    .line 4
    :cond_0
    iget-object v0, p0, Ll0/f;->Q0:[Ll0/c;

    iget v1, p0, Ll0/f;->N0:I

    new-instance v2, Ll0/c;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ll0/f;->x1()Z

    move-result v4

    invoke-direct {v2, p1, v3, v4}, Ll0/c;-><init>(Ll0/e;IZ)V

    aput-object v2, v0, v1

    .line 5
    iget p1, p0, Ll0/f;->N0:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll0/f;->N0:I

    return-void
.end method

.method private j1(Ll0/d;Lk0/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v0, p1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object p1

    .line 2
    iget-object v0, p0, Ll0/f;->I0:Lk0/d;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p2, p1, v1, v2}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    return-void
.end method

.method private k1(Ll0/d;Lk0/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v0, p1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object p1

    .line 2
    iget-object v0, p0, Ll0/f;->I0:Lk0/d;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p1, p2, v1, v2}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    return-void
.end method

.method private l1(Ll0/e;)V
    .locals 5

    .line 1
    iget v0, p0, Ll0/f;->O0:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Ll0/f;->P0:[Ll0/c;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    .line 2
    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    .line 3
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll0/c;

    iput-object v0, p0, Ll0/f;->P0:[Ll0/c;

    .line 4
    :cond_0
    iget-object v0, p0, Ll0/f;->P0:[Ll0/c;

    iget v2, p0, Ll0/f;->O0:I

    new-instance v3, Ll0/c;

    invoke-virtual {p0}, Ll0/f;->x1()Z

    move-result v4

    invoke-direct {v3, p1, v1, v4}, Ll0/c;-><init>(Ll0/e;IZ)V

    aput-object v3, v0, v2

    .line 5
    iget p1, p0, Ll0/f;->O0:I

    add-int/2addr p1, v1

    iput p1, p0, Ll0/f;->O0:I

    return-void
.end method


# virtual methods
.method public B1(I)Z
    .locals 1

    iget v0, p0, Ll0/f;->W0:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public D1(Lm0/b$b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ll0/f;->G0:Lm0/b$b;

    .line 2
    iget-object v0, p0, Ll0/f;->F0:Lm0/e;

    invoke-virtual {v0, p1}, Lm0/e;->n(Lm0/b$b;)V

    return-void
.end method

.method public E1(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/f;->W0:I

    const/16 p1, 0x200

    .line 2
    invoke-virtual {p0, p1}, Ll0/f;->B1(I)Z

    move-result p1

    sput-boolean p1, Lk0/d;->r:Z

    return-void
.end method

.method public F1(Z)V
    .locals 0

    iput-boolean p1, p0, Ll0/f;->H0:Z

    return-void
.end method

.method public G1(Lk0/d;[Z)V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1
    aput-boolean v1, p2, v0

    const/16 p2, 0x40

    .line 2
    invoke-virtual {p0, p2}, Ll0/f;->B1(I)Z

    move-result p2

    .line 3
    invoke-virtual {p0, p1, p2}, Ll0/e;->Z0(Lk0/d;Z)V

    .line 4
    iget-object v0, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    iget-object v2, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/e;

    .line 6
    invoke-virtual {v2, p1, p2}, Ll0/e;->Z0(Lk0/d;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public H1()V
    .locals 1

    iget-object v0, p0, Ll0/f;->E0:Lm0/b;

    invoke-virtual {v0, p0}, Lm0/b;->e(Ll0/f;)V

    return-void
.end method

.method public Y0(ZZ)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Ll0/e;->Y0(ZZ)V

    .line 2
    iget-object v0, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/e;

    .line 4
    invoke-virtual {v2, p1, p2}, Ll0/e;->Y0(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b1()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    .line 1
    iput v2, v1, Ll0/e;->Y:I

    .line 2
    iput v2, v1, Ll0/e;->Z:I

    .line 3
    iput-boolean v2, v1, Ll0/f;->Y0:Z

    .line 4
    iput-boolean v2, v1, Ll0/f;->Z0:Z

    .line 5
    iget-object v0, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 6
    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 7
    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 8
    iget-object v5, v1, Ll0/e;->S:[Ll0/e$b;

    const/4 v6, 0x1

    aget-object v7, v5, v6

    .line 9
    aget-object v5, v5, v2

    .line 10
    iget v8, v1, Ll0/f;->W0:I

    invoke-static {v8, v6}, Ll0/j;->b(II)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 11
    invoke-virtual/range {p0 .. p0}, Ll0/f;->r1()Lm0/b$b;

    move-result-object v8

    invoke-static {v1, v8}, Lm0/h;->h(Ll0/f;Lm0/b$b;)V

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_2

    .line 12
    iget-object v9, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll0/e;

    .line 13
    invoke-virtual {v9}, Ll0/e;->d0()Z

    move-result v10

    if-eqz v10, :cond_1

    instance-of v10, v9, Ll0/g;

    if-nez v10, :cond_1

    instance-of v10, v9, Ll0/a;

    if-nez v10, :cond_1

    instance-of v10, v9, Ll0/k;

    if-nez v10, :cond_1

    .line 14
    invoke-virtual {v9}, Ll0/e;->c0()Z

    move-result v10

    if-nez v10, :cond_1

    .line 15
    invoke-virtual {v9, v2}, Ll0/e;->s(I)Ll0/e$b;

    move-result-object v10

    .line 16
    invoke-virtual {v9, v6}, Ll0/e;->s(I)Ll0/e$b;

    move-result-object v11

    .line 17
    sget-object v12, Ll0/e$b;->p:Ll0/e$b;

    if-ne v10, v12, :cond_0

    iget v10, v9, Ll0/e;->p:I

    if-eq v10, v6, :cond_0

    if-ne v11, v12, :cond_0

    iget v10, v9, Ll0/e;->q:I

    if-eq v10, v6, :cond_0

    const/4 v10, 0x1

    goto :goto_1

    :cond_0
    const/4 v10, 0x0

    :goto_1
    if-nez v10, :cond_1

    .line 18
    new-instance v10, Lm0/b$a;

    invoke-direct {v10}, Lm0/b$a;-><init>()V

    .line 19
    iget-object v11, v1, Ll0/f;->G0:Lm0/b$b;

    sget v12, Lm0/b$a;->k:I

    invoke-static {v9, v11, v10, v12}, Ll0/f;->A1(Ll0/e;Lm0/b$b;Lm0/b$a;I)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x2

    if-le v3, v8, :cond_8

    .line 20
    sget-object v9, Ll0/e$b;->o:Ll0/e$b;

    if-eq v5, v9, :cond_3

    if-ne v7, v9, :cond_8

    :cond_3
    iget v10, v1, Ll0/f;->W0:I

    const/16 v11, 0x400

    .line 21
    invoke-static {v10, v11}, Ll0/j;->b(II)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 22
    invoke-virtual/range {p0 .. p0}, Ll0/f;->r1()Lm0/b$b;

    move-result-object v10

    invoke-static {v1, v10}, Lm0/i;->c(Ll0/f;Lm0/b$b;)Z

    move-result v10

    if-eqz v10, :cond_8

    if-ne v5, v9, :cond_5

    .line 23
    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v10

    if-ge v0, v10, :cond_4

    if-lez v0, :cond_4

    .line 24
    invoke-virtual {v1, v0}, Ll0/e;->U0(I)V

    .line 25
    iput-boolean v6, v1, Ll0/f;->Y0:Z

    goto :goto_2

    .line 26
    :cond_4
    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v0

    :cond_5
    :goto_2
    if-ne v7, v9, :cond_7

    .line 27
    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v9

    if-ge v4, v9, :cond_6

    if-lez v4, :cond_6

    .line 28
    invoke-virtual {v1, v4}, Ll0/e;->v0(I)V

    .line 29
    iput-boolean v6, v1, Ll0/f;->Z0:Z

    goto :goto_3

    .line 30
    :cond_6
    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v4

    :cond_7
    :goto_3
    move v9, v4

    move v4, v0

    const/4 v0, 0x1

    goto :goto_4

    :cond_8
    move v9, v4

    move v4, v0

    const/4 v0, 0x0

    :goto_4
    const/16 v10, 0x40

    .line 31
    invoke-virtual {v1, v10}, Ll0/f;->B1(I)Z

    move-result v11

    if-nez v11, :cond_a

    const/16 v11, 0x80

    invoke-virtual {v1, v11}, Ll0/f;->B1(I)Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_5

    :cond_9
    const/4 v11, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v11, 0x1

    .line 32
    :goto_6
    iget-object v12, v1, Ll0/f;->I0:Lk0/d;

    iput-boolean v2, v12, Lk0/d;->h:Z

    .line 33
    iput-boolean v2, v12, Lk0/d;->i:Z

    .line 34
    iget v13, v1, Ll0/f;->W0:I

    if-eqz v13, :cond_b

    if-eqz v11, :cond_b

    .line 35
    iput-boolean v6, v12, Lk0/d;->i:Z

    .line 36
    :cond_b
    iget-object v11, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    .line 37
    invoke-virtual/range {p0 .. p0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v12

    sget-object v13, Ll0/e$b;->o:Ll0/e$b;

    if-eq v12, v13, :cond_d

    invoke-virtual/range {p0 .. p0}, Ll0/e;->O()Ll0/e$b;

    move-result-object v12

    if-ne v12, v13, :cond_c

    goto :goto_7

    :cond_c
    const/4 v12, 0x0

    goto :goto_8

    :cond_d
    :goto_7
    const/4 v12, 0x1

    .line 38
    :goto_8
    invoke-direct/range {p0 .. p0}, Ll0/f;->C1()V

    const/4 v13, 0x0

    :goto_9
    if-ge v13, v3, :cond_f

    .line 39
    iget-object v14, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll0/e;

    .line 40
    instance-of v15, v14, Ll0/l;

    if-eqz v15, :cond_e

    .line 41
    check-cast v14, Ll0/l;

    invoke-virtual {v14}, Ll0/l;->b1()V

    :cond_e
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    .line 42
    :cond_f
    invoke-virtual {v1, v10}, Ll0/f;->B1(I)Z

    move-result v10

    move v13, v0

    const/4 v0, 0x0

    const/4 v14, 0x1

    :goto_a
    if-eqz v14, :cond_20

    add-int/lit8 v15, v0, 0x1

    .line 43
    :try_start_0
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v0}, Lk0/d;->D()V

    .line 44
    invoke-direct/range {p0 .. p0}, Ll0/f;->C1()V

    .line 45
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v1, v0}, Ll0/e;->k(Lk0/d;)V

    const/4 v0, 0x0

    :goto_b
    if-ge v0, v3, :cond_10

    .line 46
    iget-object v6, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll0/e;

    .line 47
    iget-object v2, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v6, v2}, Ll0/e;->k(Lk0/d;)V

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    const/4 v6, 0x1

    goto :goto_b

    .line 48
    :cond_10
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v1, v0}, Ll0/f;->f1(Lk0/d;)Z

    move-result v14

    .line 49
    iget-object v0, v1, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 50
    iget-object v0, v1, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    iget-object v6, v1, Ll0/f;->I0:Lk0/d;

    iget-object v8, v1, Ll0/e;->I:Ll0/d;

    invoke-virtual {v6, v8}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Ll0/f;->k1(Ll0/d;Lk0/i;)V

    .line 51
    iput-object v2, v1, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    .line 52
    :cond_11
    iget-object v0, v1, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 53
    iget-object v0, v1, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    iget-object v6, v1, Ll0/f;->I0:Lk0/d;

    iget-object v8, v1, Ll0/e;->K:Ll0/d;

    invoke-virtual {v6, v8}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Ll0/f;->j1(Ll0/d;Lk0/i;)V

    .line 54
    iput-object v2, v1, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    .line 55
    :cond_12
    iget-object v0, v1, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 56
    iget-object v0, v1, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    iget-object v6, v1, Ll0/f;->I0:Lk0/d;

    iget-object v8, v1, Ll0/e;->H:Ll0/d;

    invoke-virtual {v6, v8}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Ll0/f;->k1(Ll0/d;Lk0/i;)V

    .line 57
    iput-object v2, v1, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    .line 58
    :cond_13
    iget-object v0, v1, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 59
    iget-object v0, v1, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/d;

    iget-object v6, v1, Ll0/f;->I0:Lk0/d;

    iget-object v8, v1, Ll0/e;->J:Ll0/d;

    invoke-virtual {v6, v8}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Ll0/f;->j1(Ll0/d;Lk0/i;)V

    .line 60
    iput-object v2, v1, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    :cond_14
    if-eqz v14, :cond_15

    .line 61
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v0}, Lk0/d;->z()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_c

    :catch_0
    move-exception v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 63
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EXCEPTION : "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_15
    :goto_c
    if-eqz v14, :cond_16

    .line 64
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    sget-object v2, Ll0/j;->a:[Z

    invoke-virtual {v1, v0, v2}, Ll0/f;->G1(Lk0/d;[Z)V

    goto :goto_e

    .line 65
    :cond_16
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v1, v0, v10}, Ll0/e;->Z0(Lk0/d;Z)V

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v3, :cond_17

    .line 66
    iget-object v2, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/e;

    .line 67
    iget-object v6, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v2, v6, v10}, Ll0/e;->Z0(Lk0/d;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_17
    :goto_e
    if-eqz v12, :cond_1a

    const/16 v0, 0x8

    if-ge v15, v0, :cond_1a

    .line 68
    sget-object v0, Ll0/j;->a:[Z

    const/4 v2, 0x2

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_1a

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_f
    if-ge v0, v3, :cond_18

    .line 69
    iget-object v14, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll0/e;

    .line 70
    iget v2, v14, Ll0/e;->Y:I

    invoke-virtual {v14}, Ll0/e;->R()I

    move-result v16

    add-int v2, v2, v16

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 71
    iget v2, v14, Ll0/e;->Z:I

    invoke-virtual {v14}, Ll0/e;->v()I

    move-result v14

    add-int/2addr v2, v14

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x2

    goto :goto_f

    .line 72
    :cond_18
    iget v0, v1, Ll0/e;->f0:I

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 73
    iget v2, v1, Ll0/e;->g0:I

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 74
    sget-object v6, Ll0/e$b;->o:Ll0/e$b;

    if-ne v5, v6, :cond_19

    .line 75
    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v8

    if-ge v8, v0, :cond_19

    .line 76
    invoke-virtual {v1, v0}, Ll0/e;->U0(I)V

    .line 77
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    const/4 v8, 0x0

    aput-object v6, v0, v8

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_10

    :cond_19
    const/4 v0, 0x0

    :goto_10
    if-ne v7, v6, :cond_1b

    .line 78
    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v8

    if-ge v8, v2, :cond_1b

    .line 79
    invoke-virtual {v1, v2}, Ll0/e;->v0(I)V

    .line 80
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    const/4 v2, 0x1

    aput-object v6, v0, v2

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_11

    :cond_1a
    const/4 v0, 0x0

    .line 81
    :cond_1b
    :goto_11
    iget v2, v1, Ll0/e;->f0:I

    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 82
    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v6

    if-le v2, v6, :cond_1c

    .line 83
    invoke-virtual {v1, v2}, Ll0/e;->U0(I)V

    .line 84
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    sget-object v2, Ll0/e$b;->n:Ll0/e$b;

    const/4 v6, 0x0

    aput-object v2, v0, v6

    const/4 v0, 0x1

    const/4 v13, 0x1

    .line 85
    :cond_1c
    iget v2, v1, Ll0/e;->g0:I

    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 86
    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v6

    if-le v2, v6, :cond_1d

    .line 87
    invoke-virtual {v1, v2}, Ll0/e;->v0(I)V

    .line 88
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    sget-object v2, Ll0/e$b;->n:Ll0/e$b;

    const/4 v6, 0x1

    aput-object v2, v0, v6

    const/4 v0, 0x1

    const/4 v2, 0x1

    goto :goto_12

    :cond_1d
    const/4 v6, 0x1

    move v2, v13

    :goto_12
    if-nez v2, :cond_1f

    .line 89
    iget-object v8, v1, Ll0/e;->S:[Ll0/e$b;

    const/4 v13, 0x0

    aget-object v8, v8, v13

    sget-object v14, Ll0/e$b;->o:Ll0/e$b;

    if-ne v8, v14, :cond_1e

    if-lez v4, :cond_1e

    .line 90
    invoke-virtual/range {p0 .. p0}, Ll0/e;->R()I

    move-result v8

    if-le v8, v4, :cond_1e

    .line 91
    iput-boolean v6, v1, Ll0/f;->Y0:Z

    .line 92
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    sget-object v2, Ll0/e$b;->n:Ll0/e$b;

    aput-object v2, v0, v13

    .line 93
    invoke-virtual {v1, v4}, Ll0/e;->U0(I)V

    const/4 v0, 0x1

    const/4 v2, 0x1

    .line 94
    :cond_1e
    iget-object v8, v1, Ll0/e;->S:[Ll0/e$b;

    aget-object v8, v8, v6

    if-ne v8, v14, :cond_1f

    if-lez v9, :cond_1f

    .line 95
    invoke-virtual/range {p0 .. p0}, Ll0/e;->v()I

    move-result v8

    if-le v8, v9, :cond_1f

    .line 96
    iput-boolean v6, v1, Ll0/f;->Z0:Z

    .line 97
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    sget-object v2, Ll0/e$b;->n:Ll0/e$b;

    aput-object v2, v0, v6

    .line 98
    invoke-virtual {v1, v9}, Ll0/e;->v0(I)V

    const/4 v13, 0x1

    const/4 v14, 0x1

    goto :goto_13

    :cond_1f
    move v14, v0

    move v13, v2

    :goto_13
    move v0, v15

    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x2

    goto/16 :goto_a

    .line 99
    :cond_20
    iput-object v11, v1, Ll0/l;->D0:Ljava/util/ArrayList;

    if-eqz v13, :cond_21

    .line 100
    iget-object v0, v1, Ll0/e;->S:[Ll0/e$b;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    .line 101
    aput-object v7, v0, v2

    .line 102
    :cond_21
    iget-object v0, v1, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v0}, Lk0/d;->v()Lk0/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll0/l;->j0(Lk0/c;)V

    return-void
.end method

.method e1(Ll0/e;I)V
    .locals 1

    if-nez p2, :cond_0

    .line 1
    invoke-direct {p0, p1}, Ll0/f;->g1(Ll0/e;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 2
    invoke-direct {p0, p1}, Ll0/f;->l1(Ll0/e;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public f1(Lk0/d;)Z
    .locals 12

    const/16 v0, 0x40

    .line 1
    invoke-virtual {p0, v0}, Ll0/f;->B1(I)Z

    move-result v0

    .line 2
    invoke-virtual {p0, p1, v0}, Ll0/e;->g(Lk0/d;Z)V

    .line 3
    iget-object v1, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    .line 4
    iget-object v6, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll0/e;

    .line 5
    invoke-virtual {v6, v2, v2}, Ll0/e;->C0(IZ)V

    .line 6
    invoke-virtual {v6, v5, v2}, Ll0/e;->C0(IZ)V

    .line 7
    instance-of v6, v6, Ll0/a;

    if-eqz v6, :cond_0

    const/4 v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_3

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_3

    .line 8
    iget-object v4, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll0/e;

    .line 9
    instance-of v6, v4, Ll0/a;

    if-eqz v6, :cond_2

    .line 10
    check-cast v4, Ll0/a;

    invoke-virtual {v4}, Ll0/a;->h1()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_5

    .line 11
    iget-object v4, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll0/e;

    .line 12
    invoke-virtual {v4}, Ll0/e;->f()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 13
    invoke-virtual {v4, p1, v0}, Ll0/e;->g(Lk0/d;Z)V

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 14
    :cond_5
    sget-boolean v3, Lk0/d;->r:Z

    if-eqz v3, :cond_9

    .line 15
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v1, :cond_7

    .line 16
    iget-object v6, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll0/e;

    .line 17
    invoke-virtual {v6}, Ll0/e;->f()Z

    move-result v7

    if-nez v7, :cond_6

    .line 18
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 19
    :cond_7
    invoke-virtual {p0}, Ll0/e;->y()Ll0/e$b;

    move-result-object v1

    sget-object v4, Ll0/e$b;->o:Ll0/e$b;

    if-ne v1, v4, :cond_8

    const/4 v10, 0x0

    goto :goto_4

    :cond_8
    const/4 v10, 0x1

    :goto_4
    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p0

    move-object v8, p1

    move-object v9, v3

    .line 20
    invoke-virtual/range {v6 .. v11}, Ll0/e;->e(Ll0/f;Lk0/d;Ljava/util/HashSet;IZ)V

    .line 21
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/e;

    .line 22
    invoke-static {p0, p1, v3}, Ll0/j;->a(Ll0/f;Lk0/d;Ll0/e;)V

    .line 23
    invoke-virtual {v3, p1, v0}, Ll0/e;->g(Lk0/d;Z)V

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    :goto_6
    if-ge v3, v1, :cond_f

    .line 24
    iget-object v4, p0, Ll0/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll0/e;

    .line 25
    instance-of v6, v4, Ll0/f;

    if-eqz v6, :cond_d

    .line 26
    iget-object v6, v4, Ll0/e;->S:[Ll0/e$b;

    aget-object v7, v6, v2

    .line 27
    aget-object v6, v6, v5

    .line 28
    sget-object v8, Ll0/e$b;->o:Ll0/e$b;

    if-ne v7, v8, :cond_a

    .line 29
    sget-object v9, Ll0/e$b;->n:Ll0/e$b;

    invoke-virtual {v4, v9}, Ll0/e;->z0(Ll0/e$b;)V

    :cond_a
    if-ne v6, v8, :cond_b

    .line 30
    sget-object v9, Ll0/e$b;->n:Ll0/e$b;

    invoke-virtual {v4, v9}, Ll0/e;->Q0(Ll0/e$b;)V

    .line 31
    :cond_b
    invoke-virtual {v4, p1, v0}, Ll0/e;->g(Lk0/d;Z)V

    if-ne v7, v8, :cond_c

    .line 32
    invoke-virtual {v4, v7}, Ll0/e;->z0(Ll0/e$b;)V

    :cond_c
    if-ne v6, v8, :cond_e

    .line 33
    invoke-virtual {v4, v6}, Ll0/e;->Q0(Ll0/e$b;)V

    goto :goto_7

    .line 34
    :cond_d
    invoke-static {p0, p1, v4}, Ll0/j;->a(Ll0/f;Lk0/d;Ll0/e;)V

    .line 35
    invoke-virtual {v4}, Ll0/e;->f()Z

    move-result v6

    if-nez v6, :cond_e

    .line 36
    invoke-virtual {v4, p1, v0}, Ll0/e;->g(Lk0/d;Z)V

    :cond_e
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 37
    :cond_f
    iget v0, p0, Ll0/f;->N0:I

    const/4 v1, 0x0

    if-lez v0, :cond_10

    .line 38
    invoke-static {p0, p1, v1, v2}, Ll0/b;->b(Ll0/f;Lk0/d;Ljava/util/ArrayList;I)V

    .line 39
    :cond_10
    iget v0, p0, Ll0/f;->O0:I

    if-lez v0, :cond_11

    .line 40
    invoke-static {p0, p1, v1, v5}, Ll0/b;->b(Ll0/f;Lk0/d;Ljava/util/ArrayList;I)V

    :cond_11
    return v5
.end method

.method public h0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/f;->I0:Lk0/d;

    invoke-virtual {v0}, Lk0/d;->D()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll0/f;->J0:I

    .line 3
    iput v0, p0, Ll0/f;->L0:I

    .line 4
    iput v0, p0, Ll0/f;->K0:I

    .line 5
    iput v0, p0, Ll0/f;->M0:I

    .line 6
    iput-boolean v0, p0, Ll0/f;->X0:Z

    .line 7
    invoke-super {p0}, Ll0/l;->h0()V

    return-void
.end method

.method public h1(Ll0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ll0/d;->d()I

    move-result v0

    iget-object v1, p0, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/d;

    invoke-virtual {v1}, Ll0/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll0/f;->e1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public i1(Ll0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ll0/d;->d()I

    move-result v0

    iget-object v1, p0, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/d;

    invoke-virtual {v1}, Ll0/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll0/f;->c1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method m1(Ll0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ll0/d;->d()I

    move-result v0

    iget-object v1, p0, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/d;

    invoke-virtual {v1}, Ll0/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll0/f;->d1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method n1(Ll0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ll0/d;->d()I

    move-result v0

    iget-object v1, p0, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/d;

    invoke-virtual {v1}, Ll0/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll0/f;->b1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public o1(Z)Z
    .locals 1

    iget-object v0, p0, Ll0/f;->F0:Lm0/e;

    invoke-virtual {v0, p1}, Lm0/e;->f(Z)Z

    move-result p1

    return p1
.end method

.method public p1(Z)Z
    .locals 1

    iget-object v0, p0, Ll0/f;->F0:Lm0/e;

    invoke-virtual {v0, p1}, Lm0/e;->g(Z)Z

    move-result p1

    return p1
.end method

.method public q1(ZI)Z
    .locals 1

    iget-object v0, p0, Ll0/f;->F0:Lm0/e;

    invoke-virtual {v0, p1, p2}, Lm0/e;->h(ZI)Z

    move-result p1

    return p1
.end method

.method public r1()Lm0/b$b;
    .locals 1

    iget-object v0, p0, Ll0/f;->G0:Lm0/b$b;

    return-object v0
.end method

.method public s1()I
    .locals 1

    iget v0, p0, Ll0/f;->W0:I

    return v0
.end method

.method public t1()Lk0/d;
    .locals 1

    iget-object v0, p0, Ll0/f;->I0:Lk0/d;

    return-object v0
.end method

.method public u1()V
    .locals 1

    iget-object v0, p0, Ll0/f;->F0:Lm0/e;

    invoke-virtual {v0}, Lm0/e;->j()V

    return-void
.end method

.method public v1()V
    .locals 1

    iget-object v0, p0, Ll0/f;->F0:Lm0/e;

    invoke-virtual {v0}, Lm0/e;->k()V

    return-void
.end method

.method public w1()Z
    .locals 1

    iget-boolean v0, p0, Ll0/f;->Z0:Z

    return v0
.end method

.method public x1()Z
    .locals 1

    iget-boolean v0, p0, Ll0/f;->H0:Z

    return v0
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Ll0/f;->Y0:Z

    return v0
.end method

.method public z1(IIIIIIIII)J
    .locals 12

    move-object v11, p0

    move/from16 v3, p8

    .line 1
    iput v3, v11, Ll0/f;->J0:I

    move/from16 v4, p9

    .line 2
    iput v4, v11, Ll0/f;->K0:I

    .line 3
    iget-object v0, v11, Ll0/f;->E0:Lm0/b;

    move-object v1, p0

    move v2, p1

    move v5, p2

    move v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v0 .. v10}, Lm0/b;->d(Ll0/f;IIIIIIIII)J

    move-result-wide v0

    return-wide v0
.end method
