.class public final Lw3/w9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
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

.method static synthetic a(Lw3/w9;)Lw3/c1;
    .locals 0

    iget-object p0, p0, Lw3/w9;->e:Lw3/c1;

    return-object p0
.end method

.method static synthetic m(Lw3/w9;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/w9;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic n(Lw3/w9;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/w9;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic o(Lw3/w9;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lw3/w9;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic p(Lw3/w9;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lw3/w9;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic q(Lw3/w9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw3/w9;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic r(Lw3/w9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw3/w9;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic s(Lw3/w9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw3/w9;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic t(Lw3/w9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw3/w9;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic u(Lw3/w9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw3/w9;->f:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)Lw3/w9;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw3/w9;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(Lw3/c1;)Lw3/w9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "Ljava/lang/String;",
            ">;)",
            "Lw3/w9;"
        }
    .end annotation

    iput-object p1, p0, Lw3/w9;->e:Lw3/c1;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/String;)Lw3/w9;
    .locals 0

    iput-object p1, p0, Lw3/w9;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final l()Lw3/x9;
    .locals 2

    new-instance v0, Lw3/x9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/x9;-><init>(Lw3/w9;Lw3/v9;)V

    return-object v0
.end method
