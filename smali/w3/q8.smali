.class public final enum Lw3/q8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lw3/y1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw3/q8;",
        ">;",
        "Lw3/y1;"
    }
.end annotation


# static fields
.field public static final enum A:Lw3/q8;

.field private static final synthetic B:[Lw3/q8;

.field public static final enum o:Lw3/q8;

.field public static final enum p:Lw3/q8;

.field public static final enum q:Lw3/q8;

.field public static final enum r:Lw3/q8;

.field public static final enum s:Lw3/q8;

.field public static final enum t:Lw3/q8;

.field public static final enum u:Lw3/q8;

.field public static final enum v:Lw3/q8;

.field public static final enum w:Lw3/q8;

.field public static final enum x:Lw3/q8;

.field public static final enum y:Lw3/q8;

.field public static final enum z:Lw3/q8;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lw3/q8;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2, v2}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/q8;->o:Lw3/q8;

    new-instance v1, Lw3/q8;

    const-string v3, "TYPE_CONTACT_INFO"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4, v4}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lw3/q8;->p:Lw3/q8;

    new-instance v3, Lw3/q8;

    const-string v5, "TYPE_EMAIL"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6, v6}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lw3/q8;->q:Lw3/q8;

    new-instance v5, Lw3/q8;

    const-string v7, "TYPE_ISBN"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8, v8}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lw3/q8;->r:Lw3/q8;

    new-instance v7, Lw3/q8;

    const-string v9, "TYPE_PHONE"

    const/4 v10, 0x4

    .line 5
    invoke-direct {v7, v9, v10, v10}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lw3/q8;->s:Lw3/q8;

    new-instance v9, Lw3/q8;

    const-string v11, "TYPE_PRODUCT"

    const/4 v12, 0x5

    .line 6
    invoke-direct {v9, v11, v12, v12}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lw3/q8;->t:Lw3/q8;

    new-instance v11, Lw3/q8;

    const-string v13, "TYPE_SMS"

    const/4 v14, 0x6

    .line 7
    invoke-direct {v11, v13, v14, v14}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lw3/q8;->u:Lw3/q8;

    new-instance v13, Lw3/q8;

    const-string v15, "TYPE_TEXT"

    const/4 v14, 0x7

    .line 8
    invoke-direct {v13, v15, v14, v14}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lw3/q8;->v:Lw3/q8;

    new-instance v15, Lw3/q8;

    const-string v14, "TYPE_URL"

    const/16 v12, 0x8

    .line 9
    invoke-direct {v15, v14, v12, v12}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lw3/q8;->w:Lw3/q8;

    new-instance v14, Lw3/q8;

    const-string v12, "TYPE_WIFI"

    const/16 v10, 0x9

    .line 10
    invoke-direct {v14, v12, v10, v10}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lw3/q8;->x:Lw3/q8;

    new-instance v12, Lw3/q8;

    const-string v10, "TYPE_GEO"

    const/16 v8, 0xa

    .line 11
    invoke-direct {v12, v10, v8, v8}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lw3/q8;->y:Lw3/q8;

    new-instance v10, Lw3/q8;

    const-string v8, "TYPE_CALENDAR_EVENT"

    const/16 v6, 0xb

    .line 12
    invoke-direct {v10, v8, v6, v6}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lw3/q8;->z:Lw3/q8;

    new-instance v8, Lw3/q8;

    const-string v6, "TYPE_DRIVER_LICENSE"

    const/16 v4, 0xc

    .line 13
    invoke-direct {v8, v6, v4, v4}, Lw3/q8;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lw3/q8;->A:Lw3/q8;

    const/16 v6, 0xd

    new-array v6, v6, [Lw3/q8;

    aput-object v0, v6, v2

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

    aput-object v8, v6, v4

    sput-object v6, Lw3/q8;->B:[Lw3/q8;

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

    iput p3, p0, Lw3/q8;->n:I

    return-void
.end method

.method public static values()[Lw3/q8;
    .locals 1

    sget-object v0, Lw3/q8;->B:[Lw3/q8;

    invoke-virtual {v0}, [Lw3/q8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw3/q8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lw3/q8;->n:I

    return v0
.end method
