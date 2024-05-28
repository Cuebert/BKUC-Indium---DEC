.class Lbc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Lbc/i;

.field private final o:Lbc/c;


# direct methods
.method constructor <init>(Lbc/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbc/a;->o:Lbc/c;

    .line 3
    new-instance p1, Lbc/i;

    invoke-direct {p1}, Lbc/i;-><init>()V

    iput-object p1, p0, Lbc/a;->n:Lbc/i;

    return-void
.end method


# virtual methods
.method public a(Lbc/n;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lbc/h;->a(Lbc/n;Ljava/lang/Object;)Lbc/h;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lbc/a;->n:Lbc/i;

    invoke-virtual {p2, p1}, Lbc/i;->a(Lbc/h;)V

    .line 3
    iget-object p1, p0, Lbc/a;->o:Lbc/c;

    invoke-virtual {p1}, Lbc/c;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbc/a;->n:Lbc/i;

    invoke-virtual {v0}, Lbc/i;->b()Lbc/h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lbc/a;->o:Lbc/c;

    invoke-virtual {v1, v0}, Lbc/c;->g(Lbc/h;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pending post available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
