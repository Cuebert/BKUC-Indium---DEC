.class public Lq1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq1/a$b;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:Landroid/content/Context;

.field g:Lcom/birbit/android/jobqueue/QueueFactory;

.field h:Lcom/birbit/android/jobqueue/di/DependencyInjector;

.field i:Lcom/birbit/android/jobqueue/network/NetworkUtil;

.field j:Lcom/birbit/android/jobqueue/log/CustomLogger;

.field k:Lcom/birbit/android/jobqueue/timer/Timer;

.field l:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

.field m:Z

.field n:Z

.field o:I

.field p:Z


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "default_job_manager"

    .line 3
    iput-object v0, p0, Lq1/a;->a:Ljava/lang/String;

    const/4 v0, 0x5

    .line 4
    iput v0, p0, Lq1/a;->b:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lq1/a;->c:I

    const/16 v2, 0xf

    .line 6
    iput v2, p0, Lq1/a;->d:I

    const/4 v2, 0x3

    .line 7
    iput v2, p0, Lq1/a;->e:I

    .line 8
    iput-boolean v1, p0, Lq1/a;->m:Z

    .line 9
    iput-boolean v1, p0, Lq1/a;->n:Z

    .line 10
    iput v0, p0, Lq1/a;->o:I

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lq1/a;->p:Z

    return-void
.end method

.method synthetic constructor <init>(Lq1/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lq1/a;->p:Z

    return v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lq1/a;->f:Landroid/content/Context;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lq1/a;->d:I

    return v0
.end method

.method public d()Lcom/birbit/android/jobqueue/log/CustomLogger;
    .locals 1

    iget-object v0, p0, Lq1/a;->j:Lcom/birbit/android/jobqueue/log/CustomLogger;

    return-object v0
.end method

.method public e()Lcom/birbit/android/jobqueue/di/DependencyInjector;
    .locals 1

    iget-object v0, p0, Lq1/a;->h:Lcom/birbit/android/jobqueue/di/DependencyInjector;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq1/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lq1/a;->e:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lq1/a;->b:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lq1/a;->c:I

    return v0
.end method

.method public j()Lcom/birbit/android/jobqueue/network/NetworkUtil;
    .locals 1

    iget-object v0, p0, Lq1/a;->i:Lcom/birbit/android/jobqueue/network/NetworkUtil;

    return-object v0
.end method

.method public k()Lcom/birbit/android/jobqueue/QueueFactory;
    .locals 1

    iget-object v0, p0, Lq1/a;->g:Lcom/birbit/android/jobqueue/QueueFactory;

    return-object v0
.end method

.method public l()Lcom/birbit/android/jobqueue/scheduling/Scheduler;
    .locals 1

    iget-object v0, p0, Lq1/a;->l:Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lq1/a;->o:I

    return v0
.end method

.method public n()Lcom/birbit/android/jobqueue/timer/Timer;
    .locals 1

    iget-object v0, p0, Lq1/a;->k:Lcom/birbit/android/jobqueue/timer/Timer;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lq1/a;->m:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lq1/a;->n:Z

    return v0
.end method
