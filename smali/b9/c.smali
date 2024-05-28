.class public Lb9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb9/c$b;
    }
.end annotation


# static fields
.field public static final j:Ly8/f;


# instance fields
.field private a:J

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:I

.field private h:I

.field private i:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Ly8/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ly8/f;->o:Ly8/f;

    sput-object v0, Lb9/c;->j:Ly8/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lb9/c;->a:J

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lb9/c;->f:Z

    .line 5
    new-instance v0, Landroidx/lifecycle/r;

    invoke-direct {v0}, Landroidx/lifecycle/r;-><init>()V

    iput-object v0, p0, Lb9/c;->i:Landroidx/lifecycle/r;

    return-void
.end method

.method synthetic constructor <init>(Lb9/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb9/c;-><init>()V

    return-void
.end method

.method public static c()Lb9/c;
    .locals 1

    sget-object v0, Lb9/c$b;->a:Lb9/c;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lb9/c;->b:I

    .line 2
    iput v0, p0, Lb9/c;->g:I

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lb9/c;->e:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lb9/c;->c:Ljava/lang/String;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lb9/c;->f:Z

    const-wide/16 v0, -0x1

    .line 6
    iput-wide v0, p0, Lb9/c;->a:J

    .line 7
    sget-object v0, Lb9/c;->j:Ly8/f;

    invoke-virtual {p0, v0}, Lb9/c;->s(Ly8/f;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lb9/c;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lb9/c;->e:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lb9/c;->h:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lb9/c;->b:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lb9/c;->g:I

    return v0
.end method

.method public g()Ly8/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lb9/c;->i:Landroidx/lifecycle/r;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/f;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lb9/c;->j:Ly8/f;

    :goto_0
    return-object v0
.end method

.method public h()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ly8/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb9/c;->i:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lb9/c;->g()Ly8/f;

    move-result-object v0

    invoke-virtual {v0}, Ly8/f;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lb9/c;->a:J

    return-wide v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lb9/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lb9/c;->d:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb9/c;->i:Landroidx/lifecycle/r;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lb9/c;->j:Ly8/f;

    invoke-virtual {p0, v0}, Lb9/c;->s(Ly8/f;)V

    :cond_0
    return-void
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lb9/c;->f:Z

    return v0
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb9/c;->e:Ljava/lang/String;

    return-void
.end method

.method public o(Z)V
    .locals 0

    iput-boolean p1, p0, Lb9/c;->f:Z

    return-void
.end method

.method public p(I)V
    .locals 0

    iput p1, p0, Lb9/c;->h:I

    return-void
.end method

.method public q(I)V
    .locals 0

    iput p1, p0, Lb9/c;->b:I

    return-void
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, Lb9/c;->g:I

    return-void
.end method

.method public s(Ly8/f;)V
    .locals 1

    iget-object v0, p0, Lb9/c;->i:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->o(Ljava/lang/Object;)V

    return-void
.end method

.method public t(J)V
    .locals 0

    iput-wide p1, p0, Lb9/c;->a:J

    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb9/c;->d:Ljava/lang/String;

    return-void
.end method
