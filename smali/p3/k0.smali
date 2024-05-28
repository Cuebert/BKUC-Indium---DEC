.class final Lp3/k0;
.super Lp3/e0;
.source "SourceFile"


# instance fields
.field private final c:Ly2/c;


# direct methods
.method constructor <init>(Ly2/c;)V
    .locals 0

    invoke-direct {p0}, Lp3/e0;-><init>()V

    iput-object p1, p0, Lp3/k0;->c:Ly2/c;

    return-void
.end method


# virtual methods
.method public final g(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lp3/k0;->c:Ly2/c;

    invoke-interface {v0, p1}, Ly2/c;->a(Ljava/lang/Object;)V

    return-void
.end method
