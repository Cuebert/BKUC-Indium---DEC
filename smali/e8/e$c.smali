.class public final enum Le8/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le8/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Le8/e$c;

.field public static final enum o:Le8/e$c;

.field public static final enum p:Le8/e$c;

.field public static final enum q:Le8/e$c;

.field public static final enum r:Le8/e$c;

.field public static final enum s:Le8/e$c;

.field public static final enum t:Le8/e$c;

.field private static final synthetic u:[Le8/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Le8/e$c;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le8/e$c;->n:Le8/e$c;

    .line 2
    new-instance v1, Le8/e$c;

    const-string v3, "ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le8/e$c;->o:Le8/e$c;

    .line 3
    new-instance v3, Le8/e$c;

    const-string v5, "RETRY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Le8/e$c;->p:Le8/e$c;

    .line 4
    new-instance v5, Le8/e$c;

    const-string v7, "LIMIT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Le8/e$c;->q:Le8/e$c;

    .line 5
    new-instance v7, Le8/e$c;

    const-string v9, "LIMIT_UNDER_13"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v7, Le8/e$c;->r:Le8/e$c;

    .line 6
    new-instance v9, Le8/e$c;

    const-string v11, "ERROR_CHECKING_BALANCE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v9, Le8/e$c;->s:Le8/e$c;

    .line 7
    new-instance v11, Le8/e$c;

    const-string v13, "UNKNOWN_ERROR"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Le8/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v11, Le8/e$c;->t:Le8/e$c;

    const/4 v13, 0x7

    new-array v13, v13, [Le8/e$c;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 8
    sput-object v13, Le8/e$c;->u:[Le8/e$c;

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

.method public static valueOf(Ljava/lang/String;)Le8/e$c;
    .locals 1

    const-class v0, Le8/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le8/e$c;

    return-object p0
.end method

.method public static values()[Le8/e$c;
    .locals 1

    sget-object v0, Le8/e$c;->u:[Le8/e$c;

    invoke-virtual {v0}, [Le8/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8/e$c;

    return-object v0
.end method
