.class public final Lcom/google/android/gms/common/internal/s;
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

.method static a(Lcom/google/android/gms/common/internal/GetServiceRequest;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->n:I

    const/4 v2, 0x1

    .line 2
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->o:I

    const/4 v2, 0x2

    .line 3
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->p:I

    const/4 v2, 0x3

    .line 4
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->q:Ljava/lang/String;

    const/4 v2, 0x4

    const/4 v3, 0x0

    .line 5
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->r:Landroid/os/IBinder;

    const/4 v2, 0x5

    .line 6
    invoke-static {p1, v2, v1, v3}, La3/b;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->s:[Lcom/google/android/gms/common/api/Scope;

    const/4 v2, 0x6

    .line 7
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->t:Landroid/os/Bundle;

    const/4 v2, 0x7

    .line 8
    invoke-static {p1, v2, v1, v3}, La3/b;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->u:Landroid/accounts/Account;

    const/16 v2, 0x8

    .line 9
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->v:[Lcom/google/android/gms/common/Feature;

    const/16 v2, 0xa

    .line 10
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->w:[Lcom/google/android/gms/common/Feature;

    const/16 v2, 0xb

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->x:Z

    const/16 v1, 0xc

    .line 12
    invoke-static {p1, v1, p2}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->y:I

    const/16 v1, 0xd

    .line 13
    invoke-static {p1, v1, p2}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->z:Z

    const/16 v1, 0xe

    .line 14
    invoke-static {p1, v1, p2}, La3/b;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/GetServiceRequest;->x()Ljava/lang/String;

    move-result-object p0

    const/16 p2, 0xf

    .line 15
    invoke-static {p1, p2, p0, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 16
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p1

    .line 1
    invoke-static/range {p1 .. p1}, La3/a;->A(Landroid/os/Parcel;)I

    move-result v1

    sget-object v2, Lcom/google/android/gms/common/internal/GetServiceRequest;->B:[Lcom/google/android/gms/common/api/Scope;

    new-instance v3, Landroid/os/Bundle;

    .line 2
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    sget-object v4, Lcom/google/android/gms/common/internal/GetServiceRequest;->C:[Lcom/google/android/gms/common/Feature;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v13, v2

    move-object v14, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v16

    move-object v11, v5

    move-object v12, v11

    move-object v15, v12

    move-object/from16 v21, v15

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    .line 4
    invoke-static/range {p1 .. p1}, La3/a;->r(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, La3/a;->l(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 5
    :pswitch_0
    invoke-static {v0, v2}, La3/a;->z(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :pswitch_1
    invoke-static {v0, v2}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v21

    goto :goto_0

    .line 7
    :pswitch_2
    invoke-static {v0, v2}, La3/a;->m(Landroid/os/Parcel;I)Z

    move-result v20

    goto :goto_0

    .line 8
    :pswitch_3
    invoke-static {v0, v2}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v19

    goto :goto_0

    .line 9
    :pswitch_4
    invoke-static {v0, v2}, La3/a;->m(Landroid/os/Parcel;I)Z

    move-result v18

    goto :goto_0

    :pswitch_5
    sget-object v3, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 10
    invoke-static {v0, v2, v3}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, [Lcom/google/android/gms/common/Feature;

    goto :goto_0

    :pswitch_6
    sget-object v3, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 11
    invoke-static {v0, v2, v3}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, [Lcom/google/android/gms/common/Feature;

    goto :goto_0

    :pswitch_7
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 12
    invoke-static {v0, v2, v3}, La3/a;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/accounts/Account;

    goto :goto_0

    .line 13
    :pswitch_8
    invoke-static {v0, v2}, La3/a;->a(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v14

    goto :goto_0

    :pswitch_9
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 14
    invoke-static {v0, v2, v3}, La3/a;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, [Lcom/google/android/gms/common/api/Scope;

    goto :goto_0

    .line 15
    :pswitch_a
    invoke-static {v0, v2}, La3/a;->s(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v12

    goto :goto_0

    .line 16
    :pswitch_b
    invoke-static {v0, v2}, La3/a;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    .line 17
    :pswitch_c
    invoke-static {v0, v2}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v10

    goto :goto_0

    .line 18
    :pswitch_d
    invoke-static {v0, v2}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_0

    .line 19
    :pswitch_e
    invoke-static {v0, v2}, La3/a;->t(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v0, v1}, La3/a;->k(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/common/internal/GetServiceRequest;

    move-object v7, v0

    .line 21
    invoke-direct/range {v7 .. v21}, Lcom/google/android/gms/common/internal/GetServiceRequest;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/Feature;[Lcom/google/android/gms/common/Feature;ZIZLjava/lang/String;)V

    return-object v0

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
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/common/internal/GetServiceRequest;

    return-object p1
.end method
