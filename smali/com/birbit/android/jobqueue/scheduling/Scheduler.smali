.class public abstract Lcom/birbit/android/jobqueue/scheduling/Scheduler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;
    }
.end annotation


# instance fields
.field private a:Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;

.field private b:Landroid/content/Context;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public b(Landroid/content/Context;Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->b:Landroid/content/Context;

    .line 2
    iput-object p2, p0, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->a:Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;

    return-void
.end method

.method public abstract c(Lv1/a;Z)V
.end method

.method public abstract d(Lv1/a;)V
.end method

.method public final e(Lv1/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->a:Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;->start(Lv1/a;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JobManager callback is not configured"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lv1/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->a:Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;->stop(Lv1/a;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JobManager callback is not configured"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
