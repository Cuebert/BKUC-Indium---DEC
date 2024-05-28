.class final Lp3/v;
.super Lp3/b;
.source "SourceFile"


# instance fields
.field final synthetic c:Lg4/m;


# direct methods
.method constructor <init>(Lp3/z;Lg4/m;)V
    .locals 0

    iput-object p2, p0, Lp3/v;->c:Lg4/m;

    invoke-direct {p0}, Lp3/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/identity/BeginSignInResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lp3/v;->c:Lg4/m;

    invoke-static {p1, p2, v0}, Ly2/o;->b(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lg4/m;)V

    return-void
.end method
