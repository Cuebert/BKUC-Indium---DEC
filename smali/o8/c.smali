.class public final enum Lo8/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo8/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lo8/c;

.field public static final enum q:Lo8/c;

.field public static final enum r:Lo8/c;

.field public static final enum s:Lo8/c;

.field public static final enum t:Lo8/c;

.field public static final enum u:Lo8/c;

.field public static final enum v:Lo8/c;

.field public static final enum w:Lo8/c;

.field public static final enum x:Lo8/c;

.field private static final synthetic y:[Lo8/c;


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lo8/c;

    const-string v1, "HOME"

    const/4 v2, 0x0

    const-string v3, "HOME_TAG"

    invoke-direct {v0, v1, v2, v3}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo8/c;->p:Lo8/c;

    .line 2
    new-instance v1, Lo8/c;

    const-string v3, "GAMES"

    const/4 v4, 0x1

    const-string v5, "GAMES_TAG"

    invoke-direct {v1, v3, v4, v5}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lo8/c;->q:Lo8/c;

    .line 3
    new-instance v3, Lo8/c;

    const-string v5, "AVATAR"

    const/4 v6, 0x2

    const-string v7, "AVATAR_EDITOR_TAG"

    invoke-direct {v3, v5, v6, v7}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lo8/c;->r:Lo8/c;

    .line 4
    new-instance v5, Lo8/c;

    const-string v7, "MORE"

    const/4 v8, 0x3

    const-string v9, "MORE_TAG"

    invoke-direct {v5, v7, v8, v9}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lo8/c;->s:Lo8/c;

    .line 5
    new-instance v7, Lo8/c;

    const-string v9, "gameId"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    const-string v10, "GAME_DETAILS"

    const/4 v11, 0x4

    const-string v12, "GAME_DETAILS_TAG"

    invoke-direct {v7, v10, v11, v12, v9}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v7, Lo8/c;->t:Lo8/c;

    .line 6
    new-instance v9, Lo8/c;

    const-string v10, "userId"

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v10

    const-string v12, "PROFILE"

    const/4 v13, 0x5

    const-string v14, "PROFILE_TAG"

    invoke-direct {v9, v12, v13, v14, v10}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v9, Lo8/c;->u:Lo8/c;

    .line 7
    new-instance v10, Lo8/c;

    const-string v12, "CATALOG"

    const/4 v14, 0x6

    const-string v15, "CATALOG_TAG"

    invoke-direct {v10, v12, v14, v15}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lo8/c;->v:Lo8/c;

    .line 8
    new-instance v12, Lo8/c;

    const-string v15, "FRIENDS"

    const/4 v14, 0x7

    const-string v13, "FRIENDS_TAG"

    invoke-direct {v12, v15, v14, v13}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lo8/c;->w:Lo8/c;

    .line 9
    new-instance v13, Lo8/c;

    const-string v15, "UNKNOWN"

    const/16 v14, 0x8

    const-string v11, "unknown"

    invoke-direct {v13, v15, v14, v11}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lo8/c;->x:Lo8/c;

    const/16 v11, 0x9

    new-array v11, v11, [Lo8/c;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    const/4 v0, 0x4

    aput-object v7, v11, v0

    const/4 v0, 0x5

    aput-object v9, v11, v0

    const/4 v0, 0x6

    aput-object v10, v11, v0

    const/4 v0, 0x7

    aput-object v12, v11, v0

    aput-object v13, v11, v14

    .line 10
    sput-object v11, Lo8/c;->y:[Lo8/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Lo8/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lo8/c;->n:Ljava/lang/String;

    .line 3
    iput-object p4, p0, Lo8/c;->o:[Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo8/c;
    .locals 1

    const-class v0, Lo8/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo8/c;

    return-object p0
.end method

.method public static values()[Lo8/c;
    .locals 1

    sget-object v0, Lo8/c;->y:[Lo8/c;

    invoke-virtual {v0}, [Lo8/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo8/c;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo8/c;->n:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lo8/c;->o:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo8/c;->o:[Ljava/lang/String;

    return-object v0
.end method
