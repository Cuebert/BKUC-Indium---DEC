.class public final Lw3/q7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw3/r7;

.field private b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic c(Lw3/q7;)Lw3/r7;
    .locals 0

    iget-object p0, p0, Lw3/q7;->a:Lw3/r7;

    return-object p0
.end method

.method static synthetic e(Lw3/q7;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lw3/q7;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Lw3/r7;)Lw3/q7;
    .locals 0

    iput-object p1, p0, Lw3/q7;->a:Lw3/r7;

    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)Lw3/q7;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw3/q7;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d()Lw3/s7;
    .locals 2

    new-instance v0, Lw3/s7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/s7;-><init>(Lw3/q7;Lw3/p7;)V

    return-object v0
.end method
