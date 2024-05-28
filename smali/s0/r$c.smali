.class public final Ls0/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/OutcomeReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/r;->onCreateCredential(Landroid/content/Context;Ls0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/OutcomeReceiver<",
        "Landroid/credentials/CreateCredentialResponse;",
        "Landroid/credentials/CreateCredentialException;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ls0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls0/l<",
            "Ls0/c;",
            "Lt0/e;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Ls0/b;

.field final synthetic c:Ls0/r;


# direct methods
.method constructor <init>(Ls0/l;Ls0/b;Ls0/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls0/l<",
            "Ls0/c;",
            "Lt0/e;",
            ">;",
            "Ls0/b;",
            "Ls0/r;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ls0/r$c;->a:Ls0/l;

    iput-object p2, p0, Ls0/r$c;->b:Ls0/b;

    iput-object p3, p0, Ls0/r$c;->c:Ls0/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/credentials/CreateCredentialException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "CreateCredentialResponse error returned from framework"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Ls0/r$c;->a:Ls0/l;

    iget-object v1, p0, Ls0/r$c;->c:Ls0/r;

    invoke-virtual {v1, p1}, Ls0/r;->d(Landroid/credentials/CreateCredentialException;)Lt0/e;

    move-result-object p1

    invoke-interface {v0, p1}, Ls0/l;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/credentials/CreateCredentialResponse;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "Create Result returned from framework: "

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Ls0/r$c;->a:Ls0/l;

    .line 3
    sget-object v1, Ls0/c;->c:Ls0/c$a;

    .line 4
    iget-object v2, p0, Ls0/r$c;->b:Ls0/b;

    invoke-virtual {v2}, Ls0/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialResponse;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v3, "response.data"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, v2, p1}, Ls0/c$a;->a(Ljava/lang/String;Landroid/os/Bundle;)Ls0/c;

    move-result-object p1

    .line 6
    invoke-interface {v0, p1}, Ls0/l;->onResult(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onError(Ljava/lang/Throwable;)V
    .locals 0

    check-cast p1, Landroid/credentials/CreateCredentialException;

    invoke-virtual {p0, p1}, Ls0/r$c;->a(Landroid/credentials/CreateCredentialException;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/credentials/CreateCredentialResponse;

    invoke-virtual {p0, p1}, Ls0/r$c;->b(Landroid/credentials/CreateCredentialResponse;)V

    return-void
.end method
