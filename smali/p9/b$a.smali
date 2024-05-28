.class Lp9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Lgc/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private b:Z

.field final synthetic c:Lp9/b;


# direct methods
.method public constructor <init>(Lp9/b;Lgc/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/d<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lp9/b$a;-><init>(Lp9/b;Lgc/d;Z)V

    return-void
.end method

.method public constructor <init>(Lp9/b;Lgc/d;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/d<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lp9/b$a;->c:Lp9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lp9/b$a;->a:Lgc/d;

    .line 4
    iput-boolean p3, p0, Lp9/b$a;->b:Z

    return-void
.end method

.method static synthetic c(Lp9/b$a;)Lgc/d;
    .locals 0

    iget-object p0, p0, Lp9/b$a;->a:Lgc/d;

    return-object p0
.end method


# virtual methods
.method public a(Lgc/b;Lgc/t;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TT;>;",
            "Lgc/t<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lgc/t;->b()I

    move-result p1

    const/16 v0, 0x193

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lgc/t;->e()Lob/y;

    move-result-object p1

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0}, Lob/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lp9/b$a;->b:Z

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lp9/b$a;->c:Lp9/b;

    iget-object p1, p1, Lp9/b;->o:Lgc/b;

    invoke-interface {p1}, Lgc/b;->l()Lgc/b;

    move-result-object p1

    new-instance p2, Lp9/b$a;

    iget-object v0, p0, Lp9/b$a;->c:Lp9/b;

    iget-object v1, p0, Lp9/b$a;->a:Lgc/d;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v2}, Lp9/b$a;-><init>(Lp9/b;Lgc/d;Z)V

    invoke-interface {p1, p2}, Lgc/b;->W(Lgc/d;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lp9/b$a;->c:Lp9/b;

    iget-object p1, p1, Lp9/b;->n:Ljava/util/concurrent/Executor;

    new-instance v0, Lp9/b$a$a;

    invoke-direct {v0, p0, p2}, Lp9/b$a$a;-><init>(Lp9/b$a;Lgc/t;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public b(Lgc/b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lp9/b$a;->c:Lp9/b;

    iget-object p1, p1, Lp9/b;->n:Ljava/util/concurrent/Executor;

    new-instance v0, Lp9/b$a$b;

    invoke-direct {v0, p0, p2}, Lp9/b$a$b;-><init>(Lp9/b$a;Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
