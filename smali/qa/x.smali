.class public Lqa/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final m:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final a:Lqa/t;

.field private final b:Lqa/w$b;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Landroid/graphics/drawable/Drawable;

.field private l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lqa/x;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method constructor <init>(Lqa/t;Landroid/net/Uri;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqa/x;->e:Z

    .line 3
    iget-boolean v0, p1, Lqa/t;->o:Z

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lqa/x;->a:Lqa/t;

    .line 5
    new-instance v0, Lqa/w$b;

    iget-object p1, p1, Lqa/t;->l:Landroid/graphics/Bitmap$Config;

    invoke-direct {v0, p2, p3, p1}, Lqa/w$b;-><init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V

    iput-object v0, p0, Lqa/x;->b:Lqa/w$b;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Picasso instance already shut down. Cannot submit new requests."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(J)Lqa/w;
    .locals 7

    .line 1
    sget-object v0, Lqa/x;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    .line 2
    iget-object v1, p0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v1}, Lqa/w$b;->a()Lqa/w;

    move-result-object v1

    .line 3
    iput v0, v1, Lqa/w;->a:I

    .line 4
    iput-wide p1, v1, Lqa/w;->b:J

    .line 5
    iget-object v2, p0, Lqa/x;->a:Lqa/t;

    iget-boolean v2, v2, Lqa/t;->n:Z

    const-string v3, "Main"

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v1}, Lqa/w;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lqa/w;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "created"

    invoke-static {v3, v6, v4, v5}, Lqa/g0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :cond_0
    iget-object v4, p0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v4, v1}, Lqa/t;->o(Lqa/w;)Lqa/w;

    move-result-object v4

    if-eq v4, v1, :cond_1

    .line 8
    iput v0, v4, Lqa/w;->a:I

    .line 9
    iput-wide p1, v4, Lqa/w;->b:J

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {v4}, Lqa/w;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "into "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "changed"

    invoke-static {v3, v0, p1, p2}, Lqa/g0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v4
.end method

.method private b()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget v0, p0, Lqa/x;->f:I

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lqa/x;->a:Lqa/t;

    iget-object v0, v0, Lqa/t;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lqa/x;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lqa/x;->j:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method


# virtual methods
.method public c(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lqa/x;->d(Landroid/widget/ImageView;Lqa/e;)V

    return-void
.end method

.method public d(Landroid/widget/ImageView;Lqa/e;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v3, p1

    move-object/from16 v11, p2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 2
    invoke-static {}, Lqa/g0;->c()V

    if-eqz v3, :cond_b

    .line 3
    iget-object v4, v0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v4}, Lqa/w$b;->b()Z

    move-result v4

    if-nez v4, :cond_1

    .line 4
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v1, v3}, Lqa/t;->c(Landroid/widget/ImageView;)V

    .line 5
    iget-boolean v1, v0, Lqa/x;->e:Z

    if-eqz v1, :cond_0

    .line 6
    invoke-direct {p0}, Lqa/x;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lqa/u;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    iget-boolean v4, v0, Lqa/x;->d:Z

    if-eqz v4, :cond_6

    .line 8
    iget-object v4, v0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v4}, Lqa/w$b;->c()Z

    move-result v4

    if-nez v4, :cond_5

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v4

    .line 10
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v5

    if-eqz v4, :cond_3

    if-nez v5, :cond_2

    goto :goto_0

    .line 11
    :cond_2
    iget-object v6, v0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v6, v4, v5}, Lqa/w$b;->d(II)Lqa/w$b;

    goto :goto_1

    .line 12
    :cond_3
    :goto_0
    iget-boolean v1, v0, Lqa/x;->e:Z

    if-eqz v1, :cond_4

    .line 13
    invoke-direct {p0}, Lqa/x;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lqa/u;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 14
    :cond_4
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    new-instance v2, Lqa/h;

    invoke-direct {v2, p0, v3, v11}, Lqa/h;-><init>(Lqa/x;Landroid/widget/ImageView;Lqa/e;)V

    invoke-virtual {v1, v3, v2}, Lqa/t;->f(Landroid/widget/ImageView;Lqa/h;)V

    return-void

    .line 15
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fit cannot be used with resize."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 16
    :cond_6
    :goto_1
    invoke-direct {p0, v1, v2}, Lqa/x;->a(J)Lqa/w;

    move-result-object v7

    .line 17
    invoke-static {v7}, Lqa/g0;->h(Lqa/w;)Ljava/lang/String;

    move-result-object v9

    .line 18
    iget v1, v0, Lqa/x;->h:I

    invoke-static {v1}, Lqa/p;->b(I)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 19
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v1, v9}, Lqa/t;->l(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 20
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v1, v3}, Lqa/t;->c(Landroid/widget/ImageView;)V

    .line 21
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    iget-object v2, v1, Lqa/t;->e:Landroid/content/Context;

    sget-object v8, Lqa/t$e;->o:Lqa/t$e;

    iget-boolean v5, v0, Lqa/x;->c:Z

    iget-boolean v6, v1, Lqa/t;->m:Z

    move-object/from16 v1, p1

    move-object v3, v4

    move-object v4, v8

    invoke-static/range {v1 .. v6}, Lqa/u;->c(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/Bitmap;Lqa/t$e;ZZ)V

    .line 22
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    iget-boolean v1, v1, Lqa/t;->n:Z

    if-eqz v1, :cond_7

    .line 23
    invoke-virtual {v7}, Lqa/w;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Main"

    const-string v4, "completed"

    invoke-static {v3, v4, v1, v2}, Lqa/g0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    if-eqz v11, :cond_8

    .line 24
    invoke-interface/range {p2 .. p2}, Lqa/e;->onSuccess()V

    :cond_8
    return-void

    .line 25
    :cond_9
    iget-boolean v1, v0, Lqa/x;->e:Z

    if-eqz v1, :cond_a

    .line 26
    invoke-direct {p0}, Lqa/x;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lqa/u;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 27
    :cond_a
    new-instance v13, Lqa/l;

    iget-object v2, v0, Lqa/x;->a:Lqa/t;

    iget v5, v0, Lqa/x;->h:I

    iget v6, v0, Lqa/x;->i:I

    iget v8, v0, Lqa/x;->g:I

    iget-object v10, v0, Lqa/x;->k:Landroid/graphics/drawable/Drawable;

    iget-object v12, v0, Lqa/x;->l:Ljava/lang/Object;

    iget-boolean v14, v0, Lqa/x;->c:Z

    move-object v1, v13

    move-object/from16 v3, p1

    move-object v4, v7

    move v7, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v11, p2

    move v12, v14

    invoke-direct/range {v1 .. v12}, Lqa/l;-><init>(Lqa/t;Landroid/widget/ImageView;Lqa/w;IIILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;Lqa/e;Z)V

    .line 28
    iget-object v1, v0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v1, v13}, Lqa/t;->h(Lqa/a;)V

    return-void

    .line 29
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Target must not be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public e(Lqa/c0;)V
    .locals 14

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 2
    invoke-static {}, Lqa/g0;->c()V

    if-eqz p1, :cond_5

    .line 3
    iget-boolean v2, p0, Lqa/x;->d:Z

    if-nez v2, :cond_4

    .line 4
    iget-object v2, p0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v2}, Lqa/w$b;->b()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 5
    iget-object v0, p0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v0, p1}, Lqa/t;->d(Lqa/c0;)V

    .line 6
    iget-boolean v0, p0, Lqa/x;->e:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lqa/x;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_0
    invoke-interface {p1, v3}, Lqa/c0;->b(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 7
    :cond_1
    invoke-direct {p0, v0, v1}, Lqa/x;->a(J)Lqa/w;

    move-result-object v7

    .line 8
    invoke-static {v7}, Lqa/g0;->h(Lqa/w;)Ljava/lang/String;

    move-result-object v11

    .line 9
    iget v0, p0, Lqa/x;->h:I

    invoke-static {v0}, Lqa/p;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v0, v11}, Lqa/t;->l(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v1, p0, Lqa/x;->a:Lqa/t;

    invoke-virtual {v1, p1}, Lqa/t;->d(Lqa/c0;)V

    .line 12
    sget-object v1, Lqa/t$e;->o:Lqa/t$e;

    invoke-interface {p1, v0, v1}, Lqa/c0;->c(Landroid/graphics/Bitmap;Lqa/t$e;)V

    return-void

    .line 13
    :cond_2
    iget-boolean v0, p0, Lqa/x;->e:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lqa/x;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_3
    invoke-interface {p1, v3}, Lqa/c0;->b(Landroid/graphics/drawable/Drawable;)V

    .line 14
    new-instance v0, Lqa/d0;

    iget-object v5, p0, Lqa/x;->a:Lqa/t;

    iget v8, p0, Lqa/x;->h:I

    iget v9, p0, Lqa/x;->i:I

    iget-object v10, p0, Lqa/x;->k:Landroid/graphics/drawable/Drawable;

    iget-object v12, p0, Lqa/x;->l:Ljava/lang/Object;

    iget v13, p0, Lqa/x;->g:I

    move-object v4, v0

    move-object v6, p1

    invoke-direct/range {v4 .. v13}, Lqa/d0;-><init>(Lqa/t;Lqa/c0;Lqa/w;IILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 15
    iget-object p1, p0, Lqa/x;->a:Lqa/t;

    invoke-virtual {p1, v0}, Lqa/t;->h(Lqa/a;)V

    return-void

    .line 16
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fit cannot be used with a Target."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Target must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(II)Lqa/x;
    .locals 1

    iget-object v0, p0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v0, p1, p2}, Lqa/w$b;->d(II)Lqa/w$b;

    return-object p0
.end method

.method public g(Lqa/e0;)Lqa/x;
    .locals 1

    iget-object v0, p0, Lqa/x;->b:Lqa/w$b;

    invoke-virtual {v0, p1}, Lqa/w$b;->e(Lqa/e0;)Lqa/w$b;

    return-object p0
.end method

.method h()Lqa/x;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqa/x;->d:Z

    return-object p0
.end method
