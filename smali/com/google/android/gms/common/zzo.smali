.class public final Lcom/google/android/gms/common/zzo;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/zzo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:Z

.field private final p:Z

.field private final q:Landroid/content/Context;

.field private final r:Z

.field private final s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/s;

    invoke-direct {v0}, Lcom/google/android/gms/common/s;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/zzo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/zzo;->n:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/google/android/gms/common/zzo;->o:Z

    iput-boolean p3, p0, Lcom/google/android/gms/common/zzo;->p:Z

    invoke-static {p4}, Li3/a$a;->l(Landroid/os/IBinder;)Li3/a;

    move-result-object p1

    invoke-static {p1}, Li3/b;->n(Li3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/common/zzo;->q:Landroid/content/Context;

    iput-boolean p5, p0, Lcom/google/android/gms/common/zzo;->r:Z

    iput-boolean p6, p0, Lcom/google/android/gms/common/zzo;->s:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/common/zzo;->n:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2
    invoke-static {p1, v1, v0, v2}, La3/b;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/zzo;->o:Z

    const/4 v1, 0x2

    .line 3
    invoke-static {p1, v1, v0}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/zzo;->p:Z

    const/4 v1, 0x3

    .line 4
    invoke-static {p1, v1, v0}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/common/zzo;->q:Landroid/content/Context;

    .line 5
    invoke-static {v0}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object v0

    const/4 v1, 0x4

    .line 6
    invoke-static {p1, v1, v0, v2}, La3/b;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/zzo;->r:Z

    const/4 v1, 0x5

    .line 7
    invoke-static {p1, v1, v0}, La3/b;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/zzo;->s:Z

    const/4 v1, 0x6

    .line 8
    invoke-static {p1, v1, v0}, La3/b;->c(Landroid/os/Parcel;IZ)V

    .line 9
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
