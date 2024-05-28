.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;

.field private final B:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;

.field private final n:I

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:[B

.field private final r:[Landroid/graphics/Point;

.field private final s:I

.field private final t:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

.field private final u:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

.field private final v:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;

.field private final w:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;

.field private final x:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;

.field private final y:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;

.field private final z:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/p;

    invoke-direct {v0}, Lx3/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;[B[Landroid/graphics/Point;ILcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->n:I

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->p:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->q:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->r:[Landroid/graphics/Point;

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->s:I

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->t:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    iput-object p9, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->v:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;

    iput-object p10, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->w:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;

    iput-object p11, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->x:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;

    iput-object p12, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->y:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;

    iput-object p13, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->z:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;

    iput-object p14, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->A:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;

    iput-object p15, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->B:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->n:I

    const/4 v2, 0x1

    .line 2
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->o:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 3
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->p:Ljava/lang/String;

    const/4 v2, 0x3

    .line 4
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->q:[B

    const/4 v2, 0x4

    .line 5
    invoke-static {p1, v2, v1, v3}, La3/b;->f(Landroid/os/Parcel;I[BZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->r:[Landroid/graphics/Point;

    const/4 v2, 0x5

    .line 6
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->s:I

    const/4 v2, 0x6

    .line 7
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->t:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    const/4 v2, 0x7

    .line 8
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    const/16 v2, 0x8

    .line 9
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->v:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;

    const/16 v2, 0x9

    .line 10
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->w:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;

    const/16 v2, 0xa

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->x:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;

    const/16 v2, 0xb

    .line 12
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->y:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;

    const/16 v2, 0xc

    .line 13
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->z:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;

    const/16 v2, 0xd

    .line 14
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->A:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;

    const/16 v2, 0xe

    .line 15
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;->B:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;

    const/16 v2, 0xf

    .line 16
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 17
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
