.class final Lg4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;
.implements Lg4/g;
.implements Lg4/e;
.implements Lg4/i0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lg4/h<",
        "TTContinuationResult;>;",
        "Lg4/g;",
        "Lg4/e;",
        "Lg4/i0;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lg4/c;

.field private final c:Lg4/n0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lg4/c;Lg4/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4/x;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg4/x;->b:Lg4/c;

    iput-object p3, p0, Lg4/x;->c:Lg4/n0;

    return-void
.end method

.method static bridge synthetic c(Lg4/x;)Lg4/c;
    .locals 0

    iget-object p0, p0, Lg4/x;->b:Lg4/c;

    return-object p0
.end method

.method static bridge synthetic d(Lg4/x;)Lg4/n0;
    .locals 0

    iget-object p0, p0, Lg4/x;->c:Lg4/n0;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lg4/x;->c:Lg4/n0;

    invoke-virtual {v0}, Lg4/n0;->t()Z

    return-void
.end method

.method public final b(Lg4/l;)V
    .locals 2

    iget-object v0, p0, Lg4/x;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lg4/w;

    invoke-direct {v1, p0, p1}, Lg4/w;-><init>(Lg4/x;Lg4/l;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lg4/x;->c:Lg4/n0;

    invoke-virtual {v0, p1}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lg4/x;->c:Lg4/n0;

    invoke-virtual {v0, p1}, Lg4/n0;->s(Ljava/lang/Object;)V

    return-void
.end method
