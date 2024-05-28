.class Lgc/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/g$b;->W(Lgc/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lgc/d;

.field final synthetic b:Lgc/g$b;


# direct methods
.method constructor <init>(Lgc/g$b;Lgc/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgc/g$b$a;->b:Lgc/g$b;

    iput-object p2, p0, Lgc/g$b$a;->a:Lgc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lgc/g$b$a;Lgc/d;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lgc/g$b$a;->e(Lgc/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lgc/g$b$a;Lgc/d;Lgc/t;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lgc/g$b$a;->f(Lgc/d;Lgc/t;)V

    return-void
.end method

.method private synthetic e(Lgc/d;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lgc/g$b$a;->b:Lgc/g$b;

    invoke-interface {p1, v0, p2}, Lgc/d;->b(Lgc/b;Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic f(Lgc/d;Lgc/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgc/g$b$a;->b:Lgc/g$b;

    iget-object v0, v0, Lgc/g$b;->o:Lgc/b;

    invoke-interface {v0}, Lgc/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p2, p0, Lgc/g$b$a;->b:Lgc/g$b;

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2, v0}, Lgc/d;->b(Lgc/b;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lgc/g$b$a;->b:Lgc/g$b;

    invoke-interface {p1, v0, p2}, Lgc/d;->a(Lgc/b;Lgc/t;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lgc/b;Lgc/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TT;>;",
            "Lgc/t<",
            "TT;>;)V"
        }
    .end annotation

    iget-object p1, p0, Lgc/g$b$a;->b:Lgc/g$b;

    iget-object p1, p1, Lgc/g$b;->n:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lgc/g$b$a;->a:Lgc/d;

    new-instance v1, Lgc/h;

    invoke-direct {v1, p0, v0, p2}, Lgc/h;-><init>(Lgc/g$b$a;Lgc/d;Lgc/t;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lgc/b;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lgc/g$b$a;->b:Lgc/g$b;

    iget-object p1, p1, Lgc/g$b;->n:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lgc/g$b$a;->a:Lgc/d;

    new-instance v1, Lgc/i;

    invoke-direct {v1, p0, v0, p2}, Lgc/i;-><init>(Lgc/g$b$a;Lgc/d;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
