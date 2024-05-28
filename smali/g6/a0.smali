.class public final synthetic Lg6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic n:Ljava/util/concurrent/Executor;

.field public final synthetic o:Lg4/a;

.field public final synthetic p:Lg4/b;

.field public final synthetic q:Lg4/m;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lg4/a;Lg4/b;Lg4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/a0;->n:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg6/a0;->o:Lg4/a;

    iput-object p3, p0, Lg6/a0;->p:Lg4/b;

    iput-object p4, p0, Lg6/a0;->q:Lg4/m;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 4

    iget-object v0, p0, Lg6/a0;->n:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lg6/a0;->o:Lg4/a;

    iget-object v2, p0, Lg6/a0;->p:Lg4/b;

    iget-object v3, p0, Lg6/a0;->q:Lg4/m;

    .line 1
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {v1}, Lg4/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v2}, Lg4/b;->a()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v3, p1}, Lg4/m;->b(Ljava/lang/Exception;)V

    .line 5
    :goto_0
    throw p1
.end method
