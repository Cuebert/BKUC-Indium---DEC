.class final enum Lec/l$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lec/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lec/l$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lec/l$e;

.field public static final enum o:Lec/l$e;

.field public static final enum p:Lec/l$e;

.field public static final enum q:Lec/l$e;

.field public static final enum r:Lec/l$e;

.field public static final enum s:Lec/l$e;

.field private static final synthetic t:[Lec/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lec/l$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lec/l$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lec/l$e;->n:Lec/l$e;

    .line 2
    new-instance v1, Lec/l$e;

    const-string v3, "HEADSET_UNAVAILABLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lec/l$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lec/l$e;->o:Lec/l$e;

    .line 3
    new-instance v3, Lec/l$e;

    const-string v5, "HEADSET_AVAILABLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lec/l$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lec/l$e;->p:Lec/l$e;

    .line 4
    new-instance v5, Lec/l$e;

    const-string v7, "SCO_DISCONNECTING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lec/l$e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lec/l$e;->q:Lec/l$e;

    .line 5
    new-instance v7, Lec/l$e;

    const-string v9, "SCO_CONNECTING"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lec/l$e;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lec/l$e;->r:Lec/l$e;

    .line 6
    new-instance v9, Lec/l$e;

    const-string v11, "SCO_CONNECTED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lec/l$e;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lec/l$e;->s:Lec/l$e;

    const/4 v11, 0x6

    new-array v11, v11, [Lec/l$e;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lec/l$e;->t:[Lec/l$e;

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

.method public static valueOf(Ljava/lang/String;)Lec/l$e;
    .locals 1

    const-class v0, Lec/l$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lec/l$e;

    return-object p0
.end method

.method public static values()[Lec/l$e;
    .locals 1

    sget-object v0, Lec/l$e;->t:[Lec/l$e;

    invoke-virtual {v0}, [Lec/l$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lec/l$e;

    return-object v0
.end method
