.class final Landroidx/camera/core/m2;
.super Landroidx/camera/core/i0;
.source "SourceFile"


# instance fields
.field private final p:Landroidx/camera/core/i1;

.field private q:Landroid/graphics/Rect;

.field private final r:I

.field private final s:I


# direct methods
.method constructor <init>(Landroidx/camera/core/l1;Landroid/util/Size;Landroidx/camera/core/i1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/camera/core/i0;-><init>(Landroidx/camera/core/l1;)V

    if-nez p2, :cond_0

    .line 3
    invoke-super {p0}, Landroidx/camera/core/i0;->g()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/m2;->r:I

    .line 4
    invoke-super {p0}, Landroidx/camera/core/i0;->getHeight()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/m2;->s:I

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/m2;->r:I

    .line 6
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/m2;->s:I

    .line 7
    :goto_0
    iput-object p3, p0, Landroidx/camera/core/m2;->p:Landroidx/camera/core/i1;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/l1;Landroidx/camera/core/i1;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2}, Landroidx/camera/core/m2;-><init>(Landroidx/camera/core/l1;Landroid/util/Size;Landroidx/camera/core/i1;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized g()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroidx/camera/core/m2;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getHeight()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroidx/camera/core/m2;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized o(Landroid/graphics/Rect;)V
    .locals 3

    monitor-enter p0

    if-eqz p1, :cond_1

    .line 1
    :try_start_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/m2;->g()I

    move-result p1

    invoke-virtual {p0}, Landroidx/camera/core/m2;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, p1, v1}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :cond_0
    move-object p1, v0

    .line 4
    :cond_1
    iput-object p1, p0, Landroidx/camera/core/m2;->q:Landroid/graphics/Rect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public q()Landroidx/camera/core/i1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/m2;->p:Landroidx/camera/core/i1;

    return-object v0
.end method
