.class public final Lp3/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp2/b;


# instance fields
.field private final n:Lcom/google/android/gms/common/api/Status;

.field private final o:Lcom/google/android/gms/auth/api/credentials/Credential;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/f0;->n:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lp3/f0;->o:Lcom/google/android/gms/auth/api/credentials/Credential;

    return-void
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 1

    iget-object v0, p0, Lp3/f0;->o:Lcom/google/android/gms/auth/api/credentials/Credential;

    return-object v0
.end method

.method public final q()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lp3/f0;->n:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
