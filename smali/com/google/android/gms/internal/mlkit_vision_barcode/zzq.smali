.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;

.field public B:[B

.field public C:Z

.field public D:D

.field public n:I

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:I

.field public r:[Landroid/graphics/Point;

.field public s:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

.field public t:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

.field public u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

.field public v:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;

.field public w:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

.field public x:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

.field public y:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;

.field public z:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/vb;

    invoke-direct {v0}, Lw3/vb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I[Landroid/graphics/Point;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;[BZD)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    move v1, p1

    iput v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->n:I

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->o:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->B:[B

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->p:Ljava/lang/String;

    move v1, p4

    iput v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->q:I

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->r:[Landroid/graphics/Point;

    move/from16 v1, p16

    iput-boolean v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->C:Z

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->D:D

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->s:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

    move-object v1, p7

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->t:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->v:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->w:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->x:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->y:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->z:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->A:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->n:I

    const/4 v2, 0x2

    .line 2
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->o:Ljava/lang/String;

    const/4 v2, 0x3

    const/4 v3, 0x0

    .line 3
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->p:Ljava/lang/String;

    const/4 v2, 0x4

    .line 4
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->q:I

    const/4 v2, 0x5

    .line 5
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->r:[Landroid/graphics/Point;

    const/4 v2, 0x6

    .line 6
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->s:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

    const/4 v2, 0x7

    .line 7
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->t:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    const/16 v2, 0x8

    .line 8
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

    const/16 v2, 0x9

    .line 9
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->v:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;

    const/16 v2, 0xa

    .line 10
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->w:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

    const/16 v2, 0xb

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->x:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

    const/16 v2, 0xc

    .line 12
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->y:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;

    const/16 v2, 0xd

    .line 13
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->z:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;

    const/16 v2, 0xe

    .line 14
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->A:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;

    const/16 v2, 0xf

    .line 15
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->B:[B

    const/16 v1, 0x10

    .line 16
    invoke-static {p1, v1, p2, v3}, La3/b;->f(Landroid/os/Parcel;I[BZ)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->C:Z

    const/16 v1, 0x11

    .line 17
    invoke-static {p1, v1, p2}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->D:D

    const/16 p2, 0x12

    .line 18
    invoke-static {p1, p2, v1, v2}, La3/b;->h(Landroid/os/Parcel;ID)V

    .line 19
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
