.class public final enum Lw3/z9;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lw3/y1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw3/z9;",
        ">;",
        "Lw3/y1;"
    }
.end annotation


# static fields
.field public static final enum A:Lw3/z9;

.field public static final enum B:Lw3/z9;

.field public static final enum C:Lw3/z9;

.field public static final enum D:Lw3/z9;

.field private static final synthetic E:[Lw3/z9;

.field public static final enum o:Lw3/z9;

.field public static final enum p:Lw3/z9;

.field public static final enum q:Lw3/z9;

.field public static final enum r:Lw3/z9;

.field public static final enum s:Lw3/z9;

.field public static final enum t:Lw3/z9;

.field public static final enum u:Lw3/z9;

.field public static final enum v:Lw3/z9;

.field public static final enum w:Lw3/z9;

.field public static final enum x:Lw3/z9;

.field public static final enum y:Lw3/z9;

.field public static final enum z:Lw3/z9;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lw3/z9;

    const-string v1, "UNRECOGNIZED"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2, v2}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/z9;->o:Lw3/z9;

    new-instance v1, Lw3/z9;

    const-string v3, "CODE_128"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4, v4}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lw3/z9;->p:Lw3/z9;

    new-instance v3, Lw3/z9;

    const-string v5, "CODE_39"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6, v6}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lw3/z9;->q:Lw3/z9;

    new-instance v5, Lw3/z9;

    const-string v7, "CODE_93"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8, v8}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lw3/z9;->r:Lw3/z9;

    new-instance v7, Lw3/z9;

    const-string v9, "CODABAR"

    const/4 v10, 0x4

    .line 5
    invoke-direct {v7, v9, v10, v10}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lw3/z9;->s:Lw3/z9;

    new-instance v9, Lw3/z9;

    const-string v11, "DATA_MATRIX"

    const/4 v12, 0x5

    .line 6
    invoke-direct {v9, v11, v12, v12}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lw3/z9;->t:Lw3/z9;

    new-instance v11, Lw3/z9;

    const-string v13, "EAN_13"

    const/4 v14, 0x6

    .line 7
    invoke-direct {v11, v13, v14, v14}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lw3/z9;->u:Lw3/z9;

    new-instance v13, Lw3/z9;

    const-string v15, "EAN_8"

    const/4 v14, 0x7

    .line 8
    invoke-direct {v13, v15, v14, v14}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lw3/z9;->v:Lw3/z9;

    new-instance v15, Lw3/z9;

    const-string v14, "ITF"

    const/16 v12, 0x8

    .line 9
    invoke-direct {v15, v14, v12, v12}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lw3/z9;->w:Lw3/z9;

    new-instance v14, Lw3/z9;

    const-string v12, "QR_CODE"

    const/16 v10, 0x9

    .line 10
    invoke-direct {v14, v12, v10, v10}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lw3/z9;->x:Lw3/z9;

    new-instance v12, Lw3/z9;

    const-string v10, "UPC_A"

    const/16 v8, 0xa

    .line 11
    invoke-direct {v12, v10, v8, v8}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lw3/z9;->y:Lw3/z9;

    new-instance v10, Lw3/z9;

    const-string v8, "UPC_E"

    const/16 v6, 0xb

    .line 12
    invoke-direct {v10, v8, v6, v6}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lw3/z9;->z:Lw3/z9;

    new-instance v8, Lw3/z9;

    const-string v6, "PDF417"

    const/16 v4, 0xc

    .line 13
    invoke-direct {v8, v6, v4, v4}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lw3/z9;->A:Lw3/z9;

    new-instance v6, Lw3/z9;

    const-string v4, "AZTEC"

    const/16 v2, 0xd

    .line 14
    invoke-direct {v6, v4, v2, v2}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lw3/z9;->B:Lw3/z9;

    new-instance v4, Lw3/z9;

    const-string v2, "DATABAR"

    move-object/from16 v16, v6

    const/16 v6, 0xe

    .line 15
    invoke-direct {v4, v2, v6, v6}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lw3/z9;->C:Lw3/z9;

    new-instance v2, Lw3/z9;

    const-string v6, "TEZ_CODE"

    move-object/from16 v17, v4

    const/16 v4, 0xf

    move-object/from16 v18, v8

    const/16 v8, 0x10

    .line 16
    invoke-direct {v2, v6, v4, v8}, Lw3/z9;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lw3/z9;->D:Lw3/z9;

    new-array v6, v8, [Lw3/z9;

    const/4 v8, 0x0

    aput-object v0, v6, v8

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v7, v6, v0

    const/4 v0, 0x5

    aput-object v9, v6, v0

    const/4 v0, 0x6

    aput-object v11, v6, v0

    const/4 v0, 0x7

    aput-object v13, v6, v0

    const/16 v0, 0x8

    aput-object v15, v6, v0

    const/16 v0, 0x9

    aput-object v14, v6, v0

    const/16 v0, 0xa

    aput-object v12, v6, v0

    const/16 v0, 0xb

    aput-object v10, v6, v0

    const/16 v0, 0xc

    aput-object v18, v6, v0

    const/16 v0, 0xd

    aput-object v16, v6, v0

    const/16 v0, 0xe

    aput-object v17, v6, v0

    aput-object v2, v6, v4

    sput-object v6, Lw3/z9;->E:[Lw3/z9;

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

    iput p3, p0, Lw3/z9;->n:I

    return-void
.end method

.method public static values()[Lw3/z9;
    .locals 1

    sget-object v0, Lw3/z9;->E:[Lw3/z9;

    invoke-virtual {v0}, [Lw3/z9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw3/z9;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lw3/z9;->n:I

    return v0
.end method
