.class final Ly2/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lcom/google/android/gms/signin/internal/zak;

.field final synthetic o:Ly2/d0;


# direct methods
.method constructor <init>(Ly2/d0;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 0

    iput-object p1, p0, Ly2/b0;->o:Ly2/d0;

    iput-object p2, p0, Ly2/b0;->n:Lcom/google/android/gms/signin/internal/zak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly2/b0;->o:Ly2/d0;

    iget-object v1, p0, Ly2/b0;->n:Lcom/google/android/gms/signin/internal/zak;

    invoke-static {v0, v1}, Ly2/d0;->L0(Ly2/d0;Lcom/google/android/gms/signin/internal/zak;)V

    return-void
.end method
