.class public Lu1/i;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:Lcom/birbit/android/jobqueue/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->r:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/i;->d:Lcom/birbit/android/jobqueue/f;

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/f;
    .locals 1

    iget-object v0, p0, Lu1/i;->d:Lcom/birbit/android/jobqueue/f;

    return-object v0
.end method

.method public d(Lcom/birbit/android/jobqueue/f;)V
    .locals 0

    iput-object p1, p0, Lu1/i;->d:Lcom/birbit/android/jobqueue/f;

    return-void
.end method
