.class public Ll0/g;
.super Ll0/e;
.source "SourceFile"


# instance fields
.field protected D0:F

.field protected E0:I

.field protected F0:I

.field private G0:Ll0/d;

.field private H0:I

.field private I0:I

.field private J0:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ll0/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    iput v0, p0, Ll0/g;->D0:F

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Ll0/g;->E0:I

    .line 4
    iput v0, p0, Ll0/g;->F0:I

    .line 5
    iget-object v0, p0, Ll0/e;->I:Ll0/d;

    iput-object v0, p0, Ll0/g;->G0:Ll0/d;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Ll0/g;->H0:I

    .line 7
    iput v0, p0, Ll0/g;->I0:I

    .line 8
    iget-object v1, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 9
    iget-object v1, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object v1, p0, Ll0/e;->P:[Ll0/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 11
    iget-object v2, p0, Ll0/e;->P:[Ll0/d;

    iget-object v3, p0, Ll0/g;->G0:Ll0/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public Z0(Lk0/d;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll0/e;->I()Ll0/e;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p1, p2}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    .line 3
    iget p2, p0, Ll0/g;->H0:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Ll0/e;->V0(I)V

    .line 5
    invoke-virtual {p0, v1}, Ll0/e;->W0(I)V

    .line 6
    invoke-virtual {p0}, Ll0/e;->I()Ll0/e;

    move-result-object p1

    invoke-virtual {p1}, Ll0/e;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ll0/e;->v0(I)V

    .line 7
    invoke-virtual {p0, v1}, Ll0/e;->U0(I)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v1}, Ll0/e;->V0(I)V

    .line 9
    invoke-virtual {p0, p1}, Ll0/e;->W0(I)V

    .line 10
    invoke-virtual {p0}, Ll0/e;->I()Ll0/e;

    move-result-object p1

    invoke-virtual {p1}, Ll0/e;->R()I

    move-result p1

    invoke-virtual {p0, p1}, Ll0/e;->U0(I)V

    .line 11
    invoke-virtual {p0, v1}, Ll0/e;->v0(I)V

    :goto_0
    return-void
.end method

.method public a1()Ll0/d;
    .locals 1

    iget-object v0, p0, Ll0/g;->G0:Ll0/d;

    return-object v0
.end method

.method public b1()I
    .locals 1

    iget v0, p0, Ll0/g;->H0:I

    return v0
.end method

.method public c1()I
    .locals 1

    iget v0, p0, Ll0/g;->E0:I

    return v0
.end method

.method public d1()I
    .locals 1

    iget v0, p0, Ll0/g;->F0:I

    return v0
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/g;->J0:Z

    return v0
.end method

.method public e1()F
    .locals 1

    iget v0, p0, Ll0/g;->D0:F

    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/g;->J0:Z

    return v0
.end method

.method public f1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {v0, p1}, Ll0/d;->s(I)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ll0/g;->J0:Z

    return-void
.end method

.method public g(Lk0/d;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ll0/e;->I()Ll0/e;

    move-result-object p2

    check-cast p2, Ll0/f;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Ll0/d$b;->o:Ll0/d$b;

    invoke-virtual {p2, v0}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v0

    .line 3
    sget-object v1, Ll0/d$b;->q:Ll0/d$b;

    invoke-virtual {p2, v1}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v1

    .line 4
    iget-object v2, p0, Ll0/e;->T:Ll0/e;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, Ll0/e;->S:[Ll0/e$b;

    aget-object v2, v2, v4

    sget-object v5, Ll0/e$b;->o:Ll0/e$b;

    if-ne v2, v5, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 5
    :goto_0
    iget v5, p0, Ll0/g;->H0:I

    if-nez v5, :cond_3

    .line 6
    sget-object v0, Ll0/d$b;->p:Ll0/d$b;

    invoke-virtual {p2, v0}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v0

    .line 7
    sget-object v1, Ll0/d$b;->r:Ll0/d$b;

    invoke-virtual {p2, v1}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v1

    .line 8
    iget-object p2, p0, Ll0/e;->T:Ll0/e;

    if-eqz p2, :cond_2

    iget-object p2, p2, Ll0/e;->S:[Ll0/e$b;

    aget-object p2, p2, v3

    sget-object v2, Ll0/e$b;->o:Ll0/e$b;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    move v2, v3

    .line 9
    :cond_3
    iget-boolean p2, p0, Ll0/g;->J0:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p2}, Ll0/d;->m()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 10
    iget-object p2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p1, p2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object p2

    .line 11
    iget-object v6, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {v6}, Ll0/d;->d()I

    move-result v6

    invoke-virtual {p1, p2, v6}, Lk0/d;->f(Lk0/i;I)V

    .line 12
    iget v6, p0, Ll0/g;->E0:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto :goto_2

    .line 14
    :cond_4
    iget v6, p0, Ll0/g;->F0:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    .line 15
    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v1

    .line 16
    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 17
    invoke-virtual {p1, v1, p2, v4, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 18
    :cond_5
    :goto_2
    iput-boolean v4, p0, Ll0/g;->J0:Z

    return-void

    .line 19
    :cond_6
    iget p2, p0, Ll0/g;->E0:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    .line 20
    iget-object p2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p1, p2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object p2

    .line 21
    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    .line 22
    iget v3, p0, Ll0/g;->E0:I

    invoke-virtual {p1, p2, v0, v3, v6}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    if-eqz v2, :cond_9

    .line 23
    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto :goto_3

    .line 24
    :cond_7
    iget p2, p0, Ll0/g;->F0:I

    if-eq p2, v3, :cond_8

    .line 25
    iget-object p2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p1, p2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object p2

    .line 26
    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v1

    .line 27
    iget v3, p0, Ll0/g;->F0:I

    neg-int v3, v3

    invoke-virtual {p1, p2, v1, v3, v6}, Lk0/d;->e(Lk0/i;Lk0/i;II)Lk0/b;

    if-eqz v2, :cond_9

    .line 28
    invoke-virtual {p1, v0}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    .line 29
    invoke-virtual {p1, v1, p2, v4, v5}, Lk0/d;->h(Lk0/i;Lk0/i;II)V

    goto :goto_3

    .line 30
    :cond_8
    iget p2, p0, Ll0/g;->D0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    .line 31
    iget-object p2, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p1, p2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object p2

    .line 32
    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v0

    .line 33
    iget v1, p0, Ll0/g;->D0:F

    .line 34
    invoke-static {p1, p2, v0, v1}, Lk0/d;->s(Lk0/d;Lk0/i;Lk0/i;F)Lk0/b;

    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lk0/d;->d(Lk0/b;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public g1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 1
    iput v1, p0, Ll0/g;->D0:F

    .line 2
    iput p1, p0, Ll0/g;->E0:I

    .line 3
    iput v0, p0, Ll0/g;->F0:I

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 1
    iput v1, p0, Ll0/g;->D0:F

    .line 2
    iput v0, p0, Ll0/g;->E0:I

    .line 3
    iput p1, p0, Ll0/g;->F0:I

    :cond_0
    return-void
.end method

.method public i1(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    iput p1, p0, Ll0/g;->D0:F

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Ll0/g;->E0:I

    .line 3
    iput p1, p0, Ll0/g;->F0:I

    :cond_0
    return-void
.end method

.method public j1(I)V
    .locals 3

    .line 1
    iget v0, p0, Ll0/g;->H0:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Ll0/g;->H0:I

    .line 3
    iget-object p1, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget p1, p0, Ll0/g;->H0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Ll0/e;->H:Ll0/d;

    iput-object p1, p0, Ll0/g;->G0:Ll0/d;

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Ll0/e;->I:Ll0/d;

    iput-object p1, p0, Ll0/g;->G0:Ll0/d;

    .line 7
    :goto_0
    iget-object p1, p0, Ll0/e;->Q:Ljava/util/ArrayList;

    iget-object v0, p0, Ll0/g;->G0:Ll0/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Ll0/e;->P:[Ll0/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    .line 9
    iget-object v1, p0, Ll0/e;->P:[Ll0/d;

    iget-object v2, p0, Ll0/g;->G0:Ll0/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public m(Ll0/d$b;)Ll0/d;
    .locals 2

    .line 1
    sget-object v0, Ll0/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    .line 2
    :pswitch_1
    iget v0, p0, Ll0/g;->H0:I

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Ll0/g;->G0:Ll0/d;

    return-object p1

    .line 4
    :pswitch_2
    iget v0, p0, Ll0/g;->H0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5
    iget-object p1, p0, Ll0/g;->G0:Ll0/d;

    return-object p1

    .line 6
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
