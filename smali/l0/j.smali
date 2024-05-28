.class public Ll0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Ll0/j;->a:[Z

    return-void
.end method

.method static a(Ll0/f;Lk0/d;Ll0/e;)V
    .locals 6

    const/4 v0, -0x1

    .line 1
    iput v0, p2, Ll0/e;->n:I

    .line 2
    iput v0, p2, Ll0/e;->o:I

    .line 3
    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Ll0/e$b;->o:Ll0/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Ll0/e;->S:[Ll0/e$b;

    aget-object v0, v0, v1

    sget-object v1, Ll0/e$b;->q:Ll0/e$b;

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p2, Ll0/e;->H:Ll0/d;

    iget v0, v0, Ll0/d;->g:I

    .line 5
    invoke-virtual {p0}, Ll0/e;->R()I

    move-result v1

    iget-object v4, p2, Ll0/e;->J:Ll0/d;

    iget v4, v4, Ll0/d;->g:I

    sub-int/2addr v1, v4

    .line 6
    iget-object v4, p2, Ll0/e;->H:Ll0/d;

    invoke-virtual {p1, v4}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v5

    iput-object v5, v4, Ll0/d;->i:Lk0/i;

    .line 7
    iget-object v4, p2, Ll0/e;->J:Ll0/d;

    invoke-virtual {p1, v4}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v5

    iput-object v5, v4, Ll0/d;->i:Lk0/i;

    .line 8
    iget-object v4, p2, Ll0/e;->H:Ll0/d;

    iget-object v4, v4, Ll0/d;->i:Lk0/i;

    invoke-virtual {p1, v4, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 9
    iget-object v4, p2, Ll0/e;->J:Ll0/d;

    iget-object v4, v4, Ll0/d;->i:Lk0/i;

    invoke-virtual {p1, v4, v1}, Lk0/d;->f(Lk0/i;I)V

    .line 10
    iput v3, p2, Ll0/e;->n:I

    .line 11
    invoke-virtual {p2, v0, v1}, Ll0/e;->y0(II)V

    .line 12
    :cond_0
    iget-object v0, p0, Ll0/e;->S:[Ll0/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Ll0/e;->S:[Ll0/e$b;

    aget-object v0, v0, v1

    sget-object v1, Ll0/e$b;->q:Ll0/e$b;

    if-ne v0, v1, :cond_3

    .line 13
    iget-object v0, p2, Ll0/e;->I:Ll0/d;

    iget v0, v0, Ll0/d;->g:I

    .line 14
    invoke-virtual {p0}, Ll0/e;->v()I

    move-result p0

    iget-object v1, p2, Ll0/e;->K:Ll0/d;

    iget v1, v1, Ll0/d;->g:I

    sub-int/2addr p0, v1

    .line 15
    iget-object v1, p2, Ll0/e;->I:Ll0/d;

    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v2

    iput-object v2, v1, Ll0/d;->i:Lk0/i;

    .line 16
    iget-object v1, p2, Ll0/e;->K:Ll0/d;

    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v2

    iput-object v2, v1, Ll0/d;->i:Lk0/i;

    .line 17
    iget-object v1, p2, Ll0/e;->I:Ll0/d;

    iget-object v1, v1, Ll0/d;->i:Lk0/i;

    invoke-virtual {p1, v1, v0}, Lk0/d;->f(Lk0/i;I)V

    .line 18
    iget-object v1, p2, Ll0/e;->K:Ll0/d;

    iget-object v1, v1, Ll0/d;->i:Lk0/i;

    invoke-virtual {p1, v1, p0}, Lk0/d;->f(Lk0/i;I)V

    .line 19
    iget v1, p2, Ll0/e;->e0:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Ll0/e;->Q()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    .line 20
    :cond_1
    iget-object v1, p2, Ll0/e;->L:Ll0/d;

    invoke-virtual {p1, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v2

    iput-object v2, v1, Ll0/d;->i:Lk0/i;

    .line 21
    iget-object v1, p2, Ll0/e;->L:Ll0/d;

    iget-object v1, v1, Ll0/d;->i:Lk0/i;

    iget v2, p2, Ll0/e;->e0:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Lk0/d;->f(Lk0/i;I)V

    .line 22
    :cond_2
    iput v3, p2, Ll0/e;->o:I

    .line 23
    invoke-virtual {p2, v0, p0}, Ll0/e;->P0(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
