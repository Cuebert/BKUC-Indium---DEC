.class final Lp3/w;
.super Ly2/e$a;
.source "SourceFile"


# instance fields
.field final synthetic c:Lg4/m;


# direct methods
.method constructor <init>(Lp3/z;Lg4/m;)V
    .locals 0

    iput-object p2, p0, Lp3/w;->c:Lg4/m;

    invoke-direct {p0}, Ly2/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final b0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lp3/w;->c:Lg4/m;

    invoke-static {p1, v0}, Ly2/o;->a(Lcom/google/android/gms/common/api/Status;Lg4/m;)V

    return-void
.end method
