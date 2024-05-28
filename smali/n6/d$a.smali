.class final enum Ln6/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln6/d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ln6/d$a;

.field public static final enum o:Ln6/d$a;

.field public static final enum p:Ln6/d$a;

.field public static final enum q:Ln6/d$a;

.field public static final enum r:Ln6/d$a;

.field public static final enum s:Ln6/d$a;

.field public static final enum t:Ln6/d$a;

.field public static final enum u:Ln6/d$a;

.field public static final enum v:Ln6/d$a;

.field public static final enum w:Ln6/d$a;

.field private static final synthetic x:[Ln6/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Ln6/d$a;

    const-string v1, "LAUNCH_STATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln6/d$a;->n:Ln6/d$a;

    .line 2
    new-instance v1, Ln6/d$a;

    const-string v3, "LAUNCH_STATE_UI_PAUSED_BY_USER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ln6/d$a;->o:Ln6/d$a;

    .line 3
    new-instance v3, Ln6/d$a;

    const-string v5, "LAUNCH_STATE_INIT_STARTING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ln6/d$a;->p:Ln6/d$a;

    .line 4
    new-instance v5, Ln6/d$a;

    const-string v7, "LAUNCH_STATE_INIT_DONE_OK"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ln6/d$a;->q:Ln6/d$a;

    .line 5
    new-instance v7, Ln6/d$a;

    const-string v9, "LAUNCH_STATE_INIT_STOPPED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ln6/d$a;->r:Ln6/d$a;

    .line 6
    new-instance v9, Ln6/d$a;

    const-string v11, "LAUNCH_STATE_SESSION_CHECK_DONE_OK"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ln6/d$a;->s:Ln6/d$a;

    .line 7
    new-instance v11, Ln6/d$a;

    const-string v13, "LAUNCH_STATE_SESSION_CHECK_STOPPED"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ln6/d$a;->t:Ln6/d$a;

    .line 8
    new-instance v13, Ln6/d$a;

    const-string v15, "LAUNCH_STATE_POST_LOGIN_DONE_OK"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ln6/d$a;->u:Ln6/d$a;

    .line 9
    new-instance v15, Ln6/d$a;

    const-string v14, "LAUNCH_STATE_UI_HOME_STARTING"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v15, Ln6/d$a;->v:Ln6/d$a;

    .line 10
    new-instance v14, Ln6/d$a;

    const-string v12, "LAUNCH_STATE_UI_HOME_LOADED_OK"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Ln6/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ln6/d$a;->w:Ln6/d$a;

    const/16 v12, 0xa

    new-array v12, v12, [Ln6/d$a;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v13, v12, v0

    const/16 v0, 0x8

    aput-object v15, v12, v0

    aput-object v14, v12, v10

    .line 11
    sput-object v12, Ln6/d$a;->x:[Ln6/d$a;

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

.method public static valueOf(Ljava/lang/String;)Ln6/d$a;
    .locals 1

    const-class v0, Ln6/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln6/d$a;

    return-object p0
.end method

.method public static values()[Ln6/d$a;
    .locals 1

    sget-object v0, Ln6/d$a;->x:[Ln6/d$a;

    invoke-virtual {v0}, [Ln6/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln6/d$a;

    return-object v0
.end method
