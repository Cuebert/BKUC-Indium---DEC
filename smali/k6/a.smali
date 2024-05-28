.class public Lk6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg6/h;


# instance fields
.field private volatile a:Landroid/graphics/Bitmap;

.field private volatile b:Ljava/nio/ByteBuffer;

.field private volatile c:Lk6/b;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method private constructor <init>(Landroid/graphics/Bitmap;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lk6/a;->a:Landroid/graphics/Bitmap;

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lk6/a;->d:I

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lk6/a;->e:I

    iput p2, p0, Lk6/a;->f:I

    const/4 p1, -0x1

    iput p1, p0, Lk6/a;->g:I

    return-void
.end method

.method private constructor <init>(Landroid/media/Image;III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lk6/b;

    .line 5
    invoke-direct {v0, p1}, Lk6/b;-><init>(Landroid/media/Image;)V

    iput-object v0, p0, Lk6/a;->c:Lk6/b;

    iput p2, p0, Lk6/a;->d:I

    iput p3, p0, Lk6/a;->e:I

    iput p4, p0, Lk6/a;->f:I

    const/16 p1, 0x23

    iput p1, p0, Lk6/a;->g:I

    return-void
.end method

.method public static a(Landroid/media/Image;I)Lk6/a;
    .locals 8
    .param p0    # Landroid/media/Image;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v0, "Please provide a valid image"

    .line 2
    invoke-static {p0, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e

    const/4 v1, 0x0

    const/4 v4, 0x1

    if-eqz p1, :cond_1

    const/16 v5, 0x5a

    if-eq p1, v5, :cond_1

    const/16 v5, 0xb4

    if-eq p1, v5, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    const/16 v7, 0x10e

    goto :goto_0

    :cond_0
    move v7, p1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    move v7, p1

    const/4 p1, 0x1

    :goto_0
    const-string v0, "Invalid rotation. Only 0, 90, 180, 270 are supported currently."

    .line 3
    invoke-static {p1, v0}, Lz2/j;->b(ZLjava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    move-result p1

    const/16 v0, 0x100

    if-eq p1, v0, :cond_3

    .line 5
    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    move-result p1

    const/16 v5, 0x23

    if-ne p1, v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :cond_3
    :goto_1
    const-string p1, "Only JPEG and YUV_420_888 are supported now"

    .line 6
    invoke-static {v4, p1}, Lz2/j;->b(ZLjava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    move-result v4

    if-ne v4, v0, :cond_4

    .line 9
    invoke-virtual {p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    new-instance v0, Lk6/a;

    invoke-static {}, Ll6/c;->d()Ll6/c;

    move-result-object v4

    .line 10
    invoke-virtual {v4, p0, v7}, Ll6/c;->b(Landroid/media/Image;I)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {v0, v4, v1}, Lk6/a;-><init>(Landroid/graphics/Bitmap;I)V

    :goto_2
    move v6, p1

    move-object p1, v0

    goto :goto_4

    .line 11
    :cond_4
    array-length v0, p1

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v0, :cond_6

    aget-object v5, p1, v4

    .line 12
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 13
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    new-instance v0, Lk6/a;

    .line 14
    invoke-virtual {p0}, Landroid/media/Image;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/media/Image;->getHeight()I

    move-result v4

    invoke-direct {v0, p0, p1, v4, v7}, Lk6/a;-><init>(Landroid/media/Image;III)V

    .line 15
    invoke-virtual {p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    mul-int/lit8 p1, p1, 0x3

    div-int/lit8 p1, p1, 0x2

    goto :goto_2

    .line 16
    :goto_4
    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    move-result v0

    const/4 v1, 0x5

    .line 17
    invoke-virtual {p0}, Landroid/media/Image;->getHeight()I

    move-result v4

    .line 18
    invoke-virtual {p0}, Landroid/media/Image;->getWidth()I

    move-result v5

    .line 19
    invoke-static/range {v0 .. v7}, Lk6/a;->j(IIJIIII)V

    return-object p1
.end method

.method private static j(IIJIIII)V
    .locals 10

    const-string v0, "vision-common"

    .line 1
    invoke-static {v0}, Ly3/p7;->b(Ljava/lang/String;)Ly3/f7;

    move-result-object v1

    move v2, p0

    move v3, p1

    move-wide v4, p2

    move v6, p4

    move v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    .line 2
    invoke-static/range {v1 .. v9}, Ly3/r7;->a(Ly3/f7;IIJIIII)V

    return-void
.end method


# virtual methods
.method public b()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Lk6/a;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()Ljava/nio/ByteBuffer;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Lk6/a;->b:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lk6/a;->g:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lk6/a;->e:I

    return v0
.end method

.method public f()Landroid/media/Image;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Lk6/a;->c:Lk6/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lk6/a;->c:Lk6/b;

    invoke-virtual {v0}, Lk6/b;->a()Landroid/media/Image;

    move-result-object v0

    return-object v0
.end method

.method public g()[Landroid/media/Image$Plane;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Lk6/a;->c:Lk6/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lk6/a;->c:Lk6/b;

    invoke-virtual {v0}, Lk6/b;->b()[Landroid/media/Image$Plane;

    move-result-object v0

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lk6/a;->f:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lk6/a;->d:I

    return v0
.end method
