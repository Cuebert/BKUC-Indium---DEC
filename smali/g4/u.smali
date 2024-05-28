.class final Lg4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lg4/l;

.field final synthetic o:Lg4/v;


# direct methods
.method constructor <init>(Lg4/v;Lg4/l;)V
    .locals 0

    iput-object p1, p0, Lg4/u;->o:Lg4/v;

    iput-object p2, p0, Lg4/u;->n:Lg4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/u;->n:Lg4/l;

    invoke-virtual {v0}, Lg4/l;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg4/u;->o:Lg4/v;

    invoke-static {v0}, Lg4/v;->c(Lg4/v;)Lg4/n0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lg4/n0;->t()Z

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lg4/u;->o:Lg4/v;

    invoke-static {v0}, Lg4/v;->a(Lg4/v;)Lg4/c;

    move-result-object v0

    iget-object v1, p0, Lg4/u;->n:Lg4/l;

    .line 3
    invoke-interface {v0, v1}, Lg4/c;->a(Lg4/l;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lg4/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lg4/u;->o:Lg4/v;

    invoke-static {v1}, Lg4/v;->c(Lg4/v;)Lg4/n0;

    move-result-object v1

    .line 4
    invoke-virtual {v1, v0}, Lg4/n0;->s(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    .line 5
    iget-object v1, p0, Lg4/u;->o:Lg4/v;

    invoke-static {v1}, Lg4/v;->c(Lg4/v;)Lg4/n0;

    move-result-object v1

    .line 6
    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg4/u;->o:Lg4/v;

    invoke-static {v1}, Lg4/v;->c(Lg4/v;)Lg4/n0;

    move-result-object v1

    .line 8
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void

    .line 9
    :cond_1
    iget-object v1, p0, Lg4/u;->o:Lg4/v;

    invoke-static {v1}, Lg4/v;->c(Lg4/v;)Lg4/n0;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void
.end method
