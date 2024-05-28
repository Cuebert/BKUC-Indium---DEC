.class public final Lw3/r8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw3/w7;

.field private b:Lw3/ca;

.field private c:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/p8;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/q8;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lw3/s7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lw3/r8;)Lw3/c1;
    .locals 0

    iget-object p0, p0, Lw3/r8;->c:Lw3/c1;

    return-object p0
.end method

.method static synthetic b(Lw3/r8;)Lw3/c1;
    .locals 0

    iget-object p0, p0, Lw3/r8;->d:Lw3/c1;

    return-object p0
.end method

.method static synthetic c(Lw3/r8;)Lw3/s7;
    .locals 0

    iget-object p0, p0, Lw3/r8;->e:Lw3/s7;

    return-object p0
.end method

.method static synthetic d(Lw3/r8;)Lw3/w7;
    .locals 0

    iget-object p0, p0, Lw3/r8;->a:Lw3/w7;

    return-object p0
.end method

.method static synthetic k(Lw3/r8;)Lw3/ca;
    .locals 0

    iget-object p0, p0, Lw3/r8;->b:Lw3/ca;

    return-object p0
.end method


# virtual methods
.method public final e(Lw3/c1;)Lw3/r8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "Lw3/p8;",
            ">;)",
            "Lw3/r8;"
        }
    .end annotation

    iput-object p1, p0, Lw3/r8;->c:Lw3/c1;

    return-object p0
.end method

.method public final f(Lw3/c1;)Lw3/r8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "Lw3/q8;",
            ">;)",
            "Lw3/r8;"
        }
    .end annotation

    iput-object p1, p0, Lw3/r8;->d:Lw3/c1;

    return-object p0
.end method

.method public final g(Lw3/s7;)Lw3/r8;
    .locals 0

    iput-object p1, p0, Lw3/r8;->e:Lw3/s7;

    return-object p0
.end method

.method public final h(Lw3/w7;)Lw3/r8;
    .locals 0

    iput-object p1, p0, Lw3/r8;->a:Lw3/w7;

    return-object p0
.end method

.method public final i(Lw3/ca;)Lw3/r8;
    .locals 0

    iput-object p1, p0, Lw3/r8;->b:Lw3/ca;

    return-object p0
.end method

.method public final j()Lw3/s8;
    .locals 2

    new-instance v0, Lw3/s8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/s8;-><init>(Lw3/r8;Lw3/o8;)V

    return-object v0
.end method
