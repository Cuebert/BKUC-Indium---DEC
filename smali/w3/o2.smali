.class public final Lw3/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw3/q2;

.field private b:Ljava/lang/Integer;

.field private c:Lw3/m7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d(Lw3/o2;)Lw3/q2;
    .locals 0

    iget-object p0, p0, Lw3/o2;->a:Lw3/q2;

    return-object p0
.end method

.method static synthetic f(Lw3/o2;)Lw3/m7;
    .locals 0

    iget-object p0, p0, Lw3/o2;->c:Lw3/m7;

    return-object p0
.end method

.method static synthetic g(Lw3/o2;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lw3/o2;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Lw3/o2;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw3/o2;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(Lw3/m7;)Lw3/o2;
    .locals 0

    iput-object p1, p0, Lw3/o2;->c:Lw3/m7;

    return-object p0
.end method

.method public final c(Lw3/q2;)Lw3/o2;
    .locals 0

    iput-object p1, p0, Lw3/o2;->a:Lw3/q2;

    return-object p0
.end method

.method public final e()Lw3/r2;
    .locals 2

    new-instance v0, Lw3/r2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/r2;-><init>(Lw3/o2;Lw3/n2;)V

    return-object v0
.end method
