.class public Lu1/b;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:I

.field private e:I

.field private f:Z

.field private g:Lcom/birbit/android/jobqueue/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->p:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/b;->g:Lcom/birbit/android/jobqueue/e;

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/e;
    .locals 1

    iget-object v0, p0, Lu1/b;->g:Lcom/birbit/android/jobqueue/e;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu1/b;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lu1/b;->d:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lu1/b;->f:Z

    return v0
.end method

.method public g(Lcom/birbit/android/jobqueue/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/b;->d:I

    .line 2
    iput-object p1, p0, Lu1/b;->g:Lcom/birbit/android/jobqueue/e;

    return-void
.end method

.method public h(Lcom/birbit/android/jobqueue/e;II)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/b;->d:I

    .line 2
    iput p3, p0, Lu1/b;->e:I

    .line 3
    iput-object p1, p0, Lu1/b;->g:Lcom/birbit/android/jobqueue/e;

    return-void
.end method

.method public i(Lcom/birbit/android/jobqueue/e;IZ)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/b;->d:I

    .line 2
    iput-boolean p3, p0, Lu1/b;->f:Z

    .line 3
    iput-object p1, p0, Lu1/b;->g:Lcom/birbit/android/jobqueue/e;

    return-void
.end method
