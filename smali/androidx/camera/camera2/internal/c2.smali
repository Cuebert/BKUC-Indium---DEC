.class Landroidx/camera/camera2/internal/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/c2$b;
    }
.end annotation


# instance fields
.field private a:Lw/r0;

.field private final b:Lw/c2;

.field private final c:Lu/p;


# direct methods
.method constructor <init>(Lr/z;Landroidx/camera/camera2/internal/v1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lu/p;

    invoke-direct {v0}, Lu/p;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/c2;->c:Lu/p;

    .line 3
    new-instance v0, Landroidx/camera/camera2/internal/c2$b;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/c2$b;-><init>()V

    .line 4
    new-instance v1, Landroid/graphics/SurfaceTexture;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/c2;->d(Lr/z;Landroidx/camera/camera2/internal/v1;)Landroid/util/Size;

    move-result-object p1

    .line 6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MeteringSession SurfaceTexture size: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v2, "MeteringRepeating"

    invoke-static {v2, p2}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p2

    .line 8
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    .line 9
    invoke-virtual {v1, p2, p1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 10
    new-instance p1, Landroid/view/Surface;

    invoke-direct {p1, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 11
    invoke-static {v0}, Lw/c2$b;->o(Lw/o2;)Lw/c2$b;

    move-result-object p2

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p2, v0}, Lw/c2$b;->s(I)V

    .line 13
    new-instance v0, Lw/i1;

    invoke-direct {v0, p1}, Lw/i1;-><init>(Landroid/view/Surface;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/c2;->a:Lw/r0;

    .line 14
    invoke-virtual {v0}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v0

    new-instance v2, Landroidx/camera/camera2/internal/c2$a;

    invoke-direct {v2, p0, p1, v1}, Landroidx/camera/camera2/internal/c2$a;-><init>(Landroidx/camera/camera2/internal/c2;Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    .line 15
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 16
    invoke-static {v0, v2, p1}, Ly/f;->b(Lcom/google/common/util/concurrent/m;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 17
    iget-object p1, p0, Landroidx/camera/camera2/internal/c2;->a:Lw/r0;

    invoke-virtual {p2, p1}, Lw/c2$b;->k(Lw/r0;)V

    .line 18
    invoke-virtual {p2}, Lw/c2$b;->m()Lw/c2;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/c2;->b:Lw/c2;

    return-void
.end method

.method public static synthetic a(Landroid/util/Size;Landroid/util/Size;)I
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/c2;->f(Landroid/util/Size;Landroid/util/Size;)I

    move-result p0

    return p0
.end method

.method private d(Lr/z;Landroidx/camera/camera2/internal/v1;)Landroid/util/Size;
    .locals 11

    .line 1
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    const-string v0, "MeteringRepeating"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const-string p1, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP."

    .line 2
    invoke-static {v0, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, v1, v1}, Landroid/util/Size;-><init>(II)V

    return-object p1

    .line 4
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_1

    .line 5
    const-class v2, Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/16 v2, 0x22

    .line 6
    invoke-virtual {p1, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_2

    const-string p1, "Can not get output size list."

    .line 7
    invoke-static {v0, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, v1, v1}, Landroid/util/Size;-><init>(II)V

    return-object p1

    .line 9
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/c2;->c:Lu/p;

    invoke-virtual {v0, p1}, Lu/p;->a([Landroid/util/Size;)[Landroid/util/Size;

    move-result-object p1

    .line 10
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 11
    sget-object v2, Landroidx/camera/camera2/internal/b2;->n:Landroidx/camera/camera2/internal/b2;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 12
    invoke-virtual {p2}, Landroidx/camera/camera2/internal/v1;->d()Landroid/util/Size;

    move-result-object p2

    .line 13
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    int-to-long v4, p2

    mul-long v2, v2, v4

    const-wide/32 v4, 0x4b000

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    const/4 p2, 0x0

    .line 14
    array-length v4, p1

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_5

    aget-object v6, p1, v5

    .line 15
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v7

    int-to-long v7, v7

    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v9

    int-to-long v9, v9

    mul-long v7, v7, v9

    cmp-long v9, v7, v2

    if-nez v9, :cond_3

    return-object v6

    :cond_3
    if-lez v9, :cond_4

    if-eqz p2, :cond_5

    return-object p2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    move-object p2, v6

    goto :goto_1

    .line 16
    :cond_5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method private static synthetic f(Landroid/util/Size;Landroid/util/Size;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long v2, p0

    mul-long v0, v0, v2

    .line 2
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p0

    int-to-long v2, p0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long p0, p0

    mul-long v2, v2, p0

    sub-long/2addr v0, v2

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result p0

    return p0
.end method


# virtual methods
.method b()V
    .locals 2

    const-string v0, "MeteringRepeating"

    const-string v1, "MeteringRepeating clear!"

    .line 1
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/c2;->a:Lw/r0;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lw/r0;->c()V

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/camera/camera2/internal/c2;->a:Lw/r0;

    return-void
.end method

.method c()Ljava/lang/String;
    .locals 1

    const-string v0, "MeteringRepeating"

    return-object v0
.end method

.method e()Lw/c2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/c2;->b:Lw/c2;

    return-object v0
.end method
