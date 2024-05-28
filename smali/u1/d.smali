.class public Lu1/d;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field d:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

.field e:Lcom/birbit/android/jobqueue/CancelResult;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->q:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lu1/d;->e:Lcom/birbit/android/jobqueue/CancelResult;

    .line 2
    iput-object v0, p0, Lu1/d;->d:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;
    .locals 1

    iget-object v0, p0, Lu1/d;->d:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    return-object v0
.end method

.method public d()Lcom/birbit/android/jobqueue/CancelResult;
    .locals 1

    iget-object v0, p0, Lu1/d;->e:Lcom/birbit/android/jobqueue/CancelResult;

    return-object v0
.end method

.method public e(Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;Lcom/birbit/android/jobqueue/CancelResult;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/d;->d:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    .line 2
    iput-object p2, p0, Lu1/d;->e:Lcom/birbit/android/jobqueue/CancelResult;

    return-void
.end method
