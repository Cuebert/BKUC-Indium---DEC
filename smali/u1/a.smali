.class public Lu1/a;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:Lcom/birbit/android/jobqueue/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->v:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/a;->d:Lcom/birbit/android/jobqueue/e;

    return-void
.end method

.method public c()Lcom/birbit/android/jobqueue/e;
    .locals 1

    iget-object v0, p0, Lu1/a;->d:Lcom/birbit/android/jobqueue/e;

    return-object v0
.end method

.method public d(Lcom/birbit/android/jobqueue/e;)V
    .locals 0

    iput-object p1, p0, Lu1/a;->d:Lcom/birbit/android/jobqueue/e;

    return-void
.end method
