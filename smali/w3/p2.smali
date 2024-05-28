.class public final Lw3/p2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw3/c8;

.field private b:Ljava/lang/Boolean;

.field private c:Lw3/ca;

.field private d:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/p8;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/q8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lw3/p2;)Lw3/c1;
    .locals 0

    iget-object p0, p0, Lw3/p2;->d:Lw3/c1;

    return-object p0
.end method

.method static synthetic b(Lw3/p2;)Lw3/c1;
    .locals 0

    iget-object p0, p0, Lw3/p2;->e:Lw3/c1;

    return-object p0
.end method

.method static synthetic i(Lw3/p2;)Lw3/c8;
    .locals 0

    iget-object p0, p0, Lw3/p2;->a:Lw3/c8;

    return-object p0
.end method

.method static synthetic j(Lw3/p2;)Lw3/ca;
    .locals 0

    iget-object p0, p0, Lw3/p2;->c:Lw3/ca;

    return-object p0
.end method

.method static synthetic k(Lw3/p2;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/p2;->b:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final c(Lw3/c1;)Lw3/p2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "Lw3/p8;",
            ">;)",
            "Lw3/p2;"
        }
    .end annotation

    iput-object p1, p0, Lw3/p2;->d:Lw3/c1;

    return-object p0
.end method

.method public final d(Lw3/c1;)Lw3/p2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "Lw3/q8;",
            ">;)",
            "Lw3/p2;"
        }
    .end annotation

    iput-object p1, p0, Lw3/p2;->e:Lw3/c1;

    return-object p0
.end method

.method public final e(Lw3/c8;)Lw3/p2;
    .locals 0

    iput-object p1, p0, Lw3/p2;->a:Lw3/c8;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)Lw3/p2;
    .locals 0

    iput-object p1, p0, Lw3/p2;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Lw3/ca;)Lw3/p2;
    .locals 0

    iput-object p1, p0, Lw3/p2;->c:Lw3/ca;

    return-object p0
.end method

.method public final h()Lw3/q2;
    .locals 2

    new-instance v0, Lw3/q2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/q2;-><init>(Lw3/p2;Lw3/n2;)V

    return-object v0
.end method
