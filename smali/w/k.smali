.class public final enum Lw/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/k;

.field public static final enum o:Lw/k;

.field public static final enum p:Lw/k;

.field public static final enum q:Lw/k;

.field public static final enum r:Lw/k;

.field public static final enum s:Lw/k;

.field private static final synthetic t:[Lw/k;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lw/k;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/k;->n:Lw/k;

    .line 2
    new-instance v1, Lw/k;

    const-string v3, "INACTIVE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw/k;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw/k;->o:Lw/k;

    .line 3
    new-instance v3, Lw/k;

    const-string v5, "SEARCHING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw/k;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw/k;->p:Lw/k;

    .line 4
    new-instance v5, Lw/k;

    const-string v7, "FLASH_REQUIRED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw/k;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw/k;->q:Lw/k;

    .line 5
    new-instance v7, Lw/k;

    const-string v9, "CONVERGED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lw/k;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lw/k;->r:Lw/k;

    .line 6
    new-instance v9, Lw/k;

    const-string v11, "LOCKED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lw/k;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lw/k;->s:Lw/k;

    const/4 v11, 0x6

    new-array v11, v11, [Lw/k;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lw/k;->t:[Lw/k;

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

.method public static valueOf(Ljava/lang/String;)Lw/k;
    .locals 1

    const-class v0, Lw/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/k;

    return-object p0
.end method

.method public static values()[Lw/k;
    .locals 1

    sget-object v0, Lw/k;->t:[Lw/k;

    invoke-virtual {v0}, [Lw/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/k;

    return-object v0
.end method
