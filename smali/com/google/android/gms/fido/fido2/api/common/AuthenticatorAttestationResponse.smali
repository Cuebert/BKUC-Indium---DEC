.class public Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;
.super Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:[B

.field private final o:[B

.field private final p:[B

.field private final q:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/p;

    invoke-direct {v0}, Lcom/google/android/gms/fido/fido2/api/common/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>([B[B[B[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;-><init>()V

    .line 2
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->n:[B

    .line 3
    invoke-static {p2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    .line 4
    invoke-static {p3}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    .line 5
    invoke-static {p4}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->q:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->q:[Ljava/lang/String;

    return-object v0
.end method

.method public final B()Lorg/json/JSONObject;
    .locals 23

    move-object/from16 v1, p0

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v2, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    if-eqz v2, :cond_0

    const-string v3, "clientDataJSON"

    .line 2
    invoke-static {v2}, Lf3/c;->a([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v2, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    if-eqz v2, :cond_1

    const-string v3, "attestationObject"

    .line 3
    invoke-static {v2}, Lf3/c;->a([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    :cond_1
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget-object v5, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->q:[Ljava/lang/String;

    .line 5
    array-length v6, v5

    if-ge v4, v6, :cond_3

    .line 6
    aget-object v5, v5, v4

    sget-object v6, Lcom/google/android/gms/fido/common/Transport;->t:Lcom/google/android/gms/fido/common/Transport;

    invoke-virtual {v6}, Lcom/google/android/gms/fido/common/Transport;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "hybrid"

    .line 7
    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_2
    iget-object v5, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->q:[Ljava/lang/String;

    .line 8
    aget-object v5, v5, v4

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const-string v4, "transports"

    .line 9
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v2, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_7

    .line 10
    :try_start_1
    invoke-static {v2}, Lt3/s2;->j([B)Lt3/s2;

    move-result-object v2

    invoke-virtual {v2}, Lt3/s2;->h()Lt3/p2;

    move-result-object v2
    :try_end_1
    .catch Lt3/r2; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lt3/m2; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_7

    .line 11
    :try_start_2
    invoke-virtual {v2}, Lt3/p2;->l()Lt3/i0;

    move-result-object v2

    const-string v4, "authData"

    invoke-static {v4}, Lt3/s2;->i(Ljava/lang/String;)Lt3/q2;

    move-result-object v4

    invoke-virtual {v2, v4}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt3/s2;

    if-eqz v2, :cond_f

    .line 12
    invoke-virtual {v2}, Lt3/s2;->e()Lt3/l2;

    move-result-object v2

    invoke-virtual {v2}, Lt3/l2;->l()Lt3/a2;

    move-result-object v2
    :try_end_2
    .catch Lt3/r2; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_7

    .line 13
    :try_start_3
    invoke-virtual {v2}, Lt3/a2;->p()Ljava/nio/ByteBuffer;

    move-result-object v4
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_7

    .line 14
    :try_start_4
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->position()I

    move-result v5

    const/16 v6, 0x20

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_e

    .line 16
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x10

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 18
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v5

    .line 19
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->position()I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_7

    .line 20
    :try_start_5
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    invoke-virtual {v2}, Lt3/a2;->i()I

    move-result v5

    .line 21
    invoke-virtual {v2, v4, v5}, Lt3/a2;->m(II)Lt3/a2;

    move-result-object v4

    .line 22
    invoke-virtual {v4}, Lt3/a2;->o()Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4}, Lt3/s2;->k(Ljava/io/InputStream;)Lt3/s2;

    move-result-object v4

    invoke-virtual {v4}, Lt3/s2;->h()Lt3/p2;

    move-result-object v4
    :try_end_5
    .catch Lt3/r2; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lt3/m2; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_7

    .line 23
    :try_start_6
    invoke-virtual {v4}, Lt3/p2;->l()Lt3/i0;

    move-result-object v5

    const-wide/16 v7, 0x3

    invoke-static {v7, v8}, Lt3/s2;->g(J)Lt3/n2;

    move-result-object v7

    invoke-virtual {v5, v7}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt3/s2;

    .line 24
    invoke-virtual {v4}, Lt3/p2;->l()Lt3/i0;

    move-result-object v7

    const-wide/16 v8, 0x1

    invoke-static {v8, v9}, Lt3/s2;->g(J)Lt3/n2;

    move-result-object v10

    invoke-virtual {v7, v10}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt3/s2;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_7

    const-string v10, "COSE key missing required fields"

    if-eqz v5, :cond_d

    if-eqz v7, :cond_d

    .line 25
    :try_start_7
    invoke-virtual {v5}, Lt3/s2;->f()Lt3/n2;

    move-result-object v5

    invoke-virtual {v5}, Lt3/n2;->l()J

    move-result-wide v11

    .line 26
    invoke-virtual {v7}, Lt3/s2;->f()Lt3/n2;

    move-result-object v5

    invoke-virtual {v5}, Lt3/n2;->l()J

    move-result-wide v13

    const-wide/16 v15, 0x2

    cmp-long v7, v13, v8

    if-eqz v7, :cond_5

    cmp-long v7, v13, v15

    if-nez v7, :cond_4

    move-wide v13, v15

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    goto/16 :goto_3

    .line 27
    :cond_5
    :goto_2
    invoke-virtual {v4}, Lt3/p2;->l()Lt3/i0;

    move-result-object v7

    const-wide/16 v17, -0x1

    invoke-static/range {v17 .. v18}, Lt3/s2;->g(J)Lt3/n2;

    move-result-object v5

    invoke-virtual {v7, v5}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt3/s2;

    if-eqz v5, :cond_c

    .line 28
    invoke-virtual {v5}, Lt3/s2;->f()Lt3/n2;

    move-result-object v5

    invoke-virtual {v5}, Lt3/n2;->l()J

    move-result-wide v17
    :try_end_7
    .catch Lt3/r2; {:try_start_7 .. :try_end_7} :catch_0
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_7

    const/4 v5, 0x2

    const-string v7, "COSE coordinates are the wrong size"

    const-wide/16 v19, -0x2

    const/16 v21, 0x1

    cmp-long v22, v13, v15

    if-nez v22, :cond_8

    cmp-long v15, v17, v8

    if-nez v15, :cond_8

    .line 29
    :try_start_8
    invoke-virtual {v4}, Lt3/p2;->l()Lt3/i0;

    move-result-object v8

    invoke-static/range {v19 .. v20}, Lt3/s2;->g(J)Lt3/n2;

    move-result-object v9

    invoke-virtual {v8, v9}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt3/s2;

    .line 30
    invoke-virtual {v4}, Lt3/p2;->l()Lt3/i0;

    move-result-object v4

    const-wide/16 v13, -0x3

    invoke-static {v13, v14}, Lt3/s2;->g(J)Lt3/n2;

    move-result-object v9

    invoke-virtual {v4, v9}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt3/s2;

    if-eqz v8, :cond_7

    if-eqz v4, :cond_7

    .line 31
    invoke-virtual {v8}, Lt3/s2;->e()Lt3/l2;

    move-result-object v8

    invoke-virtual {v8}, Lt3/l2;->l()Lt3/a2;

    move-result-object v8

    .line 32
    invoke-virtual {v4}, Lt3/s2;->e()Lt3/l2;

    move-result-object v4

    invoke-virtual {v4}, Lt3/l2;->l()Lt3/a2;

    move-result-object v4

    invoke-virtual {v8}, Lt3/a2;->i()I

    move-result v9

    if-ne v9, v6, :cond_6

    invoke-virtual {v4}, Lt3/a2;->i()I

    move-result v9

    if-ne v9, v6, :cond_6

    const-string v6, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE"

    .line 33
    invoke-static {v6, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [[B

    aput-object v6, v7, v3

    .line 34
    invoke-virtual {v8}, Lt3/a2;->u()[B

    move-result-object v3

    aput-object v3, v7, v21

    invoke-virtual {v4}, Lt3/a2;->u()[B

    move-result-object v3

    aput-object v3, v7, v5

    invoke-static {v7}, Lt3/m1;->a([[B)[B

    move-result-object v5

    goto :goto_3

    .line 35
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 38
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    cmp-long v15, v13, v8

    if-nez v15, :cond_4

    const-wide/16 v8, 0x6

    cmp-long v13, v17, v8

    if-nez v13, :cond_4

    .line 39
    invoke-virtual {v4}, Lt3/p2;->l()Lt3/i0;

    move-result-object v4

    invoke-static/range {v19 .. v20}, Lt3/s2;->g(J)Lt3/n2;

    move-result-object v8

    invoke-virtual {v4, v8}, Lt3/i0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt3/s2;

    if-eqz v4, :cond_a

    .line 40
    invoke-virtual {v4}, Lt3/s2;->e()Lt3/l2;

    move-result-object v4

    invoke-virtual {v4}, Lt3/l2;->l()Lt3/a2;

    move-result-object v4

    invoke-virtual {v4}, Lt3/a2;->i()I

    move-result v8

    if-ne v8, v6, :cond_9

    const-string v6, "MCowBQYDK2VwAyEA"

    .line 41
    invoke-static {v6, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    new-array v5, v5, [[B

    aput-object v6, v5, v3

    .line 42
    invoke-virtual {v4}, Lt3/a2;->u()[B

    move-result-object v3

    aput-object v3, v5, v21

    invoke-static {v5}, Lt3/m1;->a([[B)[B

    move-result-object v5

    goto :goto_3

    .line 43
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 44
    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 46
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catch Lt3/r2; {:try_start_8 .. :try_end_8} :catch_0
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_7

    :goto_3
    :try_start_9
    const-string v3, "authenticatorData"

    .line 47
    invoke-virtual {v2}, Lt3/a2;->u()[B

    move-result-object v2

    invoke-static {v2}, Lf3/c;->a([B)Ljava/lang/String;

    move-result-object v2

    .line 48
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "publicKeyAlgorithm"

    .line 49
    invoke-virtual {v0, v2, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz v5, :cond_b

    const-string v2, "publicKey"

    .line 50
    invoke-static {v5}, Lf3/c;->a([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_7

    :cond_b
    return-object v0

    .line 51
    :cond_c
    :try_start_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 52
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Lt3/r2; {:try_start_a .. :try_end_a} :catch_0
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_7

    :catch_0
    move-exception v0

    .line 53
    :try_start_b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "COSE key ill-formed"

    .line 54
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 55
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 56
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    .line 57
    :goto_4
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "failed to parse COSE key"

    .line 58
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_7

    .line 59
    :cond_e
    :try_start_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "authData does not include credential data"

    .line 60
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_c .. :try_end_c} :catch_3
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_7

    :catch_3
    move-exception v0

    .line 61
    :try_start_d
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "ill-formed authenticator data"

    .line 62
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_7

    .line 63
    :cond_f
    :try_start_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "attestation object missing authData"

    .line 64
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catch Lt3/r2; {:try_start_e .. :try_end_e} :catch_4
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_7

    :catch_4
    move-exception v0

    .line 65
    :try_start_f
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "authData value has wrong type"

    .line 66
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_5
    move-exception v0

    goto :goto_5

    :catch_6
    move-exception v0

    .line 67
    :goto_5
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "failed to parse attestation object"

    .line 68
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_7

    :catch_7
    move-exception v0

    .line 69
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error encoding AuthenticatorAttestationResponse to JSON object"

    .line 70
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->n:[B

    .line 2
    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->n:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    .line 3
    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    iget-object p1, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    .line 4
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->n:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    .line 2
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    .line 3
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 4
    invoke-static {v0}, Lz2/h;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Lt3/o;->a(Ljava/lang/Object;)Lt3/n;

    move-result-object v0

    .line 2
    invoke-static {}, Lt3/i1;->d()Lt3/i1;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->n:[B

    .line 3
    array-length v3, v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Lt3/i1;->e([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyHandle"

    .line 4
    invoke-virtual {v0, v2, v1}, Lt3/n;->b(Ljava/lang/String;Ljava/lang/Object;)Lt3/n;

    invoke-static {}, Lt3/i1;->d()Lt3/i1;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    .line 5
    array-length v3, v2

    invoke-virtual {v1, v2, v4, v3}, Lt3/i1;->e([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "clientDataJSON"

    .line 6
    invoke-virtual {v0, v2, v1}, Lt3/n;->b(Ljava/lang/String;Ljava/lang/Object;)Lt3/n;

    invoke-static {}, Lt3/i1;->d()Lt3/i1;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    .line 7
    array-length v3, v2

    invoke-virtual {v1, v2, v4, v3}, Lt3/i1;->e([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "attestationObject"

    .line 8
    invoke-virtual {v0, v2, v1}, Lt3/n;->b(Ljava/lang/String;Ljava/lang/Object;)Lt3/n;

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->q:[Ljava/lang/String;

    .line 9
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "transports"

    invoke-virtual {v0, v2, v1}, Lt3/n;->b(Ljava/lang/String;Ljava/lang/Object;)Lt3/n;

    .line 10
    invoke-virtual {v0}, Lt3/n;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->z()[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 3
    invoke-static {p1, v1, v0, v2}, La3/b;->f(Landroid/os/Parcel;I[BZ)V

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->y()[B

    move-result-object v0

    const/4 v1, 0x3

    .line 5
    invoke-static {p1, v1, v0, v2}, La3/b;->f(Landroid/os/Parcel;I[BZ)V

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->x()[B

    move-result-object v0

    const/4 v1, 0x4

    .line 7
    invoke-static {p1, v1, v0, v2}, La3/b;->f(Landroid/os/Parcel;I[BZ)V

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->A()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    .line 9
    invoke-static {p1, v1, v0, v2}, La3/b;->t(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    .line 10
    invoke-static {p1, p2}, La3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->p:[B

    return-object v0
.end method

.method public y()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->o:[B

    return-object v0
.end method

.method public z()[B
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->n:[B

    return-object v0
.end method
