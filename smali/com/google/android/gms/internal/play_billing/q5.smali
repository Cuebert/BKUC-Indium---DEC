.class final Lcom/google/android/gms/internal/play_billing/q5;
.super Lcom/google/android/gms/internal/play_billing/r5;
.source "SourceFile"


# instance fields
.field final transient q:I

.field final transient r:I

.field final synthetic s:Lcom/google/android/gms/internal/play_billing/r5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/r5;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/q5;->s:Lcom/google/android/gms/internal/play_billing/r5;

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/r5;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/play_billing/q5;->q:I

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/q5;->r:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->s:Lcom/google/android/gms/internal/play_billing/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/o5;->i()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/q5;->q:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/q5;->r:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->r:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/j5;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->s:Lcom/google/android/gms/internal/play_billing/r5;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/q5;->q:I

    add-int/2addr p1, v1

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final i()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->s:Lcom/google/android/gms/internal/play_billing/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/o5;->i()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/q5;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->s:Lcom/google/android/gms/internal/play_billing/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/o5;->o()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final p(II)Lcom/google/android/gms/internal/play_billing/r5;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->r:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/j5;->d(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->s:Lcom/google/android/gms/internal/play_billing/r5;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/q5;->q:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/r5;->p(II)Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/q5;->r:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/r5;->p(II)Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p1

    return-object p1
.end method
