.class public final enum Ly3/m4;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ly3/g8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly3/m4;",
        ">;",
        "Ly3/g8;"
    }
.end annotation


# static fields
.field public static final enum o:Ly3/m4;

.field public static final enum p:Ly3/m4;

.field public static final enum q:Ly3/m4;

.field public static final enum r:Ly3/m4;

.field public static final enum s:Ly3/m4;

.field public static final enum t:Ly3/m4;

.field public static final enum u:Ly3/m4;

.field public static final enum v:Ly3/m4;

.field public static final enum w:Ly3/m4;

.field public static final enum x:Ly3/m4;

.field private static final synthetic y:[Ly3/m4;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ly3/m4;

    const-string v1, "UNKNOWN_FORMAT"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2, v2}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly3/m4;->o:Ly3/m4;

    new-instance v1, Ly3/m4;

    const-string v3, "NV16"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4, v4}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ly3/m4;->p:Ly3/m4;

    new-instance v3, Ly3/m4;

    const-string v5, "NV21"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6, v6}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ly3/m4;->q:Ly3/m4;

    new-instance v5, Ly3/m4;

    const-string v7, "YV12"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8, v8}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ly3/m4;->r:Ly3/m4;

    new-instance v7, Ly3/m4;

    const-string v9, "YUV_420_888"

    const/4 v10, 0x4

    const/4 v11, 0x7

    .line 5
    invoke-direct {v7, v9, v10, v11}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v7, Ly3/m4;->s:Ly3/m4;

    new-instance v9, Ly3/m4;

    const-string v12, "JPEG"

    const/4 v13, 0x5

    const/16 v14, 0x8

    .line 6
    invoke-direct {v9, v12, v13, v14}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v9, Ly3/m4;->t:Ly3/m4;

    new-instance v12, Ly3/m4;

    const-string v15, "BITMAP"

    const/4 v8, 0x6

    .line 7
    invoke-direct {v12, v15, v8, v10}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v12, Ly3/m4;->u:Ly3/m4;

    new-instance v15, Ly3/m4;

    const-string v10, "CM_SAMPLE_BUFFER_REF"

    .line 8
    invoke-direct {v15, v10, v11, v13}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v15, Ly3/m4;->v:Ly3/m4;

    new-instance v10, Ly3/m4;

    const-string v11, "UI_IMAGE"

    .line 9
    invoke-direct {v10, v11, v14, v8}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v10, Ly3/m4;->w:Ly3/m4;

    new-instance v11, Ly3/m4;

    const-string v14, "CV_PIXEL_BUFFER_REF"

    const/16 v8, 0x9

    .line 10
    invoke-direct {v11, v14, v8, v8}, Ly3/m4;-><init>(Ljava/lang/String;II)V

    sput-object v11, Ly3/m4;->x:Ly3/m4;

    const/16 v14, 0xa

    new-array v14, v14, [Ly3/m4;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    const/4 v0, 0x3

    aput-object v5, v14, v0

    const/4 v0, 0x4

    aput-object v7, v14, v0

    aput-object v9, v14, v13

    const/4 v0, 0x6

    aput-object v12, v14, v0

    const/4 v0, 0x7

    aput-object v15, v14, v0

    const/16 v0, 0x8

    aput-object v10, v14, v0

    aput-object v11, v14, v8

    sput-object v14, Ly3/m4;->y:[Ly3/m4;

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

    iput p3, p0, Ly3/m4;->n:I

    return-void
.end method

.method public static values()[Ly3/m4;
    .locals 1

    sget-object v0, Ly3/m4;->y:[Ly3/m4;

    invoke-virtual {v0}, [Ly3/m4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly3/m4;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Ly3/m4;->n:I

    return v0
.end method
