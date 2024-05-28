.class public final enum Lm3/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/fido/fido2/api/common/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm3/a;",
        ">;",
        "Lcom/google/android/gms/fido/fido2/api/common/a;"
    }
.end annotation


# static fields
.field public static final enum o:Lm3/a;

.field public static final enum p:Lm3/a;

.field public static final enum q:Lm3/a;

.field public static final enum r:Lm3/a;

.field public static final enum s:Lm3/a;

.field public static final enum t:Lm3/a;

.field public static final enum u:Lm3/a;

.field private static final synthetic v:[Lm3/a;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lm3/a;

    const-string v1, "ED256"

    const/4 v2, 0x0

    const/16 v3, -0x104

    invoke-direct {v0, v1, v2, v3}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm3/a;->o:Lm3/a;

    new-instance v1, Lm3/a;

    const-string v3, "ED512"

    const/4 v4, 0x1

    const/16 v5, -0x105

    .line 2
    invoke-direct {v1, v3, v4, v5}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lm3/a;->p:Lm3/a;

    new-instance v3, Lm3/a;

    const-string v5, "ED25519"

    const/4 v6, 0x2

    const/4 v7, -0x8

    .line 3
    invoke-direct {v3, v5, v6, v7}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lm3/a;->q:Lm3/a;

    new-instance v5, Lm3/a;

    const-string v7, "ES256"

    const/4 v8, 0x3

    const/4 v9, -0x7

    .line 4
    invoke-direct {v5, v7, v8, v9}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lm3/a;->r:Lm3/a;

    new-instance v7, Lm3/a;

    const-string v9, "ECDH_HKDF_256"

    const/4 v10, 0x4

    const/16 v11, -0x19

    .line 5
    invoke-direct {v7, v9, v10, v11}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lm3/a;->s:Lm3/a;

    new-instance v9, Lm3/a;

    const-string v11, "ES384"

    const/4 v12, 0x5

    const/16 v13, -0x23

    .line 6
    invoke-direct {v9, v11, v12, v13}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lm3/a;->t:Lm3/a;

    new-instance v11, Lm3/a;

    const-string v13, "ES512"

    const/4 v14, 0x6

    const/16 v15, -0x24

    .line 7
    invoke-direct {v11, v13, v14, v15}, Lm3/a;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lm3/a;->u:Lm3/a;

    const/4 v13, 0x7

    new-array v13, v13, [Lm3/a;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lm3/a;->v:[Lm3/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm3/a;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm3/a;
    .locals 1

    const-class v0, Lm3/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm3/a;

    return-object p0
.end method

.method public static values()[Lm3/a;
    .locals 1

    sget-object v0, Lm3/a;->v:[Lm3/a;

    invoke-virtual {v0}, [Lm3/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm3/a;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lm3/a;->n:I

    return v0
.end method
