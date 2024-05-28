.class public final Lw3/hb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

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
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmd;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    invoke-static {p1, v1, v2}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmd;

    move-object v9, v1

    goto :goto_0

    .line 8
    :pswitch_1
    invoke-static {p1, v1}, La3/a;->g(Landroid/os/Parcel;I)[Ljava/lang/String;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    .line 9
    :pswitch_2
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 10
    invoke-static {p1, v1, v2}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;

    move-object v7, v1

    goto :goto_0

    .line 11
    :pswitch_3
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 12
    invoke-static {p1, v1, v2}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;

    move-object v6, v1

    goto :goto_0

    .line 13
    :pswitch_4
    invoke-static {p1, v1}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    .line 14
    :pswitch_5
    invoke-static {p1, v1}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    .line 15
    :pswitch_6
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmk;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 16
    invoke-static {p1, v1, v2}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmk;

    move-object v3, v1

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1, v0}, La3/a;->k(Landroid/os/Parcel;I)V

    .line 18
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmk;Ljava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;[Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmd;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;

    return-object p1
.end method
