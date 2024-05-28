.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:D

.field public o:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/bc;

    invoke-direct {v0}, Lw3/bc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->n:D

    iput-wide p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->o:D

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->n:D

    const/4 v2, 0x2

    .line 2
    invoke-static {p1, v2, v0, v1}, La3/b;->h(Landroid/os/Parcel;ID)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->o:D

    const/4 v2, 0x3

    .line 3
    invoke-static {p1, v2, v0, v1}, La3/b;->h(Landroid/os/Parcel;ID)V

    .line 4
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
