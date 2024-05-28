.class public final Lw3/l7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/Long;

.field private c:Ljava/lang/Long;

.field private d:Ljava/lang/Long;

.field private e:Ljava/lang/Long;

.field private f:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic h(Lw3/l7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/l7;->a:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic i(Lw3/l7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/l7;->b:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic j(Lw3/l7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/l7;->c:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic k(Lw3/l7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/l7;->d:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic l(Lw3/l7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/l7;->e:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic m(Lw3/l7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/l7;->f:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lw3/l7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/l7;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public final b(Ljava/lang/Long;)Lw3/l7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/l7;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public final c(Ljava/lang/Long;)Lw3/l7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/l7;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final d(Ljava/lang/Long;)Lw3/l7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/l7;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public final e(Ljava/lang/Long;)Lw3/l7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/l7;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public final f(Ljava/lang/Long;)Lw3/l7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/l7;->f:Ljava/lang/Long;

    return-object p0
.end method

.method public final g()Lw3/m7;
    .locals 2

    new-instance v0, Lw3/m7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/m7;-><init>(Lw3/l7;Lw3/k7;)V

    return-object v0
.end method
