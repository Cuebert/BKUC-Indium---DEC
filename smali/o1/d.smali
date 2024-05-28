.class public Lo1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:I

.field private g:J

.field private h:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    iput-wide v0, p0, Lo1/d;->a:J

    .line 3
    iput-wide v0, p0, Lo1/d;->b:J

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lo1/d;->c:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lo1/d;->d:Ljava/lang/String;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lo1/d;->e:Z

    .line 7
    iput p1, p0, Lo1/d;->f:I

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lo1/d;->g:J

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo1/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lo1/d;->f:I

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lo1/d;->a:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lo1/d;->b:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo1/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo1/d;->h:Ljava/util/HashSet;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lo1/d;->e:Z

    return v0
.end method

.method public i(Ljava/lang/String;)Lo1/d;
    .locals 0

    iput-object p1, p0, Lo1/d;->c:Ljava/lang/String;

    return-object p0
.end method
