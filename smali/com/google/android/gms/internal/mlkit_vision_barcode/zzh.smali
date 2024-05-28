.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

.field public r:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

.field public s:[Ljava/lang/String;

.field public t:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/yb;

    invoke-direct {v0}, Lw3/yb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;Ljava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;[Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zze;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->n:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->p:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->q:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->r:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->s:[Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->t:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zze;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->n:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 2
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->o:Ljava/lang/String;

    const/4 v2, 0x3

    .line 3
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->p:Ljava/lang/String;

    const/4 v2, 0x4

    .line 4
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->q:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    const/4 v2, 0x5

    .line 5
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->r:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

    const/4 v2, 0x6

    .line 6
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->s:[Ljava/lang/String;

    const/4 v2, 0x7

    .line 7
    invoke-static {p1, v2, v1, v3}, La3/b;->t(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzh;->t:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zze;

    const/16 v2, 0x8

    .line 8
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    .line 9
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
