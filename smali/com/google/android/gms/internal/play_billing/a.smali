.class final enum Lcom/google/android/gms/internal/play_billing/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum B:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum C:Lcom/google/android/gms/internal/play_billing/a;

.field private static final D:Lcom/google/android/gms/internal/play_billing/u5;

.field private static final synthetic E:[Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum o:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum p:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum q:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum r:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum s:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum t:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum u:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum v:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum w:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum x:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum y:Lcom/google/android/gms/internal/play_billing/a;

.field public static final enum z:Lcom/google/android/gms/internal/play_billing/a;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/a;

    const-string v1, "RESPONSE_CODE_UNSPECIFIED"

    const/4 v2, 0x0

    const/16 v3, -0x3e7

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/a;->o:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v1, Lcom/google/android/gms/internal/play_billing/a;

    const-string v3, "SERVICE_TIMEOUT"

    const/4 v4, 0x1

    const/4 v5, -0x3

    .line 2
    invoke-direct {v1, v3, v4, v5}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/play_billing/a;->p:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v3, Lcom/google/android/gms/internal/play_billing/a;

    const-string v5, "FEATURE_NOT_SUPPORTED"

    const/4 v6, 0x2

    const/4 v7, -0x2

    .line 3
    invoke-direct {v3, v5, v6, v7}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/play_billing/a;->q:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v5, Lcom/google/android/gms/internal/play_billing/a;

    const-string v7, "SERVICE_DISCONNECTED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    .line 4
    invoke-direct {v5, v7, v8, v9}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/play_billing/a;->r:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v7, Lcom/google/android/gms/internal/play_billing/a;

    const-string v9, "OK"

    const/4 v10, 0x4

    .line 5
    invoke-direct {v7, v9, v10, v2}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/play_billing/a;->s:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v9, Lcom/google/android/gms/internal/play_billing/a;

    const-string v11, "USER_CANCELED"

    const/4 v12, 0x5

    .line 6
    invoke-direct {v9, v11, v12, v4}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/play_billing/a;->t:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v11, Lcom/google/android/gms/internal/play_billing/a;

    const-string v13, "SERVICE_UNAVAILABLE"

    const/4 v14, 0x6

    .line 7
    invoke-direct {v11, v13, v14, v6}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/play_billing/a;->u:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v13, Lcom/google/android/gms/internal/play_billing/a;

    const-string v15, "BILLING_UNAVAILABLE"

    const/4 v6, 0x7

    .line 8
    invoke-direct {v13, v15, v6, v8}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/gms/internal/play_billing/a;->v:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v15, Lcom/google/android/gms/internal/play_billing/a;

    const-string v8, "ITEM_UNAVAILABLE"

    const/16 v4, 0x8

    .line 9
    invoke-direct {v15, v8, v4, v10}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lcom/google/android/gms/internal/play_billing/a;->w:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v8, Lcom/google/android/gms/internal/play_billing/a;

    const-string v10, "DEVELOPER_ERROR"

    const/16 v2, 0x9

    .line 10
    invoke-direct {v8, v10, v2, v12}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/play_billing/a;->x:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v10, Lcom/google/android/gms/internal/play_billing/a;

    const-string v2, "ERROR"

    const/16 v12, 0xa

    .line 11
    invoke-direct {v10, v2, v12, v14}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/play_billing/a;->y:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v2, Lcom/google/android/gms/internal/play_billing/a;

    const-string v12, "ITEM_ALREADY_OWNED"

    const/16 v14, 0xb

    .line 12
    invoke-direct {v2, v12, v14, v6}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/play_billing/a;->z:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v12, Lcom/google/android/gms/internal/play_billing/a;

    const-string v6, "ITEM_NOT_OWNED"

    const/16 v14, 0xc

    .line 13
    invoke-direct {v12, v6, v14, v4}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/play_billing/a;->A:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v6, Lcom/google/android/gms/internal/play_billing/a;

    const-string v4, "EXPIRED_OFFER_TOKEN"

    const/16 v14, 0xd

    move-object/from16 v16, v12

    const/16 v12, 0xb

    .line 14
    invoke-direct {v6, v4, v14, v12}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/play_billing/a;->B:Lcom/google/android/gms/internal/play_billing/a;

    new-instance v4, Lcom/google/android/gms/internal/play_billing/a;

    const-string v12, "NETWORK_ERROR"

    const/16 v14, 0xe

    move-object/from16 v17, v6

    const/16 v6, 0xc

    .line 15
    invoke-direct {v4, v12, v14, v6}, Lcom/google/android/gms/internal/play_billing/a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/play_billing/a;->C:Lcom/google/android/gms/internal/play_billing/a;

    const/16 v6, 0xf

    new-array v6, v6, [Lcom/google/android/gms/internal/play_billing/a;

    const/4 v12, 0x0

    aput-object v0, v6, v12

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

    aput-object v8, v6, v0

    const/16 v0, 0xa

    aput-object v10, v6, v0

    const/16 v0, 0xb

    aput-object v2, v6, v0

    const/16 v0, 0xc

    aput-object v16, v6, v0

    const/16 v0, 0xd

    aput-object v17, v6, v0

    aput-object v4, v6, v14

    sput-object v6, Lcom/google/android/gms/internal/play_billing/a;->E:[Lcom/google/android/gms/internal/play_billing/a;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/t5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/t5;-><init>()V

    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a;->values()[Lcom/google/android/gms/internal/play_billing/a;

    move-result-object v1

    array-length v2, v1

    :goto_0
    if-ge v12, v2, :cond_0

    aget-object v3, v1, v12

    .line 17
    iget v4, v3, Lcom/google/android/gms/internal/play_billing/a;->n:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/play_billing/t5;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/t5;

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t5;->b()Lcom/google/android/gms/internal/play_billing/u5;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/play_billing/a;->D:Lcom/google/android/gms/internal/play_billing/u5;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/a;->n:I

    return-void
.end method

.method static b(I)Lcom/google/android/gms/internal/play_billing/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/a;->D:Lcom/google/android/gms/internal/play_billing/u5;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/u5;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/play_billing/a;->o:Lcom/google/android/gms/internal/play_billing/a;

    return-object p0

    .line 2
    :cond_0
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/u5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/a;

    return-object p0
.end method

.method public static values()[Lcom/google/android/gms/internal/play_billing/a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a;->E:[Lcom/google/android/gms/internal/play_billing/a;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/play_billing/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/play_billing/a;

    return-object v0
.end method
