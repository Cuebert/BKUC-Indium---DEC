.class public Lk0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/d$a;,
        Lk0/d$b;
    }
.end annotation


# static fields
.field public static r:Z = false

.field public static s:Z = true

.field public static t:Z = true

.field public static u:Z = true

.field public static v:Z = false

.field private static w:I = 0x3e8

.field public static x:J

.field public static y:J


# instance fields
.field public a:Z

.field b:I

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lk0/i;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lk0/d$a;

.field private e:I

.field private f:I

.field g:[Lk0/b;

.field public h:Z

.field public i:Z

.field private j:[Z

.field k:I

.field l:I

.field private m:I

.field final n:Lk0/c;

.field private o:[Lk0/i;

.field private p:I

.field private q:Lk0/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lk0/d;->a:Z

    .line 3
    iput v0, p0, Lk0/d;->b:I

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lk0/d;->c:Ljava/util/HashMap;

    const/16 v2, 0x20

    .line 5
    iput v2, p0, Lk0/d;->e:I

    .line 6
    iput v2, p0, Lk0/d;->f:I

    .line 7
    iput-object v1, p0, Lk0/d;->g:[Lk0/b;

    .line 8
    iput-boolean v0, p0, Lk0/d;->h:Z

    .line 9
    iput-boolean v0, p0, Lk0/d;->i:Z

    new-array v1, v2, [Z

    .line 10
    iput-object v1, p0, Lk0/d;->j:[Z

    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lk0/d;->k:I

    .line 12
    iput v0, p0, Lk0/d;->l:I

    .line 13
    iput v2, p0, Lk0/d;->m:I

    .line 14
    sget v1, Lk0/d;->w:I

    new-array v1, v1, [Lk0/i;

    iput-object v1, p0, Lk0/d;->o:[Lk0/i;

    .line 15
    iput v0, p0, Lk0/d;->p:I

    new-array v0, v2, [Lk0/b;

    .line 16
    iput-object v0, p0, Lk0/d;->g:[Lk0/b;

    .line 17
    invoke-direct {p0}, Lk0/d;->C()V

    .line 18
    new-instance v0, Lk0/c;

    invoke-direct {v0}, Lk0/c;-><init>()V

    iput-object v0, p0, Lk0/d;->n:Lk0/c;

    .line 19
    new-instance v1, Lk0/h;

    invoke-direct {v1, v0}, Lk0/h;-><init>(Lk0/c;)V

    iput-object v1, p0, Lk0/d;->d:Lk0/d$a;

    .line 20
    sget-boolean v1, Lk0/d;->v:Z

    if-eqz v1, :cond_0

    .line 21
    new-instance v1, Lk0/d$b;

    invoke-direct {v1, p0, v0}, Lk0/d$b;-><init>(Lk0/d;Lk0/c;)V

    iput-object v1, p0, Lk0/d;->q:Lk0/d$a;

    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lk0/b;

    invoke-direct {v1, v0}, Lk0/b;-><init>(Lk0/c;)V

    iput-object v1, p0, Lk0/d;->q:Lk0/d$a;

    :goto_0
    return-void
.end method

.method private final B(Lk0/d$a;Z)I
    .locals 10

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lk0/d;->k:I

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lk0/d;->j:[Z

    aput-boolean p2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    :goto_1
    if-nez v0, :cond_b

    add-int/lit8 v1, v1, 0x1

    .line 3
    iget v2, p0, Lk0/d;->k:I

    mul-int/lit8 v2, v2, 0x2

    if-lt v1, v2, :cond_2

    return v1

    .line 4
    :cond_2
    invoke-interface {p1}, Lk0/d$a;->getKey()Lk0/i;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 5
    iget-object v2, p0, Lk0/d;->j:[Z

    invoke-interface {p1}, Lk0/d$a;->getKey()Lk0/i;

    move-result-object v4

    iget v4, v4, Lk0/i;->c:I

    aput-boolean v3, v2, v4

    .line 6
    :cond_3
    iget-object v2, p0, Lk0/d;->j:[Z

    invoke-interface {p1, p0, v2}, Lk0/d$a;->a(Lk0/d;[Z)Lk0/i;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 7
    iget-object v4, p0, Lk0/d;->j:[Z

    iget v5, v2, Lk0/i;->c:I

    aget-boolean v6, v4, v5

    if-eqz v6, :cond_4

    return v1

    .line 8
    :cond_4
    aput-boolean v3, v4, v5

    :cond_5
    if-eqz v2, :cond_a

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    .line 9
    :goto_2
    iget v7, p0, Lk0/d;->l:I

    if-ge v5, v7, :cond_9

    .line 10
    iget-object v7, p0, Lk0/d;->g:[Lk0/b;

    aget-object v7, v7, v5

    .line 11
    iget-object v8, v7, Lk0/b;->a:Lk0/i;

    .line 12
    iget-object v8, v8, Lk0/i;->j:Lk0/i$a;

    sget-object v9, Lk0/i$a;->n:Lk0/i$a;

    if-ne v8, v9, :cond_6

    goto :goto_3

    .line 13
    :cond_6
    iget-boolean v8, v7, Lk0/b;->f:Z

    if-eqz v8, :cond_7

    goto :goto_3

    .line 14
    :cond_7
    invoke-virtual {v7, v2}, Lk0/b;->t(Lk0/i;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 15
    iget-object v8, v7, Lk0/b;->e:Lk0/b$a;

    invoke-interface {v8, v2}, Lk0/b$a;->g(Lk0/i;)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v9, v8, v9

    if-gez v9, :cond_8

    .line 16
    iget v7, v7, Lk0/b;->b:F

    neg-float v7, v7

    div-float/2addr v7, v8

    cmpg-float v8, v7, v3

    if-gez v8, :cond_8

    move v6, v5

    move v3, v7

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-le v6, v4, :cond_1

    .line 17
    iget-object v3, p0, Lk0/d;->g:[Lk0/b;

    aget-object v3, v3, v6

    .line 18
    iget-object v5, v3, Lk0/b;->a:Lk0/i;

    iput v4, v5, Lk0/i;->d:I

    .line 19
    invoke-virtual {v3, v2}, Lk0/b;->x(Lk0/i;)V

    .line 20
    iget-object v2, v3, Lk0/b;->a:Lk0/i;

    iput v6, v2, Lk0/i;->d:I

    .line 21
    invoke-virtual {v2, p0, v3}, Lk0/i;->g(Lk0/d;Lk0/b;)V

    goto :goto_1

    :cond_a
    const/4 v0, 0x1

    goto/16 :goto_1

    :cond_b
    return v1
.end method

.method private C()V
    .locals 4

    .line 1
    sget-boolean v0, Lk0/d;->v:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    :goto_0
    iget v0, p0, Lk0/d;->l:I

    if-ge v2, v0, :cond_3

    .line 3
    iget-object v0, p0, Lk0/d;->g:[Lk0/b;

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    .line 4
    iget-object v3, p0, Lk0/d;->n:Lk0/c;

    iget-object v3, v3, Lk0/c;->a:Lk0/f;

    invoke-interface {v3, v0}, Lk0/f;->a(Ljava/lang/Object;)Z

    .line 5
    :cond_0
    iget-object v0, p0, Lk0/d;->g:[Lk0/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_1
    :goto_1
    iget v0, p0, Lk0/d;->l:I

    if-ge v2, v0, :cond_3

    .line 7
    iget-object v0, p0, Lk0/d;->g:[Lk0/b;

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    .line 8
    iget-object v3, p0, Lk0/d;->n:Lk0/c;

    iget-object v3, v3, Lk0/c;->b:Lk0/f;

    invoke-interface {v3, v0}, Lk0/f;->a(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    iget-object v0, p0, Lk0/d;->g:[Lk0/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private a(Lk0/i$a;Ljava/lang/String;)Lk0/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    iget-object v0, v0, Lk0/c;->c:Lk0/f;

    invoke-interface {v0}, Lk0/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/i;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lk0/i;

    invoke-direct {v0, p1, p2}, Lk0/i;-><init>(Lk0/i$a;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1, p2}, Lk0/i;->f(Lk0/i$a;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lk0/i;->d()V

    .line 5
    invoke-virtual {v0, p1, p2}, Lk0/i;->f(Lk0/i$a;Ljava/lang/String;)V

    .line 6
    :goto_0
    iget p1, p0, Lk0/d;->p:I

    sget p2, Lk0/d;->w:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    .line 7
    sput p2, Lk0/d;->w:I

    .line 8
    iget-object p1, p0, Lk0/d;->o:[Lk0/i;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lk0/i;

    iput-object p1, p0, Lk0/d;->o:[Lk0/i;

    .line 9
    :cond_1
    iget-object p1, p0, Lk0/d;->o:[Lk0/i;

    iget p2, p0, Lk0/d;->p:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Lk0/d;->p:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method private final l(Lk0/b;)V
    .locals 7

    .line 1
    sget-boolean v0, Lk0/d;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lk0/b;->f:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p1, Lk0/b;->a:Lk0/i;

    iget p1, p1, Lk0/b;->b:F

    invoke-virtual {v0, p0, p1}, Lk0/i;->e(Lk0/d;F)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lk0/d;->g:[Lk0/b;

    iget v1, p0, Lk0/d;->l:I

    aput-object p1, v0, v1

    .line 4
    iget-object v0, p1, Lk0/b;->a:Lk0/i;

    iput v1, v0, Lk0/i;->d:I

    add-int/lit8 v1, v1, 0x1

    .line 5
    iput v1, p0, Lk0/d;->l:I

    .line 6
    invoke-virtual {v0, p0, p1}, Lk0/i;->g(Lk0/d;Lk0/b;)V

    .line 7
    :goto_0
    sget-boolean p1, Lk0/d;->t:Z

    if-eqz p1, :cond_8

    iget-boolean p1, p0, Lk0/d;->a:Z

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 8
    :goto_1
    iget v1, p0, Lk0/d;->l:I

    if-ge v0, v1, :cond_7

    .line 9
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    .line 10
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "WTF"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 11
    :cond_1
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    aget-object v2, v1, v0

    if-eqz v2, :cond_6

    aget-object v2, v1, v0

    iget-boolean v2, v2, Lk0/b;->f:Z

    if-eqz v2, :cond_6

    .line 12
    aget-object v1, v1, v0

    .line 13
    iget-object v2, v1, Lk0/b;->a:Lk0/i;

    iget v3, v1, Lk0/b;->b:F

    invoke-virtual {v2, p0, v3}, Lk0/i;->e(Lk0/d;F)V

    .line 14
    sget-boolean v2, Lk0/d;->v:Z

    if-eqz v2, :cond_2

    .line 15
    iget-object v2, p0, Lk0/d;->n:Lk0/c;

    iget-object v2, v2, Lk0/c;->a:Lk0/f;

    invoke-interface {v2, v1}, Lk0/f;->a(Ljava/lang/Object;)Z

    goto :goto_2

    .line 16
    :cond_2
    iget-object v2, p0, Lk0/d;->n:Lk0/c;

    iget-object v2, v2, Lk0/c;->b:Lk0/f;

    invoke-interface {v2, v1}, Lk0/f;->a(Ljava/lang/Object;)Z

    .line 17
    :goto_2
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    move v3, v1

    .line 18
    :goto_3
    iget v4, p0, Lk0/d;->l:I

    if-ge v1, v4, :cond_4

    .line 19
    iget-object v3, p0, Lk0/d;->g:[Lk0/b;

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v3, v1

    aput-object v5, v3, v4

    .line 20
    aget-object v5, v3, v4

    iget-object v5, v5, Lk0/b;->a:Lk0/i;

    iget v5, v5, Lk0/i;->d:I

    if-ne v5, v1, :cond_3

    .line 21
    aget-object v3, v3, v4

    iget-object v3, v3, Lk0/b;->a:Lk0/i;

    iput v4, v3, Lk0/i;->d:I

    :cond_3
    add-int/lit8 v3, v1, 0x1

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_3

    :cond_4
    if-ge v3, v4, :cond_5

    .line 22
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    aput-object v2, v1, v3

    :cond_5
    add-int/lit8 v4, v4, -0x1

    .line 23
    iput v4, p0, Lk0/d;->l:I

    add-int/lit8 v0, v0, -0x1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 24
    :cond_7
    iput-boolean p1, p0, Lk0/d;->a:Z

    :cond_8
    return-void
.end method

.method private n()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lk0/d;->l:I

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    aget-object v1, v1, v0

    .line 3
    iget-object v2, v1, Lk0/b;->a:Lk0/i;

    iget v1, v1, Lk0/b;->b:F

    iput v1, v2, Lk0/i;->f:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static s(Lk0/d;Lk0/i;Lk0/i;F)Lk0/b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object p0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lk0/b;->j(Lk0/i;Lk0/i;F)Lk0/b;

    move-result-object p0

    return-object p0
.end method

.method private u(Lk0/d$a;)I
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v2, 0x0

    .line 1
    :goto_0
    iget v3, v0, Lk0/d;->l:I

    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    .line 2
    iget-object v3, v0, Lk0/d;->g:[Lk0/b;

    aget-object v6, v3, v2

    iget-object v6, v6, Lk0/b;->a:Lk0/i;

    .line 3
    iget-object v6, v6, Lk0/i;->j:Lk0/i$a;

    sget-object v7, Lk0/i$a;->n:Lk0/i$a;

    if-ne v6, v7, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    aget-object v3, v3, v2

    iget v3, v3, Lk0/b;->b:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_15

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_3
    :goto_3
    if-nez v2, :cond_14

    add-int/lit8 v3, v3, 0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    .line 5
    :goto_4
    iget v12, v0, Lk0/d;->l:I

    if-ge v8, v12, :cond_12

    .line 6
    iget-object v12, v0, Lk0/d;->g:[Lk0/b;

    aget-object v12, v12, v8

    .line 7
    iget-object v13, v12, Lk0/b;->a:Lk0/i;

    .line 8
    iget-object v13, v13, Lk0/i;->j:Lk0/i$a;

    sget-object v14, Lk0/i$a;->n:Lk0/i$a;

    if-ne v13, v14, :cond_4

    goto/16 :goto_b

    .line 9
    :cond_4
    iget-boolean v13, v12, Lk0/b;->f:Z

    if-eqz v13, :cond_5

    goto/16 :goto_b

    .line 10
    :cond_5
    iget v13, v12, Lk0/b;->b:F

    cmpg-float v13, v13, v4

    if-gez v13, :cond_11

    .line 11
    sget-boolean v13, Lk0/d;->u:Z

    const/16 v14, 0x9

    if-eqz v13, :cond_b

    .line 12
    iget-object v13, v12, Lk0/b;->e:Lk0/b$a;

    invoke-interface {v13}, Lk0/b$a;->f()I

    move-result v13

    const/4 v15, 0x0

    :goto_5
    if-ge v15, v13, :cond_11

    .line 13
    iget-object v1, v12, Lk0/b;->e:Lk0/b$a;

    invoke-interface {v1, v15}, Lk0/b$a;->h(I)Lk0/i;

    move-result-object v1

    .line 14
    iget-object v5, v12, Lk0/b;->e:Lk0/b$a;

    invoke-interface {v5, v1}, Lk0/b$a;->g(Lk0/i;)F

    move-result v5

    cmpg-float v16, v5, v4

    if-gtz v16, :cond_6

    goto :goto_7

    :cond_6
    const/4 v7, 0x0

    :goto_6
    if-ge v7, v14, :cond_a

    .line 15
    iget-object v14, v1, Lk0/i;->h:[F

    aget v14, v14, v7

    div-float/2addr v14, v5

    cmpg-float v18, v14, v6

    if-gez v18, :cond_7

    if-eq v7, v11, :cond_8

    :cond_7
    if-le v7, v11, :cond_9

    .line 16
    :cond_8
    iget v10, v1, Lk0/i;->c:I

    move v11, v7

    move v9, v8

    move v6, v14

    :cond_9
    add-int/lit8 v7, v7, 0x1

    const/16 v14, 0x9

    goto :goto_6

    :cond_a
    :goto_7
    add-int/lit8 v15, v15, 0x1

    const/16 v14, 0x9

    goto :goto_5

    :cond_b
    const/4 v1, 0x1

    .line 17
    :goto_8
    iget v5, v0, Lk0/d;->k:I

    if-ge v1, v5, :cond_11

    .line 18
    iget-object v5, v0, Lk0/d;->n:Lk0/c;

    iget-object v5, v5, Lk0/c;->d:[Lk0/i;

    aget-object v5, v5, v1

    .line 19
    iget-object v7, v12, Lk0/b;->e:Lk0/b$a;

    invoke-interface {v7, v5}, Lk0/b$a;->g(Lk0/i;)F

    move-result v7

    cmpg-float v13, v7, v4

    if-gtz v13, :cond_c

    const/16 v14, 0x9

    goto :goto_a

    :cond_c
    const/4 v13, 0x0

    const/16 v14, 0x9

    :goto_9
    if-ge v13, v14, :cond_10

    .line 20
    iget-object v15, v5, Lk0/i;->h:[F

    aget v15, v15, v13

    div-float/2addr v15, v7

    cmpg-float v17, v15, v6

    if-gez v17, :cond_d

    if-eq v13, v11, :cond_e

    :cond_d
    if-le v13, v11, :cond_f

    :cond_e
    move v10, v1

    move v9, v8

    move v11, v13

    move v6, v15

    :cond_f
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_10
    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_11
    :goto_b
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_4

    :cond_12
    const/4 v1, -0x1

    if-eq v9, v1, :cond_13

    .line 21
    iget-object v5, v0, Lk0/d;->g:[Lk0/b;

    aget-object v5, v5, v9

    .line 22
    iget-object v6, v5, Lk0/b;->a:Lk0/i;

    iput v1, v6, Lk0/i;->d:I

    .line 23
    iget-object v1, v0, Lk0/d;->n:Lk0/c;

    iget-object v1, v1, Lk0/c;->d:[Lk0/i;

    aget-object v1, v1, v10

    invoke-virtual {v5, v1}, Lk0/b;->x(Lk0/i;)V

    .line 24
    iget-object v1, v5, Lk0/b;->a:Lk0/i;

    iput v9, v1, Lk0/i;->d:I

    .line 25
    invoke-virtual {v1, v0, v5}, Lk0/i;->g(Lk0/d;Lk0/b;)V

    goto :goto_c

    :cond_13
    const/4 v2, 0x1

    .line 26
    :goto_c
    iget v1, v0, Lk0/d;->k:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_3

    const/4 v2, 0x1

    goto/16 :goto_3

    :cond_14
    move v1, v3

    goto :goto_d

    :cond_15
    const/4 v1, 0x0

    :goto_d
    return v1
.end method

.method public static w()Lk0/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private y()V
    .locals 3

    .line 1
    iget v0, p0, Lk0/d;->e:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lk0/d;->e:I

    .line 2
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/b;

    iput-object v0, p0, Lk0/d;->g:[Lk0/b;

    .line 3
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    iget-object v1, v0, Lk0/c;->d:[Lk0/i;

    iget v2, p0, Lk0/d;->e:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lk0/i;

    iput-object v1, v0, Lk0/c;->d:[Lk0/i;

    .line 4
    iget v0, p0, Lk0/d;->e:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lk0/d;->j:[Z

    .line 5
    iput v0, p0, Lk0/d;->f:I

    .line 6
    iput v0, p0, Lk0/d;->m:I

    return-void
.end method


# virtual methods
.method A(Lk0/d$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lk0/d;->u(Lk0/d$a;)I

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lk0/d;->B(Lk0/d$a;Z)I

    .line 3
    invoke-direct {p0}, Lk0/d;->n()V

    return-void
.end method

.method public D()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lk0/d;->n:Lk0/c;

    iget-object v3, v2, Lk0/c;->d:[Lk0/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    .line 2
    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lk0/i;->d()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, v2, Lk0/c;->c:Lk0/f;

    iget-object v2, p0, Lk0/d;->o:[Lk0/i;

    iget v3, p0, Lk0/d;->p:I

    invoke-interface {v1, v2, v3}, Lk0/f;->c([Ljava/lang/Object;I)V

    .line 5
    iput v0, p0, Lk0/d;->p:I

    .line 6
    iget-object v1, p0, Lk0/d;->n:Lk0/c;

    iget-object v1, v1, Lk0/c;->d:[Lk0/i;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lk0/d;->c:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 9
    :cond_2
    iput v0, p0, Lk0/d;->b:I

    .line 10
    iget-object v1, p0, Lk0/d;->d:Lk0/d$a;

    invoke-interface {v1}, Lk0/d$a;->clear()V

    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lk0/d;->k:I

    const/4 v1, 0x0

    .line 12
    :goto_1
    iget v2, p0, Lk0/d;->l:I

    if-ge v1, v2, :cond_4

    .line 13
    iget-object v2, p0, Lk0/d;->g:[Lk0/b;

    aget-object v3, v2, v1

    if-eqz v3, :cond_3

    .line 14
    aget-object v2, v2, v1

    iput-boolean v0, v2, Lk0/b;->c:Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 15
    :cond_4
    invoke-direct {p0}, Lk0/d;->C()V

    .line 16
    iput v0, p0, Lk0/d;->l:I

    .line 17
    sget-boolean v0, Lk0/d;->v:Z

    if-eqz v0, :cond_5

    .line 18
    new-instance v0, Lk0/d$b;

    iget-object v1, p0, Lk0/d;->n:Lk0/c;

    invoke-direct {v0, p0, v1}, Lk0/d$b;-><init>(Lk0/d;Lk0/c;)V

    iput-object v0, p0, Lk0/d;->q:Lk0/d$a;

    goto :goto_2

    .line 19
    :cond_5
    new-instance v0, Lk0/b;

    iget-object v1, p0, Lk0/d;->n:Lk0/c;

    invoke-direct {v0, v1}, Lk0/b;-><init>(Lk0/c;)V

    iput-object v0, p0, Lk0/d;->q:Lk0/d$a;

    :goto_2
    return-void
.end method

.method public b(Ll0/e;Ll0/e;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    sget-object v3, Ll0/d$b;->o:Ll0/d$b;

    invoke-virtual {v1, v3}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v6

    .line 2
    sget-object v4, Ll0/d$b;->p:Ll0/d$b;

    invoke-virtual {v1, v4}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v5

    invoke-virtual {v0, v5}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v8

    .line 3
    sget-object v5, Ll0/d$b;->q:Ll0/d$b;

    invoke-virtual {v1, v5}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v7

    invoke-virtual {v0, v7}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v13

    .line 4
    sget-object v7, Ll0/d$b;->r:Ll0/d$b;

    invoke-virtual {v1, v7}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v9

    .line 5
    invoke-virtual {v2, v3}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v1

    .line 6
    invoke-virtual {v2, v4}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v10

    .line 7
    invoke-virtual {v2, v5}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v3

    .line 8
    invoke-virtual {v2, v7}, Ll0/e;->m(Ll0/d$b;)Ll0/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lk0/d;->q(Ljava/lang/Object;)Lk0/i;

    move-result-object v11

    .line 9
    invoke-virtual/range {p0 .. p0}, Lk0/d;->r()Lk0/b;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v4, v4

    .line 10
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    move/from16 v7, p4

    move-object/from16 p1, v3

    move-wide/from16 p2, v4

    int-to-double v3, v7

    mul-double v14, v14, v3

    double-to-float v12, v14

    move-object v7, v2

    .line 11
    invoke-virtual/range {v7 .. v12}, Lk0/b;->q(Lk0/i;Lk0/i;Lk0/i;Lk0/i;F)Lk0/b;

    .line 12
    invoke-virtual {v0, v2}, Lk0/d;->d(Lk0/b;)V

    .line 13
    invoke-virtual/range {p0 .. p0}, Lk0/d;->r()Lk0/b;

    move-result-object v2

    .line 14
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v7, v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    .line 15
    invoke-virtual/range {v5 .. v10}, Lk0/b;->q(Lk0/i;Lk0/i;Lk0/i;Lk0/i;F)Lk0/b;

    .line 16
    invoke-virtual {v0, v2}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method public c(Lk0/i;Lk0/i;IFLk0/i;Lk0/i;II)V
    .locals 11

    move-object v0, p0

    move/from16 v1, p8

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    .line 2
    invoke-virtual/range {v2 .. v9}, Lk0/b;->h(Lk0/i;Lk0/i;IFLk0/i;Lk0/i;I)Lk0/b;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    .line 3
    invoke-virtual {v10, p0, v1}, Lk0/b;->d(Lk0/d;I)Lk0/b;

    .line 4
    :cond_0
    invoke-virtual {p0, v10}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method public d(Lk0/b;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget v0, p0, Lk0/d;->l:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Lk0/d;->m:I

    if-ge v0, v2, :cond_1

    iget v0, p0, Lk0/d;->k:I

    add-int/2addr v0, v1

    iget v2, p0, Lk0/d;->f:I

    if-lt v0, v2, :cond_2

    .line 2
    :cond_1
    invoke-direct {p0}, Lk0/d;->y()V

    :cond_2
    const/4 v0, 0x0

    .line 3
    iget-boolean v2, p1, Lk0/b;->f:Z

    if-nez v2, :cond_a

    .line 4
    invoke-virtual {p1, p0}, Lk0/b;->D(Lk0/d;)V

    .line 5
    invoke-virtual {p1}, Lk0/b;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 6
    :cond_3
    invoke-virtual {p1}, Lk0/b;->r()V

    .line 7
    invoke-virtual {p1, p0}, Lk0/b;->f(Lk0/d;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 8
    invoke-virtual {p0}, Lk0/d;->p()Lk0/i;

    move-result-object v2

    .line 9
    iput-object v2, p1, Lk0/b;->a:Lk0/i;

    .line 10
    iget v3, p0, Lk0/d;->l:I

    .line 11
    invoke-direct {p0, p1}, Lk0/d;->l(Lk0/b;)V

    .line 12
    iget v4, p0, Lk0/d;->l:I

    add-int/2addr v3, v1

    if-ne v4, v3, :cond_7

    .line 13
    iget-object v0, p0, Lk0/d;->q:Lk0/d$a;

    invoke-interface {v0, p1}, Lk0/d$a;->b(Lk0/d$a;)V

    .line 14
    iget-object v0, p0, Lk0/d;->q:Lk0/d$a;

    invoke-direct {p0, v0, v1}, Lk0/d;->B(Lk0/d$a;Z)I

    .line 15
    iget v0, v2, Lk0/i;->d:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_8

    .line 16
    iget-object v0, p1, Lk0/b;->a:Lk0/i;

    if-ne v0, v2, :cond_4

    .line 17
    invoke-virtual {p1, v2}, Lk0/b;->v(Lk0/i;)Lk0/i;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 18
    invoke-virtual {p1, v0}, Lk0/b;->x(Lk0/i;)V

    .line 19
    :cond_4
    iget-boolean v0, p1, Lk0/b;->f:Z

    if-nez v0, :cond_5

    .line 20
    iget-object v0, p1, Lk0/b;->a:Lk0/i;

    invoke-virtual {v0, p0, p1}, Lk0/i;->g(Lk0/d;Lk0/b;)V

    .line 21
    :cond_5
    sget-boolean v0, Lk0/d;->v:Z

    if-eqz v0, :cond_6

    .line 22
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    iget-object v0, v0, Lk0/c;->a:Lk0/f;

    invoke-interface {v0, p1}, Lk0/f;->a(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_6
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    iget-object v0, v0, Lk0/c;->b:Lk0/f;

    invoke-interface {v0, p1}, Lk0/f;->a(Ljava/lang/Object;)Z

    .line 24
    :goto_0
    iget v0, p0, Lk0/d;->l:I

    sub-int/2addr v0, v1

    iput v0, p0, Lk0/d;->l:I

    goto :goto_1

    :cond_7
    const/4 v1, 0x0

    .line 25
    :cond_8
    :goto_1
    invoke-virtual {p1}, Lk0/b;->s()Z

    move-result v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    move v0, v1

    :cond_a
    if-nez v0, :cond_b

    .line 26
    invoke-direct {p0, p1}, Lk0/d;->l(Lk0/b;)V

    :cond_b
    return-void
.end method

.method public e(Lk0/i;Lk0/i;II)Lk0/b;
    .locals 3

    .line 1
    sget-boolean v0, Lk0/d;->s:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    if-ne p4, v1, :cond_0

    iget-boolean v0, p2, Lk0/i;->g:Z

    if-eqz v0, :cond_0

    iget v0, p1, Lk0/i;->d:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 2
    iget p2, p2, Lk0/i;->f:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Lk0/i;->e(Lk0/d;F)V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1, p2, p3}, Lk0/b;->n(Lk0/i;Lk0/i;I)Lk0/b;

    if-eq p4, v1, :cond_1

    .line 5
    invoke-virtual {v0, p0, p4}, Lk0/b;->d(Lk0/d;I)Lk0/b;

    .line 6
    :cond_1
    invoke-virtual {p0, v0}, Lk0/d;->d(Lk0/b;)V

    return-object v0
.end method

.method public f(Lk0/i;I)V
    .locals 5

    .line 1
    sget-boolean v0, Lk0/d;->s:Z

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v0, p1, Lk0/i;->d:I

    if-ne v0, v1, :cond_2

    int-to-float p2, p2

    .line 2
    invoke-virtual {p1, p0, p2}, Lk0/i;->e(Lk0/d;F)V

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget v1, p0, Lk0/d;->b:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    .line 4
    iget-object v1, p0, Lk0/d;->n:Lk0/c;

    iget-object v1, v1, Lk0/c;->d:[Lk0/i;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    .line 5
    iget-boolean v3, v1, Lk0/i;->n:Z

    if-eqz v3, :cond_0

    iget v3, v1, Lk0/i;->o:I

    iget v4, p1, Lk0/i;->c:I

    if-ne v3, v4, :cond_0

    .line 6
    iget v3, v1, Lk0/i;->p:F

    add-float/2addr v3, p2

    invoke-virtual {v1, p0, v3}, Lk0/i;->e(Lk0/d;F)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 7
    :cond_2
    iget v0, p1, Lk0/i;->d:I

    if-eq v0, v1, :cond_5

    .line 8
    iget-object v1, p0, Lk0/d;->g:[Lk0/b;

    aget-object v0, v1, v0

    .line 9
    iget-boolean v1, v0, Lk0/b;->f:Z

    if-eqz v1, :cond_3

    int-to-float p1, p2

    .line 10
    iput p1, v0, Lk0/b;->b:F

    goto :goto_1

    .line 11
    :cond_3
    iget-object v1, v0, Lk0/b;->e:Lk0/b$a;

    invoke-interface {v1}, Lk0/b$a;->f()I

    move-result v1

    if-nez v1, :cond_4

    .line 12
    iput-boolean v2, v0, Lk0/b;->f:Z

    int-to-float p1, p2

    .line 13
    iput p1, v0, Lk0/b;->b:F

    goto :goto_1

    .line 14
    :cond_4
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v0

    .line 15
    invoke-virtual {v0, p1, p2}, Lk0/b;->m(Lk0/i;I)Lk0/b;

    .line 16
    invoke-virtual {p0, v0}, Lk0/d;->d(Lk0/b;)V

    goto :goto_1

    .line 17
    :cond_5
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v0

    .line 18
    invoke-virtual {v0, p1, p2}, Lk0/b;->i(Lk0/i;I)Lk0/b;

    .line 19
    invoke-virtual {p0, v0}, Lk0/d;->d(Lk0/b;)V

    :goto_1
    return-void
.end method

.method public g(Lk0/i;Lk0/i;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object p4

    .line 2
    invoke-virtual {p0}, Lk0/d;->t()Lk0/i;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lk0/i;->e:I

    .line 4
    invoke-virtual {p4, p1, p2, v0, p3}, Lk0/b;->o(Lk0/i;Lk0/i;Lk0/i;I)Lk0/b;

    .line 5
    invoke-virtual {p0, p4}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method public h(Lk0/i;Lk0/i;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lk0/d;->t()Lk0/i;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    iput v2, v1, Lk0/i;->e:I

    .line 4
    invoke-virtual {v0, p1, p2, v1, p3}, Lk0/b;->o(Lk0/i;Lk0/i;Lk0/i;I)Lk0/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    .line 5
    iget-object p1, v0, Lk0/b;->e:Lk0/b$a;

    invoke-interface {p1, v1}, Lk0/b$a;->g(Lk0/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, v0, p1, p4}, Lk0/d;->m(Lk0/b;II)V

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method public i(Lk0/i;Lk0/i;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object p4

    .line 2
    invoke-virtual {p0}, Lk0/d;->t()Lk0/i;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lk0/i;->e:I

    .line 4
    invoke-virtual {p4, p1, p2, v0, p3}, Lk0/b;->p(Lk0/i;Lk0/i;Lk0/i;I)Lk0/b;

    .line 5
    invoke-virtual {p0, p4}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method public j(Lk0/i;Lk0/i;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lk0/d;->t()Lk0/i;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    iput v2, v1, Lk0/i;->e:I

    .line 4
    invoke-virtual {v0, p1, p2, v1, p3}, Lk0/b;->p(Lk0/i;Lk0/i;Lk0/i;I)Lk0/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    .line 5
    iget-object p1, v0, Lk0/b;->e:Lk0/b$a;

    invoke-interface {p1, v1}, Lk0/b$a;->g(Lk0/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, v0, p1, p4}, Lk0/d;->m(Lk0/b;II)V

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method public k(Lk0/i;Lk0/i;Lk0/i;Lk0/i;FI)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lk0/d;->r()Lk0/b;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 2
    invoke-virtual/range {v0 .. v5}, Lk0/b;->k(Lk0/i;Lk0/i;Lk0/i;Lk0/i;F)Lk0/b;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    .line 3
    invoke-virtual {v6, p0, p6}, Lk0/b;->d(Lk0/d;I)Lk0/b;

    .line 4
    :cond_0
    invoke-virtual {p0, v6}, Lk0/d;->d(Lk0/b;)V

    return-void
.end method

.method m(Lk0/b;II)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p3, v0}, Lk0/d;->o(ILjava/lang/String;)Lk0/i;

    move-result-object p3

    .line 2
    invoke-virtual {p1, p3, p2}, Lk0/b;->e(Lk0/i;I)Lk0/b;

    return-void
.end method

.method public o(ILjava/lang/String;)Lk0/i;
    .locals 2

    .line 1
    iget v0, p0, Lk0/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lk0/d;->f:I

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lk0/d;->y()V

    .line 3
    :cond_0
    sget-object v0, Lk0/i$a;->q:Lk0/i$a;

    invoke-direct {p0, v0, p2}, Lk0/d;->a(Lk0/i$a;Ljava/lang/String;)Lk0/i;

    move-result-object p2

    .line 4
    iget v0, p0, Lk0/d;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lk0/d;->b:I

    .line 5
    iget v1, p0, Lk0/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lk0/d;->k:I

    .line 6
    iput v0, p2, Lk0/i;->c:I

    .line 7
    iput p1, p2, Lk0/i;->e:I

    .line 8
    iget-object p1, p0, Lk0/d;->n:Lk0/c;

    iget-object p1, p1, Lk0/c;->d:[Lk0/i;

    aput-object p2, p1, v0

    .line 9
    iget-object p1, p0, Lk0/d;->d:Lk0/d$a;

    invoke-interface {p1, p2}, Lk0/d$a;->c(Lk0/i;)V

    return-object p2
.end method

.method public p()Lk0/i;
    .locals 3

    .line 1
    iget v0, p0, Lk0/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lk0/d;->f:I

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lk0/d;->y()V

    .line 3
    :cond_0
    sget-object v0, Lk0/i$a;->p:Lk0/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lk0/d;->a(Lk0/i$a;Ljava/lang/String;)Lk0/i;

    move-result-object v0

    .line 4
    iget v1, p0, Lk0/d;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lk0/d;->b:I

    .line 5
    iget v2, p0, Lk0/d;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lk0/d;->k:I

    .line 6
    iput v1, v0, Lk0/i;->c:I

    .line 7
    iget-object v2, p0, Lk0/d;->n:Lk0/c;

    iget-object v2, v2, Lk0/c;->d:[Lk0/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public q(Ljava/lang/Object;)Lk0/i;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    iget v1, p0, Lk0/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lk0/d;->f:I

    if-lt v1, v2, :cond_1

    .line 2
    invoke-direct {p0}, Lk0/d;->y()V

    .line 3
    :cond_1
    instance-of v1, p1, Ll0/d;

    if-eqz v1, :cond_5

    .line 4
    check-cast p1, Ll0/d;

    invoke-virtual {p1}, Ll0/d;->h()Lk0/i;

    move-result-object v0

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    invoke-virtual {p1, v0}, Ll0/d;->r(Lk0/c;)V

    .line 6
    invoke-virtual {p1}, Ll0/d;->h()Lk0/i;

    move-result-object p1

    move-object v0, p1

    .line 7
    :cond_2
    iget p1, v0, Lk0/i;->c:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, Lk0/d;->b:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Lk0/d;->n:Lk0/c;

    iget-object v2, v2, Lk0/c;->d:[Lk0/i;

    aget-object v2, v2, p1

    if-nez v2, :cond_5

    :cond_3
    if-eq p1, v1, :cond_4

    .line 8
    invoke-virtual {v0}, Lk0/i;->d()V

    .line 9
    :cond_4
    iget p1, p0, Lk0/d;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lk0/d;->b:I

    .line 10
    iget v1, p0, Lk0/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lk0/d;->k:I

    .line 11
    iput p1, v0, Lk0/i;->c:I

    .line 12
    sget-object v1, Lk0/i$a;->n:Lk0/i$a;

    iput-object v1, v0, Lk0/i;->j:Lk0/i$a;

    .line 13
    iget-object v1, p0, Lk0/d;->n:Lk0/c;

    iget-object v1, v1, Lk0/c;->d:[Lk0/i;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public r()Lk0/b;
    .locals 5

    .line 1
    sget-boolean v0, Lk0/d;->v:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    iget-object v0, v0, Lk0/c;->a:Lk0/f;

    invoke-interface {v0}, Lk0/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/b;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lk0/d$b;

    iget-object v3, p0, Lk0/d;->n:Lk0/c;

    invoke-direct {v0, p0, v3}, Lk0/d$b;-><init>(Lk0/d;Lk0/c;)V

    .line 4
    sget-wide v3, Lk0/d;->y:J

    add-long/2addr v3, v1

    sput-wide v3, Lk0/d;->y:J

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Lk0/b;->y()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    iget-object v0, v0, Lk0/c;->b:Lk0/f;

    invoke-interface {v0}, Lk0/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/b;

    if-nez v0, :cond_2

    .line 7
    new-instance v0, Lk0/b;

    iget-object v3, p0, Lk0/d;->n:Lk0/c;

    invoke-direct {v0, v3}, Lk0/b;-><init>(Lk0/c;)V

    .line 8
    sget-wide v3, Lk0/d;->x:J

    add-long/2addr v3, v1

    sput-wide v3, Lk0/d;->x:J

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v0}, Lk0/b;->y()V

    .line 10
    :goto_0
    invoke-static {}, Lk0/i;->b()V

    return-object v0
.end method

.method public t()Lk0/i;
    .locals 3

    .line 1
    iget v0, p0, Lk0/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lk0/d;->f:I

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lk0/d;->y()V

    .line 3
    :cond_0
    sget-object v0, Lk0/i$a;->p:Lk0/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lk0/d;->a(Lk0/i$a;Ljava/lang/String;)Lk0/i;

    move-result-object v0

    .line 4
    iget v1, p0, Lk0/d;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lk0/d;->b:I

    .line 5
    iget v2, p0, Lk0/d;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lk0/d;->k:I

    .line 6
    iput v1, v0, Lk0/i;->c:I

    .line 7
    iget-object v2, p0, Lk0/d;->n:Lk0/c;

    iget-object v2, v2, Lk0/c;->d:[Lk0/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public v()Lk0/c;
    .locals 1

    iget-object v0, p0, Lk0/d;->n:Lk0/c;

    return-object v0
.end method

.method public x(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ll0/d;

    .line 2
    invoke-virtual {p1}, Ll0/d;->h()Lk0/i;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget p1, p1, Lk0/i;->f:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public z()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk0/d;->d:Lk0/d$a;

    invoke-interface {v0}, Lk0/d$a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lk0/d;->n()V

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lk0/d;->h:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lk0/d;->i:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lk0/d;->d:Lk0/d$a;

    invoke-virtual {p0, v0}, Lk0/d;->A(Lk0/d$a;)V

    goto :goto_3

    :cond_2
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 5
    :goto_1
    iget v2, p0, Lk0/d;->l:I

    if-ge v1, v2, :cond_4

    .line 6
    iget-object v2, p0, Lk0/d;->g:[Lk0/b;

    aget-object v2, v2, v1

    .line 7
    iget-boolean v2, v2, Lk0/b;->f:Z

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_5

    .line 8
    iget-object v0, p0, Lk0/d;->d:Lk0/d$a;

    invoke-virtual {p0, v0}, Lk0/d;->A(Lk0/d$a;)V

    goto :goto_3

    .line 9
    :cond_5
    invoke-direct {p0}, Lk0/d;->n()V

    :goto_3
    return-void
.end method
