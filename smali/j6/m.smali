.class final Lj6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/h;


# instance fields
.field private a:Z

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;

.field private final d:Lw3/pa;

.field private e:Lw3/f;


# direct methods
.method constructor <init>(Landroid/content/Context;Li6/c;Lw3/pa;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;-><init>()V

    iput-object v0, p0, Lj6/m;->c:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;

    iput-object p1, p0, Lj6/m;->b:Landroid/content/Context;

    .line 2
    invoke-virtual {p2}, Li6/c;->a()I

    move-result p1

    iput p1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;->n:I

    iput-object p3, p0, Lj6/m;->d:Lw3/pa;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc6/a;
        }
    .end annotation

    iget-object v0, p0, Lj6/m;->e:Lw3/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0xd

    :try_start_0
    iget-object v2, p0, Lj6/m;->b:Landroid/content/Context;

    .line 1
    sget-object v3, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v4, "com.google.android.gms.vision.dynamite"

    .line 2
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v2

    const-string v3, "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"

    .line 3
    invoke-virtual {v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    .line 4
    invoke-static {v2}, Lw3/h;->i(Landroid/os/IBinder;)Lw3/i;

    move-result-object v2

    iget-object v3, p0, Lj6/m;->b:Landroid/content/Context;

    .line 5
    invoke-static {v3}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object v3

    iget-object v4, p0, Lj6/m;->c:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;

    .line 6
    invoke-interface {v2, v3, v4}, Lw3/i;->p(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzad;)Lw3/f;

    move-result-object v2

    iput-object v2, p0, Lj6/m;->e:Lw3/f;

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lj6/m;->a:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "LegacyBarcodeScanner"

    const-string v2, "Request optional module download."

    .line 7
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lj6/m;->b:Landroid/content/Context;

    const-string v2, "barcode"

    .line 8
    invoke-static {v1, v2}, Lg6/m;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lj6/m;->a:Z

    iget-object v1, p0, Lj6/m;->d:Lw3/pa;

    .line 9
    sget-object v2, Lw3/c8;->P:Lw3/c8;

    invoke-static {v1, v2}, Lj6/b;->e(Lw3/pa;Lw3/c8;)V

    .line 10
    new-instance v1, Lc6/a;

    const-string v2, "Waiting for the barcode module to be downloaded. Please wait."

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3}, Lc6/a;-><init>(Ljava/lang/String;I)V

    throw v1

    .line 11
    :cond_2
    :goto_0
    iget-object v2, p0, Lj6/m;->d:Lw3/pa;

    .line 12
    sget-object v3, Lw3/c8;->o:Lw3/c8;

    invoke-static {v2, v3}, Lj6/b;->e(Lw3/pa;Lw3/c8;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v1

    .line 13
    new-instance v2, Lc6/a;

    const-string v3, "Failed to load deprecated vision dynamite module."

    invoke-direct {v2, v3, v0, v1}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    .line 14
    new-instance v2, Lc6/a;

    const-string v3, "Failed to create legacy barcode detector."

    invoke-direct {v2, v3, v0, v1}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2
.end method

.method public final b(Lk6/a;)Ljava/util/List;
    .locals 9
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

    iget-object v0, p0, Lj6/m;->e:Lw3/f;

    if-nez v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lj6/m;->a()Z

    :cond_0
    iget-object v0, p0, Lj6/m;->e:Lw3/f;

    if-eqz v0, :cond_6

    .line 2
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/f;

    .line 3
    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;

    .line 4
    invoke-virtual {p1}, Lk6/a;->i()I

    move-result v2

    .line 5
    invoke-virtual {p1}, Lk6/a;->e()I

    move-result v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    .line 6
    invoke-virtual {p1}, Lk6/a;->h()I

    move-result v1

    invoke-static {v1}, Ll6/b;->a(I)I

    move-result v7

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;-><init>(IIIJI)V

    .line 7
    :try_start_0
    invoke-virtual {p1}, Lk6/a;->d()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_4

    const/16 v2, 0x11

    if-eq v1, v2, :cond_3

    const/16 v2, 0x23

    if-eq v1, v2, :cond_2

    const v2, 0x32315659

    if-ne v1, v2, :cond_1

    .line 8
    invoke-static {}, Ll6/c;->d()Ll6/c;

    move-result-object v1

    .line 9
    invoke-virtual {v1, p1, v3}, Ll6/c;->c(Lk6/a;Z)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 10
    invoke-static {p1}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object p1

    .line 11
    invoke-virtual {v0, p1, v8}, Lw3/f;->J0(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    move-result-object p1

    goto :goto_0

    .line 12
    :cond_1
    new-instance v0, Lc6/a;

    .line 13
    invoke-virtual {p1}, Lk6/a;->d()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x25

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unsupported image format: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lc6/a;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 14
    :cond_2
    invoke-virtual {p1}, Lk6/a;->g()[Landroid/media/Image$Plane;

    move-result-object p1

    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/media/Image$Plane;

    .line 15
    aget-object v1, p1, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v1

    iput v1, v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;->n:I

    .line 16
    aget-object p1, p1, v3

    .line 17
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object p1

    .line 18
    invoke-virtual {v0, p1, v8}, Lw3/f;->J0(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    move-result-object p1

    goto :goto_0

    .line 19
    :cond_3
    invoke-virtual {p1}, Lk6/a;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object p1

    .line 20
    invoke-virtual {v0, p1, v8}, Lw3/f;->J0(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    move-result-object p1

    goto :goto_0

    .line 21
    :cond_4
    invoke-virtual {p1}, Lk6/a;->b()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object p1

    .line 22
    invoke-virtual {v0, p1, v8}, Lw3/f;->K0(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaj;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    move-result-object p1

    .line 23
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    array-length v1, p1

    :goto_1
    if-ge v3, v1, :cond_5

    aget-object v2, p1, v3

    new-instance v4, Li6/a;

    new-instance v5, Lj6/l;

    .line 26
    invoke-direct {v5, v2}, Lj6/l;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;)V

    invoke-direct {v4, v5}, Li6/a;-><init>(Lj6/i;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    return-object v0

    :catch_0
    move-exception p1

    .line 27
    new-instance v0, Lc6/a;

    const/16 v1, 0xd

    const-string v2, "Failed to detect with legacy barcode detector"

    invoke-direct {v0, v2, v1, p1}, Lc6/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    .line 28
    :cond_6
    new-instance p1, Lc6/a;

    const/16 v0, 0xe

    const-string v1, "Error initializing the legacy barcode scanner."

    invoke-direct {p1, v1, v0}, Lc6/a;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method public final zzb()V
    .locals 3

    iget-object v0, p0, Lj6/m;->e:Lw3/f;

    if-eqz v0, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {v0}, Lw3/f;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "LegacyBarcodeScanner"

    const-string v2, "Failed to release legacy barcode detector."

    .line 2
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lj6/m;->e:Lw3/f;

    :cond_0
    return-void
.end method
