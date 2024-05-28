.class public Lc0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Lb0/f;

    invoke-static {v0}, Lb0/a;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lc0/c;->a:Z

    return-void
.end method

.method public static synthetic a(Lc0/c;Lw/r0;Lw/r0;)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lc0/c;->c(Lw/r0;Lw/r0;)I

    move-result p0

    return p0
.end method

.method private b(Lw/r0;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/media/MediaCodec;

    if-eq v0, v1, :cond_2

    .line 2
    invoke-virtual {p1}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroidx/camera/core/d3;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lw/r0;->e()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Landroidx/camera/core/z1;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x2

    return p1
.end method

.method private synthetic c(Lw/r0;Lw/r0;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc0/c;->b(Lw/r0;)I

    move-result p1

    .line 2
    invoke-direct {p0, p2}, Lc0/c;->b(Lw/r0;)I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc0/c;->a:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lc0/b;

    invoke-direct {v0, p0}, Lc0/b;-><init>(Lc0/c;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
