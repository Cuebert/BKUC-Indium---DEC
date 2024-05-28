.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

.field private final r:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

.field private final s:[Ljava/lang/String;

.field private final t:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/t;

    invoke-direct {v0}, Lx3/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;Ljava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;[Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->n:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->p:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->q:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->r:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->s:[Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->t:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->n:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->o:Ljava/lang/String;

    const/4 v2, 0x2

    .line 3
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->p:Ljava/lang/String;

    const/4 v2, 0x3

    .line 4
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->q:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    const/4 v2, 0x4

    .line 5
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->r:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    const/4 v2, 0x5

    .line 6
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->s:[Ljava/lang/String;

    const/4 v2, 0x6

    .line 7
    invoke-static {p1, v2, v1, v3}, La3/b;->t(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;->t:[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;

    const/4 v2, 0x7

    .line 8
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    .line 9
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
