.class final Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Ldb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;->handleResponse$credentials_play_services_auth_release(IILandroid/content/Intent;)V
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
            "Lt0/m;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;


# direct methods
.method public static synthetic $r8$lambda$gidThyD27SsfgPBoINvCJvd96nk(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Lkotlin/jvm/internal/o;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->invoke$lambda$0(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Lkotlin/jvm/internal/o;)V

    return-void
.end method

.method constructor <init>(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Lkotlin/jvm/internal/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;",
            "Lkotlin/jvm/internal/o<",
            "Lt0/m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;

    iput-object p2, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->$exception:Lkotlin/jvm/internal/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$0(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Lkotlin/jvm/internal/o;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;->getCallback()Ls0/l;

    move-result-object p0

    iget-object p1, p1, Lkotlin/jvm/internal/o;->n:Ljava/lang/Object;

    invoke-interface {p0, p1}, Ls0/l;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->invoke()V

    sget-object v0, Lta/l;->a:Lta/l;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;

    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;

    iget-object v2, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4;->$exception:Lkotlin/jvm/internal/o;

    new-instance v3, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, v2}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0;-><init>(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Lkotlin/jvm/internal/o;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
