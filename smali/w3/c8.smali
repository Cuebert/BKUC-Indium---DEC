.class public final enum Lw3/c8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lw3/y1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw3/c8;",
        ">;",
        "Lw3/y1;"
    }
.end annotation


# static fields
.field public static final enum A:Lw3/c8;

.field public static final enum B:Lw3/c8;

.field public static final enum C:Lw3/c8;

.field public static final enum D:Lw3/c8;

.field public static final enum E:Lw3/c8;

.field public static final enum F:Lw3/c8;

.field public static final enum G:Lw3/c8;

.field public static final enum H:Lw3/c8;

.field public static final enum I:Lw3/c8;

.field public static final enum J:Lw3/c8;

.field public static final enum K:Lw3/c8;

.field public static final enum L:Lw3/c8;

.field public static final enum M:Lw3/c8;

.field public static final enum N:Lw3/c8;

.field public static final enum O:Lw3/c8;

.field public static final enum P:Lw3/c8;

.field public static final enum Q:Lw3/c8;

.field public static final enum R:Lw3/c8;

.field public static final enum S:Lw3/c8;

.field public static final enum T:Lw3/c8;

.field public static final enum U:Lw3/c8;

.field public static final enum V:Lw3/c8;

.field public static final enum W:Lw3/c8;

.field public static final enum X:Lw3/c8;

.field public static final enum Y:Lw3/c8;

.field public static final enum Z:Lw3/c8;

.field public static final enum a0:Lw3/c8;

.field public static final enum b0:Lw3/c8;

.field private static final synthetic c0:[Lw3/c8;

.field public static final enum o:Lw3/c8;

.field public static final enum p:Lw3/c8;

.field public static final enum q:Lw3/c8;

.field public static final enum r:Lw3/c8;

.field public static final enum s:Lw3/c8;

.field public static final enum t:Lw3/c8;

.field public static final enum u:Lw3/c8;

.field public static final enum v:Lw3/c8;

.field public static final enum w:Lw3/c8;

.field public static final enum x:Lw3/c8;

.field public static final enum y:Lw3/c8;

.field public static final enum z:Lw3/c8;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 43

    new-instance v0, Lw3/c8;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/c8;->o:Lw3/c8;

    new-instance v1, Lw3/c8;

    const-string v3, "INCOMPATIBLE_INPUT"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lw3/c8;->p:Lw3/c8;

    new-instance v3, Lw3/c8;

    const-string v5, "INCOMPATIBLE_OUTPUT"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6, v6}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lw3/c8;->q:Lw3/c8;

    new-instance v5, Lw3/c8;

    const-string v7, "INCOMPATIBLE_TFLITE_VERSION"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8, v8}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lw3/c8;->r:Lw3/c8;

    new-instance v7, Lw3/c8;

    const-string v9, "MISSING_OP"

    const/4 v10, 0x4

    .line 5
    invoke-direct {v7, v9, v10, v10}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lw3/c8;->s:Lw3/c8;

    new-instance v9, Lw3/c8;

    const-string v11, "DATA_TYPE_ERROR"

    const/4 v12, 0x5

    const/4 v13, 0x6

    .line 6
    invoke-direct {v9, v11, v12, v13}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lw3/c8;->t:Lw3/c8;

    new-instance v11, Lw3/c8;

    const-string v14, "TFLITE_INTERNAL_ERROR"

    const/4 v15, 0x7

    .line 7
    invoke-direct {v11, v14, v13, v15}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lw3/c8;->u:Lw3/c8;

    new-instance v14, Lw3/c8;

    const-string v13, "TFLITE_UNKNOWN_ERROR"

    const/16 v10, 0x8

    .line 8
    invoke-direct {v14, v13, v15, v10}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lw3/c8;->v:Lw3/c8;

    new-instance v13, Lw3/c8;

    const-string v15, "MEDIAPIPE_ERROR"

    const/16 v8, 0x9

    .line 9
    invoke-direct {v13, v15, v10, v8}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lw3/c8;->w:Lw3/c8;

    new-instance v15, Lw3/c8;

    const-string v10, "TIME_OUT_FETCHING_MODEL_METADATA"

    .line 10
    invoke-direct {v15, v10, v8, v12}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lw3/c8;->x:Lw3/c8;

    new-instance v10, Lw3/c8;

    const-string v8, "MODEL_NOT_DOWNLOADED"

    const/16 v12, 0xa

    const/16 v6, 0x64

    .line 11
    invoke-direct {v10, v8, v12, v6}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lw3/c8;->y:Lw3/c8;

    new-instance v6, Lw3/c8;

    const-string v8, "URI_EXPIRED"

    const/16 v12, 0xb

    const/16 v4, 0x65

    .line 12
    invoke-direct {v6, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lw3/c8;->z:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "NO_NETWORK_CONNECTION"

    const/16 v12, 0xc

    const/16 v2, 0x66

    .line 13
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->A:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "METERED_NETWORK"

    const/16 v12, 0xd

    move-object/from16 v16, v4

    const/16 v4, 0x67

    .line 14
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->B:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "DOWNLOAD_FAILED"

    const/16 v12, 0xe

    move-object/from16 v17, v2

    const/16 v2, 0x68

    .line 15
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->C:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS"

    const/16 v12, 0xf

    move-object/from16 v18, v4

    const/16 v4, 0x69

    .line 16
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->D:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "MODEL_INFO_DOWNLOAD_NO_HASH"

    const/16 v12, 0x10

    move-object/from16 v19, v2

    const/16 v2, 0x6a

    .line 17
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->E:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "MODEL_INFO_DOWNLOAD_CONNECTION_FAILED"

    const/16 v12, 0x11

    move-object/from16 v20, v4

    const/16 v4, 0x6b

    .line 18
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->F:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "NO_VALID_MODEL"

    const/16 v12, 0x12

    move-object/from16 v21, v2

    const/16 v2, 0x6c

    .line 19
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->G:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "LOCAL_MODEL_INVALID"

    const/16 v12, 0x13

    move-object/from16 v22, v4

    const/16 v4, 0x6d

    .line 20
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->H:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "REMOTE_MODEL_INVALID"

    const/16 v12, 0x14

    move-object/from16 v23, v2

    const/16 v2, 0x6e

    .line 21
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->I:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "REMOTE_MODEL_LOADER_ERROR"

    const/16 v12, 0x15

    move-object/from16 v24, v4

    const/16 v4, 0x6f

    .line 22
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->J:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "REMOTE_MODEL_LOADER_LOADS_NO_MODEL"

    const/16 v12, 0x16

    move-object/from16 v25, v2

    const/16 v2, 0x70

    .line 23
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->K:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "SMART_REPLY_LANG_ID_DETECTAION_FAILURE"

    const/16 v12, 0x17

    move-object/from16 v26, v4

    const/16 v4, 0x71

    .line 24
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->L:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "MODEL_NOT_REGISTERED"

    const/16 v12, 0x18

    move-object/from16 v27, v2

    const/16 v2, 0x72

    .line 25
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->M:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "MODEL_TYPE_MISUSE"

    const/16 v12, 0x19

    move-object/from16 v28, v4

    const/16 v4, 0x73

    .line 26
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->N:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "MODEL_HASH_MISMATCH"

    const/16 v12, 0x1a

    move-object/from16 v29, v2

    const/16 v2, 0x74

    .line 27
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->O:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "OPTIONAL_MODULE_NOT_AVAILABLE"

    const/16 v12, 0x1b

    move-object/from16 v30, v4

    const/16 v4, 0xc9

    .line 28
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->P:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "OPTIONAL_MODULE_INIT_ERROR"

    const/16 v12, 0x1c

    move-object/from16 v31, v2

    const/16 v2, 0xca

    .line 29
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->Q:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "OPTIONAL_MODULE_INFERENCE_ERROR"

    const/16 v12, 0x1d

    move-object/from16 v32, v4

    const/16 v4, 0xcb

    .line 30
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->R:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "OPTIONAL_MODULE_RELEASE_ERROR"

    const/16 v12, 0x1e

    move-object/from16 v33, v2

    const/16 v2, 0xcc

    .line 31
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->S:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "OPTIONAL_TFLITE_MODULE_INIT_ERROR"

    const/16 v12, 0x1f

    move-object/from16 v34, v4

    const/16 v4, 0xcd

    .line 32
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->T:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "NATIVE_LIBRARY_LOAD_ERROR"

    const/16 v12, 0x20

    move-object/from16 v35, v2

    const/16 v2, 0xce

    .line 33
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->U:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "OPTIONAL_MODULE_CREATE_ERROR"

    const/16 v12, 0x21

    move-object/from16 v36, v4

    const/16 v4, 0xcf

    .line 34
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->V:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "CAMERAX_SOURCE_ERROR"

    const/16 v12, 0x22

    move-object/from16 v37, v2

    const/16 v2, 0x12d

    .line 35
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->W:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "CAMERA1_SOURCE_CANT_START_ERROR"

    const/16 v12, 0x23

    move-object/from16 v38, v4

    const/16 v4, 0x12e

    .line 36
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->X:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR"

    const/16 v12, 0x24

    move-object/from16 v39, v2

    const/16 v2, 0x12f

    .line 37
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->Y:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR"

    const/16 v12, 0x25

    move-object/from16 v40, v4

    const/16 v4, 0x130

    .line 38
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->Z:Lw3/c8;

    new-instance v4, Lw3/c8;

    const-string v8, "CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR"

    const/16 v12, 0x26

    move-object/from16 v41, v2

    const/16 v2, 0x131

    .line 39
    invoke-direct {v4, v8, v12, v2}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/c8;->a0:Lw3/c8;

    new-instance v2, Lw3/c8;

    const-string v8, "UNKNOWN_ERROR"

    const/16 v12, 0x27

    move-object/from16 v42, v4

    const/16 v4, 0x270f

    .line 40
    invoke-direct {v2, v8, v12, v4}, Lw3/c8;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/c8;->b0:Lw3/c8;

    const/16 v4, 0x28

    new-array v4, v4, [Lw3/c8;

    const/4 v8, 0x0

    aput-object v0, v4, v8

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v14, v4, v0

    const/16 v0, 0x8

    aput-object v13, v4, v0

    const/16 v0, 0x9

    aput-object v15, v4, v0

    const/16 v0, 0xa

    aput-object v10, v4, v0

    const/16 v0, 0xb

    aput-object v6, v4, v0

    const/16 v0, 0xc

    aput-object v16, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    const/16 v0, 0x10

    aput-object v20, v4, v0

    const/16 v0, 0x11

    aput-object v21, v4, v0

    const/16 v0, 0x12

    aput-object v22, v4, v0

    const/16 v0, 0x13

    aput-object v23, v4, v0

    const/16 v0, 0x14

    aput-object v24, v4, v0

    const/16 v0, 0x15

    aput-object v25, v4, v0

    const/16 v0, 0x16

    aput-object v26, v4, v0

    const/16 v0, 0x17

    aput-object v27, v4, v0

    const/16 v0, 0x18

    aput-object v28, v4, v0

    const/16 v0, 0x19

    aput-object v29, v4, v0

    const/16 v0, 0x1a

    aput-object v30, v4, v0

    const/16 v0, 0x1b

    aput-object v31, v4, v0

    const/16 v0, 0x1c

    aput-object v32, v4, v0

    const/16 v0, 0x1d

    aput-object v33, v4, v0

    const/16 v0, 0x1e

    aput-object v34, v4, v0

    const/16 v0, 0x1f

    aput-object v35, v4, v0

    const/16 v0, 0x20

    aput-object v36, v4, v0

    const/16 v0, 0x21

    aput-object v37, v4, v0

    const/16 v0, 0x22

    aput-object v38, v4, v0

    const/16 v0, 0x23

    aput-object v39, v4, v0

    const/16 v0, 0x24

    aput-object v40, v4, v0

    const/16 v0, 0x25

    aput-object v41, v4, v0

    const/16 v0, 0x26

    aput-object v42, v4, v0

    const/16 v0, 0x27

    aput-object v2, v4, v0

    sput-object v4, Lw3/c8;->c0:[Lw3/c8;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lw3/c8;->n:I

    return-void
.end method

.method public static values()[Lw3/c8;
    .locals 1

    sget-object v0, Lw3/c8;->c0:[Lw3/c8;

    invoke-virtual {v0}, [Lw3/c8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw3/c8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lw3/c8;->n:I

    return v0
.end method
