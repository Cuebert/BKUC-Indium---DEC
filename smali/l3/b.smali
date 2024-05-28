.class public final synthetic Ll3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/k;


# instance fields
.field public final synthetic a:Ll3/a;

.field public final synthetic b:Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;


# direct methods
.method public synthetic constructor <init>(Ll3/a;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/b;->a:Ll3/a;

    iput-object p2, p0, Ll3/b;->b:Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ll3/b;->a:Ll3/a;

    iget-object v1, p0, Ll3/b;->b:Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;

    check-cast p1, Lt3/z2;

    check-cast p2, Lg4/m;

    .line 1
    new-instance v2, Ll3/c;

    invoke-direct {v2, v0, p2}, Ll3/c;-><init>(Ll3/a;Lg4/m;)V

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lt3/c3;

    invoke-virtual {p1, v2, v1}, Lt3/c3;->n(Lt3/b3;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;)V

    return-void
.end method
