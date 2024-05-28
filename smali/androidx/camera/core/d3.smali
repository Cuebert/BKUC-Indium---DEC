.class public final Landroidx/camera/core/d3;
.super Landroidx/camera/core/y2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/d3$b;,
        Landroidx/camera/core/d3$c;,
        Landroidx/camera/core/d3$d;,
        Landroidx/camera/core/d3$e;
    }
.end annotation


# static fields
.field public static final J:Landroidx/camera/core/d3$d;

.field private static final K:[I


# instance fields
.field private volatile A:I

.field private volatile B:Z

.field private C:I

.field private D:I

.field private E:I

.field private F:Lw/r0;

.field private final G:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private H:Landroidx/camera/core/d3$e;

.field private I:Ljava/lang/Throwable;

.field private final l:Ljava/lang/Object;

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private o:Landroid/os/HandlerThread;

.field private p:Landroid/os/Handler;

.field private q:Landroid/os/HandlerThread;

.field private r:Landroid/os/Handler;

.field s:Landroid/media/MediaCodec;

.field private t:Landroid/media/MediaCodec;

.field private u:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lw/c2$b;

.field private w:I

.field private x:I

.field y:Landroid/view/Surface;

.field private volatile z:Landroid/media/AudioRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/d3$d;

    invoke-direct {v0}, Landroidx/camera/core/d3$d;-><init>()V

    sput-object v0, Landroidx/camera/core/d3;->J:Landroidx/camera/core/d3$d;

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 2
    fill-array-data v0, :array_0

    sput-object v0, Landroidx/camera/core/d3;->K:[I

    return-void

    :array_0
    .array-data 4
        0x8
        0x6
        0x5
        0x4
    .end array-data
.end method

.method public static synthetic K(ZLandroid/media/MediaCodec;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/d3;->R(ZLandroid/media/MediaCodec;)V

    return-void
.end method

.method public static synthetic L(Landroidx/camera/core/d3;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/d3;->S()V

    return-void
.end method

.method public static synthetic M(Landroidx/camera/core/d3;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/d3;->Q()V

    return-void
.end method

.method private N(Lw/q2;)Landroid/media/AudioRecord;
    .locals 11

    const-string v0, "VideoCapture"

    .line 1
    iget v1, p0, Landroidx/camera/core/d3;->C:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/16 v1, 0x10

    goto :goto_0

    :cond_0
    const/16 v1, 0xc

    .line 2
    :goto_0
    :try_start_0
    iget v3, p0, Landroidx/camera/core/d3;->D:I

    const/4 v9, 0x2

    .line 3
    invoke-static {v3, v1, v9}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v3

    if-gtz v3, :cond_1

    .line 4
    invoke-virtual {p1}, Lw/q2;->J()I

    move-result v3

    :cond_1
    move p1, v3

    .line 5
    new-instance v10, Landroid/media/AudioRecord;

    const/4 v4, 0x5

    iget v5, p0, Landroidx/camera/core/d3;->D:I

    const/4 v7, 0x2

    mul-int/lit8 v8, p1, 0x2

    move-object v3, v10

    move v6, v1

    invoke-direct/range {v3 .. v8}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 6
    invoke-virtual {v10}, Landroid/media/AudioRecord;->getState()I

    move-result v3

    if-ne v3, v2, :cond_2

    .line 7
    iput p1, p0, Landroidx/camera/core/d3;->A:I

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "source: 5 audioSampleRate: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Landroidx/camera/core/d3;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " channelConfig: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " audioFormat: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bufferSize: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v10

    :catch_0
    move-exception p1

    const-string v1, "Exception, keep trying."

    .line 9
    invoke-static {v0, v1, p1}, Landroidx/camera/core/q1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private O()Landroid/media/MediaFormat;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/camera/core/d3;->D:I

    iget v1, p0, Landroidx/camera/core/d3;->C:I

    const-string v2, "audio/mp4a-latm"

    .line 2
    invoke-static {v2, v0, v1}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    const-string v1, "aac-profile"

    const/4 v2, 0x2

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 4
    iget v1, p0, Landroidx/camera/core/d3;->E:I

    const-string v2, "bitrate"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object v0
.end method

.method private static P(Lw/q2;Landroid/util/Size;)Landroid/media/MediaFormat;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const-string v1, "video/avc"

    .line 2
    invoke-static {v1, v0, p1}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p1

    const-string v0, "color-format"

    const v1, 0x7f000789

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 4
    invoke-virtual {p0}, Lw/q2;->L()I

    move-result v0

    const-string v1, "bitrate"

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 5
    invoke-virtual {p0}, Lw/q2;->N()I

    move-result v0

    const-string v1, "frame-rate"

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 6
    invoke-virtual {p0}, Lw/q2;->M()I

    move-result p0

    const-string v0, "i-frame-interval"

    invoke-virtual {p1, v0, p0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object p1
.end method

.method private synthetic Q()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/d3;->V()V

    return-void
.end method

.method private static synthetic R(ZLandroid/media/MediaCodec;)V
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaCodec;->release()V

    :cond_0
    return-void
.end method

.method private synthetic S()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/d3;->Y()V

    return-void
.end method

.method private T()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/d3;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 2
    iget-object v0, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 4
    iput-object v1, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    .line 7
    iput-object v1, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    :cond_1
    return-void
.end method

.method private U(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    .line 3
    invoke-virtual {v0}, Lw/r0;->c()V

    .line 4
    iget-object v0, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    invoke-virtual {v0}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v0

    new-instance v2, Landroidx/camera/core/c3;

    invoke-direct {v2, p1, v1}, Landroidx/camera/core/c3;-><init>(ZLandroid/media/MediaCodec;)V

    .line 5
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    .line 6
    invoke-interface {v0, v2, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 7
    iput-object v0, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    .line 8
    :cond_1
    iput-object v0, p0, Landroidx/camera/core/d3;->y:Landroid/view/Surface;

    .line 9
    iput-object v0, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    return-void
.end method

.method private V()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/d3;->o:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 2
    invoke-direct {p0}, Landroidx/camera/core/d3;->T()V

    .line 3
    iget-object v0, p0, Landroidx/camera/core/d3;->y:Landroid/view/Surface;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0}, Landroidx/camera/core/d3;->U(Z)V

    :cond_0
    return-void
.end method

.method private W(Landroid/util/Size;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Landroidx/camera/core/d3;->K:[I

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5, v4}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5, v4}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object v4

    .line 4
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v5

    iget v6, v4, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    if-ne v5, v6, :cond_0

    .line 5
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v5

    iget v6, v4, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    if-ne v5, v6, :cond_0

    .line 6
    iget p1, v4, Landroid/media/CamcorderProfile;->audioChannels:I

    iput p1, p0, Landroidx/camera/core/d3;->C:I

    .line 7
    iget p1, v4, Landroid/media/CamcorderProfile;->audioSampleRate:I

    iput p1, p0, Landroidx/camera/core/d3;->D:I

    .line 8
    iget p1, v4, Landroid/media/CamcorderProfile;->audioBitRate:I

    iput p1, p0, Landroidx/camera/core/d3;->E:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    const-string p1, "VideoCapture"

    const-string p2, "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings."

    .line 9
    invoke-static {p1, p2}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object p1

    check-cast p1, Lw/q2;

    .line 11
    invoke-virtual {p1}, Lw/q2;->I()I

    move-result p2

    iput p2, p0, Landroidx/camera/core/d3;->C:I

    .line 12
    invoke-virtual {p1}, Lw/q2;->K()I

    move-result p2

    iput p2, p0, Landroidx/camera/core/d3;->D:I

    .line 13
    invoke-virtual {p1}, Lw/q2;->H()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/d3;->E:I

    :cond_2
    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/d3;->Y()V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/d3;->u:Lcom/google/common/util/concurrent/m;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Landroidx/camera/core/b3;

    invoke-direct {v1, p0}, Landroidx/camera/core/b3;-><init>(Landroidx/camera/core/d3;)V

    .line 4
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    .line 5
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Landroidx/camera/core/d3;->V()V

    :goto_0
    return-void
.end method

.method public D()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/d3;->Y()V

    return-void
.end method

.method protected E(Landroid/util/Size;)Landroid/util/Size;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/d3;->y:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 3
    iget-object v0, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 4
    iget-object v0, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 5
    iget-object v0, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Landroidx/camera/core/d3;->U(Z)V

    :cond_0
    :try_start_0
    const-string v0, "video/avc"

    .line 7
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    const-string v0, "audio/mp4a-latm"

    .line 8
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/y2;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/d3;->X(Ljava/lang/String;Landroid/util/Size;)V

    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/y2;->r()V

    return-object p1

    :catch_0
    move-exception p1

    .line 11
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to create MediaCodec due to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method X(Ljava/lang/String;Landroid/util/Size;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/y2;->g()Lw/o2;

    move-result-object v0

    check-cast v0, Lw/q2;

    .line 2
    iget-object v1, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->reset()V

    .line 3
    sget-object v1, Landroidx/camera/core/d3$e;->n:Landroidx/camera/core/d3$e;

    iput-object v1, p0, Landroidx/camera/core/d3;->H:Landroidx/camera/core/d3$e;

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    .line 5
    invoke-static {v0, p2}, Landroidx/camera/core/d3;->P(Lw/q2;Landroid/util/Size;)Landroid/media/MediaFormat;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 6
    invoke-virtual {v1, v2, v4, v4, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    iget-object v1, p0, Landroidx/camera/core/d3;->y:Landroid/view/Surface;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 8
    invoke-direct {p0, v2}, Landroidx/camera/core/d3;->U(Z)V

    .line 9
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/d3;->s:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v1

    .line 10
    iput-object v1, p0, Landroidx/camera/core/d3;->y:Landroid/view/Surface;

    .line 11
    invoke-static {v0}, Lw/c2$b;->o(Lw/o2;)Lw/c2$b;

    move-result-object v5

    iput-object v5, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    .line 12
    iget-object v5, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    if-eqz v5, :cond_1

    .line 13
    invoke-virtual {v5}, Lw/r0;->c()V

    .line 14
    :cond_1
    new-instance v5, Lw/i1;

    iget-object v6, p0, Landroidx/camera/core/d3;->y:Landroid/view/Surface;

    invoke-virtual {p0}, Landroidx/camera/core/y2;->i()I

    move-result v7

    invoke-direct {v5, v6, p2, v7}, Lw/i1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v5, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    .line 15
    invoke-virtual {v5}, Lw/r0;->i()Lcom/google/common/util/concurrent/m;

    move-result-object v5

    .line 16
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Landroidx/camera/core/z2;

    invoke-direct {v6, v1}, Landroidx/camera/core/z2;-><init>(Landroid/view/Surface;)V

    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    .line 17
    invoke-interface {v5, v6, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 18
    iget-object v1, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    iget-object v5, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    invoke-virtual {v1, v5}, Lw/c2$b;->h(Lw/r0;)V

    .line 19
    iget-object v1, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    new-instance v5, Landroidx/camera/core/d3$a;

    invoke-direct {v5, p0, p1, p2}, Landroidx/camera/core/d3$a;-><init>(Landroidx/camera/core/d3;Ljava/lang/String;Landroid/util/Size;)V

    invoke-virtual {v1, v5}, Lw/c2$b;->f(Lw/c2$c;)V

    .line 20
    iget-object v1, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    invoke-virtual {v1}, Lw/c2$b;->m()Lw/c2;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    .line 21
    iget-object v1, p0, Landroidx/camera/core/d3;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 22
    invoke-direct {p0, p2, p1}, Landroidx/camera/core/d3;->W(Landroid/util/Size;Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->reset()V

    .line 24
    iget-object p1, p0, Landroidx/camera/core/d3;->t:Landroid/media/MediaCodec;

    .line 25
    invoke-direct {p0}, Landroidx/camera/core/d3;->O()Landroid/media/MediaFormat;

    move-result-object p2

    .line 26
    invoke-virtual {p1, p2, v4, v4, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 27
    iget-object p1, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    if-eqz p1, :cond_2

    .line 28
    iget-object p1, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    invoke-virtual {p1}, Landroid/media/AudioRecord;->release()V

    .line 29
    :cond_2
    invoke-direct {p0, v0}, Landroidx/camera/core/d3;->N(Lw/q2;)Landroid/media/AudioRecord;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    .line 30
    iget-object p1, p0, Landroidx/camera/core/d3;->z:Landroid/media/AudioRecord;

    if-nez p1, :cond_3

    const-string p1, "VideoCapture"

    const-string p2, "AudioRecord object cannot initialized correctly!"

    .line 31
    invoke-static {p1, p2}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Landroidx/camera/core/d3;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 33
    :cond_3
    iget-object p1, p0, Landroidx/camera/core/d3;->l:Ljava/lang/Object;

    monitor-enter p1

    const/4 p2, -0x1

    .line 34
    :try_start_1
    iput p2, p0, Landroidx/camera/core/d3;->w:I

    .line 35
    iput p2, p0, Landroidx/camera/core/d3;->x:I

    .line 36
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    iput-boolean v2, p0, Landroidx/camera/core/d3;->B:Z

    return-void

    :catchall_0
    move-exception p2

    .line 38
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 39
    :goto_0
    sget-object p2, Landroidx/camera/core/d3$e;->o:Landroidx/camera/core/d3$e;

    iput-object p2, p0, Landroidx/camera/core/d3;->H:Landroidx/camera/core/d3$e;

    .line 40
    iput-object p1, p0, Landroidx/camera/core/d3;->I:Ljava/lang/Throwable;

    return-void

    :catch_2
    move-exception p1

    .line 41
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_5

    .line 42
    invoke-static {p1}, Landroidx/camera/core/d3$b;->a(Landroid/media/MediaCodec$CodecException;)I

    move-result p2

    .line 43
    invoke-virtual {p1}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x44c

    if-ne p2, v1, :cond_4

    const-string v1, "VideoCapture"

    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CodecException: code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " diagnostic: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    sget-object p2, Landroidx/camera/core/d3$e;->p:Landroidx/camera/core/d3$e;

    iput-object p2, p0, Landroidx/camera/core/d3;->H:Landroidx/camera/core/d3$e;

    goto :goto_1

    :cond_4
    const/16 v1, 0x44d

    if-ne p2, v1, :cond_6

    const-string v1, "VideoCapture"

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CodecException: code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " diagnostic: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    sget-object p2, Landroidx/camera/core/d3$e;->q:Landroidx/camera/core/d3$e;

    iput-object p2, p0, Landroidx/camera/core/d3;->H:Landroidx/camera/core/d3$e;

    goto :goto_1

    .line 48
    :cond_5
    sget-object p2, Landroidx/camera/core/d3$e;->o:Landroidx/camera/core/d3$e;

    iput-object p2, p0, Landroidx/camera/core/d3;->H:Landroidx/camera/core/d3$e;

    .line 49
    :cond_6
    :goto_1
    iput-object p1, p0, Landroidx/camera/core/d3;->I:Ljava/lang/Throwable;

    return-void
.end method

.method public Y()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 2
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Landroidx/camera/core/a3;

    invoke-direct {v1, p0}, Landroidx/camera/core/a3;-><init>(Landroidx/camera/core/d3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string v0, "VideoCapture"

    const-string v1, "stopRecording"

    .line 3
    invoke-static {v0, v1}, Landroidx/camera/core/q1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    invoke-virtual {v0}, Lw/c2$b;->n()V

    .line 5
    iget-object v0, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    iget-object v1, p0, Landroidx/camera/core/d3;->F:Lw/r0;

    invoke-virtual {v0, v1}, Lw/c2$b;->h(Lw/r0;)V

    .line 6
    iget-object v0, p0, Landroidx/camera/core/d3;->v:Lw/c2$b;

    invoke-virtual {v0}, Lw/c2$b;->m()Lw/c2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/y2;->I(Lw/c2;)V

    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/y2;->v()V

    .line 8
    iget-boolean v0, p0, Landroidx/camera/core/d3;->B:Z

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Landroidx/camera/core/d3;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 10
    iget-object v0, p0, Landroidx/camera/core/d3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/camera/core/d3;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public h(ZLw/p2;)Lw/o2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/p2;",
            ")",
            "Lw/o2<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw/p2$b;->q:Lw/p2$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Lw/p2;->a(Lw/p2$b;I)Lw/o0;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Landroidx/camera/core/d3;->J:Landroidx/camera/core/d3$d;

    invoke-virtual {p1}, Landroidx/camera/core/d3$d;->a()Lw/q2;

    move-result-object p1

    invoke-static {p2, p1}, Lw/n0;->b(Lw/o0;Lw/o0;)Lw/o0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/d3;->n(Lw/o0;)Lw/o2$a;

    move-result-object p1

    invoke-interface {p1}, Lw/o2$a;->b()Lw/o2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public n(Lw/o0;)Lw/o2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o0;",
            ")",
            "Lw/o2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/d3$c;->c(Lw/o0;)Landroidx/camera/core/d3$c;

    move-result-object p1

    return-object p1
.end method

.method public x()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CameraX-video encoding thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Landroidx/camera/core/d3;->o:Landroid/os/HandlerThread;

    .line 2
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CameraX-audio encoding thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Landroidx/camera/core/d3;->q:Landroid/os/HandlerThread;

    .line 3
    iget-object v0, p0, Landroidx/camera/core/d3;->o:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 4
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Landroidx/camera/core/d3;->o:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/camera/core/d3;->p:Landroid/os/Handler;

    .line 5
    iget-object v0, p0, Landroidx/camera/core/d3;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 6
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Landroidx/camera/core/d3;->q:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/camera/core/d3;->r:Landroid/os/Handler;

    return-void
.end method
