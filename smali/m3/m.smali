.class public final Lm3/m;
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
    .locals 5

    .line 1
    invoke-static {p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_1

    .line 3
    invoke-static {p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v2

    .line 4
    invoke-static {v2}, La3/a;->l(I)I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_0

    .line 5
    invoke-static {p1, v2}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, v2}, La3/a;->m(Landroid/os/Parcel;I)Z

    move-result v1

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1, v0}, La3/a;->k(Landroid/os/Parcel;I)V

    .line 8
    new-instance p1, Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;

    invoke-direct {p1, v1}, Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;-><init>(Z)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;

    return-object p1
.end method
