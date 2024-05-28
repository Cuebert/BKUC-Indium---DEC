.class public Lcom/birbit/android/jobqueue/CancelResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/birbit/android/jobqueue/CancelResult$AsyncCancelCallback;
    }
.end annotation


# instance fields
.field a:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/birbit/android/jobqueue/e;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/birbit/android/jobqueue/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/birbit/android/jobqueue/e;",
            ">;",
            "Ljava/util/Collection<",
            "Lcom/birbit/android/jobqueue/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/birbit/android/jobqueue/CancelResult;->a:Ljava/util/Collection;

    .line 3
    iput-object p2, p0, Lcom/birbit/android/jobqueue/CancelResult;->b:Ljava/util/Collection;

    return-void
.end method
