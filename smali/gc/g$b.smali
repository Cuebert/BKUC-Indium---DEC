.class final Lgc/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgc/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final n:Ljava/util/concurrent/Executor;

.field final o:Lgc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lgc/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lgc/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/g$b;->n:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lgc/g$b;->o:Lgc/b;

    return-void
.end method


# virtual methods
.method public W(Lgc/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/d<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "callback == null"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lgc/g$b;->o:Lgc/b;

    new-instance v1, Lgc/g$b$a;

    invoke-direct {v1, p0, p1}, Lgc/g$b$a;-><init>(Lgc/g$b;Lgc/d;)V

    invoke-interface {v0, v1}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method

.method public c()Lgc/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgc/t<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lgc/g$b;->o:Lgc/b;

    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lgc/g$b;->o:Lgc/b;

    invoke-interface {v0}, Lgc/b;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lgc/g$b;->l()Lgc/b;

    move-result-object v0

    return-object v0
.end method

.method public e()Lob/g0;
    .locals 1

    iget-object v0, p0, Lgc/g$b;->o:Lgc/b;

    invoke-interface {v0}, Lgc/b;->e()Lob/g0;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lgc/g$b;->o:Lgc/b;

    invoke-interface {v0}, Lgc/b;->i()Z

    move-result v0

    return v0
.end method

.method public l()Lgc/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgc/b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lgc/g$b;

    iget-object v1, p0, Lgc/g$b;->n:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lgc/g$b;->o:Lgc/b;

    invoke-interface {v2}, Lgc/b;->l()Lgc/b;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lgc/g$b;-><init>(Ljava/util/concurrent/Executor;Lgc/b;)V

    return-object v0
.end method
