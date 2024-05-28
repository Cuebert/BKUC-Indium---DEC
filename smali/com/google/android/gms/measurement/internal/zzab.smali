.class public final Lcom/google/android/gms/measurement/internal/zzab;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/zzab;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Lcom/google/android/gms/measurement/internal/zzkv;

.field public q:J

.field public r:Z

.field public s:Ljava/lang/String;

.field public final t:Lcom/google/android/gms/measurement/internal/zzat;

.field public u:J

.field public v:Lcom/google/android/gms/measurement/internal/zzat;

.field public final w:J

.field public final x:Lcom/google/android/gms/measurement/internal/zzat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/c;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzab;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzab;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 2
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 6
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    .line 8
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->t:Lcom/google/android/gms/measurement/internal/zzat;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->t:Lcom/google/android/gms/measurement/internal/zzat;

    .line 10
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->u:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->u:J

    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    .line 12
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->w:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzab;->w:J

    .line 13
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzkv;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzat;JLcom/google/android/gms/measurement/internal/zzat;JLcom/google/android/gms/measurement/internal/zzat;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    iput-object p7, p0, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/measurement/internal/zzab;->t:Lcom/google/android/gms/measurement/internal/zzat;

    iput-wide p9, p0, Lcom/google/android/gms/measurement/internal/zzab;->u:J

    iput-object p11, p0, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    iput-wide p12, p0, Lcom/google/android/gms/measurement/internal/zzab;->w:J

    iput-object p14, p0, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 2
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    const/4 v2, 0x3

    .line 3
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    const/4 v2, 0x4

    .line 4
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    const/4 v4, 0x5

    .line 5
    invoke-static {p1, v4, v1, v2}, La3/b;->o(Landroid/os/Parcel;IJ)V

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    const/4 v2, 0x6

    .line 6
    invoke-static {p1, v2, v1}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    const/4 v2, 0x7

    .line 7
    invoke-static {p1, v2, v1, v3}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->t:Lcom/google/android/gms/measurement/internal/zzat;

    const/16 v2, 0x8

    .line 8
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->u:J

    const/16 v4, 0x9

    .line 9
    invoke-static {p1, v4, v1, v2}, La3/b;->o(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    const/16 v2, 0xa

    .line 10
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->w:J

    const/16 v4, 0xb

    .line 11
    invoke-static {p1, v4, v1, v2}, La3/b;->o(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    const/16 v2, 0xc

    .line 12
    invoke-static {p1, v2, v1, p2, v3}, La3/b;->q(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 13
    invoke-static {p1, v0}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
