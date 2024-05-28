.class public final enum Lz7/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz7/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lz7/d;

.field public static final enum o:Lz7/d;

.field public static final enum p:Lz7/d;

.field public static final enum q:Lz7/d;

.field public static final enum r:Lz7/d;

.field public static final enum s:Lz7/d;

.field public static final enum t:Lz7/d;

.field public static final enum u:Lz7/d;

.field public static final enum v:Lz7/d;

.field public static final enum w:Lz7/d;

.field public static final enum x:Lz7/d;

.field private static final synthetic y:[Lz7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lz7/d;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz7/d;->n:Lz7/d;

    .line 2
    new-instance v1, Lz7/d;

    const-string v3, "ON_START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lz7/d;->o:Lz7/d;

    .line 3
    new-instance v3, Lz7/d;

    const-string v5, "ON_RESUME"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lz7/d;->p:Lz7/d;

    .line 4
    new-instance v5, Lz7/d;

    const-string v7, "ON_PAUSE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lz7/d;->q:Lz7/d;

    .line 5
    new-instance v7, Lz7/d;

    const-string v9, "ON_STOP"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lz7/d;->r:Lz7/d;

    .line 6
    new-instance v9, Lz7/d;

    const-string v11, "ON_DESTROY"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lz7/d;->s:Lz7/d;

    .line 7
    new-instance v11, Lz7/d;

    const-string v13, "ON_ATTACH"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lz7/d;->t:Lz7/d;

    .line 8
    new-instance v13, Lz7/d;

    const-string v15, "ON_CREATE_VIEW"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lz7/d;->u:Lz7/d;

    .line 9
    new-instance v15, Lz7/d;

    const-string v14, "ON_ACTIVITY_CREATED"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lz7/d;->v:Lz7/d;

    .line 10
    new-instance v14, Lz7/d;

    const-string v12, "ON_DESTROY_VIEW"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lz7/d;->w:Lz7/d;

    .line 11
    new-instance v12, Lz7/d;

    const-string v10, "ON_DETACH"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Lz7/d;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lz7/d;->x:Lz7/d;

    const/16 v10, 0xb

    new-array v10, v10, [Lz7/d;

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
    sput-object v10, Lz7/d;->y:[Lz7/d;

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

.method public static valueOf(Ljava/lang/String;)Lz7/d;
    .locals 1

    const-class v0, Lz7/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz7/d;

    return-object p0
.end method

.method public static values()[Lz7/d;
    .locals 1

    sget-object v0, Lz7/d;->y:[Lz7/d;

    invoke-virtual {v0}, [Lz7/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz7/d;

    return-object v0
.end method
