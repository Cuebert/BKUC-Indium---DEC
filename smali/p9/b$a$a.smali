.class Lp9/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp9/b$a;->a(Lgc/b;Lgc/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lgc/t;

.field final synthetic o:Lp9/b$a;


# direct methods
.method constructor <init>(Lp9/b$a;Lgc/t;)V
    .locals 0

    iput-object p1, p0, Lp9/b$a$a;->o:Lp9/b$a;

    iput-object p2, p0, Lp9/b$a$a;->n:Lgc/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp9/b$a$a;->o:Lp9/b$a;

    iget-object v0, v0, Lp9/b$a;->c:Lp9/b;

    iget-object v0, v0, Lp9/b;->o:Lgc/b;

    invoke-interface {v0}, Lgc/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lp9/b$a$a;->o:Lp9/b$a;

    invoke-static {v0}, Lp9/b$a;->c(Lp9/b$a;)Lgc/d;

    move-result-object v0

    iget-object v1, p0, Lp9/b$a$a;->o:Lp9/b$a;

    iget-object v1, v1, Lp9/b$a;->c:Lp9/b;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lgc/d;->b(Lgc/b;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lp9/b$a$a;->o:Lp9/b$a;

    invoke-static {v0}, Lp9/b$a;->c(Lp9/b$a;)Lgc/d;

    move-result-object v0

    iget-object v1, p0, Lp9/b$a$a;->o:Lp9/b$a;

    iget-object v1, v1, Lp9/b$a;->c:Lp9/b;

    iget-object v2, p0, Lp9/b$a$a;->n:Lgc/t;

    invoke-interface {v0, v1, v2}, Lgc/d;->a(Lgc/b;Lgc/t;)V

    :goto_0
    return-void
.end method
