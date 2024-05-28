.class Lcom/birbit/android/jobqueue/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/birbit/android/jobqueue/g;->d()Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/birbit/android/jobqueue/g;


# direct methods
.method constructor <init>(Lcom/birbit/android/jobqueue/g;)V
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/g$a;->a:Lcom/birbit/android/jobqueue/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start(Lv1/a;)Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/g$a;->a:Lcom/birbit/android/jobqueue/g;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/g;->a(Lcom/birbit/android/jobqueue/g;Lv1/a;)V

    const/4 p1, 0x1

    return p1
.end method

.method public stop(Lv1/a;)Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/g$a;->a:Lcom/birbit/android/jobqueue/g;

    invoke-static {v0, p1}, Lcom/birbit/android/jobqueue/g;->b(Lcom/birbit/android/jobqueue/g;Lv1/a;)V

    const/4 p1, 0x0

    return p1
.end method
