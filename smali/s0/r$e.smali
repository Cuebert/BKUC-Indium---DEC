.class public final Ls0/r$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/OutcomeReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/r;->onGetCredential(Landroid/content/Context;Ls0/t;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/OutcomeReceiver<",
        "Landroid/credentials/GetCredentialResponse;",
        "Landroid/credentials/GetCredentialException;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ls0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls0/l<",
            "Ls0/u;",
            "Lt0/m;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Ls0/r;


# direct methods
.method constructor <init>(Ls0/l;Ls0/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls0/l<",
            "Ls0/u;",
            "Lt0/m;",
            ">;",
            "Ls0/r;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ls0/r$e;->a:Ls0/l;

    iput-object p2, p0, Ls0/r$e;->b:Ls0/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/credentials/GetCredentialException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "GetCredentialResponse error returned from framework"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Ls0/r$e;->a:Ls0/l;

    iget-object v1, p0, Ls0/r$e;->b:Ls0/r;

    invoke-virtual {v1, p1}, Ls0/r;->e(Landroid/credentials/GetCredentialException;)Lt0/m;

    move-result-object p1

    invoke-interface {v0, p1}, Ls0/l;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/credentials/GetCredentialResponse;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "GetCredentialResponse returned from framework"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Ls0/r$e;->a:Ls0/l;

    iget-object v1, p0, Ls0/r$e;->b:Ls0/r;

    invoke-virtual {v1, p1}, Ls0/r;->c(Landroid/credentials/GetCredentialResponse;)Ls0/u;

    move-result-object p1

    invoke-interface {v0, p1}, Ls0/l;->onResult(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onError(Ljava/lang/Throwable;)V
    .locals 0

    check-cast p1, Landroid/credentials/GetCredentialException;

    invoke-virtual {p0, p1}, Ls0/r$e;->a(Landroid/credentials/GetCredentialException;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/credentials/GetCredentialResponse;

    invoke-virtual {p0, p1}, Ls0/r$e;->b(Landroid/credentials/GetCredentialResponse;)V

    return-void
.end method
