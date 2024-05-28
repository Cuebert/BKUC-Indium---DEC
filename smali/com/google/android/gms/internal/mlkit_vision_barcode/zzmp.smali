.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;

.field private final B:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;

.field private final n:I

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:[B

.field private final r:[Landroid/graphics/Point;

.field private final s:I

.field private final t:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;

.field private final u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;

.field private final v:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;

.field private final w:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;

.field private final x:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;

.field private final y:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;

.field private final z:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/db;

    invoke-direct {v0}, Lw3/db;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;[B[Landroid/graphics/Point;ILcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->n:I

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->p:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->q:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->r:[Landroid/graphics/Point;

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->s:I

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->t:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;

    iput-object p9, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->v:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;

    iput-object p10, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->w:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;

    iput-object p11, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->x:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;

    iput-object p12, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->y:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;

    iput-object p13, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->z:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;

    iput-object p14, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->A:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;

    iput-object p15, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->B:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->n:I

    const/4 v2, 0x1

    .line 2
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->o:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 3
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->p:Ljava/lang/String;

    const/4 v2, 0x3

    .line 4
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->q:[B

    const/4 v2, 0x4

    .line 5
    invoke-static {p1, v2, v1, v3}, La3/b;->f(Landroid/os/Parcel;I[BZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->r:[Landroid/graphics/Point;

    const/4 v2, 0x5

    .line 6
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->v(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->s:I

    const/4 v2, 0x6

    .line 7
    invoke-static {p1, v2, v1}, La3/b;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->t:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmi;

    const/4 v2, 0x7

    .line 8
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzml;

    const/16 v2, 0x8

    .line 9
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->v:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmm;

    const/16 v2, 0x9

    .line 10
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->w:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmo;

    const/16 v2, 0xa

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->x:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmn;

    const/16 v2, 0xb

    .line 12
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->y:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmj;

    const/16 v2, 0xc

    .line 13
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->z:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmf;

    const/16 v2, 0xd

    .line 14
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->A:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmg;

    const/16 v2, 0xe

    .line 15
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->B:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmh;

    const/16 v2, 0xf

    .line 16
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 17
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->n:I

    return v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->s:I

    return v0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;->p:Ljava/lang/String;

    return-object v0
.end method
