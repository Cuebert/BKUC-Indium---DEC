.class public final enum Lw8/k$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw8/k$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw8/k$f;

.field public static final enum o:Lw8/k$f;

.field public static final enum p:Lw8/k$f;

.field public static final enum q:Lw8/k$f;

.field public static final enum r:Lw8/k$f;

.field public static final enum s:Lw8/k$f;

.field public static final enum t:Lw8/k$f;

.field private static final synthetic u:[Lw8/k$f;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lw8/k$f;

    const-string v1, "INIT_STATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw8/k$f;->n:Lw8/k$f;

    .line 2
    new-instance v1, Lw8/k$f;

    const-string v3, "INIT_STATE_IN_PROGRESS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw8/k$f;->o:Lw8/k$f;

    .line 3
    new-instance v3, Lw8/k$f;

    const-string v5, "INIT_STATE_SETTINGS_LOADED_OK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw8/k$f;->p:Lw8/k$f;

    .line 4
    new-instance v5, Lw8/k$f;

    const-string v7, "INIT_STATE_DONE_OK"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw8/k$f;->q:Lw8/k$f;

    .line 5
    new-instance v7, Lw8/k$f;

    const-string v9, "INIT_STATE_NO_USER_ID"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lw8/k$f;->r:Lw8/k$f;

    .line 6
    new-instance v9, Lw8/k$f;

    const-string v11, "INIT_STATE_UNAUTHORIZED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lw8/k$f;->s:Lw8/k$f;

    .line 7
    new-instance v11, Lw8/k$f;

    const-string v13, "INIT_STATE_FAILED_APP_SETTINGS"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lw8/k$f;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lw8/k$f;->t:Lw8/k$f;

    const/4 v13, 0x7

    new-array v13, v13, [Lw8/k$f;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 8
    sput-object v13, Lw8/k$f;->u:[Lw8/k$f;

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

.method public static valueOf(Ljava/lang/String;)Lw8/k$f;
    .locals 1

    const-class v0, Lw8/k$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw8/k$f;

    return-object p0
.end method

.method public static values()[Lw8/k$f;
    .locals 1

    sget-object v0, Lw8/k$f;->u:[Lw8/k$f;

    invoke-virtual {v0}, [Lw8/k$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw8/k$f;

    return-object v0
.end method
