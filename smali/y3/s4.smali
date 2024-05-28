.class public final enum Ly3/s4;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ly3/g8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly3/s4;",
        ">;",
        "Ly3/g8;"
    }
.end annotation


# static fields
.field public static final enum o:Ly3/s4;

.field public static final enum p:Ly3/s4;

.field public static final enum q:Ly3/s4;

.field public static final enum r:Ly3/s4;

.field public static final enum s:Ly3/s4;

.field public static final enum t:Ly3/s4;

.field private static final synthetic u:[Ly3/s4;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ly3/s4;

    const-string v1, "SOURCE_UNKNOWN"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2, v2}, Ly3/s4;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly3/s4;->o:Ly3/s4;

    new-instance v1, Ly3/s4;

    const-string v3, "BITMAP"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4, v4}, Ly3/s4;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ly3/s4;->p:Ly3/s4;

    new-instance v3, Ly3/s4;

    const-string v5, "BYTEARRAY"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6, v6}, Ly3/s4;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ly3/s4;->q:Ly3/s4;

    new-instance v5, Ly3/s4;

    const-string v7, "BYTEBUFFER"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8, v8}, Ly3/s4;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ly3/s4;->r:Ly3/s4;

    new-instance v7, Ly3/s4;

    const-string v9, "FILEPATH"

    const/4 v10, 0x4

    .line 5
    invoke-direct {v7, v9, v10, v10}, Ly3/s4;-><init>(Ljava/lang/String;II)V

    sput-object v7, Ly3/s4;->s:Ly3/s4;

    new-instance v9, Ly3/s4;

    const-string v11, "ANDROID_MEDIA_IMAGE"

    const/4 v12, 0x5

    .line 6
    invoke-direct {v9, v11, v12, v12}, Ly3/s4;-><init>(Ljava/lang/String;II)V

    sput-object v9, Ly3/s4;->t:Ly3/s4;

    const/4 v11, 0x6

    new-array v11, v11, [Ly3/s4;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Ly3/s4;->u:[Ly3/s4;

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

    iput p3, p0, Ly3/s4;->n:I

    return-void
.end method

.method public static values()[Ly3/s4;
    .locals 1

    sget-object v0, Ly3/s4;->u:[Ly3/s4;

    invoke-virtual {v0}, [Ly3/s4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly3/s4;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Ly3/s4;->n:I

    return v0
.end method
