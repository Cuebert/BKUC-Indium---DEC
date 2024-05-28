.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/l;

    invoke-direct {v0}, Lx3/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIIJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->n:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->o:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->p:I

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->q:I

    iput-wide p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->r:J

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->o:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->n:I

    const/4 v1, 0x1

    .line 2
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->o:I

    const/4 v1, 0x2

    .line 3
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->p:I

    const/4 v1, 0x3

    .line 4
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->q:I

    const/4 v1, 0x4

    .line 5
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->r:J

    const/4 v2, 0x5

    .line 6
    invoke-static {p1, v2, v0, v1}, La3/b;->o(Landroid/os/Parcel;IJ)V

    .line 7
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->p:I

    return v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->n:I

    return v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->q:I

    return v0
.end method
