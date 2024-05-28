.class final Lcom/google/mlkit/vision/barcode/bundled/internal/a;
.super Lx3/b;
.source "SourceFile"


# instance fields
.field private final c:Lcom/google/android/libraries/barhopper/RecognitionOptions;

.field private d:Lcom/google/android/libraries/barhopper/BarhopperV2;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx3/b;-><init>()V

    new-instance p1, Lcom/google/android/libraries/barhopper/RecognitionOptions;

    .line 2
    invoke-direct {p1}, Lcom/google/android/libraries/barhopper/RecognitionOptions;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->c:Lcom/google/android/libraries/barhopper/RecognitionOptions;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzs;->x()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/libraries/barhopper/RecognitionOptions;->a(I)V

    return-void
.end method

.method private static l(Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;
    .locals 10

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;

    iget v1, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->year:I

    iget v2, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->month:I

    iget v3, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->day:I

    iget v4, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->hours:I

    iget v5, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->minutes:I

    iget v6, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->seconds:I

    iget-boolean v7, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->isUtc:Z

    iget-object v8, p0, Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;->rawValue:Ljava/lang/String;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;-><init>(IIIIIIZLjava/lang/String;)V

    return-object v9
.end method

.method private final n(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;)[Lcom/google/android/libraries/barhopper/Barcode;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->d:Lcom/google/android/libraries/barhopper/BarhopperV2;

    .line 1
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/barhopper/BarhopperV2;

    .line 2
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->A()I

    move-result v1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->x()I

    move-result p2

    iget-object v2, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->c:Lcom/google/android/libraries/barhopper/RecognitionOptions;

    .line 4
    invoke-virtual {v0, v1, p2, p1, v2}, Lcom/google/android/libraries/barhopper/BarhopperV2;->c(IILjava/nio/ByteBuffer;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[Lcom/google/android/libraries/barhopper/Barcode;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_1

    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->A()I

    move-result v1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->x()I

    move-result p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iget-object v2, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->c:Lcom/google/android/libraries/barhopper/RecognitionOptions;

    .line 7
    invoke-virtual {v0, v1, p2, p1, v2}, Lcom/google/android/libraries/barhopper/BarhopperV2;->e(II[BLcom/google/android/libraries/barhopper/RecognitionOptions;)[Lcom/google/android/libraries/barhopper/Barcode;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    .line 9
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->A()I

    move-result p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->x()I

    move-result p2

    iget-object v2, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->c:Lcom/google/android/libraries/barhopper/RecognitionOptions;

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/google/android/libraries/barhopper/BarhopperV2;->e(II[BLcom/google/android/libraries/barhopper/RecognitionOptions;)[Lcom/google/android/libraries/barhopper/Barcode;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->d:Lcom/google/android/libraries/barhopper/BarhopperV2;

    if-eqz v0, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/google/android/libraries/barhopper/BarhopperV2;

    invoke-direct {v0}, Lcom/google/android/libraries/barhopper/BarhopperV2;-><init>()V

    iput-object v0, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->d:Lcom/google/android/libraries/barhopper/BarhopperV2;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/libraries/barhopper/BarhopperV2;->b()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->d:Lcom/google/android/libraries/barhopper/BarhopperV2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/libraries/barhopper/BarhopperV2;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->d:Lcom/google/android/libraries/barhopper/BarhopperV2;

    :cond_0
    return-void
.end method

.method public final w(Li3/a;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;)Ljava/util/List;
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/a;",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->y()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_3

    const/16 v3, 0x11

    if-eq v2, v3, :cond_2

    const/16 v3, 0x23

    if-eq v2, v3, :cond_1

    const v3, 0x32315659

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 3
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->y()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x25

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unsupported image format: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 4
    :cond_1
    invoke-static/range {p1 .. p1}, Li3/b;->n(Li3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/Image;

    .line 5
    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/Image;

    invoke-virtual {v2}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v2

    aget-object v2, v2, v4

    invoke-virtual {v2}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->n(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;)[Lcom/google/android/libraries/barhopper/Barcode;

    move-result-object v2

    goto :goto_1

    .line 6
    :cond_2
    :goto_0
    invoke-static/range {p1 .. p1}, Li3/b;->n(Li3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-direct {v0, v2, v1}, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->n(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;)[Lcom/google/android/libraries/barhopper/Barcode;

    move-result-object v2

    goto :goto_1

    .line 7
    :cond_3
    iget-object v2, v0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->d:Lcom/google/android/libraries/barhopper/BarhopperV2;

    .line 8
    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/libraries/barhopper/BarhopperV2;

    invoke-static/range {p1 .. p1}, Li3/b;->n(Li3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    iget-object v5, v0, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->c:Lcom/google/android/libraries/barhopper/RecognitionOptions;

    invoke-virtual {v2, v3, v5}, Lcom/google/android/libraries/barhopper/BarhopperV2;->i(Landroid/graphics/Bitmap;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[Lcom/google/android/libraries/barhopper/Barcode;

    move-result-object v2

    .line 9
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    .line 10
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-static {}, Ll6/d;->b()Ll6/d;

    move-result-object v5

    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->A()I

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->x()I

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->z()I

    move-result v8

    .line 13
    invoke-virtual {v5, v6, v7, v8}, Ll6/d;->d(III)Landroid/graphics/Matrix;

    move-result-object v5

    .line 14
    array-length v6, v2

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_16

    aget-object v8, v2, v7

    .line 15
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->cornerPoints:[Landroid/graphics/Point;

    if-eqz v9, :cond_5

    if-eqz v5, :cond_5

    const/16 v9, 0x8

    new-array v9, v9, [F

    const/4 v10, 0x0

    .line 16
    :goto_3
    iget-object v11, v8, Lcom/google/android/libraries/barhopper/Barcode;->cornerPoints:[Landroid/graphics/Point;

    array-length v12, v11

    if-ge v10, v12, :cond_4

    add-int v12, v10, v10

    .line 17
    aget-object v13, v11, v10

    iget v13, v13, Landroid/graphics/Point;->x:I

    int-to-float v13, v13

    aput v13, v9, v12

    add-int/lit8 v12, v12, 0x1

    .line 18
    aget-object v11, v11, v10

    iget v11, v11, Landroid/graphics/Point;->y:I

    int-to-float v11, v11

    aput v11, v9, v12

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 19
    :cond_4
    invoke-virtual {v5, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 20
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzak;->z()I

    move-result v10

    const/4 v11, 0x0

    .line 21
    :goto_4
    iget-object v12, v8, Lcom/google/android/libraries/barhopper/Barcode;->cornerPoints:[Landroid/graphics/Point;

    array-length v13, v12

    if-ge v11, v13, :cond_5

    add-int v14, v11, v10

    .line 22
    rem-int/2addr v14, v13

    aget-object v12, v12, v14

    add-int v13, v11, v11

    .line 23
    aget v14, v9, v13

    float-to-int v14, v14

    iput v14, v12, Landroid/graphics/Point;->x:I

    add-int/lit8 v13, v13, 0x1

    .line 24
    aget v13, v9, v13

    float-to-int v13, v13

    iput v13, v12, Landroid/graphics/Point;->y:I

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 25
    :cond_5
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->email:Lcom/google/android/libraries/barhopper/Barcode$Email;

    if-eqz v9, :cond_6

    .line 26
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    iget v12, v9, Lcom/google/android/libraries/barhopper/Barcode$Email;->type:I

    iget-object v13, v9, Lcom/google/android/libraries/barhopper/Barcode$Email;->address:Ljava/lang/String;

    iget-object v14, v9, Lcom/google/android/libraries/barhopper/Barcode$Email;->subject:Ljava/lang/String;

    iget-object v9, v9, Lcom/google/android/libraries/barhopper/Barcode$Email;->body:Ljava/lang/String;

    invoke-direct {v11, v12, v13, v14, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v22, v11

    goto :goto_5

    :cond_6
    const/16 v22, 0x0

    .line 27
    :goto_5
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->phone:Lcom/google/android/libraries/barhopper/Barcode$Phone;

    if-eqz v9, :cond_7

    .line 28
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    iget v12, v9, Lcom/google/android/libraries/barhopper/Barcode$Phone;->type:I

    iget-object v9, v9, Lcom/google/android/libraries/barhopper/Barcode$Phone;->number:Ljava/lang/String;

    invoke-direct {v11, v12, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;-><init>(ILjava/lang/String;)V

    move-object/from16 v23, v11

    goto :goto_6

    :cond_7
    const/16 v23, 0x0

    .line 29
    :goto_6
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->sms:Lcom/google/android/libraries/barhopper/Barcode$Sms;

    if-eqz v9, :cond_8

    .line 30
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;

    iget-object v12, v9, Lcom/google/android/libraries/barhopper/Barcode$Sms;->message:Ljava/lang/String;

    iget-object v9, v9, Lcom/google/android/libraries/barhopper/Barcode$Sms;->phoneNumber:Ljava/lang/String;

    invoke-direct {v11, v12, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v24, v11

    goto :goto_7

    :cond_8
    const/16 v24, 0x0

    .line 31
    :goto_7
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->wifi:Lcom/google/android/libraries/barhopper/Barcode$WiFi;

    if-eqz v9, :cond_9

    .line 32
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;

    iget-object v12, v9, Lcom/google/android/libraries/barhopper/Barcode$WiFi;->ssid:Ljava/lang/String;

    iget-object v13, v9, Lcom/google/android/libraries/barhopper/Barcode$WiFi;->password:Ljava/lang/String;

    iget v9, v9, Lcom/google/android/libraries/barhopper/Barcode$WiFi;->encryptionType:I

    invoke-direct {v11, v12, v13, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object/from16 v25, v11

    goto :goto_8

    :cond_9
    const/16 v25, 0x0

    .line 33
    :goto_8
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->url:Lcom/google/android/libraries/barhopper/Barcode$UrlBookmark;

    if-eqz v9, :cond_a

    .line 34
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;

    iget-object v12, v9, Lcom/google/android/libraries/barhopper/Barcode$UrlBookmark;->title:Ljava/lang/String;

    iget-object v9, v9, Lcom/google/android/libraries/barhopper/Barcode$UrlBookmark;->url:Ljava/lang/String;

    invoke-direct {v11, v12, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v26, v11

    goto :goto_9

    :cond_a
    const/16 v26, 0x0

    .line 35
    :goto_9
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->geoPoint:Lcom/google/android/libraries/barhopper/Barcode$GeoPoint;

    if-eqz v9, :cond_b

    .line 36
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;

    iget-wide v12, v9, Lcom/google/android/libraries/barhopper/Barcode$GeoPoint;->lat:D

    iget-wide v14, v9, Lcom/google/android/libraries/barhopper/Barcode$GeoPoint;->lng:D

    invoke-direct {v11, v12, v13, v14, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;-><init>(DD)V

    move-object/from16 v27, v11

    goto :goto_a

    :cond_b
    const/16 v27, 0x0

    .line 37
    :goto_a
    iget-object v9, v8, Lcom/google/android/libraries/barhopper/Barcode;->calendarEvent:Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;

    if-eqz v9, :cond_c

    .line 38
    new-instance v19, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;

    iget-object v12, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->summary:Ljava/lang/String;

    iget-object v13, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->description:Ljava/lang/String;

    iget-object v14, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->location:Ljava/lang/String;

    iget-object v15, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->organizer:Ljava/lang/String;

    iget-object v11, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->status:Ljava/lang/String;

    iget-object v4, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->start:Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;

    .line 39
    invoke-static {v4}, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->l(Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;

    move-result-object v17

    iget-object v4, v9, Lcom/google/android/libraries/barhopper/Barcode$CalendarEvent;->end:Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;

    .line 40
    invoke-static {v4}, Lcom/google/mlkit/vision/barcode/bundled/internal/a;->l(Lcom/google/android/libraries/barhopper/Barcode$CalendarDateTime;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;

    move-result-object v18

    move-object v4, v11

    move-object/from16 v11, v19

    move-object/from16 v16, v4

    invoke-direct/range {v11 .. v18}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzf;)V

    move-object/from16 v28, v19

    goto :goto_b

    :cond_c
    const/16 v28, 0x0

    .line 41
    :goto_b
    iget-object v4, v8, Lcom/google/android/libraries/barhopper/Barcode;->contactInfo:Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;

    if-eqz v4, :cond_14

    .line 42
    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;

    iget-object v11, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->name:Lcom/google/android/libraries/barhopper/Barcode$PersonName;

    if-eqz v11, :cond_d

    .line 43
    new-instance v20, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;

    iget-object v13, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->formattedName:Ljava/lang/String;

    iget-object v14, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->pronunciation:Ljava/lang/String;

    iget-object v15, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->prefix:Ljava/lang/String;

    iget-object v12, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->first:Ljava/lang/String;

    iget-object v10, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->middle:Ljava/lang/String;

    iget-object v0, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->last:Ljava/lang/String;

    iget-object v11, v11, Lcom/google/android/libraries/barhopper/Barcode$PersonName;->suffix:Ljava/lang/String;

    move-object/from16 v16, v12

    move-object/from16 v12, v20

    move-object/from16 v17, v10

    move-object/from16 v18, v0

    move-object/from16 v19, v11

    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_d
    const/4 v12, 0x0

    :goto_c
    iget-object v13, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->organization:Ljava/lang/String;

    iget-object v14, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->title:Ljava/lang/String;

    iget-object v0, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->phones:[Lcom/google/android/libraries/barhopper/Barcode$Phone;

    if-nez v0, :cond_e

    const/4 v15, 0x0

    goto :goto_e

    .line 44
    :cond_e
    array-length v10, v0

    new-array v10, v10, [Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    const/4 v11, 0x0

    :goto_d
    array-length v15, v0

    if-ge v11, v15, :cond_f

    .line 45
    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;

    aget-object v1, v0, v11

    move-object/from16 v16, v0

    iget v0, v1, Lcom/google/android/libraries/barhopper/Barcode$Phone;->type:I

    iget-object v1, v1, Lcom/google/android/libraries/barhopper/Barcode$Phone;->number:Ljava/lang/String;

    invoke-direct {v15, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;-><init>(ILjava/lang/String;)V

    aput-object v15, v10, v11

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p2

    move-object/from16 v0, v16

    goto :goto_d

    :cond_f
    move-object v15, v10

    .line 46
    :goto_e
    iget-object v0, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->emails:[Lcom/google/android/libraries/barhopper/Barcode$Email;

    if-nez v0, :cond_10

    move-object/from16 v31, v2

    move-object/from16 v32, v5

    move/from16 v33, v6

    const/16 v16, 0x0

    goto :goto_10

    .line 47
    :cond_10
    array-length v1, v0

    new-array v1, v1, [Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    const/4 v10, 0x0

    :goto_f
    array-length v11, v0

    if-ge v10, v11, :cond_11

    .line 48
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;

    move-object/from16 v31, v2

    aget-object v2, v0, v10

    move-object/from16 v16, v0

    iget v0, v2, Lcom/google/android/libraries/barhopper/Barcode$Email;->type:I

    move-object/from16 v32, v5

    iget-object v5, v2, Lcom/google/android/libraries/barhopper/Barcode$Email;->address:Ljava/lang/String;

    move/from16 v33, v6

    iget-object v6, v2, Lcom/google/android/libraries/barhopper/Barcode$Email;->subject:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/libraries/barhopper/Barcode$Email;->body:Ljava/lang/String;

    invoke-direct {v11, v0, v5, v6, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v11, v1, v10

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, v16

    move-object/from16 v2, v31

    move-object/from16 v5, v32

    move/from16 v6, v33

    goto :goto_f

    :cond_11
    move-object/from16 v31, v2

    move-object/from16 v32, v5

    move/from16 v33, v6

    move-object/from16 v16, v1

    .line 49
    :goto_10
    iget-object v0, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->urls:[Ljava/lang/String;

    iget-object v1, v4, Lcom/google/android/libraries/barhopper/Barcode$ContactInfo;->addresses:[Lcom/google/android/libraries/barhopper/Barcode$Address;

    if-nez v1, :cond_12

    const/16 v18, 0x0

    goto :goto_12

    .line 50
    :cond_12
    array-length v2, v1

    new-array v2, v2, [Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;

    const/4 v4, 0x0

    :goto_11
    array-length v5, v1

    if-ge v4, v5, :cond_13

    .line 51
    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;

    aget-object v6, v1, v4

    iget v10, v6, Lcom/google/android/libraries/barhopper/Barcode$Address;->type:I

    iget-object v6, v6, Lcom/google/android/libraries/barhopper/Barcode$Address;->addressLines:[Ljava/lang/String;

    invoke-direct {v5, v10, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;-><init>(I[Ljava/lang/String;)V

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    :cond_13
    move-object/from16 v18, v2

    :goto_12
    move-object v11, v9

    move-object/from16 v17, v0

    .line 52
    invoke-direct/range {v11 .. v18}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzl;Ljava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;[Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zze;)V

    move-object/from16 v29, v9

    goto :goto_13

    :cond_14
    move-object/from16 v31, v2

    move-object/from16 v32, v5

    move/from16 v33, v6

    const/16 v29, 0x0

    .line 53
    :goto_13
    iget-object v0, v8, Lcom/google/android/libraries/barhopper/Barcode;->driverLicense:Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;

    if-eqz v0, :cond_15

    .line 54
    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;

    iget-object v1, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->documentType:Ljava/lang/String;

    iget-object v2, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->firstName:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->middleName:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->lastName:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->gender:Ljava/lang/String;

    iget-object v9, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->addressStreet:Ljava/lang/String;

    iget-object v11, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->addressCity:Ljava/lang/String;

    iget-object v12, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->addressState:Ljava/lang/String;

    iget-object v13, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->addressZip:Ljava/lang/String;

    iget-object v14, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->licenseNumber:Ljava/lang/String;

    iget-object v15, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->issueDate:Ljava/lang/String;

    move/from16 v49, v7

    iget-object v7, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->expiryDate:Ljava/lang/String;

    move-object/from16 v50, v3

    iget-object v3, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->birthDate:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/libraries/barhopper/Barcode$DriverLicense;->issuingCountry:Ljava/lang/String;

    move-object/from16 v34, v10

    move-object/from16 v35, v1

    move-object/from16 v36, v2

    move-object/from16 v37, v4

    move-object/from16 v38, v5

    move-object/from16 v39, v6

    move-object/from16 v40, v9

    move-object/from16 v41, v11

    move-object/from16 v42, v12

    move-object/from16 v43, v13

    move-object/from16 v44, v14

    move-object/from16 v45, v15

    move-object/from16 v46, v7

    move-object/from16 v47, v3

    move-object/from16 v48, v0

    invoke-direct/range {v34 .. v48}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v30, v10

    goto :goto_14

    :cond_15
    move-object/from16 v50, v3

    move/from16 v49, v7

    const/16 v30, 0x0

    .line 55
    :goto_14
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;

    iget v1, v8, Lcom/google/android/libraries/barhopper/Barcode;->format:I

    iget-object v2, v8, Lcom/google/android/libraries/barhopper/Barcode;->displayValue:Ljava/lang/String;

    iget-object v3, v8, Lcom/google/android/libraries/barhopper/Barcode;->rawValue:Ljava/lang/String;

    iget-object v4, v8, Lcom/google/android/libraries/barhopper/Barcode;->rawBytes:[B

    iget-object v5, v8, Lcom/google/android/libraries/barhopper/Barcode;->cornerPoints:[Landroid/graphics/Point;

    iget v6, v8, Lcom/google/android/libraries/barhopper/Barcode;->valueFormat:I

    move-object v15, v0

    move/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move/from16 v21, v6

    invoke-direct/range {v15 .. v30}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzq;-><init>(ILjava/lang/String;Ljava/lang/String;[B[Landroid/graphics/Point;ILcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzm;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzn;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzp;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzo;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzk;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzg;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzh;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzi;)V

    move-object/from16 v1, v50

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v49, 0x1

    move-object/from16 v0, p0

    move-object v3, v1

    move-object/from16 v2, v31

    move-object/from16 v5, v32

    move/from16 v6, v33

    const/4 v4, 0x0

    move-object/from16 v1, p2

    goto/16 :goto_2

    :cond_16
    move-object v1, v3

    return-object v1
.end method
