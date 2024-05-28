.class public Lcom/birbit/android/jobqueue/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:J


# instance fields
.field final a:Lcom/birbit/android/jobqueue/h;

.field private final b:Lt1/e;

.field private final c:Lt1/c;

.field private d:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lcom/birbit/android/jobqueue/g;->e:J

    return-void
.end method

.method public constructor <init>(Lq1/a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lt1/c;

    invoke-direct {v0}, Lt1/c;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/g;->c:Lt1/c;

    .line 3
    new-instance v1, Lt1/e;

    invoke-virtual {p1}, Lq1/a;->n()Lcom/birbit/android/jobqueue/timer/Timer;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lt1/e;-><init>(Lcom/birbit/android/jobqueue/timer/Timer;Lt1/c;)V

    iput-object v1, p0, Lcom/birbit/android/jobqueue/g;->b:Lt1/e;

    .line 4
    new-instance v2, Lcom/birbit/android/jobqueue/h;

    invoke-direct {v2, p1, v1, v0}, Lcom/birbit/android/jobqueue/h;-><init>(Lq1/a;Lt1/e;Lt1/c;)V

    iput-object v2, p0, Lcom/birbit/android/jobqueue/g;->a:Lcom/birbit/android/jobqueue/h;

    .line 5
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "job-manager"

    invoke-direct {v0, v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/g;->d:Ljava/lang/Thread;

    .line 6
    invoke-virtual {p1}, Lq1/a;->l()Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-direct {p0}, Lcom/birbit/android/jobqueue/g;->d()Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lq1/a;->l()Lcom/birbit/android/jobqueue/scheduling/Scheduler;

    move-result-object v1

    invoke-virtual {p1}, Lq1/a;->b()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->b(Landroid/content/Context;Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/g;->d:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic a(Lcom/birbit/android/jobqueue/g;Lv1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/g;->e(Lv1/a;)V

    return-void
.end method

.method static synthetic b(Lcom/birbit/android/jobqueue/g;Lv1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/g;->f(Lv1/a;)V

    return-void
.end method

.method private d()Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;
    .locals 1

    new-instance v0, Lcom/birbit/android/jobqueue/g$a;

    invoke-direct {v0, p0}, Lcom/birbit/android/jobqueue/g$a;-><init>(Lcom/birbit/android/jobqueue/g;)V

    return-object v0
.end method

.method private e(Lv1/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/g;->c:Lt1/c;

    const-class v1, Lu1/k;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/k;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1, p1}, Lu1/k;->e(ILv1/a;)V

    .line 3
    iget-object p1, p0, Lcom/birbit/android/jobqueue/g;->b:Lt1/e;

    invoke-virtual {p1, v0}, Lt1/e;->post(Lt1/b;)V

    return-void
.end method

.method private f(Lv1/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/g;->c:Lt1/c;

    const-class v1, Lu1/k;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/k;

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1, p1}, Lu1/k;->e(ILv1/a;)V

    .line 3
    iget-object p1, p0, Lcom/birbit/android/jobqueue/g;->b:Lt1/e;

    invoke-virtual {p1, v0}, Lt1/e;->post(Lt1/b;)V

    return-void
.end method


# virtual methods
.method public c(Lcom/birbit/android/jobqueue/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/g;->c:Lt1/c;

    const-class v1, Lu1/a;

    invoke-virtual {v0, v1}, Lt1/c;->a(Ljava/lang/Class;)Lt1/b;

    move-result-object v0

    check-cast v0, Lu1/a;

    .line 2
    invoke-virtual {v0, p1}, Lu1/a;->d(Lcom/birbit/android/jobqueue/e;)V

    .line 3
    iget-object p1, p0, Lcom/birbit/android/jobqueue/g;->b:Lt1/e;

    invoke-virtual {p1, v0}, Lt1/e;->post(Lt1/b;)V

    return-void
.end method
