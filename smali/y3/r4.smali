.class public final Ly3/r4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ly3/s4;

.field private c:Ly3/m4;

.field private d:Ljava/lang/Integer;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Integer;

.field private g:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ly3/r4;)Ly3/m4;
    .locals 0

    iget-object p0, p0, Ly3/r4;->c:Ly3/m4;

    return-object p0
.end method

.method static synthetic i(Ly3/r4;)Ly3/s4;
    .locals 0

    iget-object p0, p0, Ly3/r4;->b:Ly3/s4;

    return-object p0
.end method

.method static synthetic k(Ly3/r4;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Ly3/r4;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic l(Ly3/r4;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Ly3/r4;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic m(Ly3/r4;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Ly3/r4;->f:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic n(Ly3/r4;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Ly3/r4;->g:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic o(Ly3/r4;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Ly3/r4;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Long;)Ly3/r4;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ly3/r4;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final c(Ljava/lang/Integer;)Ly3/r4;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ly3/r4;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d(Ly3/m4;)Ly3/r4;
    .locals 0

    iput-object p1, p0, Ly3/r4;->c:Ly3/m4;

    return-object p0
.end method

.method public final e(Ljava/lang/Integer;)Ly3/r4;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ly3/r4;->f:Ljava/lang/Integer;

    return-object p0
.end method

.method public final f(Ly3/s4;)Ly3/r4;
    .locals 0

    iput-object p1, p0, Ly3/r4;->b:Ly3/s4;

    return-object p0
.end method

.method public final g(Ljava/lang/Integer;)Ly3/r4;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ly3/r4;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public final h(Ljava/lang/Integer;)Ly3/r4;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ly3/r4;->g:Ljava/lang/Integer;

    return-object p0
.end method

.method public final j()Ly3/t4;
    .locals 2

    new-instance v0, Ly3/t4;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly3/t4;-><init>(Ly3/r4;Ly3/q4;)V

    return-object v0
.end method
