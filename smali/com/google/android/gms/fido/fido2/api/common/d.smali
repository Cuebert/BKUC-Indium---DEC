.class public final Lcom/google/android/gms/fido/fido2/api/common/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    move-object v3, v1

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    .line 3
    invoke-static {p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v1

    .line 4
    invoke-static {v1}, La3/a;->l(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 5
    invoke-static {p1, v1}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :pswitch_0
    invoke-static {p1, v1}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 7
    :pswitch_1
    sget-object v2, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    invoke-static {p1, v1, v2}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    goto :goto_0

    .line 9
    :pswitch_2
    sget-object v2, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 10
    invoke-static {p1, v1, v2}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    goto :goto_0

    .line 11
    :pswitch_3
    sget-object v2, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 12
    invoke-static {p1, v1, v2}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    goto :goto_0

    .line 13
    :pswitch_4
    sget-object v2, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 14
    invoke-static {p1, v1, v2}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    goto :goto_0

    .line 15
    :pswitch_5
    invoke-static {p1, v1}, La3/a;->b(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_0

    .line 16
    :pswitch_6
    invoke-static {p1, v1}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 17
    :pswitch_7
    invoke-static {p1, v1}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1, v0}, La3/a;->k(Landroid/os/Parcel;I)V

    .line 19
    new-instance p1, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    move-object v2, p1

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;-><init>(Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;Ljava/lang/String;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    return-object p1
.end method
