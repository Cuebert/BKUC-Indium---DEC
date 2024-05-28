.class final Lj6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/h;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private final d:Landroid/content/Context;

.field private final e:Li6/c;

.field private final f:Lw3/pa;

.field private g:Lw3/lb;


# direct methods
.method constructor <init>(Landroid/content/Context;Li6/c;Lw3/pa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/k;->d:Landroid/content/Context;

    iput-object p2, p0, Lj6/k;->e:Li6/c;

    iput-object p3, p0, Lj6/k;->f:Lw3/pa;

    return-void
.end method

.method static c(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "com.google.mlkit.dynamite.barcode"

    invoke-static {p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation

    iget-object v0, p0, Lj6/k;->g:Lw3/lb;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lj6/k;->b:Z

    return v0

    :cond_0
    iget-object v0, p0, Lj6/k;->d:Landroid/content/Context;

    .line 1
    invoke-static {v0}, Lj6/k;->c(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0xd

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lj6/k;->b:Z

    .line 2
    :try_start_0
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v1, "com.google.mlkit.dynamite.barcode"

    const-string v3, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator"

    .line 3
    invoke-virtual {p0, v0, v1, v3}, Lj6/k;->d(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;)Lw3/lb;

    move-result-object v0

    iput-object v0, p0, Lj6/k;->g:Lw3/lb;
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    new-instance v1, Lc6/a;

    const-string v3, "Failed to create thick barcode scanner."

    invoke-direct {v1, v3, v2, v0}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 5
    new-instance v1, Lc6/a;

    const-string v3, "Failed to load the bundled barcode module."

    invoke-direct {v1, v3, v2, v0}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_1
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lj6/k;->b:Z

    .line 7
    :try_start_1
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v3, "com.google.android.gms.vision.barcode"

    const-string v4, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator"

    .line 8
    invoke-virtual {p0, v0, v3, v4}, Lj6/k;->d(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;)Lw3/lb;

    move-result-object v0

    iput-object v0, p0, Lj6/k;->g:Lw3/lb;
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    .line 9
    :goto_0
    iget-object v0, p0, Lj6/k;->f:Lw3/pa;

    .line 10
    sget-object v1, Lw3/c8;->o:Lw3/c8;

    invoke-static {v0, v1}, Lj6/b;->e(Lw3/pa;Lw3/c8;)V

    iget-boolean v0, p0, Lj6/k;->b:Z

    return v0

    :catch_2
    move-exception v0

    .line 11
    iget-object v1, p0, Lj6/k;->f:Lw3/pa;

    .line 12
    sget-object v3, Lw3/c8;->Q:Lw3/c8;

    invoke-static {v1, v3}, Lj6/b;->e(Lw3/pa;Lw3/c8;)V

    .line 13
    new-instance v1, Lc6/a;

    const-string v3, "Failed to create thin barcode scanner."

    invoke-direct {v1, v3, v2, v0}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_3
    nop

    .line 14
    iget-boolean v0, p0, Lj6/k;->c:Z

    if-nez v0, :cond_2

    .line 15
    iget-object v0, p0, Lj6/k;->d:Landroid/content/Context;

    const-string v2, "barcode"

    .line 16
    invoke-static {v0, v2}, Lg6/m;->a(Landroid/content/Context;Ljava/lang/String;)V

    iput-boolean v1, p0, Lj6/k;->c:Z

    .line 17
    :cond_2
    iget-object v0, p0, Lj6/k;->f:Lw3/pa;

    .line 18
    sget-object v1, Lw3/c8;->P:Lw3/c8;

    invoke-static {v0, v1}, Lj6/b;->e(Lw3/pa;Lw3/c8;)V

    .line 19
    new-instance v0, Lc6/a;

    const/16 v1, 0xe

    const-string v2, "Waiting for the barcode module to be downloaded. Please wait."

    invoke-direct {v0, v2, v1}, Lc6/a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method public final b(Lk6/a;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/a;",
            ")",
            "Ljava/util/List<",
            "Li6/a;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation

    iget-object v0, p0, Lj6/k;->g:Lw3/lb;

    if-nez v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lj6/k;->a()Z

    :cond_0
    iget-object v0, p0, Lj6/k;->g:Lw3/lb;

    .line 2
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/lb;

    iget-boolean v1, p0, Lj6/k;->a:Z

    const/16 v2, 0xd

    if-nez v1, :cond_1

    .line 3
    :try_start_0
    invoke-virtual {v0}, Lw3/lb;->K0()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lj6/k;->a:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    new-instance v0, Lc6/a;

    const-string v1, "Failed to init barcode scanner."

    invoke-direct {v0, v1, v2, p1}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lk6/a;->i()I

    move-result v1

    .line 6
    invoke-virtual {p1}, Lk6/a;->d()I

    move-result v3

    const/16 v4, 0x23

    if-ne v3, v4, :cond_2

    .line 7
    invoke-virtual {p1}, Lk6/a;->g()[Landroid/media/Image$Plane;

    move-result-object v1

    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/media/Image$Plane;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v1

    :cond_2
    move v5, v1

    .line 8
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzni;

    .line 9
    invoke-virtual {p1}, Lk6/a;->d()I

    move-result v4

    .line 10
    invoke-virtual {p1}, Lk6/a;->e()I

    move-result v6

    .line 11
    invoke-virtual {p1}, Lk6/a;->h()I

    move-result v3

    invoke-static {v3}, Ll6/b;->a(I)I

    move-result v7

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzni;-><init>(IIIIJ)V

    .line 13
    invoke-static {}, Ll6/d;->b()Ll6/d;

    move-result-object v3

    invoke-virtual {v3, p1}, Ll6/d;->a(Lk6/a;)Li3/a;

    move-result-object p1

    .line 14
    :try_start_1
    invoke-virtual {v0, p1, v1}, Lw3/lb;->J0(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzni;)Ljava/util/List;

    move-result-object p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    new-instance v0, Ljava/util/ArrayList;

    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;

    new-instance v2, Li6/a;

    new-instance v3, Lj6/j;

    .line 17
    invoke-direct {v3, v1}, Lj6/j;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmp;)V

    invoke-direct {v2, v3}, Li6/a;-><init>(Lj6/i;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0

    :catch_1
    move-exception p1

    .line 18
    new-instance v0, Lc6/a;

    const-string v1, "Failed to run barcode scanner."

    invoke-direct {v0, v1, v2, p1}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0
.end method

.method final d(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;)Lw3/lb;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/dynamite/DynamiteModule$a;,
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lj6/k;->d:Landroid/content/Context;

    .line 1
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lw3/nb;->i(Landroid/os/IBinder;)Lw3/ob;

    move-result-object p1

    iget-object p2, p0, Lj6/k;->d:Landroid/content/Context;

    .line 3
    invoke-static {p2}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmr;

    iget-object v0, p0, Lj6/k;->e:Li6/c;

    .line 4
    invoke-virtual {v0}, Li6/c;->a()I

    move-result v0

    invoke-direct {p3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmr;-><init>(I)V

    .line 5
    invoke-interface {p1, p2, p3}, Lw3/ob;->Y(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmr;)Lw3/lb;

    move-result-object p1

    return-object p1
.end method

.method public final zzb()V
    .locals 3

    iget-object v0, p0, Lj6/k;->g:Lw3/lb;

    if-eqz v0, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {v0}, Lw3/lb;->L0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DecoupledBarcodeScanner"

    const-string v2, "Failed to release barcode scanner."

    .line 2
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lj6/k;->g:Lw3/lb;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj6/k;->a:Z

    :cond_0
    return-void
.end method
