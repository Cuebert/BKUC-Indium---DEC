.class public final Lz2/l0;
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
    .locals 9

    .line 1
    invoke-static {p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_5

    .line 3
    invoke-static {p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, La3/a;->l(I)I

    move-result v2

    const/4 v8, 0x1

    if-eq v2, v8, :cond_4

    const/4 v8, 0x2

    if-eq v2, v8, :cond_3

    const/4 v8, 0x3

    if-eq v2, v8, :cond_2

    const/4 v8, 0x4

    if-eq v2, v8, :cond_1

    const/4 v8, 0x5

    if-eq v2, v8, :cond_0

    .line 4
    invoke-static {p1, v1}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1, v1}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v7

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p1, v1}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {p1, v1}, La3/a;->m(Landroid/os/Parcel;I)Z

    move-result v5

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {p1, v1}, La3/a;->m(Landroid/os/Parcel;I)Z

    move-result v4

    goto :goto_0

    .line 9
    :cond_4
    invoke-static {p1, v1}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_0

    .line 10
    :cond_5
    invoke-static {p1, v0}, La3/a;->k(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;-><init>(IZZII)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    return-object p1
.end method
