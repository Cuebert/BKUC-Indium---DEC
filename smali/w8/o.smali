.class public final enum Lw8/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw8/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lw8/o;

.field public static final enum p:Lw8/o;

.field public static final enum q:Lw8/o;

.field public static final enum r:Lw8/o;

.field public static final enum s:Lw8/o;

.field public static final enum t:Lw8/o;

.field public static final enum u:Lw8/o;

.field public static final enum v:Lw8/o;

.field public static final enum w:Lw8/o;

.field public static final enum x:Lw8/o;

.field public static final enum y:Lw8/o;

.field private static final synthetic z:[Lw8/o;


# instance fields
.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lw8/o;

    const-string v1, "SYSTEM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw8/o;->o:Lw8/o;

    .line 2
    new-instance v1, Lw8/o;

    const-string v3, "SHELL_PROCESS_RESTART"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lw8/o;->p:Lw8/o;

    .line 3
    new-instance v3, Lw8/o;

    const-string v5, "SHELL_PROCESS_RESTART_FOR_RESULT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lw8/o;->q:Lw8/o;

    .line 4
    new-instance v5, Lw8/o;

    const-string v7, "APP_RESTART"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lw8/o;->r:Lw8/o;

    .line 5
    new-instance v7, Lw8/o;

    const-string v9, "AFTER_SIGN_UP"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lw8/o;->s:Lw8/o;

    .line 6
    new-instance v9, Lw8/o;

    const-string v11, "AFTER_LOGIN"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lw8/o;->t:Lw8/o;

    .line 7
    new-instance v11, Lw8/o;

    const-string v13, "PROTOCOL_LAUNCH"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lw8/o;->u:Lw8/o;

    .line 8
    new-instance v13, Lw8/o;

    const-string v15, "LOG_OUT"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lw8/o;->v:Lw8/o;

    .line 9
    new-instance v15, Lw8/o;

    const-string v14, "REMINDER_NOTIFICATION"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lw8/o;->w:Lw8/o;

    .line 10
    new-instance v14, Lw8/o;

    const-string v12, "LOADED_FROM_PUSH_NOTIFICATION"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lw8/o;->x:Lw8/o;

    .line 11
    new-instance v12, Lw8/o;

    const-string v10, "AFTER_LOGIN_FOR_RESULT"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8, v8}, Lw8/o;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lw8/o;->y:Lw8/o;

    const/16 v10, 0xb

    new-array v10, v10, [Lw8/o;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    const/16 v0, 0x8

    aput-object v15, v10, v0

    const/16 v0, 0x9

    aput-object v14, v10, v0

    aput-object v12, v10, v8

    .line 12
    sput-object v10, Lw8/o;->z:[Lw8/o;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lw8/o;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lw8/o;
    .locals 1

    const-class v0, Lw8/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw8/o;

    return-object p0
.end method

.method public static values()[Lw8/o;
    .locals 1

    sget-object v0, Lw8/o;->z:[Lw8/o;

    invoke-virtual {v0}, [Lw8/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw8/o;

    return-object v0
.end method
