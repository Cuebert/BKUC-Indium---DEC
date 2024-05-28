.class public Ly3/u6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ly3/u6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Ljava/lang/String;

.field private o:I

.field private p:D

.field private q:J

.field private r:J

.field private s:J

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ly3/u6;->u:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x7fffffff

    iput-wide v0, p0, Ly3/u6;->s:J

    const-wide/32 v0, -0x80000000

    iput-wide v0, p0, Ly3/u6;->t:J

    iput-object p1, p0, Ly3/u6;->n:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ly3/s6;)V
    .locals 0

    const-string p1, "unusedTag"

    .line 1
    invoke-direct {p0, p1}, Ly3/u6;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final b()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ly3/u6;->o:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ly3/u6;->p:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ly3/u6;->q:J

    const-wide/32 v0, 0x7fffffff

    iput-wide v0, p0, Ly3/u6;->s:J

    const-wide/32 v0, -0x80000000

    iput-wide v0, p0, Ly3/u6;->t:J

    return-void
.end method

.method public static l()J
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static z(Ljava/lang/String;)Ly3/u6;
    .locals 2

    .line 1
    invoke-static {}, Ly3/t7;->a()Ly3/t7;

    invoke-static {}, Ly3/t7;->b()Z

    move-result p0

    if-nez p0, :cond_0

    .line 2
    invoke-static {}, Ly3/t6;->O()Ly3/t6;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "detectorTaskWithResource#run"

    sget-object v0, Ly3/u6;->u:Ljava/util/Map;

    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ly3/u6;

    .line 4
    invoke-direct {v1, p0}, Ly3/u6;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/u6;

    return-object p0
.end method


# virtual methods
.method public c()Ly3/u6;
    .locals 2

    invoke-static {}, Ly3/u6;->l()J

    move-result-wide v0

    iput-wide v0, p0, Ly3/u6;->q:J

    return-object p0
.end method

.method public close()V
    .locals 5

    iget-wide v0, p0, Ly3/u6;->q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1
    invoke-virtual {p0, v0, v1}, Ly3/u6;->i(J)V

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did you forget to call start()?"

    .line 3
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(J)V
    .locals 7

    .line 1
    invoke-static {}, Ly3/u6;->l()J

    move-result-wide v0

    iget-wide v2, p0, Ly3/u6;->r:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    sub-long v2, v0, v2

    const-wide/32 v4, 0xf4240

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    .line 2
    invoke-direct {p0}, Ly3/u6;->b()V

    :cond_0
    iput-wide v0, p0, Ly3/u6;->r:J

    iget v0, p0, Ly3/u6;->o:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ly3/u6;->o:I

    iget-wide v2, p0, Ly3/u6;->p:D

    long-to-double v4, p1

    add-double/2addr v2, v4

    iput-wide v2, p0, Ly3/u6;->p:D

    iget-wide v2, p0, Ly3/u6;->s:J

    .line 3
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Ly3/u6;->s:J

    iget-wide v2, p0, Ly3/u6;->t:J

    .line 4
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Ly3/u6;->t:J

    iget v0, p0, Ly3/u6;->o:I

    rem-int/lit8 v0, v0, 0x32

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ly3/u6;->n:Ljava/lang/String;

    aput-object v4, v2, v3

    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v2, v1

    const/4 p1, 0x2

    iget p2, p0, Ly3/u6;->o:I

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x3

    iget-wide v3, p0, Ly3/u6;->s:J

    .line 7
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x4

    iget-wide v3, p0, Ly3/u6;->t:J

    .line 8
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x5

    iget-wide v3, p0, Ly3/u6;->p:D

    iget p2, p0, Ly3/u6;->o:I

    int-to-double v5, p2

    div-double/2addr v3, v5

    double-to-int p2, v3

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const-string p1, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus"

    .line 10
    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    invoke-static {}, Ly3/t7;->a()Ly3/t7;

    :cond_1
    iget p1, p0, Ly3/u6;->o:I

    rem-int/lit16 p1, p1, 0x1f4

    if-nez p1, :cond_2

    .line 12
    invoke-direct {p0}, Ly3/u6;->b()V

    :cond_2
    return-void
.end method

.method public i(J)V
    .locals 2

    invoke-static {}, Ly3/u6;->l()J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-virtual {p0, v0, v1}, Ly3/u6;->e(J)V

    return-void
.end method
