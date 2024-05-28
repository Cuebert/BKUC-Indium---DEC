.class final enum Lf7/b0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf7/b0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lf7/b0$b;

.field public static final enum o:Lf7/b0$b;

.field public static final enum p:Lf7/b0$b;

.field private static final synthetic q:[Lf7/b0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lf7/b0$b;

    const-string v1, "GAME_STATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf7/b0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/b0$b;->n:Lf7/b0$b;

    .line 2
    new-instance v1, Lf7/b0$b;

    const-string v3, "GAME_STATE_STARTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf7/b0$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf7/b0$b;->o:Lf7/b0$b;

    .line 3
    new-instance v3, Lf7/b0$b;

    const-string v5, "GAME_STATE_ENDED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lf7/b0$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lf7/b0$b;->p:Lf7/b0$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lf7/b0$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lf7/b0$b;->q:[Lf7/b0$b;

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

.method public static valueOf(Ljava/lang/String;)Lf7/b0$b;
    .locals 1

    const-class v0, Lf7/b0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf7/b0$b;

    return-object p0
.end method

.method public static values()[Lf7/b0$b;
    .locals 1

    sget-object v0, Lf7/b0$b;->q:[Lf7/b0$b;

    invoke-virtual {v0}, [Lf7/b0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf7/b0$b;

    return-object v0
.end method
