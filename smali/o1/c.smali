.class public final enum Lo1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo1/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lo1/c;

.field public static final enum o:Lo1/c;

.field public static final enum p:Lo1/c;

.field public static final enum q:Lo1/c;

.field private static final synthetic r:[Lo1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lo1/c;

    const-string v1, "WAITING_NOT_READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo1/c;->n:Lo1/c;

    .line 2
    new-instance v1, Lo1/c;

    const-string v3, "WAITING_READY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo1/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo1/c;->o:Lo1/c;

    .line 3
    new-instance v3, Lo1/c;

    const-string v5, "RUNNING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo1/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo1/c;->p:Lo1/c;

    .line 4
    new-instance v5, Lo1/c;

    const-string v7, "UNKNOWN"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lo1/c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo1/c;->q:Lo1/c;

    const/4 v7, 0x4

    new-array v7, v7, [Lo1/c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lo1/c;->r:[Lo1/c;

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

.method public static valueOf(Ljava/lang/String;)Lo1/c;
    .locals 1

    const-class v0, Lo1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo1/c;

    return-object p0
.end method

.method public static values()[Lo1/c;
    .locals 1

    sget-object v0, Lo1/c;->r:[Lo1/c;

    invoke-virtual {v0}, [Lo1/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo1/c;

    return-object v0
.end method
