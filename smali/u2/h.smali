.class final Lu2/h;
.super Lu2/c;
.source "SourceFile"


# instance fields
.field final synthetic c:Lu2/i;


# direct methods
.method constructor <init>(Lu2/i;)V
    .locals 0

    iput-object p1, p0, Lu2/h;->c:Lu2/i;

    invoke-direct {p0}, Lu2/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lu2/h;->c:Lu2/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lx2/m;)V

    return-void
.end method
