.class final Lcom/google/common/util/concurrent/g;
.super Lcom/google/common/util/concurrent/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/util/concurrent/g$a;,
        Lcom/google/common/util/concurrent/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/util/concurrent/e<",
        "Ljava/lang/Object;",
        "TV;>;"
    }
.end annotation


# instance fields
.field private C:Lcom/google/common/util/concurrent/g$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/g<",
            "TV;>.b<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lf5/b;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/b<",
            "+",
            "Lcom/google/common/util/concurrent/m<",
            "*>;>;Z",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/util/concurrent/e;-><init>(Lf5/b;ZZ)V

    .line 2
    new-instance p1, Lcom/google/common/util/concurrent/g$a;

    invoke-direct {p1, p0, p4, p3}, Lcom/google/common/util/concurrent/g$a;-><init>(Lcom/google/common/util/concurrent/g;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/google/common/util/concurrent/g;->C:Lcom/google/common/util/concurrent/g$b;

    .line 3
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/e;->T()V

    return-void
.end method

.method static synthetic Z(Lcom/google/common/util/concurrent/g;Lcom/google/common/util/concurrent/g$b;)Lcom/google/common/util/concurrent/g$b;
    .locals 0

    iput-object p1, p0, Lcom/google/common/util/concurrent/g;->C:Lcom/google/common/util/concurrent/g$b;

    return-object p1
.end method


# virtual methods
.method O(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method R()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/g;->C:Lcom/google/common/util/concurrent/g$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/google/common/util/concurrent/g$b;->h()V

    :cond_0
    return-void
.end method

.method Y(Lcom/google/common/util/concurrent/e$a;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/google/common/util/concurrent/e;->Y(Lcom/google/common/util/concurrent/e$a;)V

    .line 2
    sget-object v0, Lcom/google/common/util/concurrent/e$a;->n:Lcom/google/common/util/concurrent/e$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/google/common/util/concurrent/g;->C:Lcom/google/common/util/concurrent/g$b;

    :cond_0
    return-void
.end method

.method protected x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/g;->C:Lcom/google/common/util/concurrent/g$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/google/common/util/concurrent/l;->c()V

    :cond_0
    return-void
.end method
