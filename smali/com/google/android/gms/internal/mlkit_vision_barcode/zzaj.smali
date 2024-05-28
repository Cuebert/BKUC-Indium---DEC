.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:I

.field public o:I

.field public p:I

.field public q:J

.field public r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/j;

    invoke-direct {v0}, Lw3/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->n:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->o:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->p:I

    iput-wide p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->q:J

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->r:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->n:I

    const/4 v1, 0x2

    .line 2
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->o:I

    const/4 v1, 0x3

    .line 3
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->p:I

    const/4 v1, 0x4

    .line 4
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->q:J

    const/4 v2, 0x5

    .line 5
    invoke-static {p1, v2, v0, v1}, La3/b;->o(Landroid/os/Parcel;IJ)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->r:I

    const/4 v1, 0x6

    .line 6
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    .line 7
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
