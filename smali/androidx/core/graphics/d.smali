.class public Landroidx/core/graphics/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/graphics/d$a;
    }
.end annotation


# static fields
.field private static final a:Landroidx/core/graphics/j;

.field private static final b:Lh0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/e<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Landroidx/core/graphics/i;

    invoke-direct {v0}, Landroidx/core/graphics/i;-><init>()V

    sput-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 3
    new-instance v0, Landroidx/core/graphics/h;

    invoke-direct {v0}, Landroidx/core/graphics/h;-><init>()V

    sput-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    .line 4
    new-instance v0, Landroidx/core/graphics/g;

    invoke-direct {v0}, Landroidx/core/graphics/g;-><init>()V

    sput-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    goto :goto_0

    :cond_2
    const/16 v1, 0x18

    if-lt v0, v1, :cond_3

    .line 5
    invoke-static {}, Landroidx/core/graphics/f;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6
    new-instance v0, Landroidx/core/graphics/f;

    invoke-direct {v0}, Landroidx/core/graphics/f;-><init>()V

    sput-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    goto :goto_0

    .line 7
    :cond_3
    new-instance v0, Landroidx/core/graphics/e;

    invoke-direct {v0}, Landroidx/core/graphics/e;-><init>()V

    sput-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    .line 8
    :goto_0
    new-instance v0, Lh0/e;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lh0/e;-><init>(I)V

    sput-object v0, Landroidx/core/graphics/d;->b:Lh0/e;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Context cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;[Landroidx/core/provider/g$b;I)Landroid/graphics/Typeface;
    .locals 1

    sget-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/core/graphics/j;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[Landroidx/core/provider/g$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Landroidx/core/content/res/e$b;Landroid/content/res/Resources;ILjava/lang/String;IILandroidx/core/content/res/h$e;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    .locals 13

    move-object v0, p1

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    .line 1
    instance-of v3, v0, Landroidx/core/content/res/e$e;

    if-eqz v3, :cond_5

    .line 2
    check-cast v0, Landroidx/core/content/res/e$e;

    .line 3
    invoke-virtual {v0}, Landroidx/core/content/res/e$e;->c()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {v3}, Landroidx/core/graphics/d;->g(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1, v3, v2}, Landroidx/core/content/res/h$e;->d(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    :cond_0
    return-object v3

    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p9, :cond_2

    .line 6
    invoke-virtual {v0}, Landroidx/core/content/res/e$e;->a()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    :goto_0
    const/4 v9, 0x1

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    if-eqz p9, :cond_4

    .line 7
    invoke-virtual {v0}, Landroidx/core/content/res/e$e;->d()I

    move-result v3

    move v10, v3

    goto :goto_2

    :cond_4
    const/4 v3, -0x1

    const/4 v10, -0x1

    .line 8
    :goto_2
    invoke-static/range {p8 .. p8}, Landroidx/core/content/res/h$e;->e(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object v11

    .line 9
    new-instance v12, Landroidx/core/graphics/d$a;

    invoke-direct {v12, v1}, Landroidx/core/graphics/d$a;-><init>(Landroidx/core/content/res/h$e;)V

    .line 10
    invoke-virtual {v0}, Landroidx/core/content/res/e$e;->b()Landroidx/core/provider/e;

    move-result-object v7

    move-object v6, p0

    move/from16 v8, p6

    invoke-static/range {v6 .. v12}, Landroidx/core/provider/g;->a(Landroid/content/Context;Landroidx/core/provider/e;IZILandroid/os/Handler;Landroidx/core/provider/g$c;)Landroid/graphics/Typeface;

    move-result-object v0

    move-object v5, p2

    move/from16 v6, p6

    goto :goto_3

    .line 11
    :cond_5
    sget-object v3, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    check-cast v0, Landroidx/core/content/res/e$c;

    move-object v4, p0

    move-object v5, p2

    move/from16 v6, p6

    invoke-virtual {v3, p0, v0, p2, v6}, Landroidx/core/graphics/j;->a(Landroid/content/Context;Landroidx/core/content/res/e$c;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v1, :cond_7

    if-eqz v0, :cond_6

    .line 12
    invoke-virtual {v1, v0, v2}, Landroidx/core/content/res/h$e;->d(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_3

    :cond_6
    const/4 v3, -0x3

    .line 13
    invoke-virtual {v1, v3, v2}, Landroidx/core/content/res/h$e;->c(ILandroid/os/Handler;)V

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 14
    sget-object v1, Landroidx/core/graphics/d;->b:Lh0/e;

    invoke-static/range {p2 .. p6}, Landroidx/core/graphics/d;->e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lh0/e;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-object v0
.end method

.method public static d(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 6

    .line 1
    sget-object v0, Landroidx/core/graphics/d;->a:Landroidx/core/graphics/j;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/graphics/j;->d(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-static {p1, p2, p3, p4, p5}, Landroidx/core/graphics/d;->e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    .line 3
    sget-object p2, Landroidx/core/graphics/d;->b:Lh0/e;

    invoke-virtual {p2, p1, p0}, Lh0/e;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method private static e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p0, 0x2d

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 1

    sget-object v0, Landroidx/core/graphics/d;->b:Lh0/e;

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/core/graphics/d;->e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lh0/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;

    return-object p0
.end method

.method private static g(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    .line 3
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz p0, :cond_1

    .line 4
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v0, p0

    :cond_1
    :goto_0
    return-object v0
.end method
