.class public final Lw3/db;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;",
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
    .locals 20

    move-object/from16 v0, p1

    .line 1
    invoke-static/range {p1 .. p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    const/4 v5, 0x0

    const/4 v10, 0x0

    .line 2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    .line 3
    invoke-static/range {p1 .. p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v2

    .line 4
    invoke-static {v2}, La3/a;->l(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 5
    invoke-static {v0, v2}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :pswitch_0
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;

    move-object/from16 v19, v2

    goto :goto_0

    .line 8
    :pswitch_1
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;

    move-object/from16 v18, v2

    goto :goto_0

    .line 10
    :pswitch_2
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 11
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;

    move-object/from16 v17, v2

    goto :goto_0

    .line 12
    :pswitch_3
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 13
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;

    move-object/from16 v16, v2

    goto :goto_0

    .line 14
    :pswitch_4
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;

    move-object v15, v2

    goto :goto_0

    .line 16
    :pswitch_5
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 17
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;

    move-object v14, v2

    goto :goto_0

    .line 18
    :pswitch_6
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 19
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;

    move-object v13, v2

    goto :goto_0

    .line 20
    :pswitch_7
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 21
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;

    move-object v12, v2

    goto :goto_0

    .line 22
    :pswitch_8
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 23
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;

    move-object v11, v2

    goto :goto_0

    .line 24
    :pswitch_9
    invoke-static {v0, v2}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v2

    move v10, v2

    goto :goto_0

    :pswitch_a
    sget-object v3, Landroid/graphics/Point;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 25
    invoke-static {v0, v2, v3}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/graphics/Point;

    move-object v9, v2

    goto/16 :goto_0

    .line 26
    :pswitch_b
    invoke-static {v0, v2}, La3/a;->b(Landroid/os/Parcel;I)[B

    move-result-object v2

    move-object v8, v2

    goto/16 :goto_0

    .line 27
    :pswitch_c
    invoke-static {v0, v2}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto/16 :goto_0

    .line 28
    :pswitch_d
    invoke-static {v0, v2}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto/16 :goto_0

    .line 29
    :pswitch_e
    invoke-static {v0, v2}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    .line 30
    :cond_0
    invoke-static {v0, v1}, La3/a;->k(Landroid/os/Parcel;I)V

    .line 31
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;

    move-object v4, v0

    invoke-direct/range {v4 .. v19}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;-><init>(ILjava/lang/String;Ljava/lang/String;[B[Landroid/graphics/Point;ILcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;

    return-object p1
.end method
