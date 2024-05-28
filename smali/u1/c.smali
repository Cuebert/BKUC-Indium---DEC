.class public Lu1/c;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:Lo1/g;

.field private e:[Ljava/lang/String;

.field private f:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->w:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;
    .locals 1

    iget-object v0, p0, Lu1/c;->f:Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;

    return-object v0
.end method

.method public d()Lo1/g;
    .locals 1

    iget-object v0, p0, Lu1/c;->d:Lo1/g;

    return-object v0
.end method

.method public e()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu1/c;->e:[Ljava/lang/String;

    return-object v0
.end method
