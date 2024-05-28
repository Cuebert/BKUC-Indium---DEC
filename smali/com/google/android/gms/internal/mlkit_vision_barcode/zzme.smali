.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:Z

.field private final u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/fb;

    invoke-direct {v0}, Lw3/fb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIIIIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->n:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->o:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->p:I

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->q:I

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->r:I

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->s:I

    iput-boolean p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->t:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->n:I

    const/4 v1, 0x1

    .line 2
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->o:I

    const/4 v1, 0x2

    .line 3
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->p:I

    const/4 v1, 0x3

    .line 4
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->q:I

    const/4 v1, 0x4

    .line 5
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->r:I

    const/4 v1, 0x5

    .line 6
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->s:I

    const/4 v1, 0x6

    .line 7
    invoke-static {p1, v1, v0}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->t:Z

    const/4 v1, 0x7

    .line 8
    invoke-static {p1, v1, v0}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzme;->u:Ljava/lang/String;

    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 9
    invoke-static {p1, v1, v0, v2}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 10
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
