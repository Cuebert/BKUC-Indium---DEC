.class public final Lm3/q;
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
    .locals 6

    .line 1
    invoke-static {p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_2

    .line 3
    invoke-static {p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v3

    .line 4
    invoke-static {v3}, La3/a;->l(I)I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    .line 5
    invoke-static {p1, v3}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, v3}, La3/a;->b(Landroid/os/Parcel;I)[B

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1, v3}, La3/a;->m(Landroid/os/Parcel;I)Z

    move-result v2

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p1, v0}, La3/a;->k(Landroid/os/Parcel;I)V

    .line 9
    new-instance p1, Lcom/google/android/gms/fido/fido2/api/common/zzh;

    invoke-direct {p1, v2, v1}, Lcom/google/android/gms/fido/fido2/api/common/zzh;-><init>(Z[B)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzh;

    return-object p1
.end method
