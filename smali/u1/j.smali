.class public Lu1/j;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:Lcom/birbit/android/jobqueue/f;

.field private e:Ljava/lang/Object;

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->y:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/j;->d:Lcom/birbit/android/jobqueue/f;

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/f;
    .locals 1

    iget-object v0, p0, Lu1/j;->d:Lcom/birbit/android/jobqueue/f;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu1/j;->f:I

    return v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu1/j;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public f(Lcom/birbit/android/jobqueue/f;)V
    .locals 0

    iput-object p1, p0, Lu1/j;->d:Lcom/birbit/android/jobqueue/f;

    return-void
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lu1/j;->f:I

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lu1/j;->e:Ljava/lang/Object;

    return-void
.end method
