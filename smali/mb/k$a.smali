.class final Lmb/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private n:Ljava/lang/Runnable;

.field final synthetic o:Lmb/k;


# direct methods
.method public constructor <init>(Lmb/k;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmb/k$a;->o:Lmb/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmb/k$a;->n:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :cond_0
    :try_start_0
    iget-object v1, p0, Lmb/k$a;->n:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2
    sget-object v2, Lva/f;->n:Lva/f;

    invoke-static {v2, v1}, Lkb/x;->a(Lva/e;Ljava/lang/Throwable;)V

    .line 3
    :goto_0
    iget-object v1, p0, Lmb/k$a;->o:Lmb/k;

    invoke-static {v1}, Lmb/k;->n0(Lmb/k;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iput-object v1, p0, Lmb/k$a;->n:Ljava/lang/Runnable;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 4
    iget-object v1, p0, Lmb/k$a;->o:Lmb/k;

    invoke-static {v1}, Lmb/k;->m0(Lmb/k;)Lkb/v;

    move-result-object v1

    iget-object v2, p0, Lmb/k$a;->o:Lmb/k;

    invoke-virtual {v1, v2}, Lkb/v;->k0(Lva/e;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v0, p0, Lmb/k$a;->o:Lmb/k;

    invoke-static {v0}, Lmb/k;->m0(Lmb/k;)Lkb/v;

    move-result-object v0

    iget-object v1, p0, Lmb/k$a;->o:Lmb/k;

    invoke-virtual {v0, v1, p0}, Lkb/v;->j0(Lva/e;Ljava/lang/Runnable;)V

    return-void
.end method
