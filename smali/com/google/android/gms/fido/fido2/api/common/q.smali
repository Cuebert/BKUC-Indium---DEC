.class public final Lcom/google/android/gms/fido/fido2/api/common/q;
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
    .locals 7

    .line 1
    invoke-static {p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_3

    .line 3
    invoke-static {p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v4

    .line 4
    invoke-static {v4}, La3/a;->l(I)I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    const/4 v6, 0x3

    if-eq v5, v6, :cond_1

    const/4 v6, 0x4

    if-eq v5, v6, :cond_0

    .line 5
    invoke-static {p1, v4}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, v4}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1, v4}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p1, v4}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v1

    goto :goto_0

    .line 9
    :cond_3
    invoke-static {p1, v0}, La3/a;->k(Landroid/os/Parcel;I)V

    .line 10
    new-instance p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    invoke-direct {p1, v1, v3, v2}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;-><init>(ILjava/lang/String;I)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    return-object p1
.end method
