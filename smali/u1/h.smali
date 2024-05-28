.class public Lu1/h;
.super Lt1/b;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/IntCallback$MessageWithCallback;


# instance fields
.field private d:Lcom/birbit/android/jobqueue/IntCallback;

.field private e:I

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lt1/g;->t:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lu1/h;->e:I

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lu1/h;->d:Lcom/birbit/android/jobqueue/IntCallback;

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lu1/h;->e:I

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/IntCallback;
    .locals 1

    iget-object v0, p0, Lu1/h;->d:Lcom/birbit/android/jobqueue/IntCallback;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu1/h;->f:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lu1/h;->e:I

    return v0
.end method

.method public setCallback(Lcom/birbit/android/jobqueue/IntCallback;)V
    .locals 0

    iput-object p1, p0, Lu1/h;->d:Lcom/birbit/android/jobqueue/IntCallback;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PublicQuery["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lu1/h;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
