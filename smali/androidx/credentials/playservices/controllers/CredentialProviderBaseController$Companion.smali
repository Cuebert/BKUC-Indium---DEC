.class public final Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;-><init>()V

    return-void
.end method

.method protected static synthetic getCONTROLLER_REQUEST_CODE$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Lt0/e;
    .locals 1

    const-string v0, "CREATE_CANCELED"

    .line 1
    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance p1, Lt0/c;

    invoke-direct {p1, p2}, Lt0/c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const-string v0, "CREATE_INTERRUPTED"

    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    new-instance p1, Lt0/f;

    invoke-direct {p1, p2}, Lt0/f;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_1
    new-instance p1, Lt0/i;

    invoke-direct {p1, p2}, Lt0/i;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    return-object p1
.end method

.method protected final getCONTROLLER_REQUEST_CODE()I
    .locals 1

    invoke-static {}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->access$getCONTROLLER_REQUEST_CODE$cp()I

    move-result v0

    return v0
.end method

.method public final getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Lt0/m;
    .locals 2

    if-eqz p1, :cond_5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x5d754ec3

    if-eq v0, v1, :cond_4

    const v1, -0x936ed67

    if-eq v0, v1, :cond_2

    const v1, 0x77034d87

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "GET_NO_CREDENTIALS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    new-instance p1, Lt0/r;

    invoke-direct {p1, p2}, Lt0/r;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    const-string v0, "GET_INTERRUPTED"

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    new-instance p1, Lt0/n;

    invoke-direct {p1, p2}, Lt0/n;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_4
    const-string v0, "GET_CANCELED_TAG"

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 6
    new-instance p1, Lt0/k;

    invoke-direct {p1, p2}, Lt0/k;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 7
    :cond_5
    :goto_0
    new-instance p1, Lt0/p;

    invoke-direct {p1, p2}, Lt0/p;-><init>(Ljava/lang/CharSequence;)V

    :goto_1
    return-object p1
.end method

.method public final getRetryables()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->access$getRetryables$cp()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
