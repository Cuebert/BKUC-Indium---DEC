.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/wb;

    invoke-direct {v0}, Lw3/wb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(IIIIIIZLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->n:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->o:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->p:I

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->q:I

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->r:I

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->s:I

    iput-boolean p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->t:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->n:I

    const/4 v1, 0x2

    .line 2
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->o:I

    const/4 v1, 0x3

    .line 3
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->p:I

    const/4 v1, 0x4

    .line 4
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->q:I

    const/4 v1, 0x5

    .line 5
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->r:I

    const/4 v1, 0x6

    .line 6
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->s:I

    const/4 v1, 0x7

    .line 7
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->t:Z

    const/16 v1, 0x8

    .line 8
    invoke-static {p1, v1, v0}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzf;->u:Ljava/lang/String;

    const/16 v1, 0x9

    const/4 v2, 0x0

    .line 9
    invoke-static {p1, v1, v0, v2}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 10
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
