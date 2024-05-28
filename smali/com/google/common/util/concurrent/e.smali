.class abstract Lcom/google/common/util/concurrent/e;
.super Lcom/google/common/util/concurrent/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/util/concurrent/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<InputT:",
        "Ljava/lang/Object;",
        "OutputT:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/util/concurrent/f<",
        "TOutputT;>;"
    }
.end annotation


# static fields
.field private static final B:Ljava/util/logging/Logger;


# instance fields
.field private final A:Z

.field private y:Lf5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf5/b<",
            "+",
            "Lcom/google/common/util/concurrent/m<",
            "+TInputT;>;>;"
        }
    .end annotation
.end field

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/common/util/concurrent/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/common/util/concurrent/e;->B:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lf5/b;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/b<",
            "+",
            "Lcom/google/common/util/concurrent/m<",
            "+TInputT;>;>;ZZ)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/common/util/concurrent/f;-><init>(I)V

    .line 2
    invoke-static {p1}, Le5/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf5/b;

    iput-object p1, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    .line 3
    iput-boolean p2, p0, Lcom/google/common/util/concurrent/e;->z:Z

    .line 4
    iput-boolean p3, p0, Lcom/google/common/util/concurrent/e;->A:Z

    return-void
.end method

.method public static synthetic L(Lcom/google/common/util/concurrent/e;Lcom/google/common/util/concurrent/m;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/common/util/concurrent/e;->U(Lcom/google/common/util/concurrent/m;I)V

    return-void
.end method

.method public static synthetic M(Lcom/google/common/util/concurrent/e;Lf5/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/e;->V(Lf5/b;)V

    return-void
.end method

.method private static N(Ljava/util/Set;Ljava/lang/Throwable;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/lang/Throwable;",
            ")Z"
        }
    .end annotation

    :goto_0
    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private P(ILjava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/Future<",
            "+TInputT;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p2}, Lcom/google/common/util/concurrent/j;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/common/util/concurrent/e;->O(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/e;->S(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/e;->S(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private Q(Lf5/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/b<",
            "+",
            "Ljava/util/concurrent/Future<",
            "+TInputT;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/f;->J()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Less than 0 remaining futures"

    .line 2
    invoke-static {v1, v2}, Le5/g;->k(ZLjava/lang/Object;)V

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/e;->X(Lf5/b;)V

    :cond_1
    return-void
.end method

.method private S(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {p1}, Le5/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/e;->z:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/a;->C(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/f;->K()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/util/concurrent/e;->N(Ljava/util/Set;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {p1}, Lcom/google/common/util/concurrent/e;->W(Ljava/lang/Throwable;)V

    return-void

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/lang/Error;

    if-eqz v0, :cond_1

    .line 7
    invoke-static {p1}, Lcom/google/common/util/concurrent/e;->W(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method private synthetic U(Lcom/google/common/util/concurrent/m;I)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iput-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/a$j;->cancel(Z)Z

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/google/common/util/concurrent/e;->P(ILjava/util/concurrent/Future;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :goto_0
    invoke-direct {p0, v0}, Lcom/google/common/util/concurrent/e;->Q(Lf5/b;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0, v0}, Lcom/google/common/util/concurrent/e;->Q(Lf5/b;)V

    .line 6
    throw p1
.end method

.method private synthetic V(Lf5/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/e;->Q(Lf5/b;)V

    return-void
.end method

.method private static W(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_0

    const-string v0, "Input Future failed with Error"

    goto :goto_0

    :cond_0
    const-string v0, "Got more than one input Future failure. Logging failures after the first"

    .line 2
    :goto_0
    sget-object v1, Lcom/google/common/util/concurrent/e;->B:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v1, v2, v0, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private X(Lf5/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/b<",
            "+",
            "Ljava/util/concurrent/Future<",
            "+TInputT;>;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1}, Lf5/b;->l()Lf5/j;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    .line 2
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/google/common/util/concurrent/e;->P(ILjava/util/concurrent/Future;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/f;->I()V

    .line 5
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/e;->R()V

    .line 6
    sget-object p1, Lcom/google/common/util/concurrent/e$a;->o:Lcom/google/common/util/concurrent/e$a;

    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/e;->Y(Lcom/google/common/util/concurrent/e$a;)V

    return-void
.end method


# virtual methods
.method final H(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le5/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/a$j;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/a;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {p1, v0}, Lcom/google/common/util/concurrent/e;->N(Ljava/util/Set;Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method abstract O(ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITInputT;)V"
        }
    .end annotation
.end method

.method abstract R()V
.end method

.method final T()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/e;->R()V

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/e;->z:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    invoke-virtual {v1}, Lf5/b;->l()Lf5/j;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/util/concurrent/m;

    add-int/lit8 v3, v0, 0x1

    .line 6
    new-instance v4, Lcom/google/common/util/concurrent/c;

    invoke-direct {v4, p0, v2, v0}, Lcom/google/common/util/concurrent/c;-><init>(Lcom/google/common/util/concurrent/e;Lcom/google/common/util/concurrent/m;I)V

    .line 7
    invoke-static {}, Lcom/google/common/util/concurrent/n;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 8
    invoke-interface {v2, v4, v0}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move v0, v3

    goto :goto_0

    .line 9
    :cond_1
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/e;->A:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 10
    :goto_1
    new-instance v1, Lcom/google/common/util/concurrent/d;

    invoke-direct {v1, p0, v0}, Lcom/google/common/util/concurrent/d;-><init>(Lcom/google/common/util/concurrent/e;Lf5/b;)V

    .line 11
    iget-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    invoke-virtual {v0}, Lf5/b;->l()Lf5/j;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/util/concurrent/m;

    .line 12
    invoke-static {}, Lcom/google/common/util/concurrent/n;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method Y(Lcom/google/common/util/concurrent/e$a;)V
    .locals 0

    .line 1
    invoke-static {p1}, Le5/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    return-void
.end method

.method protected final n()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/common/util/concurrent/a;->n()V

    .line 2
    iget-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    .line 3
    sget-object v1, Lcom/google/common/util/concurrent/e$a;->n:Lcom/google/common/util/concurrent/e$a;

    invoke-virtual {p0, v1}, Lcom/google/common/util/concurrent/e;->Y(Lcom/google/common/util/concurrent/e$a;)V

    .line 4
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/a$j;->isCancelled()Z

    move-result v1

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/a;->D()Z

    move-result v1

    .line 6
    invoke-virtual {v0}, Lf5/b;->l()Lf5/j;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;

    .line 7
    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    :cond_1
    return-void
.end method

.method protected final y()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/e;->y:Lf5/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "futures="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/google/common/util/concurrent/a;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
