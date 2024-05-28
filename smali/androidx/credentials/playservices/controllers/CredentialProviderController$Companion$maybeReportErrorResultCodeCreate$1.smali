.class final Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Ldb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;->maybeReportErrorResultCodeCreate(ILdb/p;Ldb/l;Landroid/os/CancellationSignal;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Ldb/a<",
        "Lta/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $exception:Lkotlin/jvm/internal/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/o<",
            "Lt0/e;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onError:Ldb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/l<",
            "Lt0/e;",
            "Lta/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldb/l;Lkotlin/jvm/internal/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldb/l<",
            "-",
            "Lt0/e;",
            "Lta/l;",
            ">;",
            "Lkotlin/jvm/internal/o<",
            "Lt0/e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$onError:Ldb/l;

    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$exception:Lkotlin/jvm/internal/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->invoke()V

    sget-object v0, Lta/l;->a:Lta/l;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$onError:Ldb/l;

    iget-object v1, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$exception:Lkotlin/jvm/internal/o;

    iget-object v1, v1, Lkotlin/jvm/internal/o;->n:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ldb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
