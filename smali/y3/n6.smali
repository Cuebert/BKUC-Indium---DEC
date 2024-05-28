.class public final Ly3/n6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ly3/z7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly3/z7<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Boolean;

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/Boolean;

.field private j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ly3/n6;)Ly3/z7;
    .locals 0

    iget-object p0, p0, Ly3/n6;->e:Ly3/z7;

    return-object p0
.end method

.method static synthetic m(Ly3/n6;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Ly3/n6;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic n(Ly3/n6;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Ly3/n6;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic o(Ly3/n6;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Ly3/n6;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic p(Ly3/n6;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Ly3/n6;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic q(Ly3/n6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly3/n6;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic r(Ly3/n6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly3/n6;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic s(Ly3/n6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly3/n6;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic t(Ly3/n6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly3/n6;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic u(Ly3/n6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly3/n6;->f:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)Ly3/n6;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ly3/n6;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(Ly3/z7;)Ly3/n6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/z7<",
            "Ljava/lang/String;",
            ">;)",
            "Ly3/n6;"
        }
    .end annotation

    iput-object p1, p0, Ly3/n6;->e:Ly3/z7;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/String;)Ly3/n6;
    .locals 0

    iput-object p1, p0, Ly3/n6;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final l()Ly3/o6;
    .locals 2

    new-instance v0, Ly3/o6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly3/o6;-><init>(Ly3/n6;Ly3/m6;)V

    return-object v0
.end method
