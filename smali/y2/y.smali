.class public final Ly2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/a0;

.field public final b:I

.field public final c:Lx2/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/e<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/a0;ILx2/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/a0;",
            "I",
            "Lx2/e<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/y;->a:Lcom/google/android/gms/common/api/internal/a0;

    iput p2, p0, Ly2/y;->b:I

    iput-object p3, p0, Ly2/y;->c:Lx2/e;

    return-void
.end method
