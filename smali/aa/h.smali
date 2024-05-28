.class public final enum Laa/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laa/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Laa/h;

.field public static final enum o:Laa/h;

.field public static final enum p:Laa/h;

.field public static final enum q:Laa/h;

.field public static final enum r:Laa/h;

.field public static final enum s:Laa/h;

.field public static final enum t:Laa/h;

.field private static final synthetic u:[Laa/h;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Laa/h;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laa/h;->n:Laa/h;

    .line 2
    new-instance v1, Laa/h;

    const-string v3, "TOKEN_PROVIDER_UNINITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v1, Laa/h;->o:Laa/h;

    .line 3
    new-instance v3, Laa/h;

    const-string v5, "INVALID_NONCE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v3, Laa/h;->p:Laa/h;

    .line 4
    new-instance v5, Laa/h;

    const-string v7, "REQUEST_TIMEOUT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v5, Laa/h;->q:Laa/h;

    .line 5
    new-instance v7, Laa/h;

    const-string v9, "EXCEPTION"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v7, Laa/h;->r:Laa/h;

    .line 6
    new-instance v9, Laa/h;

    const-string v11, "INTERRUPTED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v9, Laa/h;->s:Laa/h;

    .line 7
    new-instance v11, Laa/h;

    const-string v13, "RECEIVED"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Laa/h;-><init>(Ljava/lang/String;I)V

    sput-object v11, Laa/h;->t:Laa/h;

    const/4 v13, 0x7

    new-array v13, v13, [Laa/h;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 8
    sput-object v13, Laa/h;->u:[Laa/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Laa/h;
    .locals 1

    const-class v0, Laa/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laa/h;

    return-object p0
.end method

.method public static values()[Laa/h;
    .locals 1

    sget-object v0, Laa/h;->u:[Laa/h;

    invoke-virtual {v0}, [Laa/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa/h;

    return-object v0
.end method
