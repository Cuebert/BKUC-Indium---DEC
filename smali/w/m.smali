.class public final enum Lw/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/m;

.field public static final enum o:Lw/m;

.field public static final enum p:Lw/m;

.field public static final enum q:Lw/m;

.field public static final enum r:Lw/m;

.field public static final enum s:Lw/m;

.field public static final enum t:Lw/m;

.field private static final synthetic u:[Lw/m;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lw/m;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/m;->n:Lw/m;

    .line 2
    new-instance v1, Lw/m;

    const-string v3, "INACTIVE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw/m;->o:Lw/m;

    .line 3
    new-instance v3, Lw/m;

    const-string v5, "SCANNING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw/m;->p:Lw/m;

    .line 4
    new-instance v5, Lw/m;

    const-string v7, "PASSIVE_FOCUSED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw/m;->q:Lw/m;

    .line 5
    new-instance v7, Lw/m;

    const-string v9, "PASSIVE_NOT_FOCUSED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lw/m;->r:Lw/m;

    .line 6
    new-instance v9, Lw/m;

    const-string v11, "LOCKED_FOCUSED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lw/m;->s:Lw/m;

    .line 7
    new-instance v11, Lw/m;

    const-string v13, "LOCKED_NOT_FOCUSED"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lw/m;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lw/m;->t:Lw/m;

    const/4 v13, 0x7

    new-array v13, v13, [Lw/m;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 8
    sput-object v13, Lw/m;->u:[Lw/m;

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

.method public static valueOf(Ljava/lang/String;)Lw/m;
    .locals 1

    const-class v0, Lw/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/m;

    return-object p0
.end method

.method public static values()[Lw/m;
    .locals 1

    sget-object v0, Lw/m;->u:[Lw/m;

    invoke-virtual {v0}, [Lw/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/m;

    return-object v0
.end method
