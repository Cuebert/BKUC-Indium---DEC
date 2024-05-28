.class public final Lw3/v7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Lw3/c8;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic g(Lw3/v7;)Lw3/c8;
    .locals 0

    iget-object p0, p0, Lw3/v7;->b:Lw3/c8;

    return-object p0
.end method

.method static synthetic h(Lw3/v7;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/v7;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic i(Lw3/v7;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/v7;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic j(Lw3/v7;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/v7;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic k(Lw3/v7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lw3/v7;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lw3/v7;
    .locals 0

    iput-object p1, p0, Lw3/v7;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(Ljava/lang/Boolean;)Lw3/v7;
    .locals 0

    iput-object p1, p0, Lw3/v7;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Ljava/lang/Long;)Lw3/v7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/v7;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final d(Lw3/c8;)Lw3/v7;
    .locals 0

    iput-object p1, p0, Lw3/v7;->b:Lw3/c8;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)Lw3/v7;
    .locals 0

    iput-object p1, p0, Lw3/v7;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f()Lw3/w7;
    .locals 2

    new-instance v0, Lw3/w7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/w7;-><init>(Lw3/v7;Lw3/u7;)V

    return-object v0
.end method
