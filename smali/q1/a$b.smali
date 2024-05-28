.class public final Lq1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lq1/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lq1/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq1/a;-><init>(Lq1/a$a;)V

    iput-object v0, p0, Lq1/a$b;->a:Lq1/a;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v0, Lq1/a;->f:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lq1/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iget-object v1, v0, Lq1/a;->g:Lcom/birbit/android/jobqueue/QueueFactory;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lo1/b;

    invoke-direct {v1}, Lo1/b;-><init>()V

    iput-object v1, v0, Lq1/a;->g:Lcom/birbit/android/jobqueue/QueueFactory;

    .line 3
    :cond_0
    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iget-object v1, v0, Lq1/a;->i:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Lcom/birbit/android/jobqueue/network/a;

    iget-object v2, v0, Lq1/a;->f:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/birbit/android/jobqueue/network/a;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lq1/a;->i:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    .line 5
    :cond_1
    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iget-object v1, v0, Lq1/a;->k:Lcom/birbit/android/jobqueue/timer/Timer;

    if-nez v1, :cond_2

    .line 6
    new-instance v1, Lw1/a;

    invoke-direct {v1}, Lw1/a;-><init>()V

    iput-object v1, v0, Lq1/a;->k:Lcom/birbit/android/jobqueue/timer/Timer;

    .line 7
    :cond_2
    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    return-object v0
.end method

.method public b(I)Lq1/a$b;
    .locals 1

    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iput p1, v0, Lq1/a;->d:I

    return-object p0
.end method

.method public c(Lcom/birbit/android/jobqueue/log/CustomLogger;)Lq1/a$b;
    .locals 1

    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iput-object p1, v0, Lq1/a;->j:Lcom/birbit/android/jobqueue/log/CustomLogger;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lq1/a$b;
    .locals 1

    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iput-object p1, v0, Lq1/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public e(I)Lq1/a$b;
    .locals 1

    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iput p1, v0, Lq1/a;->e:I

    return-object p0
.end method

.method public f(I)Lq1/a$b;
    .locals 1

    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iput p1, v0, Lq1/a;->b:I

    return-object p0
.end method

.method public g(I)Lq1/a$b;
    .locals 1

    iget-object v0, p0, Lq1/a$b;->a:Lq1/a;

    iput p1, v0, Lq1/a;->c:I

    return-object p0
.end method
